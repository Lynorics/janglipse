/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.arguments#getExprList <em>Expr List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getarguments()
 * @model
 * @generated
 */
public interface arguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr List</em>' containment reference.
   * @see #setExprList(expressionList)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getarguments_ExprList()
   * @model containment="true"
   * @generated
   */
  expressionList getExprList();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.arguments#getExprList <em>Expr List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr List</em>' containment reference.
   * @see #getExprList()
   * @generated
   */
  void setExprList(expressionList value);

} // arguments
