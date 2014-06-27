/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>prop Or Ident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.propOrIdentImpl#getPropId <em>Prop Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class propOrIdentImpl extends MinimalEObjectImpl.Container implements propOrIdent
{
  /**
   * The cached value of the '{@link #getPropId() <em>Prop Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropId()
   * @generated
   * @ordered
   */
  protected qualifiedIdent propId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected propOrIdentImpl()
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
    return AS3Package.Literals.PROP_OR_IDENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedIdent getPropId()
  {
    return propId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropId(qualifiedIdent newPropId, NotificationChain msgs)
  {
    qualifiedIdent oldPropId = propId;
    propId = newPropId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PROP_OR_IDENT__PROP_ID, oldPropId, newPropId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropId(qualifiedIdent newPropId)
  {
    if (newPropId != propId)
    {
      NotificationChain msgs = null;
      if (propId != null)
        msgs = ((InternalEObject)propId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PROP_OR_IDENT__PROP_ID, null, msgs);
      if (newPropId != null)
        msgs = ((InternalEObject)newPropId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PROP_OR_IDENT__PROP_ID, null, msgs);
      msgs = basicSetPropId(newPropId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PROP_OR_IDENT__PROP_ID, newPropId, newPropId));
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
      case AS3Package.PROP_OR_IDENT__PROP_ID:
        return basicSetPropId(null, msgs);
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
      case AS3Package.PROP_OR_IDENT__PROP_ID:
        return getPropId();
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
      case AS3Package.PROP_OR_IDENT__PROP_ID:
        setPropId((qualifiedIdent)newValue);
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
      case AS3Package.PROP_OR_IDENT__PROP_ID:
        setPropId((qualifiedIdent)null);
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
      case AS3Package.PROP_OR_IDENT__PROP_ID:
        return propId != null;
    }
    return super.eIsSet(featureID);
  }

} //propOrIdentImpl
