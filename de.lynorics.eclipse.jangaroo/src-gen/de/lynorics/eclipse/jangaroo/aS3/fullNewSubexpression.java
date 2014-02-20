/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>full New Subexpression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getArgs <em>Args</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getFnsd <em>Fnsd</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getQuali <em>Quali</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression#getBrack <em>Brack</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression()
 * @model
 * @generated
 */
public interface fullNewSubexpression extends newExpression
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.arguments}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<arguments> getArgs();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression_Expr()
   * @model containment="true"
   * @generated
   */
  EList<primaryExpression> getExpr();

  /**
   * Returns the value of the '<em><b>Fnsd</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fnsd</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fnsd</em>' attribute list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression_Fnsd()
   * @model unique="false"
   * @generated
   */
  EList<String> getFnsd();

  /**
   * Returns the value of the '<em><b>Quali</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quali</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quali</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression_Quali()
   * @model containment="true"
   * @generated
   */
  EList<qualifiedIdent> getQuali();

  /**
   * Returns the value of the '<em><b>Brack</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.brackets}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Brack</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brack</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfullNewSubexpression_Brack()
   * @model containment="true"
   * @generated
   */
  EList<brackets> getBrack();

} // fullNewSubexpression
