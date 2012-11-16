/**
 */
package org.uppaal.xml.flat11;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.uppaal.xml.flat11.Flat11Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Flat11Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flat11";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.uppaal.xml/model/flat11.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flat11";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Flat11Package eINSTANCE = org.uppaal.xml.flat11.impl.Flat11PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.CommittedTypeImpl <em>Committed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.CommittedTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getCommittedType()
	 * @generated
	 */
	int COMMITTED_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Committed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTED_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.DocumentRootImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMITTED = 3;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORTS = 5;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INIT = 6;

	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTANTIATION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Nail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAIL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 11;

	/**
	 * The feature id for the '<em><b>Nta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NTA = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 14;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET = 16;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPLATE = 17;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION = 18;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URGENT = 19;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.InitTypeImpl <em>Init Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.InitTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getInitType()
	 * @generated
	 */
	int INIT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Init Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.LabelTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__KIND = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__Y = 3;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.LocationTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__URGENT = 2;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__COMMITTED = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__X = 6;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__Y = 7;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.NailTypeImpl <em>Nail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.NailTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNailType()
	 * @generated
	 */
	int NAIL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAIL_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAIL_TYPE__Y = 1;

	/**
	 * The number of structural features of the '<em>Nail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.NameTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__Y = 2;

	/**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.NtaTypeImpl <em>Nta Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.NtaTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNtaType()
	 * @generated
	 */
	int NTA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE__DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE__TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE__INSTANTIATION = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE__SYSTEM = 4;

	/**
	 * The number of structural features of the '<em>Nta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.ParameterTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__Y = 2;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.SourceTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.TargetTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.TemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.TemplateTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTemplateType()
	 * @generated
	 */
	int TEMPLATE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__INIT = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__TRANSITION = 5;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.TransitionTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Nail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__NAIL = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ACTION = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__COLOR = 5;

	/**
	 * The feature id for the '<em><b>Controllable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CONTROLLABLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__X = 8;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__Y = 9;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.impl.UrgentTypeImpl <em>Urgent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.impl.UrgentTypeImpl
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getUrgentType()
	 * @generated
	 */
	int URGENT_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Urgent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URGENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.uppaal.xml.flat11.KindType <em>Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.KindType
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getKindType()
	 * @generated
	 */
	int KIND_TYPE = 14;

	/**
	 * The meta object id for the '<em>Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.uppaal.xml.flat11.KindType
	 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getKindTypeObject()
	 * @generated
	 */
	int KIND_TYPE_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.CommittedType <em>Committed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Committed Type</em>'.
	 * @see org.uppaal.xml.flat11.CommittedType
	 * @generated
	 */
	EClass getCommittedType();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.uppaal.xml.flat11.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.uppaal.xml.flat11.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.uppaal.xml.flat11.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Committed</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getCommitted()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Committed();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.DocumentRoot#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getDeclaration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.DocumentRoot#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getImports()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getInit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.DocumentRoot#getInstantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiation</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getInstantiation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Instantiation();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getNail <em>Nail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nail</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getNail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Nail();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getNta <em>Nta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nta</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getNta()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Nta();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Template();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getTransition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.DocumentRoot#getUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Urgent</em>'.
	 * @see org.uppaal.xml.flat11.DocumentRoot#getUrgent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Urgent();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.InitType <em>Init Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Type</em>'.
	 * @see org.uppaal.xml.flat11.InitType
	 * @generated
	 */
	EClass getInitType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.InitType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.uppaal.xml.flat11.InitType#getRef()
	 * @see #getInitType()
	 * @generated
	 */
	EAttribute getInitType_Ref();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see org.uppaal.xml.flat11.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LabelType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.uppaal.xml.flat11.LabelType#getValue()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LabelType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.uppaal.xml.flat11.LabelType#getKind()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LabelType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.LabelType#getX()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LabelType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.LabelType#getY()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see org.uppaal.xml.flat11.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.LocationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getName()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.LocationType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getLabel()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.LocationType#getUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Urgent</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getUrgent()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Urgent();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.LocationType#getCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Committed</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getCommitted()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_Committed();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LocationType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getColor()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LocationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getId()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LocationType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getX()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.LocationType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.LocationType#getY()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.NailType <em>Nail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nail Type</em>'.
	 * @see org.uppaal.xml.flat11.NailType
	 * @generated
	 */
	EClass getNailType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NailType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.NailType#getX()
	 * @see #getNailType()
	 * @generated
	 */
	EAttribute getNailType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NailType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.NailType#getY()
	 * @see #getNailType()
	 * @generated
	 */
	EAttribute getNailType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see org.uppaal.xml.flat11.NameType
	 * @generated
	 */
	EClass getNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.uppaal.xml.flat11.NameType#getValue()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NameType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.NameType#getX()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NameType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.NameType#getY()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.NtaType <em>Nta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nta Type</em>'.
	 * @see org.uppaal.xml.flat11.NtaType
	 * @generated
	 */
	EClass getNtaType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NtaType#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports</em>'.
	 * @see org.uppaal.xml.flat11.NtaType#getImports()
	 * @see #getNtaType()
	 * @generated
	 */
	EAttribute getNtaType_Imports();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NtaType#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see org.uppaal.xml.flat11.NtaType#getDeclaration()
	 * @see #getNtaType()
	 * @generated
	 */
	EAttribute getNtaType_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.NtaType#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see org.uppaal.xml.flat11.NtaType#getTemplate()
	 * @see #getNtaType()
	 * @generated
	 */
	EReference getNtaType_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NtaType#getInstantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiation</em>'.
	 * @see org.uppaal.xml.flat11.NtaType#getInstantiation()
	 * @see #getNtaType()
	 * @generated
	 */
	EAttribute getNtaType_Instantiation();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.NtaType#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.uppaal.xml.flat11.NtaType#getSystem()
	 * @see #getNtaType()
	 * @generated
	 */
	EAttribute getNtaType_System();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.uppaal.xml.flat11.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.ParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.uppaal.xml.flat11.ParameterType#getValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.ParameterType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.ParameterType#getX()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.ParameterType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.ParameterType#getY()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see org.uppaal.xml.flat11.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.SourceType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.uppaal.xml.flat11.SourceType#getRef()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Ref();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see org.uppaal.xml.flat11.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TargetType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.uppaal.xml.flat11.TargetType#getRef()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Ref();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType
	 * @generated
	 */
	EClass getTemplateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.TemplateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getName()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.TemplateType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getParameter()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TemplateType#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getDeclaration()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.TemplateType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getLocation()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.TemplateType#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getInit()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Init();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.TemplateType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.uppaal.xml.flat11.TemplateType#getTransition()
	 * @see #getTemplateType()
	 * @generated
	 */
	EReference getTemplateType_Transition();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.TransitionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getSource()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.uppaal.xml.flat11.TransitionType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getTarget()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.TransitionType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getLabel()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.uppaal.xml.flat11.TransitionType#getNail <em>Nail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nail</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getNail()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Nail();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getAction()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getColor()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#isControllable <em>Controllable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controllable</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#isControllable()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Controllable();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getId()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getX()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.uppaal.xml.flat11.TransitionType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.uppaal.xml.flat11.TransitionType#getY()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Y();

	/**
	 * Returns the meta object for class '{@link org.uppaal.xml.flat11.UrgentType <em>Urgent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Urgent Type</em>'.
	 * @see org.uppaal.xml.flat11.UrgentType
	 * @generated
	 */
	EClass getUrgentType();

	/**
	 * Returns the meta object for enum '{@link org.uppaal.xml.flat11.KindType <em>Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type</em>'.
	 * @see org.uppaal.xml.flat11.KindType
	 * @generated
	 */
	EEnum getKindType();

	/**
	 * Returns the meta object for data type '{@link org.uppaal.xml.flat11.KindType <em>Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object</em>'.
	 * @see org.uppaal.xml.flat11.KindType
	 * @model instanceClass="org.uppaal.xml.flat11.KindType"
	 *        extendedMetaData="name='kind_._type:Object' baseType='kind_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Flat11Factory getFlat11Factory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.CommittedTypeImpl <em>Committed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.CommittedTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getCommittedType()
		 * @generated
		 */
		EClass COMMITTED_TYPE = eINSTANCE.getCommittedType();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.DocumentRootImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMITTED = eINSTANCE.getDocumentRoot_Committed();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DECLARATION = eINSTANCE.getDocumentRoot_Declaration();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IMPORTS = eINSTANCE.getDocumentRoot_Imports();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INIT = eINSTANCE.getDocumentRoot_Init();

		/**
		 * The meta object literal for the '<em><b>Instantiation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INSTANTIATION = eINSTANCE.getDocumentRoot_Instantiation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Nail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAIL = eINSTANCE.getDocumentRoot_Nail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Nta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NTA = eINSTANCE.getDocumentRoot_Nta();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAMETER = eINSTANCE.getDocumentRoot_Parameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYSTEM = eINSTANCE.getDocumentRoot_System();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TARGET = eINSTANCE.getDocumentRoot_Target();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPLATE = eINSTANCE.getDocumentRoot_Template();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSITION = eINSTANCE.getDocumentRoot_Transition();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URGENT = eINSTANCE.getDocumentRoot_Urgent();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.InitTypeImpl <em>Init Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.InitTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getInitType()
		 * @generated
		 */
		EClass INIT_TYPE = eINSTANCE.getInitType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_TYPE__REF = eINSTANCE.getInitType_Ref();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.LabelTypeImpl <em>Label Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.LabelTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getLabelType()
		 * @generated
		 */
		EClass LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_TYPE__VALUE = eINSTANCE.getLabelType_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_TYPE__KIND = eINSTANCE.getLabelType_Kind();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_TYPE__X = eINSTANCE.getLabelType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_TYPE__Y = eINSTANCE.getLabelType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.LocationTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__NAME = eINSTANCE.getLocationType_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__LABEL = eINSTANCE.getLocationType_Label();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__URGENT = eINSTANCE.getLocationType_Urgent();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TYPE__COMMITTED = eINSTANCE.getLocationType_Committed();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__COLOR = eINSTANCE.getLocationType_Color();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ID = eINSTANCE.getLocationType_Id();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__X = eINSTANCE.getLocationType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__Y = eINSTANCE.getLocationType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.NailTypeImpl <em>Nail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.NailTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNailType()
		 * @generated
		 */
		EClass NAIL_TYPE = eINSTANCE.getNailType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAIL_TYPE__X = eINSTANCE.getNailType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAIL_TYPE__Y = eINSTANCE.getNailType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.NameTypeImpl <em>Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.NameTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNameType()
		 * @generated
		 */
		EClass NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__VALUE = eINSTANCE.getNameType_Value();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__X = eINSTANCE.getNameType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__Y = eINSTANCE.getNameType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.NtaTypeImpl <em>Nta Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.NtaTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getNtaType()
		 * @generated
		 */
		EClass NTA_TYPE = eINSTANCE.getNtaType();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NTA_TYPE__IMPORTS = eINSTANCE.getNtaType_Imports();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NTA_TYPE__DECLARATION = eINSTANCE.getNtaType_Declaration();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTA_TYPE__TEMPLATE = eINSTANCE.getNtaType_Template();

		/**
		 * The meta object literal for the '<em><b>Instantiation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NTA_TYPE__INSTANTIATION = eINSTANCE.getNtaType_Instantiation();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NTA_TYPE__SYSTEM = eINSTANCE.getNtaType_System();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.ParameterTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__X = eINSTANCE.getParameterType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__Y = eINSTANCE.getParameterType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.SourceTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__REF = eINSTANCE.getSourceType_Ref();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.TargetTypeImpl <em>Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.TargetTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTargetType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__REF = eINSTANCE.getTargetType_Ref();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.TemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.TemplateTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTemplateType()
		 * @generated
		 */
		EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__NAME = eINSTANCE.getTemplateType_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__PARAMETER = eINSTANCE.getTemplateType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__DECLARATION = eINSTANCE.getTemplateType_Declaration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__LOCATION = eINSTANCE.getTemplateType_Location();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__INIT = eINSTANCE.getTemplateType_Init();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_TYPE__TRANSITION = eINSTANCE.getTemplateType_Transition();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.TransitionTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__SOURCE = eINSTANCE.getTransitionType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__TARGET = eINSTANCE.getTransitionType_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__LABEL = eINSTANCE.getTransitionType_Label();

		/**
		 * The meta object literal for the '<em><b>Nail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__NAIL = eINSTANCE.getTransitionType_Nail();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__ACTION = eINSTANCE.getTransitionType_Action();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__COLOR = eINSTANCE.getTransitionType_Color();

		/**
		 * The meta object literal for the '<em><b>Controllable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__CONTROLLABLE = eINSTANCE.getTransitionType_Controllable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__ID = eINSTANCE.getTransitionType_Id();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__X = eINSTANCE.getTransitionType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__Y = eINSTANCE.getTransitionType_Y();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.impl.UrgentTypeImpl <em>Urgent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.impl.UrgentTypeImpl
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getUrgentType()
		 * @generated
		 */
		EClass URGENT_TYPE = eINSTANCE.getUrgentType();

		/**
		 * The meta object literal for the '{@link org.uppaal.xml.flat11.KindType <em>Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.KindType
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getKindType()
		 * @generated
		 */
		EEnum KIND_TYPE = eINSTANCE.getKindType();

		/**
		 * The meta object literal for the '<em>Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.uppaal.xml.flat11.KindType
		 * @see org.uppaal.xml.flat11.impl.Flat11PackageImpl#getKindTypeObject()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT = eINSTANCE.getKindTypeObject();

	}

} //Flat11Package
