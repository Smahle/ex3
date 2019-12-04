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
import study.Semester;
import study.Specialization;
import study.StudyPackage;
import study.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.StudyPlanImpl#getSpesialization <em>Spesialization</em>}</li>
 *   <li>{@link study.impl.StudyPlanImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link study.impl.StudyPlanImpl#getStudyPlanName <em>Study Plan Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getSpesialization() <em>Spesialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpesialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> spesialization;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * The default value of the '{@link #getStudyPlanName() <em>Study Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlanName()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_PLAN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyPlanName() <em>Study Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlanName()
	 * @generated
	 * @ordered
	 */
	protected String studyPlanName = STUDY_PLAN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpesialization() {
		if (spesialization == null) {
			spesialization = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyPackage.STUDY_PLAN__SPESIALIZATION);
		}
		return spesialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this, StudyPackage.STUDY_PLAN__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStudyPlanName() {
		return studyPlanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlanName(String newStudyPlanName) {
		String oldStudyPlanName = studyPlanName;
		studyPlanName = newStudyPlanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY_PLAN__STUDY_PLAN_NAME, oldStudyPlanName, studyPlanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.STUDY_PLAN__SPESIALIZATION:
				return ((InternalEList<?>)getSpesialization()).basicRemove(otherEnd, msgs);
			case StudyPackage.STUDY_PLAN__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
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
			case StudyPackage.STUDY_PLAN__SPESIALIZATION:
				return getSpesialization();
			case StudyPackage.STUDY_PLAN__SEMESTER:
				return getSemester();
			case StudyPackage.STUDY_PLAN__STUDY_PLAN_NAME:
				return getStudyPlanName();
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
			case StudyPackage.STUDY_PLAN__SPESIALIZATION:
				getSpesialization().clear();
				getSpesialization().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyPackage.STUDY_PLAN__STUDY_PLAN_NAME:
				setStudyPlanName((String)newValue);
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
			case StudyPackage.STUDY_PLAN__SPESIALIZATION:
				getSpesialization().clear();
				return;
			case StudyPackage.STUDY_PLAN__SEMESTER:
				getSemester().clear();
				return;
			case StudyPackage.STUDY_PLAN__STUDY_PLAN_NAME:
				setStudyPlanName(STUDY_PLAN_NAME_EDEFAULT);
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
			case StudyPackage.STUDY_PLAN__SPESIALIZATION:
				return spesialization != null && !spesialization.isEmpty();
			case StudyPackage.STUDY_PLAN__SEMESTER:
				return semester != null && !semester.isEmpty();
			case StudyPackage.STUDY_PLAN__STUDY_PLAN_NAME:
				return STUDY_PLAN_NAME_EDEFAULT == null ? studyPlanName != null : !STUDY_PLAN_NAME_EDEFAULT.equals(studyPlanName);
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
		result.append(" (studyPlanName: ");
		result.append(studyPlanName);
		result.append(')');
		return result.toString();
	}

} //StudyPlanImpl
