/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AS3FactoryImpl extends EFactoryImpl implements AS3Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AS3Factory init()
  {
    try
    {
      AS3Factory theAS3Factory = (AS3Factory)EPackage.Registry.INSTANCE.getEFactory(AS3Package.eNS_URI);
      if (theAS3Factory != null)
      {
        return theAS3Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AS3FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AS3Package.MODEL: return createModel();
      case AS3Package.ANON_FUNCTION_EXPR: return createanonFunctionExpr();
      case AS3Package.ANNOTATION_FIELDS: return createannotationFields();
      case AS3Package.ANNOTATION_FIELD: return createannotationField();
      case AS3Package.ARGUMENTS: return createarguments();
      case AS3Package.ARRAY_LITERAL: return createarrayLiteral();
      case AS3Package.BLOCK: return createblock();
      case AS3Package.CATCHES: return createcatches();
      case AS3Package.CLASS_BODY: return createclassBody();
      case AS3Package.CLASS_DECLARATION: return createclassDeclaration();
      case AS3Package.COMMA_EXPR: return createcommaExpr();
      case AS3Package.COMPILATION_UNIT: return createcompilationUnit();
      case AS3Package.COMPILATION_UNIT_DECLARATION: return createcompilationUnitDeclaration();
      case AS3Package.DIRECTIVES: return createdirectives();
      case AS3Package.DIRECTIVE: return createdirective();
      case AS3Package.EXPR: return createexpr();
      case AS3Package.EXPR_OR_OBJECT_LITERAL: return createexprOrObjectLiteral();
      case AS3Package.FIELD_DECLARATION: return createfieldDeclaration();
      case AS3Package.IDENTIFIER_DECLARATION: return createidentifierDeclaration();
      case AS3Package.LABELABLE_STATEMENT: return createlabelableStatement();
      case AS3Package.LVALUE: return createlvalue();
      case AS3Package.MEMBER_DECLARATION: return creatememberDeclaration();
      case AS3Package.METHOD_DECLARATION: return createmethodDeclaration();
      case AS3Package.MODIFIERS: return createmodifiers();
      case AS3Package.NAMED_FUNCTION_EXPR: return createnamedFunctionExpr();
      case AS3Package.NAMESPACED_IDENTIFIER: return createnamespacedIdentifier();
      case AS3Package.OBJECT_FIELD: return createobjectField();
      case AS3Package.OBJECT_FIELDS: return createobjectFields();
      case AS3Package.OBJECT_LITERAL: return createobjectLiteral();
      case AS3Package.OPT_BODY: return createoptBody();
      case AS3Package.PACKAGE_DECLARATION: return createpackageDeclaration();
      case AS3Package.PARAMETER: return createparameter();
      case AS3Package.PARAMETERS: return createparameters();
      case AS3Package.PARENTHESIZED_EXPR: return createparenthesizedExpr();
      case AS3Package.STATEMENT: return createstatement();
      case AS3Package.STATEMENTS: return createstatements();
      case AS3Package.STATEMENT_IN_SWITCH: return createstatementInSwitch();
      case AS3Package.STATIC_INITIALIZER: return createstaticInitializer();
      case AS3Package.TYPE_LIST: return createtypeList();
      case AS3Package.VARIABLE_DECLARATION: return createvariableDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public anonFunctionExpr createanonFunctionExpr()
  {
    anonFunctionExprImpl anonFunctionExpr = new anonFunctionExprImpl();
    return anonFunctionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationFields createannotationFields()
  {
    annotationFieldsImpl annotationFields = new annotationFieldsImpl();
    return annotationFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationField createannotationField()
  {
    annotationFieldImpl annotationField = new annotationFieldImpl();
    return annotationField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arguments createarguments()
  {
    argumentsImpl arguments = new argumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayLiteral createarrayLiteral()
  {
    arrayLiteralImpl arrayLiteral = new arrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public catches createcatches()
  {
    catchesImpl catches = new catchesImpl();
    return catches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classBody createclassBody()
  {
    classBodyImpl classBody = new classBodyImpl();
    return classBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classDeclaration createclassDeclaration()
  {
    classDeclarationImpl classDeclaration = new classDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commaExpr createcommaExpr()
  {
    commaExprImpl commaExpr = new commaExprImpl();
    return commaExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compilationUnit createcompilationUnit()
  {
    compilationUnitImpl compilationUnit = new compilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compilationUnitDeclaration createcompilationUnitDeclaration()
  {
    compilationUnitDeclarationImpl compilationUnitDeclaration = new compilationUnitDeclarationImpl();
    return compilationUnitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public directives createdirectives()
  {
    directivesImpl directives = new directivesImpl();
    return directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public directive createdirective()
  {
    directiveImpl directive = new directiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr createexpr()
  {
    exprImpl expr = new exprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprOrObjectLiteral createexprOrObjectLiteral()
  {
    exprOrObjectLiteralImpl exprOrObjectLiteral = new exprOrObjectLiteralImpl();
    return exprOrObjectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldDeclaration createfieldDeclaration()
  {
    fieldDeclarationImpl fieldDeclaration = new fieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierDeclaration createidentifierDeclaration()
  {
    identifierDeclarationImpl identifierDeclaration = new identifierDeclarationImpl();
    return identifierDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public labelableStatement createlabelableStatement()
  {
    labelableStatementImpl labelableStatement = new labelableStatementImpl();
    return labelableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lvalue createlvalue()
  {
    lvalueImpl lvalue = new lvalueImpl();
    return lvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public memberDeclaration creatememberDeclaration()
  {
    memberDeclarationImpl memberDeclaration = new memberDeclarationImpl();
    return memberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodDeclaration createmethodDeclaration()
  {
    methodDeclarationImpl methodDeclaration = new methodDeclarationImpl();
    return methodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modifiers createmodifiers()
  {
    modifiersImpl modifiers = new modifiersImpl();
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public namedFunctionExpr createnamedFunctionExpr()
  {
    namedFunctionExprImpl namedFunctionExpr = new namedFunctionExprImpl();
    return namedFunctionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public namespacedIdentifier createnamespacedIdentifier()
  {
    namespacedIdentifierImpl namespacedIdentifier = new namespacedIdentifierImpl();
    return namespacedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectField createobjectField()
  {
    objectFieldImpl objectField = new objectFieldImpl();
    return objectField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectFields createobjectFields()
  {
    objectFieldsImpl objectFields = new objectFieldsImpl();
    return objectFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectLiteral createobjectLiteral()
  {
    objectLiteralImpl objectLiteral = new objectLiteralImpl();
    return objectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public optBody createoptBody()
  {
    optBodyImpl optBody = new optBodyImpl();
    return optBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packageDeclaration createpackageDeclaration()
  {
    packageDeclarationImpl packageDeclaration = new packageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter createparameter()
  {
    parameterImpl parameter = new parameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameters createparameters()
  {
    parametersImpl parameters = new parametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parenthesizedExpr createparenthesizedExpr()
  {
    parenthesizedExprImpl parenthesizedExpr = new parenthesizedExprImpl();
    return parenthesizedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statements createstatements()
  {
    statementsImpl statements = new statementsImpl();
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementInSwitch createstatementInSwitch()
  {
    statementInSwitchImpl statementInSwitch = new statementInSwitchImpl();
    return statementInSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public staticInitializer createstaticInitializer()
  {
    staticInitializerImpl staticInitializer = new staticInitializerImpl();
    return staticInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeList createtypeList()
  {
    typeListImpl typeList = new typeListImpl();
    return typeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableDeclaration createvariableDeclaration()
  {
    variableDeclarationImpl variableDeclaration = new variableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3Package getAS3Package()
  {
    return (AS3Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AS3Package getPackage()
  {
    return AS3Package.eINSTANCE;
  }

} //AS3FactoryImpl
