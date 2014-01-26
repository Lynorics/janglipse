/*
* generated by Xtext
*/
package de.lynorics.eclipse.jangaroo.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;

public class AS3Parser extends AbstractContentAssistParser {
	
	@Inject
	private AS3GrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal.InternalAS3Parser createParser() {
		de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal.InternalAS3Parser result = new de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal.InternalAS3Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getPackageAccess().getClassesAlternatives_5_0(), "rule__Package__ClassesAlternatives_5_0");
					put(grammarAccess.getDirectiveAccess().getAlternatives(), "rule__Directive__Alternatives");
					put(grammarAccess.getUsesAccess().getAlternatives_2(), "rule__Uses__Alternatives_2");
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getMethodAccess().getAlternatives_5(), "rule__Method__Alternatives_5");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getForStatementAccess().getAlternatives(), "rule__ForStatement__Alternatives");
					put(grammarAccess.getStatementInSwitchAccess().getAlternatives(), "rule__StatementInSwitch__Alternatives");
					put(grammarAccess.getIfBlockAccess().getAlternatives(), "rule__IfBlock__Alternatives");
					put(grammarAccess.getBlockAccess().getAlternatives(), "rule__Block__Alternatives");
					put(grammarAccess.getParametersAccess().getAlternatives(), "rule__Parameters__Alternatives");
					put(grammarAccess.getObjectFieldAccess().getAlternatives(), "rule__ObjectField__Alternatives");
					put(grammarAccess.getExprOrObjectLiteralAccess().getAlternatives(), "rule__ExprOrObjectLiteral__Alternatives");
					put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__TerminalExpression__ValueAlternatives_2_1_0");
					put(grammarAccess.getAccessLevelAccess().getAlternatives(), "rule__AccessLevel__Alternatives");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDirectiveAccess().getGroup_0(), "rule__Directive__Group_0__0");
					put(grammarAccess.getDirectiveAccess().getGroup_0_3(), "rule__Directive__Group_0_3__0");
					put(grammarAccess.getUsesAccess().getGroup(), "rule__Uses__Group__0");
					put(grammarAccess.getAnnotationFieldsAccess().getGroup(), "rule__AnnotationFields__Group__0");
					put(grammarAccess.getAnnotationFieldsAccess().getGroup_1(), "rule__AnnotationFields__Group_1__0");
					put(grammarAccess.getAnnotationFieldAccess().getGroup(), "rule__AnnotationField__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_3(), "rule__Interface__Group_3__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_5_2(), "rule__Class__Group_5_2__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_8(), "rule__Method__Group_8__0");
					put(grammarAccess.getMethodAccess().getGroup_8_1(), "rule__Method__Group_8_1__0");
					put(grammarAccess.getMethodAccess().getGroup_10(), "rule__Method__Group_10__0");
					put(grammarAccess.getMethodBodyAccess().getGroup(), "rule__MethodBody__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_2(), "rule__Statement__Group_2__0");
					put(grammarAccess.getNewStatementAccess().getGroup(), "rule__NewStatement__Group__0");
					put(grammarAccess.getNewStatementAccess().getGroup_3(), "rule__NewStatement__Group_3__0");
					put(grammarAccess.getForStatementAccess().getGroup_0(), "rule__ForStatement__Group_0__0");
					put(grammarAccess.getForStatementAccess().getGroup_1(), "rule__ForStatement__Group_1__0");
					put(grammarAccess.getForStatementAccess().getGroup_1_4(), "rule__ForStatement__Group_1_4__0");
					put(grammarAccess.getForStatementAccess().getGroup_2(), "rule__ForStatement__Group_2__0");
					put(grammarAccess.getForStatementAccess().getGroup_3(), "rule__ForStatement__Group_3__0");
					put(grammarAccess.getIdentifierDeclarationAccess().getGroup(), "rule__IdentifierDeclaration__Group__0");
					put(grammarAccess.getIdentifierDeclarationAccess().getGroup_2(), "rule__IdentifierDeclaration__Group_2__0");
					put(grammarAccess.getCommaExprAccess().getGroup(), "rule__CommaExpr__Group__0");
					put(grammarAccess.getCommaExprAccess().getGroup_1(), "rule__CommaExpr__Group_1__0");
					put(grammarAccess.getDoWhileStatementAccess().getGroup(), "rule__DoWhileStatement__Group__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getSwitchStatementAccess().getGroup(), "rule__SwitchStatement__Group__0");
					put(grammarAccess.getParenthesizedExprAccess().getGroup(), "rule__ParenthesizedExpr__Group__0");
					put(grammarAccess.getStatementInSwitchAccess().getGroup_1(), "rule__StatementInSwitch__Group_1__0");
					put(grammarAccess.getStatementInSwitchAccess().getGroup_2(), "rule__StatementInSwitch__Group_2__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_6(), "rule__VariableDeclaration__Group_6__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getTryStatementAccess().getGroup(), "rule__TryStatement__Group__0");
					put(grammarAccess.getTryStatementAccess().getGroup_4(), "rule__TryStatement__Group_4__0");
					put(grammarAccess.getTryStatementAccess().getGroup_5(), "rule__TryStatement__Group_5__0");
					put(grammarAccess.getStatementsBlockAccess().getGroup(), "rule__StatementsBlock__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParametersAccess().getGroup_0(), "rule__Parameters__Group_0__0");
					put(grammarAccess.getParametersAccess().getGroup_0_1(), "rule__Parameters__Group_0_1__0");
					put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
					put(grammarAccess.getParametersAccess().getGroup_1_0(), "rule__Parameters__Group_1_0__0");
					put(grammarAccess.getParametersAccess().getGroup_1_0_1(), "rule__Parameters__Group_1_0_1__0");
					put(grammarAccess.getTypeRelationAccess().getGroup(), "rule__TypeRelation__Group__0");
					put(grammarAccess.getObjectLiteralAccess().getGroup(), "rule__ObjectLiteral__Group__0");
					put(grammarAccess.getObjectFieldsAccess().getGroup(), "rule__ObjectFields__Group__0");
					put(grammarAccess.getObjectFieldsAccess().getGroup_1(), "rule__ObjectFields__Group_1__0");
					put(grammarAccess.getObjectFieldAccess().getGroup_0(), "rule__ObjectField__Group_0__0");
					put(grammarAccess.getObjectFieldAccess().getGroup_1(), "rule__ObjectField__Group_1__0");
					put(grammarAccess.getObjectFieldAccess().getGroup_2(), "rule__ObjectField__Group_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup(), "rule__SelectionExpression__Group__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1(), "rule__SelectionExpression__Group_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3(), "rule__SelectionExpression__Group_1_3__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1(), "rule__SelectionExpression__Group_1_3_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1_1(), "rule__SelectionExpression__Group_1_3_1_1__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_6(), "rule__TerminalExpression__Group_6__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_7(), "rule__TerminalExpression__Group_7__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_8(), "rule__TerminalExpression__Group_8__0");
					put(grammarAccess.getModelAccess().getImpAssignment_1_0(), "rule__Model__ImpAssignment_1_0");
					put(grammarAccess.getModelAccess().getClassesAssignment_1_1(), "rule__Model__ClassesAssignment_1_1");
					put(grammarAccess.getPackageAccess().getPackageAssignment_1(), "rule__Package__PackageAssignment_1");
					put(grammarAccess.getPackageAccess().getImpAssignment_3(), "rule__Package__ImpAssignment_3");
					put(grammarAccess.getPackageAccess().getDirectivesAssignment_4(), "rule__Package__DirectivesAssignment_4");
					put(grammarAccess.getPackageAccess().getClassesAssignment_5(), "rule__Package__ClassesAssignment_5");
					put(grammarAccess.getImportsAccess().getImportsAssignment_1(), "rule__Imports__ImportsAssignment_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getDirectiveAccess().getNameAssignment_0_2(), "rule__Directive__NameAssignment_0_2");
					put(grammarAccess.getDirectiveAccess().getAnnonFieldsAssignment_0_3_1(), "rule__Directive__AnnonFieldsAssignment_0_3_1");
					put(grammarAccess.getUsesAccess().getNameAssignment_1(), "rule__Uses__NameAssignment_1");
					put(grammarAccess.getUsesAccess().getTypeAssignment_2_0(), "rule__Uses__TypeAssignment_2_0");
					put(grammarAccess.getAnnotationFieldsAccess().getAnoonFieldsAssignment_0(), "rule__AnnotationFields__AnoonFieldsAssignment_0");
					put(grammarAccess.getAnnotationFieldsAccess().getAnnonFieldsAssignment_1_1(), "rule__AnnotationFields__AnnonFieldsAssignment_1_1");
					put(grammarAccess.getAnnotationFieldAccess().getNameAssignment_0(), "rule__AnnotationField__NameAssignment_0");
					put(grammarAccess.getAnnotationFieldAccess().getExprAssignment_2(), "rule__AnnotationField__ExprAssignment_2");
					put(grammarAccess.getInterfaceAccess().getAccessAssignment_0(), "rule__Interface__AccessAssignment_0");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
					put(grammarAccess.getInterfaceAccess().getSuperclassAssignment_3_1(), "rule__Interface__SuperclassAssignment_3_1");
					put(grammarAccess.getInterfaceAccess().getMembersAssignment_5(), "rule__Interface__MembersAssignment_5");
					put(grammarAccess.getClassAccess().getAccessAssignment_0(), "rule__Class__AccessAssignment_0");
					put(grammarAccess.getClassAccess().getNameAssignment_3(), "rule__Class__NameAssignment_3");
					put(grammarAccess.getClassAccess().getSuperTypeAssignment_4_1(), "rule__Class__SuperTypeAssignment_4_1");
					put(grammarAccess.getClassAccess().getTypesAssignment_5_1(), "rule__Class__TypesAssignment_5_1");
					put(grammarAccess.getClassAccess().getTypesAssignment_5_2_1(), "rule__Class__TypesAssignment_5_2_1");
					put(grammarAccess.getClassAccess().getMembersAssignment_7(), "rule__Class__MembersAssignment_7");
					put(grammarAccess.getMemberAccess().getVarAssignment_0(), "rule__Member__VarAssignment_0");
					put(grammarAccess.getMemberAccess().getMethAssignment_1(), "rule__Member__MethAssignment_1");
					put(grammarAccess.getMethodAccess().getAccessAssignment_1(), "rule__Method__AccessAssignment_1");
					put(grammarAccess.getMethodAccess().getNameAssignment_6(), "rule__Method__NameAssignment_6");
					put(grammarAccess.getMethodAccess().getParamsAssignment_8_0(), "rule__Method__ParamsAssignment_8_0");
					put(grammarAccess.getMethodAccess().getParamsAssignment_8_1_1(), "rule__Method__ParamsAssignment_8_1_1");
					put(grammarAccess.getMethodAccess().getTypeAssignment_10_1(), "rule__Method__TypeAssignment_10_1");
					put(grammarAccess.getMethodAccess().getBodyAssignment_11(), "rule__Method__BodyAssignment_11");
					put(grammarAccess.getMethodBodyAccess().getStatementsAssignment_2(), "rule__MethodBody__StatementsAssignment_2");
					put(grammarAccess.getNewStatementAccess().getTypeAssignment_2(), "rule__NewStatement__TypeAssignment_2");
					put(grammarAccess.getNewStatementAccess().getParamAssignment_3_1(), "rule__NewStatement__ParamAssignment_3_1");
					put(grammarAccess.getForStatementAccess().getForinitAssignment_0_2(), "rule__ForStatement__ForinitAssignment_0_2");
					put(grammarAccess.getForStatementAccess().getConditionAssignment_0_4(), "rule__ForStatement__ConditionAssignment_0_4");
					put(grammarAccess.getForStatementAccess().getIteratorAssignment_0_6(), "rule__ForStatement__IteratorAssignment_0_6");
					put(grammarAccess.getForStatementAccess().getCommandAssignment_0_8(), "rule__ForStatement__CommandAssignment_0_8");
					put(grammarAccess.getForStatementAccess().getElementsAssignment_1_3(), "rule__ForStatement__ElementsAssignment_1_3");
					put(grammarAccess.getForStatementAccess().getElementsAssignment_1_4_1(), "rule__ForStatement__ElementsAssignment_1_4_1");
					put(grammarAccess.getForStatementAccess().getConditionAssignment_1_6(), "rule__ForStatement__ConditionAssignment_1_6");
					put(grammarAccess.getForStatementAccess().getIteratorAssignment_1_8(), "rule__ForStatement__IteratorAssignment_1_8");
					put(grammarAccess.getForStatementAccess().getCommandAssignment_1_10(), "rule__ForStatement__CommandAssignment_1_10");
					put(grammarAccess.getForStatementAccess().getNameForinAssignment_2_3(), "rule__ForStatement__NameForinAssignment_2_3");
					put(grammarAccess.getForStatementAccess().getForinexprAssignment_2_5(), "rule__ForStatement__ForinexprAssignment_2_5");
					put(grammarAccess.getForStatementAccess().getForcommandAssignment_2_7(), "rule__ForStatement__ForcommandAssignment_2_7");
					put(grammarAccess.getForStatementAccess().getNameForeachhAssignment_3_4(), "rule__ForStatement__NameForeachhAssignment_3_4");
					put(grammarAccess.getForStatementAccess().getRelationAssignment_3_5(), "rule__ForStatement__RelationAssignment_3_5");
					put(grammarAccess.getForStatementAccess().getForeachexprAssignment_3_7(), "rule__ForStatement__ForeachexprAssignment_3_7");
					put(grammarAccess.getForStatementAccess().getForeachcommandAssignment_3_9(), "rule__ForStatement__ForeachcommandAssignment_3_9");
					put(grammarAccess.getIdentifierDeclarationAccess().getNameAssignment_0(), "rule__IdentifierDeclaration__NameAssignment_0");
					put(grammarAccess.getIdentifierDeclarationAccess().getRelationAssignment_1(), "rule__IdentifierDeclaration__RelationAssignment_1");
					put(grammarAccess.getIdentifierDeclarationAccess().getExprAssignment_2_1(), "rule__IdentifierDeclaration__ExprAssignment_2_1");
					put(grammarAccess.getCommaExprAccess().getElementsAssignment_0(), "rule__CommaExpr__ElementsAssignment_0");
					put(grammarAccess.getCommaExprAccess().getElementsAssignment_1_1(), "rule__CommaExpr__ElementsAssignment_1_1");
					put(grammarAccess.getDoWhileStatementAccess().getWhileBlockAssignment_2(), "rule__DoWhileStatement__WhileBlockAssignment_2");
					put(grammarAccess.getDoWhileStatementAccess().getCondAssignment_4(), "rule__DoWhileStatement__CondAssignment_4");
					put(grammarAccess.getWhileStatementAccess().getCondAssignment_2(), "rule__WhileStatement__CondAssignment_2");
					put(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_3(), "rule__WhileStatement__WhileBlockAssignment_3");
					put(grammarAccess.getSwitchStatementAccess().getCondAssignment_2(), "rule__SwitchStatement__CondAssignment_2");
					put(grammarAccess.getSwitchStatementAccess().getCasesAssignment_4(), "rule__SwitchStatement__CasesAssignment_4");
					put(grammarAccess.getParenthesizedExprAccess().getExpressionAssignment_1(), "rule__ParenthesizedExpr__ExpressionAssignment_1");
					put(grammarAccess.getReturnAccess().getExpressionAssignment_1(), "rule__Return__ExpressionAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getAccessAssignment_0(), "rule__VariableDeclaration__AccessAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_3(), "rule__VariableDeclaration__NameAssignment_3");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_5(), "rule__VariableDeclaration__TypeAssignment_5");
					put(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_6_1(), "rule__VariableDeclaration__ExpressionAssignment_6_1");
					put(grammarAccess.getIfStatementAccess().getExpressionAssignment_2(), "rule__IfStatement__ExpressionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4(), "rule__IfStatement__ThenBlockAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1(), "rule__IfStatement__ElseBlockAssignment_5_1");
					put(grammarAccess.getTryStatementAccess().getStatementsAssignment_2(), "rule__TryStatement__StatementsAssignment_2");
					put(grammarAccess.getTryStatementAccess().getParamsAssignment_4_2(), "rule__TryStatement__ParamsAssignment_4_2");
					put(grammarAccess.getTryStatementAccess().getFinallyBlockAssignment_5_1(), "rule__TryStatement__FinallyBlockAssignment_5_1");
					put(grammarAccess.getIfBlockAccess().getStatementsAssignment_0(), "rule__IfBlock__StatementsAssignment_0");
					put(grammarAccess.getStatementsBlockAccess().getStatementsAssignment_1(), "rule__StatementsBlock__StatementsAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getRelAssignment_2(), "rule__Parameter__RelAssignment_2");
					put(grammarAccess.getParameterAccess().getLitAssignment_3_1(), "rule__Parameter__LitAssignment_3_1");
					put(grammarAccess.getParametersAccess().getElementsAssignment_0_0(), "rule__Parameters__ElementsAssignment_0_0");
					put(grammarAccess.getParametersAccess().getElementsAssignment_0_1_1(), "rule__Parameters__ElementsAssignment_0_1_1");
					put(grammarAccess.getParametersAccess().getElementsAssignment_1_0_0(), "rule__Parameters__ElementsAssignment_1_0_0");
					put(grammarAccess.getParametersAccess().getElementsAssignment_1_0_1_1(), "rule__Parameters__ElementsAssignment_1_0_1_1");
					put(grammarAccess.getParametersAccess().getNameAssignment_1_1(), "rule__Parameters__NameAssignment_1_1");
					put(grammarAccess.getParametersAccess().getRelAssignment_1_2(), "rule__Parameters__RelAssignment_1_2");
					put(grammarAccess.getTypeRelationAccess().getTypeAssignment_1(), "rule__TypeRelation__TypeAssignment_1");
					put(grammarAccess.getObjectFieldsAccess().getFieldsAssignment_0(), "rule__ObjectFields__FieldsAssignment_0");
					put(grammarAccess.getObjectFieldsAccess().getFieldsAssignment_1_1(), "rule__ObjectFields__FieldsAssignment_1_1");
					put(grammarAccess.getAssignmentAccess().getRightAssignment_1_2(), "rule__Assignment__RightAssignment_1_2");
					put(grammarAccess.getSelectionExpressionAccess().getMemberAssignment_1_2(), "rule__SelectionExpression__MemberAssignment_1_2");
					put(grammarAccess.getSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0(), "rule__SelectionExpression__MethodinvocationAssignment_1_3_0");
					put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_0(), "rule__SelectionExpression__ArgsAssignment_1_3_1_0");
					put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1(), "rule__SelectionExpression__ArgsAssignment_1_3_1_1_1");
					put(grammarAccess.getTypeAccess().getQualAssignment_1(), "rule__Type__QualAssignment_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
					put(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_7_1(), "rule__TerminalExpression__SymbolAssignment_7_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal.InternalAS3Parser typedParser = (de.lynorics.eclipse.jangaroo.ui.contentassist.antlr.internal.InternalAS3Parser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AS3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AS3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
