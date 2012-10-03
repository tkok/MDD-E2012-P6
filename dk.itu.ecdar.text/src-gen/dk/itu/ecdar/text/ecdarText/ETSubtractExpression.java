/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Subtract Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSubtractExpression()
 * @model
 * @generated
 */
public interface ETSubtractExpression extends ETExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSubtractExpression_Left()
   * @model containment="true"
   * @generated
   */
  ETExpression getLeft();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ETExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSubtractExpression_Right()
   * @model containment="true"
   * @generated
   */
  ETExpression getRight();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSubtractExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ETExpression value);

} // ETSubtractExpression
