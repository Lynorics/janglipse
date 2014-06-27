/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getState <em>State</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getDoWhileStatement()
 * @model
 * @generated
 */
public interface DoWhileStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(Statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getDoWhileStatement_State()
   * @model containment="true"
   * @generated
   */
  Statement getState();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(Statement value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Condition)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getDoWhileStatement_Cond()
   * @model containment="true"
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

} // DoWhileStatement
