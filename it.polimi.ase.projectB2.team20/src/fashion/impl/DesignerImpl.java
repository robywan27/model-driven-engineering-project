/**
 */
package fashion.impl;

import fashion.Brand;
import fashion.Designer;
import fashion.FashionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.DesignerImpl#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignerImpl extends RoleImpl implements Designer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.DESIGNER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FashionPackage.DESIGNER__BRAND, oldBrand, brand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FashionPackage.DESIGNER__BRAND, oldBrand, newBrand);
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
				msgs = ((InternalEObject)brand).eInverseRemove(this, FashionPackage.BRAND__DESIGNERS, Brand.class, msgs);
			if (newBrand != null)
				msgs = ((InternalEObject)newBrand).eInverseAdd(this, FashionPackage.BRAND__DESIGNERS, Brand.class, msgs);
			msgs = basicSetBrand(newBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.DESIGNER__BRAND, newBrand, newBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FashionPackage.DESIGNER__BRAND:
				if (brand != null)
					msgs = ((InternalEObject)brand).eInverseRemove(this, FashionPackage.BRAND__DESIGNERS, Brand.class, msgs);
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
			case FashionPackage.DESIGNER__BRAND:
				return basicSetBrand(null, msgs);
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
			case FashionPackage.DESIGNER__BRAND:
				if (resolve) return getBrand();
				return basicGetBrand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FashionPackage.DESIGNER__BRAND:
				setBrand((Brand)newValue);
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
			case FashionPackage.DESIGNER__BRAND:
				setBrand((Brand)null);
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
			case FashionPackage.DESIGNER__BRAND:
				return brand != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignerImpl
