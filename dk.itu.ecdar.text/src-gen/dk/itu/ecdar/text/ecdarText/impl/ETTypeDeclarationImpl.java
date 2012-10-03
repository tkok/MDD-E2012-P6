/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETType;
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeID;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETTypeDeclarationImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETTypeDeclarationImpl extends ETDeclarationImpl implements ETTypeDeclaration
{
  /**
   * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseType()
   * @generated
   * @ordered
   */
  protected ETType baseType;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<ETTypeID> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETTypeDeclarationImpl()
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
    return EcdarTextPackage.Literals.ET_TYPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETType getBaseType()
  {
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseType(ETType newBaseType, NotificationChain msgs)
  {
    ETType oldBaseType = baseType;
    baseType = newBaseType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE, oldBaseType, newBaseType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseType(ETType newBaseType)
  {
    if (newBaseType != baseType)
    {
      NotificationChain msgs = null;
      if (baseType != null)
        msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE, null, msgs);
      if (newBaseType != null)
        msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE, null, msgs);
      msgs = basicSetBaseType(newBaseType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE, newBaseType, newBaseType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETTypeID> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<ETTypeID>(ETTypeID.class, this, EcdarTextPackage.ET_TYPE_DECLARATION__TYPES);
    }
    return types;
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
      case EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE:
        return basicSetBaseType(null, msgs);
      case EcdarTextPackage.ET_TYPE_DECLARATION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE:
        return getBaseType();
      case EcdarTextPackage.ET_TYPE_DECLARATION__TYPES:
        return getTypes();
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
      case EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE:
        setBaseType((ETType)newValue);
        return;
      case EcdarTextPackage.ET_TYPE_DECLARATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends ETTypeID>)newValue);
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
      case EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE:
        setBaseType((ETType)null);
        return;
      case EcdarTextPackage.ET_TYPE_DECLARATION__TYPES:
        getTypes().clear();
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
      case EcdarTextPackage.ET_TYPE_DECLARATION__BASE_TYPE:
        return baseType != null;
      case EcdarTextPackage.ET_TYPE_DECLARATION__TYPES:
        return types != null && !types.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETTypeDeclarationImpl
