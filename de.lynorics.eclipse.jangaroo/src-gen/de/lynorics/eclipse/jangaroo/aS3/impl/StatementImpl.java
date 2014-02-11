/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Condition;
import de.lynorics.eclipse.jangaroo.aS3.DeclarationStatement;
import de.lynorics.eclipse.jangaroo.aS3.DefaultXMLNamespaceStatement;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.ExpressionStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForEachStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.ThrowStatement;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.WithStatement;
import de.lynorics.eclipse.jangaroo.aS3.block;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSb <em>Sb</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSds <em>Sds</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSes <em>Ses</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSis <em>Sis</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSfes <em>Sfes</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSfs <em>Sfs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSws <em>Sws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSdws <em>Sdws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getWs <em>Ws</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSss <em>Sss</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSbs <em>Sbs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getScs <em>Scs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSrs <em>Srs</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSts <em>Sts</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getTs <em>Ts</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getSdxns <em>Sdxns</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.StatementImpl#getAssert <em>Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends blockEntryImpl implements Statement
{
  /**
   * The cached value of the '{@link #getSb() <em>Sb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSb()
   * @generated
   * @ordered
   */
  protected block sb;

  /**
   * The cached value of the '{@link #getSds() <em>Sds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSds()
   * @generated
   * @ordered
   */
  protected DeclarationStatement sds;

  /**
   * The cached value of the '{@link #getSes() <em>Ses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSes()
   * @generated
   * @ordered
   */
  protected ExpressionStatement ses;

  /**
   * The cached value of the '{@link #getSis() <em>Sis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSis()
   * @generated
   * @ordered
   */
  protected IfStatement sis;

  /**
   * The cached value of the '{@link #getSfes() <em>Sfes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSfes()
   * @generated
   * @ordered
   */
  protected ForEachStatement sfes;

  /**
   * The cached value of the '{@link #getSfs() <em>Sfs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSfs()
   * @generated
   * @ordered
   */
  protected ForStatement sfs;

  /**
   * The cached value of the '{@link #getSws() <em>Sws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSws()
   * @generated
   * @ordered
   */
  protected WhileStatement sws;

  /**
   * The cached value of the '{@link #getSdws() <em>Sdws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSdws()
   * @generated
   * @ordered
   */
  protected DoWhileStatement sdws;

  /**
   * The cached value of the '{@link #getWs() <em>Ws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWs()
   * @generated
   * @ordered
   */
  protected WithStatement ws;

  /**
   * The cached value of the '{@link #getSss() <em>Sss</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSss()
   * @generated
   * @ordered
   */
  protected SwitchStatement sss;

  /**
   * The default value of the '{@link #getSbs() <em>Sbs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbs()
   * @generated
   * @ordered
   */
  protected static final String SBS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSbs() <em>Sbs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbs()
   * @generated
   * @ordered
   */
  protected String sbs = SBS_EDEFAULT;

  /**
   * The default value of the '{@link #getScs() <em>Scs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScs()
   * @generated
   * @ordered
   */
  protected static final String SCS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScs() <em>Scs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScs()
   * @generated
   * @ordered
   */
  protected String scs = SCS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSrs() <em>Srs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrs()
   * @generated
   * @ordered
   */
  protected ReturnStatement srs;

  /**
   * The cached value of the '{@link #getSts() <em>Sts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSts()
   * @generated
   * @ordered
   */
  protected ThrowStatement sts;

  /**
   * The cached value of the '{@link #getTs() <em>Ts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTs()
   * @generated
   * @ordered
   */
  protected TryStatement ts;

  /**
   * The cached value of the '{@link #getSdxns() <em>Sdxns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSdxns()
   * @generated
   * @ordered
   */
  protected DefaultXMLNamespaceStatement sdxns;

  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected Condition assert_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AS3Package.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getSb()
  {
    return sb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSb(block newSb, NotificationChain msgs)
  {
    block oldSb = sb;
    sb = newSb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SB, oldSb, newSb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSb(block newSb)
  {
    if (newSb != sb)
    {
      NotificationChain msgs = null;
      if (sb != null)
        msgs = ((InternalEObject)sb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SB, null, msgs);
      if (newSb != null)
        msgs = ((InternalEObject)newSb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SB, null, msgs);
      msgs = basicSetSb(newSb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SB, newSb, newSb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStatement getSds()
  {
    return sds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSds(DeclarationStatement newSds, NotificationChain msgs)
  {
    DeclarationStatement oldSds = sds;
    sds = newSds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDS, oldSds, newSds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSds(DeclarationStatement newSds)
  {
    if (newSds != sds)
    {
      NotificationChain msgs = null;
      if (sds != null)
        msgs = ((InternalEObject)sds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDS, null, msgs);
      if (newSds != null)
        msgs = ((InternalEObject)newSds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDS, null, msgs);
      msgs = basicSetSds(newSds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDS, newSds, newSds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStatement getSes()
  {
    return ses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSes(ExpressionStatement newSes, NotificationChain msgs)
  {
    ExpressionStatement oldSes = ses;
    ses = newSes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SES, oldSes, newSes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSes(ExpressionStatement newSes)
  {
    if (newSes != ses)
    {
      NotificationChain msgs = null;
      if (ses != null)
        msgs = ((InternalEObject)ses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SES, null, msgs);
      if (newSes != null)
        msgs = ((InternalEObject)newSes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SES, null, msgs);
      msgs = basicSetSes(newSes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SES, newSes, newSes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement getSis()
  {
    return sis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSis(IfStatement newSis, NotificationChain msgs)
  {
    IfStatement oldSis = sis;
    sis = newSis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SIS, oldSis, newSis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSis(IfStatement newSis)
  {
    if (newSis != sis)
    {
      NotificationChain msgs = null;
      if (sis != null)
        msgs = ((InternalEObject)sis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SIS, null, msgs);
      if (newSis != null)
        msgs = ((InternalEObject)newSis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SIS, null, msgs);
      msgs = basicSetSis(newSis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SIS, newSis, newSis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEachStatement getSfes()
  {
    return sfes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSfes(ForEachStatement newSfes, NotificationChain msgs)
  {
    ForEachStatement oldSfes = sfes;
    sfes = newSfes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SFES, oldSfes, newSfes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSfes(ForEachStatement newSfes)
  {
    if (newSfes != sfes)
    {
      NotificationChain msgs = null;
      if (sfes != null)
        msgs = ((InternalEObject)sfes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SFES, null, msgs);
      if (newSfes != null)
        msgs = ((InternalEObject)newSfes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SFES, null, msgs);
      msgs = basicSetSfes(newSfes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SFES, newSfes, newSfes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement getSfs()
  {
    return sfs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSfs(ForStatement newSfs, NotificationChain msgs)
  {
    ForStatement oldSfs = sfs;
    sfs = newSfs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SFS, oldSfs, newSfs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSfs(ForStatement newSfs)
  {
    if (newSfs != sfs)
    {
      NotificationChain msgs = null;
      if (sfs != null)
        msgs = ((InternalEObject)sfs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SFS, null, msgs);
      if (newSfs != null)
        msgs = ((InternalEObject)newSfs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SFS, null, msgs);
      msgs = basicSetSfs(newSfs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SFS, newSfs, newSfs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement getSws()
  {
    return sws;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSws(WhileStatement newSws, NotificationChain msgs)
  {
    WhileStatement oldSws = sws;
    sws = newSws;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SWS, oldSws, newSws);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSws(WhileStatement newSws)
  {
    if (newSws != sws)
    {
      NotificationChain msgs = null;
      if (sws != null)
        msgs = ((InternalEObject)sws).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SWS, null, msgs);
      if (newSws != null)
        msgs = ((InternalEObject)newSws).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SWS, null, msgs);
      msgs = basicSetSws(newSws, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SWS, newSws, newSws));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhileStatement getSdws()
  {
    return sdws;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSdws(DoWhileStatement newSdws, NotificationChain msgs)
  {
    DoWhileStatement oldSdws = sdws;
    sdws = newSdws;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDWS, oldSdws, newSdws);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSdws(DoWhileStatement newSdws)
  {
    if (newSdws != sdws)
    {
      NotificationChain msgs = null;
      if (sdws != null)
        msgs = ((InternalEObject)sdws).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDWS, null, msgs);
      if (newSdws != null)
        msgs = ((InternalEObject)newSdws).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDWS, null, msgs);
      msgs = basicSetSdws(newSdws, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDWS, newSdws, newSdws));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithStatement getWs()
  {
    return ws;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWs(WithStatement newWs, NotificationChain msgs)
  {
    WithStatement oldWs = ws;
    ws = newWs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__WS, oldWs, newWs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWs(WithStatement newWs)
  {
    if (newWs != ws)
    {
      NotificationChain msgs = null;
      if (ws != null)
        msgs = ((InternalEObject)ws).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__WS, null, msgs);
      if (newWs != null)
        msgs = ((InternalEObject)newWs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__WS, null, msgs);
      msgs = basicSetWs(newWs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__WS, newWs, newWs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement getSss()
  {
    return sss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSss(SwitchStatement newSss, NotificationChain msgs)
  {
    SwitchStatement oldSss = sss;
    sss = newSss;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SSS, oldSss, newSss);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSss(SwitchStatement newSss)
  {
    if (newSss != sss)
    {
      NotificationChain msgs = null;
      if (sss != null)
        msgs = ((InternalEObject)sss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SSS, null, msgs);
      if (newSss != null)
        msgs = ((InternalEObject)newSss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SSS, null, msgs);
      msgs = basicSetSss(newSss, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SSS, newSss, newSss));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSbs()
  {
    return sbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSbs(String newSbs)
  {
    String oldSbs = sbs;
    sbs = newSbs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SBS, oldSbs, sbs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScs()
  {
    return scs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScs(String newScs)
  {
    String oldScs = scs;
    scs = newScs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SCS, oldScs, scs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getSrs()
  {
    return srs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrs(ReturnStatement newSrs, NotificationChain msgs)
  {
    ReturnStatement oldSrs = srs;
    srs = newSrs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SRS, oldSrs, newSrs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrs(ReturnStatement newSrs)
  {
    if (newSrs != srs)
    {
      NotificationChain msgs = null;
      if (srs != null)
        msgs = ((InternalEObject)srs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SRS, null, msgs);
      if (newSrs != null)
        msgs = ((InternalEObject)newSrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SRS, null, msgs);
      msgs = basicSetSrs(newSrs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SRS, newSrs, newSrs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowStatement getSts()
  {
    return sts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSts(ThrowStatement newSts, NotificationChain msgs)
  {
    ThrowStatement oldSts = sts;
    sts = newSts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__STS, oldSts, newSts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSts(ThrowStatement newSts)
  {
    if (newSts != sts)
    {
      NotificationChain msgs = null;
      if (sts != null)
        msgs = ((InternalEObject)sts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__STS, null, msgs);
      if (newSts != null)
        msgs = ((InternalEObject)newSts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__STS, null, msgs);
      msgs = basicSetSts(newSts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__STS, newSts, newSts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement getTs()
  {
    return ts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTs(TryStatement newTs, NotificationChain msgs)
  {
    TryStatement oldTs = ts;
    ts = newTs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__TS, oldTs, newTs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTs(TryStatement newTs)
  {
    if (newTs != ts)
    {
      NotificationChain msgs = null;
      if (ts != null)
        msgs = ((InternalEObject)ts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__TS, null, msgs);
      if (newTs != null)
        msgs = ((InternalEObject)newTs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__TS, null, msgs);
      msgs = basicSetTs(newTs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__TS, newTs, newTs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultXMLNamespaceStatement getSdxns()
  {
    return sdxns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSdxns(DefaultXMLNamespaceStatement newSdxns, NotificationChain msgs)
  {
    DefaultXMLNamespaceStatement oldSdxns = sdxns;
    sdxns = newSdxns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDXNS, oldSdxns, newSdxns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSdxns(DefaultXMLNamespaceStatement newSdxns)
  {
    if (newSdxns != sdxns)
    {
      NotificationChain msgs = null;
      if (sdxns != null)
        msgs = ((InternalEObject)sdxns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDXNS, null, msgs);
      if (newSdxns != null)
        msgs = ((InternalEObject)newSdxns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__SDXNS, null, msgs);
      msgs = basicSetSdxns(newSdxns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__SDXNS, newSdxns, newSdxns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssert(Condition newAssert, NotificationChain msgs)
  {
    Condition oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__ASSERT, oldAssert, newAssert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(Condition newAssert)
  {
    if (newAssert != assert_)
    {
      NotificationChain msgs = null;
      if (assert_ != null)
        msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__ASSERT, null, msgs);
      if (newAssert != null)
        msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.STATEMENT__ASSERT, null, msgs);
      msgs = basicSetAssert(newAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.STATEMENT__ASSERT, newAssert, newAssert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AS3Package.STATEMENT__SB:
        return basicSetSb(null, msgs);
      case AS3Package.STATEMENT__SDS:
        return basicSetSds(null, msgs);
      case AS3Package.STATEMENT__SES:
        return basicSetSes(null, msgs);
      case AS3Package.STATEMENT__SIS:
        return basicSetSis(null, msgs);
      case AS3Package.STATEMENT__SFES:
        return basicSetSfes(null, msgs);
      case AS3Package.STATEMENT__SFS:
        return basicSetSfs(null, msgs);
      case AS3Package.STATEMENT__SWS:
        return basicSetSws(null, msgs);
      case AS3Package.STATEMENT__SDWS:
        return basicSetSdws(null, msgs);
      case AS3Package.STATEMENT__WS:
        return basicSetWs(null, msgs);
      case AS3Package.STATEMENT__SSS:
        return basicSetSss(null, msgs);
      case AS3Package.STATEMENT__SRS:
        return basicSetSrs(null, msgs);
      case AS3Package.STATEMENT__STS:
        return basicSetSts(null, msgs);
      case AS3Package.STATEMENT__TS:
        return basicSetTs(null, msgs);
      case AS3Package.STATEMENT__SDXNS:
        return basicSetSdxns(null, msgs);
      case AS3Package.STATEMENT__ASSERT:
        return basicSetAssert(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AS3Package.STATEMENT__SB:
        return getSb();
      case AS3Package.STATEMENT__SDS:
        return getSds();
      case AS3Package.STATEMENT__SES:
        return getSes();
      case AS3Package.STATEMENT__SIS:
        return getSis();
      case AS3Package.STATEMENT__SFES:
        return getSfes();
      case AS3Package.STATEMENT__SFS:
        return getSfs();
      case AS3Package.STATEMENT__SWS:
        return getSws();
      case AS3Package.STATEMENT__SDWS:
        return getSdws();
      case AS3Package.STATEMENT__WS:
        return getWs();
      case AS3Package.STATEMENT__SSS:
        return getSss();
      case AS3Package.STATEMENT__SBS:
        return getSbs();
      case AS3Package.STATEMENT__SCS:
        return getScs();
      case AS3Package.STATEMENT__SRS:
        return getSrs();
      case AS3Package.STATEMENT__STS:
        return getSts();
      case AS3Package.STATEMENT__TS:
        return getTs();
      case AS3Package.STATEMENT__SDXNS:
        return getSdxns();
      case AS3Package.STATEMENT__ASSERT:
        return getAssert();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AS3Package.STATEMENT__SB:
        setSb((block)newValue);
        return;
      case AS3Package.STATEMENT__SDS:
        setSds((DeclarationStatement)newValue);
        return;
      case AS3Package.STATEMENT__SES:
        setSes((ExpressionStatement)newValue);
        return;
      case AS3Package.STATEMENT__SIS:
        setSis((IfStatement)newValue);
        return;
      case AS3Package.STATEMENT__SFES:
        setSfes((ForEachStatement)newValue);
        return;
      case AS3Package.STATEMENT__SFS:
        setSfs((ForStatement)newValue);
        return;
      case AS3Package.STATEMENT__SWS:
        setSws((WhileStatement)newValue);
        return;
      case AS3Package.STATEMENT__SDWS:
        setSdws((DoWhileStatement)newValue);
        return;
      case AS3Package.STATEMENT__WS:
        setWs((WithStatement)newValue);
        return;
      case AS3Package.STATEMENT__SSS:
        setSss((SwitchStatement)newValue);
        return;
      case AS3Package.STATEMENT__SBS:
        setSbs((String)newValue);
        return;
      case AS3Package.STATEMENT__SCS:
        setScs((String)newValue);
        return;
      case AS3Package.STATEMENT__SRS:
        setSrs((ReturnStatement)newValue);
        return;
      case AS3Package.STATEMENT__STS:
        setSts((ThrowStatement)newValue);
        return;
      case AS3Package.STATEMENT__TS:
        setTs((TryStatement)newValue);
        return;
      case AS3Package.STATEMENT__SDXNS:
        setSdxns((DefaultXMLNamespaceStatement)newValue);
        return;
      case AS3Package.STATEMENT__ASSERT:
        setAssert((Condition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AS3Package.STATEMENT__SB:
        setSb((block)null);
        return;
      case AS3Package.STATEMENT__SDS:
        setSds((DeclarationStatement)null);
        return;
      case AS3Package.STATEMENT__SES:
        setSes((ExpressionStatement)null);
        return;
      case AS3Package.STATEMENT__SIS:
        setSis((IfStatement)null);
        return;
      case AS3Package.STATEMENT__SFES:
        setSfes((ForEachStatement)null);
        return;
      case AS3Package.STATEMENT__SFS:
        setSfs((ForStatement)null);
        return;
      case AS3Package.STATEMENT__SWS:
        setSws((WhileStatement)null);
        return;
      case AS3Package.STATEMENT__SDWS:
        setSdws((DoWhileStatement)null);
        return;
      case AS3Package.STATEMENT__WS:
        setWs((WithStatement)null);
        return;
      case AS3Package.STATEMENT__SSS:
        setSss((SwitchStatement)null);
        return;
      case AS3Package.STATEMENT__SBS:
        setSbs(SBS_EDEFAULT);
        return;
      case AS3Package.STATEMENT__SCS:
        setScs(SCS_EDEFAULT);
        return;
      case AS3Package.STATEMENT__SRS:
        setSrs((ReturnStatement)null);
        return;
      case AS3Package.STATEMENT__STS:
        setSts((ThrowStatement)null);
        return;
      case AS3Package.STATEMENT__TS:
        setTs((TryStatement)null);
        return;
      case AS3Package.STATEMENT__SDXNS:
        setSdxns((DefaultXMLNamespaceStatement)null);
        return;
      case AS3Package.STATEMENT__ASSERT:
        setAssert((Condition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AS3Package.STATEMENT__SB:
        return sb != null;
      case AS3Package.STATEMENT__SDS:
        return sds != null;
      case AS3Package.STATEMENT__SES:
        return ses != null;
      case AS3Package.STATEMENT__SIS:
        return sis != null;
      case AS3Package.STATEMENT__SFES:
        return sfes != null;
      case AS3Package.STATEMENT__SFS:
        return sfs != null;
      case AS3Package.STATEMENT__SWS:
        return sws != null;
      case AS3Package.STATEMENT__SDWS:
        return sdws != null;
      case AS3Package.STATEMENT__WS:
        return ws != null;
      case AS3Package.STATEMENT__SSS:
        return sss != null;
      case AS3Package.STATEMENT__SBS:
        return SBS_EDEFAULT == null ? sbs != null : !SBS_EDEFAULT.equals(sbs);
      case AS3Package.STATEMENT__SCS:
        return SCS_EDEFAULT == null ? scs != null : !SCS_EDEFAULT.equals(scs);
      case AS3Package.STATEMENT__SRS:
        return srs != null;
      case AS3Package.STATEMENT__STS:
        return sts != null;
      case AS3Package.STATEMENT__TS:
        return ts != null;
      case AS3Package.STATEMENT__SDXNS:
        return sdxns != null;
      case AS3Package.STATEMENT__ASSERT:
        return assert_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sbs: ");
    result.append(sbs);
    result.append(", scs: ");
    result.append(scs);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
