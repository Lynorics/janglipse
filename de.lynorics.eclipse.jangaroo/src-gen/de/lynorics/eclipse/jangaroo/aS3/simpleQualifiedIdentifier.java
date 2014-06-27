/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getProId <em>Pro Id</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getQual <em>Qual</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getPiden <em>Piden</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getBra <em>Bra</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getsimpleQualifiedIdentifier()
 * @model
 * @generated
 */
public interface simpleQualifiedIdentifier extends nonAttributeQualifiedIdentifier
{
  /**
   * Returns the value of the '<em><b>Pro Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pro Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pro Id</em>' containment reference.
   * @see #setProId(propertyIdentifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getsimpleQualifiedIdentifier_ProId()
   * @model containment="true"
   * @generated
   */
  propertyIdentifier getProId();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getProId <em>Pro Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pro Id</em>' containment reference.
   * @see #getProId()
   * @generated
   */
  void setProId(propertyIdentifier value);

  /**
   * Returns the value of the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual</em>' containment reference.
   * @see #setQual(qualifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getsimpleQualifiedIdentifier_Qual()
   * @model containment="true"
   * @generated
   */
  qualifier getQual();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getQual <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual</em>' containment reference.
   * @see #getQual()
   * @generated
   */
  void setQual(qualifier value);

  /**
   * Returns the value of the '<em><b>Piden</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Piden</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Piden</em>' containment reference.
   * @see #setPiden(propertyIdentifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getsimpleQualifiedIdentifier_Piden()
   * @model containment="true"
   * @generated
   */
  propertyIdentifier getPiden();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getPiden <em>Piden</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Piden</em>' containment reference.
   * @see #getPiden()
   * @generated
   */
  void setPiden(propertyIdentifier value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getsimpleQualifiedIdentifier_Bra()
   * @model containment="true"
   * @generated
   */
  brackets getBra();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier#getBra <em>Bra</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bra</em>' containment reference.
   * @see #getBra()
   * @generated
   */
  void setBra(brackets value);

} // simpleQualifiedIdentifier
