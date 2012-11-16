/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Type Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UATypeModifiers#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UATypeModifiers#isBroadcast <em>Broadcast</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UATypeModifiers#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UATypeModifiers#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeModifiers()
 * @model
 * @generated
 */
public interface UATypeModifiers extends EObject
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeModifiers_Urgent()
   * @model
   * @generated
   */
  boolean isUrgent();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UATypeModifiers#isUrgent <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Urgent</em>' attribute.
   * @see #isUrgent()
   * @generated
   */
  void setUrgent(boolean value);

  /**
   * Returns the value of the '<em><b>Broadcast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Broadcast</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broadcast</em>' attribute.
   * @see #setBroadcast(boolean)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeModifiers_Broadcast()
   * @model
   * @generated
   */
  boolean isBroadcast();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UATypeModifiers#isBroadcast <em>Broadcast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Broadcast</em>' attribute.
   * @see #isBroadcast()
   * @generated
   */
  void setBroadcast(boolean value);

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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeModifiers_Meta()
   * @model
   * @generated
   */
  boolean isMeta();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UATypeModifiers#isMeta <em>Meta</em>}' attribute.
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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUATypeModifiers_Const()
   * @model
   * @generated
   */
  boolean isConst();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UATypeModifiers#isConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #isConst()
   * @generated
   */
  void setConst(boolean value);

} // UATypeModifiers
