/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getRel <em>Rel</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Symbol
{
  /**
   * Returns the value of the '<em><b>Rel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel</em>' containment reference.
   * @see #setRel(typeRelation)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getParameter_Rel()
   * @model containment="true"
   * @generated
   */
  typeRelation getRel();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getRel <em>Rel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel</em>' containment reference.
   * @see #getRel()
   * @generated
   */
  void setRel(typeRelation value);

  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference.
   * @see #setLit(exprOrObjectLiteral)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getParameter_Lit()
   * @model containment="true"
   * @generated
   */
  exprOrObjectLiteral getLit();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Parameter#getLit <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' containment reference.
   * @see #getLit()
   * @generated
   */
  void setLit(exprOrObjectLiteral value);

} // Parameter
