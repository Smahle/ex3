/**
 */
package study.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import study.Programme;
import study.StudyPackage;
import study.StudyPlan;
import study.programmeCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.impl.ProgrammeImpl#getProgrammeCode <em>Programme Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The cached value of the '{@link #getStudyPlan() <em>Study Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlan> studyPlan;

	/**
	 * The default value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated NOT
	 * @ordered
	 */
	protected static final programmeCode PROGRAMME_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated
	 * @ordered
	 */
	protected programmeCode programmeCode = PROGRAMME_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyPlan> getStudyPlan() {
		if (studyPlan == null) {
			studyPlan = new EObjectContainmentEList<StudyPlan>(StudyPlan.class, this, StudyPackage.PROGRAMME__STUDY_PLAN);
		}
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public programmeCode getProgrammeCode() {
		return programmeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeCode(programmeCode newProgrammeCode) {
		programmeCode oldProgrammeCode = programmeCode;
		programmeCode = newProgrammeCode == null ? PROGRAMME_CODE_EDEFAULT : newProgrammeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.PROGRAMME__PROGRAMME_CODE, oldProgrammeCode, programmeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.PROGRAMME__STUDY_PLAN:
				return ((InternalEList<?>)getStudyPlan()).basicRemove(otherEnd, msgs);
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
			case StudyPackage.PROGRAMME__NAME:
				return getName();
			case StudyPackage.PROGRAMME__STUDY_PLAN:
				return getStudyPlan();
			case StudyPackage.PROGRAMME__PROGRAMME_CODE:
				return getProgrammeCode();
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
			case StudyPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyPackage.PROGRAMME__STUDY_PLAN:
				getStudyPlan().clear();
				getStudyPlan().addAll((Collection<? extends StudyPlan>)newValue);
				return;
			case StudyPackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode((programmeCode)newValue);
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
			case StudyPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyPackage.PROGRAMME__STUDY_PLAN:
				getStudyPlan().clear();
				return;
			case StudyPackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode(PROGRAMME_CODE_EDEFAULT);
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
			case StudyPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyPackage.PROGRAMME__STUDY_PLAN:
				return studyPlan != null && !studyPlan.isEmpty();
			case StudyPackage.PROGRAMME__PROGRAMME_CODE:
				return programmeCode != PROGRAMME_CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", programmeCode: ");
		result.append(programmeCode);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
