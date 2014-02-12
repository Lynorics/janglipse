/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package
 * @generated
 */
public interface AS3Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AS3Factory eINSTANCE = de.lynorics.eclipse.jangaroo.aS3.impl.AS3FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imports</em>'.
   * @generated
   */
  Imports createImports();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>directive</em>'.
   * @generated
   */
  directive createdirective();

  /**
   * Returns a new object of class '<em>Uses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses</em>'.
   * @generated
   */
  Uses createUses();

  /**
   * Returns a new object of class '<em>annotation Fields</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>annotation Fields</em>'.
   * @generated
   */
  annotationFields createannotationFields();

  /**
   * Returns a new object of class '<em>annotation Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>annotation Field</em>'.
   * @generated
   */
  annotationField createannotationField();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Interface Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Method</em>'.
   * @generated
   */
  InterfaceMethod createInterfaceMethod();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Body</em>'.
   * @generated
   */
  MethodBody createMethodBody();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Var Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Type</em>'.
   * @generated
   */
  VarType createVarType();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>object Literal</em>'.
   * @generated
   */
  objectLiteral createobjectLiteral();

  /**
   * Returns a new object of class '<em>field List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field List</em>'.
   * @generated
   */
  fieldList createfieldList();

  /**
   * Returns a new object of class '<em>literal Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literal Field</em>'.
   * @generated
   */
  literalField createliteralField();

  /**
   * Returns a new object of class '<em>field Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field Name</em>'.
   * @generated
   */
  fieldName createfieldName();

  /**
   * Returns a new object of class '<em>element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element</em>'.
   * @generated
   */
  element createelement();

  /**
   * Returns a new object of class '<em>expr Or Object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expr Or Object Literal</em>'.
   * @generated
   */
  exprOrObjectLiteral createexprOrObjectLiteral();

  /**
   * Returns a new object of class '<em>qualified Ident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>qualified Ident</em>'.
   * @generated
   */
  qualifiedIdent createqualifiedIdent();

  /**
   * Returns a new object of class '<em>identi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identi</em>'.
   * @generated
   */
  identi createidenti();

  /**
   * Returns a new object of class '<em>identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identifier</em>'.
   * @generated
   */
  identifier createidentifier();

  /**
   * Returns a new object of class '<em>property Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>property Identifier</em>'.
   * @generated
   */
  propertyIdentifier createpropertyIdentifier();

  /**
   * Returns a new object of class '<em>qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>qualifier</em>'.
   * @generated
   */
  qualifier createqualifier();

  /**
   * Returns a new object of class '<em>simple Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple Qualified Identifier</em>'.
   * @generated
   */
  simpleQualifiedIdentifier createsimpleQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>expression Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression Qualified Identifier</em>'.
   * @generated
   */
  expressionQualifiedIdentifier createexpressionQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>non Attribute Qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>non Attribute Qualified Identifier</em>'.
   * @generated
   */
  nonAttributeQualifiedIdentifier createnonAttributeQualifiedIdentifier();

  /**
   * Returns a new object of class '<em>qualified Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>qualified Identifier</em>'.
   * @generated
   */
  qualifiedIdentifier createqualifiedIdentifier();

  /**
   * Returns a new object of class '<em>namespace Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>namespace Name</em>'.
   * @generated
   */
  namespaceName createnamespaceName();

  /**
   * Returns a new object of class '<em>array Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array Literal</em>'.
   * @generated
   */
  arrayLiteral createarrayLiteral();

  /**
   * Returns a new object of class '<em>element List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element List</em>'.
   * @generated
   */
  elementList createelementList();

  /**
   * Returns a new object of class '<em>nonempty Element List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nonempty Element List</em>'.
   * @generated
   */
  nonemptyElementList createnonemptyElementList();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression List</em>'.
   * @generated
   */
  expressionList createexpressionList();

  /**
   * Returns a new object of class '<em>assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assignment Expression</em>'.
   * @generated
   */
  assignmentExpression createassignmentExpression();

  /**
   * Returns a new object of class '<em>conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditional Expression</em>'.
   * @generated
   */
  conditionalExpression createconditionalExpression();

  /**
   * Returns a new object of class '<em>conditional Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>conditional Sub Expression</em>'.
   * @generated
   */
  conditionalSubExpression createconditionalSubExpression();

  /**
   * Returns a new object of class '<em>logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical Or Expression</em>'.
   * @generated
   */
  logicalOrExpression createlogicalOrExpression();

  /**
   * Returns a new object of class '<em>logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical And Expression</em>'.
   * @generated
   */
  logicalAndExpression createlogicalAndExpression();

  /**
   * Returns a new object of class '<em>bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bitwise Or Expression</em>'.
   * @generated
   */
  bitwiseOrExpression createbitwiseOrExpression();

  /**
   * Returns a new object of class '<em>bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bitwise Xor Expression</em>'.
   * @generated
   */
  bitwiseXorExpression createbitwiseXorExpression();

  /**
   * Returns a new object of class '<em>bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bitwise And Expression</em>'.
   * @generated
   */
  bitwiseAndExpression createbitwiseAndExpression();

  /**
   * Returns a new object of class '<em>equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>equality Expression</em>'.
   * @generated
   */
  equalityExpression createequalityExpression();

  /**
   * Returns a new object of class '<em>relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>relational Expression</em>'.
   * @generated
   */
  relationalExpression createrelationalExpression();

  /**
   * Returns a new object of class '<em>shift Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shift Expression</em>'.
   * @generated
   */
  shiftExpression createshiftExpression();

  /**
   * Returns a new object of class '<em>additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>additive Expression</em>'.
   * @generated
   */
  additiveExpression createadditiveExpression();

  /**
   * Returns a new object of class '<em>multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>multiplicative Expression</em>'.
   * @generated
   */
  multiplicativeExpression createmultiplicativeExpression();

  /**
   * Returns a new object of class '<em>unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unary Expression</em>'.
   * @generated
   */
  unaryExpression createunaryExpression();

  /**
   * Returns a new object of class '<em>unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unary Expression Not Plus Minus</em>'.
   * @generated
   */
  unaryExpressionNotPlusMinus createunaryExpressionNotPlusMinus();

  /**
   * Returns a new object of class '<em>postfix Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>postfix Expression</em>'.
   * @generated
   */
  postfixExpression createpostfixExpression();

  /**
   * Returns a new object of class '<em>arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arguments</em>'.
   * @generated
   */
  arguments createarguments();

  /**
   * Returns a new object of class '<em>e4x Attribute Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>e4x Attribute Identifier</em>'.
   * @generated
   */
  e4xAttributeIdentifier createe4xAttributeIdentifier();

  /**
   * Returns a new object of class '<em>primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primary Expression</em>'.
   * @generated
   */
  primaryExpression createprimaryExpression();

  /**
   * Returns a new object of class '<em>prop Or Ident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>prop Or Ident</em>'.
   * @generated
   */
  propOrIdent createpropOrIdent();

  /**
   * Returns a new object of class '<em>regexp Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>regexp Literal</em>'.
   * @generated
   */
  regexpLiteral createregexpLiteral();

  /**
   * Returns a new object of class '<em>new Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>new Expression</em>'.
   * @generated
   */
  newExpression createnewExpression();

  /**
   * Returns a new object of class '<em>full New Subexpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>full New Subexpression</em>'.
   * @generated
   */
  fullNewSubexpression createfullNewSubexpression();

  /**
   * Returns a new object of class '<em>brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>brackets</em>'.
   * @generated
   */
  brackets createbrackets();

  /**
   * Returns a new object of class '<em>encapsulated Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>encapsulated Expression</em>'.
   * @generated
   */
  encapsulatedExpression createencapsulatedExpression();

  /**
   * Returns a new object of class '<em>function Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Signature</em>'.
   * @generated
   */
  functionSignature createfunctionSignature();

  /**
   * Returns a new object of class '<em>type Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type Expression</em>'.
   * @generated
   */
  typeExpression createtypeExpression();

  /**
   * Returns a new object of class '<em>parameter Declaration List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter Declaration List</em>'.
   * @generated
   */
  parameterDeclarationList createparameterDeclarationList();

  /**
   * Returns a new object of class '<em>parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter Declaration</em>'.
   * @generated
   */
  parameterDeclaration createparameterDeclaration();

  /**
   * Returns a new object of class '<em>basic Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>basic Parameter Declaration</em>'.
   * @generated
   */
  basicParameterDeclaration createbasicParameterDeclaration();

  /**
   * Returns a new object of class '<em>parameter Default</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter Default</em>'.
   * @generated
   */
  parameterDefault createparameterDefault();

  /**
   * Returns a new object of class '<em>parameter Rest Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter Rest Declaration</em>'.
   * @generated
   */
  parameterRestDeclaration createparameterRestDeclaration();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Default XML Namespace Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default XML Namespace Statement</em>'.
   * @generated
   */
  DefaultXMLNamespaceStatement createDefaultXMLNamespaceStatement();

  /**
   * Returns a new object of class '<em>Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration Statement</em>'.
   * @generated
   */
  DeclarationStatement createDeclarationStatement();

  /**
   * Returns a new object of class '<em>variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable Declarator</em>'.
   * @generated
   */
  variableDeclarator createvariableDeclarator();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>declaration Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration Tail</em>'.
   * @generated
   */
  declarationTail createdeclarationTail();

  /**
   * Returns a new object of class '<em>variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable Initializer</em>'.
   * @generated
   */
  variableInitializer createvariableInitializer();

  /**
   * Returns a new object of class '<em>Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Statement</em>'.
   * @generated
   */
  ExpressionStatement createExpressionStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Throw Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throw Statement</em>'.
   * @generated
   */
  ThrowStatement createThrowStatement();

  /**
   * Returns a new object of class '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try Statement</em>'.
   * @generated
   */
  TryStatement createTryStatement();

  /**
   * Returns a new object of class '<em>catch Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>catch Block</em>'.
   * @generated
   */
  catchBlock createcatchBlock();

  /**
   * Returns a new object of class '<em>finally Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>finally Block</em>'.
   * @generated
   */
  finallyBlock createfinallyBlock();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  SwitchStatement createSwitchStatement();

  /**
   * Returns a new object of class '<em>switch Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>switch Block</em>'.
   * @generated
   */
  switchBlock createswitchBlock();

  /**
   * Returns a new object of class '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement</em>'.
   * @generated
   */
  CaseStatement createCaseStatement();

  /**
   * Returns a new object of class '<em>Default Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Statement</em>'.
   * @generated
   */
  DefaultStatement createDefaultStatement();

  /**
   * Returns a new object of class '<em>switch Statement List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>switch Statement List</em>'.
   * @generated
   */
  switchStatementList createswitchStatementList();

  /**
   * Returns a new object of class '<em>For Each Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Each Statement</em>'.
   * @generated
   */
  ForEachStatement createForEachStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>traditional For Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>traditional For Clause</em>'.
   * @generated
   */
  traditionalForClause createtraditionalForClause();

  /**
   * Returns a new object of class '<em>for In Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for In Clause</em>'.
   * @generated
   */
  forInClause createforInClause();

  /**
   * Returns a new object of class '<em>for In Clause Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for In Clause Decl</em>'.
   * @generated
   */
  forInClauseDecl createforInClauseDecl();

  /**
   * Returns a new object of class '<em>for In Clause Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for In Clause Tail</em>'.
   * @generated
   */
  forInClauseTail createforInClauseTail();

  /**
   * Returns a new object of class '<em>for Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for Init</em>'.
   * @generated
   */
  forInit createforInit();

  /**
   * Returns a new object of class '<em>for Cond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for Cond</em>'.
   * @generated
   */
  forCond createforCond();

  /**
   * Returns a new object of class '<em>for Iter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>for Iter</em>'.
   * @generated
   */
  forIter createforIter();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Do While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Statement</em>'.
   * @generated
   */
  DoWhileStatement createDoWhileStatement();

  /**
   * Returns a new object of class '<em>With Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Statement</em>'.
   * @generated
   */
  WithStatement createWithStatement();

  /**
   * Returns a new object of class '<em>function Common</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Common</em>'.
   * @generated
   */
  functionCommon createfunctionCommon();

  /**
   * Returns a new object of class '<em>function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Expression</em>'.
   * @generated
   */
  functionExpression createfunctionExpression();

  /**
   * Returns a new object of class '<em>Xml Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Constant</em>'.
   * @generated
   */
  XmlConstant createXmlConstant();

  /**
   * Returns a new object of class '<em>Regexp Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Constant</em>'.
   * @generated
   */
  RegexpConstant createRegexpConstant();

  /**
   * Returns a new object of class '<em>Number Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Constant</em>'.
   * @generated
   */
  NumberConstant createNumberConstant();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>This</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>This</em>'.
   * @generated
   */
  This createThis();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AS3Package getAS3Package();

} //AS3Factory
