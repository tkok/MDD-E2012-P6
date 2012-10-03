/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#isControllable <em>Controllable</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#getSelects <em>Selects</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#getIo <em>Io</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETEdge#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge()
 * @model
 * @generated
 */
public interface ETEdge extends EObject
{
  /**
   * Returns the value of the '<em><b>Controllable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controllable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controllable</em>' attribute.
   * @see #setControllable(boolean)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Controllable()
   * @model
   * @generated
   */
  boolean isControllable();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETEdge#isControllable <em>Controllable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controllable</em>' attribute.
   * @see #isControllable()
   * @generated
   */
  void setControllable(boolean value);

  /**
   * Returns the value of the '<em><b>Selects</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETSelect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selects</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Selects()
   * @model containment="true"
   * @generated
   */
  EList<ETSelect> getSelects();

  /**
   * Returns the value of the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Io</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Io</em>' containment reference.
   * @see #setIo(ETIO)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Io()
   * @model containment="true"
   * @generated
   */
  ETIO getIo();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getIo <em>Io</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Io</em>' containment reference.
   * @see #getIo()
   * @generated
   */
  void setIo(ETIO value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(ETExpression)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Guard()
   * @model containment="true"
   * @generated
   */
  ETExpression getGuard();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(ETExpression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ETLocation)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Target()
   * @model
   * @generated
   */
  ETLocation getTarget();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETEdge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ETLocation value);

  /**
   * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updates</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETEdge_Updates()
   * @model containment="true"
   * @generated
   */
  EList<ETExpression> getUpdates();

} // ETEdge
