/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Pre Decrement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAPreDecrementExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAPreDecrementExpression()
 * @model
 * @generated
 */
public interface UAPreDecrementExpression extends UAExpression
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
   * @see #setExpression(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAPreDecrementExpression_Expression()
   * @model containment="true"
   * @generated
   */
  UAExpression getExpression();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAPreDecrementExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UAExpression value);

} // UAPreDecrementExpression
