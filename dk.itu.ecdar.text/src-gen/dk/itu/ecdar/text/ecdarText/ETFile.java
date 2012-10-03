/**
 */
package dk.itu.ecdar.text.ecdarText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ET File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFile#getImports <em>Imports</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFile#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.ETFile#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFile()
 * @model
 * @generated
 */
public interface ETFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ETImport> getImports();

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
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFile_Declarations()
   * @model containment="true"
   * @generated
   */
  ETDeclarations getDeclarations();

  /**
   * Sets the value of the '{@link dk.itu.ecdar.text.ecdarText.ETFile#getDeclarations <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarations</em>' containment reference.
   * @see #getDeclarations()
   * @generated
   */
  void setDeclarations(ETDeclarations value);

  /**
   * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
   * The list contents are of type {@link dk.itu.ecdar.text.ecdarText.ETSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifications</em>' containment reference list.
   * @see dk.itu.ecdar.text.ecdarText.EcdarTextPackage#getETFile_Specifications()
   * @model containment="true"
   * @generated
   */
  EList<ETSpecification> getSpecifications();

} // ETFile
