/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UATypeDeclaration#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UATypeDeclaration#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeDeclaration()
 * @model
 * @generated
 */
public interface UATypeDeclaration extends UADeclaration
{
  /**
   * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' containment reference.
   * @see #setBaseType(UAType)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeDeclaration_BaseType()
   * @model containment="true"
   * @generated
   */
  UAType getBaseType();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UATypeDeclaration#getBaseType <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' containment reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(UAType value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UATypeID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeDeclaration_Types()
   * @model containment="true"
   * @generated
   */
  EList<UATypeID> getTypes();

} // UATypeDeclaration
