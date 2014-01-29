/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.While#getWhileBlock <em>While Block</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.While#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getWhile()
 * @model
 * @generated
 */
public interface While extends DoWhileStatement, WhileStatement
{
  /**
   * Returns the value of the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Block</em>' containment reference.
   * @see #setWhileBlock(StatementsBlock)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getWhile_WhileBlock()
   * @model containment="true"
   * @generated
   */
  StatementsBlock getWhileBlock();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.While#getWhileBlock <em>While Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Block</em>' containment reference.
   * @see #getWhileBlock()
   * @generated
   */
  void setWhileBlock(StatementsBlock value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(parenthesizedExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getWhile_Cond()
   * @model containment="true"
   * @generated
   */
  parenthesizedExpr getCond();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.While#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(parenthesizedExpr value);

} // While
