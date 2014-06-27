/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getDecl <em>Decl</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInit()
 * @model
 * @generated
 */
public interface forInit extends EObject
{
  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Declaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInit_Decl()
   * @model containment="true"
   * @generated
   */
  Declaration getDecl();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Declaration value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(expressionList)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getforInit_Expr()
   * @model containment="true"
   * @generated
   */
  expressionList getExpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.forInit#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expressionList value);

} // forInit
