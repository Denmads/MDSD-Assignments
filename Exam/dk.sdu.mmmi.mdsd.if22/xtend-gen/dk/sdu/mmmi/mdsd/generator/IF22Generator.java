/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.Scenario;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class IF22Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    IF22 program = Iterators.<IF22>filter(resource.getAllContents(), IF22.class).next();
    String packageName = this.genPackageName(program);
    boolean _requireExternalInterface = Util.requireExternalInterface(program);
    if (_requireExternalInterface) {
      ExternalFuncInterfaceGenerator interfaceGen = new ExternalFuncInterfaceGenerator(program, packageName);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("interactive_fiction/");
      _builder.append(packageName);
      _builder.append("/External.java");
      fsa.generateFile(_builder.toString(), interfaceGen.genFile());
    }
    ScenarioFileGenerator scenarioFileGen = new ScenarioFileGenerator(program, packageName);
    Iterable<Scenario> _iterable = IteratorExtensions.<Scenario>toIterable(Iterators.<Scenario>filter(program.eAllContents(), Scenario.class));
    for (final Scenario scenario : _iterable) {
      {
        scenarioFileGen.setScenario(scenario);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("interactive_fiction/");
        _builder_1.append(packageName);
        _builder_1.append("/");
        CharSequence _className = scenarioFileGen.getClassName();
        _builder_1.append(_className);
        _builder_1.append(".java");
        fsa.generateFile(_builder_1.toString(), scenarioFileGen.genFile());
      }
    }
    GameFileGenerator gamefileGen = new GameFileGenerator(program, packageName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("interactive_fiction/");
    _builder_1.append(packageName);
    _builder_1.append("/Game.java");
    fsa.generateFile(_builder_1.toString(), gamefileGen.genFile());
  }
  
  public String genPackageName(final IF22 program) {
    String pName = "";
    char[] _charArray = StringExtensions.toFirstLower(program.getName()).toCharArray();
    for (final char ch : _charArray) {
      boolean _isUpperCase = Character.isUpperCase(ch);
      if (_isUpperCase) {
        String _pName = pName;
        char _lowerCase = Character.toLowerCase(ch);
        String _plus = ("_" + Character.valueOf(_lowerCase));
        pName = (_pName + _plus);
      } else {
        String _pName_1 = pName;
        pName = (_pName_1 + Character.valueOf(ch));
      }
    }
    return pName;
  }
}
