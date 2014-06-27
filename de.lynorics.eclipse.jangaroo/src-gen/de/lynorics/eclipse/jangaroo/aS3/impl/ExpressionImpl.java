/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.CaseStatement;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
import de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.ThrowStatement;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;
import de.lynorics.eclipse.jangaroo.aS3.switchStatementList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ExpressionImpl#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends exprOrObjectLiteralImpl implements Expression
{
  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected Condition assert_;

  /**
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected switchBlock switch_;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected switchStatementList l;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return AS3Package.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssert(Condition newAssert, NotificationChain msgs)
  {
    Condition oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__ASSERT, oldAssert, newAssert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(Condition newAssert)
  {
    if (newAssert != assert_)
    {
      NotificationChain msgs = null;
      if (assert_ != null)
        msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__ASSERT, null, msgs);
      if (newAssert != null)
        msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__ASSERT, null, msgs);
      msgs = basicSetAssert(newAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__ASSERT, newAssert, newAssert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchBlock getSwitch()
  {
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitch(switchBlock newSwitch, NotificationChain msgs)
  {
    switchBlock oldSwitch = switch_;
    switch_ = newSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__SWITCH, oldSwitch, newSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch(switchBlock newSwitch)
  {
    if (newSwitch != switch_)
    {
      NotificationChain msgs = null;
      if (switch_ != null)
        msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__SWITCH, null, msgs);
      if (newSwitch != null)
        msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__SWITCH, null, msgs);
      msgs = basicSetSwitch(newSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__SWITCH, newSwitch, newSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchStatementList getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(switchStatementList newL, NotificationChain msgs)
  {
    switchStatementList oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(switchStatementList newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPRESSION__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPRESSION__L, newL, newL));
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
      case AS3Package.EXPRESSION__ASSERT:
        return basicSetAssert(null, msgs);
      case AS3Package.EXPRESSION__SWITCH:
        return basicSetSwitch(null, msgs);
      case AS3Package.EXPRESSION__L:
        return basicSetL(null, msgs);
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
      case AS3Package.EXPRESSION__ASSERT:
        return getAssert();
      case AS3Package.EXPRESSION__SWITCH:
        return getSwitch();
      case AS3Package.EXPRESSION__L:
        return getL();
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
      case AS3Package.EXPRESSION__ASSERT:
        setAssert((Condition)newValue);
        return;
      case AS3Package.EXPRESSION__SWITCH:
        setSwitch((switchBlock)newValue);
        return;
      case AS3Package.EXPRESSION__L:
        setL((switchStatementList)newValue);
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
      case AS3Package.EXPRESSION__ASSERT:
        setAssert((Condition)null);
        return;
      case AS3Package.EXPRESSION__SWITCH:
        setSwitch((switchBlock)null);
        return;
      case AS3Package.EXPRESSION__L:
        setL((switchStatementList)null);
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
      case AS3Package.EXPRESSION__ASSERT:
        return assert_ != null;
      case AS3Package.EXPRESSION__SWITCH:
        return switch_ != null;
      case AS3Package.EXPRESSION__L:
        return l != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.EXPRESSION__ASSERT: return AS3Package.STATEMENT__ASSERT;
        default: return -1;
      }
    }
    if (baseClass == SwitchStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.EXPRESSION__SWITCH: return AS3Package.CONDITION__SWITCH;
        default: return -1;
      }
    }
    if (baseClass == DefaultXMLNamespaceStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ThrowStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == CaseStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.STATEMENT__ASSERT: return AS3Package.EXPRESSION__ASSERT;
        default: return -1;
      }
    }
    if (baseClass == SwitchStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.CONDITION__SWITCH: return AS3Package.EXPRESSION__SWITCH;
        default: return -1;
      }
    }
    if (baseClass == DefaultXMLNamespaceStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ThrowStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == CaseStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExpressionImpl
