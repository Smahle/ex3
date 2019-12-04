/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.StudyPlan#getSpesialization <em>Spesialization</em>}</li>
 *   <li>{@link study.StudyPlan#getSemester <em>Semester</em>}</li>
 *   <li>{@link study.StudyPlan#getStudyPlanName <em>Study Plan Name</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Spesialization</b></em>' containment reference list.
	 * The list contents are of type {@link study.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spesialization</em>' containment reference list.
	 * @see study.StudyPackage#getStudyPlan_Spesialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpesialization();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link study.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see study.StudyPackage#getStudyPlan_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Study Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan Name</em>' attribute.
	 * @see #setStudyPlanName(String)
	 * @see study.StudyPackage#getStudyPlan_StudyPlanName()
	 * @model
	 * @generated
	 */
	String getStudyPlanName();

	/**
	 * Sets the value of the '{@link study.StudyPlan#getStudyPlanName <em>Study Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan Name</em>' attribute.
	 * @see #getStudyPlanName()
	 * @generated
	 */
	void setStudyPlanName(String value);

} // StudyPlan
