/**
 */
package FinalProject;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Vehicle#getRegistrationNumber <em>Registration Number</em>}</li>
 *   <li>{@link FinalProject.Vehicle#getInsuranceNumber <em>Insurance Number</em>}</li>
 *   <li>{@link FinalProject.Vehicle#getOwnerID <em>Owner ID</em>}</li>
 *   <li>{@link FinalProject.Vehicle#getVehicelType <em>Vehicel Type</em>}</li>
 *   <li>{@link FinalProject.Vehicle#getMileage <em>Mileage</em>}</li>
 *   <li>{@link FinalProject.Vehicle#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Number</em>' attribute.
	 * @see #setRegistrationNumber(int)
	 * @see FinalProject.FinalProjectPackage#getVehicle_RegistrationNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegistrationNumber();

	/**
	 * Sets the value of the '{@link FinalProject.Vehicle#getRegistrationNumber <em>Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Number</em>' attribute.
	 * @see #getRegistrationNumber()
	 * @generated
	 */
	void setRegistrationNumber(int value);

	/**
	 * Returns the value of the '<em><b>Insurance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance Number</em>' attribute.
	 * @see #setInsuranceNumber(int)
	 * @see FinalProject.FinalProjectPackage#getVehicle_InsuranceNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInsuranceNumber();

	/**
	 * Sets the value of the '{@link FinalProject.Vehicle#getInsuranceNumber <em>Insurance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Number</em>' attribute.
	 * @see #getInsuranceNumber()
	 * @generated
	 */
	void setInsuranceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Owner ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner ID</em>' attribute.
	 * @see #setOwnerID(int)
	 * @see FinalProject.FinalProjectPackage#getVehicle_OwnerID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getOwnerID();

	/**
	 * Sets the value of the '{@link FinalProject.Vehicle#getOwnerID <em>Owner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner ID</em>' attribute.
	 * @see #getOwnerID()
	 * @generated
	 */
	void setOwnerID(int value);

	/**
	 * Returns the value of the '<em><b>Vehicel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicel Type</em>' attribute.
	 * @see #setVehicelType(String)
	 * @see FinalProject.FinalProjectPackage#getVehicle_VehicelType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVehicelType();

	/**
	 * Sets the value of the '{@link FinalProject.Vehicle#getVehicelType <em>Vehicel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicel Type</em>' attribute.
	 * @see #getVehicelType()
	 * @generated
	 */
	void setVehicelType(String value);

	/**
	 * Returns the value of the '<em><b>Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mileage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mileage</em>' attribute.
	 * @see #setMileage(int)
	 * @see FinalProject.FinalProjectPackage#getVehicle_Mileage()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMileage();

	/**
	 * Sets the value of the '{@link FinalProject.Vehicle#getMileage <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mileage</em>' attribute.
	 * @see #getMileage()
	 * @generated
	 */
	void setMileage(int value);

	/**
	 * Returns the value of the '<em><b>Ride</b></em>' containment reference list.
	 * The list contents are of type {@link FinalProject.Ride}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ride</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride</em>' containment reference list.
	 * @see FinalProject.FinalProjectPackage#getVehicle_Ride()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Ride> getRide();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.RegistrationNumber > 0 and self.InsuranceNumber > 0
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
	 * @model
	 * @generated
	 */
	void Vehicle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateDetails();

} // Vehicle
