/**
 */
package fashion.impl;

import fashion.FashionDomain;
import fashion.FashionElement;
import fashion.FashionPackage;
import fashion.FashionStyle;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.FashionDomainImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link fashion.impl.FashionDomainImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FashionDomainImpl extends EObjectImpl implements FashionDomain {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FashionElement> elements;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<FashionStyle> styles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FashionDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.FASHION_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FashionElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FashionElement>(FashionElement.class, this, FashionPackage.FASHION_DOMAIN__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FashionStyle> getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList<FashionStyle>(FashionStyle.class, this, FashionPackage.FASHION_DOMAIN__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FashionPackage.FASHION_DOMAIN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case FashionPackage.FASHION_DOMAIN__STYLES:
				return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
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
			case FashionPackage.FASHION_DOMAIN__ELEMENTS:
				return getElements();
			case FashionPackage.FASHION_DOMAIN__STYLES:
				return getStyles();
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
			case FashionPackage.FASHION_DOMAIN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FashionElement>)newValue);
				return;
			case FashionPackage.FASHION_DOMAIN__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends FashionStyle>)newValue);
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
			case FashionPackage.FASHION_DOMAIN__ELEMENTS:
				getElements().clear();
				return;
			case FashionPackage.FASHION_DOMAIN__STYLES:
				getStyles().clear();
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
			case FashionPackage.FASHION_DOMAIN__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case FashionPackage.FASHION_DOMAIN__STYLES:
				return styles != null && !styles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FashionDomainImpl
