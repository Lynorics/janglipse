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
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.PackageDeclarationImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elemnts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMNTS = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ActionScriptImpl <em>Action Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ActionScriptImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getActionScript()
   * @generated
   */
  int ACTION_SCRIPT = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SCRIPT__IMPORTS = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SCRIPT__ELEMENTS = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SCRIPT_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Import URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.TypeImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.PropertyImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.ClassImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getClass_()
   * @generated
   */
  int CLASS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_CLASS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.FunctionImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.VariablesImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.UNITImpl <em>UNIT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.UNITImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getUNIT()
   * @generated
   */
  int UNIT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__NAME = VARIABLES__NAME;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__STRING = VARIABLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UNIT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = VARIABLES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl._StringImpl <em>String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl._StringImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#get_String()
   * @generated
   */
  int _STRING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _STRING__NAME = VARIABLES__NAME;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _STRING__STRING = VARIABLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _STRING_FEATURE_COUNT = VARIABLES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl._intImpl <em>int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl._intImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#get_int()
   * @generated
   */
  int _INT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _INT__NAME = VARIABLES__NAME;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _INT__INT = VARIABLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int _INT_FEATURE_COUNT = VARIABLES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.numberImpl <em>number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.numberImpl
   * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnumber()
   * @generated
   */
  int NUMBER = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__NAME = VARIABLES__NAME;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__DOUBLE = VARIABLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = VARIABLES_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration#getElemnts <em>Elemnts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elemnts</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration#getElemnts()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elemnts();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.ActionScript <em>Action Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Script</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ActionScript
   * @generated
   */
  EClass getActionScript();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.ActionScript#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ActionScript#getImports()
   * @see #getActionScript()
   * @generated
   */
  EReference getActionScript_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.ActionScript#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.ActionScript#getElements()
   * @see #getActionScript()
   * @generated
   */
  EReference getActionScript_Elements();

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
   * Returns the meta object for the containment reference '{@link de.lynorics.eclipse.jangaroo.aS3.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import URI</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Property
   * @generated
   */
  EClass getProperty();

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
   * Returns the meta object for the reference '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Class</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getSuperClass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperClass();

  /**
   * Returns the meta object for the containment reference list '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class#getProperties()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Properties();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.Variables#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.Variables#getName()
   * @see #getVariables()
   * @generated
   */
  EAttribute getVariables_Name();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.UNIT <em>UNIT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNIT</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.UNIT
   * @generated
   */
  EClass getUNIT();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.UNIT#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.UNIT#getString()
   * @see #getUNIT()
   * @generated
   */
  EAttribute getUNIT_String();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3._String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3._String
   * @generated
   */
  EClass get_String();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3._String#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3._String#getString()
   * @see #get_String()
   * @generated
   */
  EAttribute get_String_String();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3._int <em>int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>int</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3._int
   * @generated
   */
  EClass get_int();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3._int#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3._int#getInt()
   * @see #get_int()
   * @generated
   */
  EAttribute get_int_Int();

  /**
   * Returns the meta object for class '{@link de.lynorics.eclipse.jangaroo.aS3.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>number</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.number
   * @generated
   */
  EClass getnumber();

  /**
   * Returns the meta object for the attribute '{@link de.lynorics.eclipse.jangaroo.aS3.number#getDouble <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double</em>'.
   * @see de.lynorics.eclipse.jangaroo.aS3.number#getDouble()
   * @see #getnumber()
   * @generated
   */
  EAttribute getnumber_Double();

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
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.PackageDeclarationImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elemnts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMNTS = eINSTANCE.getPackageDeclaration_Elemnts();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.ActionScriptImpl <em>Action Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.ActionScriptImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getActionScript()
     * @generated
     */
    EClass ACTION_SCRIPT = eINSTANCE.getActionScript();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SCRIPT__IMPORTS = eINSTANCE.getActionScript_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SCRIPT__ELEMENTS = eINSTANCE.getActionScript_Elements();

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
     * The meta object literal for the '<em><b>Import URI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.TypeImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.PropertyImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.FunctionImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.VariablesImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLES__NAME = eINSTANCE.getVariables_Name();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.UNITImpl <em>UNIT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.UNITImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getUNIT()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUNIT();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__STRING = eINSTANCE.getUNIT_String();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl._StringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl._StringImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#get_String()
     * @generated
     */
    EClass _STRING = eINSTANCE.get_String();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute _STRING__STRING = eINSTANCE.get_String_String();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl._intImpl <em>int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl._intImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#get_int()
     * @generated
     */
    EClass _INT = eINSTANCE.get_int();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute _INT__INT = eINSTANCE.get_int_Int();

    /**
     * The meta object literal for the '{@link de.lynorics.eclipse.jangaroo.aS3.impl.numberImpl <em>number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.numberImpl
     * @see de.lynorics.eclipse.jangaroo.aS3.impl.AS3PackageImpl#getnumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getnumber();

    /**
     * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__DOUBLE = eINSTANCE.getnumber_Double();

  }

} //AS3Package
