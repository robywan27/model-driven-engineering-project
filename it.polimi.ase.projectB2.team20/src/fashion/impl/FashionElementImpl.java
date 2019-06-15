/**
 */
package fashion.impl;

import fashion.FashionElement;
import fashion.FashionPackage;
import fashion.FashionStyle;
import fashion.NewsReport;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.FashionElementImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link fashion.impl.FashionElementImpl#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FashionElementImpl extends EObjectImpl implements FashionElement {
	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<FashionStyle> styles;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<NewsReport> reports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FashionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.FASHION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FashionStyle> getStyles() {
		if (styles == null) {
			styles = new EObjectWithInverseResolvingEList.ManyInverse<FashionStyle>(FashionStyle.class, this, FashionPackage.FASHION_ELEMENT__STYLES, FashionPackage.FASHION_STYLE__ELEMENTS);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewsReport> getReports() {
		if (reports == null) {
			reports = new EObjectContainmentEList<NewsReport>(NewsReport.class, this, FashionPackage.FASHION_ELEMENT__REPORTS);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FashionPackage.FASHION_ELEMENT__STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStyles()).basicAdd(otherEnd, msgs);
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
			case FashionPackage.FASHION_ELEMENT__STYLES:
				return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
			case FashionPackage.FASHION_ELEMENT__REPORTS:
				return ((InternalEList<?>)getReports()).basicRemove(otherEnd, msgs);
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
			case FashionPackage.FASHION_ELEMENT__STYLES:
				return getStyles();
			case FashionPackage.FASHION_ELEMENT__REPORTS:
				return getReports();
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
			case FashionPackage.FASHION_ELEMENT__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends FashionStyle>)newValue);
				return;
			case FashionPackage.FASHION_ELEMENT__REPORTS:
				getReports().clear();
				getReports().addAll((Collection<? extends NewsReport>)newValue);
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
			case FashionPackage.FASHION_ELEMENT__STYLES:
				getStyles().clear();
				return;
			case FashionPackage.FASHION_ELEMENT__REPORTS:
				getReports().clear();
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
			case FashionPackage.FASHION_ELEMENT__STYLES:
				return styles != null && !styles.isEmpty();
			case FashionPackage.FASHION_ELEMENT__REPORTS:
				return reports != null && !reports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FashionElementImpl
