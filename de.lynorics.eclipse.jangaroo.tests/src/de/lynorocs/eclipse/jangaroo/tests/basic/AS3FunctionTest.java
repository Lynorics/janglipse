/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorocs.eclipse.jangaroo.tests.basic;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.lynorics.eclipse.jangaroo.AS3InjectorProvider;

/**
 * 
 * @author Marc Pompl
 * @created 25.03.2014
 */
@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class AS3FunctionTest  extends XtextTest {

	    public AS3FunctionTest() {
	        super("AS3FunctionTest");
	    }

	    /**
	     * Checks for optional semicolons
	     * 
	     * See: Issue #28
	     */
	    @Test
	    public void optionalSemicolon() {
	    	testParserRule(
	    			"function(type:String):String {"
	    			+"return MyUtil.getName(type)"
	    			+"}",
	    			"functionExpression");
	    	testParserRule(
	    			"function two(type:String):String"
	    			+"{ if(!may) {"
	    			+"onclick = '';"
	    			+"style = \"cursor:default;\""
	    			+"} }",
	    			"Method");
	    	testParserRule(
	    			"function three(type:String):String"
	    			+"{ if (node&& node.getName()) {"
	    			+"if (!node.getName()[id]) {"
	    			+"valid = false;"
            		+"} else {"
            		+"node = node.getName()[id]"
            		+"}"
          			+"} else {"
          			+"node = undefined;"
          			+"} }",
	    			"Method");
	    }

}
