/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessorRole;
import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getAnytype <em>Anytype</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.InterfaceMethodImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceMethodImpl extends MinimalEObjectImpl.Container implements InterfaceMethod
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected Modifier modifier;

  /**
   * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessor()
   * @generated
   * @ordered
   */
  protected AccessorRole accessor;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The default value of the '{@link #getAnytype() <em>Anytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnytype()
   * @generated
   * @ordered
   */
  protected static final String ANYTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnytype() <em>Anytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnytype()
   * @generated
   * @ordered
   */
  protected String anytype = ANYTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceMethodImpl()
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
    return AS3Package.Literals.INTERFACE_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, AS3Package.INTERFACE_METHOD__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifier(Modifier newModifier, NotificationChain msgs)
  {
    Modifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__MODIFIER, oldModifier, newModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(Modifier newModifier)
  {
    if (newModifier != modifier)
    {
      NotificationChain msgs = null;
      if (modifier != null)
        msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.INTERFACE_METHOD__MODIFIER, null, msgs);
      if (newModifier != null)
        msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.INTERFACE_METHOD__MODIFIER, null, msgs);
      msgs = basicSetModifier(newModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__MODIFIER, newModifier, newModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessorRole getAccessor()
  {
    return accessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessor(AccessorRole newAccessor, NotificationChain msgs)
  {
    AccessorRole oldAccessor = accessor;
    accessor = newAccessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__ACCESSOR, oldAccessor, newAccessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessor(AccessorRole newAccessor)
  {
    if (newAccessor != accessor)
    {
      NotificationChain msgs = null;
      if (accessor != null)
        msgs = ((InternalEObject)accessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.INTERFACE_METHOD__ACCESSOR, null, msgs);
      if (newAccessor != null)
        msgs = ((InternalEObject)newAccessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.INTERFACE_METHOD__ACCESSOR, null, msgs);
      msgs = basicSetAccessor(newAccessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__ACCESSOR, newAccessor, newAccessor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, AS3Package.INTERFACE_METHOD__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnytype()
  {
    return anytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnytype(String newAnytype)
  {
    String oldAnytype = anytype;
    anytype = newAnytype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__ANYTYPE, oldAnytype, anytype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AS3Package.INTERFACE_METHOD__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EObject newType)
  {
    EObject oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.INTERFACE_METHOD__TYPE, oldType, type));
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
      case AS3Package.INTERFACE_METHOD__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case AS3Package.INTERFACE_METHOD__MODIFIER:
        return basicSetModifier(null, msgs);
      case AS3Package.INTERFACE_METHOD__ACCESSOR:
        return basicSetAccessor(null, msgs);
      case AS3Package.INTERFACE_METHOD__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case AS3Package.INTERFACE_METHOD__ANNOTATIONS:
        return getAnnotations();
      case AS3Package.INTERFACE_METHOD__MODIFIER:
        return getModifier();
      case AS3Package.INTERFACE_METHOD__ACCESSOR:
        return getAccessor();
      case AS3Package.INTERFACE_METHOD__NAME:
        return getName();
      case AS3Package.INTERFACE_METHOD__PARAMS:
        return getParams();
      case AS3Package.INTERFACE_METHOD__ANYTYPE:
        return getAnytype();
      case AS3Package.INTERFACE_METHOD__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case AS3Package.INTERFACE_METHOD__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__MODIFIER:
        setModifier((Modifier)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__ACCESSOR:
        setAccessor((AccessorRole)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__NAME:
        setName((String)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__ANYTYPE:
        setAnytype((String)newValue);
        return;
      case AS3Package.INTERFACE_METHOD__TYPE:
        setType((EObject)newValue);
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
      case AS3Package.INTERFACE_METHOD__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AS3Package.INTERFACE_METHOD__MODIFIER:
        setModifier((Modifier)null);
        return;
      case AS3Package.INTERFACE_METHOD__ACCESSOR:
        setAccessor((AccessorRole)null);
        return;
      case AS3Package.INTERFACE_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.INTERFACE_METHOD__PARAMS:
        getParams().clear();
        return;
      case AS3Package.INTERFACE_METHOD__ANYTYPE:
        setAnytype(ANYTYPE_EDEFAULT);
        return;
      case AS3Package.INTERFACE_METHOD__TYPE:
        setType((EObject)null);
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
      case AS3Package.INTERFACE_METHOD__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AS3Package.INTERFACE_METHOD__MODIFIER:
        return modifier != null;
      case AS3Package.INTERFACE_METHOD__ACCESSOR:
        return accessor != null;
      case AS3Package.INTERFACE_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.INTERFACE_METHOD__PARAMS:
        return params != null && !params.isEmpty();
      case AS3Package.INTERFACE_METHOD__ANYTYPE:
        return ANYTYPE_EDEFAULT == null ? anytype != null : !ANYTYPE_EDEFAULT.equals(anytype);
      case AS3Package.INTERFACE_METHOD__TYPE:
        return type != null;
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
    result.append(", anytype: ");
    result.append(anytype);
    result.append(')');
    return result.toString();
  }

} //InterfaceMethodImpl
