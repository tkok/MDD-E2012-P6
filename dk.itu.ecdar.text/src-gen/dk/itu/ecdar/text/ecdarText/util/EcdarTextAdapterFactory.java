/**
 */
package dk.itu.ecdar.text.ecdarText.util;

import dk.itu.ecdar.text.ecdarText.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage
 * @generated
 */
public class EcdarTextAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EcdarTextPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcdarTextAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EcdarTextPackage.eINSTANCE;
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
  protected EcdarTextSwitch<Adapter> modelSwitch =
    new EcdarTextSwitch<Adapter>()
    {
      @Override
      public Adapter caseETFile(ETFile object)
      {
        return createETFileAdapter();
      }
      @Override
      public Adapter caseETImport(ETImport object)
      {
        return createETImportAdapter();
      }
      @Override
      public Adapter caseETArrayDeclaration(ETArrayDeclaration object)
      {
        return createETArrayDeclarationAdapter();
      }
      @Override
      public Adapter caseETDeclarations(ETDeclarations object)
      {
        return createETDeclarationsAdapter();
      }
      @Override
      public Adapter caseETDeclaration(ETDeclaration object)
      {
        return createETDeclarationAdapter();
      }
      @Override
      public Adapter caseETType(ETType object)
      {
        return createETTypeAdapter();
      }
      @Override
      public Adapter caseETTypeModifiers(ETTypeModifiers object)
      {
        return createETTypeModifiersAdapter();
      }
      @Override
      public Adapter caseETVariableDeclaration(ETVariableDeclaration object)
      {
        return createETVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseETVariableID(ETVariableID object)
      {
        return createETVariableIDAdapter();
      }
      @Override
      public Adapter caseETInitialiser(ETInitialiser object)
      {
        return createETInitialiserAdapter();
      }
      @Override
      public Adapter caseETSingleInitialiser(ETSingleInitialiser object)
      {
        return createETSingleInitialiserAdapter();
      }
      @Override
      public Adapter caseETMultiInitialiser(ETMultiInitialiser object)
      {
        return createETMultiInitialiserAdapter();
      }
      @Override
      public Adapter caseETTypeDeclaration(ETTypeDeclaration object)
      {
        return createETTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseETTypeID(ETTypeID object)
      {
        return createETTypeIDAdapter();
      }
      @Override
      public Adapter caseETTypeIdentifier(ETTypeIdentifier object)
      {
        return createETTypeIdentifierAdapter();
      }
      @Override
      public Adapter caseETIntegerType(ETIntegerType object)
      {
        return createETIntegerTypeAdapter();
      }
      @Override
      public Adapter caseETClockType(ETClockType object)
      {
        return createETClockTypeAdapter();
      }
      @Override
      public Adapter caseETActionType(ETActionType object)
      {
        return createETActionTypeAdapter();
      }
      @Override
      public Adapter caseETInputType(ETInputType object)
      {
        return createETInputTypeAdapter();
      }
      @Override
      public Adapter caseETOutputType(ETOutputType object)
      {
        return createETOutputTypeAdapter();
      }
      @Override
      public Adapter caseETBooleanType(ETBooleanType object)
      {
        return createETBooleanTypeAdapter();
      }
      @Override
      public Adapter caseETScalarType(ETScalarType object)
      {
        return createETScalarTypeAdapter();
      }
      @Override
      public Adapter caseETStructType(ETStructType object)
      {
        return createETStructTypeAdapter();
      }
      @Override
      public Adapter caseETFieldDeclaration(ETFieldDeclaration object)
      {
        return createETFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseETFieldID(ETFieldID object)
      {
        return createETFieldIDAdapter();
      }
      @Override
      public Adapter caseETSpecificationExpression(ETSpecificationExpression object)
      {
        return createETSpecificationExpressionAdapter();
      }
      @Override
      public Adapter caseETSpecification(ETSpecification object)
      {
        return createETSpecificationAdapter();
      }
      @Override
      public Adapter caseETSpecificationBinding(ETSpecificationBinding object)
      {
        return createETSpecificationBindingAdapter();
      }
      @Override
      public Adapter caseETSpecificationDefinition(ETSpecificationDefinition object)
      {
        return createETSpecificationDefinitionAdapter();
      }
      @Override
      public Adapter caseETSpecificationTemplate(ETSpecificationTemplate object)
      {
        return createETSpecificationTemplateAdapter();
      }
      @Override
      public Adapter caseETSpecificationBody(ETSpecificationBody object)
      {
        return createETSpecificationBodyAdapter();
      }
      @Override
      public Adapter caseETParameter(ETParameter object)
      {
        return createETParameterAdapter();
      }
      @Override
      public Adapter caseETLocation(ETLocation object)
      {
        return createETLocationAdapter();
      }
      @Override
      public Adapter caseETEdge(ETEdge object)
      {
        return createETEdgeAdapter();
      }
      @Override
      public Adapter caseETIO(ETIO object)
      {
        return createETIOAdapter();
      }
      @Override
      public Adapter caseETSelect(ETSelect object)
      {
        return createETSelectAdapter();
      }
      @Override
      public Adapter caseETExpression(ETExpression object)
      {
        return createETExpressionAdapter();
      }
      @Override
      public Adapter caseETTypeReference(ETTypeReference object)
      {
        return createETTypeReferenceAdapter();
      }
      @Override
      public Adapter caseETSpecificationDisjunctionExpression(ETSpecificationDisjunctionExpression object)
      {
        return createETSpecificationDisjunctionExpressionAdapter();
      }
      @Override
      public Adapter caseETSpecificationConjunctionExpression(ETSpecificationConjunctionExpression object)
      {
        return createETSpecificationConjunctionExpressionAdapter();
      }
      @Override
      public Adapter caseETSpecificationCompositionExpression(ETSpecificationCompositionExpression object)
      {
        return createETSpecificationCompositionExpressionAdapter();
      }
      @Override
      public Adapter caseETSpecificationReference(ETSpecificationReference object)
      {
        return createETSpecificationReferenceAdapter();
      }
      @Override
      public Adapter caseETSpecificationInstantiation(ETSpecificationInstantiation object)
      {
        return createETSpecificationInstantiationAdapter();
      }
      @Override
      public Adapter caseETForallExpression(ETForallExpression object)
      {
        return createETForallExpressionAdapter();
      }
      @Override
      public Adapter caseETExistsExpression(ETExistsExpression object)
      {
        return createETExistsExpressionAdapter();
      }
      @Override
      public Adapter caseETImplyExpression(ETImplyExpression object)
      {
        return createETImplyExpressionAdapter();
      }
      @Override
      public Adapter caseETLogicOrExpression(ETLogicOrExpression object)
      {
        return createETLogicOrExpressionAdapter();
      }
      @Override
      public Adapter caseETLogicAndExpression(ETLogicAndExpression object)
      {
        return createETLogicAndExpressionAdapter();
      }
      @Override
      public Adapter caseETAssignmentExpression(ETAssignmentExpression object)
      {
        return createETAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETAdditionAssignmentExpression(ETAdditionAssignmentExpression object)
      {
        return createETAdditionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETSubtractionAssignmentExpression(ETSubtractionAssignmentExpression object)
      {
        return createETSubtractionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETMultiplicationAssignmentExpression(ETMultiplicationAssignmentExpression object)
      {
        return createETMultiplicationAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETDivisionAssignmentExpression(ETDivisionAssignmentExpression object)
      {
        return createETDivisionAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETModuloAssignmentExpression(ETModuloAssignmentExpression object)
      {
        return createETModuloAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETBitOrAssignmentExpression(ETBitOrAssignmentExpression object)
      {
        return createETBitOrAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETBitAndAssignmentExpression(ETBitAndAssignmentExpression object)
      {
        return createETBitAndAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETBitXORAssignmentExpression(ETBitXORAssignmentExpression object)
      {
        return createETBitXORAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETBitLeftAssignmentExpression(ETBitLeftAssignmentExpression object)
      {
        return createETBitLeftAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETBitRightAssignmentExpression(ETBitRightAssignmentExpression object)
      {
        return createETBitRightAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseETConditionalExpression(ETConditionalExpression object)
      {
        return createETConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseETBitOrExpression(ETBitOrExpression object)
      {
        return createETBitOrExpressionAdapter();
      }
      @Override
      public Adapter caseETBitXORExpression(ETBitXORExpression object)
      {
        return createETBitXORExpressionAdapter();
      }
      @Override
      public Adapter caseETBitAndExpression(ETBitAndExpression object)
      {
        return createETBitAndExpressionAdapter();
      }
      @Override
      public Adapter caseETEqualExpression(ETEqualExpression object)
      {
        return createETEqualExpressionAdapter();
      }
      @Override
      public Adapter caseETUnequalExpression(ETUnequalExpression object)
      {
        return createETUnequalExpressionAdapter();
      }
      @Override
      public Adapter caseETLessExpression(ETLessExpression object)
      {
        return createETLessExpressionAdapter();
      }
      @Override
      public Adapter caseETLessEqualExpression(ETLessEqualExpression object)
      {
        return createETLessEqualExpressionAdapter();
      }
      @Override
      public Adapter caseETGreaterEqualExpression(ETGreaterEqualExpression object)
      {
        return createETGreaterEqualExpressionAdapter();
      }
      @Override
      public Adapter caseETGreaterExpression(ETGreaterExpression object)
      {
        return createETGreaterExpressionAdapter();
      }
      @Override
      public Adapter caseETMinExpression(ETMinExpression object)
      {
        return createETMinExpressionAdapter();
      }
      @Override
      public Adapter caseETMaxExpression(ETMaxExpression object)
      {
        return createETMaxExpressionAdapter();
      }
      @Override
      public Adapter caseETBitLeftExpression(ETBitLeftExpression object)
      {
        return createETBitLeftExpressionAdapter();
      }
      @Override
      public Adapter caseETBitRightExpression(ETBitRightExpression object)
      {
        return createETBitRightExpressionAdapter();
      }
      @Override
      public Adapter caseETAddExpression(ETAddExpression object)
      {
        return createETAddExpressionAdapter();
      }
      @Override
      public Adapter caseETSubtractExpression(ETSubtractExpression object)
      {
        return createETSubtractExpressionAdapter();
      }
      @Override
      public Adapter caseETMultiplyExpression(ETMultiplyExpression object)
      {
        return createETMultiplyExpressionAdapter();
      }
      @Override
      public Adapter caseETDivideExpression(ETDivideExpression object)
      {
        return createETDivideExpressionAdapter();
      }
      @Override
      public Adapter caseETModuloExpression(ETModuloExpression object)
      {
        return createETModuloExpressionAdapter();
      }
      @Override
      public Adapter caseETPreIncrementExpression(ETPreIncrementExpression object)
      {
        return createETPreIncrementExpressionAdapter();
      }
      @Override
      public Adapter caseETPreDecrementExpression(ETPreDecrementExpression object)
      {
        return createETPreDecrementExpressionAdapter();
      }
      @Override
      public Adapter caseETLogicNotExpression(ETLogicNotExpression object)
      {
        return createETLogicNotExpressionAdapter();
      }
      @Override
      public Adapter caseETMinusExpression(ETMinusExpression object)
      {
        return createETMinusExpressionAdapter();
      }
      @Override
      public Adapter caseETPostIncrementExpression(ETPostIncrementExpression object)
      {
        return createETPostIncrementExpressionAdapter();
      }
      @Override
      public Adapter caseETPostDecrementExpression(ETPostDecrementExpression object)
      {
        return createETPostDecrementExpressionAdapter();
      }
      @Override
      public Adapter caseETStructExpression(ETStructExpression object)
      {
        return createETStructExpressionAdapter();
      }
      @Override
      public Adapter caseETArrayExpression(ETArrayExpression object)
      {
        return createETArrayExpressionAdapter();
      }
      @Override
      public Adapter caseETReference(ETReference object)
      {
        return createETReferenceAdapter();
      }
      @Override
      public Adapter caseETBooleanLiteral(ETBooleanLiteral object)
      {
        return createETBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseETNumberLiteral(ETNumberLiteral object)
      {
        return createETNumberLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETFile <em>ET File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETFile
   * @generated
   */
  public Adapter createETFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETImport <em>ET Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETImport
   * @generated
   */
  public Adapter createETImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration <em>ET Array Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayDeclaration
   * @generated
   */
  public Adapter createETArrayDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETDeclarations <em>ET Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETDeclarations
   * @generated
   */
  public Adapter createETDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETDeclaration <em>ET Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETDeclaration
   * @generated
   */
  public Adapter createETDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETType <em>ET Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETType
   * @generated
   */
  public Adapter createETTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers <em>ET Type Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeModifiers
   * @generated
   */
  public Adapter createETTypeModifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration <em>ET Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableDeclaration
   * @generated
   */
  public Adapter createETVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETVariableID <em>ET Variable ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID
   * @generated
   */
  public Adapter createETVariableIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETInitialiser <em>ET Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETInitialiser
   * @generated
   */
  public Adapter createETInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSingleInitialiser <em>ET Single Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSingleInitialiser
   * @generated
   */
  public Adapter createETSingleInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMultiInitialiser <em>ET Multi Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiInitialiser
   * @generated
   */
  public Adapter createETMultiInitialiserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration <em>ET Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeDeclaration
   * @generated
   */
  public Adapter createETTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETTypeID <em>ET Type ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeID
   * @generated
   */
  public Adapter createETTypeIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETTypeIdentifier <em>ET Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeIdentifier
   * @generated
   */
  public Adapter createETTypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType <em>ET Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETIntegerType
   * @generated
   */
  public Adapter createETIntegerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETClockType <em>ET Clock Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETClockType
   * @generated
   */
  public Adapter createETClockTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETActionType <em>ET Action Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETActionType
   * @generated
   */
  public Adapter createETActionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETInputType <em>ET Input Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETInputType
   * @generated
   */
  public Adapter createETInputTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETOutputType <em>ET Output Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETOutputType
   * @generated
   */
  public Adapter createETOutputTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBooleanType <em>ET Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBooleanType
   * @generated
   */
  public Adapter createETBooleanTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETScalarType <em>ET Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETScalarType
   * @generated
   */
  public Adapter createETScalarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETStructType <em>ET Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETStructType
   * @generated
   */
  public Adapter createETStructTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETFieldDeclaration <em>ET Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldDeclaration
   * @generated
   */
  public Adapter createETFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETFieldID <em>ET Field ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldID
   * @generated
   */
  public Adapter createETFieldIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationExpression <em>ET Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationExpression
   * @generated
   */
  public Adapter createETSpecificationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecification <em>ET Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecification
   * @generated
   */
  public Adapter createETSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBinding <em>ET Specification Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBinding
   * @generated
   */
  public Adapter createETSpecificationBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition <em>ET Specification Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition
   * @generated
   */
  public Adapter createETSpecificationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate <em>ET Specification Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate
   * @generated
   */
  public Adapter createETSpecificationTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody <em>ET Specification Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBody
   * @generated
   */
  public Adapter createETSpecificationBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETParameter <em>ET Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETParameter
   * @generated
   */
  public Adapter createETParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLocation <em>ET Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation
   * @generated
   */
  public Adapter createETLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETEdge <em>ET Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge
   * @generated
   */
  public Adapter createETEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETIO <em>ETIO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETIO
   * @generated
   */
  public Adapter createETIOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSelect <em>ET Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSelect
   * @generated
   */
  public Adapter createETSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETExpression <em>ET Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETExpression
   * @generated
   */
  public Adapter createETExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETTypeReference <em>ET Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeReference
   * @generated
   */
  public Adapter createETTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression <em>ET Specification Disjunction Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression
   * @generated
   */
  public Adapter createETSpecificationDisjunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression <em>ET Specification Conjunction Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression
   * @generated
   */
  public Adapter createETSpecificationConjunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression <em>ET Specification Composition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression
   * @generated
   */
  public Adapter createETSpecificationCompositionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationReference <em>ET Specification Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationReference
   * @generated
   */
  public Adapter createETSpecificationReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation <em>ET Specification Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation
   * @generated
   */
  public Adapter createETSpecificationInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETForallExpression <em>ET Forall Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETForallExpression
   * @generated
   */
  public Adapter createETForallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETExistsExpression <em>ET Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETExistsExpression
   * @generated
   */
  public Adapter createETExistsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETImplyExpression <em>ET Imply Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETImplyExpression
   * @generated
   */
  public Adapter createETImplyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLogicOrExpression <em>ET Logic Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicOrExpression
   * @generated
   */
  public Adapter createETLogicOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLogicAndExpression <em>ET Logic And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicAndExpression
   * @generated
   */
  public Adapter createETLogicAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETAssignmentExpression <em>ET Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETAssignmentExpression
   * @generated
   */
  public Adapter createETAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression <em>ET Addition Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression
   * @generated
   */
  public Adapter createETAdditionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression <em>ET Subtraction Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression
   * @generated
   */
  public Adapter createETSubtractionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression <em>ET Multiplication Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression
   * @generated
   */
  public Adapter createETMultiplicationAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression <em>ET Division Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression
   * @generated
   */
  public Adapter createETDivisionAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression <em>ET Modulo Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression
   * @generated
   */
  public Adapter createETModuloAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression <em>ET Bit Or Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression
   * @generated
   */
  public Adapter createETBitOrAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression <em>ET Bit And Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression
   * @generated
   */
  public Adapter createETBitAndAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression <em>ET Bit XOR Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression
   * @generated
   */
  public Adapter createETBitXORAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression <em>ET Bit Left Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression
   * @generated
   */
  public Adapter createETBitLeftAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression <em>ET Bit Right Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression
   * @generated
   */
  public Adapter createETBitRightAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression <em>ET Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETConditionalExpression
   * @generated
   */
  public Adapter createETConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitOrExpression <em>ET Bit Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrExpression
   * @generated
   */
  public Adapter createETBitOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitXORExpression <em>ET Bit XOR Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORExpression
   * @generated
   */
  public Adapter createETBitXORExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitAndExpression <em>ET Bit And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndExpression
   * @generated
   */
  public Adapter createETBitAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETEqualExpression <em>ET Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETEqualExpression
   * @generated
   */
  public Adapter createETEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETUnequalExpression <em>ET Unequal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETUnequalExpression
   * @generated
   */
  public Adapter createETUnequalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLessExpression <em>ET Less Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLessExpression
   * @generated
   */
  public Adapter createETLessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLessEqualExpression <em>ET Less Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLessEqualExpression
   * @generated
   */
  public Adapter createETLessEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression <em>ET Greater Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression
   * @generated
   */
  public Adapter createETGreaterEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETGreaterExpression <em>ET Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterExpression
   * @generated
   */
  public Adapter createETGreaterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMinExpression <em>ET Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMinExpression
   * @generated
   */
  public Adapter createETMinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMaxExpression <em>ET Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMaxExpression
   * @generated
   */
  public Adapter createETMaxExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftExpression <em>ET Bit Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftExpression
   * @generated
   */
  public Adapter createETBitLeftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBitRightExpression <em>ET Bit Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightExpression
   * @generated
   */
  public Adapter createETBitRightExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETAddExpression <em>ET Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETAddExpression
   * @generated
   */
  public Adapter createETAddExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression <em>ET Subtract Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractExpression
   * @generated
   */
  public Adapter createETSubtractExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMultiplyExpression <em>ET Multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplyExpression
   * @generated
   */
  public Adapter createETMultiplyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETDivideExpression <em>ET Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETDivideExpression
   * @generated
   */
  public Adapter createETDivideExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETModuloExpression <em>ET Modulo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloExpression
   * @generated
   */
  public Adapter createETModuloExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression <em>ET Pre Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression
   * @generated
   */
  public Adapter createETPreIncrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression <em>ET Pre Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression
   * @generated
   */
  public Adapter createETPreDecrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETLogicNotExpression <em>ET Logic Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicNotExpression
   * @generated
   */
  public Adapter createETLogicNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETMinusExpression <em>ET Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETMinusExpression
   * @generated
   */
  public Adapter createETMinusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression <em>ET Post Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression
   * @generated
   */
  public Adapter createETPostIncrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression <em>ET Post Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression
   * @generated
   */
  public Adapter createETPostDecrementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETStructExpression <em>ET Struct Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETStructExpression
   * @generated
   */
  public Adapter createETStructExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETArrayExpression <em>ET Array Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayExpression
   * @generated
   */
  public Adapter createETArrayExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETReference <em>ET Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETReference
   * @generated
   */
  public Adapter createETReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETBooleanLiteral <em>ET Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETBooleanLiteral
   * @generated
   */
  public Adapter createETBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.itu.ecdar.text.ecdarText.ETNumberLiteral <em>ET Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.itu.ecdar.text.ecdarText.ETNumberLiteral
   * @generated
   */
  public Adapter createETNumberLiteralAdapter()
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

} //EcdarTextAdapterFactory
