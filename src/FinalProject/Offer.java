/**
 */
package FinalProject;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Offer#getOfferID <em>Offer ID</em>}</li>
 *   <li>{@link FinalProject.Offer#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link FinalProject.Offer#getOfferType <em>Offer Type</em>}</li>
 *   <li>{@link FinalProject.Offer#getDiscountPercentage <em>Discount Percentage</em>}</li>
 *   <li>{@link FinalProject.Offer#getMaxDeductableAmnt <em>Max Deductable Amnt</em>}</li>
 *   <li>{@link FinalProject.Offer#getValidUpto <em>Valid Upto</em>}</li>
 *   <li>{@link FinalProject.Offer#getRewardPoints <em>Reward Points</em>}</li>
 *   <li>{@link FinalProject.Offer#getCoupon <em>Coupon</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getOffer()
 * @model
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer ID</em>' attribute.
	 * @see #setOfferID(int)
	 * @see FinalProject.FinalProjectPackage#getOffer_OfferID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getOfferID();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getOfferID <em>Offer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer ID</em>' attribute.
	 * @see #getOfferID()
	 * @generated
	 */
	void setOfferID(int value);

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
	 * @see FinalProject.FinalProjectPackage#getOffer_ProviderID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getProviderID();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getProviderID <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider ID</em>' attribute.
	 * @see #getProviderID()
	 * @generated
	 */
	void setProviderID(int value);

	/**
	 * Returns the value of the '<em><b>Offer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer Type</em>' attribute.
	 * @see #setOfferType(String)
	 * @see FinalProject.FinalProjectPackage#getOffer_OfferType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOfferType();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getOfferType <em>Offer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer Type</em>' attribute.
	 * @see #getOfferType()
	 * @generated
	 */
	void setOfferType(String value);

	/**
	 * Returns the value of the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Percentage</em>' attribute.
	 * @see #setDiscountPercentage(int)
	 * @see FinalProject.FinalProjectPackage#getOffer_DiscountPercentage()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDiscountPercentage();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getDiscountPercentage <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Percentage</em>' attribute.
	 * @see #getDiscountPercentage()
	 * @generated
	 */
	void setDiscountPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Max Deductable Amnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Deductable Amnt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Deductable Amnt</em>' attribute.
	 * @see #setMaxDeductableAmnt(int)
	 * @see FinalProject.FinalProjectPackage#getOffer_MaxDeductableAmnt()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxDeductableAmnt();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getMaxDeductableAmnt <em>Max Deductable Amnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Deductable Amnt</em>' attribute.
	 * @see #getMaxDeductableAmnt()
	 * @generated
	 */
	void setMaxDeductableAmnt(int value);

	/**
	 * Returns the value of the '<em><b>Valid Upto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Upto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upto</em>' attribute.
	 * @see #setValidUpto(Date)
	 * @see FinalProject.FinalProjectPackage#getOffer_ValidUpto()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValidUpto '"
	 * @generated
	 */
	Date getValidUpto();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getValidUpto <em>Valid Upto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Upto</em>' attribute.
	 * @see #getValidUpto()
	 * @generated
	 */
	void setValidUpto(Date value);

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
	 * @see FinalProject.FinalProjectPackage#getOffer_RewardPoints()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRewardPoints();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getRewardPoints <em>Reward Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward Points</em>' attribute.
	 * @see #getRewardPoints()
	 * @generated
	 */
	void setRewardPoints(int value);

	/**
	 * Returns the value of the '<em><b>Coupon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon</em>' containment reference.
	 * @see #setCoupon(Coupon)
	 * @see FinalProject.FinalProjectPackage#getOffer_Coupon()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Coupon getCoupon();

	/**
	 * Sets the value of the '{@link FinalProject.Offer#getCoupon <em>Coupon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupon</em>' containment reference.
	 * @see #getCoupon()
	 * @generated
	 */
	void setCoupon(Coupon value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.DiscountPercentage >= 0 and self.DiscountPercentage <= 100
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
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void getOffer(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void getCouponCode(int value);

} // Offer
