package dk.itu.ecdar.converter;

import com.google.common.base.Objects;
import dk.itu.ecdar.text.ecdarText.ETDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration;
import dk.itu.ecdar.text.ecdarText.ETTypeID;
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration;
import dk.itu.ecdar.text.ecdarText.ETVariableID;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function3;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class Environment {
  private Map<String,EObject> definitions = new Function0<Map<String,EObject>>() {
    public Map<String,EObject> apply() {
      HashMap<String,EObject> _hashMap = new HashMap<String,EObject>();
      return _hashMap;
    }
  }.apply();
  
  private Environment parent;
  
  public Object context;
  
  public Environment() {
  }
  
  public Environment(final Environment env) {
    this.parent = env;
  }
  
  private HashMap<String,? extends EObject> _definitions(final ETVariableDeclaration declaration) {
    try {
      HashMap<String,ETVariableID> _xblockexpression = null;
      {
        HashMap<String,ETVariableID> _hashMap = new HashMap<String,ETVariableID>();
        final HashMap<String,ETVariableID> definitions = _hashMap;
        EList<ETVariableID> _variables = declaration.getVariables();
        for (final ETVariableID variable : _variables) {
          String _name = variable.getName();
          boolean _containsKey = definitions.containsKey(_name);
          if (_containsKey) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("multiple variables with same name \"");
            String _name_1 = variable.getName();
            _builder.append(_name_1, "");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            Error _error = new Error(_builder.toString());
            throw _error;
          } else {
            String _name_2 = variable.getName();
            definitions.put(_name_2, variable);
          }
        }
        _xblockexpression = (definitions);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private HashMap<String,? extends EObject> _definitions(final ETTypeDeclaration declaration) {
    try {
      HashMap<String,ETTypeID> _xblockexpression = null;
      {
        HashMap<String,ETTypeID> _hashMap = new HashMap<String,ETTypeID>();
        final HashMap<String,ETTypeID> definitions = _hashMap;
        EList<ETTypeID> _types = declaration.getTypes();
        for (final ETTypeID type : _types) {
          String _name = type.getName();
          boolean _containsKey = definitions.containsKey(_name);
          if (_containsKey) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("multiple types with same name \"");
            String _name_1 = type.getName();
            _builder.append(_name_1, "");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            Error _error = new Error(_builder.toString());
            throw _error;
          } else {
            String _name_2 = type.getName();
            definitions.put(_name_2, type);
          }
        }
        _xblockexpression = (definitions);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public EObject define(final String name, final EObject id) {
    try {
      EObject _xifexpression = null;
      EObject _find = this.find(name);
      boolean _notEquals = (!Objects.equal(_find, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("redefinition of ");
        _builder.append(name, "");
        _builder.newLineIfNotEmpty();
        Error _error = new Error(_builder.toString());
        throw _error;
      } else {
        EObject _put = this.definitions.put(name, id);
        _xifexpression = _put;
      }
      return _xifexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void define(final ETDeclaration declaration) {
    HashMap<String,? extends EObject> _definitions = this.definitions(declaration);
    final Procedure2<String,EObject> _function = new Procedure2<String,EObject>() {
        public void apply(final String name, final EObject id) {
          Environment.this.define(name, id);
        }
      };
    MapExtensions.forEach(_definitions, _function);
  }
  
  public EObject find(final String name) {
    EObject _find = this.find(name, this.context);
    return _find;
  }
  
  public EObject find(final String name, final Object context) {
    EObject _xblockexpression = null;
    {
      EObject _xifexpression = null;
      boolean _containsKey = this.definitions.containsKey(name);
      if (_containsKey) {
        EObject _get = this.definitions.get(name);
        _xifexpression = _get;
      } else {
        EObject _xifexpression_1 = null;
        boolean _notEquals = (!Objects.equal(this.parent, null));
        if (_notEquals) {
          EObject _find = this.parent.find(name, context);
          _xifexpression_1 = _find;
        }
        _xifexpression = _xifexpression_1;
      }
      final EObject result = _xifexpression;
      final Function3<? super String,? super EObject,? super Object,? extends EObject> processor = this.getPostProcessor();
      EObject _xifexpression_2 = null;
      boolean _notEquals_1 = (!Objects.equal(processor, null));
      if (_notEquals_1) {
        EObject _apply = processor.apply(name, result, context);
        _xifexpression_2 = _apply;
      } else {
        _xifexpression_2 = result;
      }
      _xblockexpression = (_xifexpression_2);
    }
    return _xblockexpression;
  }
  
  /**
   * assign custom function to post-process lookup
   * e.g. can be used to provide default or create
   * object on the fly
   */
  private Function3<? super String,? super EObject,? super Object,? extends EObject> _postProcessor = null;
  
  public Function3<? super String,? super EObject,? super Object,? extends EObject> getPostProcessor() {
    final Function3<? super String,? super EObject,? super Object,? extends EObject> processor = this._postProcessor;
    boolean _and = false;
    boolean _equals = Objects.equal(processor, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _notEquals = (!Objects.equal(this.parent, null));
      _and = (_equals && _notEquals);
    }
    if (_and) {
      return this.parent.getPostProcessor();
    } else {
      return processor;
    }
  }
  
  public Function3<? super String,? super EObject,? super Object,? extends EObject> setPostProcessor(final Function3<? super String,? super EObject,? super Object,? extends EObject> processor) {
    Function3<? super String,? super EObject,? super Object,? extends EObject> __postProcessor = this._postProcessor = processor;
    return __postProcessor;
  }
  
  private HashMap<String,? extends EObject> definitions(final ETDeclaration declaration) {
    if (declaration instanceof ETTypeDeclaration) {
      return _definitions((ETTypeDeclaration)declaration);
    } else if (declaration instanceof ETVariableDeclaration) {
      return _definitions((ETVariableDeclaration)declaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(declaration).toString());
    }
  }
}
