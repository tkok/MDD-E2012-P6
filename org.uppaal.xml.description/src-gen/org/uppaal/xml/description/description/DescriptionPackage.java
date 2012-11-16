/**
 */
package org.uppaal.xml.description.description;

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
 * @see org.uppaal.xml.description.description.DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "description";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uppaal.org/xml/description/Description";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "description";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DescriptionPackage eINSTANCE = org.uppaal.xml.description.description.impl.DescriptionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.TopImpl <em>Top</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.TopImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getTop()
   * @generated
   */
  int TOP = 0;

  /**
   * The number of structural features of the '<em>Top</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASystemDefinitionImpl <em>UA System Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASystemDefinitionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystemDefinition()
   * @generated
   */
  int UA_SYSTEM_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_DEFINITION__DEFINITIONS = TOP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_DEFINITION__SYSTEM = TOP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA System Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_DEFINITION_FEATURE_COUNT = TOP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UADefinitionImpl <em>UA Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UADefinitionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADefinition()
   * @generated
   */
  int UA_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>UA Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAInstantiationImpl <em>UA Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAInstantiationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAInstantiation()
   * @generated
   */
  int UA_INSTANTIATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INSTANTIATION__NAME = UA_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INSTANTIATION__PARAMETERS = UA_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INSTANTIATION__TARGET = UA_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INSTANTIATION__ARGUMENTS = UA_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>UA Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INSTANTIATION_FEATURE_COUNT = UA_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASystemImpl <em>UA System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASystemImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystem()
   * @generated
   */
  int UA_SYSTEM = 4;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM__SYSTEMS = 0;

  /**
   * The number of structural features of the '<em>UA System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASystemIDImpl <em>UA System ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASystemIDImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystemID()
   * @generated
   */
  int UA_SYSTEM_ID = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>UA System ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYSTEM_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAArrayDeclarationImpl <em>UA Array Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAArrayDeclarationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAArrayDeclaration()
   * @generated
   */
  int UA_ARRAY_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ARRAY_DECLARATION__SIZE = 0;

  /**
   * The number of structural features of the '<em>UA Array Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ARRAY_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UADeclarationsImpl <em>UA Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UADeclarationsImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADeclarations()
   * @generated
   */
  int UA_DECLARATIONS = 7;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DECLARATIONS__DECLARATIONS = TOP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DECLARATIONS_FEATURE_COUNT = TOP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UADeclarationImpl <em>UA Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UADeclarationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADeclaration()
   * @generated
   */
  int UA_DECLARATION = 8;

  /**
   * The number of structural features of the '<em>UA Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DECLARATION_FEATURE_COUNT = UA_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UATypeImpl <em>UA Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UATypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAType()
   * @generated
   */
  int UA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE__IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>UA Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl <em>UA Type Modifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UATypeModifiersImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeModifiers()
   * @generated
   */
  int UA_TYPE_MODIFIERS = 10;

  /**
   * The feature id for the '<em><b>Urgent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_MODIFIERS__URGENT = 0;

  /**
   * The feature id for the '<em><b>Broadcast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_MODIFIERS__BROADCAST = 1;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_MODIFIERS__META = 2;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_MODIFIERS__CONST = 3;

  /**
   * The number of structural features of the '<em>UA Type Modifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_MODIFIERS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAVariableDeclarationImpl <em>UA Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAVariableDeclarationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAVariableDeclaration()
   * @generated
   */
  int UA_VARIABLE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_DECLARATION__TYPE = UA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_DECLARATION__VARIABLES = UA_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_DECLARATION_FEATURE_COUNT = UA_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAVariableIDImpl <em>UA Variable ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAVariableIDImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAVariableID()
   * @generated
   */
  int UA_VARIABLE_ID = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_ID__DIMENSIONS = 1;

  /**
   * The feature id for the '<em><b>Initialiser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_ID__INITIALISER = 2;

  /**
   * The number of structural features of the '<em>UA Variable ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_VARIABLE_ID_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAInitialiserImpl <em>UA Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAInitialiserImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAInitialiser()
   * @generated
   */
  int UA_INITIALISER = 13;

  /**
   * The number of structural features of the '<em>UA Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INITIALISER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASingleInitialiserImpl <em>UA Single Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASingleInitialiserImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASingleInitialiser()
   * @generated
   */
  int UA_SINGLE_INITIALISER = 14;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SINGLE_INITIALISER__EXPRESSION = UA_INITIALISER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Single Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SINGLE_INITIALISER_FEATURE_COUNT = UA_INITIALISER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMultiInitialiserImpl <em>UA Multi Initialiser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMultiInitialiserImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiInitialiser()
   * @generated
   */
  int UA_MULTI_INITIALISER = 15;

  /**
   * The feature id for the '<em><b>Initialisers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTI_INITIALISER__INITIALISERS = UA_INITIALISER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Multi Initialiser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTI_INITIALISER_FEATURE_COUNT = UA_INITIALISER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UATypeDeclarationImpl <em>UA Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UATypeDeclarationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeDeclaration()
   * @generated
   */
  int UA_TYPE_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_DECLARATION__BASE_TYPE = UA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_DECLARATION__TYPES = UA_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_DECLARATION_FEATURE_COUNT = UA_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UATypeIDImpl <em>UA Type ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UATypeIDImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeID()
   * @generated
   */
  int UA_TYPE_ID = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_ID__DIMENSIONS = 1;

  /**
   * The number of structural features of the '<em>UA Type ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UATypeIdentifierImpl <em>UA Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UATypeIdentifierImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeIdentifier()
   * @generated
   */
  int UA_TYPE_IDENTIFIER = 18;

  /**
   * The number of structural features of the '<em>UA Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_TYPE_IDENTIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAIntegerTypeImpl <em>UA Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAIntegerTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAIntegerType()
   * @generated
   */
  int UA_INTEGER_TYPE = 19;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INTEGER_TYPE__MIN = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INTEGER_TYPE__MAX = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_INTEGER_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAClockTypeImpl <em>UA Clock Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAClockTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAClockType()
   * @generated
   */
  int UA_CLOCK_TYPE = 20;

  /**
   * The number of structural features of the '<em>UA Clock Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CLOCK_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAChannelTypeImpl <em>UA Channel Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAChannelTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAChannelType()
   * @generated
   */
  int UA_CHANNEL_TYPE = 21;

  /**
   * The number of structural features of the '<em>UA Channel Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CHANNEL_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABooleanTypeImpl <em>UA Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABooleanTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABooleanType()
   * @generated
   */
  int UA_BOOLEAN_TYPE = 22;

  /**
   * The number of structural features of the '<em>UA Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BOOLEAN_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAScalarTypeImpl <em>UA Scalar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAScalarTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAScalarType()
   * @generated
   */
  int UA_SCALAR_TYPE = 23;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SCALAR_TYPE__SIZE = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Scalar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SCALAR_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAStructTypeImpl <em>UA Struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAStructTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAStructType()
   * @generated
   */
  int UA_STRUCT_TYPE = 24;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_STRUCT_TYPE__DECLARATIONS = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_STRUCT_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAFieldDeclarationImpl <em>UA Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAFieldDeclarationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAFieldDeclaration()
   * @generated
   */
  int UA_FIELD_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_DECLARATION__FIELDS = 1;

  /**
   * The number of structural features of the '<em>UA Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAFieldIDImpl <em>UA Field ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAFieldIDImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAFieldID()
   * @generated
   */
  int UA_FIELD_ID = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_ID__DIMENSIONS = 1;

  /**
   * The number of structural features of the '<em>UA Field ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FIELD_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAParametersImpl <em>UA Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAParametersImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAParameters()
   * @generated
   */
  int UA_PARAMETERS = 27;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETERS__PARAMETERS = TOP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETERS_FEATURE_COUNT = TOP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAParameterImpl <em>UA Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAParameterImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAParameter()
   * @generated
   */
  int UA_PARAMETER = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>By Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETER__BY_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETER__NAME = 2;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETER__DIMENSIONS = 3;

  /**
   * The number of structural features of the '<em>UA Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAExpressionImpl <em>UA Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAExpression()
   * @generated
   */
  int UA_EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>UA Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EXPRESSION_FEATURE_COUNT = TOP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASelectListImpl <em>UA Select List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASelectListImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASelectList()
   * @generated
   */
  int UA_SELECT_LIST = 30;

  /**
   * The feature id for the '<em><b>Selects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SELECT_LIST__SELECTS = TOP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Select List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SELECT_LIST_FEATURE_COUNT = TOP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASelectImpl <em>UA Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASelectImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASelect()
   * @generated
   */
  int UA_SELECT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SELECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SELECT__TYPE = 1;

  /**
   * The number of structural features of the '<em>UA Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SELECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAUpdateImpl <em>UA Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAUpdateImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUpdate()
   * @generated
   */
  int UA_UPDATE = 32;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_UPDATE__EXPRESSIONS = TOP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_UPDATE_FEATURE_COUNT = TOP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASynchronisationImpl <em>UA Synchronisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASynchronisationImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASynchronisation()
   * @generated
   */
  int UA_SYNCHRONISATION = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYNCHRONISATION__EXPRESSION = TOP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYNCHRONISATION__TYPE = TOP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Synchronisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SYNCHRONISATION_FEATURE_COUNT = TOP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAUserTypeImpl <em>UA User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAUserTypeImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUserType()
   * @generated
   */
  int UA_USER_TYPE = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_USER_TYPE__NAME = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA User Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_USER_TYPE_FEATURE_COUNT = UA_TYPE_IDENTIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAForallExpressionImpl <em>UA Forall Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAForallExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAForallExpression()
   * @generated
   */
  int UA_FORALL_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FORALL_EXPRESSION__NAME = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FORALL_EXPRESSION__TYPE = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FORALL_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>UA Forall Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_FORALL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAExistsExpressionImpl <em>UA Exists Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAExistsExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAExistsExpression()
   * @generated
   */
  int UA_EXISTS_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EXISTS_EXPRESSION__NAME = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EXISTS_EXPRESSION__TYPE = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EXISTS_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>UA Exists Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EXISTS_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAImplyExpressionImpl <em>UA Imply Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAImplyExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAImplyExpression()
   * @generated
   */
  int UA_IMPLY_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_IMPLY_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_IMPLY_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Imply Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_IMPLY_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UALogicOrExpressionImpl <em>UA Logic Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UALogicOrExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicOrExpression()
   * @generated
   */
  int UA_LOGIC_OR_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_OR_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_OR_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Logic Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_OR_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UALogicAndExpressionImpl <em>UA Logic And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UALogicAndExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicAndExpression()
   * @generated
   */
  int UA_LOGIC_AND_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_AND_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_AND_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Logic And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_AND_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAAssignmentExpressionImpl <em>UA Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAssignmentExpression()
   * @generated
   */
  int UA_ASSIGNMENT_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAAdditionAssignmentExpressionImpl <em>UA Addition Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAAdditionAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAdditionAssignmentExpression()
   * @generated
   */
  int UA_ADDITION_ASSIGNMENT_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADDITION_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Addition Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADDITION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASubtractionAssignmentExpressionImpl <em>UA Subtraction Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASubtractionAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASubtractionAssignmentExpression()
   * @generated
   */
  int UA_SUBTRACTION_ASSIGNMENT_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Subtraction Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACTION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMultiplicationAssignmentExpressionImpl <em>UA Multiplication Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMultiplicationAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiplicationAssignmentExpression()
   * @generated
   */
  int UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Multiplication Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UADivisionAssignmentExpressionImpl <em>UA Division Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UADivisionAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADivisionAssignmentExpression()
   * @generated
   */
  int UA_DIVISION_ASSIGNMENT_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVISION_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Division Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVISION_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAModuloAssignmentExpressionImpl <em>UA Modulo Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAModuloAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAModuloAssignmentExpression()
   * @generated
   */
  int UA_MODULO_ASSIGNMENT_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Modulo Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitOrAssignmentExpressionImpl <em>UA Bit Or Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitOrAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitOrAssignmentExpression()
   * @generated
   */
  int UA_BIT_OR_ASSIGNMENT_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Or Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitAndAssignmentExpressionImpl <em>UA Bit And Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitAndAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitAndAssignmentExpression()
   * @generated
   */
  int UA_BIT_AND_ASSIGNMENT_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit And Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitXORAssignmentExpressionImpl <em>UA Bit XOR Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitXORAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitXORAssignmentExpression()
   * @generated
   */
  int UA_BIT_XOR_ASSIGNMENT_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit XOR Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitLeftAssignmentExpressionImpl <em>UA Bit Left Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitLeftAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitLeftAssignmentExpression()
   * @generated
   */
  int UA_BIT_LEFT_ASSIGNMENT_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Left Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitRightAssignmentExpressionImpl <em>UA Bit Right Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitRightAssignmentExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitRightAssignmentExpression()
   * @generated
   */
  int UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Right Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAConditionalExpressionImpl <em>UA Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAConditionalExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAConditionalExpression()
   * @generated
   */
  int UA_CONDITIONAL_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CONDITIONAL_EXPRESSION__CONDITION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CONDITIONAL_EXPRESSION__THEN = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CONDITIONAL_EXPRESSION__ELSE = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>UA Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_CONDITIONAL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitOrExpressionImpl <em>UA Bit Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitOrExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitOrExpression()
   * @generated
   */
  int UA_BIT_OR_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_OR_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitXORExpressionImpl <em>UA Bit XOR Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitXORExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitXORExpression()
   * @generated
   */
  int UA_BIT_XOR_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit XOR Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_XOR_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitAndExpressionImpl <em>UA Bit And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitAndExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitAndExpression()
   * @generated
   */
  int UA_BIT_AND_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_AND_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAEqualExpressionImpl <em>UA Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAEqualExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAEqualExpression()
   * @generated
   */
  int UA_EQUAL_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EQUAL_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EQUAL_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_EQUAL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAUnequalExpressionImpl <em>UA Unequal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAUnequalExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUnequalExpression()
   * @generated
   */
  int UA_UNEQUAL_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_UNEQUAL_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_UNEQUAL_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Unequal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_UNEQUAL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UALessExpressionImpl <em>UA Less Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UALessExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALessExpression()
   * @generated
   */
  int UA_LESS_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Less Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UALessEqualExpressionImpl <em>UA Less Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UALessEqualExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALessEqualExpression()
   * @generated
   */
  int UA_LESS_EQUAL_EXPRESSION = 58;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EQUAL_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EQUAL_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Less Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LESS_EQUAL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAGreaterEqualExpressionImpl <em>UA Greater Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAGreaterEqualExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAGreaterEqualExpression()
   * @generated
   */
  int UA_GREATER_EQUAL_EXPRESSION = 59;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EQUAL_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EQUAL_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Greater Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EQUAL_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAGreaterExpressionImpl <em>UA Greater Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAGreaterExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAGreaterExpression()
   * @generated
   */
  int UA_GREATER_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Greater Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_GREATER_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMinExpressionImpl <em>UA Min Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMinExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMinExpression()
   * @generated
   */
  int UA_MIN_EXPRESSION = 61;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MIN_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MIN_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Min Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MIN_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMaxExpressionImpl <em>UA Max Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMaxExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMaxExpression()
   * @generated
   */
  int UA_MAX_EXPRESSION = 62;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MAX_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MAX_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Max Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MAX_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitLeftExpressionImpl <em>UA Bit Left Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitLeftExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitLeftExpression()
   * @generated
   */
  int UA_BIT_LEFT_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Left Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_LEFT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABitRightExpressionImpl <em>UA Bit Right Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABitRightExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitRightExpression()
   * @generated
   */
  int UA_BIT_RIGHT_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Bit Right Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BIT_RIGHT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAAddExpressionImpl <em>UA Add Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAAddExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAddExpression()
   * @generated
   */
  int UA_ADD_EXPRESSION = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADD_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADD_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Add Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ADD_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UASubtractExpressionImpl <em>UA Subtract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UASubtractExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASubtractExpression()
   * @generated
   */
  int UA_SUBTRACT_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Subtract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_SUBTRACT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMultiplyExpressionImpl <em>UA Multiply Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMultiplyExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiplyExpression()
   * @generated
   */
  int UA_MULTIPLY_EXPRESSION = 67;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLY_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLY_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Multiply Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MULTIPLY_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UADivideExpressionImpl <em>UA Divide Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UADivideExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADivideExpression()
   * @generated
   */
  int UA_DIVIDE_EXPRESSION = 68;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVIDE_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVIDE_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Divide Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_DIVIDE_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAModuloExpressionImpl <em>UA Modulo Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAModuloExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAModuloExpression()
   * @generated
   */
  int UA_MODULO_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Modulo Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MODULO_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAPreIncrementExpressionImpl <em>UA Pre Increment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAPreIncrementExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPreIncrementExpression()
   * @generated
   */
  int UA_PRE_INCREMENT_EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PRE_INCREMENT_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Pre Increment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PRE_INCREMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAPreDecrementExpressionImpl <em>UA Pre Decrement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAPreDecrementExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPreDecrementExpression()
   * @generated
   */
  int UA_PRE_DECREMENT_EXPRESSION = 71;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PRE_DECREMENT_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Pre Decrement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_PRE_DECREMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UALogicNotExpressionImpl <em>UA Logic Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UALogicNotExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicNotExpression()
   * @generated
   */
  int UA_LOGIC_NOT_EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_NOT_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Logic Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_LOGIC_NOT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAMinusExpressionImpl <em>UA Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAMinusExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMinusExpression()
   * @generated
   */
  int UA_MINUS_EXPRESSION = 73;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MINUS_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Minus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_MINUS_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAPostIncrementExpressionImpl <em>UA Post Increment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAPostIncrementExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPostIncrementExpression()
   * @generated
   */
  int UA_POST_INCREMENT_EXPRESSION = 74;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_POST_INCREMENT_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Post Increment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_POST_INCREMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAPostDecrementExpressionImpl <em>UA Post Decrement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAPostDecrementExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPostDecrementExpression()
   * @generated
   */
  int UA_POST_DECREMENT_EXPRESSION = 75;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_POST_DECREMENT_EXPRESSION__EXPRESSION = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Post Decrement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_POST_DECREMENT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAStructExpressionImpl <em>UA Struct Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAStructExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAStructExpression()
   * @generated
   */
  int UA_STRUCT_EXPRESSION = 76;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_STRUCT_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_STRUCT_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Struct Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_STRUCT_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAArrayExpressionImpl <em>UA Array Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAArrayExpressionImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAArrayExpression()
   * @generated
   */
  int UA_ARRAY_EXPRESSION = 77;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ARRAY_EXPRESSION__LEFT = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ARRAY_EXPRESSION__RIGHT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UA Array Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_ARRAY_EXPRESSION_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UAReferenceImpl <em>UA Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UAReferenceImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAReference()
   * @generated
   */
  int UA_REFERENCE = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_REFERENCE__NAME = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_REFERENCE_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UABooleanLiteralImpl <em>UA Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UABooleanLiteralImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABooleanLiteral()
   * @generated
   */
  int UA_BOOLEAN_LITERAL = 79;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BOOLEAN_LITERAL__VALUE = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_BOOLEAN_LITERAL_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.impl.UANumberLiteralImpl <em>UA Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.impl.UANumberLiteralImpl
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUANumberLiteral()
   * @generated
   */
  int UA_NUMBER_LITERAL = 80;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_NUMBER_LITERAL__VALUE = UA_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UA Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UA_NUMBER_LITERAL_FEATURE_COUNT = UA_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uppaal.xml.description.description.UASynchronisationType <em>UA Synchronisation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uppaal.xml.description.description.UASynchronisationType
   * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASynchronisationType()
   * @generated
   */
  int UA_SYNCHRONISATION_TYPE = 81;


  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.Top <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top</em>'.
   * @see org.uppaal.xml.description.description.Top
   * @generated
   */
  EClass getTop();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASystemDefinition <em>UA System Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA System Definition</em>'.
   * @see org.uppaal.xml.description.description.UASystemDefinition
   * @generated
   */
  EClass getUASystemDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UASystemDefinition#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.uppaal.xml.description.description.UASystemDefinition#getDefinitions()
   * @see #getUASystemDefinition()
   * @generated
   */
  EReference getUASystemDefinition_Definitions();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASystemDefinition#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.uppaal.xml.description.description.UASystemDefinition#getSystem()
   * @see #getUASystemDefinition()
   * @generated
   */
  EReference getUASystemDefinition_System();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UADefinition <em>UA Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Definition</em>'.
   * @see org.uppaal.xml.description.description.UADefinition
   * @generated
   */
  EClass getUADefinition();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAInstantiation <em>UA Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Instantiation</em>'.
   * @see org.uppaal.xml.description.description.UAInstantiation
   * @generated
   */
  EClass getUAInstantiation();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAInstantiation#getName()
   * @see #getUAInstantiation()
   * @generated
   */
  EAttribute getUAInstantiation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.uppaal.xml.description.description.UAInstantiation#getParameters()
   * @see #getUAInstantiation()
   * @generated
   */
  EReference getUAInstantiation_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAInstantiation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.uppaal.xml.description.description.UAInstantiation#getTarget()
   * @see #getUAInstantiation()
   * @generated
   */
  EAttribute getUAInstantiation_Target();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAInstantiation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.uppaal.xml.description.description.UAInstantiation#getArguments()
   * @see #getUAInstantiation()
   * @generated
   */
  EReference getUAInstantiation_Arguments();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASystem <em>UA System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA System</em>'.
   * @see org.uppaal.xml.description.description.UASystem
   * @generated
   */
  EClass getUASystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UASystem#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see org.uppaal.xml.description.description.UASystem#getSystems()
   * @see #getUASystem()
   * @generated
   */
  EReference getUASystem_Systems();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASystemID <em>UA System ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA System ID</em>'.
   * @see org.uppaal.xml.description.description.UASystemID
   * @generated
   */
  EClass getUASystemID();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UASystemID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UASystemID#getName()
   * @see #getUASystemID()
   * @generated
   */
  EAttribute getUASystemID_Name();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAArrayDeclaration <em>UA Array Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Array Declaration</em>'.
   * @see org.uppaal.xml.description.description.UAArrayDeclaration
   * @generated
   */
  EClass getUAArrayDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAArrayDeclaration#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see org.uppaal.xml.description.description.UAArrayDeclaration#getSize()
   * @see #getUAArrayDeclaration()
   * @generated
   */
  EReference getUAArrayDeclaration_Size();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UADeclarations <em>UA Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Declarations</em>'.
   * @see org.uppaal.xml.description.description.UADeclarations
   * @generated
   */
  EClass getUADeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UADeclarations#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.uppaal.xml.description.description.UADeclarations#getDeclarations()
   * @see #getUADeclarations()
   * @generated
   */
  EReference getUADeclarations_Declarations();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UADeclaration <em>UA Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Declaration</em>'.
   * @see org.uppaal.xml.description.description.UADeclaration
   * @generated
   */
  EClass getUADeclaration();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAType <em>UA Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Type</em>'.
   * @see org.uppaal.xml.description.description.UAType
   * @generated
   */
  EClass getUAType();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAType#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifiers</em>'.
   * @see org.uppaal.xml.description.description.UAType#getModifiers()
   * @see #getUAType()
   * @generated
   */
  EReference getUAType_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAType#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see org.uppaal.xml.description.description.UAType#getIdentifier()
   * @see #getUAType()
   * @generated
   */
  EReference getUAType_Identifier();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UATypeModifiers <em>UA Type Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Type Modifiers</em>'.
   * @see org.uppaal.xml.description.description.UATypeModifiers
   * @generated
   */
  EClass getUATypeModifiers();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UATypeModifiers#isUrgent <em>Urgent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Urgent</em>'.
   * @see org.uppaal.xml.description.description.UATypeModifiers#isUrgent()
   * @see #getUATypeModifiers()
   * @generated
   */
  EAttribute getUATypeModifiers_Urgent();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UATypeModifiers#isBroadcast <em>Broadcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Broadcast</em>'.
   * @see org.uppaal.xml.description.description.UATypeModifiers#isBroadcast()
   * @see #getUATypeModifiers()
   * @generated
   */
  EAttribute getUATypeModifiers_Broadcast();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UATypeModifiers#isMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta</em>'.
   * @see org.uppaal.xml.description.description.UATypeModifiers#isMeta()
   * @see #getUATypeModifiers()
   * @generated
   */
  EAttribute getUATypeModifiers_Meta();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UATypeModifiers#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.uppaal.xml.description.description.UATypeModifiers#isConst()
   * @see #getUATypeModifiers()
   * @generated
   */
  EAttribute getUATypeModifiers_Const();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAVariableDeclaration <em>UA Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Variable Declaration</em>'.
   * @see org.uppaal.xml.description.description.UAVariableDeclaration
   * @generated
   */
  EClass getUAVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAVariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UAVariableDeclaration#getType()
   * @see #getUAVariableDeclaration()
   * @generated
   */
  EReference getUAVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAVariableDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.uppaal.xml.description.description.UAVariableDeclaration#getVariables()
   * @see #getUAVariableDeclaration()
   * @generated
   */
  EReference getUAVariableDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAVariableID <em>UA Variable ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Variable ID</em>'.
   * @see org.uppaal.xml.description.description.UAVariableID
   * @generated
   */
  EClass getUAVariableID();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAVariableID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAVariableID#getName()
   * @see #getUAVariableID()
   * @generated
   */
  EAttribute getUAVariableID_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAVariableID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see org.uppaal.xml.description.description.UAVariableID#getDimensions()
   * @see #getUAVariableID()
   * @generated
   */
  EReference getUAVariableID_Dimensions();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAVariableID#getInitialiser <em>Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialiser</em>'.
   * @see org.uppaal.xml.description.description.UAVariableID#getInitialiser()
   * @see #getUAVariableID()
   * @generated
   */
  EReference getUAVariableID_Initialiser();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAInitialiser <em>UA Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Initialiser</em>'.
   * @see org.uppaal.xml.description.description.UAInitialiser
   * @generated
   */
  EClass getUAInitialiser();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASingleInitialiser <em>UA Single Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Single Initialiser</em>'.
   * @see org.uppaal.xml.description.description.UASingleInitialiser
   * @generated
   */
  EClass getUASingleInitialiser();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASingleInitialiser#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UASingleInitialiser#getExpression()
   * @see #getUASingleInitialiser()
   * @generated
   */
  EReference getUASingleInitialiser_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMultiInitialiser <em>UA Multi Initialiser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Multi Initialiser</em>'.
   * @see org.uppaal.xml.description.description.UAMultiInitialiser
   * @generated
   */
  EClass getUAMultiInitialiser();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAMultiInitialiser#getInitialisers <em>Initialisers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisers</em>'.
   * @see org.uppaal.xml.description.description.UAMultiInitialiser#getInitialisers()
   * @see #getUAMultiInitialiser()
   * @generated
   */
  EReference getUAMultiInitialiser_Initialisers();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UATypeDeclaration <em>UA Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Type Declaration</em>'.
   * @see org.uppaal.xml.description.description.UATypeDeclaration
   * @generated
   */
  EClass getUATypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UATypeDeclaration#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see org.uppaal.xml.description.description.UATypeDeclaration#getBaseType()
   * @see #getUATypeDeclaration()
   * @generated
   */
  EReference getUATypeDeclaration_BaseType();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UATypeDeclaration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.uppaal.xml.description.description.UATypeDeclaration#getTypes()
   * @see #getUATypeDeclaration()
   * @generated
   */
  EReference getUATypeDeclaration_Types();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UATypeID <em>UA Type ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Type ID</em>'.
   * @see org.uppaal.xml.description.description.UATypeID
   * @generated
   */
  EClass getUATypeID();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UATypeID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UATypeID#getName()
   * @see #getUATypeID()
   * @generated
   */
  EAttribute getUATypeID_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UATypeID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see org.uppaal.xml.description.description.UATypeID#getDimensions()
   * @see #getUATypeID()
   * @generated
   */
  EReference getUATypeID_Dimensions();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UATypeIdentifier <em>UA Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Type Identifier</em>'.
   * @see org.uppaal.xml.description.description.UATypeIdentifier
   * @generated
   */
  EClass getUATypeIdentifier();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAIntegerType <em>UA Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Integer Type</em>'.
   * @see org.uppaal.xml.description.description.UAIntegerType
   * @generated
   */
  EClass getUAIntegerType();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAIntegerType#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see org.uppaal.xml.description.description.UAIntegerType#getMin()
   * @see #getUAIntegerType()
   * @generated
   */
  EReference getUAIntegerType_Min();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAIntegerType#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see org.uppaal.xml.description.description.UAIntegerType#getMax()
   * @see #getUAIntegerType()
   * @generated
   */
  EReference getUAIntegerType_Max();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAClockType <em>UA Clock Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Clock Type</em>'.
   * @see org.uppaal.xml.description.description.UAClockType
   * @generated
   */
  EClass getUAClockType();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAChannelType <em>UA Channel Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Channel Type</em>'.
   * @see org.uppaal.xml.description.description.UAChannelType
   * @generated
   */
  EClass getUAChannelType();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABooleanType <em>UA Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Boolean Type</em>'.
   * @see org.uppaal.xml.description.description.UABooleanType
   * @generated
   */
  EClass getUABooleanType();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAScalarType <em>UA Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Scalar Type</em>'.
   * @see org.uppaal.xml.description.description.UAScalarType
   * @generated
   */
  EClass getUAScalarType();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAScalarType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see org.uppaal.xml.description.description.UAScalarType#getSize()
   * @see #getUAScalarType()
   * @generated
   */
  EReference getUAScalarType_Size();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAStructType <em>UA Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Struct Type</em>'.
   * @see org.uppaal.xml.description.description.UAStructType
   * @generated
   */
  EClass getUAStructType();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAStructType#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.uppaal.xml.description.description.UAStructType#getDeclarations()
   * @see #getUAStructType()
   * @generated
   */
  EReference getUAStructType_Declarations();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAFieldDeclaration <em>UA Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Field Declaration</em>'.
   * @see org.uppaal.xml.description.description.UAFieldDeclaration
   * @generated
   */
  EClass getUAFieldDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAFieldDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UAFieldDeclaration#getType()
   * @see #getUAFieldDeclaration()
   * @generated
   */
  EReference getUAFieldDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAFieldDeclaration#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.uppaal.xml.description.description.UAFieldDeclaration#getFields()
   * @see #getUAFieldDeclaration()
   * @generated
   */
  EReference getUAFieldDeclaration_Fields();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAFieldID <em>UA Field ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Field ID</em>'.
   * @see org.uppaal.xml.description.description.UAFieldID
   * @generated
   */
  EClass getUAFieldID();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAFieldID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAFieldID#getName()
   * @see #getUAFieldID()
   * @generated
   */
  EAttribute getUAFieldID_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAFieldID#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see org.uppaal.xml.description.description.UAFieldID#getDimensions()
   * @see #getUAFieldID()
   * @generated
   */
  EReference getUAFieldID_Dimensions();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAParameters <em>UA Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Parameters</em>'.
   * @see org.uppaal.xml.description.description.UAParameters
   * @generated
   */
  EClass getUAParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.uppaal.xml.description.description.UAParameters#getParameters()
   * @see #getUAParameters()
   * @generated
   */
  EReference getUAParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAParameter <em>UA Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Parameter</em>'.
   * @see org.uppaal.xml.description.description.UAParameter
   * @generated
   */
  EClass getUAParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UAParameter#getType()
   * @see #getUAParameter()
   * @generated
   */
  EReference getUAParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAParameter#isByReference <em>By Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>By Reference</em>'.
   * @see org.uppaal.xml.description.description.UAParameter#isByReference()
   * @see #getUAParameter()
   * @generated
   */
  EAttribute getUAParameter_ByReference();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAParameter#getName()
   * @see #getUAParameter()
   * @generated
   */
  EAttribute getUAParameter_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAParameter#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see org.uppaal.xml.description.description.UAParameter#getDimensions()
   * @see #getUAParameter()
   * @generated
   */
  EReference getUAParameter_Dimensions();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAExpression <em>UA Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Expression</em>'.
   * @see org.uppaal.xml.description.description.UAExpression
   * @generated
   */
  EClass getUAExpression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASelectList <em>UA Select List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Select List</em>'.
   * @see org.uppaal.xml.description.description.UASelectList
   * @generated
   */
  EClass getUASelectList();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UASelectList#getSelects <em>Selects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selects</em>'.
   * @see org.uppaal.xml.description.description.UASelectList#getSelects()
   * @see #getUASelectList()
   * @generated
   */
  EReference getUASelectList_Selects();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASelect <em>UA Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Select</em>'.
   * @see org.uppaal.xml.description.description.UASelect
   * @generated
   */
  EClass getUASelect();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UASelect#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UASelect#getName()
   * @see #getUASelect()
   * @generated
   */
  EAttribute getUASelect_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASelect#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UASelect#getType()
   * @see #getUASelect()
   * @generated
   */
  EReference getUASelect_Type();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAUpdate <em>UA Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Update</em>'.
   * @see org.uppaal.xml.description.description.UAUpdate
   * @generated
   */
  EClass getUAUpdate();

  /**
   * Returns the meta object for the containment reference list '{@link org.uppaal.xml.description.description.UAUpdate#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.uppaal.xml.description.description.UAUpdate#getExpressions()
   * @see #getUAUpdate()
   * @generated
   */
  EReference getUAUpdate_Expressions();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASynchronisation <em>UA Synchronisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Synchronisation</em>'.
   * @see org.uppaal.xml.description.description.UASynchronisation
   * @generated
   */
  EClass getUASynchronisation();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASynchronisation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UASynchronisation#getExpression()
   * @see #getUASynchronisation()
   * @generated
   */
  EReference getUASynchronisation_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UASynchronisation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UASynchronisation#getType()
   * @see #getUASynchronisation()
   * @generated
   */
  EAttribute getUASynchronisation_Type();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAUserType <em>UA User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA User Type</em>'.
   * @see org.uppaal.xml.description.description.UAUserType
   * @generated
   */
  EClass getUAUserType();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAUserType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAUserType#getName()
   * @see #getUAUserType()
   * @generated
   */
  EAttribute getUAUserType_Name();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAForallExpression <em>UA Forall Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Forall Expression</em>'.
   * @see org.uppaal.xml.description.description.UAForallExpression
   * @generated
   */
  EClass getUAForallExpression();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAForallExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAForallExpression#getName()
   * @see #getUAForallExpression()
   * @generated
   */
  EAttribute getUAForallExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAForallExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UAForallExpression#getType()
   * @see #getUAForallExpression()
   * @generated
   */
  EReference getUAForallExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAForallExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAForallExpression#getExpression()
   * @see #getUAForallExpression()
   * @generated
   */
  EReference getUAForallExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAExistsExpression <em>UA Exists Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Exists Expression</em>'.
   * @see org.uppaal.xml.description.description.UAExistsExpression
   * @generated
   */
  EClass getUAExistsExpression();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAExistsExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAExistsExpression#getName()
   * @see #getUAExistsExpression()
   * @generated
   */
  EAttribute getUAExistsExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAExistsExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.uppaal.xml.description.description.UAExistsExpression#getType()
   * @see #getUAExistsExpression()
   * @generated
   */
  EReference getUAExistsExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAExistsExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAExistsExpression#getExpression()
   * @see #getUAExistsExpression()
   * @generated
   */
  EReference getUAExistsExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAImplyExpression <em>UA Imply Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Imply Expression</em>'.
   * @see org.uppaal.xml.description.description.UAImplyExpression
   * @generated
   */
  EClass getUAImplyExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAImplyExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAImplyExpression#getLeft()
   * @see #getUAImplyExpression()
   * @generated
   */
  EReference getUAImplyExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAImplyExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAImplyExpression#getRight()
   * @see #getUAImplyExpression()
   * @generated
   */
  EReference getUAImplyExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UALogicOrExpression <em>UA Logic Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Logic Or Expression</em>'.
   * @see org.uppaal.xml.description.description.UALogicOrExpression
   * @generated
   */
  EClass getUALogicOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALogicOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UALogicOrExpression#getLeft()
   * @see #getUALogicOrExpression()
   * @generated
   */
  EReference getUALogicOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALogicOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UALogicOrExpression#getRight()
   * @see #getUALogicOrExpression()
   * @generated
   */
  EReference getUALogicOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UALogicAndExpression <em>UA Logic And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Logic And Expression</em>'.
   * @see org.uppaal.xml.description.description.UALogicAndExpression
   * @generated
   */
  EClass getUALogicAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALogicAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UALogicAndExpression#getLeft()
   * @see #getUALogicAndExpression()
   * @generated
   */
  EReference getUALogicAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALogicAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UALogicAndExpression#getRight()
   * @see #getUALogicAndExpression()
   * @generated
   */
  EReference getUALogicAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAAssignmentExpression <em>UA Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAAssignmentExpression
   * @generated
   */
  EClass getUAAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAAssignmentExpression#getLeft()
   * @see #getUAAssignmentExpression()
   * @generated
   */
  EReference getUAAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAAssignmentExpression#getRight()
   * @see #getUAAssignmentExpression()
   * @generated
   */
  EReference getUAAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAAdditionAssignmentExpression <em>UA Addition Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Addition Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAAdditionAssignmentExpression
   * @generated
   */
  EClass getUAAdditionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAdditionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAAdditionAssignmentExpression#getLeft()
   * @see #getUAAdditionAssignmentExpression()
   * @generated
   */
  EReference getUAAdditionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAdditionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAAdditionAssignmentExpression#getRight()
   * @see #getUAAdditionAssignmentExpression()
   * @generated
   */
  EReference getUAAdditionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASubtractionAssignmentExpression <em>UA Subtraction Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Subtraction Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UASubtractionAssignmentExpression
   * @generated
   */
  EClass getUASubtractionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASubtractionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UASubtractionAssignmentExpression#getLeft()
   * @see #getUASubtractionAssignmentExpression()
   * @generated
   */
  EReference getUASubtractionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASubtractionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UASubtractionAssignmentExpression#getRight()
   * @see #getUASubtractionAssignmentExpression()
   * @generated
   */
  EReference getUASubtractionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression <em>UA Multiplication Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Multiplication Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression
   * @generated
   */
  EClass getUAMultiplicationAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression#getLeft()
   * @see #getUAMultiplicationAssignmentExpression()
   * @generated
   */
  EReference getUAMultiplicationAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression#getRight()
   * @see #getUAMultiplicationAssignmentExpression()
   * @generated
   */
  EReference getUAMultiplicationAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UADivisionAssignmentExpression <em>UA Division Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Division Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UADivisionAssignmentExpression
   * @generated
   */
  EClass getUADivisionAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UADivisionAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UADivisionAssignmentExpression#getLeft()
   * @see #getUADivisionAssignmentExpression()
   * @generated
   */
  EReference getUADivisionAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UADivisionAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UADivisionAssignmentExpression#getRight()
   * @see #getUADivisionAssignmentExpression()
   * @generated
   */
  EReference getUADivisionAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAModuloAssignmentExpression <em>UA Modulo Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Modulo Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAModuloAssignmentExpression
   * @generated
   */
  EClass getUAModuloAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAModuloAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAModuloAssignmentExpression#getLeft()
   * @see #getUAModuloAssignmentExpression()
   * @generated
   */
  EReference getUAModuloAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAModuloAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAModuloAssignmentExpression#getRight()
   * @see #getUAModuloAssignmentExpression()
   * @generated
   */
  EReference getUAModuloAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitOrAssignmentExpression <em>UA Bit Or Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Or Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitOrAssignmentExpression
   * @generated
   */
  EClass getUABitOrAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitOrAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitOrAssignmentExpression#getLeft()
   * @see #getUABitOrAssignmentExpression()
   * @generated
   */
  EReference getUABitOrAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitOrAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitOrAssignmentExpression#getRight()
   * @see #getUABitOrAssignmentExpression()
   * @generated
   */
  EReference getUABitOrAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitAndAssignmentExpression <em>UA Bit And Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit And Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitAndAssignmentExpression
   * @generated
   */
  EClass getUABitAndAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitAndAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitAndAssignmentExpression#getLeft()
   * @see #getUABitAndAssignmentExpression()
   * @generated
   */
  EReference getUABitAndAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitAndAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitAndAssignmentExpression#getRight()
   * @see #getUABitAndAssignmentExpression()
   * @generated
   */
  EReference getUABitAndAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitXORAssignmentExpression <em>UA Bit XOR Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit XOR Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitXORAssignmentExpression
   * @generated
   */
  EClass getUABitXORAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitXORAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitXORAssignmentExpression#getLeft()
   * @see #getUABitXORAssignmentExpression()
   * @generated
   */
  EReference getUABitXORAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitXORAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitXORAssignmentExpression#getRight()
   * @see #getUABitXORAssignmentExpression()
   * @generated
   */
  EReference getUABitXORAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitLeftAssignmentExpression <em>UA Bit Left Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Left Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftAssignmentExpression
   * @generated
   */
  EClass getUABitLeftAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitLeftAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftAssignmentExpression#getLeft()
   * @see #getUABitLeftAssignmentExpression()
   * @generated
   */
  EReference getUABitLeftAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitLeftAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftAssignmentExpression#getRight()
   * @see #getUABitLeftAssignmentExpression()
   * @generated
   */
  EReference getUABitLeftAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitRightAssignmentExpression <em>UA Bit Right Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Right Assignment Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitRightAssignmentExpression
   * @generated
   */
  EClass getUABitRightAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitRightAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitRightAssignmentExpression#getLeft()
   * @see #getUABitRightAssignmentExpression()
   * @generated
   */
  EReference getUABitRightAssignmentExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitRightAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitRightAssignmentExpression#getRight()
   * @see #getUABitRightAssignmentExpression()
   * @generated
   */
  EReference getUABitRightAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAConditionalExpression <em>UA Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Conditional Expression</em>'.
   * @see org.uppaal.xml.description.description.UAConditionalExpression
   * @generated
   */
  EClass getUAConditionalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAConditionalExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.uppaal.xml.description.description.UAConditionalExpression#getCondition()
   * @see #getUAConditionalExpression()
   * @generated
   */
  EReference getUAConditionalExpression_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAConditionalExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.uppaal.xml.description.description.UAConditionalExpression#getThen()
   * @see #getUAConditionalExpression()
   * @generated
   */
  EReference getUAConditionalExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAConditionalExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.uppaal.xml.description.description.UAConditionalExpression#getElse()
   * @see #getUAConditionalExpression()
   * @generated
   */
  EReference getUAConditionalExpression_Else();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitOrExpression <em>UA Bit Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Or Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitOrExpression
   * @generated
   */
  EClass getUABitOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitOrExpression#getLeft()
   * @see #getUABitOrExpression()
   * @generated
   */
  EReference getUABitOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitOrExpression#getRight()
   * @see #getUABitOrExpression()
   * @generated
   */
  EReference getUABitOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitXORExpression <em>UA Bit XOR Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit XOR Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitXORExpression
   * @generated
   */
  EClass getUABitXORExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitXORExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitXORExpression#getLeft()
   * @see #getUABitXORExpression()
   * @generated
   */
  EReference getUABitXORExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitXORExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitXORExpression#getRight()
   * @see #getUABitXORExpression()
   * @generated
   */
  EReference getUABitXORExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitAndExpression <em>UA Bit And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit And Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitAndExpression
   * @generated
   */
  EClass getUABitAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitAndExpression#getLeft()
   * @see #getUABitAndExpression()
   * @generated
   */
  EReference getUABitAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitAndExpression#getRight()
   * @see #getUABitAndExpression()
   * @generated
   */
  EReference getUABitAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAEqualExpression <em>UA Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Equal Expression</em>'.
   * @see org.uppaal.xml.description.description.UAEqualExpression
   * @generated
   */
  EClass getUAEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAEqualExpression#getLeft()
   * @see #getUAEqualExpression()
   * @generated
   */
  EReference getUAEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAEqualExpression#getRight()
   * @see #getUAEqualExpression()
   * @generated
   */
  EReference getUAEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAUnequalExpression <em>UA Unequal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Unequal Expression</em>'.
   * @see org.uppaal.xml.description.description.UAUnequalExpression
   * @generated
   */
  EClass getUAUnequalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAUnequalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAUnequalExpression#getLeft()
   * @see #getUAUnequalExpression()
   * @generated
   */
  EReference getUAUnequalExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAUnequalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAUnequalExpression#getRight()
   * @see #getUAUnequalExpression()
   * @generated
   */
  EReference getUAUnequalExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UALessExpression <em>UA Less Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Less Expression</em>'.
   * @see org.uppaal.xml.description.description.UALessExpression
   * @generated
   */
  EClass getUALessExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALessExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UALessExpression#getLeft()
   * @see #getUALessExpression()
   * @generated
   */
  EReference getUALessExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALessExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UALessExpression#getRight()
   * @see #getUALessExpression()
   * @generated
   */
  EReference getUALessExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UALessEqualExpression <em>UA Less Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Less Equal Expression</em>'.
   * @see org.uppaal.xml.description.description.UALessEqualExpression
   * @generated
   */
  EClass getUALessEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALessEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UALessEqualExpression#getLeft()
   * @see #getUALessEqualExpression()
   * @generated
   */
  EReference getUALessEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALessEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UALessEqualExpression#getRight()
   * @see #getUALessEqualExpression()
   * @generated
   */
  EReference getUALessEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAGreaterEqualExpression <em>UA Greater Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Greater Equal Expression</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterEqualExpression
   * @generated
   */
  EClass getUAGreaterEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAGreaterEqualExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterEqualExpression#getLeft()
   * @see #getUAGreaterEqualExpression()
   * @generated
   */
  EReference getUAGreaterEqualExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAGreaterEqualExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterEqualExpression#getRight()
   * @see #getUAGreaterEqualExpression()
   * @generated
   */
  EReference getUAGreaterEqualExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAGreaterExpression <em>UA Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Greater Expression</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterExpression
   * @generated
   */
  EClass getUAGreaterExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAGreaterExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterExpression#getLeft()
   * @see #getUAGreaterExpression()
   * @generated
   */
  EReference getUAGreaterExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAGreaterExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAGreaterExpression#getRight()
   * @see #getUAGreaterExpression()
   * @generated
   */
  EReference getUAGreaterExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMinExpression <em>UA Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Min Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMinExpression
   * @generated
   */
  EClass getUAMinExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMinExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAMinExpression#getLeft()
   * @see #getUAMinExpression()
   * @generated
   */
  EReference getUAMinExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMinExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAMinExpression#getRight()
   * @see #getUAMinExpression()
   * @generated
   */
  EReference getUAMinExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMaxExpression <em>UA Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Max Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMaxExpression
   * @generated
   */
  EClass getUAMaxExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMaxExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAMaxExpression#getLeft()
   * @see #getUAMaxExpression()
   * @generated
   */
  EReference getUAMaxExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMaxExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAMaxExpression#getRight()
   * @see #getUAMaxExpression()
   * @generated
   */
  EReference getUAMaxExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitLeftExpression <em>UA Bit Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Left Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftExpression
   * @generated
   */
  EClass getUABitLeftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitLeftExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftExpression#getLeft()
   * @see #getUABitLeftExpression()
   * @generated
   */
  EReference getUABitLeftExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitLeftExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitLeftExpression#getRight()
   * @see #getUABitLeftExpression()
   * @generated
   */
  EReference getUABitLeftExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABitRightExpression <em>UA Bit Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Bit Right Expression</em>'.
   * @see org.uppaal.xml.description.description.UABitRightExpression
   * @generated
   */
  EClass getUABitRightExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitRightExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UABitRightExpression#getLeft()
   * @see #getUABitRightExpression()
   * @generated
   */
  EReference getUABitRightExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UABitRightExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UABitRightExpression#getRight()
   * @see #getUABitRightExpression()
   * @generated
   */
  EReference getUABitRightExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAAddExpression <em>UA Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Add Expression</em>'.
   * @see org.uppaal.xml.description.description.UAAddExpression
   * @generated
   */
  EClass getUAAddExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAddExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAAddExpression#getLeft()
   * @see #getUAAddExpression()
   * @generated
   */
  EReference getUAAddExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAAddExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAAddExpression#getRight()
   * @see #getUAAddExpression()
   * @generated
   */
  EReference getUAAddExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UASubtractExpression <em>UA Subtract Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Subtract Expression</em>'.
   * @see org.uppaal.xml.description.description.UASubtractExpression
   * @generated
   */
  EClass getUASubtractExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASubtractExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UASubtractExpression#getLeft()
   * @see #getUASubtractExpression()
   * @generated
   */
  EReference getUASubtractExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UASubtractExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UASubtractExpression#getRight()
   * @see #getUASubtractExpression()
   * @generated
   */
  EReference getUASubtractExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMultiplyExpression <em>UA Multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Multiply Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplyExpression
   * @generated
   */
  EClass getUAMultiplyExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMultiplyExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplyExpression#getLeft()
   * @see #getUAMultiplyExpression()
   * @generated
   */
  EReference getUAMultiplyExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMultiplyExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAMultiplyExpression#getRight()
   * @see #getUAMultiplyExpression()
   * @generated
   */
  EReference getUAMultiplyExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UADivideExpression <em>UA Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Divide Expression</em>'.
   * @see org.uppaal.xml.description.description.UADivideExpression
   * @generated
   */
  EClass getUADivideExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UADivideExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UADivideExpression#getLeft()
   * @see #getUADivideExpression()
   * @generated
   */
  EReference getUADivideExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UADivideExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UADivideExpression#getRight()
   * @see #getUADivideExpression()
   * @generated
   */
  EReference getUADivideExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAModuloExpression <em>UA Modulo Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Modulo Expression</em>'.
   * @see org.uppaal.xml.description.description.UAModuloExpression
   * @generated
   */
  EClass getUAModuloExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAModuloExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAModuloExpression#getLeft()
   * @see #getUAModuloExpression()
   * @generated
   */
  EReference getUAModuloExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAModuloExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAModuloExpression#getRight()
   * @see #getUAModuloExpression()
   * @generated
   */
  EReference getUAModuloExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAPreIncrementExpression <em>UA Pre Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Pre Increment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPreIncrementExpression
   * @generated
   */
  EClass getUAPreIncrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAPreIncrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPreIncrementExpression#getExpression()
   * @see #getUAPreIncrementExpression()
   * @generated
   */
  EReference getUAPreIncrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAPreDecrementExpression <em>UA Pre Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Pre Decrement Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPreDecrementExpression
   * @generated
   */
  EClass getUAPreDecrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAPreDecrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPreDecrementExpression#getExpression()
   * @see #getUAPreDecrementExpression()
   * @generated
   */
  EReference getUAPreDecrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UALogicNotExpression <em>UA Logic Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Logic Not Expression</em>'.
   * @see org.uppaal.xml.description.description.UALogicNotExpression
   * @generated
   */
  EClass getUALogicNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UALogicNotExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UALogicNotExpression#getExpression()
   * @see #getUALogicNotExpression()
   * @generated
   */
  EReference getUALogicNotExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAMinusExpression <em>UA Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Minus Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMinusExpression
   * @generated
   */
  EClass getUAMinusExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAMinusExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAMinusExpression#getExpression()
   * @see #getUAMinusExpression()
   * @generated
   */
  EReference getUAMinusExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAPostIncrementExpression <em>UA Post Increment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Post Increment Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPostIncrementExpression
   * @generated
   */
  EClass getUAPostIncrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAPostIncrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPostIncrementExpression#getExpression()
   * @see #getUAPostIncrementExpression()
   * @generated
   */
  EReference getUAPostIncrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAPostDecrementExpression <em>UA Post Decrement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Post Decrement Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPostDecrementExpression
   * @generated
   */
  EClass getUAPostDecrementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAPostDecrementExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.uppaal.xml.description.description.UAPostDecrementExpression#getExpression()
   * @see #getUAPostDecrementExpression()
   * @generated
   */
  EReference getUAPostDecrementExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAStructExpression <em>UA Struct Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Struct Expression</em>'.
   * @see org.uppaal.xml.description.description.UAStructExpression
   * @generated
   */
  EClass getUAStructExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAStructExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAStructExpression#getLeft()
   * @see #getUAStructExpression()
   * @generated
   */
  EReference getUAStructExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAStructExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAStructExpression#getRight()
   * @see #getUAStructExpression()
   * @generated
   */
  EAttribute getUAStructExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAArrayExpression <em>UA Array Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Array Expression</em>'.
   * @see org.uppaal.xml.description.description.UAArrayExpression
   * @generated
   */
  EClass getUAArrayExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAArrayExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.uppaal.xml.description.description.UAArrayExpression#getLeft()
   * @see #getUAArrayExpression()
   * @generated
   */
  EReference getUAArrayExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.uppaal.xml.description.description.UAArrayExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.uppaal.xml.description.description.UAArrayExpression#getRight()
   * @see #getUAArrayExpression()
   * @generated
   */
  EReference getUAArrayExpression_Right();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UAReference <em>UA Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Reference</em>'.
   * @see org.uppaal.xml.description.description.UAReference
   * @generated
   */
  EClass getUAReference();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UAReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uppaal.xml.description.description.UAReference#getName()
   * @see #getUAReference()
   * @generated
   */
  EAttribute getUAReference_Name();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UABooleanLiteral <em>UA Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Boolean Literal</em>'.
   * @see org.uppaal.xml.description.description.UABooleanLiteral
   * @generated
   */
  EClass getUABooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UABooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.uppaal.xml.description.description.UABooleanLiteral#getValue()
   * @see #getUABooleanLiteral()
   * @generated
   */
  EAttribute getUABooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.uppaal.xml.description.description.UANumberLiteral <em>UA Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UA Number Literal</em>'.
   * @see org.uppaal.xml.description.description.UANumberLiteral
   * @generated
   */
  EClass getUANumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.uppaal.xml.description.description.UANumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.uppaal.xml.description.description.UANumberLiteral#getValue()
   * @see #getUANumberLiteral()
   * @generated
   */
  EAttribute getUANumberLiteral_Value();

  /**
   * Returns the meta object for enum '{@link org.uppaal.xml.description.description.UASynchronisationType <em>UA Synchronisation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>UA Synchronisation Type</em>'.
   * @see org.uppaal.xml.description.description.UASynchronisationType
   * @generated
   */
  EEnum getUASynchronisationType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DescriptionFactory getDescriptionFactory();

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
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.TopImpl <em>Top</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.TopImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getTop()
     * @generated
     */
    EClass TOP = eINSTANCE.getTop();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASystemDefinitionImpl <em>UA System Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASystemDefinitionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystemDefinition()
     * @generated
     */
    EClass UA_SYSTEM_DEFINITION = eINSTANCE.getUASystemDefinition();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SYSTEM_DEFINITION__DEFINITIONS = eINSTANCE.getUASystemDefinition_Definitions();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SYSTEM_DEFINITION__SYSTEM = eINSTANCE.getUASystemDefinition_System();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UADefinitionImpl <em>UA Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UADefinitionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADefinition()
     * @generated
     */
    EClass UA_DEFINITION = eINSTANCE.getUADefinition();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAInstantiationImpl <em>UA Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAInstantiationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAInstantiation()
     * @generated
     */
    EClass UA_INSTANTIATION = eINSTANCE.getUAInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_INSTANTIATION__NAME = eINSTANCE.getUAInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_INSTANTIATION__PARAMETERS = eINSTANCE.getUAInstantiation_Parameters();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_INSTANTIATION__TARGET = eINSTANCE.getUAInstantiation_Target();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_INSTANTIATION__ARGUMENTS = eINSTANCE.getUAInstantiation_Arguments();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASystemImpl <em>UA System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASystemImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystem()
     * @generated
     */
    EClass UA_SYSTEM = eINSTANCE.getUASystem();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SYSTEM__SYSTEMS = eINSTANCE.getUASystem_Systems();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASystemIDImpl <em>UA System ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASystemIDImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASystemID()
     * @generated
     */
    EClass UA_SYSTEM_ID = eINSTANCE.getUASystemID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_SYSTEM_ID__NAME = eINSTANCE.getUASystemID_Name();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAArrayDeclarationImpl <em>UA Array Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAArrayDeclarationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAArrayDeclaration()
     * @generated
     */
    EClass UA_ARRAY_DECLARATION = eINSTANCE.getUAArrayDeclaration();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ARRAY_DECLARATION__SIZE = eINSTANCE.getUAArrayDeclaration_Size();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UADeclarationsImpl <em>UA Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UADeclarationsImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADeclarations()
     * @generated
     */
    EClass UA_DECLARATIONS = eINSTANCE.getUADeclarations();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_DECLARATIONS__DECLARATIONS = eINSTANCE.getUADeclarations_Declarations();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UADeclarationImpl <em>UA Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UADeclarationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADeclaration()
     * @generated
     */
    EClass UA_DECLARATION = eINSTANCE.getUADeclaration();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UATypeImpl <em>UA Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UATypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAType()
     * @generated
     */
    EClass UA_TYPE = eINSTANCE.getUAType();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_TYPE__MODIFIERS = eINSTANCE.getUAType_Modifiers();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_TYPE__IDENTIFIER = eINSTANCE.getUAType_Identifier();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl <em>UA Type Modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UATypeModifiersImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeModifiers()
     * @generated
     */
    EClass UA_TYPE_MODIFIERS = eINSTANCE.getUATypeModifiers();

    /**
     * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_TYPE_MODIFIERS__URGENT = eINSTANCE.getUATypeModifiers_Urgent();

    /**
     * The meta object literal for the '<em><b>Broadcast</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_TYPE_MODIFIERS__BROADCAST = eINSTANCE.getUATypeModifiers_Broadcast();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_TYPE_MODIFIERS__META = eINSTANCE.getUATypeModifiers_Meta();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_TYPE_MODIFIERS__CONST = eINSTANCE.getUATypeModifiers_Const();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAVariableDeclarationImpl <em>UA Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAVariableDeclarationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAVariableDeclaration()
     * @generated
     */
    EClass UA_VARIABLE_DECLARATION = eINSTANCE.getUAVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_VARIABLE_DECLARATION__TYPE = eINSTANCE.getUAVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_VARIABLE_DECLARATION__VARIABLES = eINSTANCE.getUAVariableDeclaration_Variables();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAVariableIDImpl <em>UA Variable ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAVariableIDImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAVariableID()
     * @generated
     */
    EClass UA_VARIABLE_ID = eINSTANCE.getUAVariableID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_VARIABLE_ID__NAME = eINSTANCE.getUAVariableID_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_VARIABLE_ID__DIMENSIONS = eINSTANCE.getUAVariableID_Dimensions();

    /**
     * The meta object literal for the '<em><b>Initialiser</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_VARIABLE_ID__INITIALISER = eINSTANCE.getUAVariableID_Initialiser();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAInitialiserImpl <em>UA Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAInitialiserImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAInitialiser()
     * @generated
     */
    EClass UA_INITIALISER = eINSTANCE.getUAInitialiser();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASingleInitialiserImpl <em>UA Single Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASingleInitialiserImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASingleInitialiser()
     * @generated
     */
    EClass UA_SINGLE_INITIALISER = eINSTANCE.getUASingleInitialiser();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SINGLE_INITIALISER__EXPRESSION = eINSTANCE.getUASingleInitialiser_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMultiInitialiserImpl <em>UA Multi Initialiser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMultiInitialiserImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiInitialiser()
     * @generated
     */
    EClass UA_MULTI_INITIALISER = eINSTANCE.getUAMultiInitialiser();

    /**
     * The meta object literal for the '<em><b>Initialisers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MULTI_INITIALISER__INITIALISERS = eINSTANCE.getUAMultiInitialiser_Initialisers();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UATypeDeclarationImpl <em>UA Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UATypeDeclarationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeDeclaration()
     * @generated
     */
    EClass UA_TYPE_DECLARATION = eINSTANCE.getUATypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_TYPE_DECLARATION__BASE_TYPE = eINSTANCE.getUATypeDeclaration_BaseType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_TYPE_DECLARATION__TYPES = eINSTANCE.getUATypeDeclaration_Types();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UATypeIDImpl <em>UA Type ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UATypeIDImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeID()
     * @generated
     */
    EClass UA_TYPE_ID = eINSTANCE.getUATypeID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_TYPE_ID__NAME = eINSTANCE.getUATypeID_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_TYPE_ID__DIMENSIONS = eINSTANCE.getUATypeID_Dimensions();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UATypeIdentifierImpl <em>UA Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UATypeIdentifierImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUATypeIdentifier()
     * @generated
     */
    EClass UA_TYPE_IDENTIFIER = eINSTANCE.getUATypeIdentifier();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAIntegerTypeImpl <em>UA Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAIntegerTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAIntegerType()
     * @generated
     */
    EClass UA_INTEGER_TYPE = eINSTANCE.getUAIntegerType();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_INTEGER_TYPE__MIN = eINSTANCE.getUAIntegerType_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_INTEGER_TYPE__MAX = eINSTANCE.getUAIntegerType_Max();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAClockTypeImpl <em>UA Clock Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAClockTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAClockType()
     * @generated
     */
    EClass UA_CLOCK_TYPE = eINSTANCE.getUAClockType();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAChannelTypeImpl <em>UA Channel Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAChannelTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAChannelType()
     * @generated
     */
    EClass UA_CHANNEL_TYPE = eINSTANCE.getUAChannelType();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABooleanTypeImpl <em>UA Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABooleanTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABooleanType()
     * @generated
     */
    EClass UA_BOOLEAN_TYPE = eINSTANCE.getUABooleanType();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAScalarTypeImpl <em>UA Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAScalarTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAScalarType()
     * @generated
     */
    EClass UA_SCALAR_TYPE = eINSTANCE.getUAScalarType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SCALAR_TYPE__SIZE = eINSTANCE.getUAScalarType_Size();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAStructTypeImpl <em>UA Struct Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAStructTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAStructType()
     * @generated
     */
    EClass UA_STRUCT_TYPE = eINSTANCE.getUAStructType();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_STRUCT_TYPE__DECLARATIONS = eINSTANCE.getUAStructType_Declarations();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAFieldDeclarationImpl <em>UA Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAFieldDeclarationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAFieldDeclaration()
     * @generated
     */
    EClass UA_FIELD_DECLARATION = eINSTANCE.getUAFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_FIELD_DECLARATION__TYPE = eINSTANCE.getUAFieldDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_FIELD_DECLARATION__FIELDS = eINSTANCE.getUAFieldDeclaration_Fields();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAFieldIDImpl <em>UA Field ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAFieldIDImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAFieldID()
     * @generated
     */
    EClass UA_FIELD_ID = eINSTANCE.getUAFieldID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_FIELD_ID__NAME = eINSTANCE.getUAFieldID_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_FIELD_ID__DIMENSIONS = eINSTANCE.getUAFieldID_Dimensions();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAParametersImpl <em>UA Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAParametersImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAParameters()
     * @generated
     */
    EClass UA_PARAMETERS = eINSTANCE.getUAParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_PARAMETERS__PARAMETERS = eINSTANCE.getUAParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAParameterImpl <em>UA Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAParameterImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAParameter()
     * @generated
     */
    EClass UA_PARAMETER = eINSTANCE.getUAParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_PARAMETER__TYPE = eINSTANCE.getUAParameter_Type();

    /**
     * The meta object literal for the '<em><b>By Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_PARAMETER__BY_REFERENCE = eINSTANCE.getUAParameter_ByReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_PARAMETER__NAME = eINSTANCE.getUAParameter_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_PARAMETER__DIMENSIONS = eINSTANCE.getUAParameter_Dimensions();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAExpressionImpl <em>UA Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAExpression()
     * @generated
     */
    EClass UA_EXPRESSION = eINSTANCE.getUAExpression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASelectListImpl <em>UA Select List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASelectListImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASelectList()
     * @generated
     */
    EClass UA_SELECT_LIST = eINSTANCE.getUASelectList();

    /**
     * The meta object literal for the '<em><b>Selects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SELECT_LIST__SELECTS = eINSTANCE.getUASelectList_Selects();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASelectImpl <em>UA Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASelectImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASelect()
     * @generated
     */
    EClass UA_SELECT = eINSTANCE.getUASelect();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_SELECT__NAME = eINSTANCE.getUASelect_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SELECT__TYPE = eINSTANCE.getUASelect_Type();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAUpdateImpl <em>UA Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAUpdateImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUpdate()
     * @generated
     */
    EClass UA_UPDATE = eINSTANCE.getUAUpdate();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_UPDATE__EXPRESSIONS = eINSTANCE.getUAUpdate_Expressions();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASynchronisationImpl <em>UA Synchronisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASynchronisationImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASynchronisation()
     * @generated
     */
    EClass UA_SYNCHRONISATION = eINSTANCE.getUASynchronisation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SYNCHRONISATION__EXPRESSION = eINSTANCE.getUASynchronisation_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_SYNCHRONISATION__TYPE = eINSTANCE.getUASynchronisation_Type();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAUserTypeImpl <em>UA User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAUserTypeImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUserType()
     * @generated
     */
    EClass UA_USER_TYPE = eINSTANCE.getUAUserType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_USER_TYPE__NAME = eINSTANCE.getUAUserType_Name();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAForallExpressionImpl <em>UA Forall Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAForallExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAForallExpression()
     * @generated
     */
    EClass UA_FORALL_EXPRESSION = eINSTANCE.getUAForallExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_FORALL_EXPRESSION__NAME = eINSTANCE.getUAForallExpression_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_FORALL_EXPRESSION__TYPE = eINSTANCE.getUAForallExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_FORALL_EXPRESSION__EXPRESSION = eINSTANCE.getUAForallExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAExistsExpressionImpl <em>UA Exists Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAExistsExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAExistsExpression()
     * @generated
     */
    EClass UA_EXISTS_EXPRESSION = eINSTANCE.getUAExistsExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_EXISTS_EXPRESSION__NAME = eINSTANCE.getUAExistsExpression_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_EXISTS_EXPRESSION__TYPE = eINSTANCE.getUAExistsExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_EXISTS_EXPRESSION__EXPRESSION = eINSTANCE.getUAExistsExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAImplyExpressionImpl <em>UA Imply Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAImplyExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAImplyExpression()
     * @generated
     */
    EClass UA_IMPLY_EXPRESSION = eINSTANCE.getUAImplyExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_IMPLY_EXPRESSION__LEFT = eINSTANCE.getUAImplyExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_IMPLY_EXPRESSION__RIGHT = eINSTANCE.getUAImplyExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UALogicOrExpressionImpl <em>UA Logic Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UALogicOrExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicOrExpression()
     * @generated
     */
    EClass UA_LOGIC_OR_EXPRESSION = eINSTANCE.getUALogicOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LOGIC_OR_EXPRESSION__LEFT = eINSTANCE.getUALogicOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LOGIC_OR_EXPRESSION__RIGHT = eINSTANCE.getUALogicOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UALogicAndExpressionImpl <em>UA Logic And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UALogicAndExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicAndExpression()
     * @generated
     */
    EClass UA_LOGIC_AND_EXPRESSION = eINSTANCE.getUALogicAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LOGIC_AND_EXPRESSION__LEFT = eINSTANCE.getUALogicAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LOGIC_AND_EXPRESSION__RIGHT = eINSTANCE.getUALogicAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAAssignmentExpressionImpl <em>UA Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAssignmentExpression()
     * @generated
     */
    EClass UA_ASSIGNMENT_EXPRESSION = eINSTANCE.getUAAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUAAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUAAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAAdditionAssignmentExpressionImpl <em>UA Addition Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAAdditionAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAdditionAssignmentExpression()
     * @generated
     */
    EClass UA_ADDITION_ASSIGNMENT_EXPRESSION = eINSTANCE.getUAAdditionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ADDITION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUAAdditionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ADDITION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUAAdditionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASubtractionAssignmentExpressionImpl <em>UA Subtraction Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASubtractionAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASubtractionAssignmentExpression()
     * @generated
     */
    EClass UA_SUBTRACTION_ASSIGNMENT_EXPRESSION = eINSTANCE.getUASubtractionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUASubtractionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SUBTRACTION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUASubtractionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMultiplicationAssignmentExpressionImpl <em>UA Multiplication Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMultiplicationAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiplicationAssignmentExpression()
     * @generated
     */
    EClass UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION = eINSTANCE.getUAMultiplicationAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUAMultiplicationAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MULTIPLICATION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUAMultiplicationAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UADivisionAssignmentExpressionImpl <em>UA Division Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UADivisionAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADivisionAssignmentExpression()
     * @generated
     */
    EClass UA_DIVISION_ASSIGNMENT_EXPRESSION = eINSTANCE.getUADivisionAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_DIVISION_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUADivisionAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_DIVISION_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUADivisionAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAModuloAssignmentExpressionImpl <em>UA Modulo Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAModuloAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAModuloAssignmentExpression()
     * @generated
     */
    EClass UA_MODULO_ASSIGNMENT_EXPRESSION = eINSTANCE.getUAModuloAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MODULO_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUAModuloAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MODULO_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUAModuloAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitOrAssignmentExpressionImpl <em>UA Bit Or Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitOrAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitOrAssignmentExpression()
     * @generated
     */
    EClass UA_BIT_OR_ASSIGNMENT_EXPRESSION = eINSTANCE.getUABitOrAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_OR_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUABitOrAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_OR_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUABitOrAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitAndAssignmentExpressionImpl <em>UA Bit And Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitAndAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitAndAssignmentExpression()
     * @generated
     */
    EClass UA_BIT_AND_ASSIGNMENT_EXPRESSION = eINSTANCE.getUABitAndAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_AND_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUABitAndAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_AND_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUABitAndAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitXORAssignmentExpressionImpl <em>UA Bit XOR Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitXORAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitXORAssignmentExpression()
     * @generated
     */
    EClass UA_BIT_XOR_ASSIGNMENT_EXPRESSION = eINSTANCE.getUABitXORAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_XOR_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUABitXORAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_XOR_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUABitXORAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitLeftAssignmentExpressionImpl <em>UA Bit Left Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitLeftAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitLeftAssignmentExpression()
     * @generated
     */
    EClass UA_BIT_LEFT_ASSIGNMENT_EXPRESSION = eINSTANCE.getUABitLeftAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUABitLeftAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_LEFT_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUABitLeftAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitRightAssignmentExpressionImpl <em>UA Bit Right Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitRightAssignmentExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitRightAssignmentExpression()
     * @generated
     */
    EClass UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION = eINSTANCE.getUABitRightAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getUABitRightAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_RIGHT_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getUABitRightAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAConditionalExpressionImpl <em>UA Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAConditionalExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAConditionalExpression()
     * @generated
     */
    EClass UA_CONDITIONAL_EXPRESSION = eINSTANCE.getUAConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getUAConditionalExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_CONDITIONAL_EXPRESSION__THEN = eINSTANCE.getUAConditionalExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_CONDITIONAL_EXPRESSION__ELSE = eINSTANCE.getUAConditionalExpression_Else();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitOrExpressionImpl <em>UA Bit Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitOrExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitOrExpression()
     * @generated
     */
    EClass UA_BIT_OR_EXPRESSION = eINSTANCE.getUABitOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_OR_EXPRESSION__LEFT = eINSTANCE.getUABitOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_OR_EXPRESSION__RIGHT = eINSTANCE.getUABitOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitXORExpressionImpl <em>UA Bit XOR Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitXORExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitXORExpression()
     * @generated
     */
    EClass UA_BIT_XOR_EXPRESSION = eINSTANCE.getUABitXORExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_XOR_EXPRESSION__LEFT = eINSTANCE.getUABitXORExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_XOR_EXPRESSION__RIGHT = eINSTANCE.getUABitXORExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitAndExpressionImpl <em>UA Bit And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitAndExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitAndExpression()
     * @generated
     */
    EClass UA_BIT_AND_EXPRESSION = eINSTANCE.getUABitAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_AND_EXPRESSION__LEFT = eINSTANCE.getUABitAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_AND_EXPRESSION__RIGHT = eINSTANCE.getUABitAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAEqualExpressionImpl <em>UA Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAEqualExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAEqualExpression()
     * @generated
     */
    EClass UA_EQUAL_EXPRESSION = eINSTANCE.getUAEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_EQUAL_EXPRESSION__LEFT = eINSTANCE.getUAEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getUAEqualExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAUnequalExpressionImpl <em>UA Unequal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAUnequalExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAUnequalExpression()
     * @generated
     */
    EClass UA_UNEQUAL_EXPRESSION = eINSTANCE.getUAUnequalExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_UNEQUAL_EXPRESSION__LEFT = eINSTANCE.getUAUnequalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_UNEQUAL_EXPRESSION__RIGHT = eINSTANCE.getUAUnequalExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UALessExpressionImpl <em>UA Less Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UALessExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALessExpression()
     * @generated
     */
    EClass UA_LESS_EXPRESSION = eINSTANCE.getUALessExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LESS_EXPRESSION__LEFT = eINSTANCE.getUALessExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LESS_EXPRESSION__RIGHT = eINSTANCE.getUALessExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UALessEqualExpressionImpl <em>UA Less Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UALessEqualExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALessEqualExpression()
     * @generated
     */
    EClass UA_LESS_EQUAL_EXPRESSION = eINSTANCE.getUALessEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LESS_EQUAL_EXPRESSION__LEFT = eINSTANCE.getUALessEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LESS_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getUALessEqualExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAGreaterEqualExpressionImpl <em>UA Greater Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAGreaterEqualExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAGreaterEqualExpression()
     * @generated
     */
    EClass UA_GREATER_EQUAL_EXPRESSION = eINSTANCE.getUAGreaterEqualExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_GREATER_EQUAL_EXPRESSION__LEFT = eINSTANCE.getUAGreaterEqualExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_GREATER_EQUAL_EXPRESSION__RIGHT = eINSTANCE.getUAGreaterEqualExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAGreaterExpressionImpl <em>UA Greater Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAGreaterExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAGreaterExpression()
     * @generated
     */
    EClass UA_GREATER_EXPRESSION = eINSTANCE.getUAGreaterExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_GREATER_EXPRESSION__LEFT = eINSTANCE.getUAGreaterExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_GREATER_EXPRESSION__RIGHT = eINSTANCE.getUAGreaterExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMinExpressionImpl <em>UA Min Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMinExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMinExpression()
     * @generated
     */
    EClass UA_MIN_EXPRESSION = eINSTANCE.getUAMinExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MIN_EXPRESSION__LEFT = eINSTANCE.getUAMinExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MIN_EXPRESSION__RIGHT = eINSTANCE.getUAMinExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMaxExpressionImpl <em>UA Max Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMaxExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMaxExpression()
     * @generated
     */
    EClass UA_MAX_EXPRESSION = eINSTANCE.getUAMaxExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MAX_EXPRESSION__LEFT = eINSTANCE.getUAMaxExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MAX_EXPRESSION__RIGHT = eINSTANCE.getUAMaxExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitLeftExpressionImpl <em>UA Bit Left Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitLeftExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitLeftExpression()
     * @generated
     */
    EClass UA_BIT_LEFT_EXPRESSION = eINSTANCE.getUABitLeftExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_LEFT_EXPRESSION__LEFT = eINSTANCE.getUABitLeftExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_LEFT_EXPRESSION__RIGHT = eINSTANCE.getUABitLeftExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABitRightExpressionImpl <em>UA Bit Right Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABitRightExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABitRightExpression()
     * @generated
     */
    EClass UA_BIT_RIGHT_EXPRESSION = eINSTANCE.getUABitRightExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_RIGHT_EXPRESSION__LEFT = eINSTANCE.getUABitRightExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_BIT_RIGHT_EXPRESSION__RIGHT = eINSTANCE.getUABitRightExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAAddExpressionImpl <em>UA Add Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAAddExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAAddExpression()
     * @generated
     */
    EClass UA_ADD_EXPRESSION = eINSTANCE.getUAAddExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ADD_EXPRESSION__LEFT = eINSTANCE.getUAAddExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ADD_EXPRESSION__RIGHT = eINSTANCE.getUAAddExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UASubtractExpressionImpl <em>UA Subtract Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UASubtractExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASubtractExpression()
     * @generated
     */
    EClass UA_SUBTRACT_EXPRESSION = eINSTANCE.getUASubtractExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SUBTRACT_EXPRESSION__LEFT = eINSTANCE.getUASubtractExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_SUBTRACT_EXPRESSION__RIGHT = eINSTANCE.getUASubtractExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMultiplyExpressionImpl <em>UA Multiply Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMultiplyExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMultiplyExpression()
     * @generated
     */
    EClass UA_MULTIPLY_EXPRESSION = eINSTANCE.getUAMultiplyExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MULTIPLY_EXPRESSION__LEFT = eINSTANCE.getUAMultiplyExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MULTIPLY_EXPRESSION__RIGHT = eINSTANCE.getUAMultiplyExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UADivideExpressionImpl <em>UA Divide Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UADivideExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUADivideExpression()
     * @generated
     */
    EClass UA_DIVIDE_EXPRESSION = eINSTANCE.getUADivideExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_DIVIDE_EXPRESSION__LEFT = eINSTANCE.getUADivideExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_DIVIDE_EXPRESSION__RIGHT = eINSTANCE.getUADivideExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAModuloExpressionImpl <em>UA Modulo Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAModuloExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAModuloExpression()
     * @generated
     */
    EClass UA_MODULO_EXPRESSION = eINSTANCE.getUAModuloExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MODULO_EXPRESSION__LEFT = eINSTANCE.getUAModuloExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MODULO_EXPRESSION__RIGHT = eINSTANCE.getUAModuloExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAPreIncrementExpressionImpl <em>UA Pre Increment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAPreIncrementExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPreIncrementExpression()
     * @generated
     */
    EClass UA_PRE_INCREMENT_EXPRESSION = eINSTANCE.getUAPreIncrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_PRE_INCREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getUAPreIncrementExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAPreDecrementExpressionImpl <em>UA Pre Decrement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAPreDecrementExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPreDecrementExpression()
     * @generated
     */
    EClass UA_PRE_DECREMENT_EXPRESSION = eINSTANCE.getUAPreDecrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_PRE_DECREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getUAPreDecrementExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UALogicNotExpressionImpl <em>UA Logic Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UALogicNotExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUALogicNotExpression()
     * @generated
     */
    EClass UA_LOGIC_NOT_EXPRESSION = eINSTANCE.getUALogicNotExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_LOGIC_NOT_EXPRESSION__EXPRESSION = eINSTANCE.getUALogicNotExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAMinusExpressionImpl <em>UA Minus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAMinusExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAMinusExpression()
     * @generated
     */
    EClass UA_MINUS_EXPRESSION = eINSTANCE.getUAMinusExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_MINUS_EXPRESSION__EXPRESSION = eINSTANCE.getUAMinusExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAPostIncrementExpressionImpl <em>UA Post Increment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAPostIncrementExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPostIncrementExpression()
     * @generated
     */
    EClass UA_POST_INCREMENT_EXPRESSION = eINSTANCE.getUAPostIncrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_POST_INCREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getUAPostIncrementExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAPostDecrementExpressionImpl <em>UA Post Decrement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAPostDecrementExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAPostDecrementExpression()
     * @generated
     */
    EClass UA_POST_DECREMENT_EXPRESSION = eINSTANCE.getUAPostDecrementExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_POST_DECREMENT_EXPRESSION__EXPRESSION = eINSTANCE.getUAPostDecrementExpression_Expression();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAStructExpressionImpl <em>UA Struct Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAStructExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAStructExpression()
     * @generated
     */
    EClass UA_STRUCT_EXPRESSION = eINSTANCE.getUAStructExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_STRUCT_EXPRESSION__LEFT = eINSTANCE.getUAStructExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_STRUCT_EXPRESSION__RIGHT = eINSTANCE.getUAStructExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAArrayExpressionImpl <em>UA Array Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAArrayExpressionImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAArrayExpression()
     * @generated
     */
    EClass UA_ARRAY_EXPRESSION = eINSTANCE.getUAArrayExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ARRAY_EXPRESSION__LEFT = eINSTANCE.getUAArrayExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UA_ARRAY_EXPRESSION__RIGHT = eINSTANCE.getUAArrayExpression_Right();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UAReferenceImpl <em>UA Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UAReferenceImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUAReference()
     * @generated
     */
    EClass UA_REFERENCE = eINSTANCE.getUAReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_REFERENCE__NAME = eINSTANCE.getUAReference_Name();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UABooleanLiteralImpl <em>UA Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UABooleanLiteralImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUABooleanLiteral()
     * @generated
     */
    EClass UA_BOOLEAN_LITERAL = eINSTANCE.getUABooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_BOOLEAN_LITERAL__VALUE = eINSTANCE.getUABooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.impl.UANumberLiteralImpl <em>UA Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.impl.UANumberLiteralImpl
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUANumberLiteral()
     * @generated
     */
    EClass UA_NUMBER_LITERAL = eINSTANCE.getUANumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UA_NUMBER_LITERAL__VALUE = eINSTANCE.getUANumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.uppaal.xml.description.description.UASynchronisationType <em>UA Synchronisation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uppaal.xml.description.description.UASynchronisationType
     * @see org.uppaal.xml.description.description.impl.DescriptionPackageImpl#getUASynchronisationType()
     * @generated
     */
    EEnum UA_SYNCHRONISATION_TYPE = eINSTANCE.getUASynchronisationType();

  }

} //DescriptionPackage
