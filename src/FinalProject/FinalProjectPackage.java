/**
 */
package FinalProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FinalProject.FinalProjectFactory
 * @model kind="package"
 * @generated
 */
public interface FinalProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FinalProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///FinalProject.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FinalProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinalProjectPackage eINSTANCE = FinalProject.impl.FinalProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link FinalProject.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.UserImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MIDDLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL_ID = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTACT_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Aadhar Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AADHAR_CARD_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Driving License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DRIVING_LICENSE_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Emergency Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMERGENCY_CONTACT_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Reward Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REWARD_POINTS = 11;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TRANSACTION = 12;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Constraint20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Constraint21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Constraint22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER = 3;

	/**
	 * The operation id for the '<em>Updatedetails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___UPDATEDETAILS = 4;

	/**
	 * The operation id for the '<em>Purchaserewardpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___PURCHASEREWARDPOINTS__INT = 5;

	/**
	 * The operation id for the '<em>Redeemrewardpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___REDEEMREWARDPOINTS__INT = 6;

	/**
	 * The operation id for the '<em>Get User Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GET_USER_STATS__MAP = 7;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link FinalProject.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.TransactionImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Reward Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__REWARD_PURCHASED = 2;

	/**
	 * The feature id for the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AMOUNT_PAID = 3;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATE_TIME = 4;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Display Transaction Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION___DISPLAY_TRANSACTION_DETAILS = 0;

	/**
	 * The operation id for the '<em>Redeem Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION___REDEEM_POINTS = 1;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link FinalProject.impl.CouponImpl <em>Coupon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.CouponImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getCoupon()
	 * @generated
	 */
	int COUPON = 2;

	/**
	 * The feature id for the '<em><b>Coupon Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON__COUPON_ID = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Offer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON__OFFER_ID = 2;

	/**
	 * The number of structural features of the '<em>Coupon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Coupon Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON___GET_COUPON_ID__INT = 0;

	/**
	 * The number of operations of the '<em>Coupon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link FinalProject.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.OfferImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 3;

	/**
	 * The feature id for the '<em><b>Offer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFER_ID = 0;

	/**
	 * The feature id for the '<em><b>Provider ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__PROVIDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Offer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__DISCOUNT_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Max Deductable Amnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__MAX_DEDUCTABLE_AMNT = 4;

	/**
	 * The feature id for the '<em><b>Valid Upto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__VALID_UPTO = 5;

	/**
	 * The feature id for the '<em><b>Reward Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__REWARD_POINTS = 6;

	/**
	 * The feature id for the '<em><b>Coupon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__COUPON = 7;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Constraint20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Get Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___GET_OFFER__INT = 1;

	/**
	 * The operation id for the '<em>Get Coupon Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___GET_COUPON_CODE__INT = 2;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link FinalProject.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.ProviderImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Provider ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROVIDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>GSTIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__GSTIN = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Offer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__OFFER = 5;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Constraint20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Get Offer Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___GET_OFFER_DETAILS = 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link FinalProject.impl.ValidatorImpl <em>Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.ValidatorImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getValidator()
	 * @generated
	 */
	int VALIDATOR = 5;

	/**
	 * The number of structural features of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_NAME_VALID__BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Is Email Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_EMAIL_VALID__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Is Password Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_PASSWORD_VALID__BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Is Contact Number Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_CONTACT_NUMBER_VALID__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Is Aadhar Card Number Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_AADHAR_CARD_NUMBER_VALID__BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Is Vehicle Type Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_VEHICLE_TYPE_VALID__BOOLEAN = 5;

	/**
	 * The operation id for the '<em>Is Mileage Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___IS_MILEAGE_VALID__BOOLEAN = 6;

	/**
	 * The number of operations of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link FinalProject.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.VehicleImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 6;

	/**
	 * The feature id for the '<em><b>Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__REGISTRATION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Insurance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__INSURANCE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Owner ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__OWNER_ID = 2;

	/**
	 * The feature id for the '<em><b>Vehicel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MILEAGE = 4;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__RIDE = 5;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Constraint20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Vehicle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE___VEHICLE = 1;

	/**
	 * The operation id for the '<em>Update Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE___UPDATE_DETAILS = 2;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link FinalProject.impl.RideImpl <em>Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.RideImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getRide()
	 * @generated
	 */
	int RIDE = 7;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__VEHICLE = 2;

	/**
	 * The number of structural features of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Ride</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE___RIDE = 0;

	/**
	 * The operation id for the '<em>Add Pooler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE___ADD_POOLER = 1;

	/**
	 * The operation id for the '<em>Calculate Reward Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE___CALCULATE_REWARD_POINTS__INT = 2;

	/**
	 * The operation id for the '<em>Display Reduced CF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE___DISPLAY_REDUCED_CF__FLOAT = 3;

	/**
	 * The number of operations of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link FinalProject.impl.PoolerImpl <em>Pooler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FinalProject.impl.PoolerImpl
	 * @see FinalProject.impl.FinalProjectPackageImpl#getPooler()
	 * @generated
	 */
	int POOLER = 8;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__MIDDLE_NAME = USER__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__EMAIL_ID = USER__EMAIL_ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__CONTACT_NUMBER = USER__CONTACT_NUMBER;

	/**
	 * The feature id for the '<em><b>Aadhar Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__AADHAR_CARD_NUMBER = USER__AADHAR_CARD_NUMBER;

	/**
	 * The feature id for the '<em><b>Driving License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__DRIVING_LICENSE_NUMBER = USER__DRIVING_LICENSE_NUMBER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Emergency Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__EMERGENCY_CONTACT_NUMBER = USER__EMERGENCY_CONTACT_NUMBER;

	/**
	 * The feature id for the '<em><b>Reward Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__REWARD_POINTS = USER__REWARD_POINTS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__TRANSACTION = USER__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__START_LOCATION = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__START_TIME = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__DESTINATION = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__DESTINATION_TIME = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER__RIDE = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pooler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Constraint20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = USER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP = USER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP = USER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___USER = USER___USER;

	/**
	 * The operation id for the '<em>Updatedetails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___UPDATEDETAILS = USER___UPDATEDETAILS;

	/**
	 * The operation id for the '<em>Purchaserewardpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___PURCHASEREWARDPOINTS__INT = USER___PURCHASEREWARDPOINTS__INT;

	/**
	 * The operation id for the '<em>Redeemrewardpoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___REDEEMREWARDPOINTS__INT = USER___REDEEMREWARDPOINTS__INT;

	/**
	 * The operation id for the '<em>Get User Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___GET_USER_STATS__MAP = USER___GET_USER_STATS__MAP;

	/**
	 * The operation id for the '<em>Pooler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___POOLER = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Reward Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___UPDATE_REWARD_POINTS = USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Transfer Reward Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER___TRANSFER_REWARD_POINTS = USER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pooler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLER_OPERATION_COUNT = USER_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link FinalProject.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see FinalProject.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see FinalProject.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see FinalProject.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see FinalProject.User#getMiddleName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see FinalProject.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getEmailId <em>Email Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Id</em>'.
	 * @see FinalProject.User#getEmailId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EmailId();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see FinalProject.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getContactNumber <em>Contact Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Number</em>'.
	 * @see FinalProject.User#getContactNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_ContactNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getAadharCardNumber <em>Aadhar Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aadhar Card Number</em>'.
	 * @see FinalProject.User#getAadharCardNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AadharCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getDrivingLicenseNumber <em>Driving License Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driving License Number</em>'.
	 * @see FinalProject.User#getDrivingLicenseNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_DrivingLicenseNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see FinalProject.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Address();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getEmergencyContactNumber <em>Emergency Contact Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Contact Number</em>'.
	 * @see FinalProject.User#getEmergencyContactNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EmergencyContactNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.User#getRewardPoints <em>Reward Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward Points</em>'.
	 * @see FinalProject.User#getRewardPoints()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_RewardPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link FinalProject.User#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see FinalProject.User#getTransaction()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Transaction();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint20</em>' operation.
	 * @see FinalProject.User#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__Constraint20__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#Constraint21(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint21</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint21</em>' operation.
	 * @see FinalProject.User#Constraint21(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__Constraint21__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#Constraint22(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint22</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint22</em>' operation.
	 * @see FinalProject.User#Constraint22(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__Constraint22__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#user() <em>User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User</em>' operation.
	 * @see FinalProject.User#user()
	 * @generated
	 */
	EOperation getUser__User();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#updatedetails() <em>Updatedetails</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Updatedetails</em>' operation.
	 * @see FinalProject.User#updatedetails()
	 * @generated
	 */
	EOperation getUser__Updatedetails();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#purchaserewardpoints(int) <em>Purchaserewardpoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Purchaserewardpoints</em>' operation.
	 * @see FinalProject.User#purchaserewardpoints(int)
	 * @generated
	 */
	EOperation getUser__Purchaserewardpoints__int();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#redeemrewardpoints(int) <em>Redeemrewardpoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redeemrewardpoints</em>' operation.
	 * @see FinalProject.User#redeemrewardpoints(int)
	 * @generated
	 */
	EOperation getUser__Redeemrewardpoints__int();

	/**
	 * Returns the meta object for the '{@link FinalProject.User#getUserStats(java.util.Map) <em>Get User Stats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get User Stats</em>' operation.
	 * @see FinalProject.User#getUserStats(java.util.Map)
	 * @generated
	 */
	EOperation getUser__GetUserStats__Map();

	/**
	 * Returns the meta object for class '{@link FinalProject.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see FinalProject.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Transaction#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see FinalProject.Transaction#getTransactionId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Transaction#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see FinalProject.Transaction#getUserID()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_UserID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Transaction#getRewardPurchased <em>Reward Purchased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward Purchased</em>'.
	 * @see FinalProject.Transaction#getRewardPurchased()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_RewardPurchased();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Transaction#getAmountPaid <em>Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Paid</em>'.
	 * @see FinalProject.Transaction#getAmountPaid()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_AmountPaid();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Transaction#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see FinalProject.Transaction#getDateTime()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_DateTime();

	/**
	 * Returns the meta object for the '{@link FinalProject.Transaction#displayTransactionDetails() <em>Display Transaction Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Transaction Details</em>' operation.
	 * @see FinalProject.Transaction#displayTransactionDetails()
	 * @generated
	 */
	EOperation getTransaction__DisplayTransactionDetails();

	/**
	 * Returns the meta object for the '{@link FinalProject.Transaction#redeemPoints() <em>Redeem Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redeem Points</em>' operation.
	 * @see FinalProject.Transaction#redeemPoints()
	 * @generated
	 */
	EOperation getTransaction__RedeemPoints();

	/**
	 * Returns the meta object for class '{@link FinalProject.Coupon <em>Coupon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupon</em>'.
	 * @see FinalProject.Coupon
	 * @generated
	 */
	EClass getCoupon();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Coupon#getCouponId <em>Coupon Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coupon Id</em>'.
	 * @see FinalProject.Coupon#getCouponId()
	 * @see #getCoupon()
	 * @generated
	 */
	EAttribute getCoupon_CouponId();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Coupon#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see FinalProject.Coupon#getUserID()
	 * @see #getCoupon()
	 * @generated
	 */
	EAttribute getCoupon_UserID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Coupon#getOfferId <em>Offer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Id</em>'.
	 * @see FinalProject.Coupon#getOfferId()
	 * @see #getCoupon()
	 * @generated
	 */
	EAttribute getCoupon_OfferId();

	/**
	 * Returns the meta object for the '{@link FinalProject.Coupon#getCouponId(int) <em>Get Coupon Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Coupon Id</em>' operation.
	 * @see FinalProject.Coupon#getCouponId(int)
	 * @generated
	 */
	EOperation getCoupon__GetCouponId__int();

	/**
	 * Returns the meta object for class '{@link FinalProject.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see FinalProject.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getOfferID <em>Offer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer ID</em>'.
	 * @see FinalProject.Offer#getOfferID()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_OfferID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getProviderID <em>Provider ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider ID</em>'.
	 * @see FinalProject.Offer#getProviderID()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_ProviderID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getOfferType <em>Offer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Type</em>'.
	 * @see FinalProject.Offer#getOfferType()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_OfferType();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getDiscountPercentage <em>Discount Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Percentage</em>'.
	 * @see FinalProject.Offer#getDiscountPercentage()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_DiscountPercentage();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getMaxDeductableAmnt <em>Max Deductable Amnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Deductable Amnt</em>'.
	 * @see FinalProject.Offer#getMaxDeductableAmnt()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_MaxDeductableAmnt();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getValidUpto <em>Valid Upto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Upto</em>'.
	 * @see FinalProject.Offer#getValidUpto()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_ValidUpto();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Offer#getRewardPoints <em>Reward Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward Points</em>'.
	 * @see FinalProject.Offer#getRewardPoints()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_RewardPoints();

	/**
	 * Returns the meta object for the containment reference '{@link FinalProject.Offer#getCoupon <em>Coupon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coupon</em>'.
	 * @see FinalProject.Offer#getCoupon()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_Coupon();

	/**
	 * Returns the meta object for the '{@link FinalProject.Offer#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint20</em>' operation.
	 * @see FinalProject.Offer#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOffer__Constraint20__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.Offer#getOffer(int) <em>Get Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offer</em>' operation.
	 * @see FinalProject.Offer#getOffer(int)
	 * @generated
	 */
	EOperation getOffer__GetOffer__int();

	/**
	 * Returns the meta object for the '{@link FinalProject.Offer#getCouponCode(int) <em>Get Coupon Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Coupon Code</em>' operation.
	 * @see FinalProject.Offer#getCouponCode(int)
	 * @generated
	 */
	EOperation getOffer__GetCouponCode__int();

	/**
	 * Returns the meta object for class '{@link FinalProject.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see FinalProject.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Provider#getProviderID <em>Provider ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider ID</em>'.
	 * @see FinalProject.Provider#getProviderID()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_ProviderID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FinalProject.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Provider#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see FinalProject.Provider#getEmail()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Email();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Provider#getGSTIN <em>GSTIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GSTIN</em>'.
	 * @see FinalProject.Provider#getGSTIN()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_GSTIN();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Provider#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see FinalProject.Provider#getAddress()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link FinalProject.Provider#getOffer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offer</em>'.
	 * @see FinalProject.Provider#getOffer()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Offer();

	/**
	 * Returns the meta object for the '{@link FinalProject.Provider#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint20</em>' operation.
	 * @see FinalProject.Provider#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProvider__Constraint20__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.Provider#getOfferDetails() <em>Get Offer Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offer Details</em>' operation.
	 * @see FinalProject.Provider#getOfferDetails()
	 * @generated
	 */
	EOperation getProvider__GetOfferDetails();

	/**
	 * Returns the meta object for class '{@link FinalProject.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator</em>'.
	 * @see FinalProject.Validator
	 * @generated
	 */
	EClass getValidator();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isNameValid(boolean) <em>Is Name Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Name Valid</em>' operation.
	 * @see FinalProject.Validator#isNameValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsNameValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isEmailValid(boolean) <em>Is Email Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Email Valid</em>' operation.
	 * @see FinalProject.Validator#isEmailValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsEmailValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isPasswordValid(boolean) <em>Is Password Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Password Valid</em>' operation.
	 * @see FinalProject.Validator#isPasswordValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsPasswordValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isContactNumberValid(boolean) <em>Is Contact Number Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contact Number Valid</em>' operation.
	 * @see FinalProject.Validator#isContactNumberValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsContactNumberValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isAadharCardNumberValid(boolean) <em>Is Aadhar Card Number Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Aadhar Card Number Valid</em>' operation.
	 * @see FinalProject.Validator#isAadharCardNumberValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsAadharCardNumberValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isVehicleTypeValid(boolean) <em>Is Vehicle Type Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Vehicle Type Valid</em>' operation.
	 * @see FinalProject.Validator#isVehicleTypeValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsVehicleTypeValid__boolean();

	/**
	 * Returns the meta object for the '{@link FinalProject.Validator#isMileageValid(boolean) <em>Is Mileage Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mileage Valid</em>' operation.
	 * @see FinalProject.Validator#isMileageValid(boolean)
	 * @generated
	 */
	EOperation getValidator__IsMileageValid__boolean();

	/**
	 * Returns the meta object for class '{@link FinalProject.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see FinalProject.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Vehicle#getRegistrationNumber <em>Registration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Number</em>'.
	 * @see FinalProject.Vehicle#getRegistrationNumber()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_RegistrationNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Vehicle#getInsuranceNumber <em>Insurance Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance Number</em>'.
	 * @see FinalProject.Vehicle#getInsuranceNumber()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_InsuranceNumber();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Vehicle#getOwnerID <em>Owner ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner ID</em>'.
	 * @see FinalProject.Vehicle#getOwnerID()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_OwnerID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Vehicle#getVehicelType <em>Vehicel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicel Type</em>'.
	 * @see FinalProject.Vehicle#getVehicelType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicelType();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Vehicle#getMileage <em>Mileage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mileage</em>'.
	 * @see FinalProject.Vehicle#getMileage()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Mileage();

	/**
	 * Returns the meta object for the containment reference list '{@link FinalProject.Vehicle#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ride</em>'.
	 * @see FinalProject.Vehicle#getRide()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Ride();

	/**
	 * Returns the meta object for the '{@link FinalProject.Vehicle#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint20</em>' operation.
	 * @see FinalProject.Vehicle#Constraint20(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVehicle__Constraint20__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link FinalProject.Vehicle#Vehicle() <em>Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vehicle</em>' operation.
	 * @see FinalProject.Vehicle#Vehicle()
	 * @generated
	 */
	EOperation getVehicle__Vehicle();

	/**
	 * Returns the meta object for the '{@link FinalProject.Vehicle#UpdateDetails() <em>Update Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Details</em>' operation.
	 * @see FinalProject.Vehicle#UpdateDetails()
	 * @generated
	 */
	EOperation getVehicle__UpdateDetails();

	/**
	 * Returns the meta object for class '{@link FinalProject.Ride <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ride</em>'.
	 * @see FinalProject.Ride
	 * @generated
	 */
	EClass getRide();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Ride#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see FinalProject.Ride#getUserID()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_UserID();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Ride#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see FinalProject.Ride#getDate()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Date();

	/**
	 * Returns the meta object for the reference '{@link FinalProject.Ride#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see FinalProject.Ride#getVehicle()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Vehicle();

	/**
	 * Returns the meta object for the '{@link FinalProject.Ride#ride() <em>Ride</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ride</em>' operation.
	 * @see FinalProject.Ride#ride()
	 * @generated
	 */
	EOperation getRide__Ride();

	/**
	 * Returns the meta object for the '{@link FinalProject.Ride#addPooler() <em>Add Pooler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Pooler</em>' operation.
	 * @see FinalProject.Ride#addPooler()
	 * @generated
	 */
	EOperation getRide__AddPooler();

	/**
	 * Returns the meta object for the '{@link FinalProject.Ride#calculateRewardPoints(int) <em>Calculate Reward Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Reward Points</em>' operation.
	 * @see FinalProject.Ride#calculateRewardPoints(int)
	 * @generated
	 */
	EOperation getRide__CalculateRewardPoints__int();

	/**
	 * Returns the meta object for the '{@link FinalProject.Ride#displayReducedCF(float) <em>Display Reduced CF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Reduced CF</em>' operation.
	 * @see FinalProject.Ride#displayReducedCF(float)
	 * @generated
	 */
	EOperation getRide__DisplayReducedCF__float();

	/**
	 * Returns the meta object for class '{@link FinalProject.Pooler <em>Pooler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pooler</em>'.
	 * @see FinalProject.Pooler
	 * @generated
	 */
	EClass getPooler();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Pooler#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Location</em>'.
	 * @see FinalProject.Pooler#getStartLocation()
	 * @see #getPooler()
	 * @generated
	 */
	EAttribute getPooler_StartLocation();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Pooler#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see FinalProject.Pooler#getStartTime()
	 * @see #getPooler()
	 * @generated
	 */
	EAttribute getPooler_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Pooler#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see FinalProject.Pooler#getDestination()
	 * @see #getPooler()
	 * @generated
	 */
	EAttribute getPooler_Destination();

	/**
	 * Returns the meta object for the attribute '{@link FinalProject.Pooler#getDestinationTime <em>Destination Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Time</em>'.
	 * @see FinalProject.Pooler#getDestinationTime()
	 * @see #getPooler()
	 * @generated
	 */
	EAttribute getPooler_DestinationTime();

	/**
	 * Returns the meta object for the containment reference list '{@link FinalProject.Pooler#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ride</em>'.
	 * @see FinalProject.Pooler#getRide()
	 * @see #getPooler()
	 * @generated
	 */
	EReference getPooler_Ride();

	/**
	 * Returns the meta object for the '{@link FinalProject.Pooler#pooler() <em>Pooler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pooler</em>' operation.
	 * @see FinalProject.Pooler#pooler()
	 * @generated
	 */
	EOperation getPooler__Pooler();

	/**
	 * Returns the meta object for the '{@link FinalProject.Pooler#updateRewardPoints() <em>Update Reward Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Reward Points</em>' operation.
	 * @see FinalProject.Pooler#updateRewardPoints()
	 * @generated
	 */
	EOperation getPooler__UpdateRewardPoints();

	/**
	 * Returns the meta object for the '{@link FinalProject.Pooler#transferRewardPoints() <em>Transfer Reward Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer Reward Points</em>' operation.
	 * @see FinalProject.Pooler#transferRewardPoints()
	 * @generated
	 */
	EOperation getPooler__TransferRewardPoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinalProjectFactory getFinalProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FinalProject.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.UserImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__MIDDLE_NAME = eINSTANCE.getUser_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Email Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL_ID = eINSTANCE.getUser_EmailId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Contact Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CONTACT_NUMBER = eINSTANCE.getUser_ContactNumber();

		/**
		 * The meta object literal for the '<em><b>Aadhar Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AADHAR_CARD_NUMBER = eINSTANCE.getUser_AadharCardNumber();

		/**
		 * The meta object literal for the '<em><b>Driving License Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DRIVING_LICENSE_NUMBER = eINSTANCE.getUser_DrivingLicenseNumber();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '<em><b>Emergency Contact Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMERGENCY_CONTACT_NUMBER = eINSTANCE.getUser_EmergencyContactNumber();

		/**
		 * The meta object literal for the '<em><b>Reward Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__REWARD_POINTS = eINSTANCE.getUser_RewardPoints();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TRANSACTION = eINSTANCE.getUser_Transaction();

		/**
		 * The meta object literal for the '<em><b>Constraint20</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__Constraint20__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint21</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__Constraint21__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint22</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__Constraint22__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER = eINSTANCE.getUser__User();

		/**
		 * The meta object literal for the '<em><b>Updatedetails</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___UPDATEDETAILS = eINSTANCE.getUser__Updatedetails();

		/**
		 * The meta object literal for the '<em><b>Purchaserewardpoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___PURCHASEREWARDPOINTS__INT = eINSTANCE.getUser__Purchaserewardpoints__int();

		/**
		 * The meta object literal for the '<em><b>Redeemrewardpoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___REDEEMREWARDPOINTS__INT = eINSTANCE.getUser__Redeemrewardpoints__int();

		/**
		 * The meta object literal for the '<em><b>Get User Stats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___GET_USER_STATS__MAP = eINSTANCE.getUser__GetUserStats__Map();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.TransactionImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TRANSACTION_ID = eINSTANCE.getTransaction_TransactionId();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__USER_ID = eINSTANCE.getTransaction_UserID();

		/**
		 * The meta object literal for the '<em><b>Reward Purchased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__REWARD_PURCHASED = eINSTANCE.getTransaction_RewardPurchased();

		/**
		 * The meta object literal for the '<em><b>Amount Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__AMOUNT_PAID = eINSTANCE.getTransaction_AmountPaid();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATE_TIME = eINSTANCE.getTransaction_DateTime();

		/**
		 * The meta object literal for the '<em><b>Display Transaction Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSACTION___DISPLAY_TRANSACTION_DETAILS = eINSTANCE.getTransaction__DisplayTransactionDetails();

		/**
		 * The meta object literal for the '<em><b>Redeem Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSACTION___REDEEM_POINTS = eINSTANCE.getTransaction__RedeemPoints();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.CouponImpl <em>Coupon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.CouponImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getCoupon()
		 * @generated
		 */
		EClass COUPON = eINSTANCE.getCoupon();

		/**
		 * The meta object literal for the '<em><b>Coupon Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPON__COUPON_ID = eINSTANCE.getCoupon_CouponId();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPON__USER_ID = eINSTANCE.getCoupon_UserID();

		/**
		 * The meta object literal for the '<em><b>Offer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPON__OFFER_ID = eINSTANCE.getCoupon_OfferId();

		/**
		 * The meta object literal for the '<em><b>Get Coupon Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPON___GET_COUPON_ID__INT = eINSTANCE.getCoupon__GetCouponId__int();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.OfferImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Offer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__OFFER_ID = eINSTANCE.getOffer_OfferID();

		/**
		 * The meta object literal for the '<em><b>Provider ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__PROVIDER_ID = eINSTANCE.getOffer_ProviderID();

		/**
		 * The meta object literal for the '<em><b>Offer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__OFFER_TYPE = eINSTANCE.getOffer_OfferType();

		/**
		 * The meta object literal for the '<em><b>Discount Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__DISCOUNT_PERCENTAGE = eINSTANCE.getOffer_DiscountPercentage();

		/**
		 * The meta object literal for the '<em><b>Max Deductable Amnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__MAX_DEDUCTABLE_AMNT = eINSTANCE.getOffer_MaxDeductableAmnt();

		/**
		 * The meta object literal for the '<em><b>Valid Upto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__VALID_UPTO = eINSTANCE.getOffer_ValidUpto();

		/**
		 * The meta object literal for the '<em><b>Reward Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__REWARD_POINTS = eINSTANCE.getOffer_RewardPoints();

		/**
		 * The meta object literal for the '<em><b>Coupon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__COUPON = eINSTANCE.getOffer_Coupon();

		/**
		 * The meta object literal for the '<em><b>Constraint20</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOffer__Constraint20__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___GET_OFFER__INT = eINSTANCE.getOffer__GetOffer__int();

		/**
		 * The meta object literal for the '<em><b>Get Coupon Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___GET_COUPON_CODE__INT = eINSTANCE.getOffer__GetCouponCode__int();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.ProviderImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Provider ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__PROVIDER_ID = eINSTANCE.getProvider_ProviderID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__EMAIL = eINSTANCE.getProvider_Email();

		/**
		 * The meta object literal for the '<em><b>GSTIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__GSTIN = eINSTANCE.getProvider_GSTIN();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ADDRESS = eINSTANCE.getProvider_Address();

		/**
		 * The meta object literal for the '<em><b>Offer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__OFFER = eINSTANCE.getProvider_Offer();

		/**
		 * The meta object literal for the '<em><b>Constraint20</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProvider__Constraint20__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Offer Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDER___GET_OFFER_DETAILS = eINSTANCE.getProvider__GetOfferDetails();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.ValidatorImpl <em>Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.ValidatorImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getValidator()
		 * @generated
		 */
		EClass VALIDATOR = eINSTANCE.getValidator();

		/**
		 * The meta object literal for the '<em><b>Is Name Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_NAME_VALID__BOOLEAN = eINSTANCE.getValidator__IsNameValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Email Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_EMAIL_VALID__BOOLEAN = eINSTANCE.getValidator__IsEmailValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Password Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_PASSWORD_VALID__BOOLEAN = eINSTANCE.getValidator__IsPasswordValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Contact Number Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_CONTACT_NUMBER_VALID__BOOLEAN = eINSTANCE.getValidator__IsContactNumberValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Aadhar Card Number Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_AADHAR_CARD_NUMBER_VALID__BOOLEAN = eINSTANCE.getValidator__IsAadharCardNumberValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Vehicle Type Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_VEHICLE_TYPE_VALID__BOOLEAN = eINSTANCE.getValidator__IsVehicleTypeValid__boolean();

		/**
		 * The meta object literal for the '<em><b>Is Mileage Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___IS_MILEAGE_VALID__BOOLEAN = eINSTANCE.getValidator__IsMileageValid__boolean();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.VehicleImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Registration Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__REGISTRATION_NUMBER = eINSTANCE.getVehicle_RegistrationNumber();

		/**
		 * The meta object literal for the '<em><b>Insurance Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__INSURANCE_NUMBER = eINSTANCE.getVehicle_InsuranceNumber();

		/**
		 * The meta object literal for the '<em><b>Owner ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__OWNER_ID = eINSTANCE.getVehicle_OwnerID();

		/**
		 * The meta object literal for the '<em><b>Vehicel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICEL_TYPE = eINSTANCE.getVehicle_VehicelType();

		/**
		 * The meta object literal for the '<em><b>Mileage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MILEAGE = eINSTANCE.getVehicle_Mileage();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__RIDE = eINSTANCE.getVehicle_Ride();

		/**
		 * The meta object literal for the '<em><b>Constraint20</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VEHICLE___CONSTRAINT20__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVehicle__Constraint20__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VEHICLE___VEHICLE = eINSTANCE.getVehicle__Vehicle();

		/**
		 * The meta object literal for the '<em><b>Update Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VEHICLE___UPDATE_DETAILS = eINSTANCE.getVehicle__UpdateDetails();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.RideImpl <em>Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.RideImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getRide()
		 * @generated
		 */
		EClass RIDE = eINSTANCE.getRide();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__USER_ID = eINSTANCE.getRide_UserID();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__DATE = eINSTANCE.getRide_Date();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__VEHICLE = eINSTANCE.getRide_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDE___RIDE = eINSTANCE.getRide__Ride();

		/**
		 * The meta object literal for the '<em><b>Add Pooler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDE___ADD_POOLER = eINSTANCE.getRide__AddPooler();

		/**
		 * The meta object literal for the '<em><b>Calculate Reward Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDE___CALCULATE_REWARD_POINTS__INT = eINSTANCE.getRide__CalculateRewardPoints__int();

		/**
		 * The meta object literal for the '<em><b>Display Reduced CF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDE___DISPLAY_REDUCED_CF__FLOAT = eINSTANCE.getRide__DisplayReducedCF__float();

		/**
		 * The meta object literal for the '{@link FinalProject.impl.PoolerImpl <em>Pooler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FinalProject.impl.PoolerImpl
		 * @see FinalProject.impl.FinalProjectPackageImpl#getPooler()
		 * @generated
		 */
		EClass POOLER = eINSTANCE.getPooler();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOLER__START_LOCATION = eINSTANCE.getPooler_StartLocation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOLER__START_TIME = eINSTANCE.getPooler_StartTime();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOLER__DESTINATION = eINSTANCE.getPooler_Destination();

		/**
		 * The meta object literal for the '<em><b>Destination Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOLER__DESTINATION_TIME = eINSTANCE.getPooler_DestinationTime();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOLER__RIDE = eINSTANCE.getPooler_Ride();

		/**
		 * The meta object literal for the '<em><b>Pooler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POOLER___POOLER = eINSTANCE.getPooler__Pooler();

		/**
		 * The meta object literal for the '<em><b>Update Reward Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POOLER___UPDATE_REWARD_POINTS = eINSTANCE.getPooler__UpdateRewardPoints();

		/**
		 * The meta object literal for the '<em><b>Transfer Reward Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POOLER___TRANSFER_REWARD_POINTS = eINSTANCE.getPooler__TransferRewardPoints();

	}

} //FinalProjectPackage
