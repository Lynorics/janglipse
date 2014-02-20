/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>encapsulated Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getPden <em>Pden</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getBra <em>Bra</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getencapsulatedExpression()
 * @model
 * @generated
 */
public interface encapsulatedExpression extends expressionQualifiedIdentifier
{
  /**
   * Returns the value of the '<em><b>Pden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pden</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pden</em>' containment reference.
   * @see #setPden(propertyIdentifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getencapsulatedExpression_Pden()
   * @model containment="true"
   * @generated
   */
  propertyIdentifier getPden();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getPden <em>Pden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pden</em>' containment reference.
   * @see #getPden()
   * @generated
   */
  void setPden(propertyIdentifier value);

  /**
   * Returns the value of the '<em><b>Bra</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bra</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bra</em>' containment reference.
   * @see #setBra(brackets)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getencapsulatedExpression_Bra()
   * @model containment="true"
   * @generated
   */
  brackets getBra();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.encapsulatedExpression#getBra <em>Bra</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bra</em>' containment reference.
   * @see #getBra()
   * @generated
   */
  void setBra(brackets value);

} // encapsulatedExpression
