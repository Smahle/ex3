/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Department#getProgramme <em>Programme</em>}</li>
 *   <li>{@link study.Department#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference list.
	 * The list contents are of type {@link study.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Programme()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgramme();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link study.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // Department
