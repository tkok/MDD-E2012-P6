package dk.itu.ecdar.converter

import dk.itu.ecdar.text.ecdarText.ETActionType
import dk.itu.ecdar.text.ecdarText.ETAddExpression
import dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETArrayExpression
import dk.itu.ecdar.text.ecdarText.ETAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitAndExpression
import dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitLeftExpression
import dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitOrExpression
import dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitRightExpression
import dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETBitXORExpression
import dk.itu.ecdar.text.ecdarText.ETConditionalExpression
import dk.itu.ecdar.text.ecdarText.ETDeclaration
import dk.itu.ecdar.text.ecdarText.ETDivideExpression
import dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETEqualExpression
import dk.itu.ecdar.text.ecdarText.ETExistsExpression
import dk.itu.ecdar.text.ecdarText.ETExpression
import dk.itu.ecdar.text.ecdarText.ETFile
import dk.itu.ecdar.text.ecdarText.ETForallExpression
import dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression
import dk.itu.ecdar.text.ecdarText.ETGreaterExpression
import dk.itu.ecdar.text.ecdarText.ETImplyExpression
import dk.itu.ecdar.text.ecdarText.ETInitialiser
import dk.itu.ecdar.text.ecdarText.ETIntegerType
import dk.itu.ecdar.text.ecdarText.ETLessEqualExpression
import dk.itu.ecdar.text.ecdarText.ETLessExpression
import dk.itu.ecdar.text.ecdarText.ETLogicAndExpression
import dk.itu.ecdar.text.ecdarText.ETLogicOrExpression
import dk.itu.ecdar.text.ecdarText.ETMaxExpression
import dk.itu.ecdar.text.ecdarText.ETMinExpression
import dk.itu.ecdar.text.ecdarText.ETMinusExpression
import dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETModuloExpression
import dk.itu.ecdar.text.ecdarText.ETMultiInitialiser
import dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETMultiplyExpression
import dk.itu.ecdar.text.ecdarText.ETNumberLiteral
import dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression
import dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression
import dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression
import dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression
import dk.itu.ecdar.text.ecdarText.ETReference
import dk.itu.ecdar.text.ecdarText.ETScalarType
import dk.itu.ecdar.text.ecdarText.ETSingleInitialiser
import dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition
import dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate
import dk.itu.ecdar.text.ecdarText.ETStructType
import dk.itu.ecdar.text.ecdarText.ETSubtractExpression
import dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration
import dk.itu.ecdar.text.ecdarText.ETTypeID
import dk.itu.ecdar.text.ecdarText.ETUnequalExpression
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration
import dk.itu.ecdar.text.ecdarText.ETVariableID
import dk.itu.ecdar.text.ecdarText.EcdarTextFactory
import java.io.StringReader
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.parser.IParser
import org.uppaal.xml.description.DescriptionStandaloneSetup
import org.uppaal.xml.description.description.UAAddExpression
import org.uppaal.xml.description.description.UAAdditionAssignmentExpression
import org.uppaal.xml.description.description.UAArrayDeclaration
import org.uppaal.xml.description.description.UAArrayExpression
import org.uppaal.xml.description.description.UAAssignmentExpression
import org.uppaal.xml.description.description.UABitAndAssignmentExpression
import org.uppaal.xml.description.description.UABitAndExpression
import org.uppaal.xml.description.description.UABitLeftAssignmentExpression
import org.uppaal.xml.description.description.UABitLeftExpression
import org.uppaal.xml.description.description.UABitOrAssignmentExpression
import org.uppaal.xml.description.description.UABitOrExpression
import org.uppaal.xml.description.description.UABitRightAssignmentExpression
import org.uppaal.xml.description.description.UABitRightExpression
import org.uppaal.xml.description.description.UABitXORAssignmentExpression
import org.uppaal.xml.description.description.UABitXORExpression
import org.uppaal.xml.description.description.UABooleanType
import org.uppaal.xml.description.description.UAChannelType
import org.uppaal.xml.description.description.UAClockType
import org.uppaal.xml.description.description.UAConditionalExpression
import org.uppaal.xml.description.description.UADeclaration
import org.uppaal.xml.description.description.UADeclarations
import org.uppaal.xml.description.description.UADivideExpression
import org.uppaal.xml.description.description.UADivisionAssignmentExpression
import org.uppaal.xml.description.description.UAEqualExpression
import org.uppaal.xml.description.description.UAExistsExpression
import org.uppaal.xml.description.description.UAExpression
import org.uppaal.xml.description.description.UAFieldDeclaration
import org.uppaal.xml.description.description.UAFieldID
import org.uppaal.xml.description.description.UAForallExpression
import org.uppaal.xml.description.description.UAGreaterEqualExpression
import org.uppaal.xml.description.description.UAGreaterExpression
import org.uppaal.xml.description.description.UAImplyExpression
import org.uppaal.xml.description.description.UAInitialiser
import org.uppaal.xml.description.description.UAIntegerType
import org.uppaal.xml.description.description.UALessEqualExpression
import org.uppaal.xml.description.description.UALessExpression
import org.uppaal.xml.description.description.UALogicAndExpression
import org.uppaal.xml.description.description.UALogicOrExpression
import org.uppaal.xml.description.description.UAMaxExpression
import org.uppaal.xml.description.description.UAMinExpression
import org.uppaal.xml.description.description.UAMinusExpression
import org.uppaal.xml.description.description.UAModuloAssignmentExpression
import org.uppaal.xml.description.description.UAModuloExpression
import org.uppaal.xml.description.description.UAMultiInitialiser
import org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression
import org.uppaal.xml.description.description.UAMultiplyExpression
import org.uppaal.xml.description.description.UANumberLiteral
import org.uppaal.xml.description.description.UAParameter
import org.uppaal.xml.description.description.UAParameters
import org.uppaal.xml.description.description.UAPostDecrementExpression
import org.uppaal.xml.description.description.UAPostIncrementExpression
import org.uppaal.xml.description.description.UAPreDecrementExpression
import org.uppaal.xml.description.description.UAPreIncrementExpression
import org.uppaal.xml.description.description.UAReference
import org.uppaal.xml.description.description.UAScalarType
import org.uppaal.xml.description.description.UASingleInitialiser
import org.uppaal.xml.description.description.UAStructType
import org.uppaal.xml.description.description.UASubtractExpression
import org.uppaal.xml.description.description.UASubtractionAssignmentExpression
import org.uppaal.xml.description.description.UASynchronisation
import org.uppaal.xml.description.description.UASynchronisationType
import org.uppaal.xml.description.description.UAType
import org.uppaal.xml.description.description.UATypeDeclaration
import org.uppaal.xml.description.description.UATypeID
import org.uppaal.xml.description.description.UATypeModifiers
import org.uppaal.xml.description.description.UAUnequalExpression
import org.uppaal.xml.description.description.UAUserType
import org.uppaal.xml.description.description.UAVariableDeclaration
import org.uppaal.xml.description.description.UAVariableID
import org.uppaal.xml.description.services.DescriptionGrammarAccess
import org.uppaal.xml.flat11.DocumentRoot
import org.uppaal.xml.flat11.KindType
import org.uppaal.xml.flat11.LocationType
import org.uppaal.xml.flat11.TemplateType
import org.uppaal.xml.flat11.TransitionType
import org.uppaal.xml.description.description.UASelectList
import org.uppaal.xml.description.description.UASelect
import dk.itu.ecdar.text.ecdarText.ETIOType
import dk.itu.ecdar.text.ecdarText.ETTypeReference
import org.uppaal.xml.description.description.UAUpdate
import dk.itu.ecdar.text.ecdarText.ETBooleanLiteral
import org.uppaal.xml.description.description.UABooleanLiteral
import org.uppaal.xml.description.description.UADefinition
import org.uppaal.xml.description.description.UASystemDefinition
import org.uppaal.xml.description.description.UAInstantiation
import dk.itu.ecdar.text.ecdarText.ETStructExpression
import org.uppaal.xml.description.description.UAStructExpression

