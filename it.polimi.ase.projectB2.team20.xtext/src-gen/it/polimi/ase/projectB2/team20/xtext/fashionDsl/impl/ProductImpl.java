/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Product;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Review;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.ProductImpl#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends FashionElementImpl implements Product
{
  /**
   * The cached value of the '{@link #getReviews() <em>Reviews</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReviews()
   * @generated
   * @ordered
   */
  protected EList<Review> reviews;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductImpl()
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
    return FashionDslPackage.Literals.PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Review> getReviews()
  {
    if (reviews == null)
    {
      reviews = new EObjectResolvingEList<Review>(Review.class, this, FashionDslPackage.PRODUCT__REVIEWS);
    }
    return reviews;
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
      case FashionDslPackage.PRODUCT__REVIEWS:
        return getReviews();
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
      case FashionDslPackage.PRODUCT__REVIEWS:
        getReviews().clear();
        getReviews().addAll((Collection<? extends Review>)newValue);
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
      case FashionDslPackage.PRODUCT__REVIEWS:
        getReviews().clear();
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
      case FashionDslPackage.PRODUCT__REVIEWS:
        return reviews != null && !reviews.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProductImpl
