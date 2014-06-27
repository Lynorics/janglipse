/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getvariableDeclarator()
 * @model
 * @generated
 */
public interface variableDeclarator extends Declaration
{
  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(declarationTail)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getvariableDeclarator_Tail()
   * @model containment="true"
   * @generated
   */
  declarationTail getTail();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(declarationTail value);

} // variableDeclarator
