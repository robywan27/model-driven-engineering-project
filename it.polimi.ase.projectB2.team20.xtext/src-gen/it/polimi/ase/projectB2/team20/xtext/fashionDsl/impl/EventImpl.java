/**
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl;

import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Event;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.EventImpl#getYear <em>Year</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.EventImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link it.polimi.ase.projectB2.team20.xtext.fashionDsl.impl.EventImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends FashionElementImpl implements Event
{
  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final int MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected int month = MONTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return FashionDslPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(int newYear)
  {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FashionDslPackage.EVENT__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(int newMonth)
  {
    int oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FashionDslPackage.EVENT__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectResolvingEList<Role>(Role.class, this, FashionDslPackage.EVENT__ROLES);
    }
    return roles;
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
      case FashionDslPackage.EVENT__YEAR:
        return getYear();
      case FashionDslPackage.EVENT__MONTH:
        return getMonth();
      case FashionDslPackage.EVENT__ROLES:
        return getRoles();
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
      case FashionDslPackage.EVENT__YEAR:
        setYear((Integer)newValue);
        return;
      case FashionDslPackage.EVENT__MONTH:
        setMonth((Integer)newValue);
        return;
      case FashionDslPackage.EVENT__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
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
      case FashionDslPackage.EVENT__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case FashionDslPackage.EVENT__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case FashionDslPackage.EVENT__ROLES:
        getRoles().clear();
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
      case FashionDslPackage.EVENT__YEAR:
        return year != YEAR_EDEFAULT;
      case FashionDslPackage.EVENT__MONTH:
        return month != MONTH_EDEFAULT;
      case FashionDslPackage.EVENT__ROLES:
        return roles != null && !roles.isEmpty();
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
    result.append(" (year: ");
    result.append(year);
    result.append(", month: ");
    result.append(month);
    result.append(')');
    return result.toString();
  }

} //EventImpl
