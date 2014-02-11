/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Expression#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getExpression()
 * @model
 * @generated
 */
public interface Expression extends exprOrObjectLiteral, Condition, DefaultXMLNamespaceStatement, ThrowStatement, CaseStatement
{
  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(switchStatementList)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getExpression_L()
   * @model containment="true"
   * @generated
   */
  switchStatementList getL();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Expression#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(switchStatementList value);

} // Expression
