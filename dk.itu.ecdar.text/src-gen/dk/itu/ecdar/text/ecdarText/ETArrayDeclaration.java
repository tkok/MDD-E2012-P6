/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Array Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETArrayDeclaration()
 * @model
 * @generated
 */
public interface ETArrayDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETArrayDeclaration_Size()
   * @model containment="true"
   * @generated
   */
  ETExpression getSize();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(ETExpression value);

} // ETArrayDeclaration
