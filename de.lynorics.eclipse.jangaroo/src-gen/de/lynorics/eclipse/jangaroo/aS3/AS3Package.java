/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl <em>annotation Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationField()
   * @generated
   */
  int ANNOTATION_FIELD = 3;

  /**
   * The number of structural features of the '<em>annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl <em>expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpr()
   * @generated
   */
  int EXPR = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__NAME = ANNOTATION_FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR = ANNOTATION_FIELD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__DELETEEXPR = ANNOTATION_FIELD_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TYPEEXPR = ANNOTATION_FIELD_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TYPE = ANNOTATION_FIELD_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ISLEFTEPXR = ANNOTATION_FIELD_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ISRIGHTEXPR = ANNOTATION_FIELD_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__PREFIXEXPR = ANNOTATION_FIELD_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__POSTFIXEXPR = ANNOTATION_FIELD_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__INFIXEXPRLEFT = ANNOTATION_FIELD_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__INFIXEXPRRIGHT = ANNOTATION_FIELD_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ARGS = ANNOTATION_FIELD_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__CONDITION = ANNOTATION_FIELD_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__THEN = ANNOTATION_FIELD_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ELSE = ANNOTATION_FIELD_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = ANNOTATION_FIELD_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl <em>anon Function Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getanonFunctionExpr()
   * @generated
   */
  int ANON_FUNCTION_EXPR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__NAME = EXPR__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__EXPR = EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__DELETEEXPR = EXPR__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__TYPEEXPR = EXPR__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__TYPE = EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__ISLEFTEPXR = EXPR__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__ISRIGHTEXPR = EXPR__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__PREFIXEXPR = EXPR__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__POSTFIXEXPR = EXPR__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__INFIXEXPRLEFT = EXPR__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__INFIXEXPRRIGHT = EXPR__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__ARGS = EXPR__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__CONDITION = EXPR__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__THEN = EXPR__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__ELSE = EXPR__ELSE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__PARAMS = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__RELATION = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR__COMMAND = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>anon Function Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl <em>annotation Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationFields()
   * @generated
   */
  int ANNOTATION_FIELDS = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELDS__FIELDS = 0;

  /**
   * The number of structural features of the '<em>annotation Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl <em>array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__NAME = EXPR__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__EXPR = EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__DELETEEXPR = EXPR__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__TYPEEXPR = EXPR__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__TYPE = EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__ISLEFTEPXR = EXPR__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__ISRIGHTEXPR = EXPR__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__PREFIXEXPR = EXPR__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__POSTFIXEXPR = EXPR__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__INFIXEXPRLEFT = EXPR__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__INFIXEXPRRIGHT = EXPR__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__ARGS = EXPR__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__CONDITION = EXPR__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__THEN = EXPR__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__ELSE = EXPR__ELSE;

  /**
   * The number of structural features of the '<em>array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl <em>arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarguments()
   * @generated
   */
  int ARGUMENTS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__NAME = ARRAY_LITERAL__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPR = ARRAY_LITERAL__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__DELETEEXPR = ARRAY_LITERAL__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__TYPEEXPR = ARRAY_LITERAL__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__TYPE = ARRAY_LITERAL__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ISLEFTEPXR = ARRAY_LITERAL__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ISRIGHTEXPR = ARRAY_LITERAL__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__PREFIXEXPR = ARRAY_LITERAL__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__POSTFIXEXPR = ARRAY_LITERAL__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__INFIXEXPRLEFT = ARRAY_LITERAL__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__INFIXEXPRRIGHT = ARRAY_LITERAL__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ARGS = ARRAY_LITERAL__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__CONDITION = ARRAY_LITERAL__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__THEN = ARRAY_LITERAL__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ELSE = ARRAY_LITERAL__ELSE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ELEMENTS = ARRAY_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = ARRAY_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.optBodyImpl <em>opt Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.optBodyImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getoptBody()
   * @generated
   */
  int OPT_BODY = 29;

  /**
   * The number of structural features of the '<em>opt Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.blockImpl <em>block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.blockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getblock()
   * @generated
   */
  int BLOCK = 6;

  /**
   * The number of structural features of the '<em>block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = OPT_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.catchesImpl <em>catches</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.catchesImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcatches()
   * @generated
   */
  int CATCHES = 7;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCHES__PARAMS = 0;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCHES__COMMAND = 1;

  /**
   * The number of structural features of the '<em>catches</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCHES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.classBodyImpl <em>class Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.classBodyImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getclassBody()
   * @generated
   */
  int CLASS_BODY = 8;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>class Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl <em>class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getclassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Class Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__SUPER_TYPE = 2;

  /**
   * The feature id for the '<em><b>Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__TYPES = 3;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__COMMAND = 4;

  /**
   * The number of structural features of the '<em>class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl <em>comma Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.commaExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcommaExpr()
   * @generated
   */
  int COMMA_EXPR = 10;

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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl <em>compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 11;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PACKAGE = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Directive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__DIRECTIVE = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__UNIT = MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = MODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl <em>compilation Unit Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcompilationUnitDeclaration()
   * @generated
   */
  int COMPILATION_UNIT_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_DECLARATION__CLASS = 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_DECLARATION__MEMBER = 1;

  /**
   * The number of structural features of the '<em>compilation Unit Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directivesImpl <em>directives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.directivesImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirectives()
   * @generated
   */
  int DIRECTIVES = 13;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVES__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>directives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl <em>directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirective()
   * @generated
   */
  int DIRECTIVE = 14;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__IMPORTED_NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__ID = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__FIELDS = 2;

  /**
   * The feature id for the '<em><b>Useasid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__USEASID = 3;

  /**
   * The number of structural features of the '<em>directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl <em>object Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectField()
   * @generated
   */
  int OBJECT_FIELD = 26;

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
  int EXPR_OR_OBJECT_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_OBJECT_LITERAL__NAME = OBJECT_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>expr Or Object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT = OBJECT_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl <em>field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__MOD = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__VAR = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl <em>identifier Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidentifierDeclaration()
   * @generated
   */
  int IDENTIFIER_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl <em>labelable Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlabelableStatement()
   * @generated
   */
  int LABELABLE_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__IFCONDITION = 0;

  /**
   * The feature id for the '<em><b>Ifthen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__IFTHEN = 1;

  /**
   * The feature id for the '<em><b>Ifelse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__IFELSE = 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__CONDITION = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__ELEMENTS = 4;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__COMMAND = 5;

  /**
   * The feature id for the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FORINIT = 6;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__ITERATOR = 7;

  /**
   * The feature id for the '<em><b>Name Forin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__NAME_FORIN = 8;

  /**
   * The feature id for the '<em><b>Forinexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FORINEXPR = 9;

  /**
   * The feature id for the '<em><b>Forcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FORCOMMAND = 10;

  /**
   * The feature id for the '<em><b>Name Foreachh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__NAME_FOREACHH = 11;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__RELATION = 12;

  /**
   * The feature id for the '<em><b>Foreachexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FOREACHEXPR = 13;

  /**
   * The feature id for the '<em><b>Foreachcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FOREACHCOMMAND = 14;

  /**
   * The feature id for the '<em><b>Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__CATCH = 15;

  /**
   * The feature id for the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FINALLY = 16;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT__FUNCTION = 17;

  /**
   * The number of structural features of the '<em>labelable Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELABLE_STATEMENT_FEATURE_COUNT = 18;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.lvalueImpl <em>lvalue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.lvalueImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlvalue()
   * @generated
   */
  int LVALUE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__NAME = EXPR__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__EXPR = EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__DELETEEXPR = EXPR__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__TYPEEXPR = EXPR__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__TYPE = EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__ISLEFTEPXR = EXPR__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__ISRIGHTEXPR = EXPR__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__PREFIXEXPR = EXPR__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__POSTFIXEXPR = EXPR__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__INFIXEXPRLEFT = EXPR__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__INFIXEXPRRIGHT = EXPR__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__ARGS = EXPR__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__CONDITION = EXPR__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__THEN = EXPR__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__ELSE = EXPR__ELSE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__EXPRESSION = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__IDENTIFIER = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE__LIST = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>lvalue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVALUE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.memberDeclarationImpl <em>member Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.memberDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmemberDeclaration()
   * @generated
   */
  int MEMBER_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_DECLARATION__FIELD = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_DECLARATION__METHOD = 1;

  /**
   * The number of structural features of the '<em>member Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl <em>method Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmethodDeclaration()
   * @generated
   */
  int METHOD_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Methodmodifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__METHODMODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Optbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__OPTBODY = 3;

  /**
   * The number of structural features of the '<em>method Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namespacedIdentifierImpl <em>namespaced Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.namespacedIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamespacedIdentifier()
   * @generated
   */
  int NAMESPACED_IDENTIFIER = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__NAME = LVALUE__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__EXPR = LVALUE__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__DELETEEXPR = LVALUE__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__TYPEEXPR = LVALUE__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__TYPE = LVALUE__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__ISLEFTEPXR = LVALUE__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__ISRIGHTEXPR = LVALUE__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__PREFIXEXPR = LVALUE__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__POSTFIXEXPR = LVALUE__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__INFIXEXPRLEFT = LVALUE__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__INFIXEXPRRIGHT = LVALUE__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__ARGS = LVALUE__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__CONDITION = LVALUE__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__THEN = LVALUE__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__ELSE = LVALUE__ELSE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__EXPRESSION = LVALUE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__IDENTIFIER = LVALUE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER__LIST = LVALUE__LIST;

  /**
   * The number of structural features of the '<em>namespaced Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACED_IDENTIFIER_FEATURE_COUNT = LVALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.modifiersImpl <em>modifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.modifiersImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmodifiers()
   * @generated
   */
  int MODIFIERS = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__NAME = NAMESPACED_IDENTIFIER__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__EXPR = NAMESPACED_IDENTIFIER__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__DELETEEXPR = NAMESPACED_IDENTIFIER__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__TYPEEXPR = NAMESPACED_IDENTIFIER__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__TYPE = NAMESPACED_IDENTIFIER__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__ISLEFTEPXR = NAMESPACED_IDENTIFIER__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__ISRIGHTEXPR = NAMESPACED_IDENTIFIER__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__PREFIXEXPR = NAMESPACED_IDENTIFIER__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__POSTFIXEXPR = NAMESPACED_IDENTIFIER__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__INFIXEXPRLEFT = NAMESPACED_IDENTIFIER__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__INFIXEXPRRIGHT = NAMESPACED_IDENTIFIER__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__ARGS = NAMESPACED_IDENTIFIER__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__CONDITION = NAMESPACED_IDENTIFIER__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__THEN = NAMESPACED_IDENTIFIER__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__ELSE = NAMESPACED_IDENTIFIER__ELSE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__EXPRESSION = NAMESPACED_IDENTIFIER__EXPRESSION;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__IDENTIFIER = NAMESPACED_IDENTIFIER__IDENTIFIER;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__LIST = NAMESPACED_IDENTIFIER__LIST;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__STATIC = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__FINAL = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__ABSTRACT = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__OVERRIDE = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__INTERNAL = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__PUBLIC = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__PRIVATE = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__PROTECTED = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>modifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS_FEATURE_COUNT = NAMESPACED_IDENTIFIER_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namedFunctionExprImpl <em>named Function Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.namedFunctionExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamedFunctionExpr()
   * @generated
   */
  int NAMED_FUNCTION_EXPR = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_EXPR__NAME = EXPR_OR_OBJECT_LITERAL__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_EXPR__PARAMS = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_EXPR__RELATION = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_EXPR__COMMAND = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>named Function Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FUNCTION_EXPR_FEATURE_COUNT = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl <em>object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectLiteral()
   * @generated
   */
  int OBJECT_LITERAL = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL__NAME = EXPR_OR_OBJECT_LITERAL__NAME;

  /**
   * The number of structural features of the '<em>object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL_FEATURE_COUNT = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl <em>object Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectFieldsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectFields()
   * @generated
   */
  int OBJECT_FIELDS = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FIELDS__NAME = OBJECT_LITERAL__NAME;

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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.packageDeclarationImpl <em>package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.packageDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterImpl <em>parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameter()
   * @generated
   */
  int PARAMETER = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parametersImpl <em>parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parametersImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameters()
   * @generated
   */
  int PARAMETERS = 32;

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
   * The number of structural features of the '<em>parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl <em>parenthesized Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parenthesizedExprImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparenthesizedExpr()
   * @generated
   */
  int PARENTHESIZED_EXPR = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__NAME = EXPR__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPR = EXPR__EXPR;

  /**
   * The feature id for the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__DELETEEXPR = EXPR__DELETEEXPR;

  /**
   * The feature id for the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__TYPEEXPR = EXPR__TYPEEXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__TYPE = EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__ISLEFTEPXR = EXPR__ISLEFTEPXR;

  /**
   * The feature id for the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__ISRIGHTEXPR = EXPR__ISRIGHTEXPR;

  /**
   * The feature id for the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__PREFIXEXPR = EXPR__PREFIXEXPR;

  /**
   * The feature id for the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__POSTFIXEXPR = EXPR__POSTFIXEXPR;

  /**
   * The feature id for the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__INFIXEXPRLEFT = EXPR__INFIXEXPRLEFT;

  /**
   * The feature id for the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__INFIXEXPRRIGHT = EXPR__INFIXEXPRRIGHT;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__ARGS = EXPR__ARGS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__CONDITION = EXPR__CONDITION;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__THEN = EXPR__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__ELSE = EXPR__ELSE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPRESSION = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>parenthesized Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IFCONDITION = LABELABLE_STATEMENT__IFCONDITION;

  /**
   * The feature id for the '<em><b>Ifthen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IFTHEN = LABELABLE_STATEMENT__IFTHEN;

  /**
   * The feature id for the '<em><b>Ifelse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IFELSE = LABELABLE_STATEMENT__IFELSE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CONDITION = LABELABLE_STATEMENT__CONDITION;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ELEMENTS = LABELABLE_STATEMENT__ELEMENTS;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__COMMAND = LABELABLE_STATEMENT__COMMAND;

  /**
   * The feature id for the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FORINIT = LABELABLE_STATEMENT__FORINIT;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ITERATOR = LABELABLE_STATEMENT__ITERATOR;

  /**
   * The feature id for the '<em><b>Name Forin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME_FORIN = LABELABLE_STATEMENT__NAME_FORIN;

  /**
   * The feature id for the '<em><b>Forinexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FORINEXPR = LABELABLE_STATEMENT__FORINEXPR;

  /**
   * The feature id for the '<em><b>Forcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FORCOMMAND = LABELABLE_STATEMENT__FORCOMMAND;

  /**
   * The feature id for the '<em><b>Name Foreachh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME_FOREACHH = LABELABLE_STATEMENT__NAME_FOREACHH;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RELATION = LABELABLE_STATEMENT__RELATION;

  /**
   * The feature id for the '<em><b>Foreachexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOREACHEXPR = LABELABLE_STATEMENT__FOREACHEXPR;

  /**
   * The feature id for the '<em><b>Foreachcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOREACHCOMMAND = LABELABLE_STATEMENT__FOREACHCOMMAND;

  /**
   * The feature id for the '<em><b>Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CATCH = LABELABLE_STATEMENT__CATCH;

  /**
   * The feature id for the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FINALLY = LABELABLE_STATEMENT__FINALLY;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FUNCTION = LABELABLE_STATEMENT__FUNCTION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPR = LABELABLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = LABELABLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = LABELABLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLES = LABELABLE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ARGUMENT = LABELABLE_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = LABELABLE_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementsImpl <em>statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatements()
   * @generated
   */
  int STATEMENTS = 35;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS__ELEMENTS = BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl <em>statement In Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementInSwitchImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatementInSwitch()
   * @generated
   */
  int STATEMENT_IN_SWITCH = 36;

  /**
   * The number of structural features of the '<em>statement In Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_IN_SWITCH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.staticInitializerImpl <em>static Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.staticInitializerImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstaticInitializer()
   * @generated
   */
  int STATIC_INITIALIZER = 37;

  /**
   * The number of structural features of the '<em>static Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeListImpl <em>type List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeList()
   * @generated
   */
  int TYPE_LIST = 38;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LIST__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>type List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclarationImpl <em>variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 39;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;


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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr <em>anon Function Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>anon Function Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr
   * @generated
   */
  EClass getanonFunctionExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getParams()
   * @see #getanonFunctionExpr()
   * @generated
   */
  EReference getanonFunctionExpr_Params();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getRelation()
   * @see #getanonFunctionExpr()
   * @generated
   */
  EAttribute getanonFunctionExpr_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr#getCommand()
   * @see #getanonFunctionExpr()
   * @generated
   */
  EReference getanonFunctionExpr_Command();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields <em>annotation Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>annotation Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationFields
   * @generated
   */
  EClass getannotationFields();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationFields#getFields()
   * @see #getannotationFields()
   * @generated
   */
  EReference getannotationFields_Fields();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.annotationField <em>annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>annotation Field</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationField
   * @generated
   */
  EClass getannotationField();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.arguments <em>arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arguments</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.arguments
   * @generated
   */
  EClass getarguments();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.arguments#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.arguments#getElements()
   * @see #getarguments()
   * @generated
   */
  EReference getarguments_Elements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.arrayLiteral <em>array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>array Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.arrayLiteral
   * @generated
   */
  EClass getarrayLiteral();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.block
   * @generated
   */
  EClass getblock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.catches <em>catches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>catches</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.catches
   * @generated
   */
  EClass getcatches();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.catches#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.catches#getParams()
   * @see #getcatches()
   * @generated
   */
  EReference getcatches_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.catches#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.catches#getCommand()
   * @see #getcatches()
   * @generated
   */
  EReference getcatches_Command();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.classBody <em>class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Body</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classBody
   * @generated
   */
  EClass getclassBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.classBody#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classBody#getElements()
   * @see #getclassBody()
   * @generated
   */
  EReference getclassBody_Elements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration <em>class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration
   * @generated
   */
  EClass getclassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getClassModifiers <em>Class Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Modifiers</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getClassModifiers()
   * @see #getclassDeclaration()
   * @generated
   */
  EReference getclassDeclaration_ClassModifiers();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getName()
   * @see #getclassDeclaration()
   * @generated
   */
  EAttribute getclassDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getSuperType()
   * @see #getclassDeclaration()
   * @generated
   */
  EReference getclassDeclaration_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Types</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getTypes()
   * @see #getclassDeclaration()
   * @generated
   */
  EAttribute getclassDeclaration_Types();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getCommand()
   * @see #getclassDeclaration()
   * @generated
   */
  EReference getclassDeclaration_Command();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit <em>compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compilation Unit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnit
   * @generated
   */
  EClass getcompilationUnit();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getPackage()
   * @see #getcompilationUnit()
   * @generated
   */
  EReference getcompilationUnit_Package();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getDirective <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Directive</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getDirective()
   * @see #getcompilationUnit()
   * @generated
   */
  EReference getcompilationUnit_Directive();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnit#getUnit()
   * @see #getcompilationUnit()
   * @generated
   */
  EReference getcompilationUnit_Unit();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration <em>compilation Unit Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compilation Unit Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration
   * @generated
   */
  EClass getcompilationUnitDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getClass_()
   * @see #getcompilationUnitDeclaration()
   * @generated
   */
  EReference getcompilationUnitDeclaration_Class();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getMember()
   * @see #getcompilationUnitDeclaration()
   * @generated
   */
  EReference getcompilationUnitDeclaration_Member();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.directives <em>directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>directives</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directives
   * @generated
   */
  EClass getdirectives();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.directives#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directives#getElements()
   * @see #getdirectives()
   * @generated
   */
  EReference getdirectives_Elements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.directive <em>directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>directive</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive
   * @generated
   */
  EClass getdirective();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getImportedNamespace()
   * @see #getdirective()
   * @generated
   */
  EAttribute getdirective_ImportedNamespace();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getId()
   * @see #getdirective()
   * @generated
   */
  EAttribute getdirective_Id();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getFields()
   * @see #getdirective()
   * @generated
   */
  EReference getdirective_Fields();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUseasid <em>Useasid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Useasid</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getUseasid()
   * @see #getdirective()
   * @generated
   */
  EAttribute getdirective_Useasid();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr
   * @generated
   */
  EClass getexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getExpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getDeleteexpr <em>Deleteexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deleteexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getDeleteexpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Deleteexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getTypeexpr <em>Typeexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typeexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getTypeexpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Typeexpr();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getType()
   * @see #getexpr()
   * @generated
   */
  EAttribute getexpr_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsleftepxr <em>Isleftepxr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Isleftepxr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getIsleftepxr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Isleftepxr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsrightexpr <em>Isrightexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Isrightexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getIsrightexpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Isrightexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPrefixexpr <em>Prefixexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefixexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getPrefixexpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Prefixexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPostfixexpr <em>Postfixexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postfixexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getPostfixexpr()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Postfixexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprleft <em>Infixexprleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infixexprleft</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprleft()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Infixexprleft();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprright <em>Infixexprright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infixexprright</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprright()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Infixexprright();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getArgs()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getCondition()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Condition();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getThen()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr#getElse()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Else();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration <em>field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration
   * @generated
   */
  EClass getfieldDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getMod()
   * @see #getfieldDeclaration()
   * @generated
   */
  EReference getfieldDeclaration_Mod();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getVar()
   * @see #getfieldDeclaration()
   * @generated
   */
  EAttribute getfieldDeclaration_Var();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getElements()
   * @see #getfieldDeclaration()
   * @generated
   */
  EReference getfieldDeclaration_Elements();

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
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration#getRelation()
   * @see #getidentifierDeclaration()
   * @generated
   */
  EAttribute getidentifierDeclaration_Relation();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement <em>labelable Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>labelable Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement
   * @generated
   */
  EClass getlabelableStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfcondition <em>Ifcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifcondition</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfcondition()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Ifcondition();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfthen <em>Ifthen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifthen</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfthen()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Ifthen();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfelse <em>Ifelse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifelse</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfelse()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Ifelse();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCondition()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getElements()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Elements();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCommand()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Command();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinit <em>Forinit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinit()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Forinit();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIterator()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Iterator();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForin <em>Name Forin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Forin</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForin()
   * @see #getlabelableStatement()
   * @generated
   */
  EAttribute getlabelableStatement_NameForin();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinexpr <em>Forinexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinexpr()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Forinexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForcommand <em>Forcommand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forcommand</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForcommand()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Forcommand();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForeachh <em>Name Foreachh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Foreachh</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForeachh()
   * @see #getlabelableStatement()
   * @generated
   */
  EAttribute getlabelableStatement_NameForeachh();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getRelation()
   * @see #getlabelableStatement()
   * @generated
   */
  EAttribute getlabelableStatement_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachexpr <em>Foreachexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreachexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachexpr()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Foreachexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachcommand <em>Foreachcommand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreachcommand</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachcommand()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Foreachcommand();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCatch <em>Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Catch</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCatch()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Catch();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFinally <em>Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFinally()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Finally();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFunction()
   * @see #getlabelableStatement()
   * @generated
   */
  EReference getlabelableStatement_Function();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue <em>lvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lvalue</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.lvalue
   * @generated
   */
  EClass getlvalue();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.lvalue#getExpression()
   * @see #getlvalue()
   * @generated
   */
  EReference getlvalue_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.lvalue#getIdentifier()
   * @see #getlvalue()
   * @generated
   */
  EReference getlvalue_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.lvalue#getList()
   * @see #getlvalue()
   * @generated
   */
  EReference getlvalue_List();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration <em>member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>member Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.memberDeclaration
   * @generated
   */
  EClass getmemberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getField()
   * @see #getmemberDeclaration()
   * @generated
   */
  EReference getmemberDeclaration_Field();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getMethod()
   * @see #getmemberDeclaration()
   * @generated
   */
  EReference getmemberDeclaration_Method();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration <em>method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>method Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration
   * @generated
   */
  EClass getmethodDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getMethodmodifiers <em>Methodmodifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Methodmodifiers</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getMethodmodifiers()
   * @see #getmethodDeclaration()
   * @generated
   */
  EReference getmethodDeclaration_Methodmodifiers();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getName()
   * @see #getmethodDeclaration()
   * @generated
   */
  EAttribute getmethodDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getParams()
   * @see #getmethodDeclaration()
   * @generated
   */
  EReference getmethodDeclaration_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getOptbody <em>Optbody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optbody</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getOptbody()
   * @see #getmethodDeclaration()
   * @generated
   */
  EReference getmethodDeclaration_Optbody();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers <em>modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>modifiers</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers
   * @generated
   */
  EClass getmodifiers();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isStatic()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Static();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isFinal()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Final();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isAbstract()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Abstract();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isOverride()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Override();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isInternal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Internal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isInternal()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Internal();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isPublic <em>Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isPublic()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Public();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isPrivate()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Private();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers#isProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers#isProtected()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Protected();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr <em>named Function Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>named Function Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr
   * @generated
   */
  EClass getnamedFunctionExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getParams()
   * @see #getnamedFunctionExpr()
   * @generated
   */
  EReference getnamedFunctionExpr_Params();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getRelation()
   * @see #getnamedFunctionExpr()
   * @generated
   */
  EAttribute getnamedFunctionExpr_Relation();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getCommand()
   * @see #getnamedFunctionExpr()
   * @generated
   */
  EReference getnamedFunctionExpr_Command();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier <em>namespaced Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>namespaced Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier
   * @generated
   */
  EClass getnamespacedIdentifier();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.objectLiteral <em>object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>object Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectLiteral
   * @generated
   */
  EClass getobjectLiteral();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.optBody <em>opt Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>opt Body</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.optBody
   * @generated
   */
  EClass getoptBody();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.packageDeclaration <em>package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>package Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.packageDeclaration
   * @generated
   */
  EClass getpackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.packageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.packageDeclaration#getName()
   * @see #getpackageDeclaration()
   * @generated
   */
  EAttribute getpackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameter <em>parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameter
   * @generated
   */
  EClass getparameter();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameter#getName()
   * @see #getparameter()
   * @generated
   */
  EAttribute getparameter_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameters <em>parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameters</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameters
   * @generated
   */
  EClass getparameters();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.parameters#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameters#getElements()
   * @see #getparameters()
   * @generated
   */
  EReference getparameters_Elements();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.parameters#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameters#getName()
   * @see #getparameters()
   * @generated
   */
  EAttribute getparameters_Name();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement#getExpr()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Expr();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement#getName()
   * @see #getstatement()
   * @generated
   */
  EAttribute getstatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement#getStatement()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement#getVariables()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Variables();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement#getArgument()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Argument();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.statements <em>statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statements
   * @generated
   */
  EClass getstatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.statements#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.statements#getElements()
   * @see #getstatements()
   * @generated
   */
  EReference getstatements_Elements();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.staticInitializer <em>static Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>static Initializer</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.staticInitializer
   * @generated
   */
  EClass getstaticInitializer();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.typeList <em>type List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeList
   * @generated
   */
  EClass gettypeList();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.typeList#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeList#getElements()
   * @see #gettypeList()
   * @generated
   */
  EAttribute gettypeList_Elements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclaration <em>variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclaration
   * @generated
   */
  EClass getvariableDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclaration#getElements()
   * @see #getvariableDeclaration()
   * @generated
   */
  EReference getvariableDeclaration_Elements();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl <em>anon Function Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getanonFunctionExpr()
     * @generated
     */
    EClass ANON_FUNCTION_EXPR = eINSTANCE.getanonFunctionExpr();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_FUNCTION_EXPR__PARAMS = eINSTANCE.getanonFunctionExpr_Params();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANON_FUNCTION_EXPR__RELATION = eINSTANCE.getanonFunctionExpr_Relation();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_FUNCTION_EXPR__COMMAND = eINSTANCE.getanonFunctionExpr_Command();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl <em>annotation Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationFields()
     * @generated
     */
    EClass ANNOTATION_FIELDS = eINSTANCE.getannotationFields();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_FIELDS__FIELDS = eINSTANCE.getannotationFields_Fields();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl <em>annotation Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationField()
     * @generated
     */
    EClass ANNOTATION_FIELD = eINSTANCE.getannotationField();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl <em>arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getarguments();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__ELEMENTS = eINSTANCE.getarguments_Elements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl <em>array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getarrayLiteral();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.blockImpl <em>block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.blockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getblock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getblock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.catchesImpl <em>catches</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.catchesImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcatches()
     * @generated
     */
    EClass CATCHES = eINSTANCE.getcatches();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCHES__PARAMS = eINSTANCE.getcatches_Params();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCHES__COMMAND = eINSTANCE.getcatches_Command();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.classBodyImpl <em>class Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.classBodyImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getclassBody()
     * @generated
     */
    EClass CLASS_BODY = eINSTANCE.getclassBody();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_BODY__ELEMENTS = eINSTANCE.getclassBody_Elements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl <em>class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getclassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getclassDeclaration();

    /**
     * The meta object literal for the '<em><b>Class Modifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS_MODIFIERS = eINSTANCE.getclassDeclaration_ClassModifiers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__NAME = eINSTANCE.getclassDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__SUPER_TYPE = eINSTANCE.getclassDeclaration_SuperType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__TYPES = eINSTANCE.getclassDeclaration_Types();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__COMMAND = eINSTANCE.getclassDeclaration_Command();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl <em>compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getcompilationUnit();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__PACKAGE = eINSTANCE.getcompilationUnit_Package();

    /**
     * The meta object literal for the '<em><b>Directive</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__DIRECTIVE = eINSTANCE.getcompilationUnit_Directive();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__UNIT = eINSTANCE.getcompilationUnit_Unit();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl <em>compilation Unit Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcompilationUnitDeclaration()
     * @generated
     */
    EClass COMPILATION_UNIT_DECLARATION = eINSTANCE.getcompilationUnitDeclaration();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT_DECLARATION__CLASS = eINSTANCE.getcompilationUnitDeclaration_Class();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT_DECLARATION__MEMBER = eINSTANCE.getcompilationUnitDeclaration_Member();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directivesImpl <em>directives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.directivesImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirectives()
     * @generated
     */
    EClass DIRECTIVES = eINSTANCE.getdirectives();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTIVES__ELEMENTS = eINSTANCE.getdirectives_Elements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl <em>directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirective()
     * @generated
     */
    EClass DIRECTIVE = eINSTANCE.getdirective();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__IMPORTED_NAMESPACE = eINSTANCE.getdirective_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__ID = eINSTANCE.getdirective_Id();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTIVE__FIELDS = eINSTANCE.getdirective_Fields();

    /**
     * The meta object literal for the '<em><b>Useasid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__USEASID = eINSTANCE.getdirective_Useasid();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl <em>expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getexpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR = eINSTANCE.getexpr_Expr();

    /**
     * The meta object literal for the '<em><b>Deleteexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__DELETEEXPR = eINSTANCE.getexpr_Deleteexpr();

    /**
     * The meta object literal for the '<em><b>Typeexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__TYPEEXPR = eINSTANCE.getexpr_Typeexpr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__TYPE = eINSTANCE.getexpr_Type();

    /**
     * The meta object literal for the '<em><b>Isleftepxr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__ISLEFTEPXR = eINSTANCE.getexpr_Isleftepxr();

    /**
     * The meta object literal for the '<em><b>Isrightexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__ISRIGHTEXPR = eINSTANCE.getexpr_Isrightexpr();

    /**
     * The meta object literal for the '<em><b>Prefixexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__PREFIXEXPR = eINSTANCE.getexpr_Prefixexpr();

    /**
     * The meta object literal for the '<em><b>Postfixexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__POSTFIXEXPR = eINSTANCE.getexpr_Postfixexpr();

    /**
     * The meta object literal for the '<em><b>Infixexprleft</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__INFIXEXPRLEFT = eINSTANCE.getexpr_Infixexprleft();

    /**
     * The meta object literal for the '<em><b>Infixexprright</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__INFIXEXPRRIGHT = eINSTANCE.getexpr_Infixexprright();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__ARGS = eINSTANCE.getexpr_Args();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__CONDITION = eINSTANCE.getexpr_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__THEN = eINSTANCE.getexpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__ELSE = eINSTANCE.getexpr_Else();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl <em>field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getfieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__MOD = eINSTANCE.getfieldDeclaration_Mod();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECLARATION__VAR = eINSTANCE.getfieldDeclaration_Var();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__ELEMENTS = eINSTANCE.getfieldDeclaration_Elements();

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
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_DECLARATION__RELATION = eINSTANCE.getidentifierDeclaration_Relation();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_DECLARATION__EXPR = eINSTANCE.getidentifierDeclaration_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl <em>labelable Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlabelableStatement()
     * @generated
     */
    EClass LABELABLE_STATEMENT = eINSTANCE.getlabelableStatement();

    /**
     * The meta object literal for the '<em><b>Ifcondition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__IFCONDITION = eINSTANCE.getlabelableStatement_Ifcondition();

    /**
     * The meta object literal for the '<em><b>Ifthen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__IFTHEN = eINSTANCE.getlabelableStatement_Ifthen();

    /**
     * The meta object literal for the '<em><b>Ifelse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__IFELSE = eINSTANCE.getlabelableStatement_Ifelse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__CONDITION = eINSTANCE.getlabelableStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__ELEMENTS = eINSTANCE.getlabelableStatement_Elements();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__COMMAND = eINSTANCE.getlabelableStatement_Command();

    /**
     * The meta object literal for the '<em><b>Forinit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FORINIT = eINSTANCE.getlabelableStatement_Forinit();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__ITERATOR = eINSTANCE.getlabelableStatement_Iterator();

    /**
     * The meta object literal for the '<em><b>Name Forin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABELABLE_STATEMENT__NAME_FORIN = eINSTANCE.getlabelableStatement_NameForin();

    /**
     * The meta object literal for the '<em><b>Forinexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FORINEXPR = eINSTANCE.getlabelableStatement_Forinexpr();

    /**
     * The meta object literal for the '<em><b>Forcommand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FORCOMMAND = eINSTANCE.getlabelableStatement_Forcommand();

    /**
     * The meta object literal for the '<em><b>Name Foreachh</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABELABLE_STATEMENT__NAME_FOREACHH = eINSTANCE.getlabelableStatement_NameForeachh();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABELABLE_STATEMENT__RELATION = eINSTANCE.getlabelableStatement_Relation();

    /**
     * The meta object literal for the '<em><b>Foreachexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FOREACHEXPR = eINSTANCE.getlabelableStatement_Foreachexpr();

    /**
     * The meta object literal for the '<em><b>Foreachcommand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FOREACHCOMMAND = eINSTANCE.getlabelableStatement_Foreachcommand();

    /**
     * The meta object literal for the '<em><b>Catch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__CATCH = eINSTANCE.getlabelableStatement_Catch();

    /**
     * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FINALLY = eINSTANCE.getlabelableStatement_Finally();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELABLE_STATEMENT__FUNCTION = eINSTANCE.getlabelableStatement_Function();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.lvalueImpl <em>lvalue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.lvalueImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlvalue()
     * @generated
     */
    EClass LVALUE = eINSTANCE.getlvalue();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LVALUE__EXPRESSION = eINSTANCE.getlvalue_Expression();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LVALUE__IDENTIFIER = eINSTANCE.getlvalue_Identifier();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LVALUE__LIST = eINSTANCE.getlvalue_List();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.memberDeclarationImpl <em>member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.memberDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmemberDeclaration()
     * @generated
     */
    EClass MEMBER_DECLARATION = eINSTANCE.getmemberDeclaration();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_DECLARATION__FIELD = eINSTANCE.getmemberDeclaration_Field();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_DECLARATION__METHOD = eINSTANCE.getmemberDeclaration_Method();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl <em>method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmethodDeclaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getmethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Methodmodifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__METHODMODIFIERS = eINSTANCE.getmethodDeclaration_Methodmodifiers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__NAME = eINSTANCE.getmethodDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMS = eINSTANCE.getmethodDeclaration_Params();

    /**
     * The meta object literal for the '<em><b>Optbody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__OPTBODY = eINSTANCE.getmethodDeclaration_Optbody();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.modifiersImpl <em>modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.modifiersImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmodifiers()
     * @generated
     */
    EClass MODIFIERS = eINSTANCE.getmodifiers();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__STATIC = eINSTANCE.getmodifiers_Static();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__FINAL = eINSTANCE.getmodifiers_Final();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__ABSTRACT = eINSTANCE.getmodifiers_Abstract();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__OVERRIDE = eINSTANCE.getmodifiers_Override();

    /**
     * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__INTERNAL = eINSTANCE.getmodifiers_Internal();

    /**
     * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__PUBLIC = eINSTANCE.getmodifiers_Public();

    /**
     * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__PRIVATE = eINSTANCE.getmodifiers_Private();

    /**
     * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__PROTECTED = eINSTANCE.getmodifiers_Protected();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namedFunctionExprImpl <em>named Function Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.namedFunctionExprImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamedFunctionExpr()
     * @generated
     */
    EClass NAMED_FUNCTION_EXPR = eINSTANCE.getnamedFunctionExpr();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_FUNCTION_EXPR__PARAMS = eINSTANCE.getnamedFunctionExpr_Params();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_FUNCTION_EXPR__RELATION = eINSTANCE.getnamedFunctionExpr_Relation();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_FUNCTION_EXPR__COMMAND = eINSTANCE.getnamedFunctionExpr_Command();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namespacedIdentifierImpl <em>namespaced Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.namespacedIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamespacedIdentifier()
     * @generated
     */
    EClass NAMESPACED_IDENTIFIER = eINSTANCE.getnamespacedIdentifier();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl <em>object Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectLiteral()
     * @generated
     */
    EClass OBJECT_LITERAL = eINSTANCE.getobjectLiteral();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.optBodyImpl <em>opt Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.optBodyImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getoptBody()
     * @generated
     */
    EClass OPT_BODY = eINSTANCE.getoptBody();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.packageDeclarationImpl <em>package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.packageDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getpackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getpackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterImpl <em>parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getparameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getparameter_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parametersImpl <em>parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parametersImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getparameters();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__ELEMENTS = eINSTANCE.getparameters_Elements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETERS__NAME = eINSTANCE.getparameters_Name();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPR = eINSTANCE.getstatement_Expr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getstatement_Name();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT = eINSTANCE.getstatement_Statement();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VARIABLES = eINSTANCE.getstatement_Variables();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ARGUMENT = eINSTANCE.getstatement_Argument();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.statementsImpl <em>statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.statementsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstatements()
     * @generated
     */
    EClass STATEMENTS = eINSTANCE.getstatements();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENTS__ELEMENTS = eINSTANCE.getstatements_Elements();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.staticInitializerImpl <em>static Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.staticInitializerImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getstaticInitializer()
     * @generated
     */
    EClass STATIC_INITIALIZER = eINSTANCE.getstaticInitializer();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeListImpl <em>type List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeList()
     * @generated
     */
    EClass TYPE_LIST = eINSTANCE.gettypeList();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_LIST__ELEMENTS = eINSTANCE.gettypeList_Elements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclarationImpl <em>variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getvariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__ELEMENTS = eINSTANCE.getvariableDeclaration_Elements();

  }

} //AS3Package
