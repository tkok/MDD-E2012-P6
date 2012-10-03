package dk.itu.ecdar.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.ecdar.text.ecdarText.ETActionType;
import dk.itu.ecdar.text.ecdarText.ETAddExpression;
import dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETArrayDeclaration;
import dk.itu.ecdar.text.ecdarText.ETArrayExpression;
import dk.itu.ecdar.text.ecdarText.ETAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitAndExpression;
import dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitLeftExpression;
import dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitOrExpression;
import dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitRightExpression;
import dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitXORExpression;
import dk.itu.ecdar.text.ecdarText.ETBooleanLiteral;
import dk.itu.ecdar.text.ecdarText.ETBooleanType;
import dk.itu.ecdar.text.ecdarText.ETClockType;
import dk.itu.ecdar.text.ecdarText.ETConditionalExpression;
import dk.itu.ecdar.text.ecdarText.ETDeclarations;
import dk.itu.ecdar.text.ecdarText.ETDivideExpression;
import dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETEdge;
import dk.itu.ecdar.text.ecdarText.ETEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETExistsExpression;
import dk.itu.ecdar.text.ecdarText.ETFieldDeclaration;
import dk.itu.ecdar.text.ecdarText.ETFieldID;
import dk.itu.ecdar.text.ecdarText.ETFile;
import dk.itu.ecdar.text.ecdarText.ETForallExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterExpression;
import dk.itu.ecdar.text.ecdarText.ETIO;
import dk.itu.ecdar.text.ecdarText.ETImplyExpression;
import dk.itu.ecdar.text.ecdarText.ETImport;
import dk.itu.ecdar.text.ecdarText.ETInputType;
import dk.itu.ecdar.text.ecdarText.ETIntegerType;
import dk.itu.ecdar.text.ecdarText.ETLessEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETLessExpression;
import dk.itu.ecdar.text.ecdarText.ETLocation;
import dk.itu.ecdar.text.ecdarText.ETLogicAndExpression;
import dk.itu.ecdar.text.ecdarText.ETLogicNotExpression;
import dk.itu.ecdar.text.ecdarText.ETLogicOrExpression;
import dk.itu.ecdar.text.ecdarText.ETMaxExpression;
import dk.itu.ecdar.text.ecdarText.ETMinExpression;
import dk.itu.ecdar.text.ecdarText.ETMinusExpression;
import dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETModuloExpression;
import dk.itu.ecdar.text.ecdarText.ETMultiInitialiser;
import dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETMultiplyExpression;
import dk.itu.ecdar.text.ecdarText.ETNumberLiteral;
import dk.itu.ecdar.text.ecdarText.ETOutputType;
import dk.itu.ecdar.text.ecdarText.ETParameter;
import dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression;
import dk.itu.ecdar.text.ecdarText.ETReference;
import dk.itu.ecdar.text.ecdarText.ETScalarType;
import dk.itu.ecdar.text.ecdarText.ETSelect;
import dk.itu.ecdar.text.ecdarText.ETSingleInitialiser;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBinding;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBody;
import dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition;
import dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation;
import dk.itu.ecdar.text.ecdarText.ETSpecificationReference;
import dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate;
import dk.itu.ecdar.text.ecdarText.ETStructType;
import dk.itu.ecdar.text.ecdarText.ETSubtractExpression;
import dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETType;
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeID;
import dk.itu.ecdar.text.ecdarText.ETTypeModifiers;
import dk.itu.ecdar.text.ecdarText.ETTypeReference;
import dk.itu.ecdar.text.ecdarText.ETUnequalExpression;
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration;
import dk.itu.ecdar.text.ecdarText.ETVariableID;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;
import dk.itu.ecdar.text.services.EcdarTextGrammarAccess;
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
public class EcdarTextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EcdarTextGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcdarTextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcdarTextPackage.ET_ACTION_TYPE:
				if(context == grammarAccess.getETActionTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETActionType(context, (ETActionType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_ADD_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAdditiveExpression(context, (ETAddExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_ADDITION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETAdditionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_ARRAY_DECLARATION:
				if(context == grammarAccess.getETArrayDeclarationRule()) {
					sequence_ETArrayDeclaration(context, (ETArrayDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_ARRAY_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETArrayExpression(context, (ETArrayExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_AND_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETBitAndAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_AND_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBitAndExpression(context, (ETBitAndExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETBitLeftAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_LEFT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBitLeftBRightExpression(context, (ETBitLeftExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_OR_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETBitOrAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_OR_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBitOrExpression(context, (ETBitOrExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETBitRightAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_RIGHT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBitLeftBRightExpression(context, (ETBitRightExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_XOR_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETBitXORAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BIT_XOR_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBitXORExpression(context, (ETBitXORExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BOOLEAN_LITERAL:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBooleanLiteralRule() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETBooleanLiteral(context, (ETBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_BOOLEAN_TYPE:
				if(context == grammarAccess.getETBooleanTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETBooleanType(context, (ETBooleanType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_CLOCK_TYPE:
				if(context == grammarAccess.getETClockTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETClockType(context, (ETClockType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETConditionalExpression(context, (ETConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_DECLARATIONS:
				if(context == grammarAccess.getETDeclarationsRule()) {
					sequence_ETDeclarations(context, (ETDeclarations) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_DIVIDE_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETMultiplicativeExpression(context, (ETDivideExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_DIVISION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETDivisionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_EDGE:
				if(context == grammarAccess.getETEdgeRule()) {
					sequence_ETEdge(context, (ETEdge) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_EQUAL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETEqualityExpression(context, (ETEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_EXISTS_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETExpression(context, (ETExistsExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_FIELD_DECLARATION:
				if(context == grammarAccess.getETFieldDeclarationRule()) {
					sequence_ETFieldDeclaration(context, (ETFieldDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_FIELD_ID:
				if(context == grammarAccess.getETFieldIDRule()) {
					sequence_ETFieldID(context, (ETFieldID) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_FILE:
				if(context == grammarAccess.getETFileRule()) {
					sequence_ETFile(context, (ETFile) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_FORALL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETExpression(context, (ETForallExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_GREATER_EQUAL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETInequalityExpression(context, (ETGreaterEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_GREATER_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETInequalityExpression(context, (ETGreaterExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ETIO:
				if(context == grammarAccess.getETIORule()) {
					sequence_ETIO(context, (ETIO) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_IMPLY_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETImplyLogicOrExpression(context, (ETImplyExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_IMPORT:
				if(context == grammarAccess.getETImportRule()) {
					sequence_ETImport(context, (ETImport) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_INPUT_TYPE:
				if(context == grammarAccess.getETActionTypeRule() ||
				   context == grammarAccess.getETInputTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETInputType(context, (ETInputType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_INTEGER_TYPE:
				if(context == grammarAccess.getETIntegerTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETIntegerType(context, (ETIntegerType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LESS_EQUAL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETInequalityExpression(context, (ETLessEqualExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LESS_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETInequalityExpression(context, (ETLessExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LOCATION:
				if(context == grammarAccess.getETLocationRule()) {
					sequence_ETLocation(context, (ETLocation) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LOGIC_AND_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETLogicAndExpression1_ETLogicAndExpression2(context, (ETLogicAndExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LOGIC_NOT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETUnaryExpression(context, (ETLogicNotExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_LOGIC_OR_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETImplyLogicOrExpression_ETLogicOrExpression2(context, (ETLogicOrExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MAX_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETMinMaxExpression(context, (ETMaxExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MIN_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETMinMaxExpression(context, (ETMinExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MINUS_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETUnaryExpression(context, (ETMinusExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MODULO_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETModuloAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MODULO_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETMultiplicativeExpression(context, (ETModuloExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MULTI_INITIALISER:
				if(context == grammarAccess.getETInitialiserRule() ||
				   context == grammarAccess.getETMultiInitialiserRule()) {
					sequence_ETMultiInitialiser(context, (ETMultiInitialiser) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETMultiplicationAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_MULTIPLY_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETMultiplicativeExpression(context, (ETMultiplyExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_NUMBER_LITERAL:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETNumberLiteralRule() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETNumberLiteral(context, (ETNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_OUTPUT_TYPE:
				if(context == grammarAccess.getETActionTypeRule() ||
				   context == grammarAccess.getETOutputTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETOutputType(context, (ETOutputType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_PARAMETER:
				if(context == grammarAccess.getETParameterRule()) {
					sequence_ETParameter(context, (ETParameter) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_POST_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETPostfixExpression(context, (ETPostDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_POST_INCREMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETPostfixExpression(context, (ETPostIncrementExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_PRE_DECREMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETPrefixExpression(context, (ETPreDecrementExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_PRE_INCREMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETPrefixExpression(context, (ETPreIncrementExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_REFERENCE:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETReferenceRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETReference(context, (ETReference) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SCALAR_TYPE:
				if(context == grammarAccess.getETScalarTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETScalarType(context, (ETScalarType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SELECT:
				if(context == grammarAccess.getETSelectRule()) {
					sequence_ETSelect(context, (ETSelect) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SINGLE_INITIALISER:
				if(context == grammarAccess.getETInitialiserRule() ||
				   context == grammarAccess.getETSingleInitialiserRule()) {
					sequence_ETSingleInitialiser(context, (ETSingleInitialiser) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_BINDING:
				if(context == grammarAccess.getETSpecificationRule() ||
				   context == grammarAccess.getETSpecificationBindingRule()) {
					sequence_ETSpecificationBinding(context, (ETSpecificationBinding) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_BODY:
				if(context == grammarAccess.getETSpecificationBodyRule()) {
					sequence_ETSpecificationBody(context, (ETSpecificationBody) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_COMPOSITION_EXPRESSION:
				if(context == grammarAccess.getETPrimarySpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionRule() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0()) {
					sequence_ETSpecificationCompositionExpression(context, (ETSpecificationCompositionExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_CONJUNCTION_EXPRESSION:
				if(context == grammarAccess.getETPrimarySpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionRule() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0()) {
					sequence_ETSpecificationDisjunctionExpression(context, (ETSpecificationConjunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_DEFINITION:
				if(context == grammarAccess.getETSpecificationRule() ||
				   context == grammarAccess.getETSpecificationDefinitionRule()) {
					sequence_ETSpecificationDefinition(context, (ETSpecificationDefinition) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_DISJUNCTION_EXPRESSION:
				if(context == grammarAccess.getETPrimarySpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionRule() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0()) {
					sequence_ETSpecificationExpression(context, (ETSpecificationDisjunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION:
				if(context == grammarAccess.getETPrimarySpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionRule() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationInstantiationRule()) {
					sequence_ETSpecificationInstantiation(context, (ETSpecificationInstantiation) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_REFERENCE:
				if(context == grammarAccess.getETPrimarySpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionRule() ||
				   context == grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionRule() ||
				   context == grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationExpressionRule() ||
				   context == grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETSpecificationReferenceRule()) {
					sequence_ETSpecificationReference(context, (ETSpecificationReference) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SPECIFICATION_TEMPLATE:
				if(context == grammarAccess.getETSpecificationRule() ||
				   context == grammarAccess.getETSpecificationDefinitionRule() ||
				   context == grammarAccess.getETSpecificationTemplateRule()) {
					sequence_ETSpecificationTemplate(context, (ETSpecificationTemplate) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_STRUCT_TYPE:
				if(context == grammarAccess.getETStructTypeRule() ||
				   context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETStructType(context, (ETStructType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SUBTRACT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAdditiveExpression(context, (ETSubtractExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETAssignmentExpression(context, (ETSubtractionAssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_TYPE:
				if(context == grammarAccess.getETTypeRule()) {
					sequence_ETType(context, (ETType) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_TYPE_DECLARATION:
				if(context == grammarAccess.getETDeclarationRule() ||
				   context == grammarAccess.getETTypeDeclarationRule()) {
					sequence_ETTypeDeclaration(context, (ETTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_TYPE_ID:
				if(context == grammarAccess.getETTypeIDRule()) {
					sequence_ETTypeID(context, (ETTypeID) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_TYPE_MODIFIERS:
				if(context == grammarAccess.getETTypeModifiersRule()) {
					sequence_ETTypeModifiers(context, (ETTypeModifiers) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_TYPE_REFERENCE:
				if(context == grammarAccess.getETTypeIdentifierRule()) {
					sequence_ETTypeIdentifier(context, (ETTypeReference) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_UNEQUAL_EXPRESSION:
				if(context == grammarAccess.getETAdditiveExpressionRule() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETArrayExpressionRule() ||
				   context == grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionRule() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETAssignmentExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0() ||
				   context == grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETBitAndExpressionRule() ||
				   context == grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionRule() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETBitOrExpressionRule() ||
				   context == grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETBitXORExpressionRule() ||
				   context == grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETConditionalExpressionRule() ||
				   context == grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getETEqualityExpressionRule() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionRule() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETImplyLogicOrExpressionAccess().getETLogicOrExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionRule() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETLogicAndExpression1Rule() ||
				   context == grammarAccess.getETLogicAndExpression1Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicAndExpression2Rule() ||
				   context == grammarAccess.getETLogicAndExpression2Access().getETLogicAndExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETLogicNotExpression1Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Rule() ||
				   context == grammarAccess.getETLogicOrExpression2Access().getETLogicOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getETMinMaxExpressionRule() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionRule() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getETParenthesizedExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionRule() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0() ||
				   context == grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0() ||
				   context == grammarAccess.getETPrefixExpressionRule() ||
				   context == grammarAccess.getETPrimaryExpressionRule() ||
				   context == grammarAccess.getETUnaryExpressionRule()) {
					sequence_ETEqualityExpression(context, (ETUnequalExpression) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_VARIABLE_DECLARATION:
				if(context == grammarAccess.getETDeclarationRule() ||
				   context == grammarAccess.getETVariableDeclarationRule()) {
					sequence_ETVariableDeclaration(context, (ETVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EcdarTextPackage.ET_VARIABLE_ID:
				if(context == grammarAccess.getETVariableIDRule()) {
					sequence_ETVariableID(context, (ETVariableID) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {ETActionType}
	 */
	protected void sequence_ETActionType(EObject context, ETActionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAdditiveExpression_ETAddExpression_1_0_0_0 right=ETMultiplicativeExpression)
	 */
	protected void sequence_ETAdditiveExpression(EObject context, ETAddExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ADD_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ADD_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ADD_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ADD_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAdditiveExpressionAccess().getETAddExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAdditiveExpressionAccess().getRightETMultiplicativeExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAdditiveExpression_ETSubtractExpression_1_0_1_0 right=ETMultiplicativeExpression)
	 */
	protected void sequence_ETAdditiveExpression(EObject context, ETSubtractExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAdditiveExpressionAccess().getETSubtractExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAdditiveExpressionAccess().getRightETMultiplicativeExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     size=ETExpression
	 */
	protected void sequence_ETArrayDeclaration(EObject context, ETArrayDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_DECLARATION__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_DECLARATION__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETArrayDeclarationAccess().getSizeETExpressionParserRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETArrayExpression_ETArrayExpression_1_0 right=ETExpression)
	 */
	protected void sequence_ETArrayExpression(EObject context, ETArrayExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ARRAY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETArrayExpressionAccess().getETArrayExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETArrayExpressionAccess().getRightETExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETAdditionAssignmentExpression_1_0_2_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETAdditionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ADDITION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ADDITION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETAdditionAssignmentExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=ETAssignmentExpression_ETAssignmentExpression_1_0_0_0 right=ETAssignmentExpression) | 
	 *         (left=ETAssignmentExpression_ETAssignmentExpression_1_0_1_0 right=ETAssignmentExpression)
	 *     )
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETAssignmentExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETBitAndAssignmentExpression_1_0_8_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETBitAndAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETBitAndAssignmentExpressionLeftAction_1_0_8_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETBitLeftAssignmentExpression_1_0_10_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETBitLeftAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETBitLeftAssignmentExpressionLeftAction_1_0_10_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETBitOrAssignmentExpression_1_0_7_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETBitOrAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETBitOrAssignmentExpressionLeftAction_1_0_7_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETBitRightAssignmentExpression_1_0_11_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETBitRightAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETBitRightAssignmentExpressionLeftAction_1_0_11_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETBitXORAssignmentExpression_1_0_9_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETBitXORAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETBitXORAssignmentExpressionLeftAction_1_0_9_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETDivisionAssignmentExpression_1_0_5_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETDivisionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_DIVISION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_DIVISION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETDivisionAssignmentExpressionLeftAction_1_0_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETModuloAssignmentExpression_1_0_6_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETModuloAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MODULO_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MODULO_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MODULO_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MODULO_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETModuloAssignmentExpressionLeftAction_1_0_6_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETMultiplicationAssignmentExpression_1_0_4_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETMultiplicationAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETMultiplicationAssignmentExpressionLeftAction_1_0_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETAssignmentExpression_ETSubtractionAssignmentExpression_1_0_3_0 right=ETAssignmentExpression)
	 */
	protected void sequence_ETAssignmentExpression(EObject context, ETSubtractionAssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getETSubtractionAssignmentExpressionLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETAssignmentExpressionAccess().getRightETAssignmentExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETBitAndExpression_ETBitAndExpression_1_0_0 right=ETEqualityExpression)
	 */
	protected void sequence_ETBitAndExpression(EObject context, ETBitAndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_AND_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBitAndExpressionAccess().getETBitAndExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETBitAndExpressionAccess().getRightETEqualityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETBitLeftBRightExpression_ETBitLeftExpression_1_0_0_0 right=ETAdditiveExpression)
	 */
	protected void sequence_ETBitLeftBRightExpression(EObject context, ETBitLeftExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_LEFT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBitLeftBRightExpressionAccess().getETBitLeftExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETBitLeftBRightExpressionAccess().getRightETAdditiveExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETBitLeftBRightExpression_ETBitRightExpression_1_0_1_0 right=ETAdditiveExpression)
	 */
	protected void sequence_ETBitLeftBRightExpression(EObject context, ETBitRightExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_RIGHT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBitLeftBRightExpressionAccess().getETBitRightExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETBitLeftBRightExpressionAccess().getRightETAdditiveExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETBitOrExpression_ETBitOrExpression_1_0_0 right=ETBitXORExpression)
	 */
	protected void sequence_ETBitOrExpression(EObject context, ETBitOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBitOrExpressionAccess().getETBitOrExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETBitOrExpressionAccess().getRightETBitXORExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETBitXORExpression_ETBitXORExpression_1_0_0 right=ETBitAndExpression)
	 */
	protected void sequence_ETBitXORExpression(EObject context, ETBitXORExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BIT_XOR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBitXORExpressionAccess().getETBitXORExpressionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETBitXORExpressionAccess().getRightETBitAndExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_ETBooleanLiteral(EObject context, ETBooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETBooleanLiteralAccess().getValueBOOLParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ETBooleanType}
	 */
	protected void sequence_ETBooleanType(EObject context, ETBooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ETClockType}
	 */
	protected void sequence_ETClockType(EObject context, ETClockType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ETConditionalExpression_ETConditionalExpression_1_0 then=ETLogicOrExpression2 else=ETConditionalExpression)
	 */
	protected void sequence_ETConditionalExpression(EObject context, ETConditionalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__CONDITION));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__THEN));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETConditionalExpressionAccess().getETConditionalExpressionConditionAction_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getETConditionalExpressionAccess().getThenETLogicOrExpression2ParserRuleCall_1_2_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getETConditionalExpressionAccess().getElseETConditionalExpressionParserRuleCall_1_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((declarations+=ETDeclaration declarations+=ETDeclaration*)?)
	 */
	protected void sequence_ETDeclarations(EObject context, ETDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         controllable?='controllable'? 
	 *         (
	 *             (selects+=ETSelect selects+=ETSelect* io=ETIO guard=ETExpression? (target=[ETLocation|ID] | (updates+=ETExpression* target=[ETLocation|ID]))) | 
	 *             (io=ETIO guard=ETExpression? (target=[ETLocation|ID] | (updates+=ETExpression* target=[ETLocation|ID])))
	 *         )
	 *     )
	 */
	protected void sequence_ETEdge(EObject context, ETEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETEqualityExpression_ETEqualExpression_1_0_0_0 right=ETInequalityExpression)
	 */
	protected void sequence_ETEqualityExpression(EObject context, ETEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETEqualityExpressionAccess().getETEqualExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETEqualityExpressionAccess().getRightETInequalityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETEqualityExpression_ETUnequalExpression_1_0_1_0 right=ETInequalityExpression)
	 */
	protected void sequence_ETEqualityExpression(EObject context, ETUnequalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_UNEQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_UNEQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_UNEQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_UNEQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETEqualityExpressionAccess().getETUnequalExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETEqualityExpressionAccess().getRightETInequalityExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ETType expression=ETExpression)
	 */
	protected void sequence_ETExpression(EObject context, ETExistsExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_EXISTS_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETExpressionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETExpressionAccess().getTypeETTypeParserRuleCall_1_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getETExpressionAccess().getExpressionETExpressionParserRuleCall_1_6_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ETType expression=ETExpression)
	 */
	protected void sequence_ETExpression(EObject context, ETForallExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__NAME));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_FORALL_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETExpressionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETExpressionAccess().getTypeETTypeParserRuleCall_1_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getETExpressionAccess().getExpressionETExpressionParserRuleCall_1_6_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ETType fields+=ETFieldID fields+=ETFieldID*)
	 */
	protected void sequence_ETFieldDeclaration(EObject context, ETFieldDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=ETArrayDeclaration*)
	 */
	protected void sequence_ETFieldID(EObject context, ETFieldID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=ETImport* declarations=ETDeclarations specifications+=ETSpecification*)
	 */
	protected void sequence_ETFile(EObject context, ETFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=ETExpression type=ETIOType)
	 */
	protected void sequence_ETIO(EObject context, ETIO semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ETIO__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ETIO__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ETIO__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ETIO__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETIOAccess().getExpressionETExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getETIOAccess().getTypeETIOTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETImplyLogicOrExpression_ETImplyExpression_1_0_0_0 right=ETLogicAndExpression1)
	 */
	protected void sequence_ETImplyLogicOrExpression(EObject context, ETImplyExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_IMPLY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_IMPLY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_IMPLY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_IMPLY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETImplyLogicOrExpressionAccess().getETImplyExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETImplyLogicOrExpressionAccess().getRightETLogicAndExpression1ParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=ETImplyLogicOrExpression_ETLogicOrExpression_1_0_1_0 right=ETLogicAndExpression1) | 
	 *         (left=ETLogicOrExpression2_ETLogicOrExpression_1_0_0 right=ETLogicAndExpression2)
	 *     )
	 */
	protected void sequence_ETImplyLogicOrExpression_ETLogicOrExpression2(EObject context, ETLogicOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=ID
	 */
	protected void sequence_ETImport(EObject context, ETImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETInequalityExpression_ETGreaterEqualExpression_1_0_2_0 right=ETMinMaxExpression)
	 */
	protected void sequence_ETInequalityExpression(EObject context, ETGreaterEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getETGreaterEqualExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getRightETMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETInequalityExpression_ETGreaterExpression_1_0_3_0 right=ETMinMaxExpression)
	 */
	protected void sequence_ETInequalityExpression(EObject context, ETGreaterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_GREATER_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getETGreaterExpressionLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getRightETMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETInequalityExpression_ETLessEqualExpression_1_0_1_0 right=ETMinMaxExpression)
	 */
	protected void sequence_ETInequalityExpression(EObject context, ETLessEqualExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_LESS_EQUAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_LESS_EQUAL_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_LESS_EQUAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_LESS_EQUAL_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getETLessEqualExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getRightETMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETInequalityExpression_ETLessExpression_1_0_0_0 right=ETMinMaxExpression)
	 */
	protected void sequence_ETInequalityExpression(EObject context, ETLessExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_LESS_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_LESS_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_LESS_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_LESS_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getETLessExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETInequalityExpressionAccess().getRightETMinMaxExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ETInputType}
	 */
	protected void sequence_ETInputType(EObject context, ETInputType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((min=ETExpression max=ETExpression)?)
	 */
	protected void sequence_ETIntegerType(EObject context, ETIntegerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (urgent?='urgent'? universal?='universal'? name=ID (invariants+=ETExpression invariants+=ETExpression*)? (edges+=ETEdge edges+=ETEdge*)?)
	 */
	protected void sequence_ETLocation(EObject context, ETLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=ETLogicAndExpression1_ETLogicAndExpression_1_0_0 right=ETLogicNotExpression1) | 
	 *         (left=ETLogicAndExpression2_ETLogicAndExpression_1_0_0 right=ETBitOrExpression)
	 *     )
	 */
	protected void sequence_ETLogicAndExpression1_ETLogicAndExpression2(EObject context, ETLogicAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETMinMaxExpression_ETMaxExpression_1_0_1_0 right=ETBitLeftBRightExpression)
	 */
	protected void sequence_ETMinMaxExpression(EObject context, ETMaxExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MAX_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MAX_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MAX_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MAX_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETMinMaxExpressionAccess().getETMaxExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETMinMaxExpressionAccess().getRightETBitLeftBRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETMinMaxExpression_ETMinExpression_1_0_0_0 right=ETBitLeftBRightExpression)
	 */
	protected void sequence_ETMinMaxExpression(EObject context, ETMinExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MIN_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MIN_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MIN_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MIN_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETMinMaxExpressionAccess().getETMinExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETMinMaxExpressionAccess().getRightETBitLeftBRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (initialisers+=ETInitialiser initialisers+=ETInitialiser*)
	 */
	protected void sequence_ETMultiInitialiser(EObject context, ETMultiInitialiser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETMultiplicativeExpression_ETDivideExpression_1_0_1_0 right=ETPrefixExpression)
	 */
	protected void sequence_ETMultiplicativeExpression(EObject context, ETDivideExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_DIVIDE_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_DIVIDE_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_DIVIDE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_DIVIDE_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getETDivideExpressionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getRightETPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETMultiplicativeExpression_ETModuloExpression_1_0_2_0 right=ETPrefixExpression)
	 */
	protected void sequence_ETMultiplicativeExpression(EObject context, ETModuloExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MODULO_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MODULO_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MODULO_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MODULO_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getETModuloExpressionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getRightETPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETMultiplicativeExpression_ETMultiplyExpression_1_0_0_0 right=ETPrefixExpression)
	 */
	protected void sequence_ETMultiplicativeExpression(EObject context, ETMultiplyExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLY_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MULTIPLY_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getETMultiplyExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETMultiplicativeExpressionAccess().getRightETPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_ETNumberLiteral(EObject context, ETNumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETNumberLiteralAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ETOutputType}
	 */
	protected void sequence_ETOutputType(EObject context, ETOutputType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ETType name=ID dimensions+=ETArrayDeclaration*)
	 */
	protected void sequence_ETParameter(EObject context, ETParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETPostfixExpression_ETPostDecrementExpression_1_1_0
	 */
	protected void sequence_ETPostfixExpression(EObject context, ETPostDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_POST_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_POST_DECREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETPostfixExpressionAccess().getETPostDecrementExpressionExpressionAction_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETPostfixExpression_ETPostIncrementExpression_1_0_0
	 */
	protected void sequence_ETPostfixExpression(EObject context, ETPostIncrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_POST_INCREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_POST_INCREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETPostfixExpressionAccess().getETPostIncrementExpressionExpressionAction_1_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETPrefixExpression
	 */
	protected void sequence_ETPrefixExpression(EObject context, ETPreDecrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_PRE_DECREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_PRE_DECREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETPrefixExpressionAccess().getExpressionETPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETPrefixExpression
	 */
	protected void sequence_ETPrefixExpression(EObject context, ETPreIncrementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_PRE_INCREMENT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_PRE_INCREMENT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETPrefixExpressionAccess().getExpressionETPrefixExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=[EObject|ID]
	 */
	protected void sequence_ETReference(EObject context, ETReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_REFERENCE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_REFERENCE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETReferenceAccess().getTargetEObjectIDTerminalRuleCall_1_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     size=ETExpression
	 */
	protected void sequence_ETScalarType(EObject context, ETScalarType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SCALAR_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SCALAR_TYPE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETScalarTypeAccess().getSizeETExpressionParserRuleCall_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ETType)
	 */
	protected void sequence_ETSelect(EObject context, ETSelect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SELECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SELECT__NAME));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SELECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SELECT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSelectAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETSelectAccess().getTypeETTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETExpression
	 */
	protected void sequence_ETSingleInitialiser(EObject context, ETSingleInitialiser semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SINGLE_INITIALISER__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SINGLE_INITIALISER__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSingleInitialiserAccess().getExpressionETExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=ETSpecificationExpression)
	 */
	protected void sequence_ETSpecificationBinding(EObject context, ETSpecificationBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION__NAME));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_BINDING__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_BINDING__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETSpecificationBindingAccess().getExpressionETSpecificationExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations=ETDeclarations initialLocation=ETLocation locations+=ETLocation*)
	 */
	protected void sequence_ETSpecificationBody(EObject context, ETSpecificationBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETSpecificationCompositionExpression_ETSpecificationCompositionExpression_1_0 right=ETPrimarySpecificationExpression)
	 */
	protected void sequence_ETSpecificationCompositionExpression(EObject context, ETSpecificationCompositionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_COMPOSITION_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_COMPOSITION_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_COMPOSITION_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_COMPOSITION_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationCompositionExpressionAccess().getETSpecificationCompositionExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETSpecificationCompositionExpressionAccess().getRightETPrimarySpecificationExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID body=ETSpecificationBody)
	 */
	protected void sequence_ETSpecificationDefinition(EObject context, ETSpecificationDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION__NAME));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DEFINITION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DEFINITION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationDefinitionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getETSpecificationDefinitionAccess().getBodyETSpecificationBodyParserRuleCall_1_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETSpecificationDisjunctionExpression_ETSpecificationConjunctionExpression_1_0 right=ETSpecificationCompositionExpression)
	 */
	protected void sequence_ETSpecificationDisjunctionExpression(EObject context, ETSpecificationConjunctionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_CONJUNCTION_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_CONJUNCTION_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_CONJUNCTION_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_CONJUNCTION_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationDisjunctionExpressionAccess().getETSpecificationConjunctionExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETSpecificationDisjunctionExpressionAccess().getRightETSpecificationCompositionExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ETSpecificationExpression_ETSpecificationDisjunctionExpression_1_0 right=ETSpecificationDisjunctionExpression)
	 */
	protected void sequence_ETSpecificationExpression(EObject context, ETSpecificationDisjunctionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DISJUNCTION_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DISJUNCTION_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DISJUNCTION_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_DISJUNCTION_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationExpressionAccess().getETSpecificationDisjunctionExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getETSpecificationExpressionAccess().getRightETSpecificationDisjunctionExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (template=[ETSpecificationTemplate|ID] (arguments+=ETExpression arguments+=ETExpression*)?)
	 */
	protected void sequence_ETSpecificationInstantiation(EObject context, ETSpecificationInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     specification=[ETSpecification|ID]
	 */
	protected void sequence_ETSpecificationReference(EObject context, ETSpecificationReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_REFERENCE__SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_SPECIFICATION_REFERENCE__SPECIFICATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETSpecificationReferenceAccess().getSpecificationETSpecificationIDTerminalRuleCall_1_0_1(), semanticObject.getSpecification());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=ETParameter parameters+=ETParameter*)? body=ETSpecificationBody)
	 */
	protected void sequence_ETSpecificationTemplate(EObject context, ETSpecificationTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=ETFieldDeclaration declarations+=ETFieldDeclaration*)
	 */
	protected void sequence_ETStructType(EObject context, ETStructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (baseType=ETType types+=ETTypeID types+=ETTypeID*)
	 */
	protected void sequence_ETTypeDeclaration(EObject context, ETTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=ETArrayDeclaration*)
	 */
	protected void sequence_ETTypeID(EObject context, ETTypeID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=[ETTypeID|ID]
	 */
	protected void sequence_ETTypeIdentifier(EObject context, ETTypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_TYPE_REFERENCE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_TYPE_REFERENCE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETTypeIdentifierAccess().getTargetETTypeIDIDTerminalRuleCall_6_1_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (urgent?='urgent'? meta?='meta'? const?='const'?)
	 */
	protected void sequence_ETTypeModifiers(EObject context, ETTypeModifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers=ETTypeModifiers identifier=ETTypeIdentifier)
	 */
	protected void sequence_ETType(EObject context, ETType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_TYPE__MODIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_TYPE__MODIFIERS));
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_TYPE__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_TYPE__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETTypeAccess().getModifiersETTypeModifiersParserRuleCall_0_0(), semanticObject.getModifiers());
		feeder.accept(grammarAccess.getETTypeAccess().getIdentifierETTypeIdentifierParserRuleCall_1_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETUnaryExpression
	 */
	protected void sequence_ETUnaryExpression(EObject context, ETLogicNotExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_LOGIC_NOT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_LOGIC_NOT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETUnaryExpressionAccess().getExpressionETUnaryExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ETUnaryExpression
	 */
	protected void sequence_ETUnaryExpression(EObject context, ETMinusExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcdarTextPackage.Literals.ET_MINUS_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcdarTextPackage.Literals.ET_MINUS_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETUnaryExpressionAccess().getExpressionETUnaryExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ETType variables+=ETVariableID variables+=ETVariableID*)
	 */
	protected void sequence_ETVariableDeclaration(EObject context, ETVariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (ioType='!' | ioType='?')? dimensions+=ETArrayDeclaration* initialiser=ETInitialiser?)
	 */
	protected void sequence_ETVariableID(EObject context, ETVariableID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
