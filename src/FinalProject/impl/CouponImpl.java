/**
 */
package FinalProject.impl;

import FinalProject.Coupon;
import FinalProject.FinalProjectPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.CouponImpl#getCouponId <em>Coupon Id</em>}</li>
 *   <li>{@link FinalProject.impl.CouponImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.impl.CouponImpl#getOfferId <em>Offer Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CouponImpl extends MinimalEObjectImpl.Container implements Coupon {
	/**
	 * The default value of the '{@link #getCouponId() <em>Coupon Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponId()
	 * @generated
	 * @ordered
	 */
	protected static final int COUPON_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCouponId() <em>Coupon Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponId()
	 * @generated
	 * @ordered
	 */
	protected int couponId = COUPON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected int userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfferId() <em>Offer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferId()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOfferId() <em>Offer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferId()
	 * @generated
	 * @ordered
	 */
	protected int offerId = OFFER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouponImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.COUPON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCouponId() {
		return couponId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCouponId(int newCouponId) {
		int oldCouponId = couponId;
		couponId = newCouponId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.COUPON__COUPON_ID, oldCouponId, couponId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(int newUserID) {
		int oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.COUPON__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOfferId() {
		return offerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfferId(int newOfferId) {
		int oldOfferId = offerId;
		offerId = newOfferId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.COUPON__OFFER_ID, oldOfferId, offerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCouponId(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalProjectPackage.COUPON__COUPON_ID:
				return getCouponId();
			case FinalProjectPackage.COUPON__USER_ID:
				return getUserID();
			case FinalProjectPackage.COUPON__OFFER_ID:
				return getOfferId();
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
			case FinalProjectPackage.COUPON__COUPON_ID:
				setCouponId((Integer)newValue);
				return;
			case FinalProjectPackage.COUPON__USER_ID:
				setUserID((Integer)newValue);
				return;
			case FinalProjectPackage.COUPON__OFFER_ID:
				setOfferId((Integer)newValue);
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
			case FinalProjectPackage.COUPON__COUPON_ID:
				setCouponId(COUPON_ID_EDEFAULT);
				return;
			case FinalProjectPackage.COUPON__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.COUPON__OFFER_ID:
				setOfferId(OFFER_ID_EDEFAULT);
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
			case FinalProjectPackage.COUPON__COUPON_ID:
				return couponId != COUPON_ID_EDEFAULT;
			case FinalProjectPackage.COUPON__USER_ID:
				return userID != USER_ID_EDEFAULT;
			case FinalProjectPackage.COUPON__OFFER_ID:
				return offerId != OFFER_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FinalProjectPackage.COUPON___GET_COUPON_ID__INT:
				getCouponId((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CouponId: ");
		result.append(couponId);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", OfferId: ");
		result.append(offerId);
		result.append(')');
		return result.toString();
	}

} //CouponImpl
