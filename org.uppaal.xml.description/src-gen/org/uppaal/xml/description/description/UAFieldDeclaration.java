/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAFieldDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAFieldDeclaration#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAFieldDeclaration()
 * @model
 * @generated
 */
public interface UAFieldDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(UAType)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAFieldDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  UAType getType();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAFieldDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UAType value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAFieldID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAFieldDeclaration_Fields()
   * @model containment="true"
   * @generated
   */
  EList<UAFieldID> getFields();

} // UAFieldDeclaration
