/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableDeclaration()
 * @model
 * @generated
 */
public interface ETVariableDeclaration extends ETDeclaration
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ETType)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  ETType getType();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETVariableDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ETType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETVariableID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableDeclaration_Variables()
   * @model containment="true"
   * @generated
   */
  EList<ETVariableID> getVariables();

} // ETVariableDeclaration
