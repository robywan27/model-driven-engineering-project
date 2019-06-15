/**
 */
package fashion.impl;

import fashion.Brand;
import fashion.FashionPackage;
import fashion.SingleBrandEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Brand Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.SingleBrandEventImpl#getDay <em>Day</em>}</li>
 *   <li>{@link fashion.impl.SingleBrandEventImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link fashion.impl.SingleBrandEventImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link fashion.impl.SingleBrandEventImpl#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleBrandEventImpl extends EventImpl implements SingleBrandEvent {
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected int hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

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
	protected SingleBrandEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.SINGLE_BRAND_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay) {
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.SINGLE_BRAND_EVENT__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(int newHour) {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.SINGLE_BRAND_EVENT__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.SINGLE_BRAND_EVENT__MINUTE, oldMinute, minute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FashionPackage.SINGLE_BRAND_EVENT__BRAND, oldBrand, brand));
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
	public void setBrand(Brand newBrand) {
		Brand oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.SINGLE_BRAND_EVENT__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FashionPackage.SINGLE_BRAND_EVENT__DAY:
				return getDay();
			case FashionPackage.SINGLE_BRAND_EVENT__HOUR:
				return getHour();
			case FashionPackage.SINGLE_BRAND_EVENT__MINUTE:
				return getMinute();
			case FashionPackage.SINGLE_BRAND_EVENT__BRAND:
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
			case FashionPackage.SINGLE_BRAND_EVENT__DAY:
				setDay((Integer)newValue);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__HOUR:
				setHour((Integer)newValue);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__MINUTE:
				setMinute((Integer)newValue);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__BRAND:
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
			case FashionPackage.SINGLE_BRAND_EVENT__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case FashionPackage.SINGLE_BRAND_EVENT__BRAND:
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
			case FashionPackage.SINGLE_BRAND_EVENT__DAY:
				return day != DAY_EDEFAULT;
			case FashionPackage.SINGLE_BRAND_EVENT__HOUR:
				return hour != HOUR_EDEFAULT;
			case FashionPackage.SINGLE_BRAND_EVENT__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case FashionPackage.SINGLE_BRAND_EVENT__BRAND:
				return brand != null;
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
		result.append(" (day: ");
		result.append(day);
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //SingleBrandEventImpl
