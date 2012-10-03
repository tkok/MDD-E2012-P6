/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Type Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isMeta <em>Meta</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeModifiers()
 * @model
 * @generated
 */
public interface ETTypeModifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Urgent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Urgent</em>' attribute.
   * @see #setUrgent(boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeModifiers_Urgent()
   * @model
   * @generated
   */
  boolean isUrgent();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isUrgent <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Urgent</em>' attribute.
   * @see #isUrgent()
   * @generated
   */
  void setUrgent(boolean value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' attribute.
   * @see #setMeta(boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeModifiers_Meta()
   * @model
   * @generated
   */
  boolean isMeta();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isMeta <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' attribute.
   * @see #isMeta()
   * @generated
   */
  void setMeta(boolean value);

  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeModifiers_Const()
   * @model
   * @generated
   */
  boolean isConst();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETTypeModifiers#isConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #isConst()
   * @generated
   */
  void setConst(boolean value);

} // ETTypeModifiers
