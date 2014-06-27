/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.formatting;

import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

public class GenericFormatter {

	/**
	 * In your implementation of
	 * {@link org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter#configureFormatting(org.eclipse.xtext.formatting.impl.FormattingConfig)}
	 * you may call this generic formatting method first. It indents blocks
	 * between curly braces and sets a linewrap before each keyword. Add your
	 * own behavior afterwards, e.g.
	 * 
	 * keywords = grammar.findKeywords(...); for (final Keyword keyword :
	 * keywords) { config.setNoLinewrap().before(keyword); }
	 * 
	 */
	public static void genericFormatting(final FormattingConfig config,
			final IGrammarAccess grammar) {
		for (final Pair<Keyword, Keyword> pair : grammar.findKeywordPairs(
				"{", "}")) { //$NON-NLS-1$ //$NON-NLS-2$
		    // a space before '{'
			config.setSpace(" ").before(pair.getFirst()); //$NON-NLS-1$
			// indentation between { }
			config.setIndentation(pair.getFirst(), pair.getSecond());
		    // newline after {
		    config.setLinewrap().after(pair.getFirst());
		    // newline before }
		    config.setLinewrap().before(pair.getSecond());
		    // newline after }
		    config.setLinewrap().after(pair.getSecond());
		}

		// linewrap before all keywords
//		final Set<String> allKeywords = GrammarUtil.getAllKeywords(grammar
//				.getGrammar());
//		final List<Keyword> keywords = grammar.findKeywords(allKeywords
//				.toArray(new String[allKeywords.size()]));
//		for (final Keyword keyword : keywords) {
//			config.setLinewrap().before(keyword);
//		}

	}
}