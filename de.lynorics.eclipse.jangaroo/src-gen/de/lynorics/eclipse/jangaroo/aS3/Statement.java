/**
 */
package de.lynorics.eclipse.jangaroo.aS3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSb <em>Sb</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSds <em>Sds</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSes <em>Ses</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSis <em>Sis</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSfes <em>Sfes</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSfs <em>Sfs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSws <em>Sws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSdws <em>Sdws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getWs <em>Ws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSss <em>Sss</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSbs <em>Sbs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getScs <em>Scs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSrs <em>Srs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSts <em>Sts</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getTs <em>Ts</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSdxns <em>Sdxns</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert <em>Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement()
 * @model
 * @generated
 */
public interface Statement extends blockEntry
{
  /**
   * Returns the value of the '<em><b>Sb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sb</em>' containment reference.
   * @see #setSb(block)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sb()
   * @model containment="true"
   * @generated
   */
  block getSb();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSb <em>Sb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sb</em>' containment reference.
   * @see #getSb()
   * @generated
   */
  void setSb(block value);

  /**
   * Returns the value of the '<em><b>Sds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sds</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sds</em>' containment reference.
   * @see #setSds(DeclarationStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sds()
   * @model containment="true"
   * @generated
   */
  DeclarationStatement getSds();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSds <em>Sds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sds</em>' containment reference.
   * @see #getSds()
   * @generated
   */
  void setSds(DeclarationStatement value);

  /**
   * Returns the value of the '<em><b>Ses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ses</em>' containment reference.
   * @see #setSes(ExpressionStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Ses()
   * @model containment="true"
   * @generated
   */
  ExpressionStatement getSes();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSes <em>Ses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ses</em>' containment reference.
   * @see #getSes()
   * @generated
   */
  void setSes(ExpressionStatement value);

  /**
   * Returns the value of the '<em><b>Sis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sis</em>' containment reference.
   * @see #setSis(IfStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sis()
   * @model containment="true"
   * @generated
   */
  IfStatement getSis();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSis <em>Sis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sis</em>' containment reference.
   * @see #getSis()
   * @generated
   */
  void setSis(IfStatement value);

  /**
   * Returns the value of the '<em><b>Sfes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sfes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sfes</em>' containment reference.
   * @see #setSfes(ForEachStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sfes()
   * @model containment="true"
   * @generated
   */
  ForEachStatement getSfes();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSfes <em>Sfes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sfes</em>' containment reference.
   * @see #getSfes()
   * @generated
   */
  void setSfes(ForEachStatement value);

  /**
   * Returns the value of the '<em><b>Sfs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sfs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sfs</em>' containment reference.
   * @see #setSfs(ForStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sfs()
   * @model containment="true"
   * @generated
   */
  ForStatement getSfs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSfs <em>Sfs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sfs</em>' containment reference.
   * @see #getSfs()
   * @generated
   */
  void setSfs(ForStatement value);

  /**
   * Returns the value of the '<em><b>Sws</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sws</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sws</em>' containment reference.
   * @see #setSws(WhileStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sws()
   * @model containment="true"
   * @generated
   */
  WhileStatement getSws();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSws <em>Sws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sws</em>' containment reference.
   * @see #getSws()
   * @generated
   */
  void setSws(WhileStatement value);

  /**
   * Returns the value of the '<em><b>Sdws</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sdws</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sdws</em>' containment reference.
   * @see #setSdws(DoWhileStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sdws()
   * @model containment="true"
   * @generated
   */
  DoWhileStatement getSdws();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSdws <em>Sdws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sdws</em>' containment reference.
   * @see #getSdws()
   * @generated
   */
  void setSdws(DoWhileStatement value);

  /**
   * Returns the value of the '<em><b>Ws</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ws</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ws</em>' containment reference.
   * @see #setWs(WithStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Ws()
   * @model containment="true"
   * @generated
   */
  WithStatement getWs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getWs <em>Ws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ws</em>' containment reference.
   * @see #getWs()
   * @generated
   */
  void setWs(WithStatement value);

  /**
   * Returns the value of the '<em><b>Sss</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sss</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sss</em>' containment reference.
   * @see #setSss(SwitchStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sss()
   * @model containment="true"
   * @generated
   */
  SwitchStatement getSss();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSss <em>Sss</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sss</em>' containment reference.
   * @see #getSss()
   * @generated
   */
  void setSss(SwitchStatement value);

  /**
   * Returns the value of the '<em><b>Sbs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sbs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sbs</em>' attribute.
   * @see #setSbs(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sbs()
   * @model
   * @generated
   */
  String getSbs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSbs <em>Sbs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sbs</em>' attribute.
   * @see #getSbs()
   * @generated
   */
  void setSbs(String value);

  /**
   * Returns the value of the '<em><b>Scs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scs</em>' attribute.
   * @see #setScs(String)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Scs()
   * @model
   * @generated
   */
  String getScs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getScs <em>Scs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scs</em>' attribute.
   * @see #getScs()
   * @generated
   */
  void setScs(String value);

  /**
   * Returns the value of the '<em><b>Srs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Srs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Srs</em>' containment reference.
   * @see #setSrs(ReturnStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Srs()
   * @model containment="true"
   * @generated
   */
  ReturnStatement getSrs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSrs <em>Srs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Srs</em>' containment reference.
   * @see #getSrs()
   * @generated
   */
  void setSrs(ReturnStatement value);

  /**
   * Returns the value of the '<em><b>Sts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sts</em>' containment reference.
   * @see #setSts(ThrowStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sts()
   * @model containment="true"
   * @generated
   */
  ThrowStatement getSts();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSts <em>Sts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sts</em>' containment reference.
   * @see #getSts()
   * @generated
   */
  void setSts(ThrowStatement value);

  /**
   * Returns the value of the '<em><b>Ts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ts</em>' containment reference.
   * @see #setTs(TryStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Ts()
   * @model containment="true"
   * @generated
   */
  TryStatement getTs();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getTs <em>Ts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ts</em>' containment reference.
   * @see #getTs()
   * @generated
   */
  void setTs(TryStatement value);

  /**
   * Returns the value of the '<em><b>Sdxns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sdxns</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sdxns</em>' containment reference.
   * @see #setSdxns(DefaultXMLNamespaceStatement)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Sdxns()
   * @model containment="true"
   * @generated
   */
  DefaultXMLNamespaceStatement getSdxns();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getSdxns <em>Sdxns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sdxns</em>' containment reference.
   * @see #getSdxns()
   * @generated
   */
  void setSdxns(DefaultXMLNamespaceStatement value);

  /**
   * Returns the value of the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' containment reference.
   * @see #setAssert(Condition)
   * @see de.lynorics.eclipse.jangaroo.aS3.AS3Package#getStatement_Assert()
   * @model containment="true"
   * @generated
   */
  Condition getAssert();

  /**
   * Sets the value of the '{@link de.lynorics.eclipse.jangaroo.aS3.Statement#getAssert <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' containment reference.
   * @see #getAssert()
   * @generated
   */
  void setAssert(Condition value);

} // Statement
