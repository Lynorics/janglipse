/*
* generated by Xtext
*/
package de.lynorics.eclipse.jangaroo.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AS3AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/lynorics/eclipse/jangaroo/parser/antlr/internal/InternalAS3.tokens");
	}
}
