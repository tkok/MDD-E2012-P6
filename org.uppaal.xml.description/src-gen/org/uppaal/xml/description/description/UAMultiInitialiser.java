/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Multi Initialiser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAMultiInitialiser#getInitialisers <em>Initialisers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAMultiInitialiser()
 * @model
 * @generated
 */
public interface UAMultiInitialiser extends UAInitialiser
{
  /**
   * Returns the value of the '<em><b>Initialisers</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAInitialiser}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisers</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAMultiInitialiser_Initialisers()
   * @model containment="true"
   * @generated
   */
  EList<UAInitialiser> getInitialisers();

} // UAMultiInitialiser
