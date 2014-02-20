/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>literal Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getEl <em>El</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getliteralField()
 * @model
 * @generated
 */
public interface literalField extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(fieldName)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getliteralField_Name()
   * @model containment="true"
   * @generated
   */
  fieldName getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(fieldName value);

  /**
   * Returns the value of the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' containment reference.
   * @see #setEl(element)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getliteralField_El()
   * @model containment="true"
   * @generated
   */
  element getEl();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.literalField#getEl <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' containment reference.
   * @see #getEl()
   * @generated
   */
  void setEl(element value);

} // literalField
