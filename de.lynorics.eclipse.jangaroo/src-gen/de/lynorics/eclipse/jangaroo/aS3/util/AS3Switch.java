/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Assignment;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfBlock;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.IntConstant;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberSelection;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.New;
import de.lynorics.eclipse.jangaroo.aS3.NewStatement;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Parameters;
import de.lynorics.eclipse.jangaroo.aS3.Return;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.StatementsBlock;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.Super;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.Symbol;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.TerminalOp;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Type;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.While;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package
 * @generated
 */
public class AS3Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AS3Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = AS3Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AS3Package.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PACKAGE:
      {
        de.lynorics.eclipse.jangaroo.aS3.Package package_ = (de.lynorics.eclipse.jangaroo.aS3.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseModel(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IMPORTS:
      {
        Imports imports = (Imports)theEObject;
        T result = caseImports(imports);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DIRECTIVE:
      {
        directive directive = (directive)theEObject;
        T result = casedirective(directive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.USES:
      {
        Uses uses = (Uses)theEObject;
        T result = caseUses(uses);
        if (result == null) result = casedirective(uses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ANNOTATION_FIELDS:
      {
        annotationFields annotationFields = (annotationFields)theEObject;
        T result = caseannotationFields(annotationFields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ANNOTATION_FIELD:
      {
        annotationField annotationField = (annotationField)theEObject;
        T result = caseannotationField(annotationField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CLASS:
      {
        de.lynorics.eclipse.jangaroo.aS3.Class class_ = (de.lynorics.eclipse.jangaroo.aS3.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.METHOD_BODY:
      {
        MethodBody methodBody = (MethodBody)theEObject;
        T result = caseMethodBody(methodBody);
        if (result == null) result = caseBlock(methodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = casestatementInSwitch(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NEW_STATEMENT:
      {
        NewStatement newStatement = (NewStatement)theEObject;
        T result = caseNewStatement(newStatement);
        if (result == null) result = caseStatement(newStatement);
        if (result == null) result = casestatementInSwitch(newStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = caseStatement(forStatement);
        if (result == null) result = casestatementInSwitch(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IDENTIFIER_DECLARATION:
      {
        identifierDeclaration identifierDeclaration = (identifierDeclaration)theEObject;
        T result = caseidentifierDeclaration(identifierDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.COMMA_EXPR:
      {
        commaExpr commaExpr = (commaExpr)theEObject;
        T result = casecommaExpr(commaExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DO_WHILE_STATEMENT:
      {
        DoWhileStatement doWhileStatement = (DoWhileStatement)theEObject;
        T result = caseDoWhileStatement(doWhileStatement);
        if (result == null) result = caseStatement(doWhileStatement);
        if (result == null) result = casestatementInSwitch(doWhileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = caseStatement(whileStatement);
        if (result == null) result = casestatementInSwitch(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = caseStatement(switchStatement);
        if (result == null) result = casestatementInSwitch(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARENTHESIZED_EXPR:
      {
        parenthesizedExpr parenthesizedExpr = (parenthesizedExpr)theEObject;
        T result = caseparenthesizedExpr(parenthesizedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENT_IN_SWITCH:
      {
        statementInSwitch statementInSwitch = (statementInSwitch)theEObject;
        T result = casestatementInSwitch(statementInSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseStatement(return_);
        if (result == null) result = casestatementInSwitch(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseStatement(variableDeclaration);
        if (result == null) result = caseSymbol(variableDeclaration);
        if (result == null) result = casestatementInSwitch(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = casestatementInSwitch(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TRY_STATEMENT:
      {
        TryStatement tryStatement = (TryStatement)theEObject;
        T result = caseTryStatement(tryStatement);
        if (result == null) result = caseStatement(tryStatement);
        if (result == null) result = casestatementInSwitch(tryStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IF_BLOCK:
      {
        IfBlock ifBlock = (IfBlock)theEObject;
        T result = caseIfBlock(ifBlock);
        if (result == null) result = caseBlock(ifBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENTS_BLOCK:
      {
        StatementsBlock statementsBlock = (StatementsBlock)theEObject;
        T result = caseStatementsBlock(statementsBlock);
        if (result == null) result = caseIfBlock(statementsBlock);
        if (result == null) result = caseBlock(statementsBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseSymbol(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETERS:
      {
        Parameters parameters = (Parameters)theEObject;
        T result = caseParameters(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TYPE_RELATION:
      {
        typeRelation typeRelation = (typeRelation)theEObject;
        T result = casetypeRelation(typeRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OBJECT_LITERAL:
      {
        objectLiteral objectLiteral = (objectLiteral)theEObject;
        T result = caseobjectLiteral(objectLiteral);
        if (result == null) result = caseStatement(objectLiteral);
        if (result == null) result = caseexprOrObjectLiteral(objectLiteral);
        if (result == null) result = casestatementInSwitch(objectLiteral);
        if (result == null) result = caseobjectField(objectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OBJECT_FIELDS:
      {
        objectFields objectFields = (objectFields)theEObject;
        T result = caseobjectFields(objectFields);
        if (result == null) result = caseobjectLiteral(objectFields);
        if (result == null) result = caseStatement(objectFields);
        if (result == null) result = caseexprOrObjectLiteral(objectFields);
        if (result == null) result = casestatementInSwitch(objectFields);
        if (result == null) result = caseobjectField(objectFields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OBJECT_FIELD:
      {
        objectField objectField = (objectField)theEObject;
        T result = caseobjectField(objectField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPR_OR_OBJECT_LITERAL:
      {
        exprOrObjectLiteral exprOrObjectLiteral = (exprOrObjectLiteral)theEObject;
        T result = caseexprOrObjectLiteral(exprOrObjectLiteral);
        if (result == null) result = caseobjectField(exprOrObjectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseStatement(expression);
        if (result == null) result = caseexprOrObjectLiteral(expression);
        if (result == null) result = casestatementInSwitch(expression);
        if (result == null) result = caseobjectField(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NEW:
      {
        New new_ = (New)theEObject;
        T result = caseNew(new_);
        if (result == null) result = caseNewStatement(new_);
        if (result == null) result = caseStatement(new_);
        if (result == null) result = casestatementInSwitch(new_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = caseDoWhileStatement(while_);
        if (result == null) result = caseWhileStatement(while_);
        if (result == null) result = caseStatement(while_);
        if (result == null) result = casestatementInSwitch(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SWITCH:
      {
        de.lynorics.eclipse.jangaroo.aS3.Switch switch_ = (de.lynorics.eclipse.jangaroo.aS3.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseSwitchStatement(switch_);
        if (result == null) result = caseStatement(switch_);
        if (result == null) result = casestatementInSwitch(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseExpression(assignment);
        if (result == null) result = caseStatement(assignment);
        if (result == null) result = caseexprOrObjectLiteral(assignment);
        if (result == null) result = casestatementInSwitch(assignment);
        if (result == null) result = caseobjectField(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.MEMBER_SELECTION:
      {
        MemberSelection memberSelection = (MemberSelection)theEObject;
        T result = caseMemberSelection(memberSelection);
        if (result == null) result = caseExpression(memberSelection);
        if (result == null) result = caseStatement(memberSelection);
        if (result == null) result = caseexprOrObjectLiteral(memberSelection);
        if (result == null) result = casestatementInSwitch(memberSelection);
        if (result == null) result = caseobjectField(memberSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseExpression(stringConstant);
        if (result == null) result = caseStatement(stringConstant);
        if (result == null) result = caseexprOrObjectLiteral(stringConstant);
        if (result == null) result = casestatementInSwitch(stringConstant);
        if (result == null) result = caseobjectField(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseExpression(intConstant);
        if (result == null) result = caseStatement(intConstant);
        if (result == null) result = caseexprOrObjectLiteral(intConstant);
        if (result == null) result = casestatementInSwitch(intConstant);
        if (result == null) result = caseobjectField(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseExpression(boolConstant);
        if (result == null) result = caseStatement(boolConstant);
        if (result == null) result = caseexprOrObjectLiteral(boolConstant);
        if (result == null) result = casestatementInSwitch(boolConstant);
        if (result == null) result = caseobjectField(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.THIS:
      {
        This this_ = (This)theEObject;
        T result = caseThis(this_);
        if (result == null) result = caseExpression(this_);
        if (result == null) result = caseStatement(this_);
        if (result == null) result = caseexprOrObjectLiteral(this_);
        if (result == null) result = casestatementInSwitch(this_);
        if (result == null) result = caseobjectField(this_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SUPER:
      {
        Super super_ = (Super)theEObject;
        T result = caseSuper(super_);
        if (result == null) result = caseExpression(super_);
        if (result == null) result = caseStatement(super_);
        if (result == null) result = caseexprOrObjectLiteral(super_);
        if (result == null) result = casestatementInSwitch(super_);
        if (result == null) result = caseobjectField(super_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NULL:
      {
        Null null_ = (Null)theEObject;
        T result = caseNull(null_);
        if (result == null) result = caseExpression(null_);
        if (result == null) result = caseStatement(null_);
        if (result == null) result = caseexprOrObjectLiteral(null_);
        if (result == null) result = casestatementInSwitch(null_);
        if (result == null) result = caseobjectField(null_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VOID:
      {
        de.lynorics.eclipse.jangaroo.aS3.Void void_ = (de.lynorics.eclipse.jangaroo.aS3.Void)theEObject;
        T result = caseVoid(void_);
        if (result == null) result = caseExpression(void_);
        if (result == null) result = caseStatement(void_);
        if (result == null) result = caseexprOrObjectLiteral(void_);
        if (result == null) result = casestatementInSwitch(void_);
        if (result == null) result = caseobjectField(void_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SYMBOL_REF:
      {
        SymbolRef symbolRef = (SymbolRef)theEObject;
        T result = caseSymbolRef(symbolRef);
        if (result == null) result = caseExpression(symbolRef);
        if (result == null) result = caseStatement(symbolRef);
        if (result == null) result = caseexprOrObjectLiteral(symbolRef);
        if (result == null) result = casestatementInSwitch(symbolRef);
        if (result == null) result = caseobjectField(symbolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TERMINAL_OP:
      {
        TerminalOp terminalOp = (TerminalOp)theEObject;
        T result = caseTerminalOp(terminalOp);
        if (result == null) result = caseExpression(terminalOp);
        if (result == null) result = caseStatement(terminalOp);
        if (result == null) result = caseexprOrObjectLiteral(terminalOp);
        if (result == null) result = casestatementInSwitch(terminalOp);
        if (result == null) result = caseobjectField(terminalOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(de.lynorics.eclipse.jangaroo.aS3.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImports(Imports object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedirective(directive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUses(Uses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>annotation Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>annotation Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseannotationFields(annotationFields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>annotation Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>annotation Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseannotationField(annotationField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(de.lynorics.eclipse.jangaroo.aS3.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodBody(MethodBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewStatement(NewStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>identifier Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>identifier Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseidentifierDeclaration(identifierDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>comma Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>comma Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecommaExpr(commaExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWhileStatement(DoWhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileStatement(WhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStatement(SwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parenthesized Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parenthesized Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparenthesizedExpr(parenthesizedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement In Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement In Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatementInSwitch(statementInSwitch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTryStatement(TryStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfBlock(IfBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statements Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statements Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementsBlock(StatementsBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameters(Parameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetypeRelation(typeRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>object Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>object Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseobjectLiteral(objectLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>object Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>object Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseobjectFields(objectFields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>object Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>object Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseobjectField(objectField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expr Or Object Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr Or Object Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexprOrObjectLiteral(exprOrObjectLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNew(New object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(de.lynorics.eclipse.jangaroo.aS3.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberSelection(MemberSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThis(This object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuper(Super object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNull(Null object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoid(de.lynorics.eclipse.jangaroo.aS3.Void object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRef(SymbolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalOp(TerminalOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AS3Switch
