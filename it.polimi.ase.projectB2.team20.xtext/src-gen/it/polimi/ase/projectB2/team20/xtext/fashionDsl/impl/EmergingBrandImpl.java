/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.EmergingBrand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emerging Brand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.EmergingBrandImpl#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmergingBrandImpl extends BrandImpl implements EmergingBrand
{
  /**
   * The default value of the '{@link #getCountries() <em>Countries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountries()
   * @generated
   * @ordered
   */
  protected static final String COUNTRIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountries() <em>Countries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountries()
   * @generated
   * @ordered
   */
  protected String countries = COUNTRIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmergingBrandImpl()
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
    return FashionDslPackage.Literals.EMERGING_BRAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCountries()
  {
    return countries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCountries(String newCountries)
  {
    String oldCountries = countries;
    countries = newCountries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FashionDslPackage.EMERGING_BRAND__COUNTRIES, oldCountries, countries));
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
      case FashionDslPackage.EMERGING_BRAND__COUNTRIES:
        return getCountries();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FashionDslPackage.EMERGING_BRAND__COUNTRIES:
        setCountries((String)newValue);
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
      case FashionDslPackage.EMERGING_BRAND__COUNTRIES:
        setCountries(COUNTRIES_EDEFAULT);
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
      case FashionDslPackage.EMERGING_BRAND__COUNTRIES:
        return COUNTRIES_EDEFAULT == null ? countries != null : !COUNTRIES_EDEFAULT.equals(countries);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (countries: ");
    result.append(countries);
    result.append(')');
    return result.toString();
  }

} //EmergingBrandImpl
