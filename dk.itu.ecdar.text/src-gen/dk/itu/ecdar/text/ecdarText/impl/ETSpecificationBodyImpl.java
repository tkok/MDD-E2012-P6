/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETDeclarations;
import dk.itu.ecdar.text.ecdarText.ETLocation;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBody;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Specification Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl#getInitialLocation <em>Initial Location</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationBodyImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETSpecificationBodyImpl extends MinimalEObjectImpl.Container implements ETSpecificationBody
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected ETDeclarations declarations;

  /**
   * The cached value of the '{@link #getInitialLocation() <em>Initial Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialLocation()
   * @generated
   * @ordered
   */
  protected ETLocation initialLocation;

  /**
   * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocations()
   * @generated
   * @ordered
   */
  protected EList<ETLocation> locations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETSpecificationBodyImpl()
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
    return EcdarTextPackage.Literals.ET_SPECIFICATION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDeclarations getDeclarations()
  {
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarations(ETDeclarations newDeclarations, NotificationChain msgs)
  {
    ETDeclarations oldDeclarations = declarations;
    declarations = newDeclarations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS, oldDeclarations, newDeclarations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarations(ETDeclarations newDeclarations)
  {
    if (newDeclarations != declarations)
    {
      NotificationChain msgs = null;
      if (declarations != null)
        msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS, null, msgs);
      if (newDeclarations != null)
        msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS, null, msgs);
      msgs = basicSetDeclarations(newDeclarations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS, newDeclarations, newDeclarations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLocation getInitialLocation()
  {
    return initialLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialLocation(ETLocation newInitialLocation, NotificationChain msgs)
  {
    ETLocation oldInitialLocation = initialLocation;
    initialLocation = newInitialLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION, oldInitialLocation, newInitialLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialLocation(ETLocation newInitialLocation)
  {
    if (newInitialLocation != initialLocation)
    {
      NotificationChain msgs = null;
      if (initialLocation != null)
        msgs = ((InternalEObject)initialLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION, null, msgs);
      if (newInitialLocation != null)
        msgs = ((InternalEObject)newInitialLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION, null, msgs);
      msgs = basicSetInitialLocation(newInitialLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION, newInitialLocation, newInitialLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETLocation> getLocations()
  {
    if (locations == null)
    {
      locations = new EObjectContainmentEList<ETLocation>(ETLocation.class, this, EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS);
    }
    return locations;
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
      case EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS:
        return basicSetDeclarations(null, msgs);
      case EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION:
        return basicSetInitialLocation(null, msgs);
      case EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS:
        return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS:
        return getDeclarations();
      case EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION:
        return getInitialLocation();
      case EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS:
        return getLocations();
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
      case EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS:
        setDeclarations((ETDeclarations)newValue);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION:
        setInitialLocation((ETLocation)newValue);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS:
        getLocations().clear();
        getLocations().addAll((Collection<? extends ETLocation>)newValue);
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
      case EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS:
        setDeclarations((ETDeclarations)null);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION:
        setInitialLocation((ETLocation)null);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS:
        getLocations().clear();
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
      case EcdarTextPackage.ET_SPECIFICATION_BODY__DECLARATIONS:
        return declarations != null;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__INITIAL_LOCATION:
        return initialLocation != null;
      case EcdarTextPackage.ET_SPECIFICATION_BODY__LOCATIONS:
        return locations != null && !locations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETSpecificationBodyImpl
