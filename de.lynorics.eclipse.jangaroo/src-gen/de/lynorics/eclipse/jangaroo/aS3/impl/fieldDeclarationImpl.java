/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.modifiers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl#getVar <em>Var</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.fieldDeclarationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fieldDeclarationImpl extends MinimalEObjectImpl.Container implements fieldDeclaration
{
  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected modifiers mod;

  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<identifierDeclaration> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fieldDeclarationImpl()
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
    return AS3Package.Literals.FIELD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modifiers getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMod(modifiers newMod, NotificationChain msgs)
  {
    modifiers oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FIELD_DECLARATION__MOD, oldMod, newMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(modifiers newMod)
  {
    if (newMod != mod)
    {
      NotificationChain msgs = null;
      if (mod != null)
        msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FIELD_DECLARATION__MOD, null, msgs);
      if (newMod != null)
        msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FIELD_DECLARATION__MOD, null, msgs);
      msgs = basicSetMod(newMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FIELD_DECLARATION__MOD, newMod, newMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FIELD_DECLARATION__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<identifierDeclaration> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<identifierDeclaration>(identifierDeclaration.class, this, AS3Package.FIELD_DECLARATION__ELEMENTS);
    }
    return elements;
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
      case AS3Package.FIELD_DECLARATION__MOD:
        return basicSetMod(null, msgs);
      case AS3Package.FIELD_DECLARATION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case AS3Package.FIELD_DECLARATION__MOD:
        return getMod();
      case AS3Package.FIELD_DECLARATION__VAR:
        return getVar();
      case AS3Package.FIELD_DECLARATION__ELEMENTS:
        return getElements();
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
      case AS3Package.FIELD_DECLARATION__MOD:
        setMod((modifiers)newValue);
        return;
      case AS3Package.FIELD_DECLARATION__VAR:
        setVar((String)newValue);
        return;
      case AS3Package.FIELD_DECLARATION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends identifierDeclaration>)newValue);
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
      case AS3Package.FIELD_DECLARATION__MOD:
        setMod((modifiers)null);
        return;
      case AS3Package.FIELD_DECLARATION__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case AS3Package.FIELD_DECLARATION__ELEMENTS:
        getElements().clear();
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
      case AS3Package.FIELD_DECLARATION__MOD:
        return mod != null;
      case AS3Package.FIELD_DECLARATION__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case AS3Package.FIELD_DECLARATION__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //fieldDeclarationImpl
