/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Factory;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.CaseStatement;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
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
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.NumberConstant;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.RegexpConstant;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.ThrowStatement;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.WithStatement;
import de.lynorics.eclipse.jangaroo.aS3.XmlConstant;
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
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.catchBlock;
import de.lynorics.eclipse.jangaroo.aS3.conditionalExpression;
import de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case AS3Package.PACKAGE: return createPackage();
      case AS3Package.IMPORTS: return createImports();
      case AS3Package.IMPORT: return createImport();
      case AS3Package.DIRECTIVE: return createdirective();
      case AS3Package.ANNOTATION: return createAnnotation();
      case AS3Package.USES: return createUses();
      case AS3Package.ANNOTATION_FIELDS: return createannotationFields();
      case AS3Package.ANNOTATION_FIELD: return createannotationField();
      case AS3Package.INTERFACE: return createInterface();
      case AS3Package.INTERFACE_METHOD: return createInterfaceMethod();
      case AS3Package.FUNCTION_EXPRESSION: return createfunctionExpression();
      case AS3Package.FUNCTION_COMMON: return createfunctionCommon();
      case AS3Package.CLASS: return createClass();
      case AS3Package.MEMBER: return createMember();
      case AS3Package.METHOD: return createMethod();
      case AS3Package.MODIFIER: return createModifier();
      case AS3Package.METHOD_BODY: return createMethodBody();
      case AS3Package.MEMBER_VARIABLE_DECLARATION: return createMemberVariableDeclaration();
      case AS3Package.VARIABLE_DECLARATION: return createVariableDeclaration();
      case AS3Package.PARAMETER: return createParameter();
      case AS3Package.OBJECT_LITERAL: return createobjectLiteral();
      case AS3Package.FIELD_LIST: return createfieldList();
      case AS3Package.LITERAL_FIELD: return createliteralField();
      case AS3Package.FIELD_NAME: return createfieldName();
      case AS3Package.ELEMENT: return createelement();
      case AS3Package.EXPR_OR_OBJECT_LITERAL: return createexprOrObjectLiteral();
      case AS3Package.QUALIFIED_IDENT: return createqualifiedIdent();
      case AS3Package.IDENTI: return createidenti();
      case AS3Package.IDENTIFIER: return createidentifier();
      case AS3Package.PROPERTY_IDENTIFIER: return createpropertyIdentifier();
      case AS3Package.QUALIFIER: return createqualifier();
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER: return createsimpleQualifiedIdentifier();
      case AS3Package.EXPRESSION_QUALIFIED_IDENTIFIER: return createexpressionQualifiedIdentifier();
      case AS3Package.NON_ATTRIBUTE_QUALIFIED_IDENTIFIER: return createnonAttributeQualifiedIdentifier();
      case AS3Package.QUALIFIED_IDENTIFIER: return createqualifiedIdentifier();
      case AS3Package.NAMESPACE_NAME: return createnamespaceName();
      case AS3Package.ARRAY_LITERAL: return createarrayLiteral();
      case AS3Package.ELEMENT_LIST: return createelementList();
      case AS3Package.NONEMPTY_ELEMENT_LIST: return createnonemptyElementList();
      case AS3Package.EXPRESSION: return createExpression();
      case AS3Package.EXPRESSION_LIST: return createexpressionList();
      case AS3Package.ASSIGNMENT_EXPRESSION: return createassignmentExpression();
      case AS3Package.CONDITIONAL_EXPRESSION: return createconditionalExpression();
      case AS3Package.CONDITIONAL_SUB_EXPRESSION: return createconditionalSubExpression();
      case AS3Package.LOGICAL_OR_EXPRESSION: return createlogicalOrExpression();
      case AS3Package.LOGICAL_AND_EXPRESSION: return createlogicalAndExpression();
      case AS3Package.BITWISE_OR_EXPRESSION: return createbitwiseOrExpression();
      case AS3Package.BITWISE_XOR_EXPRESSION: return createbitwiseXorExpression();
      case AS3Package.BITWISE_AND_EXPRESSION: return createbitwiseAndExpression();
      case AS3Package.EQUALITY_EXPRESSION: return createequalityExpression();
      case AS3Package.RELATIONAL_EXPRESSION: return createrelationalExpression();
      case AS3Package.SHIFT_EXPRESSION: return createshiftExpression();
      case AS3Package.ADDITIVE_EXPRESSION: return createadditiveExpression();
      case AS3Package.MULTIPLICATIVE_EXPRESSION: return createmultiplicativeExpression();
      case AS3Package.UNARY_EXPRESSION: return createunaryExpression();
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS: return createunaryExpressionNotPlusMinus();
      case AS3Package.POSTFIX_EXPRESSION: return createpostfixExpression();
      case AS3Package.ARGUMENTS: return createarguments();
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER: return createe4xAttributeIdentifier();
      case AS3Package.PRIMARY_EXPRESSION: return createprimaryExpression();
      case AS3Package.PROP_OR_IDENT: return createpropOrIdent();
      case AS3Package.REGEXP_LITERAL: return createregexpLiteral();
      case AS3Package.NEW_EXPRESSION: return createnewExpression();
      case AS3Package.FULL_NEW_SUBEXPRESSION: return createfullNewSubexpression();
      case AS3Package.BRACKETS: return createbrackets();
      case AS3Package.ENCAPSULATED_EXPRESSION: return createencapsulatedExpression();
      case AS3Package.FUNCTION_SIGNATURE: return createfunctionSignature();
      case AS3Package.TYPE_EXPRESSION: return createtypeExpression();
      case AS3Package.PARAMETER_DECLARATION_LIST: return createparameterDeclarationList();
      case AS3Package.PARAMETER_DECLARATION: return createparameterDeclaration();
      case AS3Package.BASIC_PARAMETER_DECLARATION: return createbasicParameterDeclaration();
      case AS3Package.PARAMETER_DEFAULT: return createparameterDefault();
      case AS3Package.PARAMETER_REST_DECLARATION: return createparameterRestDeclaration();
      case AS3Package.BLOCK: return createBlock();
      case AS3Package.CONDITION: return createCondition();
      case AS3Package.STATEMENT: return createStatement();
      case AS3Package.DEFAULT_XML_NAMESPACE_STATEMENT: return createDefaultXMLNamespaceStatement();
      case AS3Package.EXPRESSION_STATEMENT: return createExpressionStatement();
      case AS3Package.IF_STATEMENT: return createIfStatement();
      case AS3Package.THROW_STATEMENT: return createThrowStatement();
      case AS3Package.TRY_STATEMENT: return createTryStatement();
      case AS3Package.CATCH_BLOCK: return createcatchBlock();
      case AS3Package.FINALLY_BLOCK: return createfinallyBlock();
      case AS3Package.RETURN_STATEMENT: return createReturnStatement();
      case AS3Package.SWITCH_STATEMENT: return createSwitchStatement();
      case AS3Package.SWITCH_BLOCK: return createswitchBlock();
      case AS3Package.CASE_STATEMENT: return createCaseStatement();
      case AS3Package.DEFAULT_STATEMENT: return createDefaultStatement();
      case AS3Package.SWITCH_STATEMENT_LIST: return createswitchStatementList();
      case AS3Package.FOR_EACH_STATEMENT: return createForEachStatement();
      case AS3Package.FOR_STATEMENT: return createForStatement();
      case AS3Package.TRADITIONAL_FOR_CLAUSE: return createtraditionalForClause();
      case AS3Package.FOR_IN_CLAUSE: return createforInClause();
      case AS3Package.FOR_IN_CLAUSE_DECL: return createforInClauseDecl();
      case AS3Package.FOR_IN_CLAUSE_TAIL: return createforInClauseTail();
      case AS3Package.FOR_INIT: return createforInit();
      case AS3Package.FOR_COND: return createforCond();
      case AS3Package.FOR_ITER: return createforIter();
      case AS3Package.WHILE_STATEMENT: return createWhileStatement();
      case AS3Package.DO_WHILE_STATEMENT: return createDoWhileStatement();
      case AS3Package.WITH_STATEMENT: return createWithStatement();
      case AS3Package.XML_CONSTANT: return createXmlConstant();
      case AS3Package.REGEXP_CONSTANT: return createRegexpConstant();
      case AS3Package.NUMBER_CONSTANT: return createNumberConstant();
      case AS3Package.STRING_CONSTANT: return createStringConstant();
      case AS3Package.BOOL_CONSTANT: return createBoolConstant();
      case AS3Package.THIS: return createThis();
      case AS3Package.NULL: return createNull();
      case AS3Package.SYMBOL_REF: return createSymbolRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AS3Package.ACCESS_LEVEL:
        return createAccessLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AS3Package.ACCESS_LEVEL:
        return convertAccessLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public de.lynorics.eclipse.jangaroo.aS3.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uses createUses()
  {
    UsesImpl uses = new UsesImpl();
    return uses;
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
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMethod createInterfaceMethod()
  {
    InterfaceMethodImpl interfaceMethod = new InterfaceMethodImpl();
    return interfaceMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionExpression createfunctionExpression()
  {
    functionExpressionImpl functionExpression = new functionExpressionImpl();
    return functionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionCommon createfunctionCommon()
  {
    functionCommonImpl functionCommon = new functionCommonImpl();
    return functionCommon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.lynorics.eclipse.jangaroo.aS3.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodBody createMethodBody()
  {
    MethodBodyImpl methodBody = new MethodBodyImpl();
    return methodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberVariableDeclaration createMemberVariableDeclaration()
  {
    MemberVariableDeclarationImpl memberVariableDeclaration = new MemberVariableDeclarationImpl();
    return memberVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
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
  public fieldList createfieldList()
  {
    fieldListImpl fieldList = new fieldListImpl();
    return fieldList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalField createliteralField()
  {
    literalFieldImpl literalField = new literalFieldImpl();
    return literalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldName createfieldName()
  {
    fieldNameImpl fieldName = new fieldNameImpl();
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element createelement()
  {
    elementImpl element = new elementImpl();
    return element;
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
  public qualifiedIdent createqualifiedIdent()
  {
    qualifiedIdentImpl qualifiedIdent = new qualifiedIdentImpl();
    return qualifiedIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identi createidenti()
  {
    identiImpl identi = new identiImpl();
    return identi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier createidentifier()
  {
    identifierImpl identifier = new identifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public propertyIdentifier createpropertyIdentifier()
  {
    propertyIdentifierImpl propertyIdentifier = new propertyIdentifierImpl();
    return propertyIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifier createqualifier()
  {
    qualifierImpl qualifier = new qualifierImpl();
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleQualifiedIdentifier createsimpleQualifiedIdentifier()
  {
    simpleQualifiedIdentifierImpl simpleQualifiedIdentifier = new simpleQualifiedIdentifierImpl();
    return simpleQualifiedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionQualifiedIdentifier createexpressionQualifiedIdentifier()
  {
    expressionQualifiedIdentifierImpl expressionQualifiedIdentifier = new expressionQualifiedIdentifierImpl();
    return expressionQualifiedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonAttributeQualifiedIdentifier createnonAttributeQualifiedIdentifier()
  {
    nonAttributeQualifiedIdentifierImpl nonAttributeQualifiedIdentifier = new nonAttributeQualifiedIdentifierImpl();
    return nonAttributeQualifiedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedIdentifier createqualifiedIdentifier()
  {
    qualifiedIdentifierImpl qualifiedIdentifier = new qualifiedIdentifierImpl();
    return qualifiedIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public namespaceName createnamespaceName()
  {
    namespaceNameImpl namespaceName = new namespaceNameImpl();
    return namespaceName;
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
  public elementList createelementList()
  {
    elementListImpl elementList = new elementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonemptyElementList createnonemptyElementList()
  {
    nonemptyElementListImpl nonemptyElementList = new nonemptyElementListImpl();
    return nonemptyElementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionList createexpressionList()
  {
    expressionListImpl expressionList = new expressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignmentExpression createassignmentExpression()
  {
    assignmentExpressionImpl assignmentExpression = new assignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditionalExpression createconditionalExpression()
  {
    conditionalExpressionImpl conditionalExpression = new conditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditionalSubExpression createconditionalSubExpression()
  {
    conditionalSubExpressionImpl conditionalSubExpression = new conditionalSubExpressionImpl();
    return conditionalSubExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logicalOrExpression createlogicalOrExpression()
  {
    logicalOrExpressionImpl logicalOrExpression = new logicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logicalAndExpression createlogicalAndExpression()
  {
    logicalAndExpressionImpl logicalAndExpression = new logicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bitwiseOrExpression createbitwiseOrExpression()
  {
    bitwiseOrExpressionImpl bitwiseOrExpression = new bitwiseOrExpressionImpl();
    return bitwiseOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bitwiseXorExpression createbitwiseXorExpression()
  {
    bitwiseXorExpressionImpl bitwiseXorExpression = new bitwiseXorExpressionImpl();
    return bitwiseXorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bitwiseAndExpression createbitwiseAndExpression()
  {
    bitwiseAndExpressionImpl bitwiseAndExpression = new bitwiseAndExpressionImpl();
    return bitwiseAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equalityExpression createequalityExpression()
  {
    equalityExpressionImpl equalityExpression = new equalityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relationalExpression createrelationalExpression()
  {
    relationalExpressionImpl relationalExpression = new relationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shiftExpression createshiftExpression()
  {
    shiftExpressionImpl shiftExpression = new shiftExpressionImpl();
    return shiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additiveExpression createadditiveExpression()
  {
    additiveExpressionImpl additiveExpression = new additiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicativeExpression createmultiplicativeExpression()
  {
    multiplicativeExpressionImpl multiplicativeExpression = new multiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression createunaryExpression()
  {
    unaryExpressionImpl unaryExpression = new unaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpressionNotPlusMinus createunaryExpressionNotPlusMinus()
  {
    unaryExpressionNotPlusMinusImpl unaryExpressionNotPlusMinus = new unaryExpressionNotPlusMinusImpl();
    return unaryExpressionNotPlusMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfixExpression createpostfixExpression()
  {
    postfixExpressionImpl postfixExpression = new postfixExpressionImpl();
    return postfixExpression;
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
  public e4xAttributeIdentifier createe4xAttributeIdentifier()
  {
    e4xAttributeIdentifierImpl e4xAttributeIdentifier = new e4xAttributeIdentifierImpl();
    return e4xAttributeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpression createprimaryExpression()
  {
    primaryExpressionImpl primaryExpression = new primaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public propOrIdent createpropOrIdent()
  {
    propOrIdentImpl propOrIdent = new propOrIdentImpl();
    return propOrIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public regexpLiteral createregexpLiteral()
  {
    regexpLiteralImpl regexpLiteral = new regexpLiteralImpl();
    return regexpLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public newExpression createnewExpression()
  {
    newExpressionImpl newExpression = new newExpressionImpl();
    return newExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fullNewSubexpression createfullNewSubexpression()
  {
    fullNewSubexpressionImpl fullNewSubexpression = new fullNewSubexpressionImpl();
    return fullNewSubexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public brackets createbrackets()
  {
    bracketsImpl brackets = new bracketsImpl();
    return brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public encapsulatedExpression createencapsulatedExpression()
  {
    encapsulatedExpressionImpl encapsulatedExpression = new encapsulatedExpressionImpl();
    return encapsulatedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionSignature createfunctionSignature()
  {
    functionSignatureImpl functionSignature = new functionSignatureImpl();
    return functionSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeExpression createtypeExpression()
  {
    typeExpressionImpl typeExpression = new typeExpressionImpl();
    return typeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterDeclarationList createparameterDeclarationList()
  {
    parameterDeclarationListImpl parameterDeclarationList = new parameterDeclarationListImpl();
    return parameterDeclarationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterDeclaration createparameterDeclaration()
  {
    parameterDeclarationImpl parameterDeclaration = new parameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public basicParameterDeclaration createbasicParameterDeclaration()
  {
    basicParameterDeclarationImpl basicParameterDeclaration = new basicParameterDeclarationImpl();
    return basicParameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterDefault createparameterDefault()
  {
    parameterDefaultImpl parameterDefault = new parameterDefaultImpl();
    return parameterDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterRestDeclaration createparameterRestDeclaration()
  {
    parameterRestDeclarationImpl parameterRestDeclaration = new parameterRestDeclarationImpl();
    return parameterRestDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultXMLNamespaceStatement createDefaultXMLNamespaceStatement()
  {
    DefaultXMLNamespaceStatementImpl defaultXMLNamespaceStatement = new DefaultXMLNamespaceStatementImpl();
    return defaultXMLNamespaceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStatement createExpressionStatement()
  {
    ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
    return expressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowStatement createThrowStatement()
  {
    ThrowStatementImpl throwStatement = new ThrowStatementImpl();
    return throwStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement createTryStatement()
  {
    TryStatementImpl tryStatement = new TryStatementImpl();
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public catchBlock createcatchBlock()
  {
    catchBlockImpl catchBlock = new catchBlockImpl();
    return catchBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public finallyBlock createfinallyBlock()
  {
    finallyBlockImpl finallyBlock = new finallyBlockImpl();
    return finallyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchBlock createswitchBlock()
  {
    switchBlockImpl switchBlock = new switchBlockImpl();
    return switchBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatement createCaseStatement()
  {
    CaseStatementImpl caseStatement = new CaseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultStatement createDefaultStatement()
  {
    DefaultStatementImpl defaultStatement = new DefaultStatementImpl();
    return defaultStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchStatementList createswitchStatementList()
  {
    switchStatementListImpl switchStatementList = new switchStatementListImpl();
    return switchStatementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEachStatement createForEachStatement()
  {
    ForEachStatementImpl forEachStatement = new ForEachStatementImpl();
    return forEachStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public traditionalForClause createtraditionalForClause()
  {
    traditionalForClauseImpl traditionalForClause = new traditionalForClauseImpl();
    return traditionalForClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClause createforInClause()
  {
    forInClauseImpl forInClause = new forInClauseImpl();
    return forInClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClauseDecl createforInClauseDecl()
  {
    forInClauseDeclImpl forInClauseDecl = new forInClauseDeclImpl();
    return forInClauseDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClauseTail createforInClauseTail()
  {
    forInClauseTailImpl forInClauseTail = new forInClauseTailImpl();
    return forInClauseTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInit createforInit()
  {
    forInitImpl forInit = new forInitImpl();
    return forInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forCond createforCond()
  {
    forCondImpl forCond = new forCondImpl();
    return forCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forIter createforIter()
  {
    forIterImpl forIter = new forIterImpl();
    return forIter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhileStatement createDoWhileStatement()
  {
    DoWhileStatementImpl doWhileStatement = new DoWhileStatementImpl();
    return doWhileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatement createWithStatement()
  {
    WithStatementImpl withStatement = new WithStatementImpl();
    return withStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XmlConstant createXmlConstant()
  {
    XmlConstantImpl xmlConstant = new XmlConstantImpl();
    return xmlConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpConstant createRegexpConstant()
  {
    RegexpConstantImpl regexpConstant = new RegexpConstantImpl();
    return regexpConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberConstant createNumberConstant()
  {
    NumberConstantImpl numberConstant = new NumberConstantImpl();
    return numberConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue)
  {
    AccessLevel result = AccessLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
