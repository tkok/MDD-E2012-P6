/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Variable ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getIoType <em>Io Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getInitialiser <em>Initialiser</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableID()
 * @model
 * @generated
 */
public interface ETVariableID extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableID_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Io Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Io Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Io Type</em>' attribute.
   * @see #setIoType(String)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableID_IoType()
   * @model
   * @generated
   */
  String getIoType();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getIoType <em>Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Io Type</em>' attribute.
   * @see #getIoType()
   * @generated
   */
  void setIoType(String value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETArrayDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableID_Dimensions()
   * @model containment="true"
   * @generated
   */
  EList<ETArrayDeclaration> getDimensions();

  /**
   * Returns the value of the '<em><b>Initialiser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialiser</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialiser</em>' containment reference.
   * @see #setInitialiser(ETInitialiser)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETVariableID_Initialiser()
   * @model containment="true"
   * @generated
   */
  ETInitialiser getInitialiser();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETVariableID#getInitialiser <em>Initialiser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialiser</em>' containment reference.
   * @see #getInitialiser()
   * @generated
   */
  void setInitialiser(ETInitialiser value);

} // ETVariableID
