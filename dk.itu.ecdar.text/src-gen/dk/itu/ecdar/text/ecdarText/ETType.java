/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETType#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETType#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETType()
 * @model
 * @generated
 */
public interface ETType extends EObject
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
   * @see #setModifiers(ETTypeModifiers)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETType_Modifiers()
   * @model containment="true"
   * @generated
   */
  ETTypeModifiers getModifiers();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETType#getModifiers <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifiers</em>' containment reference.
   * @see #getModifiers()
   * @generated
   */
  void setModifiers(ETTypeModifiers value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(ETTypeIdentifier)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETType_Identifier()
   * @model containment="true"
   * @generated
   */
  ETTypeIdentifier getIdentifier();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETType#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(ETTypeIdentifier value);

} // ETType
