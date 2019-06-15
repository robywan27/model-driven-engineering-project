/**
 */
package fashion.impl;

import fashion.AdvertisingCampaign;
import fashion.Brand;
import fashion.Designer;
import fashion.FashionPackage;
import fashion.ProductLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.BrandImpl#getName <em>Name</em>}</li>
 *   <li>{@link fashion.impl.BrandImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link fashion.impl.BrandImpl#getProductLines <em>Product Lines</em>}</li>
 *   <li>{@link fashion.impl.BrandImpl#getDesigners <em>Designers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BrandImpl extends FashionElementImpl implements Brand {
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
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<AdvertisingCampaign> campaigns;

	/**
	 * The cached value of the '{@link #getProductLines() <em>Product Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductLines()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductLine> productLines;

	/**
	 * The cached value of the '{@link #getDesigners() <em>Designers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigners()
	 * @generated
	 * @ordered
	 */
	protected EList<Designer> designers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.BRAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.BRAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvertisingCampaign> getCampaigns() {
		if (campaigns == null) {
			campaigns = new EObjectWithInverseResolvingEList<AdvertisingCampaign>(AdvertisingCampaign.class, this, FashionPackage.BRAND__CAMPAIGNS, FashionPackage.ADVERTISING_CAMPAIGN__BRAND);
		}
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductLine> getProductLines() {
		if (productLines == null) {
			productLines = new EObjectWithInverseResolvingEList<ProductLine>(ProductLine.class, this, FashionPackage.BRAND__PRODUCT_LINES, FashionPackage.PRODUCT_LINE__BRAND);
		}
		return productLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Designer> getDesigners() {
		if (designers == null) {
			designers = new EObjectWithInverseResolvingEList<Designer>(Designer.class, this, FashionPackage.BRAND__DESIGNERS, FashionPackage.DESIGNER__BRAND);
		}
		return designers;
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
			case FashionPackage.BRAND__CAMPAIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCampaigns()).basicAdd(otherEnd, msgs);
			case FashionPackage.BRAND__PRODUCT_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductLines()).basicAdd(otherEnd, msgs);
			case FashionPackage.BRAND__DESIGNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigners()).basicAdd(otherEnd, msgs);
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
			case FashionPackage.BRAND__CAMPAIGNS:
				return ((InternalEList<?>)getCampaigns()).basicRemove(otherEnd, msgs);
			case FashionPackage.BRAND__PRODUCT_LINES:
				return ((InternalEList<?>)getProductLines()).basicRemove(otherEnd, msgs);
			case FashionPackage.BRAND__DESIGNERS:
				return ((InternalEList<?>)getDesigners()).basicRemove(otherEnd, msgs);
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
			case FashionPackage.BRAND__NAME:
				return getName();
			case FashionPackage.BRAND__CAMPAIGNS:
				return getCampaigns();
			case FashionPackage.BRAND__PRODUCT_LINES:
				return getProductLines();
			case FashionPackage.BRAND__DESIGNERS:
				return getDesigners();
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
			case FashionPackage.BRAND__NAME:
				setName((String)newValue);
				return;
			case FashionPackage.BRAND__CAMPAIGNS:
				getCampaigns().clear();
				getCampaigns().addAll((Collection<? extends AdvertisingCampaign>)newValue);
				return;
			case FashionPackage.BRAND__PRODUCT_LINES:
				getProductLines().clear();
				getProductLines().addAll((Collection<? extends ProductLine>)newValue);
				return;
			case FashionPackage.BRAND__DESIGNERS:
				getDesigners().clear();
				getDesigners().addAll((Collection<? extends Designer>)newValue);
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
			case FashionPackage.BRAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FashionPackage.BRAND__CAMPAIGNS:
				getCampaigns().clear();
				return;
			case FashionPackage.BRAND__PRODUCT_LINES:
				getProductLines().clear();
				return;
			case FashionPackage.BRAND__DESIGNERS:
				getDesigners().clear();
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
			case FashionPackage.BRAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FashionPackage.BRAND__CAMPAIGNS:
				return campaigns != null && !campaigns.isEmpty();
			case FashionPackage.BRAND__PRODUCT_LINES:
				return productLines != null && !productLines.isEmpty();
			case FashionPackage.BRAND__DESIGNERS:
				return designers != null && !designers.isEmpty();
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

} //BrandImpl
