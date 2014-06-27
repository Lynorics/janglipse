/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getSuperExpr <em>Super Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getCon <em>Con</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getLit <em>Lit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getFexpr <em>Fexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getNexpr <em>Nexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getEncexpr <em>Encexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getE4x <em>E4x</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getQual <em>Qual</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression()
 * @model
 * @generated
 */
public interface primaryExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Expr</em>' containment reference.
   * @see #setSuperExpr(Expression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_SuperExpr()
   * @model containment="true"
   * @generated
   */
  Expression getSuperExpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getSuperExpr <em>Super Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Expr</em>' containment reference.
   * @see #getSuperExpr()
   * @generated
   */
  void setSuperExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Con</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Con</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con</em>' containment reference.
   * @see #setCon(Expression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Con()
   * @model containment="true"
   * @generated
   */
  Expression getCon();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getCon <em>Con</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Con</em>' containment reference.
   * @see #getCon()
   * @generated
   */
  void setCon(Expression value);

  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference.
   * @see #setLit(EObject)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Lit()
   * @model containment="true"
   * @generated
   */
  EObject getLit();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getLit <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lit</em>' containment reference.
   * @see #getLit()
   * @generated
   */
  void setLit(EObject value);

  /**
   * Returns the value of the '<em><b>Fexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fexpr</em>' containment reference.
   * @see #setFexpr(functionExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Fexpr()
   * @model containment="true"
   * @generated
   */
  functionExpression getFexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getFexpr <em>Fexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fexpr</em>' containment reference.
   * @see #getFexpr()
   * @generated
   */
  void setFexpr(functionExpression value);

  /**
   * Returns the value of the '<em><b>Nexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nexpr</em>' containment reference.
   * @see #setNexpr(newExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Nexpr()
   * @model containment="true"
   * @generated
   */
  newExpression getNexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getNexpr <em>Nexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nexpr</em>' containment reference.
   * @see #getNexpr()
   * @generated
   */
  void setNexpr(newExpression value);

  /**
   * Returns the value of the '<em><b>Encexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Encexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encexpr</em>' containment reference.
   * @see #setEncexpr(encapsulatedExpression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Encexpr()
   * @model containment="true"
   * @generated
   */
  encapsulatedExpression getEncexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getEncexpr <em>Encexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encexpr</em>' containment reference.
   * @see #getEncexpr()
   * @generated
   */
  void setEncexpr(encapsulatedExpression value);

  /**
   * Returns the value of the '<em><b>E4x</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E4x</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E4x</em>' containment reference.
   * @see #setE4x(e4xAttributeIdentifier)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_E4x()
   * @model containment="true"
   * @generated
   */
  e4xAttributeIdentifier getE4x();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getE4x <em>E4x</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E4x</em>' containment reference.
   * @see #getE4x()
   * @generated
   */
  void setE4x(e4xAttributeIdentifier value);

  /**
   * Returns the value of the '<em><b>Qual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual</em>' containment reference.
   * @see #setQual(qualifiedIdent)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getprimaryExpression_Qual()
   * @model containment="true"
   * @generated
   */
  qualifiedIdent getQual();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.primaryExpression#getQual <em>Qual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual</em>' containment reference.
   * @see #getQual()
   * @generated
   */
  void setQual(qualifiedIdent value);

} // primaryExpression
