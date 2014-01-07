/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compilation Unit Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getClass_ <em>Class</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnitDeclaration()
 * @model
 * @generated
 */
public interface compilationUnitDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(classDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnitDeclaration_Class()
   * @model containment="true"
   * @generated
   */
  classDeclaration getClass_();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(classDeclaration value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference.
   * @see #setMember(memberDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getcompilationUnitDeclaration_Member()
   * @model containment="true"
   * @generated
   */
  memberDeclaration getMember();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration#getMember <em>Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' containment reference.
   * @see #getMember()
   * @generated
   */
  void setMember(memberDeclaration value);

} // compilationUnitDeclaration
