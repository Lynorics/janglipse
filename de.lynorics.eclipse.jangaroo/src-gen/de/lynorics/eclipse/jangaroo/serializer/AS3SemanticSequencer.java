package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.AccessorRole;
import de.lynorics.eclipse.jangaroo.aS3.Annotation;
import de.lynorics.eclipse.jangaroo.aS3.Block;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.DefaultStatement;
import de.lynorics.eclipse.jangaroo.aS3.DoWhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForEachStatement;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.Imports;
import de.lynorics.eclipse.jangaroo.aS3.Interface;
import de.lynorics.eclipse.jangaroo.aS3.InterfaceMethod;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberVariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.Modifier;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.NumberConstant;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.RegexpConstant;
import de.lynorics.eclipse.jangaroo.aS3.ReturnStatement;
import de.lynorics.eclipse.jangaroo.aS3.Statement;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.Undefined;
import de.lynorics.eclipse.jangaroo.aS3.Uses;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.WhileStatement;
import de.lynorics.eclipse.jangaroo.aS3.WithStatement;
import de.lynorics.eclipse.jangaroo.aS3.XmlConstant;
import de.lynorics.eclipse.jangaroo.aS3.additiveExpression;
import de.lynorics.eclipse.jangaroo.aS3.annotationField;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.arrayLiteral;
import de.lynorics.eclipse.jangaroo.aS3.basicParameterDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.bitwiseXorExpression;
import de.lynorics.eclipse.jangaroo.aS3.conditionalSubExpression;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.e4xAttributeIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.elementList;
import de.lynorics.eclipse.jangaroo.aS3.equalityExpression;
import de.lynorics.eclipse.jangaroo.aS3.expressionList;
import de.lynorics.eclipse.jangaroo.aS3.fieldList;
import de.lynorics.eclipse.jangaroo.aS3.fieldName;
import de.lynorics.eclipse.jangaroo.aS3.forCond;
import de.lynorics.eclipse.jangaroo.aS3.forInClause;
import de.lynorics.eclipse.jangaroo.aS3.forInit;
import de.lynorics.eclipse.jangaroo.aS3.forIter;
import de.lynorics.eclipse.jangaroo.aS3.fullNewSubexpression;
import de.lynorics.eclipse.jangaroo.aS3.functionCommon;
import de.lynorics.eclipse.jangaroo.aS3.functionExpression;
import de.lynorics.eclipse.jangaroo.aS3.functionSignature;
import de.lynorics.eclipse.jangaroo.aS3.identi;
import de.lynorics.eclipse.jangaroo.aS3.identifier;
import de.lynorics.eclipse.jangaroo.aS3.literalField;
import de.lynorics.eclipse.jangaroo.aS3.logicalAndExpression;
import de.lynorics.eclipse.jangaroo.aS3.logicalOrExpression;
import de.lynorics.eclipse.jangaroo.aS3.multiplicativeExpression;
import de.lynorics.eclipse.jangaroo.aS3.namespaceName;
import de.lynorics.eclipse.jangaroo.aS3.newExpression;
import de.lynorics.eclipse.jangaroo.aS3.objectLiteral;
import de.lynorics.eclipse.jangaroo.aS3.parameterDeclarationList;
import de.lynorics.eclipse.jangaroo.aS3.parameterRestDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.postfixExpression;
import de.lynorics.eclipse.jangaroo.aS3.primaryExpression;
import de.lynorics.eclipse.jangaroo.aS3.propOrIdent;
import de.lynorics.eclipse.jangaroo.aS3.propertyIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.qualifiedIdent;
import de.lynorics.eclipse.jangaroo.aS3.qualifier;
import de.lynorics.eclipse.jangaroo.aS3.regexpLiteral;
import de.lynorics.eclipse.jangaroo.aS3.relationalExpression;
import de.lynorics.eclipse.jangaroo.aS3.shiftExpression;
import de.lynorics.eclipse.jangaroo.aS3.simpleQualifiedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.switchBlock;
import de.lynorics.eclipse.jangaroo.aS3.switchStatementList;
import de.lynorics.eclipse.jangaroo.aS3.traditionalForClause;
import de.lynorics.eclipse.jangaroo.aS3.typeExpression;
import de.lynorics.eclipse.jangaroo.aS3.unaryExpression;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AS3SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AS3GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AS3Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AS3Package.ACCESSOR_ROLE:
				if(context == grammarAccess.getAccessorRoleRule()) {
					sequence_AccessorRole(context, (AccessorRole) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getFinallyBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BOOL_CONSTANT:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (de.lynorics.eclipse.jangaroo.aS3.Class) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.DEFAULT_STATEMENT:
				if(context == grammarAccess.getDefaultStatementRule()) {
					sequence_DefaultStatement(context, (DefaultStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.DO_WHILE_STATEMENT:
				if(context == grammarAccess.getDoWhileStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_DoWhileStatement(context, (DoWhileStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_EACH_STATEMENT:
				if(context == grammarAccess.getForEachStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForEachStatement(context, (ForEachStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IMPORTS:
				if(context == grammarAccess.getImportsRule()) {
					sequence_Imports(context, (Imports) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.INTERFACE:
				if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.INTERFACE_METHOD:
				if(context == grammarAccess.getInterfaceMethodRule()) {
					sequence_InterfaceMethod(context, (InterfaceMethod) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MEMBER_VARIABLE_DECLARATION:
				if(context == grammarAccess.getMemberVariableDeclarationRule()) {
					sequence_MemberVariableDeclaration(context, (MemberVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.METHOD_BODY:
				if(context == grammarAccess.getMethodBodyRule()) {
					sequence_MethodBody(context, (MethodBody) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MODIFIER:
				if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NULL:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (Null) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NUMBER_CONSTANT:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (NumberConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (de.lynorics.eclipse.jangaroo.aS3.Package) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.REGEXP_CONSTANT:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (RegexpConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STRING_CONSTANT:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SYMBOL_REF:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (SymbolRef) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.THIS:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (This) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TRY_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTryStatementRule()) {
					sequence_TryStatement(context, (TryStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.UNDEFINED:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (Undefined) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.USES:
				if(context == grammarAccess.getUsesRule()) {
					sequence_Uses(context, (Uses) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.VARIABLE_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getForInClauseDeclRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.WHILE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.WITH_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWithStatementRule()) {
					sequence_WithStatement(context, (WithStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.XML_CONSTANT:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (XmlConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_additiveExpression(context, (additiveExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ANNOTATION_FIELD:
				if(context == grammarAccess.getAnnotationFieldRule()) {
					sequence_annotationField(context, (annotationField) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ANNOTATION_FIELDS:
				if(context == grammarAccess.getAnnotationFieldsRule()) {
					sequence_annotationFields(context, (annotationFields) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ARGUMENTS:
				if(context == grammarAccess.getArgumentsRule()) {
					sequence_arguments(context, (arguments) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ARRAY_LITERAL:
				if(context == grammarAccess.getArrayLiteralRule()) {
					sequence_arrayLiteral(context, (arrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BASIC_PARAMETER_DECLARATION:
				if(context == grammarAccess.getBasicParameterDeclarationRule() ||
				   context == grammarAccess.getParameterDeclarationRule()) {
					sequence_basicParameterDeclaration(context, (basicParameterDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BITWISE_AND_EXPRESSION:
				if(context == grammarAccess.getBitwiseAndExpressionRule()) {
					sequence_bitwiseAndExpression(context, (bitwiseAndExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BITWISE_OR_EXPRESSION:
				if(context == grammarAccess.getBitwiseOrExpressionRule()) {
					sequence_bitwiseOrExpression(context, (bitwiseOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BITWISE_XOR_EXPRESSION:
				if(context == grammarAccess.getBitwiseXorExpressionRule()) {
					sequence_bitwiseXorExpression(context, (bitwiseXorExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CONDITIONAL_SUB_EXPRESSION:
				if(context == grammarAccess.getConditionalSubExpressionRule()) {
					sequence_conditionalSubExpression(context, (conditionalSubExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule()) {
					sequence_directive(context, (directive) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.E4X_ATTRIBUTE_IDENTIFIER:
				if(context == grammarAccess.getE4xAttributeIdentifierRule() ||
				   context == grammarAccess.getQualifiedIdentifierRule()) {
					sequence_e4xAttributeIdentifier(context, (e4xAttributeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ELEMENT_LIST:
				if(context == grammarAccess.getElementListRule()) {
					sequence_elementList(context, (elementList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_equalityExpression(context, (equalityExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getExpressionListRule() ||
				   context == grammarAccess.getForInClauseTailRule()) {
					sequence_expressionList(context, (expressionList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FIELD_LIST:
				if(context == grammarAccess.getFieldListRule()) {
					sequence_fieldList(context, (fieldList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FIELD_NAME:
				if(context == grammarAccess.getFieldNameRule()) {
					sequence_fieldName(context, (fieldName) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_COND:
				if(context == grammarAccess.getForCondRule()) {
					sequence_forCond(context, (forCond) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_IN_CLAUSE:
				if(context == grammarAccess.getForInClauseRule()) {
					sequence_forInClause(context, (forInClause) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_INIT:
				if(context == grammarAccess.getForInitRule()) {
					sequence_forInit(context, (forInit) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_ITER:
				if(context == grammarAccess.getForIterRule()) {
					sequence_forIter(context, (forIter) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FULL_NEW_SUBEXPRESSION:
				if(context == grammarAccess.getFullNewSubexpressionRule()) {
					sequence_fullNewSubexpression(context, (fullNewSubexpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FUNCTION_COMMON:
				if(context == grammarAccess.getFunctionCommonRule()) {
					sequence_functionCommon(context, (functionCommon) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getFunctionExpressionRule()) {
					sequence_functionExpression(context, (functionExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FUNCTION_SIGNATURE:
				if(context == grammarAccess.getFunctionSignatureRule()) {
					sequence_functionSignature(context, (functionSignature) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IDENTI:
				if(context == grammarAccess.getCatchBlockRule()) {
					sequence_catchBlock(context, (identi) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFieldNameRule() ||
				   context == grammarAccess.getForInClauseDeclRule() ||
				   context == grammarAccess.getIdentiRule() ||
				   context == grammarAccess.getPropertyIdentifierRule() ||
				   context == grammarAccess.getQualifierRule()) {
					sequence_identi(context, (identi) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IDENTIFIER:
				if(context == grammarAccess.getIdentifierRule()) {
					sequence_identifier(context, (identifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.LITERAL_FIELD:
				if(context == grammarAccess.getLiteralFieldRule()) {
					sequence_literalField(context, (literalField) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.LOGICAL_AND_EXPRESSION:
				if(context == grammarAccess.getLogicalAndExpressionRule()) {
					sequence_logicalAndExpression(context, (logicalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.LOGICAL_OR_EXPRESSION:
				if(context == grammarAccess.getCaseStatementRule()) {
					sequence_CaseStatement_assignmentExpression_conditionalExpression_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSwitchStatementRule()) {
					sequence_SwitchStatement_assignmentExpression_conditionalExpression_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionQualifiedIdentifierRule() ||
				   context == grammarAccess.getNonAttributeQualifiedIdentifierRule() ||
				   context == grammarAccess.getQualifiedIdentifierRule()) {
					sequence_assignmentExpression_conditionalExpression_expressionQualifiedIdentifier_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getDefaultXMLNamespaceStatementRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getThrowStatementRule() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEncapsulatedExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getParameterDefaultRule()) {
					sequence_assignmentExpression_conditionalExpression_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getElementListRule() ||
				   context == grammarAccess.getNonemptyElementListRule()) {
					sequence_assignmentExpression_conditionalExpression_logicalOrExpression_nonemptyElementList(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionalExpressionRule()) {
					sequence_conditionalExpression_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLogicalOrExpressionRule()) {
					sequence_logicalOrExpression(context, (logicalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_multiplicativeExpression(context, (multiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NAMESPACE_NAME:
				if(context == grammarAccess.getNamespaceNameRule()) {
					sequence_namespaceName(context, (namespaceName) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQualifiedIdentRule()) {
					sequence_qualifiedIdent(context, (namespaceName) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NEW_EXPRESSION:
				if(context == grammarAccess.getNewExpressionRule()) {
					sequence_newExpression(context, (newExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.OBJECT_LITERAL:
				if(context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectLiteralRule()) {
					sequence_objectLiteral(context, (objectLiteral) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETER_DECLARATION_LIST:
				if(context == grammarAccess.getParameterDeclarationListRule()) {
					sequence_parameterDeclarationList(context, (parameterDeclarationList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETER_REST_DECLARATION:
				if(context == grammarAccess.getParameterDeclarationRule() ||
				   context == grammarAccess.getParameterRestDeclarationRule()) {
					sequence_parameterRestDeclaration(context, (parameterRestDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.POSTFIX_EXPRESSION:
				if(context == grammarAccess.getPostfixExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionNotPlusMinusRule()) {
					sequence_postfixExpression(context, (postfixExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_primaryExpression(context, (primaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PROP_OR_IDENT:
				if(context == grammarAccess.getPropOrIdentRule()) {
					sequence_propOrIdent(context, (propOrIdent) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PROPERTY_IDENTIFIER:
				if(context == grammarAccess.getPropertyIdentifierRule() ||
				   context == grammarAccess.getQualifierRule()) {
					sequence_propertyIdentifier(context, (propertyIdentifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.QUALIFIED_IDENT:
				if(context == grammarAccess.getQualifiedIdentRule()) {
					sequence_qualifiedIdent(context, (qualifiedIdent) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.QUALIFIER:
				if(context == grammarAccess.getQualifierRule()) {
					sequence_qualifier(context, (qualifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.REGEXP_LITERAL:
				if(context == grammarAccess.getRegexpLiteralRule()) {
					sequence_regexpLiteral(context, (regexpLiteral) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_relationalExpression(context, (relationalExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SHIFT_EXPRESSION:
				if(context == grammarAccess.getShiftExpressionRule()) {
					sequence_shiftExpression(context, (shiftExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SIMPLE_QUALIFIED_IDENTIFIER:
				if(context == grammarAccess.getNonAttributeQualifiedIdentifierRule() ||
				   context == grammarAccess.getQualifiedIdentifierRule() ||
				   context == grammarAccess.getSimpleQualifiedIdentifierRule()) {
					sequence_simpleQualifiedIdentifier(context, (simpleQualifiedIdentifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SWITCH_BLOCK:
				if(context == grammarAccess.getSwitchBlockRule()) {
					sequence_switchBlock(context, (switchBlock) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SWITCH_STATEMENT_LIST:
				if(context == grammarAccess.getSwitchStatementListRule()) {
					sequence_switchStatementList(context, (switchStatementList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TRADITIONAL_FOR_CLAUSE:
				if(context == grammarAccess.getTraditionalForClauseRule()) {
					sequence_traditionalForClause(context, (traditionalForClause) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TYPE_EXPRESSION:
				if(context == grammarAccess.getTypeExpressionRule()) {
					sequence_typeExpression(context, (typeExpression) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionNotPlusMinusRule()) {
					sequence_unaryExpression(context, (unaryExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     accessor=ID
	 */
	protected void sequence_AccessorRole(EObject context, AccessorRole semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.ACCESSOR_ROLE__ACCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.ACCESSOR_ROLE__ACCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessorRoleAccess().getAccessorIDTerminalRuleCall_0(), semanticObject.getAccessor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID annonFields=annotationFields?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr+=logicalAndExpression 
	 *         (o+=logicalOrOperator expr+=logicalAndExpression)* 
	 *         cond=conditionalSubExpression? 
	 *         (op+=assignmentOperator aexpr+=Expression?)* 
	 *         l=switchStatementList
	 *     )
	 */
	protected void sequence_CaseStatement_assignmentExpression_conditionalExpression_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         modifier=Modifier? 
	 *         name=ID 
	 *         superclass=[Class|QualifiedName]? 
	 *         (types+=[Interface|QualifiedName] types+=[Interface|QualifiedName]*)? 
	 *         members+=Member*
	 *     )
	 */
	protected void sequence_Class(EObject context, de.lynorics.eclipse.jangaroo.aS3.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     l=switchStatementList
	 */
	protected void sequence_DefaultStatement(EObject context, DefaultStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.DEFAULT_STATEMENT__L) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.DEFAULT_STATEMENT__L));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultStatementAccess().getLSwitchStatementListParserRuleCall_2_0(), semanticObject.getL());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (state=Statement cond=Condition)
	 */
	protected void sequence_DoWhileStatement(EObject context, DoWhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fesfor=forInClause fes=Statement)
	 */
	protected void sequence_ForEachStatement(EObject context, ForEachStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((forIn=forInClause fsstate=Statement) | (traditionalForClause=traditionalForClause fsstate=Statement))
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Condition statement=Statement else=Statement?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import*)
	 */
	protected void sequence_Imports(EObject context, Imports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         modifier=Modifier? 
	 *         accessor=AccessorRole? 
	 *         name=ID 
	 *         (params+=Parameter params+=Parameter*)? 
	 *         (type=[Interface|QualifiedName] | type=[Class|QualifiedName])?
	 *     )
	 */
	protected void sequence_InterfaceMethod(EObject context, InterfaceMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* access=AccessLevel? name=ID superclass=[Interface|QualifiedName]? members+=InterfaceMethod*)
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         modifier=Modifier? 
	 *         name=ID 
	 *         (type=[Interface|QualifiedName] | type=[Class|QualifiedName])? 
	 *         Expression=assignmentExpression?
	 *     )
	 */
	protected void sequence_MemberVariableDeclaration(EObject context, MemberVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=MemberVariableDeclaration | meth=Method)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_MethodBody(EObject context, MethodBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         modifier=Modifier? 
	 *         accessor=AccessorRole? 
	 *         name=ID 
	 *         (params+=Parameter params+=Parameter*)? 
	 *         (type=[Interface|QualifiedName] | type=[Class|QualifiedName])? 
	 *         body=Block?
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         package=Package | 
	 *         (imp=Imports (members+=Method | members+=InterfaceMethod | members+=MemberVariableDeclaration)* (classes+=Class | classes+=Interface)*)
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static'? final?='final'? native?='native'? dynamic?='dynamic'? access=AccessLevel?)
	 */
	protected void sequence_Modifier(EObject context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName? 
	 *         imp=Imports 
	 *         directives+=directive* 
	 *         (members+=Method | members+=InterfaceMethod | members+=MemberVariableDeclaration)* 
	 *         (classes+=Class | classes+=Interface)*
	 *     )
	 */
	protected void sequence_Package(EObject context, de.lynorics.eclipse.jangaroo.aS3.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=[Interface|QualifiedName] | type=[Class|QualifiedName])? lit=exprOrObjectLiteral?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     assert=Condition?
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr+=logicalAndExpression 
	 *         (o+=logicalOrOperator expr+=logicalAndExpression)* 
	 *         cond=conditionalSubExpression? 
	 *         (op+=assignmentOperator aexpr+=Expression?)* 
	 *         switch=switchBlock
	 *     )
	 */
	protected void sequence_SwitchStatement_assignmentExpression_conditionalExpression_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_TerminalExpression(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Null}
	 */
	protected void sequence_TerminalExpression(EObject context, Null semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=number
	 */
	protected void sequence_TerminalExpression(EObject context, NumberConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=regexpLiteral
	 */
	protected void sequence_TerminalExpression(EObject context, RegexpConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_TerminalExpression(EObject context, StringConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         symbol=[MemberVariableDeclaration|ID] | 
	 *         symbol=[VariableDeclaration|ID] | 
	 *         symbol=[Parameter|ID] | 
	 *         symbol=[Class|ID] | 
	 *         symbol=[Interface|ID] | 
	 *         symbol=[Method|ID] | 
	 *         symbol=[InterfaceMethod|ID] | 
	 *         symbol=[basicParameterDeclaration|ID]
	 *     )
	 */
	protected void sequence_TerminalExpression(EObject context, SymbolRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {This}
	 */
	protected void sequence_TerminalExpression(EObject context, This semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Undefined}
	 */
	protected void sequence_TerminalExpression(EObject context, Undefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=xmlLiteral
	 */
	protected void sequence_TerminalExpression(EObject context, XmlConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block (finally=finallyBlock | (catch+=catchBlock+ finally=finallyBlock?)))
	 */
	protected void sequence_TryStatement(EObject context, TryStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedName?)
	 */
	protected void sequence_Uses(EObject context, Uses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=[Interface|QualifiedName] | type=[Class|QualifiedName])? Expression=assignmentExpression?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Condition statement=Statement)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Condition statement=Statement)
	 */
	protected void sequence_WithStatement(EObject context, WithStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=multiplicativeExpression (o+=additiveOperator expr+=multiplicativeExpression)*)
	 */
	protected void sequence_additiveExpression(EObject context, additiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) expr=Expression?)
	 */
	protected void sequence_annotationField(EObject context, annotationField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annonFields+=annotationField annonFields+=annotationField*)
	 */
	protected void sequence_annotationFields(EObject context, annotationFields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprList=expressionList?)
	 */
	protected void sequence_arguments(EObject context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=elementList?)
	 */
	protected void sequence_arrayLiteral(EObject context, arrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr+=logicalAndExpression 
	 *         (o+=logicalOrOperator expr+=logicalAndExpression)* 
	 *         cond=conditionalSubExpression? 
	 *         (op+=assignmentOperator aexpr+=Expression?)* 
	 *         (pden=propertyIdentifier | bra=brackets)
	 *     )
	 */
	protected void sequence_assignmentExpression_conditionalExpression_expressionQualifiedIdentifier_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr+=logicalAndExpression 
	 *         (o+=logicalOrOperator expr+=logicalAndExpression)* 
	 *         cond=conditionalSubExpression? 
	 *         (op+=assignmentOperator aexpr+=Expression?)*
	 *     )
	 */
	protected void sequence_assignmentExpression_conditionalExpression_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr+=logicalAndExpression 
	 *         (o+=logicalOrOperator expr+=logicalAndExpression)* 
	 *         cond=conditionalSubExpression? 
	 *         (op+=assignmentOperator aexpr+=Expression?)* 
	 *         expr+=assignmentExpression*
	 *     )
	 */
	protected void sequence_assignmentExpression_conditionalExpression_logicalOrExpression_nonemptyElementList(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identi type=typeExpression? param=parameterDefault?)
	 */
	protected void sequence_basicParameterDeclaration(EObject context, basicParameterDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=equalityExpression (o+='&' expr+=equalityExpression)*)
	 */
	protected void sequence_bitwiseAndExpression(EObject context, bitwiseAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=bitwiseXorExpression (o+='|' expr+=bitwiseXorExpression)*)
	 */
	protected void sequence_bitwiseOrExpression(EObject context, bitwiseOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=bitwiseAndExpression (o+='^' expr+=bitwiseAndExpression)*)
	 */
	protected void sequence_bitwiseXorExpression(EObject context, bitwiseXorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=typeExpression? block=Block)
	 */
	protected void sequence_catchBlock(EObject context, identi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=logicalAndExpression (o+=logicalOrOperator expr+=logicalAndExpression)* cond=conditionalSubExpression?)
	 */
	protected void sequence_conditionalExpression_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr1=assignmentExpression expr2=assignmentExpression)
	 */
	protected void sequence_conditionalSubExpression(EObject context, conditionalSubExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.CONDITIONAL_SUB_EXPRESSION__EXPR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.CONDITIONAL_SUB_EXPRESSION__EXPR1));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.CONDITIONAL_SUB_EXPRESSION__EXPR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.CONDITIONAL_SUB_EXPRESSION__EXPR2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalSubExpressionAccess().getExpr1AssignmentExpressionParserRuleCall_0_0(), semanticObject.getExpr1());
		feeder.accept(grammarAccess.getConditionalSubExpressionAccess().getExpr2AssignmentExpressionParserRuleCall_2_0(), semanticObject.getExpr2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (uses=Uses?)
	 */
	protected void sequence_directive(EObject context, directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((qual=qualifiedIdent | expr=Expression)?)
	 */
	protected void sequence_e4xAttributeIdentifier(EObject context, e4xAttributeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {elementList}
	 */
	protected void sequence_elementList(EObject context, elementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=relationalExpression (o+=equalityOperator expr+=relationalExpression)*)
	 */
	protected void sequence_equalityExpression(EObject context, equalityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=assignmentExpression expr+=assignmentExpression*)
	 */
	protected void sequence_expressionList(EObject context, expressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lf=literalField fields+=literalField*)
	 */
	protected void sequence_fieldList(EObject context, fieldList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     number=number
	 */
	protected void sequence_fieldName(EObject context, fieldName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FIELD_NAME__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FIELD_NAME__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldNameAccess().getNumberNumberParserRuleCall_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=expressionList?)
	 */
	protected void sequence_forCond(EObject context, forCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ficdecl=forInClauseDecl fictail=forInClauseTail)
	 */
	protected void sequence_forInClause(EObject context, forInClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FOR_IN_CLAUSE__FICDECL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FOR_IN_CLAUSE__FICDECL));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FOR_IN_CLAUSE__FICTAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FOR_IN_CLAUSE__FICTAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForInClauseAccess().getFicdeclForInClauseDeclParserRuleCall_0_0(), semanticObject.getFicdecl());
		feeder.accept(grammarAccess.getForInClauseAccess().getFictailForInClauseTailParserRuleCall_2_0(), semanticObject.getFictail());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((decl=VariableDeclaration | expr=expressionList)?)
	 */
	protected void sequence_forInit(EObject context, forInit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fiexpr=expressionList?)
	 */
	protected void sequence_forIter(EObject context, forIter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=primaryExpression ((fnsd+='.' quali+=qualifiedIdent) | brack+=brackets)*)
	 */
	protected void sequence_fullNewSubexpression(EObject context, fullNewSubexpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sig=functionSignature block=Block)
	 */
	protected void sequence_functionCommon(EObject context, functionCommon semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FUNCTION_COMMON__SIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FUNCTION_COMMON__SIG));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.FUNCTION_COMMON__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.FUNCTION_COMMON__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionCommonAccess().getSigFunctionSignatureParserRuleCall_0_0(), semanticObject.getSig());
		feeder.accept(grammarAccess.getFunctionCommonAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? func=functionCommon)
	 */
	protected void sequence_functionExpression(EObject context, functionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (param=parameterDeclarationList type=typeExpression?)
	 */
	protected void sequence_functionSignature(EObject context, functionSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {identi}
	 */
	protected void sequence_identi(EObject context, identi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qual=qualifiedIdent poi+=propOrIdent*)
	 */
	protected void sequence_identifier(EObject context, identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=fieldName el=element)
	 */
	protected void sequence_literalField(EObject context, literalField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.LITERAL_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.LITERAL_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.LITERAL_FIELD__EL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.LITERAL_FIELD__EL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralFieldAccess().getNameFieldNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLiteralFieldAccess().getElElementParserRuleCall_2_0(), semanticObject.getEl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=bitwiseOrExpression (o+=logicalAndOperator expr+=bitwiseOrExpression)*)
	 */
	protected void sequence_logicalAndExpression(EObject context, logicalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=logicalAndExpression (o+=logicalOrOperator expr+=logicalAndExpression)*)
	 */
	protected void sequence_logicalOrExpression(EObject context, logicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=unaryExpression (o+=multiplicativeOperator expr+=unaryExpression)*)
	 */
	protected void sequence_multiplicativeExpression(EObject context, multiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {namespaceName}
	 */
	protected void sequence_namespaceName(EObject context, namespaceName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=[Interface|QualifiedName] | type=[Class|QualifiedName]) args+=arguments?)
	 */
	protected void sequence_newExpression(EObject context, newExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=fieldList?)
	 */
	protected void sequence_objectLiteral(EObject context, objectLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((params+=Parameter params+=Parameter*)?)
	 */
	protected void sequence_parameterDeclarationList(EObject context, parameterDeclarationList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identi?)
	 */
	protected void sequence_parameterRestDeclaration(EObject context, parameterRestDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         peexpr=primaryExpression 
	 *         (
	 *             pepoi+=propOrIdent | 
	 *             expr+=Expression | 
	 *             pewi+=qualifiedIdentifier | 
	 *             expr+=Expression | 
	 *             e4x+=e4xAttributeIdentifier | 
	 *             args+=arguments
	 *         )* 
	 *         (in='++' | de='--')?
	 *     )
	 */
	protected void sequence_postfixExpression(EObject context, postfixExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             superExpr=Expression? | 
	 *             con=TerminalExpression | 
	 *             lit=arrayLiteral | 
	 *             lit=objectLiteral | 
	 *             fexpr=functionExpression | 
	 *             nexpr=newExpression | 
	 *             encexpr=encapsulatedExpression | 
	 *             e4x=e4xAttributeIdentifier | 
	 *             qual=qualifiedIdent
	 *         )?
	 *     )
	 */
	protected void sequence_primaryExpression(EObject context, primaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     propId=qualifiedIdent
	 */
	protected void sequence_propOrIdent(EObject context, propOrIdent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.PROP_OR_IDENT__PROP_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.PROP_OR_IDENT__PROP_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropOrIdentAccess().getPropIdQualifiedIdentParserRuleCall_1_0(), semanticObject.getPropId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {propertyIdentifier}
	 */
	protected void sequence_propertyIdentifier(EObject context, propertyIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ide=identi
	 */
	protected void sequence_qualifiedIdent(EObject context, namespaceName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ide=identi
	 */
	protected void sequence_qualifiedIdent(EObject context, qualifiedIdent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.QUALIFIED_IDENT__IDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.QUALIFIED_IDENT__IDE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedIdentAccess().getIdeIdentiParserRuleCall_1_0(), semanticObject.getIde());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     level=AccessLevel
	 */
	protected void sequence_qualifier(EObject context, qualifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.QUALIFIER__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.QUALIFIER__LEVEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifierAccess().getLevelAccessLevelEnumRuleCall_1_0(), semanticObject.getLevel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     s='/'
	 */
	protected void sequence_regexpLiteral(EObject context, regexpLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.REGEXP_LITERAL__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.REGEXP_LITERAL__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegexpLiteralAccess().getSSolidusKeyword_0(), semanticObject.getS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=shiftExpression (o+=relationalOperator expr+=shiftExpression)*)
	 */
	protected void sequence_relationalExpression(EObject context, relationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr+=additiveExpression (o+=shiftOperator expr+=additiveExpression)*)
	 */
	protected void sequence_shiftExpression(EObject context, shiftExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (proId=propertyIdentifier | (qual=qualifier (piden=propertyIdentifier | bra=brackets)))
	 */
	protected void sequence_simpleQualifiedIdentifier(EObject context, simpleQualifiedIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (case+=CaseStatement* def=DefaultStatement?)
	 */
	protected void sequence_switchBlock(EObject context, switchBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_switchStatementList(EObject context, switchStatementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=forInit b=forCond c=forIter)
	 */
	protected void sequence_traditionalForClause(EObject context, traditionalForClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__A));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__B));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__C) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.TRADITIONAL_FOR_CLAUSE__C));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTraditionalForClauseAccess().getAForInitParserRuleCall_0_0(), semanticObject.getA());
		feeder.accept(grammarAccess.getTraditionalForClauseAccess().getBForCondParserRuleCall_2_0(), semanticObject.getB());
		feeder.accept(grammarAccess.getTraditionalForClauseAccess().getCForIterParserRuleCall_4_0(), semanticObject.getC());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((identi=[Interface|QualifiedName] | identi=[Class|QualifiedName])?)
	 */
	protected void sequence_typeExpression(EObject context, typeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((in='++' expr=unaryExpression) | (de='--' expr=unaryExpression) | uaem=unaryExpression | uaep=unaryExpression | uaenpm=unaryExpressionNotPlusMinus)
	 */
	protected void sequence_unaryExpression(EObject context, unaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
