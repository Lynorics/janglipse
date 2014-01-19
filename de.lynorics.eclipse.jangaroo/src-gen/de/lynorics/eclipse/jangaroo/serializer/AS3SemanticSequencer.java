package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.Assignment;
import de.lynorics.eclipse.jangaroo.aS3.BoolConstant;
import de.lynorics.eclipse.jangaroo.aS3.ForStatement;
import de.lynorics.eclipse.jangaroo.aS3.IfBlock;
import de.lynorics.eclipse.jangaroo.aS3.IfStatement;
import de.lynorics.eclipse.jangaroo.aS3.Import;
import de.lynorics.eclipse.jangaroo.aS3.IntConstant;
import de.lynorics.eclipse.jangaroo.aS3.Member;
import de.lynorics.eclipse.jangaroo.aS3.MemberSelection;
import de.lynorics.eclipse.jangaroo.aS3.Method;
import de.lynorics.eclipse.jangaroo.aS3.MethodBody;
import de.lynorics.eclipse.jangaroo.aS3.Model;
import de.lynorics.eclipse.jangaroo.aS3.New;
import de.lynorics.eclipse.jangaroo.aS3.Null;
import de.lynorics.eclipse.jangaroo.aS3.Parameter;
import de.lynorics.eclipse.jangaroo.aS3.Parameters;
import de.lynorics.eclipse.jangaroo.aS3.Return;
import de.lynorics.eclipse.jangaroo.aS3.StatementsBlock;
import de.lynorics.eclipse.jangaroo.aS3.StringConstant;
import de.lynorics.eclipse.jangaroo.aS3.Super;
import de.lynorics.eclipse.jangaroo.aS3.Switch;
import de.lynorics.eclipse.jangaroo.aS3.SymbolRef;
import de.lynorics.eclipse.jangaroo.aS3.This;
import de.lynorics.eclipse.jangaroo.aS3.TryStatement;
import de.lynorics.eclipse.jangaroo.aS3.VariableDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.While;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.typeRelation;
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
			case AS3Package.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.BOOL_CONSTANT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (de.lynorics.eclipse.jangaroo.aS3.Class) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (de.lynorics.eclipse.jangaroo.aS3.Class) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IF_BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getIfBlockRule()) {
					sequence_IfBlock(context, (IfBlock) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
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
			case AS3Package.INT_CONSTANT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MEMBER_SELECTION:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_SelectionExpression(context, (MemberSelection) semanticObject); 
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
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getMethodBodyRule()) {
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
			case AS3Package.NEW:
				if(context == grammarAccess.getNewStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_NewStatement(context, (New) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NULL:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (Null) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PACKAGE:
				if(context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (de.lynorics.eclipse.jangaroo.aS3.Package) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getSymbolRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETERS:
				if(context == grammarAccess.getParametersRule()) {
					sequence_Parameters(context, (Parameters) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.RETURN:
				if(context == grammarAccess.getReturnRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STATEMENTS_BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getIfBlockRule() ||
				   context == grammarAccess.getStatementsBlockRule()) {
					sequence_StatementsBlock(context, (StatementsBlock) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STRING_CONSTANT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SUPER:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (Super) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SWITCH:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSwitchStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_SwitchStatement(context, (Switch) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.SYMBOL_REF:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (SymbolRef) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.THIS:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionRule() ||
				   context == grammarAccess.getSelectionExpressionAccess().getMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TerminalExpression(context, (This) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TRY_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTryStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_TryStatement(context, (TryStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.VARIABLE_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSymbolRule() ||
				   context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.WHILE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_DoWhileStatement_Statement_WhileStatement(context, (While) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDoWhileStatementRule()) {
					sequence_DoWhileStatement(context, (While) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (While) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.COMMA_EXPR:
				if(context == grammarAccess.getCommaExprRule()) {
					sequence_commaExpr(context, (commaExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IDENTIFIER_DECLARATION:
				if(context == grammarAccess.getIdentifierDeclarationRule()) {
					sequence_identifierDeclaration(context, (identifierDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.OBJECT_FIELDS:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getObjectFieldsRule() ||
				   context == grammarAccess.getObjectLiteralRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_objectFields(context, (objectFields) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARENTHESIZED_EXPR:
				if(context == grammarAccess.getParenthesizedExprRule()) {
					sequence_parenthesizedExpr(context, (parenthesizedExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TYPE_RELATION:
				if(context == grammarAccess.getTypeRelationRule()) {
					sequence_typeRelation(context, (typeRelation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Assignment_Assignment_1_0 right=Expression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.ASSIGNMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.ASSIGNMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.ASSIGNMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (access=AccessLevel? name=ID superclass=[Class|QualifiedName]? (types+=[Class|QualifiedName] types+=[Class|QualifiedName]*)? members+=Member*)
	 */
	protected void sequence_Class(EObject context, de.lynorics.eclipse.jangaroo.aS3.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((cond=parenthesizedExpr whileBlock=StatementsBlock) | (whileBlock=StatementsBlock cond=parenthesizedExpr))
	 */
	protected void sequence_DoWhileStatement_Statement_WhileStatement(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (whileBlock=StatementsBlock cond=parenthesizedExpr)
	 */
	protected void sequence_DoWhileStatement(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.WHILE__WHILE_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.WHILE__WHILE_BLOCK));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.WHILE__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.WHILE__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_2_0(), semanticObject.getWhileBlock());
		feeder.accept(grammarAccess.getDoWhileStatementAccess().getCondParenthesizedExprParserRuleCall_4_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (forinit=commaExpr? condition=commaExpr? iterator=commaExpr? command=StatementsBlock) | 
	 *         (elements+=identifierDeclaration elements+=identifierDeclaration* condition=commaExpr? iterator=commaExpr? command=StatementsBlock) | 
	 *         (nameForin=ID forinexpr=Expression forcommand=StatementsBlock) | 
	 *         (nameForeachh=ID relation=typeRelation? foreachexpr=Expression foreachcommand=StatementsBlock)
	 *     )
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement
	 */
	protected void sequence_IfBlock(EObject context, IfBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression thenBlock=IfBlock elseBlock=IfBlock?)
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
	 *     (access=AccessLevel? name=ID superclass=[Class|QualifiedName]? members+=Member*)
	 */
	protected void sequence_Interface(EObject context, de.lynorics.eclipse.jangaroo.aS3.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=VariableDeclaration | meth=Method)
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
	 *     (access=AccessLevel? name=ID (params+=Parameter params+=Parameter*)? type=[Class|QualifiedName]? body=MethodBody)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* classes+=Class*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Class|QualifiedName] param=Parameters?)
	 */
	protected void sequence_NewStatement(EObject context, New semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* (classes+=Class | classes+=Interface)*)
	 */
	protected void sequence_Package(EObject context, de.lynorics.eclipse.jangaroo.aS3.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rel=typeRelation? lit=exprOrObjectLiteral?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Parameter elements+=Parameter*)? | ((elements+=Parameter elements+=Parameter*)? name=ID rel=typeRelation?))
	 */
	protected void sequence_Parameters(EObject context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.RETURN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.RETURN__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (receiver=SelectionExpression_MemberSelection_1_0 member=[Member|ID] (methodinvocation?='(' (args+=Expression args+=Expression*)?)?)
	 */
	protected void sequence_SelectionExpression(EObject context, MemberSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_StatementsBlock(EObject context, StatementsBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=parenthesizedExpr cases+=statementInSwitch*)
	 */
	protected void sequence_SwitchStatement(EObject context, Switch semanticObject) {
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
	 *     value=INT
	 */
	protected void sequence_TerminalExpression(EObject context, IntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     value=STRING
	 */
	protected void sequence_TerminalExpression(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Super}
	 */
	protected void sequence_TerminalExpression(EObject context, Super semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     symbol=[Symbol|ID]
	 */
	protected void sequence_TerminalExpression(EObject context, SymbolRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.SYMBOL_REF__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.SYMBOL_REF__SYMBOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_6_1_0_1(), semanticObject.getSymbol());
		feeder.finish();
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
	 *     (statements+=Statement+ params+=Parameter? finallyBlock=StatementsBlock?)
	 */
	protected void sequence_TryStatement(EObject context, TryStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[Class|QualifiedName] expression=Expression?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=parenthesizedExpr whileBlock=StatementsBlock)
	 */
	protected void sequence_WhileStatement(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.WHILE__WHILE_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.WHILE__WHILE_BLOCK));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.WHILE__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.WHILE__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getCondParenthesizedExprParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getWhileStatementAccess().getWhileBlockStatementsBlockParserRuleCall_3_0(), semanticObject.getWhileBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=Expression elements+=Expression*)
	 */
	protected void sequence_commaExpr(EObject context, commaExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID relation=typeRelation? expr=exprOrObjectLiteral?)
	 */
	protected void sequence_identifierDeclaration(EObject context, identifierDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=objectField fields+=objectField*)
	 */
	protected void sequence_objectFields(EObject context, objectFields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=exprOrObjectLiteral
	 */
	protected void sequence_parenthesizedExpr(EObject context, parenthesizedExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.PARENTHESIZED_EXPR__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.PARENTHESIZED_EXPR__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParenthesizedExprAccess().getExpressionExprOrObjectLiteralParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Class|QualifiedName]
	 */
	protected void sequence_typeRelation(EObject context, typeRelation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.TYPE_RELATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.TYPE_RELATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeRelationAccess().getTypeClassQualifiedNameParserRuleCall_1_0_1(), semanticObject.getType());
		feeder.finish();
	}
}
