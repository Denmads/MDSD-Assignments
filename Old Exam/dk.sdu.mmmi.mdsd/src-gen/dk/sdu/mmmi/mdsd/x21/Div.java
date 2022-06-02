/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.x21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.Div#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.Div#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.x21.X21Package#getDiv()
 * @model
 * @generated
 */
public interface Div extends MulDiv
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MulDiv)
   * @see dk.sdu.mmmi.mdsd.x21.X21Package#getDiv_Left()
   * @model containment="true"
   * @generated
   */
  MulDiv getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.x21.Div#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MulDiv value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Primary)
   * @see dk.sdu.mmmi.mdsd.x21.X21Package#getDiv_Right()
   * @model containment="true"
   * @generated
   */
  Primary getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.x21.Div#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Primary value);

} // Div
