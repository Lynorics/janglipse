/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaration Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.declarationTail#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdeclarationTail()
 * @model
 * @generated
 */
public interface declarationTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.variableDeclarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdeclarationTail_Var()
   * @model containment="true"
   * @generated
   */
  EList<variableDeclarator> getVar();

} // declarationTail
