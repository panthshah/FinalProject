/**
 */
package FinalProject;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Provider#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link FinalProject.Provider#getName <em>Name</em>}</li>
 *   <li>{@link FinalProject.Provider#getEmail <em>Email</em>}</li>
 *   <li>{@link FinalProject.Provider#getGSTIN <em>GSTIN</em>}</li>
 *   <li>{@link FinalProject.Provider#getAddress <em>Address</em>}</li>
 *   <li>{@link FinalProject.Provider#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider ID</em>' attribute.
	 * @see #setProviderID(int)
	 * @see FinalProject.FinalProjectPackage#getProvider_ProviderID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getProviderID();

	/**
	 * Sets the value of the '{@link FinalProject.Provider#getProviderID <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider ID</em>' attribute.
	 * @see #getProviderID()
	 * @generated
	 */
	void setProviderID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FinalProject.FinalProjectPackage#getProvider_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FinalProject.Provider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see FinalProject.FinalProjectPackage#getProvider_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link FinalProject.Provider#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>GSTIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSTIN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSTIN</em>' attribute.
	 * @see #setGSTIN(int)
	 * @see FinalProject.FinalProjectPackage#getProvider_GSTIN()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getGSTIN();

	/**
	 * Sets the value of the '{@link FinalProject.Provider#getGSTIN <em>GSTIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSTIN</em>' attribute.
	 * @see #getGSTIN()
	 * @generated
	 */
	void setGSTIN(int value);

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
	 * @see FinalProject.FinalProjectPackage#getProvider_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link FinalProject.Provider#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Offer</b></em>' containment reference list.
	 * The list contents are of type {@link FinalProject.Offer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer</em>' containment reference list.
	 * @see FinalProject.FinalProjectPackage#getProvider_Offer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Offer> getOffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.Email.indexOf('@') > 0
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
	 * @model kind="operation"
	 * @generated
	 */
	void getOfferDetails();

} // Provider
