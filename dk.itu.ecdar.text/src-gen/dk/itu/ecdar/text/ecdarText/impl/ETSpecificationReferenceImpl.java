/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETSpecification;
import dk.itu.ecdar.text.ecdarText.ETSpecificationReference;
import dk.itu.ecdar.text.ecdarText.EcdarTextPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ET Specification Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETSpecificationReferenceImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETSpecificationReferenceImpl extends ETSpecificationExpressionImpl implements ETSpecificationReference
{
  /**
   * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecification()
   * @generated
   * @ordered
   */
  protected ETSpecification specification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETSpecificationReferenceImpl()
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
    return EcdarTextPackage.Literals.ET_SPECIFICATION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecification getSpecification()
  {
    if (specification != null && specification.eIsProxy())
    {
      InternalEObject oldSpecification = (InternalEObject)specification;
      specification = (ETSpecification)eResolveProxy(oldSpecification);
      if (specification != oldSpecification)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION, oldSpecification, specification));
      }
    }
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETSpecification basicGetSpecification()
  {
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecification(ETSpecification newSpecification)
  {
    ETSpecification oldSpecification = specification;
    specification = newSpecification;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION, oldSpecification, specification));
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
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION:
        if (resolve) return getSpecification();
        return basicGetSpecification();
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
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION:
        setSpecification((ETSpecification)newValue);
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
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION:
        setSpecification((ETSpecification)null);
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
      case EcdarTextPackage.ET_SPECIFICATION_REFERENCE__SPECIFICATION:
        return specification != null;
    }
    return super.eIsSet(featureID);
  }

} //ETSpecificationReferenceImpl
