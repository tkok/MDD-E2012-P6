/**
 */
package org.uppaal.xml.flat11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.flat11.NtaType#getImports <em>Imports</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.NtaType#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.NtaType#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.NtaType#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.NtaType#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType()
 * @model extendedMetaData="name='nta_._type' kind='elementOnly'"
 * @generated
 */
public interface NtaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute.
	 * @see #setImports(String)
	 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType_Imports()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='imports' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImports();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.NtaType#getImports <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' attribute.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' attribute.
	 * @see #setDeclaration(String)
	 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType_Declaration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='declaration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeclaration();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.NtaType#getDeclaration <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' attribute.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.uppaal.xml.flat11.TemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType_Template()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TemplateType> getTemplate();

	/**
	 * Returns the value of the '<em><b>Instantiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation</em>' attribute.
	 * @see #setInstantiation(String)
	 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType_Instantiation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='instantiation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstantiation();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.NtaType#getInstantiation <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation</em>' attribute.
	 * @see #getInstantiation()
	 * @generated
	 */
	void setInstantiation(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see org.uppaal.xml.flat11.Flat11Package#getNtaType_System()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.NtaType#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // NtaType
