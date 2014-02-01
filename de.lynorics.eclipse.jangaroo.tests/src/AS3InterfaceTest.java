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
 * 
 * @author Marc Pompl
 * @created 03.01.2014
 */
@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class AS3InterfaceTest extends XtextTest
{

    public AS3InterfaceTest()
    {
        super("AS3InterfaceTest");
    }

    /**
     * Checks a very simple interface definitions
     */
    @Test
    public void simpleInterface()
    {
    	testParserRule(
    			"public interface ITest {"
    			+ "}",
    			"Interface");
    	testParserRule(
    			"public interface ITest {"
    			+ "}",
    			"Model");
    	testParserRule(
    			"package {"
    			+ "public interface ITest {"
    			+ "}}",
    			"Model");
    	testParserRule(
    			"package mypackage {"
    			+ "public interface ITest {"
    			+ "}}",
    			"Model");
    }
    
    /**
     * Checks a very simple interface method declaration
     */
    @Test
    public void methodInterface()
    {
    	testParserRule(
    			"function links():void;",
    			"InterfaceMethod");
    	testParserRule(
    			"function tutorials(gen:String, nota:int):String",
    			"InterfaceMethod");
    }
    
    /**
     * Checks some interface declarations
     */
    @Test
    public void checkInterface()
    {
    	testParserRule(
    			"package mypackage {"
    			+ "public interface ITest {"
    			+ "function links():void;"
    			+ "function tutorials(gen:String, nota:int):String"
    			+ "}}",
    			"Model");
    	testParserRule(
    			"package mypackage {"
    			+ "interface IBasic {}"
    			+ "public interface ITest extends IBasic{"
    			+ "}}",
    			"Model");
    }
    
    /**
     * Checks some interface declarations
     */
    @Test
    public void checkValidations()
    {
    	testParserRule(
    			"public interface iTest {"
    			+ "}",
    			"Interface");
    }
    
}