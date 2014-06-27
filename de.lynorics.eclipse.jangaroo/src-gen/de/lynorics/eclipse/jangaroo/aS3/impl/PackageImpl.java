/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.directive;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl#getImp <em>Imp</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements de.lynorics.eclipse.jangaroo.aS3.Package
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
   * The cached value of the '{@link #getImp() <em>Imp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImp()
   * @generated
   * @ordered
   */
  protected Imports imp;

  /**
   * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectives()
   * @generated
   * @ordered
   */
  protected EList<directive> directives;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<EObject> members;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<EObject> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return AS3Package.Literals.PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports getImp()
  {
    return imp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImp(Imports newImp, NotificationChain msgs)
  {
    Imports oldImp = imp;
    imp = newImp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.PACKAGE__IMP, oldImp, newImp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImp(Imports newImp)
  {
    if (newImp != imp)
    {
      NotificationChain msgs = null;
      if (imp != null)
        msgs = ((InternalEObject)imp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.PACKAGE__IMP, null, msgs);
      if (newImp != null)
        msgs = ((InternalEObject)newImp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.PACKAGE__IMP, null, msgs);
      msgs = basicSetImp(newImp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.PACKAGE__IMP, newImp, newImp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<directive> getDirectives()
  {
    if (directives == null)
    {
      directives = new EObjectContainmentEList<directive>(directive.class, this, AS3Package.PACKAGE__DIRECTIVES);
    }
    return directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<EObject>(EObject.class, this, AS3Package.PACKAGE__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<EObject>(EObject.class, this, AS3Package.PACKAGE__CLASSES);
    }
    return classes;
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
      case AS3Package.PACKAGE__IMP:
        return basicSetImp(null, msgs);
      case AS3Package.PACKAGE__DIRECTIVES:
        return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
      case AS3Package.PACKAGE__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case AS3Package.PACKAGE__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
      case AS3Package.PACKAGE__NAME:
        return getName();
      case AS3Package.PACKAGE__IMP:
        return getImp();
      case AS3Package.PACKAGE__DIRECTIVES:
        return getDirectives();
      case AS3Package.PACKAGE__MEMBERS:
        return getMembers();
      case AS3Package.PACKAGE__CLASSES:
        return getClasses();
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
      case AS3Package.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case AS3Package.PACKAGE__IMP:
        setImp((Imports)newValue);
        return;
      case AS3Package.PACKAGE__DIRECTIVES:
        getDirectives().clear();
        getDirectives().addAll((Collection<? extends directive>)newValue);
        return;
      case AS3Package.PACKAGE__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends EObject>)newValue);
        return;
      case AS3Package.PACKAGE__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends EObject>)newValue);
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
      case AS3Package.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.PACKAGE__IMP:
        setImp((Imports)null);
        return;
      case AS3Package.PACKAGE__DIRECTIVES:
        getDirectives().clear();
        return;
      case AS3Package.PACKAGE__MEMBERS:
        getMembers().clear();
        return;
      case AS3Package.PACKAGE__CLASSES:
        getClasses().clear();
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
      case AS3Package.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.PACKAGE__IMP:
        return imp != null;
      case AS3Package.PACKAGE__DIRECTIVES:
        return directives != null && !directives.isEmpty();
      case AS3Package.PACKAGE__MEMBERS:
        return members != null && !members.isEmpty();
      case AS3Package.PACKAGE__CLASSES:
        return classes != null && !classes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
