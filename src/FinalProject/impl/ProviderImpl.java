/**
 */
package FinalProject.impl;

import FinalProject.FinalProjectPackage;
import FinalProject.Offer;
import FinalProject.Provider;

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
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FinalProject.impl.ProviderImpl#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link FinalProject.impl.ProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link FinalProject.impl.ProviderImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link FinalProject.impl.ProviderImpl#getGSTIN <em>GSTIN</em>}</li>
 *   <li>{@link FinalProject.impl.ProviderImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link FinalProject.impl.ProviderImpl#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MinimalEObjectImpl.Container implements Provider {
	/**
	 * The default value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected static final int PROVIDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected int providerID = PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGSTIN() <em>GSTIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSTIN()
	 * @generated
	 * @ordered
	 */
	protected static final int GSTIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGSTIN() <em>GSTIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSTIN()
	 * @generated
	 * @ordered
	 */
	protected int gstin = GSTIN_EDEFAULT;

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
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer> offer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalProjectPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProviderID() {
		return providerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderID(int newProviderID) {
		int oldProviderID = providerID;
		providerID = newProviderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.PROVIDER__PROVIDER_ID, oldProviderID, providerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.PROVIDER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGSTIN() {
		return gstin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGSTIN(int newGSTIN) {
		int oldGSTIN = gstin;
		gstin = newGSTIN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.PROVIDER__GSTIN, oldGSTIN, gstin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalProjectPackage.PROVIDER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Offer> getOffer() {
		if (offer == null) {
			offer = new EObjectContainmentEList<Offer>(Offer.class, this, FinalProjectPackage.PROVIDER__OFFER);
		}
		return offer;
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
						 FinalProjectValidator.PROVIDER__CONSTRAINT20,
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
	public void getOfferDetails() {
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
			case FinalProjectPackage.PROVIDER__OFFER:
				return ((InternalEList<?>)getOffer()).basicRemove(otherEnd, msgs);
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
			case FinalProjectPackage.PROVIDER__PROVIDER_ID:
				return getProviderID();
			case FinalProjectPackage.PROVIDER__NAME:
				return getName();
			case FinalProjectPackage.PROVIDER__EMAIL:
				return getEmail();
			case FinalProjectPackage.PROVIDER__GSTIN:
				return getGSTIN();
			case FinalProjectPackage.PROVIDER__ADDRESS:
				return getAddress();
			case FinalProjectPackage.PROVIDER__OFFER:
				return getOffer();
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
			case FinalProjectPackage.PROVIDER__PROVIDER_ID:
				setProviderID((Integer)newValue);
				return;
			case FinalProjectPackage.PROVIDER__NAME:
				setName((String)newValue);
				return;
			case FinalProjectPackage.PROVIDER__EMAIL:
				setEmail((String)newValue);
				return;
			case FinalProjectPackage.PROVIDER__GSTIN:
				setGSTIN((Integer)newValue);
				return;
			case FinalProjectPackage.PROVIDER__ADDRESS:
				setAddress((String)newValue);
				return;
			case FinalProjectPackage.PROVIDER__OFFER:
				getOffer().clear();
				getOffer().addAll((Collection<? extends Offer>)newValue);
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
			case FinalProjectPackage.PROVIDER__PROVIDER_ID:
				setProviderID(PROVIDER_ID_EDEFAULT);
				return;
			case FinalProjectPackage.PROVIDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalProjectPackage.PROVIDER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case FinalProjectPackage.PROVIDER__GSTIN:
				setGSTIN(GSTIN_EDEFAULT);
				return;
			case FinalProjectPackage.PROVIDER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case FinalProjectPackage.PROVIDER__OFFER:
				getOffer().clear();
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
			case FinalProjectPackage.PROVIDER__PROVIDER_ID:
				return providerID != PROVIDER_ID_EDEFAULT;
			case FinalProjectPackage.PROVIDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalProjectPackage.PROVIDER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case FinalProjectPackage.PROVIDER__GSTIN:
				return gstin != GSTIN_EDEFAULT;
			case FinalProjectPackage.PROVIDER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case FinalProjectPackage.PROVIDER__OFFER:
				return offer != null && !offer.isEmpty();
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
			case FinalProjectPackage.PROVIDER___CONSTRAINT20__DIAGNOSTICCHAIN_MAP:
				return Constraint20((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FinalProjectPackage.PROVIDER___GET_OFFER_DETAILS:
				getOfferDetails();
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
		result.append(" (ProviderID: ");
		result.append(providerID);
		result.append(", Name: ");
		result.append(name);
		result.append(", Email: ");
		result.append(email);
		result.append(", GSTIN: ");
		result.append(gstin);
		result.append(", Address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
