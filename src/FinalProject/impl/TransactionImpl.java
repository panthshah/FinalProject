/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Transaction;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.TransactionImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link FinalProject.impl.TransactionImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.impl.TransactionImpl#getRewardPurchased <em>Reward Purchased</em>}</li>
 *   <li>{@link FinalProject.impl.TransactionImpl#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link FinalProject.impl.TransactionImpl#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected String transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRewardPurchased() <em>Reward Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewardPurchased()
	 * @generated
	 * @ordered
	 */
	protected static final int REWARD_PURCHASED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRewardPurchased() <em>Reward Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewardPurchased()
	 * @generated
	 * @ordered
	 */
	protected int rewardPurchased = REWARD_PURCHASED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_PAID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected int amountPaid = AMOUNT_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(String newTransactionId) {
		String oldTransactionId = transactionId;
		transactionId = newTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.TRANSACTION__TRANSACTION_ID, oldTransactionId, transactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.TRANSACTION__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRewardPurchased() {
		return rewardPurchased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRewardPurchased(int newRewardPurchased) {
		int oldRewardPurchased = rewardPurchased;
		rewardPurchased = newRewardPurchased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.TRANSACTION__REWARD_PURCHASED, oldRewardPurchased, rewardPurchased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmountPaid() {
		return amountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountPaid(int newAmountPaid) {
		int oldAmountPaid = amountPaid;
		amountPaid = newAmountPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.TRANSACTION__AMOUNT_PAID, oldAmountPaid, amountPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.TRANSACTION__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayTransactionDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void redeemPoints() {
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
			case FinalProjectPackage.TRANSACTION__TRANSACTION_ID:
				return getTransactionId();
			case FinalProjectPackage.TRANSACTION__USER_ID:
				return getUserID();
			case FinalProjectPackage.TRANSACTION__REWARD_PURCHASED:
				return getRewardPurchased();
			case FinalProjectPackage.TRANSACTION__AMOUNT_PAID:
				return getAmountPaid();
			case FinalProjectPackage.TRANSACTION__DATE_TIME:
				return getDateTime();
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
			case FinalProjectPackage.TRANSACTION__TRANSACTION_ID:
				setTransactionId((String)newValue);
				return;
			case FinalProjectPackage.TRANSACTION__USER_ID:
				setUserID((String)newValue);
				return;
			case FinalProjectPackage.TRANSACTION__REWARD_PURCHASED:
				setRewardPurchased((Integer)newValue);
				return;
			case FinalProjectPackage.TRANSACTION__AMOUNT_PAID:
				setAmountPaid((Integer)newValue);
				return;
			case FinalProjectPackage.TRANSACTION__DATE_TIME:
				setDateTime((Date)newValue);
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
			case FinalProjectPackage.TRANSACTION__TRANSACTION_ID:
				setTransactionId(TRANSACTION_ID_EDEFAULT);
				return;
			case FinalProjectPackage.TRANSACTION__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.TRANSACTION__REWARD_PURCHASED:
				setRewardPurchased(REWARD_PURCHASED_EDEFAULT);
				return;
			case FinalProjectPackage.TRANSACTION__AMOUNT_PAID:
				setAmountPaid(AMOUNT_PAID_EDEFAULT);
				return;
			case FinalProjectPackage.TRANSACTION__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
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
			case FinalProjectPackage.TRANSACTION__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionId != null : !TRANSACTION_ID_EDEFAULT.equals(transactionId);
			case FinalProjectPackage.TRANSACTION__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case FinalProjectPackage.TRANSACTION__REWARD_PURCHASED:
				return rewardPurchased != REWARD_PURCHASED_EDEFAULT;
			case FinalProjectPackage.TRANSACTION__AMOUNT_PAID:
				return amountPaid != AMOUNT_PAID_EDEFAULT;
			case FinalProjectPackage.TRANSACTION__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
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
			case FinalProjectPackage.TRANSACTION___DISPLAY_TRANSACTION_DETAILS:
				displayTransactionDetails();
				return null;
			case FinalProjectPackage.TRANSACTION___REDEEM_POINTS:
				redeemPoints();
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
		result.append(" (TransactionId: ");
		result.append(transactionId);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", RewardPurchased: ");
		result.append(rewardPurchased);
		result.append(", AmountPaid: ");
		result.append(amountPaid);
		result.append(", DateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
