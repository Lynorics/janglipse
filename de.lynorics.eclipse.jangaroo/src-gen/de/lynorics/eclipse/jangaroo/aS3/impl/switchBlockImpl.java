/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.CaseStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultStatement;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;

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
 * An implementation of the model object '<em><b>switch Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl#getCase <em>Case</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.switchBlockImpl#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class switchBlockImpl extends MinimalEObjectImpl.Container implements switchBlock
{
  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected EList<CaseStatement> case_;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected DefaultStatement def;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected switchBlockImpl()
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
    return AS3Package.Literals.SWITCH_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseStatement> getCase()
  {
    if (case_ == null)
    {
      case_ = new EObjectContainmentEList<CaseStatement>(CaseStatement.class, this, AS3Package.SWITCH_BLOCK__CASE);
    }
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultStatement getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(DefaultStatement newDef, NotificationChain msgs)
  {
    DefaultStatement oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.SWITCH_BLOCK__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(DefaultStatement newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.SWITCH_BLOCK__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.SWITCH_BLOCK__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.SWITCH_BLOCK__DEF, newDef, newDef));
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
      case AS3Package.SWITCH_BLOCK__CASE:
        return ((InternalEList<?>)getCase()).basicRemove(otherEnd, msgs);
      case AS3Package.SWITCH_BLOCK__DEF:
        return basicSetDef(null, msgs);
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
      case AS3Package.SWITCH_BLOCK__CASE:
        return getCase();
      case AS3Package.SWITCH_BLOCK__DEF:
        return getDef();
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
      case AS3Package.SWITCH_BLOCK__CASE:
        getCase().clear();
        getCase().addAll((Collection<? extends CaseStatement>)newValue);
        return;
      case AS3Package.SWITCH_BLOCK__DEF:
        setDef((DefaultStatement)newValue);
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
      case AS3Package.SWITCH_BLOCK__CASE:
        getCase().clear();
        return;
      case AS3Package.SWITCH_BLOCK__DEF:
        setDef((DefaultStatement)null);
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
      case AS3Package.SWITCH_BLOCK__CASE:
        return case_ != null && !case_.isEmpty();
      case AS3Package.SWITCH_BLOCK__DEF:
        return def != null;
    }
    return super.eIsSet(featureID);
  }

} //switchBlockImpl
