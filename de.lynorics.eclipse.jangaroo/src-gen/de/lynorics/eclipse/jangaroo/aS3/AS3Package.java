/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Factory
 * @model kind="package"
 * @generated
 */
public interface AS3Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aS3";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lynorics.de/eclipse/jangaroo/AS3";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aS3";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AS3Package eINSTANCE = de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl.init();

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ModelImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASSES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__IMPORTS = MODEL__IMPORTS;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__CLASSES = MODEL__CLASSES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 1;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPERCLASS = 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = 3;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPES = 4;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.MemberImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMember()
   * @generated
   */
  int MEMBER = 4;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__VAR = 0;

  /**
   * The feature id for the '<em><b>Meth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__METH = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.MethodImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMethod()
   * @generated
   */
  int METHOD = 5;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = 4;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 23;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl <em>Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMethodBody()
   * @generated
   */
  int METHOD_BODY = 6;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_BODY__STATEMENTS = BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_BODY_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl <em>statement In Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatementInSwitch()
   * @generated
   */
  int STATEMENT_IN_SWITCH = 16;

  /**
   * The number of structural features of the '<em>statement In Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IN_SWITCH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 7;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = STATEMENT_IN_SWITCH_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NewStatementImpl <em>New Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.NewStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNewStatement()
   * @generated
   */
  int NEW_STATEMENT = 8;

  /**
   * The number of structural features of the '<em>New Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FORINIT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__ITERATOR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__ELEMENTS = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name Forin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__NAME_FORIN = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Forinexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FORINEXPR = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Forcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FORCOMMAND = STATEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Name Foreachh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__NAME_FOREACHH = STATEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__RELATION = STATEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Foreachexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOREACHEXPR = STATEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Foreachcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOREACHCOMMAND = STATEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl <em>identifier Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidentifierDeclaration()
   * @generated
   */
  int IDENTIFIER_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_DECLARATION__RELATION = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_DECLARATION__EXPR = 2;

  /**
   * The number of structural features of the '<em>identifier Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl <em>comma Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcommaExpr()
   * @generated
   */
  int COMMA_EXPR = 11;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_EXPR__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>comma Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMA_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDoWhileStatement()
   * @generated
   */
  int DO_WHILE_STATEMENT = 12;

  /**
   * The number of structural features of the '<em>Do While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 13;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 14;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl <em>parenthesized Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparenthesizedExpr()
   * @generated
   */
  int PARENTHESIZED_EXPR = 15;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>parenthesized Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ReturnImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getReturn()
   * @generated
   */
  int RETURN = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__THEN_BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl <em>Try Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getTryStatement()
   * @generated
   */
  int TRY_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Finally Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY_BLOCK = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Try Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IfBlockImpl <em>If Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.IfBlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIfBlock()
   * @generated
   */
  int IF_BLOCK = 21;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_BLOCK__STATEMENTS = BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>If Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementsBlockImpl <em>Statements Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.StatementsBlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStatementsBlock()
   * @generated
   */
  int STATEMENTS_BLOCK = 22;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_BLOCK__STATEMENTS = IF_BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>Statements Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_BLOCK_FEATURE_COUNT = IF_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SymbolImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__NAME = 0;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__REL = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__LIT = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ParametersImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 25;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__NAME = 1;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__REL = 2;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeRelationImpl <em>type Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeRelationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeRelation()
   * @generated
   */
  int TYPE_RELATION = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RELATION__TYPE = 0;

  /**
   * The number of structural features of the '<em>type Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RELATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl <em>object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectLiteral()
   * @generated
   */
  int OBJECT_LITERAL = 27;

  /**
   * The number of structural features of the '<em>object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl <em>object Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectFields()
   * @generated
   */
  int OBJECT_FIELDS = 28;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FIELDS__FIELDS = OBJECT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>object Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FIELDS_FEATURE_COUNT = OBJECT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl <em>object Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectField()
   * @generated
   */
  int OBJECT_FIELD = 29;

  /**
   * The number of structural features of the '<em>object Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FIELD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl <em>expr Or Object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexprOrObjectLiteral()
   * @generated
   */
  int EXPR_OR_OBJECT_LITERAL = 30;

  /**
   * The number of structural features of the '<em>expr Or Object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT = OBJECT_FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 32;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NewImpl <em>New</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.NewImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNew()
   * @generated
   */
  int NEW = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__TYPE = NEW_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__PARAM = NEW_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>New</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_FEATURE_COUNT = NEW_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.WhileImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWhile()
   * @generated
   */
  int WHILE = 34;

  /**
   * The feature id for the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__WHILE_BLOCK = DO_WHILE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__COND = DO_WHILE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = DO_WHILE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SwitchImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 35;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__COND = SWITCH_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASES = SWITCH_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = SWITCH_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AssignmentImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MemberSelectionImpl <em>Member Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.MemberSelectionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMemberSelection()
   * @generated
   */
  int MEMBER_SELECTION = 37;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION__RECEIVER = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION__MEMBER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION__METHODINVOCATION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION__ARGS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Member Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.IntConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ThisImpl <em>This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ThisImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getThis()
   * @generated
   */
  int THIS = 41;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SuperImpl <em>Super</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SuperImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSuper()
   * @generated
   */
  int SUPER = 42;

  /**
   * The number of structural features of the '<em>Super</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNull()
   * @generated
   */
  int NULL = 43;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SymbolRefImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 44;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__SYMBOL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel <em>Access Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getAccessLevel()
   * @generated
   */
  int ACCESS_LEVEL = 45;


  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Model#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model#getClasses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Classes();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getAccess()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Access();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getSuperclass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getMembers()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Members();

  /**
   * Returns the meta object for the reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getTypes()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Types();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Member#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Member#getVar()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Var();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Member#getMeth <em>Meth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meth</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Member#getMeth()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Meth();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getAccess()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Access();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.MethodBody <em>Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Body</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MethodBody
   * @generated
   */
  EClass getMethodBody();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.NewStatement <em>New Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.NewStatement
   * @generated
   */
  EClass getNewStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinit <em>Forinit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinit()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Forinit();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCondition()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getIterator()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Iterator();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCommand()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Command();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getElements()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Elements();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForin <em>Name Forin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Forin</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForin()
   * @see #getForStatement()
   * @generated
   */
  EAttribute getForStatement_NameForin();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinexpr <em>Forinexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinexpr()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Forinexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForcommand <em>Forcommand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forcommand</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForcommand()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Forcommand();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForeachh <em>Name Foreachh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Foreachh</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForeachh()
   * @see #getForStatement()
   * @generated
   */
  EAttribute getForStatement_NameForeachh();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getRelation()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachexpr <em>Foreachexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreachexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachexpr()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Foreachexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachcommand <em>Foreachcommand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreachcommand</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachcommand()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Foreachcommand();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration <em>identifier Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>identifier Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration
   * @generated
   */
  EClass getidentifierDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getName()
   * @see #getidentifierDeclaration()
   * @generated
   */
  EAttribute getidentifierDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getRelation()
   * @see #getidentifierDeclaration()
   * @generated
   */
  EReference getidentifierDeclaration_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getExpr()
   * @see #getidentifierDeclaration()
   * @generated
   */
  EReference getidentifierDeclaration_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.commaExpr <em>comma Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>comma Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.commaExpr
   * @generated
   */
  EClass getcommaExpr();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.commaExpr#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.commaExpr#getElements()
   * @see #getcommaExpr()
   * @generated
   */
  EReference getcommaExpr_Elements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement <em>Do While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do While Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement
   * @generated
   */
  EClass getDoWhileStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr <em>parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parenthesized Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr
   * @generated
   */
  EClass getparenthesizedExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr#getExpression()
   * @see #getparenthesizedExpr()
   * @generated
   */
  EReference getparenthesizedExpr_Expression();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.statementInSwitch <em>statement In Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement In Switch</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statementInSwitch
   * @generated
   */
  EClass getstatementInSwitch();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Return#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Return#getExpression()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Expression();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getExpression()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getExpression()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getThenBlock()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ThenBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getElseBlock()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement
   * @generated
   */
  EClass getTryStatement();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getStatements()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getParams()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinallyBlock <em>Finally Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinallyBlock()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_FinallyBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.IfBlock <em>If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfBlock
   * @generated
   */
  EClass getIfBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.StatementsBlock <em>Statements Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statements Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.StatementsBlock
   * @generated
   */
  EClass getStatementsBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Block#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Block#getStatements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter#getRel()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Rel();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter#getLit()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Lit();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Parameters#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameters#getElements()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Elements();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Parameters#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameters#getName()
   * @see #getParameters()
   * @generated
   */
  EAttribute getParameters_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Parameters#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameters#getRel()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Rel();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.typeRelation <em>type Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeRelation
   * @generated
   */
  EClass gettypeRelation();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.typeRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeRelation#getType()
   * @see #gettypeRelation()
   * @generated
   */
  EReference gettypeRelation_Type();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.objectLiteral <em>object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>object Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectLiteral
   * @generated
   */
  EClass getobjectLiteral();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.objectFields <em>object Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>object Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectFields
   * @generated
   */
  EClass getobjectFields();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.objectFields#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectFields#getFields()
   * @see #getobjectFields()
   * @generated
   */
  EReference getobjectFields_Fields();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.objectField <em>object Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>object Field</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectField
   * @generated
   */
  EClass getobjectField();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral <em>expr Or Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr Or Object Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral
   * @generated
   */
  EClass getexprOrObjectLiteral();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Symbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Symbol#getName()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.New <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.New
   * @generated
   */
  EClass getNew();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.New#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.New#getType()
   * @see #getNew()
   * @generated
   */
  EReference getNew_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.New#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.New#getParam()
   * @see #getNew()
   * @generated
   */
  EReference getNew_Param();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.While#getWhileBlock <em>While Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.While#getWhileBlock()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_WhileBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.While#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.While#getCond()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Cond();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Switch#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Switch#getCond()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Switch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Switch#getCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cases();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Assignment#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Assignment#getLeft()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Assignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Assignment#getRight()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Right();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection <em>Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Selection</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection
   * @generated
   */
  EClass getMemberSelection();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getReceiver()
   * @see #getMemberSelection()
   * @generated
   */
  EReference getMemberSelection_Receiver();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getMember()
   * @see #getMemberSelection()
   * @generated
   */
  EReference getMemberSelection_Member();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#isMethodinvocation <em>Methodinvocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodinvocation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection#isMethodinvocation()
   * @see #getMemberSelection()
   * @generated
   */
  EAttribute getMemberSelection_Methodinvocation();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getArgs()
   * @see #getMemberSelection()
   * @generated
   */
  EReference getMemberSelection_Args();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.StringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.StringConstant#getValue()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Value();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.IntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IntConstant#getValue()
   * @see #getIntConstant()
   * @generated
   */
  EAttribute getIntConstant_Value();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.BoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.BoolConstant#getValue()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.This
   * @generated
   */
  EClass getThis();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Super <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Super
   * @generated
   */
  EClass getSuper();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.SymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.SymbolRef#getSymbol()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Symbol();

  /**
   * Returns the meta object for enum '{@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel <em>Access Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Level</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @generated
   */
  EEnum getAccessLevel();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AS3Factory getAS3Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ModelImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLASSES = eINSTANCE.getModel_Classes();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__ACCESS = eINSTANCE.getClass_Access();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPERCLASS = eINSTANCE.getClass_Superclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__TYPES = eINSTANCE.getClass_Types();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.MemberImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__VAR = eINSTANCE.getMember_Var();

    /**
     * The meta object literal for the '<em><b>Meth</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__METH = eINSTANCE.getMember_Meth();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.MethodImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__ACCESS = eINSTANCE.getMethod_Access();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl <em>Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMethodBody()
     * @generated
     */
    EClass METHOD_BODY = eINSTANCE.getMethodBody();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NewStatementImpl <em>New Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.NewStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNewStatement()
     * @generated
     */
    EClass NEW_STATEMENT = eINSTANCE.getNewStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Forinit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FORINIT = eINSTANCE.getForStatement_Forinit();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__CONDITION = eINSTANCE.getForStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__ITERATOR = eINSTANCE.getForStatement_Iterator();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__COMMAND = eINSTANCE.getForStatement_Command();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__ELEMENTS = eINSTANCE.getForStatement_Elements();

    /**
     * The meta object literal for the '<em><b>Name Forin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__NAME_FORIN = eINSTANCE.getForStatement_NameForin();

    /**
     * The meta object literal for the '<em><b>Forinexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FORINEXPR = eINSTANCE.getForStatement_Forinexpr();

    /**
     * The meta object literal for the '<em><b>Forcommand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FORCOMMAND = eINSTANCE.getForStatement_Forcommand();

    /**
     * The meta object literal for the '<em><b>Name Foreachh</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__NAME_FOREACHH = eINSTANCE.getForStatement_NameForeachh();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__RELATION = eINSTANCE.getForStatement_Relation();

    /**
     * The meta object literal for the '<em><b>Foreachexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOREACHEXPR = eINSTANCE.getForStatement_Foreachexpr();

    /**
     * The meta object literal for the '<em><b>Foreachcommand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOREACHCOMMAND = eINSTANCE.getForStatement_Foreachcommand();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl <em>identifier Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidentifierDeclaration()
     * @generated
     */
    EClass IDENTIFIER_DECLARATION = eINSTANCE.getidentifierDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_DECLARATION__NAME = eINSTANCE.getidentifierDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_DECLARATION__RELATION = eINSTANCE.getidentifierDeclaration_Relation();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_DECLARATION__EXPR = eINSTANCE.getidentifierDeclaration_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl <em>comma Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcommaExpr()
     * @generated
     */
    EClass COMMA_EXPR = eINSTANCE.getcommaExpr();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMA_EXPR__ELEMENTS = eINSTANCE.getcommaExpr_Elements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDoWhileStatement()
     * @generated
     */
    EClass DO_WHILE_STATEMENT = eINSTANCE.getDoWhileStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl <em>parenthesized Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparenthesizedExpr()
     * @generated
     */
    EClass PARENTHESIZED_EXPR = eINSTANCE.getparenthesizedExpr();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPR__EXPRESSION = eINSTANCE.getparenthesizedExpr_Expression();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl <em>statement In Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatementInSwitch()
     * @generated
     */
    EClass STATEMENT_IN_SWITCH = eINSTANCE.getstatementInSwitch();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ReturnImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__EXPRESSION = eINSTANCE.getReturn_Expression();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__EXPRESSION = eINSTANCE.getVariableDeclaration_Expression();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__THEN_BLOCK = eINSTANCE.getIfStatement_ThenBlock();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getIfStatement_ElseBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl <em>Try Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getTryStatement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__STATEMENTS = eINSTANCE.getTryStatement_Statements();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMS = eINSTANCE.getTryStatement_Params();

    /**
     * The meta object literal for the '<em><b>Finally Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY_BLOCK = eINSTANCE.getTryStatement_FinallyBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IfBlockImpl <em>If Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.IfBlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIfBlock()
     * @generated
     */
    EClass IF_BLOCK = eINSTANCE.getIfBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementsBlockImpl <em>Statements Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.StatementsBlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStatementsBlock()
     * @generated
     */
    EClass STATEMENTS_BLOCK = eINSTANCE.getStatementsBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__REL = eINSTANCE.getParameter_Rel();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__LIT = eINSTANCE.getParameter_Lit();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ParametersImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__ELEMENTS = eINSTANCE.getParameters_Elements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETERS__NAME = eINSTANCE.getParameters_Name();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__REL = eINSTANCE.getParameters_Rel();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeRelationImpl <em>type Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeRelationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeRelation()
     * @generated
     */
    EClass TYPE_RELATION = eINSTANCE.gettypeRelation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_RELATION__TYPE = eINSTANCE.gettypeRelation_Type();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl <em>object Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectLiteral()
     * @generated
     */
    EClass OBJECT_LITERAL = eINSTANCE.getobjectLiteral();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl <em>object Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectFields()
     * @generated
     */
    EClass OBJECT_FIELDS = eINSTANCE.getobjectFields();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_FIELDS__FIELDS = eINSTANCE.getobjectFields_Fields();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl <em>object Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectField()
     * @generated
     */
    EClass OBJECT_FIELD = eINSTANCE.getobjectField();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl <em>expr Or Object Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexprOrObjectLiteral()
     * @generated
     */
    EClass EXPR_OR_OBJECT_LITERAL = eINSTANCE.getexprOrObjectLiteral();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.SymbolImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NewImpl <em>New</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.NewImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNew()
     * @generated
     */
    EClass NEW = eINSTANCE.getNew();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW__TYPE = eINSTANCE.getNew_Type();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW__PARAM = eINSTANCE.getNew_Param();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.WhileImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>While Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__WHILE_BLOCK = eINSTANCE.getWhile_WhileBlock();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__COND = eINSTANCE.getWhile_Cond();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.SwitchImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__COND = eINSTANCE.getSwitch_Cond();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AssignmentImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__LEFT = eINSTANCE.getAssignment_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__RIGHT = eINSTANCE.getAssignment_Right();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MemberSelectionImpl <em>Member Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.MemberSelectionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMemberSelection()
     * @generated
     */
    EClass MEMBER_SELECTION = eINSTANCE.getMemberSelection();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION__RECEIVER = eINSTANCE.getMemberSelection_Receiver();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION__MEMBER = eINSTANCE.getMemberSelection_Member();

    /**
     * The meta object literal for the '<em><b>Methodinvocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER_SELECTION__METHODINVOCATION = eINSTANCE.getMemberSelection_Methodinvocation();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION__ARGS = eINSTANCE.getMemberSelection_Args();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStringConstant()
     * @generated
     */
    EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.IntConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ThisImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getThis()
     * @generated
     */
    EClass THIS = eINSTANCE.getThis();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SuperImpl <em>Super</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.SuperImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSuper()
     * @generated
     */
    EClass SUPER = eINSTANCE.getSuper();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.SymbolRefImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSymbolRef()
     * @generated
     */
    EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__SYMBOL = eINSTANCE.getSymbolRef_Symbol();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel <em>Access Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getAccessLevel()
     * @generated
     */
    EEnum ACCESS_LEVEL = eINSTANCE.getAccessLevel();

  }

} //AS3Package
