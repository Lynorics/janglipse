/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for Iter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.forIter#getFiexpr <em>Fiexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforIter()
 * @model
 * @generated
 */
public interface forIter extends EObject
{
  /**
   * Returns the value of the '<em><b>Fiexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fiexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fiexpr</em>' containment reference.
   * @see #setFiexpr(expressionList)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforIter_Fiexpr()
   * @model containment="true"
   * @generated
   */
  expressionList getFiexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.forIter#getFiexpr <em>Fiexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fiexpr</em>' containment reference.
   * @see #getFiexpr()
   * @generated
   */
  void setFiexpr(expressionList value);

} // forIter
