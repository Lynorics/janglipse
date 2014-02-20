/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bitwise Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression#getO <em>O</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbitwiseXorExpression()
 * @model
 * @generated
 */
public interface bitwiseXorExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbitwiseXorExpression_Expr()
   * @model containment="true"
   * @generated
   */
  EList<bitwiseAndExpression> getExpr();

  /**
   * Returns the value of the '<em><b>O</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>O</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>O</em>' attribute list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbitwiseXorExpression_O()
   * @model unique="false"
   * @generated
   */
  EList<String> getO();

} // bitwiseXorExpression
