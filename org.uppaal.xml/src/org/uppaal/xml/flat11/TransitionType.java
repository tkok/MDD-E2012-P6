/**
 */
package org.uppaal.xml.flat11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getSource <em>Source</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getNail <em>Nail</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getAction <em>Action</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getColor <em>Color</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#isControllable <em>Controllable</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getId <em>Id</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getX <em>X</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.TransitionType#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType()
 * @model extendedMetaData="name='transition_._type' kind='elementOnly'"
 * @generated
 */
public interface TransitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetType)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetType getTarget();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.uppaal.xml.flat11.LabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LabelType> getLabel();

	/**
	 * Returns the value of the '<em><b>Nail</b></em>' containment reference list.
	 * The list contents are of type {@link org.uppaal.xml.flat11.NailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nail</em>' containment reference list.
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Nail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NailType> getNail();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Object)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Action()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAction();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Object value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Object)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Color()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getColor();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Object value);

	/**
	 * Returns the value of the '<em><b>Controllable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllable</em>' attribute.
	 * @see #isSetControllable()
	 * @see #unsetControllable()
	 * @see #setControllable(boolean)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Controllable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='controllable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isControllable();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#isControllable <em>Controllable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controllable</em>' attribute.
	 * @see #isSetControllable()
	 * @see #unsetControllable()
	 * @see #isControllable()
	 * @generated
	 */
	void setControllable(boolean value);

	/**
	 * Unsets the value of the '{@link org.uppaal.xml.flat11.TransitionType#isControllable <em>Controllable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControllable()
	 * @see #isControllable()
	 * @see #setControllable(boolean)
	 * @generated
	 */
	void unsetControllable();

	/**
	 * Returns whether the value of the '{@link org.uppaal.xml.flat11.TransitionType#isControllable <em>Controllable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controllable</em>' attribute is set.
	 * @see #unsetControllable()
	 * @see #isControllable()
	 * @see #setControllable(boolean)
	 * @generated
	 */
	boolean isSetControllable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(int)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Unsets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.uppaal.xml.flat11.TransitionType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(int)
	 * @see org.uppaal.xml.flat11.Flat11Package#getTransitionType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Unsets the value of the '{@link org.uppaal.xml.flat11.TransitionType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.uppaal.xml.flat11.TransitionType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	boolean isSetY();

} // TransitionType
