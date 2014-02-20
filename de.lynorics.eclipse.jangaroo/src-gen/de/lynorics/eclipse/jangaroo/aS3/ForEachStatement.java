/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFesfor <em>Fesfor</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFes <em>Fes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForEachStatement()
 * @model
 * @generated
 */
public interface ForEachStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Fesfor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fesfor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fesfor</em>' containment reference.
   * @see #setFesfor(forInClause)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForEachStatement_Fesfor()
   * @model containment="true"
   * @generated
   */
  forInClause getFesfor();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFesfor <em>Fesfor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fesfor</em>' containment reference.
   * @see #getFesfor()
   * @generated
   */
  void setFesfor(forInClause value);

  /**
   * Returns the value of the '<em><b>Fes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fes</em>' containment reference.
   * @see #setFes(Statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForEachStatement_Fes()
   * @model containment="true"
   * @generated
   */
  Statement getFes();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForEachStatement#getFes <em>Fes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fes</em>' containment reference.
   * @see #getFes()
   * @generated
   */
  void setFes(Statement value);

} // ForEachStatement
