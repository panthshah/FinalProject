/**
 */
package FinalProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see FinalProject.FinalProjectPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isNameValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isEmailValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isPasswordValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isContactNumberValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isAadharCardNumberValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isVehicleTypeValid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void isMileageValid(boolean value);

} // Validator
