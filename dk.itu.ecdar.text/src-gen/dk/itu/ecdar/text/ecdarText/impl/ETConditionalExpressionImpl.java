/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETConditionalExpression;
import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETConditionalExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETConditionalExpressionImpl extends ETExpressionImpl implements ETConditionalExpression
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected ETExpression condition;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected ETExpression then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected ETExpression else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETConditionalExpressionImpl()
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
    return EcdarTextPackage.Literals.ET_CONDITIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(ETExpression newCondition, NotificationChain msgs)
  {
    ETExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(ETExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(ETExpression newThen, NotificationChain msgs)
  {
    ETExpression oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(ETExpression newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETExpression getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(ETExpression newElse, NotificationChain msgs)
  {
    ETExpression oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(ETExpression newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE, newElse, newElse));
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
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN:
        return basicSetThen(null, msgs);
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE:
        return basicSetElse(null, msgs);
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
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION:
        return getCondition();
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN:
        return getThen();
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE:
        return getElse();
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
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION:
        setCondition((ETExpression)newValue);
        return;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN:
        setThen((ETExpression)newValue);
        return;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE:
        setElse((ETExpression)newValue);
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
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION:
        setCondition((ETExpression)null);
        return;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN:
        setThen((ETExpression)null);
        return;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE:
        setElse((ETExpression)null);
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
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__CONDITION:
        return condition != null;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__THEN:
        return then != null;
      case EcdarTextPackage.ET_CONDITIONAL_EXPRESSION__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ETConditionalExpressionImpl
