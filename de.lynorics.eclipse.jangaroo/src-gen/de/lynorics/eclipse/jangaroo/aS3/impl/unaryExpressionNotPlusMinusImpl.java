/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpressionNotPlusMinus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unary Expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.unaryExpressionNotPlusMinusImpl#getDe <em>De</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unaryExpressionNotPlusMinusImpl extends MinimalEObjectImpl.Container implements unaryExpressionNotPlusMinus
{
  /**
   * The default value of the '{@link #getIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected static final String IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected String in = IN_EDEFAULT;

  /**
   * The default value of the '{@link #getDe() <em>De</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDe()
   * @generated
   * @ordered
   */
  protected static final String DE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDe() <em>De</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDe()
   * @generated
   * @ordered
   */
  protected String de = DE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unaryExpressionNotPlusMinusImpl()
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
    return AS3Package.Literals.UNARY_EXPRESSION_NOT_PLUS_MINUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(String newIn)
  {
    String oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDe()
  {
    return de;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDe(String newDe)
  {
    String oldDe = de;
    de = newDe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__DE, oldDe, de));
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
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__IN:
        return getIn();
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__DE:
        return getDe();
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
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__IN:
        setIn((String)newValue);
        return;
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__DE:
        setDe((String)newValue);
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
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__IN:
        setIn(IN_EDEFAULT);
        return;
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__DE:
        setDe(DE_EDEFAULT);
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
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__IN:
        return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
      case AS3Package.UNARY_EXPRESSION_NOT_PLUS_MINUS__DE:
        return DE_EDEFAULT == null ? de != null : !DE_EDEFAULT.equals(de);
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
    result.append(" (in: ");
    result.append(in);
    result.append(", de: ");
    result.append(de);
    result.append(')');
    return result.toString();
  }

} //unaryExpressionNotPlusMinusImpl
