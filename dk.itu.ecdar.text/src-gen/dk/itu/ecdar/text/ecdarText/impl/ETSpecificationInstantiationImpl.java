/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation;
import dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate;
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
 * An implementation of the model object '<em><b>ET Specification Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationInstantiationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETSpecificationInstantiationImpl extends ETSpecificationExpressionImpl implements ETSpecificationInstantiation
{
  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected ETSpecificationTemplate template;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<ETExpression> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETSpecificationInstantiationImpl()
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
    return EcdarTextPackage.Literals.ET_SPECIFICATION_INSTANTIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationTemplate getTemplate()
  {
    if (template != null && template.eIsProxy())
    {
      InternalEObject oldTemplate = (InternalEObject)template;
      template = (ETSpecificationTemplate)eResolveProxy(oldTemplate);
      if (template != oldTemplate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE, oldTemplate, template));
      }
    }
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecificationTemplate basicGetTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(ETSpecificationTemplate newTemplate)
  {
    ETSpecificationTemplate oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETExpression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<ETExpression>(ETExpression.class, this, EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS);
    }
    return arguments;
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
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE:
        if (resolve) return getTemplate();
        return basicGetTemplate();
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS:
        return getArguments();
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
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE:
        setTemplate((ETSpecificationTemplate)newValue);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends ETExpression>)newValue);
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
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE:
        setTemplate((ETSpecificationTemplate)null);
        return;
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS:
        getArguments().clear();
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
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__TEMPLATE:
        return template != null;
      case EcdarTextPackage.ET_SPECIFICATION_INSTANTIATION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETSpecificationInstantiationImpl
