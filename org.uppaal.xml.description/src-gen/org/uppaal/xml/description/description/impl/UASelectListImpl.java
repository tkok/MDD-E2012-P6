/**
 */
package org.uppaal.xml.description.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uppaal.xml.description.description.DescriptionPackage;
import org.uppaal.xml.description.description.UASelect;
import org.uppaal.xml.description.description.UASelectList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Select List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.impl.UASelectListImpl#getSelects <em>Selects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UASelectListImpl extends TopImpl implements UASelectList
{
  /**
   * The cached value of the '{@link #getSelects() <em>Selects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelects()
   * @generated
   * @ordered
   */
  protected EList<UASelect> selects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UASelectListImpl()
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
    return DescriptionPackage.Literals.UA_SELECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UASelect> getSelects()
  {
    if (selects == null)
    {
      selects = new EObjectContainmentEList<UASelect>(UASelect.class, this, DescriptionPackage.UA_SELECT_LIST__SELECTS);
    }
    return selects;
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
      case DescriptionPackage.UA_SELECT_LIST__SELECTS:
        return ((InternalEList<?>)getSelects()).basicRemove(otherEnd, msgs);
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
      case DescriptionPackage.UA_SELECT_LIST__SELECTS:
        return getSelects();
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
      case DescriptionPackage.UA_SELECT_LIST__SELECTS:
        getSelects().clear();
        getSelects().addAll((Collection<? extends UASelect>)newValue);
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
      case DescriptionPackage.UA_SELECT_LIST__SELECTS:
        getSelects().clear();
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
      case DescriptionPackage.UA_SELECT_LIST__SELECTS:
        return selects != null && !selects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UASelectListImpl
