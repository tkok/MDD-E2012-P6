/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Select List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UASelectList#getSelects <em>Selects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUASelectList()
 * @model
 * @generated
 */
public interface UASelectList extends Top
{
  /**
   * Returns the value of the '<em><b>Selects</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UASelect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selects</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUASelectList_Selects()
   * @model containment="true"
   * @generated
   */
  EList<UASelect> getSelects();

} // UASelectList
