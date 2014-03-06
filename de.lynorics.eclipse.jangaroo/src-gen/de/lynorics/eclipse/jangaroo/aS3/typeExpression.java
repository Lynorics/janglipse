/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.typeExpression#getIdenti <em>Identi</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettypeExpression()
 * @model
 * @generated
 */
public interface typeExpression extends EObject
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
   * @see #setIdenti(identifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettypeExpression_Identi()
   * @model containment="true"
   * @generated
   */
  identifier getIdenti();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.typeExpression#getIdenti <em>Identi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identi</em>' containment reference.
   * @see #getIdenti()
   * @generated
   */
  void setIdenti(identifier value);

} // typeExpression