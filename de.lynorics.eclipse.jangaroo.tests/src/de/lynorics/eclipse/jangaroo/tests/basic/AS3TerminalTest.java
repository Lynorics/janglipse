/*
 * Copyright 2014
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

@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class AS3TerminalTest extends XtextTest
{

    public AS3TerminalTest()
    {
        super("AS3TerminalTest");
    }

    /**
     * Check for valid qualified names
     */
    @Test
    public void qualifiedName()
    {
    	testParserRule("a", "QualifiedName");
    	testParserRule("a.b.C", "QualifiedName");
    }

    /**
     * Check for valid qualified names
     */
    @Test
    public void qualifiedNameWildcard()
    {
    	testParserRule("a", "QualifiedNameWithWildcard");
    	testParserRule("a.b.C", "QualifiedNameWithWildcard");
    	testParserRule("a.*", "QualifiedNameWithWildcard");
    	testParserRule("a.b.C.*", "QualifiedNameWithWildcard");
    }

    /**
     * Check for non-valid qualified names
     */
    @Test
    public void qualifiedNameErrors()
    {
    	testParserRuleErrors("a.2.b", "QualifiedName");
    	testParserRuleErrors("2b", "QualifiedName");
    	testParserRuleErrors("2", "QualifiedName");
    }

}