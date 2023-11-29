/**
 */
package FinalProject.impl;

import FinalProject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalProjectFactoryImpl extends EFactoryImpl implements FinalProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinalProjectFactory init() {
		try {
			FinalProjectFactory theFinalProjectFactory = (FinalProjectFactory)EPackage.Registry.INSTANCE.getEFactory(FinalProjectPackage.eNS_URI);
			if (theFinalProjectFactory != null) {
				return theFinalProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinalProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FinalProjectPackage.USER: return createUser();
			case FinalProjectPackage.TRANSACTION: return createTransaction();
			case FinalProjectPackage.COUPON: return createCoupon();
			case FinalProjectPackage.OFFER: return createOffer();
			case FinalProjectPackage.PROVIDER: return createProvider();
			case FinalProjectPackage.VALIDATOR: return createValidator();
			case FinalProjectPackage.VEHICLE: return createVehicle();
			case FinalProjectPackage.RIDE: return createRide();
			case FinalProjectPackage.POOLER: return createPooler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coupon createCoupon() {
		CouponImpl coupon = new CouponImpl();
		return coupon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validator createValidator() {
		ValidatorImpl validator = new ValidatorImpl();
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ride createRide() {
		RideImpl ride = new RideImpl();
		return ride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pooler createPooler() {
		PoolerImpl pooler = new PoolerImpl();
		return pooler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalProjectPackage getFinalProjectPackage() {
		return (FinalProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinalProjectPackage getPackage() {
		return FinalProjectPackage.eINSTANCE;
	}

} //FinalProjectFactoryImpl