class Uppaal2EcdarText {

	EcdarTextFactory factory
	IParser parser
	DescriptionGrammarAccess grammarAccess
	Environment globalActionsEnv = new Environment
	Environment globalEnv = new Environment

	new() {
		// initialize declaration parser
		val injector = new DescriptionStandaloneSetup()
			.createInjectorAndDoEMFRegistration
		parser = injector.getInstance(typeof(IParser))
		grammarAccess = injector.getInstance(typeof(DescriptionGrammarAccess))
	}

	//// Parsing

	// utility function to parse a block with a rule of the declaration grammar
	def EObject parse(String block, ParserRule rule) {
		val result = parser.parse(rule, new StringReader(block))
		val errors = result.syntaxErrors
		if (errors.size > 0) {
			throw new Error(errors.map(error |
				String::format("%d:%d - %s\n",
					error.startLine, error.offset,
					error.syntaxErrorMessage.message))
				.join("\n"))
		} else
			result.rootASTElement
	}

	def List<UADeclaration> parseUADeclarations(String block) {
		(parse(block, grammarAccess.UADeclarationsRule) as UADeclarations).declarations
	}

	def List<UAParameter> parseUAParameters(String block) {
		(parse(block, grammarAccess.UAParametersRule) as UAParameters).parameters
	}

