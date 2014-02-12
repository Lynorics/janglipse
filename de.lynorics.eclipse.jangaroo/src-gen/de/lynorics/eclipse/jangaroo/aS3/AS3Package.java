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
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMP = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MEMBERS = 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASSES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__IMP = 1;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__DIRECTIVES = 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__MEMBERS = 3;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__CLASSES = 4;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ImportsImpl <em>Imports</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ImportsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getImports()
   * @generated
   */
  int IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTS = 0;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ImportImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl <em>directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirective()
   * @generated
   */
  int DIRECTIVE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Annon Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__ANNON_FIELDS = 1;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__USES = 2;

  /**
   * The number of structural features of the '<em>directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.UsesImpl <em>Uses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.UsesImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getUses()
   * @generated
   */
  int USES = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES__TYPE = 0;

  /**
   * The number of structural features of the '<em>Uses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl <em>annotation Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationFields()
   * @generated
   */
  int ANNOTATION_FIELDS = 6;

  /**
   * The feature id for the '<em><b>Anoon Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELDS__ANOON_FIELDS = 0;

  /**
   * The feature id for the '<em><b>Annon Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELDS__ANNON_FIELDS = 1;

  /**
   * The number of structural features of the '<em>annotation Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl <em>annotation Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getannotationField()
   * @generated
   */
  int ANNOTATION_FIELD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__EXPR = 1;

  /**
   * The number of structural features of the '<em>annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 8;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 1;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__SUPERCLASS = 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = 3;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getInterfaceMethod()
   * @generated
   */
  int INTERFACE_METHOD = 9;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__ACCESSOR = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__PARAMS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__TYPE = 4;

  /**
   * The number of structural features of the '<em>Interface Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getClass_()
   * @generated
   */
  int CLASS = 10;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_TYPE = 2;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPES = 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = 4;

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
  int MEMBER = 11;

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
  int METHOD = 12;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ACCESSOR = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = 5;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ModifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 13;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__FINAL = 1;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__NATIVE = 2;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__DYNAMIC = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__ACCESS = 4;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl <em>Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.MethodBodyImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getMethodBody()
   * @generated
   */
  int METHOD_BODY = 14;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_BODY__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VarTypeImpl <em>Var Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.VarTypeImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVarType()
   * @generated
   */
  int VAR_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_TYPE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Var Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ParameterImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__LIT = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl <em>expr Or Object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.exprOrObjectLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexprOrObjectLiteral()
   * @generated
   */
  int EXPR_OR_OBJECT_LITERAL = 23;

  /**
   * The number of structural features of the '<em>expr Or Object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl <em>object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.objectLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getobjectLiteral()
   * @generated
   */
  int OBJECT_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL__FIELDS = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL_FEATURE_COUNT = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldListImpl <em>field List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldList()
   * @generated
   */
  int FIELD_LIST = 19;

  /**
   * The feature id for the '<em><b>Lf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__LF = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST__FIELDS = 1;

  /**
   * The number of structural features of the '<em>field List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.literalFieldImpl <em>literal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.literalFieldImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getliteralField()
   * @generated
   */
  int LITERAL_FIELD = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FIELD__EL = 1;

  /**
   * The number of structural features of the '<em>literal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldNameImpl <em>field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldNameImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldName()
   * @generated
   */
  int FIELD_NAME = 21;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__NUMBER = 0;

  /**
   * The number of structural features of the '<em>field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.elementImpl <em>element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.elementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getelement()
   * @generated
   */
  int ELEMENT = 22;

  /**
   * The number of structural features of the '<em>element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentImpl <em>qualified Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifiedIdent()
   * @generated
   */
  int QUALIFIED_IDENT = 24;

  /**
   * The feature id for the '<em><b>Ide</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENT__IDE = 0;

  /**
   * The number of structural features of the '<em>qualified Ident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl <em>identi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidenti()
   * @generated
   */
  int IDENTI = 25;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__NUMBER = FIELD_NAME__NUMBER;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__LEVEL = FIELD_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__ASSERT = FIELD_NAME_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__TAIL = FIELD_NAME_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__I = FIELD_NAME_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__TYPE = FIELD_NAME_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__VAR = FIELD_NAME_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI__BLOCK = FIELD_NAME_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>identi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTI_FEATURE_COUNT = FIELD_NAME_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl <em>identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidentifier()
   * @generated
   */
  int IDENTIFIER = 26;

  /**
   * The feature id for the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__QUAL = 0;

  /**
   * The feature id for the '<em><b>Poi</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__POI = 1;

  /**
   * The number of structural features of the '<em>identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifierImpl <em>qualifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifier()
   * @generated
   */
  int QUALIFIER = 28;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER__LEVEL = 0;

  /**
   * The number of structural features of the '<em>qualifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.propertyIdentifierImpl <em>property Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.propertyIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpropertyIdentifier()
   * @generated
   */
  int PROPERTY_IDENTIFIER = 27;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_IDENTIFIER__LEVEL = QUALIFIER__LEVEL;

  /**
   * The number of structural features of the '<em>property Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_IDENTIFIER_FEATURE_COUNT = QUALIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentifierImpl <em>qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifiedIdentifier()
   * @generated
   */
  int QUALIFIED_IDENTIFIER = 32;

  /**
   * The number of structural features of the '<em>qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_IDENTIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.nonAttributeQualifiedIdentifierImpl <em>non Attribute Qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.nonAttributeQualifiedIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnonAttributeQualifiedIdentifier()
   * @generated
   */
  int NON_ATTRIBUTE_QUALIFIED_IDENTIFIER = 31;

  /**
   * The number of structural features of the '<em>non Attribute Qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT = QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl <em>simple Qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getsimpleQualifiedIdentifier()
   * @generated
   */
  int SIMPLE_QUALIFIED_IDENTIFIER = 29;

  /**
   * The feature id for the '<em><b>Pro Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUALIFIED_IDENTIFIER__QUAL = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Piden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUALIFIED_IDENTIFIER__PIDEN = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUALIFIED_IDENTIFIER__BRA = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>simple Qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUALIFIED_IDENTIFIER_FEATURE_COUNT = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.expressionQualifiedIdentifierImpl <em>expression Qualified Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.expressionQualifiedIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpressionQualifiedIdentifier()
   * @generated
   */
  int EXPRESSION_QUALIFIED_IDENTIFIER = 30;

  /**
   * The number of structural features of the '<em>expression Qualified Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_QUALIFIED_IDENTIFIER_FEATURE_COUNT = NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namespaceNameImpl <em>namespace Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.namespaceNameImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamespaceName()
   * @generated
   */
  int NAMESPACE_NAME = 33;

  /**
   * The feature id for the '<em><b>Ide</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_NAME__IDE = QUALIFIED_IDENT__IDE;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_NAME__LEVEL = QUALIFIED_IDENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>namespace Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_NAME_FEATURE_COUNT = QUALIFIED_IDENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl <em>array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.arrayLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 34;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LIST = 0;

  /**
   * The number of structural features of the '<em>array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.elementListImpl <em>element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.elementListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getelementList()
   * @generated
   */
  int ELEMENT_LIST = 35;

  /**
   * The number of structural features of the '<em>element List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.nonemptyElementListImpl <em>nonempty Element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.nonemptyElementListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnonemptyElementList()
   * @generated
   */
  int NONEMPTY_ELEMENT_LIST = 36;

  /**
   * The number of structural features of the '<em>nonempty Element List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONEMPTY_ELEMENT_LIST_FEATURE_COUNT = ELEMENT_LIST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ASSERT = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SWITCH = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__L = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPR_OR_OBJECT_LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bracketsImpl <em>brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.bracketsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbrackets()
   * @generated
   */
  int BRACKETS = 62;

  /**
   * The number of structural features of the '<em>brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.expressionListImpl <em>expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.expressionListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 38;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__ASSERT = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPR = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl <em>assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getassignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__ASSERT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__SWITCH = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__L = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__PDEN = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__BRA = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__EXPR = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.conditionalExpressionImpl <em>conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.conditionalExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getconditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ASSERT = ASSIGNMENT_EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__SWITCH = ASSIGNMENT_EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__L = ASSIGNMENT_EXPRESSION__L;

  /**
   * The feature id for the '<em><b>Pden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__PDEN = ASSIGNMENT_EXPRESSION__PDEN;

  /**
   * The feature id for the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__BRA = ASSIGNMENT_EXPRESSION__BRA;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPR = ASSIGNMENT_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__OP = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aexpr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__AEXPR = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.conditionalSubExpressionImpl <em>conditional Sub Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.conditionalSubExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getconditionalSubExpression()
   * @generated
   */
  int CONDITIONAL_SUB_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SUB_EXPRESSION__EXPR1 = 0;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SUB_EXPRESSION__EXPR2 = 1;

  /**
   * The number of structural features of the '<em>conditional Sub Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_SUB_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.logicalOrExpressionImpl <em>logical Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.logicalOrExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlogicalOrExpression()
   * @generated
   */
  int LOGICAL_OR_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__ASSERT = CONDITIONAL_EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__SWITCH = CONDITIONAL_EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__L = CONDITIONAL_EXPRESSION__L;

  /**
   * The feature id for the '<em><b>Pden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__PDEN = CONDITIONAL_EXPRESSION__PDEN;

  /**
   * The feature id for the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__BRA = CONDITIONAL_EXPRESSION__BRA;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__EXPR = CONDITIONAL_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__OP = CONDITIONAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Aexpr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__AEXPR = CONDITIONAL_EXPRESSION__AEXPR;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__COND = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__O = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>logical Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.logicalAndExpressionImpl <em>logical And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.logicalAndExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlogicalAndExpression()
   * @generated
   */
  int LOGICAL_AND_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>logical And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseOrExpressionImpl <em>bitwise Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseOrExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseOrExpression()
   * @generated
   */
  int BITWISE_OR_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>bitwise Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseXorExpressionImpl <em>bitwise Xor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseXorExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseXorExpression()
   * @generated
   */
  int BITWISE_XOR_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>bitwise Xor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseAndExpressionImpl <em>bitwise And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseAndExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseAndExpression()
   * @generated
   */
  int BITWISE_AND_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>bitwise And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.equalityExpressionImpl <em>equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.equalityExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getequalityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.relationalExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getrelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.shiftExpressionImpl <em>shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.shiftExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getshiftExpression()
   * @generated
   */
  int SHIFT_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.additiveExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getadditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl <em>multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__O = 1;

  /**
   * The number of structural features of the '<em>multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl <em>unary Expression Not Plus Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getunaryExpressionNotPlusMinus()
   * @generated
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS = 53;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__IN = 0;

  /**
   * The feature id for the '<em><b>De</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__DE = 1;

  /**
   * The number of structural features of the '<em>unary Expression Not Plus Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getunaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__IN = UNARY_EXPRESSION_NOT_PLUS_MINUS__IN;

  /**
   * The feature id for the '<em><b>De</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__DE = UNARY_EXPRESSION_NOT_PLUS_MINUS__DE;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPR = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uaem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UAEM = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uaep</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UAEP = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Uaenpm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UAENPM = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl <em>postfix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpostfixExpression()
   * @generated
   */
  int POSTFIX_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__IN = UNARY_EXPRESSION_NOT_PLUS_MINUS__IN;

  /**
   * The feature id for the '<em><b>De</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__DE = UNARY_EXPRESSION_NOT_PLUS_MINUS__DE;

  /**
   * The feature id for the '<em><b>Peexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__PEEXPR = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pepoi</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__PEPOI = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__EXPR = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pewi</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__PEWI = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>E4x</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__E4X = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__ARGS = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>postfix Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl <em>arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.argumentsImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getarguments()
   * @generated
   */
  int ARGUMENTS = 55;

  /**
   * The feature id for the '<em><b>Expr List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPR_LIST = 0;

  /**
   * The number of structural features of the '<em>arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl <em>e4x Attribute Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gete4xAttributeIdentifier()
   * @generated
   */
  int E4X_ATTRIBUTE_IDENTIFIER = 56;

  /**
   * The feature id for the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4X_ATTRIBUTE_IDENTIFIER__QUAL = QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4X_ATTRIBUTE_IDENTIFIER__EXPR = QUALIFIED_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>e4x Attribute Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int E4X_ATTRIBUTE_IDENTIFIER_FEATURE_COUNT = QUALIFIED_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl <em>primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getprimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Super Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__SUPER_EXPR = 0;

  /**
   * The feature id for the '<em><b>Con</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__CON = 1;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__LIT = 2;

  /**
   * The feature id for the '<em><b>Fexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__FEXPR = 3;

  /**
   * The feature id for the '<em><b>Nexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__NEXPR = 4;

  /**
   * The feature id for the '<em><b>Encexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ENCEXPR = 5;

  /**
   * The feature id for the '<em><b>E4x</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__E4X = 6;

  /**
   * The feature id for the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__QUAL = 7;

  /**
   * The number of structural features of the '<em>primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.propOrIdentImpl <em>prop Or Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.propOrIdentImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpropOrIdent()
   * @generated
   */
  int PROP_OR_IDENT = 58;

  /**
   * The feature id for the '<em><b>Prop Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROP_OR_IDENT__PROP_ID = 0;

  /**
   * The number of structural features of the '<em>prop Or Ident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROP_OR_IDENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.regexpLiteralImpl <em>regexp Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.regexpLiteralImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getregexpLiteral()
   * @generated
   */
  int REGEXP_LITERAL = 59;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_LITERAL__S = 0;

  /**
   * The number of structural features of the '<em>regexp Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.newExpressionImpl <em>new Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.newExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnewExpression()
   * @generated
   */
  int NEW_EXPRESSION = 60;

  /**
   * The number of structural features of the '<em>new Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl <em>full New Subexpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfullNewSubexpression()
   * @generated
   */
  int FULL_NEW_SUBEXPRESSION = 61;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION__ARGS = NEW_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION__EXPR = NEW_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fnsd</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION__FNSD = NEW_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Quali</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION__QUALI = NEW_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Brack</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION__BRACK = NEW_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>full New Subexpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NEW_SUBEXPRESSION_FEATURE_COUNT = NEW_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl <em>encapsulated Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getencapsulatedExpression()
   * @generated
   */
  int ENCAPSULATED_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>Pden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCAPSULATED_EXPRESSION__PDEN = EXPRESSION_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCAPSULATED_EXPRESSION__BRA = EXPRESSION_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>encapsulated Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCAPSULATED_EXPRESSION_FEATURE_COUNT = EXPRESSION_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionSignatureImpl <em>function Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionSignatureImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionSignature()
   * @generated
   */
  int FUNCTION_SIGNATURE = 64;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__PARAM = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE__TYPE = 1;

  /**
   * The number of structural features of the '<em>function Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SIGNATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeExpressionImpl <em>type Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeExpression()
   * @generated
   */
  int TYPE_EXPRESSION = 65;

  /**
   * The feature id for the '<em><b>Identi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__IDENTI = 0;

  /**
   * The number of structural features of the '<em>type Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationListImpl <em>parameter Declaration List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDeclarationList()
   * @generated
   */
  int PARAMETER_DECLARATION_LIST = 66;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>parameter Declaration List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationImpl <em>parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 67;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.basicParameterDeclarationImpl <em>basic Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.basicParameterDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbasicParameterDeclaration()
   * @generated
   */
  int BASIC_PARAMETER_DECLARATION = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PARAMETER_DECLARATION__NAME = PARAMETER_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PARAMETER_DECLARATION__TYPE = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PARAMETER_DECLARATION__PARAM = PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>basic Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PARAMETER_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDefaultImpl <em>parameter Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDefaultImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDefault()
   * @generated
   */
  int PARAMETER_DEFAULT = 69;

  /**
   * The number of structural features of the '<em>parameter Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFAULT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterRestDeclarationImpl <em>parameter Rest Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterRestDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterRestDeclaration()
   * @generated
   */
  int PARAMETER_REST_DECLARATION = 70;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REST_DECLARATION__NAME = PARAMETER_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>parameter Rest Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REST_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 73;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ASSERT = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.BlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 71;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.SwitchStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ConditionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 72;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ASSERT = SWITCH_STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SWITCH = SWITCH_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = SWITCH_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DefaultXMLNamespaceStatementImpl <em>Default XML Namespace Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DefaultXMLNamespaceStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDefaultXMLNamespaceStatement()
   * @generated
   */
  int DEFAULT_XML_NAMESPACE_STATEMENT = 74;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_XML_NAMESPACE_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Default XML Namespace Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_XML_NAMESPACE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDeclarationStatement()
   * @generated
   */
  int DECLARATION_STATEMENT = 75;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 77;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ASSERT = DECLARATION_STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = DECLARATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclaratorImpl <em>variable Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclaratorImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableDeclarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 76;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__ASSERT = DECLARATION__ASSERT;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__TAIL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>variable Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.declarationTailImpl <em>declaration Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.declarationTailImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdeclarationTail()
   * @generated
   */
  int DECLARATION_TAIL = 78;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_TAIL__VAR = 0;

  /**
   * The number of structural features of the '<em>declaration Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_TAIL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableInitializerImpl <em>variable Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableInitializerImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableInitializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 79;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__EXPR = 0;

  /**
   * The number of structural features of the '<em>variable Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getExpressionStatement()
   * @generated
   */
  int EXPRESSION_STATEMENT = 80;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.IfStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 81;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ThrowStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getThrowStatement()
   * @generated
   */
  int THROW_STATEMENT = 82;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The number of structural features of the '<em>Throw Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl <em>Try Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getTryStatement()
   * @generated
   */
  int TRY_STATEMENT = 83;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Catch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__CATCH = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Try Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.catchBlockImpl <em>catch Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.catchBlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcatchBlock()
   * @generated
   */
  int CATCH_BLOCK = 84;

  /**
   * The number of structural features of the '<em>catch Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.finallyBlockImpl <em>finally Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.finallyBlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfinallyBlock()
   * @generated
   */
  int FINALLY_BLOCK = 85;

  /**
   * The number of structural features of the '<em>finally Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINALLY_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ReturnStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 86;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl <em>switch Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getswitchBlock()
   * @generated
   */
  int SWITCH_BLOCK = 88;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_BLOCK__CASE = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_BLOCK__DEF = 1;

  /**
   * The number of structural features of the '<em>switch Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.CaseStatementImpl <em>Case Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.CaseStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getCaseStatement()
   * @generated
   */
  int CASE_STATEMENT = 89;

  /**
   * The number of structural features of the '<em>Case Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DefaultStatementImpl <em>Default Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DefaultStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDefaultStatement()
   * @generated
   */
  int DEFAULT_STATEMENT = 90;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT__L = 0;

  /**
   * The number of structural features of the '<em>Default Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchStatementListImpl <em>switch Statement List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.switchStatementListImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getswitchStatementList()
   * @generated
   */
  int SWITCH_STATEMENT_LIST = 91;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_LIST__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>switch Statement List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getForEachStatement()
   * @generated
   */
  int FOR_EACH_STATEMENT = 92;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Fesfor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_STATEMENT__FESFOR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_STATEMENT__FES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Each Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 93;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>For In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_IN = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fsstate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FSSTATE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Traditional For Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.traditionalForClauseImpl <em>traditional For Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.traditionalForClauseImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettraditionalForClause()
   * @generated
   */
  int TRADITIONAL_FOR_CLAUSE = 94;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRADITIONAL_FOR_CLAUSE__A = 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRADITIONAL_FOR_CLAUSE__B = 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRADITIONAL_FOR_CLAUSE__C = 2;

  /**
   * The number of structural features of the '<em>traditional For Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRADITIONAL_FOR_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl <em>for In Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClause()
   * @generated
   */
  int FOR_IN_CLAUSE = 95;

  /**
   * The feature id for the '<em><b>Ficdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_CLAUSE__FICDECL = 0;

  /**
   * The feature id for the '<em><b>Fictail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_CLAUSE__FICTAIL = 1;

  /**
   * The number of structural features of the '<em>for In Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseDeclImpl <em>for In Clause Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseDeclImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClauseDecl()
   * @generated
   */
  int FOR_IN_CLAUSE_DECL = 96;

  /**
   * The number of structural features of the '<em>for In Clause Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_CLAUSE_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseTailImpl <em>for In Clause Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseTailImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClauseTail()
   * @generated
   */
  int FOR_IN_CLAUSE_TAIL = 97;

  /**
   * The number of structural features of the '<em>for In Clause Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_CLAUSE_TAIL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInitImpl <em>for Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInitImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInit()
   * @generated
   */
  int FOR_INIT = 98;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT__DECL = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT__EXPR = 1;

  /**
   * The number of structural features of the '<em>for Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forCondImpl <em>for Cond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forCondImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforCond()
   * @generated
   */
  int FOR_COND = 99;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_COND__EXPR = 0;

  /**
   * The number of structural features of the '<em>for Cond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_COND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forIterImpl <em>for Iter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.forIterImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforIter()
   * @generated
   */
  int FOR_ITER = 100;

  /**
   * The feature id for the '<em><b>Fiexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ITER__FIEXPR = 0;

  /**
   * The number of structural features of the '<em>for Iter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ITER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.WhileStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 101;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.DoWhileStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDoWhileStatement()
   * @generated
   */
  int DO_WHILE_STATEMENT = 102;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_STATEMENT__STATE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WithStatementImpl <em>With Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.WithStatementImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWithStatement()
   * @generated
   */
  int WITH_STATEMENT = 103;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__ASSERT = STATEMENT__ASSERT;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>With Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionCommonImpl <em>function Common</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionCommonImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionCommon()
   * @generated
   */
  int FUNCTION_COMMON = 104;

  /**
   * The feature id for the '<em><b>Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_COMMON__SIG = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_COMMON__BLOCK = 1;

  /**
   * The number of structural features of the '<em>function Common</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_COMMON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionExpressionImpl <em>function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionExpressionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 105;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__FUNC = 1;

  /**
   * The number of structural features of the '<em>function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.XmlConstantImpl <em>Xml Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.XmlConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getXmlConstant()
   * @generated
   */
  int XML_CONSTANT = 106;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONSTANT__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONSTANT__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONSTANT__L = EXPRESSION__L;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.RegexpConstantImpl <em>Regexp Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.RegexpConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getRegexpConstant()
   * @generated
   */
  int REGEXP_CONSTANT = 107;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_CONSTANT__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_CONSTANT__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_CONSTANT__L = EXPRESSION__L;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Regexp Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NumberConstantImpl <em>Number Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.NumberConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNumberConstant()
   * @generated
   */
  int NUMBER_CONSTANT = 108;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONSTANT__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONSTANT__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONSTANT__L = EXPRESSION__L;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.StringConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 109;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__L = EXPRESSION__L;

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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.BoolConstantImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 110;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__L = EXPRESSION__L;

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
  int THIS = 111;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__L = EXPRESSION__L;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNull()
   * @generated
   */
  int NULL = 112;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__ASSERT = EXPRESSION__ASSERT;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__SWITCH = EXPRESSION__SWITCH;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__L = EXPRESSION__L;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel <em>Access Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getAccessLevel()
   * @generated
   */
  int ACCESS_LEVEL = 113;


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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Model#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model#getPackage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Package();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Model#getImp <em>Imp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imp</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model#getImp()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imp();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Model#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model#getMembers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Members();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getImp <em>Imp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imp</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package#getImp()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Imp();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package#getDirectives()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Directives();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package#getMembers()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Members();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package#getClasses()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Classes();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Imports
   * @generated
   */
  EClass getImports();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Imports#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Imports#getImports()
   * @see #getImports()
   * @generated
   */
  EReference getImports_Imports();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.directive <em>directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>directive</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive
   * @generated
   */
  EClass getdirective();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getName()
   * @see #getdirective()
   * @generated
   */
  EAttribute getdirective_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getAnnonFields <em>Annon Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annon Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getAnnonFields()
   * @see #getdirective()
   * @generated
   */
  EReference getdirective_AnnonFields();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uses</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive#getUses()
   * @see #getdirective()
   * @generated
   */
  EReference getdirective_Uses();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Uses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Uses
   * @generated
   */
  EClass getUses();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Uses#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Uses#getType()
   * @see #getUses()
   * @generated
   */
  EAttribute getUses_Type();

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
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnoonFields <em>Anoon Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anoon Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnoonFields()
   * @see #getannotationFields()
   * @generated
   */
  EReference getannotationFields_AnoonFields();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnnonFields <em>Annon Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annon Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnnonFields()
   * @see #getannotationFields()
   * @generated
   */
  EReference getannotationFields_AnnonFields();

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
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.annotationField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationField#getName()
   * @see #getannotationField()
   * @generated
   */
  EAttribute getannotationField_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.annotationField#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationField#getExpr()
   * @see #getannotationField()
   * @generated
   */
  EReference getannotationField_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Interface#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface#getAccess()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Access();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.Interface#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface#getSuperclass()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Interface#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface#getMembers()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Members();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod <em>Interface Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod
   * @generated
   */
  EClass getInterfaceMethod();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getModifier()
   * @see #getInterfaceMethod()
   * @generated
   */
  EReference getInterfaceMethod_Modifier();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getName()
   * @see #getInterfaceMethod()
   * @generated
   */
  EAttribute getInterfaceMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getAccessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessor</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getAccessor()
   * @see #getInterfaceMethod()
   * @generated
   */
  EAttribute getInterfaceMethod_Accessor();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getParams()
   * @see #getInterfaceMethod()
   * @generated
   */
  EReference getInterfaceMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod#getType()
   * @see #getInterfaceMethod()
   * @generated
   */
  EReference getInterfaceMethod_Type();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getModifier()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Modifier();

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
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getSuperType()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperType();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getModifier()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Modifier();

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
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getAccessor <em>Accessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessor</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method#getAccessor()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Accessor();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier#isStatic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier#isFinal()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Final();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier#isNative()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Native();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isDynamic <em>Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier#isDynamic()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Dynamic();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier#getAccess()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Access();

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
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.MethodBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.MethodBody#getStatements()
   * @see #getMethodBody()
   * @generated
   */
  EReference getMethodBody_Statements();

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
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getAccess()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Access();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.VarType <em>Var Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VarType
   * @generated
   */
  EClass getVarType();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.VarType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VarType#getName()
   * @see #getVarType()
   * @generated
   */
  EAttribute getVarType_Name();

  /**
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.VarType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.VarType#getType()
   * @see #getVarType()
   * @generated
   */
  EReference getVarType_Type();

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
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.objectLiteral <em>object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>object Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectLiteral
   * @generated
   */
  EClass getobjectLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.objectLiteral#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectLiteral#getFields()
   * @see #getobjectLiteral()
   * @generated
   */
  EReference getobjectLiteral_Fields();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldList <em>field List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldList
   * @generated
   */
  EClass getfieldList();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.fieldList#getLf <em>Lf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lf</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldList#getLf()
   * @see #getfieldList()
   * @generated
   */
  EReference getfieldList_Lf();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fieldList#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldList#getFields()
   * @see #getfieldList()
   * @generated
   */
  EReference getfieldList_Fields();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.literalField <em>literal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>literal Field</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.literalField
   * @generated
   */
  EClass getliteralField();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.literalField#getName()
   * @see #getliteralField()
   * @generated
   */
  EReference getliteralField_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getEl <em>El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.literalField#getEl()
   * @see #getliteralField()
   * @generated
   */
  EReference getliteralField_El();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName <em>field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldName
   * @generated
   */
  EClass getfieldName();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldName#getNumber()
   * @see #getfieldName()
   * @generated
   */
  EAttribute getfieldName_Number();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.element <em>element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.element
   * @generated
   */
  EClass getelement();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent <em>qualified Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>qualified Ident</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent
   * @generated
   */
  EClass getqualifiedIdent();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent#getIde <em>Ide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ide</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent#getIde()
   * @see #getqualifiedIdent()
   * @generated
   */
  EReference getqualifiedIdent_Ide();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.identi <em>identi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>identi</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi
   * @generated
   */
  EClass getidenti();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.identi#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi#getI()
   * @see #getidenti()
   * @generated
   */
  EAttribute getidenti_I();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identi#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi#getType()
   * @see #getidenti()
   * @generated
   */
  EReference getidenti_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identi#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi#getVar()
   * @see #getidenti()
   * @generated
   */
  EReference getidenti_Var();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identi#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi#getBlock()
   * @see #getidenti()
   * @generated
   */
  EReference getidenti_Block();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.identifier <em>identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifier
   * @generated
   */
  EClass getidentifier();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.identifier#getQual <em>Qual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifier#getQual()
   * @see #getidentifier()
   * @generated
   */
  EReference getidentifier_Qual();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.identifier#getPoi <em>Poi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Poi</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifier#getPoi()
   * @see #getidentifier()
   * @generated
   */
  EReference getidentifier_Poi();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier <em>property Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>property Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier
   * @generated
   */
  EClass getpropertyIdentifier();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifier <em>qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>qualifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifier
   * @generated
   */
  EClass getqualifier();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.qualifier#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifier#getLevel()
   * @see #getqualifier()
   * @generated
   */
  EAttribute getqualifier_Level();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier <em>simple Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple Qualified Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier
   * @generated
   */
  EClass getsimpleQualifiedIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getProId <em>Pro Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pro Id</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getProId()
   * @see #getsimpleQualifiedIdentifier()
   * @generated
   */
  EReference getsimpleQualifiedIdentifier_ProId();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getQual <em>Qual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getQual()
   * @see #getsimpleQualifiedIdentifier()
   * @generated
   */
  EReference getsimpleQualifiedIdentifier_Qual();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getPiden <em>Piden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Piden</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getPiden()
   * @see #getsimpleQualifiedIdentifier()
   * @generated
   */
  EReference getsimpleQualifiedIdentifier_Piden();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getBra <em>Bra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bra</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getBra()
   * @see #getsimpleQualifiedIdentifier()
   * @generated
   */
  EReference getsimpleQualifiedIdentifier_Bra();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier <em>expression Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression Qualified Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier
   * @generated
   */
  EClass getexpressionQualifiedIdentifier();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier <em>non Attribute Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>non Attribute Qualified Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier
   * @generated
   */
  EClass getnonAttributeQualifiedIdentifier();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier <em>qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>qualified Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier
   * @generated
   */
  EClass getqualifiedIdentifier();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.namespaceName <em>namespace Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>namespace Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namespaceName
   * @generated
   */
  EClass getnamespaceName();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.namespaceName#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.namespaceName#getLevel()
   * @see #getnamespaceName()
   * @generated
   */
  EAttribute getnamespaceName_Level();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.arrayLiteral#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.arrayLiteral#getList()
   * @see #getarrayLiteral()
   * @generated
   */
  EReference getarrayLiteral_List();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.elementList <em>element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.elementList
   * @generated
   */
  EClass getelementList();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList <em>nonempty Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nonempty Element List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList
   * @generated
   */
  EClass getnonemptyElementList();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Expression#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Expression#getL()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_L();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.expressionList <em>expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expressionList
   * @generated
   */
  EClass getexpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.expressionList#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.expressionList#getExpr()
   * @see #getexpressionList()
   * @generated
   */
  EReference getexpressionList_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.assignmentExpression <em>assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assignment Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.assignmentExpression
   * @generated
   */
  EClass getassignmentExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.assignmentExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.assignmentExpression#getExpr()
   * @see #getassignmentExpression()
   * @generated
   */
  EReference getassignmentExpression_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression <em>conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conditional Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalExpression
   * @generated
   */
  EClass getconditionalExpression();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getOp()
   * @see #getconditionalExpression()
   * @generated
   */
  EAttribute getconditionalExpression_Op();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getAexpr <em>Aexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getAexpr()
   * @see #getconditionalExpression()
   * @generated
   */
  EReference getconditionalExpression_Aexpr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression <em>conditional Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>conditional Sub Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression
   * @generated
   */
  EClass getconditionalSubExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr1</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr1()
   * @see #getconditionalSubExpression()
   * @generated
   */
  EReference getconditionalSubExpression_Expr1();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr2</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr2()
   * @see #getconditionalSubExpression()
   * @generated
   */
  EReference getconditionalSubExpression_Expr2();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression <em>logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical Or Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression
   * @generated
   */
  EClass getlogicalOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getCond()
   * @see #getlogicalOrExpression()
   * @generated
   */
  EReference getlogicalOrExpression_Cond();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getO()
   * @see #getlogicalOrExpression()
   * @generated
   */
  EAttribute getlogicalOrExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression <em>logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical And Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression
   * @generated
   */
  EClass getlogicalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression#getExpr()
   * @see #getlogicalAndExpression()
   * @generated
   */
  EReference getlogicalAndExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression#getO()
   * @see #getlogicalAndExpression()
   * @generated
   */
  EAttribute getlogicalAndExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression <em>bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bitwise Or Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression
   * @generated
   */
  EClass getbitwiseOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression#getExpr()
   * @see #getbitwiseOrExpression()
   * @generated
   */
  EReference getbitwiseOrExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression#getO()
   * @see #getbitwiseOrExpression()
   * @generated
   */
  EAttribute getbitwiseOrExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression <em>bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bitwise Xor Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression
   * @generated
   */
  EClass getbitwiseXorExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getExpr()
   * @see #getbitwiseXorExpression()
   * @generated
   */
  EReference getbitwiseXorExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getO()
   * @see #getbitwiseXorExpression()
   * @generated
   */
  EAttribute getbitwiseXorExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression <em>bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bitwise And Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression
   * @generated
   */
  EClass getbitwiseAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression#getExpr()
   * @see #getbitwiseAndExpression()
   * @generated
   */
  EReference getbitwiseAndExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression#getO()
   * @see #getbitwiseAndExpression()
   * @generated
   */
  EAttribute getbitwiseAndExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.equalityExpression <em>equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>equality Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.equalityExpression
   * @generated
   */
  EClass getequalityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.equalityExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.equalityExpression#getExpr()
   * @see #getequalityExpression()
   * @generated
   */
  EReference getequalityExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.equalityExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.equalityExpression#getO()
   * @see #getequalityExpression()
   * @generated
   */
  EAttribute getequalityExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>relational Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.relationalExpression
   * @generated
   */
  EClass getrelationalExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.relationalExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.relationalExpression#getExpr()
   * @see #getrelationalExpression()
   * @generated
   */
  EReference getrelationalExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.relationalExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.relationalExpression#getO()
   * @see #getrelationalExpression()
   * @generated
   */
  EAttribute getrelationalExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.shiftExpression <em>shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>shift Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.shiftExpression
   * @generated
   */
  EClass getshiftExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.shiftExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.shiftExpression#getExpr()
   * @see #getshiftExpression()
   * @generated
   */
  EReference getshiftExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.shiftExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.shiftExpression#getO()
   * @see #getshiftExpression()
   * @generated
   */
  EAttribute getshiftExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>additive Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.additiveExpression
   * @generated
   */
  EClass getadditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.additiveExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.additiveExpression#getExpr()
   * @see #getadditiveExpression()
   * @generated
   */
  EReference getadditiveExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.additiveExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.additiveExpression#getO()
   * @see #getadditiveExpression()
   * @generated
   */
  EAttribute getadditiveExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression <em>multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>multiplicative Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression
   * @generated
   */
  EClass getmultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression#getExpr()
   * @see #getmultiplicativeExpression()
   * @generated
   */
  EReference getmultiplicativeExpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>O</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression#getO()
   * @see #getmultiplicativeExpression()
   * @generated
   */
  EAttribute getmultiplicativeExpression_O();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unary Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression
   * @generated
   */
  EClass getunaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getExpr()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaem <em>Uaem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uaem</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaem()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_Uaem();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaep <em>Uaep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uaep</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaep()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_Uaep();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaenpm <em>Uaenpm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uaenpm</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression#getUaenpm()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_Uaenpm();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus <em>unary Expression Not Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unary Expression Not Plus Minus</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus
   * @generated
   */
  EClass getunaryExpressionNotPlusMinus();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus#getIn()
   * @see #getunaryExpressionNotPlusMinus()
   * @generated
   */
  EAttribute getunaryExpressionNotPlusMinus_In();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus#getDe <em>De</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>De</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus#getDe()
   * @see #getunaryExpressionNotPlusMinus()
   * @generated
   */
  EAttribute getunaryExpressionNotPlusMinus_De();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression <em>postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>postfix Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression
   * @generated
   */
  EClass getpostfixExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPeexpr <em>Peexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Peexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPeexpr()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_Peexpr();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPepoi <em>Pepoi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pepoi</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPepoi()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_Pepoi();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getExpr()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPewi <em>Pewi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pewi</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPewi()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_Pewi();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getE4x <em>E4x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E4x</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getE4x()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_E4x();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getArgs()
   * @see #getpostfixExpression()
   * @generated
   */
  EReference getpostfixExpression_Args();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.arguments#getExprList <em>Expr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.arguments#getExprList()
   * @see #getarguments()
   * @generated
   */
  EReference getarguments_ExprList();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier <em>e4x Attribute Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>e4x Attribute Identifier</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier
   * @generated
   */
  EClass gete4xAttributeIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier#getQual <em>Qual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier#getQual()
   * @see #gete4xAttributeIdentifier()
   * @generated
   */
  EReference gete4xAttributeIdentifier_Qual();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier#getExpr()
   * @see #gete4xAttributeIdentifier()
   * @generated
   */
  EReference gete4xAttributeIdentifier_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression <em>primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>primary Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression
   * @generated
   */
  EClass getprimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getSuperExpr <em>Super Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getSuperExpr()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_SuperExpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getCon <em>Con</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Con</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getCon()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Con();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getLit()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Lit();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getFexpr <em>Fexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getFexpr()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Fexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getNexpr <em>Nexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getNexpr()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Nexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getEncexpr <em>Encexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Encexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getEncexpr()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Encexpr();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getE4x <em>E4x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E4x</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getE4x()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_E4x();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getQual <em>Qual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getQual()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Qual();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent <em>prop Or Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>prop Or Ident</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.propOrIdent
   * @generated
   */
  EClass getpropOrIdent();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent#getPropId <em>Prop Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prop Id</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.propOrIdent#getPropId()
   * @see #getpropOrIdent()
   * @generated
   */
  EReference getpropOrIdent_PropId();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.regexpLiteral <em>regexp Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>regexp Literal</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.regexpLiteral
   * @generated
   */
  EClass getregexpLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.regexpLiteral#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.regexpLiteral#getS()
   * @see #getregexpLiteral()
   * @generated
   */
  EAttribute getregexpLiteral_S();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.newExpression <em>new Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>new Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.newExpression
   * @generated
   */
  EClass getnewExpression();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression <em>full New Subexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>full New Subexpression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression
   * @generated
   */
  EClass getfullNewSubexpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getArgs()
   * @see #getfullNewSubexpression()
   * @generated
   */
  EReference getfullNewSubexpression_Args();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getExpr()
   * @see #getfullNewSubexpression()
   * @generated
   */
  EReference getfullNewSubexpression_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getFnsd <em>Fnsd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fnsd</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getFnsd()
   * @see #getfullNewSubexpression()
   * @generated
   */
  EAttribute getfullNewSubexpression_Fnsd();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getQuali <em>Quali</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quali</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getQuali()
   * @see #getfullNewSubexpression()
   * @generated
   */
  EReference getfullNewSubexpression_Quali();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getBrack <em>Brack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Brack</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getBrack()
   * @see #getfullNewSubexpression()
   * @generated
   */
  EReference getfullNewSubexpression_Brack();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.brackets <em>brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>brackets</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.brackets
   * @generated
   */
  EClass getbrackets();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression <em>encapsulated Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>encapsulated Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression
   * @generated
   */
  EClass getencapsulatedExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getPden <em>Pden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pden</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getPden()
   * @see #getencapsulatedExpression()
   * @generated
   */
  EReference getencapsulatedExpression_Pden();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getBra <em>Bra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bra</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getBra()
   * @see #getencapsulatedExpression()
   * @generated
   */
  EReference getencapsulatedExpression_Bra();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature <em>function Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Signature</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionSignature
   * @generated
   */
  EClass getfunctionSignature();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionSignature#getParam()
   * @see #getfunctionSignature()
   * @generated
   */
  EReference getfunctionSignature_Param();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionSignature#getType()
   * @see #getfunctionSignature()
   * @generated
   */
  EReference getfunctionSignature_Type();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.typeExpression <em>type Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeExpression
   * @generated
   */
  EClass gettypeExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.typeExpression#getIdenti <em>Identi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identi</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeExpression#getIdenti()
   * @see #gettypeExpression()
   * @generated
   */
  EReference gettypeExpression_Identi();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList <em>parameter Declaration List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter Declaration List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList
   * @generated
   */
  EClass getparameterDeclarationList();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList#getParams()
   * @see #getparameterDeclarationList()
   * @generated
   */
  EReference getparameterDeclarationList_Params();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration <em>parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration
   * @generated
   */
  EClass getparameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration#getName()
   * @see #getparameterDeclaration()
   * @generated
   */
  EReference getparameterDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration <em>basic Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>basic Parameter Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration
   * @generated
   */
  EClass getbasicParameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getType()
   * @see #getbasicParameterDeclaration()
   * @generated
   */
  EReference getbasicParameterDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getParam()
   * @see #getbasicParameterDeclaration()
   * @generated
   */
  EReference getbasicParameterDeclaration_Param();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDefault <em>parameter Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter Default</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDefault
   * @generated
   */
  EClass getparameterDefault();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration <em>parameter Rest Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter Rest Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration
   * @generated
   */
  EClass getparameterRestDeclaration();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Condition#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Condition#getSwitch()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Switch();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Assert();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement <em>Default XML Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default XML Namespace Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement
   * @generated
   */
  EClass getDefaultXMLNamespaceStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement <em>Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement
   * @generated
   */
  EClass getDeclarationStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator <em>variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable Declarator</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclarator
   * @generated
   */
  EClass getvariableDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclarator#getTail()
   * @see #getvariableDeclarator()
   * @generated
   */
  EReference getvariableDeclarator_Tail();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.declarationTail <em>declaration Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration Tail</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.declarationTail
   * @generated
   */
  EClass getdeclarationTail();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.declarationTail#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.declarationTail#getVar()
   * @see #getdeclarationTail()
   * @generated
   */
  EReference getdeclarationTail_Var();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.variableInitializer <em>variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable Initializer</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableInitializer
   * @generated
   */
  EClass getvariableInitializer();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.variableInitializer#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableInitializer#getExpr()
   * @see #getvariableInitializer()
   * @generated
   */
  EReference getvariableInitializer_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement
   * @generated
   */
  EClass getExpressionStatement();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getCond()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Cond();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getStatement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement#getElse()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Else();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ThrowStatement <em>Throw Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ThrowStatement
   * @generated
   */
  EClass getThrowStatement();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getBlock()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinally <em>Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinally()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Finally();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getCatch <em>Catch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement#getCatch()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Catch();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.catchBlock <em>catch Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>catch Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.catchBlock
   * @generated
   */
  EClass getcatchBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.finallyBlock <em>finally Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>finally Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.finallyBlock
   * @generated
   */
  EClass getfinallyBlock();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ReturnStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ReturnStatement#getExpr()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expr();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock <em>switch Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>switch Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchBlock
   * @generated
   */
  EClass getswitchBlock();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchBlock#getCase()
   * @see #getswitchBlock()
   * @generated
   */
  EReference getswitchBlock_Case();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchBlock#getDef()
   * @see #getswitchBlock()
   * @generated
   */
  EReference getswitchBlock_Def();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.CaseStatement
   * @generated
   */
  EClass getCaseStatement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DefaultStatement
   * @generated
   */
  EClass getDefaultStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.DefaultStatement#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DefaultStatement#getL()
   * @see #getDefaultStatement()
   * @generated
   */
  EReference getDefaultStatement_L();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.switchStatementList <em>switch Statement List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>switch Statement List</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchStatementList
   * @generated
   */
  EClass getswitchStatementList();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.switchStatementList#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchStatementList#getStatements()
   * @see #getswitchStatementList()
   * @generated
   */
  EReference getswitchStatementList_Statements();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement <em>For Each Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForEachStatement
   * @generated
   */
  EClass getForEachStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFesfor <em>Fesfor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fesfor</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFesfor()
   * @see #getForEachStatement()
   * @generated
   */
  EReference getForEachStatement_Fesfor();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFes <em>Fes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fes</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFes()
   * @see #getForEachStatement()
   * @generated
   */
  EReference getForEachStatement_Fes();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForIn <em>For In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For In</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForIn()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForIn();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getFsstate <em>Fsstate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fsstate</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getFsstate()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Fsstate();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getTraditionalForClause <em>Traditional For Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Traditional For Clause</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement#getTraditionalForClause()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_TraditionalForClause();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause <em>traditional For Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>traditional For Clause</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.traditionalForClause
   * @generated
   */
  EClass gettraditionalForClause();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getA()
   * @see #gettraditionalForClause()
   * @generated
   */
  EReference gettraditionalForClause_A();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getB()
   * @see #gettraditionalForClause()
   * @generated
   */
  EReference gettraditionalForClause_B();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getC()
   * @see #gettraditionalForClause()
   * @generated
   */
  EReference gettraditionalForClause_C();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause <em>for In Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for In Clause</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClause
   * @generated
   */
  EClass getforInClause();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFicdecl <em>Ficdecl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ficdecl</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClause#getFicdecl()
   * @see #getforInClause()
   * @generated
   */
  EReference getforInClause_Ficdecl();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFictail <em>Fictail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fictail</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClause#getFictail()
   * @see #getforInClause()
   * @generated
   */
  EReference getforInClause_Fictail();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl <em>for In Clause Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for In Clause Decl</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl
   * @generated
   */
  EClass getforInClauseDecl();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClauseTail <em>for In Clause Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for In Clause Tail</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClauseTail
   * @generated
   */
  EClass getforInClauseTail();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forInit <em>for Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for Init</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInit
   * @generated
   */
  EClass getforInit();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInit#getDecl()
   * @see #getforInit()
   * @generated
   */
  EReference getforInit_Decl();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInit#getExpr()
   * @see #getforInit()
   * @generated
   */
  EReference getforInit_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forCond <em>for Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forCond
   * @generated
   */
  EClass getforCond();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forCond#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forCond#getExpr()
   * @see #getforCond()
   * @generated
   */
  EReference getforCond_Expr();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.forIter <em>for Iter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>for Iter</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forIter
   * @generated
   */
  EClass getforIter();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.forIter#getFiexpr <em>Fiexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fiexpr</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.forIter#getFiexpr()
   * @see #getforIter()
   * @generated
   */
  EReference getforIter_Fiexpr();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.WhileStatement#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WhileStatement#getCond()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Cond();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.WhileStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WhileStatement#getStatement()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Statement();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getState()
   * @see #getDoWhileStatement()
   * @generated
   */
  EReference getDoWhileStatement_State();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getCond()
   * @see #getDoWhileStatement()
   * @generated
   */
  EReference getDoWhileStatement_Cond();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.WithStatement <em>With Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WithStatement
   * @generated
   */
  EClass getWithStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.WithStatement#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WithStatement#getCond()
   * @see #getWithStatement()
   * @generated
   */
  EReference getWithStatement_Cond();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.WithStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.WithStatement#getStatement()
   * @see #getWithStatement()
   * @generated
   */
  EReference getWithStatement_Statement();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon <em>function Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Common</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionCommon
   * @generated
   */
  EClass getfunctionCommon();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getSig <em>Sig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sig</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionCommon#getSig()
   * @see #getfunctionCommon()
   * @generated
   */
  EReference getfunctionCommon_Sig();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionCommon#getBlock()
   * @see #getfunctionCommon()
   * @generated
   */
  EReference getfunctionCommon_Block();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.functionExpression <em>function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Expression</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionExpression
   * @generated
   */
  EClass getfunctionExpression();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.functionExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionExpression#getName()
   * @see #getfunctionExpression()
   * @generated
   */
  EAttribute getfunctionExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.functionExpression#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionExpression#getFunc()
   * @see #getfunctionExpression()
   * @generated
   */
  EReference getfunctionExpression_Func();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.XmlConstant <em>Xml Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.XmlConstant
   * @generated
   */
  EClass getXmlConstant();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.XmlConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.XmlConstant#getValue()
   * @see #getXmlConstant()
   * @generated
   */
  EAttribute getXmlConstant_Value();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.RegexpConstant <em>Regexp Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.RegexpConstant
   * @generated
   */
  EClass getRegexpConstant();

  /**
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.RegexpConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.RegexpConstant#getValue()
   * @see #getRegexpConstant()
   * @generated
   */
  EReference getRegexpConstant_Value();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.NumberConstant <em>Number Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Constant</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.NumberConstant
   * @generated
   */
  EClass getNumberConstant();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.NumberConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.NumberConstant#getValue()
   * @see #getNumberConstant()
   * @generated
   */
  EAttribute getNumberConstant_Value();

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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Null
   * @generated
   */
  EClass getNull();

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
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

    /**
     * The meta object literal for the '<em><b>Imp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMP = eINSTANCE.getModel_Imp();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MEMBERS = eINSTANCE.getModel_Members();

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
     * The meta object literal for the '<em><b>Imp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__IMP = eINSTANCE.getPackage_Imp();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__DIRECTIVES = eINSTANCE.getPackage_Directives();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__MEMBERS = eINSTANCE.getPackage_Members();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ImportsImpl <em>Imports</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ImportsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getImports()
     * @generated
     */
    EClass IMPORTS = eINSTANCE.getImports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTS__IMPORTS = eINSTANCE.getImports_Imports();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl <em>directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdirective()
     * @generated
     */
    EClass DIRECTIVE = eINSTANCE.getdirective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__NAME = eINSTANCE.getdirective_Name();

    /**
     * The meta object literal for the '<em><b>Annon Fields</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTIVE__ANNON_FIELDS = eINSTANCE.getdirective_AnnonFields();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTIVE__USES = eINSTANCE.getdirective_Uses();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.UsesImpl <em>Uses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.UsesImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getUses()
     * @generated
     */
    EClass USES = eINSTANCE.getUses();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USES__TYPE = eINSTANCE.getUses_Type();

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
     * The meta object literal for the '<em><b>Anoon Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_FIELDS__ANOON_FIELDS = eINSTANCE.getannotationFields_AnoonFields();

    /**
     * The meta object literal for the '<em><b>Annon Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_FIELDS__ANNON_FIELDS = eINSTANCE.getannotationFields_AnnonFields();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__NAME = eINSTANCE.getannotationField_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_FIELD__EXPR = eINSTANCE.getannotationField_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__ACCESS = eINSTANCE.getInterface_Access();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__SUPERCLASS = eINSTANCE.getInterface_Superclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getInterfaceMethod()
     * @generated
     */
    EClass INTERFACE_METHOD = eINSTANCE.getInterfaceMethod();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD__MODIFIER = eINSTANCE.getInterfaceMethod_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_METHOD__NAME = eINSTANCE.getInterfaceMethod_Name();

    /**
     * The meta object literal for the '<em><b>Accessor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_METHOD__ACCESSOR = eINSTANCE.getInterfaceMethod_Accessor();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD__PARAMS = eINSTANCE.getInterfaceMethod_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD__TYPE = eINSTANCE.getInterfaceMethod_Type();

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
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MODIFIER = eINSTANCE.getClass_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_TYPE = eINSTANCE.getClass_SuperType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__TYPES = eINSTANCE.getClass_Types();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();

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
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__MODIFIER = eINSTANCE.getMethod_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Accessor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__ACCESSOR = eINSTANCE.getMethod_Accessor();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ModifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__FINAL = eINSTANCE.getModifier_Final();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__NATIVE = eINSTANCE.getModifier_Native();

    /**
     * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__DYNAMIC = eINSTANCE.getModifier_Dynamic();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__ACCESS = eINSTANCE.getModifier_Access();

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
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_BODY__STATEMENTS = eINSTANCE.getMethodBody_Statements();

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
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__ACCESS = eINSTANCE.getVariableDeclaration_Access();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VarTypeImpl <em>Var Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.VarTypeImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVarType()
     * @generated
     */
    EClass VAR_TYPE = eINSTANCE.getVarType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_TYPE__NAME = eINSTANCE.getVarType_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_TYPE__TYPE = eINSTANCE.getVarType_Type();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__LIT = eINSTANCE.getParameter_Lit();

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
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_LITERAL__FIELDS = eINSTANCE.getobjectLiteral_Fields();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldListImpl <em>field List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldList()
     * @generated
     */
    EClass FIELD_LIST = eINSTANCE.getfieldList();

    /**
     * The meta object literal for the '<em><b>Lf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__LF = eINSTANCE.getfieldList_Lf();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_LIST__FIELDS = eINSTANCE.getfieldList_Fields();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.literalFieldImpl <em>literal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.literalFieldImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getliteralField()
     * @generated
     */
    EClass LITERAL_FIELD = eINSTANCE.getliteralField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_FIELD__NAME = eINSTANCE.getliteralField_Name();

    /**
     * The meta object literal for the '<em><b>El</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_FIELD__EL = eINSTANCE.getliteralField_El();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldNameImpl <em>field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.fieldNameImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfieldName()
     * @generated
     */
    EClass FIELD_NAME = eINSTANCE.getfieldName();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__NUMBER = eINSTANCE.getfieldName_Number();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.elementImpl <em>element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.elementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getelement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getelement();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentImpl <em>qualified Ident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifiedIdent()
     * @generated
     */
    EClass QUALIFIED_IDENT = eINSTANCE.getqualifiedIdent();

    /**
     * The meta object literal for the '<em><b>Ide</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_IDENT__IDE = eINSTANCE.getqualifiedIdent_Ide();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl <em>identi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidenti()
     * @generated
     */
    EClass IDENTI = eINSTANCE.getidenti();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTI__I = eINSTANCE.getidenti_I();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTI__TYPE = eINSTANCE.getidenti_Type();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTI__VAR = eINSTANCE.getidenti_Var();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTI__BLOCK = eINSTANCE.getidenti_Block();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl <em>identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getidentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getidentifier();

    /**
     * The meta object literal for the '<em><b>Qual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER__QUAL = eINSTANCE.getidentifier_Qual();

    /**
     * The meta object literal for the '<em><b>Poi</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER__POI = eINSTANCE.getidentifier_Poi();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.propertyIdentifierImpl <em>property Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.propertyIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpropertyIdentifier()
     * @generated
     */
    EClass PROPERTY_IDENTIFIER = eINSTANCE.getpropertyIdentifier();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifierImpl <em>qualifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifier()
     * @generated
     */
    EClass QUALIFIER = eINSTANCE.getqualifier();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIER__LEVEL = eINSTANCE.getqualifier_Level();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl <em>simple Qualified Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getsimpleQualifiedIdentifier()
     * @generated
     */
    EClass SIMPLE_QUALIFIED_IDENTIFIER = eINSTANCE.getsimpleQualifiedIdentifier();

    /**
     * The meta object literal for the '<em><b>Pro Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID = eINSTANCE.getsimpleQualifiedIdentifier_ProId();

    /**
     * The meta object literal for the '<em><b>Qual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_QUALIFIED_IDENTIFIER__QUAL = eINSTANCE.getsimpleQualifiedIdentifier_Qual();

    /**
     * The meta object literal for the '<em><b>Piden</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_QUALIFIED_IDENTIFIER__PIDEN = eINSTANCE.getsimpleQualifiedIdentifier_Piden();

    /**
     * The meta object literal for the '<em><b>Bra</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_QUALIFIED_IDENTIFIER__BRA = eINSTANCE.getsimpleQualifiedIdentifier_Bra();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.expressionQualifiedIdentifierImpl <em>expression Qualified Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.expressionQualifiedIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpressionQualifiedIdentifier()
     * @generated
     */
    EClass EXPRESSION_QUALIFIED_IDENTIFIER = eINSTANCE.getexpressionQualifiedIdentifier();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.nonAttributeQualifiedIdentifierImpl <em>non Attribute Qualified Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.nonAttributeQualifiedIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnonAttributeQualifiedIdentifier()
     * @generated
     */
    EClass NON_ATTRIBUTE_QUALIFIED_IDENTIFIER = eINSTANCE.getnonAttributeQualifiedIdentifier();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentifierImpl <em>qualified Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getqualifiedIdentifier()
     * @generated
     */
    EClass QUALIFIED_IDENTIFIER = eINSTANCE.getqualifiedIdentifier();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.namespaceNameImpl <em>namespace Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.namespaceNameImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnamespaceName()
     * @generated
     */
    EClass NAMESPACE_NAME = eINSTANCE.getnamespaceName();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_NAME__LEVEL = eINSTANCE.getnamespaceName_Level();

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
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__LIST = eINSTANCE.getarrayLiteral_List();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.elementListImpl <em>element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.elementListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getelementList()
     * @generated
     */
    EClass ELEMENT_LIST = eINSTANCE.getelementList();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.nonemptyElementListImpl <em>nonempty Element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.nonemptyElementListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnonemptyElementList()
     * @generated
     */
    EClass NONEMPTY_ELEMENT_LIST = eINSTANCE.getnonemptyElementList();

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
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__L = eINSTANCE.getExpression_L();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.expressionListImpl <em>expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.expressionListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getexpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getexpressionList();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPR = eINSTANCE.getexpressionList_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl <em>assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getassignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getassignmentExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__EXPR = eINSTANCE.getassignmentExpression_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.conditionalExpressionImpl <em>conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.conditionalExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getconditionalExpression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getconditionalExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_EXPRESSION__OP = eINSTANCE.getconditionalExpression_Op();

    /**
     * The meta object literal for the '<em><b>Aexpr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__AEXPR = eINSTANCE.getconditionalExpression_Aexpr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.conditionalSubExpressionImpl <em>conditional Sub Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.conditionalSubExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getconditionalSubExpression()
     * @generated
     */
    EClass CONDITIONAL_SUB_EXPRESSION = eINSTANCE.getconditionalSubExpression();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_SUB_EXPRESSION__EXPR1 = eINSTANCE.getconditionalSubExpression_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_SUB_EXPRESSION__EXPR2 = eINSTANCE.getconditionalSubExpression_Expr2();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.logicalOrExpressionImpl <em>logical Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.logicalOrExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlogicalOrExpression()
     * @generated
     */
    EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getlogicalOrExpression();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPRESSION__COND = eINSTANCE.getlogicalOrExpression_Cond();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_OR_EXPRESSION__O = eINSTANCE.getlogicalOrExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.logicalAndExpressionImpl <em>logical And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.logicalAndExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getlogicalAndExpression()
     * @generated
     */
    EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getlogicalAndExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPRESSION__EXPR = eINSTANCE.getlogicalAndExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_AND_EXPRESSION__O = eINSTANCE.getlogicalAndExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseOrExpressionImpl <em>bitwise Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseOrExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseOrExpression()
     * @generated
     */
    EClass BITWISE_OR_EXPRESSION = eINSTANCE.getbitwiseOrExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_OR_EXPRESSION__EXPR = eINSTANCE.getbitwiseOrExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITWISE_OR_EXPRESSION__O = eINSTANCE.getbitwiseOrExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseXorExpressionImpl <em>bitwise Xor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseXorExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseXorExpression()
     * @generated
     */
    EClass BITWISE_XOR_EXPRESSION = eINSTANCE.getbitwiseXorExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_XOR_EXPRESSION__EXPR = eINSTANCE.getbitwiseXorExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITWISE_XOR_EXPRESSION__O = eINSTANCE.getbitwiseXorExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseAndExpressionImpl <em>bitwise And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.bitwiseAndExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbitwiseAndExpression()
     * @generated
     */
    EClass BITWISE_AND_EXPRESSION = eINSTANCE.getbitwiseAndExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_AND_EXPRESSION__EXPR = eINSTANCE.getbitwiseAndExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITWISE_AND_EXPRESSION__O = eINSTANCE.getbitwiseAndExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.equalityExpressionImpl <em>equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.equalityExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getequalityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getequalityExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__EXPR = eINSTANCE.getequalityExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__O = eINSTANCE.getequalityExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.relationalExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getrelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getrelationalExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__EXPR = eINSTANCE.getrelationalExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__O = eINSTANCE.getrelationalExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.shiftExpressionImpl <em>shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.shiftExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getshiftExpression()
     * @generated
     */
    EClass SHIFT_EXPRESSION = eINSTANCE.getshiftExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__EXPR = eINSTANCE.getshiftExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_EXPRESSION__O = eINSTANCE.getshiftExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.additiveExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getadditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getadditiveExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__EXPR = eINSTANCE.getadditiveExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__O = eINSTANCE.getadditiveExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl <em>multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getmultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getmultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__EXPR = eINSTANCE.getmultiplicativeExpression_Expr();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPRESSION__O = eINSTANCE.getmultiplicativeExpression_O();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getunaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getunaryExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getunaryExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Uaem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__UAEM = eINSTANCE.getunaryExpression_Uaem();

    /**
     * The meta object literal for the '<em><b>Uaep</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__UAEP = eINSTANCE.getunaryExpression_Uaep();

    /**
     * The meta object literal for the '<em><b>Uaenpm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__UAENPM = eINSTANCE.getunaryExpression_Uaenpm();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl <em>unary Expression Not Plus Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getunaryExpressionNotPlusMinus()
     * @generated
     */
    EClass UNARY_EXPRESSION_NOT_PLUS_MINUS = eINSTANCE.getunaryExpressionNotPlusMinus();

    /**
     * The meta object literal for the '<em><b>In</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION_NOT_PLUS_MINUS__IN = eINSTANCE.getunaryExpressionNotPlusMinus_In();

    /**
     * The meta object literal for the '<em><b>De</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION_NOT_PLUS_MINUS__DE = eINSTANCE.getunaryExpressionNotPlusMinus_De();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl <em>postfix Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpostfixExpression()
     * @generated
     */
    EClass POSTFIX_EXPRESSION = eINSTANCE.getpostfixExpression();

    /**
     * The meta object literal for the '<em><b>Peexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__PEEXPR = eINSTANCE.getpostfixExpression_Peexpr();

    /**
     * The meta object literal for the '<em><b>Pepoi</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__PEPOI = eINSTANCE.getpostfixExpression_Pepoi();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__EXPR = eINSTANCE.getpostfixExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Pewi</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__PEWI = eINSTANCE.getpostfixExpression_Pewi();

    /**
     * The meta object literal for the '<em><b>E4x</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__E4X = eINSTANCE.getpostfixExpression_E4x();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__ARGS = eINSTANCE.getpostfixExpression_Args();

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
     * The meta object literal for the '<em><b>Expr List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__EXPR_LIST = eINSTANCE.getarguments_ExprList();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl <em>e4x Attribute Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gete4xAttributeIdentifier()
     * @generated
     */
    EClass E4X_ATTRIBUTE_IDENTIFIER = eINSTANCE.gete4xAttributeIdentifier();

    /**
     * The meta object literal for the '<em><b>Qual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E4X_ATTRIBUTE_IDENTIFIER__QUAL = eINSTANCE.gete4xAttributeIdentifier_Qual();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference E4X_ATTRIBUTE_IDENTIFIER__EXPR = eINSTANCE.gete4xAttributeIdentifier_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl <em>primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getprimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getprimaryExpression();

    /**
     * The meta object literal for the '<em><b>Super Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__SUPER_EXPR = eINSTANCE.getprimaryExpression_SuperExpr();

    /**
     * The meta object literal for the '<em><b>Con</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__CON = eINSTANCE.getprimaryExpression_Con();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__LIT = eINSTANCE.getprimaryExpression_Lit();

    /**
     * The meta object literal for the '<em><b>Fexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__FEXPR = eINSTANCE.getprimaryExpression_Fexpr();

    /**
     * The meta object literal for the '<em><b>Nexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__NEXPR = eINSTANCE.getprimaryExpression_Nexpr();

    /**
     * The meta object literal for the '<em><b>Encexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__ENCEXPR = eINSTANCE.getprimaryExpression_Encexpr();

    /**
     * The meta object literal for the '<em><b>E4x</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__E4X = eINSTANCE.getprimaryExpression_E4x();

    /**
     * The meta object literal for the '<em><b>Qual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__QUAL = eINSTANCE.getprimaryExpression_Qual();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.propOrIdentImpl <em>prop Or Ident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.propOrIdentImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getpropOrIdent()
     * @generated
     */
    EClass PROP_OR_IDENT = eINSTANCE.getpropOrIdent();

    /**
     * The meta object literal for the '<em><b>Prop Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROP_OR_IDENT__PROP_ID = eINSTANCE.getpropOrIdent_PropId();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.regexpLiteralImpl <em>regexp Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.regexpLiteralImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getregexpLiteral()
     * @generated
     */
    EClass REGEXP_LITERAL = eINSTANCE.getregexpLiteral();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGEXP_LITERAL__S = eINSTANCE.getregexpLiteral_S();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.newExpressionImpl <em>new Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.newExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnewExpression()
     * @generated
     */
    EClass NEW_EXPRESSION = eINSTANCE.getnewExpression();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl <em>full New Subexpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfullNewSubexpression()
     * @generated
     */
    EClass FULL_NEW_SUBEXPRESSION = eINSTANCE.getfullNewSubexpression();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_NEW_SUBEXPRESSION__ARGS = eINSTANCE.getfullNewSubexpression_Args();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_NEW_SUBEXPRESSION__EXPR = eINSTANCE.getfullNewSubexpression_Expr();

    /**
     * The meta object literal for the '<em><b>Fnsd</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_NEW_SUBEXPRESSION__FNSD = eINSTANCE.getfullNewSubexpression_Fnsd();

    /**
     * The meta object literal for the '<em><b>Quali</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_NEW_SUBEXPRESSION__QUALI = eINSTANCE.getfullNewSubexpression_Quali();

    /**
     * The meta object literal for the '<em><b>Brack</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULL_NEW_SUBEXPRESSION__BRACK = eINSTANCE.getfullNewSubexpression_Brack();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.bracketsImpl <em>brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.bracketsImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbrackets()
     * @generated
     */
    EClass BRACKETS = eINSTANCE.getbrackets();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl <em>encapsulated Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getencapsulatedExpression()
     * @generated
     */
    EClass ENCAPSULATED_EXPRESSION = eINSTANCE.getencapsulatedExpression();

    /**
     * The meta object literal for the '<em><b>Pden</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENCAPSULATED_EXPRESSION__PDEN = eINSTANCE.getencapsulatedExpression_Pden();

    /**
     * The meta object literal for the '<em><b>Bra</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENCAPSULATED_EXPRESSION__BRA = eINSTANCE.getencapsulatedExpression_Bra();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionSignatureImpl <em>function Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionSignatureImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionSignature()
     * @generated
     */
    EClass FUNCTION_SIGNATURE = eINSTANCE.getfunctionSignature();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__PARAM = eINSTANCE.getfunctionSignature_Param();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_SIGNATURE__TYPE = eINSTANCE.getfunctionSignature_Type();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeExpressionImpl <em>type Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.typeExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettypeExpression()
     * @generated
     */
    EClass TYPE_EXPRESSION = eINSTANCE.gettypeExpression();

    /**
     * The meta object literal for the '<em><b>Identi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__IDENTI = eINSTANCE.gettypeExpression_Identi();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationListImpl <em>parameter Declaration List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDeclarationList()
     * @generated
     */
    EClass PARAMETER_DECLARATION_LIST = eINSTANCE.getparameterDeclarationList();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION_LIST__PARAMS = eINSTANCE.getparameterDeclarationList_Params();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationImpl <em>parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getparameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__NAME = eINSTANCE.getparameterDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.basicParameterDeclarationImpl <em>basic Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.basicParameterDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getbasicParameterDeclaration()
     * @generated
     */
    EClass BASIC_PARAMETER_DECLARATION = eINSTANCE.getbasicParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_PARAMETER_DECLARATION__TYPE = eINSTANCE.getbasicParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_PARAMETER_DECLARATION__PARAM = eINSTANCE.getbasicParameterDeclaration_Param();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterDefaultImpl <em>parameter Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterDefaultImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterDefault()
     * @generated
     */
    EClass PARAMETER_DEFAULT = eINSTANCE.getparameterDefault();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.parameterRestDeclarationImpl <em>parameter Rest Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.parameterRestDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getparameterRestDeclaration()
     * @generated
     */
    EClass PARAMETER_REST_DECLARATION = eINSTANCE.getparameterRestDeclaration();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ConditionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__SWITCH = eINSTANCE.getCondition_Switch();

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
     * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ASSERT = eINSTANCE.getStatement_Assert();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DefaultXMLNamespaceStatementImpl <em>Default XML Namespace Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.DefaultXMLNamespaceStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDefaultXMLNamespaceStatement()
     * @generated
     */
    EClass DEFAULT_XML_NAMESPACE_STATEMENT = eINSTANCE.getDefaultXMLNamespaceStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDeclarationStatement()
     * @generated
     */
    EClass DECLARATION_STATEMENT = eINSTANCE.getDeclarationStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclaratorImpl <em>variable Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableDeclaratorImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableDeclarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getvariableDeclarator();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__TAIL = eINSTANCE.getvariableDeclarator_Tail();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.DeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.declarationTailImpl <em>declaration Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.declarationTailImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getdeclarationTail()
     * @generated
     */
    EClass DECLARATION_TAIL = eINSTANCE.getdeclarationTail();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_TAIL__VAR = eINSTANCE.getdeclarationTail_Var();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.variableInitializerImpl <em>variable Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.variableInitializerImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getvariableInitializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getvariableInitializer();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__EXPR = eINSTANCE.getvariableInitializer_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getExpressionStatement()
     * @generated
     */
    EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

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
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__COND = eINSTANCE.getIfStatement_Cond();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__STATEMENT = eINSTANCE.getIfStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE = eINSTANCE.getIfStatement_Else();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ThrowStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getThrowStatement()
     * @generated
     */
    EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

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
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__BLOCK = eINSTANCE.getTryStatement_Block();

    /**
     * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY = eINSTANCE.getTryStatement_Finally();

    /**
     * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__CATCH = eINSTANCE.getTryStatement_Catch();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.catchBlockImpl <em>catch Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.catchBlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getcatchBlock()
     * @generated
     */
    EClass CATCH_BLOCK = eINSTANCE.getcatchBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.finallyBlockImpl <em>finally Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.finallyBlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfinallyBlock()
     * @generated
     */
    EClass FINALLY_BLOCK = eINSTANCE.getfinallyBlock();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ReturnStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPR = eINSTANCE.getReturnStatement_Expr();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl <em>switch Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getswitchBlock()
     * @generated
     */
    EClass SWITCH_BLOCK = eINSTANCE.getswitchBlock();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_BLOCK__CASE = eINSTANCE.getswitchBlock_Case();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_BLOCK__DEF = eINSTANCE.getswitchBlock_Def();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.CaseStatementImpl <em>Case Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.CaseStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getCaseStatement()
     * @generated
     */
    EClass CASE_STATEMENT = eINSTANCE.getCaseStatement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.DefaultStatementImpl <em>Default Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.DefaultStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getDefaultStatement()
     * @generated
     */
    EClass DEFAULT_STATEMENT = eINSTANCE.getDefaultStatement();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_STATEMENT__L = eINSTANCE.getDefaultStatement_L();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchStatementListImpl <em>switch Statement List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.switchStatementListImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getswitchStatementList()
     * @generated
     */
    EClass SWITCH_STATEMENT_LIST = eINSTANCE.getswitchStatementList();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT_LIST__STATEMENTS = eINSTANCE.getswitchStatementList_Statements();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getForEachStatement()
     * @generated
     */
    EClass FOR_EACH_STATEMENT = eINSTANCE.getForEachStatement();

    /**
     * The meta object literal for the '<em><b>Fesfor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_STATEMENT__FESFOR = eINSTANCE.getForEachStatement_Fesfor();

    /**
     * The meta object literal for the '<em><b>Fes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_STATEMENT__FES = eINSTANCE.getForEachStatement_Fes();

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
     * The meta object literal for the '<em><b>For In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_IN = eINSTANCE.getForStatement_ForIn();

    /**
     * The meta object literal for the '<em><b>Fsstate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FSSTATE = eINSTANCE.getForStatement_Fsstate();

    /**
     * The meta object literal for the '<em><b>Traditional For Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE = eINSTANCE.getForStatement_TraditionalForClause();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.traditionalForClauseImpl <em>traditional For Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.traditionalForClauseImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#gettraditionalForClause()
     * @generated
     */
    EClass TRADITIONAL_FOR_CLAUSE = eINSTANCE.gettraditionalForClause();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRADITIONAL_FOR_CLAUSE__A = eINSTANCE.gettraditionalForClause_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRADITIONAL_FOR_CLAUSE__B = eINSTANCE.gettraditionalForClause_B();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRADITIONAL_FOR_CLAUSE__C = eINSTANCE.gettraditionalForClause_C();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl <em>for In Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClause()
     * @generated
     */
    EClass FOR_IN_CLAUSE = eINSTANCE.getforInClause();

    /**
     * The meta object literal for the '<em><b>Ficdecl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_IN_CLAUSE__FICDECL = eINSTANCE.getforInClause_Ficdecl();

    /**
     * The meta object literal for the '<em><b>Fictail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_IN_CLAUSE__FICTAIL = eINSTANCE.getforInClause_Fictail();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseDeclImpl <em>for In Clause Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseDeclImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClauseDecl()
     * @generated
     */
    EClass FOR_IN_CLAUSE_DECL = eINSTANCE.getforInClauseDecl();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseTailImpl <em>for In Clause Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseTailImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInClauseTail()
     * @generated
     */
    EClass FOR_IN_CLAUSE_TAIL = eINSTANCE.getforInClauseTail();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInitImpl <em>for Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forInitImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforInit()
     * @generated
     */
    EClass FOR_INIT = eINSTANCE.getforInit();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT__DECL = eINSTANCE.getforInit_Decl();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT__EXPR = eINSTANCE.getforInit_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forCondImpl <em>for Cond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forCondImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforCond()
     * @generated
     */
    EClass FOR_COND = eINSTANCE.getforCond();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_COND__EXPR = eINSTANCE.getforCond_Expr();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.forIterImpl <em>for Iter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.forIterImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getforIter()
     * @generated
     */
    EClass FOR_ITER = eINSTANCE.getforIter();

    /**
     * The meta object literal for the '<em><b>Fiexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ITER__FIEXPR = eINSTANCE.getforIter_Fiexpr();

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
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__COND = eINSTANCE.getWhileStatement_Cond();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getWhileStatement_Statement();

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
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE_STATEMENT__STATE = eINSTANCE.getDoWhileStatement_State();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE_STATEMENT__COND = eINSTANCE.getDoWhileStatement_Cond();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.WithStatementImpl <em>With Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.WithStatementImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getWithStatement()
     * @generated
     */
    EClass WITH_STATEMENT = eINSTANCE.getWithStatement();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__COND = eINSTANCE.getWithStatement_Cond();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATEMENT__STATEMENT = eINSTANCE.getWithStatement_Statement();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionCommonImpl <em>function Common</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionCommonImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionCommon()
     * @generated
     */
    EClass FUNCTION_COMMON = eINSTANCE.getfunctionCommon();

    /**
     * The meta object literal for the '<em><b>Sig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_COMMON__SIG = eINSTANCE.getfunctionCommon_Sig();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_COMMON__BLOCK = eINSTANCE.getfunctionCommon_Block();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.functionExpressionImpl <em>function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.functionExpressionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getfunctionExpression()
     * @generated
     */
    EClass FUNCTION_EXPRESSION = eINSTANCE.getfunctionExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_EXPRESSION__NAME = eINSTANCE.getfunctionExpression_Name();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__FUNC = eINSTANCE.getfunctionExpression_Func();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.XmlConstantImpl <em>Xml Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.XmlConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getXmlConstant()
     * @generated
     */
    EClass XML_CONSTANT = eINSTANCE.getXmlConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_CONSTANT__VALUE = eINSTANCE.getXmlConstant_Value();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.RegexpConstantImpl <em>Regexp Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.RegexpConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getRegexpConstant()
     * @generated
     */
    EClass REGEXP_CONSTANT = eINSTANCE.getRegexpConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEXP_CONSTANT__VALUE = eINSTANCE.getRegexpConstant_Value();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NumberConstantImpl <em>Number Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.NumberConstantImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNumberConstant()
     * @generated
     */
    EClass NUMBER_CONSTANT = eINSTANCE.getNumberConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_CONSTANT__VALUE = eINSTANCE.getNumberConstant_Value();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.NullImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

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
