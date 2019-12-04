/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.CourseSlot#getMandatoryCourse <em>Mandatory Course</em>}</li>
 *   <li>{@link study.CourseSlot#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link study.CourseSlot#isElective <em>Elective</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getCourseSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryOrNotConstraint'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 mandatoryOrNotConstraint='if self.elective = true then not self.mandatoryCourse -&gt; notEmpty() else true endif and if self.elective = false then not self.electiveCourses -&gt;notEmpty() else true endif'"
 * @generated
 */
public interface CourseSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Course</em>' reference.
	 * @see #setMandatoryCourse(Course)
	 * @see study.StudyPackage#getCourseSlot_MandatoryCourse()
	 * @model
	 * @generated
	 */
	Course getMandatoryCourse();

	/**
	 * Sets the value of the '{@link study.CourseSlot#getMandatoryCourse <em>Mandatory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Course</em>' reference.
	 * @see #getMandatoryCourse()
	 * @generated
	 */
	void setMandatoryCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' reference list.
	 * The list contents are of type {@link study.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' reference list.
	 * @see study.StudyPackage#getCourseSlot_ElectiveCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getElectiveCourses();

	/**
	 * Returns the value of the '<em><b>Elective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective</em>' attribute.
	 * @see #setElective(boolean)
	 * @see study.StudyPackage#getCourseSlot_Elective()
	 * @model required="true"
	 * @generated
	 */
	boolean isElective();

	/**
	 * Sets the value of the '{@link study.CourseSlot#isElective <em>Elective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective</em>' attribute.
	 * @see #isElective()
	 * @generated
	 */
	void setElective(boolean value);

} // CourseSlot
