package org.uppaal.xml.description.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import org.uppaal.xml.description.description.DescriptionPackage;
import org.uppaal.xml.description.description.UAAddExpression;
import org.uppaal.xml.description.description.UAAdditionAssignmentExpression;
import org.uppaal.xml.description.description.UAArrayDeclaration;
import org.uppaal.xml.description.description.UAArrayExpression;
import org.uppaal.xml.description.description.UAAssignmentExpression;
import org.uppaal.xml.description.description.UABitAndAssignmentExpression;
import org.uppaal.xml.description.description.UABitAndExpression;
import org.uppaal.xml.description.description.UABitLeftAssignmentExpression;
import org.uppaal.xml.description.description.UABitLeftExpression;
import org.uppaal.xml.description.description.UABitOrAssignmentExpression;
import org.uppaal.xml.description.description.UABitOrExpression;
import org.uppaal.xml.description.description.UABitRightAssignmentExpression;
import org.uppaal.xml.description.description.UABitRightExpression;
import org.uppaal.xml.description.description.UABitXORAssignmentExpression;
import org.uppaal.xml.description.description.UABitXORExpression;
import org.uppaal.xml.description.description.UABooleanLiteral;
import org.uppaal.xml.description.description.UABooleanType;
import org.uppaal.xml.description.description.UAChannelType;
import org.uppaal.xml.description.description.UAClockType;
import org.uppaal.xml.description.description.UAConditionalExpression;
import org.uppaal.xml.description.description.UADeclarations;
import org.uppaal.xml.description.description.UADivideExpression;
import org.uppaal.xml.description.description.UADivisionAssignmentExpression;
import org.uppaal.xml.description.description.UAEqualExpression;
import org.uppaal.xml.description.description.UAExistsExpression;
import org.uppaal.xml.description.description.UAFieldDeclaration;
import org.uppaal.xml.description.description.UAFieldID;
import org.uppaal.xml.description.description.UAForallExpression;
import org.uppaal.xml.description.description.UAGreaterEqualExpression;
import org.uppaal.xml.description.description.UAGreaterExpression;
import org.uppaal.xml.description.description.UAImplyExpression;
import org.uppaal.xml.description.description.UAInstantiation;
import org.uppaal.xml.description.description.UAIntegerType;
import org.uppaal.xml.description.description.UALessEqualExpression;
import org.uppaal.xml.description.description.UALessExpression;
import org.uppaal.xml.description.description.UALogicAndExpression;
import org.uppaal.xml.description.description.UALogicNotExpression;
import org.uppaal.xml.description.description.UALogicOrExpression;
import org.uppaal.xml.description.description.UAMaxExpression;
import org.uppaal.xml.description.description.UAMinExpression;
import org.uppaal.xml.description.description.UAMinusExpression;
import org.uppaal.xml.description.description.UAModuloAssignmentExpression;
import org.uppaal.xml.description.description.UAModuloExpression;
import org.uppaal.xml.description.description.UAMultiInitialiser;
import org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression;
import org.uppaal.xml.description.description.UAMultiplyExpression;
import org.uppaal.xml.description.description.UANumberLiteral;
import org.uppaal.xml.description.description.UAParameter;
import org.uppaal.xml.description.description.UAParameters;
import org.uppaal.xml.description.description.UAPostDecrementExpression;
import org.uppaal.xml.description.description.UAPostIncrementExpression;
import org.uppaal.xml.description.description.UAPreDecrementExpression;
import org.uppaal.xml.description.description.UAPreIncrementExpression;
import org.uppaal.xml.description.description.UAReference;
import org.uppaal.xml.description.description.UAScalarType;
import org.uppaal.xml.description.description.UASelect;
import org.uppaal.xml.description.description.UASelectList;
import org.uppaal.xml.description.description.UASingleInitialiser;
import org.uppaal.xml.description.description.UAStructExpression;
import org.uppaal.xml.description.description.UAStructType;
import org.uppaal.xml.description.description.UASubtractExpression;
import org.uppaal.xml.description.description.UASubtractionAssignmentExpression;
import org.uppaal.xml.description.description.UASynchronisation;
import org.uppaal.xml.description.description.UASystem;
import org.uppaal.xml.description.description.UASystemDefinition;
import org.uppaal.xml.description.description.UASystemID;
import org.uppaal.xml.description.description.UAType;
import org.uppaal.xml.description.description.UATypeDeclaration;
import org.uppaal.xml.description.description.UATypeID;
import org.uppaal.xml.description.description.UATypeModifiers;
import org.uppaal.xml.description.description.UAUnequalExpression;
import org.uppaal.xml.description.description.UAUpdate;
import org.uppaal.xml.description.description.UAUserType;
import org.uppaal.xml.description.description.UAVariableDeclaration;
import org.uppaal.xml.description.description.UAVariableID;
import org.uppaal.xml.description.services.DescriptionGrammarAccess;

