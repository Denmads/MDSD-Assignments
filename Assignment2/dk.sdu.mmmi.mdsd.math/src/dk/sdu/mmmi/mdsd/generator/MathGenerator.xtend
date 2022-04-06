/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javax.swing.JOptionPane
import java.util.Map
import java.util.HashMap
import dk.sdu.mmmi.mdsd.math.MathScript
import dk.sdu.mmmi.mdsd.math.Statement
import java.util.List
import dk.sdu.mmmi.mdsd.math.VariableRef
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LocalVariable
import dk.sdu.mmmi.mdsd.math.Atomic
import dk.sdu.mmmi.mdsd.math.Number
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import java.util.Set

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val mathIter = resource.allContents.filter(MathScript)
		if (mathIter.hasNext){
			val math = mathIter.next
			val result = math.compute
		
			result.displayPanel	
		}
	}
	
	def static compute(MathScript math) { 
		val variables = new HashMap()
		val statements = new ArrayList(math.statements)
		var index = statements.size-1
		
		while (statements.size > 0) {
			var stmt = statements.get(index)
			if (stmt.requirementsFullfilled(math, variables)) {
				val result = stmt.exp.compute(cloneMap(variables))
				variables.put(stmt.name, result)
				statements.remove(index)
			}
			
			index--
			if (index < 0)
				index += statements.size
		}
		
		
		return variables
	}
	
	def static Map<String, Integer> cloneMap (Map<String, Integer> source) {
		val newMap = newHashMap()
		source.forEach[key, value | newMap.put(key, value)]
		return newMap
	}
	
	def static boolean requirementsFullfilled(Statement stmt, MathScript ms, Map<String, Integer> calculatedVars) {
		val required = stmt.requiredGlobalVars(ms.statements.map[name])
		for (String s : required) {
			if (!calculatedVars.containsKey(s)) {
				return false
			}
		}
		return true
	}
	
	def static List<String> requiredGlobalVars(Statement stmt, List<String> allGlobals) {
		val vars = newArrayList()
		val refs = stmt.eAllContents.filter(VariableRef).map[value.name].toSet
		for (String v : refs) {
			if (allGlobals.contains(v)) {
				vars.add(v)
			}
		}
		return vars
	}
	
	def static int compute(Expression exp, Map<String, Integer> vars) {
		switch (exp) {
			Plus: exp.compute(vars)
			Minus: exp.compute(vars)
			Mult: exp.compute(vars)
			Div: exp.compute(vars)
			LocalVariable: exp.compute(vars)
			Atomic: exp.compute(vars)
		}
	}
	
	def static int compute(Plus exp, Map<String, Integer> vars) {
		exp.left.compute(vars) + exp.right.compute(vars)
	}
	
	def static int compute(Minus exp, Map<String, Integer> vars) {
		exp.left.compute(vars) - exp.right.compute(vars)
	}
	
	def static int compute(Mult exp, Map<String, Integer> vars) {
		exp.left.compute(vars) * exp.right.compute(vars)
	}
	
	def static int compute(Div exp, Map<String, Integer> vars) {
		Math.floor(exp.left.compute(vars) / exp.right.compute(vars)) as int
	}
	
	def static int compute(LocalVariable exp, Map<String, Integer> vars) {
		val prevVal = vars.get(exp.name)
		
		val varVal = exp.valExp.compute(vars)
		vars.put(exp.name, varVal)
		val res = exp.exp.compute(vars)
		if (prevVal !== null)
			vars.put(exp.name, prevVal)
		return res
	}
	
	def static int compute(Atomic exp, Map<String, Integer> vars) {
		switch (exp) {
			Number: (exp as Number).value
			VariableRef: exp.compute(vars)
		}
	}
	
	def static int compute(VariableRef exp, Map<String, Integer> vars) {
		val name = exp.value.name
		return vars.get(name)
	}

	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}

}
