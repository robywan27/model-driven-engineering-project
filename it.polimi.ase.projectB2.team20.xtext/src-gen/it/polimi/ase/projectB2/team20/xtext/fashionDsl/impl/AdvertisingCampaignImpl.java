/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingProduct;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Brand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;

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
 * An implementation of the model object '<em><b>Advertising Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.AdvertisingCampaignImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.AdvertisingCampaignImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdvertisingCampaignImpl extends FashionElementImpl implements AdvertisingCampaign
{
  /**
   * The cached value of the '{@link #getBrand() <em>Brand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrand()
   * @generated
   * @ordered
   */
  protected Brand brand;

  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<AdvertisingProduct> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdvertisingCampaignImpl()
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
    return FashionDslPackage.Literals.ADVERTISING_CAMPAIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Brand getBrand()
  {
    if (brand != null && brand.eIsProxy())
    {
      InternalEObject oldBrand = (InternalEObject)brand;
      brand = (Brand)eResolveProxy(oldBrand);
      if (brand != oldBrand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND, oldBrand, brand));
      }
    }
    return brand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Brand basicGetBrand()
  {
    return brand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrand(Brand newBrand)
  {
    Brand oldBrand = brand;
    brand = newBrand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND, oldBrand, brand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdvertisingProduct> getProducts()
  {
    if (products == null)
    {
      products = new EObjectContainmentEList<AdvertisingProduct>(AdvertisingProduct.class, this, FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS);
    }
    return products;
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
      case FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
        return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
      case FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND:
        if (resolve) return getBrand();
        return basicGetBrand();
      case FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
        return getProducts();
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
      case FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND:
        setBrand((Brand)newValue);
        return;
      case FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
        getProducts().clear();
        getProducts().addAll((Collection<? extends AdvertisingProduct>)newValue);
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
      case FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND:
        setBrand((Brand)null);
        return;
      case FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
        getProducts().clear();
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
      case FashionDslPackage.ADVERTISING_CAMPAIGN__BRAND:
        return brand != null;
      case FashionDslPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
        return products != null && !products.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AdvertisingCampaignImpl
