/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.identifier;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl#getQual <em>Qual</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierImpl#getPoi <em>Poi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class identifierImpl extends MinimalEObjectImpl.Container implements identifier
{
  /**
   * The cached value of the '{@link #getQual() <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQual()
   * @generated
   * @ordered
   */
  protected qualifiedIdent qual;

  /**
   * The cached value of the '{@link #getPoi() <em>Poi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoi()
   * @generated
   * @ordered
   */
  protected EList<propOrIdent> poi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected identifierImpl()
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
    return AS3Package.Literals.IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedIdent getQual()
  {
    return qual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQual(qualifiedIdent newQual, NotificationChain msgs)
  {
    qualifiedIdent oldQual = qual;
    qual = newQual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER__QUAL, oldQual, newQual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQual(qualifiedIdent newQual)
  {
    if (newQual != qual)
    {
      NotificationChain msgs = null;
      if (qual != null)
        msgs = ((InternalEObject)qual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER__QUAL, null, msgs);
      if (newQual != null)
        msgs = ((InternalEObject)newQual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER__QUAL, null, msgs);
      msgs = basicSetQual(newQual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER__QUAL, newQual, newQual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<propOrIdent> getPoi()
  {
    if (poi == null)
    {
      poi = new EObjectContainmentEList<propOrIdent>(propOrIdent.class, this, AS3Package.IDENTIFIER__POI);
    }
    return poi;
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
      case AS3Package.IDENTIFIER__QUAL:
        return basicSetQual(null, msgs);
      case AS3Package.IDENTIFIER__POI:
        return ((InternalEList<?>)getPoi()).basicRemove(otherEnd, msgs);
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
      case AS3Package.IDENTIFIER__QUAL:
        return getQual();
      case AS3Package.IDENTIFIER__POI:
        return getPoi();
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
      case AS3Package.IDENTIFIER__QUAL:
        setQual((qualifiedIdent)newValue);
        return;
      case AS3Package.IDENTIFIER__POI:
        getPoi().clear();
        getPoi().addAll((Collection<? extends propOrIdent>)newValue);
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
      case AS3Package.IDENTIFIER__QUAL:
        setQual((qualifiedIdent)null);
        return;
      case AS3Package.IDENTIFIER__POI:
        getPoi().clear();
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
      case AS3Package.IDENTIFIER__QUAL:
        return qual != null;
      case AS3Package.IDENTIFIER__POI:
        return poi != null && !poi.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //identifierImpl
