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
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getId <em>Id</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getFields <em>Fields</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUseasid <em>Useasid</em>}</li>
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
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(annotationFields)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_Fields()
   * @model containment="true"
   * @generated
   */
  annotationFields getFields();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(annotationFields value);

  /**
   * Returns the value of the '<em><b>Useasid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Useasid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Useasid</em>' attribute.
   * @see #setUseasid(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getdirective_Useasid()
   * @model
   * @generated
   */
  String getUseasid();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.directive#getUseasid <em>Useasid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Useasid</em>' attribute.
   * @see #getUseasid()
   * @generated
   */
  void setUseasid(String value);

} // directive
