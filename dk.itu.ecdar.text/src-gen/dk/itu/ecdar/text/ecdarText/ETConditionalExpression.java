/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getThen <em>Then</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETConditionalExpression()
 * @model
 * @generated
 */
public interface ETConditionalExpression extends ETExpression
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETConditionalExpression_Condition()
   * @model containment="true"
   * @generated
   */
  ETExpression getCondition();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ETExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETConditionalExpression_Then()
   * @model containment="true"
   * @generated
   */
  ETExpression getThen();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ETExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETConditionalExpression_Else()
   * @model containment="true"
   * @generated
   */
  ETExpression getElse();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETConditionalExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ETExpression value);

} // ETConditionalExpression
