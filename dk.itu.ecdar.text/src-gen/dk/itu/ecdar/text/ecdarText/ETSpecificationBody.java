/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET Specification Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getInitialLocation <em>Initial Location</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationBody()
 * @model
 * @generated
 */
public interface ETSpecificationBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference.
   * @see #setDeclarations(ETDeclarations)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationBody_Declarations()
   * @model containment="true"
   * @generated
   */
  ETDeclarations getDeclarations();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getDeclarations <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarations</em>' containment reference.
   * @see #getDeclarations()
   * @generated
   */
  void setDeclarations(ETDeclarations value);

  /**
   * Returns the value of the '<em><b>Initial Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Location</em>' containment reference.
   * @see #setInitialLocation(ETLocation)
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationBody_InitialLocation()
   * @model containment="true"
   * @generated
   */
  ETLocation getInitialLocation();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETSpecificationBody#getInitialLocation <em>Initial Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Location</em>' containment reference.
   * @see #getInitialLocation()
   * @generated
   */
  void setInitialLocation(ETLocation value);

  /**
   * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETLocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETSpecificationBody_Locations()
   * @model containment="true"
   * @generated
   */
  EList<ETLocation> getLocations();

} // ETSpecificationBody
