/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Struct Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAStructExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAStructExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAStructExpression()
 * @model
 * @generated
 */
public interface UAStructExpression extends UAExpression
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAStructExpression_Left()
   * @model containment="true"
   * @generated
   */
  UAExpression getLeft();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAStructExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UAExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAStructExpression_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAStructExpression#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // UAStructExpression
