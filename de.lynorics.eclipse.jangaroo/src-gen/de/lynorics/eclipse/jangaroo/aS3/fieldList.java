/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldList#getLf <em>Lf</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldList#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldList()
 * @model
 * @generated
 */
public interface fieldList extends EObject
{
  /**
   * Returns the value of the '<em><b>Lf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lf</em>' containment reference.
   * @see #setLf(literalField)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldList_Lf()
   * @model containment="true"
   * @generated
   */
  literalField getLf();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldList#getLf <em>Lf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lf</em>' containment reference.
   * @see #getLf()
   * @generated
   */
  void setLf(literalField value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.literalField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldList_Fields()
   * @model containment="true"
   * @generated
   */
  EList<literalField> getFields();

} // fieldList
