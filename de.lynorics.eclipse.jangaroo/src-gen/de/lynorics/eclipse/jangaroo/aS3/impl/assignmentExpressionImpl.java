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
import de.lynorics.eclipse.jangaroo.aS3.assignmentExpression;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.elementList;
import de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.expressionQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.nonAttributeQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.nonemptyElementList;
import de.lynorics.eclipse.jangaroo.aS3.parameterDefault;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;
import de.lynorics.eclipse.jangaroo.aS3.switchStatementList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getL <em>L</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getPden <em>Pden</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getBra <em>Bra</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.assignmentExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class assignmentExpressionImpl extends elementImpl implements assignmentExpression
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
   * The cached value of the '{@link #getPden() <em>Pden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPden()
   * @generated
   * @ordered
   */
  protected propertyIdentifier pden;

  /**
   * The cached value of the '{@link #getBra() <em>Bra</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBra()
   * @generated
   * @ordered
   */
  protected brackets bra;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<EObject> expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected assignmentExpressionImpl()
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
    return AS3Package.Literals.ASSIGNMENT_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__ASSERT, oldAssert, newAssert);
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
        msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__ASSERT, null, msgs);
      if (newAssert != null)
        msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__ASSERT, null, msgs);
      msgs = basicSetAssert(newAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__ASSERT, newAssert, newAssert));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__SWITCH, oldSwitch, newSwitch);
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
        msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__SWITCH, null, msgs);
      if (newSwitch != null)
        msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__SWITCH, null, msgs);
      msgs = basicSetSwitch(newSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__SWITCH, newSwitch, newSwitch));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__L, oldL, newL);
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
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public propertyIdentifier getPden()
  {
    return pden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPden(propertyIdentifier newPden, NotificationChain msgs)
  {
    propertyIdentifier oldPden = pden;
    pden = newPden;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__PDEN, oldPden, newPden);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPden(propertyIdentifier newPden)
  {
    if (newPden != pden)
    {
      NotificationChain msgs = null;
      if (pden != null)
        msgs = ((InternalEObject)pden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__PDEN, null, msgs);
      if (newPden != null)
        msgs = ((InternalEObject)newPden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__PDEN, null, msgs);
      msgs = basicSetPden(newPden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__PDEN, newPden, newPden));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public brackets getBra()
  {
    return bra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBra(brackets newBra, NotificationChain msgs)
  {
    brackets oldBra = bra;
    bra = newBra;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__BRA, oldBra, newBra);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBra(brackets newBra)
  {
    if (newBra != bra)
    {
      NotificationChain msgs = null;
      if (bra != null)
        msgs = ((InternalEObject)bra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__BRA, null, msgs);
      if (newBra != null)
        msgs = ((InternalEObject)newBra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ASSIGNMENT_EXPRESSION__BRA, null, msgs);
      msgs = basicSetBra(newBra, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ASSIGNMENT_EXPRESSION__BRA, newBra, newBra));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<EObject>(EObject.class, this, AS3Package.ASSIGNMENT_EXPRESSION__EXPR);
    }
    return expr;
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
      case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT:
        return basicSetAssert(null, msgs);
      case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH:
        return basicSetSwitch(null, msgs);
      case AS3Package.ASSIGNMENT_EXPRESSION__L:
        return basicSetL(null, msgs);
      case AS3Package.ASSIGNMENT_EXPRESSION__PDEN:
        return basicSetPden(null, msgs);
      case AS3Package.ASSIGNMENT_EXPRESSION__BRA:
        return basicSetBra(null, msgs);
      case AS3Package.ASSIGNMENT_EXPRESSION__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
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
      case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT:
        return getAssert();
      case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH:
        return getSwitch();
      case AS3Package.ASSIGNMENT_EXPRESSION__L:
        return getL();
      case AS3Package.ASSIGNMENT_EXPRESSION__PDEN:
        return getPden();
      case AS3Package.ASSIGNMENT_EXPRESSION__BRA:
        return getBra();
      case AS3Package.ASSIGNMENT_EXPRESSION__EXPR:
        return getExpr();
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
      case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT:
        setAssert((Condition)newValue);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH:
        setSwitch((switchBlock)newValue);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__L:
        setL((switchStatementList)newValue);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__PDEN:
        setPden((propertyIdentifier)newValue);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__BRA:
        setBra((brackets)newValue);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends EObject>)newValue);
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
      case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT:
        setAssert((Condition)null);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH:
        setSwitch((switchBlock)null);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__L:
        setL((switchStatementList)null);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__PDEN:
        setPden((propertyIdentifier)null);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__BRA:
        setBra((brackets)null);
        return;
      case AS3Package.ASSIGNMENT_EXPRESSION__EXPR:
        getExpr().clear();
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
      case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT:
        return assert_ != null;
      case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH:
        return switch_ != null;
      case AS3Package.ASSIGNMENT_EXPRESSION__L:
        return l != null;
      case AS3Package.ASSIGNMENT_EXPRESSION__PDEN:
        return pden != null;
      case AS3Package.ASSIGNMENT_EXPRESSION__BRA:
        return bra != null;
      case AS3Package.ASSIGNMENT_EXPRESSION__EXPR:
        return expr != null && !expr.isEmpty();
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
    if (baseClass == elementList.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nonemptyElementList.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == exprOrObjectLiteral.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.ASSIGNMENT_EXPRESSION__ASSERT: return AS3Package.STATEMENT__ASSERT;
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
        case AS3Package.ASSIGNMENT_EXPRESSION__SWITCH: return AS3Package.CONDITION__SWITCH;
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
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.ASSIGNMENT_EXPRESSION__L: return AS3Package.EXPRESSION__L;
        default: return -1;
      }
    }
    if (baseClass == qualifiedIdentifier.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nonAttributeQualifiedIdentifier.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionQualifiedIdentifier.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == encapsulatedExpression.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.ASSIGNMENT_EXPRESSION__PDEN: return AS3Package.ENCAPSULATED_EXPRESSION__PDEN;
        case AS3Package.ASSIGNMENT_EXPRESSION__BRA: return AS3Package.ENCAPSULATED_EXPRESSION__BRA;
        default: return -1;
      }
    }
    if (baseClass == parameterDefault.class)
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
    if (baseClass == elementList.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nonemptyElementList.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == exprOrObjectLiteral.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.STATEMENT__ASSERT: return AS3Package.ASSIGNMENT_EXPRESSION__ASSERT;
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
        case AS3Package.CONDITION__SWITCH: return AS3Package.ASSIGNMENT_EXPRESSION__SWITCH;
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
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.EXPRESSION__L: return AS3Package.ASSIGNMENT_EXPRESSION__L;
        default: return -1;
      }
    }
    if (baseClass == qualifiedIdentifier.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nonAttributeQualifiedIdentifier.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == expressionQualifiedIdentifier.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == encapsulatedExpression.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.ENCAPSULATED_EXPRESSION__PDEN: return AS3Package.ASSIGNMENT_EXPRESSION__PDEN;
        case AS3Package.ENCAPSULATED_EXPRESSION__BRA: return AS3Package.ASSIGNMENT_EXPRESSION__BRA;
        default: return -1;
      }
    }
    if (baseClass == parameterDefault.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //assignmentExpressionImpl
