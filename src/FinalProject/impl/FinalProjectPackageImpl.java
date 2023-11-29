/**
 */
package FinalProject.impl;

import FinalProject.Coupon;
import FinalProject.FinalProjectFactory;
import FinalProject.FinalProjectPackage;
import FinalProject.Offer;
import FinalProject.Pooler;
import FinalProject.Provider;
import FinalProject.Ride;
import FinalProject.Transaction;
import FinalProject.User;
import FinalProject.Validator;
import FinalProject.Vehicle;

import FinalProject.util.FinalProjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalProjectPackageImpl extends EPackageImpl implements FinalProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couponEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FinalProject.FinalProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FinalProjectPackageImpl() {
		super(eNS_URI, FinalProjectFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FinalProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FinalProjectPackage init() {
		if (isInited) return (FinalProjectPackage)EPackage.Registry.INSTANCE.getEPackage(FinalProjectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFinalProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FinalProjectPackageImpl theFinalProjectPackage = registeredFinalProjectPackage instanceof FinalProjectPackageImpl ? (FinalProjectPackageImpl)registeredFinalProjectPackage : new FinalProjectPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theFinalProjectPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theFinalProjectPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFinalProjectPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return FinalProjectValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFinalProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FinalProjectPackage.eNS_URI, theFinalProjectPackage);
		return theFinalProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_UserID() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_MiddleName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_EmailId() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_ContactNumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_AadharCardNumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_DrivingLicenseNumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Address() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_EmergencyContactNumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_RewardPoints() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Transaction() {
		return (EReference)userEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Constraint20__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Constraint21__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Constraint22__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__User() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Updatedetails() {
		return userEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Purchaserewardpoints__int() {
		return userEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__Redeemrewardpoints__int() {
		return userEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__GetUserStats__Map() {
		return userEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_TransactionId() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_UserID() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_RewardPurchased() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_AmountPaid() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_DateTime() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransaction__DisplayTransactionDetails() {
		return transactionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransaction__RedeemPoints() {
		return transactionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoupon() {
		return couponEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoupon_CouponId() {
		return (EAttribute)couponEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoupon_UserID() {
		return (EAttribute)couponEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoupon_OfferId() {
		return (EAttribute)couponEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCoupon__GetCouponId__int() {
		return couponEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_OfferID() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_ProviderID() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_OfferType() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_DiscountPercentage() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_MaxDeductableAmnt() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_ValidUpto() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_RewardPoints() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOffer_Coupon() {
		return (EReference)offerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOffer__Constraint20__DiagnosticChain_Map() {
		return offerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOffer__GetOffer__int() {
		return offerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOffer__GetCouponCode__int() {
		return offerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_ProviderID() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Name() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Email() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_GSTIN() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Address() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvider_Offer() {
		return (EReference)providerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProvider__Constraint20__DiagnosticChain_Map() {
		return providerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProvider__GetOfferDetails() {
		return providerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidator() {
		return validatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsNameValid__boolean() {
		return validatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsEmailValid__boolean() {
		return validatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsPasswordValid__boolean() {
		return validatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsContactNumberValid__boolean() {
		return validatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsAadharCardNumberValid__boolean() {
		return validatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsVehicleTypeValid__boolean() {
		return validatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidator__IsMileageValid__boolean() {
		return validatorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_RegistrationNumber() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_InsuranceNumber() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_OwnerID() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_VehicelType() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_Mileage() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_Ride() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVehicle__Constraint20__DiagnosticChain_Map() {
		return vehicleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVehicle__Vehicle() {
		return vehicleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVehicle__UpdateDetails() {
		return vehicleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRide() {
		return rideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_UserID() {
		return (EAttribute)rideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Date() {
		return (EAttribute)rideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRide_Vehicle() {
		return (EReference)rideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRide__Ride() {
		return rideEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRide__AddPooler() {
		return rideEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRide__CalculateRewardPoints__int() {
		return rideEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRide__DisplayReducedCF__float() {
		return rideEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPooler() {
		return poolerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPooler_StartLocation() {
		return (EAttribute)poolerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPooler_StartTime() {
		return (EAttribute)poolerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPooler_Destination() {
		return (EAttribute)poolerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPooler_DestinationTime() {
		return (EAttribute)poolerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPooler_Ride() {
		return (EReference)poolerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPooler__Pooler() {
		return poolerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPooler__UpdateRewardPoints() {
		return poolerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPooler__TransferRewardPoints() {
		return poolerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalProjectFactory getFinalProjectFactory() {
		return (FinalProjectFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_ID);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__MIDDLE_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__EMAIL_ID);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__CONTACT_NUMBER);
		createEAttribute(userEClass, USER__AADHAR_CARD_NUMBER);
		createEAttribute(userEClass, USER__DRIVING_LICENSE_NUMBER);
		createEAttribute(userEClass, USER__ADDRESS);
		createEAttribute(userEClass, USER__EMERGENCY_CONTACT_NUMBER);
		createEAttribute(userEClass, USER__REWARD_POINTS);
		createEReference(userEClass, USER__TRANSACTION);
		createEOperation(userEClass, USER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___USER);
		createEOperation(userEClass, USER___UPDATEDETAILS);
		createEOperation(userEClass, USER___PURCHASEREWARDPOINTS__INT);
		createEOperation(userEClass, USER___REDEEMREWARDPOINTS__INT);
		createEOperation(userEClass, USER___GET_USER_STATS__MAP);

		transactionEClass = createEClass(TRANSACTION);
		createEAttribute(transactionEClass, TRANSACTION__TRANSACTION_ID);
		createEAttribute(transactionEClass, TRANSACTION__USER_ID);
		createEAttribute(transactionEClass, TRANSACTION__REWARD_PURCHASED);
		createEAttribute(transactionEClass, TRANSACTION__AMOUNT_PAID);
		createEAttribute(transactionEClass, TRANSACTION__DATE_TIME);
		createEOperation(transactionEClass, TRANSACTION___DISPLAY_TRANSACTION_DETAILS);
		createEOperation(transactionEClass, TRANSACTION___REDEEM_POINTS);

		couponEClass = createEClass(COUPON);
		createEAttribute(couponEClass, COUPON__COUPON_ID);
		createEAttribute(couponEClass, COUPON__USER_ID);
		createEAttribute(couponEClass, COUPON__OFFER_ID);
		createEOperation(couponEClass, COUPON___GET_COUPON_ID__INT);

		offerEClass = createEClass(OFFER);
		createEAttribute(offerEClass, OFFER__OFFER_ID);
		createEAttribute(offerEClass, OFFER__PROVIDER_ID);
		createEAttribute(offerEClass, OFFER__OFFER_TYPE);
		createEAttribute(offerEClass, OFFER__DISCOUNT_PERCENTAGE);
		createEAttribute(offerEClass, OFFER__MAX_DEDUCTABLE_AMNT);
		createEAttribute(offerEClass, OFFER__VALID_UPTO);
		createEAttribute(offerEClass, OFFER__REWARD_POINTS);
		createEReference(offerEClass, OFFER__COUPON);
		createEOperation(offerEClass, OFFER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP);
		createEOperation(offerEClass, OFFER___GET_OFFER__INT);
		createEOperation(offerEClass, OFFER___GET_COUPON_CODE__INT);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__PROVIDER_ID);
		createEAttribute(providerEClass, PROVIDER__NAME);
		createEAttribute(providerEClass, PROVIDER__EMAIL);
		createEAttribute(providerEClass, PROVIDER__GSTIN);
		createEAttribute(providerEClass, PROVIDER__ADDRESS);
		createEReference(providerEClass, PROVIDER__OFFER);
		createEOperation(providerEClass, PROVIDER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP);
		createEOperation(providerEClass, PROVIDER___GET_OFFER_DETAILS);

		validatorEClass = createEClass(VALIDATOR);
		createEOperation(validatorEClass, VALIDATOR___IS_NAME_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_EMAIL_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_PASSWORD_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_CONTACT_NUMBER_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_AADHAR_CARD_NUMBER_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_VEHICLE_TYPE_VALID__BOOLEAN);
		createEOperation(validatorEClass, VALIDATOR___IS_MILEAGE_VALID__BOOLEAN);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__REGISTRATION_NUMBER);
		createEAttribute(vehicleEClass, VEHICLE__INSURANCE_NUMBER);
		createEAttribute(vehicleEClass, VEHICLE__OWNER_ID);
		createEAttribute(vehicleEClass, VEHICLE__VEHICEL_TYPE);
		createEAttribute(vehicleEClass, VEHICLE__MILEAGE);
		createEReference(vehicleEClass, VEHICLE__RIDE);
		createEOperation(vehicleEClass, VEHICLE___CONSTRAINT20__DIAGNOSTICCHAIN_MAP);
		createEOperation(vehicleEClass, VEHICLE___VEHICLE);
		createEOperation(vehicleEClass, VEHICLE___UPDATE_DETAILS);

		rideEClass = createEClass(RIDE);
		createEAttribute(rideEClass, RIDE__USER_ID);
		createEAttribute(rideEClass, RIDE__DATE);
		createEReference(rideEClass, RIDE__VEHICLE);
		createEOperation(rideEClass, RIDE___RIDE);
		createEOperation(rideEClass, RIDE___ADD_POOLER);
		createEOperation(rideEClass, RIDE___CALCULATE_REWARD_POINTS__INT);
		createEOperation(rideEClass, RIDE___DISPLAY_REDUCED_CF__FLOAT);

		poolerEClass = createEClass(POOLER);
		createEAttribute(poolerEClass, POOLER__START_LOCATION);
		createEAttribute(poolerEClass, POOLER__START_TIME);
		createEAttribute(poolerEClass, POOLER__DESTINATION);
		createEAttribute(poolerEClass, POOLER__DESTINATION_TIME);
		createEReference(poolerEClass, POOLER__RIDE);
		createEOperation(poolerEClass, POOLER___POOLER);
		createEOperation(poolerEClass, POOLER___UPDATE_REWARD_POINTS);
		createEOperation(poolerEClass, POOLER___TRANSFER_REWARD_POINTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		poolerEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserID(), theTypesPackage.getString(), "UserID", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_FirstName(), theTypesPackage.getString(), "FirstName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_MiddleName(), theTypesPackage.getString(), "MiddleName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_LastName(), theTypesPackage.getString(), "LastName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_EmailId(), theTypesPackage.getString(), "EmailId", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Password(), theTypesPackage.getString(), "Password", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_ContactNumber(), theTypesPackage.getInteger(), "ContactNumber", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_AadharCardNumber(), theTypesPackage.getInteger(), "AadharCardNumber", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_DrivingLicenseNumber(), theTypesPackage.getInteger(), "DrivingLicenseNumber", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Address(), theTypesPackage.getString(), "Address", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_EmergencyContactNumber(), theTypesPackage.getInteger(), "EmergencyContactNumber", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_RewardPoints(), theTypesPackage.getInteger(), "rewardPoints", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Transaction(), this.getTransaction(), null, "transaction", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getUser__Constraint20__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint20", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__Constraint21__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint21", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__Constraint22__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint22", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__User(), null, "user", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUser__Updatedetails(), null, "updatedetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUser__Purchaserewardpoints__int(), null, "purchaserewardpoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUser__Redeemrewardpoints__int(), null, "redeemrewardpoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUser__GetUserStats__Map(), null, "getUserStats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransaction_TransactionId(), theTypesPackage.getString(), "TransactionId", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransaction_UserID(), theTypesPackage.getString(), "UserID", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransaction_RewardPurchased(), theTypesPackage.getInteger(), "RewardPurchased", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransaction_AmountPaid(), theTypesPackage.getInteger(), "AmountPaid", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransaction_DateTime(), ecorePackage.getEDate(), "DateTime", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTransaction__DisplayTransactionDetails(), null, "displayTransactionDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTransaction__RedeemPoints(), null, "redeemPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(couponEClass, Coupon.class, "Coupon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupon_CouponId(), theTypesPackage.getInteger(), "CouponId", null, 1, 1, Coupon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoupon_UserID(), theTypesPackage.getInteger(), "UserID", null, 1, 1, Coupon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoupon_OfferId(), theTypesPackage.getInteger(), "OfferId", null, 1, 1, Coupon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCoupon__GetCouponId__int(), null, "getCouponId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffer_OfferID(), theTypesPackage.getInteger(), "OfferID", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_ProviderID(), theTypesPackage.getInteger(), "ProviderID", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_OfferType(), theTypesPackage.getString(), "OfferType", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_DiscountPercentage(), theTypesPackage.getInteger(), "DiscountPercentage", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_MaxDeductableAmnt(), theTypesPackage.getInteger(), "MaxDeductableAmnt", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_ValidUpto(), ecorePackage.getEDate(), "ValidUpto", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOffer_RewardPoints(), theTypesPackage.getInteger(), "RewardPoints", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOffer_Coupon(), this.getCoupon(), null, "coupon", null, 1, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOffer__Constraint20__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint20", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOffer__GetOffer__int(), null, "getOffer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getOffer__GetCouponCode__int(), null, "getCouponCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_ProviderID(), theTypesPackage.getInteger(), "ProviderID", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProvider_Name(), theTypesPackage.getString(), "Name", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProvider_Email(), theTypesPackage.getString(), "Email", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProvider_GSTIN(), theTypesPackage.getInteger(), "GSTIN", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProvider_Address(), theTypesPackage.getString(), "Address", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvider_Offer(), this.getOffer(), null, "offer", null, 1, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProvider__Constraint20__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint20", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProvider__GetOfferDetails(), null, "getOfferDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getValidator__IsNameValid__boolean(), null, "isNameValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsEmailValid__boolean(), null, "isEmailValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsPasswordValid__boolean(), null, "isPasswordValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsContactNumberValid__boolean(), null, "isContactNumberValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsAadharCardNumberValid__boolean(), null, "isAadharCardNumberValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsVehicleTypeValid__boolean(), null, "isVehicleTypeValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__IsMileageValid__boolean(), null, "isMileageValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_RegistrationNumber(), theTypesPackage.getInteger(), "RegistrationNumber", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVehicle_InsuranceNumber(), theTypesPackage.getInteger(), "InsuranceNumber", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVehicle_OwnerID(), theTypesPackage.getInteger(), "OwnerID", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVehicle_VehicelType(), theTypesPackage.getString(), "VehicelType", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVehicle_Mileage(), theTypesPackage.getInteger(), "Mileage", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVehicle_Ride(), this.getRide(), null, "ride", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVehicle__Constraint20__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint20", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVehicle__Vehicle(), null, "Vehicle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVehicle__UpdateDetails(), null, "UpdateDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rideEClass, Ride.class, "Ride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRide_UserID(), theTypesPackage.getString(), "UserID", null, 1, 1, Ride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRide_Date(), ecorePackage.getEDate(), "Date", null, 1, 1, Ride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRide_Vehicle(), this.getVehicle(), null, "Vehicle", null, 1, 1, Ride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRide__Ride(), null, "ride", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRide__AddPooler(), null, "addPooler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRide__CalculateRewardPoints__int(), null, "calculateRewardPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRide__DisplayReducedCF__float(), null, "displayReducedCF", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "_", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(poolerEClass, Pooler.class, "Pooler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPooler_StartLocation(), ecorePackage.getEDouble(), "startLocation", null, 1, 1, Pooler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPooler_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, Pooler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPooler_Destination(), ecorePackage.getEDouble(), "destination", null, 1, 1, Pooler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPooler_DestinationTime(), ecorePackage.getEDate(), "destinationTime", null, 1, 1, Pooler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPooler_Ride(), this.getRide(), null, "ride", null, 1, -1, Pooler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPooler__Pooler(), null, "pooler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPooler__UpdateRewardPoints(), null, "updateRewardPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPooler__TransferRewardPoints(), null, "transferRewardPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (getUser__User(),
		   source,
		   new String[] {
			   "originalName", "user "
		   });
		addAnnotation
		  (getOffer_ValidUpto(),
		   source,
		   new String[] {
			   "originalName", "ValidUpto "
		   });
	}

} //FinalProjectPackageImpl
