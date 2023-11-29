/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Ride;
import FinalProject.Vehicle;

import FinalProject.util.FinalProjectValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.VehicleImpl#getRegistrationNumber <em>Registration Number</em>}</li>
 *   <li>{@link FinalProject.impl.VehicleImpl#getInsuranceNumber <em>Insurance Number</em>}</li>
 *   <li>{@link FinalProject.impl.VehicleImpl#getOwnerID <em>Owner ID</em>}</li>
 *   <li>{@link FinalProject.impl.VehicleImpl#getVehicelType <em>Vehicel Type</em>}</li>
 *   <li>{@link FinalProject.impl.VehicleImpl#getMileage <em>Mileage</em>}</li>
 *   <li>{@link FinalProject.impl.VehicleImpl#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getRegistrationNumber() <em>Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRATION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistrationNumber() <em>Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationNumber()
	 * @generated
	 * @ordered
	 */
	protected int registrationNumber = REGISTRATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsuranceNumber() <em>Insurance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int INSURANCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsuranceNumber() <em>Insurance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceNumber()
	 * @generated
	 * @ordered
	 */
	protected int insuranceNumber = INSURANCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnerID() <em>Owner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerID()
	 * @generated
	 * @ordered
	 */
	protected static final int OWNER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOwnerID() <em>Owner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerID()
	 * @generated
	 * @ordered
	 */
	protected int ownerID = OWNER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicelType() <em>Vehicel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicelType()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicelType() <em>Vehicel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicelType()
	 * @generated
	 * @ordered
	 */
	protected String vehicelType = VEHICEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMileage() <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileage()
	 * @generated
	 * @ordered
	 */
	protected static final int MILEAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMileage() <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileage()
	 * @generated
	 * @ordered
	 */
	protected int mileage = MILEAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRide() <em>Ride</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRide()
	 * @generated
	 * @ordered
	 */
	protected EList<Ride> ride;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrationNumber(int newRegistrationNumber) {
		int oldRegistrationNumber = registrationNumber;
		registrationNumber = newRegistrationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.VEHICLE__REGISTRATION_NUMBER, oldRegistrationNumber, registrationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInsuranceNumber() {
		return insuranceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuranceNumber(int newInsuranceNumber) {
		int oldInsuranceNumber = insuranceNumber;
		insuranceNumber = newInsuranceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.VEHICLE__INSURANCE_NUMBER, oldInsuranceNumber, insuranceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOwnerID() {
		return ownerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerID(int newOwnerID) {
		int oldOwnerID = ownerID;
		ownerID = newOwnerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.VEHICLE__OWNER_ID, oldOwnerID, ownerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVehicelType() {
		return vehicelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicelType(String newVehicelType) {
		String oldVehicelType = vehicelType;
		vehicelType = newVehicelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.VEHICLE__VEHICEL_TYPE, oldVehicelType, vehicelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMileage() {
		return mileage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMileage(int newMileage) {
		int oldMileage = mileage;
		mileage = newMileage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.VEHICLE__MILEAGE, oldMileage, mileage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ride> getRide() {
		if (ride == null) {
			ride = new EObjectContainmentEList<Ride>(Ride.class, this, FinalProjectPackage.VEHICLE__RIDE);
		}
		return ride;
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
						 FinalProjectValidator.VEHICLE__CONSTRAINT20,
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
	public void Vehicle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateDetails() {
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
			case FinalProjectPackage.VEHICLE__RIDE:
				return ((InternalEList<?>)getRide()).basicRemove(otherEnd, msgs);
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
			case FinalProjectPackage.VEHICLE__REGISTRATION_NUMBER:
				return getRegistrationNumber();
			case FinalProjectPackage.VEHICLE__INSURANCE_NUMBER:
				return getInsuranceNumber();
			case FinalProjectPackage.VEHICLE__OWNER_ID:
				return getOwnerID();
			case FinalProjectPackage.VEHICLE__VEHICEL_TYPE:
				return getVehicelType();
			case FinalProjectPackage.VEHICLE__MILEAGE:
				return getMileage();
			case FinalProjectPackage.VEHICLE__RIDE:
				return getRide();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalProjectPackage.VEHICLE__REGISTRATION_NUMBER:
				setRegistrationNumber((Integer)newValue);
				return;
			case FinalProjectPackage.VEHICLE__INSURANCE_NUMBER:
				setInsuranceNumber((Integer)newValue);
				return;
			case FinalProjectPackage.VEHICLE__OWNER_ID:
				setOwnerID((Integer)newValue);
				return;
			case FinalProjectPackage.VEHICLE__VEHICEL_TYPE:
				setVehicelType((String)newValue);
				return;
			case FinalProjectPackage.VEHICLE__MILEAGE:
				setMileage((Integer)newValue);
				return;
			case FinalProjectPackage.VEHICLE__RIDE:
				getRide().clear();
				getRide().addAll((Collection<? extends Ride>)newValue);
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
			case FinalProjectPackage.VEHICLE__REGISTRATION_NUMBER:
				setRegistrationNumber(REGISTRATION_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.VEHICLE__INSURANCE_NUMBER:
				setInsuranceNumber(INSURANCE_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.VEHICLE__OWNER_ID:
				setOwnerID(OWNER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.VEHICLE__VEHICEL_TYPE:
				setVehicelType(VEHICEL_TYPE_EDEFAULT);
				return;
			case FinalProjectPackage.VEHICLE__MILEAGE:
				setMileage(MILEAGE_EDEFAULT);
				return;
			case FinalProjectPackage.VEHICLE__RIDE:
				getRide().clear();
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
			case FinalProjectPackage.VEHICLE__REGISTRATION_NUMBER:
				return registrationNumber != REGISTRATION_NUMBER_EDEFAULT;
			case FinalProjectPackage.VEHICLE__INSURANCE_NUMBER:
				return insuranceNumber != INSURANCE_NUMBER_EDEFAULT;
			case FinalProjectPackage.VEHICLE__OWNER_ID:
				return ownerID != OWNER_ID_EDEFAULT;
			case FinalProjectPackage.VEHICLE__VEHICEL_TYPE:
				return VEHICEL_TYPE_EDEFAULT == null ? vehicelType != null : !VEHICEL_TYPE_EDEFAULT.equals(vehicelType);
			case FinalProjectPackage.VEHICLE__MILEAGE:
				return mileage != MILEAGE_EDEFAULT;
			case FinalProjectPackage.VEHICLE__RIDE:
				return ride != null && !ride.isEmpty();
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
			case FinalProjectPackage.VEHICLE___CONSTRAINT20__DIAGNOSTICCHAIN_MAP:
				return Constraint20((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.VEHICLE___VEHICLE:
				Vehicle();
				return null;
			case FinalProjectPackage.VEHICLE___UPDATE_DETAILS:
				UpdateDetails();
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
		result.append(" (RegistrationNumber: ");
		result.append(registrationNumber);
		result.append(", InsuranceNumber: ");
		result.append(insuranceNumber);
		result.append(", OwnerID: ");
		result.append(ownerID);
		result.append(", VehicelType: ");
		result.append(vehicelType);
		result.append(", Mileage: ");
		result.append(mileage);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
