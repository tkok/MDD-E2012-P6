/**
 */
package org.uppaal.xml.description.description.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.uppaal.xml.description.description.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionFactoryImpl extends EFactoryImpl implements DescriptionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DescriptionFactory init()
  {
    try
    {
      DescriptionFactory theDescriptionFactory = (DescriptionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.uppaal.org/xml/description/Description"); 
      if (theDescriptionFactory != null)
      {
        return theDescriptionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DescriptionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionFactoryImpl()
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
      case DescriptionPackage.TOP: return createTop();
      case DescriptionPackage.UA_SYSTEM_DEFINITION: return createUASystemDefinition();
      case DescriptionPackage.UA_DEFINITION: return createUADefinition();
      case DescriptionPackage.UA_INSTANTIATION: return createUAInstantiation();
      case DescriptionPackage.UA_SYSTEM: return createUASystem();
      case DescriptionPackage.UA_SYSTEM_ID: return createUASystemID();
      case DescriptionPackage.UA_ARRAY_DECLARATION: return createUAArrayDeclaration();
      case DescriptionPackage.UA_DECLARATIONS: return createUADeclarations();
      case DescriptionPackage.UA_DECLARATION: return createUADeclaration();
      case DescriptionPackage.UA_TYPE: return createUAType();
      case DescriptionPackage.UA_TYPE_MODIFIERS: return createUATypeModifiers();
      case DescriptionPackage.UA_VARIABLE_DECLARATION: return createUAVariableDeclaration();
      case DescriptionPackage.UA_VARIABLE_ID: return createUAVariableID();
      case DescriptionPackage.UA_INITIALISER: return createUAInitialiser();
      case DescriptionPackage.UA_SINGLE_INITIALISER: return createUASingleInitialiser();
      case DescriptionPackage.UA_MULTI_INITIALISER: return createUAMultiInitialiser();
      case DescriptionPackage.UA_TYPE_DECLARATION: return createUATypeDeclaration();
      case DescriptionPackage.UA_TYPE_ID: return createUATypeID();
      case DescriptionPackage.UA_TYPE_IDENTIFIER: return createUATypeIdentifier();
      case DescriptionPackage.UA_INTEGER_TYPE: return createUAIntegerType();
      case DescriptionPackage.UA_CLOCK_TYPE: return createUAClockType();
      case DescriptionPackage.UA_CHANNEL_TYPE: return createUAChannelType();
      case DescriptionPackage.UA_BOOLEAN_TYPE: return createUABooleanType();
      case DescriptionPackage.UA_SCALAR_TYPE: return createUAScalarType();
      case DescriptionPackage.UA_STRUCT_TYPE: return createUAStructType();
      case DescriptionPackage.UA_FIELD_DECLARATION: return createUAFieldDeclaration();
      case DescriptionPackage.UA_FIELD_ID: return createUAFieldID();
      case DescriptionPackage.UA_PARAMETERS: return createUAParameters();
      case DescriptionPackage.UA_PARAMETER: return createUAParameter();
      case DescriptionPackage.UA_EXPRESSION: return createUAExpression();
      case DescriptionPackage.UA_SELECT_LIST: return createUASelectList();
      case DescriptionPackage.UA_SELECT: return createUASelect();
      case DescriptionPackage.UA_UPDATE: return createUAUpdate();
      case DescriptionPackage.UA_SYNCHRONISATION: return createUASynchronisation();
      case DescriptionPackage.UA_USER_TYPE: return createUAUserType();
      case DescriptionPackage.UA_FORALL_EXPRESSION: return createUAForallExpression();
      case DescriptionPackage.UA_EXISTS_EXPRESSION: return createUAExistsExpression();
      case DescriptionPackage.UA_IMPLY_EXPRESSION: return createUAImplyExpression();
      case DescriptionPackage.UA_LOGIC_OR_EXPRESSION: return createUALogicOrExpression();
      case DescriptionPackage.UA_LOGIC_AND_EXPRESSION: return createUALogicAndExpression();
      case DescriptionPackage.UA_ASSIGNMENT_EXPRESSION: return createUAAssignmentExpression();
      case DescriptionPackage.UA_ADDITION_ASSIGNMENT_EXPRESSION: return createUAAdditionAssignmentExpression();
      case DescriptionPackage.UA_SUBTRACTION_ASSIGNMENT_EXPRESSION: return createUASubtractionAssignmentExpression();
      case DescriptionPackage.UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION: return createUAMultiplicationAssignmentExpression();
      case DescriptionPackage.UA_DIVISION_ASSIGNMENT_EXPRESSION: return createUADivisionAssignmentExpression();
      case DescriptionPackage.UA_MODULO_ASSIGNMENT_EXPRESSION: return createUAModuloAssignmentExpression();
      case DescriptionPackage.UA_BIT_OR_ASSIGNMENT_EXPRESSION: return createUABitOrAssignmentExpression();
      case DescriptionPackage.UA_BIT_AND_ASSIGNMENT_EXPRESSION: return createUABitAndAssignmentExpression();
      case DescriptionPackage.UA_BIT_XOR_ASSIGNMENT_EXPRESSION: return createUABitXORAssignmentExpression();
      case DescriptionPackage.UA_BIT_LEFT_ASSIGNMENT_EXPRESSION: return createUABitLeftAssignmentExpression();
      case DescriptionPackage.UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION: return createUABitRightAssignmentExpression();
      case DescriptionPackage.UA_CONDITIONAL_EXPRESSION: return createUAConditionalExpression();
      case DescriptionPackage.UA_BIT_OR_EXPRESSION: return createUABitOrExpression();
      case DescriptionPackage.UA_BIT_XOR_EXPRESSION: return createUABitXORExpression();
      case DescriptionPackage.UA_BIT_AND_EXPRESSION: return createUABitAndExpression();
      case DescriptionPackage.UA_EQUAL_EXPRESSION: return createUAEqualExpression();
      case DescriptionPackage.UA_UNEQUAL_EXPRESSION: return createUAUnequalExpression();
      case DescriptionPackage.UA_LESS_EXPRESSION: return createUALessExpression();
      case DescriptionPackage.UA_LESS_EQUAL_EXPRESSION: return createUALessEqualExpression();
      case DescriptionPackage.UA_GREATER_EQUAL_EXPRESSION: return createUAGreaterEqualExpression();
      case DescriptionPackage.UA_GREATER_EXPRESSION: return createUAGreaterExpression();
      case DescriptionPackage.UA_MIN_EXPRESSION: return createUAMinExpression();
      case DescriptionPackage.UA_MAX_EXPRESSION: return createUAMaxExpression();
      case DescriptionPackage.UA_BIT_LEFT_EXPRESSION: return createUABitLeftExpression();
      case DescriptionPackage.UA_BIT_RIGHT_EXPRESSION: return createUABitRightExpression();
      case DescriptionPackage.UA_ADD_EXPRESSION: return createUAAddExpression();
      case DescriptionPackage.UA_SUBTRACT_EXPRESSION: return createUASubtractExpression();
      case DescriptionPackage.UA_MULTIPLY_EXPRESSION: return createUAMultiplyExpression();
      case DescriptionPackage.UA_DIVIDE_EXPRESSION: return createUADivideExpression();
      case DescriptionPackage.UA_MODULO_EXPRESSION: return createUAModuloExpression();
      case DescriptionPackage.UA_PRE_INCREMENT_EXPRESSION: return createUAPreIncrementExpression();
      case DescriptionPackage.UA_PRE_DECREMENT_EXPRESSION: return createUAPreDecrementExpression();
      case DescriptionPackage.UA_LOGIC_NOT_EXPRESSION: return createUALogicNotExpression();
      case DescriptionPackage.UA_MINUS_EXPRESSION: return createUAMinusExpression();
      case DescriptionPackage.UA_POST_INCREMENT_EXPRESSION: return createUAPostIncrementExpression();
      case DescriptionPackage.UA_POST_DECREMENT_EXPRESSION: return createUAPostDecrementExpression();
      case DescriptionPackage.UA_STRUCT_EXPRESSION: return createUAStructExpression();
      case DescriptionPackage.UA_ARRAY_EXPRESSION: return createUAArrayExpression();
      case DescriptionPackage.UA_REFERENCE: return createUAReference();
      case DescriptionPackage.UA_BOOLEAN_LITERAL: return createUABooleanLiteral();
      case DescriptionPackage.UA_NUMBER_LITERAL: return createUANumberLiteral();
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
      case DescriptionPackage.UA_SYNCHRONISATION_TYPE:
        return createUASynchronisationTypeFromString(eDataType, initialValue);
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
      case DescriptionPackage.UA_SYNCHRONISATION_TYPE:
        return convertUASynchronisationTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Top createTop()
  {
    TopImpl top = new TopImpl();
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASystemDefinition createUASystemDefinition()
  {
    UASystemDefinitionImpl uaSystemDefinition = new UASystemDefinitionImpl();
    return uaSystemDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UADefinition createUADefinition()
  {
    UADefinitionImpl uaDefinition = new UADefinitionImpl();
    return uaDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAInstantiation createUAInstantiation()
  {
    UAInstantiationImpl uaInstantiation = new UAInstantiationImpl();
    return uaInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASystem createUASystem()
  {
    UASystemImpl uaSystem = new UASystemImpl();
    return uaSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASystemID createUASystemID()
  {
    UASystemIDImpl uaSystemID = new UASystemIDImpl();
    return uaSystemID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAArrayDeclaration createUAArrayDeclaration()
  {
    UAArrayDeclarationImpl uaArrayDeclaration = new UAArrayDeclarationImpl();
    return uaArrayDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UADeclarations createUADeclarations()
  {
    UADeclarationsImpl uaDeclarations = new UADeclarationsImpl();
    return uaDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UADeclaration createUADeclaration()
  {
    UADeclarationImpl uaDeclaration = new UADeclarationImpl();
    return uaDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAType createUAType()
  {
    UATypeImpl uaType = new UATypeImpl();
    return uaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UATypeModifiers createUATypeModifiers()
  {
    UATypeModifiersImpl uaTypeModifiers = new UATypeModifiersImpl();
    return uaTypeModifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAVariableDeclaration createUAVariableDeclaration()
  {
    UAVariableDeclarationImpl uaVariableDeclaration = new UAVariableDeclarationImpl();
    return uaVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAVariableID createUAVariableID()
  {
    UAVariableIDImpl uaVariableID = new UAVariableIDImpl();
    return uaVariableID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAInitialiser createUAInitialiser()
  {
    UAInitialiserImpl uaInitialiser = new UAInitialiserImpl();
    return uaInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASingleInitialiser createUASingleInitialiser()
  {
    UASingleInitialiserImpl uaSingleInitialiser = new UASingleInitialiserImpl();
    return uaSingleInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMultiInitialiser createUAMultiInitialiser()
  {
    UAMultiInitialiserImpl uaMultiInitialiser = new UAMultiInitialiserImpl();
    return uaMultiInitialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UATypeDeclaration createUATypeDeclaration()
  {
    UATypeDeclarationImpl uaTypeDeclaration = new UATypeDeclarationImpl();
    return uaTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UATypeID createUATypeID()
  {
    UATypeIDImpl uaTypeID = new UATypeIDImpl();
    return uaTypeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UATypeIdentifier createUATypeIdentifier()
  {
    UATypeIdentifierImpl uaTypeIdentifier = new UATypeIdentifierImpl();
    return uaTypeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAIntegerType createUAIntegerType()
  {
    UAIntegerTypeImpl uaIntegerType = new UAIntegerTypeImpl();
    return uaIntegerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAClockType createUAClockType()
  {
    UAClockTypeImpl uaClockType = new UAClockTypeImpl();
    return uaClockType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAChannelType createUAChannelType()
  {
    UAChannelTypeImpl uaChannelType = new UAChannelTypeImpl();
    return uaChannelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABooleanType createUABooleanType()
  {
    UABooleanTypeImpl uaBooleanType = new UABooleanTypeImpl();
    return uaBooleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAScalarType createUAScalarType()
  {
    UAScalarTypeImpl uaScalarType = new UAScalarTypeImpl();
    return uaScalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAStructType createUAStructType()
  {
    UAStructTypeImpl uaStructType = new UAStructTypeImpl();
    return uaStructType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAFieldDeclaration createUAFieldDeclaration()
  {
    UAFieldDeclarationImpl uaFieldDeclaration = new UAFieldDeclarationImpl();
    return uaFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAFieldID createUAFieldID()
  {
    UAFieldIDImpl uaFieldID = new UAFieldIDImpl();
    return uaFieldID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAParameters createUAParameters()
  {
    UAParametersImpl uaParameters = new UAParametersImpl();
    return uaParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAParameter createUAParameter()
  {
    UAParameterImpl uaParameter = new UAParameterImpl();
    return uaParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAExpression createUAExpression()
  {
    UAExpressionImpl uaExpression = new UAExpressionImpl();
    return uaExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASelectList createUASelectList()
  {
    UASelectListImpl uaSelectList = new UASelectListImpl();
    return uaSelectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASelect createUASelect()
  {
    UASelectImpl uaSelect = new UASelectImpl();
    return uaSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAUpdate createUAUpdate()
  {
    UAUpdateImpl uaUpdate = new UAUpdateImpl();
    return uaUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASynchronisation createUASynchronisation()
  {
    UASynchronisationImpl uaSynchronisation = new UASynchronisationImpl();
    return uaSynchronisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAUserType createUAUserType()
  {
    UAUserTypeImpl uaUserType = new UAUserTypeImpl();
    return uaUserType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAForallExpression createUAForallExpression()
  {
    UAForallExpressionImpl uaForallExpression = new UAForallExpressionImpl();
    return uaForallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAExistsExpression createUAExistsExpression()
  {
    UAExistsExpressionImpl uaExistsExpression = new UAExistsExpressionImpl();
    return uaExistsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAImplyExpression createUAImplyExpression()
  {
    UAImplyExpressionImpl uaImplyExpression = new UAImplyExpressionImpl();
    return uaImplyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UALogicOrExpression createUALogicOrExpression()
  {
    UALogicOrExpressionImpl uaLogicOrExpression = new UALogicOrExpressionImpl();
    return uaLogicOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UALogicAndExpression createUALogicAndExpression()
  {
    UALogicAndExpressionImpl uaLogicAndExpression = new UALogicAndExpressionImpl();
    return uaLogicAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAAssignmentExpression createUAAssignmentExpression()
  {
    UAAssignmentExpressionImpl uaAssignmentExpression = new UAAssignmentExpressionImpl();
    return uaAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAAdditionAssignmentExpression createUAAdditionAssignmentExpression()
  {
    UAAdditionAssignmentExpressionImpl uaAdditionAssignmentExpression = new UAAdditionAssignmentExpressionImpl();
    return uaAdditionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASubtractionAssignmentExpression createUASubtractionAssignmentExpression()
  {
    UASubtractionAssignmentExpressionImpl uaSubtractionAssignmentExpression = new UASubtractionAssignmentExpressionImpl();
    return uaSubtractionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMultiplicationAssignmentExpression createUAMultiplicationAssignmentExpression()
  {
    UAMultiplicationAssignmentExpressionImpl uaMultiplicationAssignmentExpression = new UAMultiplicationAssignmentExpressionImpl();
    return uaMultiplicationAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UADivisionAssignmentExpression createUADivisionAssignmentExpression()
  {
    UADivisionAssignmentExpressionImpl uaDivisionAssignmentExpression = new UADivisionAssignmentExpressionImpl();
    return uaDivisionAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAModuloAssignmentExpression createUAModuloAssignmentExpression()
  {
    UAModuloAssignmentExpressionImpl uaModuloAssignmentExpression = new UAModuloAssignmentExpressionImpl();
    return uaModuloAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitOrAssignmentExpression createUABitOrAssignmentExpression()
  {
    UABitOrAssignmentExpressionImpl uaBitOrAssignmentExpression = new UABitOrAssignmentExpressionImpl();
    return uaBitOrAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitAndAssignmentExpression createUABitAndAssignmentExpression()
  {
    UABitAndAssignmentExpressionImpl uaBitAndAssignmentExpression = new UABitAndAssignmentExpressionImpl();
    return uaBitAndAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitXORAssignmentExpression createUABitXORAssignmentExpression()
  {
    UABitXORAssignmentExpressionImpl uaBitXORAssignmentExpression = new UABitXORAssignmentExpressionImpl();
    return uaBitXORAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitLeftAssignmentExpression createUABitLeftAssignmentExpression()
  {
    UABitLeftAssignmentExpressionImpl uaBitLeftAssignmentExpression = new UABitLeftAssignmentExpressionImpl();
    return uaBitLeftAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitRightAssignmentExpression createUABitRightAssignmentExpression()
  {
    UABitRightAssignmentExpressionImpl uaBitRightAssignmentExpression = new UABitRightAssignmentExpressionImpl();
    return uaBitRightAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAConditionalExpression createUAConditionalExpression()
  {
    UAConditionalExpressionImpl uaConditionalExpression = new UAConditionalExpressionImpl();
    return uaConditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitOrExpression createUABitOrExpression()
  {
    UABitOrExpressionImpl uaBitOrExpression = new UABitOrExpressionImpl();
    return uaBitOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitXORExpression createUABitXORExpression()
  {
    UABitXORExpressionImpl uaBitXORExpression = new UABitXORExpressionImpl();
    return uaBitXORExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitAndExpression createUABitAndExpression()
  {
    UABitAndExpressionImpl uaBitAndExpression = new UABitAndExpressionImpl();
    return uaBitAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAEqualExpression createUAEqualExpression()
  {
    UAEqualExpressionImpl uaEqualExpression = new UAEqualExpressionImpl();
    return uaEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAUnequalExpression createUAUnequalExpression()
  {
    UAUnequalExpressionImpl uaUnequalExpression = new UAUnequalExpressionImpl();
    return uaUnequalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UALessExpression createUALessExpression()
  {
    UALessExpressionImpl uaLessExpression = new UALessExpressionImpl();
    return uaLessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UALessEqualExpression createUALessEqualExpression()
  {
    UALessEqualExpressionImpl uaLessEqualExpression = new UALessEqualExpressionImpl();
    return uaLessEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAGreaterEqualExpression createUAGreaterEqualExpression()
  {
    UAGreaterEqualExpressionImpl uaGreaterEqualExpression = new UAGreaterEqualExpressionImpl();
    return uaGreaterEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAGreaterExpression createUAGreaterExpression()
  {
    UAGreaterExpressionImpl uaGreaterExpression = new UAGreaterExpressionImpl();
    return uaGreaterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMinExpression createUAMinExpression()
  {
    UAMinExpressionImpl uaMinExpression = new UAMinExpressionImpl();
    return uaMinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMaxExpression createUAMaxExpression()
  {
    UAMaxExpressionImpl uaMaxExpression = new UAMaxExpressionImpl();
    return uaMaxExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitLeftExpression createUABitLeftExpression()
  {
    UABitLeftExpressionImpl uaBitLeftExpression = new UABitLeftExpressionImpl();
    return uaBitLeftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABitRightExpression createUABitRightExpression()
  {
    UABitRightExpressionImpl uaBitRightExpression = new UABitRightExpressionImpl();
    return uaBitRightExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAAddExpression createUAAddExpression()
  {
    UAAddExpressionImpl uaAddExpression = new UAAddExpressionImpl();
    return uaAddExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASubtractExpression createUASubtractExpression()
  {
    UASubtractExpressionImpl uaSubtractExpression = new UASubtractExpressionImpl();
    return uaSubtractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMultiplyExpression createUAMultiplyExpression()
  {
    UAMultiplyExpressionImpl uaMultiplyExpression = new UAMultiplyExpressionImpl();
    return uaMultiplyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UADivideExpression createUADivideExpression()
  {
    UADivideExpressionImpl uaDivideExpression = new UADivideExpressionImpl();
    return uaDivideExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAModuloExpression createUAModuloExpression()
  {
    UAModuloExpressionImpl uaModuloExpression = new UAModuloExpressionImpl();
    return uaModuloExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAPreIncrementExpression createUAPreIncrementExpression()
  {
    UAPreIncrementExpressionImpl uaPreIncrementExpression = new UAPreIncrementExpressionImpl();
    return uaPreIncrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAPreDecrementExpression createUAPreDecrementExpression()
  {
    UAPreDecrementExpressionImpl uaPreDecrementExpression = new UAPreDecrementExpressionImpl();
    return uaPreDecrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UALogicNotExpression createUALogicNotExpression()
  {
    UALogicNotExpressionImpl uaLogicNotExpression = new UALogicNotExpressionImpl();
    return uaLogicNotExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAMinusExpression createUAMinusExpression()
  {
    UAMinusExpressionImpl uaMinusExpression = new UAMinusExpressionImpl();
    return uaMinusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAPostIncrementExpression createUAPostIncrementExpression()
  {
    UAPostIncrementExpressionImpl uaPostIncrementExpression = new UAPostIncrementExpressionImpl();
    return uaPostIncrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAPostDecrementExpression createUAPostDecrementExpression()
  {
    UAPostDecrementExpressionImpl uaPostDecrementExpression = new UAPostDecrementExpressionImpl();
    return uaPostDecrementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAStructExpression createUAStructExpression()
  {
    UAStructExpressionImpl uaStructExpression = new UAStructExpressionImpl();
    return uaStructExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAArrayExpression createUAArrayExpression()
  {
    UAArrayExpressionImpl uaArrayExpression = new UAArrayExpressionImpl();
    return uaArrayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAReference createUAReference()
  {
    UAReferenceImpl uaReference = new UAReferenceImpl();
    return uaReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UABooleanLiteral createUABooleanLiteral()
  {
    UABooleanLiteralImpl uaBooleanLiteral = new UABooleanLiteralImpl();
    return uaBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UANumberLiteral createUANumberLiteral()
  {
    UANumberLiteralImpl uaNumberLiteral = new UANumberLiteralImpl();
    return uaNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UASynchronisationType createUASynchronisationTypeFromString(EDataType eDataType, String initialValue)
  {
    UASynchronisationType result = UASynchronisationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUASynchronisationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionPackage getDescriptionPackage()
  {
    return (DescriptionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DescriptionPackage getPackage()
  {
    return DescriptionPackage.eINSTANCE;
  }

} //DescriptionFactoryImpl
