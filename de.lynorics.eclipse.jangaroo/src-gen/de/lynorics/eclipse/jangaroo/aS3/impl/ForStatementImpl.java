/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;
import de.lynorics.eclipse.jangaroo.aS3.traditionalForClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForIn <em>For In</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getFsstate <em>Fsstate</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getTraditionalForClause <em>Traditional For Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends MinimalEObjectImpl.Container implements ForStatement
{
  /**
   * The cached value of the '{@link #getForIn() <em>For In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForIn()
   * @generated
   * @ordered
   */
  protected forInClause forIn;

  /**
   * The cached value of the '{@link #getFsstate() <em>Fsstate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFsstate()
   * @generated
   * @ordered
   */
  protected Statement fsstate;

  /**
   * The cached value of the '{@link #getTraditionalForClause() <em>Traditional For Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraditionalForClause()
   * @generated
   * @ordered
   */
  protected traditionalForClause traditionalForClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return AS3Package.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClause getForIn()
  {
    return forIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForIn(forInClause newForIn, NotificationChain msgs)
  {
    forInClause oldForIn = forIn;
    forIn = newForIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOR_IN, oldForIn, newForIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForIn(forInClause newForIn)
  {
    if (newForIn != forIn)
    {
      NotificationChain msgs = null;
      if (forIn != null)
        msgs = ((InternalEObject)forIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOR_IN, null, msgs);
      if (newForIn != null)
        msgs = ((InternalEObject)newForIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOR_IN, null, msgs);
      msgs = basicSetForIn(newForIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOR_IN, newForIn, newForIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getFsstate()
  {
    return fsstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFsstate(Statement newFsstate, NotificationChain msgs)
  {
    Statement oldFsstate = fsstate;
    fsstate = newFsstate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FSSTATE, oldFsstate, newFsstate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFsstate(Statement newFsstate)
  {
    if (newFsstate != fsstate)
    {
      NotificationChain msgs = null;
      if (fsstate != null)
        msgs = ((InternalEObject)fsstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FSSTATE, null, msgs);
      if (newFsstate != null)
        msgs = ((InternalEObject)newFsstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FSSTATE, null, msgs);
      msgs = basicSetFsstate(newFsstate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FSSTATE, newFsstate, newFsstate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public traditionalForClause getTraditionalForClause()
  {
    return traditionalForClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraditionalForClause(traditionalForClause newTraditionalForClause, NotificationChain msgs)
  {
    traditionalForClause oldTraditionalForClause = traditionalForClause;
    traditionalForClause = newTraditionalForClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE, oldTraditionalForClause, newTraditionalForClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraditionalForClause(traditionalForClause newTraditionalForClause)
  {
    if (newTraditionalForClause != traditionalForClause)
    {
      NotificationChain msgs = null;
      if (traditionalForClause != null)
        msgs = ((InternalEObject)traditionalForClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE, null, msgs);
      if (newTraditionalForClause != null)
        msgs = ((InternalEObject)newTraditionalForClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE, null, msgs);
      msgs = basicSetTraditionalForClause(newTraditionalForClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE, newTraditionalForClause, newTraditionalForClause));
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
      case AS3Package.FOR_STATEMENT__FOR_IN:
        return basicSetForIn(null, msgs);
      case AS3Package.FOR_STATEMENT__FSSTATE:
        return basicSetFsstate(null, msgs);
      case AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE:
        return basicSetTraditionalForClause(null, msgs);
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
      case AS3Package.FOR_STATEMENT__FOR_IN:
        return getForIn();
      case AS3Package.FOR_STATEMENT__FSSTATE:
        return getFsstate();
      case AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE:
        return getTraditionalForClause();
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
      case AS3Package.FOR_STATEMENT__FOR_IN:
        setForIn((forInClause)newValue);
        return;
      case AS3Package.FOR_STATEMENT__FSSTATE:
        setFsstate((Statement)newValue);
        return;
      case AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE:
        setTraditionalForClause((traditionalForClause)newValue);
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
      case AS3Package.FOR_STATEMENT__FOR_IN:
        setForIn((forInClause)null);
        return;
      case AS3Package.FOR_STATEMENT__FSSTATE:
        setFsstate((Statement)null);
        return;
      case AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE:
        setTraditionalForClause((traditionalForClause)null);
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
      case AS3Package.FOR_STATEMENT__FOR_IN:
        return forIn != null;
      case AS3Package.FOR_STATEMENT__FSSTATE:
        return fsstate != null;
      case AS3Package.FOR_STATEMENT__TRADITIONAL_FOR_CLAUSE:
        return traditionalForClause != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl
