/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getClassModifiers <em>Class Modifiers</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getTypes <em>Types</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration()
 * @model
 * @generated
 */
public interface classDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Modifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Modifiers</em>' containment reference.
   * @see #setClassModifiers(modifiers)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration_ClassModifiers()
   * @model containment="true"
   * @generated
   */
  modifiers getClassModifiers();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getClassModifiers <em>Class Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Modifiers</em>' containment reference.
   * @see #getClassModifiers()
   * @generated
   */
  void setClassModifiers(modifiers value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getName <em>Name</em>}' attribute.
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
   * @see #setSuperType(classDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration_SuperType()
   * @model
   * @generated
   */
  classDeclaration getSuperType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(classDeclaration value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration_Types()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypes();

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(classBody)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getclassDeclaration_Command()
   * @model containment="true"
   * @generated
   */
  classBody getCommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.classDeclaration#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(classBody value);

} // classDeclaration
