/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getAnnon <em>Annon</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getTypes <em>Types</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Class#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
{
  /**
   * Returns the value of the '<em><b>Annon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annon</em>' containment reference.
   * @see #setAnnon(Annotation)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_Annon()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnon();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getAnnon <em>Annon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annon</em>' containment reference.
   * @see #getAnnon()
   * @generated
   */
  void setAnnon(Annotation value);

  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference.
   * @see #setModifier(Modifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_Modifier()
   * @model containment="true"
   * @generated
   */
  Modifier getModifier();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(Modifier value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Class)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_SuperType()
   * @model
   * @generated
   */
  Class getSuperType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Class#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Class value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_Types()
   * @model
   * @generated
   */
  EList<Interface> getTypes();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Class
