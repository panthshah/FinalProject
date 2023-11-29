/**
 */
package FinalProject;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link FinalProject.User#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link FinalProject.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link FinalProject.User#getEmailId <em>Email Id</em>}</li>
 *   <li>{@link FinalProject.User#getPassword <em>Password</em>}</li>
 *   <li>{@link FinalProject.User#getContactNumber <em>Contact Number</em>}</li>
 *   <li>{@link FinalProject.User#getAadharCardNumber <em>Aadhar Card Number</em>}</li>
 *   <li>{@link FinalProject.User#getDrivingLicenseNumber <em>Driving License Number</em>}</li>
 *   <li>{@link FinalProject.User#getAddress <em>Address</em>}</li>
 *   <li>{@link FinalProject.User#getEmergencyContactNumber <em>Emergency Contact Number</em>}</li>
 *   <li>{@link FinalProject.User#getRewardPoints <em>Reward Points</em>}</li>
 *   <li>{@link FinalProject.User#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see FinalProject.FinalProjectPackage#getUser_UserID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link FinalProject.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see FinalProject.FinalProjectPackage#getUser_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link FinalProject.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see FinalProject.FinalProjectPackage#getUser_MiddleName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link FinalProject.User#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see FinalProject.FinalProjectPackage#getUser_LastName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link FinalProject.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Id</em>' attribute.
	 * @see #setEmailId(String)
	 * @see FinalProject.FinalProjectPackage#getUser_EmailId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmailId();

	/**
	 * Sets the value of the '{@link FinalProject.User#getEmailId <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Id</em>' attribute.
	 * @see #getEmailId()
	 * @generated
	 */
	void setEmailId(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see FinalProject.FinalProjectPackage#getUser_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link FinalProject.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Number</em>' attribute.
	 * @see #setContactNumber(int)
	 * @see FinalProject.FinalProjectPackage#getUser_ContactNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getContactNumber();

	/**
	 * Sets the value of the '{@link FinalProject.User#getContactNumber <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Number</em>' attribute.
	 * @see #getContactNumber()
	 * @generated
	 */
	void setContactNumber(int value);

	/**
	 * Returns the value of the '<em><b>Aadhar Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aadhar Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aadhar Card Number</em>' attribute.
	 * @see #setAadharCardNumber(int)
	 * @see FinalProject.FinalProjectPackage#getUser_AadharCardNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAadharCardNumber();

	/**
	 * Sets the value of the '{@link FinalProject.User#getAadharCardNumber <em>Aadhar Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aadhar Card Number</em>' attribute.
	 * @see #getAadharCardNumber()
	 * @generated
	 */
	void setAadharCardNumber(int value);

	/**
	 * Returns the value of the '<em><b>Driving License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driving License Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving License Number</em>' attribute.
	 * @see #setDrivingLicenseNumber(int)
	 * @see FinalProject.FinalProjectPackage#getUser_DrivingLicenseNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDrivingLicenseNumber();

	/**
	 * Sets the value of the '{@link FinalProject.User#getDrivingLicenseNumber <em>Driving License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driving License Number</em>' attribute.
	 * @see #getDrivingLicenseNumber()
	 * @generated
	 */
	void setDrivingLicenseNumber(int value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see FinalProject.FinalProjectPackage#getUser_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link FinalProject.User#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Emergency Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency Contact Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency Contact Number</em>' attribute.
	 * @see #setEmergencyContactNumber(int)
	 * @see FinalProject.FinalProjectPackage#getUser_EmergencyContactNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEmergencyContactNumber();

	/**
	 * Sets the value of the '{@link FinalProject.User#getEmergencyContactNumber <em>Emergency Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Contact Number</em>' attribute.
	 * @see #getEmergencyContactNumber()
	 * @generated
	 */
	void setEmergencyContactNumber(int value);

	/**
	 * Returns the value of the '<em><b>Reward Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reward Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward Points</em>' attribute.
	 * @see #setRewardPoints(int)
	 * @see FinalProject.FinalProjectPackage#getUser_RewardPoints()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRewardPoints();

	/**
	 * Sets the value of the '{@link FinalProject.User#getRewardPoints <em>Reward Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward Points</em>' attribute.
	 * @see #getRewardPoints()
	 * @generated
	 */
	void setRewardPoints(int value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link FinalProject.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see FinalProject.FinalProjectPackage#getUser_Transaction()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Transaction> getTransaction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User.allInstances()->isUnique(AadharCardNumber)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint20(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.Password.toInteger() >= 0 and self.Password.toInteger() <= 9
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint21(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User.allInstances()->isUnique(UserId)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint22(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='user '"
	 * @generated
	 */
	void user();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updatedetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void purchaserewardpoints(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void redeemrewardpoints(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _Required="true" _Ordered="false"
	 * @generated
	 */
	void getUserStats(Map value);

} // User
