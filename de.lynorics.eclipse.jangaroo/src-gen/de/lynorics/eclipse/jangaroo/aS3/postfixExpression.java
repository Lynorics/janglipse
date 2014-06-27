/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPeexpr <em>Peexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPepoi <em>Pepoi</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPewi <em>Pewi</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getE4x <em>E4x</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression()
 * @model
 * @generated
 */
public interface postfixExpression extends unaryExpressionNotPlusMinus
{
  /**
   * Returns the value of the '<em><b>Peexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Peexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Peexpr</em>' containment reference.
   * @see #setPeexpr(primaryExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_Peexpr()
   * @model containment="true"
   * @generated
   */
  primaryExpression getPeexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.postfixExpression#getPeexpr <em>Peexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Peexpr</em>' containment reference.
   * @see #getPeexpr()
   * @generated
   */
  void setPeexpr(primaryExpression value);

  /**
   * Returns the value of the '<em><b>Pepoi</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pepoi</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pepoi</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_Pepoi()
   * @model containment="true"
   * @generated
   */
  EList<propOrIdent> getPepoi();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

  /**
   * Returns the value of the '<em><b>Pewi</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pewi</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pewi</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_Pewi()
   * @model containment="true"
   * @generated
   */
  EList<qualifiedIdentifier> getPewi();

  /**
   * Returns the value of the '<em><b>E4x</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E4x</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E4x</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_E4x()
   * @model containment="true"
   * @generated
   */
  EList<e4xAttributeIdentifier> getE4x();

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpostfixExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<arguments> getArgs();

} // postfixExpression
