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

import org.uppaal.xml.flat11.CommittedType;
import org.uppaal.xml.flat11.Flat11Package;
import org.uppaal.xml.flat11.LabelType;
import org.uppaal.xml.flat11.LocationType;
import org.uppaal.xml.flat11.NameType;
import org.uppaal.xml.flat11.UrgentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getCommitted <em>Committed</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.uppaal.xml.flat11.impl.LocationTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeImpl extends EObjectImpl implements LocationType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

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
	 * The cached value of the '{@link #getUrgent() <em>Urgent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgent()
	 * @generated
	 * @ordered
	 */
	protected UrgentType urgent;

	/**
	 * The cached value of the '{@link #getCommitted() <em>Committed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitted()
	 * @generated
	 * @ordered
	 */
	protected CommittedType committed;

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
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Flat11Package.Literals.LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<LabelType>(LabelType.class, this, Flat11Package.LOCATION_TYPE__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrgentType getUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrgent(UrgentType newUrgent, NotificationChain msgs) {
		UrgentType oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__URGENT, oldUrgent, newUrgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(UrgentType newUrgent) {
		if (newUrgent != urgent) {
			NotificationChain msgs = null;
			if (urgent != null)
				msgs = ((InternalEObject)urgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__URGENT, null, msgs);
			if (newUrgent != null)
				msgs = ((InternalEObject)newUrgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__URGENT, null, msgs);
			msgs = basicSetUrgent(newUrgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__URGENT, newUrgent, newUrgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommittedType getCommitted() {
		return committed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitted(CommittedType newCommitted, NotificationChain msgs) {
		CommittedType oldCommitted = committed;
		committed = newCommitted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__COMMITTED, oldCommitted, newCommitted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitted(CommittedType newCommitted) {
		if (newCommitted != committed) {
			NotificationChain msgs = null;
			if (committed != null)
				msgs = ((InternalEObject)committed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__COMMITTED, null, msgs);
			if (newCommitted != null)
				msgs = ((InternalEObject)newCommitted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flat11Package.LOCATION_TYPE__COMMITTED, null, msgs);
			msgs = basicSetCommitted(newCommitted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__COMMITTED, newCommitted, newCommitted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Flat11Package.LOCATION_TYPE__X, oldX, X_EDEFAULT, oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Flat11Package.LOCATION_TYPE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Flat11Package.LOCATION_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
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
			case Flat11Package.LOCATION_TYPE__NAME:
				return basicSetName(null, msgs);
			case Flat11Package.LOCATION_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Flat11Package.LOCATION_TYPE__URGENT:
				return basicSetUrgent(null, msgs);
			case Flat11Package.LOCATION_TYPE__COMMITTED:
				return basicSetCommitted(null, msgs);
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
			case Flat11Package.LOCATION_TYPE__NAME:
				return getName();
			case Flat11Package.LOCATION_TYPE__LABEL:
				return getLabel();
			case Flat11Package.LOCATION_TYPE__URGENT:
				return getUrgent();
			case Flat11Package.LOCATION_TYPE__COMMITTED:
				return getCommitted();
			case Flat11Package.LOCATION_TYPE__COLOR:
				return getColor();
			case Flat11Package.LOCATION_TYPE__ID:
				return getId();
			case Flat11Package.LOCATION_TYPE__X:
				return getX();
			case Flat11Package.LOCATION_TYPE__Y:
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
			case Flat11Package.LOCATION_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__URGENT:
				setUrgent((UrgentType)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__COMMITTED:
				setCommitted((CommittedType)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__COLOR:
				setColor(newValue);
				return;
			case Flat11Package.LOCATION_TYPE__ID:
				setId((String)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__X:
				setX((Integer)newValue);
				return;
			case Flat11Package.LOCATION_TYPE__Y:
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
			case Flat11Package.LOCATION_TYPE__NAME:
				setName((NameType)null);
				return;
			case Flat11Package.LOCATION_TYPE__LABEL:
				getLabel().clear();
				return;
			case Flat11Package.LOCATION_TYPE__URGENT:
				setUrgent((UrgentType)null);
				return;
			case Flat11Package.LOCATION_TYPE__COMMITTED:
				setCommitted((CommittedType)null);
				return;
			case Flat11Package.LOCATION_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case Flat11Package.LOCATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Flat11Package.LOCATION_TYPE__X:
				unsetX();
				return;
			case Flat11Package.LOCATION_TYPE__Y:
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
			case Flat11Package.LOCATION_TYPE__NAME:
				return name != null;
			case Flat11Package.LOCATION_TYPE__LABEL:
				return label != null && !label.isEmpty();
			case Flat11Package.LOCATION_TYPE__URGENT:
				return urgent != null;
			case Flat11Package.LOCATION_TYPE__COMMITTED:
				return committed != null;
			case Flat11Package.LOCATION_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case Flat11Package.LOCATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Flat11Package.LOCATION_TYPE__X:
				return isSetX();
			case Flat11Package.LOCATION_TYPE__Y:
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
		result.append(" (color: ");
		result.append(color);
		result.append(", id: ");
		result.append(id);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
