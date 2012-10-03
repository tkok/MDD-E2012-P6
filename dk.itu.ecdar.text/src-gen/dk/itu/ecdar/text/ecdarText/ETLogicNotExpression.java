/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Logic Not Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLogicNotExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLogicNotExpression()
 * @model
 * @generated
 */
public interface ETLogicNotExpression extends ETExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLogicNotExpression_Expression()
   * @model containment="true"
   * @generated
   */
  ETExpression getExpression();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETLogicNotExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ETExpression value);

} // ETLogicNotExpression
