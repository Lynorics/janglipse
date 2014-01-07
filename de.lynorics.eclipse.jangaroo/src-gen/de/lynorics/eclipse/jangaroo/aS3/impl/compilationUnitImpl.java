/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnit;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.directives;
import de.lynorics.eclipse.jangaroo.aS3.packageDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl#getDirective <em>Directive</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.compilationUnitImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compilationUnitImpl extends ModelImpl implements compilationUnit
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected packageDeclaration package_;

  /**
   * The cached value of the '{@link #getDirective() <em>Directive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirective()
   * @generated
   * @ordered
   */
  protected directives directive;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected compilationUnitDeclaration unit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compilationUnitImpl()
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
    return AS3Package.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packageDeclaration getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(packageDeclaration newPackage, NotificationChain msgs)
  {
    packageDeclaration oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(packageDeclaration newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public directives getDirective()
  {
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirective(directives newDirective, NotificationChain msgs)
  {
    directives oldDirective = directive;
    directive = newDirective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__DIRECTIVE, oldDirective, newDirective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirective(directives newDirective)
  {
    if (newDirective != directive)
    {
      NotificationChain msgs = null;
      if (directive != null)
        msgs = ((InternalEObject)directive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__DIRECTIVE, null, msgs);
      if (newDirective != null)
        msgs = ((InternalEObject)newDirective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__DIRECTIVE, null, msgs);
      msgs = basicSetDirective(newDirective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__DIRECTIVE, newDirective, newDirective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compilationUnitDeclaration getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnit(compilationUnitDeclaration newUnit, NotificationChain msgs)
  {
    compilationUnitDeclaration oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__UNIT, oldUnit, newUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(compilationUnitDeclaration newUnit)
  {
    if (newUnit != unit)
    {
      NotificationChain msgs = null;
      if (unit != null)
        msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__UNIT, null, msgs);
      if (newUnit != null)
        msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.COMPILATION_UNIT__UNIT, null, msgs);
      msgs = basicSetUnit(newUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.COMPILATION_UNIT__UNIT, newUnit, newUnit));
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
      case AS3Package.COMPILATION_UNIT__PACKAGE:
        return basicSetPackage(null, msgs);
      case AS3Package.COMPILATION_UNIT__DIRECTIVE:
        return basicSetDirective(null, msgs);
      case AS3Package.COMPILATION_UNIT__UNIT:
        return basicSetUnit(null, msgs);
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
      case AS3Package.COMPILATION_UNIT__PACKAGE:
        return getPackage();
      case AS3Package.COMPILATION_UNIT__DIRECTIVE:
        return getDirective();
      case AS3Package.COMPILATION_UNIT__UNIT:
        return getUnit();
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
      case AS3Package.COMPILATION_UNIT__PACKAGE:
        setPackage((packageDeclaration)newValue);
        return;
      case AS3Package.COMPILATION_UNIT__DIRECTIVE:
        setDirective((directives)newValue);
        return;
      case AS3Package.COMPILATION_UNIT__UNIT:
        setUnit((compilationUnitDeclaration)newValue);
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
      case AS3Package.COMPILATION_UNIT__PACKAGE:
        setPackage((packageDeclaration)null);
        return;
      case AS3Package.COMPILATION_UNIT__DIRECTIVE:
        setDirective((directives)null);
        return;
      case AS3Package.COMPILATION_UNIT__UNIT:
        setUnit((compilationUnitDeclaration)null);
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
      case AS3Package.COMPILATION_UNIT__PACKAGE:
        return package_ != null;
      case AS3Package.COMPILATION_UNIT__DIRECTIVE:
        return directive != null;
      case AS3Package.COMPILATION_UNIT__UNIT:
        return unit != null;
    }
    return super.eIsSet(featureID);
  }

} //compilationUnitImpl
