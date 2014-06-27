/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getOp <em>Op</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.conditionalExpression#getAexpr <em>Aexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalExpression()
 * @model
 * @generated
 */
public interface conditionalExpression extends assignmentExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

  /**
   * Returns the value of the '<em><b>Aexpr</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aexpr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aexpr</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getconditionalExpression_Aexpr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getAexpr();

} // conditionalExpression
