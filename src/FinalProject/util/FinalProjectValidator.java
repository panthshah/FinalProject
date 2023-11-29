/**
 */
package FinalProject.util;

import FinalProject.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see FinalProject.FinalProjectPackage
 * @generated
 */
public class FinalProjectValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FinalProjectValidator INSTANCE = new FinalProjectValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "FinalProject";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint20' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__CONSTRAINT20 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint21' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__CONSTRAINT21 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint22' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__CONSTRAINT22 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint20' of 'Offer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OFFER__CONSTRAINT20 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint20' of 'Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROVIDER__CONSTRAINT20 = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint20' of 'Vehicle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VEHICLE__CONSTRAINT20 = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalProjectValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FinalProjectPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FinalProjectPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case FinalProjectPackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case FinalProjectPackage.COUPON:
				return validateCoupon((Coupon)value, diagnostics, context);
			case FinalProjectPackage.OFFER:
				return validateOffer((Offer)value, diagnostics, context);
			case FinalProjectPackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case FinalProjectPackage.VALIDATOR:
				return validateValidator((Validator)value, diagnostics, context);
			case FinalProjectPackage.VEHICLE:
				return validateVehicle((Vehicle)value, diagnostics, context);
			case FinalProjectPackage.RIDE:
				return validateRide((Ride)value, diagnostics, context);
			case FinalProjectPackage.POOLER:
				return validatePooler((Pooler)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint20(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint21(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint22(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint20 constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_Constraint20(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.Constraint20(diagnostics, context);
	}

	/**
	 * Validates the Constraint21 constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_Constraint21(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.Constraint21(diagnostics, context);
	}

	/**
	 * Validates the Constraint22 constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_Constraint22(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.Constraint22(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoupon(Coupon coupon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coupon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffer(Offer offer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(offer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(offer, diagnostics, context);
		if (result || diagnostics != null) result &= validateOffer_Constraint20(offer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint20 constraint of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffer_Constraint20(Offer offer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return offer.Constraint20(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvider_Constraint20(provider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint20 constraint of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider_Constraint20(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return provider.Constraint20(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidator(Validator validator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicle(Vehicle vehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vehicle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vehicle, diagnostics, context);
		if (result || diagnostics != null) result &= validateVehicle_Constraint20(vehicle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint20 constraint of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicle_Constraint20(Vehicle vehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vehicle.Constraint20(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRide(Ride ride, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ride, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePooler(Pooler pooler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pooler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint20(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint21(pooler, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_Constraint22(pooler, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FinalProjectValidator
