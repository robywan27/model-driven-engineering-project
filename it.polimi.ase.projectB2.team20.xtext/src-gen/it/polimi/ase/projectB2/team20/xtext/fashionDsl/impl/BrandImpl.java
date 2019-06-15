/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Brand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Designer;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionStyle;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.NewsReport;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.BrandImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.BrandImpl#getReports <em>Reports</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.BrandImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.BrandImpl#getProductlines <em>Productlines</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.BrandImpl#getDesigners <em>Designers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrandImpl extends FashionElementImpl implements Brand
{
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
   * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCampaigns()
   * @generated
   * @ordered
   */
  protected EList<AdvertisingCampaign> campaigns;

  /**
   * The cached value of the '{@link #getProductlines() <em>Productlines</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductlines()
   * @generated
   * @ordered
   */
  protected EList<ProductLine> productlines;

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
  protected BrandImpl()
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
    return FashionDslPackage.Literals.BRAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FashionStyle> getStyles()
  {
    if (styles == null)
    {
      styles = new EObjectResolvingEList<FashionStyle>(FashionStyle.class, this, FashionDslPackage.BRAND__STYLES);
    }
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NewsReport> getReports()
  {
    if (reports == null)
    {
      reports = new EObjectContainmentEList<NewsReport>(NewsReport.class, this, FashionDslPackage.BRAND__REPORTS);
    }
    return reports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdvertisingCampaign> getCampaigns()
  {
    if (campaigns == null)
    {
      campaigns = new EObjectResolvingEList<AdvertisingCampaign>(AdvertisingCampaign.class, this, FashionDslPackage.BRAND__CAMPAIGNS);
    }
    return campaigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductLine> getProductlines()
  {
    if (productlines == null)
    {
      productlines = new EObjectResolvingEList<ProductLine>(ProductLine.class, this, FashionDslPackage.BRAND__PRODUCTLINES);
    }
    return productlines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Designer> getDesigners()
  {
    if (designers == null)
    {
      designers = new EObjectResolvingEList<Designer>(Designer.class, this, FashionDslPackage.BRAND__DESIGNERS);
    }
    return designers;
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
      case FashionDslPackage.BRAND__REPORTS:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FashionDslPackage.BRAND__STYLES:
        return getStyles();
      case FashionDslPackage.BRAND__REPORTS:
        return getReports();
      case FashionDslPackage.BRAND__CAMPAIGNS:
        return getCampaigns();
      case FashionDslPackage.BRAND__PRODUCTLINES:
        return getProductlines();
      case FashionDslPackage.BRAND__DESIGNERS:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FashionDslPackage.BRAND__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends FashionStyle>)newValue);
        return;
      case FashionDslPackage.BRAND__REPORTS:
        getReports().clear();
        getReports().addAll((Collection<? extends NewsReport>)newValue);
        return;
      case FashionDslPackage.BRAND__CAMPAIGNS:
        getCampaigns().clear();
        getCampaigns().addAll((Collection<? extends AdvertisingCampaign>)newValue);
        return;
      case FashionDslPackage.BRAND__PRODUCTLINES:
        getProductlines().clear();
        getProductlines().addAll((Collection<? extends ProductLine>)newValue);
        return;
      case FashionDslPackage.BRAND__DESIGNERS:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FashionDslPackage.BRAND__STYLES:
        getStyles().clear();
        return;
      case FashionDslPackage.BRAND__REPORTS:
        getReports().clear();
        return;
      case FashionDslPackage.BRAND__CAMPAIGNS:
        getCampaigns().clear();
        return;
      case FashionDslPackage.BRAND__PRODUCTLINES:
        getProductlines().clear();
        return;
      case FashionDslPackage.BRAND__DESIGNERS:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FashionDslPackage.BRAND__STYLES:
        return styles != null && !styles.isEmpty();
      case FashionDslPackage.BRAND__REPORTS:
        return reports != null && !reports.isEmpty();
      case FashionDslPackage.BRAND__CAMPAIGNS:
        return campaigns != null && !campaigns.isEmpty();
      case FashionDslPackage.BRAND__PRODUCTLINES:
        return productlines != null && !productlines.isEmpty();
      case FashionDslPackage.BRAND__DESIGNERS:
        return designers != null && !designers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BrandImpl
