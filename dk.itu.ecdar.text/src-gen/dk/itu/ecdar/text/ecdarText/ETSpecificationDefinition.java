/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Specification Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationDefinition()
 * @model
 * @generated
 */
public interface ETSpecificationDefinition extends ETSpecification
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ETSpecificationBody)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationDefinition_Body()
   * @model containment="true"
   * @generated
   */
  ETSpecificationBody getBody();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ETSpecificationBody value);

} // ETSpecificationDefinition
