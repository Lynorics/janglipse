/**
 */
package de.lynorics.eclipse.jangaroo.aS3.impl;

import de.lynorics.eclipse.jangaroo.aS3.AS3Factory;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessLevel;
import de.lynorics.eclipse.jangaroo.aS3.Assignment;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.Expression;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfBlock;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.IntConstant;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberSelection;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.New;
import de.lynorics.eclipse.jangaroo.aS3.NewStatement;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Parameters;
import de.lynorics.eclipse.jangaroo.aS3.Return;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.StatementsBlock;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.Super;
import de.lynorics.eclipse.jangaroo.aS3.Switch;
import de.lynorics.eclipse.jangaroo.aS3.SwitchStatement;
import de.lynorics.eclipse.jangaroo.aS3.Symbol;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.TerminalOp;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Type;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.While;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.exprOrObjectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.objectField;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statementInSwitch;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AS3FactoryImpl extends EFactoryImpl implements AS3Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AS3Factory init()
  {
    try
    {
      AS3Factory theAS3Factory = (AS3Factory)EPackage.Registry.INSTANCE.getEFactory(AS3Package.eNS_URI);
      if (theAS3Factory != null)
      {
        return theAS3Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AS3FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AS3Package.MODEL: return createModel();
      case AS3Package.PACKAGE: return createPackage();
      case AS3Package.IMPORTS: return createImports();
      case AS3Package.IMPORT: return createImport();
      case AS3Package.DIRECTIVE: return createdirective();
      case AS3Package.USES: return createUses();
      case AS3Package.ANNOTATION_FIELDS: return createannotationFields();
      case AS3Package.ANNOTATION_FIELD: return createannotationField();
      case AS3Package.INTERFACE: return createInterface();
      case AS3Package.CLASS: return createClass();
      case AS3Package.MEMBER: return createMember();
      case AS3Package.METHOD: return createMethod();
      case AS3Package.METHOD_BODY: return createMethodBody();
      case AS3Package.STATEMENT: return createStatement();
      case AS3Package.NEW_STATEMENT: return createNewStatement();
      case AS3Package.FOR_STATEMENT: return createForStatement();
      case AS3Package.IDENTIFIER_DECLARATION: return createidentifierDeclaration();
      case AS3Package.COMMA_EXPR: return createcommaExpr();
      case AS3Package.DO_WHILE_STATEMENT: return createDoWhileStatement();
      case AS3Package.WHILE_STATEMENT: return createWhileStatement();
      case AS3Package.SWITCH_STATEMENT: return createSwitchStatement();
      case AS3Package.PARENTHESIZED_EXPR: return createparenthesizedExpr();
      case AS3Package.STATEMENT_IN_SWITCH: return createstatementInSwitch();
      case AS3Package.RETURN: return createReturn();
      case AS3Package.VARIABLE_DECLARATION: return createVariableDeclaration();
      case AS3Package.IF_STATEMENT: return createIfStatement();
      case AS3Package.TRY_STATEMENT: return createTryStatement();
      case AS3Package.IF_BLOCK: return createIfBlock();
      case AS3Package.STATEMENTS_BLOCK: return createStatementsBlock();
      case AS3Package.BLOCK: return createBlock();
      case AS3Package.PARAMETER: return createParameter();
      case AS3Package.PARAMETERS: return createParameters();
      case AS3Package.TYPE_RELATION: return createtypeRelation();
      case AS3Package.OBJECT_LITERAL: return createobjectLiteral();
      case AS3Package.OBJECT_FIELDS: return createobjectFields();
      case AS3Package.OBJECT_FIELD: return createobjectField();
      case AS3Package.EXPR_OR_OBJECT_LITERAL: return createexprOrObjectLiteral();
      case AS3Package.SYMBOL: return createSymbol();
      case AS3Package.EXPRESSION: return createExpression();
      case AS3Package.TYPE: return createType();
      case AS3Package.NEW: return createNew();
      case AS3Package.WHILE: return createWhile();
      case AS3Package.SWITCH: return createSwitch();
      case AS3Package.ASSIGNMENT: return createAssignment();
      case AS3Package.MEMBER_SELECTION: return createMemberSelection();
      case AS3Package.STRING_CONSTANT: return createStringConstant();
      case AS3Package.INT_CONSTANT: return createIntConstant();
      case AS3Package.BOOL_CONSTANT: return createBoolConstant();
      case AS3Package.THIS: return createThis();
      case AS3Package.SUPER: return createSuper();
      case AS3Package.NULL: return createNull();
      case AS3Package.VOID: return createVoid();
      case AS3Package.SYMBOL_REF: return createSymbolRef();
      case AS3Package.TERMINAL_OP: return createTerminalOp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AS3Package.ACCESS_LEVEL:
        return createAccessLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AS3Package.ACCESS_LEVEL:
        return convertAccessLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.lynorics.eclipse.jangaroo.aS3.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public directive createdirective()
  {
    directiveImpl directive = new directiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uses createUses()
  {
    UsesImpl uses = new UsesImpl();
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationFields createannotationFields()
  {
    annotationFieldsImpl annotationFields = new annotationFieldsImpl();
    return annotationFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public annotationField createannotationField()
  {
    annotationFieldImpl annotationField = new annotationFieldImpl();
    return annotationField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.lynorics.eclipse.jangaroo.aS3.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodBody createMethodBody()
  {
    MethodBodyImpl methodBody = new MethodBodyImpl();
    return methodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewStatement createNewStatement()
  {
    NewStatementImpl newStatement = new NewStatementImpl();
    return newStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifierDeclaration createidentifierDeclaration()
  {
    identifierDeclarationImpl identifierDeclaration = new identifierDeclarationImpl();
    return identifierDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commaExpr createcommaExpr()
  {
    commaExprImpl commaExpr = new commaExprImpl();
    return commaExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhileStatement createDoWhileStatement()
  {
    DoWhileStatementImpl doWhileStatement = new DoWhileStatementImpl();
    return doWhileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parenthesizedExpr createparenthesizedExpr()
  {
    parenthesizedExprImpl parenthesizedExpr = new parenthesizedExprImpl();
    return parenthesizedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementInSwitch createstatementInSwitch()
  {
    statementInSwitchImpl statementInSwitch = new statementInSwitchImpl();
    return statementInSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement createTryStatement()
  {
    TryStatementImpl tryStatement = new TryStatementImpl();
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfBlock createIfBlock()
  {
    IfBlockImpl ifBlock = new IfBlockImpl();
    return ifBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementsBlock createStatementsBlock()
  {
    StatementsBlockImpl statementsBlock = new StatementsBlockImpl();
    return statementsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeRelation createtypeRelation()
  {
    typeRelationImpl typeRelation = new typeRelationImpl();
    return typeRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectLiteral createobjectLiteral()
  {
    objectLiteralImpl objectLiteral = new objectLiteralImpl();
    return objectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectFields createobjectFields()
  {
    objectFieldsImpl objectFields = new objectFieldsImpl();
    return objectFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public objectField createobjectField()
  {
    objectFieldImpl objectField = new objectFieldImpl();
    return objectField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprOrObjectLiteral createexprOrObjectLiteral()
  {
    exprOrObjectLiteralImpl exprOrObjectLiteral = new exprOrObjectLiteralImpl();
    return exprOrObjectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public New createNew()
  {
    NewImpl new_ = new NewImpl();
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberSelection createMemberSelection()
  {
    MemberSelectionImpl memberSelection = new MemberSelectionImpl();
    return memberSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Super createSuper()
  {
    SuperImpl super_ = new SuperImpl();
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.lynorics.eclipse.jangaroo.aS3.Void createVoid()
  {
    VoidImpl void_ = new VoidImpl();
    return void_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalOp createTerminalOp()
  {
    TerminalOpImpl terminalOp = new TerminalOpImpl();
    return terminalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue)
  {
    AccessLevel result = AccessLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS3Package getAS3Package()
  {
    return (AS3Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AS3Package getPackage()
  {
    return AS3Package.eINSTANCE;
  }

} //AS3FactoryImpl
