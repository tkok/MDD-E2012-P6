package dk.itu.ecdar.converter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import dk.itu.ecdar.converter.Environment;
import dk.itu.ecdar.text.ecdarText.ETActionType;
import dk.itu.ecdar.text.ecdarText.ETAddExpression;
import dk.itu.ecdar.text.ecdarText.ETAdditionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETArrayDeclaration;
import dk.itu.ecdar.text.ecdarText.ETArrayExpression;
import dk.itu.ecdar.text.ecdarText.ETAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitAndAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitAndExpression;
import dk.itu.ecdar.text.ecdarText.ETBitLeftAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitLeftExpression;
import dk.itu.ecdar.text.ecdarText.ETBitOrAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitOrExpression;
import dk.itu.ecdar.text.ecdarText.ETBitRightAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitRightExpression;
import dk.itu.ecdar.text.ecdarText.ETBitXORAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETBitXORExpression;
import dk.itu.ecdar.text.ecdarText.ETBooleanLiteral;
import dk.itu.ecdar.text.ecdarText.ETBooleanType;
import dk.itu.ecdar.text.ecdarText.ETClockType;
import dk.itu.ecdar.text.ecdarText.ETConditionalExpression;
import dk.itu.ecdar.text.ecdarText.ETDeclaration;
import dk.itu.ecdar.text.ecdarText.ETDeclarations;
import dk.itu.ecdar.text.ecdarText.ETDivideExpression;
import dk.itu.ecdar.text.ecdarText.ETDivisionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETEdge;
import dk.itu.ecdar.text.ecdarText.ETEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETExistsExpression;
import dk.itu.ecdar.text.ecdarText.ETExpression;
import dk.itu.ecdar.text.ecdarText.ETFieldDeclaration;
import dk.itu.ecdar.text.ecdarText.ETFieldID;
import dk.itu.ecdar.text.ecdarText.ETFile;
import dk.itu.ecdar.text.ecdarText.ETForallExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETGreaterExpression;
import dk.itu.ecdar.text.ecdarText.ETIO;
import dk.itu.ecdar.text.ecdarText.ETIOType;
import dk.itu.ecdar.text.ecdarText.ETImplyExpression;
import dk.itu.ecdar.text.ecdarText.ETInitialiser;
import dk.itu.ecdar.text.ecdarText.ETInputType;
import dk.itu.ecdar.text.ecdarText.ETIntegerType;
import dk.itu.ecdar.text.ecdarText.ETLessEqualExpression;
import dk.itu.ecdar.text.ecdarText.ETLessExpression;
import dk.itu.ecdar.text.ecdarText.ETLocation;
import dk.itu.ecdar.text.ecdarText.ETLogicAndExpression;
import dk.itu.ecdar.text.ecdarText.ETLogicOrExpression;
import dk.itu.ecdar.text.ecdarText.ETMaxExpression;
import dk.itu.ecdar.text.ecdarText.ETMinExpression;
import dk.itu.ecdar.text.ecdarText.ETMinusExpression;
import dk.itu.ecdar.text.ecdarText.ETModuloAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETModuloExpression;
import dk.itu.ecdar.text.ecdarText.ETMultiInitialiser;
import dk.itu.ecdar.text.ecdarText.ETMultiplicationAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETMultiplyExpression;
import dk.itu.ecdar.text.ecdarText.ETNumberLiteral;
import dk.itu.ecdar.text.ecdarText.ETOutputType;
import dk.itu.ecdar.text.ecdarText.ETParameter;
import dk.itu.ecdar.text.ecdarText.ETPostDecrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPostIncrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPreDecrementExpression;
import dk.itu.ecdar.text.ecdarText.ETPreIncrementExpression;
import dk.itu.ecdar.text.ecdarText.ETReference;
import dk.itu.ecdar.text.ecdarText.ETScalarType;
import dk.itu.ecdar.text.ecdarText.ETSelect;
import dk.itu.ecdar.text.ecdarText.ETSingleInitialiser;
import dk.itu.ecdar.text.ecdarText.ETSpecification;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBinding;
import dk.itu.ecdar.text.ecdarText.ETSpecificationBody;
import dk.itu.ecdar.text.ecdarText.ETSpecificationDefinition;
import dk.itu.ecdar.text.ecdarText.ETSpecificationInstantiation;
import dk.itu.ecdar.text.ecdarText.ETSpecificationTemplate;
import dk.itu.ecdar.text.ecdarText.ETStructExpression;
import dk.itu.ecdar.text.ecdarText.ETStructType;
import dk.itu.ecdar.text.ecdarText.ETSubtractExpression;
import dk.itu.ecdar.text.ecdarText.ETSubtractionAssignmentExpression;
import dk.itu.ecdar.text.ecdarText.ETType;
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeID;
import dk.itu.ecdar.text.ecdarText.ETTypeIdentifier;
import dk.itu.ecdar.text.ecdarText.ETTypeModifiers;
import dk.itu.ecdar.text.ecdarText.ETTypeReference;
import dk.itu.ecdar.text.ecdarText.ETUnequalExpression;
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration;
import dk.itu.ecdar.text.ecdarText.ETVariableID;
import dk.itu.ecdar.text.ecdarText.EcdarTextFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function3;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uppaal.xml.description.DescriptionStandaloneSetup;
import org.uppaal.xml.description.description.UAAddExpression;
import org.uppaal.xml.description.description.UAAdditionAssignmentExpression;
import org.uppaal.xml.description.description.UAArrayDeclaration;
import org.uppaal.xml.description.description.UAArrayExpression;
import org.uppaal.xml.description.description.UAAssignmentExpression;
import org.uppaal.xml.description.description.UABitAndAssignmentExpression;
import org.uppaal.xml.description.description.UABitAndExpression;
import org.uppaal.xml.description.description.UABitLeftAssignmentExpression;
import org.uppaal.xml.description.description.UABitLeftExpression;
import org.uppaal.xml.description.description.UABitOrAssignmentExpression;
import org.uppaal.xml.description.description.UABitOrExpression;
import org.uppaal.xml.description.description.UABitRightAssignmentExpression;
import org.uppaal.xml.description.description.UABitRightExpression;
import org.uppaal.xml.description.description.UABitXORAssignmentExpression;
import org.uppaal.xml.description.description.UABitXORExpression;
import org.uppaal.xml.description.description.UABooleanLiteral;
import org.uppaal.xml.description.description.UABooleanType;
import org.uppaal.xml.description.description.UAChannelType;
import org.uppaal.xml.description.description.UAClockType;
import org.uppaal.xml.description.description.UAConditionalExpression;
import org.uppaal.xml.description.description.UADeclaration;
import org.uppaal.xml.description.description.UADeclarations;
import org.uppaal.xml.description.description.UADefinition;
import org.uppaal.xml.description.description.UADivideExpression;
import org.uppaal.xml.description.description.UADivisionAssignmentExpression;
import org.uppaal.xml.description.description.UAEqualExpression;
import org.uppaal.xml.description.description.UAExistsExpression;
import org.uppaal.xml.description.description.UAExpression;
import org.uppaal.xml.description.description.UAFieldDeclaration;
import org.uppaal.xml.description.description.UAFieldID;
import org.uppaal.xml.description.description.UAForallExpression;
import org.uppaal.xml.description.description.UAGreaterEqualExpression;
import org.uppaal.xml.description.description.UAGreaterExpression;
import org.uppaal.xml.description.description.UAImplyExpression;
import org.uppaal.xml.description.description.UAInitialiser;
import org.uppaal.xml.description.description.UAInstantiation;
import org.uppaal.xml.description.description.UAIntegerType;
import org.uppaal.xml.description.description.UALessEqualExpression;
import org.uppaal.xml.description.description.UALessExpression;
import org.uppaal.xml.description.description.UALogicAndExpression;
import org.uppaal.xml.description.description.UALogicOrExpression;
import org.uppaal.xml.description.description.UAMaxExpression;
import org.uppaal.xml.description.description.UAMinExpression;
import org.uppaal.xml.description.description.UAMinusExpression;
import org.uppaal.xml.description.description.UAModuloAssignmentExpression;
import org.uppaal.xml.description.description.UAModuloExpression;
import org.uppaal.xml.description.description.UAMultiInitialiser;
import org.uppaal.xml.description.description.UAMultiplicationAssignmentExpression;
import org.uppaal.xml.description.description.UAMultiplyExpression;
import org.uppaal.xml.description.description.UANumberLiteral;
import org.uppaal.xml.description.description.UAParameter;
import org.uppaal.xml.description.description.UAParameters;
import org.uppaal.xml.description.description.UAPostDecrementExpression;
import org.uppaal.xml.description.description.UAPostIncrementExpression;
import org.uppaal.xml.description.description.UAPreDecrementExpression;
import org.uppaal.xml.description.description.UAPreIncrementExpression;
import org.uppaal.xml.description.description.UAReference;
import org.uppaal.xml.description.description.UAScalarType;
import org.uppaal.xml.description.description.UASelect;
import org.uppaal.xml.description.description.UASelectList;
import org.uppaal.xml.description.description.UASingleInitialiser;
import org.uppaal.xml.description.description.UAStructExpression;
import org.uppaal.xml.description.description.UAStructType;
import org.uppaal.xml.description.description.UASubtractExpression;
import org.uppaal.xml.description.description.UASubtractionAssignmentExpression;
import org.uppaal.xml.description.description.UASynchronisation;
import org.uppaal.xml.description.description.UASynchronisationType;
import org.uppaal.xml.description.description.UASystemDefinition;
import org.uppaal.xml.description.description.UAType;
import org.uppaal.xml.description.description.UATypeDeclaration;
import org.uppaal.xml.description.description.UATypeID;
import org.uppaal.xml.description.description.UATypeIdentifier;
import org.uppaal.xml.description.description.UATypeModifiers;
import org.uppaal.xml.description.description.UAUnequalExpression;
import org.uppaal.xml.description.description.UAUpdate;
import org.uppaal.xml.description.description.UAUserType;
import org.uppaal.xml.description.description.UAVariableDeclaration;
import org.uppaal.xml.description.description.UAVariableID;
import org.uppaal.xml.description.services.DescriptionGrammarAccess;
import org.uppaal.xml.flat11.DocumentRoot;
import org.uppaal.xml.flat11.InitType;
import org.uppaal.xml.flat11.KindType;
import org.uppaal.xml.flat11.LabelType;
import org.uppaal.xml.flat11.LocationType;
import org.uppaal.xml.flat11.NameType;
import org.uppaal.xml.flat11.NtaType;
import org.uppaal.xml.flat11.ParameterType;
import org.uppaal.xml.flat11.SourceType;
import org.uppaal.xml.flat11.TargetType;
import org.uppaal.xml.flat11.TemplateType;
import org.uppaal.xml.flat11.TransitionType;
import org.uppaal.xml.flat11.UrgentType;

@SuppressWarnings("all")
public class Uppaal2EcdarText {
  private EcdarTextFactory factory;
  
  private IParser parser;
  
  private DescriptionGrammarAccess grammarAccess;
  
  private Environment globalActionsEnv = new Function0<Environment>() {
    public Environment apply() {
      Environment _environment = new Environment();
      return _environment;
    }
  }.apply();
  
  private Environment globalEnv = new Function0<Environment>() {
    public Environment apply() {
      Environment _environment = new Environment();
      return _environment;
    }
  }.apply();
  
  public Uppaal2EcdarText() {
    DescriptionStandaloneSetup _descriptionStandaloneSetup = new DescriptionStandaloneSetup();
    final Injector injector = _descriptionStandaloneSetup.createInjectorAndDoEMFRegistration();
    IParser _instance = injector.<IParser>getInstance(IParser.class);
    this.parser = _instance;
    DescriptionGrammarAccess _instance_1 = injector.<DescriptionGrammarAccess>getInstance(DescriptionGrammarAccess.class);
    this.grammarAccess = _instance_1;
  }
  
