/**
 */
package FinalProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FinalProject.FinalProjectPackage
 * @generated
 */
public interface FinalProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinalProjectFactory eINSTANCE = FinalProject.impl.FinalProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction</em>'.
	 * @generated
	 */
	Transaction createTransaction();

	/**
	 * Returns a new object of class '<em>Coupon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupon</em>'.
	 * @generated
	 */
	Coupon createCoupon();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validator</em>'.
	 * @generated
	 */
	Validator createValidator();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns a new object of class '<em>Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ride</em>'.
	 * @generated
	 */
	Ride createRide();

	/**
	 * Returns a new object of class '<em>Pooler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pooler</em>'.
	 * @generated
	 */
	Pooler createPooler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FinalProjectPackage getFinalProjectPackage();

} //FinalProjectFactory
