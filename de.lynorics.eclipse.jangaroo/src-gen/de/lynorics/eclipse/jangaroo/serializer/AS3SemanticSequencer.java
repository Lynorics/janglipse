package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.lynorics.eclipse.jangaroo.aS3.AS3Package;
import de.lynorics.eclipse.jangaroo.aS3.annotationFields;
import de.lynorics.eclipse.jangaroo.aS3.anonFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.arguments;
import de.lynorics.eclipse.jangaroo.aS3.catches;
import de.lynorics.eclipse.jangaroo.aS3.classBody;
import de.lynorics.eclipse.jangaroo.aS3.classDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.commaExpr;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnit;
import de.lynorics.eclipse.jangaroo.aS3.compilationUnitDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.directive;
import de.lynorics.eclipse.jangaroo.aS3.directives;
import de.lynorics.eclipse.jangaroo.aS3.expr;
import de.lynorics.eclipse.jangaroo.aS3.fieldDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.identifierDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.labelableStatement;
import de.lynorics.eclipse.jangaroo.aS3.lvalue;
import de.lynorics.eclipse.jangaroo.aS3.memberDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.methodDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.modifiers;
import de.lynorics.eclipse.jangaroo.aS3.namedFunctionExpr;
import de.lynorics.eclipse.jangaroo.aS3.namespacedIdentifier;
import de.lynorics.eclipse.jangaroo.aS3.objectFields;
import de.lynorics.eclipse.jangaroo.aS3.packageDeclaration;
import de.lynorics.eclipse.jangaroo.aS3.parameter;
import de.lynorics.eclipse.jangaroo.aS3.parameters;
import de.lynorics.eclipse.jangaroo.aS3.parenthesizedExpr;
import de.lynorics.eclipse.jangaroo.aS3.statement;
import de.lynorics.eclipse.jangaroo.aS3.statements;
import de.lynorics.eclipse.jangaroo.aS3.typeList;
import de.lynorics.eclipse.jangaroo.aS3.variableDeclaration;
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
			case AS3Package.ANNOTATION_FIELDS:
				if(context == grammarAccess.getAnnotationFieldsRule()) {
					sequence_annotationFields(context, (annotationFields) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ANON_FUNCTION_EXPR:
				if(context == grammarAccess.getAnonFunctionExprRule() ||
				   context == grammarAccess.getTerminalExprRule()) {
					sequence_anonFunctionExpr(context, (anonFunctionExpr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_anonFunctionExpr_expr(context, (anonFunctionExpr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_anonFunctionExpr_expr_parameter(context, (anonFunctionExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.ARGUMENTS:
				if(context == grammarAccess.getArgumentsRule() ||
				   context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getTerminalExprRule()) {
					sequence_arguments(context, (arguments) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_arguments_expr(context, (arguments) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_arguments_expr_parameter(context, (arguments) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CATCHES:
				if(context == grammarAccess.getCatchesRule()) {
					sequence_catches(context, (catches) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CLASS_BODY:
				if(context == grammarAccess.getClassBodyRule()) {
					sequence_classBody(context, (classBody) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.CLASS_DECLARATION:
				if(context == grammarAccess.getClassDeclarationRule()) {
					sequence_classDeclaration(context, (classDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.COMMA_EXPR:
				if(context == grammarAccess.getCommaExprRule()) {
					sequence_commaExpr(context, (commaExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.COMPILATION_UNIT:
				if(context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getCompilationUnitRule()) {
					sequence_compilationUnit(context, (compilationUnit) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.COMPILATION_UNIT_DECLARATION:
				if(context == grammarAccess.getCompilationUnitDeclarationRule()) {
					sequence_compilationUnitDeclaration(context, (compilationUnitDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule()) {
					sequence_directive(context, (directive) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.DIRECTIVES:
				if(context == grammarAccess.getDirectivesRule()) {
					sequence_directives(context, (directives) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.EXPR:
				if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_expr(context, (expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_expr_parameter(context, (expr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.FIELD_DECLARATION:
				if(context == grammarAccess.getFieldDeclarationRule()) {
					sequence_fieldDeclaration(context, (fieldDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.IDENTIFIER_DECLARATION:
				if(context == grammarAccess.getIdentifierDeclarationRule()) {
					sequence_identifierDeclaration(context, (identifierDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.LABELABLE_STATEMENT:
				if(context == grammarAccess.getLabelableStatementRule()) {
					sequence_labelableStatement(context, (labelableStatement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.LVALUE:
				if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getLvalueRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_lvalue(context, (lvalue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_lvalue_parameter(context, (lvalue) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MEMBER_DECLARATION:
				if(context == grammarAccess.getMemberDeclarationRule()) {
					sequence_memberDeclaration(context, (memberDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.METHOD_DECLARATION:
				if(context == grammarAccess.getMethodDeclarationRule()) {
					sequence_methodDeclaration(context, (methodDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.MODIFIERS:
				if(context == grammarAccess.getModifiersRule()) {
					sequence_modifiers(context, (modifiers) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getLvalueRule() ||
				   context == grammarAccess.getNamespacedIdentifierRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_modifiers_namespacedIdentifier(context, (modifiers) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_modifiers_namespacedIdentifier_parameter(context, (modifiers) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NAMED_FUNCTION_EXPR:
				if(context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getNamedFunctionExprRule() ||
				   context == grammarAccess.getObjectFieldRule()) {
					sequence_namedFunctionExpr(context, (namedFunctionExpr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_namedFunctionExpr_parameter(context, (namedFunctionExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.NAMESPACED_IDENTIFIER:
				if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getLvalueRule() ||
				   context == grammarAccess.getNamespacedIdentifierRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_namespacedIdentifier(context, (namespacedIdentifier) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_namespacedIdentifier_parameter(context, (namespacedIdentifier) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.OBJECT_FIELDS:
				if(context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getObjectFieldsRule() ||
				   context == grammarAccess.getObjectLiteralRule()) {
					sequence_objectFields(context, (objectFields) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_objectFields_parameter(context, (objectFields) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_packageDeclaration(context, (packageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_parameter(context, (parameter) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARAMETERS:
				if(context == grammarAccess.getParametersRule()) {
					sequence_parameters(context, (parameters) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.PARENTHESIZED_EXPR:
				if(context == grammarAccess.getParameterRule()) {
					sequence_expr_parameter_parenthesizedExpr(context, (parenthesizedExpr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnotationFieldRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprOrObjectLiteralRule() ||
				   context == grammarAccess.getObjectFieldRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_expr_parenthesizedExpr(context, (parenthesizedExpr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParenthesizedExprRule() ||
				   context == grammarAccess.getTerminalExprRule()) {
					sequence_parenthesizedExpr(context, (parenthesizedExpr) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STATEMENT:
				if(context == grammarAccess.getLabelableStatementRule()) {
					sequence_labelableStatement_statement(context, (statement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementInSwitchRule()) {
					sequence_statement(context, (statement) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.STATEMENTS:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getOptBodyRule() ||
				   context == grammarAccess.getStatementsRule() ||
				   context == grammarAccess.getStaticInitializerRule()) {
					sequence_statements(context, (statements) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.TYPE_LIST:
				if(context == grammarAccess.getTypeListRule()) {
					sequence_typeList(context, (typeList) semanticObject); 
					return; 
				}
				else break;
			case AS3Package.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_variableDeclaration(context, (variableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (fields+=annotationField fields+=annotationField*)?
	 */
	protected void sequence_annotationFields(EObject context, annotationFields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params=parameters relation=typeRelation? command=block)
	 */
	protected void sequence_anonFunctionExpr(EObject context, anonFunctionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params=parameters relation=typeRelation? command=block args=arguments)
	 */
	protected void sequence_anonFunctionExpr_expr(EObject context, anonFunctionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID params=parameters relation=typeRelation? command=block args=arguments)
	 */
	protected void sequence_anonFunctionExpr_expr_parameter(EObject context, anonFunctionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=exprOrObjectLiteral elements+=exprOrObjectLiteral*)?
	 */
	protected void sequence_arguments(EObject context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=exprOrObjectLiteral elements+=exprOrObjectLiteral* args=arguments)
	 */
	protected void sequence_arguments_expr(EObject context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=exprOrObjectLiteral elements+=exprOrObjectLiteral* args=arguments)
	 */
	protected void sequence_arguments_expr_parameter(EObject context, arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=parameter command+=block)*
	 */
	protected void sequence_catches(EObject context, catches semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=directive | elements+=memberDeclaration | elements+=staticInitializer)*
	 */
	protected void sequence_classBody(EObject context, classBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classModifiers=modifiers name=ID superType=[classDeclaration|type]? (types+=type types+=type*)? command=classBody)
	 */
	protected void sequence_classDeclaration(EObject context, classDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=expr elements+=expr*)
	 */
	protected void sequence_commaExpr(EObject context, commaExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (class=classDeclaration | member=memberDeclaration)
	 */
	protected void sequence_compilationUnitDeclaration(EObject context, compilationUnitDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=packageDeclaration directive=directives unit=compilationUnitDeclaration)
	 */
	protected void sequence_compilationUnit(EObject context, compilationUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.COMPILATION_UNIT__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.COMPILATION_UNIT__PACKAGE));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.COMPILATION_UNIT__DIRECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.COMPILATION_UNIT__DIRECTIVE));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.COMPILATION_UNIT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.COMPILATION_UNIT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompilationUnitAccess().getPackagePackageDeclarationParserRuleCall_0_0(), semanticObject.getPackage());
		feeder.accept(grammarAccess.getCompilationUnitAccess().getDirectiveDirectivesParserRuleCall_2_0(), semanticObject.getDirective());
		feeder.accept(grammarAccess.getCompilationUnitAccess().getUnitCompilationUnitDeclarationParserRuleCall_3_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=type | (id=ID fields=annotationFields?) | (useasid=ID importedNamespace=type))?
	 */
	protected void sequence_directive(EObject context, directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=directive*
	 */
	protected void sequence_directives(EObject context, directives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr=terminalExpr | 
	 *         deleteexpr=terminalExpr | 
	 *         (typeexpr=terminalExpr type=type) | 
	 *         (isleftepxr=terminalExpr isrightexpr=terminalExpr) | 
	 *         prefixexpr=terminalExpr | 
	 *         postfixexpr=terminalExpr | 
	 *         (infixexprleft=terminalExpr infixexprright=expr) | 
	 *         (condition=terminalExpr then=exprOrObjectLiteral else=exprOrObjectLiteral)
	 *     )
	 */
	protected void sequence_expr(EObject context, expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             expr=terminalExpr | 
	 *             deleteexpr=terminalExpr | 
	 *             (typeexpr=terminalExpr type=type) | 
	 *             (isleftepxr=terminalExpr isrightexpr=terminalExpr) | 
	 *             prefixexpr=terminalExpr | 
	 *             postfixexpr=terminalExpr | 
	 *             (infixexprleft=terminalExpr infixexprright=expr) | 
	 *             (condition=terminalExpr then=exprOrObjectLiteral else=exprOrObjectLiteral)
	 *         )
	 *     )
	 */
	protected void sequence_expr_parameter(EObject context, expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=exprOrObjectLiteral args=arguments)
	 */
	protected void sequence_expr_parameter_parenthesizedExpr(EObject context, parenthesizedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=exprOrObjectLiteral args=arguments)
	 */
	protected void sequence_expr_parenthesizedExpr(EObject context, parenthesizedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mod=modifiers var=constOrVar elements+=identifierDeclaration elements+=identifierDeclaration*)
	 */
	protected void sequence_fieldDeclaration(EObject context, fieldDeclaration semanticObject) {
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
	 *     (
	 *         (ifcondition=parenthesizedExpr ifthen=statement ifelse=statement?) | 
	 *         (condition=parenthesizedExpr elements+=statementInSwitch*) | 
	 *         (condition=parenthesizedExpr command=statement) | 
	 *         (forinit=commaExpr? condition=commaExpr? iterator=commaExpr? command=statement) | 
	 *         (elements+=identifierDeclaration elements+=identifierDeclaration* condition=commaExpr? iterator=commaExpr? command=statement) | 
	 *         (nameForin=ID forinexpr=expr forcommand=statement) | 
	 *         (nameForeachh=ID relation=typeRelation? foreachexpr=expr foreachcommand=statement) | 
	 *         (command=block catch=catches? finally=block) | 
	 *         function=namedFunctionExpr | 
	 *         command=block
	 *     )
	 */
	protected void sequence_labelableStatement(EObject context, labelableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             expr=commaExpr | 
	 *             (name=ID statement=labelableStatement) | 
	 *             variables=variableDeclaration | 
	 *             name=ID? | 
	 *             name=ID? | 
	 *             expr=exprOrObjectLiteral? | 
	 *             expr=commaExpr | 
	 *             argument=arguments | 
	 *             statement=labelableStatement
	 *         ) 
	 *         condition=parenthesizedExpr
	 *     )
	 */
	protected void sequence_labelableStatement_statement(EObject context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expression=terminalExpr identifier=namespacedIdentifier) | (expression=terminalExpr list=commaExpr))
	 */
	protected void sequence_lvalue(EObject context, lvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((expression=terminalExpr identifier=namespacedIdentifier) | (expression=terminalExpr list=commaExpr)))
	 */
	protected void sequence_lvalue_parameter(EObject context, lvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=fieldDeclaration | method=methodDeclaration)
	 */
	protected void sequence_memberDeclaration(EObject context, memberDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (methodmodifiers=modifiers name=ID params=parameters optbody=optBody)
	 */
	protected void sequence_methodDeclaration(EObject context, methodDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.METHOD_DECLARATION__METHODMODIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.METHOD_DECLARATION__METHODMODIFIERS));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.METHOD_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.METHOD_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.METHOD_DECLARATION__PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.METHOD_DECLARATION__PARAMS));
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.METHOD_DECLARATION__OPTBODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.METHOD_DECLARATION__OPTBODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodDeclarationAccess().getMethodmodifiersModifiersParserRuleCall_0_0(), semanticObject.getMethodmodifiers());
		feeder.accept(grammarAccess.getMethodDeclarationAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodDeclarationAccess().getParamsParametersParserRuleCall_5_0(), semanticObject.getParams());
		feeder.accept(grammarAccess.getMethodDeclarationAccess().getOptbodyOptBodyParserRuleCall_8_0(), semanticObject.getOptbody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?=STATIC? 
	 *         final?=FINAL? 
	 *         abstract?=ABSTRACT? 
	 *         override?=OVERRIDE? 
	 *         internal?=INTERNAL? 
	 *         public?=PUBLIC? 
	 *         private?=PRIVATE? 
	 *         protected?=PROTECTED?
	 *     )
	 */
	protected void sequence_modifiers(EObject context, modifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?=STATIC? 
	 *         final?=FINAL? 
	 *         abstract?=ABSTRACT? 
	 *         override?=OVERRIDE? 
	 *         internal?=INTERNAL? 
	 *         public?=PUBLIC? 
	 *         private?=PRIVATE? 
	 *         protected?=PROTECTED? 
	 *         name=ID
	 *     )
	 */
	protected void sequence_modifiers_namespacedIdentifier(EObject context, modifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         static?=STATIC? 
	 *         final?=FINAL? 
	 *         abstract?=ABSTRACT? 
	 *         override?=OVERRIDE? 
	 *         internal?=INTERNAL? 
	 *         public?=PUBLIC? 
	 *         private?=PRIVATE? 
	 *         protected?=PROTECTED? 
	 *         name=ID
	 *     )
	 */
	protected void sequence_modifiers_namespacedIdentifier_parameter(EObject context, modifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID params=parameters relation=typeRelation? command=block)
	 */
	protected void sequence_namedFunctionExpr(EObject context, namedFunctionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID name=ID params=parameters relation=typeRelation? command=block)
	 */
	protected void sequence_namedFunctionExpr_parameter(EObject context, namedFunctionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_namespacedIdentifier(EObject context, namespacedIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID name=ID)
	 */
	protected void sequence_namespacedIdentifier_parameter(EObject context, namespacedIdentifier semanticObject) {
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
	 *     (name=ID fields+=objectField fields+=objectField*)
	 */
	protected void sequence_objectFields_parameter(EObject context, objectFields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=qualifiedIde?
	 */
	protected void sequence_packageDeclaration(EObject context, packageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_parameter(EObject context, parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AS3Package.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AS3Package.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=parameter elements+=parameter*)? | ((elements+=parameter elements+=parameter*)? name=ID))
	 */
	protected void sequence_parameters(EObject context, parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=exprOrObjectLiteral
	 */
	protected void sequence_parenthesizedExpr(EObject context, parenthesizedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expr=commaExpr | 
	 *         (name=ID statement=labelableStatement) | 
	 *         variables=variableDeclaration | 
	 *         name=ID? | 
	 *         name=ID? | 
	 *         expr=exprOrObjectLiteral? | 
	 *         expr=commaExpr | 
	 *         argument=arguments | 
	 *         statement=labelableStatement
	 *     )?
	 */
	protected void sequence_statement(EObject context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=statement+
	 */
	protected void sequence_statements(EObject context, statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=type elements+=type*)
	 */
	protected void sequence_typeList(EObject context, typeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=identifierDeclaration elements+=identifierDeclaration*)
	 */
	protected void sequence_variableDeclaration(EObject context, variableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
