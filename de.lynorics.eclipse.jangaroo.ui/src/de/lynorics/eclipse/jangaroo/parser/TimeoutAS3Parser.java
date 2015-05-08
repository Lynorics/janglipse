/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;

import de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.AS3Parser;

/**
 * A parser in order to guarantee a responsive gui for code completion. The completion may contain not all possible
 * proposals, but this means the user has given too few characters to narrow the scope---or the parser hit an
 * infinite loop.
 *
 * @author Lynorics
 */
public class TimeoutAS3Parser extends AS3Parser {

	private static final int TIMEOUT = 50;

	public Collection<FollowElement> getSuperFollowElements(FollowElement element) {
		return super.getFollowElements(element);
	}

	public Collection<FollowElement> getFollowElements(FollowElement element) {
		Collection<FollowElement> result = null;
		ExecutorService executor = Executors.newSingleThreadExecutor();
		TaskFollowElements task = new TaskFollowElements(this, element);
		return executeTask(result, executor, task);
	}

	public Collection<FollowElement> getSuperFollowElements(String input, boolean strict) {
		return super.getFollowElements(input, strict);
	}

	public Collection<FollowElement> getFollowElements(String input, boolean strict) {
		Collection<FollowElement> result = null;
		ExecutorService executor = Executors.newSingleThreadExecutor();
		TaskFollowElements task = new TaskFollowElements(this, input, strict);
		return executeTask(result, executor, task);
	}

	private Collection<FollowElement> executeTask(
			Collection<FollowElement> result, ExecutorService executor,
			TaskFollowElements task) {
		Future<Collection<FollowElement>> future = executor.submit(task);
		try {
			result = future.get(TIMEOUT, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			System.out.println("Terminated because of " + e.getMessage());
		}
		executor.shutdownNow();
		if (result == null) {
			result = new ArrayList<FollowElement>();
		}
		return result;
	}

	private static class TaskFollowElements implements
			Callable<Collection<FollowElement>> {
		private TimeoutAS3Parser p;
		private FollowElement fe;
		private String input;
		private boolean strict;

		private TaskFollowElements(TimeoutAS3Parser p, FollowElement fe) {
			this.p = p;
			this.fe = fe;
		}

		public TaskFollowElements(TimeoutAS3Parser p, String input, boolean strict) {
			this.p = p;
			this.input = input;
			this.strict = strict;
		}

		@Override
		public Collection<FollowElement> call() throws Exception {
			if (fe != null) {
				return p.getSuperFollowElements(fe);
			} else {
				return p.getSuperFollowElements(input, strict);
			}
		}
	}
}
