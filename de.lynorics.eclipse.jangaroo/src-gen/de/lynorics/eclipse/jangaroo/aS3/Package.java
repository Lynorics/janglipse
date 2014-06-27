/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Package#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Package#getImp <em>Imp</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Package#getDirectives <em>Directives</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Package#getMembers <em>Members</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imp</em>' containment reference.
   * @see #setImp(Imports)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage_Imp()
   * @model containment="true"
   * @generated
   */
  Imports getImp();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Package#getImp <em>Imp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imp</em>' containment reference.
   * @see #getImp()
   * @generated
   */
  void setImp(Imports value);

  /**
   * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directives</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage_Directives()
   * @model containment="true"
   * @generated
   */
  EList<directive> getDirectives();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage_Members()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getMembers();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getPackage_Classes()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getClasses();

} // Package
