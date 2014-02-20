/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression;
import de.lynorics.eclipse.jangaroo.aS3.functionExpression;
import de.lynorics.eclipse.jangaroo.aS3.newExpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getSuperExpr <em>Super Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getCon <em>Con</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getLit <em>Lit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getFexpr <em>Fexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getNexpr <em>Nexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getEncexpr <em>Encexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getE4x <em>E4x</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.primaryExpressionImpl#getQual <em>Qual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryExpressionImpl extends MinimalEObjectImpl.Container implements primaryExpression
{
  /**
   * The cached value of the '{@link #getSuperExpr() <em>Super Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperExpr()
   * @generated
   * @ordered
   */
  protected Expression superExpr;

  /**
   * The cached value of the '{@link #getCon() <em>Con</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCon()
   * @generated
   * @ordered
   */
  protected Expression con;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected EObject lit;

  /**
   * The cached value of the '{@link #getFexpr() <em>Fexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFexpr()
   * @generated
   * @ordered
   */
  protected functionExpression fexpr;

  /**
   * The cached value of the '{@link #getNexpr() <em>Nexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNexpr()
   * @generated
   * @ordered
   */
  protected newExpression nexpr;

  /**
   * The cached value of the '{@link #getEncexpr() <em>Encexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncexpr()
   * @generated
   * @ordered
   */
  protected encapsulatedExpression encexpr;

  /**
   * The cached value of the '{@link #getE4x() <em>E4x</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE4x()
   * @generated
   * @ordered
   */
  protected e4xAttributeIdentifier e4x;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExpressionImpl()
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
    return AS3Package.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSuperExpr()
  {
    return superExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperExpr(Expression newSuperExpr, NotificationChain msgs)
  {
    Expression oldSuperExpr = superExpr;
    superExpr = newSuperExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR, oldSuperExpr, newSuperExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperExpr(Expression newSuperExpr)
  {
    if (newSuperExpr != superExpr)
    {
      NotificationChain msgs = null;
      if (superExpr != null)
        msgs = ((InternalEObject)superExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR, null, msgs);
      if (newSuperExpr != null)
        msgs = ((InternalEObject)newSuperExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR, null, msgs);
      msgs = basicSetSuperExpr(newSuperExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR, newSuperExpr, newSuperExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCon()
  {
    return con;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCon(Expression newCon, NotificationChain msgs)
  {
    Expression oldCon = con;
    con = newCon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__CON, oldCon, newCon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCon(Expression newCon)
  {
    if (newCon != con)
    {
      NotificationChain msgs = null;
      if (con != null)
        msgs = ((InternalEObject)con).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__CON, null, msgs);
      if (newCon != null)
        msgs = ((InternalEObject)newCon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__CON, null, msgs);
      msgs = basicSetCon(newCon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__CON, newCon, newCon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLit(EObject newLit, NotificationChain msgs)
  {
    EObject oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__LIT, oldLit, newLit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(EObject newLit)
  {
    if (newLit != lit)
    {
      NotificationChain msgs = null;
      if (lit != null)
        msgs = ((InternalEObject)lit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__LIT, null, msgs);
      if (newLit != null)
        msgs = ((InternalEObject)newLit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__LIT, null, msgs);
      msgs = basicSetLit(newLit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__LIT, newLit, newLit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionExpression getFexpr()
  {
    return fexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFexpr(functionExpression newFexpr, NotificationChain msgs)
  {
    functionExpression oldFexpr = fexpr;
    fexpr = newFexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__FEXPR, oldFexpr, newFexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFexpr(functionExpression newFexpr)
  {
    if (newFexpr != fexpr)
    {
      NotificationChain msgs = null;
      if (fexpr != null)
        msgs = ((InternalEObject)fexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__FEXPR, null, msgs);
      if (newFexpr != null)
        msgs = ((InternalEObject)newFexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__FEXPR, null, msgs);
      msgs = basicSetFexpr(newFexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__FEXPR, newFexpr, newFexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public newExpression getNexpr()
  {
    return nexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNexpr(newExpression newNexpr, NotificationChain msgs)
  {
    newExpression oldNexpr = nexpr;
    nexpr = newNexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__NEXPR, oldNexpr, newNexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNexpr(newExpression newNexpr)
  {
    if (newNexpr != nexpr)
    {
      NotificationChain msgs = null;
      if (nexpr != null)
        msgs = ((InternalEObject)nexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__NEXPR, null, msgs);
      if (newNexpr != null)
        msgs = ((InternalEObject)newNexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__NEXPR, null, msgs);
      msgs = basicSetNexpr(newNexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__NEXPR, newNexpr, newNexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public encapsulatedExpression getEncexpr()
  {
    return encexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEncexpr(encapsulatedExpression newEncexpr, NotificationChain msgs)
  {
    encapsulatedExpression oldEncexpr = encexpr;
    encexpr = newEncexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__ENCEXPR, oldEncexpr, newEncexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncexpr(encapsulatedExpression newEncexpr)
  {
    if (newEncexpr != encexpr)
    {
      NotificationChain msgs = null;
      if (encexpr != null)
        msgs = ((InternalEObject)encexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__ENCEXPR, null, msgs);
      if (newEncexpr != null)
        msgs = ((InternalEObject)newEncexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__ENCEXPR, null, msgs);
      msgs = basicSetEncexpr(newEncexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__ENCEXPR, newEncexpr, newEncexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public e4xAttributeIdentifier getE4x()
  {
    return e4x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE4x(e4xAttributeIdentifier newE4x, NotificationChain msgs)
  {
    e4xAttributeIdentifier oldE4x = e4x;
    e4x = newE4x;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__E4X, oldE4x, newE4x);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE4x(e4xAttributeIdentifier newE4x)
  {
    if (newE4x != e4x)
    {
      NotificationChain msgs = null;
      if (e4x != null)
        msgs = ((InternalEObject)e4x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__E4X, null, msgs);
      if (newE4x != null)
        msgs = ((InternalEObject)newE4x).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__E4X, null, msgs);
      msgs = basicSetE4x(newE4x, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__E4X, newE4x, newE4x));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__QUAL, oldQual, newQual);
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
        msgs = ((InternalEObject)qual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__QUAL, null, msgs);
      if (newQual != null)
        msgs = ((InternalEObject)newQual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PRIMARY_EXPRESSION__QUAL, null, msgs);
      msgs = basicSetQual(newQual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PRIMARY_EXPRESSION__QUAL, newQual, newQual));
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
      case AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR:
        return basicSetSuperExpr(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__CON:
        return basicSetCon(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__LIT:
        return basicSetLit(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__FEXPR:
        return basicSetFexpr(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__NEXPR:
        return basicSetNexpr(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__ENCEXPR:
        return basicSetEncexpr(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__E4X:
        return basicSetE4x(null, msgs);
      case AS3Package.PRIMARY_EXPRESSION__QUAL:
        return basicSetQual(null, msgs);
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
      case AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR:
        return getSuperExpr();
      case AS3Package.PRIMARY_EXPRESSION__CON:
        return getCon();
      case AS3Package.PRIMARY_EXPRESSION__LIT:
        return getLit();
      case AS3Package.PRIMARY_EXPRESSION__FEXPR:
        return getFexpr();
      case AS3Package.PRIMARY_EXPRESSION__NEXPR:
        return getNexpr();
      case AS3Package.PRIMARY_EXPRESSION__ENCEXPR:
        return getEncexpr();
      case AS3Package.PRIMARY_EXPRESSION__E4X:
        return getE4x();
      case AS3Package.PRIMARY_EXPRESSION__QUAL:
        return getQual();
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
      case AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR:
        setSuperExpr((Expression)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__CON:
        setCon((Expression)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__LIT:
        setLit((EObject)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__FEXPR:
        setFexpr((functionExpression)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__NEXPR:
        setNexpr((newExpression)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__ENCEXPR:
        setEncexpr((encapsulatedExpression)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__E4X:
        setE4x((e4xAttributeIdentifier)newValue);
        return;
      case AS3Package.PRIMARY_EXPRESSION__QUAL:
        setQual((qualifiedIdent)newValue);
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
      case AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR:
        setSuperExpr((Expression)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__CON:
        setCon((Expression)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__LIT:
        setLit((EObject)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__FEXPR:
        setFexpr((functionExpression)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__NEXPR:
        setNexpr((newExpression)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__ENCEXPR:
        setEncexpr((encapsulatedExpression)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__E4X:
        setE4x((e4xAttributeIdentifier)null);
        return;
      case AS3Package.PRIMARY_EXPRESSION__QUAL:
        setQual((qualifiedIdent)null);
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
      case AS3Package.PRIMARY_EXPRESSION__SUPER_EXPR:
        return superExpr != null;
      case AS3Package.PRIMARY_EXPRESSION__CON:
        return con != null;
      case AS3Package.PRIMARY_EXPRESSION__LIT:
        return lit != null;
      case AS3Package.PRIMARY_EXPRESSION__FEXPR:
        return fexpr != null;
      case AS3Package.PRIMARY_EXPRESSION__NEXPR:
        return nexpr != null;
      case AS3Package.PRIMARY_EXPRESSION__ENCEXPR:
        return encexpr != null;
      case AS3Package.PRIMARY_EXPRESSION__E4X:
        return e4x != null;
      case AS3Package.PRIMARY_EXPRESSION__QUAL:
        return qual != null;
    }
    return super.eIsSet(featureID);
  }

} //primaryExpressionImpl
