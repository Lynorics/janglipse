/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.CaseStatement;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
import de.lynorics.eclipse.jangaroo.aS3.Constant;
import de.lynorics.eclipse.jangaroo.aS3.Declaration;
import de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForEachStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.ThrowStatement;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VarType;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.WithStatement;
import de.lynorics.eclipse.jangaroo.aS3.additiveExpression;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.arrayLiteral;
import de.lynorics.eclipse.jangaroo.aS3.assignmentExpression;
import de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression;
import de.lynorics.eclipse.jangaroo.aS3.block;
import de.lynorics.eclipse.jangaroo.aS3.blockEntry;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.catchBlock;
import de.lynorics.eclipse.jangaroo.aS3.conditionalExpression;
import de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression;
import de.lynorics.eclipse.jangaroo.aS3.declarationTail;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.element;
import de.lynorics.eclipse.jangaroo.aS3.elementList;
import de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression;
import de.lynorics.eclipse.jangaroo.aS3.equalityExpression;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.expressionList;
import de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.fieldList;
import de.lynorics.eclipse.jangaroo.aS3.fieldName;
import de.lynorics.eclipse.jangaroo.aS3.finallyBlock;
import de.lynorics.eclipse.jangaroo.aS3.forCond;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseTail;
import de.lynorics.eclipse.jangaroo.aS3.forInit;
import de.lynorics.eclipse.jangaroo.aS3.forIter;
import de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression;
import de.lynorics.eclipse.jangaroo.aS3.functionCommon;
import de.lynorics.eclipse.jangaroo.aS3.functionExpression;
import de.lynorics.eclipse.jangaroo.aS3.functionSignature;
import de.lynorics.eclipse.jangaroo.aS3.identi;
import de.lynorics.eclipse.jangaroo.aS3.identifier;
import de.lynorics.eclipse.jangaroo.aS3.literalField;
import de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression;
import de.lynorics.eclipse.jangaroo.aS3.namespaceName;
import de.lynorics.eclipse.jangaroo.aS3.newExpression;
import de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList;
import de.lynorics.eclipse.jangaroo.aS3.parameterDefault;
import de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.postfixExpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifier;
import de.lynorics.eclipse.jangaroo.aS3.regexpLiteral;
import de.lynorics.eclipse.jangaroo.aS3.relationalExpression;
import de.lynorics.eclipse.jangaroo.aS3.shiftExpression;
import de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;
import de.lynorics.eclipse.jangaroo.aS3.switchStatementList;
import de.lynorics.eclipse.jangaroo.aS3.traditionalForClause;
import de.lynorics.eclipse.jangaroo.aS3.typeExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus;
import de.lynorics.eclipse.jangaroo.aS3.variableDeclarator;
import de.lynorics.eclipse.jangaroo.aS3.variableInitializer;

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
      case AS3Package.INTERFACE_METHOD:
      {
        InterfaceMethod interfaceMethod = (InterfaceMethod)theEObject;
        T result = caseInterfaceMethod(interfaceMethod);
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
      case AS3Package.MODIFIER:
      {
        Modifier modifier = (Modifier)theEObject;
        T result = caseModifier(modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.METHOD_BODY:
      {
        MethodBody methodBody = (MethodBody)theEObject;
        T result = caseMethodBody(methodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VAR_TYPE:
      {
        VarType varType = (VarType)theEObject;
        T result = caseVarType(varType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.OBJECT_LITERAL:
      {
        objectLiteral objectLiteral = (objectLiteral)theEObject;
        T result = caseobjectLiteral(objectLiteral);
        if (result == null) result = caseexprOrObjectLiteral(objectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FIELD_LIST:
      {
        fieldList fieldList = (fieldList)theEObject;
        T result = casefieldList(fieldList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.LITERAL_FIELD:
      {
        literalField literalField = (literalField)theEObject;
        T result = caseliteralField(literalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FIELD_NAME:
      {
        fieldName fieldName = (fieldName)theEObject;
        T result = casefieldName(fieldName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ELEMENT:
      {
        element element = (element)theEObject;
        T result = caseelement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPR_OR_OBJECT_LITERAL:
      {
        exprOrObjectLiteral exprOrObjectLiteral = (exprOrObjectLiteral)theEObject;
        T result = caseexprOrObjectLiteral(exprOrObjectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.QUALIFIED_IDENT:
      {
        qualifiedIdent qualifiedIdent = (qualifiedIdent)theEObject;
        T result = casequalifiedIdent(qualifiedIdent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IDENTI:
      {
        identi identi = (identi)theEObject;
        T result = caseidenti(identi);
        if (result == null) result = casefieldName(identi);
        if (result == null) result = casepropertyIdentifier(identi);
        if (result == null) result = casevariableDeclarator(identi);
        if (result == null) result = casecatchBlock(identi);
        if (result == null) result = casequalifier(identi);
        if (result == null) result = caseDeclaration(identi);
        if (result == null) result = caseDeclarationStatement(identi);
        if (result == null) result = caseforInClauseDecl(identi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IDENTIFIER:
      {
        identifier identifier = (identifier)theEObject;
        T result = caseidentifier(identifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PROPERTY_IDENTIFIER:
      {
        propertyIdentifier propertyIdentifier = (propertyIdentifier)theEObject;
        T result = casepropertyIdentifier(propertyIdentifier);
        if (result == null) result = casequalifier(propertyIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.QUALIFIER:
      {
        qualifier qualifier = (qualifier)theEObject;
        T result = casequalifier(qualifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER:
      {
        simpleQualifiedIdentifier simpleQualifiedIdentifier = (simpleQualifiedIdentifier)theEObject;
        T result = casesimpleQualifiedIdentifier(simpleQualifiedIdentifier);
        if (result == null) result = casenonAttributeQualifiedIdentifier(simpleQualifiedIdentifier);
        if (result == null) result = casequalifiedIdentifier(simpleQualifiedIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPRESSION_QUALIFIED_IDENTIFIER:
      {
        expressionQualifiedIdentifier expressionQualifiedIdentifier = (expressionQualifiedIdentifier)theEObject;
        T result = caseexpressionQualifiedIdentifier(expressionQualifiedIdentifier);
        if (result == null) result = casenonAttributeQualifiedIdentifier(expressionQualifiedIdentifier);
        if (result == null) result = casequalifiedIdentifier(expressionQualifiedIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NON_ATTRIBUTE_QUALIFIED_IDENTIFIER:
      {
        nonAttributeQualifiedIdentifier nonAttributeQualifiedIdentifier = (nonAttributeQualifiedIdentifier)theEObject;
        T result = casenonAttributeQualifiedIdentifier(nonAttributeQualifiedIdentifier);
        if (result == null) result = casequalifiedIdentifier(nonAttributeQualifiedIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.QUALIFIED_IDENTIFIER:
      {
        qualifiedIdentifier qualifiedIdentifier = (qualifiedIdentifier)theEObject;
        T result = casequalifiedIdentifier(qualifiedIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NAMESPACE_NAME:
      {
        namespaceName namespaceName = (namespaceName)theEObject;
        T result = casenamespaceName(namespaceName);
        if (result == null) result = casequalifiedIdent(namespaceName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ARRAY_LITERAL:
      {
        arrayLiteral arrayLiteral = (arrayLiteral)theEObject;
        T result = casearrayLiteral(arrayLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ELEMENT_LIST:
      {
        elementList elementList = (elementList)theEObject;
        T result = caseelementList(elementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NONEMPTY_ELEMENT_LIST:
      {
        nonemptyElementList nonemptyElementList = (nonemptyElementList)theEObject;
        T result = casenonemptyElementList(nonemptyElementList);
        if (result == null) result = caseelementList(nonemptyElementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseexprOrObjectLiteral(expression);
        if (result == null) result = caseCondition(expression);
        if (result == null) result = caseDefaultXMLNamespaceStatement(expression);
        if (result == null) result = caseThrowStatement(expression);
        if (result == null) result = caseCaseStatement(expression);
        if (result == null) result = caseSwitchStatement(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPRESSION_LIST:
      {
        expressionList expressionList = (expressionList)theEObject;
        T result = caseexpressionList(expressionList);
        if (result == null) result = casebrackets(expressionList);
        if (result == null) result = caseExpressionStatement(expressionList);
        if (result == null) result = caseforInClauseTail(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ASSIGNMENT_EXPRESSION:
      {
        assignmentExpression assignmentExpression = (assignmentExpression)theEObject;
        T result = caseassignmentExpression(assignmentExpression);
        if (result == null) result = caseelement(assignmentExpression);
        if (result == null) result = casenonemptyElementList(assignmentExpression);
        if (result == null) result = caseExpression(assignmentExpression);
        if (result == null) result = caseencapsulatedExpression(assignmentExpression);
        if (result == null) result = caseparameterDefault(assignmentExpression);
        if (result == null) result = caseelementList(assignmentExpression);
        if (result == null) result = caseexprOrObjectLiteral(assignmentExpression);
        if (result == null) result = caseCondition(assignmentExpression);
        if (result == null) result = caseDefaultXMLNamespaceStatement(assignmentExpression);
        if (result == null) result = caseThrowStatement(assignmentExpression);
        if (result == null) result = caseCaseStatement(assignmentExpression);
        if (result == null) result = caseexpressionQualifiedIdentifier(assignmentExpression);
        if (result == null) result = caseSwitchStatement(assignmentExpression);
        if (result == null) result = casenonAttributeQualifiedIdentifier(assignmentExpression);
        if (result == null) result = casequalifiedIdentifier(assignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CONDITIONAL_EXPRESSION:
      {
        conditionalExpression conditionalExpression = (conditionalExpression)theEObject;
        T result = caseconditionalExpression(conditionalExpression);
        if (result == null) result = caseassignmentExpression(conditionalExpression);
        if (result == null) result = caseelement(conditionalExpression);
        if (result == null) result = casenonemptyElementList(conditionalExpression);
        if (result == null) result = caseExpression(conditionalExpression);
        if (result == null) result = caseencapsulatedExpression(conditionalExpression);
        if (result == null) result = caseparameterDefault(conditionalExpression);
        if (result == null) result = caseelementList(conditionalExpression);
        if (result == null) result = caseexprOrObjectLiteral(conditionalExpression);
        if (result == null) result = caseCondition(conditionalExpression);
        if (result == null) result = caseDefaultXMLNamespaceStatement(conditionalExpression);
        if (result == null) result = caseThrowStatement(conditionalExpression);
        if (result == null) result = caseCaseStatement(conditionalExpression);
        if (result == null) result = caseexpressionQualifiedIdentifier(conditionalExpression);
        if (result == null) result = caseSwitchStatement(conditionalExpression);
        if (result == null) result = casenonAttributeQualifiedIdentifier(conditionalExpression);
        if (result == null) result = casequalifiedIdentifier(conditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CONDITIONAL_SUB_EXPRESSION:
      {
        conditionalSubExpression conditionalSubExpression = (conditionalSubExpression)theEObject;
        T result = caseconditionalSubExpression(conditionalSubExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.LOGICAL_OR_EXPRESSION:
      {
        logicalOrExpression logicalOrExpression = (logicalOrExpression)theEObject;
        T result = caselogicalOrExpression(logicalOrExpression);
        if (result == null) result = caseconditionalExpression(logicalOrExpression);
        if (result == null) result = caseassignmentExpression(logicalOrExpression);
        if (result == null) result = caseelement(logicalOrExpression);
        if (result == null) result = casenonemptyElementList(logicalOrExpression);
        if (result == null) result = caseExpression(logicalOrExpression);
        if (result == null) result = caseencapsulatedExpression(logicalOrExpression);
        if (result == null) result = caseparameterDefault(logicalOrExpression);
        if (result == null) result = caseelementList(logicalOrExpression);
        if (result == null) result = caseexprOrObjectLiteral(logicalOrExpression);
        if (result == null) result = caseCondition(logicalOrExpression);
        if (result == null) result = caseDefaultXMLNamespaceStatement(logicalOrExpression);
        if (result == null) result = caseThrowStatement(logicalOrExpression);
        if (result == null) result = caseCaseStatement(logicalOrExpression);
        if (result == null) result = caseexpressionQualifiedIdentifier(logicalOrExpression);
        if (result == null) result = caseSwitchStatement(logicalOrExpression);
        if (result == null) result = casenonAttributeQualifiedIdentifier(logicalOrExpression);
        if (result == null) result = casequalifiedIdentifier(logicalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.LOGICAL_AND_EXPRESSION:
      {
        logicalAndExpression logicalAndExpression = (logicalAndExpression)theEObject;
        T result = caselogicalAndExpression(logicalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BITWISE_OR_EXPRESSION:
      {
        bitwiseOrExpression bitwiseOrExpression = (bitwiseOrExpression)theEObject;
        T result = casebitwiseOrExpression(bitwiseOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BITWISE_XOR_EXPRESSION:
      {
        bitwiseXorExpression bitwiseXorExpression = (bitwiseXorExpression)theEObject;
        T result = casebitwiseXorExpression(bitwiseXorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BITWISE_AND_EXPRESSION:
      {
        bitwiseAndExpression bitwiseAndExpression = (bitwiseAndExpression)theEObject;
        T result = casebitwiseAndExpression(bitwiseAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EQUALITY_EXPRESSION:
      {
        equalityExpression equalityExpression = (equalityExpression)theEObject;
        T result = caseequalityExpression(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.RELATIONAL_EXPRESSION:
      {
        relationalExpression relationalExpression = (relationalExpression)theEObject;
        T result = caserelationalExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SHIFT_EXPRESSION:
      {
        shiftExpression shiftExpression = (shiftExpression)theEObject;
        T result = caseshiftExpression(shiftExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ADDITIVE_EXPRESSION:
      {
        additiveExpression additiveExpression = (additiveExpression)theEObject;
        T result = caseadditiveExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.MULTIPLICATIVE_EXPRESSION:
      {
        multiplicativeExpression multiplicativeExpression = (multiplicativeExpression)theEObject;
        T result = casemultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.UNARY_EXPRESSION:
      {
        unaryExpression unaryExpression = (unaryExpression)theEObject;
        T result = caseunaryExpression(unaryExpression);
        if (result == null) result = caseunaryExpressionNotPlusMinus(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS:
      {
        unaryExpressionNotPlusMinus unaryExpressionNotPlusMinus = (unaryExpressionNotPlusMinus)theEObject;
        T result = caseunaryExpressionNotPlusMinus(unaryExpressionNotPlusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.POSTFIX_EXPRESSION:
      {
        postfixExpression postfixExpression = (postfixExpression)theEObject;
        T result = casepostfixExpression(postfixExpression);
        if (result == null) result = caseunaryExpressionNotPlusMinus(postfixExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ARGUMENTS:
      {
        arguments arguments = (arguments)theEObject;
        T result = casearguments(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER:
      {
        e4xAttributeIdentifier e4xAttributeIdentifier = (e4xAttributeIdentifier)theEObject;
        T result = casee4xAttributeIdentifier(e4xAttributeIdentifier);
        if (result == null) result = casequalifiedIdentifier(e4xAttributeIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PRIMARY_EXPRESSION:
      {
        primaryExpression primaryExpression = (primaryExpression)theEObject;
        T result = caseprimaryExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PROP_OR_IDENT:
      {
        propOrIdent propOrIdent = (propOrIdent)theEObject;
        T result = casepropOrIdent(propOrIdent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.REGEXP_LITERAL:
      {
        regexpLiteral regexpLiteral = (regexpLiteral)theEObject;
        T result = caseregexpLiteral(regexpLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.NEW_EXPRESSION:
      {
        newExpression newExpression = (newExpression)theEObject;
        T result = casenewExpression(newExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FULL_NEW_SUBEXPRESSION:
      {
        fullNewSubexpression fullNewSubexpression = (fullNewSubexpression)theEObject;
        T result = casefullNewSubexpression(fullNewSubexpression);
        if (result == null) result = casenewExpression(fullNewSubexpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BRACKETS:
      {
        brackets brackets = (brackets)theEObject;
        T result = casebrackets(brackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.ENCAPSULATED_EXPRESSION:
      {
        encapsulatedExpression encapsulatedExpression = (encapsulatedExpression)theEObject;
        T result = caseencapsulatedExpression(encapsulatedExpression);
        if (result == null) result = caseexpressionQualifiedIdentifier(encapsulatedExpression);
        if (result == null) result = casenonAttributeQualifiedIdentifier(encapsulatedExpression);
        if (result == null) result = casequalifiedIdentifier(encapsulatedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FUNCTION_SIGNATURE:
      {
        functionSignature functionSignature = (functionSignature)theEObject;
        T result = casefunctionSignature(functionSignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TYPE_EXPRESSION:
      {
        typeExpression typeExpression = (typeExpression)theEObject;
        T result = casetypeExpression(typeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER_DECLARATION_LIST:
      {
        parameterDeclarationList parameterDeclarationList = (parameterDeclarationList)theEObject;
        T result = caseparameterDeclarationList(parameterDeclarationList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER_DECLARATION:
      {
        parameterDeclaration parameterDeclaration = (parameterDeclaration)theEObject;
        T result = caseparameterDeclaration(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BASIC_PARAMETER_DECLARATION:
      {
        basicParameterDeclaration basicParameterDeclaration = (basicParameterDeclaration)theEObject;
        T result = casebasicParameterDeclaration(basicParameterDeclaration);
        if (result == null) result = caseparameterDeclaration(basicParameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER_DEFAULT:
      {
        parameterDefault parameterDefault = (parameterDefault)theEObject;
        T result = caseparameterDefault(parameterDefault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.PARAMETER_REST_DECLARATION:
      {
        parameterRestDeclaration parameterRestDeclaration = (parameterRestDeclaration)theEObject;
        T result = caseparameterRestDeclaration(parameterRestDeclaration);
        if (result == null) result = caseparameterDeclaration(parameterRestDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BLOCK:
      {
        block block = (block)theEObject;
        T result = caseblock(block);
        if (result == null) result = casefinallyBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.BLOCK_ENTRY:
      {
        blockEntry blockEntry = (blockEntry)theEObject;
        T result = caseblockEntry(blockEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseSwitchStatement(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = caseblockEntry(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DEFAULT_XML_NAMESPACE_STATEMENT:
      {
        DefaultXMLNamespaceStatement defaultXMLNamespaceStatement = (DefaultXMLNamespaceStatement)theEObject;
        T result = caseDefaultXMLNamespaceStatement(defaultXMLNamespaceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DECLARATION_STATEMENT:
      {
        DeclarationStatement declarationStatement = (DeclarationStatement)theEObject;
        T result = caseDeclarationStatement(declarationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VARIABLE_DECLARATOR:
      {
        variableDeclarator variableDeclarator = (variableDeclarator)theEObject;
        T result = casevariableDeclarator(variableDeclarator);
        if (result == null) result = caseDeclaration(variableDeclarator);
        if (result == null) result = caseDeclarationStatement(variableDeclarator);
        if (result == null) result = caseforInClauseDecl(variableDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseDeclarationStatement(declaration);
        if (result == null) result = caseforInClauseDecl(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DECLARATION_TAIL:
      {
        declarationTail declarationTail = (declarationTail)theEObject;
        T result = casedeclarationTail(declarationTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.VARIABLE_INITIALIZER:
      {
        variableInitializer variableInitializer = (variableInitializer)theEObject;
        T result = casevariableInitializer(variableInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.EXPRESSION_STATEMENT:
      {
        ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
        T result = caseExpressionStatement(expressionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.THROW_STATEMENT:
      {
        ThrowStatement throwStatement = (ThrowStatement)theEObject;
        T result = caseThrowStatement(throwStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TRY_STATEMENT:
      {
        TryStatement tryStatement = (TryStatement)theEObject;
        T result = caseTryStatement(tryStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CATCH_BLOCK:
      {
        catchBlock catchBlock = (catchBlock)theEObject;
        T result = casecatchBlock(catchBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FINALLY_BLOCK:
      {
        finallyBlock finallyBlock = (finallyBlock)theEObject;
        T result = casefinallyBlock(finallyBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SWITCH_BLOCK:
      {
        switchBlock switchBlock = (switchBlock)theEObject;
        T result = caseswitchBlock(switchBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.CASE_STATEMENT:
      {
        CaseStatement caseStatement = (CaseStatement)theEObject;
        T result = caseCaseStatement(caseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DEFAULT_STATEMENT:
      {
        DefaultStatement defaultStatement = (DefaultStatement)theEObject;
        T result = caseDefaultStatement(defaultStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.SWITCH_STATEMENT_LIST:
      {
        switchStatementList switchStatementList = (switchStatementList)theEObject;
        T result = caseswitchStatementList(switchStatementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_EACH_STATEMENT:
      {
        ForEachStatement forEachStatement = (ForEachStatement)theEObject;
        T result = caseForEachStatement(forEachStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.TRADITIONAL_FOR_CLAUSE:
      {
        traditionalForClause traditionalForClause = (traditionalForClause)theEObject;
        T result = casetraditionalForClause(traditionalForClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_IN_CLAUSE:
      {
        forInClause forInClause = (forInClause)theEObject;
        T result = caseforInClause(forInClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_IN_CLAUSE_DECL:
      {
        forInClauseDecl forInClauseDecl = (forInClauseDecl)theEObject;
        T result = caseforInClauseDecl(forInClauseDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_IN_CLAUSE_TAIL:
      {
        forInClauseTail forInClauseTail = (forInClauseTail)theEObject;
        T result = caseforInClauseTail(forInClauseTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_INIT:
      {
        forInit forInit = (forInit)theEObject;
        T result = caseforInit(forInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_COND:
      {
        forCond forCond = (forCond)theEObject;
        T result = caseforCond(forCond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FOR_ITER:
      {
        forIter forIter = (forIter)theEObject;
        T result = caseforIter(forIter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.DO_WHILE_STATEMENT:
      {
        DoWhileStatement doWhileStatement = (DoWhileStatement)theEObject;
        T result = caseDoWhileStatement(doWhileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.WITH_STATEMENT:
      {
        WithStatement withStatement = (WithStatement)theEObject;
        T result = caseWithStatement(withStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FUNCTION_COMMON:
      {
        functionCommon functionCommon = (functionCommon)theEObject;
        T result = casefunctionCommon(functionCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AS3Package.FUNCTION_EXPRESSION:
      {
        functionExpression functionExpression = (functionExpression)theEObject;
        T result = casefunctionExpression(functionExpression);
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
   * Returns the result of interpreting the object as an instance of '<em>Interface Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMethod(InterfaceMethod object)
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
   * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifier(Modifier object)
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
   * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarType(VarType object)
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
   * Returns the result of interpreting the object as an instance of '<em>field List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefieldList(fieldList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteralField(literalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefieldName(fieldName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement(element object)
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
   * Returns the result of interpreting the object as an instance of '<em>qualified Ident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>qualified Ident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequalifiedIdent(qualifiedIdent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>identi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>identi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseidenti(identi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseidentifier(identifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>property Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>property Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepropertyIdentifier(propertyIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>qualifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>qualifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequalifier(qualifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple Qualified Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimpleQualifiedIdentifier(simpleQualifiedIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression Qualified Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionQualifiedIdentifier(expressionQualifiedIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>non Attribute Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>non Attribute Qualified Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenonAttributeQualifiedIdentifier(nonAttributeQualifiedIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>qualified Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequalifiedIdentifier(qualifiedIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>namespace Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>namespace Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenamespaceName(namespaceName object)
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
   * Returns the result of interpreting the object as an instance of '<em>element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelementList(elementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nonempty Element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nonempty Element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenonemptyElementList(nonemptyElementList object)
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
   * Returns the result of interpreting the object as an instance of '<em>expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionList(expressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignmentExpression(assignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconditionalExpression(conditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>conditional Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>conditional Sub Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconditionalSubExpression(conditionalSubExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogicalOrExpression(logicalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogicalAndExpression(logicalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bitwise Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebitwiseOrExpression(bitwiseOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bitwise Xor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebitwiseXorExpression(bitwiseXorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bitwise And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebitwiseAndExpression(bitwiseAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseequalityExpression(equalityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelationalExpression(relationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>shift Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>shift Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseshiftExpression(shiftExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadditiveExpression(additiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemultiplicativeExpression(multiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunaryExpression(unaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unary Expression Not Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunaryExpressionNotPlusMinus(unaryExpressionNotPlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>postfix Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>postfix Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepostfixExpression(postfixExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>e4x Attribute Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>e4x Attribute Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casee4xAttributeIdentifier(e4xAttributeIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryExpression(primaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>prop Or Ident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>prop Or Ident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepropOrIdent(propOrIdent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>regexp Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>regexp Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseregexpLiteral(regexpLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>new Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>new Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenewExpression(newExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>full New Subexpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>full New Subexpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefullNewSubexpression(fullNewSubexpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebrackets(brackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>encapsulated Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>encapsulated Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseencapsulatedExpression(encapsulatedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionSignature(functionSignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetypeExpression(typeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter Declaration List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter Declaration List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameterDeclarationList(parameterDeclarationList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameterDeclaration(parameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>basic Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>basic Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebasicParameterDeclaration(basicParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter Default</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter Default</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameterDefault(parameterDefault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter Rest Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter Rest Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameterRestDeclaration(parameterRestDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>block Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>block Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseblockEntry(blockEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
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
   * Returns the result of interpreting the object as an instance of '<em>Default XML Namespace Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default XML Namespace Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultXMLNamespaceStatement(DefaultXMLNamespaceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarationStatement(DeclarationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariableDeclarator(variableDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclarationTail(declarationTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariableInitializer(variableInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionStatement(ExpressionStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThrowStatement(ThrowStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>catch Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>catch Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecatchBlock(catchBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>finally Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>finally Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefinallyBlock(finallyBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>switch Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>switch Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseswitchBlock(switchBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatement(CaseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultStatement(DefaultStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>switch Statement List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>switch Statement List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseswitchStatementList(switchStatementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachStatement(ForEachStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>traditional For Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>traditional For Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetraditionalForClause(traditionalForClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for In Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for In Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforInClause(forInClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for In Clause Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for In Clause Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforInClauseDecl(forInClauseDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for In Clause Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for In Clause Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforInClauseTail(forInClauseTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforInit(forInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for Cond</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for Cond</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforCond(forCond object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>for Iter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>for Iter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseforIter(forIter object)
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
   * Returns the result of interpreting the object as an instance of '<em>With Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>With Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithStatement(WithStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Common</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionCommon(functionCommon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionExpression(functionExpression object)
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
