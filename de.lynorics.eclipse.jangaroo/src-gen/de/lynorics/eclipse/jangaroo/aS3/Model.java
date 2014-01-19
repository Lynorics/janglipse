/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Model#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModel_Classes()
   * @model containment="true"
   * @generated
   */
  EList<de.lynorics.eclipse.jangaroo.aS3.Class> getClasses();

} // Model
