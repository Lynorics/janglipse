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
	protected AbstractElementAlias match_Constant_FalseKeyword_1_5_or_NullKeyword_1_6_or_TrueKeyword_1_4;
	protected AbstractElementAlias match_Declaration_VarOrConstParserRuleCall_0_q;
	protected AbstractElementAlias match_InterfaceMethod_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Method_OverrideKeyword_0_q;
	protected AbstractElementAlias match_Parameter_ConstKeyword_0_q;
	protected AbstractElementAlias match_Parameter_FullStopFullStopFullStopKeyword_1_q;
	protected AbstractElementAlias match_Uses_AsteriskKeyword_3_1_or_VoidKeyword_3_2;
	protected AbstractElementAlias match_VariableDeclaration_ConstKeyword_2_1_or_VarKeyword_2_0;
	protected AbstractElementAlias match_VariableDeclaration_StaticKeyword_1_q;
	protected AbstractElementAlias match_basicParameterDeclaration_ConstKeyword_0_q;
	protected AbstractElementAlias match_fieldList_CommaKeyword_1_0_a;
	protected AbstractElementAlias match_fieldList_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_postfixExpression___FullStopKeyword_1_1_5_0_AsteriskKeyword_1_1_5_1__a;
	protected AbstractElementAlias match_primaryExpression___AsteriskKeyword_1_0_or_ThisKeyword_1_1___or___SuperKeyword_1_2_0___LeftParenthesisKeyword_1_2_1_0_RightParenthesisKeyword_1_2_1_2__q__;
	protected AbstractElementAlias match_typeExpression_AsteriskKeyword_2_2_or_VoidKeyword_2_1;
	protected AbstractElementAlias match_unaryExpressionNotPlusMinus_DeleteKeyword_0_0_q;
	protected AbstractElementAlias match_unaryExpressionNotPlusMinus_ExclamationMarkKeyword_3_0_or_TildeKeyword_4_0_or_TypeofKeyword_2_0_or_VoidKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AS3GrammarAccess) access;
		match_Constant_FalseKeyword_1_5_or_NullKeyword_1_6_or_TrueKeyword_1_4 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantAccess().getFalseKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getNullKeyword_1_6()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getTrueKeyword_1_4()));
		match_Declaration_VarOrConstParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getDeclarationAccess().getVarOrConstParserRuleCall_0());
		match_InterfaceMethod_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getInterfaceMethodAccess().getSemicolonKeyword_6());
		match_Method_OverrideKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getOverrideKeyword_0());
		match_Parameter_ConstKeyword_0_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getConstKeyword_0());
		match_Parameter_FullStopFullStopFullStopKeyword_1_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getFullStopFullStopFullStopKeyword_1());
		match_Uses_AsteriskKeyword_3_1_or_VoidKeyword_3_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUsesAccess().getAsteriskKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getUsesAccess().getVoidKeyword_3_2()));
		match_VariableDeclaration_ConstKeyword_2_1_or_VarKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVariableDeclarationAccess().getConstKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getVariableDeclarationAccess().getVarKeyword_2_0()));
		match_VariableDeclaration_StaticKeyword_1_q = new TokenAlias(false, true, grammarAccess.getVariableDeclarationAccess().getStaticKeyword_1());
		match_basicParameterDeclaration_ConstKeyword_0_q = new TokenAlias(false, true, grammarAccess.getBasicParameterDeclarationAccess().getConstKeyword_0());
		match_fieldList_CommaKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getFieldListAccess().getCommaKeyword_1_0());
		match_fieldList_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getFieldListAccess().getCommaKeyword_1_0());
		match_postfixExpression___FullStopKeyword_1_1_5_0_AsteriskKeyword_1_1_5_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getFullStopKeyword_1_1_5_0()), new TokenAlias(false, false, grammarAccess.getPostfixExpressionAccess().getAsteriskKeyword_1_1_5_1()));
		match_primaryExpression___AsteriskKeyword_1_0_or_ThisKeyword_1_1___or___SuperKeyword_1_2_0___LeftParenthesisKeyword_1_2_1_0_RightParenthesisKeyword_1_2_1_2__q__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getAsteriskKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getThisKeyword_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getSuperKeyword_1_2_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_2_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2_1_2()))));
		match_typeExpression_AsteriskKeyword_2_2_or_VoidKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeExpressionAccess().getAsteriskKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getTypeExpressionAccess().getVoidKeyword_2_1()));
		match_unaryExpressionNotPlusMinus_DeleteKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getDeleteKeyword_0_0());
		match_unaryExpressionNotPlusMinus_ExclamationMarkKeyword_3_0_or_TildeKeyword_4_0_or_TypeofKeyword_2_0_or_VoidKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getExclamationMarkKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getTildeKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getTypeofKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getVoidKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getQualifiedNameRule())
			return getQualifiedNameToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVarOrConstRule())
			return getvarOrConstToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * QualifiedName:
	 *   ID ('.' ID)*
	 * ;
	 */
	protected String getQualifiedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * varOrConst
	 *   : 'var' | 'const'
	 *   ;
	 */
	protected String getvarOrConstToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "var";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Constant_FalseKeyword_1_5_or_NullKeyword_1_6_or_TrueKeyword_1_4.equals(syntax))
				emit_Constant_FalseKeyword_1_5_or_NullKeyword_1_6_or_TrueKeyword_1_4(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Declaration_VarOrConstParserRuleCall_0_q.equals(syntax))
				emit_Declaration_VarOrConstParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceMethod_SemicolonKeyword_6_q.equals(syntax))
				emit_InterfaceMethod_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_OverrideKeyword_0_q.equals(syntax))
				emit_Method_OverrideKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_ConstKeyword_0_q.equals(syntax))
				emit_Parameter_ConstKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_FullStopFullStopFullStopKeyword_1_q.equals(syntax))
				emit_Parameter_FullStopFullStopFullStopKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Uses_AsteriskKeyword_3_1_or_VoidKeyword_3_2.equals(syntax))
				emit_Uses_AsteriskKeyword_3_1_or_VoidKeyword_3_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclaration_ConstKeyword_2_1_or_VarKeyword_2_0.equals(syntax))
				emit_VariableDeclaration_ConstKeyword_2_1_or_VarKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclaration_StaticKeyword_1_q.equals(syntax))
				emit_VariableDeclaration_StaticKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_basicParameterDeclaration_ConstKeyword_0_q.equals(syntax))
				emit_basicParameterDeclaration_ConstKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fieldList_CommaKeyword_1_0_a.equals(syntax))
				emit_fieldList_CommaKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fieldList_CommaKeyword_1_0_p.equals(syntax))
				emit_fieldList_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_postfixExpression___FullStopKeyword_1_1_5_0_AsteriskKeyword_1_1_5_1__a.equals(syntax))
				emit_postfixExpression___FullStopKeyword_1_1_5_0_AsteriskKeyword_1_1_5_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_primaryExpression___AsteriskKeyword_1_0_or_ThisKeyword_1_1___or___SuperKeyword_1_2_0___LeftParenthesisKeyword_1_2_1_0_RightParenthesisKeyword_1_2_1_2__q__.equals(syntax))
				emit_primaryExpression___AsteriskKeyword_1_0_or_ThisKeyword_1_1___or___SuperKeyword_1_2_0___LeftParenthesisKeyword_1_2_1_0_RightParenthesisKeyword_1_2_1_2__q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_typeExpression_AsteriskKeyword_2_2_or_VoidKeyword_2_1.equals(syntax))
				emit_typeExpression_AsteriskKeyword_2_2_or_VoidKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_unaryExpressionNotPlusMinus_DeleteKeyword_0_0_q.equals(syntax))
				emit_unaryExpressionNotPlusMinus_DeleteKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_unaryExpressionNotPlusMinus_ExclamationMarkKeyword_3_0_or_TildeKeyword_4_0_or_TypeofKeyword_2_0_or_VoidKeyword_1_0.equals(syntax))
				emit_unaryExpressionNotPlusMinus_ExclamationMarkKeyword_3_0_or_TildeKeyword_4_0_or_TypeofKeyword_2_0_or_VoidKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'true' | 'false' | 'null'
	 */
	protected void emit_Constant_FalseKeyword_1_5_or_NullKeyword_1_6_or_TrueKeyword_1_4(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     varOrConst?
	 */
	protected void emit_Declaration_VarOrConstParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_InterfaceMethod_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'const'?
	 */
	protected void emit_Parameter_ConstKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '...'?
	 */
	protected void emit_Parameter_FullStopFullStopFullStopKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'void' | '*'
	 */
	protected void emit_Uses_AsteriskKeyword_3_1_or_VoidKeyword_3_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const' | 'var'
	 */
	protected void emit_VariableDeclaration_ConstKeyword_2_1_or_VarKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'const'?
	 */
	protected void emit_basicParameterDeclaration_ConstKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','*
	 */
	protected void emit_fieldList_CommaKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','+
	 */
	protected void emit_fieldList_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' '*')*
	 */
	protected void emit_postfixExpression___FullStopKeyword_1_1_5_0_AsteriskKeyword_1_1_5_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('this' | '*') | ('super' ('(' ')')?)
	 */
	protected void emit_primaryExpression___AsteriskKeyword_1_0_or_ThisKeyword_1_1___or___SuperKeyword_1_2_0___LeftParenthesisKeyword_1_2_1_0_RightParenthesisKeyword_1_2_1_2__q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'void' | '*'
	 */
	protected void emit_typeExpression_AsteriskKeyword_2_2_or_VoidKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'delete'?
	 */
	protected void emit_unaryExpressionNotPlusMinus_DeleteKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'void' | '~' | 'typeof' | '!'
	 */
	protected void emit_unaryExpressionNotPlusMinus_ExclamationMarkKeyword_3_0_or_TildeKeyword_4_0_or_TypeofKeyword_2_0_or_VoidKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
