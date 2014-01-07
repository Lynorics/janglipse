/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getDeleteexpr <em>Deleteexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsleftepxr <em>Isleftepxr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsrightexpr <em>Isrightexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPrefixexpr <em>Prefixexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPostfixexpr <em>Postfixexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprleft <em>Infixexprleft</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprright <em>Infixexprright</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getArgs <em>Args</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getThen <em>Then</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.expr#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr()
 * @model
 * @generated
 */
public interface expr extends annotationField, exprOrObjectLiteral, statementInSwitch
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
   * @see #setExpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Expr()
   * @model containment="true"
   * @generated
   */
  expr getExpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expr value);

  /**
   * Returns the value of the '<em><b>Deleteexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deleteexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deleteexpr</em>' containment reference.
   * @see #setDeleteexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Deleteexpr()
   * @model containment="true"
   * @generated
   */
  expr getDeleteexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getDeleteexpr <em>Deleteexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deleteexpr</em>' containment reference.
   * @see #getDeleteexpr()
   * @generated
   */
  void setDeleteexpr(expr value);

  /**
   * Returns the value of the '<em><b>Typeexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeexpr</em>' containment reference.
   * @see #setTypeexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Typeexpr()
   * @model containment="true"
   * @generated
   */
  expr getTypeexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getTypeexpr <em>Typeexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeexpr</em>' containment reference.
   * @see #getTypeexpr()
   * @generated
   */
  void setTypeexpr(expr value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Isleftepxr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isleftepxr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isleftepxr</em>' containment reference.
   * @see #setIsleftepxr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Isleftepxr()
   * @model containment="true"
   * @generated
   */
  expr getIsleftepxr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsleftepxr <em>Isleftepxr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isleftepxr</em>' containment reference.
   * @see #getIsleftepxr()
   * @generated
   */
  void setIsleftepxr(expr value);

  /**
   * Returns the value of the '<em><b>Isrightexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isrightexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isrightexpr</em>' containment reference.
   * @see #setIsrightexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Isrightexpr()
   * @model containment="true"
   * @generated
   */
  expr getIsrightexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getIsrightexpr <em>Isrightexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isrightexpr</em>' containment reference.
   * @see #getIsrightexpr()
   * @generated
   */
  void setIsrightexpr(expr value);

  /**
   * Returns the value of the '<em><b>Prefixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefixexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefixexpr</em>' containment reference.
   * @see #setPrefixexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Prefixexpr()
   * @model containment="true"
   * @generated
   */
  expr getPrefixexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPrefixexpr <em>Prefixexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefixexpr</em>' containment reference.
   * @see #getPrefixexpr()
   * @generated
   */
  void setPrefixexpr(expr value);

  /**
   * Returns the value of the '<em><b>Postfixexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postfixexpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postfixexpr</em>' containment reference.
   * @see #setPostfixexpr(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Postfixexpr()
   * @model containment="true"
   * @generated
   */
  expr getPostfixexpr();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getPostfixexpr <em>Postfixexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postfixexpr</em>' containment reference.
   * @see #getPostfixexpr()
   * @generated
   */
  void setPostfixexpr(expr value);

  /**
   * Returns the value of the '<em><b>Infixexprleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infixexprleft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infixexprleft</em>' containment reference.
   * @see #setInfixexprleft(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Infixexprleft()
   * @model containment="true"
   * @generated
   */
  expr getInfixexprleft();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprleft <em>Infixexprleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infixexprleft</em>' containment reference.
   * @see #getInfixexprleft()
   * @generated
   */
  void setInfixexprleft(expr value);

  /**
   * Returns the value of the '<em><b>Infixexprright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infixexprright</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infixexprright</em>' containment reference.
   * @see #setInfixexprright(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Infixexprright()
   * @model containment="true"
   * @generated
   */
  expr getInfixexprright();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getInfixexprright <em>Infixexprright</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infixexprright</em>' containment reference.
   * @see #getInfixexprright()
   * @generated
   */
  void setInfixexprright(expr value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(arguments)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Args()
   * @model containment="true"
   * @generated
   */
  arguments getArgs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(arguments value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(expr)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Condition()
   * @model containment="true"
   * @generated
   */
  expr getCondition();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(expr value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(exprOrObjectLiteral)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Then()
   * @model containment="true"
   * @generated
   */
  exprOrObjectLiteral getThen();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(exprOrObjectLiteral value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(exprOrObjectLiteral)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getexpr_Else()
   * @model containment="true"
   * @generated
   */
  exprOrObjectLiteral getElse();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.expr#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(exprOrObjectLiteral value);

} // expr
