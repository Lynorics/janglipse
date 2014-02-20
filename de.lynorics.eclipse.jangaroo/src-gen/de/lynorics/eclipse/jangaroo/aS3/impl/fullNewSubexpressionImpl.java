/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.brackets;
import de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>full New Subexpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl#getFnsd <em>Fnsd</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl#getQuali <em>Quali</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fullNewSubexpressionImpl#getBrack <em>Brack</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fullNewSubexpressionImpl extends newExpressionImpl implements fullNewSubexpression
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<arguments> args;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<primaryExpression> expr;

  /**
   * The cached value of the '{@link #getFnsd() <em>Fnsd</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnsd()
   * @generated
   * @ordered
   */
  protected EList<String> fnsd;

  /**
   * The cached value of the '{@link #getQuali() <em>Quali</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuali()
   * @generated
   * @ordered
   */
  protected EList<qualifiedIdent> quali;

  /**
   * The cached value of the '{@link #getBrack() <em>Brack</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrack()
   * @generated
   * @ordered
   */
  protected EList<brackets> brack;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fullNewSubexpressionImpl()
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
    return AS3Package.Literals.FULL_NEW_SUBEXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<arguments> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<arguments>(arguments.class, this, AS3Package.FULL_NEW_SUBEXPRESSION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<primaryExpression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<primaryExpression>(primaryExpression.class, this, AS3Package.FULL_NEW_SUBEXPRESSION__EXPR);
    }
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFnsd()
  {
    if (fnsd == null)
    {
      fnsd = new EDataTypeEList<String>(String.class, this, AS3Package.FULL_NEW_SUBEXPRESSION__FNSD);
    }
    return fnsd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<qualifiedIdent> getQuali()
  {
    if (quali == null)
    {
      quali = new EObjectContainmentEList<qualifiedIdent>(qualifiedIdent.class, this, AS3Package.FULL_NEW_SUBEXPRESSION__QUALI);
    }
    return quali;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<brackets> getBrack()
  {
    if (brack == null)
    {
      brack = new EObjectContainmentEList<brackets>(brackets.class, this, AS3Package.FULL_NEW_SUBEXPRESSION__BRACK);
    }
    return brack;
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
      case AS3Package.FULL_NEW_SUBEXPRESSION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case AS3Package.FULL_NEW_SUBEXPRESSION__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
      case AS3Package.FULL_NEW_SUBEXPRESSION__QUALI:
        return ((InternalEList<?>)getQuali()).basicRemove(otherEnd, msgs);
      case AS3Package.FULL_NEW_SUBEXPRESSION__BRACK:
        return ((InternalEList<?>)getBrack()).basicRemove(otherEnd, msgs);
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
      case AS3Package.FULL_NEW_SUBEXPRESSION__ARGS:
        return getArgs();
      case AS3Package.FULL_NEW_SUBEXPRESSION__EXPR:
        return getExpr();
      case AS3Package.FULL_NEW_SUBEXPRESSION__FNSD:
        return getFnsd();
      case AS3Package.FULL_NEW_SUBEXPRESSION__QUALI:
        return getQuali();
      case AS3Package.FULL_NEW_SUBEXPRESSION__BRACK:
        return getBrack();
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
      case AS3Package.FULL_NEW_SUBEXPRESSION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends arguments>)newValue);
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends primaryExpression>)newValue);
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__FNSD:
        getFnsd().clear();
        getFnsd().addAll((Collection<? extends String>)newValue);
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__QUALI:
        getQuali().clear();
        getQuali().addAll((Collection<? extends qualifiedIdent>)newValue);
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__BRACK:
        getBrack().clear();
        getBrack().addAll((Collection<? extends brackets>)newValue);
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
      case AS3Package.FULL_NEW_SUBEXPRESSION__ARGS:
        getArgs().clear();
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__EXPR:
        getExpr().clear();
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__FNSD:
        getFnsd().clear();
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__QUALI:
        getQuali().clear();
        return;
      case AS3Package.FULL_NEW_SUBEXPRESSION__BRACK:
        getBrack().clear();
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
      case AS3Package.FULL_NEW_SUBEXPRESSION__ARGS:
        return args != null && !args.isEmpty();
      case AS3Package.FULL_NEW_SUBEXPRESSION__EXPR:
        return expr != null && !expr.isEmpty();
      case AS3Package.FULL_NEW_SUBEXPRESSION__FNSD:
        return fnsd != null && !fnsd.isEmpty();
      case AS3Package.FULL_NEW_SUBEXPRESSION__QUALI:
        return quali != null && !quali.isEmpty();
      case AS3Package.FULL_NEW_SUBEXPRESSION__BRACK:
        return brack != null && !brack.isEmpty();
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
    result.append(" (fnsd: ");
    result.append(fnsd);
    result.append(')');
    return result.toString();
  }

} //fullNewSubexpressionImpl
