/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.typeRelation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettypeRelation()
 * @model
 * @generated
 */
public interface typeRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(de.lynorics.eclipse.jangaroo.aS3.Class)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettypeRelation_Type()
   * @model
   * @generated
   */
  de.lynorics.eclipse.jangaroo.aS3.Class getType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.typeRelation#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(de.lynorics.eclipse.jangaroo.aS3.Class value);

} // typeRelation
