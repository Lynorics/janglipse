/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getField <em>Field</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmemberDeclaration()
 * @model
 * @generated
 */
public interface memberDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(fieldDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmemberDeclaration_Field()
   * @model containment="true"
   * @generated
   */
  fieldDeclaration getField();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(fieldDeclaration value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(methodDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmemberDeclaration_Method()
   * @model containment="true"
   * @generated
   */
  methodDeclaration getMethod();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.memberDeclaration#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(methodDeclaration value);

} // memberDeclaration
