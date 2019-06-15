/**
 */
package fashion.impl;

import fashion.AdvertisingCampaign;
import fashion.AdvertisingProduct;
import fashion.Brand;
import fashion.FashionPackage;

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
 *   <li>{@link fashion.impl.AdvertisingCampaignImpl#getName <em>Name</em>}</li>
 *   <li>{@link fashion.impl.AdvertisingCampaignImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link fashion.impl.AdvertisingCampaignImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdvertisingCampaignImpl extends FashionElementImpl implements AdvertisingCampaign {
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
	protected AdvertisingCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.ADVERTISING_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.ADVERTISING_CAMPAIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand getBrand() {
		if (brand != null && brand.eIsProxy()) {
			InternalEObject oldBrand = (InternalEObject)brand;
			brand = (Brand)eResolveProxy(oldBrand);
			if (brand != oldBrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FashionPackage.ADVERTISING_CAMPAIGN__BRAND, oldBrand, brand));
			}
		}
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand basicGetBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrand(Brand newBrand, NotificationChain msgs) {
		Brand oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FashionPackage.ADVERTISING_CAMPAIGN__BRAND, oldBrand, newBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(Brand newBrand) {
		if (newBrand != brand) {
			NotificationChain msgs = null;
			if (brand != null)
				msgs = ((InternalEObject)brand).eInverseRemove(this, FashionPackage.BRAND__CAMPAIGNS, Brand.class, msgs);
			if (newBrand != null)
				msgs = ((InternalEObject)newBrand).eInverseAdd(this, FashionPackage.BRAND__CAMPAIGNS, Brand.class, msgs);
			msgs = basicSetBrand(newBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.ADVERTISING_CAMPAIGN__BRAND, newBrand, newBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvertisingProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<AdvertisingProduct>(AdvertisingProduct.class, this, FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				if (brand != null)
					msgs = ((InternalEObject)brand).eInverseRemove(this, FashionPackage.BRAND__CAMPAIGNS, Brand.class, msgs);
				return basicSetBrand((Brand)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				return basicSetBrand(null, msgs);
			case FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__NAME:
				return getName();
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				if (resolve) return getBrand();
				return basicGetBrand();
			case FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__NAME:
				setName((String)newValue);
				return;
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				setBrand((Brand)newValue);
				return;
			case FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				setBrand((Brand)null);
				return;
			case FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FashionPackage.ADVERTISING_CAMPAIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FashionPackage.ADVERTISING_CAMPAIGN__BRAND:
				return brand != null;
			case FashionPackage.ADVERTISING_CAMPAIGN__PRODUCTS:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AdvertisingCampaignImpl
