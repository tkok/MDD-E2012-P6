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
import org.uppaal.xml.description.description.UAInitialiser;
import org.uppaal.xml.description.description.UAMultiInitialiser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UA Multi Initialiser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uppaal.xml.description.description.impl.UAMultiInitialiserImpl#getInitialisers <em>Initialisers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UAMultiInitialiserImpl extends UAInitialiserImpl implements UAMultiInitialiser
{
  /**
   * The cached value of the '{@link #getInitialisers() <em>Initialisers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialisers()
   * @generated
   * @ordered
   */
  protected EList<UAInitialiser> initialisers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UAMultiInitialiserImpl()
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
    return DescriptionPackage.Literals.UA_MULTI_INITIALISER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UAInitialiser> getInitialisers()
  {
    if (initialisers == null)
    {
      initialisers = new EObjectContainmentEList<UAInitialiser>(UAInitialiser.class, this, DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS);
    }
    return initialisers;
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
      case DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS:
        return ((InternalEList<?>)getInitialisers()).basicRemove(otherEnd, msgs);
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
      case DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS:
        return getInitialisers();
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
      case DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS:
        getInitialisers().clear();
        getInitialisers().addAll((Collection<? extends UAInitialiser>)newValue);
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
      case DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS:
        getInitialisers().clear();
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
      case DescriptionPackage.UA_MULTI_INITIALISER__INITIALISERS:
        return initialisers != null && !initialisers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UAMultiInitialiserImpl
