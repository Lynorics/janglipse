/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.identi;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>qualified Ident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.qualifiedIdentImpl#getIde <em>Ide</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class qualifiedIdentImpl extends MinimalEObjectImpl.Container implements qualifiedIdent
{
  /**
   * The cached value of the '{@link #getIde() <em>Ide</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIde()
   * @generated
   * @ordered
   */
  protected identi ide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected qualifiedIdentImpl()
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
    return AS3Package.Literals.QUALIFIED_IDENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identi getIde()
  {
    return ide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIde(identi newIde, NotificationChain msgs)
  {
    identi oldIde = ide;
    ide = newIde;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.QUALIFIED_IDENT__IDE, oldIde, newIde);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIde(identi newIde)
  {
    if (newIde != ide)
    {
      NotificationChain msgs = null;
      if (ide != null)
        msgs = ((InternalEObject)ide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.QUALIFIED_IDENT__IDE, null, msgs);
      if (newIde != null)
        msgs = ((InternalEObject)newIde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.QUALIFIED_IDENT__IDE, null, msgs);
      msgs = basicSetIde(newIde, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.QUALIFIED_IDENT__IDE, newIde, newIde));
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
      case AS3Package.QUALIFIED_IDENT__IDE:
        return basicSetIde(null, msgs);
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
      case AS3Package.QUALIFIED_IDENT__IDE:
        return getIde();
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
      case AS3Package.QUALIFIED_IDENT__IDE:
        setIde((identi)newValue);
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
      case AS3Package.QUALIFIED_IDENT__IDE:
        setIde((identi)null);
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
      case AS3Package.QUALIFIED_IDENT__IDE:
        return ide != null;
    }
    return super.eIsSet(featureID);
  }

} //qualifiedIdentImpl
