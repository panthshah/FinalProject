/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Pooler;
import FinalProject.Ride;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pooler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.PoolerImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link FinalProject.impl.PoolerImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link FinalProject.impl.PoolerImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link FinalProject.impl.PoolerImpl#getDestinationTime <em>Destination Time</em>}</li>
 *   <li>{@link FinalProject.impl.PoolerImpl#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolerImpl extends UserImpl implements Pooler {
	/**
	 * The default value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected static final double START_LOCATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected double startLocation = START_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final double DESTINATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected double destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationTime() <em>Destination Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DESTINATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationTime() <em>Destination Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationTime()
	 * @generated
	 * @ordered
	 */
	protected Date destinationTime = DESTINATION_TIME_EDEFAULT;

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
	protected PoolerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.POOLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartLocation(double newStartLocation) {
		double oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.POOLER__START_LOCATION, oldStartLocation, startLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.POOLER__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(double newDestination) {
		double oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.POOLER__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDestinationTime() {
		return destinationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationTime(Date newDestinationTime) {
		Date oldDestinationTime = destinationTime;
		destinationTime = newDestinationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.POOLER__DESTINATION_TIME, oldDestinationTime, destinationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ride> getRide() {
		if (ride == null) {
			ride = new EObjectContainmentEList<Ride>(Ride.class, this, FinalProjectPackage.POOLER__RIDE);
		}
		return ride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pooler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRewardPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transferRewardPoints() {
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
			case FinalProjectPackage.POOLER__RIDE:
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
			case FinalProjectPackage.POOLER__START_LOCATION:
				return getStartLocation();
			case FinalProjectPackage.POOLER__START_TIME:
				return getStartTime();
			case FinalProjectPackage.POOLER__DESTINATION:
				return getDestination();
			case FinalProjectPackage.POOLER__DESTINATION_TIME:
				return getDestinationTime();
			case FinalProjectPackage.POOLER__RIDE:
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
			case FinalProjectPackage.POOLER__START_LOCATION:
				setStartLocation((Double)newValue);
				return;
			case FinalProjectPackage.POOLER__START_TIME:
				setStartTime((Date)newValue);
				return;
			case FinalProjectPackage.POOLER__DESTINATION:
				setDestination((Double)newValue);
				return;
			case FinalProjectPackage.POOLER__DESTINATION_TIME:
				setDestinationTime((Date)newValue);
				return;
			case FinalProjectPackage.POOLER__RIDE:
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
			case FinalProjectPackage.POOLER__START_LOCATION:
				setStartLocation(START_LOCATION_EDEFAULT);
				return;
			case FinalProjectPackage.POOLER__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case FinalProjectPackage.POOLER__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case FinalProjectPackage.POOLER__DESTINATION_TIME:
				setDestinationTime(DESTINATION_TIME_EDEFAULT);
				return;
			case FinalProjectPackage.POOLER__RIDE:
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
			case FinalProjectPackage.POOLER__START_LOCATION:
				return startLocation != START_LOCATION_EDEFAULT;
			case FinalProjectPackage.POOLER__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case FinalProjectPackage.POOLER__DESTINATION:
				return destination != DESTINATION_EDEFAULT;
			case FinalProjectPackage.POOLER__DESTINATION_TIME:
				return DESTINATION_TIME_EDEFAULT == null ? destinationTime != null : !DESTINATION_TIME_EDEFAULT.equals(destinationTime);
			case FinalProjectPackage.POOLER__RIDE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FinalProjectPackage.POOLER___POOLER:
				pooler();
				return null;
			case FinalProjectPackage.POOLER___UPDATE_REWARD_POINTS:
				updateRewardPoints();
				return null;
			case FinalProjectPackage.POOLER___TRANSFER_REWARD_POINTS:
				transferRewardPoints();
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
		result.append(" (startLocation: ");
		result.append(startLocation);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", destination: ");
		result.append(destination);
		result.append(", destinationTime: ");
		result.append(destinationTime);
		result.append(')');
		return result.toString();
	}

} //PoolerImpl
