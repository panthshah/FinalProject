/**
 */
package FinalProject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pooler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Pooler#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link FinalProject.Pooler#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link FinalProject.Pooler#getDestination <em>Destination</em>}</li>
 *   <li>{@link FinalProject.Pooler#getDestinationTime <em>Destination Time</em>}</li>
 *   <li>{@link FinalProject.Pooler#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getPooler()
 * @model
 * @generated
 */
public interface Pooler extends User {
	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' attribute.
	 * @see #setStartLocation(double)
	 * @see FinalProject.FinalProjectPackage#getPooler_StartLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getStartLocation();

	/**
	 * Sets the value of the '{@link FinalProject.Pooler#getStartLocation <em>Start Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' attribute.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(double value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see FinalProject.FinalProjectPackage#getPooler_StartTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link FinalProject.Pooler#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(double)
	 * @see FinalProject.FinalProjectPackage#getPooler_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDestination();

	/**
	 * Sets the value of the '{@link FinalProject.Pooler#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(double value);

	/**
	 * Returns the value of the '<em><b>Destination Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Time</em>' attribute.
	 * @see #setDestinationTime(Date)
	 * @see FinalProject.FinalProjectPackage#getPooler_DestinationTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDestinationTime();

	/**
	 * Sets the value of the '{@link FinalProject.Pooler#getDestinationTime <em>Destination Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Time</em>' attribute.
	 * @see #getDestinationTime()
	 * @generated
	 */
	void setDestinationTime(Date value);

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
	 * @see FinalProject.FinalProjectPackage#getPooler_Ride()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Ride> getRide();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pooler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateRewardPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transferRewardPoints();

} // Pooler
