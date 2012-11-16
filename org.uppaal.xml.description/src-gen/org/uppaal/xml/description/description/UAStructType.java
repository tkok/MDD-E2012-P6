/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAStructType#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAStructType()
 * @model
 * @generated
 */
public interface UAStructType extends UATypeIdentifier
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAFieldDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAStructType_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<UAFieldDeclaration> getDeclarations();

} // UAStructType
