/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getBlock <em>Block</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getCatch <em>Catch</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getTryStatement_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

  /**
   * Returns the value of the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally</em>' containment reference.
   * @see #setFinally(finallyBlock)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getTryStatement_Finally()
   * @model containment="true"
   * @generated
   */
  finallyBlock getFinally();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.TryStatement#getFinally <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally</em>' containment reference.
   * @see #getFinally()
   * @generated
   */
  void setFinally(finallyBlock value);

  /**
   * Returns the value of the '<em><b>Catch</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.catchBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getTryStatement_Catch()
   * @model containment="true"
   * @generated
   */
  EList<catchBlock> getCatch();

} // TryStatement
