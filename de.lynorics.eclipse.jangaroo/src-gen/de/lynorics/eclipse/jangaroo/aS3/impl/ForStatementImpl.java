/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.StatementsBlock;
import de.lynorics.eclipse.jangaroo.aS3.VarType;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForinit <em>Forinit</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getNameForin <em>Name Forin</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForinexpr <em>Forinexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForcommand <em>Forcommand</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getNameForeachh <em>Name Foreachh</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForeachexpr <em>Foreachexpr</em>}</li>
 *   <li>{@link de.lynorics.eclipse.jangaroo.aS3.impl.ForStatementImpl#getForeachcommand <em>Foreachcommand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends StatementImpl implements ForStatement
{
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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected commaExpr condition;

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
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected StatementsBlock command;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<identifierDeclaration> elements;

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
  protected Expression forinexpr;

  /**
   * The cached value of the '{@link #getForcommand() <em>Forcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForcommand()
   * @generated
   * @ordered
   */
  protected StatementsBlock forcommand;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VarType type;

  /**
   * The cached value of the '{@link #getForeachexpr() <em>Foreachexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachexpr()
   * @generated
   * @ordered
   */
  protected Expression foreachexpr;

  /**
   * The cached value of the '{@link #getForeachcommand() <em>Foreachcommand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachcommand()
   * @generated
   * @ordered
   */
  protected StatementsBlock foreachcommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return AS3Package.Literals.FOR_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORINIT, oldForinit, newForinit);
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
        msgs = ((InternalEObject)forinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORINIT, null, msgs);
      if (newForinit != null)
        msgs = ((InternalEObject)newForinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORINIT, null, msgs);
      msgs = basicSetForinit(newForinit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORINIT, newForinit, newForinit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commaExpr getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(commaExpr newCondition, NotificationChain msgs)
  {
    commaExpr oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(commaExpr newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__CONDITION, newCondition, newCondition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__ITERATOR, oldIterator, newIterator);
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
        msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__ITERATOR, null, msgs);
      if (newIterator != null)
        msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__ITERATOR, null, msgs);
      msgs = basicSetIterator(newIterator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__ITERATOR, newIterator, newIterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementsBlock getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommand(StatementsBlock newCommand, NotificationChain msgs)
  {
    StatementsBlock oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__COMMAND, oldCommand, newCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(StatementsBlock newCommand)
  {
    if (newCommand != command)
    {
      NotificationChain msgs = null;
      if (command != null)
        msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__COMMAND, null, msgs);
      if (newCommand != null)
        msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__COMMAND, null, msgs);
      msgs = basicSetCommand(newCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__COMMAND, newCommand, newCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<identifierDeclaration> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<identifierDeclaration>(identifierDeclaration.class, this, AS3Package.FOR_STATEMENT__ELEMENTS);
    }
    return elements;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__NAME_FORIN, oldNameForin, nameForin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getForinexpr()
  {
    return forinexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForinexpr(Expression newForinexpr, NotificationChain msgs)
  {
    Expression oldForinexpr = forinexpr;
    forinexpr = newForinexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORINEXPR, oldForinexpr, newForinexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForinexpr(Expression newForinexpr)
  {
    if (newForinexpr != forinexpr)
    {
      NotificationChain msgs = null;
      if (forinexpr != null)
        msgs = ((InternalEObject)forinexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORINEXPR, null, msgs);
      if (newForinexpr != null)
        msgs = ((InternalEObject)newForinexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORINEXPR, null, msgs);
      msgs = basicSetForinexpr(newForinexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORINEXPR, newForinexpr, newForinexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementsBlock getForcommand()
  {
    return forcommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForcommand(StatementsBlock newForcommand, NotificationChain msgs)
  {
    StatementsBlock oldForcommand = forcommand;
    forcommand = newForcommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORCOMMAND, oldForcommand, newForcommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForcommand(StatementsBlock newForcommand)
  {
    if (newForcommand != forcommand)
    {
      NotificationChain msgs = null;
      if (forcommand != null)
        msgs = ((InternalEObject)forcommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORCOMMAND, null, msgs);
      if (newForcommand != null)
        msgs = ((InternalEObject)newForcommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FORCOMMAND, null, msgs);
      msgs = basicSetForcommand(newForcommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FORCOMMAND, newForcommand, newForcommand));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__NAME_FOREACHH, oldNameForeachh, nameForeachh));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(VarType newType, NotificationChain msgs)
  {
    VarType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VarType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getForeachexpr()
  {
    return foreachexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachexpr(Expression newForeachexpr, NotificationChain msgs)
  {
    Expression oldForeachexpr = foreachexpr;
    foreachexpr = newForeachexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOREACHEXPR, oldForeachexpr, newForeachexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachexpr(Expression newForeachexpr)
  {
    if (newForeachexpr != foreachexpr)
    {
      NotificationChain msgs = null;
      if (foreachexpr != null)
        msgs = ((InternalEObject)foreachexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOREACHEXPR, null, msgs);
      if (newForeachexpr != null)
        msgs = ((InternalEObject)newForeachexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOREACHEXPR, null, msgs);
      msgs = basicSetForeachexpr(newForeachexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOREACHEXPR, newForeachexpr, newForeachexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementsBlock getForeachcommand()
  {
    return foreachcommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachcommand(StatementsBlock newForeachcommand, NotificationChain msgs)
  {
    StatementsBlock oldForeachcommand = foreachcommand;
    foreachcommand = newForeachcommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOREACHCOMMAND, oldForeachcommand, newForeachcommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachcommand(StatementsBlock newForeachcommand)
  {
    if (newForeachcommand != foreachcommand)
    {
      NotificationChain msgs = null;
      if (foreachcommand != null)
        msgs = ((InternalEObject)foreachcommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOREACHCOMMAND, null, msgs);
      if (newForeachcommand != null)
        msgs = ((InternalEObject)newForeachcommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AS3Package.FOR_STATEMENT__FOREACHCOMMAND, null, msgs);
      msgs = basicSetForeachcommand(newForeachcommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AS3Package.FOR_STATEMENT__FOREACHCOMMAND, newForeachcommand, newForeachcommand));
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
      case AS3Package.FOR_STATEMENT__FORINIT:
        return basicSetForinit(null, msgs);
      case AS3Package.FOR_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case AS3Package.FOR_STATEMENT__ITERATOR:
        return basicSetIterator(null, msgs);
      case AS3Package.FOR_STATEMENT__COMMAND:
        return basicSetCommand(null, msgs);
      case AS3Package.FOR_STATEMENT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case AS3Package.FOR_STATEMENT__FORINEXPR:
        return basicSetForinexpr(null, msgs);
      case AS3Package.FOR_STATEMENT__FORCOMMAND:
        return basicSetForcommand(null, msgs);
      case AS3Package.FOR_STATEMENT__TYPE:
        return basicSetType(null, msgs);
      case AS3Package.FOR_STATEMENT__FOREACHEXPR:
        return basicSetForeachexpr(null, msgs);
      case AS3Package.FOR_STATEMENT__FOREACHCOMMAND:
        return basicSetForeachcommand(null, msgs);
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
      case AS3Package.FOR_STATEMENT__FORINIT:
        return getForinit();
      case AS3Package.FOR_STATEMENT__CONDITION:
        return getCondition();
      case AS3Package.FOR_STATEMENT__ITERATOR:
        return getIterator();
      case AS3Package.FOR_STATEMENT__COMMAND:
        return getCommand();
      case AS3Package.FOR_STATEMENT__ELEMENTS:
        return getElements();
      case AS3Package.FOR_STATEMENT__NAME_FORIN:
        return getNameForin();
      case AS3Package.FOR_STATEMENT__FORINEXPR:
        return getForinexpr();
      case AS3Package.FOR_STATEMENT__FORCOMMAND:
        return getForcommand();
      case AS3Package.FOR_STATEMENT__NAME_FOREACHH:
        return getNameForeachh();
      case AS3Package.FOR_STATEMENT__TYPE:
        return getType();
      case AS3Package.FOR_STATEMENT__FOREACHEXPR:
        return getForeachexpr();
      case AS3Package.FOR_STATEMENT__FOREACHCOMMAND:
        return getForeachcommand();
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
      case AS3Package.FOR_STATEMENT__FORINIT:
        setForinit((commaExpr)newValue);
        return;
      case AS3Package.FOR_STATEMENT__CONDITION:
        setCondition((commaExpr)newValue);
        return;
      case AS3Package.FOR_STATEMENT__ITERATOR:
        setIterator((commaExpr)newValue);
        return;
      case AS3Package.FOR_STATEMENT__COMMAND:
        setCommand((StatementsBlock)newValue);
        return;
      case AS3Package.FOR_STATEMENT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends identifierDeclaration>)newValue);
        return;
      case AS3Package.FOR_STATEMENT__NAME_FORIN:
        setNameForin((String)newValue);
        return;
      case AS3Package.FOR_STATEMENT__FORINEXPR:
        setForinexpr((Expression)newValue);
        return;
      case AS3Package.FOR_STATEMENT__FORCOMMAND:
        setForcommand((StatementsBlock)newValue);
        return;
      case AS3Package.FOR_STATEMENT__NAME_FOREACHH:
        setNameForeachh((String)newValue);
        return;
      case AS3Package.FOR_STATEMENT__TYPE:
        setType((VarType)newValue);
        return;
      case AS3Package.FOR_STATEMENT__FOREACHEXPR:
        setForeachexpr((Expression)newValue);
        return;
      case AS3Package.FOR_STATEMENT__FOREACHCOMMAND:
        setForeachcommand((StatementsBlock)newValue);
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
      case AS3Package.FOR_STATEMENT__FORINIT:
        setForinit((commaExpr)null);
        return;
      case AS3Package.FOR_STATEMENT__CONDITION:
        setCondition((commaExpr)null);
        return;
      case AS3Package.FOR_STATEMENT__ITERATOR:
        setIterator((commaExpr)null);
        return;
      case AS3Package.FOR_STATEMENT__COMMAND:
        setCommand((StatementsBlock)null);
        return;
      case AS3Package.FOR_STATEMENT__ELEMENTS:
        getElements().clear();
        return;
      case AS3Package.FOR_STATEMENT__NAME_FORIN:
        setNameForin(NAME_FORIN_EDEFAULT);
        return;
      case AS3Package.FOR_STATEMENT__FORINEXPR:
        setForinexpr((Expression)null);
        return;
      case AS3Package.FOR_STATEMENT__FORCOMMAND:
        setForcommand((StatementsBlock)null);
        return;
      case AS3Package.FOR_STATEMENT__NAME_FOREACHH:
        setNameForeachh(NAME_FOREACHH_EDEFAULT);
        return;
      case AS3Package.FOR_STATEMENT__TYPE:
        setType((VarType)null);
        return;
      case AS3Package.FOR_STATEMENT__FOREACHEXPR:
        setForeachexpr((Expression)null);
        return;
      case AS3Package.FOR_STATEMENT__FOREACHCOMMAND:
        setForeachcommand((StatementsBlock)null);
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
      case AS3Package.FOR_STATEMENT__FORINIT:
        return forinit != null;
      case AS3Package.FOR_STATEMENT__CONDITION:
        return condition != null;
      case AS3Package.FOR_STATEMENT__ITERATOR:
        return iterator != null;
      case AS3Package.FOR_STATEMENT__COMMAND:
        return command != null;
      case AS3Package.FOR_STATEMENT__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case AS3Package.FOR_STATEMENT__NAME_FORIN:
        return NAME_FORIN_EDEFAULT == null ? nameForin != null : !NAME_FORIN_EDEFAULT.equals(nameForin);
      case AS3Package.FOR_STATEMENT__FORINEXPR:
        return forinexpr != null;
      case AS3Package.FOR_STATEMENT__FORCOMMAND:
        return forcommand != null;
      case AS3Package.FOR_STATEMENT__NAME_FOREACHH:
        return NAME_FOREACHH_EDEFAULT == null ? nameForeachh != null : !NAME_FOREACHH_EDEFAULT.equals(nameForeachh);
      case AS3Package.FOR_STATEMENT__TYPE:
        return type != null;
      case AS3Package.FOR_STATEMENT__FOREACHEXPR:
        return foreachexpr != null;
      case AS3Package.FOR_STATEMENT__FOREACHCOMMAND:
        return foreachcommand != null;
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
    result.append(')');
    return result.toString();
  }

} //ForStatementImpl
