/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETInitialiser;
import dk.itu.ecdar.text.ecdarText.ETMultiInitialiser;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Multi Initialiser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETMultiInitialiserImpl#getInitialisers <em>Initialisers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETMultiInitialiserImpl extends ETInitialiserImpl implements ETMultiInitialiser
{
  /**
   * The cached value of the '{@link #getInitialisers() <em>Initialisers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialisers()
   * @generated
   * @ordered
   */
  protected EList<ETInitialiser> initialisers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETMultiInitialiserImpl()
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
    return EcdarTextPackage.Literals.ET_MULTI_INITIALISER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETInitialiser> getInitialisers()
  {
    if (initialisers == null)
    {
      initialisers = new EObjectContainmentEList<ETInitialiser>(ETInitialiser.class, this, EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS);
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
      case EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS:
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
      case EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS:
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
      case EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS:
        getInitialisers().clear();
        getInitialisers().addAll((Collection<? extends ETInitialiser>)newValue);
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
      case EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS:
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
      case EcdarTextPackage.ET_MULTI_INITIALISER__INITIALISERS:
        return initialisers != null && !initialisers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETMultiInitialiserImpl
