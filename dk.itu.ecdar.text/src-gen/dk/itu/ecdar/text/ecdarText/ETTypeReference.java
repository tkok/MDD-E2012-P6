/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeReference#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeReference()
 * @model
 * @generated
 */
public interface ETTypeReference extends ETTypeIdentifier
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ETTypeID)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeReference_Target()
   * @model
   * @generated
   */
  ETTypeID getTarget();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETTypeReference#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ETTypeID value);

} // ETTypeReference
