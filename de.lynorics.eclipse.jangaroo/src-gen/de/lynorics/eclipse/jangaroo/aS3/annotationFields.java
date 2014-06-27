/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>annotation Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnoonFields <em>Anoon Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.annotationFields#getAnnonFields <em>Annon Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getannotationFields()
 * @model
 * @generated
 */
public interface annotationFields extends EObject
{
  /**
   * Returns the value of the '<em><b>Anoon Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.annotationField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anoon Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anoon Fields</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getannotationFields_AnoonFields()
   * @model containment="true"
   * @generated
   */
  EList<annotationField> getAnoonFields();

  /**
   * Returns the value of the '<em><b>Annon Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.annotationField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annon Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annon Fields</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getannotationFields_AnnonFields()
   * @model containment="true"
   * @generated
   */
  EList<annotationField> getAnnonFields();

} // annotationFields
