/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextFactory
 * @model kind="package"
 * @generated
 */
public interface EcdarTextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ecdarText";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itu.dk/ecdar/text/EcdarText";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ecdarText";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EcdarTextPackage eINSTANCE = dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFileImpl <em>ET File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETFileImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFile()
   * @generated
   */
  int ET_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FILE__DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FILE__SPECIFICATIONS = 2;

  /**
   * The number of structural features of the '<em>ET File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETImportImpl <em>ET Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETImportImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETImport()
   * @generated
   */
  int ET_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>ET Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETArrayDeclarationImpl <em>ET Array Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETArrayDeclarationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETArrayDeclaration()
   * @generated
   */
  int ET_ARRAY_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ARRAY_DECLARATION__SIZE = 0;

  /**
   * The number of structural features of the '<em>ET Array Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ARRAY_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDeclarationsImpl <em>ET Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETDeclarationsImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDeclarations()
   * @generated
   */
  int ET_DECLARATIONS = 3;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DECLARATIONS__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>ET Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DECLARATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDeclarationImpl <em>ET Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETDeclarationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDeclaration()
   * @generated
   */
  int ET_DECLARATION = 4;

  /**
   * The number of structural features of the '<em>ET Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl <em>ET Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETType()
   * @generated
   */
  int ET_TYPE = 5;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE__IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>ET Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeModifiersImpl <em>ET Type Modifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeModifiersImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeModifiers()
   * @generated
   */
  int ET_TYPE_MODIFIERS = 6;

  /**
   * The feature id for the '<em><b>Urgent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_MODIFIERS__URGENT = 0;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_MODIFIERS__META = 1;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_MODIFIERS__CONST = 2;

  /**
   * The number of structural features of the '<em>ET Type Modifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_MODIFIERS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableDeclarationImpl <em>ET Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETVariableDeclarationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETVariableDeclaration()
   * @generated
   */
  int ET_VARIABLE_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_DECLARATION__TYPE = ET_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_DECLARATION__VARIABLES = ET_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_DECLARATION_FEATURE_COUNT = ET_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl <em>ET Variable ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETVariableID()
   * @generated
   */
  int ET_VARIABLE_ID = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Io Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_ID__IO_TYPE = 1;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_ID__DIMENSIONS = 2;

  /**
   * The feature id for the '<em><b>Initialiser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_ID__INITIALISER = 3;

  /**
   * The number of structural features of the '<em>ET Variable ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_VARIABLE_ID_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETInitialiserImpl <em>ET Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETInitialiserImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETInitialiser()
   * @generated
   */
  int ET_INITIALISER = 9;

  /**
   * The number of structural features of the '<em>ET Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_INITIALISER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSingleInitialiserImpl <em>ET Single Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSingleInitialiserImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSingleInitialiser()
   * @generated
   */
  int ET_SINGLE_INITIALISER = 10;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SINGLE_INITIALISER__EXPRESSION = ET_INITIALISER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Single Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SINGLE_INITIALISER_FEATURE_COUNT = ET_INITIALISER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiInitialiserImpl <em>ET Multi Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiInitialiserImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiInitialiser()
   * @generated
   */
  int ET_MULTI_INITIALISER = 11;

  /**
   * The feature id for the '<em><b>Initialisers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTI_INITIALISER__INITIALISERS = ET_INITIALISER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Multi Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTI_INITIALISER_FEATURE_COUNT = ET_INITIALISER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl <em>ET Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeDeclaration()
   * @generated
   */
  int ET_TYPE_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_DECLARATION__BASE_TYPE = ET_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_DECLARATION__TYPES = ET_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_DECLARATION_FEATURE_COUNT = ET_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeIDImpl <em>ET Type ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeIDImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeID()
   * @generated
   */
  int ET_TYPE_ID = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_ID__DIMENSIONS = 1;

  /**
   * The number of structural features of the '<em>ET Type ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeIdentifierImpl <em>ET Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeIdentifierImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeIdentifier()
   * @generated
   */
  int ET_TYPE_IDENTIFIER = 14;

  /**
   * The number of structural features of the '<em>ET Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_IDENTIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl <em>ET Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIntegerType()
   * @generated
   */
  int ET_INTEGER_TYPE = 15;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_INTEGER_TYPE__MIN = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_INTEGER_TYPE__MAX = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_INTEGER_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETClockTypeImpl <em>ET Clock Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETClockTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETClockType()
   * @generated
   */
  int ET_CLOCK_TYPE = 16;

  /**
   * The number of structural features of the '<em>ET Clock Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_CLOCK_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETActionTypeImpl <em>ET Action Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETActionTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETActionType()
   * @generated
   */
  int ET_ACTION_TYPE = 17;

  /**
   * The number of structural features of the '<em>ET Action Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ACTION_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETInputTypeImpl <em>ET Input Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETInputTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETInputType()
   * @generated
   */
  int ET_INPUT_TYPE = 18;

  /**
   * The number of structural features of the '<em>ET Input Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_INPUT_TYPE_FEATURE_COUNT = ET_ACTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETOutputTypeImpl <em>ET Output Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETOutputTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETOutputType()
   * @generated
   */
  int ET_OUTPUT_TYPE = 19;

  /**
   * The number of structural features of the '<em>ET Output Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_OUTPUT_TYPE_FEATURE_COUNT = ET_ACTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBooleanTypeImpl <em>ET Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBooleanTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBooleanType()
   * @generated
   */
  int ET_BOOLEAN_TYPE = 20;

  /**
   * The number of structural features of the '<em>ET Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BOOLEAN_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETScalarTypeImpl <em>ET Scalar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETScalarTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETScalarType()
   * @generated
   */
  int ET_SCALAR_TYPE = 21;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SCALAR_TYPE__SIZE = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Scalar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SCALAR_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETStructTypeImpl <em>ET Struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETStructTypeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETStructType()
   * @generated
   */
  int ET_STRUCT_TYPE = 22;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_STRUCT_TYPE__DECLARATIONS = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_STRUCT_TYPE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldDeclarationImpl <em>ET Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETFieldDeclarationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFieldDeclaration()
   * @generated
   */
  int ET_FIELD_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_DECLARATION__FIELDS = 1;

  /**
   * The number of structural features of the '<em>ET Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl <em>ET Field ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFieldID()
   * @generated
   */
  int ET_FIELD_ID = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_ID__DIMENSIONS = 1;

  /**
   * The number of structural features of the '<em>ET Field ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FIELD_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationExpressionImpl <em>ET Specification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationExpression()
   * @generated
   */
  int ET_SPECIFICATION_EXPRESSION = 25;

  /**
   * The number of structural features of the '<em>ET Specification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationImpl <em>ET Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecification()
   * @generated
   */
  int ET_SPECIFICATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION__NAME = 0;

  /**
   * The number of structural features of the '<em>ET Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBindingImpl <em>ET Specification Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBindingImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationBinding()
   * @generated
   */
  int ET_SPECIFICATION_BINDING = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BINDING__NAME = ET_SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BINDING__EXPRESSION = ET_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Specification Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BINDING_FEATURE_COUNT = ET_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDefinitionImpl <em>ET Specification Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDefinitionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationDefinition()
   * @generated
   */
  int ET_SPECIFICATION_DEFINITION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DEFINITION__NAME = ET_SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DEFINITION__BODY = ET_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Specification Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DEFINITION_FEATURE_COUNT = ET_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationTemplateImpl <em>ET Specification Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationTemplateImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationTemplate()
   * @generated
   */
  int ET_SPECIFICATION_TEMPLATE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_TEMPLATE__NAME = ET_SPECIFICATION_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_TEMPLATE__BODY = ET_SPECIFICATION_DEFINITION__BODY;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_TEMPLATE__PARAMETERS = ET_SPECIFICATION_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Specification Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_TEMPLATE_FEATURE_COUNT = ET_SPECIFICATION_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl <em>ET Specification Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationBody()
   * @generated
   */
  int ET_SPECIFICATION_BODY = 30;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BODY__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Initial Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BODY__INITIAL_LOCATION = 1;

  /**
   * The feature id for the '<em><b>Locations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BODY__LOCATIONS = 2;

  /**
   * The number of structural features of the '<em>ET Specification Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETParameterImpl <em>ET Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETParameterImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETParameter()
   * @generated
   */
  int ET_PARAMETER = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PARAMETER__DIMENSIONS = 2;

  /**
   * The number of structural features of the '<em>ET Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl <em>ET Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLocation()
   * @generated
   */
  int ET_LOCATION = 32;

  /**
   * The feature id for the '<em><b>Urgent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION__URGENT = 0;

  /**
   * The feature id for the '<em><b>Universal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION__UNIVERSAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION__NAME = 2;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION__INVARIANTS = 3;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION__EDGES = 4;

  /**
   * The number of structural features of the '<em>ET Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOCATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl <em>ET Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETEdge()
   * @generated
   */
  int ET_EDGE = 33;

  /**
   * The feature id for the '<em><b>Controllable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__CONTROLLABLE = 0;

  /**
   * The feature id for the '<em><b>Selects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__SELECTS = 1;

  /**
   * The feature id for the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__IO = 2;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__GUARD = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__TARGET = 4;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE__UPDATES = 5;

  /**
   * The number of structural features of the '<em>ET Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EDGE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETIOImpl <em>ETIO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETIOImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIO()
   * @generated
   */
  int ETIO = 34;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIO__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIO__TYPE = 1;

  /**
   * The number of structural features of the '<em>ETIO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSelectImpl <em>ET Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSelectImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSelect()
   * @generated
   */
  int ET_SELECT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SELECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SELECT__TYPE = 1;

  /**
   * The number of structural features of the '<em>ET Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SELECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETExpressionImpl <em>ET Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETExpression()
   * @generated
   */
  int ET_EXPRESSION = 36;

  /**
   * The number of structural features of the '<em>ET Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeReferenceImpl <em>ET Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeReferenceImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeReference()
   * @generated
   */
  int ET_TYPE_REFERENCE = 37;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_REFERENCE__TARGET = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_TYPE_REFERENCE_FEATURE_COUNT = ET_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDisjunctionExpressionImpl <em>ET Specification Disjunction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDisjunctionExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationDisjunctionExpression()
   * @generated
   */
  int ET_SPECIFICATION_DISJUNCTION_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DISJUNCTION_EXPRESSION__LEFT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DISJUNCTION_EXPRESSION__RIGHT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Specification Disjunction Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_DISJUNCTION_EXPRESSION_FEATURE_COUNT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationConjunctionExpressionImpl <em>ET Specification Conjunction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationConjunctionExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationConjunctionExpression()
   * @generated
   */
  int ET_SPECIFICATION_CONJUNCTION_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_CONJUNCTION_EXPRESSION__LEFT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_CONJUNCTION_EXPRESSION__RIGHT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Specification Conjunction Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_CONJUNCTION_EXPRESSION_FEATURE_COUNT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationCompositionExpressionImpl <em>ET Specification Composition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationCompositionExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationCompositionExpression()
   * @generated
   */
  int ET_SPECIFICATION_COMPOSITION_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_COMPOSITION_EXPRESSION__LEFT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_COMPOSITION_EXPRESSION__RIGHT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Specification Composition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_COMPOSITION_EXPRESSION_FEATURE_COUNT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationReferenceImpl <em>ET Specification Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationReferenceImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationReference()
   * @generated
   */
  int ET_SPECIFICATION_REFERENCE = 41;

  /**
   * The feature id for the '<em><b>Specification</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_REFERENCE__SPECIFICATION = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Specification Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_REFERENCE_FEATURE_COUNT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl <em>ET Specification Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationInstantiation()
   * @generated
   */
  int ET_SPECIFICATION_INSTANTIATION = 42;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_INSTANTIATION__TEMPLATE = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_INSTANTIATION__ARGUMENTS = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Specification Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SPECIFICATION_INSTANTIATION_FEATURE_COUNT = ET_SPECIFICATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETForallExpressionImpl <em>ET Forall Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETForallExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETForallExpression()
   * @generated
   */
  int ET_FORALL_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FORALL_EXPRESSION__NAME = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FORALL_EXPRESSION__TYPE = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FORALL_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ET Forall Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_FORALL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETExistsExpressionImpl <em>ET Exists Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETExistsExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETExistsExpression()
   * @generated
   */
  int ET_EXISTS_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EXISTS_EXPRESSION__NAME = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EXISTS_EXPRESSION__TYPE = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EXISTS_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ET Exists Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EXISTS_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETImplyExpressionImpl <em>ET Imply Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETImplyExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETImplyExpression()
   * @generated
   */
  int ET_IMPLY_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_IMPLY_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_IMPLY_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Imply Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_IMPLY_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicOrExpressionImpl <em>ET Logic Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicOrExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicOrExpression()
   * @generated
   */
  int ET_LOGIC_OR_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_OR_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_OR_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Logic Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_OR_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicAndExpressionImpl <em>ET Logic And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicAndExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicAndExpression()
   * @generated
   */
  int ET_LOGIC_AND_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_AND_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_AND_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Logic And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_AND_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAssignmentExpressionImpl <em>ET Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAssignmentExpression()
   * @generated
   */
  int ET_ASSIGNMENT_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAdditionAssignmentExpressionImpl <em>ET Addition Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETAdditionAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAdditionAssignmentExpression()
   * @generated
   */
  int ET_ADDITION_ASSIGNMENT_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADDITION_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Addition Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADDITION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSubtractionAssignmentExpressionImpl <em>ET Subtraction Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSubtractionAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSubtractionAssignmentExpression()
   * @generated
   */
  int ET_SUBTRACTION_ASSIGNMENT_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Subtraction Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACTION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiplicationAssignmentExpressionImpl <em>ET Multiplication Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiplicationAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiplicationAssignmentExpression()
   * @generated
   */
  int ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Multiplication Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDivisionAssignmentExpressionImpl <em>ET Division Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETDivisionAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDivisionAssignmentExpression()
   * @generated
   */
  int ET_DIVISION_ASSIGNMENT_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVISION_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Division Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVISION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETModuloAssignmentExpressionImpl <em>ET Modulo Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETModuloAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETModuloAssignmentExpression()
   * @generated
   */
  int ET_MODULO_ASSIGNMENT_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Modulo Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitOrAssignmentExpressionImpl <em>ET Bit Or Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitOrAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitOrAssignmentExpression()
   * @generated
   */
  int ET_BIT_OR_ASSIGNMENT_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Or Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitAndAssignmentExpressionImpl <em>ET Bit And Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitAndAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitAndAssignmentExpression()
   * @generated
   */
  int ET_BIT_AND_ASSIGNMENT_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit And Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitXORAssignmentExpressionImpl <em>ET Bit XOR Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitXORAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitXORAssignmentExpression()
   * @generated
   */
  int ET_BIT_XOR_ASSIGNMENT_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit XOR Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitLeftAssignmentExpressionImpl <em>ET Bit Left Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitLeftAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitLeftAssignmentExpression()
   * @generated
   */
  int ET_BIT_LEFT_ASSIGNMENT_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Left Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitRightAssignmentExpressionImpl <em>ET Bit Right Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitRightAssignmentExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitRightAssignmentExpression()
   * @generated
   */
  int ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION = 58;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Right Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl <em>ET Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETConditionalExpression()
   * @generated
   */
  int ET_CONDITIONAL_EXPRESSION = 59;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_CONDITIONAL_EXPRESSION__CONDITION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_CONDITIONAL_EXPRESSION__THEN = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_CONDITIONAL_EXPRESSION__ELSE = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ET Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_CONDITIONAL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitOrExpressionImpl <em>ET Bit Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitOrExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitOrExpression()
   * @generated
   */
  int ET_BIT_OR_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_OR_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitXORExpressionImpl <em>ET Bit XOR Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitXORExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitXORExpression()
   * @generated
   */
  int ET_BIT_XOR_EXPRESSION = 61;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit XOR Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_XOR_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitAndExpressionImpl <em>ET Bit And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitAndExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitAndExpression()
   * @generated
   */
  int ET_BIT_AND_EXPRESSION = 62;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_AND_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETEqualExpressionImpl <em>ET Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETEqualExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETEqualExpression()
   * @generated
   */
  int ET_EQUAL_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EQUAL_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EQUAL_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_EQUAL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETUnequalExpressionImpl <em>ET Unequal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETUnequalExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETUnequalExpression()
   * @generated
   */
  int ET_UNEQUAL_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_UNEQUAL_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_UNEQUAL_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Unequal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_UNEQUAL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLessExpressionImpl <em>ET Less Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLessExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLessExpression()
   * @generated
   */
  int ET_LESS_EXPRESSION = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Less Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLessEqualExpressionImpl <em>ET Less Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLessEqualExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLessEqualExpression()
   * @generated
   */
  int ET_LESS_EQUAL_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EQUAL_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EQUAL_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Less Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LESS_EQUAL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETGreaterEqualExpressionImpl <em>ET Greater Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETGreaterEqualExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETGreaterEqualExpression()
   * @generated
   */
  int ET_GREATER_EQUAL_EXPRESSION = 67;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EQUAL_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EQUAL_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Greater Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EQUAL_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETGreaterExpressionImpl <em>ET Greater Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETGreaterExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETGreaterExpression()
   * @generated
   */
  int ET_GREATER_EXPRESSION = 68;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Greater Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_GREATER_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMinExpressionImpl <em>ET Min Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMinExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMinExpression()
   * @generated
   */
  int ET_MIN_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MIN_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MIN_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Min Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MIN_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMaxExpressionImpl <em>ET Max Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMaxExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMaxExpression()
   * @generated
   */
  int ET_MAX_EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MAX_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MAX_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Max Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MAX_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitLeftExpressionImpl <em>ET Bit Left Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitLeftExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitLeftExpression()
   * @generated
   */
  int ET_BIT_LEFT_EXPRESSION = 71;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Left Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_LEFT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitRightExpressionImpl <em>ET Bit Right Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBitRightExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitRightExpression()
   * @generated
   */
  int ET_BIT_RIGHT_EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Bit Right Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BIT_RIGHT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAddExpressionImpl <em>ET Add Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETAddExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAddExpression()
   * @generated
   */
  int ET_ADD_EXPRESSION = 73;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADD_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADD_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Add Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ADD_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSubtractExpressionImpl <em>ET Subtract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETSubtractExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSubtractExpression()
   * @generated
   */
  int ET_SUBTRACT_EXPRESSION = 74;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACT_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACT_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Subtract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_SUBTRACT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiplyExpressionImpl <em>ET Multiply Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiplyExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiplyExpression()
   * @generated
   */
  int ET_MULTIPLY_EXPRESSION = 75;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLY_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLY_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Multiply Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MULTIPLY_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDivideExpressionImpl <em>ET Divide Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETDivideExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDivideExpression()
   * @generated
   */
  int ET_DIVIDE_EXPRESSION = 76;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVIDE_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVIDE_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Divide Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_DIVIDE_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETModuloExpressionImpl <em>ET Modulo Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETModuloExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETModuloExpression()
   * @generated
   */
  int ET_MODULO_EXPRESSION = 77;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Modulo Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MODULO_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPreIncrementExpressionImpl <em>ET Pre Increment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETPreIncrementExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPreIncrementExpression()
   * @generated
   */
  int ET_PRE_INCREMENT_EXPRESSION = 78;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PRE_INCREMENT_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Pre Increment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PRE_INCREMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPreDecrementExpressionImpl <em>ET Pre Decrement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETPreDecrementExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPreDecrementExpression()
   * @generated
   */
  int ET_PRE_DECREMENT_EXPRESSION = 79;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PRE_DECREMENT_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Pre Decrement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_PRE_DECREMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicNotExpressionImpl <em>ET Logic Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicNotExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicNotExpression()
   * @generated
   */
  int ET_LOGIC_NOT_EXPRESSION = 80;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_NOT_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Logic Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_LOGIC_NOT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMinusExpressionImpl <em>ET Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETMinusExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMinusExpression()
   * @generated
   */
  int ET_MINUS_EXPRESSION = 81;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MINUS_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Minus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_MINUS_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPostIncrementExpressionImpl <em>ET Post Increment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETPostIncrementExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPostIncrementExpression()
   * @generated
   */
  int ET_POST_INCREMENT_EXPRESSION = 82;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_POST_INCREMENT_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Post Increment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_POST_INCREMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPostDecrementExpressionImpl <em>ET Post Decrement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETPostDecrementExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPostDecrementExpression()
   * @generated
   */
  int ET_POST_DECREMENT_EXPRESSION = 83;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_POST_DECREMENT_EXPRESSION__EXPRESSION = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Post Decrement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_POST_DECREMENT_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETArrayExpressionImpl <em>ET Array Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETArrayExpressionImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETArrayExpression()
   * @generated
   */
  int ET_ARRAY_EXPRESSION = 84;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ARRAY_EXPRESSION__LEFT = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ARRAY_EXPRESSION__RIGHT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ET Array Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_ARRAY_EXPRESSION_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl <em>ET Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETReference()
   * @generated
   */
  int ET_REFERENCE = 85;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_REFERENCE__TARGET = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_REFERENCE_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBooleanLiteralImpl <em>ET Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETBooleanLiteralImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBooleanLiteral()
   * @generated
   */
  int ET_BOOLEAN_LITERAL = 86;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BOOLEAN_LITERAL__VALUE = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_BOOLEAN_LITERAL_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl <em>ET Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETNumberLiteral()
   * @generated
   */
  int ET_NUMBER_LITERAL = 87;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_NUMBER_LITERAL__VALUE = ET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ET Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ET_NUMBER_LITERAL_FEATURE_COUNT = ET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.itu.ecdar.text.ecdarText.ETIOType <em>ETIO Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIOType()
   * @generated
   */
  int ETIO_TYPE = 88;


  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETFile <em>ET File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET File</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFile
   * @generated
   */
  EClass getETFile();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFile#getImports()
   * @see #getETFile()
   * @generated
   */
  EReference getETFile_Imports();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETFile#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declarations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFile#getDeclarations()
   * @see #getETFile()
   * @generated
   */
  EReference getETFile_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETFile#getSpecifications <em>Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specifications</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFile#getSpecifications()
   * @see #getETFile()
   * @generated
   */
  EReference getETFile_Specifications();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETImport <em>ET Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Import</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETImport
   * @generated
   */
  EClass getETImport();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETImport#getImportedNamespace()
   * @see #getETImport()
   * @generated
   */
  EAttribute getETImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration <em>ET Array Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Array Declaration</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayDeclaration
   * @generated
   */
  EClass getETArrayDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayDeclaration#getSize()
   * @see #getETArrayDeclaration()
   * @generated
   */
  EReference getETArrayDeclaration_Size();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETDeclarations <em>ET Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Declarations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDeclarations
   * @generated
   */
  EClass getETDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETDeclarations#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDeclarations#getDeclarations()
   * @see #getETDeclarations()
   * @generated
   */
  EReference getETDeclarations_Declarations();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETDeclaration <em>ET Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Declaration</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDeclaration
   * @generated
   */
  EClass getETDeclaration();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETType <em>ET Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETType
   * @generated
   */
  EClass getETType();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETType#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifiers</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETType#getModifiers()
   * @see #getETType()
   * @generated
   */
  EReference getETType_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETType#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETType#getIdentifier()
   * @see #getETType()
   * @generated
   */
  EReference getETType_Identifier();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers <em>ET Type Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type Modifiers</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeModifiers
   * @generated
   */
  EClass getETTypeModifiers();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isUrgent <em>Urgent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Urgent</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isUrgent()
   * @see #getETTypeModifiers()
   * @generated
   */
  EAttribute getETTypeModifiers_Urgent();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isMeta()
   * @see #getETTypeModifiers()
   * @generated
   */
  EAttribute getETTypeModifiers_Meta();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isConst()
   * @see #getETTypeModifiers()
   * @generated
   */
  EAttribute getETTypeModifiers_Const();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration <em>ET Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Variable Declaration</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableDeclaration
   * @generated
   */
  EClass getETVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getType()
   * @see #getETVariableDeclaration()
   * @generated
   */
  EReference getETVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getVariables()
   * @see #getETVariableDeclaration()
   * @generated
   */
  EReference getETVariableDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETVariableID <em>ET Variable ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Variable ID</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID
   * @generated
   */
  EClass getETVariableID();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID#getName()
   * @see #getETVariableID()
   * @generated
   */
  EAttribute getETVariableID_Name();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getIoType <em>Io Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Io Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID#getIoType()
   * @see #getETVariableID()
   * @generated
   */
  EAttribute getETVariableID_IoType();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID#getDimensions()
   * @see #getETVariableID()
   * @generated
   */
  EReference getETVariableID_Dimensions();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getInitialiser <em>Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialiser</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETVariableID#getInitialiser()
   * @see #getETVariableID()
   * @generated
   */
  EReference getETVariableID_Initialiser();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETInitialiser <em>ET Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Initialiser</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETInitialiser
   * @generated
   */
  EClass getETInitialiser();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSingleInitialiser <em>ET Single Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Single Initialiser</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSingleInitialiser
   * @generated
   */
  EClass getETSingleInitialiser();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSingleInitialiser#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSingleInitialiser#getExpression()
   * @see #getETSingleInitialiser()
   * @generated
   */
  EReference getETSingleInitialiser_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMultiInitialiser <em>ET Multi Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Multi Initialiser</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiInitialiser
   * @generated
   */
  EClass getETMultiInitialiser();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETMultiInitialiser#getInitialisers <em>Initialisers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisers</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiInitialiser#getInitialisers()
   * @see #getETMultiInitialiser()
   * @generated
   */
  EReference getETMultiInitialiser_Initialisers();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration <em>ET Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type Declaration</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeDeclaration
   * @generated
   */
  EClass getETTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getBaseType()
   * @see #getETTypeDeclaration()
   * @generated
   */
  EReference getETTypeDeclaration_BaseType();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getTypes()
   * @see #getETTypeDeclaration()
   * @generated
   */
  EReference getETTypeDeclaration_Types();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETTypeID <em>ET Type ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type ID</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeID
   * @generated
   */
  EClass getETTypeID();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETTypeID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeID#getName()
   * @see #getETTypeID()
   * @generated
   */
  EAttribute getETTypeID_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETTypeID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeID#getDimensions()
   * @see #getETTypeID()
   * @generated
   */
  EReference getETTypeID_Dimensions();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETTypeIdentifier <em>ET Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type Identifier</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeIdentifier
   * @generated
   */
  EClass getETTypeIdentifier();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType <em>ET Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Integer Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIntegerType
   * @generated
   */
  EClass getETIntegerType();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIntegerType#getMin()
   * @see #getETIntegerType()
   * @generated
   */
  EReference getETIntegerType_Min();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIntegerType#getMax()
   * @see #getETIntegerType()
   * @generated
   */
  EReference getETIntegerType_Max();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETClockType <em>ET Clock Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Clock Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETClockType
   * @generated
   */
  EClass getETClockType();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETActionType <em>ET Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Action Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETActionType
   * @generated
   */
  EClass getETActionType();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETInputType <em>ET Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Input Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETInputType
   * @generated
   */
  EClass getETInputType();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETOutputType <em>ET Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Output Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETOutputType
   * @generated
   */
  EClass getETOutputType();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBooleanType <em>ET Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Boolean Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBooleanType
   * @generated
   */
  EClass getETBooleanType();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETScalarType <em>ET Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Scalar Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETScalarType
   * @generated
   */
  EClass getETScalarType();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETScalarType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETScalarType#getSize()
   * @see #getETScalarType()
   * @generated
   */
  EReference getETScalarType_Size();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETStructType <em>ET Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Struct Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETStructType
   * @generated
   */
  EClass getETStructType();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETStructType#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETStructType#getDeclarations()
   * @see #getETStructType()
   * @generated
   */
  EReference getETStructType_Declarations();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETFieldDeclaration <em>ET Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Field Declaration</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldDeclaration
   * @generated
   */
  EClass getETFieldDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETFieldDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldDeclaration#getType()
   * @see #getETFieldDeclaration()
   * @generated
   */
  EReference getETFieldDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETFieldDeclaration#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldDeclaration#getFields()
   * @see #getETFieldDeclaration()
   * @generated
   */
  EReference getETFieldDeclaration_Fields();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETFieldID <em>ET Field ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Field ID</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldID
   * @generated
   */
  EClass getETFieldID();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldID#getName()
   * @see #getETFieldID()
   * @generated
   */
  EAttribute getETFieldID_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETFieldID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETFieldID#getDimensions()
   * @see #getETFieldID()
   * @generated
   */
  EReference getETFieldID_Dimensions();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationExpression <em>ET Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationExpression
   * @generated
   */
  EClass getETSpecificationExpression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecification <em>ET Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecification
   * @generated
   */
  EClass getETSpecification();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecification#getName()
   * @see #getETSpecification()
   * @generated
   */
  EAttribute getETSpecification_Name();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBinding <em>ET Specification Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Binding</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBinding
   * @generated
   */
  EClass getETSpecificationBinding();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBinding#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBinding#getExpression()
   * @see #getETSpecificationBinding()
   * @generated
   */
  EReference getETSpecificationBinding_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition <em>ET Specification Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Definition</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition
   * @generated
   */
  EClass getETSpecificationDefinition();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition#getBody()
   * @see #getETSpecificationDefinition()
   * @generated
   */
  EReference getETSpecificationDefinition_Body();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate <em>ET Specification Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Template</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate
   * @generated
   */
  EClass getETSpecificationTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate#getParameters()
   * @see #getETSpecificationTemplate()
   * @generated
   */
  EReference getETSpecificationTemplate_Parameters();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody <em>ET Specification Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Body</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBody
   * @generated
   */
  EClass getETSpecificationBody();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declarations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getDeclarations()
   * @see #getETSpecificationBody()
   * @generated
   */
  EReference getETSpecificationBody_Declarations();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getInitialLocation <em>Initial Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Location</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getInitialLocation()
   * @see #getETSpecificationBody()
   * @generated
   */
  EReference getETSpecificationBody_InitialLocation();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getLocations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locations</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getLocations()
   * @see #getETSpecificationBody()
   * @generated
   */
  EReference getETSpecificationBody_Locations();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETParameter <em>ET Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Parameter</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETParameter
   * @generated
   */
  EClass getETParameter();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETParameter#getType()
   * @see #getETParameter()
   * @generated
   */
  EReference getETParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETParameter#getName()
   * @see #getETParameter()
   * @generated
   */
  EAttribute getETParameter_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETParameter#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETParameter#getDimensions()
   * @see #getETParameter()
   * @generated
   */
  EReference getETParameter_Dimensions();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLocation <em>ET Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Location</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation
   * @generated
   */
  EClass getETLocation();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUrgent <em>Urgent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Urgent</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation#isUrgent()
   * @see #getETLocation()
   * @generated
   */
  EAttribute getETLocation_Urgent();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUniversal <em>Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Universal</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation#isUniversal()
   * @see #getETLocation()
   * @generated
   */
  EAttribute getETLocation_Universal();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETLocation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation#getName()
   * @see #getETLocation()
   * @generated
   */
  EAttribute getETLocation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETLocation#getInvariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Invariants</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation#getInvariants()
   * @see #getETLocation()
   * @generated
   */
  EReference getETLocation_Invariants();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETLocation#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLocation#getEdges()
   * @see #getETLocation()
   * @generated
   */
  EReference getETLocation_Edges();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETEdge <em>ET Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Edge</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge
   * @generated
   */
  EClass getETEdge();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETEdge#isControllable <em>Controllable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Controllable</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#isControllable()
   * @see #getETEdge()
   * @generated
   */
  EAttribute getETEdge_Controllable();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getSelects <em>Selects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selects</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#getSelects()
   * @see #getETEdge()
   * @generated
   */
  EReference getETEdge_Selects();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getIo <em>Io</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Io</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#getIo()
   * @see #getETEdge()
   * @generated
   */
  EReference getETEdge_Io();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#getGuard()
   * @see #getETEdge()
   * @generated
   */
  EReference getETEdge_Guard();

  /**
   * Returns the meta object for the reference '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#getTarget()
   * @see #getETEdge()
   * @generated
   */
  EReference getETEdge_Target();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Updates</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEdge#getUpdates()
   * @see #getETEdge()
   * @generated
   */
  EReference getETEdge_Updates();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETIO <em>ETIO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETIO</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIO
   * @generated
   */
  EClass getETIO();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETIO#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIO#getExpression()
   * @see #getETIO()
   * @generated
   */
  EReference getETIO_Expression();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETIO#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIO#getType()
   * @see #getETIO()
   * @generated
   */
  EAttribute getETIO_Type();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSelect <em>ET Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Select</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSelect
   * @generated
   */
  EClass getETSelect();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETSelect#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSelect#getName()
   * @see #getETSelect()
   * @generated
   */
  EAttribute getETSelect_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSelect#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSelect#getType()
   * @see #getETSelect()
   * @generated
   */
  EReference getETSelect_Type();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETExpression <em>ET Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETExpression
   * @generated
   */
  EClass getETExpression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETTypeReference <em>ET Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Type Reference</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeReference
   * @generated
   */
  EClass getETTypeReference();

  /**
   * Returns the meta object for the reference '{@link dk.itu.ecdar.text.ecdarText.ETTypeReference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETTypeReference#getTarget()
   * @see #getETTypeReference()
   * @generated
   */
  EReference getETTypeReference_Target();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression <em>ET Specification Disjunction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Disjunction Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression
   * @generated
   */
  EClass getETSpecificationDisjunctionExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression#getLeft()
   * @see #getETSpecificationDisjunctionExpression()
   * @generated
   */
  EReference getETSpecificationDisjunctionExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationDisjunctionExpression#getRight()
   * @see #getETSpecificationDisjunctionExpression()
   * @generated
   */
  EReference getETSpecificationDisjunctionExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression <em>ET Specification Conjunction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Conjunction Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression
   * @generated
   */
  EClass getETSpecificationConjunctionExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression#getLeft()
   * @see #getETSpecificationConjunctionExpression()
   * @generated
   */
  EReference getETSpecificationConjunctionExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationConjunctionExpression#getRight()
   * @see #getETSpecificationConjunctionExpression()
   * @generated
   */
  EReference getETSpecificationConjunctionExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression <em>ET Specification Composition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Composition Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression
   * @generated
   */
  EClass getETSpecificationCompositionExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression#getLeft()
   * @see #getETSpecificationCompositionExpression()
   * @generated
   */
  EReference getETSpecificationCompositionExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationCompositionExpression#getRight()
   * @see #getETSpecificationCompositionExpression()
   * @generated
   */
  EReference getETSpecificationCompositionExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationReference <em>ET Specification Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Reference</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationReference
   * @generated
   */
  EClass getETSpecificationReference();

  /**
   * Returns the meta object for the reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationReference#getSpecification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specification</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationReference#getSpecification()
   * @see #getETSpecificationReference()
   * @generated
   */
  EReference getETSpecificationReference_Specification();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation <em>ET Specification Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Specification Instantiation</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation
   * @generated
   */
  EClass getETSpecificationInstantiation();

  /**
   * Returns the meta object for the reference '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getTemplate()
   * @see #getETSpecificationInstantiation()
   * @generated
   */
  EReference getETSpecificationInstantiation_Template();

  /**
   * Returns the meta object for the containment reference list '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getArguments()
   * @see #getETSpecificationInstantiation()
   * @generated
   */
  EReference getETSpecificationInstantiation_Arguments();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETForallExpression <em>ET Forall Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Forall Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETForallExpression
   * @generated
   */
  EClass getETForallExpression();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETForallExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETForallExpression#getName()
   * @see #getETForallExpression()
   * @generated
   */
  EAttribute getETForallExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETForallExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETForallExpression#getType()
   * @see #getETForallExpression()
   * @generated
   */
  EReference getETForallExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETForallExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETForallExpression#getExpression()
   * @see #getETForallExpression()
   * @generated
   */
  EReference getETForallExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETExistsExpression <em>ET Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Exists Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETExistsExpression
   * @generated
   */
  EClass getETExistsExpression();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETExistsExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETExistsExpression#getName()
   * @see #getETExistsExpression()
   * @generated
   */
  EAttribute getETExistsExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETExistsExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETExistsExpression#getType()
   * @see #getETExistsExpression()
   * @generated
   */
  EReference getETExistsExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETExistsExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETExistsExpression#getExpression()
   * @see #getETExistsExpression()
   * @generated
   */
  EReference getETExistsExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETImplyExpression <em>ET Imply Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Imply Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETImplyExpression
   * @generated
   */
  EClass getETImplyExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETImplyExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETImplyExpression#getLeft()
   * @see #getETImplyExpression()
   * @generated
   */
  EReference getETImplyExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETImplyExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETImplyExpression#getRight()
   * @see #getETImplyExpression()
   * @generated
   */
  EReference getETImplyExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLogicOrExpression <em>ET Logic Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Logic Or Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicOrExpression
   * @generated
   */
  EClass getETLogicOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLogicOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicOrExpression#getLeft()
   * @see #getETLogicOrExpression()
   * @generated
   */
  EReference getETLogicOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLogicOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicOrExpression#getRight()
   * @see #getETLogicOrExpression()
   * @generated
   */
  EReference getETLogicOrExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLogicAndExpression <em>ET Logic And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Logic And Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicAndExpression
   * @generated
   */
  EClass getETLogicAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLogicAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicAndExpression#getLeft()
   * @see #getETLogicAndExpression()
   * @generated
   */
  EReference getETLogicAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLogicAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicAndExpression#getRight()
   * @see #getETLogicAndExpression()
   * @generated
   */
  EReference getETLogicAndExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETAssignmentExpression <em>ET Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAssignmentExpression
   * @generated
   */
  EClass getETAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAssignmentExpression#getLeft()
   * @see #getETAssignmentExpression()
   * @generated
   */
  EReference getETAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAssignmentExpression#getRight()
   * @see #getETAssignmentExpression()
   * @generated
   */
  EReference getETAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression <em>ET Addition Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Addition Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression
   * @generated
   */
  EClass getETAdditionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression#getLeft()
   * @see #getETAdditionAssignmentExpression()
   * @generated
   */
  EReference getETAdditionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression#getRight()
   * @see #getETAdditionAssignmentExpression()
   * @generated
   */
  EReference getETAdditionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression <em>ET Subtraction Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Subtraction Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression
   * @generated
   */
  EClass getETSubtractionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression#getLeft()
   * @see #getETSubtractionAssignmentExpression()
   * @generated
   */
  EReference getETSubtractionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression#getRight()
   * @see #getETSubtractionAssignmentExpression()
   * @generated
   */
  EReference getETSubtractionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression <em>ET Multiplication Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Multiplication Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression
   * @generated
   */
  EClass getETMultiplicationAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression#getLeft()
   * @see #getETMultiplicationAssignmentExpression()
   * @generated
   */
  EReference getETMultiplicationAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression#getRight()
   * @see #getETMultiplicationAssignmentExpression()
   * @generated
   */
  EReference getETMultiplicationAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression <em>ET Division Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Division Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression
   * @generated
   */
  EClass getETDivisionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression#getLeft()
   * @see #getETDivisionAssignmentExpression()
   * @generated
   */
  EReference getETDivisionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression#getRight()
   * @see #getETDivisionAssignmentExpression()
   * @generated
   */
  EReference getETDivisionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression <em>ET Modulo Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Modulo Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression
   * @generated
   */
  EClass getETModuloAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression#getLeft()
   * @see #getETModuloAssignmentExpression()
   * @generated
   */
  EReference getETModuloAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression#getRight()
   * @see #getETModuloAssignmentExpression()
   * @generated
   */
  EReference getETModuloAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression <em>ET Bit Or Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Or Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression
   * @generated
   */
  EClass getETBitOrAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression#getLeft()
   * @see #getETBitOrAssignmentExpression()
   * @generated
   */
  EReference getETBitOrAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression#getRight()
   * @see #getETBitOrAssignmentExpression()
   * @generated
   */
  EReference getETBitOrAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression <em>ET Bit And Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit And Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression
   * @generated
   */
  EClass getETBitAndAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression#getLeft()
   * @see #getETBitAndAssignmentExpression()
   * @generated
   */
  EReference getETBitAndAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression#getRight()
   * @see #getETBitAndAssignmentExpression()
   * @generated
   */
  EReference getETBitAndAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression <em>ET Bit XOR Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit XOR Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression
   * @generated
   */
  EClass getETBitXORAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression#getLeft()
   * @see #getETBitXORAssignmentExpression()
   * @generated
   */
  EReference getETBitXORAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression#getRight()
   * @see #getETBitXORAssignmentExpression()
   * @generated
   */
  EReference getETBitXORAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression <em>ET Bit Left Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Left Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression
   * @generated
   */
  EClass getETBitLeftAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression#getLeft()
   * @see #getETBitLeftAssignmentExpression()
   * @generated
   */
  EReference getETBitLeftAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression#getRight()
   * @see #getETBitLeftAssignmentExpression()
   * @generated
   */
  EReference getETBitLeftAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression <em>ET Bit Right Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Right Assignment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression
   * @generated
   */
  EClass getETBitRightAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression#getLeft()
   * @see #getETBitRightAssignmentExpression()
   * @generated
   */
  EReference getETBitRightAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression#getRight()
   * @see #getETBitRightAssignmentExpression()
   * @generated
   */
  EReference getETBitRightAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression <em>ET Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Conditional Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETConditionalExpression
   * @generated
   */
  EClass getETConditionalExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getCondition()
   * @see #getETConditionalExpression()
   * @generated
   */
  EReference getETConditionalExpression_Condition();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getThen()
   * @see #getETConditionalExpression()
   * @generated
   */
  EReference getETConditionalExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getElse()
   * @see #getETConditionalExpression()
   * @generated
   */
  EReference getETConditionalExpression_Else();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitOrExpression <em>ET Bit Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Or Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrExpression
   * @generated
   */
  EClass getETBitOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrExpression#getLeft()
   * @see #getETBitOrExpression()
   * @generated
   */
  EReference getETBitOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitOrExpression#getRight()
   * @see #getETBitOrExpression()
   * @generated
   */
  EReference getETBitOrExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitXORExpression <em>ET Bit XOR Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit XOR Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORExpression
   * @generated
   */
  EClass getETBitXORExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitXORExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORExpression#getLeft()
   * @see #getETBitXORExpression()
   * @generated
   */
  EReference getETBitXORExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitXORExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitXORExpression#getRight()
   * @see #getETBitXORExpression()
   * @generated
   */
  EReference getETBitXORExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitAndExpression <em>ET Bit And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit And Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndExpression
   * @generated
   */
  EClass getETBitAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndExpression#getLeft()
   * @see #getETBitAndExpression()
   * @generated
   */
  EReference getETBitAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitAndExpression#getRight()
   * @see #getETBitAndExpression()
   * @generated
   */
  EReference getETBitAndExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETEqualExpression <em>ET Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Equal Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEqualExpression
   * @generated
   */
  EClass getETEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEqualExpression#getLeft()
   * @see #getETEqualExpression()
   * @generated
   */
  EReference getETEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETEqualExpression#getRight()
   * @see #getETEqualExpression()
   * @generated
   */
  EReference getETEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETUnequalExpression <em>ET Unequal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Unequal Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETUnequalExpression
   * @generated
   */
  EClass getETUnequalExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETUnequalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETUnequalExpression#getLeft()
   * @see #getETUnequalExpression()
   * @generated
   */
  EReference getETUnequalExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETUnequalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETUnequalExpression#getRight()
   * @see #getETUnequalExpression()
   * @generated
   */
  EReference getETUnequalExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLessExpression <em>ET Less Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Less Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessExpression
   * @generated
   */
  EClass getETLessExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLessExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessExpression#getLeft()
   * @see #getETLessExpression()
   * @generated
   */
  EReference getETLessExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLessExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessExpression#getRight()
   * @see #getETLessExpression()
   * @generated
   */
  EReference getETLessExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLessEqualExpression <em>ET Less Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Less Equal Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessEqualExpression
   * @generated
   */
  EClass getETLessEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLessEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessEqualExpression#getLeft()
   * @see #getETLessEqualExpression()
   * @generated
   */
  EReference getETLessEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLessEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLessEqualExpression#getRight()
   * @see #getETLessEqualExpression()
   * @generated
   */
  EReference getETLessEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression <em>ET Greater Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Greater Equal Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression
   * @generated
   */
  EClass getETGreaterEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression#getLeft()
   * @see #getETGreaterEqualExpression()
   * @generated
   */
  EReference getETGreaterEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression#getRight()
   * @see #getETGreaterEqualExpression()
   * @generated
   */
  EReference getETGreaterEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETGreaterExpression <em>ET Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Greater Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterExpression
   * @generated
   */
  EClass getETGreaterExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETGreaterExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterExpression#getLeft()
   * @see #getETGreaterExpression()
   * @generated
   */
  EReference getETGreaterExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETGreaterExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETGreaterExpression#getRight()
   * @see #getETGreaterExpression()
   * @generated
   */
  EReference getETGreaterExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMinExpression <em>ET Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Min Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMinExpression
   * @generated
   */
  EClass getETMinExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMinExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMinExpression#getLeft()
   * @see #getETMinExpression()
   * @generated
   */
  EReference getETMinExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMinExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMinExpression#getRight()
   * @see #getETMinExpression()
   * @generated
   */
  EReference getETMinExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMaxExpression <em>ET Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Max Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMaxExpression
   * @generated
   */
  EClass getETMaxExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMaxExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMaxExpression#getLeft()
   * @see #getETMaxExpression()
   * @generated
   */
  EReference getETMaxExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMaxExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMaxExpression#getRight()
   * @see #getETMaxExpression()
   * @generated
   */
  EReference getETMaxExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftExpression <em>ET Bit Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Left Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftExpression
   * @generated
   */
  EClass getETBitLeftExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftExpression#getLeft()
   * @see #getETBitLeftExpression()
   * @generated
   */
  EReference getETBitLeftExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitLeftExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitLeftExpression#getRight()
   * @see #getETBitLeftExpression()
   * @generated
   */
  EReference getETBitLeftExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBitRightExpression <em>ET Bit Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Bit Right Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightExpression
   * @generated
   */
  EClass getETBitRightExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitRightExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightExpression#getLeft()
   * @see #getETBitRightExpression()
   * @generated
   */
  EReference getETBitRightExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETBitRightExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBitRightExpression#getRight()
   * @see #getETBitRightExpression()
   * @generated
   */
  EReference getETBitRightExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETAddExpression <em>ET Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Add Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAddExpression
   * @generated
   */
  EClass getETAddExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAddExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAddExpression#getLeft()
   * @see #getETAddExpression()
   * @generated
   */
  EReference getETAddExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETAddExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETAddExpression#getRight()
   * @see #getETAddExpression()
   * @generated
   */
  EReference getETAddExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression <em>ET Subtract Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Subtract Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractExpression
   * @generated
   */
  EClass getETSubtractExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getLeft()
   * @see #getETSubtractExpression()
   * @generated
   */
  EReference getETSubtractExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getRight()
   * @see #getETSubtractExpression()
   * @generated
   */
  EReference getETSubtractExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMultiplyExpression <em>ET Multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Multiply Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplyExpression
   * @generated
   */
  EClass getETMultiplyExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMultiplyExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplyExpression#getLeft()
   * @see #getETMultiplyExpression()
   * @generated
   */
  EReference getETMultiplyExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMultiplyExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMultiplyExpression#getRight()
   * @see #getETMultiplyExpression()
   * @generated
   */
  EReference getETMultiplyExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETDivideExpression <em>ET Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Divide Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivideExpression
   * @generated
   */
  EClass getETDivideExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETDivideExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivideExpression#getLeft()
   * @see #getETDivideExpression()
   * @generated
   */
  EReference getETDivideExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETDivideExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETDivideExpression#getRight()
   * @see #getETDivideExpression()
   * @generated
   */
  EReference getETDivideExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETModuloExpression <em>ET Modulo Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Modulo Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloExpression
   * @generated
   */
  EClass getETModuloExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETModuloExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloExpression#getLeft()
   * @see #getETModuloExpression()
   * @generated
   */
  EReference getETModuloExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETModuloExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETModuloExpression#getRight()
   * @see #getETModuloExpression()
   * @generated
   */
  EReference getETModuloExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression <em>ET Pre Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Pre Increment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression
   * @generated
   */
  EClass getETPreIncrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression#getExpression()
   * @see #getETPreIncrementExpression()
   * @generated
   */
  EReference getETPreIncrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression <em>ET Pre Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Pre Decrement Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression
   * @generated
   */
  EClass getETPreDecrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression#getExpression()
   * @see #getETPreDecrementExpression()
   * @generated
   */
  EReference getETPreDecrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETLogicNotExpression <em>ET Logic Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Logic Not Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicNotExpression
   * @generated
   */
  EClass getETLogicNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETLogicNotExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETLogicNotExpression#getExpression()
   * @see #getETLogicNotExpression()
   * @generated
   */
  EReference getETLogicNotExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETMinusExpression <em>ET Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Minus Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMinusExpression
   * @generated
   */
  EClass getETMinusExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETMinusExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETMinusExpression#getExpression()
   * @see #getETMinusExpression()
   * @generated
   */
  EReference getETMinusExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression <em>ET Post Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Post Increment Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression
   * @generated
   */
  EClass getETPostIncrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression#getExpression()
   * @see #getETPostIncrementExpression()
   * @generated
   */
  EReference getETPostIncrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression <em>ET Post Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Post Decrement Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression
   * @generated
   */
  EClass getETPostDecrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression#getExpression()
   * @see #getETPostDecrementExpression()
   * @generated
   */
  EReference getETPostDecrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETArrayExpression <em>ET Array Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Array Expression</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayExpression
   * @generated
   */
  EClass getETArrayExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETArrayExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayExpression#getLeft()
   * @see #getETArrayExpression()
   * @generated
   */
  EReference getETArrayExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.itu.ecdar.text.ecdarText.ETArrayExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETArrayExpression#getRight()
   * @see #getETArrayExpression()
   * @generated
   */
  EReference getETArrayExpression_Right();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETReference <em>ET Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Reference</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETReference
   * @generated
   */
  EClass getETReference();

  /**
   * Returns the meta object for the reference '{@link dk.itu.ecdar.text.ecdarText.ETReference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETReference#getTarget()
   * @see #getETReference()
   * @generated
   */
  EReference getETReference_Target();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETBooleanLiteral <em>ET Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Boolean Literal</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBooleanLiteral
   * @generated
   */
  EClass getETBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETBooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETBooleanLiteral#getValue()
   * @see #getETBooleanLiteral()
   * @generated
   */
  EAttribute getETBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link dk.itu.ecdar.text.ecdarText.ETNumberLiteral <em>ET Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ET Number Literal</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETNumberLiteral
   * @generated
   */
  EClass getETNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link dk.itu.ecdar.text.ecdarText.ETNumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETNumberLiteral#getValue()
   * @see #getETNumberLiteral()
   * @generated
   */
  EAttribute getETNumberLiteral_Value();

  /**
   * Returns the meta object for enum '{@link dk.itu.ecdar.text.ecdarText.ETIOType <em>ETIO Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ETIO Type</em>'.
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @generated
   */
  EEnum getETIOType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EcdarTextFactory getEcdarTextFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFileImpl <em>ET File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETFileImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFile()
     * @generated
     */
    EClass ET_FILE = eINSTANCE.getETFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FILE__IMPORTS = eINSTANCE.getETFile_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FILE__DECLARATIONS = eINSTANCE.getETFile_Declarations();

    /**
     * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FILE__SPECIFICATIONS = eINSTANCE.getETFile_Specifications();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETImportImpl <em>ET Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETImportImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETImport()
     * @generated
     */
    EClass ET_IMPORT = eINSTANCE.getETImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getETImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETArrayDeclarationImpl <em>ET Array Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETArrayDeclarationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETArrayDeclaration()
     * @generated
     */
    EClass ET_ARRAY_DECLARATION = eINSTANCE.getETArrayDeclaration();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ARRAY_DECLARATION__SIZE = eINSTANCE.getETArrayDeclaration_Size();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDeclarationsImpl <em>ET Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETDeclarationsImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDeclarations()
     * @generated
     */
    EClass ET_DECLARATIONS = eINSTANCE.getETDeclarations();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_DECLARATIONS__DECLARATIONS = eINSTANCE.getETDeclarations_Declarations();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDeclarationImpl <em>ET Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETDeclarationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDeclaration()
     * @generated
     */
    EClass ET_DECLARATION = eINSTANCE.getETDeclaration();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl <em>ET Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETType()
     * @generated
     */
    EClass ET_TYPE = eINSTANCE.getETType();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE__MODIFIERS = eINSTANCE.getETType_Modifiers();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE__IDENTIFIER = eINSTANCE.getETType_Identifier();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeModifiersImpl <em>ET Type Modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeModifiersImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeModifiers()
     * @generated
     */
    EClass ET_TYPE_MODIFIERS = eINSTANCE.getETTypeModifiers();

    /**
     * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_TYPE_MODIFIERS__URGENT = eINSTANCE.getETTypeModifiers_Urgent();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_TYPE_MODIFIERS__META = eINSTANCE.getETTypeModifiers_Meta();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_TYPE_MODIFIERS__CONST = eINSTANCE.getETTypeModifiers_Const();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableDeclarationImpl <em>ET Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETVariableDeclarationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETVariableDeclaration()
     * @generated
     */
    EClass ET_VARIABLE_DECLARATION = eINSTANCE.getETVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_VARIABLE_DECLARATION__TYPE = eINSTANCE.getETVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_VARIABLE_DECLARATION__VARIABLES = eINSTANCE.getETVariableDeclaration_Variables();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl <em>ET Variable ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETVariableID()
     * @generated
     */
    EClass ET_VARIABLE_ID = eINSTANCE.getETVariableID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_VARIABLE_ID__NAME = eINSTANCE.getETVariableID_Name();

    /**
     * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_VARIABLE_ID__IO_TYPE = eINSTANCE.getETVariableID_IoType();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_VARIABLE_ID__DIMENSIONS = eINSTANCE.getETVariableID_Dimensions();

    /**
     * The meta object literal for the '<em><b>Initialiser</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_VARIABLE_ID__INITIALISER = eINSTANCE.getETVariableID_Initialiser();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETInitialiserImpl <em>ET Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETInitialiserImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETInitialiser()
     * @generated
     */
    EClass ET_INITIALISER = eINSTANCE.getETInitialiser();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSingleInitialiserImpl <em>ET Single Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSingleInitialiserImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSingleInitialiser()
     * @generated
     */
    EClass ET_SINGLE_INITIALISER = eINSTANCE.getETSingleInitialiser();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SINGLE_INITIALISER__EXPRESSION = eINSTANCE.getETSingleInitialiser_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiInitialiserImpl <em>ET Multi Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiInitialiserImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiInitialiser()
     * @generated
     */
    EClass ET_MULTI_INITIALISER = eINSTANCE.getETMultiInitialiser();

    /**
     * The meta object literal for the '<em><b>Initialisers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MULTI_INITIALISER__INITIALISERS = eINSTANCE.getETMultiInitialiser_Initialisers();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl <em>ET Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeDeclaration()
     * @generated
     */
    EClass ET_TYPE_DECLARATION = eINSTANCE.getETTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE_DECLARATION__BASE_TYPE = eINSTANCE.getETTypeDeclaration_BaseType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE_DECLARATION__TYPES = eINSTANCE.getETTypeDeclaration_Types();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeIDImpl <em>ET Type ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeIDImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeID()
     * @generated
     */
    EClass ET_TYPE_ID = eINSTANCE.getETTypeID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_TYPE_ID__NAME = eINSTANCE.getETTypeID_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE_ID__DIMENSIONS = eINSTANCE.getETTypeID_Dimensions();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeIdentifierImpl <em>ET Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeIdentifierImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeIdentifier()
     * @generated
     */
    EClass ET_TYPE_IDENTIFIER = eINSTANCE.getETTypeIdentifier();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl <em>ET Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIntegerType()
     * @generated
     */
    EClass ET_INTEGER_TYPE = eINSTANCE.getETIntegerType();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_INTEGER_TYPE__MIN = eINSTANCE.getETIntegerType_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_INTEGER_TYPE__MAX = eINSTANCE.getETIntegerType_Max();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETClockTypeImpl <em>ET Clock Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETClockTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETClockType()
     * @generated
     */
    EClass ET_CLOCK_TYPE = eINSTANCE.getETClockType();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETActionTypeImpl <em>ET Action Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETActionTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETActionType()
     * @generated
     */
    EClass ET_ACTION_TYPE = eINSTANCE.getETActionType();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETInputTypeImpl <em>ET Input Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETInputTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETInputType()
     * @generated
     */
    EClass ET_INPUT_TYPE = eINSTANCE.getETInputType();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETOutputTypeImpl <em>ET Output Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETOutputTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETOutputType()
     * @generated
     */
    EClass ET_OUTPUT_TYPE = eINSTANCE.getETOutputType();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBooleanTypeImpl <em>ET Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBooleanTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBooleanType()
     * @generated
     */
    EClass ET_BOOLEAN_TYPE = eINSTANCE.getETBooleanType();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETScalarTypeImpl <em>ET Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETScalarTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETScalarType()
     * @generated
     */
    EClass ET_SCALAR_TYPE = eINSTANCE.getETScalarType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SCALAR_TYPE__SIZE = eINSTANCE.getETScalarType_Size();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETStructTypeImpl <em>ET Struct Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETStructTypeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETStructType()
     * @generated
     */
    EClass ET_STRUCT_TYPE = eINSTANCE.getETStructType();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_STRUCT_TYPE__DECLARATIONS = eINSTANCE.getETStructType_Declarations();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldDeclarationImpl <em>ET Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETFieldDeclarationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFieldDeclaration()
     * @generated
     */
    EClass ET_FIELD_DECLARATION = eINSTANCE.getETFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FIELD_DECLARATION__TYPE = eINSTANCE.getETFieldDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FIELD_DECLARATION__FIELDS = eINSTANCE.getETFieldDeclaration_Fields();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl <em>ET Field ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETFieldID()
     * @generated
     */
    EClass ET_FIELD_ID = eINSTANCE.getETFieldID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_FIELD_ID__NAME = eINSTANCE.getETFieldID_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FIELD_ID__DIMENSIONS = eINSTANCE.getETFieldID_Dimensions();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationExpressionImpl <em>ET Specification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationExpression()
     * @generated
     */
    EClass ET_SPECIFICATION_EXPRESSION = eINSTANCE.getETSpecificationExpression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationImpl <em>ET Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecification()
     * @generated
     */
    EClass ET_SPECIFICATION = eINSTANCE.getETSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_SPECIFICATION__NAME = eINSTANCE.getETSpecification_Name();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBindingImpl <em>ET Specification Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBindingImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationBinding()
     * @generated
     */
    EClass ET_SPECIFICATION_BINDING = eINSTANCE.getETSpecificationBinding();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_BINDING__EXPRESSION = eINSTANCE.getETSpecificationBinding_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDefinitionImpl <em>ET Specification Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDefinitionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationDefinition()
     * @generated
     */
    EClass ET_SPECIFICATION_DEFINITION = eINSTANCE.getETSpecificationDefinition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_DEFINITION__BODY = eINSTANCE.getETSpecificationDefinition_Body();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationTemplateImpl <em>ET Specification Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationTemplateImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationTemplate()
     * @generated
     */
    EClass ET_SPECIFICATION_TEMPLATE = eINSTANCE.getETSpecificationTemplate();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_TEMPLATE__PARAMETERS = eINSTANCE.getETSpecificationTemplate_Parameters();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl <em>ET Specification Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationBody()
     * @generated
     */
    EClass ET_SPECIFICATION_BODY = eINSTANCE.getETSpecificationBody();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_BODY__DECLARATIONS = eINSTANCE.getETSpecificationBody_Declarations();

    /**
     * The meta object literal for the '<em><b>Initial Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_BODY__INITIAL_LOCATION = eINSTANCE.getETSpecificationBody_InitialLocation();

    /**
     * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_BODY__LOCATIONS = eINSTANCE.getETSpecificationBody_Locations();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETParameterImpl <em>ET Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETParameterImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETParameter()
     * @generated
     */
    EClass ET_PARAMETER = eINSTANCE.getETParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_PARAMETER__TYPE = eINSTANCE.getETParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_PARAMETER__NAME = eINSTANCE.getETParameter_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_PARAMETER__DIMENSIONS = eINSTANCE.getETParameter_Dimensions();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl <em>ET Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLocation()
     * @generated
     */
    EClass ET_LOCATION = eINSTANCE.getETLocation();

    /**
     * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_LOCATION__URGENT = eINSTANCE.getETLocation_Urgent();

    /**
     * The meta object literal for the '<em><b>Universal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_LOCATION__UNIVERSAL = eINSTANCE.getETLocation_Universal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_LOCATION__NAME = eINSTANCE.getETLocation_Name();

    /**
     * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOCATION__INVARIANTS = eINSTANCE.getETLocation_Invariants();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOCATION__EDGES = eINSTANCE.getETLocation_Edges();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl <em>ET Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETEdge()
     * @generated
     */
    EClass ET_EDGE = eINSTANCE.getETEdge();

    /**
     * The meta object literal for the '<em><b>Controllable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_EDGE__CONTROLLABLE = eINSTANCE.getETEdge_Controllable();

    /**
     * The meta object literal for the '<em><b>Selects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EDGE__SELECTS = eINSTANCE.getETEdge_Selects();

    /**
     * The meta object literal for the '<em><b>Io</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EDGE__IO = eINSTANCE.getETEdge_Io();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EDGE__GUARD = eINSTANCE.getETEdge_Guard();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EDGE__TARGET = eINSTANCE.getETEdge_Target();

    /**
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EDGE__UPDATES = eINSTANCE.getETEdge_Updates();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETIOImpl <em>ETIO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETIOImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIO()
     * @generated
     */
    EClass ETIO = eINSTANCE.getETIO();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETIO__EXPRESSION = eINSTANCE.getETIO_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETIO__TYPE = eINSTANCE.getETIO_Type();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSelectImpl <em>ET Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSelectImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSelect()
     * @generated
     */
    EClass ET_SELECT = eINSTANCE.getETSelect();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_SELECT__NAME = eINSTANCE.getETSelect_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SELECT__TYPE = eINSTANCE.getETSelect_Type();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETExpressionImpl <em>ET Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETExpression()
     * @generated
     */
    EClass ET_EXPRESSION = eINSTANCE.getETExpression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeReferenceImpl <em>ET Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETTypeReferenceImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETTypeReference()
     * @generated
     */
    EClass ET_TYPE_REFERENCE = eINSTANCE.getETTypeReference();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_TYPE_REFERENCE__TARGET = eINSTANCE.getETTypeReference_Target();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDisjunctionExpressionImpl <em>ET Specification Disjunction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationDisjunctionExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationDisjunctionExpression()
     * @generated
     */
    EClass ET_SPECIFICATION_DISJUNCTION_EXPRESSION = eINSTANCE.getETSpecificationDisjunctionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_DISJUNCTION_EXPRESSION__LEFT = eINSTANCE.getETSpecificationDisjunctionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_DISJUNCTION_EXPRESSION__RIGHT = eINSTANCE.getETSpecificationDisjunctionExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationConjunctionExpressionImpl <em>ET Specification Conjunction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationConjunctionExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationConjunctionExpression()
     * @generated
     */
    EClass ET_SPECIFICATION_CONJUNCTION_EXPRESSION = eINSTANCE.getETSpecificationConjunctionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_CONJUNCTION_EXPRESSION__LEFT = eINSTANCE.getETSpecificationConjunctionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_CONJUNCTION_EXPRESSION__RIGHT = eINSTANCE.getETSpecificationConjunctionExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationCompositionExpressionImpl <em>ET Specification Composition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationCompositionExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationCompositionExpression()
     * @generated
     */
    EClass ET_SPECIFICATION_COMPOSITION_EXPRESSION = eINSTANCE.getETSpecificationCompositionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_COMPOSITION_EXPRESSION__LEFT = eINSTANCE.getETSpecificationCompositionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_COMPOSITION_EXPRESSION__RIGHT = eINSTANCE.getETSpecificationCompositionExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationReferenceImpl <em>ET Specification Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationReferenceImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationReference()
     * @generated
     */
    EClass ET_SPECIFICATION_REFERENCE = eINSTANCE.getETSpecificationReference();

    /**
     * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_REFERENCE__SPECIFICATION = eINSTANCE.getETSpecificationReference_Specification();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl <em>ET Specification Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSpecificationInstantiation()
     * @generated
     */
    EClass ET_SPECIFICATION_INSTANTIATION = eINSTANCE.getETSpecificationInstantiation();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_INSTANTIATION__TEMPLATE = eINSTANCE.getETSpecificationInstantiation_Template();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SPECIFICATION_INSTANTIATION__ARGUMENTS = eINSTANCE.getETSpecificationInstantiation_Arguments();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETForallExpressionImpl <em>ET Forall Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETForallExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETForallExpression()
     * @generated
     */
    EClass ET_FORALL_EXPRESSION = eINSTANCE.getETForallExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_FORALL_EXPRESSION__NAME = eINSTANCE.getETForallExpression_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FORALL_EXPRESSION__TYPE = eINSTANCE.getETForallExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_FORALL_EXPRESSION__EXPRESSION = eINSTANCE.getETForallExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETExistsExpressionImpl <em>ET Exists Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETExistsExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETExistsExpression()
     * @generated
     */
    EClass ET_EXISTS_EXPRESSION = eINSTANCE.getETExistsExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_EXISTS_EXPRESSION__NAME = eINSTANCE.getETExistsExpression_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EXISTS_EXPRESSION__TYPE = eINSTANCE.getETExistsExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EXISTS_EXPRESSION__EXPRESSION = eINSTANCE.getETExistsExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETImplyExpressionImpl <em>ET Imply Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETImplyExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETImplyExpression()
     * @generated
     */
    EClass ET_IMPLY_EXPRESSION = eINSTANCE.getETImplyExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_IMPLY_EXPRESSION__LEFT = eINSTANCE.getETImplyExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_IMPLY_EXPRESSION__RIGHT = eINSTANCE.getETImplyExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicOrExpressionImpl <em>ET Logic Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicOrExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicOrExpression()
     * @generated
     */
    EClass ET_LOGIC_OR_EXPRESSION = eINSTANCE.getETLogicOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOGIC_OR_EXPRESSION__LEFT = eINSTANCE.getETLogicOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOGIC_OR_EXPRESSION__RIGHT = eINSTANCE.getETLogicOrExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicAndExpressionImpl <em>ET Logic And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicAndExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicAndExpression()
     * @generated
     */
    EClass ET_LOGIC_AND_EXPRESSION = eINSTANCE.getETLogicAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOGIC_AND_EXPRESSION__LEFT = eINSTANCE.getETLogicAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOGIC_AND_EXPRESSION__RIGHT = eINSTANCE.getETLogicAndExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAssignmentExpressionImpl <em>ET Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAssignmentExpression()
     * @generated
     */
    EClass ET_ASSIGNMENT_EXPRESSION = eINSTANCE.getETAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAdditionAssignmentExpressionImpl <em>ET Addition Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETAdditionAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAdditionAssignmentExpression()
     * @generated
     */
    EClass ET_ADDITION_ASSIGNMENT_EXPRESSION = eINSTANCE.getETAdditionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ADDITION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETAdditionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETAdditionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSubtractionAssignmentExpressionImpl <em>ET Subtraction Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSubtractionAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSubtractionAssignmentExpression()
     * @generated
     */
    EClass ET_SUBTRACTION_ASSIGNMENT_EXPRESSION = eINSTANCE.getETSubtractionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETSubtractionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETSubtractionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiplicationAssignmentExpressionImpl <em>ET Multiplication Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiplicationAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiplicationAssignmentExpression()
     * @generated
     */
    EClass ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION = eINSTANCE.getETMultiplicationAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETMultiplicationAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETMultiplicationAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDivisionAssignmentExpressionImpl <em>ET Division Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETDivisionAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDivisionAssignmentExpression()
     * @generated
     */
    EClass ET_DIVISION_ASSIGNMENT_EXPRESSION = eINSTANCE.getETDivisionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_DIVISION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETDivisionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETDivisionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETModuloAssignmentExpressionImpl <em>ET Modulo Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETModuloAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETModuloAssignmentExpression()
     * @generated
     */
    EClass ET_MODULO_ASSIGNMENT_EXPRESSION = eINSTANCE.getETModuloAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MODULO_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETModuloAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MODULO_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETModuloAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitOrAssignmentExpressionImpl <em>ET Bit Or Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitOrAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitOrAssignmentExpression()
     * @generated
     */
    EClass ET_BIT_OR_ASSIGNMENT_EXPRESSION = eINSTANCE.getETBitOrAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETBitOrAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETBitOrAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitAndAssignmentExpressionImpl <em>ET Bit And Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitAndAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitAndAssignmentExpression()
     * @generated
     */
    EClass ET_BIT_AND_ASSIGNMENT_EXPRESSION = eINSTANCE.getETBitAndAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETBitAndAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETBitAndAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitXORAssignmentExpressionImpl <em>ET Bit XOR Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitXORAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitXORAssignmentExpression()
     * @generated
     */
    EClass ET_BIT_XOR_ASSIGNMENT_EXPRESSION = eINSTANCE.getETBitXORAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETBitXORAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETBitXORAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitLeftAssignmentExpressionImpl <em>ET Bit Left Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitLeftAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitLeftAssignmentExpression()
     * @generated
     */
    EClass ET_BIT_LEFT_ASSIGNMENT_EXPRESSION = eINSTANCE.getETBitLeftAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETBitLeftAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETBitLeftAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitRightAssignmentExpressionImpl <em>ET Bit Right Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitRightAssignmentExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitRightAssignmentExpression()
     * @generated
     */
    EClass ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION = eINSTANCE.getETBitRightAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getETBitRightAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getETBitRightAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl <em>ET Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETConditionalExpression()
     * @generated
     */
    EClass ET_CONDITIONAL_EXPRESSION = eINSTANCE.getETConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getETConditionalExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_CONDITIONAL_EXPRESSION__THEN = eINSTANCE.getETConditionalExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_CONDITIONAL_EXPRESSION__ELSE = eINSTANCE.getETConditionalExpression_Else();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitOrExpressionImpl <em>ET Bit Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitOrExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitOrExpression()
     * @generated
     */
    EClass ET_BIT_OR_EXPRESSION = eINSTANCE.getETBitOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_OR_EXPRESSION__LEFT = eINSTANCE.getETBitOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_OR_EXPRESSION__RIGHT = eINSTANCE.getETBitOrExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitXORExpressionImpl <em>ET Bit XOR Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitXORExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitXORExpression()
     * @generated
     */
    EClass ET_BIT_XOR_EXPRESSION = eINSTANCE.getETBitXORExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_XOR_EXPRESSION__LEFT = eINSTANCE.getETBitXORExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_XOR_EXPRESSION__RIGHT = eINSTANCE.getETBitXORExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitAndExpressionImpl <em>ET Bit And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitAndExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitAndExpression()
     * @generated
     */
    EClass ET_BIT_AND_EXPRESSION = eINSTANCE.getETBitAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_AND_EXPRESSION__LEFT = eINSTANCE.getETBitAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_AND_EXPRESSION__RIGHT = eINSTANCE.getETBitAndExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETEqualExpressionImpl <em>ET Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETEqualExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETEqualExpression()
     * @generated
     */
    EClass ET_EQUAL_EXPRESSION = eINSTANCE.getETEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EQUAL_EXPRESSION__LEFT = eINSTANCE.getETEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getETEqualExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETUnequalExpressionImpl <em>ET Unequal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETUnequalExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETUnequalExpression()
     * @generated
     */
    EClass ET_UNEQUAL_EXPRESSION = eINSTANCE.getETUnequalExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_UNEQUAL_EXPRESSION__LEFT = eINSTANCE.getETUnequalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_UNEQUAL_EXPRESSION__RIGHT = eINSTANCE.getETUnequalExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLessExpressionImpl <em>ET Less Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLessExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLessExpression()
     * @generated
     */
    EClass ET_LESS_EXPRESSION = eINSTANCE.getETLessExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LESS_EXPRESSION__LEFT = eINSTANCE.getETLessExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LESS_EXPRESSION__RIGHT = eINSTANCE.getETLessExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLessEqualExpressionImpl <em>ET Less Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLessEqualExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLessEqualExpression()
     * @generated
     */
    EClass ET_LESS_EQUAL_EXPRESSION = eINSTANCE.getETLessEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LESS_EQUAL_EXPRESSION__LEFT = eINSTANCE.getETLessEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LESS_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getETLessEqualExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETGreaterEqualExpressionImpl <em>ET Greater Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETGreaterEqualExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETGreaterEqualExpression()
     * @generated
     */
    EClass ET_GREATER_EQUAL_EXPRESSION = eINSTANCE.getETGreaterEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_GREATER_EQUAL_EXPRESSION__LEFT = eINSTANCE.getETGreaterEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_GREATER_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getETGreaterEqualExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETGreaterExpressionImpl <em>ET Greater Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETGreaterExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETGreaterExpression()
     * @generated
     */
    EClass ET_GREATER_EXPRESSION = eINSTANCE.getETGreaterExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_GREATER_EXPRESSION__LEFT = eINSTANCE.getETGreaterExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_GREATER_EXPRESSION__RIGHT = eINSTANCE.getETGreaterExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMinExpressionImpl <em>ET Min Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMinExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMinExpression()
     * @generated
     */
    EClass ET_MIN_EXPRESSION = eINSTANCE.getETMinExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MIN_EXPRESSION__LEFT = eINSTANCE.getETMinExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MIN_EXPRESSION__RIGHT = eINSTANCE.getETMinExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMaxExpressionImpl <em>ET Max Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMaxExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMaxExpression()
     * @generated
     */
    EClass ET_MAX_EXPRESSION = eINSTANCE.getETMaxExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MAX_EXPRESSION__LEFT = eINSTANCE.getETMaxExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MAX_EXPRESSION__RIGHT = eINSTANCE.getETMaxExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitLeftExpressionImpl <em>ET Bit Left Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitLeftExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitLeftExpression()
     * @generated
     */
    EClass ET_BIT_LEFT_EXPRESSION = eINSTANCE.getETBitLeftExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_LEFT_EXPRESSION__LEFT = eINSTANCE.getETBitLeftExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_LEFT_EXPRESSION__RIGHT = eINSTANCE.getETBitLeftExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBitRightExpressionImpl <em>ET Bit Right Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBitRightExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBitRightExpression()
     * @generated
     */
    EClass ET_BIT_RIGHT_EXPRESSION = eINSTANCE.getETBitRightExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_RIGHT_EXPRESSION__LEFT = eINSTANCE.getETBitRightExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_BIT_RIGHT_EXPRESSION__RIGHT = eINSTANCE.getETBitRightExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETAddExpressionImpl <em>ET Add Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETAddExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETAddExpression()
     * @generated
     */
    EClass ET_ADD_EXPRESSION = eINSTANCE.getETAddExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ADD_EXPRESSION__LEFT = eINSTANCE.getETAddExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ADD_EXPRESSION__RIGHT = eINSTANCE.getETAddExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETSubtractExpressionImpl <em>ET Subtract Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETSubtractExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETSubtractExpression()
     * @generated
     */
    EClass ET_SUBTRACT_EXPRESSION = eINSTANCE.getETSubtractExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SUBTRACT_EXPRESSION__LEFT = eINSTANCE.getETSubtractExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_SUBTRACT_EXPRESSION__RIGHT = eINSTANCE.getETSubtractExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiplyExpressionImpl <em>ET Multiply Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMultiplyExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMultiplyExpression()
     * @generated
     */
    EClass ET_MULTIPLY_EXPRESSION = eINSTANCE.getETMultiplyExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MULTIPLY_EXPRESSION__LEFT = eINSTANCE.getETMultiplyExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MULTIPLY_EXPRESSION__RIGHT = eINSTANCE.getETMultiplyExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETDivideExpressionImpl <em>ET Divide Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETDivideExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETDivideExpression()
     * @generated
     */
    EClass ET_DIVIDE_EXPRESSION = eINSTANCE.getETDivideExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_DIVIDE_EXPRESSION__LEFT = eINSTANCE.getETDivideExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_DIVIDE_EXPRESSION__RIGHT = eINSTANCE.getETDivideExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETModuloExpressionImpl <em>ET Modulo Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETModuloExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETModuloExpression()
     * @generated
     */
    EClass ET_MODULO_EXPRESSION = eINSTANCE.getETModuloExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MODULO_EXPRESSION__LEFT = eINSTANCE.getETModuloExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MODULO_EXPRESSION__RIGHT = eINSTANCE.getETModuloExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPreIncrementExpressionImpl <em>ET Pre Increment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETPreIncrementExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPreIncrementExpression()
     * @generated
     */
    EClass ET_PRE_INCREMENT_EXPRESSION = eINSTANCE.getETPreIncrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_PRE_INCREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getETPreIncrementExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPreDecrementExpressionImpl <em>ET Pre Decrement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETPreDecrementExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPreDecrementExpression()
     * @generated
     */
    EClass ET_PRE_DECREMENT_EXPRESSION = eINSTANCE.getETPreDecrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_PRE_DECREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getETPreDecrementExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETLogicNotExpressionImpl <em>ET Logic Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETLogicNotExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETLogicNotExpression()
     * @generated
     */
    EClass ET_LOGIC_NOT_EXPRESSION = eINSTANCE.getETLogicNotExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_LOGIC_NOT_EXPRESSION__EXPRESSION = eINSTANCE.getETLogicNotExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETMinusExpressionImpl <em>ET Minus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETMinusExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETMinusExpression()
     * @generated
     */
    EClass ET_MINUS_EXPRESSION = eINSTANCE.getETMinusExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_MINUS_EXPRESSION__EXPRESSION = eINSTANCE.getETMinusExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPostIncrementExpressionImpl <em>ET Post Increment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETPostIncrementExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPostIncrementExpression()
     * @generated
     */
    EClass ET_POST_INCREMENT_EXPRESSION = eINSTANCE.getETPostIncrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_POST_INCREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getETPostIncrementExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETPostDecrementExpressionImpl <em>ET Post Decrement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETPostDecrementExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETPostDecrementExpression()
     * @generated
     */
    EClass ET_POST_DECREMENT_EXPRESSION = eINSTANCE.getETPostDecrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_POST_DECREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getETPostDecrementExpression_Expression();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETArrayExpressionImpl <em>ET Array Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETArrayExpressionImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETArrayExpression()
     * @generated
     */
    EClass ET_ARRAY_EXPRESSION = eINSTANCE.getETArrayExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ARRAY_EXPRESSION__LEFT = eINSTANCE.getETArrayExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_ARRAY_EXPRESSION__RIGHT = eINSTANCE.getETArrayExpression_Right();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl <em>ET Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETReference()
     * @generated
     */
    EClass ET_REFERENCE = eINSTANCE.getETReference();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ET_REFERENCE__TARGET = eINSTANCE.getETReference_Target();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETBooleanLiteralImpl <em>ET Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETBooleanLiteralImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETBooleanLiteral()
     * @generated
     */
    EClass ET_BOOLEAN_LITERAL = eINSTANCE.getETBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_BOOLEAN_LITERAL__VALUE = eINSTANCE.getETBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl <em>ET Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETNumberLiteral()
     * @generated
     */
    EClass ET_NUMBER_LITERAL = eINSTANCE.getETNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ET_NUMBER_LITERAL__VALUE = eINSTANCE.getETNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link dk.itu.ecdar.text.ecdarText.ETIOType <em>ETIO Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.itu.ecdar.text.ecdarText.ETIOType
     * @see dk.itu.ecdar.text.ecdarText.impl.EcdarTextPackageImpl#getETIOType()
     * @generated
     */
    EEnum ETIO_TYPE = eINSTANCE.getETIOType();

  }

} //EcdarTextPackage
