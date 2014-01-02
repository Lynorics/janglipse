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

@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class AS3BasicTest extends XtextTest
{

    public AS3BasicTest()
    {
        super("AS3BasicTest");
    }

    @Test
    public void simpleClass()
    {
    	// TODO
    }

}