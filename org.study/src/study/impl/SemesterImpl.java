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

import study.CourseSlot;
import study.FallOrSpring;
import study.Semester;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getCourseSlot <em>Course Slot</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getFallOrSpring <em>Fall Or Spring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseSlot() <em>Course Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSlot> courseSlot;

	/**
	 * The default value of the '{@link #getFallOrSpring() <em>Fall Or Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallOrSpring()
	 * @generated
	 * @ordered
	 */
	protected static final FallOrSpring FALL_OR_SPRING_EDEFAULT = FallOrSpring.FALL;

	/**
	 * The cached value of the '{@link #getFallOrSpring() <em>Fall Or Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallOrSpring()
	 * @generated
	 * @ordered
	 */
	protected FallOrSpring fallOrSpring = FALL_OR_SPRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SEMESTER_NUMBER, oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseSlot> getCourseSlot() {
		if (courseSlot == null) {
			courseSlot = new EObjectContainmentEList<CourseSlot>(CourseSlot.class, this, StudyPackage.SEMESTER__COURSE_SLOT);
		}
		return courseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallOrSpring getFallOrSpring() {
		return fallOrSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFallOrSpring(FallOrSpring newFallOrSpring) {
		FallOrSpring oldFallOrSpring = fallOrSpring;
		fallOrSpring = newFallOrSpring == null ? FALL_OR_SPRING_EDEFAULT : newFallOrSpring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__FALL_OR_SPRING, oldFallOrSpring, fallOrSpring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__COURSE_SLOT:
				return ((InternalEList<?>)getCourseSlot()).basicRemove(otherEnd, msgs);
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
			case StudyPackage.SEMESTER__SEMESTER_NUMBER:
				return getSemesterNumber();
			case StudyPackage.SEMESTER__COURSE_SLOT:
				return getCourseSlot();
			case StudyPackage.SEMESTER__FALL_OR_SPRING:
				return getFallOrSpring();
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
			case StudyPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber((Integer)newValue);
				return;
			case StudyPackage.SEMESTER__COURSE_SLOT:
				getCourseSlot().clear();
				getCourseSlot().addAll((Collection<? extends CourseSlot>)newValue);
				return;
			case StudyPackage.SEMESTER__FALL_OR_SPRING:
				setFallOrSpring((FallOrSpring)newValue);
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
			case StudyPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
				return;
			case StudyPackage.SEMESTER__COURSE_SLOT:
				getCourseSlot().clear();
				return;
			case StudyPackage.SEMESTER__FALL_OR_SPRING:
				setFallOrSpring(FALL_OR_SPRING_EDEFAULT);
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
			case StudyPackage.SEMESTER__SEMESTER_NUMBER:
				return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
			case StudyPackage.SEMESTER__COURSE_SLOT:
				return courseSlot != null && !courseSlot.isEmpty();
			case StudyPackage.SEMESTER__FALL_OR_SPRING:
				return fallOrSpring != FALL_OR_SPRING_EDEFAULT;
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
		result.append(" (semesterNumber: ");
		result.append(semesterNumber);
		result.append(", fallOrSpring: ");
		result.append(fallOrSpring);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
