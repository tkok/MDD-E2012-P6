/**
 */
package org.uppaal.xml.flat11.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uppaal.xml.flat11.Flat11Package;
import org.uppaal.xml.flat11.LabelType;
import org.uppaal.xml.flat11.NailType;
import org.uppaal.xml.flat11.SourceType;
import org.uppaal.xml.flat11.TargetType;
import org.uppaal.xml.flat11.TransitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getNail <em>Nail</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#isControllable <em>Controllable</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.TransitionTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionTypeImpl extends EObjectImpl implements TransitionType {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetType target;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelType> label;

	/**
	 * The cached value of the '{@link #getNail() <em>Nail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNail()
	 * @generated
	 * @ordered
	 */
	protected EList<NailType> nail;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Object ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Object action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Object color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isControllable() <em>Controllable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControllable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isControllable() <em>Controllable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControllable()
	 * @generated
	 * @ordered
	 */
	protected boolean controllable = CONTROLLABLE_EDEFAULT;

	/**
	 * This is true if the Controllable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controllableESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Flat11Package.Literals.TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		SourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flat11Package.TRANSITION_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flat11Package.TRANSITION_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetType newTarget, NotificationChain msgs) {
		TargetType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetType newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flat11Package.TRANSITION_TYPE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flat11Package.TRANSITION_TYPE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<LabelType>(LabelType.class, this, Flat11Package.TRANSITION_TYPE__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NailType> getNail() {
		if (nail == null) {
			nail = new EObjectContainmentEList<NailType>(NailType.class, this, Flat11Package.TRANSITION_TYPE__NAIL);
		}
		return nail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Object newAction) {
		Object oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Object newColor) {
		Object oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControllable() {
		return controllable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllable(boolean newControllable) {
		boolean oldControllable = controllable;
		controllable = newControllable;
		boolean oldControllableESet = controllableESet;
		controllableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__CONTROLLABLE, oldControllable, controllable, !oldControllableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControllable() {
		boolean oldControllable = controllable;
		boolean oldControllableESet = controllableESet;
		controllable = CONTROLLABLE_EDEFAULT;
		controllableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Flat11Package.TRANSITION_TYPE__CONTROLLABLE, oldControllable, CONTROLLABLE_EDEFAULT, oldControllableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControllable() {
		return controllableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX() {
		int oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Flat11Package.TRANSITION_TYPE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.TRANSITION_TYPE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY() {
		int oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Flat11Package.TRANSITION_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Flat11Package.TRANSITION_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case Flat11Package.TRANSITION_TYPE__TARGET:
				return basicSetTarget(null, msgs);
			case Flat11Package.TRANSITION_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Flat11Package.TRANSITION_TYPE__NAIL:
				return ((InternalEList<?>)getNail()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Flat11Package.TRANSITION_TYPE__SOURCE:
				return getSource();
			case Flat11Package.TRANSITION_TYPE__TARGET:
				return getTarget();
			case Flat11Package.TRANSITION_TYPE__LABEL:
				return getLabel();
			case Flat11Package.TRANSITION_TYPE__NAIL:
				return getNail();
			case Flat11Package.TRANSITION_TYPE__ACTION:
				return getAction();
			case Flat11Package.TRANSITION_TYPE__COLOR:
				return getColor();
			case Flat11Package.TRANSITION_TYPE__CONTROLLABLE:
				return isControllable();
			case Flat11Package.TRANSITION_TYPE__ID:
				return getId();
			case Flat11Package.TRANSITION_TYPE__X:
				return getX();
			case Flat11Package.TRANSITION_TYPE__Y:
				return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Flat11Package.TRANSITION_TYPE__SOURCE:
				setSource((SourceType)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__TARGET:
				setTarget((TargetType)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__NAIL:
				getNail().clear();
				getNail().addAll((Collection<? extends NailType>)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__ACTION:
				setAction(newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__COLOR:
				setColor(newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__CONTROLLABLE:
				setControllable((Boolean)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__ID:
				setId((String)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__X:
				setX((Integer)newValue);
				return;
			case Flat11Package.TRANSITION_TYPE__Y:
				setY((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Flat11Package.TRANSITION_TYPE__SOURCE:
				setSource((SourceType)null);
				return;
			case Flat11Package.TRANSITION_TYPE__TARGET:
				setTarget((TargetType)null);
				return;
			case Flat11Package.TRANSITION_TYPE__LABEL:
				getLabel().clear();
				return;
			case Flat11Package.TRANSITION_TYPE__NAIL:
				getNail().clear();
				return;
			case Flat11Package.TRANSITION_TYPE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Flat11Package.TRANSITION_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case Flat11Package.TRANSITION_TYPE__CONTROLLABLE:
				unsetControllable();
				return;
			case Flat11Package.TRANSITION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Flat11Package.TRANSITION_TYPE__X:
				unsetX();
				return;
			case Flat11Package.TRANSITION_TYPE__Y:
				unsetY();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Flat11Package.TRANSITION_TYPE__SOURCE:
				return source != null;
			case Flat11Package.TRANSITION_TYPE__TARGET:
				return target != null;
			case Flat11Package.TRANSITION_TYPE__LABEL:
				return label != null && !label.isEmpty();
			case Flat11Package.TRANSITION_TYPE__NAIL:
				return nail != null && !nail.isEmpty();
			case Flat11Package.TRANSITION_TYPE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case Flat11Package.TRANSITION_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case Flat11Package.TRANSITION_TYPE__CONTROLLABLE:
				return isSetControllable();
			case Flat11Package.TRANSITION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Flat11Package.TRANSITION_TYPE__X:
				return isSetX();
			case Flat11Package.TRANSITION_TYPE__Y:
				return isSetY();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", color: ");
		result.append(color);
		result.append(", controllable: ");
		if (controllableESet) result.append(controllable); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransitionTypeImpl
