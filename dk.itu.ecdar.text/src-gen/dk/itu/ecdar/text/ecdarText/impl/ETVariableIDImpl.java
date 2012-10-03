/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETArrayDeclaration;
import dk.itu.ecdar.text.ecdarText.ETInitialiser;
import dk.itu.ecdar.text.ecdarText.ETVariableID;
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
 * An implementation of the model object '<em><b>ET Variable ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETVariableIDImpl#getInitialiser <em>Initialiser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETVariableIDImpl extends MinimalEObjectImpl.Container implements ETVariableID
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
  protected static final String IO_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIoType()
   * @generated
   * @ordered
   */
  protected String ioType = IO_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getInitialiser() <em>Initialiser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialiser()
   * @generated
   * @ordered
   */
  protected ETInitialiser initialiser;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETVariableIDImpl()
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
    return EcdarTextPackage.Literals.ET_VARIABLE_ID;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_VARIABLE_ID__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIoType()
  {
    return ioType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIoType(String newIoType)
  {
    String oldIoType = ioType;
    ioType = newIoType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_VARIABLE_ID__IO_TYPE, oldIoType, ioType));
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
      dimensions = new EObjectContainmentEList<ETArrayDeclaration>(ETArrayDeclaration.class, this, EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS);
    }
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETInitialiser getInitialiser()
  {
    return initialiser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialiser(ETInitialiser newInitialiser, NotificationChain msgs)
  {
    ETInitialiser oldInitialiser = initialiser;
    initialiser = newInitialiser;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_VARIABLE_ID__INITIALISER, oldInitialiser, newInitialiser);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialiser(ETInitialiser newInitialiser)
  {
    if (newInitialiser != initialiser)
    {
      NotificationChain msgs = null;
      if (initialiser != null)
        msgs = ((InternalEObject)initialiser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_VARIABLE_ID__INITIALISER, null, msgs);
      if (newInitialiser != null)
        msgs = ((InternalEObject)newInitialiser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_VARIABLE_ID__INITIALISER, null, msgs);
      msgs = basicSetInitialiser(newInitialiser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_VARIABLE_ID__INITIALISER, newInitialiser, newInitialiser));
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
      case EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS:
        return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
      case EcdarTextPackage.ET_VARIABLE_ID__INITIALISER:
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
      case EcdarTextPackage.ET_VARIABLE_ID__NAME:
        return getName();
      case EcdarTextPackage.ET_VARIABLE_ID__IO_TYPE:
        return getIoType();
      case EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS:
        return getDimensions();
      case EcdarTextPackage.ET_VARIABLE_ID__INITIALISER:
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
      case EcdarTextPackage.ET_VARIABLE_ID__NAME:
        setName((String)newValue);
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__IO_TYPE:
        setIoType((String)newValue);
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends ETArrayDeclaration>)newValue);
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__INITIALISER:
        setInitialiser((ETInitialiser)newValue);
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
      case EcdarTextPackage.ET_VARIABLE_ID__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__IO_TYPE:
        setIoType(IO_TYPE_EDEFAULT);
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS:
        getDimensions().clear();
        return;
      case EcdarTextPackage.ET_VARIABLE_ID__INITIALISER:
        setInitialiser((ETInitialiser)null);
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
      case EcdarTextPackage.ET_VARIABLE_ID__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcdarTextPackage.ET_VARIABLE_ID__IO_TYPE:
        return IO_TYPE_EDEFAULT == null ? ioType != null : !IO_TYPE_EDEFAULT.equals(ioType);
      case EcdarTextPackage.ET_VARIABLE_ID__DIMENSIONS:
        return dimensions != null && !dimensions.isEmpty();
      case EcdarTextPackage.ET_VARIABLE_ID__INITIALISER:
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
    result.append(", ioType: ");
    result.append(ioType);
    result.append(')');
    return result.toString();
  }

} //ETVariableIDImpl
