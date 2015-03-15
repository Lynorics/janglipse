/*
 * Copyright 2015
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.ui.highlighting;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class AS3TokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
//		if("RULE_NUMBER".equals(tokenName)) {
//			return AS3HighlightingConfiguration.NUMBER_ID;
//		}
		if("RULE_ASDOC".equals(tokenName)) {
			return AS3HighlightingConfiguration.ASDOC_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}