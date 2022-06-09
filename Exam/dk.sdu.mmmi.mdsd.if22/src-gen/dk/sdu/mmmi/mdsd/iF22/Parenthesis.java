/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.Parenthesis#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends Primitive
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Exp)
   * @see dk.sdu.mmmi.mdsd.iF22.IF22Package#getParenthesis_Body()
   * @model containment="true"
   * @generated
   */
  Exp getBody();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.iF22.Parenthesis#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Exp value);

} // Parenthesis