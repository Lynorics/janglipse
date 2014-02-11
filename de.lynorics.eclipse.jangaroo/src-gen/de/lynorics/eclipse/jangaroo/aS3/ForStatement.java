/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForIn <em>For In</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getFsstate <em>Fsstate</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getTraditionalForClause <em>Traditional For Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>For In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For In</em>' containment reference.
   * @see #setForIn(forInClause)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_ForIn()
   * @model containment="true"
   * @generated
   */
  forInClause getForIn();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForIn <em>For In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For In</em>' containment reference.
   * @see #getForIn()
   * @generated
   */
  void setForIn(forInClause value);

  /**
   * Returns the value of the '<em><b>Fsstate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fsstate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fsstate</em>' containment reference.
   * @see #setFsstate(Statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Fsstate()
   * @model containment="true"
   * @generated
   */
  Statement getFsstate();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getFsstate <em>Fsstate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fsstate</em>' containment reference.
   * @see #getFsstate()
   * @generated
   */
  void setFsstate(Statement value);

  /**
   * Returns the value of the '<em><b>Traditional For Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traditional For Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traditional For Clause</em>' containment reference.
   * @see #setTraditionalForClause(traditionalForClause)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_TraditionalForClause()
   * @model containment="true"
   * @generated
   */
  traditionalForClause getTraditionalForClause();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getTraditionalForClause <em>Traditional For Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traditional For Clause</em>' containment reference.
   * @see #getTraditionalForClause()
   * @generated
   */
  void setTraditionalForClause(traditionalForClause value);

} // ForStatement
