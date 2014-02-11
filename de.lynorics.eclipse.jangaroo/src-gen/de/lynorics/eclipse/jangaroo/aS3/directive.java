/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getAnnonFields <em>Annon Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective()
 * @model
 * @generated
 */
public interface directive extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Annon Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annon Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annon Fields</em>' containment reference.
   * @see #setAnnonFields(annotationFields)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_AnnonFields()
   * @model containment="true"
   * @generated
   */
  annotationFields getAnnonFields();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getAnnonFields <em>Annon Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annon Fields</em>' containment reference.
   * @see #getAnnonFields()
   * @generated
   */
  void setAnnonFields(annotationFields value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference.
   * @see #setUses(Uses)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_Uses()
   * @model containment="true"
   * @generated
   */
  Uses getUses();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(Uses value);

} // directive
