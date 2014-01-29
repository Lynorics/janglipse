/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>annotation Fields</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl#getAnoonFields <em>Anoon Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.annotationFieldsImpl#getAnnonFields <em>Annon Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class annotationFieldsImpl extends MinimalEObjectImpl.Container implements annotationFields
{
  /**
   * The cached value of the '{@link #getAnoonFields() <em>Anoon Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnoonFields()
   * @generated
   * @ordered
   */
  protected EList<annotationField> anoonFields;

  /**
   * The cached value of the '{@link #getAnnonFields() <em>Annon Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnonFields()
   * @generated
   * @ordered
   */
  protected EList<annotationField> annonFields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected annotationFieldsImpl()
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
    return AS3Package.Literals.ANNOTATION_FIELDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<annotationField> getAnoonFields()
  {
    if (anoonFields == null)
    {
      anoonFields = new EObjectContainmentEList<annotationField>(annotationField.class, this, AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS);
    }
    return anoonFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<annotationField> getAnnonFields()
  {
    if (annonFields == null)
    {
      annonFields = new EObjectContainmentEList<annotationField>(annotationField.class, this, AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS);
    }
    return annonFields;
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
      case AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS:
        return ((InternalEList<?>)getAnoonFields()).basicRemove(otherEnd, msgs);
      case AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS:
        return ((InternalEList<?>)getAnnonFields()).basicRemove(otherEnd, msgs);
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
      case AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS:
        return getAnoonFields();
      case AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS:
        return getAnnonFields();
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
      case AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS:
        getAnoonFields().clear();
        getAnoonFields().addAll((Collection<? extends annotationField>)newValue);
        return;
      case AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS:
        getAnnonFields().clear();
        getAnnonFields().addAll((Collection<? extends annotationField>)newValue);
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
      case AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS:
        getAnoonFields().clear();
        return;
      case AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS:
        getAnnonFields().clear();
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
      case AS3Package.ANNOTATION_FIELDS__ANOON_FIELDS:
        return anoonFields != null && !anoonFields.isEmpty();
      case AS3Package.ANNOTATION_FIELDS__ANNON_FIELDS:
        return annonFields != null && !annonFields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //annotationFieldsImpl
