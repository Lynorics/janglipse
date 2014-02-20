/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>encapsulated Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl#getPden <em>Pden</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.encapsulatedExpressionImpl#getBra <em>Bra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class encapsulatedExpressionImpl extends expressionQualifiedIdentifierImpl implements encapsulatedExpression
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected encapsulatedExpressionImpl()
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
    return AS3Package.Literals.ENCAPSULATED_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ENCAPSULATED_EXPRESSION__PDEN, oldPden, newPden);
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
        msgs = ((InternalEObject)pden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ENCAPSULATED_EXPRESSION__PDEN, null, msgs);
      if (newPden != null)
        msgs = ((InternalEObject)newPden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ENCAPSULATED_EXPRESSION__PDEN, null, msgs);
      msgs = basicSetPden(newPden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ENCAPSULATED_EXPRESSION__PDEN, newPden, newPden));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ENCAPSULATED_EXPRESSION__BRA, oldBra, newBra);
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
        msgs = ((InternalEObject)bra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ENCAPSULATED_EXPRESSION__BRA, null, msgs);
      if (newBra != null)
        msgs = ((InternalEObject)newBra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ENCAPSULATED_EXPRESSION__BRA, null, msgs);
      msgs = basicSetBra(newBra, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ENCAPSULATED_EXPRESSION__BRA, newBra, newBra));
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
      case AS3Package.ENCAPSULATED_EXPRESSION__PDEN:
        return basicSetPden(null, msgs);
      case AS3Package.ENCAPSULATED_EXPRESSION__BRA:
        return basicSetBra(null, msgs);
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
      case AS3Package.ENCAPSULATED_EXPRESSION__PDEN:
        return getPden();
      case AS3Package.ENCAPSULATED_EXPRESSION__BRA:
        return getBra();
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
      case AS3Package.ENCAPSULATED_EXPRESSION__PDEN:
        setPden((propertyIdentifier)newValue);
        return;
      case AS3Package.ENCAPSULATED_EXPRESSION__BRA:
        setBra((brackets)newValue);
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
      case AS3Package.ENCAPSULATED_EXPRESSION__PDEN:
        setPden((propertyIdentifier)null);
        return;
      case AS3Package.ENCAPSULATED_EXPRESSION__BRA:
        setBra((brackets)null);
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
      case AS3Package.ENCAPSULATED_EXPRESSION__PDEN:
        return pden != null;
      case AS3Package.ENCAPSULATED_EXPRESSION__BRA:
        return bra != null;
    }
    return super.eIsSet(featureID);
  }

} //encapsulatedExpressionImpl
