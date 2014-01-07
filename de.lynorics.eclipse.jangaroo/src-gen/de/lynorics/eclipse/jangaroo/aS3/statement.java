/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.statement#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.statement#getName <em>Name</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.statement#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.statement#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.statement#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement()
 * @model
 * @generated
 */
public interface statement extends labelableStatement, statementInSwitch
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(EObject)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement_Expr()
   * @model containment="true"
   * @generated
   */
  EObject getExpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(EObject value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(labelableStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement_Statement()
   * @model containment="true"
   * @generated
   */
  labelableStatement getStatement();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(labelableStatement value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(variableDeclaration)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement_Variables()
   * @model containment="true"
   * @generated
   */
  variableDeclaration getVariables();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(variableDeclaration value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(arguments)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getstatement_Argument()
   * @model containment="true"
   * @generated
   */
  arguments getArgument();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.statement#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(arguments value);

} // statement
