/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>traditional For Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getA <em>A</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getB <em>B</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettraditionalForClause()
 * @model
 * @generated
 */
public interface traditionalForClause extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(forInit)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettraditionalForClause_A()
   * @model containment="true"
   * @generated
   */
  forInit getA();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(forInit value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(forCond)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettraditionalForClause_B()
   * @model containment="true"
   * @generated
   */
  forCond getB();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(forCond value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(forIter)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#gettraditionalForClause_C()
   * @model containment="true"
   * @generated
   */
  forIter getC();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.traditionalForClause#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(forIter value);

} // traditionalForClause
