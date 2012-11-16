package org.uppaal.xml.description.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.uppaal.xml.description.services.DescriptionGrammarAccess;

@SuppressWarnings("all")
public class DescriptionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DescriptionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_UADeclarations_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_UAInstantiation_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1;
	protected AbstractElementAlias match_UAParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_UAParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_UAStructType_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_UASystemDefinition_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_UASystemDefinition_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_UASystem_CommaKeyword_2_0_0_or_LessThanSignKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DescriptionGrammarAccess) access;
		match_UADeclarations_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getUADeclarationsAccess().getSemicolonKeyword_2());
		match_UAInstantiation_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUAInstantiationAccess().getColonEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getUAInstantiationAccess().getEqualsSignKeyword_2_1()));
		match_UAParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getUAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_UAParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getUAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_UAStructType_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUAStructTypeAccess().getSemicolonKeyword_5());
		match_UASystemDefinition_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getUASystemDefinitionAccess().getSemicolonKeyword_1_1());
		match_UASystemDefinition_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getUASystemDefinitionAccess().getSemicolonKeyword_2_1());
		match_UASystem_CommaKeyword_2_0_0_or_LessThanSignKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUASystemAccess().getCommaKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getUASystemAccess().getLessThanSignKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_UADeclarations_SemicolonKeyword_2_q.equals(syntax))
				emit_UADeclarations_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UAInstantiation_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1.equals(syntax))
				emit_UAInstantiation_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UAParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_UAParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UAParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_UAParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UAStructType_SemicolonKeyword_5_q.equals(syntax))
				emit_UAStructType_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UASystemDefinition_SemicolonKeyword_1_1_q.equals(syntax))
				emit_UASystemDefinition_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UASystemDefinition_SemicolonKeyword_2_1_q.equals(syntax))
				emit_UASystemDefinition_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UASystem_CommaKeyword_2_0_0_or_LessThanSignKeyword_2_0_1.equals(syntax))
				emit_UASystem_CommaKeyword_2_0_0_or_LessThanSignKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UADeclarations_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=' | ':='
	 */
	protected void emit_UAInstantiation_ColonEqualsSignKeyword_2_0_or_EqualsSignKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_UAParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_UAParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UAStructType_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UASystemDefinition_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UASystemDefinition_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '<' | ','
	 */
	protected void emit_UASystem_CommaKeyword_2_0_0_or_LessThanSignKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
