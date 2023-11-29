/**
 */
package FinalProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.Coupon#getCouponId <em>Coupon Id</em>}</li>
 *   <li>{@link FinalProject.Coupon#getUserID <em>User ID</em>}</li>
 *   <li>{@link FinalProject.Coupon#getOfferId <em>Offer Id</em>}</li>
 * </ul>
 *
 * @see FinalProject.FinalProjectPackage#getCoupon()
 * @model
 * @generated
 */
public interface Coupon extends EObject {
	/**
	 * Returns the value of the '<em><b>Coupon Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon Id</em>' attribute.
	 * @see #setCouponId(int)
	 * @see FinalProject.FinalProjectPackage#getCoupon_CouponId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCouponId();

	/**
	 * Sets the value of the '{@link FinalProject.Coupon#getCouponId <em>Coupon Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupon Id</em>' attribute.
	 * @see #getCouponId()
	 * @generated
	 */
	void setCouponId(int value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @see FinalProject.FinalProjectPackage#getCoupon_UserID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link FinalProject.Coupon#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

	/**
	 * Returns the value of the '<em><b>Offer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer Id</em>' attribute.
	 * @see #setOfferId(int)
	 * @see FinalProject.FinalProjectPackage#getCoupon_OfferId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getOfferId();

	/**
	 * Sets the value of the '{@link FinalProject.Coupon#getOfferId <em>Offer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer Id</em>' attribute.
	 * @see #getOfferId()
	 * @generated
	 */
	void setOfferId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Integer" _Required="true" _Ordered="false"
	 * @generated
	 */
	void getCouponId(int value);

} // Coupon
