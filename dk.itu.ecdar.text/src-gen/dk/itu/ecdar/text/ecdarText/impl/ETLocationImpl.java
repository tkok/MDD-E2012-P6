/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETEdge;
import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETLocation;
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
 * An implementation of the model object '<em><b>ET Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl#isUniversal <em>Universal</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETLocationImpl extends MinimalEObjectImpl.Container implements ETLocation
{
  /**
   * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUrgent()
   * @generated
   * @ordered
   */
  protected static final boolean URGENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUrgent()
   * @generated
   * @ordered
   */
  protected boolean urgent = URGENT_EDEFAULT;

  /**
   * The default value of the '{@link #isUniversal() <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUniversal()
   * @generated
   * @ordered
   */
  protected static final boolean UNIVERSAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUniversal() <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUniversal()
   * @generated
   * @ordered
   */
  protected boolean universal = UNIVERSAL_EDEFAULT;

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
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected EList<ETExpression> invariants;

  /**
   * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdges()
   * @generated
   * @ordered
   */
  protected EList<ETEdge> edges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETLocationImpl()
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
    return EcdarTextPackage.Literals.ET_LOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUrgent()
  {
    return urgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrgent(boolean newUrgent)
  {
    boolean oldUrgent = urgent;
    urgent = newUrgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_LOCATION__URGENT, oldUrgent, urgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUniversal()
  {
    return universal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUniversal(boolean newUniversal)
  {
    boolean oldUniversal = universal;
    universal = newUniversal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_LOCATION__UNIVERSAL, oldUniversal, universal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_LOCATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETExpression> getInvariants()
  {
    if (invariants == null)
    {
      invariants = new EObjectContainmentEList<ETExpression>(ETExpression.class, this, EcdarTextPackage.ET_LOCATION__INVARIANTS);
    }
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETEdge> getEdges()
  {
    if (edges == null)
    {
      edges = new EObjectContainmentEList<ETEdge>(ETEdge.class, this, EcdarTextPackage.ET_LOCATION__EDGES);
    }
    return edges;
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
      case EcdarTextPackage.ET_LOCATION__INVARIANTS:
        return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
      case EcdarTextPackage.ET_LOCATION__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_LOCATION__URGENT:
        return isUrgent();
      case EcdarTextPackage.ET_LOCATION__UNIVERSAL:
        return isUniversal();
      case EcdarTextPackage.ET_LOCATION__NAME:
        return getName();
      case EcdarTextPackage.ET_LOCATION__INVARIANTS:
        return getInvariants();
      case EcdarTextPackage.ET_LOCATION__EDGES:
        return getEdges();
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
      case EcdarTextPackage.ET_LOCATION__URGENT:
        setUrgent((Boolean)newValue);
        return;
      case EcdarTextPackage.ET_LOCATION__UNIVERSAL:
        setUniversal((Boolean)newValue);
        return;
      case EcdarTextPackage.ET_LOCATION__NAME:
        setName((String)newValue);
        return;
      case EcdarTextPackage.ET_LOCATION__INVARIANTS:
        getInvariants().clear();
        getInvariants().addAll((Collection<? extends ETExpression>)newValue);
        return;
      case EcdarTextPackage.ET_LOCATION__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends ETEdge>)newValue);
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
      case EcdarTextPackage.ET_LOCATION__URGENT:
        setUrgent(URGENT_EDEFAULT);
        return;
      case EcdarTextPackage.ET_LOCATION__UNIVERSAL:
        setUniversal(UNIVERSAL_EDEFAULT);
        return;
      case EcdarTextPackage.ET_LOCATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EcdarTextPackage.ET_LOCATION__INVARIANTS:
        getInvariants().clear();
        return;
      case EcdarTextPackage.ET_LOCATION__EDGES:
        getEdges().clear();
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
      case EcdarTextPackage.ET_LOCATION__URGENT:
        return urgent != URGENT_EDEFAULT;
      case EcdarTextPackage.ET_LOCATION__UNIVERSAL:
        return universal != UNIVERSAL_EDEFAULT;
      case EcdarTextPackage.ET_LOCATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EcdarTextPackage.ET_LOCATION__INVARIANTS:
        return invariants != null && !invariants.isEmpty();
      case EcdarTextPackage.ET_LOCATION__EDGES:
        return edges != null && !edges.isEmpty();
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
    result.append(" (urgent: ");
    result.append(urgent);
    result.append(", universal: ");
    result.append(universal);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ETLocationImpl
