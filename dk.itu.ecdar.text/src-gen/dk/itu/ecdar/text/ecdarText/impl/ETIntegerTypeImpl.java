/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETIntegerType;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETIntegerTypeImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETIntegerTypeImpl extends ETTypeIdentifierImpl implements ETIntegerType
{
  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected ETExpression min;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected ETExpression max;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETIntegerTypeImpl()
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
    return EcdarTextPackage.Literals.ET_INTEGER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin(ETExpression newMin, NotificationChain msgs)
  {
    ETExpression oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_INTEGER_TYPE__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(ETExpression newMin)
  {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_INTEGER_TYPE__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_INTEGER_TYPE__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_INTEGER_TYPE__MIN, newMin, newMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax(ETExpression newMax, NotificationChain msgs)
  {
    ETExpression oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_INTEGER_TYPE__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(ETExpression newMax)
  {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_INTEGER_TYPE__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_INTEGER_TYPE__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_INTEGER_TYPE__MAX, newMax, newMax));
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
      case EcdarTextPackage.ET_INTEGER_TYPE__MIN:
        return basicSetMin(null, msgs);
      case EcdarTextPackage.ET_INTEGER_TYPE__MAX:
        return basicSetMax(null, msgs);
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
      case EcdarTextPackage.ET_INTEGER_TYPE__MIN:
        return getMin();
      case EcdarTextPackage.ET_INTEGER_TYPE__MAX:
        return getMax();
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
      case EcdarTextPackage.ET_INTEGER_TYPE__MIN:
        setMin((ETExpression)newValue);
        return;
      case EcdarTextPackage.ET_INTEGER_TYPE__MAX:
        setMax((ETExpression)newValue);
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
      case EcdarTextPackage.ET_INTEGER_TYPE__MIN:
        setMin((ETExpression)null);
        return;
      case EcdarTextPackage.ET_INTEGER_TYPE__MAX:
        setMax((ETExpression)null);
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
      case EcdarTextPackage.ET_INTEGER_TYPE__MIN:
        return min != null;
      case EcdarTextPackage.ET_INTEGER_TYPE__MAX:
        return max != null;
    }
    return super.eIsSet(featureID);
  }

} //ETIntegerTypeImpl
