/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcdarTextFactoryImpl extends EFactoryImpl implements EcdarTextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EcdarTextFactory init()
  {
    try
    {
      EcdarTextFactory theEcdarTextFactory = (EcdarTextFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.itu.dk/ecdar/text/EcdarText"); 
      if (theEcdarTextFactory != null)
      {
        return theEcdarTextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EcdarTextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcdarTextFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EcdarTextPackage.ET_FILE: return createETFile();
      case EcdarTextPackage.ET_IMPORT: return createETImport();
      case EcdarTextPackage.ET_ARRAY_DECLARATION: return createETArrayDeclaration();
      case EcdarTextPackage.ET_DECLARATIONS: return createETDeclarations();
      case EcdarTextPackage.ET_DECLARATION: return createETDeclaration();
      case EcdarTextPackage.ET_TYPE: return createETType();
      case EcdarTextPackage.ET_TYPE_MODIFIERS: return createETTypeModifiers();
      case EcdarTextPackage.ET_VARIABLE_DECLARATION: return createETVariableDeclaration();
      case EcdarTextPackage.ET_VARIABLE_ID: return createETVariableID();
      case EcdarTextPackage.ET_INITIALISER: return createETInitialiser();
      case EcdarTextPackage.ET_SINGLE_INITIALISER: return createETSingleInitialiser();
      case EcdarTextPackage.ET_MULTI_INITIALISER: return createETMultiInitialiser();
      case EcdarTextPackage.ET_TYPE_DECLARATION: return createETTypeDeclaration();
      case EcdarTextPackage.ET_TYPE_ID: return createETTypeID();
      case EcdarTextPackage.ET_TYPE_IDENTIFIER: return createETTypeIdentifier();
      case EcdarTextPackage.ET_INTEGER_TYPE: return createETIntegerType();
      case EcdarTextPackage.ET_CLOCK_TYPE: return createETClockType();
      case EcdarTextPackage.ET_ACTION_TYPE: return createETActionType();
      case EcdarTextPackage.ET_INPUT_TYPE: return createETInputType();
      case EcdarTextPackage.ET_OUTPUT_TYPE: return createETOutputType();
      case EcdarTextPackage.ET_BOOLEAN_TYPE: return createETBooleanType();
      case EcdarTextPackage.ET_SCALAR_TYPE: return createETScalarType();
      case EcdarTextPackage.ET_STRUCT_TYPE: return createETStructType();
      case EcdarTextPackage.ET_FIELD_DECLARATION: return createETFieldDeclaration();
      case EcdarTextPackage.ET_FIELD_ID: return createETFieldID();
      case EcdarTextPackage.ET_SPECIFICATION_EXPRESSION: return createETSpecificationExpression();
      case EcdarTextPackage.ET_SPECIFICATION: return createETSpecification();
      case EcdarTextPackage.ET_SPECIFICATION_BINDING: return createETSpecificationBinding();
      case EcdarTextPackage.ET_SPECIFICATION_DEFINITION: return createETSpecificationDefinition();
      case EcdarTextPackage.ET_SPECIFICATION_TEMPLATE: return createETSpecificationTemplate();
      case EcdarTextPackage.ET_SPECIFICATION_BODY: return createETSpecificationBody();
      case EcdarTextPackage.ET_PARAMETER: return createETParameter();
      case EcdarTextPackage.ET_LOCATION: return createETLocation();
      case EcdarTextPackage.ET_EDGE: return createETEdge();
      case EcdarTextPackage.ETIO: return createETIO();
      case EcdarTextPackage.ET_SELECT: return createETSelect();
      case EcdarTextPackage.ET_EXPRESSION: return createETExpression();
      case EcdarTextPackage.ET_TYPE_REFERENCE: return createETTypeReference();
      case EcdarTextPackage.ET_SPECIFICATION_DISJUNCTION_EXPRESSION: return createETSpecificationDisjunctionExpression();
      case EcdarTextPackage.ET_SPECIFICATION_CONJUNCTION_EXPRESSION: return createETSpecificationConjunctionExpression();
      case EcdarTextPackage.ET_SPECIFICATION_COMPOSITION_EXPRESSION: return createETSpecificationCompositionExpression();
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE: return createETSpecificationReference();
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION: return createETSpecificationInstantiation();
      case EcdarTextPackage.ET_FORALL_EXPRESSION: return createETForallExpression();
      case EcdarTextPackage.ET_EXISTS_EXPRESSION: return createETExistsExpression();
      case EcdarTextPackage.ET_IMPLY_EXPRESSION: return createETImplyExpression();
      case EcdarTextPackage.ET_LOGIC_OR_EXPRESSION: return createETLogicOrExpression();
      case EcdarTextPackage.ET_LOGIC_AND_EXPRESSION: return createETLogicAndExpression();
      case EcdarTextPackage.ET_ASSIGNMENT_EXPRESSION: return createETAssignmentExpression();
      case EcdarTextPackage.ET_ADDITION_ASSIGNMENT_EXPRESSION: return createETAdditionAssignmentExpression();
      case EcdarTextPackage.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION: return createETSubtractionAssignmentExpression();
      case EcdarTextPackage.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION: return createETMultiplicationAssignmentExpression();
      case EcdarTextPackage.ET_DIVISION_ASSIGNMENT_EXPRESSION: return createETDivisionAssignmentExpression();
      case EcdarTextPackage.ET_MODULO_ASSIGNMENT_EXPRESSION: return createETModuloAssignmentExpression();
      case EcdarTextPackage.ET_BIT_OR_ASSIGNMENT_EXPRESSION: return createETBitOrAssignmentExpression();
      case EcdarTextPackage.ET_BIT_AND_ASSIGNMENT_EXPRESSION: return createETBitAndAssignmentExpression();
      case EcdarTextPackage.ET_BIT_XOR_ASSIGNMENT_EXPRESSION: return createETBitXORAssignmentExpression();
      case EcdarTextPackage.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION: return createETBitLeftAssignmentExpression();
      case EcdarTextPackage.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION: return createETBitRightAssignmentExpression();
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION: return createETConditionalExpression();
      case EcdarTextPackage.ET_BIT_OR_EXPRESSION: return createETBitOrExpression();
      case EcdarTextPackage.ET_BIT_XOR_EXPRESSION: return createETBitXORExpression();
      case EcdarTextPackage.ET_BIT_AND_EXPRESSION: return createETBitAndExpression();
      case EcdarTextPackage.ET_EQUAL_EXPRESSION: return createETEqualExpression();
      case EcdarTextPackage.ET_UNEQUAL_EXPRESSION: return createETUnequalExpression();
      case EcdarTextPackage.ET_LESS_EXPRESSION: return createETLessExpression();
      case EcdarTextPackage.ET_LESS_EQUAL_EXPRESSION: return createETLessEqualExpression();
      case EcdarTextPackage.ET_GREATER_EQUAL_EXPRESSION: return createETGreaterEqualExpression();
      case EcdarTextPackage.ET_GREATER_EXPRESSION: return createETGreaterExpression();
      case EcdarTextPackage.ET_MIN_EXPRESSION: return createETMinExpression();
      case EcdarTextPackage.ET_MAX_EXPRESSION: return createETMaxExpression();
      case EcdarTextPackage.ET_BIT_LEFT_EXPRESSION: return createETBitLeftExpression();
      case EcdarTextPackage.ET_BIT_RIGHT_EXPRESSION: return createETBitRightExpression();
      case EcdarTextPackage.ET_ADD_EXPRESSION: return createETAddExpression();
      case EcdarTextPackage.ET_SUBTRACT_EXPRESSION: return createETSubtractExpression();
      case EcdarTextPackage.ET_MULTIPLY_EXPRESSION: return createETMultiplyExpression();
      case EcdarTextPackage.ET_DIVIDE_EXPRESSION: return createETDivideExpression();
      case EcdarTextPackage.ET_MODULO_EXPRESSION: return createETModuloExpression();
      case EcdarTextPackage.ET_PRE_INCREMENT_EXPRESSION: return createETPreIncrementExpression();
      case EcdarTextPackage.ET_PRE_DECREMENT_EXPRESSION: return createETPreDecrementExpression();
      case EcdarTextPackage.ET_LOGIC_NOT_EXPRESSION: return createETLogicNotExpression();
      case EcdarTextPackage.ET_MINUS_EXPRESSION: return createETMinusExpression();
      case EcdarTextPackage.ET_POST_INCREMENT_EXPRESSION: return createETPostIncrementExpression();
      case EcdarTextPackage.ET_POST_DECREMENT_EXPRESSION: return createETPostDecrementExpression();
      case EcdarTextPackage.ET_ARRAY_EXPRESSION: return createETArrayExpression();
      case EcdarTextPackage.ET_REFERENCE: return createETReference();
      case EcdarTextPackage.ET_BOOLEAN_LITERAL: return createETBooleanLiteral();
      case EcdarTextPackage.ET_NUMBER_LITERAL: return createETNumberLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EcdarTextPackage.ETIO_TYPE:
        return createETIOTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EcdarTextPackage.ETIO_TYPE:
        return convertETIOTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETFile createETFile()
  {
    ETFileImpl etFile = new ETFileImpl();
    return etFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETImport createETImport()
  {
    ETImportImpl etImport = new ETImportImpl();
    return etImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETArrayDeclaration createETArrayDeclaration()
  {
    ETArrayDeclarationImpl etArrayDeclaration = new ETArrayDeclarationImpl();
    return etArrayDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDeclarations createETDeclarations()
  {
    ETDeclarationsImpl etDeclarations = new ETDeclarationsImpl();
    return etDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDeclaration createETDeclaration()
  {
    ETDeclarationImpl etDeclaration = new ETDeclarationImpl();
    return etDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETType createETType()
  {
    ETTypeImpl etType = new ETTypeImpl();
    return etType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeModifiers createETTypeModifiers()
  {
    ETTypeModifiersImpl etTypeModifiers = new ETTypeModifiersImpl();
    return etTypeModifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETVariableDeclaration createETVariableDeclaration()
  {
    ETVariableDeclarationImpl etVariableDeclaration = new ETVariableDeclarationImpl();
    return etVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETVariableID createETVariableID()
  {
    ETVariableIDImpl etVariableID = new ETVariableIDImpl();
    return etVariableID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETInitialiser createETInitialiser()
  {
    ETInitialiserImpl etInitialiser = new ETInitialiserImpl();
    return etInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSingleInitialiser createETSingleInitialiser()
  {
    ETSingleInitialiserImpl etSingleInitialiser = new ETSingleInitialiserImpl();
    return etSingleInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMultiInitialiser createETMultiInitialiser()
  {
    ETMultiInitialiserImpl etMultiInitialiser = new ETMultiInitialiserImpl();
    return etMultiInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeDeclaration createETTypeDeclaration()
  {
    ETTypeDeclarationImpl etTypeDeclaration = new ETTypeDeclarationImpl();
    return etTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeID createETTypeID()
  {
    ETTypeIDImpl etTypeID = new ETTypeIDImpl();
    return etTypeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeIdentifier createETTypeIdentifier()
  {
    ETTypeIdentifierImpl etTypeIdentifier = new ETTypeIdentifierImpl();
    return etTypeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETIntegerType createETIntegerType()
  {
    ETIntegerTypeImpl etIntegerType = new ETIntegerTypeImpl();
    return etIntegerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETClockType createETClockType()
  {
    ETClockTypeImpl etClockType = new ETClockTypeImpl();
    return etClockType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETActionType createETActionType()
  {
    ETActionTypeImpl etActionType = new ETActionTypeImpl();
    return etActionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETInputType createETInputType()
  {
    ETInputTypeImpl etInputType = new ETInputTypeImpl();
    return etInputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETOutputType createETOutputType()
  {
    ETOutputTypeImpl etOutputType = new ETOutputTypeImpl();
    return etOutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBooleanType createETBooleanType()
  {
    ETBooleanTypeImpl etBooleanType = new ETBooleanTypeImpl();
    return etBooleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETScalarType createETScalarType()
  {
    ETScalarTypeImpl etScalarType = new ETScalarTypeImpl();
    return etScalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETStructType createETStructType()
  {
    ETStructTypeImpl etStructType = new ETStructTypeImpl();
    return etStructType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETFieldDeclaration createETFieldDeclaration()
  {
    ETFieldDeclarationImpl etFieldDeclaration = new ETFieldDeclarationImpl();
    return etFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETFieldID createETFieldID()
  {
    ETFieldIDImpl etFieldID = new ETFieldIDImpl();
    return etFieldID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationExpression createETSpecificationExpression()
  {
    ETSpecificationExpressionImpl etSpecificationExpression = new ETSpecificationExpressionImpl();
    return etSpecificationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecification createETSpecification()
  {
    ETSpecificationImpl etSpecification = new ETSpecificationImpl();
    return etSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationBinding createETSpecificationBinding()
  {
    ETSpecificationBindingImpl etSpecificationBinding = new ETSpecificationBindingImpl();
    return etSpecificationBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationDefinition createETSpecificationDefinition()
  {
    ETSpecificationDefinitionImpl etSpecificationDefinition = new ETSpecificationDefinitionImpl();
    return etSpecificationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationTemplate createETSpecificationTemplate()
  {
    ETSpecificationTemplateImpl etSpecificationTemplate = new ETSpecificationTemplateImpl();
    return etSpecificationTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationBody createETSpecificationBody()
  {
    ETSpecificationBodyImpl etSpecificationBody = new ETSpecificationBodyImpl();
    return etSpecificationBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETParameter createETParameter()
  {
    ETParameterImpl etParameter = new ETParameterImpl();
    return etParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLocation createETLocation()
  {
    ETLocationImpl etLocation = new ETLocationImpl();
    return etLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETEdge createETEdge()
  {
    ETEdgeImpl etEdge = new ETEdgeImpl();
    return etEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETIO createETIO()
  {
    ETIOImpl etio = new ETIOImpl();
    return etio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSelect createETSelect()
  {
    ETSelectImpl etSelect = new ETSelectImpl();
    return etSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression createETExpression()
  {
    ETExpressionImpl etExpression = new ETExpressionImpl();
    return etExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeReference createETTypeReference()
  {
    ETTypeReferenceImpl etTypeReference = new ETTypeReferenceImpl();
    return etTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationDisjunctionExpression createETSpecificationDisjunctionExpression()
  {
    ETSpecificationDisjunctionExpressionImpl etSpecificationDisjunctionExpression = new ETSpecificationDisjunctionExpressionImpl();
    return etSpecificationDisjunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationConjunctionExpression createETSpecificationConjunctionExpression()
  {
    ETSpecificationConjunctionExpressionImpl etSpecificationConjunctionExpression = new ETSpecificationConjunctionExpressionImpl();
    return etSpecificationConjunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationCompositionExpression createETSpecificationCompositionExpression()
  {
    ETSpecificationCompositionExpressionImpl etSpecificationCompositionExpression = new ETSpecificationCompositionExpressionImpl();
    return etSpecificationCompositionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationReference createETSpecificationReference()
  {
    ETSpecificationReferenceImpl etSpecificationReference = new ETSpecificationReferenceImpl();
    return etSpecificationReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationInstantiation createETSpecificationInstantiation()
  {
    ETSpecificationInstantiationImpl etSpecificationInstantiation = new ETSpecificationInstantiationImpl();
    return etSpecificationInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETForallExpression createETForallExpression()
  {
    ETForallExpressionImpl etForallExpression = new ETForallExpressionImpl();
    return etForallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExistsExpression createETExistsExpression()
  {
    ETExistsExpressionImpl etExistsExpression = new ETExistsExpressionImpl();
    return etExistsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETImplyExpression createETImplyExpression()
  {
    ETImplyExpressionImpl etImplyExpression = new ETImplyExpressionImpl();
    return etImplyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLogicOrExpression createETLogicOrExpression()
  {
    ETLogicOrExpressionImpl etLogicOrExpression = new ETLogicOrExpressionImpl();
    return etLogicOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLogicAndExpression createETLogicAndExpression()
  {
    ETLogicAndExpressionImpl etLogicAndExpression = new ETLogicAndExpressionImpl();
    return etLogicAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETAssignmentExpression createETAssignmentExpression()
  {
    ETAssignmentExpressionImpl etAssignmentExpression = new ETAssignmentExpressionImpl();
    return etAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETAdditionAssignmentExpression createETAdditionAssignmentExpression()
  {
    ETAdditionAssignmentExpressionImpl etAdditionAssignmentExpression = new ETAdditionAssignmentExpressionImpl();
    return etAdditionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSubtractionAssignmentExpression createETSubtractionAssignmentExpression()
  {
    ETSubtractionAssignmentExpressionImpl etSubtractionAssignmentExpression = new ETSubtractionAssignmentExpressionImpl();
    return etSubtractionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMultiplicationAssignmentExpression createETMultiplicationAssignmentExpression()
  {
    ETMultiplicationAssignmentExpressionImpl etMultiplicationAssignmentExpression = new ETMultiplicationAssignmentExpressionImpl();
    return etMultiplicationAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDivisionAssignmentExpression createETDivisionAssignmentExpression()
  {
    ETDivisionAssignmentExpressionImpl etDivisionAssignmentExpression = new ETDivisionAssignmentExpressionImpl();
    return etDivisionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETModuloAssignmentExpression createETModuloAssignmentExpression()
  {
    ETModuloAssignmentExpressionImpl etModuloAssignmentExpression = new ETModuloAssignmentExpressionImpl();
    return etModuloAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitOrAssignmentExpression createETBitOrAssignmentExpression()
  {
    ETBitOrAssignmentExpressionImpl etBitOrAssignmentExpression = new ETBitOrAssignmentExpressionImpl();
    return etBitOrAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitAndAssignmentExpression createETBitAndAssignmentExpression()
  {
    ETBitAndAssignmentExpressionImpl etBitAndAssignmentExpression = new ETBitAndAssignmentExpressionImpl();
    return etBitAndAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitXORAssignmentExpression createETBitXORAssignmentExpression()
  {
    ETBitXORAssignmentExpressionImpl etBitXORAssignmentExpression = new ETBitXORAssignmentExpressionImpl();
    return etBitXORAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitLeftAssignmentExpression createETBitLeftAssignmentExpression()
  {
    ETBitLeftAssignmentExpressionImpl etBitLeftAssignmentExpression = new ETBitLeftAssignmentExpressionImpl();
    return etBitLeftAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitRightAssignmentExpression createETBitRightAssignmentExpression()
  {
    ETBitRightAssignmentExpressionImpl etBitRightAssignmentExpression = new ETBitRightAssignmentExpressionImpl();
    return etBitRightAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETConditionalExpression createETConditionalExpression()
  {
    ETConditionalExpressionImpl etConditionalExpression = new ETConditionalExpressionImpl();
    return etConditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitOrExpression createETBitOrExpression()
  {
    ETBitOrExpressionImpl etBitOrExpression = new ETBitOrExpressionImpl();
    return etBitOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitXORExpression createETBitXORExpression()
  {
    ETBitXORExpressionImpl etBitXORExpression = new ETBitXORExpressionImpl();
    return etBitXORExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitAndExpression createETBitAndExpression()
  {
    ETBitAndExpressionImpl etBitAndExpression = new ETBitAndExpressionImpl();
    return etBitAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETEqualExpression createETEqualExpression()
  {
    ETEqualExpressionImpl etEqualExpression = new ETEqualExpressionImpl();
    return etEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETUnequalExpression createETUnequalExpression()
  {
    ETUnequalExpressionImpl etUnequalExpression = new ETUnequalExpressionImpl();
    return etUnequalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLessExpression createETLessExpression()
  {
    ETLessExpressionImpl etLessExpression = new ETLessExpressionImpl();
    return etLessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLessEqualExpression createETLessEqualExpression()
  {
    ETLessEqualExpressionImpl etLessEqualExpression = new ETLessEqualExpressionImpl();
    return etLessEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETGreaterEqualExpression createETGreaterEqualExpression()
  {
    ETGreaterEqualExpressionImpl etGreaterEqualExpression = new ETGreaterEqualExpressionImpl();
    return etGreaterEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETGreaterExpression createETGreaterExpression()
  {
    ETGreaterExpressionImpl etGreaterExpression = new ETGreaterExpressionImpl();
    return etGreaterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMinExpression createETMinExpression()
  {
    ETMinExpressionImpl etMinExpression = new ETMinExpressionImpl();
    return etMinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMaxExpression createETMaxExpression()
  {
    ETMaxExpressionImpl etMaxExpression = new ETMaxExpressionImpl();
    return etMaxExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitLeftExpression createETBitLeftExpression()
  {
    ETBitLeftExpressionImpl etBitLeftExpression = new ETBitLeftExpressionImpl();
    return etBitLeftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBitRightExpression createETBitRightExpression()
  {
    ETBitRightExpressionImpl etBitRightExpression = new ETBitRightExpressionImpl();
    return etBitRightExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETAddExpression createETAddExpression()
  {
    ETAddExpressionImpl etAddExpression = new ETAddExpressionImpl();
    return etAddExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSubtractExpression createETSubtractExpression()
  {
    ETSubtractExpressionImpl etSubtractExpression = new ETSubtractExpressionImpl();
    return etSubtractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMultiplyExpression createETMultiplyExpression()
  {
    ETMultiplyExpressionImpl etMultiplyExpression = new ETMultiplyExpressionImpl();
    return etMultiplyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDivideExpression createETDivideExpression()
  {
    ETDivideExpressionImpl etDivideExpression = new ETDivideExpressionImpl();
    return etDivideExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETModuloExpression createETModuloExpression()
  {
    ETModuloExpressionImpl etModuloExpression = new ETModuloExpressionImpl();
    return etModuloExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETPreIncrementExpression createETPreIncrementExpression()
  {
    ETPreIncrementExpressionImpl etPreIncrementExpression = new ETPreIncrementExpressionImpl();
    return etPreIncrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETPreDecrementExpression createETPreDecrementExpression()
  {
    ETPreDecrementExpressionImpl etPreDecrementExpression = new ETPreDecrementExpressionImpl();
    return etPreDecrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLogicNotExpression createETLogicNotExpression()
  {
    ETLogicNotExpressionImpl etLogicNotExpression = new ETLogicNotExpressionImpl();
    return etLogicNotExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETMinusExpression createETMinusExpression()
  {
    ETMinusExpressionImpl etMinusExpression = new ETMinusExpressionImpl();
    return etMinusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETPostIncrementExpression createETPostIncrementExpression()
  {
    ETPostIncrementExpressionImpl etPostIncrementExpression = new ETPostIncrementExpressionImpl();
    return etPostIncrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETPostDecrementExpression createETPostDecrementExpression()
  {
    ETPostDecrementExpressionImpl etPostDecrementExpression = new ETPostDecrementExpressionImpl();
    return etPostDecrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETArrayExpression createETArrayExpression()
  {
    ETArrayExpressionImpl etArrayExpression = new ETArrayExpressionImpl();
    return etArrayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETReference createETReference()
  {
    ETReferenceImpl etReference = new ETReferenceImpl();
    return etReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETBooleanLiteral createETBooleanLiteral()
  {
    ETBooleanLiteralImpl etBooleanLiteral = new ETBooleanLiteralImpl();
    return etBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETNumberLiteral createETNumberLiteral()
  {
    ETNumberLiteralImpl etNumberLiteral = new ETNumberLiteralImpl();
    return etNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETIOType createETIOTypeFromString(EDataType eDataType, String initialValue)
  {
    ETIOType result = ETIOType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertETIOTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcdarTextPackage getEcdarTextPackage()
  {
    return (EcdarTextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EcdarTextPackage getPackage()
  {
    return EcdarTextPackage.eINSTANCE;
  }

} //EcdarTextFactoryImpl
