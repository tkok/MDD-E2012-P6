/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Variable ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAVariableID#getName <em>Name</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAVariableID#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAVariableID#getInitialiser <em>Initialiser</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableID()
 * @model
 * @generated
 */
public interface UAVariableID extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableID_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAVariableID#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAArrayDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableID_Dimensions()
   * @model containment="true"
   * @generated
   */
  EList<UAArrayDeclaration> getDimensions();

  /**
   * Returns the value of the '<em><b>Initialiser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialiser</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialiser</em>' containment reference.
   * @see #setInitialiser(UAInitialiser)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableID_Initialiser()
   * @model containment="true"
   * @generated
   */
  UAInitialiser getInitialiser();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAVariableID#getInitialiser <em>Initialiser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialiser</em>' containment reference.
   * @see #getInitialiser()
   * @generated
   */
  void setInitialiser(UAInitialiser value);

} // UAVariableID
