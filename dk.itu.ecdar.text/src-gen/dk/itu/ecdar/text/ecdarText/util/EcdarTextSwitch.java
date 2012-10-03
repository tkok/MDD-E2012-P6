/**
 */
package dk.itu.ecdar.text.ecdarText.util;

import dk.itu.ecdar.text.ecdarText.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage
 * @generated
 */
public class EcdarTextSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EcdarTextPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcdarTextSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EcdarTextPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EcdarTextPackage.ET_FILE:
      {
        ETFile etFile = (ETFile)theEObject;
        T result = caseETFile(etFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_IMPORT:
      {
        ETImport etImport = (ETImport)theEObject;
        T result = caseETImport(etImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ARRAY_DECLARATION:
      {
        ETArrayDeclaration etArrayDeclaration = (ETArrayDeclaration)theEObject;
        T result = caseETArrayDeclaration(etArrayDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_DECLARATIONS:
      {
        ETDeclarations etDeclarations = (ETDeclarations)theEObject;
        T result = caseETDeclarations(etDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_DECLARATION:
      {
        ETDeclaration etDeclaration = (ETDeclaration)theEObject;
        T result = caseETDeclaration(etDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE:
      {
        ETType etType = (ETType)theEObject;
        T result = caseETType(etType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE_MODIFIERS:
      {
        ETTypeModifiers etTypeModifiers = (ETTypeModifiers)theEObject;
        T result = caseETTypeModifiers(etTypeModifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_VARIABLE_DECLARATION:
      {
        ETVariableDeclaration etVariableDeclaration = (ETVariableDeclaration)theEObject;
        T result = caseETVariableDeclaration(etVariableDeclaration);
        if (result == null) result = caseETDeclaration(etVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_VARIABLE_ID:
      {
        ETVariableID etVariableID = (ETVariableID)theEObject;
        T result = caseETVariableID(etVariableID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_INITIALISER:
      {
        ETInitialiser etInitialiser = (ETInitialiser)theEObject;
        T result = caseETInitialiser(etInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SINGLE_INITIALISER:
      {
        ETSingleInitialiser etSingleInitialiser = (ETSingleInitialiser)theEObject;
        T result = caseETSingleInitialiser(etSingleInitialiser);
        if (result == null) result = caseETInitialiser(etSingleInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MULTI_INITIALISER:
      {
        ETMultiInitialiser etMultiInitialiser = (ETMultiInitialiser)theEObject;
        T result = caseETMultiInitialiser(etMultiInitialiser);
        if (result == null) result = caseETInitialiser(etMultiInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE_DECLARATION:
      {
        ETTypeDeclaration etTypeDeclaration = (ETTypeDeclaration)theEObject;
        T result = caseETTypeDeclaration(etTypeDeclaration);
        if (result == null) result = caseETDeclaration(etTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE_ID:
      {
        ETTypeID etTypeID = (ETTypeID)theEObject;
        T result = caseETTypeID(etTypeID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE_IDENTIFIER:
      {
        ETTypeIdentifier etTypeIdentifier = (ETTypeIdentifier)theEObject;
        T result = caseETTypeIdentifier(etTypeIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_INTEGER_TYPE:
      {
        ETIntegerType etIntegerType = (ETIntegerType)theEObject;
        T result = caseETIntegerType(etIntegerType);
        if (result == null) result = caseETTypeIdentifier(etIntegerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_CLOCK_TYPE:
      {
        ETClockType etClockType = (ETClockType)theEObject;
        T result = caseETClockType(etClockType);
        if (result == null) result = caseETTypeIdentifier(etClockType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ACTION_TYPE:
      {
        ETActionType etActionType = (ETActionType)theEObject;
        T result = caseETActionType(etActionType);
        if (result == null) result = caseETTypeIdentifier(etActionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_INPUT_TYPE:
      {
        ETInputType etInputType = (ETInputType)theEObject;
        T result = caseETInputType(etInputType);
        if (result == null) result = caseETActionType(etInputType);
        if (result == null) result = caseETTypeIdentifier(etInputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_OUTPUT_TYPE:
      {
        ETOutputType etOutputType = (ETOutputType)theEObject;
        T result = caseETOutputType(etOutputType);
        if (result == null) result = caseETActionType(etOutputType);
        if (result == null) result = caseETTypeIdentifier(etOutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BOOLEAN_TYPE:
      {
        ETBooleanType etBooleanType = (ETBooleanType)theEObject;
        T result = caseETBooleanType(etBooleanType);
        if (result == null) result = caseETTypeIdentifier(etBooleanType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SCALAR_TYPE:
      {
        ETScalarType etScalarType = (ETScalarType)theEObject;
        T result = caseETScalarType(etScalarType);
        if (result == null) result = caseETTypeIdentifier(etScalarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_STRUCT_TYPE:
      {
        ETStructType etStructType = (ETStructType)theEObject;
        T result = caseETStructType(etStructType);
        if (result == null) result = caseETTypeIdentifier(etStructType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_FIELD_DECLARATION:
      {
        ETFieldDeclaration etFieldDeclaration = (ETFieldDeclaration)theEObject;
        T result = caseETFieldDeclaration(etFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_FIELD_ID:
      {
        ETFieldID etFieldID = (ETFieldID)theEObject;
        T result = caseETFieldID(etFieldID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_EXPRESSION:
      {
        ETSpecificationExpression etSpecificationExpression = (ETSpecificationExpression)theEObject;
        T result = caseETSpecificationExpression(etSpecificationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION:
      {
        ETSpecification etSpecification = (ETSpecification)theEObject;
        T result = caseETSpecification(etSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_BINDING:
      {
        ETSpecificationBinding etSpecificationBinding = (ETSpecificationBinding)theEObject;
        T result = caseETSpecificationBinding(etSpecificationBinding);
        if (result == null) result = caseETSpecification(etSpecificationBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_DEFINITION:
      {
        ETSpecificationDefinition etSpecificationDefinition = (ETSpecificationDefinition)theEObject;
        T result = caseETSpecificationDefinition(etSpecificationDefinition);
        if (result == null) result = caseETSpecification(etSpecificationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_TEMPLATE:
      {
        ETSpecificationTemplate etSpecificationTemplate = (ETSpecificationTemplate)theEObject;
        T result = caseETSpecificationTemplate(etSpecificationTemplate);
        if (result == null) result = caseETSpecificationDefinition(etSpecificationTemplate);
        if (result == null) result = caseETSpecification(etSpecificationTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_BODY:
      {
        ETSpecificationBody etSpecificationBody = (ETSpecificationBody)theEObject;
        T result = caseETSpecificationBody(etSpecificationBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_PARAMETER:
      {
        ETParameter etParameter = (ETParameter)theEObject;
        T result = caseETParameter(etParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LOCATION:
      {
        ETLocation etLocation = (ETLocation)theEObject;
        T result = caseETLocation(etLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_EDGE:
      {
        ETEdge etEdge = (ETEdge)theEObject;
        T result = caseETEdge(etEdge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ETIO:
      {
        ETIO etio = (ETIO)theEObject;
        T result = caseETIO(etio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SELECT:
      {
        ETSelect etSelect = (ETSelect)theEObject;
        T result = caseETSelect(etSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_EXPRESSION:
      {
        ETExpression etExpression = (ETExpression)theEObject;
        T result = caseETExpression(etExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_TYPE_REFERENCE:
      {
        ETTypeReference etTypeReference = (ETTypeReference)theEObject;
        T result = caseETTypeReference(etTypeReference);
        if (result == null) result = caseETTypeIdentifier(etTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_DISJUNCTION_EXPRESSION:
      {
        ETSpecificationDisjunctionExpression etSpecificationDisjunctionExpression = (ETSpecificationDisjunctionExpression)theEObject;
        T result = caseETSpecificationDisjunctionExpression(etSpecificationDisjunctionExpression);
        if (result == null) result = caseETSpecificationExpression(etSpecificationDisjunctionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_CONJUNCTION_EXPRESSION:
      {
        ETSpecificationConjunctionExpression etSpecificationConjunctionExpression = (ETSpecificationConjunctionExpression)theEObject;
        T result = caseETSpecificationConjunctionExpression(etSpecificationConjunctionExpression);
        if (result == null) result = caseETSpecificationExpression(etSpecificationConjunctionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_COMPOSITION_EXPRESSION:
      {
        ETSpecificationCompositionExpression etSpecificationCompositionExpression = (ETSpecificationCompositionExpression)theEObject;
        T result = caseETSpecificationCompositionExpression(etSpecificationCompositionExpression);
        if (result == null) result = caseETSpecificationExpression(etSpecificationCompositionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE:
      {
        ETSpecificationReference etSpecificationReference = (ETSpecificationReference)theEObject;
        T result = caseETSpecificationReference(etSpecificationReference);
        if (result == null) result = caseETSpecificationExpression(etSpecificationReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION:
      {
        ETSpecificationInstantiation etSpecificationInstantiation = (ETSpecificationInstantiation)theEObject;
        T result = caseETSpecificationInstantiation(etSpecificationInstantiation);
        if (result == null) result = caseETSpecificationExpression(etSpecificationInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_FORALL_EXPRESSION:
      {
        ETForallExpression etForallExpression = (ETForallExpression)theEObject;
        T result = caseETForallExpression(etForallExpression);
        if (result == null) result = caseETExpression(etForallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_EXISTS_EXPRESSION:
      {
        ETExistsExpression etExistsExpression = (ETExistsExpression)theEObject;
        T result = caseETExistsExpression(etExistsExpression);
        if (result == null) result = caseETExpression(etExistsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_IMPLY_EXPRESSION:
      {
        ETImplyExpression etImplyExpression = (ETImplyExpression)theEObject;
        T result = caseETImplyExpression(etImplyExpression);
        if (result == null) result = caseETExpression(etImplyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LOGIC_OR_EXPRESSION:
      {
        ETLogicOrExpression etLogicOrExpression = (ETLogicOrExpression)theEObject;
        T result = caseETLogicOrExpression(etLogicOrExpression);
        if (result == null) result = caseETExpression(etLogicOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LOGIC_AND_EXPRESSION:
      {
        ETLogicAndExpression etLogicAndExpression = (ETLogicAndExpression)theEObject;
        T result = caseETLogicAndExpression(etLogicAndExpression);
        if (result == null) result = caseETExpression(etLogicAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ASSIGNMENT_EXPRESSION:
      {
        ETAssignmentExpression etAssignmentExpression = (ETAssignmentExpression)theEObject;
        T result = caseETAssignmentExpression(etAssignmentExpression);
        if (result == null) result = caseETExpression(etAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ADDITION_ASSIGNMENT_EXPRESSION:
      {
        ETAdditionAssignmentExpression etAdditionAssignmentExpression = (ETAdditionAssignmentExpression)theEObject;
        T result = caseETAdditionAssignmentExpression(etAdditionAssignmentExpression);
        if (result == null) result = caseETExpression(etAdditionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SUBTRACTION_ASSIGNMENT_EXPRESSION:
      {
        ETSubtractionAssignmentExpression etSubtractionAssignmentExpression = (ETSubtractionAssignmentExpression)theEObject;
        T result = caseETSubtractionAssignmentExpression(etSubtractionAssignmentExpression);
        if (result == null) result = caseETExpression(etSubtractionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION:
      {
        ETMultiplicationAssignmentExpression etMultiplicationAssignmentExpression = (ETMultiplicationAssignmentExpression)theEObject;
        T result = caseETMultiplicationAssignmentExpression(etMultiplicationAssignmentExpression);
        if (result == null) result = caseETExpression(etMultiplicationAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_DIVISION_ASSIGNMENT_EXPRESSION:
      {
        ETDivisionAssignmentExpression etDivisionAssignmentExpression = (ETDivisionAssignmentExpression)theEObject;
        T result = caseETDivisionAssignmentExpression(etDivisionAssignmentExpression);
        if (result == null) result = caseETExpression(etDivisionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MODULO_ASSIGNMENT_EXPRESSION:
      {
        ETModuloAssignmentExpression etModuloAssignmentExpression = (ETModuloAssignmentExpression)theEObject;
        T result = caseETModuloAssignmentExpression(etModuloAssignmentExpression);
        if (result == null) result = caseETExpression(etModuloAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_OR_ASSIGNMENT_EXPRESSION:
      {
        ETBitOrAssignmentExpression etBitOrAssignmentExpression = (ETBitOrAssignmentExpression)theEObject;
        T result = caseETBitOrAssignmentExpression(etBitOrAssignmentExpression);
        if (result == null) result = caseETExpression(etBitOrAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_AND_ASSIGNMENT_EXPRESSION:
      {
        ETBitAndAssignmentExpression etBitAndAssignmentExpression = (ETBitAndAssignmentExpression)theEObject;
        T result = caseETBitAndAssignmentExpression(etBitAndAssignmentExpression);
        if (result == null) result = caseETExpression(etBitAndAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_XOR_ASSIGNMENT_EXPRESSION:
      {
        ETBitXORAssignmentExpression etBitXORAssignmentExpression = (ETBitXORAssignmentExpression)theEObject;
        T result = caseETBitXORAssignmentExpression(etBitXORAssignmentExpression);
        if (result == null) result = caseETExpression(etBitXORAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_LEFT_ASSIGNMENT_EXPRESSION:
      {
        ETBitLeftAssignmentExpression etBitLeftAssignmentExpression = (ETBitLeftAssignmentExpression)theEObject;
        T result = caseETBitLeftAssignmentExpression(etBitLeftAssignmentExpression);
        if (result == null) result = caseETExpression(etBitLeftAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION:
      {
        ETBitRightAssignmentExpression etBitRightAssignmentExpression = (ETBitRightAssignmentExpression)theEObject;
        T result = caseETBitRightAssignmentExpression(etBitRightAssignmentExpression);
        if (result == null) result = caseETExpression(etBitRightAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION:
      {
        ETConditionalExpression etConditionalExpression = (ETConditionalExpression)theEObject;
        T result = caseETConditionalExpression(etConditionalExpression);
        if (result == null) result = caseETExpression(etConditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_OR_EXPRESSION:
      {
        ETBitOrExpression etBitOrExpression = (ETBitOrExpression)theEObject;
        T result = caseETBitOrExpression(etBitOrExpression);
        if (result == null) result = caseETExpression(etBitOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_XOR_EXPRESSION:
      {
        ETBitXORExpression etBitXORExpression = (ETBitXORExpression)theEObject;
        T result = caseETBitXORExpression(etBitXORExpression);
        if (result == null) result = caseETExpression(etBitXORExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_AND_EXPRESSION:
      {
        ETBitAndExpression etBitAndExpression = (ETBitAndExpression)theEObject;
        T result = caseETBitAndExpression(etBitAndExpression);
        if (result == null) result = caseETExpression(etBitAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_EQUAL_EXPRESSION:
      {
        ETEqualExpression etEqualExpression = (ETEqualExpression)theEObject;
        T result = caseETEqualExpression(etEqualExpression);
        if (result == null) result = caseETExpression(etEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_UNEQUAL_EXPRESSION:
      {
        ETUnequalExpression etUnequalExpression = (ETUnequalExpression)theEObject;
        T result = caseETUnequalExpression(etUnequalExpression);
        if (result == null) result = caseETExpression(etUnequalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LESS_EXPRESSION:
      {
        ETLessExpression etLessExpression = (ETLessExpression)theEObject;
        T result = caseETLessExpression(etLessExpression);
        if (result == null) result = caseETExpression(etLessExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LESS_EQUAL_EXPRESSION:
      {
        ETLessEqualExpression etLessEqualExpression = (ETLessEqualExpression)theEObject;
        T result = caseETLessEqualExpression(etLessEqualExpression);
        if (result == null) result = caseETExpression(etLessEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_GREATER_EQUAL_EXPRESSION:
      {
        ETGreaterEqualExpression etGreaterEqualExpression = (ETGreaterEqualExpression)theEObject;
        T result = caseETGreaterEqualExpression(etGreaterEqualExpression);
        if (result == null) result = caseETExpression(etGreaterEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_GREATER_EXPRESSION:
      {
        ETGreaterExpression etGreaterExpression = (ETGreaterExpression)theEObject;
        T result = caseETGreaterExpression(etGreaterExpression);
        if (result == null) result = caseETExpression(etGreaterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MIN_EXPRESSION:
      {
        ETMinExpression etMinExpression = (ETMinExpression)theEObject;
        T result = caseETMinExpression(etMinExpression);
        if (result == null) result = caseETExpression(etMinExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MAX_EXPRESSION:
      {
        ETMaxExpression etMaxExpression = (ETMaxExpression)theEObject;
        T result = caseETMaxExpression(etMaxExpression);
        if (result == null) result = caseETExpression(etMaxExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_LEFT_EXPRESSION:
      {
        ETBitLeftExpression etBitLeftExpression = (ETBitLeftExpression)theEObject;
        T result = caseETBitLeftExpression(etBitLeftExpression);
        if (result == null) result = caseETExpression(etBitLeftExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BIT_RIGHT_EXPRESSION:
      {
        ETBitRightExpression etBitRightExpression = (ETBitRightExpression)theEObject;
        T result = caseETBitRightExpression(etBitRightExpression);
        if (result == null) result = caseETExpression(etBitRightExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ADD_EXPRESSION:
      {
        ETAddExpression etAddExpression = (ETAddExpression)theEObject;
        T result = caseETAddExpression(etAddExpression);
        if (result == null) result = caseETExpression(etAddExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_SUBTRACT_EXPRESSION:
      {
        ETSubtractExpression etSubtractExpression = (ETSubtractExpression)theEObject;
        T result = caseETSubtractExpression(etSubtractExpression);
        if (result == null) result = caseETExpression(etSubtractExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MULTIPLY_EXPRESSION:
      {
        ETMultiplyExpression etMultiplyExpression = (ETMultiplyExpression)theEObject;
        T result = caseETMultiplyExpression(etMultiplyExpression);
        if (result == null) result = caseETExpression(etMultiplyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_DIVIDE_EXPRESSION:
      {
        ETDivideExpression etDivideExpression = (ETDivideExpression)theEObject;
        T result = caseETDivideExpression(etDivideExpression);
        if (result == null) result = caseETExpression(etDivideExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MODULO_EXPRESSION:
      {
        ETModuloExpression etModuloExpression = (ETModuloExpression)theEObject;
        T result = caseETModuloExpression(etModuloExpression);
        if (result == null) result = caseETExpression(etModuloExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_PRE_INCREMENT_EXPRESSION:
      {
        ETPreIncrementExpression etPreIncrementExpression = (ETPreIncrementExpression)theEObject;
        T result = caseETPreIncrementExpression(etPreIncrementExpression);
        if (result == null) result = caseETExpression(etPreIncrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_PRE_DECREMENT_EXPRESSION:
      {
        ETPreDecrementExpression etPreDecrementExpression = (ETPreDecrementExpression)theEObject;
        T result = caseETPreDecrementExpression(etPreDecrementExpression);
        if (result == null) result = caseETExpression(etPreDecrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_LOGIC_NOT_EXPRESSION:
      {
        ETLogicNotExpression etLogicNotExpression = (ETLogicNotExpression)theEObject;
        T result = caseETLogicNotExpression(etLogicNotExpression);
        if (result == null) result = caseETExpression(etLogicNotExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_MINUS_EXPRESSION:
      {
        ETMinusExpression etMinusExpression = (ETMinusExpression)theEObject;
        T result = caseETMinusExpression(etMinusExpression);
        if (result == null) result = caseETExpression(etMinusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_POST_INCREMENT_EXPRESSION:
      {
        ETPostIncrementExpression etPostIncrementExpression = (ETPostIncrementExpression)theEObject;
        T result = caseETPostIncrementExpression(etPostIncrementExpression);
        if (result == null) result = caseETExpression(etPostIncrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_POST_DECREMENT_EXPRESSION:
      {
        ETPostDecrementExpression etPostDecrementExpression = (ETPostDecrementExpression)theEObject;
        T result = caseETPostDecrementExpression(etPostDecrementExpression);
        if (result == null) result = caseETExpression(etPostDecrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_ARRAY_EXPRESSION:
      {
        ETArrayExpression etArrayExpression = (ETArrayExpression)theEObject;
        T result = caseETArrayExpression(etArrayExpression);
        if (result == null) result = caseETExpression(etArrayExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_REFERENCE:
      {
        ETReference etReference = (ETReference)theEObject;
        T result = caseETReference(etReference);
        if (result == null) result = caseETExpression(etReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_BOOLEAN_LITERAL:
      {
        ETBooleanLiteral etBooleanLiteral = (ETBooleanLiteral)theEObject;
        T result = caseETBooleanLiteral(etBooleanLiteral);
        if (result == null) result = caseETExpression(etBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcdarTextPackage.ET_NUMBER_LITERAL:
      {
        ETNumberLiteral etNumberLiteral = (ETNumberLiteral)theEObject;
        T result = caseETNumberLiteral(etNumberLiteral);
        if (result == null) result = caseETExpression(etNumberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETFile(ETFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETImport(ETImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Array Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Array Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETArrayDeclaration(ETArrayDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETDeclarations(ETDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETDeclaration(ETDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETType(ETType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type Modifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type Modifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETTypeModifiers(ETTypeModifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETVariableDeclaration(ETVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Variable ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Variable ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETVariableID(ETVariableID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETInitialiser(ETInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Single Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Single Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSingleInitialiser(ETSingleInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Multi Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Multi Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMultiInitialiser(ETMultiInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETTypeDeclaration(ETTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETTypeID(ETTypeID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETTypeIdentifier(ETTypeIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Integer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Integer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETIntegerType(ETIntegerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Clock Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Clock Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETClockType(ETClockType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Action Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Action Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETActionType(ETActionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Input Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETInputType(ETInputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Output Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Output Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETOutputType(ETOutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Boolean Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBooleanType(ETBooleanType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Scalar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETScalarType(ETScalarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETStructType(ETStructType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETFieldDeclaration(ETFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Field ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Field ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETFieldID(ETFieldID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationExpression(ETSpecificationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecification(ETSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationBinding(ETSpecificationBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationDefinition(ETSpecificationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationTemplate(ETSpecificationTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationBody(ETSpecificationBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETParameter(ETParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLocation(ETLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Edge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Edge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETEdge(ETEdge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ETIO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ETIO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETIO(ETIO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSelect(ETSelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETExpression(ETExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETTypeReference(ETTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Disjunction Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Disjunction Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationDisjunctionExpression(ETSpecificationDisjunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Conjunction Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Conjunction Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationConjunctionExpression(ETSpecificationConjunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Composition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Composition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationCompositionExpression(ETSpecificationCompositionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationReference(ETSpecificationReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Specification Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Specification Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSpecificationInstantiation(ETSpecificationInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Forall Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Forall Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETForallExpression(ETForallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Exists Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Exists Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETExistsExpression(ETExistsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Imply Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Imply Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETImplyExpression(ETImplyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Logic Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Logic Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLogicOrExpression(ETLogicOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Logic And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Logic And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLogicAndExpression(ETLogicAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETAssignmentExpression(ETAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Addition Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Addition Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETAdditionAssignmentExpression(ETAdditionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Subtraction Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Subtraction Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSubtractionAssignmentExpression(ETSubtractionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Multiplication Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Multiplication Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMultiplicationAssignmentExpression(ETMultiplicationAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Division Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Division Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETDivisionAssignmentExpression(ETDivisionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Modulo Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Modulo Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETModuloAssignmentExpression(ETModuloAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Or Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Or Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitOrAssignmentExpression(ETBitOrAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit And Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit And Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitAndAssignmentExpression(ETBitAndAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit XOR Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit XOR Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitXORAssignmentExpression(ETBitXORAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Left Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Left Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitLeftAssignmentExpression(ETBitLeftAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Right Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Right Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitRightAssignmentExpression(ETBitRightAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETConditionalExpression(ETConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitOrExpression(ETBitOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit XOR Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit XOR Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitXORExpression(ETBitXORExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitAndExpression(ETBitAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETEqualExpression(ETEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Unequal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Unequal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETUnequalExpression(ETUnequalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Less Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Less Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLessExpression(ETLessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Less Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Less Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLessEqualExpression(ETLessEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Greater Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Greater Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETGreaterEqualExpression(ETGreaterEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Greater Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETGreaterExpression(ETGreaterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Min Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Min Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMinExpression(ETMinExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Max Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Max Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMaxExpression(ETMaxExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Left Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Left Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitLeftExpression(ETBitLeftExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Bit Right Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Bit Right Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBitRightExpression(ETBitRightExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Add Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Add Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETAddExpression(ETAddExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Subtract Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Subtract Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETSubtractExpression(ETSubtractExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Multiply Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Multiply Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMultiplyExpression(ETMultiplyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Divide Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Divide Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETDivideExpression(ETDivideExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Modulo Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Modulo Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETModuloExpression(ETModuloExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Pre Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Pre Increment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETPreIncrementExpression(ETPreIncrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Pre Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Pre Decrement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETPreDecrementExpression(ETPreDecrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Logic Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Logic Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETLogicNotExpression(ETLogicNotExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Minus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETMinusExpression(ETMinusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Post Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Post Increment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETPostIncrementExpression(ETPostIncrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Post Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Post Decrement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETPostDecrementExpression(ETPostDecrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Array Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Array Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETArrayExpression(ETArrayExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETReference(ETReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETBooleanLiteral(ETBooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ET Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ET Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETNumberLiteral(ETNumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EcdarTextSwitch
