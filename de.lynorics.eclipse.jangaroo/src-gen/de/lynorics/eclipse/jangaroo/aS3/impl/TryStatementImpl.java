/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.catchBlock;
import de.lynorics.eclipse.jangaroo.aS3.finallyBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.TryStatementImpl#getCatch <em>Catch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement
{
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
   * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally()
   * @generated
   * @ordered
   */
  protected finallyBlock finally_;

  /**
   * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatch()
   * @generated
   * @ordered
   */
  protected EList<catchBlock> catch_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryStatementImpl()
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
    return AS3Package.Literals.TRY_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.TRY_STATEMENT__BLOCK, oldBlock, newBlock);
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
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.TRY_STATEMENT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.TRY_STATEMENT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.TRY_STATEMENT__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public finallyBlock getFinally()
  {
    return finally_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinally(finallyBlock newFinally, NotificationChain msgs)
  {
    finallyBlock oldFinally = finally_;
    finally_ = newFinally;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.TRY_STATEMENT__FINALLY, oldFinally, newFinally);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinally(finallyBlock newFinally)
  {
    if (newFinally != finally_)
    {
      NotificationChain msgs = null;
      if (finally_ != null)
        msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.TRY_STATEMENT__FINALLY, null, msgs);
      if (newFinally != null)
        msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.TRY_STATEMENT__FINALLY, null, msgs);
      msgs = basicSetFinally(newFinally, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.TRY_STATEMENT__FINALLY, newFinally, newFinally));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<catchBlock> getCatch()
  {
    if (catch_ == null)
    {
      catch_ = new EObjectContainmentEList<catchBlock>(catchBlock.class, this, AS3Package.TRY_STATEMENT__CATCH);
    }
    return catch_;
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
      case AS3Package.TRY_STATEMENT__BLOCK:
        return basicSetBlock(null, msgs);
      case AS3Package.TRY_STATEMENT__FINALLY:
        return basicSetFinally(null, msgs);
      case AS3Package.TRY_STATEMENT__CATCH:
        return ((InternalEList<?>)getCatch()).basicRemove(otherEnd, msgs);
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
      case AS3Package.TRY_STATEMENT__BLOCK:
        return getBlock();
      case AS3Package.TRY_STATEMENT__FINALLY:
        return getFinally();
      case AS3Package.TRY_STATEMENT__CATCH:
        return getCatch();
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
      case AS3Package.TRY_STATEMENT__BLOCK:
        setBlock((Block)newValue);
        return;
      case AS3Package.TRY_STATEMENT__FINALLY:
        setFinally((finallyBlock)newValue);
        return;
      case AS3Package.TRY_STATEMENT__CATCH:
        getCatch().clear();
        getCatch().addAll((Collection<? extends catchBlock>)newValue);
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
      case AS3Package.TRY_STATEMENT__BLOCK:
        setBlock((Block)null);
        return;
      case AS3Package.TRY_STATEMENT__FINALLY:
        setFinally((finallyBlock)null);
        return;
      case AS3Package.TRY_STATEMENT__CATCH:
        getCatch().clear();
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
      case AS3Package.TRY_STATEMENT__BLOCK:
        return block != null;
      case AS3Package.TRY_STATEMENT__FINALLY:
        return finally_ != null;
      case AS3Package.TRY_STATEMENT__CATCH:
        return catch_ != null && !catch_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TryStatementImpl
