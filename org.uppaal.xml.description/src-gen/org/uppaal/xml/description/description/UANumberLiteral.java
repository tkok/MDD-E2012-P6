/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UANumberLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUANumberLiteral()
 * @model
 * @generated
 */
public interface UANumberLiteral extends UAExpression
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
   * @see #setValue(int)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUANumberLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UANumberLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // UANumberLiteral
