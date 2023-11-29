/**
 */
package FinalProject;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Transaction#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link FinalProject.Transaction#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.Transaction#getRewardPurchased <em>Reward Purchased</em>}</li>
 *   <li>{@link FinalProject.Transaction#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link FinalProject.Transaction#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see FinalProject.FinalProjectPackage#getTransaction_TransactionId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link FinalProject.Transaction#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

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
	 * @see FinalProject.FinalProjectPackage#getTransaction_UserID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link FinalProject.Transaction#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Reward Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reward Purchased</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward Purchased</em>' attribute.
	 * @see #setRewardPurchased(int)
	 * @see FinalProject.FinalProjectPackage#getTransaction_RewardPurchased()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRewardPurchased();

	/**
	 * Sets the value of the '{@link FinalProject.Transaction#getRewardPurchased <em>Reward Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward Purchased</em>' attribute.
	 * @see #getRewardPurchased()
	 * @generated
	 */
	void setRewardPurchased(int value);

	/**
	 * Returns the value of the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Paid</em>' attribute.
	 * @see #setAmountPaid(int)
	 * @see FinalProject.FinalProjectPackage#getTransaction_AmountPaid()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAmountPaid();

	/**
	 * Sets the value of the '{@link FinalProject.Transaction#getAmountPaid <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Paid</em>' attribute.
	 * @see #getAmountPaid()
	 * @generated
	 */
	void setAmountPaid(int value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see FinalProject.FinalProjectPackage#getTransaction_DateTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link FinalProject.Transaction#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayTransactionDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redeemPoints();

} // Transaction
