/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getIdenti <em>Identi</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getNumber <em>Number</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldName()
 * @model
 * @generated
 */
public interface fieldName extends EObject
{
  /**
   * Returns the value of the '<em><b>Identi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identi</em>' containment reference.
   * @see #setIdenti(identi)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldName_Identi()
   * @model containment="true"
   * @generated
   */
  identi getIdenti();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getIdenti <em>Identi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identi</em>' containment reference.
   * @see #getIdenti()
   * @generated
   */
  void setIdenti(identi value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldName_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // fieldName
