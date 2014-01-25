package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AS3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected AS3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class_StaticKeyword_1_q;
	protected AbstractElementAlias match_ForStatement_EachKeyword_2_1_q;
	protected AbstractElementAlias match_ForStatement_EachKeyword_3_1_q;
	protected AbstractElementAlias match_Method_NativeKeyword_2_q;
	protected AbstractElementAlias match_Method_OverrideKeyword_0_q;
	protected AbstractElementAlias match_Method_StaticKeyword_3_q;
	protected AbstractElementAlias match_Method___GetKeyword_5_0_or_SetKeyword_5_1__q;
	protected AbstractElementAlias match_Parameter_ConstKeyword_0_q;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_8_0_a;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_8_0_p;
	protected AbstractElementAlias match_Uses_AsteriskKeyword_2_1_or_VoidKeyword_2_2;
	protected AbstractElementAlias match_VariableDeclaration_StaticKeyword_1_q;
	protected AbstractElementAlias match_objectField___IDTerminalRuleCall_0_0_ColonKeyword_0_1___or___INTTerminalRuleCall_2_0_ColonKeyword_2_1___or___STRINGTerminalRuleCall_1_0_ColonKeyword_1_1__;
	protected AbstractElementAlias match_statementInSwitch_CaseKeyword_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AS3GrammarAccess) access;
		match_Class_StaticKeyword_1_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getStaticKeyword_1());
		match_ForStatement_EachKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getForStatementAccess().getEachKeyword_2_1());
		match_ForStatement_EachKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getForStatementAccess().getEachKeyword_3_1());
		match_Method_NativeKeyword_2_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getNativeKeyword_2());
		match_Method_OverrideKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getOverrideKeyword_0());
		match_Method_StaticKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getStaticKeyword_3());
		match_Method___GetKeyword_5_0_or_SetKeyword_5_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMethodAccess().getGetKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getMethodAccess().getSetKeyword_5_1()));
		match_Parameter_ConstKeyword_0_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getConstKeyword_0());
		match_TerminalExpression_LeftParenthesisKeyword_8_0_a = new TokenAlias(true, true, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
		match_TerminalExpression_LeftParenthesisKeyword_8_0_p = new TokenAlias(true, false, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
		match_Uses_AsteriskKeyword_2_1_or_VoidKeyword_2_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUsesAccess().getAsteriskKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getUsesAccess().getVoidKeyword_2_2()));
		match_VariableDeclaration_StaticKeyword_1_q = new TokenAlias(false, true, grammarAccess.getVariableDeclarationAccess().getStaticKeyword_1());
		match_objectField___IDTerminalRuleCall_0_0_ColonKeyword_0_1___or___INTTerminalRuleCall_2_0_ColonKeyword_2_1___or___STRINGTerminalRuleCall_1_0_ColonKeyword_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getColonKeyword_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getColonKeyword_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getColonKeyword_1_1())));
		match_statementInSwitch_CaseKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getStatementInSwitchAccess().getCaseKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Class_StaticKeyword_1_q.equals(syntax))
				emit_Class_StaticKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForStatement_EachKeyword_2_1_q.equals(syntax))
				emit_ForStatement_EachKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForStatement_EachKeyword_3_1_q.equals(syntax))
				emit_ForStatement_EachKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_NativeKeyword_2_q.equals(syntax))
				emit_Method_NativeKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_OverrideKeyword_0_q.equals(syntax))
				emit_Method_OverrideKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_StaticKeyword_3_q.equals(syntax))
				emit_Method_StaticKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method___GetKeyword_5_0_or_SetKeyword_5_1__q.equals(syntax))
				emit_Method___GetKeyword_5_0_or_SetKeyword_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_ConstKeyword_0_q.equals(syntax))
				emit_Parameter_ConstKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression_LeftParenthesisKeyword_8_0_a.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_8_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpression_LeftParenthesisKeyword_8_0_p.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_8_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Uses_AsteriskKeyword_2_1_or_VoidKeyword_2_2.equals(syntax))
				emit_Uses_AsteriskKeyword_2_1_or_VoidKeyword_2_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclaration_StaticKeyword_1_q.equals(syntax))
				emit_VariableDeclaration_StaticKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_objectField___IDTerminalRuleCall_0_0_ColonKeyword_0_1___or___INTTerminalRuleCall_2_0_ColonKeyword_2_1___or___STRINGTerminalRuleCall_1_0_ColonKeyword_1_1__.equals(syntax))
				emit_objectField___IDTerminalRuleCall_0_0_ColonKeyword_0_1___or___INTTerminalRuleCall_2_0_ColonKeyword_2_1___or___STRINGTerminalRuleCall_1_0_ColonKeyword_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_statementInSwitch_CaseKeyword_1_0_q.equals(syntax))
				emit_statementInSwitch_CaseKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'static'?
	 */
	protected void emit_Class_StaticKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'each'?
	 */
	protected void emit_ForStatement_EachKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'each'?
	 */
	protected void emit_ForStatement_EachKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'native'?
	 */
	protected void emit_Method_NativeKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'override'?
	 */
	protected void emit_Method_OverrideKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'static'?
	 */
	protected void emit_Method_StaticKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('set' | 'get')?
	 */
	protected void emit_Method___GetKeyword_5_0_or_SetKeyword_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_Parameter_ConstKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_8_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_8_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*' | 'void'
	 */
	protected void emit_Uses_AsteriskKeyword_2_1_or_VoidKeyword_2_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'static'?
	 */
	protected void emit_VariableDeclaration_StaticKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID ':') | (INT ':') | (STRING ':')
	 */
	protected void emit_objectField___IDTerminalRuleCall_0_0_ColonKeyword_0_1___or___INTTerminalRuleCall_2_0_ColonKeyword_2_1___or___STRINGTerminalRuleCall_1_0_ColonKeyword_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'case'?
	 */
	protected void emit_statementInSwitch_CaseKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
