/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.block;
import de.lynorics.eclipse.jangaroo.aS3.catches;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.expr;
import de.lynorics.eclipse.jangaroo.aS3.labelableStatement;
import de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>labelable Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getIfcondition <em>Ifcondition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getIfelse <em>Ifelse</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getForinit <em>Forinit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getNameForin <em>Name Forin</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getForinexpr <em>Forinexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getForcommand <em>Forcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getNameForeachh <em>Name Foreachh</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getForeachexpr <em>Foreachexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getForeachcommand <em>Foreachcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.labelableStatementImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class labelableStatementImpl extends MinimalEObjectImpl.Container implements labelableStatement
{
  /**
   * The cached value of the '{@link #getIfcondition() <em>Ifcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfcondition()
   * @generated
   * @ordered
   */
  protected parenthesizedExpr ifcondition;

  /**
   * The cached value of the '{@link #getIfthen() <em>Ifthen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfthen()
   * @generated
   * @ordered
   */
  protected statement ifthen;

  /**
   * The cached value of the '{@link #getIfelse() <em>Ifelse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfelse()
   * @generated
   * @ordered
   */
  protected statement ifelse;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EObject condition;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> elements;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected EObject command;

  /**
   * The cached value of the '{@link #getForinit() <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForinit()
   * @generated
   * @ordered
   */
  protected commaExpr forinit;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected commaExpr iterator;

  /**
   * The default value of the '{@link #getNameForin() <em>Name Forin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameForin()
   * @generated
   * @ordered
   */
  protected static final String NAME_FORIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameForin() <em>Name Forin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameForin()
   * @generated
   * @ordered
   */
  protected String nameForin = NAME_FORIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getForinexpr() <em>Forinexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForinexpr()
   * @generated
   * @ordered
   */
  protected expr forinexpr;

  /**
   * The cached value of the '{@link #getForcommand() <em>Forcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForcommand()
   * @generated
   * @ordered
   */
  protected statement forcommand;

  /**
   * The default value of the '{@link #getNameForeachh() <em>Name Foreachh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameForeachh()
   * @generated
   * @ordered
   */
  protected static final String NAME_FOREACHH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameForeachh() <em>Name Foreachh</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameForeachh()
   * @generated
   * @ordered
   */
  protected String nameForeachh = NAME_FOREACHH_EDEFAULT;

  /**
   * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected static final String RELATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected String relation = RELATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getForeachexpr() <em>Foreachexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachexpr()
   * @generated
   * @ordered
   */
  protected expr foreachexpr;

  /**
   * The cached value of the '{@link #getForeachcommand() <em>Foreachcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachcommand()
   * @generated
   * @ordered
   */
  protected statement foreachcommand;

  /**
   * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatch()
   * @generated
   * @ordered
   */
  protected catches catch_;

  /**
   * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally()
   * @generated
   * @ordered
   */
  protected block finally_;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected namedFunctionExpr function;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labelableStatementImpl()
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
    return AS3Package.Literals.LABELABLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parenthesizedExpr getIfcondition()
  {
    return ifcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfcondition(parenthesizedExpr newIfcondition, NotificationChain msgs)
  {
    parenthesizedExpr oldIfcondition = ifcondition;
    ifcondition = newIfcondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFCONDITION, oldIfcondition, newIfcondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfcondition(parenthesizedExpr newIfcondition)
  {
    if (newIfcondition != ifcondition)
    {
      NotificationChain msgs = null;
      if (ifcondition != null)
        msgs = ((InternalEObject)ifcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFCONDITION, null, msgs);
      if (newIfcondition != null)
        msgs = ((InternalEObject)newIfcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFCONDITION, null, msgs);
      msgs = basicSetIfcondition(newIfcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFCONDITION, newIfcondition, newIfcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getIfthen()
  {
    return ifthen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfthen(statement newIfthen, NotificationChain msgs)
  {
    statement oldIfthen = ifthen;
    ifthen = newIfthen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFTHEN, oldIfthen, newIfthen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfthen(statement newIfthen)
  {
    if (newIfthen != ifthen)
    {
      NotificationChain msgs = null;
      if (ifthen != null)
        msgs = ((InternalEObject)ifthen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFTHEN, null, msgs);
      if (newIfthen != null)
        msgs = ((InternalEObject)newIfthen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFTHEN, null, msgs);
      msgs = basicSetIfthen(newIfthen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFTHEN, newIfthen, newIfthen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getIfelse()
  {
    return ifelse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfelse(statement newIfelse, NotificationChain msgs)
  {
    statement oldIfelse = ifelse;
    ifelse = newIfelse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFELSE, oldIfelse, newIfelse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfelse(statement newIfelse)
  {
    if (newIfelse != ifelse)
    {
      NotificationChain msgs = null;
      if (ifelse != null)
        msgs = ((InternalEObject)ifelse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFELSE, null, msgs);
      if (newIfelse != null)
        msgs = ((InternalEObject)newIfelse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__IFELSE, null, msgs);
      msgs = basicSetIfelse(newIfelse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__IFELSE, newIfelse, newIfelse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(EObject newCondition, NotificationChain msgs)
  {
    EObject oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(EObject newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<EObject>(EObject.class, this, AS3Package.LABELABLE_STATEMENT__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommand(EObject newCommand, NotificationChain msgs)
  {
    EObject oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__COMMAND, oldCommand, newCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(EObject newCommand)
  {
    if (newCommand != command)
    {
      NotificationChain msgs = null;
      if (command != null)
        msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__COMMAND, null, msgs);
      if (newCommand != null)
        msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__COMMAND, null, msgs);
      msgs = basicSetCommand(newCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__COMMAND, newCommand, newCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commaExpr getForinit()
  {
    return forinit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForinit(commaExpr newForinit, NotificationChain msgs)
  {
    commaExpr oldForinit = forinit;
    forinit = newForinit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORINIT, oldForinit, newForinit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForinit(commaExpr newForinit)
  {
    if (newForinit != forinit)
    {
      NotificationChain msgs = null;
      if (forinit != null)
        msgs = ((InternalEObject)forinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORINIT, null, msgs);
      if (newForinit != null)
        msgs = ((InternalEObject)newForinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORINIT, null, msgs);
      msgs = basicSetForinit(newForinit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORINIT, newForinit, newForinit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commaExpr getIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterator(commaExpr newIterator, NotificationChain msgs)
  {
    commaExpr oldIterator = iterator;
    iterator = newIterator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__ITERATOR, oldIterator, newIterator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterator(commaExpr newIterator)
  {
    if (newIterator != iterator)
    {
      NotificationChain msgs = null;
      if (iterator != null)
        msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__ITERATOR, null, msgs);
      if (newIterator != null)
        msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__ITERATOR, null, msgs);
      msgs = basicSetIterator(newIterator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__ITERATOR, newIterator, newIterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameForin()
  {
    return nameForin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameForin(String newNameForin)
  {
    String oldNameForin = nameForin;
    nameForin = newNameForin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__NAME_FORIN, oldNameForin, nameForin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getForinexpr()
  {
    return forinexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForinexpr(expr newForinexpr, NotificationChain msgs)
  {
    expr oldForinexpr = forinexpr;
    forinexpr = newForinexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORINEXPR, oldForinexpr, newForinexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForinexpr(expr newForinexpr)
  {
    if (newForinexpr != forinexpr)
    {
      NotificationChain msgs = null;
      if (forinexpr != null)
        msgs = ((InternalEObject)forinexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORINEXPR, null, msgs);
      if (newForinexpr != null)
        msgs = ((InternalEObject)newForinexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORINEXPR, null, msgs);
      msgs = basicSetForinexpr(newForinexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORINEXPR, newForinexpr, newForinexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getForcommand()
  {
    return forcommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForcommand(statement newForcommand, NotificationChain msgs)
  {
    statement oldForcommand = forcommand;
    forcommand = newForcommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORCOMMAND, oldForcommand, newForcommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForcommand(statement newForcommand)
  {
    if (newForcommand != forcommand)
    {
      NotificationChain msgs = null;
      if (forcommand != null)
        msgs = ((InternalEObject)forcommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORCOMMAND, null, msgs);
      if (newForcommand != null)
        msgs = ((InternalEObject)newForcommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FORCOMMAND, null, msgs);
      msgs = basicSetForcommand(newForcommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FORCOMMAND, newForcommand, newForcommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameForeachh()
  {
    return nameForeachh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameForeachh(String newNameForeachh)
  {
    String oldNameForeachh = nameForeachh;
    nameForeachh = newNameForeachh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__NAME_FOREACHH, oldNameForeachh, nameForeachh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(String newRelation)
  {
    String oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getForeachexpr()
  {
    return foreachexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachexpr(expr newForeachexpr, NotificationChain msgs)
  {
    expr oldForeachexpr = foreachexpr;
    foreachexpr = newForeachexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FOREACHEXPR, oldForeachexpr, newForeachexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachexpr(expr newForeachexpr)
  {
    if (newForeachexpr != foreachexpr)
    {
      NotificationChain msgs = null;
      if (foreachexpr != null)
        msgs = ((InternalEObject)foreachexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FOREACHEXPR, null, msgs);
      if (newForeachexpr != null)
        msgs = ((InternalEObject)newForeachexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FOREACHEXPR, null, msgs);
      msgs = basicSetForeachexpr(newForeachexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FOREACHEXPR, newForeachexpr, newForeachexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getForeachcommand()
  {
    return foreachcommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachcommand(statement newForeachcommand, NotificationChain msgs)
  {
    statement oldForeachcommand = foreachcommand;
    foreachcommand = newForeachcommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND, oldForeachcommand, newForeachcommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachcommand(statement newForeachcommand)
  {
    if (newForeachcommand != foreachcommand)
    {
      NotificationChain msgs = null;
      if (foreachcommand != null)
        msgs = ((InternalEObject)foreachcommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND, null, msgs);
      if (newForeachcommand != null)
        msgs = ((InternalEObject)newForeachcommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND, null, msgs);
      msgs = basicSetForeachcommand(newForeachcommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND, newForeachcommand, newForeachcommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public catches getCatch()
  {
    return catch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCatch(catches newCatch, NotificationChain msgs)
  {
    catches oldCatch = catch_;
    catch_ = newCatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__CATCH, oldCatch, newCatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCatch(catches newCatch)
  {
    if (newCatch != catch_)
    {
      NotificationChain msgs = null;
      if (catch_ != null)
        msgs = ((InternalEObject)catch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__CATCH, null, msgs);
      if (newCatch != null)
        msgs = ((InternalEObject)newCatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__CATCH, null, msgs);
      msgs = basicSetCatch(newCatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__CATCH, newCatch, newCatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block getFinally()
  {
    return finally_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinally(block newFinally, NotificationChain msgs)
  {
    block oldFinally = finally_;
    finally_ = newFinally;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FINALLY, oldFinally, newFinally);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinally(block newFinally)
  {
    if (newFinally != finally_)
    {
      NotificationChain msgs = null;
      if (finally_ != null)
        msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FINALLY, null, msgs);
      if (newFinally != null)
        msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FINALLY, null, msgs);
      msgs = basicSetFinally(newFinally, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FINALLY, newFinally, newFinally));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public namedFunctionExpr getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(namedFunctionExpr newFunction, NotificationChain msgs)
  {
    namedFunctionExpr oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(namedFunctionExpr newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.LABELABLE_STATEMENT__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.LABELABLE_STATEMENT__FUNCTION, newFunction, newFunction));
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
      case AS3Package.LABELABLE_STATEMENT__IFCONDITION:
        return basicSetIfcondition(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__IFTHEN:
        return basicSetIfthen(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__IFELSE:
        return basicSetIfelse(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case AS3Package.LABELABLE_STATEMENT__COMMAND:
        return basicSetCommand(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FORINIT:
        return basicSetForinit(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__ITERATOR:
        return basicSetIterator(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FORINEXPR:
        return basicSetForinexpr(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FORCOMMAND:
        return basicSetForcommand(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FOREACHEXPR:
        return basicSetForeachexpr(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND:
        return basicSetForeachcommand(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__CATCH:
        return basicSetCatch(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FINALLY:
        return basicSetFinally(null, msgs);
      case AS3Package.LABELABLE_STATEMENT__FUNCTION:
        return basicSetFunction(null, msgs);
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
      case AS3Package.LABELABLE_STATEMENT__IFCONDITION:
        return getIfcondition();
      case AS3Package.LABELABLE_STATEMENT__IFTHEN:
        return getIfthen();
      case AS3Package.LABELABLE_STATEMENT__IFELSE:
        return getIfelse();
      case AS3Package.LABELABLE_STATEMENT__CONDITION:
        return getCondition();
      case AS3Package.LABELABLE_STATEMENT__ELEMENTS:
        return getElements();
      case AS3Package.LABELABLE_STATEMENT__COMMAND:
        return getCommand();
      case AS3Package.LABELABLE_STATEMENT__FORINIT:
        return getForinit();
      case AS3Package.LABELABLE_STATEMENT__ITERATOR:
        return getIterator();
      case AS3Package.LABELABLE_STATEMENT__NAME_FORIN:
        return getNameForin();
      case AS3Package.LABELABLE_STATEMENT__FORINEXPR:
        return getForinexpr();
      case AS3Package.LABELABLE_STATEMENT__FORCOMMAND:
        return getForcommand();
      case AS3Package.LABELABLE_STATEMENT__NAME_FOREACHH:
        return getNameForeachh();
      case AS3Package.LABELABLE_STATEMENT__RELATION:
        return getRelation();
      case AS3Package.LABELABLE_STATEMENT__FOREACHEXPR:
        return getForeachexpr();
      case AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND:
        return getForeachcommand();
      case AS3Package.LABELABLE_STATEMENT__CATCH:
        return getCatch();
      case AS3Package.LABELABLE_STATEMENT__FINALLY:
        return getFinally();
      case AS3Package.LABELABLE_STATEMENT__FUNCTION:
        return getFunction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AS3Package.LABELABLE_STATEMENT__IFCONDITION:
        setIfcondition((parenthesizedExpr)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__IFTHEN:
        setIfthen((statement)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__IFELSE:
        setIfelse((statement)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__CONDITION:
        setCondition((EObject)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends EObject>)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__COMMAND:
        setCommand((EObject)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORINIT:
        setForinit((commaExpr)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__ITERATOR:
        setIterator((commaExpr)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__NAME_FORIN:
        setNameForin((String)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORINEXPR:
        setForinexpr((expr)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORCOMMAND:
        setForcommand((statement)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__NAME_FOREACHH:
        setNameForeachh((String)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__RELATION:
        setRelation((String)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FOREACHEXPR:
        setForeachexpr((expr)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND:
        setForeachcommand((statement)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__CATCH:
        setCatch((catches)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FINALLY:
        setFinally((block)newValue);
        return;
      case AS3Package.LABELABLE_STATEMENT__FUNCTION:
        setFunction((namedFunctionExpr)newValue);
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
      case AS3Package.LABELABLE_STATEMENT__IFCONDITION:
        setIfcondition((parenthesizedExpr)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__IFTHEN:
        setIfthen((statement)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__IFELSE:
        setIfelse((statement)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__CONDITION:
        setCondition((EObject)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__ELEMENTS:
        getElements().clear();
        return;
      case AS3Package.LABELABLE_STATEMENT__COMMAND:
        setCommand((EObject)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORINIT:
        setForinit((commaExpr)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__ITERATOR:
        setIterator((commaExpr)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__NAME_FORIN:
        setNameForin(NAME_FORIN_EDEFAULT);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORINEXPR:
        setForinexpr((expr)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__FORCOMMAND:
        setForcommand((statement)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__NAME_FOREACHH:
        setNameForeachh(NAME_FOREACHH_EDEFAULT);
        return;
      case AS3Package.LABELABLE_STATEMENT__RELATION:
        setRelation(RELATION_EDEFAULT);
        return;
      case AS3Package.LABELABLE_STATEMENT__FOREACHEXPR:
        setForeachexpr((expr)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND:
        setForeachcommand((statement)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__CATCH:
        setCatch((catches)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__FINALLY:
        setFinally((block)null);
        return;
      case AS3Package.LABELABLE_STATEMENT__FUNCTION:
        setFunction((namedFunctionExpr)null);
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
      case AS3Package.LABELABLE_STATEMENT__IFCONDITION:
        return ifcondition != null;
      case AS3Package.LABELABLE_STATEMENT__IFTHEN:
        return ifthen != null;
      case AS3Package.LABELABLE_STATEMENT__IFELSE:
        return ifelse != null;
      case AS3Package.LABELABLE_STATEMENT__CONDITION:
        return condition != null;
      case AS3Package.LABELABLE_STATEMENT__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case AS3Package.LABELABLE_STATEMENT__COMMAND:
        return command != null;
      case AS3Package.LABELABLE_STATEMENT__FORINIT:
        return forinit != null;
      case AS3Package.LABELABLE_STATEMENT__ITERATOR:
        return iterator != null;
      case AS3Package.LABELABLE_STATEMENT__NAME_FORIN:
        return NAME_FORIN_EDEFAULT == null ? nameForin != null : !NAME_FORIN_EDEFAULT.equals(nameForin);
      case AS3Package.LABELABLE_STATEMENT__FORINEXPR:
        return forinexpr != null;
      case AS3Package.LABELABLE_STATEMENT__FORCOMMAND:
        return forcommand != null;
      case AS3Package.LABELABLE_STATEMENT__NAME_FOREACHH:
        return NAME_FOREACHH_EDEFAULT == null ? nameForeachh != null : !NAME_FOREACHH_EDEFAULT.equals(nameForeachh);
      case AS3Package.LABELABLE_STATEMENT__RELATION:
        return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
      case AS3Package.LABELABLE_STATEMENT__FOREACHEXPR:
        return foreachexpr != null;
      case AS3Package.LABELABLE_STATEMENT__FOREACHCOMMAND:
        return foreachcommand != null;
      case AS3Package.LABELABLE_STATEMENT__CATCH:
        return catch_ != null;
      case AS3Package.LABELABLE_STATEMENT__FINALLY:
        return finally_ != null;
      case AS3Package.LABELABLE_STATEMENT__FUNCTION:
        return function != null;
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
    result.append(" (nameForin: ");
    result.append(nameForin);
    result.append(", nameForeachh: ");
    result.append(nameForeachh);
    result.append(", relation: ");
    result.append(relation);
    result.append(')');
    return result.toString();
  }

} //labelableStatementImpl
