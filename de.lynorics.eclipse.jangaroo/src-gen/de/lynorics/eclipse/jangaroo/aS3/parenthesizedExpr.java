/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parenthesized Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getparenthesizedExpr()
 * @model
 * @generated
 */
public interface parenthesizedExpr extends expr
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(exprOrObjectLiteral)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getparenthesizedExpr_Expression()
   * @model containment="true"
   * @generated
   */
  exprOrObjectLiteral getExpression();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(exprOrObjectLiteral value);

} // parenthesizedExpr
