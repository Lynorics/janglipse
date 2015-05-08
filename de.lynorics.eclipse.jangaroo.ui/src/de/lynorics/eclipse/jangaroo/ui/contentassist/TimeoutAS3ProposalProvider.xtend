/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.contentassist

import java.util.Collection
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import org.eclipse.jface.text.ITextViewer
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.jface.text.templates.TemplateProposal
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.contentassist.CompletionProposalComputer
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * A proposal provider in order to guarantee a response time of one second for code completion. The completion may contain
 * not all possible proposals, but this means the user has given too few characters to narrow the scope---or the parser hit
 * an infinite loop.
 * 
 * @author Lynorics
 */
class TimeoutAS3ProposalProvider extends AS3ProposalProvider {

	private static final int TIMEOUT_FOR_COLLECTING = 800;
	private static final int TIMEOUT_AFTER_COLLECTING = 100;

	/**
	 * Konstruktor.
	 */
	new() {
		super();
	}

	def superCreateProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.createProposals(context, acceptor);
	}

	override createProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var ExecutorService executor = Executors.newSingleThreadExecutor();
		var AS3CompletionProposalComputer myAcceptor = new AS3CompletionProposalComputer(
			acceptor as CompletionProposalComputer, null, null, 0)
		var TaskCreateProposal task = new TaskCreateProposal(this, context, myAcceptor);
		var Future<Collection<Object>> future = executor.submit(task);
		try {
			future.get(TIMEOUT_FOR_COLLECTING, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			System.out.println("Completion proposal terminated because of " + e.getMessage() + " ("+e.class.simpleName+")");
			myAcceptor.acceptMoreProposals = false;
		}
		try {
			executor.awaitTermination(TIMEOUT_AFTER_COLLECTING, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			System.out.println("Completion proposal terminated abnormally after additional waiting because of " + e.getMessage() + " ("+e.class.simpleName+")");
		}
	}
	
	private static class TaskCreateProposal implements Callable<Collection<Object>> {
		private TimeoutAS3ProposalProvider provider;
		private ContentAssistContext context;
		private ICompletionProposalAcceptor acceptor;
	
		new(TimeoutAS3ProposalProvider provider, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			this.provider = provider;
			this.context = context;
			this.acceptor = acceptor;
		}

		override def call() throws Exception {
			provider.superCreateProposals(context, acceptor);
			return null;
		}
	}
	
	private static class AS3CompletionProposalComputer extends CompletionProposalComputer {
	
		var boolean acceptMoreProposals = true;
		var CompletionProposalComputer computer
		
		new(CompletionProposalComputer computer, State state, ITextViewer viewer, int offset) {
			super(state, viewer, offset)
			this.computer = computer;
		}
		
		override canAcceptMoreProposals() {
			return acceptMoreProposals && computer.canAcceptMoreProposals();
		}
		
		override accept(ICompletionProposal proposal) {
			computer.accept(proposal)
		}
		
		override accept(TemplateProposal template) {
			computer.accept(template)
		}
		
		override canAcceptMoreTemplates() {
			computer.canAcceptMoreTemplates()
		}
		
		override exec(XtextResource resource) throws Exception {
			computer.exec(resource)
		}
		
	}
}
