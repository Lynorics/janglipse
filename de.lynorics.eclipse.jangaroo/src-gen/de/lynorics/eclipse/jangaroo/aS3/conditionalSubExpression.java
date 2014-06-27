/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conditional Sub Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalSubExpression()
 * @model
 * @generated
 */
public interface conditionalSubExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr1</em>' containment reference.
   * @see #setExpr1(assignmentExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalSubExpression_Expr1()
   * @model containment="true"
   * @generated
   */
  assignmentExpression getExpr1();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr1 <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr1</em>' containment reference.
   * @see #getExpr1()
   * @generated
   */
  void setExpr1(assignmentExpression value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' containment reference.
   * @see #setExpr2(assignmentExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalSubExpression_Expr2()
   * @model containment="true"
   * @generated
   */
  assignmentExpression getExpr2();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression#getExpr2 <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' containment reference.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(assignmentExpression value);

} // conditionalSubExpression