@SuppressWarnings("all")
public class DescriptionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DescriptionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DescriptionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DescriptionPackage.UA_ADD_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAdditiveExpression(context, (UAAddExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_ADDITION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UAAdditionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_ARRAY_DECLARATION:
				if(context == grammarAccess.getUAArrayDeclarationRule()) {
					sequence_UAArrayDeclaration(context, (UAArrayDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_ARRAY_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAArrayExpression(context, (UAArrayExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UAAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_AND_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UABitAndAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_AND_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABitAndExpression(context, (UABitAndExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UABitLeftAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_LEFT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABitLeftBRightExpression(context, (UABitLeftExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_OR_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UABitOrAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_OR_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABitOrExpression(context, (UABitOrExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UABitRightAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_RIGHT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABitLeftBRightExpression(context, (UABitRightExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_XOR_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UABitXORAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BIT_XOR_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABitXORExpression(context, (UABitXORExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BOOLEAN_LITERAL:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABooleanLiteralRule() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UABooleanLiteral(context, (UABooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_BOOLEAN_TYPE:
				if(context == grammarAccess.getUABooleanTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UABooleanType(context, (UABooleanType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_CHANNEL_TYPE:
				if(context == grammarAccess.getUAChannelTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UAChannelType(context, (UAChannelType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_CLOCK_TYPE:
				if(context == grammarAccess.getUAClockTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UAClockType(context, (UAClockType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAConditionalExpression(context, (UAConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_DECLARATIONS:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUADeclarationsRule()) {
					sequence_UADeclarations(context, (UADeclarations) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_DIVIDE_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAMultiplicativeExpression(context, (UADivideExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_DIVISION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UADivisionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_EQUAL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAEqualityExpression(context, (UAEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_EXISTS_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAExpression(context, (UAExistsExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_FIELD_DECLARATION:
				if(context == grammarAccess.getUAFieldDeclarationRule()) {
					sequence_UAFieldDeclaration(context, (UAFieldDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_FIELD_ID:
				if(context == grammarAccess.getUAFieldIDRule()) {
					sequence_UAFieldID(context, (UAFieldID) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_FORALL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAExpression(context, (UAForallExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_GREATER_EQUAL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAInequalityExpression(context, (UAGreaterEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_GREATER_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAInequalityExpression(context, (UAGreaterExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_IMPLY_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAImplyLogicOrExpression(context, (UAImplyExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_INSTANTIATION:
				if(context == grammarAccess.getUADefinitionRule() ||
				   context == grammarAccess.getUAInstantiationRule()) {
					sequence_UAInstantiation(context, (UAInstantiation) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_INTEGER_TYPE:
				if(context == grammarAccess.getUAIntegerTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UAIntegerType(context, (UAIntegerType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_LESS_EQUAL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAInequalityExpression(context, (UALessEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_LESS_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAInequalityExpression(context, (UALessExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_LOGIC_AND_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UALogicAndExpression1_UALogicAndExpression2(context, (UALogicAndExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_LOGIC_NOT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAUnaryExpression(context, (UALogicNotExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_LOGIC_OR_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAImplyLogicOrExpression_UALogicOrExpression2(context, (UALogicOrExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MAX_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAMinMaxExpression(context, (UAMaxExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MIN_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAMinMaxExpression(context, (UAMinExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MINUS_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAUnaryExpression(context, (UAMinusExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MODULO_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UAModuloAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MODULO_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAMultiplicativeExpression(context, (UAModuloExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MULTI_INITIALISER:
				if(context == grammarAccess.getUAInitialiserRule() ||
				   context == grammarAccess.getUAMultiInitialiserRule()) {
					sequence_UAMultiInitialiser(context, (UAMultiInitialiser) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UAMultiplicationAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_MULTIPLY_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAMultiplicativeExpression(context, (UAMultiplyExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_NUMBER_LITERAL:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUANumberLiteralRule() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UANumberLiteral(context, (UANumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_PARAMETER:
				if(context == grammarAccess.getUAParameterRule()) {
					sequence_UAParameter(context, (UAParameter) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_PARAMETERS:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAParametersRule()) {
					sequence_UAParameters(context, (UAParameters) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_POST_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAPostfixExpression(context, (UAPostDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_POST_INCREMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAPostfixExpression(context, (UAPostIncrementExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_PRE_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAPrefixExpression(context, (UAPreDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_PRE_INCREMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAPrefixExpression(context, (UAPreIncrementExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_REFERENCE:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAReferenceRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAReference(context, (UAReference) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SCALAR_TYPE:
				if(context == grammarAccess.getUAScalarTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UAScalarType(context, (UAScalarType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SELECT:
				if(context == grammarAccess.getUASelectRule()) {
					sequence_UASelect(context, (UASelect) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SELECT_LIST:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUASelectListRule()) {
					sequence_UASelectList(context, (UASelectList) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SINGLE_INITIALISER:
				if(context == grammarAccess.getUAInitialiserRule() ||
				   context == grammarAccess.getUASingleInitialiserRule()) {
					sequence_UASingleInitialiser(context, (UASingleInitialiser) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_STRUCT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAStructExpression(context, (UAStructExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_STRUCT_TYPE:
				if(context == grammarAccess.getUAStructTypeRule() ||
				   context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UAStructType(context, (UAStructType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SUBTRACT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAdditiveExpression(context, (UASubtractExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAAssignmentExpression(context, (UASubtractionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SYNCHRONISATION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUASynchronisationRule()) {
					sequence_UASynchronisation(context, (UASynchronisation) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SYSTEM:
				if(context == grammarAccess.getUASystemRule()) {
					sequence_UASystem(context, (UASystem) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SYSTEM_DEFINITION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUASystemDefinitionRule()) {
					sequence_UASystemDefinition(context, (UASystemDefinition) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_SYSTEM_ID:
				if(context == grammarAccess.getUASystemIDRule()) {
					sequence_UASystemID(context, (UASystemID) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_TYPE:
				if(context == grammarAccess.getUATypeRule()) {
					sequence_UAType(context, (UAType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_TYPE_DECLARATION:
				if(context == grammarAccess.getUADeclarationRule() ||
				   context == grammarAccess.getUADefinitionRule() ||
				   context == grammarAccess.getUATypeDeclarationRule()) {
					sequence_UATypeDeclaration(context, (UATypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_TYPE_ID:
				if(context == grammarAccess.getUATypeIDRule()) {
					sequence_UATypeID(context, (UATypeID) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_TYPE_MODIFIERS:
				if(context == grammarAccess.getUATypeModifiersRule()) {
					sequence_UATypeModifiers(context, (UATypeModifiers) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_UNEQUAL_EXPRESSION:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAAdditiveExpressionRule() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAArrayExpressionRule() ||
				   context == grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionRule() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUABitAndExpressionRule() ||
				   context == grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionRule() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUABitOrExpressionRule() ||
				   context == grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUABitXORExpressionRule() ||
				   context == grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAConditionalExpressionRule() ||
				   context == grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getUAEqualityExpressionRule() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAImplyLogicOrExpressionAccess().getUALogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionRule() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUALogicAndExpression1Rule() ||
				   context == grammarAccess.getUALogicAndExpression1Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicAndExpression2Rule() ||
				   context == grammarAccess.getUALogicAndExpression2Access().getUALogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUALogicNotExpression1Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Rule() ||
				   context == grammarAccess.getUALogicOrExpression2Access().getUALogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getUAMinMaxExpressionRule() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionRule() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUAParenthesizedExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionRule() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getUAPrefixExpressionRule() ||
				   context == grammarAccess.getUAPrimaryExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionRule() ||
				   context == grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUAUnaryExpressionRule()) {
					sequence_UAEqualityExpression(context, (UAUnequalExpression) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_UPDATE:
				if(context == grammarAccess.getTopRule() ||
				   context == grammarAccess.getUAUpdateRule()) {
					sequence_UAUpdate(context, (UAUpdate) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_USER_TYPE:
				if(context == grammarAccess.getUATypeIdentifierRule()) {
					sequence_UATypeIdentifier(context, (UAUserType) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_VARIABLE_DECLARATION:
				if(context == grammarAccess.getUADeclarationRule() ||
				   context == grammarAccess.getUADefinitionRule() ||
				   context == grammarAccess.getUAVariableDeclarationRule()) {
					sequence_UAVariableDeclaration(context, (UAVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DescriptionPackage.UA_VARIABLE_ID:
				if(context == grammarAccess.getUAVariableIDRule()) {
					sequence_UAVariableID(context, (UAVariableID) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=UAAdditiveExpression_UAAddExpression_1_0_0_0 right=UAMultiplicativeExpression)
	 */
	protected void sequence_UAAdditiveExpression(EObject context, UAAddExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ADD_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ADD_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ADD_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ADD_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAdditiveExpressionAccess().getUAAddExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAdditiveExpressionAccess().getRightUAMultiplicativeExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAdditiveExpression_UASubtractExpression_1_0_1_0 right=UAMultiplicativeExpression)
	 */
	protected void sequence_UAAdditiveExpression(EObject context, UASubtractExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SUBTRACT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SUBTRACT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SUBTRACT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SUBTRACT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAdditiveExpressionAccess().getUASubtractExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAdditiveExpressionAccess().getRightUAMultiplicativeExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     size=UAExpression
	 */
	protected void sequence_UAArrayDeclaration(EObject context, UAArrayDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ARRAY_DECLARATION__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ARRAY_DECLARATION__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAArrayDeclarationAccess().getSizeUAExpressionParserRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAArrayExpression_UAArrayExpression_1_0 right=UAExpression)
	 */
	protected void sequence_UAArrayExpression(EObject context, UAArrayExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ARRAY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ARRAY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ARRAY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ARRAY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAArrayExpressionAccess().getUAArrayExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAArrayExpressionAccess().getRightUAExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UAAdditionAssignmentExpression_1_0_2_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UAAdditionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ADDITION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ADDITION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUAAdditionAssignmentExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=UAAssignmentExpression_UAAssignmentExpression_1_0_0_0 right=UAAssignmentExpression) | 
	 *         (left=UAAssignmentExpression_UAAssignmentExpression_1_0_1_0 right=UAAssignmentExpression)
	 *     )
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UAAssignmentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UABitAndAssignmentExpression_1_0_8_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UABitAndAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUABitAndAssignmentExpressionLeftAction_1_0_8_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UABitLeftAssignmentExpression_1_0_10_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UABitLeftAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUABitLeftAssignmentExpressionLeftAction_1_0_10_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UABitOrAssignmentExpression_1_0_7_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UABitOrAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUABitOrAssignmentExpressionLeftAction_1_0_7_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UABitRightAssignmentExpression_1_0_11_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UABitRightAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUABitRightAssignmentExpressionLeftAction_1_0_11_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UABitXORAssignmentExpression_1_0_9_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UABitXORAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUABitXORAssignmentExpressionLeftAction_1_0_9_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UADivisionAssignmentExpression_1_0_5_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UADivisionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_DIVISION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_DIVISION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUADivisionAssignmentExpressionLeftAction_1_0_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UAModuloAssignmentExpression_1_0_6_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UAModuloAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MODULO_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MODULO_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MODULO_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MODULO_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUAModuloAssignmentExpressionLeftAction_1_0_6_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UAMultiplicationAssignmentExpression_1_0_4_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UAMultiplicationAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUAMultiplicationAssignmentExpressionLeftAction_1_0_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAAssignmentExpression_UASubtractionAssignmentExpression_1_0_3_0 right=UAAssignmentExpression)
	 */
	protected void sequence_UAAssignmentExpression(EObject context, UASubtractionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getUASubtractionAssignmentExpressionLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAAssignmentExpressionAccess().getRightUAAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UABitAndExpression_UABitAndExpression_1_0_0 right=UAEqualityExpression)
	 */
	protected void sequence_UABitAndExpression(EObject context, UABitAndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_AND_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABitAndExpressionAccess().getUABitAndExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUABitAndExpressionAccess().getRightUAEqualityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UABitLeftBRightExpression_UABitLeftExpression_1_0_0_0 right=UAAdditiveExpression)
	 */
	protected void sequence_UABitLeftBRightExpression(EObject context, UABitLeftExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_LEFT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABitLeftBRightExpressionAccess().getUABitLeftExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUABitLeftBRightExpressionAccess().getRightUAAdditiveExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UABitLeftBRightExpression_UABitRightExpression_1_0_1_0 right=UAAdditiveExpression)
	 */
	protected void sequence_UABitLeftBRightExpression(EObject context, UABitRightExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_RIGHT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABitLeftBRightExpressionAccess().getUABitRightExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUABitLeftBRightExpressionAccess().getRightUAAdditiveExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UABitOrExpression_UABitOrExpression_1_0_0 right=UABitXORExpression)
	 */
	protected void sequence_UABitOrExpression(EObject context, UABitOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABitOrExpressionAccess().getUABitOrExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUABitOrExpressionAccess().getRightUABitXORExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UABitXORExpression_UABitXORExpression_1_0_0 right=UABitAndExpression)
	 */
	protected void sequence_UABitXORExpression(EObject context, UABitXORExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BIT_XOR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABitXORExpressionAccess().getUABitXORExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUABitXORExpressionAccess().getRightUABitAndExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_UABooleanLiteral(EObject context, UABooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUABooleanLiteralAccess().getValueBOOLParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {UABooleanType}
	 */
	protected void sequence_UABooleanType(EObject context, UABooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UAChannelType}
	 */
	protected void sequence_UAChannelType(EObject context, UAChannelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UAClockType}
	 */
	protected void sequence_UAClockType(EObject context, UAClockType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=UAConditionalExpression_UAConditionalExpression_1_0 then=UALogicOrExpression2 else=UAConditionalExpression)
	 */
	protected void sequence_UAConditionalExpression(EObject context, UAConditionalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__CONDITION));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__THEN));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_CONDITIONAL_EXPRESSION__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAConditionalExpressionAccess().getUAConditionalExpressionConditionAction_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getUAConditionalExpressionAccess().getThenUALogicOrExpression2ParserRuleCall_1_2_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getUAConditionalExpressionAccess().getElseUAConditionalExpressionParserRuleCall_1_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=UADeclaration declarations+=UADeclaration*)
	 */
	protected void sequence_UADeclarations(EObject context, UADeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAEqualityExpression_UAEqualExpression_1_0_0_0 right=UAInequalityExpression)
	 */
	protected void sequence_UAEqualityExpression(EObject context, UAEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAEqualityExpressionAccess().getUAEqualExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAEqualityExpressionAccess().getRightUAInequalityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAEqualityExpression_UAUnequalExpression_1_0_1_0 right=UAInequalityExpression)
	 */
	protected void sequence_UAEqualityExpression(EObject context, UAUnequalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_UNEQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_UNEQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_UNEQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_UNEQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAEqualityExpressionAccess().getUAUnequalExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAEqualityExpressionAccess().getRightUAInequalityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=UAType expression=UAExpression)
	 */
	protected void sequence_UAExpression(EObject context, UAExistsExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_EXISTS_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAExpressionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUAExpressionAccess().getTypeUATypeParserRuleCall_1_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getUAExpressionAccess().getExpressionUAExpressionParserRuleCall_1_6_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=UAType expression=UAExpression)
	 */
	protected void sequence_UAExpression(EObject context, UAForallExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_FORALL_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAExpressionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUAExpressionAccess().getTypeUATypeParserRuleCall_1_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getUAExpressionAccess().getExpressionUAExpressionParserRuleCall_1_6_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UAType fields+=UAFieldID fields+=UAFieldID*)
	 */
	protected void sequence_UAFieldDeclaration(EObject context, UAFieldDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=UAArrayDeclaration*)
	 */
	protected void sequence_UAFieldID(EObject context, UAFieldID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAImplyLogicOrExpression_UAImplyExpression_1_0_0_0 right=UALogicAndExpression1)
	 */
	protected void sequence_UAImplyLogicOrExpression(EObject context, UAImplyExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_IMPLY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_IMPLY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_IMPLY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_IMPLY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAImplyLogicOrExpressionAccess().getUAImplyExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAImplyLogicOrExpressionAccess().getRightUALogicAndExpression1ParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=UAImplyLogicOrExpression_UALogicOrExpression_1_0_1_0 right=UALogicAndExpression1) | 
	 *         (left=UALogicOrExpression2_UALogicOrExpression_1_0_0 right=UALogicAndExpression2)
	 *     )
	 */
	protected void sequence_UAImplyLogicOrExpression_UALogicOrExpression2(EObject context, UALogicOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAInequalityExpression_UAGreaterEqualExpression_1_0_2_0 right=UAMinMaxExpression)
	 */
	protected void sequence_UAInequalityExpression(EObject context, UAGreaterEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_GREATER_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_GREATER_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_GREATER_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_GREATER_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getUAGreaterEqualExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getRightUAMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAInequalityExpression_UAGreaterExpression_1_0_3_0 right=UAMinMaxExpression)
	 */
	protected void sequence_UAInequalityExpression(EObject context, UAGreaterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_GREATER_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_GREATER_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_GREATER_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_GREATER_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getUAGreaterExpressionLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getRightUAMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAInequalityExpression_UALessEqualExpression_1_0_1_0 right=UAMinMaxExpression)
	 */
	protected void sequence_UAInequalityExpression(EObject context, UALessEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_LESS_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_LESS_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_LESS_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_LESS_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getUALessEqualExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getRightUAMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAInequalityExpression_UALessExpression_1_0_0_0 right=UAMinMaxExpression)
	 */
	protected void sequence_UAInequalityExpression(EObject context, UALessExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_LESS_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_LESS_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_LESS_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_LESS_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getUALessExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAInequalityExpressionAccess().getRightUAMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters=UAParameters? target=ID arguments+=UAExpression arguments+=UAExpression*)
	 */
	protected void sequence_UAInstantiation(EObject context, UAInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((min=UAExpression max=UAExpression)?)
	 */
	protected void sequence_UAIntegerType(EObject context, UAIntegerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=UALogicAndExpression1_UALogicAndExpression_1_0_0 right=UALogicNotExpression1) | 
	 *         (left=UALogicAndExpression2_UALogicAndExpression_1_0_0 right=UABitOrExpression)
	 *     )
	 */
	protected void sequence_UALogicAndExpression1_UALogicAndExpression2(EObject context, UALogicAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAMinMaxExpression_UAMaxExpression_1_0_1_0 right=UABitLeftBRightExpression)
	 */
	protected void sequence_UAMinMaxExpression(EObject context, UAMaxExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MAX_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MAX_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MAX_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MAX_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAMinMaxExpressionAccess().getUAMaxExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAMinMaxExpressionAccess().getRightUABitLeftBRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAMinMaxExpression_UAMinExpression_1_0_0_0 right=UABitLeftBRightExpression)
	 */
	protected void sequence_UAMinMaxExpression(EObject context, UAMinExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MIN_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MIN_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MIN_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MIN_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAMinMaxExpressionAccess().getUAMinExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAMinMaxExpressionAccess().getRightUABitLeftBRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (initialisers+=UAInitialiser initialisers+=UAInitialiser*)
	 */
	protected void sequence_UAMultiInitialiser(EObject context, UAMultiInitialiser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAMultiplicativeExpression_UADivideExpression_1_0_1_0 right=UAPrefixExpression)
	 */
	protected void sequence_UAMultiplicativeExpression(EObject context, UADivideExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_DIVIDE_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_DIVIDE_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_DIVIDE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_DIVIDE_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getUADivideExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getRightUAPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAMultiplicativeExpression_UAModuloExpression_1_0_2_0 right=UAPrefixExpression)
	 */
	protected void sequence_UAMultiplicativeExpression(EObject context, UAModuloExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MODULO_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MODULO_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MODULO_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MODULO_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getUAModuloExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getRightUAPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAMultiplicativeExpression_UAMultiplyExpression_1_0_0_0 right=UAPrefixExpression)
	 */
	protected void sequence_UAMultiplicativeExpression(EObject context, UAMultiplyExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MULTIPLY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MULTIPLY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MULTIPLY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MULTIPLY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getUAMultiplyExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAMultiplicativeExpressionAccess().getRightUAPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_UANumberLiteral(EObject context, UANumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUANumberLiteralAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UAType byReference?='&'? name=ID dimensions+=UAArrayDeclaration*)
	 */
	protected void sequence_UAParameter(EObject context, UAParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=UAParameter parameters+=UAParameter*)
	 */
	protected void sequence_UAParameters(EObject context, UAParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAPostfixExpression_UAPostDecrementExpression_1_1_0
	 */
	protected void sequence_UAPostfixExpression(EObject context, UAPostDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_POST_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_POST_DECREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAPostfixExpressionAccess().getUAPostDecrementExpressionExpressionAction_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAPostfixExpression_UAPostIncrementExpression_1_0_0
	 */
	protected void sequence_UAPostfixExpression(EObject context, UAPostIncrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_POST_INCREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_POST_INCREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAPostfixExpressionAccess().getUAPostIncrementExpressionExpressionAction_1_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAPrefixExpression
	 */
	protected void sequence_UAPrefixExpression(EObject context, UAPreDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_PRE_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_PRE_DECREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAPrefixExpressionAccess().getExpressionUAPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAPrefixExpression
	 */
	protected void sequence_UAPrefixExpression(EObject context, UAPreIncrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_PRE_INCREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_PRE_INCREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAPrefixExpressionAccess().getExpressionUAPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_UAReference(EObject context, UAReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_REFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAReferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     size=UAExpression
	 */
	protected void sequence_UAScalarType(EObject context, UAScalarType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SCALAR_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SCALAR_TYPE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAScalarTypeAccess().getSizeUAExpressionParserRuleCall_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selects+=UASelect selects+=UASelect*)
	 */
	protected void sequence_UASelectList(EObject context, UASelectList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=UAType)
	 */
	protected void sequence_UASelect(EObject context, UASelect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SELECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SELECT__NAME));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SELECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SELECT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUASelectAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUASelectAccess().getTypeUATypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAExpression
	 */
	protected void sequence_UASingleInitialiser(EObject context, UASingleInitialiser semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SINGLE_INITIALISER__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SINGLE_INITIALISER__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUASingleInitialiserAccess().getExpressionUAExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UAStructExpression_UAStructExpression_1_0 right=ID)
	 */
	protected void sequence_UAStructExpression(EObject context, UAStructExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_STRUCT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_STRUCT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_STRUCT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_STRUCT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAStructExpressionAccess().getUAStructExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUAStructExpressionAccess().getRightIDTerminalRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=UAFieldDeclaration declarations+=UAFieldDeclaration*)
	 */
	protected void sequence_UAStructType(EObject context, UAStructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=UAExpression type=UASynchronisationType)
	 */
	protected void sequence_UASynchronisation(EObject context, UASynchronisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SYNCHRONISATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SYNCHRONISATION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SYNCHRONISATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SYNCHRONISATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUASynchronisationAccess().getExpressionUAExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getUASynchronisationAccess().getTypeUASynchronisationTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitions+=UADefinition* system=UASystem?)
	 */
	protected void sequence_UASystemDefinition(EObject context, UASystemDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_UASystemID(EObject context, UASystemID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_SYSTEM_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_SYSTEM_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUASystemIDAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (systems+=UASystemID systems+=UASystemID*)
	 */
	protected void sequence_UASystem(EObject context, UASystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (baseType=UAType types+=UATypeID types+=UATypeID*)
	 */
	protected void sequence_UATypeDeclaration(EObject context, UATypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=UAArrayDeclaration*)
	 */
	protected void sequence_UATypeID(EObject context, UATypeID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_UATypeIdentifier(EObject context, UAUserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_USER_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_USER_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUATypeIdentifierAccess().getNameIDTerminalRuleCall_6_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (urgent?='urgent'? broadcast?='broadcast'? meta?='meta'? const?='const'?)
	 */
	protected void sequence_UATypeModifiers(EObject context, UATypeModifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers=UATypeModifiers identifier=UATypeIdentifier)
	 */
	protected void sequence_UAType(EObject context, UAType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_TYPE__MODIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_TYPE__MODIFIERS));
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_TYPE__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_TYPE__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUATypeAccess().getModifiersUATypeModifiersParserRuleCall_0_0(), semanticObject.getModifiers());
		feeder.accept(grammarAccess.getUATypeAccess().getIdentifierUATypeIdentifierParserRuleCall_1_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAUnaryExpression
	 */
	protected void sequence_UAUnaryExpression(EObject context, UALogicNotExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_LOGIC_NOT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_LOGIC_NOT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAUnaryExpressionAccess().getExpressionUAUnaryExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=UAUnaryExpression
	 */
	protected void sequence_UAUnaryExpression(EObject context, UAMinusExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DescriptionPackage.Literals.UA_MINUS_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DescriptionPackage.Literals.UA_MINUS_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUAUnaryExpressionAccess().getExpressionUAUnaryExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions+=UAExpression expressions+=UAExpression*)?)
	 */
	protected void sequence_UAUpdate(EObject context, UAUpdate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UAType variables+=UAVariableID variables+=UAVariableID*)
	 */
	protected void sequence_UAVariableDeclaration(EObject context, UAVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=UAArrayDeclaration* initialiser=UAInitialiser?)
	 */
	protected void sequence_UAVariableID(EObject context, UAVariableID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
