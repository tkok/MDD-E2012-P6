/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAConditionalExpression#getThen <em>Then</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAConditionalExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAConditionalExpression()
 * @model
 * @generated
 */
public interface UAConditionalExpression extends UAExpression
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
   * @see #setCondition(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAConditionalExpression_Condition()
   * @model containment="true"
   * @generated
   */
  UAExpression getCondition();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAConditionalExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(UAExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAConditionalExpression_Then()
   * @model containment="true"
   * @generated
   */
  UAExpression getThen();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAConditionalExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(UAExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAConditionalExpression_Else()
   * @model containment="true"
   * @generated
   */
  UAExpression getElse();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAConditionalExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(UAExpression value);

} // UAConditionalExpression
