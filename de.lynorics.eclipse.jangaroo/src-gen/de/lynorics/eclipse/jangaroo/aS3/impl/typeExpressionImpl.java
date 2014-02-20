/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.identifier;
import de.lynorics.eclipse.jangaroo.aS3.typeExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.typeExpressionImpl#getIdenti <em>Identi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeExpressionImpl extends MinimalEObjectImpl.Container implements typeExpression
{
  /**
   * The cached value of the '{@link #getIdenti() <em>Identi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdenti()
   * @generated
   * @ordered
   */
  protected identifier identi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeExpressionImpl()
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
    return AS3Package.Literals.TYPE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier getIdenti()
  {
    return identi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdenti(identifier newIdenti, NotificationChain msgs)
  {
    identifier oldIdenti = identi;
    identi = newIdenti;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.TYPE_EXPRESSION__IDENTI, oldIdenti, newIdenti);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdenti(identifier newIdenti)
  {
    if (newIdenti != identi)
    {
      NotificationChain msgs = null;
      if (identi != null)
        msgs = ((InternalEObject)identi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.TYPE_EXPRESSION__IDENTI, null, msgs);
      if (newIdenti != null)
        msgs = ((InternalEObject)newIdenti).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.TYPE_EXPRESSION__IDENTI, null, msgs);
      msgs = basicSetIdenti(newIdenti, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.TYPE_EXPRESSION__IDENTI, newIdenti, newIdenti));
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
      case AS3Package.TYPE_EXPRESSION__IDENTI:
        return basicSetIdenti(null, msgs);
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
      case AS3Package.TYPE_EXPRESSION__IDENTI:
        return getIdenti();
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
      case AS3Package.TYPE_EXPRESSION__IDENTI:
        setIdenti((identifier)newValue);
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
      case AS3Package.TYPE_EXPRESSION__IDENTI:
        setIdenti((identifier)null);
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
      case AS3Package.TYPE_EXPRESSION__IDENTI:
        return identi != null;
    }
    return super.eIsSet(featureID);
  }

} //typeExpressionImpl
