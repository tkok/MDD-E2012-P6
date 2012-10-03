/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETEdge;
import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETIO;
import dk.itu.ecdar.text.ecdarText.ETLocation;
import dk.itu.ecdar.text.ecdarText.ETSelect;
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
 * An implementation of the model object '<em><b>ET Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#isControllable <em>Controllable</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#getSelects <em>Selects</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#getIo <em>Io</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETEdgeImpl extends MinimalEObjectImpl.Container implements ETEdge
{
  /**
   * The default value of the '{@link #isControllable() <em>Controllable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isControllable()
   * @generated
   * @ordered
   */
  protected static final boolean CONTROLLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isControllable() <em>Controllable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isControllable()
   * @generated
   * @ordered
   */
  protected boolean controllable = CONTROLLABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelects() <em>Selects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelects()
   * @generated
   * @ordered
   */
  protected EList<ETSelect> selects;

  /**
   * The cached value of the '{@link #getIo() <em>Io</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIo()
   * @generated
   * @ordered
   */
  protected ETIO io;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected ETExpression guard;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ETLocation target;

  /**
   * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdates()
   * @generated
   * @ordered
   */
  protected EList<ETExpression> updates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETEdgeImpl()
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
    return EcdarTextPackage.Literals.ET_EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isControllable()
  {
    return controllable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControllable(boolean newControllable)
  {
    boolean oldControllable = controllable;
    controllable = newControllable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__CONTROLLABLE, oldControllable, controllable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETSelect> getSelects()
  {
    if (selects == null)
    {
      selects = new EObjectContainmentEList<ETSelect>(ETSelect.class, this, EcdarTextPackage.ET_EDGE__SELECTS);
    }
    return selects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETIO getIo()
  {
    return io;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIo(ETIO newIo, NotificationChain msgs)
  {
    ETIO oldIo = io;
    io = newIo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__IO, oldIo, newIo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIo(ETIO newIo)
  {
    if (newIo != io)
    {
      NotificationChain msgs = null;
      if (io != null)
        msgs = ((InternalEObject)io).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_EDGE__IO, null, msgs);
      if (newIo != null)
        msgs = ((InternalEObject)newIo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_EDGE__IO, null, msgs);
      msgs = basicSetIo(newIo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__IO, newIo, newIo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(ETExpression newGuard, NotificationChain msgs)
  {
    ETExpression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(ETExpression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_EDGE__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_EDGE__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLocation getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ETLocation)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcdarTextPackage.ET_EDGE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETLocation basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ETLocation newTarget)
  {
    ETLocation oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_EDGE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETExpression> getUpdates()
  {
    if (updates == null)
    {
      updates = new EObjectContainmentEList<ETExpression>(ETExpression.class, this, EcdarTextPackage.ET_EDGE__UPDATES);
    }
    return updates;
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
      case EcdarTextPackage.ET_EDGE__SELECTS:
        return ((InternalEList<?>)getSelects()).basicRemove(otherEnd, msgs);
      case EcdarTextPackage.ET_EDGE__IO:
        return basicSetIo(null, msgs);
      case EcdarTextPackage.ET_EDGE__GUARD:
        return basicSetGuard(null, msgs);
      case EcdarTextPackage.ET_EDGE__UPDATES:
        return ((InternalEList<?>)getUpdates()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_EDGE__CONTROLLABLE:
        return isControllable();
      case EcdarTextPackage.ET_EDGE__SELECTS:
        return getSelects();
      case EcdarTextPackage.ET_EDGE__IO:
        return getIo();
      case EcdarTextPackage.ET_EDGE__GUARD:
        return getGuard();
      case EcdarTextPackage.ET_EDGE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case EcdarTextPackage.ET_EDGE__UPDATES:
        return getUpdates();
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
      case EcdarTextPackage.ET_EDGE__CONTROLLABLE:
        setControllable((Boolean)newValue);
        return;
      case EcdarTextPackage.ET_EDGE__SELECTS:
        getSelects().clear();
        getSelects().addAll((Collection<? extends ETSelect>)newValue);
        return;
      case EcdarTextPackage.ET_EDGE__IO:
        setIo((ETIO)newValue);
        return;
      case EcdarTextPackage.ET_EDGE__GUARD:
        setGuard((ETExpression)newValue);
        return;
      case EcdarTextPackage.ET_EDGE__TARGET:
        setTarget((ETLocation)newValue);
        return;
      case EcdarTextPackage.ET_EDGE__UPDATES:
        getUpdates().clear();
        getUpdates().addAll((Collection<? extends ETExpression>)newValue);
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
      case EcdarTextPackage.ET_EDGE__CONTROLLABLE:
        setControllable(CONTROLLABLE_EDEFAULT);
        return;
      case EcdarTextPackage.ET_EDGE__SELECTS:
        getSelects().clear();
        return;
      case EcdarTextPackage.ET_EDGE__IO:
        setIo((ETIO)null);
        return;
      case EcdarTextPackage.ET_EDGE__GUARD:
        setGuard((ETExpression)null);
        return;
      case EcdarTextPackage.ET_EDGE__TARGET:
        setTarget((ETLocation)null);
        return;
      case EcdarTextPackage.ET_EDGE__UPDATES:
        getUpdates().clear();
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
      case EcdarTextPackage.ET_EDGE__CONTROLLABLE:
        return controllable != CONTROLLABLE_EDEFAULT;
      case EcdarTextPackage.ET_EDGE__SELECTS:
        return selects != null && !selects.isEmpty();
      case EcdarTextPackage.ET_EDGE__IO:
        return io != null;
      case EcdarTextPackage.ET_EDGE__GUARD:
        return guard != null;
      case EcdarTextPackage.ET_EDGE__TARGET:
        return target != null;
      case EcdarTextPackage.ET_EDGE__UPDATES:
        return updates != null && !updates.isEmpty();
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
    result.append(" (controllable: ");
    result.append(controllable);
    result.append(')');
    return result.toString();
  }

} //ETEdgeImpl
