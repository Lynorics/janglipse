/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.identifier#getQual <em>Qual</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.identifier#getPoi <em>Poi</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getidentifier()
 * @model
 * @generated
 */
public interface identifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual</em>' containment reference.
   * @see #setQual(qualifiedIdent)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getidentifier_Qual()
   * @model containment="true"
   * @generated
   */
  qualifiedIdent getQual();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.identifier#getQual <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual</em>' containment reference.
   * @see #getQual()
   * @generated
   */
  void setQual(qualifiedIdent value);

  /**
   * Returns the value of the '<em><b>Poi</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poi</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poi</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getidentifier_Poi()
   * @model containment="true"
   * @generated
   */
  EList<propOrIdent> getPoi();

} // identifier
