/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.expr;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.parameter;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getDeleteexpr <em>Deleteexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getIsleftepxr <em>Isleftepxr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getIsrightexpr <em>Isrightexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getPrefixexpr <em>Prefixexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getPostfixexpr <em>Postfixexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getInfixexprleft <em>Infixexprleft</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getInfixexprright <em>Infixexprright</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getThen <em>Then</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.exprImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exprImpl extends annotationFieldImpl implements expr
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
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected expr expr;

  /**
   * The cached value of the '{@link #getDeleteexpr() <em>Deleteexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteexpr()
   * @generated
   * @ordered
   */
  protected expr deleteexpr;

  /**
   * The cached value of the '{@link #getTypeexpr() <em>Typeexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeexpr()
   * @generated
   * @ordered
   */
  protected expr typeexpr;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIsleftepxr() <em>Isleftepxr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsleftepxr()
   * @generated
   * @ordered
   */
  protected expr isleftepxr;

  /**
   * The cached value of the '{@link #getIsrightexpr() <em>Isrightexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsrightexpr()
   * @generated
   * @ordered
   */
  protected expr isrightexpr;

  /**
   * The cached value of the '{@link #getPrefixexpr() <em>Prefixexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixexpr()
   * @generated
   * @ordered
   */
  protected expr prefixexpr;

  /**
   * The cached value of the '{@link #getPostfixexpr() <em>Postfixexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostfixexpr()
   * @generated
   * @ordered
   */
  protected expr postfixexpr;

  /**
   * The cached value of the '{@link #getInfixexprleft() <em>Infixexprleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixexprleft()
   * @generated
   * @ordered
   */
  protected expr infixexprleft;

  /**
   * The cached value of the '{@link #getInfixexprright() <em>Infixexprright</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixexprright()
   * @generated
   * @ordered
   */
  protected expr infixexprright;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected arguments args;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected expr condition;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected exprOrObjectLiteral then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected exprOrObjectLiteral else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected exprImpl()
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
    return AS3Package.Literals.EXPR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(expr newExpr, NotificationChain msgs)
  {
    expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getDeleteexpr()
  {
    return deleteexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeleteexpr(expr newDeleteexpr, NotificationChain msgs)
  {
    expr oldDeleteexpr = deleteexpr;
    deleteexpr = newDeleteexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__DELETEEXPR, oldDeleteexpr, newDeleteexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteexpr(expr newDeleteexpr)
  {
    if (newDeleteexpr != deleteexpr)
    {
      NotificationChain msgs = null;
      if (deleteexpr != null)
        msgs = ((InternalEObject)deleteexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__DELETEEXPR, null, msgs);
      if (newDeleteexpr != null)
        msgs = ((InternalEObject)newDeleteexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__DELETEEXPR, null, msgs);
      msgs = basicSetDeleteexpr(newDeleteexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__DELETEEXPR, newDeleteexpr, newDeleteexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getTypeexpr()
  {
    return typeexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeexpr(expr newTypeexpr, NotificationChain msgs)
  {
    expr oldTypeexpr = typeexpr;
    typeexpr = newTypeexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__TYPEEXPR, oldTypeexpr, newTypeexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeexpr(expr newTypeexpr)
  {
    if (newTypeexpr != typeexpr)
    {
      NotificationChain msgs = null;
      if (typeexpr != null)
        msgs = ((InternalEObject)typeexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__TYPEEXPR, null, msgs);
      if (newTypeexpr != null)
        msgs = ((InternalEObject)newTypeexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__TYPEEXPR, null, msgs);
      msgs = basicSetTypeexpr(newTypeexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__TYPEEXPR, newTypeexpr, newTypeexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getIsleftepxr()
  {
    return isleftepxr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsleftepxr(expr newIsleftepxr, NotificationChain msgs)
  {
    expr oldIsleftepxr = isleftepxr;
    isleftepxr = newIsleftepxr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ISLEFTEPXR, oldIsleftepxr, newIsleftepxr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsleftepxr(expr newIsleftepxr)
  {
    if (newIsleftepxr != isleftepxr)
    {
      NotificationChain msgs = null;
      if (isleftepxr != null)
        msgs = ((InternalEObject)isleftepxr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ISLEFTEPXR, null, msgs);
      if (newIsleftepxr != null)
        msgs = ((InternalEObject)newIsleftepxr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ISLEFTEPXR, null, msgs);
      msgs = basicSetIsleftepxr(newIsleftepxr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ISLEFTEPXR, newIsleftepxr, newIsleftepxr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getIsrightexpr()
  {
    return isrightexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsrightexpr(expr newIsrightexpr, NotificationChain msgs)
  {
    expr oldIsrightexpr = isrightexpr;
    isrightexpr = newIsrightexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ISRIGHTEXPR, oldIsrightexpr, newIsrightexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsrightexpr(expr newIsrightexpr)
  {
    if (newIsrightexpr != isrightexpr)
    {
      NotificationChain msgs = null;
      if (isrightexpr != null)
        msgs = ((InternalEObject)isrightexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ISRIGHTEXPR, null, msgs);
      if (newIsrightexpr != null)
        msgs = ((InternalEObject)newIsrightexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ISRIGHTEXPR, null, msgs);
      msgs = basicSetIsrightexpr(newIsrightexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ISRIGHTEXPR, newIsrightexpr, newIsrightexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getPrefixexpr()
  {
    return prefixexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefixexpr(expr newPrefixexpr, NotificationChain msgs)
  {
    expr oldPrefixexpr = prefixexpr;
    prefixexpr = newPrefixexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__PREFIXEXPR, oldPrefixexpr, newPrefixexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefixexpr(expr newPrefixexpr)
  {
    if (newPrefixexpr != prefixexpr)
    {
      NotificationChain msgs = null;
      if (prefixexpr != null)
        msgs = ((InternalEObject)prefixexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__PREFIXEXPR, null, msgs);
      if (newPrefixexpr != null)
        msgs = ((InternalEObject)newPrefixexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__PREFIXEXPR, null, msgs);
      msgs = basicSetPrefixexpr(newPrefixexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__PREFIXEXPR, newPrefixexpr, newPrefixexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getPostfixexpr()
  {
    return postfixexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostfixexpr(expr newPostfixexpr, NotificationChain msgs)
  {
    expr oldPostfixexpr = postfixexpr;
    postfixexpr = newPostfixexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__POSTFIXEXPR, oldPostfixexpr, newPostfixexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostfixexpr(expr newPostfixexpr)
  {
    if (newPostfixexpr != postfixexpr)
    {
      NotificationChain msgs = null;
      if (postfixexpr != null)
        msgs = ((InternalEObject)postfixexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__POSTFIXEXPR, null, msgs);
      if (newPostfixexpr != null)
        msgs = ((InternalEObject)newPostfixexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__POSTFIXEXPR, null, msgs);
      msgs = basicSetPostfixexpr(newPostfixexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__POSTFIXEXPR, newPostfixexpr, newPostfixexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getInfixexprleft()
  {
    return infixexprleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfixexprleft(expr newInfixexprleft, NotificationChain msgs)
  {
    expr oldInfixexprleft = infixexprleft;
    infixexprleft = newInfixexprleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__INFIXEXPRLEFT, oldInfixexprleft, newInfixexprleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfixexprleft(expr newInfixexprleft)
  {
    if (newInfixexprleft != infixexprleft)
    {
      NotificationChain msgs = null;
      if (infixexprleft != null)
        msgs = ((InternalEObject)infixexprleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__INFIXEXPRLEFT, null, msgs);
      if (newInfixexprleft != null)
        msgs = ((InternalEObject)newInfixexprleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__INFIXEXPRLEFT, null, msgs);
      msgs = basicSetInfixexprleft(newInfixexprleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__INFIXEXPRLEFT, newInfixexprleft, newInfixexprleft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getInfixexprright()
  {
    return infixexprright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfixexprright(expr newInfixexprright, NotificationChain msgs)
  {
    expr oldInfixexprright = infixexprright;
    infixexprright = newInfixexprright;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__INFIXEXPRRIGHT, oldInfixexprright, newInfixexprright);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfixexprright(expr newInfixexprright)
  {
    if (newInfixexprright != infixexprright)
    {
      NotificationChain msgs = null;
      if (infixexprright != null)
        msgs = ((InternalEObject)infixexprright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__INFIXEXPRRIGHT, null, msgs);
      if (newInfixexprright != null)
        msgs = ((InternalEObject)newInfixexprright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__INFIXEXPRRIGHT, null, msgs);
      msgs = basicSetInfixexprright(newInfixexprright, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__INFIXEXPRRIGHT, newInfixexprright, newInfixexprright));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(arguments newArgs, NotificationChain msgs)
  {
    arguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(arguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(expr newCondition, NotificationChain msgs)
  {
    expr oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(expr newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprOrObjectLiteral getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(exprOrObjectLiteral newThen, NotificationChain msgs)
  {
    exprOrObjectLiteral oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(exprOrObjectLiteral newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprOrObjectLiteral getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(exprOrObjectLiteral newElse, NotificationChain msgs)
  {
    exprOrObjectLiteral oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(exprOrObjectLiteral newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.EXPR__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.EXPR__ELSE, newElse, newElse));
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
      case AS3Package.EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case AS3Package.EXPR__DELETEEXPR:
        return basicSetDeleteexpr(null, msgs);
      case AS3Package.EXPR__TYPEEXPR:
        return basicSetTypeexpr(null, msgs);
      case AS3Package.EXPR__ISLEFTEPXR:
        return basicSetIsleftepxr(null, msgs);
      case AS3Package.EXPR__ISRIGHTEXPR:
        return basicSetIsrightexpr(null, msgs);
      case AS3Package.EXPR__PREFIXEXPR:
        return basicSetPrefixexpr(null, msgs);
      case AS3Package.EXPR__POSTFIXEXPR:
        return basicSetPostfixexpr(null, msgs);
      case AS3Package.EXPR__INFIXEXPRLEFT:
        return basicSetInfixexprleft(null, msgs);
      case AS3Package.EXPR__INFIXEXPRRIGHT:
        return basicSetInfixexprright(null, msgs);
      case AS3Package.EXPR__ARGS:
        return basicSetArgs(null, msgs);
      case AS3Package.EXPR__CONDITION:
        return basicSetCondition(null, msgs);
      case AS3Package.EXPR__THEN:
        return basicSetThen(null, msgs);
      case AS3Package.EXPR__ELSE:
        return basicSetElse(null, msgs);
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
      case AS3Package.EXPR__NAME:
        return getName();
      case AS3Package.EXPR__EXPR:
        return getExpr();
      case AS3Package.EXPR__DELETEEXPR:
        return getDeleteexpr();
      case AS3Package.EXPR__TYPEEXPR:
        return getTypeexpr();
      case AS3Package.EXPR__TYPE:
        return getType();
      case AS3Package.EXPR__ISLEFTEPXR:
        return getIsleftepxr();
      case AS3Package.EXPR__ISRIGHTEXPR:
        return getIsrightexpr();
      case AS3Package.EXPR__PREFIXEXPR:
        return getPrefixexpr();
      case AS3Package.EXPR__POSTFIXEXPR:
        return getPostfixexpr();
      case AS3Package.EXPR__INFIXEXPRLEFT:
        return getInfixexprleft();
      case AS3Package.EXPR__INFIXEXPRRIGHT:
        return getInfixexprright();
      case AS3Package.EXPR__ARGS:
        return getArgs();
      case AS3Package.EXPR__CONDITION:
        return getCondition();
      case AS3Package.EXPR__THEN:
        return getThen();
      case AS3Package.EXPR__ELSE:
        return getElse();
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
      case AS3Package.EXPR__NAME:
        setName((String)newValue);
        return;
      case AS3Package.EXPR__EXPR:
        setExpr((expr)newValue);
        return;
      case AS3Package.EXPR__DELETEEXPR:
        setDeleteexpr((expr)newValue);
        return;
      case AS3Package.EXPR__TYPEEXPR:
        setTypeexpr((expr)newValue);
        return;
      case AS3Package.EXPR__TYPE:
        setType((String)newValue);
        return;
      case AS3Package.EXPR__ISLEFTEPXR:
        setIsleftepxr((expr)newValue);
        return;
      case AS3Package.EXPR__ISRIGHTEXPR:
        setIsrightexpr((expr)newValue);
        return;
      case AS3Package.EXPR__PREFIXEXPR:
        setPrefixexpr((expr)newValue);
        return;
      case AS3Package.EXPR__POSTFIXEXPR:
        setPostfixexpr((expr)newValue);
        return;
      case AS3Package.EXPR__INFIXEXPRLEFT:
        setInfixexprleft((expr)newValue);
        return;
      case AS3Package.EXPR__INFIXEXPRRIGHT:
        setInfixexprright((expr)newValue);
        return;
      case AS3Package.EXPR__ARGS:
        setArgs((arguments)newValue);
        return;
      case AS3Package.EXPR__CONDITION:
        setCondition((expr)newValue);
        return;
      case AS3Package.EXPR__THEN:
        setThen((exprOrObjectLiteral)newValue);
        return;
      case AS3Package.EXPR__ELSE:
        setElse((exprOrObjectLiteral)newValue);
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
      case AS3Package.EXPR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.EXPR__EXPR:
        setExpr((expr)null);
        return;
      case AS3Package.EXPR__DELETEEXPR:
        setDeleteexpr((expr)null);
        return;
      case AS3Package.EXPR__TYPEEXPR:
        setTypeexpr((expr)null);
        return;
      case AS3Package.EXPR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AS3Package.EXPR__ISLEFTEPXR:
        setIsleftepxr((expr)null);
        return;
      case AS3Package.EXPR__ISRIGHTEXPR:
        setIsrightexpr((expr)null);
        return;
      case AS3Package.EXPR__PREFIXEXPR:
        setPrefixexpr((expr)null);
        return;
      case AS3Package.EXPR__POSTFIXEXPR:
        setPostfixexpr((expr)null);
        return;
      case AS3Package.EXPR__INFIXEXPRLEFT:
        setInfixexprleft((expr)null);
        return;
      case AS3Package.EXPR__INFIXEXPRRIGHT:
        setInfixexprright((expr)null);
        return;
      case AS3Package.EXPR__ARGS:
        setArgs((arguments)null);
        return;
      case AS3Package.EXPR__CONDITION:
        setCondition((expr)null);
        return;
      case AS3Package.EXPR__THEN:
        setThen((exprOrObjectLiteral)null);
        return;
      case AS3Package.EXPR__ELSE:
        setElse((exprOrObjectLiteral)null);
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
      case AS3Package.EXPR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.EXPR__EXPR:
        return expr != null;
      case AS3Package.EXPR__DELETEEXPR:
        return deleteexpr != null;
      case AS3Package.EXPR__TYPEEXPR:
        return typeexpr != null;
      case AS3Package.EXPR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case AS3Package.EXPR__ISLEFTEPXR:
        return isleftepxr != null;
      case AS3Package.EXPR__ISRIGHTEXPR:
        return isrightexpr != null;
      case AS3Package.EXPR__PREFIXEXPR:
        return prefixexpr != null;
      case AS3Package.EXPR__POSTFIXEXPR:
        return postfixexpr != null;
      case AS3Package.EXPR__INFIXEXPRLEFT:
        return infixexprleft != null;
      case AS3Package.EXPR__INFIXEXPRRIGHT:
        return infixexprright != null;
      case AS3Package.EXPR__ARGS:
        return args != null;
      case AS3Package.EXPR__CONDITION:
        return condition != null;
      case AS3Package.EXPR__THEN:
        return then != null;
      case AS3Package.EXPR__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == objectField.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == parameter.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.EXPR__NAME: return AS3Package.PARAMETER__NAME;
        default: return -1;
      }
    }
    if (baseClass == exprOrObjectLiteral.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == statementInSwitch.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == objectField.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == parameter.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.PARAMETER__NAME: return AS3Package.EXPR__NAME;
        default: return -1;
      }
    }
    if (baseClass == exprOrObjectLiteral.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == statementInSwitch.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //exprImpl
