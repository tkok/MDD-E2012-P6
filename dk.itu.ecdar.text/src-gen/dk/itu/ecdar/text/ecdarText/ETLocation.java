/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUniversal <em>Universal</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLocation#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLocation#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETLocation#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation()
 * @model
 * @generated
 */
public interface ETLocation extends EObject
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
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation_Urgent()
   * @model
   * @generated
   */
  boolean isUrgent();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUrgent <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Urgent</em>' attribute.
   * @see #isUrgent()
   * @generated
   */
  void setUrgent(boolean value);

  /**
   * Returns the value of the '<em><b>Universal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Universal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Universal</em>' attribute.
   * @see #setUniversal(boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation_Universal()
   * @model
   * @generated
   */
  boolean isUniversal();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETLocation#isUniversal <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Universal</em>' attribute.
   * @see #isUniversal()
   * @generated
   */
  void setUniversal(boolean value);

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
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETLocation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariants</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation_Invariants()
   * @model containment="true"
   * @generated
   */
  EList<ETExpression> getInvariants();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETLocation_Edges()
   * @model containment="true"
   * @generated
   */
  EList<ETEdge> getEdges();

} // ETLocation
