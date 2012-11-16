/**
 */
package org.uppaal.xml.description.description.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.uppaal.xml.description.description.*;

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
 * @see org.uppaal.xml.description.description.DescriptionPackage
 * @generated
 */
public class DescriptionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DescriptionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DescriptionPackage.eINSTANCE;
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
      case DescriptionPackage.TOP:
      {
        Top top = (Top)theEObject;
        T result = caseTop(top);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SYSTEM_DEFINITION:
      {
        UASystemDefinition uaSystemDefinition = (UASystemDefinition)theEObject;
        T result = caseUASystemDefinition(uaSystemDefinition);
        if (result == null) result = caseTop(uaSystemDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_DEFINITION:
      {
        UADefinition uaDefinition = (UADefinition)theEObject;
        T result = caseUADefinition(uaDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_INSTANTIATION:
      {
        UAInstantiation uaInstantiation = (UAInstantiation)theEObject;
        T result = caseUAInstantiation(uaInstantiation);
        if (result == null) result = caseUADefinition(uaInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SYSTEM:
      {
        UASystem uaSystem = (UASystem)theEObject;
        T result = caseUASystem(uaSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SYSTEM_ID:
      {
        UASystemID uaSystemID = (UASystemID)theEObject;
        T result = caseUASystemID(uaSystemID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_ARRAY_DECLARATION:
      {
        UAArrayDeclaration uaArrayDeclaration = (UAArrayDeclaration)theEObject;
        T result = caseUAArrayDeclaration(uaArrayDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_DECLARATIONS:
      {
        UADeclarations uaDeclarations = (UADeclarations)theEObject;
        T result = caseUADeclarations(uaDeclarations);
        if (result == null) result = caseTop(uaDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_DECLARATION:
      {
        UADeclaration uaDeclaration = (UADeclaration)theEObject;
        T result = caseUADeclaration(uaDeclaration);
        if (result == null) result = caseUADefinition(uaDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_TYPE:
      {
        UAType uaType = (UAType)theEObject;
        T result = caseUAType(uaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_TYPE_MODIFIERS:
      {
        UATypeModifiers uaTypeModifiers = (UATypeModifiers)theEObject;
        T result = caseUATypeModifiers(uaTypeModifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_VARIABLE_DECLARATION:
      {
        UAVariableDeclaration uaVariableDeclaration = (UAVariableDeclaration)theEObject;
        T result = caseUAVariableDeclaration(uaVariableDeclaration);
        if (result == null) result = caseUADeclaration(uaVariableDeclaration);
        if (result == null) result = caseUADefinition(uaVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_VARIABLE_ID:
      {
        UAVariableID uaVariableID = (UAVariableID)theEObject;
        T result = caseUAVariableID(uaVariableID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_INITIALISER:
      {
        UAInitialiser uaInitialiser = (UAInitialiser)theEObject;
        T result = caseUAInitialiser(uaInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SINGLE_INITIALISER:
      {
        UASingleInitialiser uaSingleInitialiser = (UASingleInitialiser)theEObject;
        T result = caseUASingleInitialiser(uaSingleInitialiser);
        if (result == null) result = caseUAInitialiser(uaSingleInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MULTI_INITIALISER:
      {
        UAMultiInitialiser uaMultiInitialiser = (UAMultiInitialiser)theEObject;
        T result = caseUAMultiInitialiser(uaMultiInitialiser);
        if (result == null) result = caseUAInitialiser(uaMultiInitialiser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_TYPE_DECLARATION:
      {
        UATypeDeclaration uaTypeDeclaration = (UATypeDeclaration)theEObject;
        T result = caseUATypeDeclaration(uaTypeDeclaration);
        if (result == null) result = caseUADeclaration(uaTypeDeclaration);
        if (result == null) result = caseUADefinition(uaTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_TYPE_ID:
      {
        UATypeID uaTypeID = (UATypeID)theEObject;
        T result = caseUATypeID(uaTypeID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_TYPE_IDENTIFIER:
      {
        UATypeIdentifier uaTypeIdentifier = (UATypeIdentifier)theEObject;
        T result = caseUATypeIdentifier(uaTypeIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_INTEGER_TYPE:
      {
        UAIntegerType uaIntegerType = (UAIntegerType)theEObject;
        T result = caseUAIntegerType(uaIntegerType);
        if (result == null) result = caseUATypeIdentifier(uaIntegerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_CLOCK_TYPE:
      {
        UAClockType uaClockType = (UAClockType)theEObject;
        T result = caseUAClockType(uaClockType);
        if (result == null) result = caseUATypeIdentifier(uaClockType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_CHANNEL_TYPE:
      {
        UAChannelType uaChannelType = (UAChannelType)theEObject;
        T result = caseUAChannelType(uaChannelType);
        if (result == null) result = caseUATypeIdentifier(uaChannelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BOOLEAN_TYPE:
      {
        UABooleanType uaBooleanType = (UABooleanType)theEObject;
        T result = caseUABooleanType(uaBooleanType);
        if (result == null) result = caseUATypeIdentifier(uaBooleanType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SCALAR_TYPE:
      {
        UAScalarType uaScalarType = (UAScalarType)theEObject;
        T result = caseUAScalarType(uaScalarType);
        if (result == null) result = caseUATypeIdentifier(uaScalarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_STRUCT_TYPE:
      {
        UAStructType uaStructType = (UAStructType)theEObject;
        T result = caseUAStructType(uaStructType);
        if (result == null) result = caseUATypeIdentifier(uaStructType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_FIELD_DECLARATION:
      {
        UAFieldDeclaration uaFieldDeclaration = (UAFieldDeclaration)theEObject;
        T result = caseUAFieldDeclaration(uaFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_FIELD_ID:
      {
        UAFieldID uaFieldID = (UAFieldID)theEObject;
        T result = caseUAFieldID(uaFieldID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_PARAMETERS:
      {
        UAParameters uaParameters = (UAParameters)theEObject;
        T result = caseUAParameters(uaParameters);
        if (result == null) result = caseTop(uaParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_PARAMETER:
      {
        UAParameter uaParameter = (UAParameter)theEObject;
        T result = caseUAParameter(uaParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_EXPRESSION:
      {
        UAExpression uaExpression = (UAExpression)theEObject;
        T result = caseUAExpression(uaExpression);
        if (result == null) result = caseTop(uaExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SELECT_LIST:
      {
        UASelectList uaSelectList = (UASelectList)theEObject;
        T result = caseUASelectList(uaSelectList);
        if (result == null) result = caseTop(uaSelectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SELECT:
      {
        UASelect uaSelect = (UASelect)theEObject;
        T result = caseUASelect(uaSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_UPDATE:
      {
        UAUpdate uaUpdate = (UAUpdate)theEObject;
        T result = caseUAUpdate(uaUpdate);
        if (result == null) result = caseTop(uaUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SYNCHRONISATION:
      {
        UASynchronisation uaSynchronisation = (UASynchronisation)theEObject;
        T result = caseUASynchronisation(uaSynchronisation);
        if (result == null) result = caseTop(uaSynchronisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_USER_TYPE:
      {
        UAUserType uaUserType = (UAUserType)theEObject;
        T result = caseUAUserType(uaUserType);
        if (result == null) result = caseUATypeIdentifier(uaUserType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_FORALL_EXPRESSION:
      {
        UAForallExpression uaForallExpression = (UAForallExpression)theEObject;
        T result = caseUAForallExpression(uaForallExpression);
        if (result == null) result = caseUAExpression(uaForallExpression);
        if (result == null) result = caseTop(uaForallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_EXISTS_EXPRESSION:
      {
        UAExistsExpression uaExistsExpression = (UAExistsExpression)theEObject;
        T result = caseUAExistsExpression(uaExistsExpression);
        if (result == null) result = caseUAExpression(uaExistsExpression);
        if (result == null) result = caseTop(uaExistsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_IMPLY_EXPRESSION:
      {
        UAImplyExpression uaImplyExpression = (UAImplyExpression)theEObject;
        T result = caseUAImplyExpression(uaImplyExpression);
        if (result == null) result = caseUAExpression(uaImplyExpression);
        if (result == null) result = caseTop(uaImplyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_LOGIC_OR_EXPRESSION:
      {
        UALogicOrExpression uaLogicOrExpression = (UALogicOrExpression)theEObject;
        T result = caseUALogicOrExpression(uaLogicOrExpression);
        if (result == null) result = caseUAExpression(uaLogicOrExpression);
        if (result == null) result = caseTop(uaLogicOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_LOGIC_AND_EXPRESSION:
      {
        UALogicAndExpression uaLogicAndExpression = (UALogicAndExpression)theEObject;
        T result = caseUALogicAndExpression(uaLogicAndExpression);
        if (result == null) result = caseUAExpression(uaLogicAndExpression);
        if (result == null) result = caseTop(uaLogicAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_ASSIGNMENT_EXPRESSION:
      {
        UAAssignmentExpression uaAssignmentExpression = (UAAssignmentExpression)theEObject;
        T result = caseUAAssignmentExpression(uaAssignmentExpression);
        if (result == null) result = caseUAExpression(uaAssignmentExpression);
        if (result == null) result = caseTop(uaAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_ADDITION_ASSIGNMENT_EXPRESSION:
      {
        UAAdditionAssignmentExpression uaAdditionAssignmentExpression = (UAAdditionAssignmentExpression)theEObject;
        T result = caseUAAdditionAssignmentExpression(uaAdditionAssignmentExpression);
        if (result == null) result = caseUAExpression(uaAdditionAssignmentExpression);
        if (result == null) result = caseTop(uaAdditionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION:
      {
        UASubtractionAssignmentExpression uaSubtractionAssignmentExpression = (UASubtractionAssignmentExpression)theEObject;
        T result = caseUASubtractionAssignmentExpression(uaSubtractionAssignmentExpression);
        if (result == null) result = caseUAExpression(uaSubtractionAssignmentExpression);
        if (result == null) result = caseTop(uaSubtractionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION:
      {
        UAMultiplicationAssignmentExpression uaMultiplicationAssignmentExpression = (UAMultiplicationAssignmentExpression)theEObject;
        T result = caseUAMultiplicationAssignmentExpression(uaMultiplicationAssignmentExpression);
        if (result == null) result = caseUAExpression(uaMultiplicationAssignmentExpression);
        if (result == null) result = caseTop(uaMultiplicationAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_DIVISION_ASSIGNMENT_EXPRESSION:
      {
        UADivisionAssignmentExpression uaDivisionAssignmentExpression = (UADivisionAssignmentExpression)theEObject;
        T result = caseUADivisionAssignmentExpression(uaDivisionAssignmentExpression);
        if (result == null) result = caseUAExpression(uaDivisionAssignmentExpression);
        if (result == null) result = caseTop(uaDivisionAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MODULO_ASSIGNMENT_EXPRESSION:
      {
        UAModuloAssignmentExpression uaModuloAssignmentExpression = (UAModuloAssignmentExpression)theEObject;
        T result = caseUAModuloAssignmentExpression(uaModuloAssignmentExpression);
        if (result == null) result = caseUAExpression(uaModuloAssignmentExpression);
        if (result == null) result = caseTop(uaModuloAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_OR_ASSIGNMENT_EXPRESSION:
      {
        UABitOrAssignmentExpression uaBitOrAssignmentExpression = (UABitOrAssignmentExpression)theEObject;
        T result = caseUABitOrAssignmentExpression(uaBitOrAssignmentExpression);
        if (result == null) result = caseUAExpression(uaBitOrAssignmentExpression);
        if (result == null) result = caseTop(uaBitOrAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_AND_ASSIGNMENT_EXPRESSION:
      {
        UABitAndAssignmentExpression uaBitAndAssignmentExpression = (UABitAndAssignmentExpression)theEObject;
        T result = caseUABitAndAssignmentExpression(uaBitAndAssignmentExpression);
        if (result == null) result = caseUAExpression(uaBitAndAssignmentExpression);
        if (result == null) result = caseTop(uaBitAndAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_XOR_ASSIGNMENT_EXPRESSION:
      {
        UABitXORAssignmentExpression uaBitXORAssignmentExpression = (UABitXORAssignmentExpression)theEObject;
        T result = caseUABitXORAssignmentExpression(uaBitXORAssignmentExpression);
        if (result == null) result = caseUAExpression(uaBitXORAssignmentExpression);
        if (result == null) result = caseTop(uaBitXORAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION:
      {
        UABitLeftAssignmentExpression uaBitLeftAssignmentExpression = (UABitLeftAssignmentExpression)theEObject;
        T result = caseUABitLeftAssignmentExpression(uaBitLeftAssignmentExpression);
        if (result == null) result = caseUAExpression(uaBitLeftAssignmentExpression);
        if (result == null) result = caseTop(uaBitLeftAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION:
      {
        UABitRightAssignmentExpression uaBitRightAssignmentExpression = (UABitRightAssignmentExpression)theEObject;
        T result = caseUABitRightAssignmentExpression(uaBitRightAssignmentExpression);
        if (result == null) result = caseUAExpression(uaBitRightAssignmentExpression);
        if (result == null) result = caseTop(uaBitRightAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_CONDITIONAL_EXPRESSION:
      {
        UAConditionalExpression uaConditionalExpression = (UAConditionalExpression)theEObject;
        T result = caseUAConditionalExpression(uaConditionalExpression);
        if (result == null) result = caseUAExpression(uaConditionalExpression);
        if (result == null) result = caseTop(uaConditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_OR_EXPRESSION:
      {
        UABitOrExpression uaBitOrExpression = (UABitOrExpression)theEObject;
        T result = caseUABitOrExpression(uaBitOrExpression);
        if (result == null) result = caseUAExpression(uaBitOrExpression);
        if (result == null) result = caseTop(uaBitOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_XOR_EXPRESSION:
      {
        UABitXORExpression uaBitXORExpression = (UABitXORExpression)theEObject;
        T result = caseUABitXORExpression(uaBitXORExpression);
        if (result == null) result = caseUAExpression(uaBitXORExpression);
        if (result == null) result = caseTop(uaBitXORExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_AND_EXPRESSION:
      {
        UABitAndExpression uaBitAndExpression = (UABitAndExpression)theEObject;
        T result = caseUABitAndExpression(uaBitAndExpression);
        if (result == null) result = caseUAExpression(uaBitAndExpression);
        if (result == null) result = caseTop(uaBitAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_EQUAL_EXPRESSION:
      {
        UAEqualExpression uaEqualExpression = (UAEqualExpression)theEObject;
        T result = caseUAEqualExpression(uaEqualExpression);
        if (result == null) result = caseUAExpression(uaEqualExpression);
        if (result == null) result = caseTop(uaEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_UNEQUAL_EXPRESSION:
      {
        UAUnequalExpression uaUnequalExpression = (UAUnequalExpression)theEObject;
        T result = caseUAUnequalExpression(uaUnequalExpression);
        if (result == null) result = caseUAExpression(uaUnequalExpression);
        if (result == null) result = caseTop(uaUnequalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_LESS_EXPRESSION:
      {
        UALessExpression uaLessExpression = (UALessExpression)theEObject;
        T result = caseUALessExpression(uaLessExpression);
        if (result == null) result = caseUAExpression(uaLessExpression);
        if (result == null) result = caseTop(uaLessExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_LESS_EQUAL_EXPRESSION:
      {
        UALessEqualExpression uaLessEqualExpression = (UALessEqualExpression)theEObject;
        T result = caseUALessEqualExpression(uaLessEqualExpression);
        if (result == null) result = caseUAExpression(uaLessEqualExpression);
        if (result == null) result = caseTop(uaLessEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_GREATER_EQUAL_EXPRESSION:
      {
        UAGreaterEqualExpression uaGreaterEqualExpression = (UAGreaterEqualExpression)theEObject;
        T result = caseUAGreaterEqualExpression(uaGreaterEqualExpression);
        if (result == null) result = caseUAExpression(uaGreaterEqualExpression);
        if (result == null) result = caseTop(uaGreaterEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_GREATER_EXPRESSION:
      {
        UAGreaterExpression uaGreaterExpression = (UAGreaterExpression)theEObject;
        T result = caseUAGreaterExpression(uaGreaterExpression);
        if (result == null) result = caseUAExpression(uaGreaterExpression);
        if (result == null) result = caseTop(uaGreaterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MIN_EXPRESSION:
      {
        UAMinExpression uaMinExpression = (UAMinExpression)theEObject;
        T result = caseUAMinExpression(uaMinExpression);
        if (result == null) result = caseUAExpression(uaMinExpression);
        if (result == null) result = caseTop(uaMinExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MAX_EXPRESSION:
      {
        UAMaxExpression uaMaxExpression = (UAMaxExpression)theEObject;
        T result = caseUAMaxExpression(uaMaxExpression);
        if (result == null) result = caseUAExpression(uaMaxExpression);
        if (result == null) result = caseTop(uaMaxExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_LEFT_EXPRESSION:
      {
        UABitLeftExpression uaBitLeftExpression = (UABitLeftExpression)theEObject;
        T result = caseUABitLeftExpression(uaBitLeftExpression);
        if (result == null) result = caseUAExpression(uaBitLeftExpression);
        if (result == null) result = caseTop(uaBitLeftExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BIT_RIGHT_EXPRESSION:
      {
        UABitRightExpression uaBitRightExpression = (UABitRightExpression)theEObject;
        T result = caseUABitRightExpression(uaBitRightExpression);
        if (result == null) result = caseUAExpression(uaBitRightExpression);
        if (result == null) result = caseTop(uaBitRightExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_ADD_EXPRESSION:
      {
        UAAddExpression uaAddExpression = (UAAddExpression)theEObject;
        T result = caseUAAddExpression(uaAddExpression);
        if (result == null) result = caseUAExpression(uaAddExpression);
        if (result == null) result = caseTop(uaAddExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_SUBTRACT_EXPRESSION:
      {
        UASubtractExpression uaSubtractExpression = (UASubtractExpression)theEObject;
        T result = caseUASubtractExpression(uaSubtractExpression);
        if (result == null) result = caseUAExpression(uaSubtractExpression);
        if (result == null) result = caseTop(uaSubtractExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MULTIPLY_EXPRESSION:
      {
        UAMultiplyExpression uaMultiplyExpression = (UAMultiplyExpression)theEObject;
        T result = caseUAMultiplyExpression(uaMultiplyExpression);
        if (result == null) result = caseUAExpression(uaMultiplyExpression);
        if (result == null) result = caseTop(uaMultiplyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_DIVIDE_EXPRESSION:
      {
        UADivideExpression uaDivideExpression = (UADivideExpression)theEObject;
        T result = caseUADivideExpression(uaDivideExpression);
        if (result == null) result = caseUAExpression(uaDivideExpression);
        if (result == null) result = caseTop(uaDivideExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MODULO_EXPRESSION:
      {
        UAModuloExpression uaModuloExpression = (UAModuloExpression)theEObject;
        T result = caseUAModuloExpression(uaModuloExpression);
        if (result == null) result = caseUAExpression(uaModuloExpression);
        if (result == null) result = caseTop(uaModuloExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_PRE_INCREMENT_EXPRESSION:
      {
        UAPreIncrementExpression uaPreIncrementExpression = (UAPreIncrementExpression)theEObject;
        T result = caseUAPreIncrementExpression(uaPreIncrementExpression);
        if (result == null) result = caseUAExpression(uaPreIncrementExpression);
        if (result == null) result = caseTop(uaPreIncrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_PRE_DECREMENT_EXPRESSION:
      {
        UAPreDecrementExpression uaPreDecrementExpression = (UAPreDecrementExpression)theEObject;
        T result = caseUAPreDecrementExpression(uaPreDecrementExpression);
        if (result == null) result = caseUAExpression(uaPreDecrementExpression);
        if (result == null) result = caseTop(uaPreDecrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_LOGIC_NOT_EXPRESSION:
      {
        UALogicNotExpression uaLogicNotExpression = (UALogicNotExpression)theEObject;
        T result = caseUALogicNotExpression(uaLogicNotExpression);
        if (result == null) result = caseUAExpression(uaLogicNotExpression);
        if (result == null) result = caseTop(uaLogicNotExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_MINUS_EXPRESSION:
      {
        UAMinusExpression uaMinusExpression = (UAMinusExpression)theEObject;
        T result = caseUAMinusExpression(uaMinusExpression);
        if (result == null) result = caseUAExpression(uaMinusExpression);
        if (result == null) result = caseTop(uaMinusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_POST_INCREMENT_EXPRESSION:
      {
        UAPostIncrementExpression uaPostIncrementExpression = (UAPostIncrementExpression)theEObject;
        T result = caseUAPostIncrementExpression(uaPostIncrementExpression);
        if (result == null) result = caseUAExpression(uaPostIncrementExpression);
        if (result == null) result = caseTop(uaPostIncrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_POST_DECREMENT_EXPRESSION:
      {
        UAPostDecrementExpression uaPostDecrementExpression = (UAPostDecrementExpression)theEObject;
        T result = caseUAPostDecrementExpression(uaPostDecrementExpression);
        if (result == null) result = caseUAExpression(uaPostDecrementExpression);
        if (result == null) result = caseTop(uaPostDecrementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_STRUCT_EXPRESSION:
      {
        UAStructExpression uaStructExpression = (UAStructExpression)theEObject;
        T result = caseUAStructExpression(uaStructExpression);
        if (result == null) result = caseUAExpression(uaStructExpression);
        if (result == null) result = caseTop(uaStructExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_ARRAY_EXPRESSION:
      {
        UAArrayExpression uaArrayExpression = (UAArrayExpression)theEObject;
        T result = caseUAArrayExpression(uaArrayExpression);
        if (result == null) result = caseUAExpression(uaArrayExpression);
        if (result == null) result = caseTop(uaArrayExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_REFERENCE:
      {
        UAReference uaReference = (UAReference)theEObject;
        T result = caseUAReference(uaReference);
        if (result == null) result = caseUAExpression(uaReference);
        if (result == null) result = caseTop(uaReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_BOOLEAN_LITERAL:
      {
        UABooleanLiteral uaBooleanLiteral = (UABooleanLiteral)theEObject;
        T result = caseUABooleanLiteral(uaBooleanLiteral);
        if (result == null) result = caseUAExpression(uaBooleanLiteral);
        if (result == null) result = caseTop(uaBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DescriptionPackage.UA_NUMBER_LITERAL:
      {
        UANumberLiteral uaNumberLiteral = (UANumberLiteral)theEObject;
        T result = caseUANumberLiteral(uaNumberLiteral);
        if (result == null) result = caseUAExpression(uaNumberLiteral);
        if (result == null) result = caseTop(uaNumberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTop(Top object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA System Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA System Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASystemDefinition(UASystemDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUADefinition(UADefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAInstantiation(UAInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASystem(UASystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA System ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA System ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASystemID(UASystemID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Array Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Array Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAArrayDeclaration(UAArrayDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUADeclarations(UADeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUADeclaration(UADeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAType(UAType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Type Modifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Type Modifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUATypeModifiers(UATypeModifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAVariableDeclaration(UAVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Variable ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Variable ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAVariableID(UAVariableID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAInitialiser(UAInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Single Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Single Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASingleInitialiser(UASingleInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Multi Initialiser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Multi Initialiser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMultiInitialiser(UAMultiInitialiser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUATypeDeclaration(UATypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Type ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Type ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUATypeID(UATypeID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Type Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUATypeIdentifier(UATypeIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Integer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Integer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAIntegerType(UAIntegerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Clock Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Clock Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAClockType(UAClockType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Channel Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Channel Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAChannelType(UAChannelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Boolean Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABooleanType(UABooleanType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Scalar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAScalarType(UAScalarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAStructType(UAStructType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAFieldDeclaration(UAFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Field ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Field ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAFieldID(UAFieldID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAParameters(UAParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAParameter(UAParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAExpression(UAExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Select List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Select List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASelectList(UASelectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASelect(UASelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAUpdate(UAUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Synchronisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Synchronisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASynchronisation(UASynchronisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA User Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA User Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAUserType(UAUserType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Forall Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Forall Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAForallExpression(UAForallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Exists Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Exists Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAExistsExpression(UAExistsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Imply Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Imply Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAImplyExpression(UAImplyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Logic Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Logic Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUALogicOrExpression(UALogicOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Logic And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Logic And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUALogicAndExpression(UALogicAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAAssignmentExpression(UAAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Addition Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Addition Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAAdditionAssignmentExpression(UAAdditionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Subtraction Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Subtraction Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASubtractionAssignmentExpression(UASubtractionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Multiplication Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Multiplication Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMultiplicationAssignmentExpression(UAMultiplicationAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Division Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Division Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUADivisionAssignmentExpression(UADivisionAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Modulo Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Modulo Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAModuloAssignmentExpression(UAModuloAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Or Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Or Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitOrAssignmentExpression(UABitOrAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit And Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit And Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitAndAssignmentExpression(UABitAndAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit XOR Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit XOR Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitXORAssignmentExpression(UABitXORAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Left Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Left Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitLeftAssignmentExpression(UABitLeftAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Right Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Right Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitRightAssignmentExpression(UABitRightAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAConditionalExpression(UAConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitOrExpression(UABitOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit XOR Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit XOR Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitXORExpression(UABitXORExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitAndExpression(UABitAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAEqualExpression(UAEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Unequal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Unequal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAUnequalExpression(UAUnequalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Less Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Less Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUALessExpression(UALessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Less Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Less Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUALessEqualExpression(UALessEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Greater Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Greater Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAGreaterEqualExpression(UAGreaterEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Greater Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAGreaterExpression(UAGreaterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Min Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Min Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMinExpression(UAMinExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Max Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Max Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMaxExpression(UAMaxExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Left Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Left Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitLeftExpression(UABitLeftExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Bit Right Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Bit Right Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABitRightExpression(UABitRightExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Add Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Add Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAAddExpression(UAAddExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Subtract Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Subtract Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUASubtractExpression(UASubtractExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Multiply Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Multiply Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMultiplyExpression(UAMultiplyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Divide Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Divide Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUADivideExpression(UADivideExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Modulo Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Modulo Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAModuloExpression(UAModuloExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Pre Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Pre Increment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAPreIncrementExpression(UAPreIncrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Pre Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Pre Decrement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAPreDecrementExpression(UAPreDecrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Logic Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Logic Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUALogicNotExpression(UALogicNotExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Minus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAMinusExpression(UAMinusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Post Increment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Post Increment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAPostIncrementExpression(UAPostIncrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Post Decrement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Post Decrement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAPostDecrementExpression(UAPostDecrementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Struct Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Struct Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAStructExpression(UAStructExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Array Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Array Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAArrayExpression(UAArrayExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUAReference(UAReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUABooleanLiteral(UABooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UA Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UA Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUANumberLiteral(UANumberLiteral object)
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

} //DescriptionSwitch
