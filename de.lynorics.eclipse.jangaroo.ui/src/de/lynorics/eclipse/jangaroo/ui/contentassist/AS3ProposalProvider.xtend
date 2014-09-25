/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
/*
 * generated by Xtext
 */
package de.lynorics.eclipse.jangaroo.ui.contentassist

import com.google.inject.Inject
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel
import de.lynorics.eclipse.jangaroo.aS3.Class
import de.lynorics.eclipse.jangaroo.aS3.Interface
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration
import de.lynorics.eclipse.jangaroo.aS3.Method
import de.lynorics.eclipse.jangaroo.aS3.Parameter
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
import de.lynorics.eclipse.jangaroo.ui.labeling.AS3LabelProvider
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.label.ILabelProviderImageDescriptorExtension

import static extension de.lynorics.eclipse.jangaroo.AS3ModelUtil.*

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class AS3ProposalProvider extends AbstractAS3ProposalProvider {

    String PARAMETER_SEPARATOR = ",";
    
	Pattern alphanumerPattern = Pattern.compile("[^a-zA-Z0-9]");

	@Inject
 	private ILabelProvider labelProvider;

	private final List<String> FILTERED_KEYWORDS = new ArrayList();

	/**
	 * Konstruktor.
	 */
	new() {
		super();
		FILTERED_KEYWORDS.addAll("get", "null", "set", "void");
	}

	/**
	 * Code completion for a SymbolRef.
	 */
	override completeTerminalExpression_Symbol(EObject elem, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		elem.variablesDefinedBefore.forEach[
			variable |
			if (variable instanceof VariableDeclaration) {
				acceptor.accept(createCompletionProposal(variable.name, variable.name + ": " + AS3LabelProvider.getNameOfType(variable.getType()), getImageTag(variable), context));
			}
			else if (variable instanceof MemberVariableDeclaration) {
				acceptor.accept(createCompletionProposal(variable.name, variable.name + ": " + AS3LabelProvider.getNameOfType(variable.getType()), getImageTag(variable), context));
			}
			else if (variable instanceof Parameter) {
				acceptor.accept(createCompletionProposal(variable.name, variable.name + ": " + AS3LabelProvider.getNameOfType(variable.getType()), getImageTag(variable), context));
			}
			else if (variable instanceof Interface) {
				acceptor.accept(createCompletionProposal(variable.name, variable.name, getImageTag(variable), context));
			}
			else if (variable instanceof Class) {
				acceptor.accept(createCompletionProposal(variable.name, variable.name, getImageTag(variable), context));
			}
		]
		var myclass = elem.containingClass;
		var collectPrivate = true;
		while (myclass != null) {
			collectVariablesOfClass(myclass, context, acceptor, collectPrivate);
			// collect even functions of super types
			myclass = myclass.superclass
			// non-public just for containing class, not super types
			collectPrivate = false;
		}
		
	}

	private def collectVariablesOfClass(Class clazz, ContentAssistContext context, ICompletionProposalAcceptor acceptor, boolean collectPrivate) {
		clazz.attributes.forEach[
			variable |
				if (variable instanceof VariableDeclaration) {
					acceptor.accept(createCompletionProposal(variable.name, variable.name + ": " + AS3LabelProvider.getNameOfType(variable.getType()), getImageTag(variable), context));
				}
				else if (variable instanceof MemberVariableDeclaration) {
					acceptor.accept(createCompletionProposal(variable.name, variable.name + ": " + AS3LabelProvider.getNameOfType(variable.getType()), getImageTag(variable), context));
				}
		]
	}
	
	private def getImageTag(EObject object) {
		if (labelProvider instanceof ILabelProviderImageDescriptorExtension) {
			var ext = (labelProvider as ILabelProviderImageDescriptorExtension);
			var descriptor = ext.getImageDescriptor(object);
			if (descriptor != null) {
				return descriptor.createImage();
			}
		}
		return null;
	}

	/**
	 * Code completion for keywords.
	 */
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		if (isFiltered(keyword)) {
			return
		}
		super.completeKeyword(keyword, contentAssistContext, acceptor)
	}

	private def isFiltered(Keyword keyword) {
		return alphanumerPattern.matcher(keyword.value).find() ||
			FILTERED_KEYWORDS.contains(keyword.getValue());
	}

	/**
	 * Code completion for primaryExpressions (beginning of expressions).
	 */
	override complete_primaryExpression(EObject elem, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// collect methods of class
		var myclass = elem.containingClass;
		var collectPrivate = true;
		while (myclass != null) {
			collectMethodsOfClass(myclass, context, acceptor, collectPrivate);
			// collect even functions of super types
			myclass = myclass.superclass
			// non-public just for containing class, not super types
			collectPrivate = false;
		}
		// collect imported classes
		if (elem.containingModel.package != null &&
			elem.containingModel.package.imp != null)
		{
			elem.containingModel.package.imp.imports.forEach[
				variable|
				var name = variable.importedNamespace.substring(variable.importedNamespace.lastIndexOf(".")+1);
				var path = variable.importedNamespace.substring(0, variable.importedNamespace.lastIndexOf("."));
				acceptor.accept(createCompletionProposal(name, name + " (" + path + ")", getImageTag(variable), context));
			]
		}
	}

	private def collectMethodsOfClass(Class clazz, ContentAssistContext context, ICompletionProposalAcceptor acceptor, boolean collectPrivate) {
		clazz.accessibleFunctions.forEach[
			variable |
				if (variable instanceof Method) {
					if (collectPrivate ||
						!"private".equalsIgnoreCase((variable.modifier.access as AccessLevel).getName())) {
							val StringBuilder parameters = new StringBuilder();
							variable.params.forEach[
								param |
									parameters.append(param.typeName);
									parameters.append(PARAMETER_SEPARATOR);
							]
							if (parameters.length > 0 && PARAMETER_SEPARATOR.equals(""+parameters.charAt(parameters.length-1))) {
								parameters.deleteCharAt(parameters.length-1);
							}
						acceptor.accept(createCompletionProposal(variable.name, variable.name + "("+parameters.toString()+"): " + AS3LabelProvider.getNameOfType(variable.type), getImageTag(variable), context));
					}
				}
		]
	}
	
}