	def UAExpression parseUAExpression(String block) {
		parse(block, grammarAccess.UAExpressionRule) as UAExpression
	}

	def UASynchronisation parseUASynchronisation(String block) {
		parse(block, grammarAccess.UASynchronisationRule) as UASynchronisation
	}

	def List<UASelect> parseUASelects(String block) {
		(parse(block, grammarAccess.UASelectListRule) as UASelectList).selects
	}

	def List<UAExpression> parseUAUpdateExpressions(String block) {
		(parse(block, grammarAccess.UAUpdateRule) as UAUpdate).expressions
	}

	def List<UADefinition> parseUADefinitions(String block) {
		(parse(block, grammarAccess.UASystemDefinitionRule) as UASystemDefinition).definitions
	}

	//// Expressions

	def dispatch ETExpression
		create factory.createETExpression
		transformUAExpression(UAExpression expression, Environment env) {
			throw new Error('''
				unable to transform expression «expression»
			''')
		}

	def dispatch ETImplyExpression
		create factory.createETImplyExpression
		transformUAExpression(UAImplyExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETLogicOrExpression
		create factory.createETLogicOrExpression
		transformUAExpression(UALogicOrExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETLogicAndExpression
		create factory.createETLogicAndExpression
		transformUAExpression(UALogicAndExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETConditionalExpression
		create factory.createETConditionalExpression
		transformUAExpression(UAConditionalExpression e, Environment env) {
			condition = e.condition.transformUAExpression(env)
			then = e.then.transformUAExpression(env)
			^else = e.^else.transformUAExpression(env)
		}

	def dispatch ETBitOrExpression
		create factory.createETBitOrExpression
		transformUAExpression(UABitOrExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitXORExpression
		create factory.createETBitXORExpression
		transformUAExpression(UABitXORExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitAndExpression
		create factory.createETBitAndExpression
		transformUAExpression(UABitAndExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETEqualExpression
		create factory.createETEqualExpression
		transformUAExpression(UAEqualExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETUnequalExpression
		create factory.createETUnequalExpression
		transformUAExpression(UAUnequalExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETLessExpression
		create factory.createETLessExpression
		transformUAExpression(UALessExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETLessEqualExpression
		create factory.createETLessEqualExpression
		transformUAExpression(UALessEqualExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETGreaterEqualExpression
		create factory.createETGreaterEqualExpression
		transformUAExpression(UAGreaterEqualExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETGreaterExpression
		create factory.createETGreaterExpression
		transformUAExpression(UAGreaterExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETMinExpression
		create factory.createETMinExpression
		transformUAExpression(UAMinExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETMaxExpression
		create factory.createETMaxExpression
		transformUAExpression(UAMaxExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitLeftExpression
		create factory.createETBitLeftExpression
		transformUAExpression(UABitLeftExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitRightExpression
		create factory.createETBitRightExpression
		transformUAExpression(UABitRightExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETAddExpression
		create factory.createETAddExpression
		transformUAExpression(UAAddExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETSubtractExpression
		create factory.createETSubtractExpression
		transformUAExpression(UASubtractExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETMultiplyExpression
		create factory.createETMultiplyExpression
		transformUAExpression(UAMultiplyExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETDivideExpression
		create factory.createETDivideExpression
		transformUAExpression(UADivideExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETModuloExpression
		create factory.createETModuloExpression
		transformUAExpression(UAModuloExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETArrayExpression
		create factory.createETArrayExpression
		transformUAExpression(UAArrayExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETStructExpression
		create factory.createETStructExpression
		transformUAExpression(UAStructExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right
		}

	def dispatch ETForallExpression
		create factory.createETForallExpression
		transformUAExpression(UAForallExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETExistsExpression
		create factory.createETExistsExpression
		transformUAExpression(UAExistsExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETAssignmentExpression
		create factory.createETAssignmentExpression
		transformUAExpression(UAAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}


	def dispatch ETAdditionAssignmentExpression
		create factory.createETAdditionAssignmentExpression
		transformUAExpression(UAAdditionAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETSubtractionAssignmentExpression
		create factory.createETSubtractionAssignmentExpression
		transformUAExpression(UASubtractionAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETMultiplicationAssignmentExpression
		create factory.createETMultiplicationAssignmentExpression
		transformUAExpression(UAMultiplicationAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETDivisionAssignmentExpression
		create factory.createETDivisionAssignmentExpression
		transformUAExpression(UADivisionAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETModuloAssignmentExpression
		create factory.createETModuloAssignmentExpression
		transformUAExpression(UAModuloAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitOrAssignmentExpression
		create factory.createETBitOrAssignmentExpression
		transformUAExpression(UABitOrAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitAndAssignmentExpression
		create factory.createETBitAndAssignmentExpression
		transformUAExpression(UABitAndAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitXORAssignmentExpression
		create factory.createETBitXORAssignmentExpression
		transformUAExpression(UABitXORAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitLeftAssignmentExpression
		create factory.createETBitLeftAssignmentExpression
		transformUAExpression(UABitLeftAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETBitRightAssignmentExpression
		create factory.createETBitRightAssignmentExpression
		transformUAExpression(UABitRightAssignmentExpression e, Environment env) {
			left = e.left.transformUAExpression(env)
			right = e.right.transformUAExpression(env)
		}

	def dispatch ETPreIncrementExpression
		create factory.createETPreIncrementExpression
		transformUAExpression(UAPreIncrementExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETPreDecrementExpression
		create factory.createETPreDecrementExpression
		transformUAExpression(UAPreDecrementExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETMinusExpression
		create factory.createETMinusExpression
		transformUAExpression(UAMinusExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETPostIncrementExpression
		create factory.createETPostIncrementExpression
		transformUAExpression(UAPostIncrementExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETPostDecrementExpression
		create factory.createETPostDecrementExpression
		transformUAExpression(UAPostDecrementExpression e, Environment env) {
			expression = e.transformUAExpression(env)
		}

	def dispatch ETBooleanLiteral
		create factory.createETBooleanLiteral
		transformUAExpression(UABooleanLiteral e, Environment env) {
			value = e.value
		}

	def dispatch ETNumberLiteral
		create factory.createETNumberLiteral
		transformUAExpression(UANumberLiteral e, Environment env) {
			value = e.value
		}

	def dispatch ETReference create factory.createETReference
		transformUAExpression(UAReference e, Environment env) {
			val t = env.find(e.name)
			if (t == null)
				throw new Error('''Couldn't find "«e.name»"''')
			else
				target = t
		}

	//// Declarations

	/*
	 * Each Declaration, which is either a VariableDeclaration
	 * defining one or more variables, or a TypeDeclaration
	 * defining one or more types
	 */

	def dispatch ETDeclaration
		create factory.createETDeclaration
		transformUADeclaration(UADeclaration declaration, Environment env) {
			throw new Error('''
				unable to transform declaration «declaration»''')
		}

	def dispatch ETVariableDeclaration
		create factory.createETVariableDeclaration
		transformUADeclaration(UAVariableDeclaration d, Environment env) {
			type = d.type.transformUAType(env)
			variables += d.variables
				.map[transformUAVariableID(env)]
		}

	def dispatch ETTypeDeclaration
		create factory.createETTypeDeclaration
		transformUADeclaration(UATypeDeclaration d, Environment env) {
			baseType = d.baseType.transformUAType(env)
			types += d.types.map[transformUATypeID(env)]
		}

	def create factory.createETVariableID
		transformUAVariableID(UAVariableID variable, Environment env) {
			name = variable.name
			dimensions += variable.dimensions
				.map[transformUAArrayDeclaration(env)]
			initialiser = variable.initialiser
				?.transformUAInitialiser(env)
		}

	def create factory.createETArrayDeclaration
		transformUAArrayDeclaration(UAArrayDeclaration d, Environment env) {
			size = d.size.transformUAExpression(env)
		}

	def dispatch ETInitialiser
		create factory.createETInitialiser
		transformUAInitialiser(UAInitialiser initialiser, Environment env) {
			throw new Error('''
				unable to transform initialiser «initialiser»''')
		}

	def dispatch ETSingleInitialiser
		create factory.createETSingleInitialiser
		transformUAInitialiser(UASingleInitialiser in, Environment env) {
			expression = in.expression.transformUAExpression(env)
		}

	def dispatch ETMultiInitialiser
		create factory.createETMultiInitialiser
		transformUAInitialiser(UAMultiInitialiser in, Environment env) {
			initialisers += in.initialisers
				.map[transformUAInitialiser(env)]
		}

	def create factory.createETType
		transformUAType(UAType t, Environment env) {
			modifiers = t.modifiers.transformUATypeModifiers
			identifier = t.identifier.transformUATypeIdentifier(env)
		}

	def create factory.createETTypeModifiers
		transformUATypeModifiers(UATypeModifiers modifiers) {
			const = modifiers.const
			meta = modifiers.meta
			urgent = modifiers.urgent
		}

	def dispatch ETIntegerType
		create factory.createETIntegerType
		transformUATypeIdentifier(UAIntegerType t, Environment env) {
			min = t.min?.transformUAExpression(env)
			max = t.max?.transformUAExpression(env)
		}

	def dispatch create factory.createETClockType
		transformUATypeIdentifier(UAClockType t, Environment env) {}

	// UAChannelType => ETActionType
	def dispatch create factory.createETActionType
		transformUATypeIdentifier(UAChannelType t, Environment env) {}

	def dispatch create factory.createETBooleanType
		transformUATypeIdentifier(UABooleanType t, Environment env) {}

	def dispatch ETScalarType create factory.createETScalarType
		transformUATypeIdentifier(UAScalarType t, Environment env) {
			size = t.size.transformUAExpression(env)
		}

	def dispatch ETStructType create factory.createETStructType
		transformUATypeIdentifier(UAStructType t, Environment env) {
			declarations += t.declarations
				.map[transformUAFieldDeclaration(env)]
		}

	def dispatch ETTypeReference create factory.createETTypeReference
		transformUATypeIdentifier(UAUserType t, Environment env) {
			target = env.find(t.name) as ETTypeID
		}

	def create factory.createETFieldDeclaration
		transformUAFieldDeclaration(UAFieldDeclaration d, Environment env) {
			type = d.type.transformUAType(env)
			fields += d.fields
				.map[transformUAFieldID(env)]
		}

	def create factory.createETFieldID
		transformUAFieldID(UAFieldID field, Environment env) {
			name = field.name
			dimensions += field.dimensions
				.map[transformUAArrayDeclaration(env)]
		}

	def create factory.createETTypeID
		transformUATypeID(UATypeID type, Environment env) {
			name = type.name
			dimensions += type.dimensions
				.map[transformUAArrayDeclaration(env)]
		}

	//// Specifications

	def create factory.createETParameter
		transformUAParameter(UAParameter p, Environment env) {
			type = p.type.transformUAType(env)
			name = p.name
			dimensions += p.dimensions.map[transformUAArrayDeclaration(env)]
		}

	def create spec:
			(if (template.parameter == null)
				factory.createETSpecificationDefinition
			else
				factory.createETSpecificationTemplate)
		transformTemplate(TemplateType template, Environment parentEnv) {

			val env = new Environment(parentEnv)

			// parameters?
			if (template.parameter != null) {
				val t = spec as ETSpecificationTemplate
				// concurrent transformation and definition
				t.parameters += template.parameter.value
					.parseUAParameters
					.map[transformUAParameter(env)]
				t.parameters.forEach[env.define(it.name, it)]
			}

			spec.name = template.name.value

			spec.body = factory.createETSpecificationBody
			spec.body.declarations = factory.createETDeclarations

			// declarations
			if (template.declaration != null)
				for (declaration : template.declaration.parseUADeclarations) {
					val d = declaration.transformUADeclaration(env)
					spec.body.declarations.declarations += d
					env.define(d)
				}

			// location -> locations
			for (location : template.location)
				if (template.isInitial(location))
					spec.body.initialLocation = location.transformLocation(true, env)
				else
					spec.body.locations += location.transformLocation(false, env)

			// transition -> location edge
			for (transition : template.transition) {
				val edge = transition.transformTransition(spec, env)

				// controllable?
				edge.controllable = transition.controllable

				// source
				val sourceLocation = template.location
					.findFirst[it.id.equals(transition.source.ref)]
				val sourceLoc = sourceLocation
					.transformLocation(template.isInitial(sourceLocation), env)

				// target
				val targetLocation = template.location
					.findFirst[it.id.equals(transition.target.ref)]
				edge.target = targetLocation
					.transformLocation(template.isInitial(targetLocation), env)
				sourceLoc.edges += edge
			}

			// TODO: transformTransition created one variable declaration
			//       per action variables => reduce into single variable declaration
		}

	def boolean isInitial(TemplateType template, LocationType location) {
		location.id.equals(template.init.ref)
	}

	def create edge: factory.createETEdge
		transformTransition(TransitionType transition,
			ETSpecificationDefinition spec, Environment parentEnv)
		{
			val env = new Environment(parentEnv)

			// select
			val select = transition.label
				.findFirst[it.kind == KindType::SELECT]?.value
			if (select != null) {
				// concurrent transformation and definition
				edge.selects += select.parseUASelects
					.map[transformUASelect(env)]
				edge.selects.forEach[env.define(it.name, it)]
			}
			// sync
			val sync = transition.label
				.findFirst[it.kind == KindType::SYNCHRONISATION].value

			env.postProcessor = [ name, object, context |
				if (object == null) {
					// global action?
					val globalAction = globalActionsEnv.find(name)

					if (globalAction != null) {
						// TODO: what about channel arrays?
						// TODO: check object is actually non-null
						//       and a variable of type action

						val localAction = (globalAction as ETVariableID).copyETVariable
						val declaration = factory.createETVariableDeclaration
						declaration.type = factory.createETType
						declaration.type.modifiers = factory.createETTypeModifiers

						// context is set in transformUASynchronisation
						declaration.type.identifier = switch (context) {
								case ETIOType::INPUT: factory.createETInputType
								case ETIOType::OUTPUT: factory.createETOutputType
							}

						localAction.ioType = context as ETIOType

						declaration.variables += localAction
						spec.body.declarations.declarations += declaration
						parentEnv.define(declaration)
						localAction
					}
				} else
					object
			]
			edge.io = sync.parseUASynchronisation
				.transformUASynchronisation(env)

			// guard
			val guard = transition.label
				.findFirst[it.kind == KindType::GUARD]?.value
			if (guard != null)
				edge.guard = guard.parseUAExpression
					.transformUAExpression(env)

			// assignment
			val assignment = transition.label
				.findFirst[it.kind == KindType::ASSIGNMENT]?.value
			if (assignment != null)
				edge.updates += assignment.parseUAUpdateExpressions
					.map[transformUAExpression(env)]
		}

	def create factory.createETSelect
		transformUASelect(UASelect select, Environment env) {
			name = select.name
			type = select.type.transformUAType(env)
		}

	// NOTE: not create function, as it would return same result on every call
	def copyETVariable(ETVariableID variable) {
		val result = factory.createETVariableID
		result.name = variable.name
		result.ioType = variable.ioType
		// TODO: dimensions
		result
	}

	def create factory.createETLocation
		transformLocation(LocationType location, boolean initial, Environment env) {
			// name
			name =
				if (location.name == null)
					location.id
				else
					location.name.value

			// heuristic for universal locations
			if (location.name !=null &&
				(location.name.value.equals("UNIV") || location.name.value.equals("Universal")))
			{
				name = "UNIV"
				universal = true
			}

			// urgent?
			urgent = (location.urgent != null)

			// invariants
			for (label : location.label.filter[it.kind == KindType::INVARIANT])
				invariants += label.value
					.parseUAExpression
					.transformUAExpression(env)
		}

	def create io: factory.createETIO
		transformUASynchronisation(UASynchronisation sync, Environment parentEnv) {
			val env = new Environment(parentEnv)
			io.type = switch (sync.type) {
				case UASynchronisationType::RECEPTION: ETIOType::INPUT
				case UASynchronisationType::EMISSION: ETIOType::OUTPUT
			}
			// used by processor in transformTransition
			// to infer type of generate variable
			env.context = io.type
			io.expression = sync.expression.transformUAExpression(env)
		}

	/*
	 * global actions are not defined and kept separately
	 * and used when transforming synchronizations:
	 * for each usage, a local action is declared
	 */
	def processDeclaration(ETDeclaration declaration, ETFile file) {
		if (declaration instanceof ETVariableDeclaration
			&& (declaration as ETVariableDeclaration)
				.type.identifier instanceof ETActionType)
		{
			globalActionsEnv.define(declaration)
		} else {
			globalEnv.define(declaration)
			file.declarations.declarations += declaration
		}
	}

	def create binding: factory.createETSpecificationBinding
		transformUAInstantiation(UAInstantiation instantiation, Environment env) {
			binding.name = instantiation.name
			val spec = factory.createETSpecificationInstantiation
			spec.template = env.find(instantiation.target) as ETSpecificationTemplate
			spec.arguments += instantiation.arguments.map[transformUAExpression(globalEnv)]
			binding.expression = spec
		}

	//// MAIN

	/* NOTE:
	 * Transformation functions are always passed the
	 * current environment and they create a sub-environment
	 * on their own, if needed. Thus, no special attention
	 * is required at the call-site.
	 */

	def ETFile convert(DocumentRoot root) {
		factory = EcdarTextFactory::eINSTANCE
		val nta = root.nta

		val file = factory.createETFile
		file.declarations = factory.createETDeclarations

		// global declarations
		for (declaration : nta.declaration.parseUADeclarations)
			declaration.transformUADeclaration(globalEnv)
				.processDeclaration(file)

		// templates
		for (template : nta.template) {
			val result = template.transformTemplate(globalEnv)
			file.specifications += result
			globalEnv.define(result.name, result)
		}

		// system definition
		for (definition : nta.system.parseUADefinitions)
			switch (definition) {
				UADeclaration:
					definition.transformUADeclaration(globalEnv)
						.processDeclaration(file)
				UAInstantiation: {
						val result = definition
							.transformUAInstantiation(globalEnv)
						file.specifications += result
						globalEnv.define(result.name, result)
					}
			}

		file
	}

}