/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
package de.lynorics.eclipse.jangaroo.tests.basic;

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
public class AS3LiteralTest  extends XtextTest {

	    public AS3LiteralTest() {
	        super("AS3LiteralTest");
	    }

	    @Test
	    public void objectLiteral() {
	    	testParserRule(
	    			"{APPROVE_PERFORMER_: UserUtil.getCapId()}",
	    			"objectLiteral");
	    	testParserRule(
	    			"{'APPROVE_PERFORMER_': UserUtil.getCapId()}",
	    			"objectLiteral");
	    	testParserRule(
	    			"{\"APPROVE_PERFORMER_\": UserUtil.getCapId()}",
	    			"objectLiteral");
	    }

}
