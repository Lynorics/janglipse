/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.classBody;
import de.lynorics.eclipse.jangaroo.aS3.classDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.modifiers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl#getClassModifiers <em>Class Modifiers</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.classDeclarationImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classDeclarationImpl extends MinimalEObjectImpl.Container implements classDeclaration
{
  /**
   * The cached value of the '{@link #getClassModifiers() <em>Class Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassModifiers()
   * @generated
   * @ordered
   */
  protected modifiers classModifiers;

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
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected classDeclaration superType;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<String> types;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected classBody command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected classDeclarationImpl()
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
    return AS3Package.Literals.CLASS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modifiers getClassModifiers()
  {
    return classModifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassModifiers(modifiers newClassModifiers, NotificationChain msgs)
  {
    modifiers oldClassModifiers = classModifiers;
    classModifiers = newClassModifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS, oldClassModifiers, newClassModifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassModifiers(modifiers newClassModifiers)
  {
    if (newClassModifiers != classModifiers)
    {
      NotificationChain msgs = null;
      if (classModifiers != null)
        msgs = ((InternalEObject)classModifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS, null, msgs);
      if (newClassModifiers != null)
        msgs = ((InternalEObject)newClassModifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS, null, msgs);
      msgs = basicSetClassModifiers(newClassModifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS, newClassModifiers, newClassModifiers));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classDeclaration getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (classDeclaration)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AS3Package.CLASS_DECLARATION__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classDeclaration basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(classDeclaration newSuperType)
  {
    classDeclaration oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypes()
  {
    if (types == null)
    {
      types = new EDataTypeEList<String>(String.class, this, AS3Package.CLASS_DECLARATION__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classBody getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommand(classBody newCommand, NotificationChain msgs)
  {
    classBody oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__COMMAND, oldCommand, newCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(classBody newCommand)
  {
    if (newCommand != command)
    {
      NotificationChain msgs = null;
      if (command != null)
        msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.CLASS_DECLARATION__COMMAND, null, msgs);
      if (newCommand != null)
        msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.CLASS_DECLARATION__COMMAND, null, msgs);
      msgs = basicSetCommand(newCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.CLASS_DECLARATION__COMMAND, newCommand, newCommand));
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
      case AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS:
        return basicSetClassModifiers(null, msgs);
      case AS3Package.CLASS_DECLARATION__COMMAND:
        return basicSetCommand(null, msgs);
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
      case AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS:
        return getClassModifiers();
      case AS3Package.CLASS_DECLARATION__NAME:
        return getName();
      case AS3Package.CLASS_DECLARATION__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case AS3Package.CLASS_DECLARATION__TYPES:
        return getTypes();
      case AS3Package.CLASS_DECLARATION__COMMAND:
        return getCommand();
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
      case AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS:
        setClassModifiers((modifiers)newValue);
        return;
      case AS3Package.CLASS_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AS3Package.CLASS_DECLARATION__SUPER_TYPE:
        setSuperType((classDeclaration)newValue);
        return;
      case AS3Package.CLASS_DECLARATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends String>)newValue);
        return;
      case AS3Package.CLASS_DECLARATION__COMMAND:
        setCommand((classBody)newValue);
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
      case AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS:
        setClassModifiers((modifiers)null);
        return;
      case AS3Package.CLASS_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AS3Package.CLASS_DECLARATION__SUPER_TYPE:
        setSuperType((classDeclaration)null);
        return;
      case AS3Package.CLASS_DECLARATION__TYPES:
        getTypes().clear();
        return;
      case AS3Package.CLASS_DECLARATION__COMMAND:
        setCommand((classBody)null);
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
      case AS3Package.CLASS_DECLARATION__CLASS_MODIFIERS:
        return classModifiers != null;
      case AS3Package.CLASS_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AS3Package.CLASS_DECLARATION__SUPER_TYPE:
        return superType != null;
      case AS3Package.CLASS_DECLARATION__TYPES:
        return types != null && !types.isEmpty();
      case AS3Package.CLASS_DECLARATION__COMMAND:
        return command != null;
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
    result.append(", types: ");
    result.append(types);
    result.append(')');
    return result.toString();
  }

} //classDeclarationImpl
