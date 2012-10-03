/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeDeclaration()
 * @model
 * @generated
 */
public interface ETTypeDeclaration extends ETDeclaration
{
  /**
   * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' containment reference.
   * @see #setBaseType(ETType)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeDeclaration_BaseType()
   * @model containment="true"
   * @generated
   */
  ETType getBaseType();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETTypeDeclaration#getBaseType <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' containment reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(ETType value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETTypeID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETTypeDeclaration_Types()
   * @model containment="true"
   * @generated
   */
  EList<ETTypeID> getTypes();

} // ETTypeDeclaration
