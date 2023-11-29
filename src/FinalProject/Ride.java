/**
 */
package FinalProject;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Ride#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.Ride#getDate <em>Date</em>}</li>
 *   <li>{@link FinalProject.Ride#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getRide()
 * @model
 * @generated
 */
public interface Ride extends EObject {
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
	 * @see FinalProject.FinalProjectPackage#getRide_UserID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link FinalProject.Ride#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see FinalProject.FinalProjectPackage#getRide_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link FinalProject.Ride#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see FinalProject.FinalProjectPackage#getRide_Vehicle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link FinalProject.Ride#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ride();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPooler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void calculateRewardPoints(int _value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _Required="true" _Ordered="false"
	 * @generated
	 */
	void displayReducedCF(float value_);

} // Ride
