/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA System Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UASystemDefinition#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UASystemDefinition#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUASystemDefinition()
 * @model
 * @generated
 */
public interface UASystemDefinition extends Top
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UADefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUASystemDefinition_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<UADefinition> getDefinitions();

  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(UASystem)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUASystemDefinition_System()
   * @model containment="true"
   * @generated
   */
  UASystem getSystem();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UASystemDefinition#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(UASystem value);

} // UASystemDefinition
