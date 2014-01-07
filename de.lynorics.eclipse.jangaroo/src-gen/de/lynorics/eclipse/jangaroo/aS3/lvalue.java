/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lvalue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlvalue()
 * @model
 * @generated
 */
public interface lvalue extends expr
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
   * @see #setExpression(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlvalue_Expression()
   * @model containment="true"
   * @generated
   */
  expr getExpression();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expr value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(namespacedIdentifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlvalue_Identifier()
   * @model containment="true"
   * @generated
   */
  namespacedIdentifier getIdentifier();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(namespacedIdentifier value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(commaExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlvalue_List()
   * @model containment="true"
   * @generated
   */
  commaExpr getList();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.lvalue#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(commaExpr value);

} // lvalue
