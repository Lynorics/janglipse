/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logical Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getCond <em>Cond</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getO <em>O</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlogicalOrExpression()
 * @model
 * @generated
 */
public interface logicalOrExpression extends conditionalExpression
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(conditionalSubExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlogicalOrExpression_Cond()
   * @model containment="true"
   * @generated
   */
  conditionalSubExpression getCond();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(conditionalSubExpression value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlogicalOrExpression_O()
   * @model unique="false"
   * @generated
   */
  EList<String> getO();

} // logicalOrExpression
