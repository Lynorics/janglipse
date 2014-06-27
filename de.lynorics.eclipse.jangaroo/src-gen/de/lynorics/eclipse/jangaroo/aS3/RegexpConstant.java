/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regexp Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.RegexpConstant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getRegexpConstant()
 * @model
 * @generated
 */
public interface RegexpConstant extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(regexpLiteral)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getRegexpConstant_Value()
   * @model containment="true"
   * @generated
   */
  regexpLiteral getValue();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.RegexpConstant#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(regexpLiteral value);

} // RegexpConstant
