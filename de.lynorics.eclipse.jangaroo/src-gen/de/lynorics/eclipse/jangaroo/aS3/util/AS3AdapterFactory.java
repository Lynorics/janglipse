/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.*;

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
      public Adapter caseanonFunctionExpr(anonFunctionExpr object)
      {
        return createanonFunctionExprAdapter();
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
      public Adapter casearguments(arguments object)
      {
        return createargumentsAdapter();
      }
      @Override
      public Adapter casearrayLiteral(arrayLiteral object)
      {
        return createarrayLiteralAdapter();
      }
      @Override
      public Adapter caseblock(block object)
      {
        return createblockAdapter();
      }
      @Override
      public Adapter casecatches(catches object)
      {
        return createcatchesAdapter();
      }
      @Override
      public Adapter caseclassBody(classBody object)
      {
        return createclassBodyAdapter();
      }
      @Override
      public Adapter caseclassDeclaration(classDeclaration object)
      {
        return createclassDeclarationAdapter();
      }
      @Override
      public Adapter casecommaExpr(commaExpr object)
      {
        return createcommaExprAdapter();
      }
      @Override
      public Adapter casecompilationUnit(compilationUnit object)
      {
        return createcompilationUnitAdapter();
      }
      @Override
      public Adapter casecompilationUnitDeclaration(compilationUnitDeclaration object)
      {
        return createcompilationUnitDeclarationAdapter();
      }
      @Override
      public Adapter casedirectives(directives object)
      {
        return createdirectivesAdapter();
      }
      @Override
      public Adapter casedirective(directive object)
      {
        return createdirectiveAdapter();
      }
      @Override
      public Adapter caseexpr(expr object)
      {
        return createexprAdapter();
      }
      @Override
      public Adapter caseexprOrObjectLiteral(exprOrObjectLiteral object)
      {
        return createexprOrObjectLiteralAdapter();
      }
      @Override
      public Adapter casefieldDeclaration(fieldDeclaration object)
      {
        return createfieldDeclarationAdapter();
      }
      @Override
      public Adapter caseidentifierDeclaration(identifierDeclaration object)
      {
        return createidentifierDeclarationAdapter();
      }
      @Override
      public Adapter caselabelableStatement(labelableStatement object)
      {
        return createlabelableStatementAdapter();
      }
      @Override
      public Adapter caselvalue(lvalue object)
      {
        return createlvalueAdapter();
      }
      @Override
      public Adapter casememberDeclaration(memberDeclaration object)
      {
        return creatememberDeclarationAdapter();
      }
      @Override
      public Adapter casemethodDeclaration(methodDeclaration object)
      {
        return createmethodDeclarationAdapter();
      }
      @Override
      public Adapter casemodifiers(modifiers object)
      {
        return createmodifiersAdapter();
      }
      @Override
      public Adapter casenamedFunctionExpr(namedFunctionExpr object)
      {
        return createnamedFunctionExprAdapter();
      }
      @Override
      public Adapter casenamespacedIdentifier(namespacedIdentifier object)
      {
        return createnamespacedIdentifierAdapter();
      }
      @Override
      public Adapter caseobjectField(objectField object)
      {
        return createobjectFieldAdapter();
      }
      @Override
      public Adapter caseobjectFields(objectFields object)
      {
        return createobjectFieldsAdapter();
      }
      @Override
      public Adapter caseobjectLiteral(objectLiteral object)
      {
        return createobjectLiteralAdapter();
      }
      @Override
      public Adapter caseoptBody(optBody object)
      {
        return createoptBodyAdapter();
      }
      @Override
      public Adapter casepackageDeclaration(packageDeclaration object)
      {
        return createpackageDeclarationAdapter();
      }
      @Override
      public Adapter caseparameter(parameter object)
      {
        return createparameterAdapter();
      }
      @Override
      public Adapter caseparameters(parameters object)
      {
        return createparametersAdapter();
      }
      @Override
      public Adapter caseparenthesizedExpr(parenthesizedExpr object)
      {
        return createparenthesizedExprAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter casestatements(statements object)
      {
        return createstatementsAdapter();
      }
      @Override
      public Adapter casestatementInSwitch(statementInSwitch object)
      {
        return createstatementInSwitchAdapter();
      }
      @Override
      public Adapter casestaticInitializer(staticInitializer object)
      {
        return createstaticInitializerAdapter();
      }
      @Override
      public Adapter casetypeList(typeList object)
      {
        return createtypeListAdapter();
      }
      @Override
      public Adapter casevariableDeclaration(variableDeclaration object)
      {
        return createvariableDeclarationAdapter();
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr <em>anon Function Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr
   * @generated
   */
  public Adapter createanonFunctionExprAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.arguments <em>arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.arguments
   * @generated
   */
  public Adapter createargumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.arrayLiteral <em>array Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.arrayLiteral
   * @generated
   */
  public Adapter createarrayLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.block
   * @generated
   */
  public Adapter createblockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.catches <em>catches</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.catches
   * @generated
   */
  public Adapter createcatchesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.classBody <em>class Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.classBody
   * @generated
   */
  public Adapter createclassBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration <em>class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.classDeclaration
   * @generated
   */
  public Adapter createclassDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnit <em>compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnit
   * @generated
   */
  public Adapter createcompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration <em>compilation Unit Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration
   * @generated
   */
  public Adapter createcompilationUnitDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.directives <em>directives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.directives
   * @generated
   */
  public Adapter createdirectivesAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.expr
   * @generated
   */
  public Adapter createexprAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration <em>field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration
   * @generated
   */
  public Adapter createfieldDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement <em>labelable Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.labelableStatement
   * @generated
   */
  public Adapter createlabelableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue <em>lvalue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.lvalue
   * @generated
   */
  public Adapter createlvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration <em>member Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.memberDeclaration
   * @generated
   */
  public Adapter creatememberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration <em>method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.methodDeclaration
   * @generated
   */
  public Adapter createmethodDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.modifiers <em>modifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.modifiers
   * @generated
   */
  public Adapter createmodifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr <em>named Function Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr
   * @generated
   */
  public Adapter createnamedFunctionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier <em>namespaced Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier
   * @generated
   */
  public Adapter createnamespacedIdentifierAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.optBody <em>opt Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.optBody
   * @generated
   */
  public Adapter createoptBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.packageDeclaration <em>package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.packageDeclaration
   * @generated
   */
  public Adapter createpackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameter <em>parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameter
   * @generated
   */
  public Adapter createparameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameters <em>parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameters
   * @generated
   */
  public Adapter createparametersAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.statements <em>statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.statements
   * @generated
   */
  public Adapter createstatementsAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.staticInitializer <em>static Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.staticInitializer
   * @generated
   */
  public Adapter createstaticInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.typeList <em>type List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeList
   * @generated
   */
  public Adapter createtypeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclaration <em>variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclaration
   * @generated
   */
  public Adapter createvariableDeclarationAdapter()
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
