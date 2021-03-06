/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Array Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAArrayDeclaration#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAArrayDeclaration()
 * @model
 * @generated
 */
public interface UAArrayDeclaration extends EObject
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
   * @see #setSize(UAExpression)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAArrayDeclaration_Size()
   * @model containment="true"
   * @generated
   */
  UAExpression getSize();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAArrayDeclaration#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(UAExpression value);

} // UAArrayDeclaration
