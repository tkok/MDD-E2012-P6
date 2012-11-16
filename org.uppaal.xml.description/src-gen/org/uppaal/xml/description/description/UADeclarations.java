/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UADeclarations#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUADeclarations()
 * @model
 * @generated
 */
public interface UADeclarations extends Top
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UADeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUADeclarations_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<UADeclaration> getDeclarations();

} // UADeclarations
