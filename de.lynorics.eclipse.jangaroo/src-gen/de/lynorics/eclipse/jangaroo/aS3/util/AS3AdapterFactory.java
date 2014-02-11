/**
 */
package de.lynorics.eclipse.jangaroo.aS3.util;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.CaseStatement;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
import de.lynorics.eclipse.jangaroo.aS3.Constant;
import de.lynorics.eclipse.jangaroo.aS3.Declaration;
import de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForEachStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.ThrowStatement;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VarType;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.WithStatement;
import de.lynorics.eclipse.jangaroo.aS3.additiveExpression;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.arrayLiteral;
import de.lynorics.eclipse.jangaroo.aS3.assignmentExpression;
import de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression;
import de.lynorics.eclipse.jangaroo.aS3.block;
import de.lynorics.eclipse.jangaroo.aS3.blockEntry;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.catchBlock;
import de.lynorics.eclipse.jangaroo.aS3.conditionalExpression;
import de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression;
import de.lynorics.eclipse.jangaroo.aS3.declarationTail;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.element;
import de.lynorics.eclipse.jangaroo.aS3.elementList;
import de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression;
import de.lynorics.eclipse.jangaroo.aS3.equalityExpression;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.expressionList;
import de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.fieldList;
import de.lynorics.eclipse.jangaroo.aS3.fieldName;
import de.lynorics.eclipse.jangaroo.aS3.finallyBlock;
import de.lynorics.eclipse.jangaroo.aS3.forCond;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseTail;
import de.lynorics.eclipse.jangaroo.aS3.forInit;
import de.lynorics.eclipse.jangaroo.aS3.forIter;
import de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression;
import de.lynorics.eclipse.jangaroo.aS3.functionCommon;
import de.lynorics.eclipse.jangaroo.aS3.functionExpression;
import de.lynorics.eclipse.jangaroo.aS3.functionSignature;
import de.lynorics.eclipse.jangaroo.aS3.identi;
import de.lynorics.eclipse.jangaroo.aS3.identifier;
import de.lynorics.eclipse.jangaroo.aS3.literalField;
import de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression;
import de.lynorics.eclipse.jangaroo.aS3.namespaceName;
import de.lynorics.eclipse.jangaroo.aS3.newExpression;
import de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList;
import de.lynorics.eclipse.jangaroo.aS3.parameterDefault;
import de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.postfixExpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifier;
import de.lynorics.eclipse.jangaroo.aS3.regexpLiteral;
import de.lynorics.eclipse.jangaroo.aS3.relationalExpression;
import de.lynorics.eclipse.jangaroo.aS3.shiftExpression;
import de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;
import de.lynorics.eclipse.jangaroo.aS3.switchStatementList;
import de.lynorics.eclipse.jangaroo.aS3.traditionalForClause;
import de.lynorics.eclipse.jangaroo.aS3.typeExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus;
import de.lynorics.eclipse.jangaroo.aS3.variableDeclarator;
import de.lynorics.eclipse.jangaroo.aS3.variableInitializer;

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
      public Adapter caseInterfaceMethod(InterfaceMethod object)
      {
        return createInterfaceMethodAdapter();
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
      public Adapter caseModifier(Modifier object)
      {
        return createModifierAdapter();
      }
      @Override
      public Adapter caseMethodBody(MethodBody object)
      {
        return createMethodBodyAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVarType(VarType object)
      {
        return createVarTypeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseobjectLiteral(objectLiteral object)
      {
        return createobjectLiteralAdapter();
      }
      @Override
      public Adapter casefieldList(fieldList object)
      {
        return createfieldListAdapter();
      }
      @Override
      public Adapter caseliteralField(literalField object)
      {
        return createliteralFieldAdapter();
      }
      @Override
      public Adapter casefieldName(fieldName object)
      {
        return createfieldNameAdapter();
      }
      @Override
      public Adapter caseelement(element object)
      {
        return createelementAdapter();
      }
      @Override
      public Adapter caseexprOrObjectLiteral(exprOrObjectLiteral object)
      {
        return createexprOrObjectLiteralAdapter();
      }
      @Override
      public Adapter casequalifiedIdent(qualifiedIdent object)
      {
        return createqualifiedIdentAdapter();
      }
      @Override
      public Adapter caseidenti(identi object)
      {
        return createidentiAdapter();
      }
      @Override
      public Adapter caseidentifier(identifier object)
      {
        return createidentifierAdapter();
      }
      @Override
      public Adapter casepropertyIdentifier(propertyIdentifier object)
      {
        return createpropertyIdentifierAdapter();
      }
      @Override
      public Adapter casequalifier(qualifier object)
      {
        return createqualifierAdapter();
      }
      @Override
      public Adapter casesimpleQualifiedIdentifier(simpleQualifiedIdentifier object)
      {
        return createsimpleQualifiedIdentifierAdapter();
      }
      @Override
      public Adapter caseexpressionQualifiedIdentifier(expressionQualifiedIdentifier object)
      {
        return createexpressionQualifiedIdentifierAdapter();
      }
      @Override
      public Adapter casenonAttributeQualifiedIdentifier(nonAttributeQualifiedIdentifier object)
      {
        return createnonAttributeQualifiedIdentifierAdapter();
      }
      @Override
      public Adapter casequalifiedIdentifier(qualifiedIdentifier object)
      {
        return createqualifiedIdentifierAdapter();
      }
      @Override
      public Adapter casenamespaceName(namespaceName object)
      {
        return createnamespaceNameAdapter();
      }
      @Override
      public Adapter casearrayLiteral(arrayLiteral object)
      {
        return createarrayLiteralAdapter();
      }
      @Override
      public Adapter caseelementList(elementList object)
      {
        return createelementListAdapter();
      }
      @Override
      public Adapter casenonemptyElementList(nonemptyElementList object)
      {
        return createnonemptyElementListAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseexpressionList(expressionList object)
      {
        return createexpressionListAdapter();
      }
      @Override
      public Adapter caseassignmentExpression(assignmentExpression object)
      {
        return createassignmentExpressionAdapter();
      }
      @Override
      public Adapter caseconditionalExpression(conditionalExpression object)
      {
        return createconditionalExpressionAdapter();
      }
      @Override
      public Adapter caseconditionalSubExpression(conditionalSubExpression object)
      {
        return createconditionalSubExpressionAdapter();
      }
      @Override
      public Adapter caselogicalOrExpression(logicalOrExpression object)
      {
        return createlogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caselogicalAndExpression(logicalAndExpression object)
      {
        return createlogicalAndExpressionAdapter();
      }
      @Override
      public Adapter casebitwiseOrExpression(bitwiseOrExpression object)
      {
        return createbitwiseOrExpressionAdapter();
      }
      @Override
      public Adapter casebitwiseXorExpression(bitwiseXorExpression object)
      {
        return createbitwiseXorExpressionAdapter();
      }
      @Override
      public Adapter casebitwiseAndExpression(bitwiseAndExpression object)
      {
        return createbitwiseAndExpressionAdapter();
      }
      @Override
      public Adapter caseequalityExpression(equalityExpression object)
      {
        return createequalityExpressionAdapter();
      }
      @Override
      public Adapter caserelationalExpression(relationalExpression object)
      {
        return createrelationalExpressionAdapter();
      }
      @Override
      public Adapter caseshiftExpression(shiftExpression object)
      {
        return createshiftExpressionAdapter();
      }
      @Override
      public Adapter caseadditiveExpression(additiveExpression object)
      {
        return createadditiveExpressionAdapter();
      }
      @Override
      public Adapter casemultiplicativeExpression(multiplicativeExpression object)
      {
        return createmultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseunaryExpression(unaryExpression object)
      {
        return createunaryExpressionAdapter();
      }
      @Override
      public Adapter caseunaryExpressionNotPlusMinus(unaryExpressionNotPlusMinus object)
      {
        return createunaryExpressionNotPlusMinusAdapter();
      }
      @Override
      public Adapter casepostfixExpression(postfixExpression object)
      {
        return createpostfixExpressionAdapter();
      }
      @Override
      public Adapter casearguments(arguments object)
      {
        return createargumentsAdapter();
      }
      @Override
      public Adapter casee4xAttributeIdentifier(e4xAttributeIdentifier object)
      {
        return createe4xAttributeIdentifierAdapter();
      }
      @Override
      public Adapter caseprimaryExpression(primaryExpression object)
      {
        return createprimaryExpressionAdapter();
      }
      @Override
      public Adapter casepropOrIdent(propOrIdent object)
      {
        return createpropOrIdentAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseregexpLiteral(regexpLiteral object)
      {
        return createregexpLiteralAdapter();
      }
      @Override
      public Adapter casenewExpression(newExpression object)
      {
        return createnewExpressionAdapter();
      }
      @Override
      public Adapter casefullNewSubexpression(fullNewSubexpression object)
      {
        return createfullNewSubexpressionAdapter();
      }
      @Override
      public Adapter casebrackets(brackets object)
      {
        return createbracketsAdapter();
      }
      @Override
      public Adapter caseencapsulatedExpression(encapsulatedExpression object)
      {
        return createencapsulatedExpressionAdapter();
      }
      @Override
      public Adapter casefunctionSignature(functionSignature object)
      {
        return createfunctionSignatureAdapter();
      }
      @Override
      public Adapter casetypeExpression(typeExpression object)
      {
        return createtypeExpressionAdapter();
      }
      @Override
      public Adapter caseparameterDeclarationList(parameterDeclarationList object)
      {
        return createparameterDeclarationListAdapter();
      }
      @Override
      public Adapter caseparameterDeclaration(parameterDeclaration object)
      {
        return createparameterDeclarationAdapter();
      }
      @Override
      public Adapter casebasicParameterDeclaration(basicParameterDeclaration object)
      {
        return createbasicParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseparameterDefault(parameterDefault object)
      {
        return createparameterDefaultAdapter();
      }
      @Override
      public Adapter caseparameterRestDeclaration(parameterRestDeclaration object)
      {
        return createparameterRestDeclarationAdapter();
      }
      @Override
      public Adapter caseblock(block object)
      {
        return createblockAdapter();
      }
      @Override
      public Adapter caseblockEntry(blockEntry object)
      {
        return createblockEntryAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDefaultXMLNamespaceStatement(DefaultXMLNamespaceStatement object)
      {
        return createDefaultXMLNamespaceStatementAdapter();
      }
      @Override
      public Adapter caseDeclarationStatement(DeclarationStatement object)
      {
        return createDeclarationStatementAdapter();
      }
      @Override
      public Adapter casevariableDeclarator(variableDeclarator object)
      {
        return createvariableDeclaratorAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter casedeclarationTail(declarationTail object)
      {
        return createdeclarationTailAdapter();
      }
      @Override
      public Adapter casevariableInitializer(variableInitializer object)
      {
        return createvariableInitializerAdapter();
      }
      @Override
      public Adapter caseExpressionStatement(ExpressionStatement object)
      {
        return createExpressionStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseThrowStatement(ThrowStatement object)
      {
        return createThrowStatementAdapter();
      }
      @Override
      public Adapter caseTryStatement(TryStatement object)
      {
        return createTryStatementAdapter();
      }
      @Override
      public Adapter casecatchBlock(catchBlock object)
      {
        return createcatchBlockAdapter();
      }
      @Override
      public Adapter casefinallyBlock(finallyBlock object)
      {
        return createfinallyBlockAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseswitchBlock(switchBlock object)
      {
        return createswitchBlockAdapter();
      }
      @Override
      public Adapter caseCaseStatement(CaseStatement object)
      {
        return createCaseStatementAdapter();
      }
      @Override
      public Adapter caseDefaultStatement(DefaultStatement object)
      {
        return createDefaultStatementAdapter();
      }
      @Override
      public Adapter caseswitchStatementList(switchStatementList object)
      {
        return createswitchStatementListAdapter();
      }
      @Override
      public Adapter caseForEachStatement(ForEachStatement object)
      {
        return createForEachStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter casetraditionalForClause(traditionalForClause object)
      {
        return createtraditionalForClauseAdapter();
      }
      @Override
      public Adapter caseforInClause(forInClause object)
      {
        return createforInClauseAdapter();
      }
      @Override
      public Adapter caseforInClauseDecl(forInClauseDecl object)
      {
        return createforInClauseDeclAdapter();
      }
      @Override
      public Adapter caseforInClauseTail(forInClauseTail object)
      {
        return createforInClauseTailAdapter();
      }
      @Override
      public Adapter caseforInit(forInit object)
      {
        return createforInitAdapter();
      }
      @Override
      public Adapter caseforCond(forCond object)
      {
        return createforCondAdapter();
      }
      @Override
      public Adapter caseforIter(forIter object)
      {
        return createforIterAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseDoWhileStatement(DoWhileStatement object)
      {
        return createDoWhileStatementAdapter();
      }
      @Override
      public Adapter caseWithStatement(WithStatement object)
      {
        return createWithStatementAdapter();
      }
      @Override
      public Adapter casefunctionCommon(functionCommon object)
      {
        return createfunctionCommonAdapter();
      }
      @Override
      public Adapter casefunctionExpression(functionExpression object)
      {
        return createfunctionExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod <em>Interface Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod
   * @generated
   */
  public Adapter createInterfaceMethodAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Modifier
   * @generated
   */
  public Adapter createModifierAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.VarType <em>Var Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.VarType
   * @generated
   */
  public Adapter createVarTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldList <em>field List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldList
   * @generated
   */
  public Adapter createfieldListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.literalField <em>literal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.literalField
   * @generated
   */
  public Adapter createliteralFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName <em>field Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.fieldName
   * @generated
   */
  public Adapter createfieldNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.element <em>element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.element
   * @generated
   */
  public Adapter createelementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent <em>qualified Ident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent
   * @generated
   */
  public Adapter createqualifiedIdentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.identi <em>identi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.identi
   * @generated
   */
  public Adapter createidentiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.identifier <em>identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.identifier
   * @generated
   */
  public Adapter createidentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier <em>property Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier
   * @generated
   */
  public Adapter createpropertyIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifier <em>qualifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifier
   * @generated
   */
  public Adapter createqualifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier <em>simple Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier
   * @generated
   */
  public Adapter createsimpleQualifiedIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier <em>expression Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier
   * @generated
   */
  public Adapter createexpressionQualifiedIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier <em>non Attribute Qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier
   * @generated
   */
  public Adapter createnonAttributeQualifiedIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier <em>qualified Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier
   * @generated
   */
  public Adapter createqualifiedIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.namespaceName <em>namespace Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.namespaceName
   * @generated
   */
  public Adapter createnamespaceNameAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.elementList <em>element List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.elementList
   * @generated
   */
  public Adapter createelementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList <em>nonempty Element List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList
   * @generated
   */
  public Adapter createnonemptyElementListAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.expressionList <em>expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.expressionList
   * @generated
   */
  public Adapter createexpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.assignmentExpression <em>assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.assignmentExpression
   * @generated
   */
  public Adapter createassignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression <em>conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalExpression
   * @generated
   */
  public Adapter createconditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression <em>conditional Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression
   * @generated
   */
  public Adapter createconditionalSubExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression <em>logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression
   * @generated
   */
  public Adapter createlogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression <em>logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression
   * @generated
   */
  public Adapter createlogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression <em>bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression
   * @generated
   */
  public Adapter createbitwiseOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression <em>bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression
   * @generated
   */
  public Adapter createbitwiseXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression <em>bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression
   * @generated
   */
  public Adapter createbitwiseAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.equalityExpression <em>equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.equalityExpression
   * @generated
   */
  public Adapter createequalityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.relationalExpression
   * @generated
   */
  public Adapter createrelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.shiftExpression <em>shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.shiftExpression
   * @generated
   */
  public Adapter createshiftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.additiveExpression
   * @generated
   */
  public Adapter createadditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression <em>multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression
   * @generated
   */
  public Adapter createmultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpression
   * @generated
   */
  public Adapter createunaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus <em>unary Expression Not Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus
   * @generated
   */
  public Adapter createunaryExpressionNotPlusMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression <em>postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.postfixExpression
   * @generated
   */
  public Adapter createpostfixExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier <em>e4x Attribute Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier
   * @generated
   */
  public Adapter createe4xAttributeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression <em>primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.primaryExpression
   * @generated
   */
  public Adapter createprimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent <em>prop Or Ident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.propOrIdent
   * @generated
   */
  public Adapter createpropOrIdentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.regexpLiteral <em>regexp Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.regexpLiteral
   * @generated
   */
  public Adapter createregexpLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.newExpression <em>new Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.newExpression
   * @generated
   */
  public Adapter createnewExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression <em>full New Subexpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression
   * @generated
   */
  public Adapter createfullNewSubexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.brackets <em>brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.brackets
   * @generated
   */
  public Adapter createbracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression <em>encapsulated Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression
   * @generated
   */
  public Adapter createencapsulatedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature <em>function Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionSignature
   * @generated
   */
  public Adapter createfunctionSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.typeExpression <em>type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.typeExpression
   * @generated
   */
  public Adapter createtypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList <em>parameter Declaration List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList
   * @generated
   */
  public Adapter createparameterDeclarationListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration <em>parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDeclaration
   * @generated
   */
  public Adapter createparameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration <em>basic Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration
   * @generated
   */
  public Adapter createbasicParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterDefault <em>parameter Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterDefault
   * @generated
   */
  public Adapter createparameterDefaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration <em>parameter Rest Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration
   * @generated
   */
  public Adapter createparameterRestDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.blockEntry <em>block Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.blockEntry
   * @generated
   */
  public Adapter createblockEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement <em>Default XML Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement
   * @generated
   */
  public Adapter createDefaultXMLNamespaceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement <em>Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement
   * @generated
   */
  public Adapter createDeclarationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator <em>variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableDeclarator
   * @generated
   */
  public Adapter createvariableDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.declarationTail <em>declaration Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.declarationTail
   * @generated
   */
  public Adapter createdeclarationTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.variableInitializer <em>variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.variableInitializer
   * @generated
   */
  public Adapter createvariableInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement
   * @generated
   */
  public Adapter createExpressionStatementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.ThrowStatement <em>Throw Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.ThrowStatement
   * @generated
   */
  public Adapter createThrowStatementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.catchBlock <em>catch Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.catchBlock
   * @generated
   */
  public Adapter createcatchBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.finallyBlock <em>finally Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.finallyBlock
   * @generated
   */
  public Adapter createfinallyBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock <em>switch Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchBlock
   * @generated
   */
  public Adapter createswitchBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.CaseStatement
   * @generated
   */
  public Adapter createCaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.DefaultStatement
   * @generated
   */
  public Adapter createDefaultStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.switchStatementList <em>switch Statement List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.switchStatementList
   * @generated
   */
  public Adapter createswitchStatementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement <em>For Each Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.ForEachStatement
   * @generated
   */
  public Adapter createForEachStatementAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause <em>traditional For Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.traditionalForClause
   * @generated
   */
  public Adapter createtraditionalForClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause <em>for In Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClause
   * @generated
   */
  public Adapter createforInClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl <em>for In Clause Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl
   * @generated
   */
  public Adapter createforInClauseDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forInClauseTail <em>for In Clause Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInClauseTail
   * @generated
   */
  public Adapter createforInClauseTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forInit <em>for Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forInit
   * @generated
   */
  public Adapter createforInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forCond <em>for Cond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forCond
   * @generated
   */
  public Adapter createforCondAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.forIter <em>for Iter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.forIter
   * @generated
   */
  public Adapter createforIterAdapter()
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
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.WithStatement <em>With Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.WithStatement
   * @generated
   */
  public Adapter createWithStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon <em>function Common</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionCommon
   * @generated
   */
  public Adapter createfunctionCommonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.lynorics.eclipse.jangaroo.aS3.functionExpression <em>function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.lynorics.eclipse.jangaroo.aS3.functionExpression
   * @generated
   */
  public Adapter createfunctionExpressionAdapter()
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
