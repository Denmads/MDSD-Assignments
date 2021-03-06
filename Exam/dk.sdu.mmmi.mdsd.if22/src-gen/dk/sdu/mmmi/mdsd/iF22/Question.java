/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Question#getTypeAndValidation <em>Type And Validation</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Question#getVariable <em>Variable</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Question#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getQuestion()
 * @model
 * @generated
 */
public interface Question extends Statement
{
  /**
   * Returns the value of the '<em><b>Type And Validation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type And Validation</em>' containment reference.
   * @see #setTypeAndValidation(Exp)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getQuestion_TypeAndValidation()
   * @model containment="true"
   * @generated
   */
  Exp getTypeAndValidation();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.Question#getTypeAndValidation <em>Type And Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type And Validation</em>' containment reference.
   * @see #getTypeAndValidation()
   * @generated
   */
  void setTypeAndValidation(Exp value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableDef)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getQuestion_Variable()
   * @model
   * @generated
   */
  VariableDef getVariable();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.Question#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDef value);

  /**
   * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.iF22.Target}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getQuestion_Targets()
   * @model containment="true"
   * @generated
   */
  EList<Target> getTargets();

} // Question
