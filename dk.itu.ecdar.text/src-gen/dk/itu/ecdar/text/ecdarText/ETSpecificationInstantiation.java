/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Specification Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getTemplate <em>Template</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationInstantiation()
 * @model
 * @generated
 */
public interface ETSpecificationInstantiation extends ETSpecificationExpression
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' reference.
   * @see #setTemplate(ETSpecificationTemplate)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationInstantiation_Template()
   * @model
   * @generated
   */
  ETSpecificationTemplate getTemplate();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation#getTemplate <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(ETSpecificationTemplate value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationInstantiation_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<ETExpression> getArguments();

} // ETSpecificationInstantiation
