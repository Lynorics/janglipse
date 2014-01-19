/*
 * Copyright 2013
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://opensource.org/licenses/eclipse-1.0.txt
 */
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.lynorics.eclipse.jangaroo.AS3InjectorProvider;

/**
 * Checks the examples given on https://github.com/CoreMedia/jangaroo-ext-as-examples
 * 
 * @author Marc Pompl
 * @created 02.01.2014
 */
@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class ExtASExampleTest extends XtextTest
{

    public ExtASExampleTest()
    {
        super("ExtASExampleTest");
    }

    @Test
    public void example1()
    {
    	this.testFile("HelloWorld1.as");
    }

}