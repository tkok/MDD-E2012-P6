/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAVariableDeclaration#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableDeclaration()
 * @model
 * @generated
 */
public interface UAVariableDeclaration extends UADeclaration
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  UAType getType();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAVariableDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UAType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAVariableID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAVariableDeclaration_Variables()
   * @model containment="true"
   * @generated
   */
  EList<UAVariableID> getVariables();

} // UAVariableDeclaration
