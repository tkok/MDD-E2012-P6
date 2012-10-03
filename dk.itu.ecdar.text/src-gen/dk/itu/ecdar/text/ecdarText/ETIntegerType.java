/**
 */
package dk.itu.ecdar.text.ecdarText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMin <em>Min</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIntegerType()
 * @model
 * @generated
 */
public interface ETIntegerType extends ETTypeIdentifier
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
   * @see #setMin(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIntegerType_Min()
   * @model containment="true"
   * @generated
   */
  ETExpression getMin();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(ETExpression value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIntegerType_Max()
   * @model containment="true"
   * @generated
   */
  ETExpression getMax();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETIntegerType#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(ETExpression value);

} // ETIntegerType
