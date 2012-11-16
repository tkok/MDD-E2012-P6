/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Add Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAAddExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAAddExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAAddExpression()
 * @model
 * @generated
 */
public interface UAAddExpression extends UAExpression
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
   * @see #setLeft(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAAddExpression_Left()
   * @model containment="true"
   * @generated
   */
  UAExpression getLeft();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAAddExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UAExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAAddExpression_Right()
   * @model containment="true"
   * @generated
   */
  UAExpression getRight();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAAddExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(UAExpression value);

} // UAAddExpression
