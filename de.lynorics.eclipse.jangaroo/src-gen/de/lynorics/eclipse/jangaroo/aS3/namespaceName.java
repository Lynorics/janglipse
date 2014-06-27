/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>namespace Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.namespaceName#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamespaceName()
 * @model
 * @generated
 */
public interface namespaceName extends qualifiedIdent
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see #setLevel(AccessLevel)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getnamespaceName_Level()
   * @model
   * @generated
   */
  AccessLevel getLevel();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.namespaceName#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(AccessLevel value);

} // namespaceName
