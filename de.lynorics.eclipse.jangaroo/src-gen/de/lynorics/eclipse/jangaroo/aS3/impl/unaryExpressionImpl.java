/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl#getUaem <em>Uaem</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl#getUaep <em>Uaep</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionImpl#getUaenpm <em>Uaenpm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unaryExpressionImpl extends unaryExpressionNotPlusMinusImpl implements unaryExpression
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected unaryExpression expr;

  /**
   * The cached value of the '{@link #getUaem() <em>Uaem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUaem()
   * @generated
   * @ordered
   */
  protected unaryExpression uaem;

  /**
   * The cached value of the '{@link #getUaep() <em>Uaep</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUaep()
   * @generated
   * @ordered
   */
  protected unaryExpression uaep;

  /**
   * The cached value of the '{@link #getUaenpm() <em>Uaenpm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUaenpm()
   * @generated
   * @ordered
   */
  protected unaryExpressionNotPlusMinus uaenpm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unaryExpressionImpl()
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
    return AS3Package.Literals.UNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(unaryExpression newExpr, NotificationChain msgs)
  {
    unaryExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(unaryExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression getUaem()
  {
    return uaem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUaem(unaryExpression newUaem, NotificationChain msgs)
  {
    unaryExpression oldUaem = uaem;
    uaem = newUaem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAEM, oldUaem, newUaem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUaem(unaryExpression newUaem)
  {
    if (newUaem != uaem)
    {
      NotificationChain msgs = null;
      if (uaem != null)
        msgs = ((InternalEObject)uaem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAEM, null, msgs);
      if (newUaem != null)
        msgs = ((InternalEObject)newUaem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAEM, null, msgs);
      msgs = basicSetUaem(newUaem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAEM, newUaem, newUaem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression getUaep()
  {
    return uaep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUaep(unaryExpression newUaep, NotificationChain msgs)
  {
    unaryExpression oldUaep = uaep;
    uaep = newUaep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAEP, oldUaep, newUaep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUaep(unaryExpression newUaep)
  {
    if (newUaep != uaep)
    {
      NotificationChain msgs = null;
      if (uaep != null)
        msgs = ((InternalEObject)uaep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAEP, null, msgs);
      if (newUaep != null)
        msgs = ((InternalEObject)newUaep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAEP, null, msgs);
      msgs = basicSetUaep(newUaep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAEP, newUaep, newUaep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpressionNotPlusMinus getUaenpm()
  {
    return uaenpm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUaenpm(unaryExpressionNotPlusMinus newUaenpm, NotificationChain msgs)
  {
    unaryExpressionNotPlusMinus oldUaenpm = uaenpm;
    uaenpm = newUaenpm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAENPM, oldUaenpm, newUaenpm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUaenpm(unaryExpressionNotPlusMinus newUaenpm)
  {
    if (newUaenpm != uaenpm)
    {
      NotificationChain msgs = null;
      if (uaenpm != null)
        msgs = ((InternalEObject)uaenpm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAENPM, null, msgs);
      if (newUaenpm != null)
        msgs = ((InternalEObject)newUaenpm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.UNARY_EXPRESSION__UAENPM, null, msgs);
      msgs = basicSetUaenpm(newUaenpm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION__UAENPM, newUaenpm, newUaenpm));
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
      case AS3Package.UNARY_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case AS3Package.UNARY_EXPRESSION__UAEM:
        return basicSetUaem(null, msgs);
      case AS3Package.UNARY_EXPRESSION__UAEP:
        return basicSetUaep(null, msgs);
      case AS3Package.UNARY_EXPRESSION__UAENPM:
        return basicSetUaenpm(null, msgs);
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
      case AS3Package.UNARY_EXPRESSION__EXPR:
        return getExpr();
      case AS3Package.UNARY_EXPRESSION__UAEM:
        return getUaem();
      case AS3Package.UNARY_EXPRESSION__UAEP:
        return getUaep();
      case AS3Package.UNARY_EXPRESSION__UAENPM:
        return getUaenpm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AS3Package.UNARY_EXPRESSION__EXPR:
        setExpr((unaryExpression)newValue);
        return;
      case AS3Package.UNARY_EXPRESSION__UAEM:
        setUaem((unaryExpression)newValue);
        return;
      case AS3Package.UNARY_EXPRESSION__UAEP:
        setUaep((unaryExpression)newValue);
        return;
      case AS3Package.UNARY_EXPRESSION__UAENPM:
        setUaenpm((unaryExpressionNotPlusMinus)newValue);
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
      case AS3Package.UNARY_EXPRESSION__EXPR:
        setExpr((unaryExpression)null);
        return;
      case AS3Package.UNARY_EXPRESSION__UAEM:
        setUaem((unaryExpression)null);
        return;
      case AS3Package.UNARY_EXPRESSION__UAEP:
        setUaep((unaryExpression)null);
        return;
      case AS3Package.UNARY_EXPRESSION__UAENPM:
        setUaenpm((unaryExpressionNotPlusMinus)null);
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
      case AS3Package.UNARY_EXPRESSION__EXPR:
        return expr != null;
      case AS3Package.UNARY_EXPRESSION__UAEM:
        return uaem != null;
      case AS3Package.UNARY_EXPRESSION__UAEP:
        return uaep != null;
      case AS3Package.UNARY_EXPRESSION__UAENPM:
        return uaenpm != null;
    }
    return super.eIsSet(featureID);
  }

} //unaryExpressionImpl
