/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.VariableDeclarationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
{
  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessLevel ACCESS_EDEFAULT = AccessLevel.INTERNAL;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessLevel access = ACCESS_EDEFAULT;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return AS3Package.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessLevel getAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessLevel newAccess)
  {
    AccessLevel oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.VARIABLE_DECLARATION__ACCESS, oldAccess, access));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.VARIABLE_DECLARATION__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AS3Package.VARIABLE_DECLARATION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.VARIABLE_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.VARIABLE_DECLARATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.VARIABLE_DECLARATION__EXPRESSION, newExpression, newExpression));
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
      case AS3Package.VARIABLE_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case AS3Package.VARIABLE_DECLARATION__ACCESS:
        return getAccess();
      case AS3Package.VARIABLE_DECLARATION__NAME:
        return getName();
      case AS3Package.VARIABLE_DECLARATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case AS3Package.VARIABLE_DECLARATION__EXPRESSION:
        return getExpression();
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
      case AS3Package.VARIABLE_DECLARATION__ACCESS:
        setAccess((AccessLevel)newValue);
        return;
      case AS3Package.VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AS3Package.VARIABLE_DECLARATION__TYPE:
        setType((EObject)newValue);
        return;
      case AS3Package.VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case AS3Package.VARIABLE_DECLARATION__ACCESS:
        setAccess(ACCESS_EDEFAULT);
        return;
      case AS3Package.VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.VARIABLE_DECLARATION__TYPE:
        setType((EObject)null);
        return;
      case AS3Package.VARIABLE_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
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
      case AS3Package.VARIABLE_DECLARATION__ACCESS:
        return access != ACCESS_EDEFAULT;
      case AS3Package.VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.VARIABLE_DECLARATION__TYPE:
        return type != null;
      case AS3Package.VARIABLE_DECLARATION__EXPRESSION:
        return expression != null;
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
    result.append(" (access: ");
    result.append(access);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
