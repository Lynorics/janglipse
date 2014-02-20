/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>qualified Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent#getIde <em>Ide</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getqualifiedIdent()
 * @model
 * @generated
 */
public interface qualifiedIdent extends EObject
{
  /**
   * Returns the value of the '<em><b>Ide</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ide</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ide</em>' containment reference.
   * @see #setIde(identi)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getqualifiedIdent_Ide()
   * @model containment="true"
   * @generated
   */
  identi getIde();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent#getIde <em>Ide</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ide</em>' containment reference.
   * @see #getIde()
   * @generated
   */
  void setIde(identi value);

} // qualifiedIdent
