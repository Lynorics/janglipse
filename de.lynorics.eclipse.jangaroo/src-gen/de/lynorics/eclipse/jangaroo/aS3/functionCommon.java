/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getSig <em>Sig</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionCommon()
 * @model
 * @generated
 */
public interface functionCommon extends EObject
{
  /**
   * Returns the value of the '<em><b>Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig</em>' containment reference.
   * @see #setSig(functionSignature)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionCommon_Sig()
   * @model containment="true"
   * @generated
   */
  functionSignature getSig();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getSig <em>Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig</em>' containment reference.
   * @see #getSig()
   * @generated
   */
  void setSig(functionSignature value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getfunctionCommon_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.functionCommon#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // functionCommon
