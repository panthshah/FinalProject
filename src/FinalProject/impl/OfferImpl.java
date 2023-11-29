/**
 */
package FinalProject.impl;

import FinalProject.Coupon;
import FinalProject.FinalProjectPackage;
import FinalProject.Offer;

import FinalProject.util.FinalProjectValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.OfferImpl#getOfferID <em>Offer ID</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getOfferType <em>Offer Type</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getDiscountPercentage <em>Discount Percentage</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getMaxDeductableAmnt <em>Max Deductable Amnt</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getValidUpto <em>Valid Upto</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getRewardPoints <em>Reward Points</em>}</li>
 *   <li>{@link FinalProject.impl.OfferImpl#getCoupon <em>Coupon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferImpl extends MinimalEObjectImpl.Container implements Offer {
	/**
	 * The default value of the '{@link #getOfferID() <em>Offer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferID()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOfferID() <em>Offer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferID()
	 * @generated
	 * @ordered
	 */
	protected int offerID = OFFER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected static final int PROVIDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected int providerID = PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfferType() <em>Offer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferType()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfferType() <em>Offer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferType()
	 * @generated
	 * @ordered
	 */
	protected String offerType = OFFER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscountPercentage() <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int DISCOUNT_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiscountPercentage() <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected int discountPercentage = DISCOUNT_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDeductableAmnt() <em>Max Deductable Amnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDeductableAmnt()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DEDUCTABLE_AMNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDeductableAmnt() <em>Max Deductable Amnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDeductableAmnt()
	 * @generated
	 * @ordered
	 */
	protected int maxDeductableAmnt = MAX_DEDUCTABLE_AMNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidUpto() <em>Valid Upto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUpto()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_UPTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUpto() <em>Valid Upto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUpto()
	 * @generated
	 * @ordered
	 */
	protected Date validUpto = VALID_UPTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRewardPoints() <em>Reward Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewardPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int REWARD_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRewardPoints() <em>Reward Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewardPoints()
	 * @generated
	 * @ordered
	 */
	protected int rewardPoints = REWARD_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoupon() <em>Coupon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupon()
	 * @generated
	 * @ordered
	 */
	protected Coupon coupon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOfferID() {
		return offerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfferID(int newOfferID) {
		int oldOfferID = offerID;
		offerID = newOfferID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__OFFER_ID, oldOfferID, offerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProviderID() {
		return providerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderID(int newProviderID) {
		int oldProviderID = providerID;
		providerID = newProviderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__PROVIDER_ID, oldProviderID, providerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOfferType() {
		return offerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfferType(String newOfferType) {
		String oldOfferType = offerType;
		offerType = newOfferType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__OFFER_TYPE, oldOfferType, offerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountPercentage(int newDiscountPercentage) {
		int oldDiscountPercentage = discountPercentage;
		discountPercentage = newDiscountPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__DISCOUNT_PERCENTAGE, oldDiscountPercentage, discountPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxDeductableAmnt() {
		return maxDeductableAmnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDeductableAmnt(int newMaxDeductableAmnt) {
		int oldMaxDeductableAmnt = maxDeductableAmnt;
		maxDeductableAmnt = newMaxDeductableAmnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__MAX_DEDUCTABLE_AMNT, oldMaxDeductableAmnt, maxDeductableAmnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidUpto() {
		return validUpto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidUpto(Date newValidUpto) {
		Date oldValidUpto = validUpto;
		validUpto = newValidUpto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__VALID_UPTO, oldValidUpto, validUpto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRewardPoints() {
		return rewardPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRewardPoints(int newRewardPoints) {
		int oldRewardPoints = rewardPoints;
		rewardPoints = newRewardPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__REWARD_POINTS, oldRewardPoints, rewardPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coupon getCoupon() {
		return coupon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoupon(Coupon newCoupon, NotificationChain msgs) {
		Coupon oldCoupon = coupon;
		coupon = newCoupon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__COUPON, oldCoupon, newCoupon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoupon(Coupon newCoupon) {
		if (newCoupon != coupon) {
			NotificationChain msgs = null;
			if (coupon != null)
				msgs = ((InternalEObject)coupon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalProjectPackage.OFFER__COUPON, null, msgs);
			if (newCoupon != null)
				msgs = ((InternalEObject)newCoupon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalProjectPackage.OFFER__COUPON, null, msgs);
			msgs = basicSetCoupon(newCoupon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.OFFER__COUPON, newCoupon, newCoupon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint20(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FinalProjectValidator.DIAGNOSTIC_SOURCE,
						 FinalProjectValidator.OFFER__CONSTRAINT20,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Constraint20", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getOffer(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCouponCode(int value) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalProjectPackage.OFFER__COUPON:
				return basicSetCoupon(null, msgs);
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
			case FinalProjectPackage.OFFER__OFFER_ID:
				return getOfferID();
			case FinalProjectPackage.OFFER__PROVIDER_ID:
				return getProviderID();
			case FinalProjectPackage.OFFER__OFFER_TYPE:
				return getOfferType();
			case FinalProjectPackage.OFFER__DISCOUNT_PERCENTAGE:
				return getDiscountPercentage();
			case FinalProjectPackage.OFFER__MAX_DEDUCTABLE_AMNT:
				return getMaxDeductableAmnt();
			case FinalProjectPackage.OFFER__VALID_UPTO:
				return getValidUpto();
			case FinalProjectPackage.OFFER__REWARD_POINTS:
				return getRewardPoints();
			case FinalProjectPackage.OFFER__COUPON:
				return getCoupon();
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
			case FinalProjectPackage.OFFER__OFFER_ID:
				setOfferID((Integer)newValue);
				return;
			case FinalProjectPackage.OFFER__PROVIDER_ID:
				setProviderID((Integer)newValue);
				return;
			case FinalProjectPackage.OFFER__OFFER_TYPE:
				setOfferType((String)newValue);
				return;
			case FinalProjectPackage.OFFER__DISCOUNT_PERCENTAGE:
				setDiscountPercentage((Integer)newValue);
				return;
			case FinalProjectPackage.OFFER__MAX_DEDUCTABLE_AMNT:
				setMaxDeductableAmnt((Integer)newValue);
				return;
			case FinalProjectPackage.OFFER__VALID_UPTO:
				setValidUpto((Date)newValue);
				return;
			case FinalProjectPackage.OFFER__REWARD_POINTS:
				setRewardPoints((Integer)newValue);
				return;
			case FinalProjectPackage.OFFER__COUPON:
				setCoupon((Coupon)newValue);
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
			case FinalProjectPackage.OFFER__OFFER_ID:
				setOfferID(OFFER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__PROVIDER_ID:
				setProviderID(PROVIDER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__OFFER_TYPE:
				setOfferType(OFFER_TYPE_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__DISCOUNT_PERCENTAGE:
				setDiscountPercentage(DISCOUNT_PERCENTAGE_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__MAX_DEDUCTABLE_AMNT:
				setMaxDeductableAmnt(MAX_DEDUCTABLE_AMNT_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__VALID_UPTO:
				setValidUpto(VALID_UPTO_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__REWARD_POINTS:
				setRewardPoints(REWARD_POINTS_EDEFAULT);
				return;
			case FinalProjectPackage.OFFER__COUPON:
				setCoupon((Coupon)null);
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
			case FinalProjectPackage.OFFER__OFFER_ID:
				return offerID != OFFER_ID_EDEFAULT;
			case FinalProjectPackage.OFFER__PROVIDER_ID:
				return providerID != PROVIDER_ID_EDEFAULT;
			case FinalProjectPackage.OFFER__OFFER_TYPE:
				return OFFER_TYPE_EDEFAULT == null ? offerType != null : !OFFER_TYPE_EDEFAULT.equals(offerType);
			case FinalProjectPackage.OFFER__DISCOUNT_PERCENTAGE:
				return discountPercentage != DISCOUNT_PERCENTAGE_EDEFAULT;
			case FinalProjectPackage.OFFER__MAX_DEDUCTABLE_AMNT:
				return maxDeductableAmnt != MAX_DEDUCTABLE_AMNT_EDEFAULT;
			case FinalProjectPackage.OFFER__VALID_UPTO:
				return VALID_UPTO_EDEFAULT == null ? validUpto != null : !VALID_UPTO_EDEFAULT.equals(validUpto);
			case FinalProjectPackage.OFFER__REWARD_POINTS:
				return rewardPoints != REWARD_POINTS_EDEFAULT;
			case FinalProjectPackage.OFFER__COUPON:
				return coupon != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FinalProjectPackage.OFFER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP:
				return Constraint20((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.OFFER___GET_OFFER__INT:
				getOffer((Integer)arguments.get(0));
				return null;
			case FinalProjectPackage.OFFER___GET_COUPON_CODE__INT:
				getCouponCode((Integer)arguments.get(0));
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
		result.append(" (OfferID: ");
		result.append(offerID);
		result.append(", ProviderID: ");
		result.append(providerID);
		result.append(", OfferType: ");
		result.append(offerType);
		result.append(", DiscountPercentage: ");
		result.append(discountPercentage);
		result.append(", MaxDeductableAmnt: ");
		result.append(maxDeductableAmnt);
		result.append(", ValidUpto: ");
		result.append(validUpto);
		result.append(", RewardPoints: ");
		result.append(rewardPoints);
		result.append(')');
		return result.toString();
	}

} //OfferImpl
