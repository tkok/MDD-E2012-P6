/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

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
import dk.itu.ecdar.text.ecdarText.ETDeclaration;
import dk.itu.ecdar.text.ecdarText.ETDeclarations;
import dk.itu.ecdar.text.ecdarText.ETDivideExpression;
import dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETEdge;
import dk.itu.ecdar.text.ecdarText.ETEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETExistsExpression;
import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETFieldDeclaration;
import dk.itu.ecdar.text.ecdarText.ETFieldID;
import dk.itu.ecdar.text.ecdarText.ETFile;
import dk.itu.ecdar.text.ecdarText.ETForallExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterExpression;
import dk.itu.ecdar.text.ecdarText.ETIOType;
import dk.itu.ecdar.text.ecdarText.ETImplyExpression;
import dk.itu.ecdar.text.ecdarText.ETImport;
import dk.itu.ecdar.text.ecdarText.ETInitialiser;
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
import dk.itu.ecdar.text.ecdarText.ETSpecification;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBinding;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBody;
import dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition;
import dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation;
import dk.itu.ecdar.text.ecdarText.ETSpecificationReference;
import dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate;
import dk.itu.ecdar.text.ecdarText.ETStructExpression;
import dk.itu.ecdar.text.ecdarText.ETStructType;
import dk.itu.ecdar.text.ecdarText.ETSubtractExpression;
import dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETType;
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeID;
import dk.itu.ecdar.text.ecdarText.ETTypeIdentifier;
import dk.itu.ecdar.text.ecdarText.ETTypeModifiers;
import dk.itu.ecdar.text.ecdarText.ETTypeReference;
import dk.itu.ecdar.text.ecdarText.ETUnequalExpression;
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration;
import dk.itu.ecdar.text.ecdarText.ETVariableID;
import dk.itu.ecdar.text.ecdarText.EcdarTextFactory;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcdarTextPackageImpl extends EPackageImpl implements EcdarTextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etArrayDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeModifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etVariableIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSingleInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMultiInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etIntegerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etClockTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etActionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etInputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etOutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBooleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etScalarTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etStructTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etFieldIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSelectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationDisjunctionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationConjunctionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationCompositionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSpecificationInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etForallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etExistsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etImplyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLogicOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLogicAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etAdditionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSubtractionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMultiplicationAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etDivisionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etModuloAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitOrAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitAndAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitXORAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitLeftAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitRightAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etConditionalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitXORExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etUnequalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLessExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLessEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etGreaterEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etGreaterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMinExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMaxExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitLeftExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBitRightExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etAddExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etSubtractExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMultiplyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etDivideExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etModuloExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etPreIncrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etPreDecrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etLogicNotExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etMinusExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etPostIncrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etPostDecrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etStructExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etArrayExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etNumberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum etioTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EcdarTextPackageImpl()
  {
    super(eNS_URI, EcdarTextFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EcdarTextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EcdarTextPackage init()
  {
    if (isInited) return (EcdarTextPackage)EPackage.Registry.INSTANCE.getEPackage(EcdarTextPackage.eNS_URI);

    // Obtain or create and register package
    EcdarTextPackageImpl theEcdarTextPackage = (EcdarTextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcdarTextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcdarTextPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEcdarTextPackage.createPackageContents();

    // Initialize created meta-data
    theEcdarTextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEcdarTextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EcdarTextPackage.eNS_URI, theEcdarTextPackage);
    return theEcdarTextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETFile()
  {
    return etFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFile_Imports()
  {
    return (EReference)etFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFile_Declarations()
  {
    return (EReference)etFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFile_Specifications()
  {
    return (EReference)etFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETImport()
  {
    return etImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETImport_ImportedNamespace()
  {
    return (EAttribute)etImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETArrayDeclaration()
  {
    return etArrayDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETArrayDeclaration_Size()
  {
    return (EReference)etArrayDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDeclarations()
  {
    return etDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDeclarations_Declarations()
  {
    return (EReference)etDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDeclaration()
  {
    return etDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETType()
  {
    return etTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETType_Modifiers()
  {
    return (EReference)etTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETType_Identifier()
  {
    return (EReference)etTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETTypeModifiers()
  {
    return etTypeModifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETTypeModifiers_Urgent()
  {
    return (EAttribute)etTypeModifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETTypeModifiers_Meta()
  {
    return (EAttribute)etTypeModifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETTypeModifiers_Const()
  {
    return (EAttribute)etTypeModifiersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETVariableDeclaration()
  {
    return etVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETVariableDeclaration_Type()
  {
    return (EReference)etVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETVariableDeclaration_Variables()
  {
    return (EReference)etVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETVariableID()
  {
    return etVariableIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETVariableID_Name()
  {
    return (EAttribute)etVariableIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETVariableID_IoType()
  {
    return (EAttribute)etVariableIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETVariableID_Dimensions()
  {
    return (EReference)etVariableIDEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETVariableID_Initialiser()
  {
    return (EReference)etVariableIDEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETInitialiser()
  {
    return etInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSingleInitialiser()
  {
    return etSingleInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSingleInitialiser_Expression()
  {
    return (EReference)etSingleInitialiserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMultiInitialiser()
  {
    return etMultiInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMultiInitialiser_Initialisers()
  {
    return (EReference)etMultiInitialiserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETTypeDeclaration()
  {
    return etTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETTypeDeclaration_BaseType()
  {
    return (EReference)etTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETTypeDeclaration_Types()
  {
    return (EReference)etTypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETTypeID()
  {
    return etTypeIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETTypeID_Name()
  {
    return (EAttribute)etTypeIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETTypeID_Dimensions()
  {
    return (EReference)etTypeIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETTypeIdentifier()
  {
    return etTypeIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETIntegerType()
  {
    return etIntegerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETIntegerType_Min()
  {
    return (EReference)etIntegerTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETIntegerType_Max()
  {
    return (EReference)etIntegerTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETClockType()
  {
    return etClockTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETActionType()
  {
    return etActionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETInputType()
  {
    return etInputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETOutputType()
  {
    return etOutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBooleanType()
  {
    return etBooleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETScalarType()
  {
    return etScalarTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETScalarType_Size()
  {
    return (EReference)etScalarTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETStructType()
  {
    return etStructTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETStructType_Declarations()
  {
    return (EReference)etStructTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETFieldDeclaration()
  {
    return etFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFieldDeclaration_Type()
  {
    return (EReference)etFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFieldDeclaration_Fields()
  {
    return (EReference)etFieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETFieldID()
  {
    return etFieldIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETFieldID_Name()
  {
    return (EAttribute)etFieldIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETFieldID_IoType()
  {
    return (EAttribute)etFieldIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETFieldID_Dimensions()
  {
    return (EReference)etFieldIDEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationExpression()
  {
    return etSpecificationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecification()
  {
    return etSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETSpecification_Name()
  {
    return (EAttribute)etSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationBinding()
  {
    return etSpecificationBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationBinding_Expression()
  {
    return (EReference)etSpecificationBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationDefinition()
  {
    return etSpecificationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationDefinition_Body()
  {
    return (EReference)etSpecificationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationTemplate()
  {
    return etSpecificationTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationTemplate_Parameters()
  {
    return (EReference)etSpecificationTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationBody()
  {
    return etSpecificationBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationBody_Declarations()
  {
    return (EReference)etSpecificationBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationBody_InitialLocation()
  {
    return (EReference)etSpecificationBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationBody_Locations()
  {
    return (EReference)etSpecificationBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETParameter()
  {
    return etParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETParameter_Type()
  {
    return (EReference)etParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETParameter_Name()
  {
    return (EAttribute)etParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETParameter_IoType()
  {
    return (EAttribute)etParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETParameter_Dimensions()
  {
    return (EReference)etParameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLocation()
  {
    return etLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETLocation_Urgent()
  {
    return (EAttribute)etLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETLocation_Universal()
  {
    return (EAttribute)etLocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETLocation_Name()
  {
    return (EAttribute)etLocationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLocation_Invariants()
  {
    return (EReference)etLocationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLocation_Edges()
  {
    return (EReference)etLocationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETEdge()
  {
    return etEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETEdge_Controllable()
  {
    return (EAttribute)etEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEdge_Selects()
  {
    return (EReference)etEdgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEdge_Io()
  {
    return (EReference)etEdgeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEdge_Guard()
  {
    return (EReference)etEdgeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEdge_Target()
  {
    return (EReference)etEdgeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEdge_Updates()
  {
    return (EReference)etEdgeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETIO()
  {
    return etioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETIO_Expression()
  {
    return (EReference)etioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETIO_Type()
  {
    return (EAttribute)etioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSelect()
  {
    return etSelectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETSelect_Name()
  {
    return (EAttribute)etSelectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSelect_Type()
  {
    return (EReference)etSelectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETExpression()
  {
    return etExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETTypeReference()
  {
    return etTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETTypeReference_Target()
  {
    return (EReference)etTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationDisjunctionExpression()
  {
    return etSpecificationDisjunctionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationDisjunctionExpression_Left()
  {
    return (EReference)etSpecificationDisjunctionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationDisjunctionExpression_Right()
  {
    return (EReference)etSpecificationDisjunctionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationConjunctionExpression()
  {
    return etSpecificationConjunctionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationConjunctionExpression_Left()
  {
    return (EReference)etSpecificationConjunctionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationConjunctionExpression_Right()
  {
    return (EReference)etSpecificationConjunctionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationCompositionExpression()
  {
    return etSpecificationCompositionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationCompositionExpression_Left()
  {
    return (EReference)etSpecificationCompositionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationCompositionExpression_Right()
  {
    return (EReference)etSpecificationCompositionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationReference()
  {
    return etSpecificationReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationReference_Specification()
  {
    return (EReference)etSpecificationReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSpecificationInstantiation()
  {
    return etSpecificationInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationInstantiation_Template()
  {
    return (EReference)etSpecificationInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSpecificationInstantiation_Arguments()
  {
    return (EReference)etSpecificationInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETForallExpression()
  {
    return etForallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETForallExpression_Name()
  {
    return (EAttribute)etForallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETForallExpression_Type()
  {
    return (EReference)etForallExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETForallExpression_Expression()
  {
    return (EReference)etForallExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETExistsExpression()
  {
    return etExistsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETExistsExpression_Name()
  {
    return (EAttribute)etExistsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETExistsExpression_Type()
  {
    return (EReference)etExistsExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETExistsExpression_Expression()
  {
    return (EReference)etExistsExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETImplyExpression()
  {
    return etImplyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETImplyExpression_Left()
  {
    return (EReference)etImplyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETImplyExpression_Right()
  {
    return (EReference)etImplyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLogicOrExpression()
  {
    return etLogicOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLogicOrExpression_Left()
  {
    return (EReference)etLogicOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLogicOrExpression_Right()
  {
    return (EReference)etLogicOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLogicAndExpression()
  {
    return etLogicAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLogicAndExpression_Left()
  {
    return (EReference)etLogicAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLogicAndExpression_Right()
  {
    return (EReference)etLogicAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETAssignmentExpression()
  {
    return etAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAssignmentExpression_Left()
  {
    return (EReference)etAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAssignmentExpression_Right()
  {
    return (EReference)etAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETAdditionAssignmentExpression()
  {
    return etAdditionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAdditionAssignmentExpression_Left()
  {
    return (EReference)etAdditionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAdditionAssignmentExpression_Right()
  {
    return (EReference)etAdditionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSubtractionAssignmentExpression()
  {
    return etSubtractionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSubtractionAssignmentExpression_Left()
  {
    return (EReference)etSubtractionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSubtractionAssignmentExpression_Right()
  {
    return (EReference)etSubtractionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMultiplicationAssignmentExpression()
  {
    return etMultiplicationAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMultiplicationAssignmentExpression_Left()
  {
    return (EReference)etMultiplicationAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMultiplicationAssignmentExpression_Right()
  {
    return (EReference)etMultiplicationAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDivisionAssignmentExpression()
  {
    return etDivisionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDivisionAssignmentExpression_Left()
  {
    return (EReference)etDivisionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDivisionAssignmentExpression_Right()
  {
    return (EReference)etDivisionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETModuloAssignmentExpression()
  {
    return etModuloAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETModuloAssignmentExpression_Left()
  {
    return (EReference)etModuloAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETModuloAssignmentExpression_Right()
  {
    return (EReference)etModuloAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitOrAssignmentExpression()
  {
    return etBitOrAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitOrAssignmentExpression_Left()
  {
    return (EReference)etBitOrAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitOrAssignmentExpression_Right()
  {
    return (EReference)etBitOrAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitAndAssignmentExpression()
  {
    return etBitAndAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitAndAssignmentExpression_Left()
  {
    return (EReference)etBitAndAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitAndAssignmentExpression_Right()
  {
    return (EReference)etBitAndAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitXORAssignmentExpression()
  {
    return etBitXORAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitXORAssignmentExpression_Left()
  {
    return (EReference)etBitXORAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitXORAssignmentExpression_Right()
  {
    return (EReference)etBitXORAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitLeftAssignmentExpression()
  {
    return etBitLeftAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitLeftAssignmentExpression_Left()
  {
    return (EReference)etBitLeftAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitLeftAssignmentExpression_Right()
  {
    return (EReference)etBitLeftAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitRightAssignmentExpression()
  {
    return etBitRightAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitRightAssignmentExpression_Left()
  {
    return (EReference)etBitRightAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitRightAssignmentExpression_Right()
  {
    return (EReference)etBitRightAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETConditionalExpression()
  {
    return etConditionalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETConditionalExpression_Condition()
  {
    return (EReference)etConditionalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETConditionalExpression_Then()
  {
    return (EReference)etConditionalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETConditionalExpression_Else()
  {
    return (EReference)etConditionalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitOrExpression()
  {
    return etBitOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitOrExpression_Left()
  {
    return (EReference)etBitOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitOrExpression_Right()
  {
    return (EReference)etBitOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitXORExpression()
  {
    return etBitXORExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitXORExpression_Left()
  {
    return (EReference)etBitXORExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitXORExpression_Right()
  {
    return (EReference)etBitXORExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitAndExpression()
  {
    return etBitAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitAndExpression_Left()
  {
    return (EReference)etBitAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitAndExpression_Right()
  {
    return (EReference)etBitAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETEqualExpression()
  {
    return etEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEqualExpression_Left()
  {
    return (EReference)etEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETEqualExpression_Right()
  {
    return (EReference)etEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETUnequalExpression()
  {
    return etUnequalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETUnequalExpression_Left()
  {
    return (EReference)etUnequalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETUnequalExpression_Right()
  {
    return (EReference)etUnequalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLessExpression()
  {
    return etLessExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLessExpression_Left()
  {
    return (EReference)etLessExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLessExpression_Right()
  {
    return (EReference)etLessExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLessEqualExpression()
  {
    return etLessEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLessEqualExpression_Left()
  {
    return (EReference)etLessEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLessEqualExpression_Right()
  {
    return (EReference)etLessEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETGreaterEqualExpression()
  {
    return etGreaterEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETGreaterEqualExpression_Left()
  {
    return (EReference)etGreaterEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETGreaterEqualExpression_Right()
  {
    return (EReference)etGreaterEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETGreaterExpression()
  {
    return etGreaterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETGreaterExpression_Left()
  {
    return (EReference)etGreaterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETGreaterExpression_Right()
  {
    return (EReference)etGreaterExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMinExpression()
  {
    return etMinExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMinExpression_Left()
  {
    return (EReference)etMinExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMinExpression_Right()
  {
    return (EReference)etMinExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMaxExpression()
  {
    return etMaxExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMaxExpression_Left()
  {
    return (EReference)etMaxExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMaxExpression_Right()
  {
    return (EReference)etMaxExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitLeftExpression()
  {
    return etBitLeftExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitLeftExpression_Left()
  {
    return (EReference)etBitLeftExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitLeftExpression_Right()
  {
    return (EReference)etBitLeftExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBitRightExpression()
  {
    return etBitRightExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitRightExpression_Left()
  {
    return (EReference)etBitRightExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETBitRightExpression_Right()
  {
    return (EReference)etBitRightExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETAddExpression()
  {
    return etAddExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAddExpression_Left()
  {
    return (EReference)etAddExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETAddExpression_Right()
  {
    return (EReference)etAddExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETSubtractExpression()
  {
    return etSubtractExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSubtractExpression_Left()
  {
    return (EReference)etSubtractExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETSubtractExpression_Right()
  {
    return (EReference)etSubtractExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMultiplyExpression()
  {
    return etMultiplyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMultiplyExpression_Left()
  {
    return (EReference)etMultiplyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMultiplyExpression_Right()
  {
    return (EReference)etMultiplyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDivideExpression()
  {
    return etDivideExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDivideExpression_Left()
  {
    return (EReference)etDivideExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDivideExpression_Right()
  {
    return (EReference)etDivideExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETModuloExpression()
  {
    return etModuloExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETModuloExpression_Left()
  {
    return (EReference)etModuloExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETModuloExpression_Right()
  {
    return (EReference)etModuloExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETPreIncrementExpression()
  {
    return etPreIncrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETPreIncrementExpression_Expression()
  {
    return (EReference)etPreIncrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETPreDecrementExpression()
  {
    return etPreDecrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETPreDecrementExpression_Expression()
  {
    return (EReference)etPreDecrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETLogicNotExpression()
  {
    return etLogicNotExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETLogicNotExpression_Expression()
  {
    return (EReference)etLogicNotExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETMinusExpression()
  {
    return etMinusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETMinusExpression_Expression()
  {
    return (EReference)etMinusExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETPostIncrementExpression()
  {
    return etPostIncrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETPostIncrementExpression_Expression()
  {
    return (EReference)etPostIncrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETPostDecrementExpression()
  {
    return etPostDecrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETPostDecrementExpression_Expression()
  {
    return (EReference)etPostDecrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETStructExpression()
  {
    return etStructExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETStructExpression_Left()
  {
    return (EReference)etStructExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETStructExpression_Right()
  {
    return (EAttribute)etStructExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETArrayExpression()
  {
    return etArrayExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETArrayExpression_Left()
  {
    return (EReference)etArrayExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETArrayExpression_Right()
  {
    return (EReference)etArrayExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETReference()
  {
    return etReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETReference_Target()
  {
    return (EReference)etReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETBooleanLiteral()
  {
    return etBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETBooleanLiteral_Value()
  {
    return (EAttribute)etBooleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETNumberLiteral()
  {
    return etNumberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETNumberLiteral_Value()
  {
    return (EAttribute)etNumberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getETIOType()
  {
    return etioTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcdarTextFactory getEcdarTextFactory()
  {
    return (EcdarTextFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    etFileEClass = createEClass(ET_FILE);
    createEReference(etFileEClass, ET_FILE__IMPORTS);
    createEReference(etFileEClass, ET_FILE__DECLARATIONS);
    createEReference(etFileEClass, ET_FILE__SPECIFICATIONS);

    etImportEClass = createEClass(ET_IMPORT);
    createEAttribute(etImportEClass, ET_IMPORT__IMPORTED_NAMESPACE);

    etArrayDeclarationEClass = createEClass(ET_ARRAY_DECLARATION);
    createEReference(etArrayDeclarationEClass, ET_ARRAY_DECLARATION__SIZE);

    etDeclarationsEClass = createEClass(ET_DECLARATIONS);
    createEReference(etDeclarationsEClass, ET_DECLARATIONS__DECLARATIONS);

    etDeclarationEClass = createEClass(ET_DECLARATION);

    etTypeEClass = createEClass(ET_TYPE);
    createEReference(etTypeEClass, ET_TYPE__MODIFIERS);
    createEReference(etTypeEClass, ET_TYPE__IDENTIFIER);

    etTypeModifiersEClass = createEClass(ET_TYPE_MODIFIERS);
    createEAttribute(etTypeModifiersEClass, ET_TYPE_MODIFIERS__URGENT);
    createEAttribute(etTypeModifiersEClass, ET_TYPE_MODIFIERS__META);
    createEAttribute(etTypeModifiersEClass, ET_TYPE_MODIFIERS__CONST);

    etVariableDeclarationEClass = createEClass(ET_VARIABLE_DECLARATION);
    createEReference(etVariableDeclarationEClass, ET_VARIABLE_DECLARATION__TYPE);
    createEReference(etVariableDeclarationEClass, ET_VARIABLE_DECLARATION__VARIABLES);

    etVariableIDEClass = createEClass(ET_VARIABLE_ID);
    createEAttribute(etVariableIDEClass, ET_VARIABLE_ID__NAME);
    createEAttribute(etVariableIDEClass, ET_VARIABLE_ID__IO_TYPE);
    createEReference(etVariableIDEClass, ET_VARIABLE_ID__DIMENSIONS);
    createEReference(etVariableIDEClass, ET_VARIABLE_ID__INITIALISER);

    etInitialiserEClass = createEClass(ET_INITIALISER);

    etSingleInitialiserEClass = createEClass(ET_SINGLE_INITIALISER);
    createEReference(etSingleInitialiserEClass, ET_SINGLE_INITIALISER__EXPRESSION);

    etMultiInitialiserEClass = createEClass(ET_MULTI_INITIALISER);
    createEReference(etMultiInitialiserEClass, ET_MULTI_INITIALISER__INITIALISERS);

    etTypeDeclarationEClass = createEClass(ET_TYPE_DECLARATION);
    createEReference(etTypeDeclarationEClass, ET_TYPE_DECLARATION__BASE_TYPE);
    createEReference(etTypeDeclarationEClass, ET_TYPE_DECLARATION__TYPES);

    etTypeIDEClass = createEClass(ET_TYPE_ID);
    createEAttribute(etTypeIDEClass, ET_TYPE_ID__NAME);
    createEReference(etTypeIDEClass, ET_TYPE_ID__DIMENSIONS);

    etTypeIdentifierEClass = createEClass(ET_TYPE_IDENTIFIER);

    etIntegerTypeEClass = createEClass(ET_INTEGER_TYPE);
    createEReference(etIntegerTypeEClass, ET_INTEGER_TYPE__MIN);
    createEReference(etIntegerTypeEClass, ET_INTEGER_TYPE__MAX);

    etClockTypeEClass = createEClass(ET_CLOCK_TYPE);

    etActionTypeEClass = createEClass(ET_ACTION_TYPE);

    etInputTypeEClass = createEClass(ET_INPUT_TYPE);

    etOutputTypeEClass = createEClass(ET_OUTPUT_TYPE);

    etBooleanTypeEClass = createEClass(ET_BOOLEAN_TYPE);

    etScalarTypeEClass = createEClass(ET_SCALAR_TYPE);
    createEReference(etScalarTypeEClass, ET_SCALAR_TYPE__SIZE);

    etStructTypeEClass = createEClass(ET_STRUCT_TYPE);
    createEReference(etStructTypeEClass, ET_STRUCT_TYPE__DECLARATIONS);

    etFieldDeclarationEClass = createEClass(ET_FIELD_DECLARATION);
    createEReference(etFieldDeclarationEClass, ET_FIELD_DECLARATION__TYPE);
    createEReference(etFieldDeclarationEClass, ET_FIELD_DECLARATION__FIELDS);

    etFieldIDEClass = createEClass(ET_FIELD_ID);
    createEAttribute(etFieldIDEClass, ET_FIELD_ID__NAME);
    createEAttribute(etFieldIDEClass, ET_FIELD_ID__IO_TYPE);
    createEReference(etFieldIDEClass, ET_FIELD_ID__DIMENSIONS);

    etSpecificationExpressionEClass = createEClass(ET_SPECIFICATION_EXPRESSION);

    etSpecificationEClass = createEClass(ET_SPECIFICATION);
    createEAttribute(etSpecificationEClass, ET_SPECIFICATION__NAME);

    etSpecificationBindingEClass = createEClass(ET_SPECIFICATION_BINDING);
    createEReference(etSpecificationBindingEClass, ET_SPECIFICATION_BINDING__EXPRESSION);

    etSpecificationDefinitionEClass = createEClass(ET_SPECIFICATION_DEFINITION);
    createEReference(etSpecificationDefinitionEClass, ET_SPECIFICATION_DEFINITION__BODY);

    etSpecificationTemplateEClass = createEClass(ET_SPECIFICATION_TEMPLATE);
    createEReference(etSpecificationTemplateEClass, ET_SPECIFICATION_TEMPLATE__PARAMETERS);

    etSpecificationBodyEClass = createEClass(ET_SPECIFICATION_BODY);
    createEReference(etSpecificationBodyEClass, ET_SPECIFICATION_BODY__DECLARATIONS);
    createEReference(etSpecificationBodyEClass, ET_SPECIFICATION_BODY__INITIAL_LOCATION);
    createEReference(etSpecificationBodyEClass, ET_SPECIFICATION_BODY__LOCATIONS);

    etParameterEClass = createEClass(ET_PARAMETER);
    createEReference(etParameterEClass, ET_PARAMETER__TYPE);
    createEAttribute(etParameterEClass, ET_PARAMETER__NAME);
    createEAttribute(etParameterEClass, ET_PARAMETER__IO_TYPE);
    createEReference(etParameterEClass, ET_PARAMETER__DIMENSIONS);

    etLocationEClass = createEClass(ET_LOCATION);
    createEAttribute(etLocationEClass, ET_LOCATION__URGENT);
    createEAttribute(etLocationEClass, ET_LOCATION__UNIVERSAL);
    createEAttribute(etLocationEClass, ET_LOCATION__NAME);
    createEReference(etLocationEClass, ET_LOCATION__INVARIANTS);
    createEReference(etLocationEClass, ET_LOCATION__EDGES);

    etEdgeEClass = createEClass(ET_EDGE);
    createEAttribute(etEdgeEClass, ET_EDGE__CONTROLLABLE);
    createEReference(etEdgeEClass, ET_EDGE__SELECTS);
    createEReference(etEdgeEClass, ET_EDGE__IO);
    createEReference(etEdgeEClass, ET_EDGE__GUARD);
    createEReference(etEdgeEClass, ET_EDGE__TARGET);
    createEReference(etEdgeEClass, ET_EDGE__UPDATES);

    etioEClass = createEClass(ETIO);
    createEReference(etioEClass, ETIO__EXPRESSION);
    createEAttribute(etioEClass, ETIO__TYPE);

    etSelectEClass = createEClass(ET_SELECT);
    createEAttribute(etSelectEClass, ET_SELECT__NAME);
    createEReference(etSelectEClass, ET_SELECT__TYPE);

    etExpressionEClass = createEClass(ET_EXPRESSION);

    etTypeReferenceEClass = createEClass(ET_TYPE_REFERENCE);
    createEReference(etTypeReferenceEClass, ET_TYPE_REFERENCE__TARGET);

    etSpecificationDisjunctionExpressionEClass = createEClass(ET_SPECIFICATION_DISJUNCTION_EXPRESSION);
    createEReference(etSpecificationDisjunctionExpressionEClass, ET_SPECIFICATION_DISJUNCTION_EXPRESSION__LEFT);
    createEReference(etSpecificationDisjunctionExpressionEClass, ET_SPECIFICATION_DISJUNCTION_EXPRESSION__RIGHT);

    etSpecificationConjunctionExpressionEClass = createEClass(ET_SPECIFICATION_CONJUNCTION_EXPRESSION);
    createEReference(etSpecificationConjunctionExpressionEClass, ET_SPECIFICATION_CONJUNCTION_EXPRESSION__LEFT);
    createEReference(etSpecificationConjunctionExpressionEClass, ET_SPECIFICATION_CONJUNCTION_EXPRESSION__RIGHT);

    etSpecificationCompositionExpressionEClass = createEClass(ET_SPECIFICATION_COMPOSITION_EXPRESSION);
    createEReference(etSpecificationCompositionExpressionEClass, ET_SPECIFICATION_COMPOSITION_EXPRESSION__LEFT);
    createEReference(etSpecificationCompositionExpressionEClass, ET_SPECIFICATION_COMPOSITION_EXPRESSION__RIGHT);

    etSpecificationReferenceEClass = createEClass(ET_SPECIFICATION_REFERENCE);
    createEReference(etSpecificationReferenceEClass, ET_SPECIFICATION_REFERENCE__SPECIFICATION);

    etSpecificationInstantiationEClass = createEClass(ET_SPECIFICATION_INSTANTIATION);
    createEReference(etSpecificationInstantiationEClass, ET_SPECIFICATION_INSTANTIATION__TEMPLATE);
    createEReference(etSpecificationInstantiationEClass, ET_SPECIFICATION_INSTANTIATION__ARGUMENTS);

    etForallExpressionEClass = createEClass(ET_FORALL_EXPRESSION);
    createEAttribute(etForallExpressionEClass, ET_FORALL_EXPRESSION__NAME);
    createEReference(etForallExpressionEClass, ET_FORALL_EXPRESSION__TYPE);
    createEReference(etForallExpressionEClass, ET_FORALL_EXPRESSION__EXPRESSION);

    etExistsExpressionEClass = createEClass(ET_EXISTS_EXPRESSION);
    createEAttribute(etExistsExpressionEClass, ET_EXISTS_EXPRESSION__NAME);
    createEReference(etExistsExpressionEClass, ET_EXISTS_EXPRESSION__TYPE);
    createEReference(etExistsExpressionEClass, ET_EXISTS_EXPRESSION__EXPRESSION);

    etImplyExpressionEClass = createEClass(ET_IMPLY_EXPRESSION);
    createEReference(etImplyExpressionEClass, ET_IMPLY_EXPRESSION__LEFT);
    createEReference(etImplyExpressionEClass, ET_IMPLY_EXPRESSION__RIGHT);

    etLogicOrExpressionEClass = createEClass(ET_LOGIC_OR_EXPRESSION);
    createEReference(etLogicOrExpressionEClass, ET_LOGIC_OR_EXPRESSION__LEFT);
    createEReference(etLogicOrExpressionEClass, ET_LOGIC_OR_EXPRESSION__RIGHT);

    etLogicAndExpressionEClass = createEClass(ET_LOGIC_AND_EXPRESSION);
    createEReference(etLogicAndExpressionEClass, ET_LOGIC_AND_EXPRESSION__LEFT);
    createEReference(etLogicAndExpressionEClass, ET_LOGIC_AND_EXPRESSION__RIGHT);

    etAssignmentExpressionEClass = createEClass(ET_ASSIGNMENT_EXPRESSION);
    createEReference(etAssignmentExpressionEClass, ET_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etAssignmentExpressionEClass, ET_ASSIGNMENT_EXPRESSION__RIGHT);

    etAdditionAssignmentExpressionEClass = createEClass(ET_ADDITION_ASSIGNMENT_EXPRESSION);
    createEReference(etAdditionAssignmentExpressionEClass, ET_ADDITION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etAdditionAssignmentExpressionEClass, ET_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT);

    etSubtractionAssignmentExpressionEClass = createEClass(ET_SUBTRACTION_ASSIGNMENT_EXPRESSION);
    createEReference(etSubtractionAssignmentExpressionEClass, ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etSubtractionAssignmentExpressionEClass, ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT);

    etMultiplicationAssignmentExpressionEClass = createEClass(ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION);
    createEReference(etMultiplicationAssignmentExpressionEClass, ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etMultiplicationAssignmentExpressionEClass, ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT);

    etDivisionAssignmentExpressionEClass = createEClass(ET_DIVISION_ASSIGNMENT_EXPRESSION);
    createEReference(etDivisionAssignmentExpressionEClass, ET_DIVISION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etDivisionAssignmentExpressionEClass, ET_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT);

    etModuloAssignmentExpressionEClass = createEClass(ET_MODULO_ASSIGNMENT_EXPRESSION);
    createEReference(etModuloAssignmentExpressionEClass, ET_MODULO_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etModuloAssignmentExpressionEClass, ET_MODULO_ASSIGNMENT_EXPRESSION__RIGHT);

    etBitOrAssignmentExpressionEClass = createEClass(ET_BIT_OR_ASSIGNMENT_EXPRESSION);
    createEReference(etBitOrAssignmentExpressionEClass, ET_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etBitOrAssignmentExpressionEClass, ET_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT);

    etBitAndAssignmentExpressionEClass = createEClass(ET_BIT_AND_ASSIGNMENT_EXPRESSION);
    createEReference(etBitAndAssignmentExpressionEClass, ET_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etBitAndAssignmentExpressionEClass, ET_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT);

    etBitXORAssignmentExpressionEClass = createEClass(ET_BIT_XOR_ASSIGNMENT_EXPRESSION);
    createEReference(etBitXORAssignmentExpressionEClass, ET_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etBitXORAssignmentExpressionEClass, ET_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT);

    etBitLeftAssignmentExpressionEClass = createEClass(ET_BIT_LEFT_ASSIGNMENT_EXPRESSION);
    createEReference(etBitLeftAssignmentExpressionEClass, ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etBitLeftAssignmentExpressionEClass, ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT);

    etBitRightAssignmentExpressionEClass = createEClass(ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION);
    createEReference(etBitRightAssignmentExpressionEClass, ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(etBitRightAssignmentExpressionEClass, ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT);

    etConditionalExpressionEClass = createEClass(ET_CONDITIONAL_EXPRESSION);
    createEReference(etConditionalExpressionEClass, ET_CONDITIONAL_EXPRESSION__CONDITION);
    createEReference(etConditionalExpressionEClass, ET_CONDITIONAL_EXPRESSION__THEN);
    createEReference(etConditionalExpressionEClass, ET_CONDITIONAL_EXPRESSION__ELSE);

    etBitOrExpressionEClass = createEClass(ET_BIT_OR_EXPRESSION);
    createEReference(etBitOrExpressionEClass, ET_BIT_OR_EXPRESSION__LEFT);
    createEReference(etBitOrExpressionEClass, ET_BIT_OR_EXPRESSION__RIGHT);

    etBitXORExpressionEClass = createEClass(ET_BIT_XOR_EXPRESSION);
    createEReference(etBitXORExpressionEClass, ET_BIT_XOR_EXPRESSION__LEFT);
    createEReference(etBitXORExpressionEClass, ET_BIT_XOR_EXPRESSION__RIGHT);

    etBitAndExpressionEClass = createEClass(ET_BIT_AND_EXPRESSION);
    createEReference(etBitAndExpressionEClass, ET_BIT_AND_EXPRESSION__LEFT);
    createEReference(etBitAndExpressionEClass, ET_BIT_AND_EXPRESSION__RIGHT);

    etEqualExpressionEClass = createEClass(ET_EQUAL_EXPRESSION);
    createEReference(etEqualExpressionEClass, ET_EQUAL_EXPRESSION__LEFT);
    createEReference(etEqualExpressionEClass, ET_EQUAL_EXPRESSION__RIGHT);

    etUnequalExpressionEClass = createEClass(ET_UNEQUAL_EXPRESSION);
    createEReference(etUnequalExpressionEClass, ET_UNEQUAL_EXPRESSION__LEFT);
    createEReference(etUnequalExpressionEClass, ET_UNEQUAL_EXPRESSION__RIGHT);

    etLessExpressionEClass = createEClass(ET_LESS_EXPRESSION);
    createEReference(etLessExpressionEClass, ET_LESS_EXPRESSION__LEFT);
    createEReference(etLessExpressionEClass, ET_LESS_EXPRESSION__RIGHT);

    etLessEqualExpressionEClass = createEClass(ET_LESS_EQUAL_EXPRESSION);
    createEReference(etLessEqualExpressionEClass, ET_LESS_EQUAL_EXPRESSION__LEFT);
    createEReference(etLessEqualExpressionEClass, ET_LESS_EQUAL_EXPRESSION__RIGHT);

    etGreaterEqualExpressionEClass = createEClass(ET_GREATER_EQUAL_EXPRESSION);
    createEReference(etGreaterEqualExpressionEClass, ET_GREATER_EQUAL_EXPRESSION__LEFT);
    createEReference(etGreaterEqualExpressionEClass, ET_GREATER_EQUAL_EXPRESSION__RIGHT);

    etGreaterExpressionEClass = createEClass(ET_GREATER_EXPRESSION);
    createEReference(etGreaterExpressionEClass, ET_GREATER_EXPRESSION__LEFT);
    createEReference(etGreaterExpressionEClass, ET_GREATER_EXPRESSION__RIGHT);

    etMinExpressionEClass = createEClass(ET_MIN_EXPRESSION);
    createEReference(etMinExpressionEClass, ET_MIN_EXPRESSION__LEFT);
    createEReference(etMinExpressionEClass, ET_MIN_EXPRESSION__RIGHT);

    etMaxExpressionEClass = createEClass(ET_MAX_EXPRESSION);
    createEReference(etMaxExpressionEClass, ET_MAX_EXPRESSION__LEFT);
    createEReference(etMaxExpressionEClass, ET_MAX_EXPRESSION__RIGHT);

    etBitLeftExpressionEClass = createEClass(ET_BIT_LEFT_EXPRESSION);
    createEReference(etBitLeftExpressionEClass, ET_BIT_LEFT_EXPRESSION__LEFT);
    createEReference(etBitLeftExpressionEClass, ET_BIT_LEFT_EXPRESSION__RIGHT);

    etBitRightExpressionEClass = createEClass(ET_BIT_RIGHT_EXPRESSION);
    createEReference(etBitRightExpressionEClass, ET_BIT_RIGHT_EXPRESSION__LEFT);
    createEReference(etBitRightExpressionEClass, ET_BIT_RIGHT_EXPRESSION__RIGHT);

    etAddExpressionEClass = createEClass(ET_ADD_EXPRESSION);
    createEReference(etAddExpressionEClass, ET_ADD_EXPRESSION__LEFT);
    createEReference(etAddExpressionEClass, ET_ADD_EXPRESSION__RIGHT);

    etSubtractExpressionEClass = createEClass(ET_SUBTRACT_EXPRESSION);
    createEReference(etSubtractExpressionEClass, ET_SUBTRACT_EXPRESSION__LEFT);
    createEReference(etSubtractExpressionEClass, ET_SUBTRACT_EXPRESSION__RIGHT);

    etMultiplyExpressionEClass = createEClass(ET_MULTIPLY_EXPRESSION);
    createEReference(etMultiplyExpressionEClass, ET_MULTIPLY_EXPRESSION__LEFT);
    createEReference(etMultiplyExpressionEClass, ET_MULTIPLY_EXPRESSION__RIGHT);

    etDivideExpressionEClass = createEClass(ET_DIVIDE_EXPRESSION);
    createEReference(etDivideExpressionEClass, ET_DIVIDE_EXPRESSION__LEFT);
    createEReference(etDivideExpressionEClass, ET_DIVIDE_EXPRESSION__RIGHT);

    etModuloExpressionEClass = createEClass(ET_MODULO_EXPRESSION);
    createEReference(etModuloExpressionEClass, ET_MODULO_EXPRESSION__LEFT);
    createEReference(etModuloExpressionEClass, ET_MODULO_EXPRESSION__RIGHT);

    etPreIncrementExpressionEClass = createEClass(ET_PRE_INCREMENT_EXPRESSION);
    createEReference(etPreIncrementExpressionEClass, ET_PRE_INCREMENT_EXPRESSION__EXPRESSION);

    etPreDecrementExpressionEClass = createEClass(ET_PRE_DECREMENT_EXPRESSION);
    createEReference(etPreDecrementExpressionEClass, ET_PRE_DECREMENT_EXPRESSION__EXPRESSION);

    etLogicNotExpressionEClass = createEClass(ET_LOGIC_NOT_EXPRESSION);
    createEReference(etLogicNotExpressionEClass, ET_LOGIC_NOT_EXPRESSION__EXPRESSION);

    etMinusExpressionEClass = createEClass(ET_MINUS_EXPRESSION);
    createEReference(etMinusExpressionEClass, ET_MINUS_EXPRESSION__EXPRESSION);

    etPostIncrementExpressionEClass = createEClass(ET_POST_INCREMENT_EXPRESSION);
    createEReference(etPostIncrementExpressionEClass, ET_POST_INCREMENT_EXPRESSION__EXPRESSION);

    etPostDecrementExpressionEClass = createEClass(ET_POST_DECREMENT_EXPRESSION);
    createEReference(etPostDecrementExpressionEClass, ET_POST_DECREMENT_EXPRESSION__EXPRESSION);

    etStructExpressionEClass = createEClass(ET_STRUCT_EXPRESSION);
    createEReference(etStructExpressionEClass, ET_STRUCT_EXPRESSION__LEFT);
    createEAttribute(etStructExpressionEClass, ET_STRUCT_EXPRESSION__RIGHT);

    etArrayExpressionEClass = createEClass(ET_ARRAY_EXPRESSION);
    createEReference(etArrayExpressionEClass, ET_ARRAY_EXPRESSION__LEFT);
    createEReference(etArrayExpressionEClass, ET_ARRAY_EXPRESSION__RIGHT);

    etReferenceEClass = createEClass(ET_REFERENCE);
    createEReference(etReferenceEClass, ET_REFERENCE__TARGET);

    etBooleanLiteralEClass = createEClass(ET_BOOLEAN_LITERAL);
    createEAttribute(etBooleanLiteralEClass, ET_BOOLEAN_LITERAL__VALUE);

    etNumberLiteralEClass = createEClass(ET_NUMBER_LITERAL);
    createEAttribute(etNumberLiteralEClass, ET_NUMBER_LITERAL__VALUE);

    // Create enums
    etioTypeEEnum = createEEnum(ETIO_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    etVariableDeclarationEClass.getESuperTypes().add(this.getETDeclaration());
    etSingleInitialiserEClass.getESuperTypes().add(this.getETInitialiser());
    etMultiInitialiserEClass.getESuperTypes().add(this.getETInitialiser());
    etTypeDeclarationEClass.getESuperTypes().add(this.getETDeclaration());
    etIntegerTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etClockTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etActionTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etInputTypeEClass.getESuperTypes().add(this.getETActionType());
    etOutputTypeEClass.getESuperTypes().add(this.getETActionType());
    etBooleanTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etScalarTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etStructTypeEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etSpecificationBindingEClass.getESuperTypes().add(this.getETSpecification());
    etSpecificationDefinitionEClass.getESuperTypes().add(this.getETSpecification());
    etSpecificationTemplateEClass.getESuperTypes().add(this.getETSpecificationDefinition());
    etTypeReferenceEClass.getESuperTypes().add(this.getETTypeIdentifier());
    etSpecificationDisjunctionExpressionEClass.getESuperTypes().add(this.getETSpecificationExpression());
    etSpecificationConjunctionExpressionEClass.getESuperTypes().add(this.getETSpecificationExpression());
    etSpecificationCompositionExpressionEClass.getESuperTypes().add(this.getETSpecificationExpression());
    etSpecificationReferenceEClass.getESuperTypes().add(this.getETSpecificationExpression());
    etSpecificationInstantiationEClass.getESuperTypes().add(this.getETSpecificationExpression());
    etForallExpressionEClass.getESuperTypes().add(this.getETExpression());
    etExistsExpressionEClass.getESuperTypes().add(this.getETExpression());
    etImplyExpressionEClass.getESuperTypes().add(this.getETExpression());
    etLogicOrExpressionEClass.getESuperTypes().add(this.getETExpression());
    etLogicAndExpressionEClass.getESuperTypes().add(this.getETExpression());
    etAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etAdditionAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etSubtractionAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etMultiplicationAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etDivisionAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etModuloAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitOrAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitAndAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitXORAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitLeftAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitRightAssignmentExpressionEClass.getESuperTypes().add(this.getETExpression());
    etConditionalExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitOrExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitXORExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitAndExpressionEClass.getESuperTypes().add(this.getETExpression());
    etEqualExpressionEClass.getESuperTypes().add(this.getETExpression());
    etUnequalExpressionEClass.getESuperTypes().add(this.getETExpression());
    etLessExpressionEClass.getESuperTypes().add(this.getETExpression());
    etLessEqualExpressionEClass.getESuperTypes().add(this.getETExpression());
    etGreaterEqualExpressionEClass.getESuperTypes().add(this.getETExpression());
    etGreaterExpressionEClass.getESuperTypes().add(this.getETExpression());
    etMinExpressionEClass.getESuperTypes().add(this.getETExpression());
    etMaxExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitLeftExpressionEClass.getESuperTypes().add(this.getETExpression());
    etBitRightExpressionEClass.getESuperTypes().add(this.getETExpression());
    etAddExpressionEClass.getESuperTypes().add(this.getETExpression());
    etSubtractExpressionEClass.getESuperTypes().add(this.getETExpression());
    etMultiplyExpressionEClass.getESuperTypes().add(this.getETExpression());
    etDivideExpressionEClass.getESuperTypes().add(this.getETExpression());
    etModuloExpressionEClass.getESuperTypes().add(this.getETExpression());
    etPreIncrementExpressionEClass.getESuperTypes().add(this.getETExpression());
    etPreDecrementExpressionEClass.getESuperTypes().add(this.getETExpression());
    etLogicNotExpressionEClass.getESuperTypes().add(this.getETExpression());
    etMinusExpressionEClass.getESuperTypes().add(this.getETExpression());
    etPostIncrementExpressionEClass.getESuperTypes().add(this.getETExpression());
    etPostDecrementExpressionEClass.getESuperTypes().add(this.getETExpression());
    etStructExpressionEClass.getESuperTypes().add(this.getETExpression());
    etArrayExpressionEClass.getESuperTypes().add(this.getETExpression());
    etReferenceEClass.getESuperTypes().add(this.getETExpression());
    etBooleanLiteralEClass.getESuperTypes().add(this.getETExpression());
    etNumberLiteralEClass.getESuperTypes().add(this.getETExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(etFileEClass, ETFile.class, "ETFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETFile_Imports(), this.getETImport(), null, "imports", null, 0, -1, ETFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETFile_Declarations(), this.getETDeclarations(), null, "declarations", null, 0, 1, ETFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETFile_Specifications(), this.getETSpecification(), null, "specifications", null, 0, -1, ETFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etImportEClass, ETImport.class, "ETImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ETImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etArrayDeclarationEClass, ETArrayDeclaration.class, "ETArrayDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETArrayDeclaration_Size(), this.getETExpression(), null, "size", null, 0, 1, ETArrayDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etDeclarationsEClass, ETDeclarations.class, "ETDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETDeclarations_Declarations(), this.getETDeclaration(), null, "declarations", null, 0, -1, ETDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etDeclarationEClass, ETDeclaration.class, "ETDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etTypeEClass, ETType.class, "ETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETType_Modifiers(), this.getETTypeModifiers(), null, "modifiers", null, 0, 1, ETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETType_Identifier(), this.getETTypeIdentifier(), null, "identifier", null, 0, 1, ETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etTypeModifiersEClass, ETTypeModifiers.class, "ETTypeModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETTypeModifiers_Urgent(), ecorePackage.getEBoolean(), "urgent", null, 0, 1, ETTypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETTypeModifiers_Meta(), ecorePackage.getEBoolean(), "meta", null, 0, 1, ETTypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETTypeModifiers_Const(), ecorePackage.getEBoolean(), "const", null, 0, 1, ETTypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etVariableDeclarationEClass, ETVariableDeclaration.class, "ETVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETVariableDeclaration_Type(), this.getETType(), null, "type", null, 0, 1, ETVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETVariableDeclaration_Variables(), this.getETVariableID(), null, "variables", null, 0, -1, ETVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etVariableIDEClass, ETVariableID.class, "ETVariableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETVariableID_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETVariableID_IoType(), this.getETIOType(), "ioType", null, 0, 1, ETVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETVariableID_Dimensions(), this.getETArrayDeclaration(), null, "dimensions", null, 0, -1, ETVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETVariableID_Initialiser(), this.getETInitialiser(), null, "initialiser", null, 0, 1, ETVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etInitialiserEClass, ETInitialiser.class, "ETInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etSingleInitialiserEClass, ETSingleInitialiser.class, "ETSingleInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSingleInitialiser_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETSingleInitialiser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMultiInitialiserEClass, ETMultiInitialiser.class, "ETMultiInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMultiInitialiser_Initialisers(), this.getETInitialiser(), null, "initialisers", null, 0, -1, ETMultiInitialiser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etTypeDeclarationEClass, ETTypeDeclaration.class, "ETTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETTypeDeclaration_BaseType(), this.getETType(), null, "baseType", null, 0, 1, ETTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETTypeDeclaration_Types(), this.getETTypeID(), null, "types", null, 0, -1, ETTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etTypeIDEClass, ETTypeID.class, "ETTypeID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETTypeID_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETTypeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETTypeID_Dimensions(), this.getETArrayDeclaration(), null, "dimensions", null, 0, -1, ETTypeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etTypeIdentifierEClass, ETTypeIdentifier.class, "ETTypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etIntegerTypeEClass, ETIntegerType.class, "ETIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETIntegerType_Min(), this.getETExpression(), null, "min", null, 0, 1, ETIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETIntegerType_Max(), this.getETExpression(), null, "max", null, 0, 1, ETIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etClockTypeEClass, ETClockType.class, "ETClockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etActionTypeEClass, ETActionType.class, "ETActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etInputTypeEClass, ETInputType.class, "ETInputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etOutputTypeEClass, ETOutputType.class, "ETOutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etBooleanTypeEClass, ETBooleanType.class, "ETBooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etScalarTypeEClass, ETScalarType.class, "ETScalarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETScalarType_Size(), this.getETExpression(), null, "size", null, 0, 1, ETScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etStructTypeEClass, ETStructType.class, "ETStructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETStructType_Declarations(), this.getETFieldDeclaration(), null, "declarations", null, 0, -1, ETStructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etFieldDeclarationEClass, ETFieldDeclaration.class, "ETFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETFieldDeclaration_Type(), this.getETType(), null, "type", null, 0, 1, ETFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETFieldDeclaration_Fields(), this.getETFieldID(), null, "fields", null, 0, -1, ETFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etFieldIDEClass, ETFieldID.class, "ETFieldID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETFieldID_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETFieldID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETFieldID_IoType(), this.getETIOType(), "ioType", null, 0, 1, ETFieldID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETFieldID_Dimensions(), this.getETArrayDeclaration(), null, "dimensions", null, 0, -1, ETFieldID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationExpressionEClass, ETSpecificationExpression.class, "ETSpecificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etSpecificationEClass, ETSpecification.class, "ETSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationBindingEClass, ETSpecificationBinding.class, "ETSpecificationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationBinding_Expression(), this.getETSpecificationExpression(), null, "expression", null, 0, 1, ETSpecificationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationDefinitionEClass, ETSpecificationDefinition.class, "ETSpecificationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationDefinition_Body(), this.getETSpecificationBody(), null, "body", null, 0, 1, ETSpecificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationTemplateEClass, ETSpecificationTemplate.class, "ETSpecificationTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationTemplate_Parameters(), this.getETParameter(), null, "parameters", null, 0, -1, ETSpecificationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationBodyEClass, ETSpecificationBody.class, "ETSpecificationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationBody_Declarations(), this.getETDeclarations(), null, "declarations", null, 0, 1, ETSpecificationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationBody_InitialLocation(), this.getETLocation(), null, "initialLocation", null, 0, 1, ETSpecificationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationBody_Locations(), this.getETLocation(), null, "locations", null, 0, -1, ETSpecificationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etParameterEClass, ETParameter.class, "ETParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETParameter_Type(), this.getETType(), null, "type", null, 0, 1, ETParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETParameter_IoType(), this.getETIOType(), "ioType", null, 0, 1, ETParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETParameter_Dimensions(), this.getETArrayDeclaration(), null, "dimensions", null, 0, -1, ETParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLocationEClass, ETLocation.class, "ETLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETLocation_Urgent(), ecorePackage.getEBoolean(), "urgent", null, 0, 1, ETLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETLocation_Universal(), ecorePackage.getEBoolean(), "universal", null, 0, 1, ETLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLocation_Invariants(), this.getETExpression(), null, "invariants", null, 0, -1, ETLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLocation_Edges(), this.getETEdge(), null, "edges", null, 0, -1, ETLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etEdgeEClass, ETEdge.class, "ETEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETEdge_Controllable(), ecorePackage.getEBoolean(), "controllable", null, 0, 1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEdge_Selects(), this.getETSelect(), null, "selects", null, 0, -1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEdge_Io(), this.getETIO(), null, "io", null, 0, 1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEdge_Guard(), this.getETExpression(), null, "guard", null, 0, 1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEdge_Target(), this.getETLocation(), null, "target", null, 0, 1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEdge_Updates(), this.getETExpression(), null, "updates", null, 0, -1, ETEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etioEClass, dk.itu.ecdar.text.ecdarText.ETIO.class, "ETIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETIO_Expression(), this.getETExpression(), null, "expression", null, 0, 1, dk.itu.ecdar.text.ecdarText.ETIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETIO_Type(), this.getETIOType(), "type", null, 0, 1, dk.itu.ecdar.text.ecdarText.ETIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSelectEClass, ETSelect.class, "ETSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETSelect_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSelect_Type(), this.getETType(), null, "type", null, 0, 1, ETSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etExpressionEClass, ETExpression.class, "ETExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etTypeReferenceEClass, ETTypeReference.class, "ETTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETTypeReference_Target(), this.getETTypeID(), null, "target", null, 0, 1, ETTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationDisjunctionExpressionEClass, ETSpecificationDisjunctionExpression.class, "ETSpecificationDisjunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationDisjunctionExpression_Left(), this.getETSpecificationExpression(), null, "left", null, 0, 1, ETSpecificationDisjunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationDisjunctionExpression_Right(), this.getETSpecificationExpression(), null, "right", null, 0, 1, ETSpecificationDisjunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationConjunctionExpressionEClass, ETSpecificationConjunctionExpression.class, "ETSpecificationConjunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationConjunctionExpression_Left(), this.getETSpecificationExpression(), null, "left", null, 0, 1, ETSpecificationConjunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationConjunctionExpression_Right(), this.getETSpecificationExpression(), null, "right", null, 0, 1, ETSpecificationConjunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationCompositionExpressionEClass, ETSpecificationCompositionExpression.class, "ETSpecificationCompositionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationCompositionExpression_Left(), this.getETSpecificationExpression(), null, "left", null, 0, 1, ETSpecificationCompositionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationCompositionExpression_Right(), this.getETSpecificationExpression(), null, "right", null, 0, 1, ETSpecificationCompositionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationReferenceEClass, ETSpecificationReference.class, "ETSpecificationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationReference_Specification(), this.getETSpecification(), null, "specification", null, 0, 1, ETSpecificationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSpecificationInstantiationEClass, ETSpecificationInstantiation.class, "ETSpecificationInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSpecificationInstantiation_Template(), this.getETSpecificationTemplate(), null, "template", null, 0, 1, ETSpecificationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSpecificationInstantiation_Arguments(), this.getETExpression(), null, "arguments", null, 0, -1, ETSpecificationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etForallExpressionEClass, ETForallExpression.class, "ETForallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETForallExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETForallExpression_Type(), this.getETType(), null, "type", null, 0, 1, ETForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETForallExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etExistsExpressionEClass, ETExistsExpression.class, "ETExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETExistsExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETExistsExpression_Type(), this.getETType(), null, "type", null, 0, 1, ETExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETExistsExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etImplyExpressionEClass, ETImplyExpression.class, "ETImplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETImplyExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETImplyExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLogicOrExpressionEClass, ETLogicOrExpression.class, "ETLogicOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETLogicOrExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETLogicOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLogicOrExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETLogicOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLogicAndExpressionEClass, ETLogicAndExpression.class, "ETLogicAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETLogicAndExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETLogicAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLogicAndExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETLogicAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etAssignmentExpressionEClass, ETAssignmentExpression.class, "ETAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etAdditionAssignmentExpressionEClass, ETAdditionAssignmentExpression.class, "ETAdditionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETAdditionAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETAdditionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETAdditionAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETAdditionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSubtractionAssignmentExpressionEClass, ETSubtractionAssignmentExpression.class, "ETSubtractionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSubtractionAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETSubtractionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSubtractionAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETSubtractionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMultiplicationAssignmentExpressionEClass, ETMultiplicationAssignmentExpression.class, "ETMultiplicationAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMultiplicationAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETMultiplicationAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETMultiplicationAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETMultiplicationAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etDivisionAssignmentExpressionEClass, ETDivisionAssignmentExpression.class, "ETDivisionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETDivisionAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETDivisionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETDivisionAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETDivisionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etModuloAssignmentExpressionEClass, ETModuloAssignmentExpression.class, "ETModuloAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETModuloAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETModuloAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETModuloAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETModuloAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitOrAssignmentExpressionEClass, ETBitOrAssignmentExpression.class, "ETBitOrAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitOrAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitOrAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitOrAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitOrAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitAndAssignmentExpressionEClass, ETBitAndAssignmentExpression.class, "ETBitAndAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitAndAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitAndAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitAndAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitAndAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitXORAssignmentExpressionEClass, ETBitXORAssignmentExpression.class, "ETBitXORAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitXORAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitXORAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitXORAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitXORAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitLeftAssignmentExpressionEClass, ETBitLeftAssignmentExpression.class, "ETBitLeftAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitLeftAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitLeftAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitLeftAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitLeftAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitRightAssignmentExpressionEClass, ETBitRightAssignmentExpression.class, "ETBitRightAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitRightAssignmentExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitRightAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitRightAssignmentExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitRightAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etConditionalExpressionEClass, ETConditionalExpression.class, "ETConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETConditionalExpression_Condition(), this.getETExpression(), null, "condition", null, 0, 1, ETConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETConditionalExpression_Then(), this.getETExpression(), null, "then", null, 0, 1, ETConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETConditionalExpression_Else(), this.getETExpression(), null, "else", null, 0, 1, ETConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitOrExpressionEClass, ETBitOrExpression.class, "ETBitOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitOrExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitOrExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitXORExpressionEClass, ETBitXORExpression.class, "ETBitXORExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitXORExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitXORExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitXORExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitXORExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitAndExpressionEClass, ETBitAndExpression.class, "ETBitAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitAndExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitAndExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etEqualExpressionEClass, ETEqualExpression.class, "ETEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETEqualExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETEqualExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etUnequalExpressionEClass, ETUnequalExpression.class, "ETUnequalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETUnequalExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETUnequalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETUnequalExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETUnequalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLessExpressionEClass, ETLessExpression.class, "ETLessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETLessExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETLessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLessExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETLessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLessEqualExpressionEClass, ETLessEqualExpression.class, "ETLessEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETLessEqualExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETLessEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETLessEqualExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETLessEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etGreaterEqualExpressionEClass, ETGreaterEqualExpression.class, "ETGreaterEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETGreaterEqualExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETGreaterEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETGreaterEqualExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETGreaterEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etGreaterExpressionEClass, ETGreaterExpression.class, "ETGreaterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETGreaterExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETGreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETGreaterExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETGreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMinExpressionEClass, ETMinExpression.class, "ETMinExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMinExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETMinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETMinExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETMinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMaxExpressionEClass, ETMaxExpression.class, "ETMaxExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMaxExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETMaxExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETMaxExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETMaxExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitLeftExpressionEClass, ETBitLeftExpression.class, "ETBitLeftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitLeftExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitLeftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitLeftExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitLeftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBitRightExpressionEClass, ETBitRightExpression.class, "ETBitRightExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETBitRightExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETBitRightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETBitRightExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETBitRightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etAddExpressionEClass, ETAddExpression.class, "ETAddExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETAddExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETAddExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETAddExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETAddExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etSubtractExpressionEClass, ETSubtractExpression.class, "ETSubtractExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETSubtractExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETSubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETSubtractExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETSubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMultiplyExpressionEClass, ETMultiplyExpression.class, "ETMultiplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMultiplyExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETMultiplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETMultiplyExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETMultiplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etDivideExpressionEClass, ETDivideExpression.class, "ETDivideExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETDivideExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETDivideExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etModuloExpressionEClass, ETModuloExpression.class, "ETModuloExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETModuloExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETModuloExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETModuloExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETModuloExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etPreIncrementExpressionEClass, ETPreIncrementExpression.class, "ETPreIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETPreIncrementExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETPreIncrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etPreDecrementExpressionEClass, ETPreDecrementExpression.class, "ETPreDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETPreDecrementExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETPreDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etLogicNotExpressionEClass, ETLogicNotExpression.class, "ETLogicNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETLogicNotExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETLogicNotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etMinusExpressionEClass, ETMinusExpression.class, "ETMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETMinusExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETMinusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etPostIncrementExpressionEClass, ETPostIncrementExpression.class, "ETPostIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETPostIncrementExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETPostIncrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etPostDecrementExpressionEClass, ETPostDecrementExpression.class, "ETPostDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETPostDecrementExpression_Expression(), this.getETExpression(), null, "expression", null, 0, 1, ETPostDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etStructExpressionEClass, ETStructExpression.class, "ETStructExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETStructExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getETStructExpression_Right(), ecorePackage.getEString(), "right", null, 0, 1, ETStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etArrayExpressionEClass, ETArrayExpression.class, "ETArrayExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETArrayExpression_Left(), this.getETExpression(), null, "left", null, 0, 1, ETArrayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETArrayExpression_Right(), this.getETExpression(), null, "right", null, 0, 1, ETArrayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etReferenceEClass, ETReference.class, "ETReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETReference_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, ETReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etBooleanLiteralEClass, ETBooleanLiteral.class, "ETBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETBooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, ETBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etNumberLiteralEClass, ETNumberLiteral.class, "ETNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETNumberLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ETNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(etioTypeEEnum, ETIOType.class, "ETIOType");
    addEEnumLiteral(etioTypeEEnum, ETIOType.INPUT);
    addEEnumLiteral(etioTypeEEnum, ETIOType.OUTPUT);

    // Create resource
    createResource(eNS_URI);
  }

} //EcdarTextPackageImpl
