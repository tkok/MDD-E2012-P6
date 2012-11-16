/**
 */
package org.uppaal.xml.description.description.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.uppaal.xml.description.description.DescriptionFactory;
import org.uppaal.xml.description.description.DescriptionPackage;
import org.uppaal.xml.description.description.Top;
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
import org.uppaal.xml.description.description.UADeclaration;
import org.uppaal.xml.description.description.UADeclarations;
import org.uppaal.xml.description.description.UADefinition;
import org.uppaal.xml.description.description.UADivideExpression;
import org.uppaal.xml.description.description.UADivisionAssignmentExpression;
import org.uppaal.xml.description.description.UAEqualExpression;
import org.uppaal.xml.description.description.UAExistsExpression;
import org.uppaal.xml.description.description.UAExpression;
import org.uppaal.xml.description.description.UAFieldDeclaration;
import org.uppaal.xml.description.description.UAFieldID;
import org.uppaal.xml.description.description.UAForallExpression;
import org.uppaal.xml.description.description.UAGreaterEqualExpression;
import org.uppaal.xml.description.description.UAGreaterExpression;
import org.uppaal.xml.description.description.UAImplyExpression;
import org.uppaal.xml.description.description.UAInitialiser;
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
import org.uppaal.xml.description.description.UASynchronisationType;
import org.uppaal.xml.description.description.UASystem;
import org.uppaal.xml.description.description.UASystemDefinition;
import org.uppaal.xml.description.description.UASystemID;
import org.uppaal.xml.description.description.UAType;
import org.uppaal.xml.description.description.UATypeDeclaration;
import org.uppaal.xml.description.description.UATypeID;
import org.uppaal.xml.description.description.UATypeIdentifier;
import org.uppaal.xml.description.description.UATypeModifiers;
import org.uppaal.xml.description.description.UAUnequalExpression;
import org.uppaal.xml.description.description.UAUpdate;
import org.uppaal.xml.description.description.UAUserType;
import org.uppaal.xml.description.description.UAVariableDeclaration;
import org.uppaal.xml.description.description.UAVariableID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionPackageImpl extends EPackageImpl implements DescriptionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSystemDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSystemIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaArrayDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaTypeModifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaVariableIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSingleInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMultiInitialiserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaTypeIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaTypeIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaIntegerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaClockTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaChannelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBooleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaScalarTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaStructTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaFieldIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSelectListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSelectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaUpdateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSynchronisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaUserTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaForallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaExistsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaImplyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaLogicOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaLogicAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaAdditionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSubtractionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMultiplicationAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaDivisionAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaModuloAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitOrAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitAndAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitXORAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitLeftAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitRightAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaConditionalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitXORExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaUnequalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaLessExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaLessEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaGreaterEqualExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaGreaterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMinExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMaxExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitLeftExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBitRightExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaAddExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaSubtractExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMultiplyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaDivideExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaModuloExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaPreIncrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaPreDecrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaLogicNotExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaMinusExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaPostIncrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaPostDecrementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaStructExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaArrayExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uaNumberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum uaSynchronisationTypeEEnum = null;

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
   * @see org.uppaal.xml.description.description.DescriptionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DescriptionPackageImpl()
  {
    super(eNS_URI, DescriptionFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DescriptionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DescriptionPackage init()
  {
    if (isInited) return (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

    // Obtain or create and register package
    DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DescriptionPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDescriptionPackage.createPackageContents();

    // Initialize created meta-data
    theDescriptionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDescriptionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DescriptionPackage.eNS_URI, theDescriptionPackage);
    return theDescriptionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTop()
  {
    return topEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASystemDefinition()
  {
    return uaSystemDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASystemDefinition_Definitions()
  {
    return (EReference)uaSystemDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASystemDefinition_System()
  {
    return (EReference)uaSystemDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUADefinition()
  {
    return uaDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAInstantiation()
  {
    return uaInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAInstantiation_Name()
  {
    return (EAttribute)uaInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAInstantiation_Parameters()
  {
    return (EReference)uaInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAInstantiation_Target()
  {
    return (EAttribute)uaInstantiationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAInstantiation_Arguments()
  {
    return (EReference)uaInstantiationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASystem()
  {
    return uaSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASystem_Systems()
  {
    return (EReference)uaSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASystemID()
  {
    return uaSystemIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUASystemID_Name()
  {
    return (EAttribute)uaSystemIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAArrayDeclaration()
  {
    return uaArrayDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAArrayDeclaration_Size()
  {
    return (EReference)uaArrayDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUADeclarations()
  {
    return uaDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUADeclarations_Declarations()
  {
    return (EReference)uaDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUADeclaration()
  {
    return uaDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAType()
  {
    return uaTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAType_Modifiers()
  {
    return (EReference)uaTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAType_Identifier()
  {
    return (EReference)uaTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUATypeModifiers()
  {
    return uaTypeModifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUATypeModifiers_Urgent()
  {
    return (EAttribute)uaTypeModifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUATypeModifiers_Broadcast()
  {
    return (EAttribute)uaTypeModifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUATypeModifiers_Meta()
  {
    return (EAttribute)uaTypeModifiersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUATypeModifiers_Const()
  {
    return (EAttribute)uaTypeModifiersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAVariableDeclaration()
  {
    return uaVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAVariableDeclaration_Type()
  {
    return (EReference)uaVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAVariableDeclaration_Variables()
  {
    return (EReference)uaVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAVariableID()
  {
    return uaVariableIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAVariableID_Name()
  {
    return (EAttribute)uaVariableIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAVariableID_Dimensions()
  {
    return (EReference)uaVariableIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAVariableID_Initialiser()
  {
    return (EReference)uaVariableIDEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAInitialiser()
  {
    return uaInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASingleInitialiser()
  {
    return uaSingleInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASingleInitialiser_Expression()
  {
    return (EReference)uaSingleInitialiserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMultiInitialiser()
  {
    return uaMultiInitialiserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMultiInitialiser_Initialisers()
  {
    return (EReference)uaMultiInitialiserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUATypeDeclaration()
  {
    return uaTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUATypeDeclaration_BaseType()
  {
    return (EReference)uaTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUATypeDeclaration_Types()
  {
    return (EReference)uaTypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUATypeID()
  {
    return uaTypeIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUATypeID_Name()
  {
    return (EAttribute)uaTypeIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUATypeID_Dimensions()
  {
    return (EReference)uaTypeIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUATypeIdentifier()
  {
    return uaTypeIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAIntegerType()
  {
    return uaIntegerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAIntegerType_Min()
  {
    return (EReference)uaIntegerTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAIntegerType_Max()
  {
    return (EReference)uaIntegerTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAClockType()
  {
    return uaClockTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAChannelType()
  {
    return uaChannelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABooleanType()
  {
    return uaBooleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAScalarType()
  {
    return uaScalarTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAScalarType_Size()
  {
    return (EReference)uaScalarTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAStructType()
  {
    return uaStructTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAStructType_Declarations()
  {
    return (EReference)uaStructTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAFieldDeclaration()
  {
    return uaFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAFieldDeclaration_Type()
  {
    return (EReference)uaFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAFieldDeclaration_Fields()
  {
    return (EReference)uaFieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAFieldID()
  {
    return uaFieldIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAFieldID_Name()
  {
    return (EAttribute)uaFieldIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAFieldID_Dimensions()
  {
    return (EReference)uaFieldIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAParameters()
  {
    return uaParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAParameters_Parameters()
  {
    return (EReference)uaParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAParameter()
  {
    return uaParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAParameter_Type()
  {
    return (EReference)uaParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAParameter_ByReference()
  {
    return (EAttribute)uaParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAParameter_Name()
  {
    return (EAttribute)uaParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAParameter_Dimensions()
  {
    return (EReference)uaParameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAExpression()
  {
    return uaExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASelectList()
  {
    return uaSelectListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASelectList_Selects()
  {
    return (EReference)uaSelectListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASelect()
  {
    return uaSelectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUASelect_Name()
  {
    return (EAttribute)uaSelectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASelect_Type()
  {
    return (EReference)uaSelectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAUpdate()
  {
    return uaUpdateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAUpdate_Expressions()
  {
    return (EReference)uaUpdateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASynchronisation()
  {
    return uaSynchronisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASynchronisation_Expression()
  {
    return (EReference)uaSynchronisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUASynchronisation_Type()
  {
    return (EAttribute)uaSynchronisationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAUserType()
  {
    return uaUserTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAUserType_Name()
  {
    return (EAttribute)uaUserTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAForallExpression()
  {
    return uaForallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAForallExpression_Name()
  {
    return (EAttribute)uaForallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAForallExpression_Type()
  {
    return (EReference)uaForallExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAForallExpression_Expression()
  {
    return (EReference)uaForallExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAExistsExpression()
  {
    return uaExistsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAExistsExpression_Name()
  {
    return (EAttribute)uaExistsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAExistsExpression_Type()
  {
    return (EReference)uaExistsExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAExistsExpression_Expression()
  {
    return (EReference)uaExistsExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAImplyExpression()
  {
    return uaImplyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAImplyExpression_Left()
  {
    return (EReference)uaImplyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAImplyExpression_Right()
  {
    return (EReference)uaImplyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUALogicOrExpression()
  {
    return uaLogicOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALogicOrExpression_Left()
  {
    return (EReference)uaLogicOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALogicOrExpression_Right()
  {
    return (EReference)uaLogicOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUALogicAndExpression()
  {
    return uaLogicAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALogicAndExpression_Left()
  {
    return (EReference)uaLogicAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALogicAndExpression_Right()
  {
    return (EReference)uaLogicAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAAssignmentExpression()
  {
    return uaAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAssignmentExpression_Left()
  {
    return (EReference)uaAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAssignmentExpression_Right()
  {
    return (EReference)uaAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAAdditionAssignmentExpression()
  {
    return uaAdditionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAdditionAssignmentExpression_Left()
  {
    return (EReference)uaAdditionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAdditionAssignmentExpression_Right()
  {
    return (EReference)uaAdditionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASubtractionAssignmentExpression()
  {
    return uaSubtractionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASubtractionAssignmentExpression_Left()
  {
    return (EReference)uaSubtractionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASubtractionAssignmentExpression_Right()
  {
    return (EReference)uaSubtractionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMultiplicationAssignmentExpression()
  {
    return uaMultiplicationAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMultiplicationAssignmentExpression_Left()
  {
    return (EReference)uaMultiplicationAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMultiplicationAssignmentExpression_Right()
  {
    return (EReference)uaMultiplicationAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUADivisionAssignmentExpression()
  {
    return uaDivisionAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUADivisionAssignmentExpression_Left()
  {
    return (EReference)uaDivisionAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUADivisionAssignmentExpression_Right()
  {
    return (EReference)uaDivisionAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAModuloAssignmentExpression()
  {
    return uaModuloAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAModuloAssignmentExpression_Left()
  {
    return (EReference)uaModuloAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAModuloAssignmentExpression_Right()
  {
    return (EReference)uaModuloAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitOrAssignmentExpression()
  {
    return uaBitOrAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitOrAssignmentExpression_Left()
  {
    return (EReference)uaBitOrAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitOrAssignmentExpression_Right()
  {
    return (EReference)uaBitOrAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitAndAssignmentExpression()
  {
    return uaBitAndAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitAndAssignmentExpression_Left()
  {
    return (EReference)uaBitAndAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitAndAssignmentExpression_Right()
  {
    return (EReference)uaBitAndAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitXORAssignmentExpression()
  {
    return uaBitXORAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitXORAssignmentExpression_Left()
  {
    return (EReference)uaBitXORAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitXORAssignmentExpression_Right()
  {
    return (EReference)uaBitXORAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitLeftAssignmentExpression()
  {
    return uaBitLeftAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitLeftAssignmentExpression_Left()
  {
    return (EReference)uaBitLeftAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitLeftAssignmentExpression_Right()
  {
    return (EReference)uaBitLeftAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitRightAssignmentExpression()
  {
    return uaBitRightAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitRightAssignmentExpression_Left()
  {
    return (EReference)uaBitRightAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitRightAssignmentExpression_Right()
  {
    return (EReference)uaBitRightAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAConditionalExpression()
  {
    return uaConditionalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAConditionalExpression_Condition()
  {
    return (EReference)uaConditionalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAConditionalExpression_Then()
  {
    return (EReference)uaConditionalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAConditionalExpression_Else()
  {
    return (EReference)uaConditionalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitOrExpression()
  {
    return uaBitOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitOrExpression_Left()
  {
    return (EReference)uaBitOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitOrExpression_Right()
  {
    return (EReference)uaBitOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitXORExpression()
  {
    return uaBitXORExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitXORExpression_Left()
  {
    return (EReference)uaBitXORExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitXORExpression_Right()
  {
    return (EReference)uaBitXORExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitAndExpression()
  {
    return uaBitAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitAndExpression_Left()
  {
    return (EReference)uaBitAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitAndExpression_Right()
  {
    return (EReference)uaBitAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAEqualExpression()
  {
    return uaEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAEqualExpression_Left()
  {
    return (EReference)uaEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAEqualExpression_Right()
  {
    return (EReference)uaEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAUnequalExpression()
  {
    return uaUnequalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAUnequalExpression_Left()
  {
    return (EReference)uaUnequalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAUnequalExpression_Right()
  {
    return (EReference)uaUnequalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUALessExpression()
  {
    return uaLessExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALessExpression_Left()
  {
    return (EReference)uaLessExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALessExpression_Right()
  {
    return (EReference)uaLessExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUALessEqualExpression()
  {
    return uaLessEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALessEqualExpression_Left()
  {
    return (EReference)uaLessEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALessEqualExpression_Right()
  {
    return (EReference)uaLessEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAGreaterEqualExpression()
  {
    return uaGreaterEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAGreaterEqualExpression_Left()
  {
    return (EReference)uaGreaterEqualExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAGreaterEqualExpression_Right()
  {
    return (EReference)uaGreaterEqualExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAGreaterExpression()
  {
    return uaGreaterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAGreaterExpression_Left()
  {
    return (EReference)uaGreaterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAGreaterExpression_Right()
  {
    return (EReference)uaGreaterExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMinExpression()
  {
    return uaMinExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMinExpression_Left()
  {
    return (EReference)uaMinExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMinExpression_Right()
  {
    return (EReference)uaMinExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMaxExpression()
  {
    return uaMaxExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMaxExpression_Left()
  {
    return (EReference)uaMaxExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMaxExpression_Right()
  {
    return (EReference)uaMaxExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitLeftExpression()
  {
    return uaBitLeftExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitLeftExpression_Left()
  {
    return (EReference)uaBitLeftExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitLeftExpression_Right()
  {
    return (EReference)uaBitLeftExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABitRightExpression()
  {
    return uaBitRightExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitRightExpression_Left()
  {
    return (EReference)uaBitRightExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUABitRightExpression_Right()
  {
    return (EReference)uaBitRightExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAAddExpression()
  {
    return uaAddExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAddExpression_Left()
  {
    return (EReference)uaAddExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAAddExpression_Right()
  {
    return (EReference)uaAddExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUASubtractExpression()
  {
    return uaSubtractExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASubtractExpression_Left()
  {
    return (EReference)uaSubtractExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUASubtractExpression_Right()
  {
    return (EReference)uaSubtractExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMultiplyExpression()
  {
    return uaMultiplyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMultiplyExpression_Left()
  {
    return (EReference)uaMultiplyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMultiplyExpression_Right()
  {
    return (EReference)uaMultiplyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUADivideExpression()
  {
    return uaDivideExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUADivideExpression_Left()
  {
    return (EReference)uaDivideExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUADivideExpression_Right()
  {
    return (EReference)uaDivideExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAModuloExpression()
  {
    return uaModuloExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAModuloExpression_Left()
  {
    return (EReference)uaModuloExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAModuloExpression_Right()
  {
    return (EReference)uaModuloExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAPreIncrementExpression()
  {
    return uaPreIncrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAPreIncrementExpression_Expression()
  {
    return (EReference)uaPreIncrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAPreDecrementExpression()
  {
    return uaPreDecrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAPreDecrementExpression_Expression()
  {
    return (EReference)uaPreDecrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUALogicNotExpression()
  {
    return uaLogicNotExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUALogicNotExpression_Expression()
  {
    return (EReference)uaLogicNotExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAMinusExpression()
  {
    return uaMinusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAMinusExpression_Expression()
  {
    return (EReference)uaMinusExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAPostIncrementExpression()
  {
    return uaPostIncrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAPostIncrementExpression_Expression()
  {
    return (EReference)uaPostIncrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAPostDecrementExpression()
  {
    return uaPostDecrementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAPostDecrementExpression_Expression()
  {
    return (EReference)uaPostDecrementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAStructExpression()
  {
    return uaStructExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAStructExpression_Left()
  {
    return (EReference)uaStructExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAStructExpression_Right()
  {
    return (EAttribute)uaStructExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAArrayExpression()
  {
    return uaArrayExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAArrayExpression_Left()
  {
    return (EReference)uaArrayExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUAArrayExpression_Right()
  {
    return (EReference)uaArrayExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUAReference()
  {
    return uaReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUAReference_Name()
  {
    return (EAttribute)uaReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUABooleanLiteral()
  {
    return uaBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUABooleanLiteral_Value()
  {
    return (EAttribute)uaBooleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUANumberLiteral()
  {
    return uaNumberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUANumberLiteral_Value()
  {
    return (EAttribute)uaNumberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUASynchronisationType()
  {
    return uaSynchronisationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionFactory getDescriptionFactory()
  {
    return (DescriptionFactory)getEFactoryInstance();
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
    topEClass = createEClass(TOP);

    uaSystemDefinitionEClass = createEClass(UA_SYSTEM_DEFINITION);
    createEReference(uaSystemDefinitionEClass, UA_SYSTEM_DEFINITION__DEFINITIONS);
    createEReference(uaSystemDefinitionEClass, UA_SYSTEM_DEFINITION__SYSTEM);

    uaDefinitionEClass = createEClass(UA_DEFINITION);

    uaInstantiationEClass = createEClass(UA_INSTANTIATION);
    createEAttribute(uaInstantiationEClass, UA_INSTANTIATION__NAME);
    createEReference(uaInstantiationEClass, UA_INSTANTIATION__PARAMETERS);
    createEAttribute(uaInstantiationEClass, UA_INSTANTIATION__TARGET);
    createEReference(uaInstantiationEClass, UA_INSTANTIATION__ARGUMENTS);

    uaSystemEClass = createEClass(UA_SYSTEM);
    createEReference(uaSystemEClass, UA_SYSTEM__SYSTEMS);

    uaSystemIDEClass = createEClass(UA_SYSTEM_ID);
    createEAttribute(uaSystemIDEClass, UA_SYSTEM_ID__NAME);

    uaArrayDeclarationEClass = createEClass(UA_ARRAY_DECLARATION);
    createEReference(uaArrayDeclarationEClass, UA_ARRAY_DECLARATION__SIZE);

    uaDeclarationsEClass = createEClass(UA_DECLARATIONS);
    createEReference(uaDeclarationsEClass, UA_DECLARATIONS__DECLARATIONS);

    uaDeclarationEClass = createEClass(UA_DECLARATION);

    uaTypeEClass = createEClass(UA_TYPE);
    createEReference(uaTypeEClass, UA_TYPE__MODIFIERS);
    createEReference(uaTypeEClass, UA_TYPE__IDENTIFIER);

    uaTypeModifiersEClass = createEClass(UA_TYPE_MODIFIERS);
    createEAttribute(uaTypeModifiersEClass, UA_TYPE_MODIFIERS__URGENT);
    createEAttribute(uaTypeModifiersEClass, UA_TYPE_MODIFIERS__BROADCAST);
    createEAttribute(uaTypeModifiersEClass, UA_TYPE_MODIFIERS__META);
    createEAttribute(uaTypeModifiersEClass, UA_TYPE_MODIFIERS__CONST);

    uaVariableDeclarationEClass = createEClass(UA_VARIABLE_DECLARATION);
    createEReference(uaVariableDeclarationEClass, UA_VARIABLE_DECLARATION__TYPE);
    createEReference(uaVariableDeclarationEClass, UA_VARIABLE_DECLARATION__VARIABLES);

    uaVariableIDEClass = createEClass(UA_VARIABLE_ID);
    createEAttribute(uaVariableIDEClass, UA_VARIABLE_ID__NAME);
    createEReference(uaVariableIDEClass, UA_VARIABLE_ID__DIMENSIONS);
    createEReference(uaVariableIDEClass, UA_VARIABLE_ID__INITIALISER);

    uaInitialiserEClass = createEClass(UA_INITIALISER);

    uaSingleInitialiserEClass = createEClass(UA_SINGLE_INITIALISER);
    createEReference(uaSingleInitialiserEClass, UA_SINGLE_INITIALISER__EXPRESSION);

    uaMultiInitialiserEClass = createEClass(UA_MULTI_INITIALISER);
    createEReference(uaMultiInitialiserEClass, UA_MULTI_INITIALISER__INITIALISERS);

    uaTypeDeclarationEClass = createEClass(UA_TYPE_DECLARATION);
    createEReference(uaTypeDeclarationEClass, UA_TYPE_DECLARATION__BASE_TYPE);
    createEReference(uaTypeDeclarationEClass, UA_TYPE_DECLARATION__TYPES);

    uaTypeIDEClass = createEClass(UA_TYPE_ID);
    createEAttribute(uaTypeIDEClass, UA_TYPE_ID__NAME);
    createEReference(uaTypeIDEClass, UA_TYPE_ID__DIMENSIONS);

    uaTypeIdentifierEClass = createEClass(UA_TYPE_IDENTIFIER);

    uaIntegerTypeEClass = createEClass(UA_INTEGER_TYPE);
    createEReference(uaIntegerTypeEClass, UA_INTEGER_TYPE__MIN);
    createEReference(uaIntegerTypeEClass, UA_INTEGER_TYPE__MAX);

    uaClockTypeEClass = createEClass(UA_CLOCK_TYPE);

    uaChannelTypeEClass = createEClass(UA_CHANNEL_TYPE);

    uaBooleanTypeEClass = createEClass(UA_BOOLEAN_TYPE);

    uaScalarTypeEClass = createEClass(UA_SCALAR_TYPE);
    createEReference(uaScalarTypeEClass, UA_SCALAR_TYPE__SIZE);

    uaStructTypeEClass = createEClass(UA_STRUCT_TYPE);
    createEReference(uaStructTypeEClass, UA_STRUCT_TYPE__DECLARATIONS);

    uaFieldDeclarationEClass = createEClass(UA_FIELD_DECLARATION);
    createEReference(uaFieldDeclarationEClass, UA_FIELD_DECLARATION__TYPE);
    createEReference(uaFieldDeclarationEClass, UA_FIELD_DECLARATION__FIELDS);

    uaFieldIDEClass = createEClass(UA_FIELD_ID);
    createEAttribute(uaFieldIDEClass, UA_FIELD_ID__NAME);
    createEReference(uaFieldIDEClass, UA_FIELD_ID__DIMENSIONS);

    uaParametersEClass = createEClass(UA_PARAMETERS);
    createEReference(uaParametersEClass, UA_PARAMETERS__PARAMETERS);

    uaParameterEClass = createEClass(UA_PARAMETER);
    createEReference(uaParameterEClass, UA_PARAMETER__TYPE);
    createEAttribute(uaParameterEClass, UA_PARAMETER__BY_REFERENCE);
    createEAttribute(uaParameterEClass, UA_PARAMETER__NAME);
    createEReference(uaParameterEClass, UA_PARAMETER__DIMENSIONS);

    uaExpressionEClass = createEClass(UA_EXPRESSION);

    uaSelectListEClass = createEClass(UA_SELECT_LIST);
    createEReference(uaSelectListEClass, UA_SELECT_LIST__SELECTS);

    uaSelectEClass = createEClass(UA_SELECT);
    createEAttribute(uaSelectEClass, UA_SELECT__NAME);
    createEReference(uaSelectEClass, UA_SELECT__TYPE);

    uaUpdateEClass = createEClass(UA_UPDATE);
    createEReference(uaUpdateEClass, UA_UPDATE__EXPRESSIONS);

    uaSynchronisationEClass = createEClass(UA_SYNCHRONISATION);
    createEReference(uaSynchronisationEClass, UA_SYNCHRONISATION__EXPRESSION);
    createEAttribute(uaSynchronisationEClass, UA_SYNCHRONISATION__TYPE);

    uaUserTypeEClass = createEClass(UA_USER_TYPE);
    createEAttribute(uaUserTypeEClass, UA_USER_TYPE__NAME);

    uaForallExpressionEClass = createEClass(UA_FORALL_EXPRESSION);
    createEAttribute(uaForallExpressionEClass, UA_FORALL_EXPRESSION__NAME);
    createEReference(uaForallExpressionEClass, UA_FORALL_EXPRESSION__TYPE);
    createEReference(uaForallExpressionEClass, UA_FORALL_EXPRESSION__EXPRESSION);

    uaExistsExpressionEClass = createEClass(UA_EXISTS_EXPRESSION);
    createEAttribute(uaExistsExpressionEClass, UA_EXISTS_EXPRESSION__NAME);
    createEReference(uaExistsExpressionEClass, UA_EXISTS_EXPRESSION__TYPE);
    createEReference(uaExistsExpressionEClass, UA_EXISTS_EXPRESSION__EXPRESSION);

    uaImplyExpressionEClass = createEClass(UA_IMPLY_EXPRESSION);
    createEReference(uaImplyExpressionEClass, UA_IMPLY_EXPRESSION__LEFT);
    createEReference(uaImplyExpressionEClass, UA_IMPLY_EXPRESSION__RIGHT);

    uaLogicOrExpressionEClass = createEClass(UA_LOGIC_OR_EXPRESSION);
    createEReference(uaLogicOrExpressionEClass, UA_LOGIC_OR_EXPRESSION__LEFT);
    createEReference(uaLogicOrExpressionEClass, UA_LOGIC_OR_EXPRESSION__RIGHT);

    uaLogicAndExpressionEClass = createEClass(UA_LOGIC_AND_EXPRESSION);
    createEReference(uaLogicAndExpressionEClass, UA_LOGIC_AND_EXPRESSION__LEFT);
    createEReference(uaLogicAndExpressionEClass, UA_LOGIC_AND_EXPRESSION__RIGHT);

    uaAssignmentExpressionEClass = createEClass(UA_ASSIGNMENT_EXPRESSION);
    createEReference(uaAssignmentExpressionEClass, UA_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaAssignmentExpressionEClass, UA_ASSIGNMENT_EXPRESSION__RIGHT);

    uaAdditionAssignmentExpressionEClass = createEClass(UA_ADDITION_ASSIGNMENT_EXPRESSION);
    createEReference(uaAdditionAssignmentExpressionEClass, UA_ADDITION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaAdditionAssignmentExpressionEClass, UA_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT);

    uaSubtractionAssignmentExpressionEClass = createEClass(UA_SUBTRACTION_ASSIGNMENT_EXPRESSION);
    createEReference(uaSubtractionAssignmentExpressionEClass, UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaSubtractionAssignmentExpressionEClass, UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT);

    uaMultiplicationAssignmentExpressionEClass = createEClass(UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION);
    createEReference(uaMultiplicationAssignmentExpressionEClass, UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaMultiplicationAssignmentExpressionEClass, UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT);

    uaDivisionAssignmentExpressionEClass = createEClass(UA_DIVISION_ASSIGNMENT_EXPRESSION);
    createEReference(uaDivisionAssignmentExpressionEClass, UA_DIVISION_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaDivisionAssignmentExpressionEClass, UA_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT);

    uaModuloAssignmentExpressionEClass = createEClass(UA_MODULO_ASSIGNMENT_EXPRESSION);
    createEReference(uaModuloAssignmentExpressionEClass, UA_MODULO_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaModuloAssignmentExpressionEClass, UA_MODULO_ASSIGNMENT_EXPRESSION__RIGHT);

    uaBitOrAssignmentExpressionEClass = createEClass(UA_BIT_OR_ASSIGNMENT_EXPRESSION);
    createEReference(uaBitOrAssignmentExpressionEClass, UA_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaBitOrAssignmentExpressionEClass, UA_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT);

    uaBitAndAssignmentExpressionEClass = createEClass(UA_BIT_AND_ASSIGNMENT_EXPRESSION);
    createEReference(uaBitAndAssignmentExpressionEClass, UA_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaBitAndAssignmentExpressionEClass, UA_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT);

    uaBitXORAssignmentExpressionEClass = createEClass(UA_BIT_XOR_ASSIGNMENT_EXPRESSION);
    createEReference(uaBitXORAssignmentExpressionEClass, UA_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaBitXORAssignmentExpressionEClass, UA_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT);

    uaBitLeftAssignmentExpressionEClass = createEClass(UA_BIT_LEFT_ASSIGNMENT_EXPRESSION);
    createEReference(uaBitLeftAssignmentExpressionEClass, UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaBitLeftAssignmentExpressionEClass, UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT);

    uaBitRightAssignmentExpressionEClass = createEClass(UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION);
    createEReference(uaBitRightAssignmentExpressionEClass, UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT);
    createEReference(uaBitRightAssignmentExpressionEClass, UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT);

    uaConditionalExpressionEClass = createEClass(UA_CONDITIONAL_EXPRESSION);
    createEReference(uaConditionalExpressionEClass, UA_CONDITIONAL_EXPRESSION__CONDITION);
    createEReference(uaConditionalExpressionEClass, UA_CONDITIONAL_EXPRESSION__THEN);
    createEReference(uaConditionalExpressionEClass, UA_CONDITIONAL_EXPRESSION__ELSE);

    uaBitOrExpressionEClass = createEClass(UA_BIT_OR_EXPRESSION);
    createEReference(uaBitOrExpressionEClass, UA_BIT_OR_EXPRESSION__LEFT);
    createEReference(uaBitOrExpressionEClass, UA_BIT_OR_EXPRESSION__RIGHT);

    uaBitXORExpressionEClass = createEClass(UA_BIT_XOR_EXPRESSION);
    createEReference(uaBitXORExpressionEClass, UA_BIT_XOR_EXPRESSION__LEFT);
    createEReference(uaBitXORExpressionEClass, UA_BIT_XOR_EXPRESSION__RIGHT);

    uaBitAndExpressionEClass = createEClass(UA_BIT_AND_EXPRESSION);
    createEReference(uaBitAndExpressionEClass, UA_BIT_AND_EXPRESSION__LEFT);
    createEReference(uaBitAndExpressionEClass, UA_BIT_AND_EXPRESSION__RIGHT);

    uaEqualExpressionEClass = createEClass(UA_EQUAL_EXPRESSION);
    createEReference(uaEqualExpressionEClass, UA_EQUAL_EXPRESSION__LEFT);
    createEReference(uaEqualExpressionEClass, UA_EQUAL_EXPRESSION__RIGHT);

    uaUnequalExpressionEClass = createEClass(UA_UNEQUAL_EXPRESSION);
    createEReference(uaUnequalExpressionEClass, UA_UNEQUAL_EXPRESSION__LEFT);
    createEReference(uaUnequalExpressionEClass, UA_UNEQUAL_EXPRESSION__RIGHT);

    uaLessExpressionEClass = createEClass(UA_LESS_EXPRESSION);
    createEReference(uaLessExpressionEClass, UA_LESS_EXPRESSION__LEFT);
    createEReference(uaLessExpressionEClass, UA_LESS_EXPRESSION__RIGHT);

    uaLessEqualExpressionEClass = createEClass(UA_LESS_EQUAL_EXPRESSION);
    createEReference(uaLessEqualExpressionEClass, UA_LESS_EQUAL_EXPRESSION__LEFT);
    createEReference(uaLessEqualExpressionEClass, UA_LESS_EQUAL_EXPRESSION__RIGHT);

    uaGreaterEqualExpressionEClass = createEClass(UA_GREATER_EQUAL_EXPRESSION);
    createEReference(uaGreaterEqualExpressionEClass, UA_GREATER_EQUAL_EXPRESSION__LEFT);
    createEReference(uaGreaterEqualExpressionEClass, UA_GREATER_EQUAL_EXPRESSION__RIGHT);

    uaGreaterExpressionEClass = createEClass(UA_GREATER_EXPRESSION);
    createEReference(uaGreaterExpressionEClass, UA_GREATER_EXPRESSION__LEFT);
    createEReference(uaGreaterExpressionEClass, UA_GREATER_EXPRESSION__RIGHT);

    uaMinExpressionEClass = createEClass(UA_MIN_EXPRESSION);
    createEReference(uaMinExpressionEClass, UA_MIN_EXPRESSION__LEFT);
    createEReference(uaMinExpressionEClass, UA_MIN_EXPRESSION__RIGHT);

    uaMaxExpressionEClass = createEClass(UA_MAX_EXPRESSION);
    createEReference(uaMaxExpressionEClass, UA_MAX_EXPRESSION__LEFT);
    createEReference(uaMaxExpressionEClass, UA_MAX_EXPRESSION__RIGHT);

    uaBitLeftExpressionEClass = createEClass(UA_BIT_LEFT_EXPRESSION);
    createEReference(uaBitLeftExpressionEClass, UA_BIT_LEFT_EXPRESSION__LEFT);
    createEReference(uaBitLeftExpressionEClass, UA_BIT_LEFT_EXPRESSION__RIGHT);

    uaBitRightExpressionEClass = createEClass(UA_BIT_RIGHT_EXPRESSION);
    createEReference(uaBitRightExpressionEClass, UA_BIT_RIGHT_EXPRESSION__LEFT);
    createEReference(uaBitRightExpressionEClass, UA_BIT_RIGHT_EXPRESSION__RIGHT);

    uaAddExpressionEClass = createEClass(UA_ADD_EXPRESSION);
    createEReference(uaAddExpressionEClass, UA_ADD_EXPRESSION__LEFT);
    createEReference(uaAddExpressionEClass, UA_ADD_EXPRESSION__RIGHT);

    uaSubtractExpressionEClass = createEClass(UA_SUBTRACT_EXPRESSION);
    createEReference(uaSubtractExpressionEClass, UA_SUBTRACT_EXPRESSION__LEFT);
    createEReference(uaSubtractExpressionEClass, UA_SUBTRACT_EXPRESSION__RIGHT);

    uaMultiplyExpressionEClass = createEClass(UA_MULTIPLY_EXPRESSION);
    createEReference(uaMultiplyExpressionEClass, UA_MULTIPLY_EXPRESSION__LEFT);
    createEReference(uaMultiplyExpressionEClass, UA_MULTIPLY_EXPRESSION__RIGHT);

    uaDivideExpressionEClass = createEClass(UA_DIVIDE_EXPRESSION);
    createEReference(uaDivideExpressionEClass, UA_DIVIDE_EXPRESSION__LEFT);
    createEReference(uaDivideExpressionEClass, UA_DIVIDE_EXPRESSION__RIGHT);

    uaModuloExpressionEClass = createEClass(UA_MODULO_EXPRESSION);
    createEReference(uaModuloExpressionEClass, UA_MODULO_EXPRESSION__LEFT);
    createEReference(uaModuloExpressionEClass, UA_MODULO_EXPRESSION__RIGHT);

    uaPreIncrementExpressionEClass = createEClass(UA_PRE_INCREMENT_EXPRESSION);
    createEReference(uaPreIncrementExpressionEClass, UA_PRE_INCREMENT_EXPRESSION__EXPRESSION);

    uaPreDecrementExpressionEClass = createEClass(UA_PRE_DECREMENT_EXPRESSION);
    createEReference(uaPreDecrementExpressionEClass, UA_PRE_DECREMENT_EXPRESSION__EXPRESSION);

    uaLogicNotExpressionEClass = createEClass(UA_LOGIC_NOT_EXPRESSION);
    createEReference(uaLogicNotExpressionEClass, UA_LOGIC_NOT_EXPRESSION__EXPRESSION);

    uaMinusExpressionEClass = createEClass(UA_MINUS_EXPRESSION);
    createEReference(uaMinusExpressionEClass, UA_MINUS_EXPRESSION__EXPRESSION);

    uaPostIncrementExpressionEClass = createEClass(UA_POST_INCREMENT_EXPRESSION);
    createEReference(uaPostIncrementExpressionEClass, UA_POST_INCREMENT_EXPRESSION__EXPRESSION);

    uaPostDecrementExpressionEClass = createEClass(UA_POST_DECREMENT_EXPRESSION);
    createEReference(uaPostDecrementExpressionEClass, UA_POST_DECREMENT_EXPRESSION__EXPRESSION);

    uaStructExpressionEClass = createEClass(UA_STRUCT_EXPRESSION);
    createEReference(uaStructExpressionEClass, UA_STRUCT_EXPRESSION__LEFT);
    createEAttribute(uaStructExpressionEClass, UA_STRUCT_EXPRESSION__RIGHT);

    uaArrayExpressionEClass = createEClass(UA_ARRAY_EXPRESSION);
    createEReference(uaArrayExpressionEClass, UA_ARRAY_EXPRESSION__LEFT);
    createEReference(uaArrayExpressionEClass, UA_ARRAY_EXPRESSION__RIGHT);

    uaReferenceEClass = createEClass(UA_REFERENCE);
    createEAttribute(uaReferenceEClass, UA_REFERENCE__NAME);

    uaBooleanLiteralEClass = createEClass(UA_BOOLEAN_LITERAL);
    createEAttribute(uaBooleanLiteralEClass, UA_BOOLEAN_LITERAL__VALUE);

    uaNumberLiteralEClass = createEClass(UA_NUMBER_LITERAL);
    createEAttribute(uaNumberLiteralEClass, UA_NUMBER_LITERAL__VALUE);

    // Create enums
    uaSynchronisationTypeEEnum = createEEnum(UA_SYNCHRONISATION_TYPE);
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
    uaSystemDefinitionEClass.getESuperTypes().add(this.getTop());
    uaInstantiationEClass.getESuperTypes().add(this.getUADefinition());
    uaDeclarationsEClass.getESuperTypes().add(this.getTop());
    uaDeclarationEClass.getESuperTypes().add(this.getUADefinition());
    uaVariableDeclarationEClass.getESuperTypes().add(this.getUADeclaration());
    uaSingleInitialiserEClass.getESuperTypes().add(this.getUAInitialiser());
    uaMultiInitialiserEClass.getESuperTypes().add(this.getUAInitialiser());
    uaTypeDeclarationEClass.getESuperTypes().add(this.getUADeclaration());
    uaIntegerTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaClockTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaChannelTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaBooleanTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaScalarTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaStructTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaParametersEClass.getESuperTypes().add(this.getTop());
    uaExpressionEClass.getESuperTypes().add(this.getTop());
    uaSelectListEClass.getESuperTypes().add(this.getTop());
    uaUpdateEClass.getESuperTypes().add(this.getTop());
    uaSynchronisationEClass.getESuperTypes().add(this.getTop());
    uaUserTypeEClass.getESuperTypes().add(this.getUATypeIdentifier());
    uaForallExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaExistsExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaImplyExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaLogicOrExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaLogicAndExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaAdditionAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaSubtractionAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaMultiplicationAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaDivisionAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaModuloAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitOrAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitAndAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitXORAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitLeftAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitRightAssignmentExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaConditionalExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitOrExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitXORExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitAndExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaEqualExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaUnequalExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaLessExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaLessEqualExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaGreaterEqualExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaGreaterExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaMinExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaMaxExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitLeftExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaBitRightExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaAddExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaSubtractExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaMultiplyExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaDivideExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaModuloExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaPreIncrementExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaPreDecrementExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaLogicNotExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaMinusExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaPostIncrementExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaPostDecrementExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaStructExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaArrayExpressionEClass.getESuperTypes().add(this.getUAExpression());
    uaReferenceEClass.getESuperTypes().add(this.getUAExpression());
    uaBooleanLiteralEClass.getESuperTypes().add(this.getUAExpression());
    uaNumberLiteralEClass.getESuperTypes().add(this.getUAExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(topEClass, Top.class, "Top", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaSystemDefinitionEClass, UASystemDefinition.class, "UASystemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASystemDefinition_Definitions(), this.getUADefinition(), null, "definitions", null, 0, -1, UASystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUASystemDefinition_System(), this.getUASystem(), null, "system", null, 0, 1, UASystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaDefinitionEClass, UADefinition.class, "UADefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaInstantiationEClass, UAInstantiation.class, "UAInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAInstantiation_Parameters(), this.getUAParameters(), null, "parameters", null, 0, 1, UAInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUAInstantiation_Target(), ecorePackage.getEString(), "target", null, 0, 1, UAInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAInstantiation_Arguments(), this.getUAExpression(), null, "arguments", null, 0, -1, UAInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSystemEClass, UASystem.class, "UASystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASystem_Systems(), this.getUASystemID(), null, "systems", null, 0, -1, UASystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSystemIDEClass, UASystemID.class, "UASystemID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUASystemID_Name(), ecorePackage.getEString(), "name", null, 0, 1, UASystemID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaArrayDeclarationEClass, UAArrayDeclaration.class, "UAArrayDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAArrayDeclaration_Size(), this.getUAExpression(), null, "size", null, 0, 1, UAArrayDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaDeclarationsEClass, UADeclarations.class, "UADeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUADeclarations_Declarations(), this.getUADeclaration(), null, "declarations", null, 0, -1, UADeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaDeclarationEClass, UADeclaration.class, "UADeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaTypeEClass, UAType.class, "UAType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAType_Modifiers(), this.getUATypeModifiers(), null, "modifiers", null, 0, 1, UAType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAType_Identifier(), this.getUATypeIdentifier(), null, "identifier", null, 0, 1, UAType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaTypeModifiersEClass, UATypeModifiers.class, "UATypeModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUATypeModifiers_Urgent(), ecorePackage.getEBoolean(), "urgent", null, 0, 1, UATypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUATypeModifiers_Broadcast(), ecorePackage.getEBoolean(), "broadcast", null, 0, 1, UATypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUATypeModifiers_Meta(), ecorePackage.getEBoolean(), "meta", null, 0, 1, UATypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUATypeModifiers_Const(), ecorePackage.getEBoolean(), "const", null, 0, 1, UATypeModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaVariableDeclarationEClass, UAVariableDeclaration.class, "UAVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAVariableDeclaration_Type(), this.getUAType(), null, "type", null, 0, 1, UAVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAVariableDeclaration_Variables(), this.getUAVariableID(), null, "variables", null, 0, -1, UAVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaVariableIDEClass, UAVariableID.class, "UAVariableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAVariableID_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAVariableID_Dimensions(), this.getUAArrayDeclaration(), null, "dimensions", null, 0, -1, UAVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAVariableID_Initialiser(), this.getUAInitialiser(), null, "initialiser", null, 0, 1, UAVariableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaInitialiserEClass, UAInitialiser.class, "UAInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaSingleInitialiserEClass, UASingleInitialiser.class, "UASingleInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASingleInitialiser_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UASingleInitialiser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMultiInitialiserEClass, UAMultiInitialiser.class, "UAMultiInitialiser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMultiInitialiser_Initialisers(), this.getUAInitialiser(), null, "initialisers", null, 0, -1, UAMultiInitialiser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaTypeDeclarationEClass, UATypeDeclaration.class, "UATypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUATypeDeclaration_BaseType(), this.getUAType(), null, "baseType", null, 0, 1, UATypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUATypeDeclaration_Types(), this.getUATypeID(), null, "types", null, 0, -1, UATypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaTypeIDEClass, UATypeID.class, "UATypeID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUATypeID_Name(), ecorePackage.getEString(), "name", null, 0, 1, UATypeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUATypeID_Dimensions(), this.getUAArrayDeclaration(), null, "dimensions", null, 0, -1, UATypeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaTypeIdentifierEClass, UATypeIdentifier.class, "UATypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaIntegerTypeEClass, UAIntegerType.class, "UAIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAIntegerType_Min(), this.getUAExpression(), null, "min", null, 0, 1, UAIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAIntegerType_Max(), this.getUAExpression(), null, "max", null, 0, 1, UAIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaClockTypeEClass, UAClockType.class, "UAClockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaChannelTypeEClass, UAChannelType.class, "UAChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaBooleanTypeEClass, UABooleanType.class, "UABooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaScalarTypeEClass, UAScalarType.class, "UAScalarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAScalarType_Size(), this.getUAExpression(), null, "size", null, 0, 1, UAScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaStructTypeEClass, UAStructType.class, "UAStructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAStructType_Declarations(), this.getUAFieldDeclaration(), null, "declarations", null, 0, -1, UAStructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaFieldDeclarationEClass, UAFieldDeclaration.class, "UAFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAFieldDeclaration_Type(), this.getUAType(), null, "type", null, 0, 1, UAFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAFieldDeclaration_Fields(), this.getUAFieldID(), null, "fields", null, 0, -1, UAFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaFieldIDEClass, UAFieldID.class, "UAFieldID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAFieldID_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAFieldID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAFieldID_Dimensions(), this.getUAArrayDeclaration(), null, "dimensions", null, 0, -1, UAFieldID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaParametersEClass, UAParameters.class, "UAParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAParameters_Parameters(), this.getUAParameter(), null, "parameters", null, 0, -1, UAParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaParameterEClass, UAParameter.class, "UAParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAParameter_Type(), this.getUAType(), null, "type", null, 0, 1, UAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUAParameter_ByReference(), ecorePackage.getEBoolean(), "byReference", null, 0, 1, UAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUAParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAParameter_Dimensions(), this.getUAArrayDeclaration(), null, "dimensions", null, 0, -1, UAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaExpressionEClass, UAExpression.class, "UAExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uaSelectListEClass, UASelectList.class, "UASelectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASelectList_Selects(), this.getUASelect(), null, "selects", null, 0, -1, UASelectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSelectEClass, UASelect.class, "UASelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUASelect_Name(), ecorePackage.getEString(), "name", null, 0, 1, UASelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUASelect_Type(), this.getUAType(), null, "type", null, 0, 1, UASelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaUpdateEClass, UAUpdate.class, "UAUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAUpdate_Expressions(), this.getUAExpression(), null, "expressions", null, 0, -1, UAUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSynchronisationEClass, UASynchronisation.class, "UASynchronisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASynchronisation_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UASynchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUASynchronisation_Type(), this.getUASynchronisationType(), "type", null, 0, 1, UASynchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaUserTypeEClass, UAUserType.class, "UAUserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAUserType_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAUserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaForallExpressionEClass, UAForallExpression.class, "UAForallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAForallExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAForallExpression_Type(), this.getUAType(), null, "type", null, 0, 1, UAForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAForallExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAForallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaExistsExpressionEClass, UAExistsExpression.class, "UAExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAExistsExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAExistsExpression_Type(), this.getUAType(), null, "type", null, 0, 1, UAExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAExistsExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaImplyExpressionEClass, UAImplyExpression.class, "UAImplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAImplyExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAImplyExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAImplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaLogicOrExpressionEClass, UALogicOrExpression.class, "UALogicOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUALogicOrExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UALogicOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUALogicOrExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UALogicOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaLogicAndExpressionEClass, UALogicAndExpression.class, "UALogicAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUALogicAndExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UALogicAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUALogicAndExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UALogicAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaAssignmentExpressionEClass, UAAssignmentExpression.class, "UAAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaAdditionAssignmentExpressionEClass, UAAdditionAssignmentExpression.class, "UAAdditionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAAdditionAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAAdditionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAAdditionAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAAdditionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSubtractionAssignmentExpressionEClass, UASubtractionAssignmentExpression.class, "UASubtractionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASubtractionAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UASubtractionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUASubtractionAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UASubtractionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMultiplicationAssignmentExpressionEClass, UAMultiplicationAssignmentExpression.class, "UAMultiplicationAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMultiplicationAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAMultiplicationAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAMultiplicationAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAMultiplicationAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaDivisionAssignmentExpressionEClass, UADivisionAssignmentExpression.class, "UADivisionAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUADivisionAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UADivisionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUADivisionAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UADivisionAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaModuloAssignmentExpressionEClass, UAModuloAssignmentExpression.class, "UAModuloAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAModuloAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAModuloAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAModuloAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAModuloAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitOrAssignmentExpressionEClass, UABitOrAssignmentExpression.class, "UABitOrAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitOrAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitOrAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitOrAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitOrAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitAndAssignmentExpressionEClass, UABitAndAssignmentExpression.class, "UABitAndAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitAndAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitAndAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitAndAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitAndAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitXORAssignmentExpressionEClass, UABitXORAssignmentExpression.class, "UABitXORAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitXORAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitXORAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitXORAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitXORAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitLeftAssignmentExpressionEClass, UABitLeftAssignmentExpression.class, "UABitLeftAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitLeftAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitLeftAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitLeftAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitLeftAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitRightAssignmentExpressionEClass, UABitRightAssignmentExpression.class, "UABitRightAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitRightAssignmentExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitRightAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitRightAssignmentExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitRightAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaConditionalExpressionEClass, UAConditionalExpression.class, "UAConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAConditionalExpression_Condition(), this.getUAExpression(), null, "condition", null, 0, 1, UAConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAConditionalExpression_Then(), this.getUAExpression(), null, "then", null, 0, 1, UAConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAConditionalExpression_Else(), this.getUAExpression(), null, "else", null, 0, 1, UAConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitOrExpressionEClass, UABitOrExpression.class, "UABitOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitOrExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitOrExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitXORExpressionEClass, UABitXORExpression.class, "UABitXORExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitXORExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitXORExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitXORExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitXORExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitAndExpressionEClass, UABitAndExpression.class, "UABitAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitAndExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitAndExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaEqualExpressionEClass, UAEqualExpression.class, "UAEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAEqualExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAEqualExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaUnequalExpressionEClass, UAUnequalExpression.class, "UAUnequalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAUnequalExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAUnequalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAUnequalExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAUnequalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaLessExpressionEClass, UALessExpression.class, "UALessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUALessExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UALessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUALessExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UALessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaLessEqualExpressionEClass, UALessEqualExpression.class, "UALessEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUALessEqualExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UALessEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUALessEqualExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UALessEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaGreaterEqualExpressionEClass, UAGreaterEqualExpression.class, "UAGreaterEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAGreaterEqualExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAGreaterEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAGreaterEqualExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAGreaterEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaGreaterExpressionEClass, UAGreaterExpression.class, "UAGreaterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAGreaterExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAGreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAGreaterExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAGreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMinExpressionEClass, UAMinExpression.class, "UAMinExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMinExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAMinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAMinExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAMinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMaxExpressionEClass, UAMaxExpression.class, "UAMaxExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMaxExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAMaxExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAMaxExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAMaxExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitLeftExpressionEClass, UABitLeftExpression.class, "UABitLeftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitLeftExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitLeftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitLeftExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitLeftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBitRightExpressionEClass, UABitRightExpression.class, "UABitRightExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUABitRightExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UABitRightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUABitRightExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UABitRightExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaAddExpressionEClass, UAAddExpression.class, "UAAddExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAAddExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAAddExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAAddExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAAddExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaSubtractExpressionEClass, UASubtractExpression.class, "UASubtractExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUASubtractExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UASubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUASubtractExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UASubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMultiplyExpressionEClass, UAMultiplyExpression.class, "UAMultiplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMultiplyExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAMultiplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAMultiplyExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAMultiplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaDivideExpressionEClass, UADivideExpression.class, "UADivideExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUADivideExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UADivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUADivideExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UADivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaModuloExpressionEClass, UAModuloExpression.class, "UAModuloExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAModuloExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAModuloExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAModuloExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAModuloExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaPreIncrementExpressionEClass, UAPreIncrementExpression.class, "UAPreIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAPreIncrementExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAPreIncrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaPreDecrementExpressionEClass, UAPreDecrementExpression.class, "UAPreDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAPreDecrementExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAPreDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaLogicNotExpressionEClass, UALogicNotExpression.class, "UALogicNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUALogicNotExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UALogicNotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaMinusExpressionEClass, UAMinusExpression.class, "UAMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAMinusExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAMinusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaPostIncrementExpressionEClass, UAPostIncrementExpression.class, "UAPostIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAPostIncrementExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAPostIncrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaPostDecrementExpressionEClass, UAPostDecrementExpression.class, "UAPostDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAPostDecrementExpression_Expression(), this.getUAExpression(), null, "expression", null, 0, 1, UAPostDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaStructExpressionEClass, UAStructExpression.class, "UAStructExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAStructExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUAStructExpression_Right(), ecorePackage.getEString(), "right", null, 0, 1, UAStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaArrayExpressionEClass, UAArrayExpression.class, "UAArrayExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUAArrayExpression_Left(), this.getUAExpression(), null, "left", null, 0, 1, UAArrayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUAArrayExpression_Right(), this.getUAExpression(), null, "right", null, 0, 1, UAArrayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaReferenceEClass, UAReference.class, "UAReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUAReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, UAReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaBooleanLiteralEClass, UABooleanLiteral.class, "UABooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUABooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, UABooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uaNumberLiteralEClass, UANumberLiteral.class, "UANumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUANumberLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, UANumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(uaSynchronisationTypeEEnum, UASynchronisationType.class, "UASynchronisationType");
    addEEnumLiteral(uaSynchronisationTypeEEnum, UASynchronisationType.EMISSION);
    addEEnumLiteral(uaSynchronisationTypeEEnum, UASynchronisationType.RECEPTION);

    // Create resource
    createResource(eNS_URI);
  }

} //DescriptionPackageImpl
