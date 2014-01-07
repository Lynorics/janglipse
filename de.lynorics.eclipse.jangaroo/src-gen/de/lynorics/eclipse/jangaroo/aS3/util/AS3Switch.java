/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.*;

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
      case AS3Package.ANON_FUNCTION_EXPR:
      {
        anonFunctionExpr anonFunctionExpr = (anonFunctionExpr)theEObject;
        T result = caseanonFunctionExpr(anonFunctionExpr);
        if (result == null) result = caseexpr(anonFunctionExpr);
        if (result == null) result = caseannotationField(anonFunctionExpr);
        if (result == null) result = caseexprOrObjectLiteral(anonFunctionExpr);
        if (result == null) result = casestatementInSwitch(anonFunctionExpr);
        if (result == null) result = caseobjectField(anonFunctionExpr);
        if (result == null) result = caseparameter(anonFunctionExpr);
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
      case AS3Package.ARGUMENTS:
      {
        arguments arguments = (arguments)theEObject;
        T result = casearguments(arguments);
        if (result == null) result = casearrayLiteral(arguments);
        if (result == null) result = caseexpr(arguments);
        if (result == null) result = caseannotationField(arguments);
        if (result == null) result = caseexprOrObjectLiteral(arguments);
        if (result == null) result = casestatementInSwitch(arguments);
        if (result == null) result = caseobjectField(arguments);
        if (result == null) result = caseparameter(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ARRAY_LITERAL:
      {
        arrayLiteral arrayLiteral = (arrayLiteral)theEObject;
        T result = casearrayLiteral(arrayLiteral);
        if (result == null) result = caseexpr(arrayLiteral);
        if (result == null) result = caseannotationField(arrayLiteral);
        if (result == null) result = caseexprOrObjectLiteral(arrayLiteral);
        if (result == null) result = casestatementInSwitch(arrayLiteral);
        if (result == null) result = caseobjectField(arrayLiteral);
        if (result == null) result = caseparameter(arrayLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BLOCK:
      {
        block block = (block)theEObject;
        T result = caseblock(block);
        if (result == null) result = caseoptBody(block);
        if (result == null) result = casestaticInitializer(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CATCHES:
      {
        catches catches = (catches)theEObject;
        T result = casecatches(catches);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CLASS_BODY:
      {
        classBody classBody = (classBody)theEObject;
        T result = caseclassBody(classBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CLASS_DECLARATION:
      {
        classDeclaration classDeclaration = (classDeclaration)theEObject;
        T result = caseclassDeclaration(classDeclaration);
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
      case AS3Package.COMPILATION_UNIT:
      {
        compilationUnit compilationUnit = (compilationUnit)theEObject;
        T result = casecompilationUnit(compilationUnit);
        if (result == null) result = caseModel(compilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.COMPILATION_UNIT_DECLARATION:
      {
        compilationUnitDeclaration compilationUnitDeclaration = (compilationUnitDeclaration)theEObject;
        T result = casecompilationUnitDeclaration(compilationUnitDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DIRECTIVES:
      {
        directives directives = (directives)theEObject;
        T result = casedirectives(directives);
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
      case AS3Package.EXPR:
      {
        expr expr = (expr)theEObject;
        T result = caseexpr(expr);
        if (result == null) result = caseannotationField(expr);
        if (result == null) result = caseexprOrObjectLiteral(expr);
        if (result == null) result = casestatementInSwitch(expr);
        if (result == null) result = caseobjectField(expr);
        if (result == null) result = caseparameter(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPR_OR_OBJECT_LITERAL:
      {
        exprOrObjectLiteral exprOrObjectLiteral = (exprOrObjectLiteral)theEObject;
        T result = caseexprOrObjectLiteral(exprOrObjectLiteral);
        if (result == null) result = caseobjectField(exprOrObjectLiteral);
        if (result == null) result = caseparameter(exprOrObjectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FIELD_DECLARATION:
      {
        fieldDeclaration fieldDeclaration = (fieldDeclaration)theEObject;
        T result = casefieldDeclaration(fieldDeclaration);
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
      case AS3Package.LABELABLE_STATEMENT:
      {
        labelableStatement labelableStatement = (labelableStatement)theEObject;
        T result = caselabelableStatement(labelableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.LVALUE:
      {
        lvalue lvalue = (lvalue)theEObject;
        T result = caselvalue(lvalue);
        if (result == null) result = caseexpr(lvalue);
        if (result == null) result = caseannotationField(lvalue);
        if (result == null) result = caseexprOrObjectLiteral(lvalue);
        if (result == null) result = casestatementInSwitch(lvalue);
        if (result == null) result = caseobjectField(lvalue);
        if (result == null) result = caseparameter(lvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.MEMBER_DECLARATION:
      {
        memberDeclaration memberDeclaration = (memberDeclaration)theEObject;
        T result = casememberDeclaration(memberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.METHOD_DECLARATION:
      {
        methodDeclaration methodDeclaration = (methodDeclaration)theEObject;
        T result = casemethodDeclaration(methodDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.MODIFIERS:
      {
        modifiers modifiers = (modifiers)theEObject;
        T result = casemodifiers(modifiers);
        if (result == null) result = casenamespacedIdentifier(modifiers);
        if (result == null) result = caselvalue(modifiers);
        if (result == null) result = caseexpr(modifiers);
        if (result == null) result = caseannotationField(modifiers);
        if (result == null) result = caseexprOrObjectLiteral(modifiers);
        if (result == null) result = casestatementInSwitch(modifiers);
        if (result == null) result = caseobjectField(modifiers);
        if (result == null) result = caseparameter(modifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NAMED_FUNCTION_EXPR:
      {
        namedFunctionExpr namedFunctionExpr = (namedFunctionExpr)theEObject;
        T result = casenamedFunctionExpr(namedFunctionExpr);
        if (result == null) result = caseexprOrObjectLiteral(namedFunctionExpr);
        if (result == null) result = caseobjectField(namedFunctionExpr);
        if (result == null) result = caseparameter(namedFunctionExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NAMESPACED_IDENTIFIER:
      {
        namespacedIdentifier namespacedIdentifier = (namespacedIdentifier)theEObject;
        T result = casenamespacedIdentifier(namespacedIdentifier);
        if (result == null) result = caselvalue(namespacedIdentifier);
        if (result == null) result = caseexpr(namespacedIdentifier);
        if (result == null) result = caseannotationField(namespacedIdentifier);
        if (result == null) result = caseexprOrObjectLiteral(namespacedIdentifier);
        if (result == null) result = casestatementInSwitch(namespacedIdentifier);
        if (result == null) result = caseobjectField(namespacedIdentifier);
        if (result == null) result = caseparameter(namespacedIdentifier);
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
      case AS3Package.OBJECT_FIELDS:
      {
        objectFields objectFields = (objectFields)theEObject;
        T result = caseobjectFields(objectFields);
        if (result == null) result = caseobjectLiteral(objectFields);
        if (result == null) result = caseexprOrObjectLiteral(objectFields);
        if (result == null) result = caseobjectField(objectFields);
        if (result == null) result = caseparameter(objectFields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OBJECT_LITERAL:
      {
        objectLiteral objectLiteral = (objectLiteral)theEObject;
        T result = caseobjectLiteral(objectLiteral);
        if (result == null) result = caseexprOrObjectLiteral(objectLiteral);
        if (result == null) result = caseobjectField(objectLiteral);
        if (result == null) result = caseparameter(objectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OPT_BODY:
      {
        optBody optBody = (optBody)theEObject;
        T result = caseoptBody(optBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PACKAGE_DECLARATION:
      {
        packageDeclaration packageDeclaration = (packageDeclaration)theEObject;
        T result = casepackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER:
      {
        parameter parameter = (parameter)theEObject;
        T result = caseparameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETERS:
      {
        parameters parameters = (parameters)theEObject;
        T result = caseparameters(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARENTHESIZED_EXPR:
      {
        parenthesizedExpr parenthesizedExpr = (parenthesizedExpr)theEObject;
        T result = caseparenthesizedExpr(parenthesizedExpr);
        if (result == null) result = caseexpr(parenthesizedExpr);
        if (result == null) result = caseannotationField(parenthesizedExpr);
        if (result == null) result = caseexprOrObjectLiteral(parenthesizedExpr);
        if (result == null) result = casestatementInSwitch(parenthesizedExpr);
        if (result == null) result = caseobjectField(parenthesizedExpr);
        if (result == null) result = caseparameter(parenthesizedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = caselabelableStatement(statement);
        if (result == null) result = casestatementInSwitch(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENTS:
      {
        statements statements = (statements)theEObject;
        T result = casestatements(statements);
        if (result == null) result = caseblock(statements);
        if (result == null) result = caseoptBody(statements);
        if (result == null) result = casestaticInitializer(statements);
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
      case AS3Package.STATIC_INITIALIZER:
      {
        staticInitializer staticInitializer = (staticInitializer)theEObject;
        T result = casestaticInitializer(staticInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TYPE_LIST:
      {
        typeList typeList = (typeList)theEObject;
        T result = casetypeList(typeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VARIABLE_DECLARATION:
      {
        variableDeclaration variableDeclaration = (variableDeclaration)theEObject;
        T result = casevariableDeclaration(variableDeclaration);
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
   * Returns the result of interpreting the object as an instance of '<em>anon Function Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>anon Function Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseanonFunctionExpr(anonFunctionExpr object)
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
   * Returns the result of interpreting the object as an instance of '<em>arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearguments(arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearrayLiteral(arrayLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseblock(block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>catches</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>catches</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecatches(catches object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>class Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>class Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclassBody(classBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclassDeclaration(classDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompilationUnit(compilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compilation Unit Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compilation Unit Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompilationUnitDeclaration(compilationUnitDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>directives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>directives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedirectives(directives object)
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
   * Returns the result of interpreting the object as an instance of '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpr(expr object)
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
   * Returns the result of interpreting the object as an instance of '<em>field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefieldDeclaration(fieldDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>labelable Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>labelable Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabelableStatement(labelableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselvalue(lvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>member Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>member Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casememberDeclaration(memberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>method Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>method Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemethodDeclaration(methodDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>modifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>modifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemodifiers(modifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>named Function Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>named Function Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenamedFunctionExpr(namedFunctionExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>namespaced Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>namespaced Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenamespacedIdentifier(namespacedIdentifier object)
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
   * Returns the result of interpreting the object as an instance of '<em>opt Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>opt Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoptBody(optBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepackageDeclaration(packageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameter(parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameters(parameters object)
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
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatements(statements object)
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
   * Returns the result of interpreting the object as an instance of '<em>static Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>static Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestaticInitializer(staticInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetypeList(typeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariableDeclaration(variableDeclaration object)
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
