/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Transaction;
import FinalProject.User;

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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getEmailId <em>Email Id</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getContactNumber <em>Contact Number</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getAadharCardNumber <em>Aadhar Card Number</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getDrivingLicenseNumber <em>Driving License Number</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getEmergencyContactNumber <em>Emergency Contact Number</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getRewardPoints <em>Reward Points</em>}</li>
 *   <li>{@link FinalProject.impl.UserImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected String emailId = EMAIL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactNumber() <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContactNumber() <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactNumber()
	 * @generated
	 * @ordered
	 */
	protected int contactNumber = CONTACT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAadharCardNumber() <em>Aadhar Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAadharCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int AADHAR_CARD_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAadharCardNumber() <em>Aadhar Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAadharCardNumber()
	 * @generated
	 * @ordered
	 */
	protected int aadharCardNumber = AADHAR_CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrivingLicenseNumber() <em>Driving License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingLicenseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int DRIVING_LICENSE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrivingLicenseNumber() <em>Driving License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingLicenseNumber()
	 * @generated
	 * @ordered
	 */
	protected int drivingLicenseNumber = DRIVING_LICENSE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmergencyContactNumber() <em>Emergency Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyContactNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EMERGENCY_CONTACT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmergencyContactNumber() <em>Emergency Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyContactNumber()
	 * @generated
	 * @ordered
	 */
	protected int emergencyContactNumber = EMERGENCY_CONTACT_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__MIDDLE_NAME, oldMiddleName, middleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailId() {
		return emailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailId(String newEmailId) {
		String oldEmailId = emailId;
		emailId = newEmailId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__EMAIL_ID, oldEmailId, emailId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContactNumber() {
		return contactNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactNumber(int newContactNumber) {
		int oldContactNumber = contactNumber;
		contactNumber = newContactNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__CONTACT_NUMBER, oldContactNumber, contactNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAadharCardNumber() {
		return aadharCardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAadharCardNumber(int newAadharCardNumber) {
		int oldAadharCardNumber = aadharCardNumber;
		aadharCardNumber = newAadharCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__AADHAR_CARD_NUMBER, oldAadharCardNumber, aadharCardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivingLicenseNumber(int newDrivingLicenseNumber) {
		int oldDrivingLicenseNumber = drivingLicenseNumber;
		drivingLicenseNumber = newDrivingLicenseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__DRIVING_LICENSE_NUMBER, oldDrivingLicenseNumber, drivingLicenseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmergencyContactNumber(int newEmergencyContactNumber) {
		int oldEmergencyContactNumber = emergencyContactNumber;
		emergencyContactNumber = newEmergencyContactNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__EMERGENCY_CONTACT_NUMBER, oldEmergencyContactNumber, emergencyContactNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.USER__REWARD_POINTS, oldRewardPoints, rewardPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transaction> getTransaction() {
		if (transaction == null) {
			transaction = new EObjectContainmentEList<Transaction>(Transaction.class, this, FinalProjectPackage.USER__TRANSACTION);
		}
		return transaction;
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
						 FinalProjectValidator.USER__CONSTRAINT20,
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
	public boolean Constraint21(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 FinalProjectValidator.USER__CONSTRAINT21,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Constraint21", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean Constraint22(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 FinalProjectValidator.USER__CONSTRAINT22,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Constraint22", EObjectValidator.getObjectLabel(this, context) }),
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
	public void user() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatedetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void purchaserewardpoints(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void redeemrewardpoints(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getUserStats(Map value) {
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
			case FinalProjectPackage.USER__TRANSACTION:
				return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
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
			case FinalProjectPackage.USER__USER_ID:
				return getUserID();
			case FinalProjectPackage.USER__FIRST_NAME:
				return getFirstName();
			case FinalProjectPackage.USER__MIDDLE_NAME:
				return getMiddleName();
			case FinalProjectPackage.USER__LAST_NAME:
				return getLastName();
			case FinalProjectPackage.USER__EMAIL_ID:
				return getEmailId();
			case FinalProjectPackage.USER__PASSWORD:
				return getPassword();
			case FinalProjectPackage.USER__CONTACT_NUMBER:
				return getContactNumber();
			case FinalProjectPackage.USER__AADHAR_CARD_NUMBER:
				return getAadharCardNumber();
			case FinalProjectPackage.USER__DRIVING_LICENSE_NUMBER:
				return getDrivingLicenseNumber();
			case FinalProjectPackage.USER__ADDRESS:
				return getAddress();
			case FinalProjectPackage.USER__EMERGENCY_CONTACT_NUMBER:
				return getEmergencyContactNumber();
			case FinalProjectPackage.USER__REWARD_POINTS:
				return getRewardPoints();
			case FinalProjectPackage.USER__TRANSACTION:
				return getTransaction();
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
			case FinalProjectPackage.USER__USER_ID:
				setUserID((String)newValue);
				return;
			case FinalProjectPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case FinalProjectPackage.USER__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case FinalProjectPackage.USER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case FinalProjectPackage.USER__EMAIL_ID:
				setEmailId((String)newValue);
				return;
			case FinalProjectPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case FinalProjectPackage.USER__CONTACT_NUMBER:
				setContactNumber((Integer)newValue);
				return;
			case FinalProjectPackage.USER__AADHAR_CARD_NUMBER:
				setAadharCardNumber((Integer)newValue);
				return;
			case FinalProjectPackage.USER__DRIVING_LICENSE_NUMBER:
				setDrivingLicenseNumber((Integer)newValue);
				return;
			case FinalProjectPackage.USER__ADDRESS:
				setAddress((String)newValue);
				return;
			case FinalProjectPackage.USER__EMERGENCY_CONTACT_NUMBER:
				setEmergencyContactNumber((Integer)newValue);
				return;
			case FinalProjectPackage.USER__REWARD_POINTS:
				setRewardPoints((Integer)newValue);
				return;
			case FinalProjectPackage.USER__TRANSACTION:
				getTransaction().clear();
				getTransaction().addAll((Collection<? extends Transaction>)newValue);
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
			case FinalProjectPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case FinalProjectPackage.USER__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case FinalProjectPackage.USER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case FinalProjectPackage.USER__EMAIL_ID:
				setEmailId(EMAIL_ID_EDEFAULT);
				return;
			case FinalProjectPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case FinalProjectPackage.USER__CONTACT_NUMBER:
				setContactNumber(CONTACT_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.USER__AADHAR_CARD_NUMBER:
				setAadharCardNumber(AADHAR_CARD_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.USER__DRIVING_LICENSE_NUMBER:
				setDrivingLicenseNumber(DRIVING_LICENSE_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.USER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case FinalProjectPackage.USER__EMERGENCY_CONTACT_NUMBER:
				setEmergencyContactNumber(EMERGENCY_CONTACT_NUMBER_EDEFAULT);
				return;
			case FinalProjectPackage.USER__REWARD_POINTS:
				setRewardPoints(REWARD_POINTS_EDEFAULT);
				return;
			case FinalProjectPackage.USER__TRANSACTION:
				getTransaction().clear();
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
			case FinalProjectPackage.USER__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case FinalProjectPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case FinalProjectPackage.USER__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case FinalProjectPackage.USER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case FinalProjectPackage.USER__EMAIL_ID:
				return EMAIL_ID_EDEFAULT == null ? emailId != null : !EMAIL_ID_EDEFAULT.equals(emailId);
			case FinalProjectPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case FinalProjectPackage.USER__CONTACT_NUMBER:
				return contactNumber != CONTACT_NUMBER_EDEFAULT;
			case FinalProjectPackage.USER__AADHAR_CARD_NUMBER:
				return aadharCardNumber != AADHAR_CARD_NUMBER_EDEFAULT;
			case FinalProjectPackage.USER__DRIVING_LICENSE_NUMBER:
				return drivingLicenseNumber != DRIVING_LICENSE_NUMBER_EDEFAULT;
			case FinalProjectPackage.USER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case FinalProjectPackage.USER__EMERGENCY_CONTACT_NUMBER:
				return emergencyContactNumber != EMERGENCY_CONTACT_NUMBER_EDEFAULT;
			case FinalProjectPackage.USER__REWARD_POINTS:
				return rewardPoints != REWARD_POINTS_EDEFAULT;
			case FinalProjectPackage.USER__TRANSACTION:
				return transaction != null && !transaction.isEmpty();
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
			case FinalProjectPackage.USER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP:
				return Constraint20((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.USER___CONSTRAINT21__DIAGNOSTICCHAIN_MAP:
				return Constraint21((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.USER___CONSTRAINT22__DIAGNOSTICCHAIN_MAP:
				return Constraint22((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.USER___USER:
				user();
				return null;
			case FinalProjectPackage.USER___UPDATEDETAILS:
				updatedetails();
				return null;
			case FinalProjectPackage.USER___PURCHASEREWARDPOINTS__INT:
				purchaserewardpoints((Integer)arguments.get(0));
				return null;
			case FinalProjectPackage.USER___REDEEMREWARDPOINTS__INT:
				redeemrewardpoints((Integer)arguments.get(0));
				return null;
			case FinalProjectPackage.USER___GET_USER_STATS__MAP:
				getUserStats((Map)arguments.get(0));
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
		result.append(" (UserID: ");
		result.append(userID);
		result.append(", FirstName: ");
		result.append(firstName);
		result.append(", MiddleName: ");
		result.append(middleName);
		result.append(", LastName: ");
		result.append(lastName);
		result.append(", EmailId: ");
		result.append(emailId);
		result.append(", Password: ");
		result.append(password);
		result.append(", ContactNumber: ");
		result.append(contactNumber);
		result.append(", AadharCardNumber: ");
		result.append(aadharCardNumber);
		result.append(", DrivingLicenseNumber: ");
		result.append(drivingLicenseNumber);
		result.append(", Address: ");
		result.append(address);
		result.append(", EmergencyContactNumber: ");
		result.append(emergencyContactNumber);
		result.append(", rewardPoints: ");
		result.append(rewardPoints);
		result.append(')');
		return result.toString();
	}

} //UserImpl
