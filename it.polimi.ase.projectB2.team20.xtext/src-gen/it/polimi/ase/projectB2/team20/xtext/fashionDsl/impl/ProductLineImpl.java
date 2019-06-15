/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Brand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Product;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductLine;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductStyle;

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
 * An implementation of the model object '<em><b>Product Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.ProductLineImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.ProductLineImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.ProductLineImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductLineImpl extends FashionElementImpl implements ProductLine
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
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<ProductStyle> styles;

  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<Product> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductLineImpl()
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
    return FashionDslPackage.Literals.PRODUCT_LINE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FashionDslPackage.PRODUCT_LINE__BRAND, oldBrand, brand));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FashionDslPackage.PRODUCT_LINE__BRAND, oldBrand, brand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductStyle> getStyles()
  {
    if (styles == null)
    {
      styles = new EObjectContainmentEList<ProductStyle>(ProductStyle.class, this, FashionDslPackage.PRODUCT_LINE__STYLES);
    }
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getProducts()
  {
    if (products == null)
    {
      products = new EObjectContainmentEList<Product>(Product.class, this, FashionDslPackage.PRODUCT_LINE__PRODUCTS);
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
      case FashionDslPackage.PRODUCT_LINE__STYLES:
        return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
      case FashionDslPackage.PRODUCT_LINE__PRODUCTS:
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
      case FashionDslPackage.PRODUCT_LINE__BRAND:
        if (resolve) return getBrand();
        return basicGetBrand();
      case FashionDslPackage.PRODUCT_LINE__STYLES:
        return getStyles();
      case FashionDslPackage.PRODUCT_LINE__PRODUCTS:
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
      case FashionDslPackage.PRODUCT_LINE__BRAND:
        setBrand((Brand)newValue);
        return;
      case FashionDslPackage.PRODUCT_LINE__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends ProductStyle>)newValue);
        return;
      case FashionDslPackage.PRODUCT_LINE__PRODUCTS:
        getProducts().clear();
        getProducts().addAll((Collection<? extends Product>)newValue);
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
      case FashionDslPackage.PRODUCT_LINE__BRAND:
        setBrand((Brand)null);
        return;
      case FashionDslPackage.PRODUCT_LINE__STYLES:
        getStyles().clear();
        return;
      case FashionDslPackage.PRODUCT_LINE__PRODUCTS:
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
      case FashionDslPackage.PRODUCT_LINE__BRAND:
        return brand != null;
      case FashionDslPackage.PRODUCT_LINE__STYLES:
        return styles != null && !styles.isEmpty();
      case FashionDslPackage.PRODUCT_LINE__PRODUCTS:
        return products != null && !products.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProductLineImpl