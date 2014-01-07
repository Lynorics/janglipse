/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
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
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.directiveImpl#getUseasid <em>Useasid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class directiveImpl extends MinimalEObjectImpl.Container implements directive
{
  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected annotationFields fields;

  /**
   * The default value of the '{@link #getUseasid() <em>Useasid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseasid()
   * @generated
   * @ordered
   */
  protected static final String USEASID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUseasid() <em>Useasid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseasid()
   * @generated
   * @ordered
   */
  protected String useasid = USEASID_EDEFAULT;

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
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationFields getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(annotationFields newFields, NotificationChain msgs)
  {
    annotationFields oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__FIELDS, oldFields, newFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(annotationFields newFields)
  {
    if (newFields != fields)
    {
      NotificationChain msgs = null;
      if (fields != null)
        msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__FIELDS, null, msgs);
      if (newFields != null)
        msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.DIRECTIVE__FIELDS, null, msgs);
      msgs = basicSetFields(newFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__FIELDS, newFields, newFields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUseasid()
  {
    return useasid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseasid(String newUseasid)
  {
    String oldUseasid = useasid;
    useasid = newUseasid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.DIRECTIVE__USEASID, oldUseasid, useasid));
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
      case AS3Package.DIRECTIVE__FIELDS:
        return basicSetFields(null, msgs);
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
      case AS3Package.DIRECTIVE__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case AS3Package.DIRECTIVE__ID:
        return getId();
      case AS3Package.DIRECTIVE__FIELDS:
        return getFields();
      case AS3Package.DIRECTIVE__USEASID:
        return getUseasid();
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
      case AS3Package.DIRECTIVE__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
      case AS3Package.DIRECTIVE__ID:
        setId((String)newValue);
        return;
      case AS3Package.DIRECTIVE__FIELDS:
        setFields((annotationFields)newValue);
        return;
      case AS3Package.DIRECTIVE__USEASID:
        setUseasid((String)newValue);
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
      case AS3Package.DIRECTIVE__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
      case AS3Package.DIRECTIVE__ID:
        setId(ID_EDEFAULT);
        return;
      case AS3Package.DIRECTIVE__FIELDS:
        setFields((annotationFields)null);
        return;
      case AS3Package.DIRECTIVE__USEASID:
        setUseasid(USEASID_EDEFAULT);
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
      case AS3Package.DIRECTIVE__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
      case AS3Package.DIRECTIVE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case AS3Package.DIRECTIVE__FIELDS:
        return fields != null;
      case AS3Package.DIRECTIVE__USEASID:
        return USEASID_EDEFAULT == null ? useasid != null : !USEASID_EDEFAULT.equals(useasid);
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
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(", id: ");
    result.append(id);
    result.append(", useasid: ");
    result.append(useasid);
    result.append(')');
    return result.toString();
  }

} //directiveImpl
