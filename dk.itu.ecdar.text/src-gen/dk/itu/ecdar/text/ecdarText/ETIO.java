/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETIO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETIO#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETIO#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIO()
 * @model
 * @generated
 */
public interface ETIO extends EObject
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
   * @see #setExpression(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIO_Expression()
   * @model containment="true"
   * @generated
   */
  ETExpression getExpression();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETIO#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ETExpression value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link dk.itu.ecdar.text.ecdarText.ETIOType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @see #setType(ETIOType)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETIO_Type()
   * @model
   * @generated
   */
  ETIOType getType();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETIO#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see dk.itu.ecdar.text.ecdarText.ETIOType
   * @see #getType()
   * @generated
   */
  void setType(ETIOType value);

} // ETIO
