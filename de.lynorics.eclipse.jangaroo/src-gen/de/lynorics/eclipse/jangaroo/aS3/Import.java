/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Import#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' containment reference.
   * @see #setImportURI(PackageDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getImport_ImportURI()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getImportURI();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Import#getImportURI <em>Import URI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' containment reference.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(PackageDeclaration value);

} // Import
