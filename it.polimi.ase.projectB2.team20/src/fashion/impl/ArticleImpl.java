/**
 */
package fashion.impl;

import fashion.Article;
import fashion.FashionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fashion.impl.ArticleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fashion.impl.ArticleImpl#getMagazine <em>Magazine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleImpl extends NewsReportImpl implements Article {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMagazine() <em>Magazine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagazine()
	 * @generated
	 * @ordered
	 */
	protected static final String MAGAZINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMagazine() <em>Magazine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagazine()
	 * @generated
	 * @ordered
	 */
	protected String magazine = MAGAZINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FashionPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.ARTICLE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMagazine() {
		return magazine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagazine(String newMagazine) {
		String oldMagazine = magazine;
		magazine = newMagazine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FashionPackage.ARTICLE__MAGAZINE, oldMagazine, magazine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FashionPackage.ARTICLE__TITLE:
				return getTitle();
			case FashionPackage.ARTICLE__MAGAZINE:
				return getMagazine();
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
			case FashionPackage.ARTICLE__TITLE:
				setTitle((String)newValue);
				return;
			case FashionPackage.ARTICLE__MAGAZINE:
				setMagazine((String)newValue);
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
			case FashionPackage.ARTICLE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FashionPackage.ARTICLE__MAGAZINE:
				setMagazine(MAGAZINE_EDEFAULT);
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
			case FashionPackage.ARTICLE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FashionPackage.ARTICLE__MAGAZINE:
				return MAGAZINE_EDEFAULT == null ? magazine != null : !MAGAZINE_EDEFAULT.equals(magazine);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", magazine: ");
		result.append(magazine);
		result.append(')');
		return result.toString();
	}

} //ArticleImpl
