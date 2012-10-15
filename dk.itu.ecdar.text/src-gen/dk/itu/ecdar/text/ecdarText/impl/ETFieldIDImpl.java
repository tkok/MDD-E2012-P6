/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETArrayDeclaration;
import dk.itu.ecdar.text.ecdarText.ETFieldID;
import dk.itu.ecdar.text.ecdarText.ETIOType;
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
 * An implementation of the model object '<em><b>ET Field ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFieldIDImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETFieldIDImpl extends MinimalEObjectImpl.Container implements ETFieldID
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
   * The default value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIoType()
   * @generated
   * @ordered
   */
  protected static final ETIOType IO_TYPE_EDEFAULT = ETIOType.INPUT;

  /**
   * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIoType()
   * @generated
   * @ordered
   */
  protected ETIOType ioType = IO_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected EList<ETArrayDeclaration> dimensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETFieldIDImpl()
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
    return EcdarTextPackage.Literals.ET_FIELD_ID;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_FIELD_ID__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETIOType getIoType()
  {
    return ioType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIoType(ETIOType newIoType)
  {
    ETIOType oldIoType = ioType;
    ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_FIELD_ID__IO_TYPE, oldIoType, ioType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETArrayDeclaration> getDimensions()
  {
    if (dimensions == null)
    {
      dimensions = new EObjectContainmentEList<ETArrayDeclaration>(ETArrayDeclaration.class, this, EcdarTextPackage.ET_FIELD_ID__DIMENSIONS);
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
      case EcdarTextPackage.ET_FIELD_ID__DIMENSIONS:
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
      case EcdarTextPackage.ET_FIELD_ID__NAME:
        return getName();
      case EcdarTextPackage.ET_FIELD_ID__IO_TYPE:
        return getIoType();
      case EcdarTextPackage.ET_FIELD_ID__DIMENSIONS:
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
      case EcdarTextPackage.ET_FIELD_ID__NAME:
        setName((String)newValue);
        return;
      case EcdarTextPackage.ET_FIELD_ID__IO_TYPE:
        setIoType((ETIOType)newValue);
        return;
      case EcdarTextPackage.ET_FIELD_ID__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends ETArrayDeclaration>)newValue);
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
      case EcdarTextPackage.ET_FIELD_ID__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcdarTextPackage.ET_FIELD_ID__IO_TYPE:
        setIoType(IO_TYPE_EDEFAULT);
        return;
      case EcdarTextPackage.ET_FIELD_ID__DIMENSIONS:
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
      case EcdarTextPackage.ET_FIELD_ID__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcdarTextPackage.ET_FIELD_ID__IO_TYPE:
        return ioType != IO_TYPE_EDEFAULT;
      case EcdarTextPackage.ET_FIELD_ID__DIMENSIONS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", ioType: ");
    result.append(ioType);
    result.append(')');
    return result.toString();
  }

} //ETFieldIDImpl
