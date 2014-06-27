/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
import de.lynorics.eclipse.jangaroo.aS3.Declaration;
import de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.catchBlock;
import de.lynorics.eclipse.jangaroo.aS3.declarationTail;
import de.lynorics.eclipse.jangaroo.aS3.forInClauseDecl;
import de.lynorics.eclipse.jangaroo.aS3.identi;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifier;
import de.lynorics.eclipse.jangaroo.aS3.typeExpression;
import de.lynorics.eclipse.jangaroo.aS3.variableDeclarator;
import de.lynorics.eclipse.jangaroo.aS3.variableInitializer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>identi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getTail <em>Tail</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getI <em>I</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getVar <em>Var</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.identiImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class identiImpl extends fieldNameImpl implements identi
{
  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final AccessLevel LEVEL_EDEFAULT = AccessLevel.INTERNAL;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected AccessLevel level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected Condition assert_;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected declarationTail tail;

  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final String I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected String i = I_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected typeExpression type;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected variableInitializer var;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected identiImpl()
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
    return AS3Package.Literals.IDENTI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessLevel getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(AccessLevel newLevel)
  {
    AccessLevel oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssert(Condition newAssert, NotificationChain msgs)
  {
    Condition oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__ASSERT, oldAssert, newAssert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(Condition newAssert)
  {
    if (newAssert != assert_)
    {
      NotificationChain msgs = null;
      if (assert_ != null)
        msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__ASSERT, null, msgs);
      if (newAssert != null)
        msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__ASSERT, null, msgs);
      msgs = basicSetAssert(newAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__ASSERT, newAssert, newAssert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declarationTail getTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTail(declarationTail newTail, NotificationChain msgs)
  {
    declarationTail oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__TAIL, oldTail, newTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTail(declarationTail newTail)
  {
    if (newTail != tail)
    {
      NotificationChain msgs = null;
      if (tail != null)
        msgs = ((InternalEObject)tail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__TAIL, null, msgs);
      if (newTail != null)
        msgs = ((InternalEObject)newTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__TAIL, null, msgs);
      msgs = basicSetTail(newTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__TAIL, newTail, newTail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(String newI)
  {
    String oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeExpression getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(typeExpression newType, NotificationChain msgs)
  {
    typeExpression oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(typeExpression newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableInitializer getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(variableInitializer newVar, NotificationChain msgs)
  {
    variableInitializer oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(variableInitializer newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.IDENTI__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.IDENTI__BLOCK, newBlock, newBlock));
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
      case AS3Package.IDENTI__ASSERT:
        return basicSetAssert(null, msgs);
      case AS3Package.IDENTI__TAIL:
        return basicSetTail(null, msgs);
      case AS3Package.IDENTI__TYPE:
        return basicSetType(null, msgs);
      case AS3Package.IDENTI__VAR:
        return basicSetVar(null, msgs);
      case AS3Package.IDENTI__BLOCK:
        return basicSetBlock(null, msgs);
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
      case AS3Package.IDENTI__LEVEL:
        return getLevel();
      case AS3Package.IDENTI__ASSERT:
        return getAssert();
      case AS3Package.IDENTI__TAIL:
        return getTail();
      case AS3Package.IDENTI__I:
        return getI();
      case AS3Package.IDENTI__TYPE:
        return getType();
      case AS3Package.IDENTI__VAR:
        return getVar();
      case AS3Package.IDENTI__BLOCK:
        return getBlock();
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
      case AS3Package.IDENTI__LEVEL:
        setLevel((AccessLevel)newValue);
        return;
      case AS3Package.IDENTI__ASSERT:
        setAssert((Condition)newValue);
        return;
      case AS3Package.IDENTI__TAIL:
        setTail((declarationTail)newValue);
        return;
      case AS3Package.IDENTI__I:
        setI((String)newValue);
        return;
      case AS3Package.IDENTI__TYPE:
        setType((typeExpression)newValue);
        return;
      case AS3Package.IDENTI__VAR:
        setVar((variableInitializer)newValue);
        return;
      case AS3Package.IDENTI__BLOCK:
        setBlock((Block)newValue);
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
      case AS3Package.IDENTI__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case AS3Package.IDENTI__ASSERT:
        setAssert((Condition)null);
        return;
      case AS3Package.IDENTI__TAIL:
        setTail((declarationTail)null);
        return;
      case AS3Package.IDENTI__I:
        setI(I_EDEFAULT);
        return;
      case AS3Package.IDENTI__TYPE:
        setType((typeExpression)null);
        return;
      case AS3Package.IDENTI__VAR:
        setVar((variableInitializer)null);
        return;
      case AS3Package.IDENTI__BLOCK:
        setBlock((Block)null);
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
      case AS3Package.IDENTI__LEVEL:
        return level != LEVEL_EDEFAULT;
      case AS3Package.IDENTI__ASSERT:
        return assert_ != null;
      case AS3Package.IDENTI__TAIL:
        return tail != null;
      case AS3Package.IDENTI__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
      case AS3Package.IDENTI__TYPE:
        return type != null;
      case AS3Package.IDENTI__VAR:
        return var != null;
      case AS3Package.IDENTI__BLOCK:
        return block != null;
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
    if (baseClass == qualifier.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.IDENTI__LEVEL: return AS3Package.QUALIFIER__LEVEL;
        default: return -1;
      }
    }
    if (baseClass == propertyIdentifier.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.IDENTI__ASSERT: return AS3Package.STATEMENT__ASSERT;
        default: return -1;
      }
    }
    if (baseClass == DeclarationStatement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == forInClauseDecl.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Declaration.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == variableDeclarator.class)
    {
      switch (derivedFeatureID)
      {
        case AS3Package.IDENTI__TAIL: return AS3Package.VARIABLE_DECLARATOR__TAIL;
        default: return -1;
      }
    }
    if (baseClass == catchBlock.class)
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
    if (baseClass == qualifier.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.QUALIFIER__LEVEL: return AS3Package.IDENTI__LEVEL;
        default: return -1;
      }
    }
    if (baseClass == propertyIdentifier.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.STATEMENT__ASSERT: return AS3Package.IDENTI__ASSERT;
        default: return -1;
      }
    }
    if (baseClass == DeclarationStatement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == forInClauseDecl.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Declaration.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == variableDeclarator.class)
    {
      switch (baseFeatureID)
      {
        case AS3Package.VARIABLE_DECLARATOR__TAIL: return AS3Package.IDENTI__TAIL;
        default: return -1;
      }
    }
    if (baseClass == catchBlock.class)
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
    result.append(" (level: ");
    result.append(level);
    result.append(", i: ");
    result.append(i);
    result.append(')');
    return result.toString();
  }

} //identiImpl
