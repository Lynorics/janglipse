/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>identifier Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identifierDeclarationImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class identifierDeclarationImpl extends MinimalEObjectImpl.Container implements identifierDeclaration
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
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected typeRelation relation;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected exprOrObjectLiteral expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected identifierDeclarationImpl()
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
    return AS3Package.Literals.IDENTIFIER_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeRelation getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(typeRelation newRelation, NotificationChain msgs)
  {
    typeRelation oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER_DECLARATION__RELATION, oldRelation, newRelation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(typeRelation newRelation)
  {
    if (newRelation != relation)
    {
      NotificationChain msgs = null;
      if (relation != null)
        msgs = ((InternalEObject)relation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER_DECLARATION__RELATION, null, msgs);
      if (newRelation != null)
        msgs = ((InternalEObject)newRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER_DECLARATION__RELATION, null, msgs);
      msgs = basicSetRelation(newRelation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER_DECLARATION__RELATION, newRelation, newRelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprOrObjectLiteral getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(exprOrObjectLiteral newExpr, NotificationChain msgs)
  {
    exprOrObjectLiteral oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER_DECLARATION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(exprOrObjectLiteral newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER_DECLARATION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTIFIER_DECLARATION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTIFIER_DECLARATION__EXPR, newExpr, newExpr));
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
      case AS3Package.IDENTIFIER_DECLARATION__RELATION:
        return basicSetRelation(null, msgs);
      case AS3Package.IDENTIFIER_DECLARATION__EXPR:
        return basicSetExpr(null, msgs);
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
      case AS3Package.IDENTIFIER_DECLARATION__NAME:
        return getName();
      case AS3Package.IDENTIFIER_DECLARATION__RELATION:
        return getRelation();
      case AS3Package.IDENTIFIER_DECLARATION__EXPR:
        return getExpr();
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
      case AS3Package.IDENTIFIER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AS3Package.IDENTIFIER_DECLARATION__RELATION:
        setRelation((typeRelation)newValue);
        return;
      case AS3Package.IDENTIFIER_DECLARATION__EXPR:
        setExpr((exprOrObjectLiteral)newValue);
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
      case AS3Package.IDENTIFIER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.IDENTIFIER_DECLARATION__RELATION:
        setRelation((typeRelation)null);
        return;
      case AS3Package.IDENTIFIER_DECLARATION__EXPR:
        setExpr((exprOrObjectLiteral)null);
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
      case AS3Package.IDENTIFIER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.IDENTIFIER_DECLARATION__RELATION:
        return relation != null;
      case AS3Package.IDENTIFIER_DECLARATION__EXPR:
        return expr != null;
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

} //identifierDeclarationImpl
