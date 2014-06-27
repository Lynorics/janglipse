/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for In Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFicdecl <em>Ficdecl</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFictail <em>Fictail</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInClause()
 * @model
 * @generated
 */
public interface forInClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Ficdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ficdecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ficdecl</em>' containment reference.
   * @see #setFicdecl(forInClauseDecl)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInClause_Ficdecl()
   * @model containment="true"
   * @generated
   */
  forInClauseDecl getFicdecl();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFicdecl <em>Ficdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ficdecl</em>' containment reference.
   * @see #getFicdecl()
   * @generated
   */
  void setFicdecl(forInClauseDecl value);

  /**
   * Returns the value of the '<em><b>Fictail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fictail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fictail</em>' containment reference.
   * @see #setFictail(forInClauseTail)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInClause_Fictail()
   * @model containment="true"
   * @generated
   */
  forInClauseTail getFictail();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.forInClause#getFictail <em>Fictail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fictail</em>' containment reference.
   * @see #getFictail()
   * @generated
   */
  void setFictail(forInClauseTail value);

} // forInClause
