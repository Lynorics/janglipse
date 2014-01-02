package de.lynorics.eclipse.jangaroo.serializer;

import com.google.inject.Inject;
import de.lynorics.eclipse.jangaroo.services.AS3GrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AS3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected AS3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Property_VisibilityParserRuleCall_0_0_q;
	protected AbstractElementAlias match_Type_VisibilityParserRuleCall_0_0_q;
	protected AbstractElementAlias match__String_EqualsSignKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AS3GrammarAccess) access;
		match_Property_VisibilityParserRuleCall_0_0_q = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getVisibilityParserRuleCall_0_0());
		match_Type_VisibilityParserRuleCall_0_0_q = new TokenAlias(false, true, grammarAccess.getTypeAccess().getVisibilityParserRuleCall_0_0());
		match__String_EqualsSignKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.get_StringAccess().getEqualsSignKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getVisibilityRule())
			return getVisibilityToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Visibility:
	 *   'public' | 'private';
	 */
	protected String getVisibilityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "public";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Property_VisibilityParserRuleCall_0_0_q.equals(syntax))
				emit_Property_VisibilityParserRuleCall_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Type_VisibilityParserRuleCall_0_0_q.equals(syntax))
				emit_Type_VisibilityParserRuleCall_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match__String_EqualsSignKeyword_3_0_q.equals(syntax))
				emit__String_EqualsSignKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Visibility?
	 */
	protected void emit_Property_VisibilityParserRuleCall_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Visibility?
	 */
	protected void emit_Type_VisibilityParserRuleCall_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='?
	 */
	protected void emit__String_EqualsSignKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
