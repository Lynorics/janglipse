/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Assignment;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfBlock;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.IntConstant;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
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
import de.lynorics.eclipse.jangaroo.aS3.Type;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.While;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package
 * @generated
 */
public class AS3AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AS3Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AS3Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AS3Switch<Adapter> modelSwitch =
    new AS3Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackage(de.lynorics.eclipse.jangaroo.aS3.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseImports(Imports object)
      {
        return createImportsAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casedirective(directive object)
      {
        return createdirectiveAdapter();
      }
      @Override
      public Adapter caseUses(Uses object)
      {
        return createUsesAdapter();
      }
      @Override
      public Adapter caseannotationFields(annotationFields object)
      {
        return createannotationFieldsAdapter();
      }
      @Override
      public Adapter caseannotationField(annotationField object)
      {
        return createannotationFieldAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseClass(de.lynorics.eclipse.jangaroo.aS3.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseMethodBody(MethodBody object)
      {
        return createMethodBodyAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseNewStatement(NewStatement object)
      {
        return createNewStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseidentifierDeclaration(identifierDeclaration object)
      {
        return createidentifierDeclarationAdapter();
      }
      @Override
      public Adapter casecommaExpr(commaExpr object)
      {
        return createcommaExprAdapter();
      }
      @Override
      public Adapter caseDoWhileStatement(DoWhileStatement object)
      {
        return createDoWhileStatementAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseparenthesizedExpr(parenthesizedExpr object)
      {
        return createparenthesizedExprAdapter();
      }
      @Override
      public Adapter casestatementInSwitch(statementInSwitch object)
      {
        return createstatementInSwitchAdapter();
      }
      @Override
      public Adapter caseReturn(Return object)
      {
        return createReturnAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseTryStatement(TryStatement object)
      {
        return createTryStatementAdapter();
      }
      @Override
      public Adapter caseIfBlock(IfBlock object)
      {
        return createIfBlockAdapter();
      }
      @Override
      public Adapter caseStatementsBlock(StatementsBlock object)
      {
        return createStatementsBlockAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameters(Parameters object)
      {
        return createParametersAdapter();
      }
      @Override
      public Adapter casetypeRelation(typeRelation object)
      {
        return createtypeRelationAdapter();
      }
      @Override
      public Adapter caseobjectLiteral(objectLiteral object)
      {
        return createobjectLiteralAdapter();
      }
      @Override
      public Adapter caseobjectFields(objectFields object)
      {
        return createobjectFieldsAdapter();
      }
      @Override
      public Adapter caseobjectField(objectField object)
      {
        return createobjectFieldAdapter();
      }
      @Override
      public Adapter caseexprOrObjectLiteral(exprOrObjectLiteral object)
      {
        return createexprOrObjectLiteralAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseNew(New object)
      {
        return createNewAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseMemberSelection(MemberSelection object)
      {
        return createMemberSelectionAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseThis(This object)
      {
        return createThisAdapter();
      }
      @Override
      public Adapter caseSuper(Super object)
      {
        return createSuperAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseSymbolRef(SymbolRef object)
      {
        return createSymbolRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Imports
   * @generated
   */
  public Adapter createImportsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.directive <em>directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.directive
   * @generated
   */
  public Adapter createdirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Uses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Uses
   * @generated
   */
  public Adapter createUsesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields <em>annotation Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationFields
   * @generated
   */
  public Adapter createannotationFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.annotationField <em>annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.annotationField
   * @generated
   */
  public Adapter createannotationFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.MethodBody <em>Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.MethodBody
   * @generated
   */
  public Adapter createMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.NewStatement <em>New Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.NewStatement
   * @generated
   */
  public Adapter createNewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration <em>identifier Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration
   * @generated
   */
  public Adapter createidentifierDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.commaExpr <em>comma Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.commaExpr
   * @generated
   */
  public Adapter createcommaExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement <em>Do While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement
   * @generated
   */
  public Adapter createDoWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.SwitchStatement
   * @generated
   */
  public Adapter createSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr <em>parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr
   * @generated
   */
  public Adapter createparenthesizedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.statementInSwitch <em>statement In Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.statementInSwitch
   * @generated
   */
  public Adapter createstatementInSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Return
   * @generated
   */
  public Adapter createReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.TryStatement
   * @generated
   */
  public Adapter createTryStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.IfBlock <em>If Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.IfBlock
   * @generated
   */
  public Adapter createIfBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.StatementsBlock <em>Statements Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.StatementsBlock
   * @generated
   */
  public Adapter createStatementsBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Parameters
   * @generated
   */
  public Adapter createParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.typeRelation <em>type Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeRelation
   * @generated
   */
  public Adapter createtypeRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.objectLiteral <em>object Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectLiteral
   * @generated
   */
  public Adapter createobjectLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.objectFields <em>object Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectFields
   * @generated
   */
  public Adapter createobjectFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.objectField <em>object Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.objectField
   * @generated
   */
  public Adapter createobjectFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral <em>expr Or Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral
   * @generated
   */
  public Adapter createexprOrObjectLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.New <em>New</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.New
   * @generated
   */
  public Adapter createNewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection <em>Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.MemberSelection
   * @generated
   */
  public Adapter createMemberSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.This
   * @generated
   */
  public Adapter createThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Super <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Super
   * @generated
   */
  public Adapter createSuperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.SymbolRef
   * @generated
   */
  public Adapter createSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AS3AdapterFactory
