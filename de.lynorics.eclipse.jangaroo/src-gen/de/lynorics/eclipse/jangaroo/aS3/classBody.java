/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classBody#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassBody()
 * @model
 * @generated
 */
public interface classBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassBody_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // classBody
