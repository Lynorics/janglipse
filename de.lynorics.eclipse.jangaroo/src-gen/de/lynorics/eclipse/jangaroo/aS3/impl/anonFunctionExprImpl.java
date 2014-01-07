/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.block;
import de.lynorics.eclipse.jangaroo.aS3.parameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>anon Function Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.anonFunctionExprImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class anonFunctionExprImpl extends exprImpl implements anonFunctionExpr
{
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
   * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected static final String RELATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected String relation = RELATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected block command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected anonFunctionExprImpl()
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
    return AS3Package.Literals.ANON_FUNCTION_EXPR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ANON_FUNCTION_EXPR__PARAMS, oldParams, newParams);
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
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ANON_FUNCTION_EXPR__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ANON_FUNCTION_EXPR__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ANON_FUNCTION_EXPR__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(String newRelation)
  {
    String oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ANON_FUNCTION_EXPR__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommand(block newCommand, NotificationChain msgs)
  {
    block oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.ANON_FUNCTION_EXPR__COMMAND, oldCommand, newCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(block newCommand)
  {
    if (newCommand != command)
    {
      NotificationChain msgs = null;
      if (command != null)
        msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.ANON_FUNCTION_EXPR__COMMAND, null, msgs);
      if (newCommand != null)
        msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.ANON_FUNCTION_EXPR__COMMAND, null, msgs);
      msgs = basicSetCommand(newCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.ANON_FUNCTION_EXPR__COMMAND, newCommand, newCommand));
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
      case AS3Package.ANON_FUNCTION_EXPR__PARAMS:
        return basicSetParams(null, msgs);
      case AS3Package.ANON_FUNCTION_EXPR__COMMAND:
        return basicSetCommand(null, msgs);
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
      case AS3Package.ANON_FUNCTION_EXPR__PARAMS:
        return getParams();
      case AS3Package.ANON_FUNCTION_EXPR__RELATION:
        return getRelation();
      case AS3Package.ANON_FUNCTION_EXPR__COMMAND:
        return getCommand();
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
      case AS3Package.ANON_FUNCTION_EXPR__PARAMS:
        setParams((parameters)newValue);
        return;
      case AS3Package.ANON_FUNCTION_EXPR__RELATION:
        setRelation((String)newValue);
        return;
      case AS3Package.ANON_FUNCTION_EXPR__COMMAND:
        setCommand((block)newValue);
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
      case AS3Package.ANON_FUNCTION_EXPR__PARAMS:
        setParams((parameters)null);
        return;
      case AS3Package.ANON_FUNCTION_EXPR__RELATION:
        setRelation(RELATION_EDEFAULT);
        return;
      case AS3Package.ANON_FUNCTION_EXPR__COMMAND:
        setCommand((block)null);
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
      case AS3Package.ANON_FUNCTION_EXPR__PARAMS:
        return params != null;
      case AS3Package.ANON_FUNCTION_EXPR__RELATION:
        return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
      case AS3Package.ANON_FUNCTION_EXPR__COMMAND:
        return command != null;
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
    result.append(" (relation: ");
    result.append(relation);
    result.append(')');
    return result.toString();
  }

} //anonFunctionExprImpl
