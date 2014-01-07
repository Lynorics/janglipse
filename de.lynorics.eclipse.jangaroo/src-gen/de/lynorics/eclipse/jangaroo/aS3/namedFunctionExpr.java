/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>named Function Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getParams <em>Params</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamedFunctionExpr()
 * @model
 * @generated
 */
public interface namedFunctionExpr extends exprOrObjectLiteral
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(parameters)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamedFunctionExpr_Params()
   * @model containment="true"
   * @generated
   */
  parameters getParams();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(parameters value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see #setRelation(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamedFunctionExpr_Relation()
   * @model
   * @generated
   */
  String getRelation();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see #getRelation()
   * @generated
   */
  void setRelation(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(block)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamedFunctionExpr_Command()
   * @model containment="true"
   * @generated
   */
  block getCommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(block value);

} // namedFunctionExpr
