/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAType#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAType#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAType()
 * @model
 * @generated
 */
public interface UAType extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference.
   * @see #setModifiers(UATypeModifiers)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAType_Modifiers()
   * @model containment="true"
   * @generated
   */
  UATypeModifiers getModifiers();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAType#getModifiers <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifiers</em>' containment reference.
   * @see #getModifiers()
   * @generated
   */
  void setModifiers(UATypeModifiers value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(UATypeIdentifier)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAType_Identifier()
   * @model containment="true"
   * @generated
   */
  UATypeIdentifier getIdentifier();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAType#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(UATypeIdentifier value);

} // UAType
