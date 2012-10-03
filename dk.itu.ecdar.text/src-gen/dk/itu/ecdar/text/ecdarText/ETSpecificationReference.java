/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Specification Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationReference#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationReference()
 * @model
 * @generated
 */
public interface ETSpecificationReference extends ETSpecificationExpression
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specification</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' reference.
   * @see #setSpecification(ETSpecification)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationReference_Specification()
   * @model
   * @generated
   */
  ETSpecification getSpecification();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationReference#getSpecification <em>Specification</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' reference.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(ETSpecification value);

} // ETSpecificationReference
