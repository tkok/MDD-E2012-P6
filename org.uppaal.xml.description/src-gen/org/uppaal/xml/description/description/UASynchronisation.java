/**
 */
package org.uppaal.xml.description.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UASynchronisation#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UASynchronisation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUASynchronisation()
 * @model
 * @generated
 */
public interface UASynchronisation extends Top
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUASynchronisation_Expression()
   * @model containment="true"
   * @generated
   */
  UAExpression getExpression();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UASynchronisation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UAExpression value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.uppaal.xml.description.description.UASynchronisationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.uppaal.xml.description.description.UASynchronisationType
   * @see #setType(UASynchronisationType)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUASynchronisation_Type()
   * @model
   * @generated
   */
  UASynchronisationType getType();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UASynchronisation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.uppaal.xml.description.description.UASynchronisationType
   * @see #getType()
   * @generated
   */
  void setType(UASynchronisationType value);

} // UASynchronisation
