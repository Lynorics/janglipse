/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>e4x Attribute Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl#getQual <em>Qual</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.e4xAttributeIdentifierImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class e4xAttributeIdentifierImpl extends qualifiedIdentifierImpl implements e4xAttributeIdentifier
{
  /**
   * The cached value of the '{@link #getQual() <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQual()
   * @generated
   * @ordered
   */
  protected qualifiedIdent qual;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected e4xAttributeIdentifierImpl()
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
    return AS3Package.Literals.E4X_ATTRIBUTE_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedIdent getQual()
  {
    return qual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQual(qualifiedIdent newQual, NotificationChain msgs)
  {
    qualifiedIdent oldQual = qual;
    qual = newQual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL, oldQual, newQual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQual(qualifiedIdent newQual)
  {
    if (newQual != qual)
    {
      NotificationChain msgs = null;
      if (qual != null)
        msgs = ((InternalEObject)qual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL, null, msgs);
      if (newQual != null)
        msgs = ((InternalEObject)newQual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL, null, msgs);
      msgs = basicSetQual(newQual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL, newQual, newQual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR, newExpr, newExpr));
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
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL:
        return basicSetQual(null, msgs);
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR:
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
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL:
        return getQual();
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR:
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
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL:
        setQual((qualifiedIdent)newValue);
        return;
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR:
        setExpr((Expression)newValue);
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
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL:
        setQual((qualifiedIdent)null);
        return;
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR:
        setExpr((Expression)null);
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
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__QUAL:
        return qual != null;
      case AS3Package.E4X_ATTRIBUTE_IDENTIFIER__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //e4xAttributeIdentifierImpl
