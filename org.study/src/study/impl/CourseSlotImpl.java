/**
 */
package study.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import study.Course;
import study.CourseSlot;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.CourseSlotImpl#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link study.impl.CourseSlotImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link study.impl.CourseSlotImpl#isElective <em>Elective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseSlotImpl extends MinimalEObjectImpl.Container implements CourseSlot {
	/**
	 * The cached value of the '{@link #getMandatoryCourse() <em>Mandatory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourse()
	 * @generated
	 * @ordered
	 */
	protected Course mandatoryCourse;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

	/**
	 * The default value of the '{@link #isElective() <em>Elective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElective()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELECTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElective() <em>Elective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElective()
	 * @generated
	 * @ordered
	 */
	protected boolean elective = ELECTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.COURSE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getMandatoryCourse() {
		if (mandatoryCourse != null && mandatoryCourse.eIsProxy()) {
			InternalEObject oldMandatoryCourse = (InternalEObject)mandatoryCourse;
			mandatoryCourse = (Course)eResolveProxy(oldMandatoryCourse);
			if (mandatoryCourse != oldMandatoryCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.COURSE_SLOT__MANDATORY_COURSE, oldMandatoryCourse, mandatoryCourse));
			}
		}
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetMandatoryCourse() {
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryCourse(Course newMandatoryCourse) {
		Course oldMandatoryCourse = mandatoryCourse;
		mandatoryCourse = newMandatoryCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_SLOT__MANDATORY_COURSE, oldMandatoryCourse, mandatoryCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyPackage.COURSE_SLOT__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElective() {
		return elective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElective(boolean newElective) {
		boolean oldElective = elective;
		elective = newElective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_SLOT__ELECTIVE, oldElective, elective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.COURSE_SLOT__MANDATORY_COURSE:
				if (resolve) return getMandatoryCourse();
				return basicGetMandatoryCourse();
			case StudyPackage.COURSE_SLOT__ELECTIVE_COURSES:
				return getElectiveCourses();
			case StudyPackage.COURSE_SLOT__ELECTIVE:
				return isElective();
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
			case StudyPackage.COURSE_SLOT__MANDATORY_COURSE:
				setMandatoryCourse((Course)newValue);
				return;
			case StudyPackage.COURSE_SLOT__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyPackage.COURSE_SLOT__ELECTIVE:
				setElective((Boolean)newValue);
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
			case StudyPackage.COURSE_SLOT__MANDATORY_COURSE:
				setMandatoryCourse((Course)null);
				return;
			case StudyPackage.COURSE_SLOT__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
			case StudyPackage.COURSE_SLOT__ELECTIVE:
				setElective(ELECTIVE_EDEFAULT);
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
			case StudyPackage.COURSE_SLOT__MANDATORY_COURSE:
				return mandatoryCourse != null;
			case StudyPackage.COURSE_SLOT__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case StudyPackage.COURSE_SLOT__ELECTIVE:
				return elective != ELECTIVE_EDEFAULT;
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
		result.append(" (elective: ");
		result.append(elective);
		result.append(')');
		return result.toString();
	}

} //CourseSlotImpl
