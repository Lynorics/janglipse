/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.methodDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.modifiers;
import de.lynorics.eclipse.jangaroo.aS3.optBody;
import de.lynorics.eclipse.jangaroo.aS3.parameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl#getMethodmodifiers <em>Methodmodifiers</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.methodDeclarationImpl#getOptbody <em>Optbody</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class methodDeclarationImpl extends MinimalEObjectImpl.Container implements methodDeclaration
{
  /**
   * The cached value of the '{@link #getMethodmodifiers() <em>Methodmodifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodmodifiers()
   * @generated
   * @ordered
   */
  protected modifiers methodmodifiers;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected parameters params;

  /**
   * The cached value of the '{@link #getOptbody() <em>Optbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptbody()
   * @generated
   * @ordered
   */
  protected optBody optbody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected methodDeclarationImpl()
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
    return AS3Package.Literals.METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modifiers getMethodmodifiers()
  {
    return methodmodifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodmodifiers(modifiers newMethodmodifiers, NotificationChain msgs)
  {
    modifiers oldMethodmodifiers = methodmodifiers;
    methodmodifiers = newMethodmodifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__METHODMODIFIERS, oldMethodmodifiers, newMethodmodifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodmodifiers(modifiers newMethodmodifiers)
  {
    if (newMethodmodifiers != methodmodifiers)
    {
      NotificationChain msgs = null;
      if (methodmodifiers != null)
        msgs = ((InternalEObject)methodmodifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__METHODMODIFIERS, null, msgs);
      if (newMethodmodifiers != null)
        msgs = ((InternalEObject)newMethodmodifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__METHODMODIFIERS, null, msgs);
      msgs = basicSetMethodmodifiers(newMethodmodifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__METHODMODIFIERS, newMethodmodifiers, newMethodmodifiers));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameters getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(parameters newParams, NotificationChain msgs)
  {
    parameters oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(parameters newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public optBody getOptbody()
  {
    return optbody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptbody(optBody newOptbody, NotificationChain msgs)
  {
    optBody oldOptbody = optbody;
    optbody = newOptbody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__OPTBODY, oldOptbody, newOptbody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptbody(optBody newOptbody)
  {
    if (newOptbody != optbody)
    {
      NotificationChain msgs = null;
      if (optbody != null)
        msgs = ((InternalEObject)optbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__OPTBODY, null, msgs);
      if (newOptbody != null)
        msgs = ((InternalEObject)newOptbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.METHOD_DECLARATION__OPTBODY, null, msgs);
      msgs = basicSetOptbody(newOptbody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.METHOD_DECLARATION__OPTBODY, newOptbody, newOptbody));
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
      case AS3Package.METHOD_DECLARATION__METHODMODIFIERS:
        return basicSetMethodmodifiers(null, msgs);
      case AS3Package.METHOD_DECLARATION__PARAMS:
        return basicSetParams(null, msgs);
      case AS3Package.METHOD_DECLARATION__OPTBODY:
        return basicSetOptbody(null, msgs);
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
      case AS3Package.METHOD_DECLARATION__METHODMODIFIERS:
        return getMethodmodifiers();
      case AS3Package.METHOD_DECLARATION__NAME:
        return getName();
      case AS3Package.METHOD_DECLARATION__PARAMS:
        return getParams();
      case AS3Package.METHOD_DECLARATION__OPTBODY:
        return getOptbody();
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
      case AS3Package.METHOD_DECLARATION__METHODMODIFIERS:
        setMethodmodifiers((modifiers)newValue);
        return;
      case AS3Package.METHOD_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AS3Package.METHOD_DECLARATION__PARAMS:
        setParams((parameters)newValue);
        return;
      case AS3Package.METHOD_DECLARATION__OPTBODY:
        setOptbody((optBody)newValue);
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
      case AS3Package.METHOD_DECLARATION__METHODMODIFIERS:
        setMethodmodifiers((modifiers)null);
        return;
      case AS3Package.METHOD_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.METHOD_DECLARATION__PARAMS:
        setParams((parameters)null);
        return;
      case AS3Package.METHOD_DECLARATION__OPTBODY:
        setOptbody((optBody)null);
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
      case AS3Package.METHOD_DECLARATION__METHODMODIFIERS:
        return methodmodifiers != null;
      case AS3Package.METHOD_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.METHOD_DECLARATION__PARAMS:
        return params != null;
      case AS3Package.METHOD_DECLARATION__OPTBODY:
        return optbody != null;
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

} //methodDeclarationImpl
