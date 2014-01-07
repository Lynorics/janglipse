/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getMod <em>Mod</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getVar <em>Var</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldDeclaration()
 * @model
 * @generated
 */
public interface fieldDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(modifiers)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldDeclaration_Mod()
   * @model containment="true"
   * @generated
   */
  modifiers getMod();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(modifiers value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldDeclaration_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfieldDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<identifierDeclaration> getElements();

} // fieldDeclaration
