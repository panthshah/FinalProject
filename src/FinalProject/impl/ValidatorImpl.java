/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Validator;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValidatorImpl extends MinimalEObjectImpl.Container implements Validator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isNameValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isEmailValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isPasswordValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isContactNumberValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isAadharCardNumberValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isVehicleTypeValid(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isMileageValid(boolean value) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FinalProjectPackage.VALIDATOR___IS_NAME_VALID__BOOLEAN:
				isNameValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_EMAIL_VALID__BOOLEAN:
				isEmailValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_PASSWORD_VALID__BOOLEAN:
				isPasswordValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_CONTACT_NUMBER_VALID__BOOLEAN:
				isContactNumberValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_AADHAR_CARD_NUMBER_VALID__BOOLEAN:
				isAadharCardNumberValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_VEHICLE_TYPE_VALID__BOOLEAN:
				isVehicleTypeValid((Boolean)arguments.get(0));
				return null;
			case FinalProjectPackage.VALIDATOR___IS_MILEAGE_VALID__BOOLEAN:
				isMileageValid((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValidatorImpl
