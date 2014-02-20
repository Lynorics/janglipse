/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>prop Or Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent#getPropId <em>Prop Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpropOrIdent()
 * @model
 * @generated
 */
public interface propOrIdent extends EObject
{
  /**
   * Returns the value of the '<em><b>Prop Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Id</em>' containment reference.
   * @see #setPropId(qualifiedIdent)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getpropOrIdent_PropId()
   * @model containment="true"
   * @generated
   */
  qualifiedIdent getPropId();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.propOrIdent#getPropId <em>Prop Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Id</em>' containment reference.
   * @see #getPropId()
   * @generated
   */
  void setPropId(qualifiedIdent value);

} // propOrIdent
