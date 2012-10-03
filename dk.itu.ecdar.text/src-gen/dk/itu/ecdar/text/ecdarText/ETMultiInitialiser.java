/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Multi Initialiser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETMultiInitialiser#getInitialisers <em>Initialisers</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETMultiInitialiser()
 * @model
 * @generated
 */
public interface ETMultiInitialiser extends ETInitialiser
{
  /**
   * Returns the value of the '<em><b>Initialisers</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETInitialiser}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisers</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETMultiInitialiser_Initialisers()
   * @model containment="true"
   * @generated
   */
  EList<ETInitialiser> getInitialisers();

} // ETMultiInitialiser
