/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.postfixExpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getPeexpr <em>Peexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getPepoi <em>Pepoi</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getPewi <em>Pewi</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getE4x <em>E4x</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.postfixExpressionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class postfixExpressionImpl extends unaryExpressionNotPlusMinusImpl implements postfixExpression
{
  /**
   * The cached value of the '{@link #getPeexpr() <em>Peexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeexpr()
   * @generated
   * @ordered
   */
  protected primaryExpression peexpr;

  /**
   * The cached value of the '{@link #getPepoi() <em>Pepoi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPepoi()
   * @generated
   * @ordered
   */
  protected EList<propOrIdent> pepoi;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> expr;

  /**
   * The cached value of the '{@link #getPewi() <em>Pewi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPewi()
   * @generated
   * @ordered
   */
  protected EList<qualifiedIdentifier> pewi;

  /**
   * The cached value of the '{@link #getE4x() <em>E4x</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE4x()
   * @generated
   * @ordered
   */
  protected EList<e4xAttributeIdentifier> e4x;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<arguments> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfixExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AS3Package.Literals.POSTFIX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpression getPeexpr()
  {
    return peexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPeexpr(primaryExpression newPeexpr, NotificationChain msgs)
  {
    primaryExpression oldPeexpr = peexpr;
    peexpr = newPeexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.POSTFIX_EXPRESSION__PEEXPR, oldPeexpr, newPeexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeexpr(primaryExpression newPeexpr)
  {
    if (newPeexpr != peexpr)
    {
      NotificationChain msgs = null;
      if (peexpr != null)
        msgs = ((InternalEObject)peexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.POSTFIX_EXPRESSION__PEEXPR, null, msgs);
      if (newPeexpr != null)
        msgs = ((InternalEObject)newPeexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.POSTFIX_EXPRESSION__PEEXPR, null, msgs);
      msgs = basicSetPeexpr(newPeexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.POSTFIX_EXPRESSION__PEEXPR, newPeexpr, newPeexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<propOrIdent> getPepoi()
  {
    if (pepoi == null)
    {
      pepoi = new EObjectContainmentEList<propOrIdent>(propOrIdent.class, this, AS3Package.POSTFIX_EXPRESSION__PEPOI);
    }
    return pepoi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<Expression>(Expression.class, this, AS3Package.POSTFIX_EXPRESSION__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<qualifiedIdentifier> getPewi()
  {
    if (pewi == null)
    {
      pewi = new EObjectContainmentEList<qualifiedIdentifier>(qualifiedIdentifier.class, this, AS3Package.POSTFIX_EXPRESSION__PEWI);
    }
    return pewi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<e4xAttributeIdentifier> getE4x()
  {
    if (e4x == null)
    {
      e4x = new EObjectContainmentEList<e4xAttributeIdentifier>(e4xAttributeIdentifier.class, this, AS3Package.POSTFIX_EXPRESSION__E4X);
    }
    return e4x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<arguments> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<arguments>(arguments.class, this, AS3Package.POSTFIX_EXPRESSION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AS3Package.POSTFIX_EXPRESSION__PEEXPR:
        return basicSetPeexpr(null, msgs);
      case AS3Package.POSTFIX_EXPRESSION__PEPOI:
        return ((InternalEList<?>)getPepoi()).basicRemove(otherEnd, msgs);
      case AS3Package.POSTFIX_EXPRESSION__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
      case AS3Package.POSTFIX_EXPRESSION__PEWI:
        return ((InternalEList<?>)getPewi()).basicRemove(otherEnd, msgs);
      case AS3Package.POSTFIX_EXPRESSION__E4X:
        return ((InternalEList<?>)getE4x()).basicRemove(otherEnd, msgs);
      case AS3Package.POSTFIX_EXPRESSION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AS3Package.POSTFIX_EXPRESSION__PEEXPR:
        return getPeexpr();
      case AS3Package.POSTFIX_EXPRESSION__PEPOI:
        return getPepoi();
      case AS3Package.POSTFIX_EXPRESSION__EXPR:
        return getExpr();
      case AS3Package.POSTFIX_EXPRESSION__PEWI:
        return getPewi();
      case AS3Package.POSTFIX_EXPRESSION__E4X:
        return getE4x();
      case AS3Package.POSTFIX_EXPRESSION__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AS3Package.POSTFIX_EXPRESSION__PEEXPR:
        setPeexpr((primaryExpression)newValue);
        return;
      case AS3Package.POSTFIX_EXPRESSION__PEPOI:
        getPepoi().clear();
        getPepoi().addAll((Collection<? extends propOrIdent>)newValue);
        return;
      case AS3Package.POSTFIX_EXPRESSION__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends Expression>)newValue);
        return;
      case AS3Package.POSTFIX_EXPRESSION__PEWI:
        getPewi().clear();
        getPewi().addAll((Collection<? extends qualifiedIdentifier>)newValue);
        return;
      case AS3Package.POSTFIX_EXPRESSION__E4X:
        getE4x().clear();
        getE4x().addAll((Collection<? extends e4xAttributeIdentifier>)newValue);
        return;
      case AS3Package.POSTFIX_EXPRESSION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends arguments>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AS3Package.POSTFIX_EXPRESSION__PEEXPR:
        setPeexpr((primaryExpression)null);
        return;
      case AS3Package.POSTFIX_EXPRESSION__PEPOI:
        getPepoi().clear();
        return;
      case AS3Package.POSTFIX_EXPRESSION__EXPR:
        getExpr().clear();
        return;
      case AS3Package.POSTFIX_EXPRESSION__PEWI:
        getPewi().clear();
        return;
      case AS3Package.POSTFIX_EXPRESSION__E4X:
        getE4x().clear();
        return;
      case AS3Package.POSTFIX_EXPRESSION__ARGS:
        getArgs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AS3Package.POSTFIX_EXPRESSION__PEEXPR:
        return peexpr != null;
      case AS3Package.POSTFIX_EXPRESSION__PEPOI:
        return pepoi != null && !pepoi.isEmpty();
      case AS3Package.POSTFIX_EXPRESSION__EXPR:
        return expr != null && !expr.isEmpty();
      case AS3Package.POSTFIX_EXPRESSION__PEWI:
        return pewi != null && !pewi.isEmpty();
      case AS3Package.POSTFIX_EXPRESSION__E4X:
        return e4x != null && !e4x.isEmpty();
      case AS3Package.POSTFIX_EXPRESSION__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //postfixExpressionImpl
