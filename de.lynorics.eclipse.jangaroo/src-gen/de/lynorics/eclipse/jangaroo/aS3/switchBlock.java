/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>switch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock#getCase <em>Case</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getswitchBlock()
 * @model
 * @generated
 */
public interface switchBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.CaseStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getswitchBlock_Case()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatement> getCase();

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(DefaultStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getswitchBlock_Def()
   * @model containment="true"
   * @generated
   */
  DefaultStatement getDef();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.switchBlock#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(DefaultStatement value);

} // switchBlock
