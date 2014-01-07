/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getMethodmodifiers <em>Methodmodifiers</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getParams <em>Params</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getOptbody <em>Optbody</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmethodDeclaration()
 * @model
 * @generated
 */
public interface methodDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Methodmodifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodmodifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodmodifiers</em>' containment reference.
   * @see #setMethodmodifiers(modifiers)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmethodDeclaration_Methodmodifiers()
   * @model containment="true"
   * @generated
   */
  modifiers getMethodmodifiers();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getMethodmodifiers <em>Methodmodifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodmodifiers</em>' containment reference.
   * @see #getMethodmodifiers()
   * @generated
   */
  void setMethodmodifiers(modifiers value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmethodDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmethodDeclaration_Params()
   * @model containment="true"
   * @generated
   */
  parameters getParams();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(parameters value);

  /**
   * Returns the value of the '<em><b>Optbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optbody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optbody</em>' containment reference.
   * @see #setOptbody(optBody)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getmethodDeclaration_Optbody()
   * @model containment="true"
   * @generated
   */
  optBody getOptbody();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.methodDeclaration#getOptbody <em>Optbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optbody</em>' containment reference.
   * @see #getOptbody()
   * @generated
   */
  void setOptbody(optBody value);

} // methodDeclaration
