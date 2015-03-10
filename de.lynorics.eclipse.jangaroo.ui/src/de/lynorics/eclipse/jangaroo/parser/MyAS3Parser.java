package de.lynorics.eclipse.jangaroo.parser;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;

import de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.AS3Parser;

public class MyAS3Parser extends AS3Parser {

	private static final int TIMEOUT = 1000;

	public Collection<FollowElement> getSuperFollowElements(FollowElement element) {
		return super.getFollowElements(element);
	}
	
	public Collection<FollowElement> getFollowElements(FollowElement element) {
//		if (true) {
//			return super.getFollowElements(element);
//		}
		Collection<FollowElement> result = null;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Collection<FollowElement>> future = executor.submit(new TaskFE(this, element));
        try {
            result = future.get(TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            System.out.println("Terminated because of "+e.getMessage());
        }
        executor.shutdownNow();
		return result;
	}

	public Collection<FollowElement> getSuperFollowElements(String input,
			boolean strict) {
		return super.getFollowElements(input, strict);
	}

	public Collection<FollowElement> getFollowElements(String input,
			boolean strict) {
//		if (true) {
//			return super.getFollowElements(input, strict);
//		}
		Collection<FollowElement> result = null;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Collection<FollowElement>> future = executor.submit(new TaskFE(this, input, strict));
        try {
            result = future.get(TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            System.out.println("Terminated because of "+e.getMessage());
        }
        executor.shutdownNow();
		return result;
	}

	private static class TaskFE implements Callable<Collection<FollowElement>> {
		private MyAS3Parser p;
		private FollowElement fe;
		private String input;
		private boolean strict;
		private TaskFE(MyAS3Parser p, FollowElement fe) {
			this.p = p;
			this.fe = fe;
		}
		public TaskFE(MyAS3Parser p, String input, boolean strict) {
			this.p = p;
			this.input = input;
			this.strict = strict;
		}
		@Override
	    public Collection<FollowElement> call() throws Exception {
			if (fe != null) {
				return p.getSuperFollowElements(fe);
			}
			else {
				return p.getSuperFollowElements(input, false);
			}
	    }
	}
}
