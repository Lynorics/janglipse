/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isStatic <em>Static</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isFinal <em>Final</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isNative <em>Native</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Native</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native</em>' attribute.
   * @see #setNative(boolean)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier_Native()
   * @model
   * @generated
   */
  boolean isNative();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isNative <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Native</em>' attribute.
   * @see #isNative()
   * @generated
   */
  void setNative(boolean value);

  /**
   * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic</em>' attribute.
   * @see #setDynamic(boolean)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier_Dynamic()
   * @model
   * @generated
   */
  boolean isDynamic();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#isDynamic <em>Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic</em>' attribute.
   * @see #isDynamic()
   * @generated
   */
  void setDynamic(boolean value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link de.lynorics.eclipse.jangaroo.aS3.AccessLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see #setAccess(AccessLevel)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getModifier_Access()
   * @model
   * @generated
   */
  AccessLevel getAccess();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Modifier#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see de.lynorics.eclipse.jangaroo.aS3.AccessLevel
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessLevel value);

} // Modifier
