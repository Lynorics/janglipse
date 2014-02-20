/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifier;
import de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl#getProId <em>Pro Id</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl#getQual <em>Qual</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl#getPiden <em>Piden</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.simpleQualifiedIdentifierImpl#getBra <em>Bra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simpleQualifiedIdentifierImpl extends nonAttributeQualifiedIdentifierImpl implements simpleQualifiedIdentifier
{
  /**
   * The cached value of the '{@link #getProId() <em>Pro Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProId()
   * @generated
   * @ordered
   */
  protected propertyIdentifier proId;

  /**
   * The cached value of the '{@link #getQual() <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQual()
   * @generated
   * @ordered
   */
  protected qualifier qual;

  /**
   * The cached value of the '{@link #getPiden() <em>Piden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPiden()
   * @generated
   * @ordered
   */
  protected propertyIdentifier piden;

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
  protected simpleQualifiedIdentifierImpl()
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
    return AS3Package.Literals.SIMPLE_QUALIFIED_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public propertyIdentifier getProId()
  {
    return proId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProId(propertyIdentifier newProId, NotificationChain msgs)
  {
    propertyIdentifier oldProId = proId;
    proId = newProId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID, oldProId, newProId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProId(propertyIdentifier newProId)
  {
    if (newProId != proId)
    {
      NotificationChain msgs = null;
      if (proId != null)
        msgs = ((InternalEObject)proId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID, null, msgs);
      if (newProId != null)
        msgs = ((InternalEObject)newProId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID, null, msgs);
      msgs = basicSetProId(newProId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID, newProId, newProId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifier getQual()
  {
    return qual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQual(qualifier newQual, NotificationChain msgs)
  {
    qualifier oldQual = qual;
    qual = newQual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL, oldQual, newQual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQual(qualifier newQual)
  {
    if (newQual != qual)
    {
      NotificationChain msgs = null;
      if (qual != null)
        msgs = ((InternalEObject)qual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL, null, msgs);
      if (newQual != null)
        msgs = ((InternalEObject)newQual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL, null, msgs);
      msgs = basicSetQual(newQual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL, newQual, newQual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public propertyIdentifier getPiden()
  {
    return piden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPiden(propertyIdentifier newPiden, NotificationChain msgs)
  {
    propertyIdentifier oldPiden = piden;
    piden = newPiden;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN, oldPiden, newPiden);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPiden(propertyIdentifier newPiden)
  {
    if (newPiden != piden)
    {
      NotificationChain msgs = null;
      if (piden != null)
        msgs = ((InternalEObject)piden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN, null, msgs);
      if (newPiden != null)
        msgs = ((InternalEObject)newPiden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN, null, msgs);
      msgs = basicSetPiden(newPiden, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN, newPiden, newPiden));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA, oldBra, newBra);
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
        msgs = ((InternalEObject)bra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA, null, msgs);
      if (newBra != null)
        msgs = ((InternalEObject)newBra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA, null, msgs);
      msgs = basicSetBra(newBra, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA, newBra, newBra));
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
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID:
        return basicSetProId(null, msgs);
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL:
        return basicSetQual(null, msgs);
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN:
        return basicSetPiden(null, msgs);
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA:
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
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID:
        return getProId();
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL:
        return getQual();
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN:
        return getPiden();
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA:
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
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID:
        setProId((propertyIdentifier)newValue);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL:
        setQual((qualifier)newValue);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN:
        setPiden((propertyIdentifier)newValue);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA:
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
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID:
        setProId((propertyIdentifier)null);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL:
        setQual((qualifier)null);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN:
        setPiden((propertyIdentifier)null);
        return;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA:
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
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PRO_ID:
        return proId != null;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__QUAL:
        return qual != null;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__PIDEN:
        return piden != null;
      case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER__BRA:
        return bra != null;
    }
    return super.eIsSet(featureID);
  }

} //simpleQualifiedIdentifierImpl
