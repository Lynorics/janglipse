/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Member#getVar <em>Var</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Member#getMeth <em>Meth</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VariableDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMember_Var()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVar();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Member#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Meth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meth</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meth</em>' containment reference.
   * @see #setMeth(Method)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMember_Meth()
   * @model containment="true"
   * @generated
   */
  Method getMeth();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Member#getMeth <em>Meth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meth</em>' containment reference.
   * @see #getMeth()
   * @generated
   */
  void setMeth(Method value);

} // Member
