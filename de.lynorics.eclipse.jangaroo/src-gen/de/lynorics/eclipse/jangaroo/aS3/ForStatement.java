/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinit <em>Forinit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getIterator <em>Iterator</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getElements <em>Elements</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForin <em>Name Forin</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinexpr <em>Forinexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForcommand <em>Forcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForeachh <em>Name Foreachh</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachexpr <em>Foreachexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachcommand <em>Foreachcommand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forinit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forinit</em>' containment reference.
   * @see #setForinit(commaExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Forinit()
   * @model containment="true"
   * @generated
   */
  commaExpr getForinit();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinit <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinit</em>' containment reference.
   * @see #getForinit()
   * @generated
   */
  void setForinit(commaExpr value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(commaExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Condition()
   * @model containment="true"
   * @generated
   */
  commaExpr getCondition();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(commaExpr value);

  /**
   * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator</em>' containment reference.
   * @see #setIterator(commaExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Iterator()
   * @model containment="true"
   * @generated
   */
  commaExpr getIterator();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(commaExpr value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(StatementsBlock)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Command()
   * @model containment="true"
   * @generated
   */
  StatementsBlock getCommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(StatementsBlock value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Elements()
   * @model containment="true"
   * @generated
   */
  EList<identifierDeclaration> getElements();

  /**
   * Returns the value of the '<em><b>Name Forin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Forin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Forin</em>' attribute.
   * @see #setNameForin(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_NameForin()
   * @model
   * @generated
   */
  String getNameForin();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForin <em>Name Forin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Forin</em>' attribute.
   * @see #getNameForin()
   * @generated
   */
  void setNameForin(String value);

  /**
   * Returns the value of the '<em><b>Forinexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forinexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forinexpr</em>' containment reference.
   * @see #setForinexpr(Expression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Forinexpr()
   * @model containment="true"
   * @generated
   */
  Expression getForinexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForinexpr <em>Forinexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinexpr</em>' containment reference.
   * @see #getForinexpr()
   * @generated
   */
  void setForinexpr(Expression value);

  /**
   * Returns the value of the '<em><b>Forcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forcommand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forcommand</em>' containment reference.
   * @see #setForcommand(StatementsBlock)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Forcommand()
   * @model containment="true"
   * @generated
   */
  StatementsBlock getForcommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForcommand <em>Forcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forcommand</em>' containment reference.
   * @see #getForcommand()
   * @generated
   */
  void setForcommand(StatementsBlock value);

  /**
   * Returns the value of the '<em><b>Name Foreachh</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Foreachh</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Foreachh</em>' attribute.
   * @see #setNameForeachh(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_NameForeachh()
   * @model
   * @generated
   */
  String getNameForeachh();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getNameForeachh <em>Name Foreachh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Foreachh</em>' attribute.
   * @see #getNameForeachh()
   * @generated
   */
  void setNameForeachh(String value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference.
   * @see #setRelation(typeRelation)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Relation()
   * @model containment="true"
   * @generated
   */
  typeRelation getRelation();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getRelation <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' containment reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(typeRelation value);

  /**
   * Returns the value of the '<em><b>Foreachexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreachexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreachexpr</em>' containment reference.
   * @see #setForeachexpr(Expression)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Foreachexpr()
   * @model containment="true"
   * @generated
   */
  Expression getForeachexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachexpr <em>Foreachexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreachexpr</em>' containment reference.
   * @see #getForeachexpr()
   * @generated
   */
  void setForeachexpr(Expression value);

  /**
   * Returns the value of the '<em><b>Foreachcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreachcommand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreachcommand</em>' containment reference.
   * @see #setForeachcommand(StatementsBlock)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getForStatement_Foreachcommand()
   * @model containment="true"
   * @generated
   */
  StatementsBlock getForeachcommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.ForStatement#getForeachcommand <em>Foreachcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreachcommand</em>' containment reference.
   * @see #getForeachcommand()
   * @generated
   */
  void setForeachcommand(StatementsBlock value);

} // ForStatement
