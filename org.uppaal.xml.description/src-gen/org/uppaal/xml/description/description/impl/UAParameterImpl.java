/**
 */
package org.uppaal.xml.description.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uppaal.xml.description.description.DescriptionPackage;
import org.uppaal.xml.description.description.UAArrayDeclaration;
import org.uppaal.xml.description.description.UAParameter;
import org.uppaal.xml.description.description.UAType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAParameterImpl#isByReference <em>By Reference</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAParameterImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UAParameterImpl extends MinimalEObjectImpl.Container implements UAParameter
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected UAType type;

  /**
   * The default value of the '{@link #isByReference() <em>By Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByReference()
   * @generated
   * @ordered
   */
  protected static final boolean BY_REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isByReference() <em>By Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByReference()
   * @generated
   * @ordered
   */
  protected boolean byReference = BY_REFERENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected EList<UAArrayDeclaration> dimensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UAParameterImpl()
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
    return DescriptionPackage.Literals.UA_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(UAType newType, NotificationChain msgs)
  {
    UAType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_PARAMETER__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(UAType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.UA_PARAMETER__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.UA_PARAMETER__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_PARAMETER__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isByReference()
  {
    return byReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByReference(boolean newByReference)
  {
    boolean oldByReference = byReference;
    byReference = newByReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_PARAMETER__BY_REFERENCE, oldByReference, byReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UAArrayDeclaration> getDimensions()
  {
    if (dimensions == null)
    {
      dimensions = new EObjectContainmentEList<UAArrayDeclaration>(UAArrayDeclaration.class, this, DescriptionPackage.UA_PARAMETER__DIMENSIONS);
    }
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_PARAMETER__TYPE:
        return basicSetType(null, msgs);
      case DescriptionPackage.UA_PARAMETER__DIMENSIONS:
        return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DescriptionPackage.UA_PARAMETER__TYPE:
        return getType();
      case DescriptionPackage.UA_PARAMETER__BY_REFERENCE:
        return isByReference();
      case DescriptionPackage.UA_PARAMETER__NAME:
        return getName();
      case DescriptionPackage.UA_PARAMETER__DIMENSIONS:
        return getDimensions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DescriptionPackage.UA_PARAMETER__TYPE:
        setType((UAType)newValue);
        return;
      case DescriptionPackage.UA_PARAMETER__BY_REFERENCE:
        setByReference((Boolean)newValue);
        return;
      case DescriptionPackage.UA_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case DescriptionPackage.UA_PARAMETER__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends UAArrayDeclaration>)newValue);
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
      case DescriptionPackage.UA_PARAMETER__TYPE:
        setType((UAType)null);
        return;
      case DescriptionPackage.UA_PARAMETER__BY_REFERENCE:
        setByReference(BY_REFERENCE_EDEFAULT);
        return;
      case DescriptionPackage.UA_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DescriptionPackage.UA_PARAMETER__DIMENSIONS:
        getDimensions().clear();
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
      case DescriptionPackage.UA_PARAMETER__TYPE:
        return type != null;
      case DescriptionPackage.UA_PARAMETER__BY_REFERENCE:
        return byReference != BY_REFERENCE_EDEFAULT;
      case DescriptionPackage.UA_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DescriptionPackage.UA_PARAMETER__DIMENSIONS:
        return dimensions != null && !dimensions.isEmpty();
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
    result.append(" (byReference: ");
    result.append(byReference);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //UAParameterImpl
