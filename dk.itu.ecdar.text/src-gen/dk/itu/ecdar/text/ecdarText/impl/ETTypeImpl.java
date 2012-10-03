/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETType;
import dk.itu.ecdar.text.ecdarText.ETTypeIdentifier;
import dk.itu.ecdar.text.ecdarText.ETTypeModifiers;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETTypeImpl extends MinimalEObjectImpl.Container implements ETType
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected ETTypeModifiers modifiers;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected ETTypeIdentifier identifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETTypeImpl()
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
    return EcdarTextPackage.Literals.ET_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeModifiers getModifiers()
  {
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifiers(ETTypeModifiers newModifiers, NotificationChain msgs)
  {
    ETTypeModifiers oldModifiers = modifiers;
    modifiers = newModifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE__MODIFIERS, oldModifiers, newModifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifiers(ETTypeModifiers newModifiers)
  {
    if (newModifiers != modifiers)
    {
      NotificationChain msgs = null;
      if (modifiers != null)
        msgs = ((InternalEObject)modifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE__MODIFIERS, null, msgs);
      if (newModifiers != null)
        msgs = ((InternalEObject)newModifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE__MODIFIERS, null, msgs);
      msgs = basicSetModifiers(newModifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE__MODIFIERS, newModifiers, newModifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETTypeIdentifier getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(ETTypeIdentifier newIdentifier, NotificationChain msgs)
  {
    ETTypeIdentifier oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE__IDENTIFIER, oldIdentifier, newIdentifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(ETTypeIdentifier newIdentifier)
  {
    if (newIdentifier != identifier)
    {
      NotificationChain msgs = null;
      if (identifier != null)
        msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE__IDENTIFIER, null, msgs);
      if (newIdentifier != null)
        msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE__IDENTIFIER, null, msgs);
      msgs = basicSetIdentifier(newIdentifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE__IDENTIFIER, newIdentifier, newIdentifier));
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
      case EcdarTextPackage.ET_TYPE__MODIFIERS:
        return basicSetModifiers(null, msgs);
      case EcdarTextPackage.ET_TYPE__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
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
      case EcdarTextPackage.ET_TYPE__MODIFIERS:
        return getModifiers();
      case EcdarTextPackage.ET_TYPE__IDENTIFIER:
        return getIdentifier();
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
      case EcdarTextPackage.ET_TYPE__MODIFIERS:
        setModifiers((ETTypeModifiers)newValue);
        return;
      case EcdarTextPackage.ET_TYPE__IDENTIFIER:
        setIdentifier((ETTypeIdentifier)newValue);
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
      case EcdarTextPackage.ET_TYPE__MODIFIERS:
        setModifiers((ETTypeModifiers)null);
        return;
      case EcdarTextPackage.ET_TYPE__IDENTIFIER:
        setIdentifier((ETTypeIdentifier)null);
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
      case EcdarTextPackage.ET_TYPE__MODIFIERS:
        return modifiers != null;
      case EcdarTextPackage.ET_TYPE__IDENTIFIER:
        return identifier != null;
    }
    return super.eIsSet(featureID);
  }

} //ETTypeImpl
