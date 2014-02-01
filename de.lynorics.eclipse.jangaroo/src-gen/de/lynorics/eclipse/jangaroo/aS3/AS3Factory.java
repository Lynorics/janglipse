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
   * Returns a new object of class '<em>Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Body</em>'.
   * @generated
   */
  MethodBody createMethodBody();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>New Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Statement</em>'.
   * @generated
   */
  NewStatement createNewStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>identifier Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>identifier Declaration</em>'.
   * @generated
   */
  identifierDeclaration createidentifierDeclaration();

  /**
   * Returns a new object of class '<em>comma Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>comma Expr</em>'.
   * @generated
   */
  commaExpr createcommaExpr();

  /**
   * Returns a new object of class '<em>Do While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Statement</em>'.
   * @generated
   */
  DoWhileStatement createDoWhileStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  SwitchStatement createSwitchStatement();

  /**
   * Returns a new object of class '<em>parenthesized Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parenthesized Expr</em>'.
   * @generated
   */
  parenthesizedExpr createparenthesizedExpr();

  /**
   * Returns a new object of class '<em>statement In Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement In Switch</em>'.
   * @generated
   */
  statementInSwitch createstatementInSwitch();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

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
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try Statement</em>'.
   * @generated
   */
  TryStatement createTryStatement();

  /**
   * Returns a new object of class '<em>If Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Block</em>'.
   * @generated
   */
  IfBlock createIfBlock();

  /**
   * Returns a new object of class '<em>Statements Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements Block</em>'.
   * @generated
   */
  StatementsBlock createStatementsBlock();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>type Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type Relation</em>'.
   * @generated
   */
  typeRelation createtypeRelation();

  /**
   * Returns a new object of class '<em>object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>object Literal</em>'.
   * @generated
   */
  objectLiteral createobjectLiteral();

  /**
   * Returns a new object of class '<em>object Fields</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>object Fields</em>'.
   * @generated
   */
  objectFields createobjectFields();

  /**
   * Returns a new object of class '<em>object Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>object Field</em>'.
   * @generated
   */
  objectField createobjectField();

  /**
   * Returns a new object of class '<em>expr Or Object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expr Or Object Literal</em>'.
   * @generated
   */
  exprOrObjectLiteral createexprOrObjectLiteral();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>New</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New</em>'.
   * @generated
   */
  New createNew();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch</em>'.
   * @generated
   */
  Switch createSwitch();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Member Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Selection</em>'.
   * @generated
   */
  MemberSelection createMemberSelection();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant</em>'.
   * @generated
   */
  IntConstant createIntConstant();

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
   * Returns a new object of class '<em>Super</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super</em>'.
   * @generated
   */
  Super createSuper();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns a new object of class '<em>Undefined</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undefined</em>'.
   * @generated
   */
  Undefined createUndefined();

  /**
   * Returns a new object of class '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Ref</em>'.
   * @generated
   */
  SymbolRef createSymbolRef();

  /**
   * Returns a new object of class '<em>Terminal Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal Op</em>'.
   * @generated
   */
  TerminalOp createTerminalOp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AS3Package getAS3Package();

} //AS3Factory
