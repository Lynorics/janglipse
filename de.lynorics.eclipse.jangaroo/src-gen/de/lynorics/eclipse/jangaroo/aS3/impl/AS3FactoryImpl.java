/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Factory;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.ActionScript;
import de.lynorics.eclipse.jangaroo.aS3.Function;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.PackageDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Property;
import de.lynorics.eclipse.jangaroo.aS3.Type;
import de.lynorics.eclipse.jangaroo.aS3.UNIT;
import de.lynorics.eclipse.jangaroo.aS3.Variables;
import de.lynorics.eclipse.jangaroo.aS3._String;
import de.lynorics.eclipse.jangaroo.aS3._int;
import de.lynorics.eclipse.jangaroo.aS3.number;

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
      case AS3Package.PACKAGE_DECLARATION: return createPackageDeclaration();
      case AS3Package.ACTION_SCRIPT: return createActionScript();
      case AS3Package.IMPORT: return createImport();
      case AS3Package.TYPE: return createType();
      case AS3Package.PROPERTY: return createProperty();
      case AS3Package.CLASS: return createClass();
      case AS3Package.FUNCTION: return createFunction();
      case AS3Package.VARIABLES: return createVariables();
      case AS3Package.UNIT: return createUNIT();
      case AS3Package._STRING: return create_String();
      case AS3Package._INT: return create_int();
      case AS3Package.NUMBER: return createnumber();
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
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionScript createActionScript()
  {
    ActionScriptImpl actionScript = new ActionScriptImpl();
    return actionScript;
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
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
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
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNIT createUNIT()
  {
    UNITImpl unit = new UNITImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public _String create_String()
  {
    _StringImpl _String = new _StringImpl();
    return _String;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public _int create_int()
  {
    _intImpl _int = new _intImpl();
    return _int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
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
