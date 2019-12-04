/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Programme#getName <em>Name</em>}</li>
 *   <li>{@link study.Programme#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.Programme#getProgrammeCode <em>Programme Code</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' containment reference list.
	 * The list contents are of type {@link study.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' containment reference list.
	 * @see study.StudyPackage#getProgramme_StudyPlan()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyPlan();

	/**
	 * Returns the value of the '<em><b>Programme Code</b></em>' attribute.
	 * The literals are from the enumeration {@link study.programmeCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Code</em>' attribute.
	 * @see study.programmeCode
	 * @see #setProgrammeCode(programmeCode)
	 * @see study.StudyPackage#getProgramme_ProgrammeCode()
	 * @model
	 * @generated
	 */
	programmeCode getProgrammeCode();

	/**
	 * Sets the value of the '{@link study.Programme#getProgrammeCode <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Code</em>' attribute.
	 * @see study.programmeCode
	 * @see #getProgrammeCode()
	 * @generated
	 */
	void setProgrammeCode(programmeCode value);

} // Programme