  public EObject parse(final String block, final ParserRule rule) {
    try {
      EObject _xblockexpression = null;
      {
        StringReader _stringReader = new StringReader(block);
        final IParseResult result = this.parser.parse(rule, _stringReader);
        final Iterable<INode> errors = result.getSyntaxErrors();
        EObject _xifexpression = null;
        int _size = IterableExtensions.size(errors);
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          final Function1<INode,String> _function = new Function1<INode,String>() {
              public String apply(final INode error) {
                int _startLine = error.getStartLine();
                int _offset = error.getOffset();
                SyntaxErrorMessage _syntaxErrorMessage = error.getSyntaxErrorMessage();
                String _message = _syntaxErrorMessage.getMessage();
                String _format = String.format("%d:%d - %s\n", Integer.valueOf(_startLine), Integer.valueOf(_offset), _message);
                return _format;
              }
            };
          Iterable<String> _map = IterableExtensions.<INode, String>map(errors, _function);
          String _join = IterableExtensions.join(_map, "\n");
          Error _error = new Error(_join);
          throw _error;
        } else {
          EObject _rootASTElement = result.getRootASTElement();
          _xifexpression = _rootASTElement;
        }
        _xblockexpression = (_xifexpression);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<UADeclaration> parseUADeclarations(final String block) {
    ParserRule _uADeclarationsRule = this.grammarAccess.getUADeclarationsRule();
    EObject _parse = this.parse(block, _uADeclarationsRule);
    EList<UADeclaration> _declarations = ((UADeclarations) _parse).getDeclarations();
    return _declarations;
  }
  
  public List<UAParameter> parseUAParameters(final String block) {
    ParserRule _uAParametersRule = this.grammarAccess.getUAParametersRule();
    EObject _parse = this.parse(block, _uAParametersRule);
    EList<UAParameter> _parameters = ((UAParameters) _parse).getParameters();
    return _parameters;
  }
  
  public UAExpression parseUAExpression(final String block) {
    ParserRule _uAExpressionRule = this.grammarAccess.getUAExpressionRule();
    EObject _parse = this.parse(block, _uAExpressionRule);
    return ((UAExpression) _parse);
  }
  
  public UASynchronisation parseUASynchronisation(final String block) {
    ParserRule _uASynchronisationRule = this.grammarAccess.getUASynchronisationRule();
    EObject _parse = this.parse(block, _uASynchronisationRule);
    return ((UASynchronisation) _parse);
  }
  
  public List<UASelect> parseUASelects(final String block) {
    ParserRule _uASelectListRule = this.grammarAccess.getUASelectListRule();
    EObject _parse = this.parse(block, _uASelectListRule);
    EList<UASelect> _selects = ((UASelectList) _parse).getSelects();
    return _selects;
  }
  
  public List<UAExpression> parseUAUpdateExpressions(final String block) {
    ParserRule _uAUpdateRule = this.grammarAccess.getUAUpdateRule();
    EObject _parse = this.parse(block, _uAUpdateRule);
    EList<UAExpression> _expressions = ((UAUpdate) _parse).getExpressions();
    return _expressions;
  }
  
  public List<UADefinition> parseUADefinitions(final String block) {
    ParserRule _uASystemDefinitionRule = this.grammarAccess.getUASystemDefinitionRule();
    EObject _parse = this.parse(block, _uASystemDefinitionRule);
    EList<UADefinition> _definitions = ((UASystemDefinition) _parse).getDefinitions();
    return _definitions;
  }
  
  protected ETExpression _transformUAExpression(final UAExpression expression, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(expression, env);
    final ETExpression _result;
    synchronized (_createCache_transformUAExpression) {
      if (_createCache_transformUAExpression.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression.get(_cacheKey);
      }
      ETExpression _createETExpression = this.factory.createETExpression();
      _result = _createETExpression;
      _createCache_transformUAExpression.put(_cacheKey, _result);
    }
    _init_transformUAExpression(_result, expression, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETExpression> _createCache_transformUAExpression = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression(final ETExpression it, final UAExpression expression, final Environment env) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unable to transform expression ");
      _builder.append(expression, "");
      _builder.newLineIfNotEmpty();
      Error _error = new Error(_builder.toString());
      throw _error;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ETImplyExpression _transformUAExpression(final UAImplyExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETImplyExpression _result;
    synchronized (_createCache_transformUAExpression_1) {
      if (_createCache_transformUAExpression_1.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_1.get(_cacheKey);
      }
      ETImplyExpression _createETImplyExpression = this.factory.createETImplyExpression();
      _result = _createETImplyExpression;
      _createCache_transformUAExpression_1.put(_cacheKey, _result);
    }
    _init_transformUAExpression_1(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETImplyExpression> _createCache_transformUAExpression_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_1(final ETImplyExpression it, final UAImplyExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETLogicOrExpression _transformUAExpression(final UALogicOrExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETLogicOrExpression _result;
    synchronized (_createCache_transformUAExpression_2) {
      if (_createCache_transformUAExpression_2.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_2.get(_cacheKey);
      }
      ETLogicOrExpression _createETLogicOrExpression = this.factory.createETLogicOrExpression();
      _result = _createETLogicOrExpression;
      _createCache_transformUAExpression_2.put(_cacheKey, _result);
    }
    _init_transformUAExpression_2(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETLogicOrExpression> _createCache_transformUAExpression_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_2(final ETLogicOrExpression it, final UALogicOrExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETLogicAndExpression _transformUAExpression(final UALogicAndExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETLogicAndExpression _result;
    synchronized (_createCache_transformUAExpression_3) {
      if (_createCache_transformUAExpression_3.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_3.get(_cacheKey);
      }
      ETLogicAndExpression _createETLogicAndExpression = this.factory.createETLogicAndExpression();
      _result = _createETLogicAndExpression;
      _createCache_transformUAExpression_3.put(_cacheKey, _result);
    }
    _init_transformUAExpression_3(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETLogicAndExpression> _createCache_transformUAExpression_3 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_3(final ETLogicAndExpression it, final UALogicAndExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETConditionalExpression _transformUAExpression(final UAConditionalExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETConditionalExpression _result;
    synchronized (_createCache_transformUAExpression_4) {
      if (_createCache_transformUAExpression_4.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_4.get(_cacheKey);
      }
      ETConditionalExpression _createETConditionalExpression = this.factory.createETConditionalExpression();
      _result = _createETConditionalExpression;
      _createCache_transformUAExpression_4.put(_cacheKey, _result);
    }
    _init_transformUAExpression_4(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETConditionalExpression> _createCache_transformUAExpression_4 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_4(final ETConditionalExpression it, final UAConditionalExpression e, final Environment env) {
    UAExpression _condition = e.getCondition();
    ETExpression _transformUAExpression = this.transformUAExpression(_condition, env);
    it.setCondition(_transformUAExpression);
    UAExpression _then = e.getThen();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_then, env);
    it.setThen(_transformUAExpression_1);
    UAExpression _else = e.getElse();
    ETExpression _transformUAExpression_2 = this.transformUAExpression(_else, env);
    it.setElse(_transformUAExpression_2);
  }
  
  protected ETBitOrExpression _transformUAExpression(final UABitOrExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitOrExpression _result;
    synchronized (_createCache_transformUAExpression_5) {
      if (_createCache_transformUAExpression_5.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_5.get(_cacheKey);
      }
      ETBitOrExpression _createETBitOrExpression = this.factory.createETBitOrExpression();
      _result = _createETBitOrExpression;
      _createCache_transformUAExpression_5.put(_cacheKey, _result);
    }
    _init_transformUAExpression_5(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitOrExpression> _createCache_transformUAExpression_5 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_5(final ETBitOrExpression it, final UABitOrExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitXORExpression _transformUAExpression(final UABitXORExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitXORExpression _result;
    synchronized (_createCache_transformUAExpression_6) {
      if (_createCache_transformUAExpression_6.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_6.get(_cacheKey);
      }
      ETBitXORExpression _createETBitXORExpression = this.factory.createETBitXORExpression();
      _result = _createETBitXORExpression;
      _createCache_transformUAExpression_6.put(_cacheKey, _result);
    }
    _init_transformUAExpression_6(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitXORExpression> _createCache_transformUAExpression_6 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_6(final ETBitXORExpression it, final UABitXORExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitAndExpression _transformUAExpression(final UABitAndExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitAndExpression _result;
    synchronized (_createCache_transformUAExpression_7) {
      if (_createCache_transformUAExpression_7.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_7.get(_cacheKey);
      }
      ETBitAndExpression _createETBitAndExpression = this.factory.createETBitAndExpression();
      _result = _createETBitAndExpression;
      _createCache_transformUAExpression_7.put(_cacheKey, _result);
    }
    _init_transformUAExpression_7(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitAndExpression> _createCache_transformUAExpression_7 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_7(final ETBitAndExpression it, final UABitAndExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETEqualExpression _transformUAExpression(final UAEqualExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETEqualExpression _result;
    synchronized (_createCache_transformUAExpression_8) {
      if (_createCache_transformUAExpression_8.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_8.get(_cacheKey);
      }
      ETEqualExpression _createETEqualExpression = this.factory.createETEqualExpression();
      _result = _createETEqualExpression;
      _createCache_transformUAExpression_8.put(_cacheKey, _result);
    }
    _init_transformUAExpression_8(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETEqualExpression> _createCache_transformUAExpression_8 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_8(final ETEqualExpression it, final UAEqualExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETUnequalExpression _transformUAExpression(final UAUnequalExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETUnequalExpression _result;
    synchronized (_createCache_transformUAExpression_9) {
      if (_createCache_transformUAExpression_9.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_9.get(_cacheKey);
      }
      ETUnequalExpression _createETUnequalExpression = this.factory.createETUnequalExpression();
      _result = _createETUnequalExpression;
      _createCache_transformUAExpression_9.put(_cacheKey, _result);
    }
    _init_transformUAExpression_9(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETUnequalExpression> _createCache_transformUAExpression_9 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_9(final ETUnequalExpression it, final UAUnequalExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETLessExpression _transformUAExpression(final UALessExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETLessExpression _result;
    synchronized (_createCache_transformUAExpression_10) {
      if (_createCache_transformUAExpression_10.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_10.get(_cacheKey);
      }
      ETLessExpression _createETLessExpression = this.factory.createETLessExpression();
      _result = _createETLessExpression;
      _createCache_transformUAExpression_10.put(_cacheKey, _result);
    }
    _init_transformUAExpression_10(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETLessExpression> _createCache_transformUAExpression_10 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_10(final ETLessExpression it, final UALessExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETLessEqualExpression _transformUAExpression(final UALessEqualExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETLessEqualExpression _result;
    synchronized (_createCache_transformUAExpression_11) {
      if (_createCache_transformUAExpression_11.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_11.get(_cacheKey);
      }
      ETLessEqualExpression _createETLessEqualExpression = this.factory.createETLessEqualExpression();
      _result = _createETLessEqualExpression;
      _createCache_transformUAExpression_11.put(_cacheKey, _result);
    }
    _init_transformUAExpression_11(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETLessEqualExpression> _createCache_transformUAExpression_11 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_11(final ETLessEqualExpression it, final UALessEqualExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETGreaterEqualExpression _transformUAExpression(final UAGreaterEqualExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETGreaterEqualExpression _result;
    synchronized (_createCache_transformUAExpression_12) {
      if (_createCache_transformUAExpression_12.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_12.get(_cacheKey);
      }
      ETGreaterEqualExpression _createETGreaterEqualExpression = this.factory.createETGreaterEqualExpression();
      _result = _createETGreaterEqualExpression;
      _createCache_transformUAExpression_12.put(_cacheKey, _result);
    }
    _init_transformUAExpression_12(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETGreaterEqualExpression> _createCache_transformUAExpression_12 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_12(final ETGreaterEqualExpression it, final UAGreaterEqualExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETGreaterExpression _transformUAExpression(final UAGreaterExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETGreaterExpression _result;
    synchronized (_createCache_transformUAExpression_13) {
      if (_createCache_transformUAExpression_13.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_13.get(_cacheKey);
      }
      ETGreaterExpression _createETGreaterExpression = this.factory.createETGreaterExpression();
      _result = _createETGreaterExpression;
      _createCache_transformUAExpression_13.put(_cacheKey, _result);
    }
    _init_transformUAExpression_13(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETGreaterExpression> _createCache_transformUAExpression_13 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_13(final ETGreaterExpression it, final UAGreaterExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETMinExpression _transformUAExpression(final UAMinExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETMinExpression _result;
    synchronized (_createCache_transformUAExpression_14) {
      if (_createCache_transformUAExpression_14.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_14.get(_cacheKey);
      }
      ETMinExpression _createETMinExpression = this.factory.createETMinExpression();
      _result = _createETMinExpression;
      _createCache_transformUAExpression_14.put(_cacheKey, _result);
    }
    _init_transformUAExpression_14(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMinExpression> _createCache_transformUAExpression_14 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_14(final ETMinExpression it, final UAMinExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETMaxExpression _transformUAExpression(final UAMaxExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETMaxExpression _result;
    synchronized (_createCache_transformUAExpression_15) {
      if (_createCache_transformUAExpression_15.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_15.get(_cacheKey);
      }
      ETMaxExpression _createETMaxExpression = this.factory.createETMaxExpression();
      _result = _createETMaxExpression;
      _createCache_transformUAExpression_15.put(_cacheKey, _result);
    }
    _init_transformUAExpression_15(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMaxExpression> _createCache_transformUAExpression_15 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_15(final ETMaxExpression it, final UAMaxExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitLeftExpression _transformUAExpression(final UABitLeftExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitLeftExpression _result;
    synchronized (_createCache_transformUAExpression_16) {
      if (_createCache_transformUAExpression_16.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_16.get(_cacheKey);
      }
      ETBitLeftExpression _createETBitLeftExpression = this.factory.createETBitLeftExpression();
      _result = _createETBitLeftExpression;
      _createCache_transformUAExpression_16.put(_cacheKey, _result);
    }
    _init_transformUAExpression_16(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitLeftExpression> _createCache_transformUAExpression_16 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_16(final ETBitLeftExpression it, final UABitLeftExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitRightExpression _transformUAExpression(final UABitRightExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitRightExpression _result;
    synchronized (_createCache_transformUAExpression_17) {
      if (_createCache_transformUAExpression_17.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_17.get(_cacheKey);
      }
      ETBitRightExpression _createETBitRightExpression = this.factory.createETBitRightExpression();
      _result = _createETBitRightExpression;
      _createCache_transformUAExpression_17.put(_cacheKey, _result);
    }
    _init_transformUAExpression_17(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitRightExpression> _createCache_transformUAExpression_17 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_17(final ETBitRightExpression it, final UABitRightExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETAddExpression _transformUAExpression(final UAAddExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETAddExpression _result;
    synchronized (_createCache_transformUAExpression_18) {
      if (_createCache_transformUAExpression_18.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_18.get(_cacheKey);
      }
      ETAddExpression _createETAddExpression = this.factory.createETAddExpression();
      _result = _createETAddExpression;
      _createCache_transformUAExpression_18.put(_cacheKey, _result);
    }
    _init_transformUAExpression_18(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETAddExpression> _createCache_transformUAExpression_18 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_18(final ETAddExpression it, final UAAddExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETSubtractExpression _transformUAExpression(final UASubtractExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETSubtractExpression _result;
    synchronized (_createCache_transformUAExpression_19) {
      if (_createCache_transformUAExpression_19.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_19.get(_cacheKey);
      }
      ETSubtractExpression _createETSubtractExpression = this.factory.createETSubtractExpression();
      _result = _createETSubtractExpression;
      _createCache_transformUAExpression_19.put(_cacheKey, _result);
    }
    _init_transformUAExpression_19(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSubtractExpression> _createCache_transformUAExpression_19 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_19(final ETSubtractExpression it, final UASubtractExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETMultiplyExpression _transformUAExpression(final UAMultiplyExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETMultiplyExpression _result;
    synchronized (_createCache_transformUAExpression_20) {
      if (_createCache_transformUAExpression_20.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_20.get(_cacheKey);
      }
      ETMultiplyExpression _createETMultiplyExpression = this.factory.createETMultiplyExpression();
      _result = _createETMultiplyExpression;
      _createCache_transformUAExpression_20.put(_cacheKey, _result);
    }
    _init_transformUAExpression_20(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMultiplyExpression> _createCache_transformUAExpression_20 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_20(final ETMultiplyExpression it, final UAMultiplyExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETDivideExpression _transformUAExpression(final UADivideExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETDivideExpression _result;
    synchronized (_createCache_transformUAExpression_21) {
      if (_createCache_transformUAExpression_21.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_21.get(_cacheKey);
      }
      ETDivideExpression _createETDivideExpression = this.factory.createETDivideExpression();
      _result = _createETDivideExpression;
      _createCache_transformUAExpression_21.put(_cacheKey, _result);
    }
    _init_transformUAExpression_21(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETDivideExpression> _createCache_transformUAExpression_21 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_21(final ETDivideExpression it, final UADivideExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETModuloExpression _transformUAExpression(final UAModuloExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETModuloExpression _result;
    synchronized (_createCache_transformUAExpression_22) {
      if (_createCache_transformUAExpression_22.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_22.get(_cacheKey);
      }
      ETModuloExpression _createETModuloExpression = this.factory.createETModuloExpression();
      _result = _createETModuloExpression;
      _createCache_transformUAExpression_22.put(_cacheKey, _result);
    }
    _init_transformUAExpression_22(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETModuloExpression> _createCache_transformUAExpression_22 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_22(final ETModuloExpression it, final UAModuloExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETArrayExpression _transformUAExpression(final UAArrayExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETArrayExpression _result;
    synchronized (_createCache_transformUAExpression_23) {
      if (_createCache_transformUAExpression_23.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_23.get(_cacheKey);
      }
      ETArrayExpression _createETArrayExpression = this.factory.createETArrayExpression();
      _result = _createETArrayExpression;
      _createCache_transformUAExpression_23.put(_cacheKey, _result);
    }
    _init_transformUAExpression_23(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETArrayExpression> _createCache_transformUAExpression_23 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_23(final ETArrayExpression it, final UAArrayExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETStructExpression _transformUAExpression(final UAStructExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETStructExpression _result;
    synchronized (_createCache_transformUAExpression_24) {
      if (_createCache_transformUAExpression_24.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_24.get(_cacheKey);
      }
      ETStructExpression _createETStructExpression = this.factory.createETStructExpression();
      _result = _createETStructExpression;
      _createCache_transformUAExpression_24.put(_cacheKey, _result);
    }
    _init_transformUAExpression_24(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETStructExpression> _createCache_transformUAExpression_24 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_24(final ETStructExpression it, final UAStructExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    String _right = e.getRight();
    it.setRight(_right);
  }
  
  protected ETForallExpression _transformUAExpression(final UAForallExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETForallExpression _result;
    synchronized (_createCache_transformUAExpression_25) {
      if (_createCache_transformUAExpression_25.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_25.get(_cacheKey);
      }
      ETForallExpression _createETForallExpression = this.factory.createETForallExpression();
      _result = _createETForallExpression;
      _createCache_transformUAExpression_25.put(_cacheKey, _result);
    }
    _init_transformUAExpression_25(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETForallExpression> _createCache_transformUAExpression_25 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_25(final ETForallExpression it, final UAForallExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETExistsExpression _transformUAExpression(final UAExistsExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETExistsExpression _result;
    synchronized (_createCache_transformUAExpression_26) {
      if (_createCache_transformUAExpression_26.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_26.get(_cacheKey);
      }
      ETExistsExpression _createETExistsExpression = this.factory.createETExistsExpression();
      _result = _createETExistsExpression;
      _createCache_transformUAExpression_26.put(_cacheKey, _result);
    }
    _init_transformUAExpression_26(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETExistsExpression> _createCache_transformUAExpression_26 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_26(final ETExistsExpression it, final UAExistsExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETAssignmentExpression _transformUAExpression(final UAAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_27) {
      if (_createCache_transformUAExpression_27.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_27.get(_cacheKey);
      }
      ETAssignmentExpression _createETAssignmentExpression = this.factory.createETAssignmentExpression();
      _result = _createETAssignmentExpression;
      _createCache_transformUAExpression_27.put(_cacheKey, _result);
    }
    _init_transformUAExpression_27(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETAssignmentExpression> _createCache_transformUAExpression_27 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_27(final ETAssignmentExpression it, final UAAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETAdditionAssignmentExpression _transformUAExpression(final UAAdditionAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETAdditionAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_28) {
      if (_createCache_transformUAExpression_28.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_28.get(_cacheKey);
      }
      ETAdditionAssignmentExpression _createETAdditionAssignmentExpression = this.factory.createETAdditionAssignmentExpression();
      _result = _createETAdditionAssignmentExpression;
      _createCache_transformUAExpression_28.put(_cacheKey, _result);
    }
    _init_transformUAExpression_28(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETAdditionAssignmentExpression> _createCache_transformUAExpression_28 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_28(final ETAdditionAssignmentExpression it, final UAAdditionAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETSubtractionAssignmentExpression _transformUAExpression(final UASubtractionAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETSubtractionAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_29) {
      if (_createCache_transformUAExpression_29.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_29.get(_cacheKey);
      }
      ETSubtractionAssignmentExpression _createETSubtractionAssignmentExpression = this.factory.createETSubtractionAssignmentExpression();
      _result = _createETSubtractionAssignmentExpression;
      _createCache_transformUAExpression_29.put(_cacheKey, _result);
    }
    _init_transformUAExpression_29(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSubtractionAssignmentExpression> _createCache_transformUAExpression_29 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_29(final ETSubtractionAssignmentExpression it, final UASubtractionAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETMultiplicationAssignmentExpression _transformUAExpression(final UAMultiplicationAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETMultiplicationAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_30) {
      if (_createCache_transformUAExpression_30.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_30.get(_cacheKey);
      }
      ETMultiplicationAssignmentExpression _createETMultiplicationAssignmentExpression = this.factory.createETMultiplicationAssignmentExpression();
      _result = _createETMultiplicationAssignmentExpression;
      _createCache_transformUAExpression_30.put(_cacheKey, _result);
    }
    _init_transformUAExpression_30(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMultiplicationAssignmentExpression> _createCache_transformUAExpression_30 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_30(final ETMultiplicationAssignmentExpression it, final UAMultiplicationAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETDivisionAssignmentExpression _transformUAExpression(final UADivisionAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETDivisionAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_31) {
      if (_createCache_transformUAExpression_31.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_31.get(_cacheKey);
      }
      ETDivisionAssignmentExpression _createETDivisionAssignmentExpression = this.factory.createETDivisionAssignmentExpression();
      _result = _createETDivisionAssignmentExpression;
      _createCache_transformUAExpression_31.put(_cacheKey, _result);
    }
    _init_transformUAExpression_31(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETDivisionAssignmentExpression> _createCache_transformUAExpression_31 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_31(final ETDivisionAssignmentExpression it, final UADivisionAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETModuloAssignmentExpression _transformUAExpression(final UAModuloAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETModuloAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_32) {
      if (_createCache_transformUAExpression_32.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_32.get(_cacheKey);
      }
      ETModuloAssignmentExpression _createETModuloAssignmentExpression = this.factory.createETModuloAssignmentExpression();
      _result = _createETModuloAssignmentExpression;
      _createCache_transformUAExpression_32.put(_cacheKey, _result);
    }
    _init_transformUAExpression_32(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETModuloAssignmentExpression> _createCache_transformUAExpression_32 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_32(final ETModuloAssignmentExpression it, final UAModuloAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitOrAssignmentExpression _transformUAExpression(final UABitOrAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitOrAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_33) {
      if (_createCache_transformUAExpression_33.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_33.get(_cacheKey);
      }
      ETBitOrAssignmentExpression _createETBitOrAssignmentExpression = this.factory.createETBitOrAssignmentExpression();
      _result = _createETBitOrAssignmentExpression;
      _createCache_transformUAExpression_33.put(_cacheKey, _result);
    }
    _init_transformUAExpression_33(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitOrAssignmentExpression> _createCache_transformUAExpression_33 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_33(final ETBitOrAssignmentExpression it, final UABitOrAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitAndAssignmentExpression _transformUAExpression(final UABitAndAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitAndAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_34) {
      if (_createCache_transformUAExpression_34.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_34.get(_cacheKey);
      }
      ETBitAndAssignmentExpression _createETBitAndAssignmentExpression = this.factory.createETBitAndAssignmentExpression();
      _result = _createETBitAndAssignmentExpression;
      _createCache_transformUAExpression_34.put(_cacheKey, _result);
    }
    _init_transformUAExpression_34(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitAndAssignmentExpression> _createCache_transformUAExpression_34 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_34(final ETBitAndAssignmentExpression it, final UABitAndAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitXORAssignmentExpression _transformUAExpression(final UABitXORAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitXORAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_35) {
      if (_createCache_transformUAExpression_35.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_35.get(_cacheKey);
      }
      ETBitXORAssignmentExpression _createETBitXORAssignmentExpression = this.factory.createETBitXORAssignmentExpression();
      _result = _createETBitXORAssignmentExpression;
      _createCache_transformUAExpression_35.put(_cacheKey, _result);
    }
    _init_transformUAExpression_35(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitXORAssignmentExpression> _createCache_transformUAExpression_35 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_35(final ETBitXORAssignmentExpression it, final UABitXORAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitLeftAssignmentExpression _transformUAExpression(final UABitLeftAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitLeftAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_36) {
      if (_createCache_transformUAExpression_36.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_36.get(_cacheKey);
      }
      ETBitLeftAssignmentExpression _createETBitLeftAssignmentExpression = this.factory.createETBitLeftAssignmentExpression();
      _result = _createETBitLeftAssignmentExpression;
      _createCache_transformUAExpression_36.put(_cacheKey, _result);
    }
    _init_transformUAExpression_36(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitLeftAssignmentExpression> _createCache_transformUAExpression_36 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_36(final ETBitLeftAssignmentExpression it, final UABitLeftAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETBitRightAssignmentExpression _transformUAExpression(final UABitRightAssignmentExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBitRightAssignmentExpression _result;
    synchronized (_createCache_transformUAExpression_37) {
      if (_createCache_transformUAExpression_37.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_37.get(_cacheKey);
      }
      ETBitRightAssignmentExpression _createETBitRightAssignmentExpression = this.factory.createETBitRightAssignmentExpression();
      _result = _createETBitRightAssignmentExpression;
      _createCache_transformUAExpression_37.put(_cacheKey, _result);
    }
    _init_transformUAExpression_37(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBitRightAssignmentExpression> _createCache_transformUAExpression_37 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_37(final ETBitRightAssignmentExpression it, final UABitRightAssignmentExpression e, final Environment env) {
    UAExpression _left = e.getLeft();
    ETExpression _transformUAExpression = this.transformUAExpression(_left, env);
    it.setLeft(_transformUAExpression);
    UAExpression _right = e.getRight();
    ETExpression _transformUAExpression_1 = this.transformUAExpression(_right, env);
    it.setRight(_transformUAExpression_1);
  }
  
  protected ETPreIncrementExpression _transformUAExpression(final UAPreIncrementExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETPreIncrementExpression _result;
    synchronized (_createCache_transformUAExpression_38) {
      if (_createCache_transformUAExpression_38.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_38.get(_cacheKey);
      }
      ETPreIncrementExpression _createETPreIncrementExpression = this.factory.createETPreIncrementExpression();
      _result = _createETPreIncrementExpression;
      _createCache_transformUAExpression_38.put(_cacheKey, _result);
    }
    _init_transformUAExpression_38(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETPreIncrementExpression> _createCache_transformUAExpression_38 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_38(final ETPreIncrementExpression it, final UAPreIncrementExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETPreDecrementExpression _transformUAExpression(final UAPreDecrementExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETPreDecrementExpression _result;
    synchronized (_createCache_transformUAExpression_39) {
      if (_createCache_transformUAExpression_39.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_39.get(_cacheKey);
      }
      ETPreDecrementExpression _createETPreDecrementExpression = this.factory.createETPreDecrementExpression();
      _result = _createETPreDecrementExpression;
      _createCache_transformUAExpression_39.put(_cacheKey, _result);
    }
    _init_transformUAExpression_39(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETPreDecrementExpression> _createCache_transformUAExpression_39 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_39(final ETPreDecrementExpression it, final UAPreDecrementExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETMinusExpression _transformUAExpression(final UAMinusExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETMinusExpression _result;
    synchronized (_createCache_transformUAExpression_40) {
      if (_createCache_transformUAExpression_40.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_40.get(_cacheKey);
      }
      ETMinusExpression _createETMinusExpression = this.factory.createETMinusExpression();
      _result = _createETMinusExpression;
      _createCache_transformUAExpression_40.put(_cacheKey, _result);
    }
    _init_transformUAExpression_40(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMinusExpression> _createCache_transformUAExpression_40 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_40(final ETMinusExpression it, final UAMinusExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETPostIncrementExpression _transformUAExpression(final UAPostIncrementExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETPostIncrementExpression _result;
    synchronized (_createCache_transformUAExpression_41) {
      if (_createCache_transformUAExpression_41.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_41.get(_cacheKey);
      }
      ETPostIncrementExpression _createETPostIncrementExpression = this.factory.createETPostIncrementExpression();
      _result = _createETPostIncrementExpression;
      _createCache_transformUAExpression_41.put(_cacheKey, _result);
    }
    _init_transformUAExpression_41(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETPostIncrementExpression> _createCache_transformUAExpression_41 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_41(final ETPostIncrementExpression it, final UAPostIncrementExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETPostDecrementExpression _transformUAExpression(final UAPostDecrementExpression e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETPostDecrementExpression _result;
    synchronized (_createCache_transformUAExpression_42) {
      if (_createCache_transformUAExpression_42.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_42.get(_cacheKey);
      }
      ETPostDecrementExpression _createETPostDecrementExpression = this.factory.createETPostDecrementExpression();
      _result = _createETPostDecrementExpression;
      _createCache_transformUAExpression_42.put(_cacheKey, _result);
    }
    _init_transformUAExpression_42(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETPostDecrementExpression> _createCache_transformUAExpression_42 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_42(final ETPostDecrementExpression it, final UAPostDecrementExpression e, final Environment env) {
    ETExpression _transformUAExpression = this.transformUAExpression(e, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETBooleanLiteral _transformUAExpression(final UABooleanLiteral e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETBooleanLiteral _result;
    synchronized (_createCache_transformUAExpression_43) {
      if (_createCache_transformUAExpression_43.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_43.get(_cacheKey);
      }
      ETBooleanLiteral _createETBooleanLiteral = this.factory.createETBooleanLiteral();
      _result = _createETBooleanLiteral;
      _createCache_transformUAExpression_43.put(_cacheKey, _result);
    }
    _init_transformUAExpression_43(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETBooleanLiteral> _createCache_transformUAExpression_43 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_43(final ETBooleanLiteral it, final UABooleanLiteral e, final Environment env) {
    Boolean _value = e.getValue();
    it.setValue(_value);
  }
  
  protected ETNumberLiteral _transformUAExpression(final UANumberLiteral e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETNumberLiteral _result;
    synchronized (_createCache_transformUAExpression_44) {
      if (_createCache_transformUAExpression_44.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_44.get(_cacheKey);
      }
      ETNumberLiteral _createETNumberLiteral = this.factory.createETNumberLiteral();
      _result = _createETNumberLiteral;
      _createCache_transformUAExpression_44.put(_cacheKey, _result);
    }
    _init_transformUAExpression_44(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETNumberLiteral> _createCache_transformUAExpression_44 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_44(final ETNumberLiteral it, final UANumberLiteral e, final Environment env) {
    int _value = e.getValue();
    it.setValue(_value);
  }
  
  protected ETReference _transformUAExpression(final UAReference e, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(e, env);
    final ETReference _result;
    synchronized (_createCache_transformUAExpression_45) {
      if (_createCache_transformUAExpression_45.containsKey(_cacheKey)) {
        return _createCache_transformUAExpression_45.get(_cacheKey);
      }
      ETReference _createETReference = this.factory.createETReference();
      _result = _createETReference;
      _createCache_transformUAExpression_45.put(_cacheKey, _result);
    }
    _init_transformUAExpression_45(_result, e, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETReference> _createCache_transformUAExpression_45 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAExpression_45(final ETReference it, final UAReference e, final Environment env) {
    try {
      String _name = e.getName();
      final EObject t = env.find(_name);
      boolean _equals = Objects.equal(t, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Couldn\'t find \"");
        String _name_1 = e.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
        Error _error = new Error(_builder.toString());
        throw _error;
      } else {
        it.setTarget(t);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Each Declaration, which is either a VariableDeclaration
   * defining one or more variables, or a TypeDeclaration
   * defining one or more types
   */
  protected ETDeclaration _transformUADeclaration(final UADeclaration declaration, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(declaration, env);
    final ETDeclaration _result;
    synchronized (_createCache_transformUADeclaration) {
      if (_createCache_transformUADeclaration.containsKey(_cacheKey)) {
        return _createCache_transformUADeclaration.get(_cacheKey);
      }
      ETDeclaration _createETDeclaration = this.factory.createETDeclaration();
      _result = _createETDeclaration;
      _createCache_transformUADeclaration.put(_cacheKey, _result);
    }
    _init_transformUADeclaration(_result, declaration, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETDeclaration> _createCache_transformUADeclaration = CollectionLiterals.newHashMap();
  
  private void _init_transformUADeclaration(final ETDeclaration it, final UADeclaration declaration, final Environment env) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unable to transform declaration ");
      _builder.append(declaration, "");
      Error _error = new Error(_builder.toString());
      throw _error;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ETVariableDeclaration _transformUADeclaration(final UAVariableDeclaration d, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(d, env);
    final ETVariableDeclaration _result;
    synchronized (_createCache_transformUADeclaration_1) {
      if (_createCache_transformUADeclaration_1.containsKey(_cacheKey)) {
        return _createCache_transformUADeclaration_1.get(_cacheKey);
      }
      ETVariableDeclaration _createETVariableDeclaration = this.factory.createETVariableDeclaration();
      _result = _createETVariableDeclaration;
      _createCache_transformUADeclaration_1.put(_cacheKey, _result);
    }
    _init_transformUADeclaration_1(_result, d, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETVariableDeclaration> _createCache_transformUADeclaration_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformUADeclaration_1(final ETVariableDeclaration it, final UAVariableDeclaration d, final Environment env) {
    UAType _type = d.getType();
    ETType _transformUAType = this.transformUAType(_type, env);
    it.setType(_transformUAType);
    EList<ETVariableID> _variables = it.getVariables();
    EList<UAVariableID> _variables_1 = d.getVariables();
    final Function1<UAVariableID,ETVariableID> _function = new Function1<UAVariableID,ETVariableID>() {
        public ETVariableID apply(final UAVariableID it) {
          ETVariableID _transformUAVariableID = Uppaal2EcdarText.this.transformUAVariableID(it, env);
          return _transformUAVariableID;
        }
      };
    List<ETVariableID> _map = ListExtensions.<UAVariableID, ETVariableID>map(_variables_1, _function);
    Iterables.<ETVariableID>addAll(_variables, _map);
  }
  
  protected ETTypeDeclaration _transformUADeclaration(final UATypeDeclaration d, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(d, env);
    final ETTypeDeclaration _result;
    synchronized (_createCache_transformUADeclaration_2) {
      if (_createCache_transformUADeclaration_2.containsKey(_cacheKey)) {
        return _createCache_transformUADeclaration_2.get(_cacheKey);
      }
      ETTypeDeclaration _createETTypeDeclaration = this.factory.createETTypeDeclaration();
      _result = _createETTypeDeclaration;
      _createCache_transformUADeclaration_2.put(_cacheKey, _result);
    }
    _init_transformUADeclaration_2(_result, d, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeDeclaration> _createCache_transformUADeclaration_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformUADeclaration_2(final ETTypeDeclaration it, final UATypeDeclaration d, final Environment env) {
    UAType _baseType = d.getBaseType();
    ETType _transformUAType = this.transformUAType(_baseType, env);
    it.setBaseType(_transformUAType);
    EList<ETTypeID> _types = it.getTypes();
    EList<UATypeID> _types_1 = d.getTypes();
    final Function1<UATypeID,ETTypeID> _function = new Function1<UATypeID,ETTypeID>() {
        public ETTypeID apply(final UATypeID it) {
          ETTypeID _transformUATypeID = Uppaal2EcdarText.this.transformUATypeID(it, env);
          return _transformUATypeID;
        }
      };
    List<ETTypeID> _map = ListExtensions.<UATypeID, ETTypeID>map(_types_1, _function);
    Iterables.<ETTypeID>addAll(_types, _map);
  }
  
  public ETVariableID transformUAVariableID(final UAVariableID variable, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(variable, env);
    final ETVariableID _result;
    synchronized (_createCache_transformUAVariableID) {
      if (_createCache_transformUAVariableID.containsKey(_cacheKey)) {
        return _createCache_transformUAVariableID.get(_cacheKey);
      }
      ETVariableID _createETVariableID = this.factory.createETVariableID();
      _result = _createETVariableID;
      _createCache_transformUAVariableID.put(_cacheKey, _result);
    }
    _init_transformUAVariableID(_result, variable, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETVariableID> _createCache_transformUAVariableID = CollectionLiterals.newHashMap();
  
  private void _init_transformUAVariableID(final ETVariableID it, final UAVariableID variable, final Environment env) {
    String _name = variable.getName();
    it.setName(_name);
    EList<ETArrayDeclaration> _dimensions = it.getDimensions();
    EList<UAArrayDeclaration> _dimensions_1 = variable.getDimensions();
    final Function1<UAArrayDeclaration,ETArrayDeclaration> _function = new Function1<UAArrayDeclaration,ETArrayDeclaration>() {
        public ETArrayDeclaration apply(final UAArrayDeclaration it) {
          ETArrayDeclaration _transformUAArrayDeclaration = Uppaal2EcdarText.this.transformUAArrayDeclaration(it, env);
          return _transformUAArrayDeclaration;
        }
      };
    List<ETArrayDeclaration> _map = ListExtensions.<UAArrayDeclaration, ETArrayDeclaration>map(_dimensions_1, _function);
    Iterables.<ETArrayDeclaration>addAll(_dimensions, _map);
    UAInitialiser _initialiser = variable.getInitialiser();
    ETInitialiser _transformUAInitialiser = _initialiser==null?(ETInitialiser)null:this.transformUAInitialiser(_initialiser, env);
    it.setInitialiser(_transformUAInitialiser);
  }
  
  public ETArrayDeclaration transformUAArrayDeclaration(final UAArrayDeclaration d, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(d, env);
    final ETArrayDeclaration _result;
    synchronized (_createCache_transformUAArrayDeclaration) {
      if (_createCache_transformUAArrayDeclaration.containsKey(_cacheKey)) {
        return _createCache_transformUAArrayDeclaration.get(_cacheKey);
      }
      ETArrayDeclaration _createETArrayDeclaration = this.factory.createETArrayDeclaration();
      _result = _createETArrayDeclaration;
      _createCache_transformUAArrayDeclaration.put(_cacheKey, _result);
    }
    _init_transformUAArrayDeclaration(_result, d, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETArrayDeclaration> _createCache_transformUAArrayDeclaration = CollectionLiterals.newHashMap();
  
  private void _init_transformUAArrayDeclaration(final ETArrayDeclaration it, final UAArrayDeclaration d, final Environment env) {
    UAExpression _size = d.getSize();
    ETExpression _transformUAExpression = this.transformUAExpression(_size, env);
    it.setSize(_transformUAExpression);
  }
  
  protected ETInitialiser _transformUAInitialiser(final UAInitialiser initialiser, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(initialiser, env);
    final ETInitialiser _result;
    synchronized (_createCache_transformUAInitialiser) {
      if (_createCache_transformUAInitialiser.containsKey(_cacheKey)) {
        return _createCache_transformUAInitialiser.get(_cacheKey);
      }
      ETInitialiser _createETInitialiser = this.factory.createETInitialiser();
      _result = _createETInitialiser;
      _createCache_transformUAInitialiser.put(_cacheKey, _result);
    }
    _init_transformUAInitialiser(_result, initialiser, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETInitialiser> _createCache_transformUAInitialiser = CollectionLiterals.newHashMap();
  
  private void _init_transformUAInitialiser(final ETInitialiser it, final UAInitialiser initialiser, final Environment env) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unable to transform initialiser ");
      _builder.append(initialiser, "");
      Error _error = new Error(_builder.toString());
      throw _error;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ETSingleInitialiser _transformUAInitialiser(final UASingleInitialiser in, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(in, env);
    final ETSingleInitialiser _result;
    synchronized (_createCache_transformUAInitialiser_1) {
      if (_createCache_transformUAInitialiser_1.containsKey(_cacheKey)) {
        return _createCache_transformUAInitialiser_1.get(_cacheKey);
      }
      ETSingleInitialiser _createETSingleInitialiser = this.factory.createETSingleInitialiser();
      _result = _createETSingleInitialiser;
      _createCache_transformUAInitialiser_1.put(_cacheKey, _result);
    }
    _init_transformUAInitialiser_1(_result, in, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSingleInitialiser> _createCache_transformUAInitialiser_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAInitialiser_1(final ETSingleInitialiser it, final UASingleInitialiser in, final Environment env) {
    UAExpression _expression = in.getExpression();
    ETExpression _transformUAExpression = this.transformUAExpression(_expression, env);
    it.setExpression(_transformUAExpression);
  }
  
  protected ETMultiInitialiser _transformUAInitialiser(final UAMultiInitialiser in, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(in, env);
    final ETMultiInitialiser _result;
    synchronized (_createCache_transformUAInitialiser_2) {
      if (_createCache_transformUAInitialiser_2.containsKey(_cacheKey)) {
        return _createCache_transformUAInitialiser_2.get(_cacheKey);
      }
      ETMultiInitialiser _createETMultiInitialiser = this.factory.createETMultiInitialiser();
      _result = _createETMultiInitialiser;
      _createCache_transformUAInitialiser_2.put(_cacheKey, _result);
    }
    _init_transformUAInitialiser_2(_result, in, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETMultiInitialiser> _createCache_transformUAInitialiser_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformUAInitialiser_2(final ETMultiInitialiser it, final UAMultiInitialiser in, final Environment env) {
    EList<ETInitialiser> _initialisers = it.getInitialisers();
    EList<UAInitialiser> _initialisers_1 = in.getInitialisers();
    final Function1<UAInitialiser,ETInitialiser> _function = new Function1<UAInitialiser,ETInitialiser>() {
        public ETInitialiser apply(final UAInitialiser it) {
          ETInitialiser _transformUAInitialiser = Uppaal2EcdarText.this.transformUAInitialiser(it, env);
          return _transformUAInitialiser;
        }
      };
    List<ETInitialiser> _map = ListExtensions.<UAInitialiser, ETInitialiser>map(_initialisers_1, _function);
    Iterables.<ETInitialiser>addAll(_initialisers, _map);
  }
  
  public ETType transformUAType(final UAType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETType _result;
    synchronized (_createCache_transformUAType) {
      if (_createCache_transformUAType.containsKey(_cacheKey)) {
        return _createCache_transformUAType.get(_cacheKey);
      }
      ETType _createETType = this.factory.createETType();
      _result = _createETType;
      _createCache_transformUAType.put(_cacheKey, _result);
    }
    _init_transformUAType(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETType> _createCache_transformUAType = CollectionLiterals.newHashMap();
  
  private void _init_transformUAType(final ETType it, final UAType t, final Environment env) {
    UATypeModifiers _modifiers = t.getModifiers();
    ETTypeModifiers _transformUATypeModifiers = this.transformUATypeModifiers(_modifiers);
    it.setModifiers(_transformUATypeModifiers);
    UATypeIdentifier _identifier = t.getIdentifier();
    ETTypeIdentifier _transformUATypeIdentifier = this.transformUATypeIdentifier(_identifier, env);
    it.setIdentifier(_transformUATypeIdentifier);
  }
  
  public ETTypeModifiers transformUATypeModifiers(final UATypeModifiers modifiers) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(modifiers);
    final ETTypeModifiers _result;
    synchronized (_createCache_transformUATypeModifiers) {
      if (_createCache_transformUATypeModifiers.containsKey(_cacheKey)) {
        return _createCache_transformUATypeModifiers.get(_cacheKey);
      }
      ETTypeModifiers _createETTypeModifiers = this.factory.createETTypeModifiers();
      _result = _createETTypeModifiers;
      _createCache_transformUATypeModifiers.put(_cacheKey, _result);
    }
    _init_transformUATypeModifiers(_result, modifiers);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeModifiers> _createCache_transformUATypeModifiers = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeModifiers(final ETTypeModifiers it, final UATypeModifiers modifiers) {
    boolean _isConst = modifiers.isConst();
    it.setConst(_isConst);
    boolean _isMeta = modifiers.isMeta();
    it.setMeta(_isMeta);
    boolean _isUrgent = modifiers.isUrgent();
    it.setUrgent(_isUrgent);
  }
  
  protected ETIntegerType _transformUATypeIdentifier(final UAIntegerType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETIntegerType _result;
    synchronized (_createCache_transformUATypeIdentifier) {
      if (_createCache_transformUATypeIdentifier.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier.get(_cacheKey);
      }
      ETIntegerType _createETIntegerType = this.factory.createETIntegerType();
      _result = _createETIntegerType;
      _createCache_transformUATypeIdentifier.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETIntegerType> _createCache_transformUATypeIdentifier = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier(final ETIntegerType it, final UAIntegerType t, final Environment env) {
    UAExpression _min = t.getMin();
    ETExpression _transformUAExpression = _min==null?(ETExpression)null:this.transformUAExpression(_min, env);
    it.setMin(_transformUAExpression);
    UAExpression _max = t.getMax();
    ETExpression _transformUAExpression_1 = _max==null?(ETExpression)null:this.transformUAExpression(_max, env);
    it.setMax(_transformUAExpression_1);
  }
  
  protected ETTypeIdentifier _transformUATypeIdentifier(final UAClockType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETClockType _result;
    synchronized (_createCache_transformUATypeIdentifier_1) {
      if (_createCache_transformUATypeIdentifier_1.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_1.get(_cacheKey);
      }
      ETClockType _createETClockType = this.factory.createETClockType();
      _result = _createETClockType;
      _createCache_transformUATypeIdentifier_1.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_1(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeIdentifier> _createCache_transformUATypeIdentifier_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_1(final ETClockType it, final UAClockType t, final Environment env) {
  }
  
  protected ETTypeIdentifier _transformUATypeIdentifier(final UAChannelType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETActionType _result;
    synchronized (_createCache_transformUATypeIdentifier_2) {
      if (_createCache_transformUATypeIdentifier_2.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_2.get(_cacheKey);
      }
      ETActionType _createETActionType = this.factory.createETActionType();
      _result = _createETActionType;
      _createCache_transformUATypeIdentifier_2.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_2(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeIdentifier> _createCache_transformUATypeIdentifier_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_2(final ETActionType it, final UAChannelType t, final Environment env) {
  }
  
  protected ETTypeIdentifier _transformUATypeIdentifier(final UABooleanType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETBooleanType _result;
    synchronized (_createCache_transformUATypeIdentifier_3) {
      if (_createCache_transformUATypeIdentifier_3.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_3.get(_cacheKey);
      }
      ETBooleanType _createETBooleanType = this.factory.createETBooleanType();
      _result = _createETBooleanType;
      _createCache_transformUATypeIdentifier_3.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_3(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeIdentifier> _createCache_transformUATypeIdentifier_3 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_3(final ETBooleanType it, final UABooleanType t, final Environment env) {
  }
  
  protected ETScalarType _transformUATypeIdentifier(final UAScalarType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETScalarType _result;
    synchronized (_createCache_transformUATypeIdentifier_4) {
      if (_createCache_transformUATypeIdentifier_4.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_4.get(_cacheKey);
      }
      ETScalarType _createETScalarType = this.factory.createETScalarType();
      _result = _createETScalarType;
      _createCache_transformUATypeIdentifier_4.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_4(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETScalarType> _createCache_transformUATypeIdentifier_4 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_4(final ETScalarType it, final UAScalarType t, final Environment env) {
    UAExpression _size = t.getSize();
    ETExpression _transformUAExpression = this.transformUAExpression(_size, env);
    it.setSize(_transformUAExpression);
  }
  
  protected ETStructType _transformUATypeIdentifier(final UAStructType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETStructType _result;
    synchronized (_createCache_transformUATypeIdentifier_5) {
      if (_createCache_transformUATypeIdentifier_5.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_5.get(_cacheKey);
      }
      ETStructType _createETStructType = this.factory.createETStructType();
      _result = _createETStructType;
      _createCache_transformUATypeIdentifier_5.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_5(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETStructType> _createCache_transformUATypeIdentifier_5 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_5(final ETStructType it, final UAStructType t, final Environment env) {
    EList<ETFieldDeclaration> _declarations = it.getDeclarations();
    EList<UAFieldDeclaration> _declarations_1 = t.getDeclarations();
    final Function1<UAFieldDeclaration,ETFieldDeclaration> _function = new Function1<UAFieldDeclaration,ETFieldDeclaration>() {
        public ETFieldDeclaration apply(final UAFieldDeclaration it) {
          ETFieldDeclaration _transformUAFieldDeclaration = Uppaal2EcdarText.this.transformUAFieldDeclaration(it, env);
          return _transformUAFieldDeclaration;
        }
      };
    List<ETFieldDeclaration> _map = ListExtensions.<UAFieldDeclaration, ETFieldDeclaration>map(_declarations_1, _function);
    Iterables.<ETFieldDeclaration>addAll(_declarations, _map);
  }
  
  protected ETTypeReference _transformUATypeIdentifier(final UAUserType t, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(t, env);
    final ETTypeReference _result;
    synchronized (_createCache_transformUATypeIdentifier_6) {
      if (_createCache_transformUATypeIdentifier_6.containsKey(_cacheKey)) {
        return _createCache_transformUATypeIdentifier_6.get(_cacheKey);
      }
      ETTypeReference _createETTypeReference = this.factory.createETTypeReference();
      _result = _createETTypeReference;
      _createCache_transformUATypeIdentifier_6.put(_cacheKey, _result);
    }
    _init_transformUATypeIdentifier_6(_result, t, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeReference> _createCache_transformUATypeIdentifier_6 = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeIdentifier_6(final ETTypeReference it, final UAUserType t, final Environment env) {
    String _name = t.getName();
    EObject _find = env.find(_name);
    it.setTarget(((ETTypeID) _find));
  }
  
  public ETFieldDeclaration transformUAFieldDeclaration(final UAFieldDeclaration d, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(d, env);
    final ETFieldDeclaration _result;
    synchronized (_createCache_transformUAFieldDeclaration) {
      if (_createCache_transformUAFieldDeclaration.containsKey(_cacheKey)) {
        return _createCache_transformUAFieldDeclaration.get(_cacheKey);
      }
      ETFieldDeclaration _createETFieldDeclaration = this.factory.createETFieldDeclaration();
      _result = _createETFieldDeclaration;
      _createCache_transformUAFieldDeclaration.put(_cacheKey, _result);
    }
    _init_transformUAFieldDeclaration(_result, d, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETFieldDeclaration> _createCache_transformUAFieldDeclaration = CollectionLiterals.newHashMap();
  
  private void _init_transformUAFieldDeclaration(final ETFieldDeclaration it, final UAFieldDeclaration d, final Environment env) {
    UAType _type = d.getType();
    ETType _transformUAType = this.transformUAType(_type, env);
    it.setType(_transformUAType);
    EList<ETFieldID> _fields = it.getFields();
    EList<UAFieldID> _fields_1 = d.getFields();
    final Function1<UAFieldID,ETFieldID> _function = new Function1<UAFieldID,ETFieldID>() {
        public ETFieldID apply(final UAFieldID it) {
          ETFieldID _transformUAFieldID = Uppaal2EcdarText.this.transformUAFieldID(it, env);
          return _transformUAFieldID;
        }
      };
    List<ETFieldID> _map = ListExtensions.<UAFieldID, ETFieldID>map(_fields_1, _function);
    Iterables.<ETFieldID>addAll(_fields, _map);
  }
  
  public ETFieldID transformUAFieldID(final UAFieldID field, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(field, env);
    final ETFieldID _result;
    synchronized (_createCache_transformUAFieldID) {
      if (_createCache_transformUAFieldID.containsKey(_cacheKey)) {
        return _createCache_transformUAFieldID.get(_cacheKey);
      }
      ETFieldID _createETFieldID = this.factory.createETFieldID();
      _result = _createETFieldID;
      _createCache_transformUAFieldID.put(_cacheKey, _result);
    }
    _init_transformUAFieldID(_result, field, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETFieldID> _createCache_transformUAFieldID = CollectionLiterals.newHashMap();
  
  private void _init_transformUAFieldID(final ETFieldID it, final UAFieldID field, final Environment env) {
    String _name = field.getName();
    it.setName(_name);
    EList<ETArrayDeclaration> _dimensions = it.getDimensions();
    EList<UAArrayDeclaration> _dimensions_1 = field.getDimensions();
    final Function1<UAArrayDeclaration,ETArrayDeclaration> _function = new Function1<UAArrayDeclaration,ETArrayDeclaration>() {
        public ETArrayDeclaration apply(final UAArrayDeclaration it) {
          ETArrayDeclaration _transformUAArrayDeclaration = Uppaal2EcdarText.this.transformUAArrayDeclaration(it, env);
          return _transformUAArrayDeclaration;
        }
      };
    List<ETArrayDeclaration> _map = ListExtensions.<UAArrayDeclaration, ETArrayDeclaration>map(_dimensions_1, _function);
    Iterables.<ETArrayDeclaration>addAll(_dimensions, _map);
  }
  
  public ETTypeID transformUATypeID(final UATypeID type, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(type, env);
    final ETTypeID _result;
    synchronized (_createCache_transformUATypeID) {
      if (_createCache_transformUATypeID.containsKey(_cacheKey)) {
        return _createCache_transformUATypeID.get(_cacheKey);
      }
      ETTypeID _createETTypeID = this.factory.createETTypeID();
      _result = _createETTypeID;
      _createCache_transformUATypeID.put(_cacheKey, _result);
    }
    _init_transformUATypeID(_result, type, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETTypeID> _createCache_transformUATypeID = CollectionLiterals.newHashMap();
  
  private void _init_transformUATypeID(final ETTypeID it, final UATypeID type, final Environment env) {
    String _name = type.getName();
    it.setName(_name);
    EList<ETArrayDeclaration> _dimensions = it.getDimensions();
    EList<UAArrayDeclaration> _dimensions_1 = type.getDimensions();
    final Function1<UAArrayDeclaration,ETArrayDeclaration> _function = new Function1<UAArrayDeclaration,ETArrayDeclaration>() {
        public ETArrayDeclaration apply(final UAArrayDeclaration it) {
          ETArrayDeclaration _transformUAArrayDeclaration = Uppaal2EcdarText.this.transformUAArrayDeclaration(it, env);
          return _transformUAArrayDeclaration;
        }
      };
    List<ETArrayDeclaration> _map = ListExtensions.<UAArrayDeclaration, ETArrayDeclaration>map(_dimensions_1, _function);
    Iterables.<ETArrayDeclaration>addAll(_dimensions, _map);
  }
  
  public ETParameter transformUAParameter(final UAParameter p, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(p, env);
    final ETParameter _result;
    synchronized (_createCache_transformUAParameter) {
      if (_createCache_transformUAParameter.containsKey(_cacheKey)) {
        return _createCache_transformUAParameter.get(_cacheKey);
      }
      ETParameter _createETParameter = this.factory.createETParameter();
      _result = _createETParameter;
      _createCache_transformUAParameter.put(_cacheKey, _result);
    }
    _init_transformUAParameter(_result, p, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETParameter> _createCache_transformUAParameter = CollectionLiterals.newHashMap();
  
  private void _init_transformUAParameter(final ETParameter it, final UAParameter p, final Environment env) {
    UAType _type = p.getType();
    ETType _transformUAType = this.transformUAType(_type, env);
    it.setType(_transformUAType);
    String _name = p.getName();
    it.setName(_name);
    EList<ETArrayDeclaration> _dimensions = it.getDimensions();
    EList<UAArrayDeclaration> _dimensions_1 = p.getDimensions();
    final Function1<UAArrayDeclaration,ETArrayDeclaration> _function = new Function1<UAArrayDeclaration,ETArrayDeclaration>() {
        public ETArrayDeclaration apply(final UAArrayDeclaration it) {
          ETArrayDeclaration _transformUAArrayDeclaration = Uppaal2EcdarText.this.transformUAArrayDeclaration(it, env);
          return _transformUAArrayDeclaration;
        }
      };
    List<ETArrayDeclaration> _map = ListExtensions.<UAArrayDeclaration, ETArrayDeclaration>map(_dimensions_1, _function);
    Iterables.<ETArrayDeclaration>addAll(_dimensions, _map);
  }
  
  public ETSpecificationDefinition transformTemplate(final TemplateType template, final Environment parentEnv) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(template, parentEnv);
    final ETSpecificationDefinition _result;
    synchronized (_createCache_transformTemplate) {
      if (_createCache_transformTemplate.containsKey(_cacheKey)) {
        return _createCache_transformTemplate.get(_cacheKey);
      }
      ETSpecificationDefinition _xifexpression = null;
      ParameterType _parameter = template.getParameter();
      boolean _equals = Objects.equal(_parameter, null);
      if (_equals) {
        ETSpecificationDefinition _createETSpecificationDefinition = this.factory.createETSpecificationDefinition();
        _xifexpression = _createETSpecificationDefinition;
      } else {
        ETSpecificationTemplate _createETSpecificationTemplate = this.factory.createETSpecificationTemplate();
        _xifexpression = _createETSpecificationTemplate;
      }
      _result = _xifexpression;
      _createCache_transformTemplate.put(_cacheKey, _result);
    }
    _init_transformTemplate(_result, template, parentEnv);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSpecificationDefinition> _createCache_transformTemplate = CollectionLiterals.newHashMap();
  
  private void _init_transformTemplate(final ETSpecificationDefinition spec, final TemplateType template, final Environment parentEnv) {
    Environment _environment = new Environment(parentEnv);
    final Environment env = _environment;
    ParameterType _parameter = template.getParameter();
    boolean _notEquals = (!Objects.equal(_parameter, null));
    if (_notEquals) {
      final ETSpecificationTemplate t = ((ETSpecificationTemplate) spec);
      EList<ETParameter> _parameters = t.getParameters();
      ParameterType _parameter_1 = template.getParameter();
      String _value = _parameter_1.getValue();
      List<UAParameter> _parseUAParameters = this.parseUAParameters(_value);
      final Function1<UAParameter,ETParameter> _function = new Function1<UAParameter,ETParameter>() {
          public ETParameter apply(final UAParameter it) {
            ETParameter _transformUAParameter = Uppaal2EcdarText.this.transformUAParameter(it, env);
            return _transformUAParameter;
          }
        };
      List<ETParameter> _map = ListExtensions.<UAParameter, ETParameter>map(_parseUAParameters, _function);
      Iterables.<ETParameter>addAll(_parameters, _map);
      EList<ETParameter> _parameters_1 = t.getParameters();
      final Procedure1<ETParameter> _function_1 = new Procedure1<ETParameter>() {
          public void apply(final ETParameter it) {
            String _name = it.getName();
            env.define(_name, it);
          }
        };
      IterableExtensions.<ETParameter>forEach(_parameters_1, _function_1);
    }
    NameType _name = template.getName();
    String _value_1 = _name.getValue();
    spec.setName(_value_1);
    ETSpecificationBody _createETSpecificationBody = this.factory.createETSpecificationBody();
    spec.setBody(_createETSpecificationBody);
    ETSpecificationBody _body = spec.getBody();
    ETDeclarations _createETDeclarations = this.factory.createETDeclarations();
    _body.setDeclarations(_createETDeclarations);
    String _declaration = template.getDeclaration();
    boolean _notEquals_1 = (!Objects.equal(_declaration, null));
    if (_notEquals_1) {
      String _declaration_1 = template.getDeclaration();
      List<UADeclaration> _parseUADeclarations = this.parseUADeclarations(_declaration_1);
      for (final UADeclaration declaration : _parseUADeclarations) {
        {
          final ETDeclaration d = this.transformUADeclaration(declaration, env);
          ETSpecificationBody _body_1 = spec.getBody();
          ETDeclarations _declarations = _body_1.getDeclarations();
          EList<ETDeclaration> _declarations_1 = _declarations.getDeclarations();
          _declarations_1.add(d);
          env.define(d);
        }
      }
    }
    EList<LocationType> _location = template.getLocation();
    for (final LocationType location : _location) {
      boolean _isInitial = this.isInitial(template, location);
      if (_isInitial) {
        ETSpecificationBody _body_1 = spec.getBody();
        ETLocation _transformLocation = this.transformLocation(location, true, env);
        _body_1.setInitialLocation(_transformLocation);
      } else {
        ETSpecificationBody _body_2 = spec.getBody();
        EList<ETLocation> _locations = _body_2.getLocations();
        ETLocation _transformLocation_1 = this.transformLocation(location, false, env);
        _locations.add(_transformLocation_1);
      }
    }
    EList<TransitionType> _transition = template.getTransition();
    for (final TransitionType transition : _transition) {
      {
        final ETEdge edge = this.transformTransition(transition, spec, env);
        boolean _isControllable = transition.isControllable();
        edge.setControllable(_isControllable);
        EList<LocationType> _location_1 = template.getLocation();
        final Function1<LocationType,Boolean> _function_2 = new Function1<LocationType,Boolean>() {
            public Boolean apply(final LocationType it) {
              String _id = it.getId();
              SourceType _source = transition.getSource();
              String _ref = _source.getRef();
              boolean _equals = _id.equals(_ref);
              return Boolean.valueOf(_equals);
            }
          };
        final LocationType sourceLocation = IterableExtensions.<LocationType>findFirst(_location_1, _function_2);
        boolean _isInitial_1 = this.isInitial(template, sourceLocation);
        final ETLocation sourceLoc = this.transformLocation(sourceLocation, _isInitial_1, env);
        EList<LocationType> _location_2 = template.getLocation();
        final Function1<LocationType,Boolean> _function_3 = new Function1<LocationType,Boolean>() {
            public Boolean apply(final LocationType it) {
              String _id = it.getId();
              TargetType _target = transition.getTarget();
              String _ref = _target.getRef();
              boolean _equals = _id.equals(_ref);
              return Boolean.valueOf(_equals);
            }
          };
        final LocationType targetLocation = IterableExtensions.<LocationType>findFirst(_location_2, _function_3);
        boolean _isInitial_2 = this.isInitial(template, targetLocation);
        ETLocation _transformLocation_2 = this.transformLocation(targetLocation, _isInitial_2, env);
        edge.setTarget(_transformLocation_2);
        EList<ETEdge> _edges = sourceLoc.getEdges();
        _edges.add(edge);
      }
    }
  }
  
  public boolean isInitial(final TemplateType template, final LocationType location) {
    String _id = location.getId();
    InitType _init = template.getInit();
    String _ref = _init.getRef();
    boolean _equals = _id.equals(_ref);
    return _equals;
  }
  
  public ETEdge transformTransition(final TransitionType transition, final ETSpecificationDefinition spec, final Environment parentEnv) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(transition, spec, parentEnv);
    final ETEdge _result;
    synchronized (_createCache_transformTransition) {
      if (_createCache_transformTransition.containsKey(_cacheKey)) {
        return _createCache_transformTransition.get(_cacheKey);
      }
      ETEdge _createETEdge = this.factory.createETEdge();
      _result = _createETEdge;
      _createCache_transformTransition.put(_cacheKey, _result);
    }
    _init_transformTransition(_result, transition, spec, parentEnv);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETEdge> _createCache_transformTransition = CollectionLiterals.newHashMap();
  
  private void _init_transformTransition(final ETEdge edge, final TransitionType transition, final ETSpecificationDefinition spec, final Environment parentEnv) {
    Environment _environment = new Environment(parentEnv);
    final Environment env = _environment;
    EList<LabelType> _label = transition.getLabel();
    final Function1<LabelType,Boolean> _function = new Function1<LabelType,Boolean>() {
        public Boolean apply(final LabelType it) {
          KindType _kind = it.getKind();
          boolean _equals = Objects.equal(_kind, KindType.SELECT);
          return Boolean.valueOf(_equals);
        }
      };
    LabelType _findFirst = IterableExtensions.<LabelType>findFirst(_label, _function);
    final String select = _findFirst==null?(String)null:_findFirst.getValue();
    boolean _notEquals = (!Objects.equal(select, null));
    if (_notEquals) {
      EList<ETSelect> _selects = edge.getSelects();
      List<UASelect> _parseUASelects = this.parseUASelects(select);
      final Function1<UASelect,ETSelect> _function_1 = new Function1<UASelect,ETSelect>() {
          public ETSelect apply(final UASelect it) {
            ETSelect _transformUASelect = Uppaal2EcdarText.this.transformUASelect(it, env);
            return _transformUASelect;
          }
        };
      List<ETSelect> _map = ListExtensions.<UASelect, ETSelect>map(_parseUASelects, _function_1);
      Iterables.<ETSelect>addAll(_selects, _map);
      EList<ETSelect> _selects_1 = edge.getSelects();
      final Procedure1<ETSelect> _function_2 = new Procedure1<ETSelect>() {
          public void apply(final ETSelect it) {
            String _name = it.getName();
            env.define(_name, it);
          }
        };
      IterableExtensions.<ETSelect>forEach(_selects_1, _function_2);
    }
    EList<LabelType> _label_1 = transition.getLabel();
    final Function1<LabelType,Boolean> _function_3 = new Function1<LabelType,Boolean>() {
        public Boolean apply(final LabelType it) {
          KindType _kind = it.getKind();
          boolean _equals = Objects.equal(_kind, KindType.SYNCHRONISATION);
          return Boolean.valueOf(_equals);
        }
      };
    LabelType _findFirst_1 = IterableExtensions.<LabelType>findFirst(_label_1, _function_3);
    final String sync = _findFirst_1.getValue();
    final Function3<String,EObject,Object,EObject> _function_4 = new Function3<String,EObject,Object,EObject>() {
        public EObject apply(final String name, final EObject object, final Object context) {
          EObject _xifexpression = null;
          boolean _equals = Objects.equal(object, null);
          if (_equals) {
            ETVariableID _xblockexpression = null;
            {
              final EObject globalAction = Uppaal2EcdarText.this.globalActionsEnv.find(name);
              ETVariableID _xifexpression_1 = null;
              boolean _notEquals = (!Objects.equal(globalAction, null));
              if (_notEquals) {
                ETVariableID _xblockexpression_1 = null;
                {
                  final ETVariableID localAction = Uppaal2EcdarText.this.copyETVariable(((ETVariableID) globalAction));
                  final ETVariableDeclaration declaration = Uppaal2EcdarText.this.factory.createETVariableDeclaration();
                  ETType _createETType = Uppaal2EcdarText.this.factory.createETType();
                  declaration.setType(_createETType);
                  ETType _type = declaration.getType();
                  ETTypeModifiers _createETTypeModifiers = Uppaal2EcdarText.this.factory.createETTypeModifiers();
                  _type.setModifiers(_createETTypeModifiers);
                  ETType _type_1 = declaration.getType();
                  ETActionType _switchResult = null;
                  boolean _matched = false;
                  if (!_matched) {
                    if (Objects.equal(context,ETIOType.INPUT)) {
                      _matched=true;
                      ETInputType _createETInputType = Uppaal2EcdarText.this.factory.createETInputType();
                      _switchResult = _createETInputType;
                    }
                  }
                  if (!_matched) {
                    if (Objects.equal(context,ETIOType.OUTPUT)) {
                      _matched=true;
                      ETOutputType _createETOutputType = Uppaal2EcdarText.this.factory.createETOutputType();
                      _switchResult = _createETOutputType;
                    }
                  }
                  _type_1.setIdentifier(_switchResult);
                  localAction.setIoType(((ETIOType) context));
                  EList<ETVariableID> _variables = declaration.getVariables();
                  _variables.add(localAction);
                  ETSpecificationBody _body = spec.getBody();
                  ETDeclarations _declarations = _body.getDeclarations();
                  EList<ETDeclaration> _declarations_1 = _declarations.getDeclarations();
                  _declarations_1.add(declaration);
                  parentEnv.define(declaration);
                  _xblockexpression_1 = (localAction);
                }
                _xifexpression_1 = _xblockexpression_1;
              }
              _xblockexpression = (_xifexpression_1);
            }
            _xifexpression = _xblockexpression;
          } else {
            _xifexpression = object;
          }
          return _xifexpression;
        }
      };
    env.setPostProcessor(_function_4);
    UASynchronisation _parseUASynchronisation = this.parseUASynchronisation(sync);
    ETIO _transformUASynchronisation = this.transformUASynchronisation(_parseUASynchronisation, env);
    edge.setIo(_transformUASynchronisation);
    EList<LabelType> _label_2 = transition.getLabel();
    final Function1<LabelType,Boolean> _function_5 = new Function1<LabelType,Boolean>() {
        public Boolean apply(final LabelType it) {
          KindType _kind = it.getKind();
          boolean _equals = Objects.equal(_kind, KindType.GUARD);
          return Boolean.valueOf(_equals);
        }
      };
    LabelType _findFirst_2 = IterableExtensions.<LabelType>findFirst(_label_2, _function_5);
    final String guard = _findFirst_2==null?(String)null:_findFirst_2.getValue();
    boolean _notEquals_1 = (!Objects.equal(guard, null));
    if (_notEquals_1) {
      UAExpression _parseUAExpression = this.parseUAExpression(guard);
      ETExpression _transformUAExpression = this.transformUAExpression(_parseUAExpression, env);
      edge.setGuard(_transformUAExpression);
    }
    EList<LabelType> _label_3 = transition.getLabel();
    final Function1<LabelType,Boolean> _function_6 = new Function1<LabelType,Boolean>() {
        public Boolean apply(final LabelType it) {
          KindType _kind = it.getKind();
          boolean _equals = Objects.equal(_kind, KindType.ASSIGNMENT);
          return Boolean.valueOf(_equals);
        }
      };
    LabelType _findFirst_3 = IterableExtensions.<LabelType>findFirst(_label_3, _function_6);
    final String assignment = _findFirst_3==null?(String)null:_findFirst_3.getValue();
    boolean _notEquals_2 = (!Objects.equal(assignment, null));
    if (_notEquals_2) {
      EList<ETExpression> _updates = edge.getUpdates();
      List<UAExpression> _parseUAUpdateExpressions = this.parseUAUpdateExpressions(assignment);
      final Function1<UAExpression,ETExpression> _function_7 = new Function1<UAExpression,ETExpression>() {
          public ETExpression apply(final UAExpression it) {
            ETExpression _transformUAExpression = Uppaal2EcdarText.this.transformUAExpression(it, env);
            return _transformUAExpression;
          }
        };
      List<ETExpression> _map_1 = ListExtensions.<UAExpression, ETExpression>map(_parseUAUpdateExpressions, _function_7);
      Iterables.<ETExpression>addAll(_updates, _map_1);
    }
  }
  
  public ETSelect transformUASelect(final UASelect select, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(select, env);
    final ETSelect _result;
    synchronized (_createCache_transformUASelect) {
      if (_createCache_transformUASelect.containsKey(_cacheKey)) {
        return _createCache_transformUASelect.get(_cacheKey);
      }
      ETSelect _createETSelect = this.factory.createETSelect();
      _result = _createETSelect;
      _createCache_transformUASelect.put(_cacheKey, _result);
    }
    _init_transformUASelect(_result, select, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSelect> _createCache_transformUASelect = CollectionLiterals.newHashMap();
  
  private void _init_transformUASelect(final ETSelect it, final UASelect select, final Environment env) {
    String _name = select.getName();
    it.setName(_name);
    UAType _type = select.getType();
    ETType _transformUAType = this.transformUAType(_type, env);
    it.setType(_transformUAType);
  }
  
  public ETVariableID copyETVariable(final ETVariableID variable) {
    ETVariableID _xblockexpression = null;
    {
      final ETVariableID result = this.factory.createETVariableID();
      String _name = variable.getName();
      result.setName(_name);
      ETIOType _ioType = variable.getIoType();
      result.setIoType(_ioType);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public ETLocation transformLocation(final LocationType location, final boolean initial, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(location, initial, env);
    final ETLocation _result;
    synchronized (_createCache_transformLocation) {
      if (_createCache_transformLocation.containsKey(_cacheKey)) {
        return _createCache_transformLocation.get(_cacheKey);
      }
      ETLocation _createETLocation = this.factory.createETLocation();
      _result = _createETLocation;
      _createCache_transformLocation.put(_cacheKey, _result);
    }
    _init_transformLocation(_result, location, initial, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETLocation> _createCache_transformLocation = CollectionLiterals.newHashMap();
  
  private void _init_transformLocation(final ETLocation it, final LocationType location, final boolean initial, final Environment env) {
    String _xifexpression = null;
    NameType _name = location.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      String _id = location.getId();
      _xifexpression = _id;
    } else {
      NameType _name_1 = location.getName();
      String _value = _name_1.getValue();
      _xifexpression = _value;
    }
    it.setName(_xifexpression);
    boolean _and = false;
    NameType _name_2 = location.getName();
    boolean _notEquals = (!Objects.equal(_name_2, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _or = false;
      NameType _name_3 = location.getName();
      String _value_1 = _name_3.getValue();
      boolean _equals_1 = _value_1.equals("UNIV");
      if (_equals_1) {
        _or = true;
      } else {
        NameType _name_4 = location.getName();
        String _value_2 = _name_4.getValue();
        boolean _equals_2 = _value_2.equals("Universal");
        _or = (_equals_1 || _equals_2);
      }
      _and = (_notEquals && _or);
    }
    if (_and) {
      it.setName("UNIV");
      it.setUniversal(true);
    }
    UrgentType _urgent = location.getUrgent();
    boolean _notEquals_1 = (!Objects.equal(_urgent, null));
    it.setUrgent(_notEquals_1);
    EList<LabelType> _label = location.getLabel();
    final Function1<LabelType,Boolean> _function = new Function1<LabelType,Boolean>() {
        public Boolean apply(final LabelType it) {
          KindType _kind = it.getKind();
          boolean _equals = Objects.equal(_kind, KindType.INVARIANT);
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<LabelType> _filter = IterableExtensions.<LabelType>filter(_label, _function);
    for (final LabelType label : _filter) {
      EList<ETExpression> _invariants = it.getInvariants();
      String _value_3 = label.getValue();
      UAExpression _parseUAExpression = this.parseUAExpression(_value_3);
      ETExpression _transformUAExpression = this.transformUAExpression(_parseUAExpression, env);
      _invariants.add(_transformUAExpression);
    }
  }
  
  public ETIO transformUASynchronisation(final UASynchronisation sync, final Environment parentEnv) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(sync, parentEnv);
    final ETIO _result;
    synchronized (_createCache_transformUASynchronisation) {
      if (_createCache_transformUASynchronisation.containsKey(_cacheKey)) {
        return _createCache_transformUASynchronisation.get(_cacheKey);
      }
      ETIO _createETIO = this.factory.createETIO();
      _result = _createETIO;
      _createCache_transformUASynchronisation.put(_cacheKey, _result);
    }
    _init_transformUASynchronisation(_result, sync, parentEnv);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETIO> _createCache_transformUASynchronisation = CollectionLiterals.newHashMap();
  
  private void _init_transformUASynchronisation(final ETIO io, final UASynchronisation sync, final Environment parentEnv) {
    Environment _environment = new Environment(parentEnv);
    final Environment env = _environment;
    ETIOType _switchResult = null;
    UASynchronisationType _type = sync.getType();
    final UASynchronisationType _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,UASynchronisationType.RECEPTION)) {
        _matched=true;
        _switchResult = ETIOType.INPUT;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,UASynchronisationType.EMISSION)) {
        _matched=true;
        _switchResult = ETIOType.OUTPUT;
      }
    }
    io.setType(_switchResult);
    ETIOType _type_1 = io.getType();
    env.context = _type_1;
    UAExpression _expression = sync.getExpression();
    ETExpression _transformUAExpression = this.transformUAExpression(_expression, env);
    io.setExpression(_transformUAExpression);
  }
  
  /**
   * global actions are not defined and kept separately
   * and used when transforming synchronizations:
   * for each usage, a local action is declared
   */
  public boolean processDeclaration(final ETDeclaration declaration, final ETFile file) {
    boolean _xifexpression = false;
    boolean _and = false;
    if (!(declaration instanceof ETVariableDeclaration)) {
      _and = false;
    } else {
      ETType _type = ((ETVariableDeclaration) declaration).getType();
      ETTypeIdentifier _identifier = _type.getIdentifier();
      _and = ((declaration instanceof ETVariableDeclaration) && (_identifier instanceof ETActionType));
    }
    if (_and) {
      this.globalActionsEnv.define(declaration);
    } else {
      boolean _xblockexpression = false;
      {
        this.globalEnv.define(declaration);
        ETDeclarations _declarations = file.getDeclarations();
        EList<ETDeclaration> _declarations_1 = _declarations.getDeclarations();
        boolean _add = _declarations_1.add(declaration);
        _xblockexpression = (_add);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public ETSpecificationBinding transformUAInstantiation(final UAInstantiation instantiation, final Environment env) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(instantiation, env);
    final ETSpecificationBinding _result;
    synchronized (_createCache_transformUAInstantiation) {
      if (_createCache_transformUAInstantiation.containsKey(_cacheKey)) {
        return _createCache_transformUAInstantiation.get(_cacheKey);
      }
      ETSpecificationBinding _createETSpecificationBinding = this.factory.createETSpecificationBinding();
      _result = _createETSpecificationBinding;
      _createCache_transformUAInstantiation.put(_cacheKey, _result);
    }
    _init_transformUAInstantiation(_result, instantiation, env);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,ETSpecificationBinding> _createCache_transformUAInstantiation = CollectionLiterals.newHashMap();
  
  private void _init_transformUAInstantiation(final ETSpecificationBinding binding, final UAInstantiation instantiation, final Environment env) {
    String _name = instantiation.getName();
    binding.setName(_name);
    final ETSpecificationInstantiation spec = this.factory.createETSpecificationInstantiation();
    String _target = instantiation.getTarget();
    EObject _find = env.find(_target);
    spec.setTemplate(((ETSpecificationTemplate) _find));
    EList<ETExpression> _arguments = spec.getArguments();
    EList<UAExpression> _arguments_1 = instantiation.getArguments();
    final Function1<UAExpression,ETExpression> _function = new Function1<UAExpression,ETExpression>() {
        public ETExpression apply(final UAExpression it) {
          ETExpression _transformUAExpression = Uppaal2EcdarText.this.transformUAExpression(it, Uppaal2EcdarText.this.globalEnv);
          return _transformUAExpression;
        }
      };
    List<ETExpression> _map = ListExtensions.<UAExpression, ETExpression>map(_arguments_1, _function);
    Iterables.<ETExpression>addAll(_arguments, _map);
    binding.setExpression(spec);
  }
  
  /**
   * NOTE:
   * Transformation functions are always passed the
   * current environment and they create a sub-environment
   * on their own, if needed. Thus, no special attention
   * is required at the call-site.
   */
  public ETFile convert(final DocumentRoot root) {
    ETFile _xblockexpression = null;
    {
      this.factory = EcdarTextFactory.eINSTANCE;
      final NtaType nta = root.getNta();
      final ETFile file = this.factory.createETFile();
      ETDeclarations _createETDeclarations = this.factory.createETDeclarations();
      file.setDeclarations(_createETDeclarations);
      String _declaration = nta.getDeclaration();
      List<UADeclaration> _parseUADeclarations = this.parseUADeclarations(_declaration);
      for (final UADeclaration declaration : _parseUADeclarations) {
        ETDeclaration _transformUADeclaration = this.transformUADeclaration(declaration, this.globalEnv);
        this.processDeclaration(_transformUADeclaration, file);
      }
      EList<TemplateType> _template = nta.getTemplate();
      for (final TemplateType template : _template) {
        {
          final ETSpecificationDefinition result = this.transformTemplate(template, this.globalEnv);
          EList<ETSpecification> _specifications = file.getSpecifications();
          _specifications.add(result);
          String _name = result.getName();
          this.globalEnv.define(_name, result);
        }
      }
      String _system = nta.getSystem();
      List<UADefinition> _parseUADefinitions = this.parseUADefinitions(_system);
      for (final UADefinition definition : _parseUADefinitions) {
        boolean _matched = false;
        if (!_matched) {
          if (definition instanceof UADeclaration) {
            final UADeclaration _uADeclaration = (UADeclaration)definition;
            _matched=true;
            ETDeclaration _transformUADeclaration_1 = this.transformUADeclaration(_uADeclaration, this.globalEnv);
            this.processDeclaration(_transformUADeclaration_1, file);
          }
        }
        if (!_matched) {
          if (definition instanceof UAInstantiation) {
            final UAInstantiation _uAInstantiation = (UAInstantiation)definition;
            _matched=true;
            final ETSpecificationBinding result = this.transformUAInstantiation(_uAInstantiation, this.globalEnv);
            EList<ETSpecification> _specifications = file.getSpecifications();
            _specifications.add(result);
            String _name = result.getName();
            this.globalEnv.define(_name, result);
          }
        }
      }
      _xblockexpression = (file);
    }
    return _xblockexpression;
  }
  
  public ETExpression transformUAExpression(final UAExpression e, final Environment env) {
    if (e instanceof UAAddExpression) {
      return _transformUAExpression((UAAddExpression)e, env);
    } else if (e instanceof UAAdditionAssignmentExpression) {
      return _transformUAExpression((UAAdditionAssignmentExpression)e, env);
    } else if (e instanceof UAArrayExpression) {
      return _transformUAExpression((UAArrayExpression)e, env);
    } else if (e instanceof UAAssignmentExpression) {
      return _transformUAExpression((UAAssignmentExpression)e, env);
    } else if (e instanceof UABitAndAssignmentExpression) {
      return _transformUAExpression((UABitAndAssignmentExpression)e, env);
    } else if (e instanceof UABitAndExpression) {
      return _transformUAExpression((UABitAndExpression)e, env);
    } else if (e instanceof UABitLeftAssignmentExpression) {
      return _transformUAExpression((UABitLeftAssignmentExpression)e, env);
    } else if (e instanceof UABitLeftExpression) {
      return _transformUAExpression((UABitLeftExpression)e, env);
    } else if (e instanceof UABitOrAssignmentExpression) {
      return _transformUAExpression((UABitOrAssignmentExpression)e, env);
    } else if (e instanceof UABitOrExpression) {
      return _transformUAExpression((UABitOrExpression)e, env);
    } else if (e instanceof UABitRightAssignmentExpression) {
      return _transformUAExpression((UABitRightAssignmentExpression)e, env);
    } else if (e instanceof UABitRightExpression) {
      return _transformUAExpression((UABitRightExpression)e, env);
    } else if (e instanceof UABitXORAssignmentExpression) {
      return _transformUAExpression((UABitXORAssignmentExpression)e, env);
    } else if (e instanceof UABitXORExpression) {
      return _transformUAExpression((UABitXORExpression)e, env);
    } else if (e instanceof UABooleanLiteral) {
      return _transformUAExpression((UABooleanLiteral)e, env);
    } else if (e instanceof UAConditionalExpression) {
      return _transformUAExpression((UAConditionalExpression)e, env);
    } else if (e instanceof UADivideExpression) {
      return _transformUAExpression((UADivideExpression)e, env);
    } else if (e instanceof UADivisionAssignmentExpression) {
      return _transformUAExpression((UADivisionAssignmentExpression)e, env);
    } else if (e instanceof UAEqualExpression) {
      return _transformUAExpression((UAEqualExpression)e, env);
    } else if (e instanceof UAExistsExpression) {
      return _transformUAExpression((UAExistsExpression)e, env);
    } else if (e instanceof UAForallExpression) {
      return _transformUAExpression((UAForallExpression)e, env);
    } else if (e instanceof UAGreaterEqualExpression) {
      return _transformUAExpression((UAGreaterEqualExpression)e, env);
    } else if (e instanceof UAGreaterExpression) {
      return _transformUAExpression((UAGreaterExpression)e, env);
    } else if (e instanceof UAImplyExpression) {
      return _transformUAExpression((UAImplyExpression)e, env);
    } else if (e instanceof UALessEqualExpression) {
      return _transformUAExpression((UALessEqualExpression)e, env);
    } else if (e instanceof UALessExpression) {
      return _transformUAExpression((UALessExpression)e, env);
    } else if (e instanceof UALogicAndExpression) {
      return _transformUAExpression((UALogicAndExpression)e, env);
    } else if (e instanceof UALogicOrExpression) {
      return _transformUAExpression((UALogicOrExpression)e, env);
    } else if (e instanceof UAMaxExpression) {
      return _transformUAExpression((UAMaxExpression)e, env);
    } else if (e instanceof UAMinExpression) {
      return _transformUAExpression((UAMinExpression)e, env);
    } else if (e instanceof UAMinusExpression) {
      return _transformUAExpression((UAMinusExpression)e, env);
    } else if (e instanceof UAModuloAssignmentExpression) {
      return _transformUAExpression((UAModuloAssignmentExpression)e, env);
    } else if (e instanceof UAModuloExpression) {
      return _transformUAExpression((UAModuloExpression)e, env);
    } else if (e instanceof UAMultiplicationAssignmentExpression) {
      return _transformUAExpression((UAMultiplicationAssignmentExpression)e, env);
    } else if (e instanceof UAMultiplyExpression) {
      return _transformUAExpression((UAMultiplyExpression)e, env);
    } else if (e instanceof UANumberLiteral) {
      return _transformUAExpression((UANumberLiteral)e, env);
    } else if (e instanceof UAPostDecrementExpression) {
      return _transformUAExpression((UAPostDecrementExpression)e, env);
    } else if (e instanceof UAPostIncrementExpression) {
      return _transformUAExpression((UAPostIncrementExpression)e, env);
    } else if (e instanceof UAPreDecrementExpression) {
      return _transformUAExpression((UAPreDecrementExpression)e, env);
    } else if (e instanceof UAPreIncrementExpression) {
      return _transformUAExpression((UAPreIncrementExpression)e, env);
    } else if (e instanceof UAReference) {
      return _transformUAExpression((UAReference)e, env);
    } else if (e instanceof UAStructExpression) {
      return _transformUAExpression((UAStructExpression)e, env);
    } else if (e instanceof UASubtractExpression) {
      return _transformUAExpression((UASubtractExpression)e, env);
    } else if (e instanceof UASubtractionAssignmentExpression) {
      return _transformUAExpression((UASubtractionAssignmentExpression)e, env);
    } else if (e instanceof UAUnequalExpression) {
      return _transformUAExpression((UAUnequalExpression)e, env);
    } else if (e != null) {
      return _transformUAExpression(e, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, env).toString());
    }
  }
  
  public ETDeclaration transformUADeclaration(final UADeclaration d, final Environment env) {
    if (d instanceof UATypeDeclaration) {
      return _transformUADeclaration((UATypeDeclaration)d, env);
    } else if (d instanceof UAVariableDeclaration) {
      return _transformUADeclaration((UAVariableDeclaration)d, env);
    } else if (d != null) {
      return _transformUADeclaration(d, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d, env).toString());
    }
  }
  
  public ETInitialiser transformUAInitialiser(final UAInitialiser in, final Environment env) {
    if (in instanceof UAMultiInitialiser) {
      return _transformUAInitialiser((UAMultiInitialiser)in, env);
    } else if (in instanceof UASingleInitialiser) {
      return _transformUAInitialiser((UASingleInitialiser)in, env);
    } else if (in != null) {
      return _transformUAInitialiser(in, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(in, env).toString());
    }
  }
  
  public ETTypeIdentifier transformUATypeIdentifier(final UATypeIdentifier t, final Environment env) {
    if (t instanceof UABooleanType) {
      return _transformUATypeIdentifier((UABooleanType)t, env);
    } else if (t instanceof UAChannelType) {
      return _transformUATypeIdentifier((UAChannelType)t, env);
    } else if (t instanceof UAClockType) {
      return _transformUATypeIdentifier((UAClockType)t, env);
    } else if (t instanceof UAIntegerType) {
      return _transformUATypeIdentifier((UAIntegerType)t, env);
    } else if (t instanceof UAScalarType) {
      return _transformUATypeIdentifier((UAScalarType)t, env);
    } else if (t instanceof UAStructType) {
      return _transformUATypeIdentifier((UAStructType)t, env);
    } else if (t instanceof UAUserType) {
      return _transformUATypeIdentifier((UAUserType)t, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t, env).toString());
    }
  }
}
