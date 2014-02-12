/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert <em>Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' containment reference.
   * @see #setAssert(Condition)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Assert()
   * @model containment="true"
   * @generated
   */
  Condition getAssert();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' containment reference.
   * @see #getAssert()
   * @generated
   */
  void setAssert(Condition value);

} // Statement
