/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.multiplicativeExpressionImpl#getO <em>O</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class multiplicativeExpressionImpl extends MinimalEObjectImpl.Container implements multiplicativeExpression
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<unaryExpression> expr;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected EList<String> o;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected multiplicativeExpressionImpl()
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
    return AS3Package.Literals.MULTIPLICATIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<unaryExpression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<unaryExpression>(unaryExpression.class, this, AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getO()
  {
    if (o == null)
    {
      o = new EDataTypeEList<String>(String.class, this, AS3Package.MULTIPLICATIVE_EXPRESSION__O);
    }
    return o;
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
      case AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
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
      case AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR:
        return getExpr();
      case AS3Package.MULTIPLICATIVE_EXPRESSION__O:
        return getO();
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
      case AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends unaryExpression>)newValue);
        return;
      case AS3Package.MULTIPLICATIVE_EXPRESSION__O:
        getO().clear();
        getO().addAll((Collection<? extends String>)newValue);
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
      case AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR:
        getExpr().clear();
        return;
      case AS3Package.MULTIPLICATIVE_EXPRESSION__O:
        getO().clear();
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
      case AS3Package.MULTIPLICATIVE_EXPRESSION__EXPR:
        return expr != null && !expr.isEmpty();
      case AS3Package.MULTIPLICATIVE_EXPRESSION__O:
        return o != null && !o.isEmpty();
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
    result.append(" (o: ");
    result.append(o);
    result.append(')');
    return result.toString();
  }

} //multiplicativeExpressionImpl
