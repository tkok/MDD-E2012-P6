/**
 */
package dk.itu.ecdar.text.ecdarText.impl;

import dk.itu.ecdar.text.ecdarText.ETDeclarations;
import dk.itu.ecdar.text.ecdarText.ETFile;
import dk.itu.ecdar.text.ecdarText.ETImport;
import dk.itu.ecdar.text.ecdarText.ETSpecification;
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
 * An implementation of the model object '<em><b>ET File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFileImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link dk.itu.ecdar.text.ecdarText.impl.ETFileImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETFileImpl extends MinimalEObjectImpl.Container implements ETFile
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ETImport> imports;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected ETDeclarations declarations;

  /**
   * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifications()
   * @generated
   * @ordered
   */
  protected EList<ETSpecification> specifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETFileImpl()
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
    return EcdarTextPackage.Literals.ET_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ETImport>(ETImport.class, this, EcdarTextPackage.ET_FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDeclarations getDeclarations()
  {
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarations(ETDeclarations newDeclarations, NotificationChain msgs)
  {
    ETDeclarations oldDeclarations = declarations;
    declarations = newDeclarations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_FILE__DECLARATIONS, oldDeclarations, newDeclarations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarations(ETDeclarations newDeclarations)
  {
    if (newDeclarations != declarations)
    {
      NotificationChain msgs = null;
      if (declarations != null)
        msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_FILE__DECLARATIONS, null, msgs);
      if (newDeclarations != null)
        msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcdarTextPackage.ET_FILE__DECLARATIONS, null, msgs);
      msgs = basicSetDeclarations(newDeclarations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcdarTextPackage.ET_FILE__DECLARATIONS, newDeclarations, newDeclarations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETSpecification> getSpecifications()
  {
    if (specifications == null)
    {
      specifications = new EObjectContainmentEList<ETSpecification>(ETSpecification.class, this, EcdarTextPackage.ET_FILE__SPECIFICATIONS);
    }
    return specifications;
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
      case EcdarTextPackage.ET_FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EcdarTextPackage.ET_FILE__DECLARATIONS:
        return basicSetDeclarations(null, msgs);
      case EcdarTextPackage.ET_FILE__SPECIFICATIONS:
        return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
      case EcdarTextPackage.ET_FILE__IMPORTS:
        return getImports();
      case EcdarTextPackage.ET_FILE__DECLARATIONS:
        return getDeclarations();
      case EcdarTextPackage.ET_FILE__SPECIFICATIONS:
        return getSpecifications();
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
      case EcdarTextPackage.ET_FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ETImport>)newValue);
        return;
      case EcdarTextPackage.ET_FILE__DECLARATIONS:
        setDeclarations((ETDeclarations)newValue);
        return;
      case EcdarTextPackage.ET_FILE__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends ETSpecification>)newValue);
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
      case EcdarTextPackage.ET_FILE__IMPORTS:
        getImports().clear();
        return;
      case EcdarTextPackage.ET_FILE__DECLARATIONS:
        setDeclarations((ETDeclarations)null);
        return;
      case EcdarTextPackage.ET_FILE__SPECIFICATIONS:
        getSpecifications().clear();
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
      case EcdarTextPackage.ET_FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EcdarTextPackage.ET_FILE__DECLARATIONS:
        return declarations != null;
      case EcdarTextPackage.ET_FILE__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETFileImpl
