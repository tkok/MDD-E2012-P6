package dk.itu.ecdar.text.serializer;

import com.google.inject.Inject;
import dk.itu.ecdar.text.services.EcdarTextGrammarAccess;
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
public class EcdarTextSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EcdarTextGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ETDeclarations_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ETParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_ETParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_ETStructType_SemicolonKeyword_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EcdarTextGrammarAccess) access;
		match_ETDeclarations_SemicolonKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getETDeclarationsAccess().getSemicolonKeyword_1_2());
		match_ETParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getETParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_ETParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getETParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getETPrimarySpecificationExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getETPrimarySpecificationExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_ETStructType_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getETStructTypeAccess().getSemicolonKeyword_5());
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
			if(match_ETDeclarations_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ETDeclarations_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ETParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_ETParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ETParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_ETParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ETStructType_SemicolonKeyword_5_q.equals(syntax))
				emit_ETStructType_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ETDeclarations_SemicolonKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_ETParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_ETParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_ETPrimarySpecificationExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ETStructType_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
