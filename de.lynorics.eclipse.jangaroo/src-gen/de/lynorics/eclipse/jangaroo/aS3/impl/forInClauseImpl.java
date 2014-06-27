/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseTail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for In Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl#getFicdecl <em>Ficdecl</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.forInClauseImpl#getFictail <em>Fictail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class forInClauseImpl extends MinimalEObjectImpl.Container implements forInClause
{
  /**
   * The cached value of the '{@link #getFicdecl() <em>Ficdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFicdecl()
   * @generated
   * @ordered
   */
  protected forInClauseDecl ficdecl;

  /**
   * The cached value of the '{@link #getFictail() <em>Fictail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFictail()
   * @generated
   * @ordered
   */
  protected forInClauseTail fictail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected forInClauseImpl()
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
    return AS3Package.Literals.FOR_IN_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClauseDecl getFicdecl()
  {
    return ficdecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFicdecl(forInClauseDecl newFicdecl, NotificationChain msgs)
  {
    forInClauseDecl oldFicdecl = ficdecl;
    ficdecl = newFicdecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_IN_CLAUSE__FICDECL, oldFicdecl, newFicdecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFicdecl(forInClauseDecl newFicdecl)
  {
    if (newFicdecl != ficdecl)
    {
      NotificationChain msgs = null;
      if (ficdecl != null)
        msgs = ((InternalEObject)ficdecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_IN_CLAUSE__FICDECL, null, msgs);
      if (newFicdecl != null)
        msgs = ((InternalEObject)newFicdecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_IN_CLAUSE__FICDECL, null, msgs);
      msgs = basicSetFicdecl(newFicdecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_IN_CLAUSE__FICDECL, newFicdecl, newFicdecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClauseTail getFictail()
  {
    return fictail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFictail(forInClauseTail newFictail, NotificationChain msgs)
  {
    forInClauseTail oldFictail = fictail;
    fictail = newFictail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_IN_CLAUSE__FICTAIL, oldFictail, newFictail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFictail(forInClauseTail newFictail)
  {
    if (newFictail != fictail)
    {
      NotificationChain msgs = null;
      if (fictail != null)
        msgs = ((InternalEObject)fictail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_IN_CLAUSE__FICTAIL, null, msgs);
      if (newFictail != null)
        msgs = ((InternalEObject)newFictail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_IN_CLAUSE__FICTAIL, null, msgs);
      msgs = basicSetFictail(newFictail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_IN_CLAUSE__FICTAIL, newFictail, newFictail));
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
      case AS3Package.FOR_IN_CLAUSE__FICDECL:
        return basicSetFicdecl(null, msgs);
      case AS3Package.FOR_IN_CLAUSE__FICTAIL:
        return basicSetFictail(null, msgs);
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
      case AS3Package.FOR_IN_CLAUSE__FICDECL:
        return getFicdecl();
      case AS3Package.FOR_IN_CLAUSE__FICTAIL:
        return getFictail();
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
      case AS3Package.FOR_IN_CLAUSE__FICDECL:
        setFicdecl((forInClauseDecl)newValue);
        return;
      case AS3Package.FOR_IN_CLAUSE__FICTAIL:
        setFictail((forInClauseTail)newValue);
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
      case AS3Package.FOR_IN_CLAUSE__FICDECL:
        setFicdecl((forInClauseDecl)null);
        return;
      case AS3Package.FOR_IN_CLAUSE__FICTAIL:
        setFictail((forInClauseTail)null);
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
      case AS3Package.FOR_IN_CLAUSE__FICDECL:
        return ficdecl != null;
      case AS3Package.FOR_IN_CLAUSE__FICTAIL:
        return fictail != null;
    }
    return super.eIsSet(featureID);
  }

} //forInClauseImpl
