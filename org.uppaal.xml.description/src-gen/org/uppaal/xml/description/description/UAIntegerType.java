/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAIntegerType#getMin <em>Min</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAIntegerType#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAIntegerType()
 * @model
 * @generated
 */
public interface UAIntegerType extends UATypeIdentifier
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAIntegerType_Min()
   * @model containment="true"
   * @generated
   */
  UAExpression getMin();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAIntegerType#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(UAExpression value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAIntegerType_Max()
   * @model containment="true"
   * @generated
   */
  UAExpression getMax();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAIntegerType#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(UAExpression value);

} // UAIntegerType
