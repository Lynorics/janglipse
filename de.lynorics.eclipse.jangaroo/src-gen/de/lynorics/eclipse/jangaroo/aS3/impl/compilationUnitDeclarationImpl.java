/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.classDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.memberDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compilation Unit Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitDeclarationImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compilationUnitDeclarationImpl extends MinimalEObjectImpl.Container implements compilationUnitDeclaration
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected classDeclaration class_;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected memberDeclaration member;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compilationUnitDeclarationImpl()
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
    return AS3Package.Literals.COMPILATION_UNIT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classDeclaration getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(classDeclaration newClass, NotificationChain msgs)
  {
    classDeclaration oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT_DECLARATION__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(classDeclaration newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT_DECLARATION__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT_DECLARATION__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT_DECLARATION__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public memberDeclaration getMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMember(memberDeclaration newMember, NotificationChain msgs)
  {
    memberDeclaration oldMember = member;
    member = newMember;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER, oldMember, newMember);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(memberDeclaration newMember)
  {
    if (newMember != member)
    {
      NotificationChain msgs = null;
      if (member != null)
        msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER, null, msgs);
      if (newMember != null)
        msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER, null, msgs);
      msgs = basicSetMember(newMember, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER, newMember, newMember));
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
      case AS3Package.COMPILATION_UNIT_DECLARATION__CLASS:
        return basicSetClass(null, msgs);
      case AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER:
        return basicSetMember(null, msgs);
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
      case AS3Package.COMPILATION_UNIT_DECLARATION__CLASS:
        return getClass_();
      case AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER:
        return getMember();
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
      case AS3Package.COMPILATION_UNIT_DECLARATION__CLASS:
        setClass((classDeclaration)newValue);
        return;
      case AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER:
        setMember((memberDeclaration)newValue);
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
      case AS3Package.COMPILATION_UNIT_DECLARATION__CLASS:
        setClass((classDeclaration)null);
        return;
      case AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER:
        setMember((memberDeclaration)null);
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
      case AS3Package.COMPILATION_UNIT_DECLARATION__CLASS:
        return class_ != null;
      case AS3Package.COMPILATION_UNIT_DECLARATION__MEMBER:
        return member != null;
    }
    return super.eIsSet(featureID);
  }

} //compilationUnitDeclarationImpl
