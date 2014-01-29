/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.New#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.New#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getNew()
 * @model
 * @generated
 */
public interface New extends NewStatement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(de.lynorics.eclipse.jangaroo.aS3.Class)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getNew_Type()
   * @model
   * @generated
   */
  de.lynorics.eclipse.jangaroo.aS3.Class getType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.New#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(de.lynorics.eclipse.jangaroo.aS3.Class value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(Parameters)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getNew_Param()
   * @model containment="true"
   * @generated
   */
  Parameters getParam();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.New#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Parameters value);

} // New
