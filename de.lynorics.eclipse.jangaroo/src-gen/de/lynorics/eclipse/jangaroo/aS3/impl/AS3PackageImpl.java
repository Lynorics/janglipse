/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Factory;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.arrayLiteral;
import de.lynorics.eclipse.jangaroo.aS3.block;
import de.lynorics.eclipse.jangaroo.aS3.catches;
import de.lynorics.eclipse.jangaroo.aS3.classBody;
import de.lynorics.eclipse.jangaroo.aS3.classDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnit;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.directives;
import de.lynorics.eclipse.jangaroo.aS3.expr;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.labelableStatement;
import de.lynorics.eclipse.jangaroo.aS3.lvalue;
import de.lynorics.eclipse.jangaroo.aS3.memberDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.methodDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.modifiers;
import de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.optBody;
import de.lynorics.eclipse.jangaroo.aS3.packageDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.parameter;
import de.lynorics.eclipse.jangaroo.aS3.parameters;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statement;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;
import de.lynorics.eclipse.jangaroo.aS3.statements;
import de.lynorics.eclipse.jangaroo.aS3.staticInitializer;
import de.lynorics.eclipse.jangaroo.aS3.typeList;
import de.lynorics.eclipse.jangaroo.aS3.variableDeclaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AS3PackageImpl extends EPackageImpl implements AS3Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonFunctionExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationFieldsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass catchesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commaExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directivesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprOrObjectLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lvalueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedFunctionExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespacedIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectFieldsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementInSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#eNS_URI
   * @see #init()
   * @generated
   */
  private AS3PackageImpl()
  {
    super(eNS_URI, AS3Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AS3Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AS3Package init()
  {
    if (isInited) return (AS3Package)EPackage.Registry.INSTANCE.getEPackage(AS3Package.eNS_URI);

    // Obtain or create and register package
    AS3PackageImpl theAS3Package = (AS3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AS3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AS3PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAS3Package.createPackageContents();

    // Initialize created meta-data
    theAS3Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAS3Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AS3Package.eNS_URI, theAS3Package);
    return theAS3Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getanonFunctionExpr()
  {
    return anonFunctionExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getanonFunctionExpr_Params()
  {
    return (EReference)anonFunctionExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getanonFunctionExpr_Relation()
  {
    return (EAttribute)anonFunctionExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getanonFunctionExpr_Command()
  {
    return (EReference)anonFunctionExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getannotationFields()
  {
    return annotationFieldsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getannotationFields_Fields()
  {
    return (EReference)annotationFieldsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getannotationField()
  {
    return annotationFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarguments()
  {
    return argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarguments_Elements()
  {
    return (EReference)argumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarrayLiteral()
  {
    return arrayLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getblock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcatches()
  {
    return catchesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcatches_Params()
  {
    return (EReference)catchesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcatches_Command()
  {
    return (EReference)catchesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclassBody()
  {
    return classBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassBody_Elements()
  {
    return (EReference)classBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclassDeclaration()
  {
    return classDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassDeclaration_ClassModifiers()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getclassDeclaration_Name()
  {
    return (EAttribute)classDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassDeclaration_SuperType()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getclassDeclaration_Types()
  {
    return (EAttribute)classDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassDeclaration_Command()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcommaExpr()
  {
    return commaExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcommaExpr_Elements()
  {
    return (EReference)commaExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompilationUnit()
  {
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilationUnit_Package()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilationUnit_Directive()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilationUnit_Unit()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompilationUnitDeclaration()
  {
    return compilationUnitDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilationUnitDeclaration_Class()
  {
    return (EReference)compilationUnitDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompilationUnitDeclaration_Member()
  {
    return (EReference)compilationUnitDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdirectives()
  {
    return directivesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdirectives_Elements()
  {
    return (EReference)directivesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdirective()
  {
    return directiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdirective_ImportedNamespace()
  {
    return (EAttribute)directiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdirective_Id()
  {
    return (EAttribute)directiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdirective_Fields()
  {
    return (EReference)directiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdirective_Useasid()
  {
    return (EAttribute)directiveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Expr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Deleteexpr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Typeexpr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpr_Type()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Isleftepxr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Isrightexpr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Prefixexpr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Postfixexpr()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Infixexprleft()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Infixexprright()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Args()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Condition()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Then()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_Else()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexprOrObjectLiteral()
  {
    return exprOrObjectLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfieldDeclaration()
  {
    return fieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfieldDeclaration_Mod()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfieldDeclaration_Var()
  {
    return (EAttribute)fieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfieldDeclaration_Elements()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getidentifierDeclaration()
  {
    return identifierDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getidentifierDeclaration_Name()
  {
    return (EAttribute)identifierDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getidentifierDeclaration_Relation()
  {
    return (EAttribute)identifierDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getidentifierDeclaration_Expr()
  {
    return (EReference)identifierDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabelableStatement()
  {
    return labelableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Ifcondition()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Ifthen()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Ifelse()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Condition()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Elements()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Command()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Forinit()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Iterator()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabelableStatement_NameForin()
  {
    return (EAttribute)labelableStatementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Forinexpr()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Forcommand()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabelableStatement_NameForeachh()
  {
    return (EAttribute)labelableStatementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabelableStatement_Relation()
  {
    return (EAttribute)labelableStatementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Foreachexpr()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Foreachcommand()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Catch()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Finally()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelableStatement_Function()
  {
    return (EReference)labelableStatementEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlvalue()
  {
    return lvalueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlvalue_Expression()
  {
    return (EReference)lvalueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlvalue_Identifier()
  {
    return (EReference)lvalueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlvalue_List()
  {
    return (EReference)lvalueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmemberDeclaration()
  {
    return memberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmemberDeclaration_Field()
  {
    return (EReference)memberDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmemberDeclaration_Method()
  {
    return (EReference)memberDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmethodDeclaration()
  {
    return methodDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethodDeclaration_Methodmodifiers()
  {
    return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmethodDeclaration_Name()
  {
    return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethodDeclaration_Params()
  {
    return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethodDeclaration_Optbody()
  {
    return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmodifiers()
  {
    return modifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Static()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Final()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Abstract()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Override()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Internal()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Public()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Private()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Protected()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnamedFunctionExpr()
  {
    return namedFunctionExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnamedFunctionExpr_Params()
  {
    return (EReference)namedFunctionExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnamedFunctionExpr_Relation()
  {
    return (EAttribute)namedFunctionExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnamedFunctionExpr_Command()
  {
    return (EReference)namedFunctionExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnamespacedIdentifier()
  {
    return namespacedIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getobjectField()
  {
    return objectFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getobjectFields()
  {
    return objectFieldsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getobjectFields_Fields()
  {
    return (EReference)objectFieldsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getobjectLiteral()
  {
    return objectLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoptBody()
  {
    return optBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameters()
  {
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameters_Elements()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameters_Name()
  {
    return (EAttribute)parametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparenthesizedExpr()
  {
    return parenthesizedExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparenthesizedExpr_Expression()
  {
    return (EReference)parenthesizedExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Expr()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstatement_Name()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Variables()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Argument()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatements()
  {
    return statementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatements_Elements()
  {
    return (EReference)statementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatementInSwitch()
  {
    return statementInSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstaticInitializer()
  {
    return staticInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettypeList()
  {
    return typeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettypeList_Elements()
  {
    return (EAttribute)typeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariableDeclaration_Elements()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3Factory getAS3Factory()
  {
    return (AS3Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    anonFunctionExprEClass = createEClass(ANON_FUNCTION_EXPR);
    createEReference(anonFunctionExprEClass, ANON_FUNCTION_EXPR__PARAMS);
    createEAttribute(anonFunctionExprEClass, ANON_FUNCTION_EXPR__RELATION);
    createEReference(anonFunctionExprEClass, ANON_FUNCTION_EXPR__COMMAND);

    annotationFieldsEClass = createEClass(ANNOTATION_FIELDS);
    createEReference(annotationFieldsEClass, ANNOTATION_FIELDS__FIELDS);

    annotationFieldEClass = createEClass(ANNOTATION_FIELD);

    argumentsEClass = createEClass(ARGUMENTS);
    createEReference(argumentsEClass, ARGUMENTS__ELEMENTS);

    arrayLiteralEClass = createEClass(ARRAY_LITERAL);

    blockEClass = createEClass(BLOCK);

    catchesEClass = createEClass(CATCHES);
    createEReference(catchesEClass, CATCHES__PARAMS);
    createEReference(catchesEClass, CATCHES__COMMAND);

    classBodyEClass = createEClass(CLASS_BODY);
    createEReference(classBodyEClass, CLASS_BODY__ELEMENTS);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_MODIFIERS);
    createEAttribute(classDeclarationEClass, CLASS_DECLARATION__NAME);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPER_TYPE);
    createEAttribute(classDeclarationEClass, CLASS_DECLARATION__TYPES);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__COMMAND);

    commaExprEClass = createEClass(COMMA_EXPR);
    createEReference(commaExprEClass, COMMA_EXPR__ELEMENTS);

    compilationUnitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__PACKAGE);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__DIRECTIVE);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__UNIT);

    compilationUnitDeclarationEClass = createEClass(COMPILATION_UNIT_DECLARATION);
    createEReference(compilationUnitDeclarationEClass, COMPILATION_UNIT_DECLARATION__CLASS);
    createEReference(compilationUnitDeclarationEClass, COMPILATION_UNIT_DECLARATION__MEMBER);

    directivesEClass = createEClass(DIRECTIVES);
    createEReference(directivesEClass, DIRECTIVES__ELEMENTS);

    directiveEClass = createEClass(DIRECTIVE);
    createEAttribute(directiveEClass, DIRECTIVE__IMPORTED_NAMESPACE);
    createEAttribute(directiveEClass, DIRECTIVE__ID);
    createEReference(directiveEClass, DIRECTIVE__FIELDS);
    createEAttribute(directiveEClass, DIRECTIVE__USEASID);

    exprEClass = createEClass(EXPR);
    createEReference(exprEClass, EXPR__EXPR);
    createEReference(exprEClass, EXPR__DELETEEXPR);
    createEReference(exprEClass, EXPR__TYPEEXPR);
    createEAttribute(exprEClass, EXPR__TYPE);
    createEReference(exprEClass, EXPR__ISLEFTEPXR);
    createEReference(exprEClass, EXPR__ISRIGHTEXPR);
    createEReference(exprEClass, EXPR__PREFIXEXPR);
    createEReference(exprEClass, EXPR__POSTFIXEXPR);
    createEReference(exprEClass, EXPR__INFIXEXPRLEFT);
    createEReference(exprEClass, EXPR__INFIXEXPRRIGHT);
    createEReference(exprEClass, EXPR__ARGS);
    createEReference(exprEClass, EXPR__CONDITION);
    createEReference(exprEClass, EXPR__THEN);
    createEReference(exprEClass, EXPR__ELSE);

    exprOrObjectLiteralEClass = createEClass(EXPR_OR_OBJECT_LITERAL);

    fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__MOD);
    createEAttribute(fieldDeclarationEClass, FIELD_DECLARATION__VAR);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__ELEMENTS);

    identifierDeclarationEClass = createEClass(IDENTIFIER_DECLARATION);
    createEAttribute(identifierDeclarationEClass, IDENTIFIER_DECLARATION__NAME);
    createEAttribute(identifierDeclarationEClass, IDENTIFIER_DECLARATION__RELATION);
    createEReference(identifierDeclarationEClass, IDENTIFIER_DECLARATION__EXPR);

    labelableStatementEClass = createEClass(LABELABLE_STATEMENT);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__IFCONDITION);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__IFTHEN);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__IFELSE);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__CONDITION);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__ELEMENTS);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__COMMAND);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FORINIT);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__ITERATOR);
    createEAttribute(labelableStatementEClass, LABELABLE_STATEMENT__NAME_FORIN);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FORINEXPR);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FORCOMMAND);
    createEAttribute(labelableStatementEClass, LABELABLE_STATEMENT__NAME_FOREACHH);
    createEAttribute(labelableStatementEClass, LABELABLE_STATEMENT__RELATION);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FOREACHEXPR);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FOREACHCOMMAND);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__CATCH);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FINALLY);
    createEReference(labelableStatementEClass, LABELABLE_STATEMENT__FUNCTION);

    lvalueEClass = createEClass(LVALUE);
    createEReference(lvalueEClass, LVALUE__EXPRESSION);
    createEReference(lvalueEClass, LVALUE__IDENTIFIER);
    createEReference(lvalueEClass, LVALUE__LIST);

    memberDeclarationEClass = createEClass(MEMBER_DECLARATION);
    createEReference(memberDeclarationEClass, MEMBER_DECLARATION__FIELD);
    createEReference(memberDeclarationEClass, MEMBER_DECLARATION__METHOD);

    methodDeclarationEClass = createEClass(METHOD_DECLARATION);
    createEReference(methodDeclarationEClass, METHOD_DECLARATION__METHODMODIFIERS);
    createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__NAME);
    createEReference(methodDeclarationEClass, METHOD_DECLARATION__PARAMS);
    createEReference(methodDeclarationEClass, METHOD_DECLARATION__OPTBODY);

    modifiersEClass = createEClass(MODIFIERS);
    createEAttribute(modifiersEClass, MODIFIERS__STATIC);
    createEAttribute(modifiersEClass, MODIFIERS__FINAL);
    createEAttribute(modifiersEClass, MODIFIERS__ABSTRACT);
    createEAttribute(modifiersEClass, MODIFIERS__OVERRIDE);
    createEAttribute(modifiersEClass, MODIFIERS__INTERNAL);
    createEAttribute(modifiersEClass, MODIFIERS__PUBLIC);
    createEAttribute(modifiersEClass, MODIFIERS__PRIVATE);
    createEAttribute(modifiersEClass, MODIFIERS__PROTECTED);

    namedFunctionExprEClass = createEClass(NAMED_FUNCTION_EXPR);
    createEReference(namedFunctionExprEClass, NAMED_FUNCTION_EXPR__PARAMS);
    createEAttribute(namedFunctionExprEClass, NAMED_FUNCTION_EXPR__RELATION);
    createEReference(namedFunctionExprEClass, NAMED_FUNCTION_EXPR__COMMAND);

    namespacedIdentifierEClass = createEClass(NAMESPACED_IDENTIFIER);

    objectFieldEClass = createEClass(OBJECT_FIELD);

    objectFieldsEClass = createEClass(OBJECT_FIELDS);
    createEReference(objectFieldsEClass, OBJECT_FIELDS__FIELDS);

    objectLiteralEClass = createEClass(OBJECT_LITERAL);

    optBodyEClass = createEClass(OPT_BODY);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    parametersEClass = createEClass(PARAMETERS);
    createEReference(parametersEClass, PARAMETERS__ELEMENTS);
    createEAttribute(parametersEClass, PARAMETERS__NAME);

    parenthesizedExprEClass = createEClass(PARENTHESIZED_EXPR);
    createEReference(parenthesizedExprEClass, PARENTHESIZED_EXPR__EXPRESSION);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__EXPR);
    createEAttribute(statementEClass, STATEMENT__NAME);
    createEReference(statementEClass, STATEMENT__STATEMENT);
    createEReference(statementEClass, STATEMENT__VARIABLES);
    createEReference(statementEClass, STATEMENT__ARGUMENT);

    statementsEClass = createEClass(STATEMENTS);
    createEReference(statementsEClass, STATEMENTS__ELEMENTS);

    statementInSwitchEClass = createEClass(STATEMENT_IN_SWITCH);

    staticInitializerEClass = createEClass(STATIC_INITIALIZER);

    typeListEClass = createEClass(TYPE_LIST);
    createEAttribute(typeListEClass, TYPE_LIST__ELEMENTS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__ELEMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anonFunctionExprEClass.getESuperTypes().add(this.getexpr());
    argumentsEClass.getESuperTypes().add(this.getarrayLiteral());
    arrayLiteralEClass.getESuperTypes().add(this.getexpr());
    blockEClass.getESuperTypes().add(this.getoptBody());
    blockEClass.getESuperTypes().add(this.getstaticInitializer());
    compilationUnitEClass.getESuperTypes().add(this.getModel());
    exprEClass.getESuperTypes().add(this.getannotationField());
    exprEClass.getESuperTypes().add(this.getexprOrObjectLiteral());
    exprEClass.getESuperTypes().add(this.getstatementInSwitch());
    exprOrObjectLiteralEClass.getESuperTypes().add(this.getobjectField());
    exprOrObjectLiteralEClass.getESuperTypes().add(this.getparameter());
    lvalueEClass.getESuperTypes().add(this.getexpr());
    modifiersEClass.getESuperTypes().add(this.getnamespacedIdentifier());
    namedFunctionExprEClass.getESuperTypes().add(this.getexprOrObjectLiteral());
    namespacedIdentifierEClass.getESuperTypes().add(this.getlvalue());
    objectFieldsEClass.getESuperTypes().add(this.getobjectLiteral());
    objectLiteralEClass.getESuperTypes().add(this.getexprOrObjectLiteral());
    parenthesizedExprEClass.getESuperTypes().add(this.getexpr());
    statementEClass.getESuperTypes().add(this.getlabelableStatement());
    statementEClass.getESuperTypes().add(this.getstatementInSwitch());
    statementsEClass.getESuperTypes().add(this.getblock());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonFunctionExprEClass, anonFunctionExpr.class, "anonFunctionExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getanonFunctionExpr_Params(), this.getparameters(), null, "params", null, 0, 1, anonFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getanonFunctionExpr_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, anonFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getanonFunctionExpr_Command(), this.getblock(), null, "command", null, 0, 1, anonFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationFieldsEClass, annotationFields.class, "annotationFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getannotationFields_Fields(), this.getannotationField(), null, "fields", null, 0, -1, annotationFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationFieldEClass, annotationField.class, "annotationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentsEClass, arguments.class, "arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getarguments_Elements(), this.getexprOrObjectLiteral(), null, "elements", null, 0, -1, arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayLiteralEClass, arrayLiteral.class, "arrayLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, block.class, "block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(catchesEClass, catches.class, "catches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcatches_Params(), this.getparameter(), null, "params", null, 0, -1, catches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcatches_Command(), this.getblock(), null, "command", null, 0, -1, catches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classBodyEClass, classBody.class, "classBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getclassBody_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, classBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclarationEClass, classDeclaration.class, "classDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getclassDeclaration_ClassModifiers(), this.getmodifiers(), null, "classModifiers", null, 0, 1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getclassDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclassDeclaration_SuperType(), this.getclassDeclaration(), null, "superType", null, 0, 1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getclassDeclaration_Types(), ecorePackage.getEString(), "types", null, 0, -1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclassDeclaration_Command(), this.getclassBody(), null, "command", null, 0, 1, classDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commaExprEClass, commaExpr.class, "commaExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcommaExpr_Elements(), this.getexpr(), null, "elements", null, 0, -1, commaExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compilationUnitEClass, compilationUnit.class, "compilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompilationUnit_Package(), this.getpackageDeclaration(), null, "package", null, 0, 1, compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompilationUnit_Directive(), this.getdirectives(), null, "directive", null, 0, 1, compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompilationUnit_Unit(), this.getcompilationUnitDeclaration(), null, "unit", null, 0, 1, compilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compilationUnitDeclarationEClass, compilationUnitDeclaration.class, "compilationUnitDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompilationUnitDeclaration_Class(), this.getclassDeclaration(), null, "class", null, 0, 1, compilationUnitDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompilationUnitDeclaration_Member(), this.getmemberDeclaration(), null, "member", null, 0, 1, compilationUnitDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directivesEClass, directives.class, "directives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdirectives_Elements(), this.getdirective(), null, "elements", null, 0, -1, directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directiveEClass, directive.class, "directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdirective_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdirective_Id(), ecorePackage.getEString(), "id", null, 0, 1, directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdirective_Fields(), this.getannotationFields(), null, "fields", null, 0, 1, directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdirective_Useasid(), ecorePackage.getEString(), "useasid", null, 0, 1, directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, expr.class, "expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpr_Expr(), this.getexpr(), null, "expr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Deleteexpr(), this.getexpr(), null, "deleteexpr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Typeexpr(), this.getexpr(), null, "typeexpr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpr_Type(), ecorePackage.getEString(), "type", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Isleftepxr(), this.getexpr(), null, "isleftepxr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Isrightexpr(), this.getexpr(), null, "isrightexpr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Prefixexpr(), this.getexpr(), null, "prefixexpr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Postfixexpr(), this.getexpr(), null, "postfixexpr", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Infixexprleft(), this.getexpr(), null, "infixexprleft", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Infixexprright(), this.getexpr(), null, "infixexprright", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Args(), this.getarguments(), null, "args", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Condition(), this.getexpr(), null, "condition", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Then(), this.getexprOrObjectLiteral(), null, "then", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpr_Else(), this.getexprOrObjectLiteral(), null, "else", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprOrObjectLiteralEClass, exprOrObjectLiteral.class, "exprOrObjectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldDeclarationEClass, fieldDeclaration.class, "fieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfieldDeclaration_Mod(), this.getmodifiers(), null, "mod", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfieldDeclaration_Var(), ecorePackage.getEString(), "var", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfieldDeclaration_Elements(), this.getidentifierDeclaration(), null, "elements", null, 0, -1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierDeclarationEClass, identifierDeclaration.class, "identifierDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getidentifierDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getidentifierDeclaration_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getidentifierDeclaration_Expr(), this.getexprOrObjectLiteral(), null, "expr", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelableStatementEClass, labelableStatement.class, "labelableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlabelableStatement_Ifcondition(), this.getparenthesizedExpr(), null, "ifcondition", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Ifthen(), this.getstatement(), null, "ifthen", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Ifelse(), this.getstatement(), null, "ifelse", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Condition(), ecorePackage.getEObject(), null, "condition", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Command(), ecorePackage.getEObject(), null, "command", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Forinit(), this.getcommaExpr(), null, "forinit", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Iterator(), this.getcommaExpr(), null, "iterator", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlabelableStatement_NameForin(), ecorePackage.getEString(), "nameForin", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Forinexpr(), this.getexpr(), null, "forinexpr", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Forcommand(), this.getstatement(), null, "forcommand", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlabelableStatement_NameForeachh(), ecorePackage.getEString(), "nameForeachh", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlabelableStatement_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Foreachexpr(), this.getexpr(), null, "foreachexpr", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Foreachcommand(), this.getstatement(), null, "foreachcommand", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Catch(), this.getcatches(), null, "catch", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Finally(), this.getblock(), null, "finally", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelableStatement_Function(), this.getnamedFunctionExpr(), null, "function", null, 0, 1, labelableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lvalueEClass, lvalue.class, "lvalue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlvalue_Expression(), this.getexpr(), null, "expression", null, 0, 1, lvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlvalue_Identifier(), this.getnamespacedIdentifier(), null, "identifier", null, 0, 1, lvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlvalue_List(), this.getcommaExpr(), null, "list", null, 0, 1, lvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberDeclarationEClass, memberDeclaration.class, "memberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmemberDeclaration_Field(), this.getfieldDeclaration(), null, "field", null, 0, 1, memberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmemberDeclaration_Method(), this.getmethodDeclaration(), null, "method", null, 0, 1, memberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDeclarationEClass, methodDeclaration.class, "methodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmethodDeclaration_Methodmodifiers(), this.getmodifiers(), null, "methodmodifiers", null, 0, 1, methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmethodDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmethodDeclaration_Params(), this.getparameters(), null, "params", null, 0, 1, methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmethodDeclaration_Optbody(), this.getoptBody(), null, "optbody", null, 0, 1, methodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifiersEClass, modifiers.class, "modifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmodifiers_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Internal(), ecorePackage.getEBoolean(), "internal", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Public(), ecorePackage.getEBoolean(), "public", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Protected(), ecorePackage.getEBoolean(), "protected", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedFunctionExprEClass, namedFunctionExpr.class, "namedFunctionExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnamedFunctionExpr_Params(), this.getparameters(), null, "params", null, 0, 1, namedFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnamedFunctionExpr_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, namedFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnamedFunctionExpr_Command(), this.getblock(), null, "command", null, 0, 1, namedFunctionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespacedIdentifierEClass, namespacedIdentifier.class, "namespacedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectFieldEClass, objectField.class, "objectField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectFieldsEClass, objectFields.class, "objectFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getobjectFields_Fields(), this.getobjectField(), null, "fields", null, 0, -1, objectFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectLiteralEClass, objectLiteral.class, "objectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optBodyEClass, optBody.class, "optBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packageDeclarationEClass, packageDeclaration.class, "packageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, packageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, parameter.class, "parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getparameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersEClass, parameters.class, "parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameters_Elements(), this.getparameter(), null, "elements", null, 0, -1, parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameters_Name(), ecorePackage.getEString(), "name", null, 0, 1, parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesizedExprEClass, parenthesizedExpr.class, "parenthesizedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparenthesizedExpr_Expression(), this.getexprOrObjectLiteral(), null, "expression", null, 0, 1, parenthesizedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_Expr(), ecorePackage.getEObject(), null, "expr", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Statement(), this.getlabelableStatement(), null, "statement", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Variables(), this.getvariableDeclaration(), null, "variables", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Argument(), this.getarguments(), null, "argument", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementsEClass, statements.class, "statements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatements_Elements(), this.getstatement(), null, "elements", null, 0, -1, statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementInSwitchEClass, statementInSwitch.class, "statementInSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(staticInitializerEClass, staticInitializer.class, "staticInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeListEClass, typeList.class, "typeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettypeList_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, typeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, variableDeclaration.class, "variableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariableDeclaration_Elements(), this.getidentifierDeclaration(), null, "elements", null, 0, -1, variableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AS3PackageImpl
