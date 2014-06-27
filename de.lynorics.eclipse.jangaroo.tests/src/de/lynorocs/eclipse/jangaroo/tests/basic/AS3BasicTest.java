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
 * @created 03.01.2014
 */
@RunWith(XtextRunner.class)
@InjectWith(AS3InjectorProvider.class)
public class AS3BasicTest extends XtextTest
{

    public AS3BasicTest()
    {
        super("AS3BasicTest");
    }

    /**
     * Checks some simple class definitions
     */
    @Test
    public void simpleBlock()
    {
    	testParserRule(
    			"{}",
    			"Statement");
    }
    
    /**
     * Checks some simple class definitions
     */
    @Test
    public void simpleClass()
    {
    	testParserRule(
    			"class Dummy {"
    			+ "}",
    			"Class");
    	testParserRule(
    			"package a { class Dummy {"
    			+ "}}",
    			"Package");
    	testParserRule(
    			"package a { class B extends C {"
    			+ "}}",
    			"Model");
    	testParserRule(
    			"package a.b.C {"
    			+ "  class Dummy {"
    			+ "  }"
    			+ "}",
    			"Model");
    	testParserRule(
    			"  class Dummy implements I {"
    			+ "  }",
    			"Class");
    }

    /**
     * Checks some simple interface definitions
     */
    @Test
    public void simpleInterface()
    {
    	testParserRule(
    			"interface Dummy {"
    			+ "}",
    			"Interface");
    	testParserRule(
    			"package a { interface Dummy {"
    			+ "}}",
    			"Package");
    	testParserRule(
    			"package a { interface B extends C {"
    			+ "}}",
    			"Model");
    	testParserRule(
    			"package a.b.C {"
    			+ "  interface Dummy {"
    			+ "  }"
    			+ "}",
    			"Model");
    }

    /**
     * Checks some simple method definitions
     */
    @Test
    public void simpleMethod()
    {
    	testParserRule(
    			"function A() {"
    			+ "}",
    			"Method");
    	testParserRule(
    			"public function A(): void {"
    			+ "}",
    			"Method");
    	testParserRule(
    			"private static function b(): * {"
    			+ "}",
    			"Method");
    	testParserRule(
    			"function get A() {"
    			+ "}",
    			"Method");
    	testParserRule(
    			"function set A() {"
    			+ "}",
    			"Method");
    }

    /**
     * Checks some simple while loop definitions
     */
    @Test
    public void simpleWhile()
    {
    	testParserRule(
    			"while(x) {"
    			+ "}",
    			"WhileStatement");
    	testParserRule(
    			"do {"
    			+ "} while(x);",
    			"DoWhileStatement");
    }

    /**
     * Checks some simple for-in loop definitions
     */
    @Test
    public void simpleFor()
    {
    	testParserRule(
    			"for(var x:int = 0; x<10; x++) {"
    			+ "}",
    			"ForStatement");
    }

    /**
     * Checks some simple expression definitions
     */
    @Test
    public void simpleExpression()
    {
    	testParserRule(
    			"x",
    			"Expression");
    	testParserRule(
    			"1",
    			"Expression");
    	testParserRule(
    			"x()",
    			"Expression");
    }

    /**
     * Checks some simple assignment definitions
     */
    @Test
    public void simpleAssignment()
    {
    	testParserRule(
    			"x=1",
    			"assignmentExpression");
    	testParserRule(
    			"x+=1",
    			"assignmentExpression");
    	testParserRule(
    			"++y",
    			"assignmentExpression");
    	testParserRule(
    			"x++",
    			"assignmentExpression");
    }

    /**
     * Checks some simple for-in loop definitions
     */
    @Test
    public void simpleForIn()
    {
    	testParserRule(
    			"for(x in list) {"
    			+ "}",
    			"ForStatement");
    	testParserRule(
    			"for each (x in list) {"
    			+ "}",
    			"ForEachStatement");
    }

    /**
     * Checks some simple if definitions
     */
    @Test
    public void simpleIf()
    {
    	testParserRule(
    			"if(x) {"
    			+ "}",
    			"IfStatement");
    	testParserRule(
    			"if(x) {"
    			+ "} else {"
    			+ "}",
    			"IfStatement");
    }

    /**
     * Checks some simple switch definitions
     */
    @Test
    public void simpleSwitch()
    {
    	testParserRule(
    			"switch (a) {"
    			+ "}",
    			"SwitchStatement");
    	testParserRule(
    			"switch (a) {"
    			+ "case 1:"
    			+ "}",
    			"SwitchStatement");
    	testParserRule(
    			"switch (a) {"
    			+ "default:"
    			+ "}",
    			"SwitchStatement");
    }

    /**
     * Checks some simple try definitions
     */
    @Test
    public void simpleTry()
    {
    	testParserRule(
    			"try { b; }"
    			+ "catch (exception) {}",
    			"TryStatement");
    	testParserRule(
    			"try { c; }"
    			+ "finally { }",
    			"TryStatement");
    	testParserRule(
    			"try { d; }"
    			+ "catch (exception) {}"
    			+ "finally { }",
    			"TryStatement");
    }

    /**
     * Checks some simple new definitions
     */
    @Test
    public void simpleNew()
    {
    	testParserRule(
    			"new a",
    			"newExpression");
    	testParserRule(
    			"new a()",
    			"newExpression");
    	testParserRule(
    			"new a(b)",
    			"newExpression");
    	testParserRule(
    			"new a(c,d)",
    			"newExpression");
    }

    @Test
    public void imports()
    {
        testParserRule("import a;","Import");	
        testParserRule("import a.B;","Import");	
    }
    
    @Test
    public void varDeclarations()
    {
        testParserRule("var i: int;","VariableDeclaration");	
        testParserRule("public var i: int;","VariableDeclaration");	
        testParserRule("private static var i: int;","VariableDeclaration");	
        testParserRule("const i: int;","VariableDeclaration");	
        testParserRule("private const i: int;","VariableDeclaration");	
        testParserRule("public static const i: int;","VariableDeclaration");	
        testParserRule("var i: int = 0;","VariableDeclaration");	
        testParserRule("var n: number;","VariableDeclaration");	
        testParserRule("var n: number = 0;","VariableDeclaration");	
        testParserRule("var a: String;","VariableDeclaration");	
        testParserRule("var a: String = '';","VariableDeclaration");	
        testParserRule("var a: String = a;","VariableDeclaration");	
        testParserRule("var a: D = a();","VariableDeclaration");	
    }
    
    @Test
    public void varDeclarationsModifiers()
    {
        testParserRule("public var i: int;","VariableDeclaration");	
        testParserRule("private var i: int;","VariableDeclaration");	
        testParserRule("public static var i: int;","VariableDeclaration");	

    }
    
    @Test
    public void simpleCondition()
    {
        testParserRule("(scheme !== undefined)","Condition");	
    }

    @Test
    public void simpleAnnotation()
    {
        testParserRule("[Annon1(a='b')]","Annotation");	
        testParserRule("[Annon2(value=true)]","Annotation");	
        testParserRule("[Annon3(value=1)]","Annotation");	
        testParserRule("[Annon4(key)]","Annotation");	
        testParserRule("[Annon5(a='b',c=\"d\")]","Annotation");	
        testParserRule("[Annon6(a='b',c='d')]","Annotation");	
        testParserRule("[Annon7('a')]","Annotation");	
    }

}
