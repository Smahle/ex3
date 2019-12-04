/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link study.Semester#getCourseSlot <em>Course Slot</em>}</li>
 *   <li>{@link study.Semester#getFallOrSpring <em>Fall Or Spring</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalPointsMustBeMoreThan30'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see study.StudyPackage#getSemester_SemesterNumber()
	 * @model
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link study.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Slot</b></em>' containment reference list.
	 * The list contents are of type {@link study.CourseSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slot</em>' containment reference list.
	 * @see study.StudyPackage#getSemester_CourseSlot()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseSlot> getCourseSlot();

	/**
	 * Returns the value of the '<em><b>Fall Or Spring</b></em>' attribute.
	 * The literals are from the enumeration {@link study.FallOrSpring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall Or Spring</em>' attribute.
	 * @see study.FallOrSpring
	 * @see #setFallOrSpring(FallOrSpring)
	 * @see study.StudyPackage#getSemester_FallOrSpring()
	 * @model
	 * @generated
	 */
	FallOrSpring getFallOrSpring();

	/**
	 * Sets the value of the '{@link study.Semester#getFallOrSpring <em>Fall Or Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall Or Spring</em>' attribute.
	 * @see study.FallOrSpring
	 * @see #getFallOrSpring()
	 * @generated
	 */
	void setFallOrSpring(FallOrSpring value);

} // Semester
