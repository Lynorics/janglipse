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
	protected AbstractElementAlias match_arrayLiteral_terminalExpr_LBRACKTerminalRuleCall_0_or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1_LPARENTerminalRuleCall_11_2_0__;
	protected AbstractElementAlias match_directive___DOTTerminalRuleCall_0_2_0_STARTerminalRuleCall_0_2_1__q;
	protected AbstractElementAlias match_labelableStatement_EACHTerminalRuleCall_6_1_q;
	protected AbstractElementAlias match_labelableStatement_EACHTerminalRuleCall_7_1_q;
	protected AbstractElementAlias match_lvalue___SuperKeyword_3_0_DOTTerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_methodDeclaration_TypeRelationParserRuleCall_7_q;
	protected AbstractElementAlias match_methodDeclaration___GETTerminalRuleCall_2_0_or_SETTerminalRuleCall_2_1__q;
	protected AbstractElementAlias match_objectField___IDTerminalRuleCall_0_0_COLONTerminalRuleCall_0_1___or___INTTerminalRuleCall_2_0_COLONTerminalRuleCall_2_1___or___STRINGTerminalRuleCall_1_0_COLONTerminalRuleCall_1_1__;
	protected AbstractElementAlias match_parameter_CONSTTerminalRuleCall_0_q;
	protected AbstractElementAlias match_parameter_TypeRelationParserRuleCall_2_q;
	protected AbstractElementAlias match_parameters_TypeRelationParserRuleCall_1_2_q;
	protected AbstractElementAlias match_statement_SEMITerminalRuleCall_0_or___BREAKTerminalRuleCall_4_0_SEMITerminalRuleCall_4_2___or___CONTINUETerminalRuleCall_5_0_SEMITerminalRuleCall_5_2___or___RETURNTerminalRuleCall_6_0_SEMITerminalRuleCall_6_2__;
	protected AbstractElementAlias match_terminalExpr_DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9;
	protected AbstractElementAlias match_terminalExpr___DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9___or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AS3GrammarAccess) access;
		match_arrayLiteral_terminalExpr_LBRACKTerminalRuleCall_0_or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1_LPARENTerminalRuleCall_11_2_0__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getNEWTerminalRuleCall_11_0()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getTypeParserRuleCall_11_1()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getLPARENTerminalRuleCall_11_2_0())), new TokenAlias(false, false, grammarAccess.getArrayLiteralAccess().getLBRACKTerminalRuleCall_0()));
		match_directive___DOTTerminalRuleCall_0_2_0_STARTerminalRuleCall_0_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getDOTTerminalRuleCall_0_2_0()), new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getSTARTerminalRuleCall_0_2_1()));
		match_labelableStatement_EACHTerminalRuleCall_6_1_q = new TokenAlias(false, true, grammarAccess.getLabelableStatementAccess().getEACHTerminalRuleCall_6_1());
		match_labelableStatement_EACHTerminalRuleCall_7_1_q = new TokenAlias(false, true, grammarAccess.getLabelableStatementAccess().getEACHTerminalRuleCall_7_1());
		match_lvalue___SuperKeyword_3_0_DOTTerminalRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLvalueAccess().getSuperKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getLvalueAccess().getDOTTerminalRuleCall_3_1()));
		match_methodDeclaration_TypeRelationParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getMethodDeclarationAccess().getTypeRelationParserRuleCall_7());
		match_methodDeclaration___GETTerminalRuleCall_2_0_or_SETTerminalRuleCall_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMethodDeclarationAccess().getGETTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getMethodDeclarationAccess().getSETTerminalRuleCall_2_1()));
		match_objectField___IDTerminalRuleCall_0_0_COLONTerminalRuleCall_0_1___or___INTTerminalRuleCall_2_0_COLONTerminalRuleCall_2_1___or___STRINGTerminalRuleCall_1_0_COLONTerminalRuleCall_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getIDTerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getCOLONTerminalRuleCall_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getINTTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getCOLONTerminalRuleCall_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getSTRINGTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getObjectFieldAccess().getCOLONTerminalRuleCall_1_1())));
		match_parameter_CONSTTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getCONSTTerminalRuleCall_0());
		match_parameter_TypeRelationParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getTypeRelationParserRuleCall_2());
		match_parameters_TypeRelationParserRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getParametersAccess().getTypeRelationParserRuleCall_1_2());
		match_statement_SEMITerminalRuleCall_0_or___BREAKTerminalRuleCall_4_0_SEMITerminalRuleCall_4_2___or___CONTINUETerminalRuleCall_5_0_SEMITerminalRuleCall_5_2___or___RETURNTerminalRuleCall_6_0_SEMITerminalRuleCall_6_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getBREAKTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSEMITerminalRuleCall_4_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getCONTINUETerminalRuleCall_5_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSEMITerminalRuleCall_5_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getRETURNTerminalRuleCall_6_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSEMITerminalRuleCall_6_2())), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSEMITerminalRuleCall_0()));
		match_terminalExpr_DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getDOUBLETerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getFALSETerminalRuleCall_5()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getNULLTerminalRuleCall_6()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getREGEXPParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getSTRINGTerminalRuleCall_2()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getTRUETerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getThisKeyword_9()));
		match_terminalExpr___DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9___or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getDOUBLETerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getFALSETerminalRuleCall_5()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getNULLTerminalRuleCall_6()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getREGEXPParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getSTRINGTerminalRuleCall_2()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getTRUETerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getThisKeyword_9())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getNEWTerminalRuleCall_11_0()), new TokenAlias(false, false, grammarAccess.getTerminalExprAccess().getTypeParserRuleCall_11_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getABSTRACTRule())
			return getABSTRACTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASRule())
			return getASToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBREAKRule())
			return getBREAKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCASERule())
			return getCASEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCATCHRule())
			return getCATCHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCLASSRule())
			return getCLASSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCONSTRule())
			return getCONSTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCONTINUERule())
			return getCONTINUEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDBL_COLONRule())
			return getDBL_COLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEFAULTRule())
			return getDEFAULTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDELETERule())
			return getDELETEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDORule())
			return getDOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOUBLERule())
			return getDOUBLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEACHRule())
			return getEACHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXTENDSRule())
			return getEXTENDSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFALSERule())
			return getFALSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFINALRule())
			return getFINALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFINALLYRule())
			return getFINALLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFORRule())
			return getFORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTIONRule())
			return getFUNCTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGETRule())
			return getGETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPLEMENTSRule())
			return getIMPLEMENTSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPORTRule())
			return getIMPORTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINRule())
			return getINToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINFIX_OPERATORRule())
			return getINFIX_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTERNALRule())
			return getINTERNALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getISRule())
			return getISToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACKRule())
			return getLBRACKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLCURLYRule())
			return getLCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNEWRule())
			return getNEWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNULLRule())
			return getNULLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOVERRIDERule())
			return getOVERRIDEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPACKAGERule())
			return getPACKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPOSTFIX_OPERATORRule())
			return getPOSTFIX_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPREFIX_OPERATORRule())
			return getPREFIX_OPERATORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPRIVATERule())
			return getPRIVATEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPROTECTEDRule())
			return getPROTECTEDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPUBLICRule())
			return getPUBLICToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQUESTIONRule())
			return getQUESTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACKRule())
			return getRBRACKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRCURLYRule())
			return getRCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getREGEXPRule())
			return getREGEXPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRETURNRule())
			return getRETURNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMIRule())
			return getSEMIToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSETRule())
			return getSETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTARRule())
			return getSTARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTATICRule())
			return getSTATICToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSWITCHRule())
			return getSWITCHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTHROWRule())
			return getTHROWToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTRUERule())
			return getTRUEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTRYRule())
			return getTRYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUSERule())
			return getUSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVARRule())
			return getVARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWHILERule())
			return getWHILEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConstOrVarRule())
			return getconstOrVarToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRule())
			return gettypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRelationRule())
			return gettypeRelationToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ABSTRACT   : 'abstract';
	 */
	protected String getABSTRACTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "abstract";
	}
	
	/**
	 * terminal AS    : 'as';
	 */
	protected String getASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "as";
	}
	
	/**
	 * terminal BREAK   : 'break';
	 */
	protected String getBREAKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "break";
	}
	
	/**
	 * terminal CASE    : 'case';
	 */
	protected String getCASEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "case";
	}
	
	/**
	 * terminal CATCH   : 'catch';
	 */
	protected String getCATCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "catch";
	}
	
	/**
	 * terminal CLASS   : 'class';
	 */
	protected String getCLASSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "class";
	}
	
	/**
	 * terminal COLON     : ':' ;
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA     : ',' ;
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal CONST   : 'const';
	 */
	protected String getCONSTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "const";
	}
	
	/**
	 * terminal CONTINUE  : 'continue';
	 */
	protected String getCONTINUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "continue";
	}
	
	/**
	 * terminal DBL_COLON   : '::'  ;
	 */
	protected String getDBL_COLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "::";
	}
	
	/**
	 * terminal DEFAULT   : 'default';
	 */
	protected String getDEFAULTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "default";
	}
	
	/**
	 * terminal DELETE    : 'delete';
	 */
	protected String getDELETEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "delete";
	}
	
	/**
	 * terminal DO    : 'do';
	 */
	protected String getDOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "do";
	}
	
	/**
	 * terminal DOT   : '.' ;
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal DOUBLE:
	 *     INT DOT INT;
	 */
	protected String getDOUBLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal EACH    : 'each';
	 */
	protected String getEACHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "each";
	}
	
	/**
	 * terminal ELSE    : 'else';
	 */
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * terminal EQUAL     : '=='  ;
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * terminal EXTENDS   : 'extends';
	 */
	protected String getEXTENDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extends";
	}
	
	/**
	 * terminal FALSE   : 'false';
	 */
	protected String getFALSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "false";
	}
	
	/**
	 * terminal FINAL   : 'final';
	 */
	protected String getFINALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "final";
	}
	
	/**
	 * terminal FINALLY   : 'finally';
	 */
	protected String getFINALLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "finally";
	}
	
	/**
	 * terminal FOR   : 'for';
	 */
	protected String getFORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "for";
	}
	
	/**
	 * terminal FUNCTION  : 'function';
	 */
	protected String getFUNCTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "function";
	}
	
	/**
	 * terminal GET   : 'get';
	 */
	protected String getGETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "get";
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
	 * terminal IF    : 'if';
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal IMPLEMENTS  : 'implements';
	 */
	protected String getIMPLEMENTSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "implements";
	}
	
	/**
	 * terminal IMPORT    : 'import';
	 */
	protected String getIMPORTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import";
	}
	
	/**
	 * terminal IN    : 'in';
	 */
	protected String getINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in";
	}
	
	/**
	 * INFIX_OPERATOR:
	 *   PLUS | MINUS | STAR | DIV;
	 */
	protected String getINFIX_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
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
	 * terminal INTERNAL  : 'internal';
	 */
	protected String getINTERNALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "internal";
	}
	
	/**
	 * terminal IS    : 'is';
	 */
	protected String getISToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "is";
	}
	
	/**
	 * terminal LBRACK      : '[' ;
	 */
	protected String getLBRACKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal LCURLY      : '{' ;
	 */
	protected String getLCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LPAREN      : '(' ;
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal NEW   : 'new';
	 */
	protected String getNEWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "new";
	}
	
	/**
	 * terminal NULL    : 'null';
	 */
	protected String getNULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	/**
	 * terminal OVERRIDE  : 'override';
	 */
	protected String getOVERRIDEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "override";
	}
	
	/**
	 * terminal PACKAGE   : 'package';
	 */
	protected String getPACKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "package";
	}
	
	/**
	 * POSTFIX_OPERATOR:
	 *   DEC|INC;
	 */
	protected String getPOSTFIX_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
	}
	
	/**
	 * PREFIX_OPERATOR:
	 *   POSTFIX_OPERATOR;
	 */
	protected String getPREFIX_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
	}
	
	/**
	 * terminal PRIVATE   : 'private';
	 */
	protected String getPRIVATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "private";
	}
	
	/**
	 * terminal PROTECTED : 'protected';
	 */
	protected String getPROTECTEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "protected";
	}
	
	/**
	 * terminal PUBLIC    : 'public';
	 */
	protected String getPUBLICToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "public";
	}
	
	/**
	 * terminal QUESTION    : '?' ;
	 */
	protected String getQUESTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?";
	}
	
	/**
	 * terminal RBRACK      : ']' ;
	 */
	protected String getRBRACKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal RCURLY      : '}' ;
	 */
	protected String getRCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * REGEXP:
	 *   STRING;
	 */
	protected String getREGEXPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal RETURN    : 'return';
	 */
	protected String getRETURNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "return";
	}
	
	/**
	 * terminal RPAREN      : ')' ;
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEMI      : ';' ;
	 */
	protected String getSEMIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal SET   : 'set';
	 */
	protected String getSETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "set";
	}
	
	/**
	 * terminal STAR      : '*' ;
	 */
	protected String getSTARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal STATIC    : 'static';
	 */
	protected String getSTATICToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
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
	
	/**
	 * terminal SWITCH    : 'switch';
	 */
	protected String getSWITCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "switch";
	}
	
	/**
	 * terminal THROW   : 'throw';
	 */
	protected String getTHROWToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "throw";
	}
	
	/**
	 * terminal TRUE    : 'true';
	 */
	protected String getTRUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal TRY   : 'try';
	 */
	protected String getTRYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "try";
	}
	
	/**
	 * terminal USE   : 'use';
	 */
	protected String getUSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "use";
	}
	
	/**
	 * terminal VAR   : 'var';
	 */
	protected String getVARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "var";
	}
	
	/**
	 * terminal WHILE   : 'while';
	 */
	protected String getWHILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "while";
	}
	
	/**
	 * constOrVar :
	 *     CONST
	 *   | VAR;
	 */
	protected String getconstOrVarToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "const";
	}
	
	/**
	 * type :
	 *     qualifiedIde
	 *   | STAR
	 *   | VOID;
	 */
	protected String gettypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * typeRelation :
	 *     COLON type;
	 */
	protected String gettypeRelationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_arrayLiteral_terminalExpr_LBRACKTerminalRuleCall_0_or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1_LPARENTerminalRuleCall_11_2_0__.equals(syntax))
				emit_arrayLiteral_terminalExpr_LBRACKTerminalRuleCall_0_or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1_LPARENTerminalRuleCall_11_2_0__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_directive___DOTTerminalRuleCall_0_2_0_STARTerminalRuleCall_0_2_1__q.equals(syntax))
				emit_directive___DOTTerminalRuleCall_0_2_0_STARTerminalRuleCall_0_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_labelableStatement_EACHTerminalRuleCall_6_1_q.equals(syntax))
				emit_labelableStatement_EACHTerminalRuleCall_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_labelableStatement_EACHTerminalRuleCall_7_1_q.equals(syntax))
				emit_labelableStatement_EACHTerminalRuleCall_7_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_lvalue___SuperKeyword_3_0_DOTTerminalRuleCall_3_1__q.equals(syntax))
				emit_lvalue___SuperKeyword_3_0_DOTTerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_methodDeclaration_TypeRelationParserRuleCall_7_q.equals(syntax))
				emit_methodDeclaration_TypeRelationParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_methodDeclaration___GETTerminalRuleCall_2_0_or_SETTerminalRuleCall_2_1__q.equals(syntax))
				emit_methodDeclaration___GETTerminalRuleCall_2_0_or_SETTerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_objectField___IDTerminalRuleCall_0_0_COLONTerminalRuleCall_0_1___or___INTTerminalRuleCall_2_0_COLONTerminalRuleCall_2_1___or___STRINGTerminalRuleCall_1_0_COLONTerminalRuleCall_1_1__.equals(syntax))
				emit_objectField___IDTerminalRuleCall_0_0_COLONTerminalRuleCall_0_1___or___INTTerminalRuleCall_2_0_COLONTerminalRuleCall_2_1___or___STRINGTerminalRuleCall_1_0_COLONTerminalRuleCall_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_parameter_CONSTTerminalRuleCall_0_q.equals(syntax))
				emit_parameter_CONSTTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_parameter_TypeRelationParserRuleCall_2_q.equals(syntax))
				emit_parameter_TypeRelationParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_parameters_TypeRelationParserRuleCall_1_2_q.equals(syntax))
				emit_parameters_TypeRelationParserRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_statement_SEMITerminalRuleCall_0_or___BREAKTerminalRuleCall_4_0_SEMITerminalRuleCall_4_2___or___CONTINUETerminalRuleCall_5_0_SEMITerminalRuleCall_5_2___or___RETURNTerminalRuleCall_6_0_SEMITerminalRuleCall_6_2__.equals(syntax))
				emit_statement_SEMITerminalRuleCall_0_or___BREAKTerminalRuleCall_4_0_SEMITerminalRuleCall_4_2___or___CONTINUETerminalRuleCall_5_0_SEMITerminalRuleCall_5_2___or___RETURNTerminalRuleCall_6_0_SEMITerminalRuleCall_6_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_terminalExpr_DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9.equals(syntax))
				emit_terminalExpr_DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_terminalExpr___DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9___or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1__.equals(syntax))
				emit_terminalExpr___DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9___or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (NEW type LPAREN) | LBRACK
	 */
	protected void emit_arrayLiteral_terminalExpr_LBRACKTerminalRuleCall_0_or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1_LPARENTerminalRuleCall_11_2_0__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (DOT STAR)?
	 */
	protected void emit_directive___DOTTerminalRuleCall_0_2_0_STARTerminalRuleCall_0_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     EACH?
	 */
	protected void emit_labelableStatement_EACHTerminalRuleCall_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     EACH?
	 */
	protected void emit_labelableStatement_EACHTerminalRuleCall_7_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('super' DOT)?
	 */
	protected void emit_lvalue___SuperKeyword_3_0_DOTTerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     typeRelation?
	 */
	protected void emit_methodDeclaration_TypeRelationParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (GET | SET)?
	 */
	protected void emit_methodDeclaration___GETTerminalRuleCall_2_0_or_SETTerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID COLON) | (STRING COLON) | (INT COLON)
	 */
	protected void emit_objectField___IDTerminalRuleCall_0_0_COLONTerminalRuleCall_0_1___or___INTTerminalRuleCall_2_0_COLONTerminalRuleCall_2_1___or___STRINGTerminalRuleCall_1_0_COLONTerminalRuleCall_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CONST?
	 */
	protected void emit_parameter_CONSTTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     typeRelation?
	 */
	protected void emit_parameter_TypeRelationParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     typeRelation?
	 */
	protected void emit_parameters_TypeRelationParserRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (CONTINUE SEMI) | (RETURN SEMI) | (BREAK SEMI) | SEMI
	 */
	protected void emit_statement_SEMITerminalRuleCall_0_or___BREAKTerminalRuleCall_4_0_SEMITerminalRuleCall_4_2___or___CONTINUETerminalRuleCall_5_0_SEMITerminalRuleCall_5_2___or___RETURNTerminalRuleCall_6_0_SEMITerminalRuleCall_6_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     INT | 
	     'this' | 
	     STRING | 
	     REGEXP | 
	     DOUBLE | 
	     NULL | 
	     TRUE | 
	     FALSE
	 )
	 */
	protected void emit_terminalExpr_DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         INT | 
	         'this' | 
	         STRING | 
	         REGEXP | 
	         DOUBLE | 
	         NULL | 
	         TRUE | 
	         FALSE
	     ) | 
	     (NEW type)
	 )
	 */
	protected void emit_terminalExpr___DOUBLETerminalRuleCall_1_or_FALSETerminalRuleCall_5_or_INTTerminalRuleCall_0_or_NULLTerminalRuleCall_6_or_REGEXPParserRuleCall_3_or_STRINGTerminalRuleCall_2_or_TRUETerminalRuleCall_4_or_ThisKeyword_9___or___NEWTerminalRuleCall_11_0_TypeParserRuleCall_11_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
