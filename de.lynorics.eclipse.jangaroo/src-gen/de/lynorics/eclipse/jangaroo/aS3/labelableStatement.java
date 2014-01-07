/**
 */
package de.lynorics.eclipse.jangaroo.aS3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>labelable Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfcondition <em>Ifcondition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfelse <em>Ifelse</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getElements <em>Elements</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinit <em>Forinit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIterator <em>Iterator</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForin <em>Name Forin</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinexpr <em>Forinexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForcommand <em>Forcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForeachh <em>Name Foreachh</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachexpr <em>Foreachexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachcommand <em>Foreachcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCatch <em>Catch</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement()
 * @model
 * @generated
 */
public interface labelableStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifcondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifcondition</em>' containment reference.
   * @see #setIfcondition(parenthesizedExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Ifcondition()
   * @model containment="true"
   * @generated
   */
  parenthesizedExpr getIfcondition();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfcondition <em>Ifcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifcondition</em>' containment reference.
   * @see #getIfcondition()
   * @generated
   */
  void setIfcondition(parenthesizedExpr value);

  /**
   * Returns the value of the '<em><b>Ifthen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifthen</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifthen</em>' containment reference.
   * @see #setIfthen(statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Ifthen()
   * @model containment="true"
   * @generated
   */
  statement getIfthen();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfthen <em>Ifthen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifthen</em>' containment reference.
   * @see #getIfthen()
   * @generated
   */
  void setIfthen(statement value);

  /**
   * Returns the value of the '<em><b>Ifelse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifelse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifelse</em>' containment reference.
   * @see #setIfelse(statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Ifelse()
   * @model containment="true"
   * @generated
   */
  statement getIfelse();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIfelse <em>Ifelse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifelse</em>' containment reference.
   * @see #getIfelse()
   * @generated
   */
  void setIfelse(statement value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(EObject)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Condition()
   * @model containment="true"
   * @generated
   */
  EObject getCondition();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(EObject value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(EObject)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Command()
   * @model containment="true"
   * @generated
   */
  EObject getCommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(EObject value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Forinit()
   * @model containment="true"
   * @generated
   */
  commaExpr getForinit();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinit <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinit</em>' containment reference.
   * @see #getForinit()
   * @generated
   */
  void setForinit(commaExpr value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Iterator()
   * @model containment="true"
   * @generated
   */
  commaExpr getIterator();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(commaExpr value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_NameForin()
   * @model
   * @generated
   */
  String getNameForin();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForin <em>Name Forin</em>}' attribute.
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
   * @see #setForinexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Forinexpr()
   * @model containment="true"
   * @generated
   */
  expr getForinexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForinexpr <em>Forinexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinexpr</em>' containment reference.
   * @see #getForinexpr()
   * @generated
   */
  void setForinexpr(expr value);

  /**
   * Returns the value of the '<em><b>Forcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forcommand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forcommand</em>' containment reference.
   * @see #setForcommand(statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Forcommand()
   * @model containment="true"
   * @generated
   */
  statement getForcommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForcommand <em>Forcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forcommand</em>' containment reference.
   * @see #getForcommand()
   * @generated
   */
  void setForcommand(statement value);

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
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_NameForeachh()
   * @model
   * @generated
   */
  String getNameForeachh();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getNameForeachh <em>Name Foreachh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Foreachh</em>' attribute.
   * @see #getNameForeachh()
   * @generated
   */
  void setNameForeachh(String value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see #setRelation(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Relation()
   * @model
   * @generated
   */
  String getRelation();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see #getRelation()
   * @generated
   */
  void setRelation(String value);

  /**
   * Returns the value of the '<em><b>Foreachexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreachexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreachexpr</em>' containment reference.
   * @see #setForeachexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Foreachexpr()
   * @model containment="true"
   * @generated
   */
  expr getForeachexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachexpr <em>Foreachexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreachexpr</em>' containment reference.
   * @see #getForeachexpr()
   * @generated
   */
  void setForeachexpr(expr value);

  /**
   * Returns the value of the '<em><b>Foreachcommand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreachcommand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreachcommand</em>' containment reference.
   * @see #setForeachcommand(statement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Foreachcommand()
   * @model containment="true"
   * @generated
   */
  statement getForeachcommand();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getForeachcommand <em>Foreachcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreachcommand</em>' containment reference.
   * @see #getForeachcommand()
   * @generated
   */
  void setForeachcommand(statement value);

  /**
   * Returns the value of the '<em><b>Catch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch</em>' containment reference.
   * @see #setCatch(catches)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Catch()
   * @model containment="true"
   * @generated
   */
  catches getCatch();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getCatch <em>Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Catch</em>' containment reference.
   * @see #getCatch()
   * @generated
   */
  void setCatch(catches value);

  /**
   * Returns the value of the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally</em>' containment reference.
   * @see #setFinally(block)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Finally()
   * @model containment="true"
   * @generated
   */
  block getFinally();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFinally <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally</em>' containment reference.
   * @see #getFinally()
   * @generated
   */
  void setFinally(block value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(namedFunctionExpr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getlabelableStatement_Function()
   * @model containment="true"
   * @generated
   */
  namedFunctionExpr getFunction();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.labelableStatement#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(namedFunctionExpr value);

} // labelableStatement
