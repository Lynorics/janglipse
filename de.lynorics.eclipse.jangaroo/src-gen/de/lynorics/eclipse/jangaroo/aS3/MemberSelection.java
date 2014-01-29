/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getMember <em>Member</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMemberSelection()
 * @model
 * @generated
 */
public interface MemberSelection extends Expression
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(Expression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMemberSelection_Receiver()
   * @model containment="true"
   * @generated
   */
  Expression getReceiver();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(Expression value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(Member)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMemberSelection_Member()
   * @model
   * @generated
   */
  Member getMember();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(Member value);

  /**
   * Returns the value of the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodinvocation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodinvocation</em>' attribute.
   * @see #setMethodinvocation(boolean)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMemberSelection_Methodinvocation()
   * @model
   * @generated
   */
  boolean isMethodinvocation();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.MemberSelection#isMethodinvocation <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodinvocation</em>' attribute.
   * @see #isMethodinvocation()
   * @generated
   */
  void setMethodinvocation(boolean value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getMemberSelection_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // MemberSelection
