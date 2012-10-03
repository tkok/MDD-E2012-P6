/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETBooleanLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETBooleanLiteral()
 * @model
 * @generated
 */
public interface ETBooleanLiteral extends ETExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETBooleanLiteral_Value()
   * @model
   * @generated
   */
  Boolean getValue();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETBooleanLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Boolean value);

} // ETBooleanLiteral
