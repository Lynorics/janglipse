/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.directive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getAnnonFields <em>Annon Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class directiveImpl extends MinimalEObjectImpl.Container implements directive
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnnonFields() <em>Annon Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnonFields()
   * @generated
   * @ordered
   */
  protected annotationFields annonFields;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected Uses uses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected directiveImpl()
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
    return AS3Package.Literals.DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationFields getAnnonFields()
  {
    return annonFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnonFields(annotationFields newAnnonFields, NotificationChain msgs)
  {
    annotationFields oldAnnonFields = annonFields;
    annonFields = newAnnonFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__ANNON_FIELDS, oldAnnonFields, newAnnonFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnonFields(annotationFields newAnnonFields)
  {
    if (newAnnonFields != annonFields)
    {
      NotificationChain msgs = null;
      if (annonFields != null)
        msgs = ((InternalEObject)annonFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__ANNON_FIELDS, null, msgs);
      if (newAnnonFields != null)
        msgs = ((InternalEObject)newAnnonFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__ANNON_FIELDS, null, msgs);
      msgs = basicSetAnnonFields(newAnnonFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__ANNON_FIELDS, newAnnonFields, newAnnonFields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uses getUses()
  {
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUses(Uses newUses, NotificationChain msgs)
  {
    Uses oldUses = uses;
    uses = newUses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__USES, oldUses, newUses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUses(Uses newUses)
  {
    if (newUses != uses)
    {
      NotificationChain msgs = null;
      if (uses != null)
        msgs = ((InternalEObject)uses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__USES, null, msgs);
      if (newUses != null)
        msgs = ((InternalEObject)newUses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__USES, null, msgs);
      msgs = basicSetUses(newUses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__USES, newUses, newUses));
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
      case AS3Package.DIRECTIVE__ANNON_FIELDS:
        return basicSetAnnonFields(null, msgs);
      case AS3Package.DIRECTIVE__USES:
        return basicSetUses(null, msgs);
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
      case AS3Package.DIRECTIVE__NAME:
        return getName();
      case AS3Package.DIRECTIVE__ANNON_FIELDS:
        return getAnnonFields();
      case AS3Package.DIRECTIVE__USES:
        return getUses();
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
      case AS3Package.DIRECTIVE__NAME:
        setName((String)newValue);
        return;
      case AS3Package.DIRECTIVE__ANNON_FIELDS:
        setAnnonFields((annotationFields)newValue);
        return;
      case AS3Package.DIRECTIVE__USES:
        setUses((Uses)newValue);
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
      case AS3Package.DIRECTIVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.DIRECTIVE__ANNON_FIELDS:
        setAnnonFields((annotationFields)null);
        return;
      case AS3Package.DIRECTIVE__USES:
        setUses((Uses)null);
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
      case AS3Package.DIRECTIVE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.DIRECTIVE__ANNON_FIELDS:
        return annonFields != null;
      case AS3Package.DIRECTIVE__USES:
        return uses != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //directiveImpl
