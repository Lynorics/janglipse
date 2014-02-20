/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>basic Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbasicParameterDeclaration()
 * @model
 * @generated
 */
public interface basicParameterDeclaration extends parameterDeclaration
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(typeExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbasicParameterDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  typeExpression getType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(typeExpression value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(parameterDefault)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getbasicParameterDeclaration_Param()
   * @model containment="true"
   * @generated
   */
  parameterDefault getParam();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(parameterDefault value);

} // basicParameterDeclaration
