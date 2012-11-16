/**
 */
package org.uppaal.xml.description.description.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.uppaal.xml.description.description.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.uppaal.xml.description.description.DescriptionPackage
 * @generated
 */
public class DescriptionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DescriptionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DescriptionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionSwitch<Adapter> modelSwitch =
    new DescriptionSwitch<Adapter>()
    {
      @Override
      public Adapter caseTop(Top object)
      {
        return createTopAdapter();
      }
      @Override
      public Adapter caseUASystemDefinition(UASystemDefinition object)
      {
        return createUASystemDefinitionAdapter();
      }
      @Override
      public Adapter caseUADefinition(UADefinition object)
      {
        return createUADefinitionAdapter();
      }
      @Override
      public Adapter caseUAInstantiation(UAInstantiation object)
      {
        return createUAInstantiationAdapter();
      }
      @Override
      public Adapter caseUASystem(UASystem object)
      {
        return createUASystemAdapter();
      }
      @Override
      public Adapter caseUASystemID(UASystemID object)
      {
        return createUASystemIDAdapter();
      }
      @Override
      public Adapter caseUAArrayDeclaration(UAArrayDeclaration object)
      {
        return createUAArrayDeclarationAdapter();
      }
      @Override
      public Adapter caseUADeclarations(UADeclarations object)
      {
        return createUADeclarationsAdapter();
      }
      @Override
      public Adapter caseUADeclaration(UADeclaration object)
      {
        return createUADeclarationAdapter();
      }
      @Override
      public Adapter caseUAType(UAType object)
      {
        return createUATypeAdapter();
      }
      @Override
      public Adapter caseUATypeModifiers(UATypeModifiers object)
      {
        return createUATypeModifiersAdapter();
      }
      @Override
      public Adapter caseUAVariableDeclaration(UAVariableDeclaration object)
      {
        return createUAVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseUAVariableID(UAVariableID object)
      {
        return createUAVariableIDAdapter();
      }
      @Override
      public Adapter caseUAInitialiser(UAInitialiser object)
      {
        return createUAInitialiserAdapter();
      }
      @Override
      public Adapter caseUASingleInitialiser(UASingleInitialiser object)
      {
        return createUASingleInitialiserAdapter();
      }
      @Override
      public Adapter caseUAMultiInitialiser(UAMultiInitialiser object)
      {
        return createUAMultiInitialiserAdapter();
      }
      @Override
      public Adapter caseUATypeDeclaration(UATypeDeclaration object)
      {
        return createUATypeDeclarationAdapter();
      }
      @Override
      public Adapter caseUATypeID(UATypeID object)
      {
        return createUATypeIDAdapter();
      }
      @Override
      public Adapter caseUATypeIdentifier(UATypeIdentifier object)
      {
        return createUATypeIdentifierAdapter();
      }
      @Override
      public Adapter caseUAIntegerType(UAIntegerType object)
      {
        return createUAIntegerTypeAdapter();
      }
      @Override
      public Adapter caseUAClockType(UAClockType object)
      {
        return createUAClockTypeAdapter();
      }
      @Override
      public Adapter caseUAChannelType(UAChannelType object)
      {
        return createUAChannelTypeAdapter();
      }
      @Override
      public Adapter caseUABooleanType(UABooleanType object)
      {
        return createUABooleanTypeAdapter();
      }
      @Override
      public Adapter caseUAScalarType(UAScalarType object)
      {
        return createUAScalarTypeAdapter();
      }
      @Override
      public Adapter caseUAStructType(UAStructType object)
      {
        return createUAStructTypeAdapter();
      }
      @Override
      public Adapter caseUAFieldDeclaration(UAFieldDeclaration object)
      {
        return createUAFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseUAFieldID(UAFieldID object)
      {
        return createUAFieldIDAdapter();
      }
      @Override
      public Adapter caseUAParameters(UAParameters object)
      {
        return createUAParametersAdapter();
      }
      @Override
      public Adapter caseUAParameter(UAParameter object)
      {
        return createUAParameterAdapter();
      }
      @Override
      public Adapter caseUAExpression(UAExpression object)
      {
        return createUAExpressionAdapter();
      }
      @Override
      public Adapter caseUASelectList(UASelectList object)
      {
        return createUASelectListAdapter();
      }
      @Override
      public Adapter caseUASelect(UASelect object)
      {
        return createUASelectAdapter();
      }
      @Override
      public Adapter caseUAUpdate(UAUpdate object)
      {
        return createUAUpdateAdapter();
      }
      @Override
      public Adapter caseUASynchronisation(UASynchronisation object)
      {
        return createUASynchronisationAdapter();
      }
      @Override
      public Adapter caseUAUserType(UAUserType object)
      {
        return createUAUserTypeAdapter();
      }
      @Override
      public Adapter caseUAForallExpression(UAForallExpression object)
      {
        return createUAForallExpressionAdapter();
      }
      @Override
      public Adapter caseUAExistsExpression(UAExistsExpression object)
      {
        return createUAExistsExpressionAdapter();
      }
      @Override
      public Adapter caseUAImplyExpression(UAImplyExpression object)
      {
        return createUAImplyExpressionAdapter();
      }
      @Override
      public Adapter caseUALogicOrExpression(UALogicOrExpression object)
      {
        return createUALogicOrExpressionAdapter();
      }
      @Override
      public Adapter caseUALogicAndExpression(UALogicAndExpression object)
      {
        return createUALogicAndExpressionAdapter();
      }
      @Override
      public Adapter caseUAAssignmentExpression(UAAssignmentExpression object)
      {
        return createUAAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUAAdditionAssignmentExpression(UAAdditionAssignmentExpression object)
      {
        return createUAAdditionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUASubtractionAssignmentExpression(UASubtractionAssignmentExpression object)
      {
        return createUASubtractionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUAMultiplicationAssignmentExpression(UAMultiplicationAssignmentExpression object)
      {
        return createUAMultiplicationAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUADivisionAssignmentExpression(UADivisionAssignmentExpression object)
      {
        return createUADivisionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUAModuloAssignmentExpression(UAModuloAssignmentExpression object)
      {
        return createUAModuloAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUABitOrAssignmentExpression(UABitOrAssignmentExpression object)
      {
        return createUABitOrAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUABitAndAssignmentExpression(UABitAndAssignmentExpression object)
      {
        return createUABitAndAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUABitXORAssignmentExpression(UABitXORAssignmentExpression object)
      {
        return createUABitXORAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUABitLeftAssignmentExpression(UABitLeftAssignmentExpression object)
      {
        return createUABitLeftAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUABitRightAssignmentExpression(UABitRightAssignmentExpression object)
      {
        return createUABitRightAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseUAConditionalExpression(UAConditionalExpression object)
      {
        return createUAConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseUABitOrExpression(UABitOrExpression object)
      {
        return createUABitOrExpressionAdapter();
      }
      @Override
      public Adapter caseUABitXORExpression(UABitXORExpression object)
      {
        return createUABitXORExpressionAdapter();
      }
      @Override
      public Adapter caseUABitAndExpression(UABitAndExpression object)
      {
        return createUABitAndExpressionAdapter();
      }
      @Override
      public Adapter caseUAEqualExpression(UAEqualExpression object)
      {
        return createUAEqualExpressionAdapter();
      }
      @Override
      public Adapter caseUAUnequalExpression(UAUnequalExpression object)
      {
        return createUAUnequalExpressionAdapter();
      }
      @Override
      public Adapter caseUALessExpression(UALessExpression object)
      {
        return createUALessExpressionAdapter();
      }
      @Override
      public Adapter caseUALessEqualExpression(UALessEqualExpression object)
      {
        return createUALessEqualExpressionAdapter();
      }
      @Override
      public Adapter caseUAGreaterEqualExpression(UAGreaterEqualExpression object)
      {
        return createUAGreaterEqualExpressionAdapter();
      }
      @Override
      public Adapter caseUAGreaterExpression(UAGreaterExpression object)
      {
        return createUAGreaterExpressionAdapter();
      }
      @Override
      public Adapter caseUAMinExpression(UAMinExpression object)
      {
        return createUAMinExpressionAdapter();
      }
      @Override
      public Adapter caseUAMaxExpression(UAMaxExpression object)
      {
        return createUAMaxExpressionAdapter();
      }
      @Override
      public Adapter caseUABitLeftExpression(UABitLeftExpression object)
      {
        return createUABitLeftExpressionAdapter();
      }
      @Override
      public Adapter caseUABitRightExpression(UABitRightExpression object)
      {
        return createUABitRightExpressionAdapter();
      }
      @Override
      public Adapter caseUAAddExpression(UAAddExpression object)
      {
        return createUAAddExpressionAdapter();
      }
      @Override
      public Adapter caseUASubtractExpression(UASubtractExpression object)
      {
        return createUASubtractExpressionAdapter();
      }
      @Override
      public Adapter caseUAMultiplyExpression(UAMultiplyExpression object)
      {
        return createUAMultiplyExpressionAdapter();
      }
      @Override
      public Adapter caseUADivideExpression(UADivideExpression object)
      {
        return createUADivideExpressionAdapter();
      }
      @Override
      public Adapter caseUAModuloExpression(UAModuloExpression object)
      {
        return createUAModuloExpressionAdapter();
      }
      @Override
      public Adapter caseUAPreIncrementExpression(UAPreIncrementExpression object)
      {
        return createUAPreIncrementExpressionAdapter();
      }
      @Override
      public Adapter caseUAPreDecrementExpression(UAPreDecrementExpression object)
      {
        return createUAPreDecrementExpressionAdapter();
      }
      @Override
      public Adapter caseUALogicNotExpression(UALogicNotExpression object)
      {
        return createUALogicNotExpressionAdapter();
      }
      @Override
      public Adapter caseUAMinusExpression(UAMinusExpression object)
      {
        return createUAMinusExpressionAdapter();
      }
      @Override
      public Adapter caseUAPostIncrementExpression(UAPostIncrementExpression object)
      {
        return createUAPostIncrementExpressionAdapter();
      }
      @Override
      public Adapter caseUAPostDecrementExpression(UAPostDecrementExpression object)
      {
        return createUAPostDecrementExpressionAdapter();
      }
      @Override
      public Adapter caseUAStructExpression(UAStructExpression object)
      {
        return createUAStructExpressionAdapter();
      }
      @Override
      public Adapter caseUAArrayExpression(UAArrayExpression object)
      {
        return createUAArrayExpressionAdapter();
      }
      @Override
      public Adapter caseUAReference(UAReference object)
      {
        return createUAReferenceAdapter();
      }
      @Override
      public Adapter caseUABooleanLiteral(UABooleanLiteral object)
      {
        return createUABooleanLiteralAdapter();
      }
      @Override
      public Adapter caseUANumberLiteral(UANumberLiteral object)
      {
        return createUANumberLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.Top <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.Top
   * @generated
   */
  public Adapter createTopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASystemDefinition <em>UA System Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASystemDefinition
   * @generated
   */
  public Adapter createUASystemDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UADefinition <em>UA Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UADefinition
   * @generated
   */
  public Adapter createUADefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAInstantiation <em>UA Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAInstantiation
   * @generated
   */
  public Adapter createUAInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASystem <em>UA System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASystem
   * @generated
   */
  public Adapter createUASystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASystemID <em>UA System ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASystemID
   * @generated
   */
  public Adapter createUASystemIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAArrayDeclaration <em>UA Array Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAArrayDeclaration
   * @generated
   */
  public Adapter createUAArrayDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UADeclarations <em>UA Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UADeclarations
   * @generated
   */
  public Adapter createUADeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UADeclaration <em>UA Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UADeclaration
   * @generated
   */
  public Adapter createUADeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAType <em>UA Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAType
   * @generated
   */
  public Adapter createUATypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UATypeModifiers <em>UA Type Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UATypeModifiers
   * @generated
   */
  public Adapter createUATypeModifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAVariableDeclaration <em>UA Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAVariableDeclaration
   * @generated
   */
  public Adapter createUAVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAVariableID <em>UA Variable ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAVariableID
   * @generated
   */
  public Adapter createUAVariableIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAInitialiser <em>UA Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAInitialiser
   * @generated
   */
  public Adapter createUAInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASingleInitialiser <em>UA Single Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASingleInitialiser
   * @generated
   */
  public Adapter createUASingleInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMultiInitialiser <em>UA Multi Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMultiInitialiser
   * @generated
   */
  public Adapter createUAMultiInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UATypeDeclaration <em>UA Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UATypeDeclaration
   * @generated
   */
  public Adapter createUATypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UATypeID <em>UA Type ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UATypeID
   * @generated
   */
  public Adapter createUATypeIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UATypeIdentifier <em>UA Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UATypeIdentifier
   * @generated
   */
  public Adapter createUATypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAIntegerType <em>UA Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAIntegerType
   * @generated
   */
  public Adapter createUAIntegerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAClockType <em>UA Clock Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAClockType
   * @generated
   */
  public Adapter createUAClockTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAChannelType <em>UA Channel Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAChannelType
   * @generated
   */
  public Adapter createUAChannelTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABooleanType <em>UA Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABooleanType
   * @generated
   */
  public Adapter createUABooleanTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAScalarType <em>UA Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAScalarType
   * @generated
   */
  public Adapter createUAScalarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAStructType <em>UA Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAStructType
   * @generated
   */
  public Adapter createUAStructTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAFieldDeclaration <em>UA Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAFieldDeclaration
   * @generated
   */
  public Adapter createUAFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAFieldID <em>UA Field ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAFieldID
   * @generated
   */
  public Adapter createUAFieldIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAParameters <em>UA Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAParameters
   * @generated
   */
  public Adapter createUAParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAParameter <em>UA Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAParameter
   * @generated
   */
  public Adapter createUAParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAExpression <em>UA Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAExpression
   * @generated
   */
  public Adapter createUAExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASelectList <em>UA Select List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASelectList
   * @generated
   */
  public Adapter createUASelectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASelect <em>UA Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASelect
   * @generated
   */
  public Adapter createUASelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAUpdate <em>UA Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAUpdate
   * @generated
   */
  public Adapter createUAUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASynchronisation <em>UA Synchronisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASynchronisation
   * @generated
   */
  public Adapter createUASynchronisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAUserType <em>UA User Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAUserType
   * @generated
   */
  public Adapter createUAUserTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAForallExpression <em>UA Forall Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAForallExpression
   * @generated
   */
  public Adapter createUAForallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAExistsExpression <em>UA Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAExistsExpression
   * @generated
   */
  public Adapter createUAExistsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAImplyExpression <em>UA Imply Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAImplyExpression
   * @generated
   */
  public Adapter createUAImplyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UALogicOrExpression <em>UA Logic Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UALogicOrExpression
   * @generated
   */
  public Adapter createUALogicOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UALogicAndExpression <em>UA Logic And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UALogicAndExpression
   * @generated
   */
  public Adapter createUALogicAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAAssignmentExpression <em>UA Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAAssignmentExpression
   * @generated
   */
  public Adapter createUAAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAAdditionAssignmentExpression <em>UA Addition Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAAdditionAssignmentExpression
   * @generated
   */
  public Adapter createUAAdditionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASubtractionAssignmentExpression <em>UA Subtraction Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASubtractionAssignmentExpression
   * @generated
   */
  public Adapter createUASubtractionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression <em>UA Multiplication Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression
   * @generated
   */
  public Adapter createUAMultiplicationAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UADivisionAssignmentExpression <em>UA Division Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UADivisionAssignmentExpression
   * @generated
   */
  public Adapter createUADivisionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAModuloAssignmentExpression <em>UA Modulo Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAModuloAssignmentExpression
   * @generated
   */
  public Adapter createUAModuloAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitOrAssignmentExpression <em>UA Bit Or Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitOrAssignmentExpression
   * @generated
   */
  public Adapter createUABitOrAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitAndAssignmentExpression <em>UA Bit And Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitAndAssignmentExpression
   * @generated
   */
  public Adapter createUABitAndAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitXORAssignmentExpression <em>UA Bit XOR Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitXORAssignmentExpression
   * @generated
   */
  public Adapter createUABitXORAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitLeftAssignmentExpression <em>UA Bit Left Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitLeftAssignmentExpression
   * @generated
   */
  public Adapter createUABitLeftAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitRightAssignmentExpression <em>UA Bit Right Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitRightAssignmentExpression
   * @generated
   */
  public Adapter createUABitRightAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAConditionalExpression <em>UA Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAConditionalExpression
   * @generated
   */
  public Adapter createUAConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitOrExpression <em>UA Bit Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitOrExpression
   * @generated
   */
  public Adapter createUABitOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitXORExpression <em>UA Bit XOR Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitXORExpression
   * @generated
   */
  public Adapter createUABitXORExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitAndExpression <em>UA Bit And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitAndExpression
   * @generated
   */
  public Adapter createUABitAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAEqualExpression <em>UA Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAEqualExpression
   * @generated
   */
  public Adapter createUAEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAUnequalExpression <em>UA Unequal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAUnequalExpression
   * @generated
   */
  public Adapter createUAUnequalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UALessExpression <em>UA Less Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UALessExpression
   * @generated
   */
  public Adapter createUALessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UALessEqualExpression <em>UA Less Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UALessEqualExpression
   * @generated
   */
  public Adapter createUALessEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAGreaterEqualExpression <em>UA Greater Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAGreaterEqualExpression
   * @generated
   */
  public Adapter createUAGreaterEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAGreaterExpression <em>UA Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAGreaterExpression
   * @generated
   */
  public Adapter createUAGreaterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMinExpression <em>UA Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMinExpression
   * @generated
   */
  public Adapter createUAMinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMaxExpression <em>UA Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMaxExpression
   * @generated
   */
  public Adapter createUAMaxExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitLeftExpression <em>UA Bit Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitLeftExpression
   * @generated
   */
  public Adapter createUABitLeftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABitRightExpression <em>UA Bit Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABitRightExpression
   * @generated
   */
  public Adapter createUABitRightExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAAddExpression <em>UA Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAAddExpression
   * @generated
   */
  public Adapter createUAAddExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UASubtractExpression <em>UA Subtract Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UASubtractExpression
   * @generated
   */
  public Adapter createUASubtractExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMultiplyExpression <em>UA Multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMultiplyExpression
   * @generated
   */
  public Adapter createUAMultiplyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UADivideExpression <em>UA Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UADivideExpression
   * @generated
   */
  public Adapter createUADivideExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAModuloExpression <em>UA Modulo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAModuloExpression
   * @generated
   */
  public Adapter createUAModuloExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAPreIncrementExpression <em>UA Pre Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAPreIncrementExpression
   * @generated
   */
  public Adapter createUAPreIncrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAPreDecrementExpression <em>UA Pre Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAPreDecrementExpression
   * @generated
   */
  public Adapter createUAPreDecrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UALogicNotExpression <em>UA Logic Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UALogicNotExpression
   * @generated
   */
  public Adapter createUALogicNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAMinusExpression <em>UA Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAMinusExpression
   * @generated
   */
  public Adapter createUAMinusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAPostIncrementExpression <em>UA Post Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAPostIncrementExpression
   * @generated
   */
  public Adapter createUAPostIncrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAPostDecrementExpression <em>UA Post Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAPostDecrementExpression
   * @generated
   */
  public Adapter createUAPostDecrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAStructExpression <em>UA Struct Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAStructExpression
   * @generated
   */
  public Adapter createUAStructExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAArrayExpression <em>UA Array Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAArrayExpression
   * @generated
   */
  public Adapter createUAArrayExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UAReference <em>UA Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UAReference
   * @generated
   */
  public Adapter createUAReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UABooleanLiteral <em>UA Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UABooleanLiteral
   * @generated
   */
  public Adapter createUABooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uppaal.xml.description.description.UANumberLiteral <em>UA Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uppaal.xml.description.description.UANumberLiteral
   * @generated
   */
  public Adapter createUANumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DescriptionAdapterFactory
