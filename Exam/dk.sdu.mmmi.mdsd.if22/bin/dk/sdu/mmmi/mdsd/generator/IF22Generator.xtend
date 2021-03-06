/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.iF22.IF22
import dk.sdu.mmmi.mdsd.iF22.Scenario

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class IF22Generator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var program = resource.allContents.filter(IF22).next
		var packageName = program.genPackageName
		
		//External interface
		if (program.requireExternalInterface) {
			var interfaceGen = new ExternalFuncInterfaceGenerator(program, packageName)
			fsa.generateFile('''interactive_fiction/«packageName»/External.java''', interfaceGen.genFile)
		}
		
		//Scenario files
		var scenarioFileGen = new ScenarioFileGenerator(program, packageName)
		
		for (scenario : program.eAllContents.filter(Scenario).toIterable) {
			scenarioFileGen.scenario = scenario
			fsa.generateFile('''interactive_fiction/«packageName»/«scenarioFileGen.className».java''', scenarioFileGen.genFile)
		}
		
		//Game files
		var gamefileGen = new GameFileGenerator(program, packageName)
		fsa.generateFile('''interactive_fiction/«packageName»/Game.java''', gamefileGen.genFile)
	}
	
	def genPackageName(IF22 program) {
		var pName = ""
		for (ch : program.name.toFirstLower.toCharArray) {
			if (Character.isUpperCase(ch)) {
				pName += "_" + Character.toLowerCase(ch)
			}
			else {
				pName += ch
			}
		}
		return pName
	}
}
