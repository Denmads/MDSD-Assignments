/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.x21.impl;

import dk.sdu.mmmi.mdsd.x21.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class X21FactoryImpl extends EFactoryImpl implements X21Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static X21Factory init()
  {
    try
    {
      X21Factory theX21Factory = (X21Factory)EPackage.Registry.INSTANCE.getEFactory(X21Package.eNS_URI);
      if (theX21Factory != null)
      {
        return theX21Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new X21FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public X21FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case X21Package.X21: return createX21();
      case X21Package.DECLARATION: return createDeclaration();
      case X21Package.NAME_AND_TYPE: return createNameAndType();
      case X21Package.PARAMETER: return createParameter();
      case X21Package.FUNCTION: return createFunction();
      case X21Package.LAMBDA: return createLambda();
      case X21Package.INPUT: return createInput();
      case X21Package.FUNCTION_OR_LAMBDA: return createFunctionOrLambda();
      case X21Package.NODE: return createNode();
      case X21Package.NODE_OR_INPUT: return createNodeOrInput();
      case X21Package.STREAM: return createStream();
      case X21Package.ELEMENT_LIST: return createElementList();
      case X21Package.ELEMENT: return createElement();
      case X21Package.DATA_DECL: return createDataDecl();
      case X21Package.DATA_VARIABLE: return createDataVariable();
      case X21Package.TYPE: return createType();
      case X21Package.LOGIC_EXP: return createLogicExp();
      case X21Package.EXP: return createExp();
      case X21Package.MUL_DIV: return createMulDiv();
      case X21Package.PRIMARY: return createPrimary();
      case X21Package.LET_STATEMENT: return createLetStatement();
      case X21Package.DATA_ACCESS: return createDataAccess();
      case X21Package.DATA_REF: return createDataRef();
      case X21Package.NONE: return createNone();
      case X21Package.IF_STATEMENT: return createIfStatement();
      case X21Package.NEW_STATEMENT: return createNewStatement();
      case X21Package.VAR_ASSIGNMENT: return createVarAssignment();
      case X21Package.FUNCTION_REFERENCE: return createFunctionReference();
      case X21Package.NODE_REF: return createNodeRef();
      case X21Package.ANONYMOUS_ELEMENT: return createAnonymousElement();
      case X21Package.OUTPUT: return createOutput();
      case X21Package.INT_TYPE: return createIntType();
      case X21Package.STRING_TYPE: return createStringType();
      case X21Package.CUSTOM_TYPE: return createCustomType();
      case X21Package.EQUALS: return createEquals();
      case X21Package.LESS_THAN: return createLessThan();
      case X21Package.GREATER_THAN: return createGreaterThan();
      case X21Package.LESS_THAN_OR_EQUALS: return createLessThanOrEquals();
      case X21Package.GREATER_THAN_OR_EQUALS: return createGreaterThanOrEquals();
      case X21Package.PLUS: return createPlus();
      case X21Package.MINUS: return createMinus();
      case X21Package.MUL: return createMul();
      case X21Package.DIV: return createDiv();
      case X21Package.INT: return createInt();
      case X21Package.PARENTHESIS: return createParenthesis();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X21 createX21()
  {
    X21Impl x21 = new X21Impl();
    return x21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameAndType createNameAndType()
  {
    NameAndTypeImpl nameAndType = new NameAndTypeImpl();
    return nameAndType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lambda createLambda()
  {
    LambdaImpl lambda = new LambdaImpl();
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionOrLambda createFunctionOrLambda()
  {
    FunctionOrLambdaImpl functionOrLambda = new FunctionOrLambdaImpl();
    return functionOrLambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeOrInput createNodeOrInput()
  {
    NodeOrInputImpl nodeOrInput = new NodeOrInputImpl();
    return nodeOrInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementList createElementList()
  {
    ElementListImpl elementList = new ElementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataDecl createDataDecl()
  {
    DataDeclImpl dataDecl = new DataDeclImpl();
    return dataDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataVariable createDataVariable()
  {
    DataVariableImpl dataVariable = new DataVariableImpl();
    return dataVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MulDiv createMulDiv()
  {
    MulDivImpl mulDiv = new MulDivImpl();
    return mulDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetStatement createLetStatement()
  {
    LetStatementImpl letStatement = new LetStatementImpl();
    return letStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccess createDataAccess()
  {
    DataAccessImpl dataAccess = new DataAccessImpl();
    return dataAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataRef createDataRef()
  {
    DataRefImpl dataRef = new DataRefImpl();
    return dataRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public None createNone()
  {
    NoneImpl none = new NoneImpl();
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NewStatement createNewStatement()
  {
    NewStatementImpl newStatement = new NewStatementImpl();
    return newStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarAssignment createVarAssignment()
  {
    VarAssignmentImpl varAssignment = new VarAssignmentImpl();
    return varAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionReference createFunctionReference()
  {
    FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
    return functionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeRef createNodeRef()
  {
    NodeRefImpl nodeRef = new NodeRefImpl();
    return nodeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonymousElement createAnonymousElement()
  {
    AnonymousElementImpl anonymousElement = new AnonymousElementImpl();
    return anonymousElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomType createCustomType()
  {
    CustomTypeImpl customType = new CustomTypeImpl();
    return customType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LessThan createLessThan()
  {
    LessThanImpl lessThan = new LessThanImpl();
    return lessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterThan createGreaterThan()
  {
    GreaterThanImpl greaterThan = new GreaterThanImpl();
    return greaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LessThanOrEquals createLessThanOrEquals()
  {
    LessThanOrEqualsImpl lessThanOrEquals = new LessThanOrEqualsImpl();
    return lessThanOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterThanOrEquals createGreaterThanOrEquals()
  {
    GreaterThanOrEqualsImpl greaterThanOrEquals = new GreaterThanOrEqualsImpl();
    return greaterThanOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Int createInt()
  {
    IntImpl int_ = new IntImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X21Package getX21Package()
  {
    return (X21Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static X21Package getPackage()
  {
    return X21Package.eINSTANCE;
  }

} //X21FactoryImpl
