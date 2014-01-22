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
    			"StatementsBlock");
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
    			"private static function b(): int {"
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
    			"ForStatement");
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
    			"try { a; }",
    			"TryStatement");
    	testParserRule(
    			"try { b; }"
    			+ "catch (exception)",
    			"TryStatement");
    	testParserRule(
    			"try { c; }"
    			+ "finally { }",
    			"TryStatement");
    	testParserRule(
    			"try { d; }"
    			+ "catch (exception)"
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
    			"NewStatement");
    	testParserRule(
    			"new a()",
    			"NewStatement");
    	testParserRule(
    			"new a(b)",
    			"NewStatement");
    	testParserRule(
    			"new a(c,d)",
    			"NewStatement");
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
    
}