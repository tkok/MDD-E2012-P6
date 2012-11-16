/**
 */
package org.uppaal.xml.description.description.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.uppaal.xml.description.description.DescriptionPackage;
import org.uppaal.xml.description.description.UATypeModifiers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Type Modifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl#isBroadcast <em>Broadcast</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UATypeModifiersImpl#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UATypeModifiersImpl extends MinimalEObjectImpl.Container implements UATypeModifiers
{
  /**
   * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUrgent()
   * @generated
   * @ordered
   */
  protected static final boolean URGENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUrgent()
   * @generated
   * @ordered
   */
  protected boolean urgent = URGENT_EDEFAULT;

  /**
   * The default value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBroadcast()
   * @generated
   * @ordered
   */
  protected static final boolean BROADCAST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBroadcast() <em>Broadcast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBroadcast()
   * @generated
   * @ordered
   */
  protected boolean broadcast = BROADCAST_EDEFAULT;

  /**
   * The default value of the '{@link #isMeta() <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeta()
   * @generated
   * @ordered
   */
  protected static final boolean META_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMeta() <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeta()
   * @generated
   * @ordered
   */
  protected boolean meta = META_EDEFAULT;

  /**
   * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected static final boolean CONST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected boolean const_ = CONST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UATypeModifiersImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DescriptionPackage.Literals.UA_TYPE_MODIFIERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUrgent()
  {
    return urgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrgent(boolean newUrgent)
  {
    boolean oldUrgent = urgent;
    urgent = newUrgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_TYPE_MODIFIERS__URGENT, oldUrgent, urgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBroadcast()
  {
    return broadcast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBroadcast(boolean newBroadcast)
  {
    boolean oldBroadcast = broadcast;
    broadcast = newBroadcast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_TYPE_MODIFIERS__BROADCAST, oldBroadcast, broadcast));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMeta()
  {
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(boolean newMeta)
  {
    boolean oldMeta = meta;
    meta = newMeta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_TYPE_MODIFIERS__META, oldMeta, meta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(boolean newConst)
  {
    boolean oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_TYPE_MODIFIERS__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_TYPE_MODIFIERS__URGENT:
        return isUrgent();
      case DescriptionPackage.UA_TYPE_MODIFIERS__BROADCAST:
        return isBroadcast();
      case DescriptionPackage.UA_TYPE_MODIFIERS__META:
        return isMeta();
      case DescriptionPackage.UA_TYPE_MODIFIERS__CONST:
        return isConst();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_TYPE_MODIFIERS__URGENT:
        setUrgent((Boolean)newValue);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__BROADCAST:
        setBroadcast((Boolean)newValue);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__META:
        setMeta((Boolean)newValue);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__CONST:
        setConst((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_TYPE_MODIFIERS__URGENT:
        setUrgent(URGENT_EDEFAULT);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__BROADCAST:
        setBroadcast(BROADCAST_EDEFAULT);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__META:
        setMeta(META_EDEFAULT);
        return;
      case DescriptionPackage.UA_TYPE_MODIFIERS__CONST:
        setConst(CONST_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_TYPE_MODIFIERS__URGENT:
        return urgent != URGENT_EDEFAULT;
      case DescriptionPackage.UA_TYPE_MODIFIERS__BROADCAST:
        return broadcast != BROADCAST_EDEFAULT;
      case DescriptionPackage.UA_TYPE_MODIFIERS__META:
        return meta != META_EDEFAULT;
      case DescriptionPackage.UA_TYPE_MODIFIERS__CONST:
        return const_ != CONST_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (urgent: ");
    result.append(urgent);
    result.append(", broadcast: ");
    result.append(broadcast);
    result.append(", meta: ");
    result.append(meta);
    result.append(", const: ");
    result.append(const_);
    result.append(')');
    return result.toString();
  }

} //UATypeModifiersImpl
