/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getParam <em>Param</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionSignature()
 * @model
 * @generated
 */
public interface functionSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(parameterDeclarationList)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionSignature_Param()
   * @model containment="true"
   * @generated
   */
  parameterDeclarationList getParam();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(parameterDeclarationList value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionSignature_Type()
   * @model containment="true"
   * @generated
   */
  typeExpression getType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.functionSignature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(typeExpression value);

} // functionSignature
