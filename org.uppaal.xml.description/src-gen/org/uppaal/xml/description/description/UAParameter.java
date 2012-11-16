/**
 */
package org.uppaal.xml.description.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.UAParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAParameter#isByReference <em>By Reference</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.UAParameter#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.description.description.DescriptionPackage#getUAParameter()
 * @model
 * @generated
 */
public interface UAParameter extends EObject
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
   * @see #setType(UAType)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAParameter_Type()
   * @model containment="true"
   * @generated
   */
  UAType getType();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAParameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UAType value);

  /**
   * Returns the value of the '<em><b>By Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By Reference</em>' attribute.
   * @see #setByReference(boolean)
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAParameter_ByReference()
   * @model
   * @generated
   */
  boolean isByReference();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAParameter#isByReference <em>By Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By Reference</em>' attribute.
   * @see #isByReference()
   * @generated
   */
  void setByReference(boolean value);

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
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.uppaal.xml.description.description.UAParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
   * The list contents are of type {@link org.uppaal.xml.description.description.UAArrayDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference list.
   * @see org.uppaal.xml.description.description.DescriptionPackage#getUAParameter_Dimensions()
   * @model containment="true"
   * @generated
   */
  EList<UAArrayDeclaration> getDimensions();

} // UAParameter
