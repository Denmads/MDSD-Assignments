/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22.impl;

import dk.sdu.mmmi.mdsd.iF22.*;

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
public class IF22FactoryImpl extends EFactoryImpl implements IF22Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IF22Factory init()
  {
    try
    {
      IF22Factory theIF22Factory = (IF22Factory)EPackage.Registry.INSTANCE.getEFactory(IF22Package.eNS_URI);
      if (theIF22Factory != null)
      {
        return theIF22Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IF22FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF22FactoryImpl()
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
      case IF22Package.IF22: return createIF22();
      case IF22Package.TYPE: return createType();
      case IF22Package.FUNCTION: return createFunction();
      case IF22Package.SCENARIO: return createScenario();
      case IF22Package.PARAMETER: return createParameter();
      case IF22Package.VARIABLE_DEF: return createVariableDef();
      case IF22Package.STATEMENT: return createStatement();
      case IF22Package.ANNOUNCE: return createAnnounce();
      case IF22Package.QUESTION: return createQuestion();
      case IF22Package.END: return createEnd();
      case IF22Package.TARGET: return createTarget();
      case IF22Package.TARGET_DESTINATION: return createTargetDestination();
      case IF22Package.ENDING_TARGET: return createEndingTarget();
      case IF22Package.EXP: return createExp();
      case IF22Package.BOOLEAN_OPERATION: return createBooleanOperation();
      case IF22Package.EQUALITY: return createEquality();
      case IF22Package.LESS_GREATER_THAN: return createLessGreaterThan();
      case IF22Package.CONCATENATION_PART: return createConcatenationPart();
      case IF22Package.ADD_SUB: return createAddSub();
      case IF22Package.MUL_DIV: return createMulDiv();
      case IF22Package.PRIMITIVE: return createPrimitive();
      case IF22Package.REFERABLE: return createReferable();
      case IF22Package.CONSTANT: return createConstant();
      case IF22Package.KEYWORD: return createKeyword();
      case IF22Package.FUNCTION_CALL: return createFunctionCall();
      case IF22Package.BOOLEAN: return createBOOLEAN();
      case IF22Package.INT_TYPE: return createIntType();
      case IF22Package.STRING_TYPE: return createStringType();
      case IF22Package.BOOLEAN_TYPE: return createBooleanType();
      case IF22Package.AND: return createAnd();
      case IF22Package.OR: return createOr();
      case IF22Package.EQUALS: return createEquals();
      case IF22Package.NOT_EQUALS: return createNotEquals();
      case IF22Package.LESS_THAN: return createLessThan();
      case IF22Package.GREATER_THAN: return createGreaterThan();
      case IF22Package.LESS_THAN_OR_EQUALS: return createLessThanOrEquals();
      case IF22Package.GREATER_THAN_OR_EQUALS: return createGreaterThanOrEquals();
      case IF22Package.CONCATENATION: return createConcatenation();
      case IF22Package.ADD: return createAdd();
      case IF22Package.SUB: return createSub();
      case IF22Package.MUL: return createMul();
      case IF22Package.DIV: return createDiv();
      case IF22Package.PARENTHESIS: return createParenthesis();
      case IF22Package.NOT: return createNot();
      case IF22Package.VAR_REF: return createVarRef();
      case IF22Package.INT_CONSTANT: return createIntConstant();
      case IF22Package.STRING_CONSTANT: return createStringConstant();
      case IF22Package.BOOL_CONSTANT: return createBoolConstant();
      case IF22Package.THIS: return createThis();
      case IF22Package.TRUE: return createTrue();
      case IF22Package.FALSE: return createFalse();
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
  public IF22 createIF22()
  {
    IF22Impl if22 = new IF22Impl();
    return if22;
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
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
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
  public VariableDef createVariableDef()
  {
    VariableDefImpl variableDef = new VariableDefImpl();
    return variableDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Announce createAnnounce()
  {
    AnnounceImpl announce = new AnnounceImpl();
    return announce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetDestination createTargetDestination()
  {
    TargetDestinationImpl targetDestination = new TargetDestinationImpl();
    return targetDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EndingTarget createEndingTarget()
  {
    EndingTargetImpl endingTarget = new EndingTargetImpl();
    return endingTarget;
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
  public BooleanOperation createBooleanOperation()
  {
    BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
    return booleanOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LessGreaterThan createLessGreaterThan()
  {
    LessGreaterThanImpl lessGreaterThan = new LessGreaterThanImpl();
    return lessGreaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConcatenationPart createConcatenationPart()
  {
    ConcatenationPartImpl concatenationPart = new ConcatenationPartImpl();
    return concatenationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddSub createAddSub()
  {
    AddSubImpl addSub = new AddSubImpl();
    return addSub;
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
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Referable createReferable()
  {
    ReferableImpl referable = new ReferableImpl();
    return referable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Keyword createKeyword()
  {
    KeywordImpl keyword = new KeywordImpl();
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BOOLEAN createBOOLEAN()
  {
    BOOLEANImpl boolean_ = new BOOLEANImpl();
    return boolean_;
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
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
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
  public NotEquals createNotEquals()
  {
    NotEqualsImpl notEquals = new NotEqualsImpl();
    return notEquals;
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
  public Concatenation createConcatenation()
  {
    ConcatenationImpl concatenation = new ConcatenationImpl();
    return concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
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
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public True createTrue()
  {
    TrueImpl true_ = new TrueImpl();
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public False createFalse()
  {
    FalseImpl false_ = new FalseImpl();
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IF22Package getIF22Package()
  {
    return (IF22Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IF22Package getPackage()
  {
    return IF22Package.eINSTANCE;
  }

} //IF22FactoryImpl
