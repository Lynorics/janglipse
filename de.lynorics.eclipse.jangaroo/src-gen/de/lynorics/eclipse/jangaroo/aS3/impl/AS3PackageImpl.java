/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Factory;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Assignment;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfBlock;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.IntConstant;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberSelection;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.New;
import de.lynorics.eclipse.jangaroo.aS3.NewStatement;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Parameters;
import de.lynorics.eclipse.jangaroo.aS3.Return;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.StatementsBlock;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.Super;
import de.lynorics.eclipse.jangaroo.aS3.Switch;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.Symbol;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.While;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodBodyEClass = null;

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
  private EClass newStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

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
  private EClass commaExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doWhileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchStatementEClass = null;

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
  private EClass statementInSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tryStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementsBlockEClass = null;

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
  private EClass typeRelationEClass = null;

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
  private EClass objectFieldsEClass = null;

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
  private EClass exprOrObjectLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass superEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessLevelEEnum = null;

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
  public EReference getModel_Imports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Classes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Access()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Superclass()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Members()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Types()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMember()
  {
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Var()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Meth()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Access()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Params()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Type()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Body()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodBody()
  {
    return methodBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewStatement()
  {
    return newStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Forinit()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Condition()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Iterator()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Command()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Elements()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForStatement_NameForin()
  {
    return (EAttribute)forStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Forinexpr()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Forcommand()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForStatement_NameForeachh()
  {
    return (EAttribute)forStatementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Relation()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Foreachexpr()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Foreachcommand()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(11);
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
  public EReference getidentifierDeclaration_Relation()
  {
    return (EReference)identifierDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EClass getDoWhileStatement()
  {
    return doWhileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileStatement()
  {
    return whileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchStatement()
  {
    return switchStatementEClass;
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
  public EClass getstatementInSwitch()
  {
    return statementInSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturn_Expression()
  {
    return (EReference)returnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Type()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Expression()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Expression()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ThenBlock()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseBlock()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTryStatement()
  {
    return tryStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Statements()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Params()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_FinallyBlock()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfBlock()
  {
    return ifBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementsBlock()
  {
    return statementsBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Statements()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Rel()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Lit()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameters()
  {
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_Elements()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameters_Name()
  {
    return (EAttribute)parametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_Rel()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettypeRelation()
  {
    return typeRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettypeRelation_Type()
  {
    return (EReference)typeRelationEClass.getEStructuralFeatures().get(0);
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
  public EClass getobjectField()
  {
    return objectFieldEClass;
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
  public EClass getSymbol()
  {
    return symbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Name()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNew()
  {
    return newEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNew_Type()
  {
    return (EReference)newEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNew_Param()
  {
    return (EReference)newEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_WhileBlock()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Cond()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Cond()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Cases()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Left()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Right()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberSelection()
  {
    return memberSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberSelection_Receiver()
  {
    return (EReference)memberSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberSelection_Member()
  {
    return (EReference)memberSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMemberSelection_Methodinvocation()
  {
    return (EAttribute)memberSelectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberSelection_Args()
  {
    return (EReference)memberSelectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstant()
  {
    return stringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstant_Value()
  {
    return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntConstant_Value()
  {
    return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolConstant()
  {
    return boolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolConstant_Value()
  {
    return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThis()
  {
    return thisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuper()
  {
    return superEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull()
  {
    return nullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolRef()
  {
    return symbolRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRef_Symbol()
  {
    return (EReference)symbolRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessLevel()
  {
    return accessLevelEEnum;
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
    createEReference(modelEClass, MODEL__IMPORTS);
    createEReference(modelEClass, MODEL__CLASSES);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__ACCESS);
    createEAttribute(classEClass, CLASS__NAME);
    createEReference(classEClass, CLASS__SUPERCLASS);
    createEReference(classEClass, CLASS__MEMBERS);
    createEReference(classEClass, CLASS__TYPES);

    memberEClass = createEClass(MEMBER);
    createEReference(memberEClass, MEMBER__VAR);
    createEReference(memberEClass, MEMBER__METH);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__ACCESS);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMS);
    createEReference(methodEClass, METHOD__TYPE);
    createEReference(methodEClass, METHOD__BODY);

    methodBodyEClass = createEClass(METHOD_BODY);

    statementEClass = createEClass(STATEMENT);

    newStatementEClass = createEClass(NEW_STATEMENT);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEReference(forStatementEClass, FOR_STATEMENT__FORINIT);
    createEReference(forStatementEClass, FOR_STATEMENT__CONDITION);
    createEReference(forStatementEClass, FOR_STATEMENT__ITERATOR);
    createEReference(forStatementEClass, FOR_STATEMENT__COMMAND);
    createEReference(forStatementEClass, FOR_STATEMENT__ELEMENTS);
    createEAttribute(forStatementEClass, FOR_STATEMENT__NAME_FORIN);
    createEReference(forStatementEClass, FOR_STATEMENT__FORINEXPR);
    createEReference(forStatementEClass, FOR_STATEMENT__FORCOMMAND);
    createEAttribute(forStatementEClass, FOR_STATEMENT__NAME_FOREACHH);
    createEReference(forStatementEClass, FOR_STATEMENT__RELATION);
    createEReference(forStatementEClass, FOR_STATEMENT__FOREACHEXPR);
    createEReference(forStatementEClass, FOR_STATEMENT__FOREACHCOMMAND);

    identifierDeclarationEClass = createEClass(IDENTIFIER_DECLARATION);
    createEAttribute(identifierDeclarationEClass, IDENTIFIER_DECLARATION__NAME);
    createEReference(identifierDeclarationEClass, IDENTIFIER_DECLARATION__RELATION);
    createEReference(identifierDeclarationEClass, IDENTIFIER_DECLARATION__EXPR);

    commaExprEClass = createEClass(COMMA_EXPR);
    createEReference(commaExprEClass, COMMA_EXPR__ELEMENTS);

    doWhileStatementEClass = createEClass(DO_WHILE_STATEMENT);

    whileStatementEClass = createEClass(WHILE_STATEMENT);

    switchStatementEClass = createEClass(SWITCH_STATEMENT);

    parenthesizedExprEClass = createEClass(PARENTHESIZED_EXPR);
    createEReference(parenthesizedExprEClass, PARENTHESIZED_EXPR__EXPRESSION);

    statementInSwitchEClass = createEClass(STATEMENT_IN_SWITCH);

    returnEClass = createEClass(RETURN);
    createEReference(returnEClass, RETURN__EXPRESSION);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__EXPRESSION);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(ifStatementEClass, IF_STATEMENT__THEN_BLOCK);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);

    tryStatementEClass = createEClass(TRY_STATEMENT);
    createEReference(tryStatementEClass, TRY_STATEMENT__STATEMENTS);
    createEReference(tryStatementEClass, TRY_STATEMENT__PARAMS);
    createEReference(tryStatementEClass, TRY_STATEMENT__FINALLY_BLOCK);

    ifBlockEClass = createEClass(IF_BLOCK);

    statementsBlockEClass = createEClass(STATEMENTS_BLOCK);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__STATEMENTS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__REL);
    createEReference(parameterEClass, PARAMETER__LIT);

    parametersEClass = createEClass(PARAMETERS);
    createEReference(parametersEClass, PARAMETERS__ELEMENTS);
    createEAttribute(parametersEClass, PARAMETERS__NAME);
    createEReference(parametersEClass, PARAMETERS__REL);

    typeRelationEClass = createEClass(TYPE_RELATION);
    createEReference(typeRelationEClass, TYPE_RELATION__TYPE);

    objectLiteralEClass = createEClass(OBJECT_LITERAL);

    objectFieldsEClass = createEClass(OBJECT_FIELDS);
    createEReference(objectFieldsEClass, OBJECT_FIELDS__FIELDS);

    objectFieldEClass = createEClass(OBJECT_FIELD);

    exprOrObjectLiteralEClass = createEClass(EXPR_OR_OBJECT_LITERAL);

    symbolEClass = createEClass(SYMBOL);
    createEAttribute(symbolEClass, SYMBOL__NAME);

    expressionEClass = createEClass(EXPRESSION);

    newEClass = createEClass(NEW);
    createEReference(newEClass, NEW__TYPE);
    createEReference(newEClass, NEW__PARAM);

    whileEClass = createEClass(WHILE);
    createEReference(whileEClass, WHILE__WHILE_BLOCK);
    createEReference(whileEClass, WHILE__COND);

    switchEClass = createEClass(SWITCH);
    createEReference(switchEClass, SWITCH__COND);
    createEReference(switchEClass, SWITCH__CASES);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__LEFT);
    createEReference(assignmentEClass, ASSIGNMENT__RIGHT);

    memberSelectionEClass = createEClass(MEMBER_SELECTION);
    createEReference(memberSelectionEClass, MEMBER_SELECTION__RECEIVER);
    createEReference(memberSelectionEClass, MEMBER_SELECTION__MEMBER);
    createEAttribute(memberSelectionEClass, MEMBER_SELECTION__METHODINVOCATION);
    createEReference(memberSelectionEClass, MEMBER_SELECTION__ARGS);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

    boolConstantEClass = createEClass(BOOL_CONSTANT);
    createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

    thisEClass = createEClass(THIS);

    superEClass = createEClass(SUPER);

    nullEClass = createEClass(NULL);

    symbolRefEClass = createEClass(SYMBOL_REF);
    createEReference(symbolRefEClass, SYMBOL_REF__SYMBOL);

    // Create enums
    accessLevelEEnum = createEEnum(ACCESS_LEVEL);
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
    packageEClass.getESuperTypes().add(this.getModel());
    methodBodyEClass.getESuperTypes().add(this.getBlock());
    statementEClass.getESuperTypes().add(this.getstatementInSwitch());
    newStatementEClass.getESuperTypes().add(this.getStatement());
    forStatementEClass.getESuperTypes().add(this.getStatement());
    doWhileStatementEClass.getESuperTypes().add(this.getStatement());
    whileStatementEClass.getESuperTypes().add(this.getStatement());
    switchStatementEClass.getESuperTypes().add(this.getStatement());
    returnEClass.getESuperTypes().add(this.getStatement());
    variableDeclarationEClass.getESuperTypes().add(this.getStatement());
    variableDeclarationEClass.getESuperTypes().add(this.getSymbol());
    ifStatementEClass.getESuperTypes().add(this.getStatement());
    tryStatementEClass.getESuperTypes().add(this.getStatement());
    ifBlockEClass.getESuperTypes().add(this.getBlock());
    statementsBlockEClass.getESuperTypes().add(this.getIfBlock());
    parameterEClass.getESuperTypes().add(this.getSymbol());
    objectLiteralEClass.getESuperTypes().add(this.getStatement());
    objectLiteralEClass.getESuperTypes().add(this.getexprOrObjectLiteral());
    objectFieldsEClass.getESuperTypes().add(this.getobjectLiteral());
    exprOrObjectLiteralEClass.getESuperTypes().add(this.getobjectField());
    expressionEClass.getESuperTypes().add(this.getStatement());
    expressionEClass.getESuperTypes().add(this.getexprOrObjectLiteral());
    newEClass.getESuperTypes().add(this.getNewStatement());
    whileEClass.getESuperTypes().add(this.getDoWhileStatement());
    whileEClass.getESuperTypes().add(this.getWhileStatement());
    switchEClass.getESuperTypes().add(this.getSwitchStatement());
    assignmentEClass.getESuperTypes().add(this.getExpression());
    memberSelectionEClass.getESuperTypes().add(this.getExpression());
    stringConstantEClass.getESuperTypes().add(this.getExpression());
    intConstantEClass.getESuperTypes().add(this.getExpression());
    boolConstantEClass.getESuperTypes().add(this.getExpression());
    thisEClass.getESuperTypes().add(this.getExpression());
    superEClass.getESuperTypes().add(this.getExpression());
    nullEClass.getESuperTypes().add(this.getExpression());
    symbolRefEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Classes(), this.getClass_(), null, "classes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, de.lynorics.eclipse.jangaroo.aS3.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.lynorics.eclipse.jangaroo.aS3.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, de.lynorics.eclipse.jangaroo.aS3.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Access(), this.getAccessLevel(), "access", null, 0, 1, de.lynorics.eclipse.jangaroo.aS3.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.lynorics.eclipse.jangaroo.aS3.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Superclass(), this.getClass_(), null, "superclass", null, 0, 1, de.lynorics.eclipse.jangaroo.aS3.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Members(), this.getMember(), null, "members", null, 0, -1, de.lynorics.eclipse.jangaroo.aS3.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Types(), this.getClass_(), null, "types", null, 0, -1, de.lynorics.eclipse.jangaroo.aS3.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMember_Var(), this.getVariableDeclaration(), null, "var", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMember_Meth(), this.getMethod(), null, "meth", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Access(), this.getAccessLevel(), "access", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Params(), this.getParameter(), null, "params", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Type(), this.getClass_(), null, "type", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Body(), this.getMethodBody(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodBodyEClass, MethodBody.class, "MethodBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newStatementEClass, NewStatement.class, "NewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStatement_Forinit(), this.getcommaExpr(), null, "forinit", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Condition(), this.getcommaExpr(), null, "condition", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Iterator(), this.getcommaExpr(), null, "iterator", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Command(), this.getStatementsBlock(), null, "command", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Elements(), this.getidentifierDeclaration(), null, "elements", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForStatement_NameForin(), ecorePackage.getEString(), "nameForin", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Forinexpr(), this.getExpression(), null, "forinexpr", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Forcommand(), this.getStatementsBlock(), null, "forcommand", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForStatement_NameForeachh(), ecorePackage.getEString(), "nameForeachh", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Relation(), this.gettypeRelation(), null, "relation", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Foreachexpr(), this.getExpression(), null, "foreachexpr", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Foreachcommand(), this.getStatementsBlock(), null, "foreachcommand", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierDeclarationEClass, identifierDeclaration.class, "identifierDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getidentifierDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getidentifierDeclaration_Relation(), this.gettypeRelation(), null, "relation", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getidentifierDeclaration_Expr(), this.getexprOrObjectLiteral(), null, "expr", null, 0, 1, identifierDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commaExprEClass, commaExpr.class, "commaExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcommaExpr_Elements(), this.getExpression(), null, "elements", null, 0, -1, commaExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWhileStatementEClass, DoWhileStatement.class, "DoWhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parenthesizedExprEClass, parenthesizedExpr.class, "parenthesizedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparenthesizedExpr_Expression(), this.getexprOrObjectLiteral(), null, "expression", null, 0, 1, parenthesizedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementInSwitchEClass, statementInSwitch.class, "statementInSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturn_Expression(), this.getExpression(), null, "expression", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Type(), this.getClass_(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ThenBlock(), this.getIfBlock(), null, "thenBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElseBlock(), this.getIfBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tryStatementEClass, TryStatement.class, "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTryStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_Params(), this.getParameter(), null, "params", null, 0, -1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_FinallyBlock(), this.getStatementsBlock(), null, "finallyBlock", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifBlockEClass, IfBlock.class, "IfBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementsBlockEClass, StatementsBlock.class, "StatementsBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Rel(), this.gettypeRelation(), null, "rel", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Lit(), this.getexprOrObjectLiteral(), null, "lit", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameters_Elements(), this.getParameter(), null, "elements", null, 0, -1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameters_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameters_Rel(), this.gettypeRelation(), null, "rel", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRelationEClass, typeRelation.class, "typeRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettypeRelation_Type(), this.getClass_(), null, "type", null, 0, 1, typeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectLiteralEClass, objectLiteral.class, "objectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectFieldsEClass, objectFields.class, "objectFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getobjectFields_Fields(), this.getobjectField(), null, "fields", null, 0, -1, objectFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectFieldEClass, objectField.class, "objectField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprOrObjectLiteralEClass, exprOrObjectLiteral.class, "exprOrObjectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newEClass, New.class, "New", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNew_Type(), this.getClass_(), null, "type", null, 0, 1, New.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNew_Param(), this.getParameters(), null, "param", null, 0, 1, New.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_WhileBlock(), this.getStatementsBlock(), null, "whileBlock", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Cond(), this.getparenthesizedExpr(), null, "cond", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitch_Cond(), this.getparenthesizedExpr(), null, "cond", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_Cases(), this.getstatementInSwitch(), null, "cases", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Left(), this.getExpression(), null, "left", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Right(), this.getExpression(), null, "right", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberSelectionEClass, MemberSelection.class, "MemberSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMemberSelection_Receiver(), this.getExpression(), null, "receiver", null, 0, 1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberSelection_Member(), this.getMember(), null, "member", null, 0, 1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemberSelection_Methodinvocation(), ecorePackage.getEBoolean(), "methodinvocation", null, 0, 1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberSelection_Args(), this.getExpression(), null, "args", null, 0, -1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thisEClass, This.class, "This", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(superEClass, Super.class, "Super", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbolRefEClass, SymbolRef.class, "SymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymbolRef_Symbol(), this.getSymbol(), null, "symbol", null, 0, 1, SymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(accessLevelEEnum, AccessLevel.class, "AccessLevel");
    addEEnumLiteral(accessLevelEEnum, AccessLevel.PRIVATE);
    addEEnumLiteral(accessLevelEEnum, AccessLevel.PUBLIC);
    addEEnumLiteral(accessLevelEEnum, AccessLevel.PROTECTED);

    // Create resource
    createResource(eNS_URI);
  }

} //AS3PackageImpl
