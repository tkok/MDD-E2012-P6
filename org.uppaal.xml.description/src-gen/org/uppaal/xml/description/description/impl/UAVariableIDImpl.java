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
import org.uppaal.xml.description.description.UAInitialiser;
import org.uppaal.xml.description.description.UAVariableID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Variable ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAVariableIDImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAVariableIDImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAVariableIDImpl#getInitialiser <em>Initialiser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UAVariableIDImpl extends MinimalEObjectImpl.Container implements UAVariableID
{
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
   * The cached value of the '{@link #getInitialiser() <em>Initialiser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialiser()
   * @generated
   * @ordered
   */
  protected UAInitialiser initialiser;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UAVariableIDImpl()
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
    return DescriptionPackage.Literals.UA_VARIABLE_ID;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_VARIABLE_ID__NAME, oldName, name));
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
      dimensions = new EObjectContainmentEList<UAArrayDeclaration>(UAArrayDeclaration.class, this, DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS);
    }
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UAInitialiser getInitialiser()
  {
    return initialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialiser(UAInitialiser newInitialiser, NotificationChain msgs)
  {
    UAInitialiser oldInitialiser = initialiser;
    initialiser = newInitialiser;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_VARIABLE_ID__INITIALISER, oldInitialiser, newInitialiser);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialiser(UAInitialiser newInitialiser)
  {
    if (newInitialiser != initialiser)
    {
      NotificationChain msgs = null;
      if (initialiser != null)
        msgs = ((InternalEObject)initialiser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.UA_VARIABLE_ID__INITIALISER, null, msgs);
      if (newInitialiser != null)
        msgs = ((InternalEObject)newInitialiser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.UA_VARIABLE_ID__INITIALISER, null, msgs);
      msgs = basicSetInitialiser(newInitialiser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.UA_VARIABLE_ID__INITIALISER, newInitialiser, newInitialiser));
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
      case DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS:
        return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
      case DescriptionPackage.UA_VARIABLE_ID__INITIALISER:
        return basicSetInitialiser(null, msgs);
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
      case DescriptionPackage.UA_VARIABLE_ID__NAME:
        return getName();
      case DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS:
        return getDimensions();
      case DescriptionPackage.UA_VARIABLE_ID__INITIALISER:
        return getInitialiser();
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
      case DescriptionPackage.UA_VARIABLE_ID__NAME:
        setName((String)newValue);
        return;
      case DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends UAArrayDeclaration>)newValue);
        return;
      case DescriptionPackage.UA_VARIABLE_ID__INITIALISER:
        setInitialiser((UAInitialiser)newValue);
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
      case DescriptionPackage.UA_VARIABLE_ID__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS:
        getDimensions().clear();
        return;
      case DescriptionPackage.UA_VARIABLE_ID__INITIALISER:
        setInitialiser((UAInitialiser)null);
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
      case DescriptionPackage.UA_VARIABLE_ID__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DescriptionPackage.UA_VARIABLE_ID__DIMENSIONS:
        return dimensions != null && !dimensions.isEmpty();
      case DescriptionPackage.UA_VARIABLE_ID__INITIALISER:
        return initialiser != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //UAVariableIDImpl
