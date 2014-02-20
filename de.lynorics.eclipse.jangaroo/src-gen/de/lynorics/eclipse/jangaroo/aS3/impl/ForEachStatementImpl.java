/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.ForEachStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl#getFesfor <em>Fesfor</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForEachStatementImpl#getFes <em>Fes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachStatementImpl extends StatementImpl implements ForEachStatement
{
  /**
   * The cached value of the '{@link #getFesfor() <em>Fesfor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFesfor()
   * @generated
   * @ordered
   */
  protected forInClause fesfor;

  /**
   * The cached value of the '{@link #getFes() <em>Fes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFes()
   * @generated
   * @ordered
   */
  protected Statement fes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachStatementImpl()
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
    return AS3Package.Literals.FOR_EACH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forInClause getFesfor()
  {
    return fesfor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFesfor(forInClause newFesfor, NotificationChain msgs)
  {
    forInClause oldFesfor = fesfor;
    fesfor = newFesfor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_EACH_STATEMENT__FESFOR, oldFesfor, newFesfor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFesfor(forInClause newFesfor)
  {
    if (newFesfor != fesfor)
    {
      NotificationChain msgs = null;
      if (fesfor != null)
        msgs = ((InternalEObject)fesfor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_EACH_STATEMENT__FESFOR, null, msgs);
      if (newFesfor != null)
        msgs = ((InternalEObject)newFesfor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_EACH_STATEMENT__FESFOR, null, msgs);
      msgs = basicSetFesfor(newFesfor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_EACH_STATEMENT__FESFOR, newFesfor, newFesfor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getFes()
  {
    return fes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFes(Statement newFes, NotificationChain msgs)
  {
    Statement oldFes = fes;
    fes = newFes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_EACH_STATEMENT__FES, oldFes, newFes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFes(Statement newFes)
  {
    if (newFes != fes)
    {
      NotificationChain msgs = null;
      if (fes != null)
        msgs = ((InternalEObject)fes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_EACH_STATEMENT__FES, null, msgs);
      if (newFes != null)
        msgs = ((InternalEObject)newFes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_EACH_STATEMENT__FES, null, msgs);
      msgs = basicSetFes(newFes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_EACH_STATEMENT__FES, newFes, newFes));
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
      case AS3Package.FOR_EACH_STATEMENT__FESFOR:
        return basicSetFesfor(null, msgs);
      case AS3Package.FOR_EACH_STATEMENT__FES:
        return basicSetFes(null, msgs);
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
      case AS3Package.FOR_EACH_STATEMENT__FESFOR:
        return getFesfor();
      case AS3Package.FOR_EACH_STATEMENT__FES:
        return getFes();
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
      case AS3Package.FOR_EACH_STATEMENT__FESFOR:
        setFesfor((forInClause)newValue);
        return;
      case AS3Package.FOR_EACH_STATEMENT__FES:
        setFes((Statement)newValue);
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
      case AS3Package.FOR_EACH_STATEMENT__FESFOR:
        setFesfor((forInClause)null);
        return;
      case AS3Package.FOR_EACH_STATEMENT__FES:
        setFes((Statement)null);
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
      case AS3Package.FOR_EACH_STATEMENT__FESFOR:
        return fesfor != null;
      case AS3Package.FOR_EACH_STATEMENT__FES:
        return fes != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachStatementImpl
