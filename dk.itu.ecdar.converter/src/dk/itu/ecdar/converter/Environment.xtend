package dk.itu.ecdar.converter

import dk.itu.ecdar.text.ecdarText.ETDeclaration
import java.util.Map
import dk.itu.ecdar.text.ecdarText.ETTypeID
import java.util.HashMap
import dk.itu.ecdar.text.ecdarText.ETVariableID
import dk.itu.ecdar.text.ecdarText.ETTypeDeclaration
import dk.itu.ecdar.text.ecdarText.ETVariableDeclaration
import org.eclipse.emf.ecore.EObject

class Environment {
	Map<String,EObject> definitions = new HashMap
	Environment parent
	public Object context

	new() {}
	new(Environment env) {
		parent = env
	}

	def private dispatch definitions(ETVariableDeclaration declaration) {
		val definitions = new HashMap<String,ETVariableID>
		for (variable : declaration.variables) {
			if (definitions.containsKey(variable.name))
				throw new Error('''
					multiple variables with same name "«variable.name»"
				''')
			else
				definitions.put(variable.name, variable)
		}
		definitions
	}

	def private dispatch definitions(ETTypeDeclaration declaration) {
		val definitions = new HashMap<String,ETTypeID>
		for (type : declaration.types) {
			if (definitions.containsKey(type.name))
				throw new Error('''
					multiple types with same name "«type.name»"
				''')
			else
				definitions.put(type.name, type)
		}
		definitions
	}

	def define(String name, EObject id) {
		if (find(name) != null)
			throw new Error('''
				redefinition of «name»
			''')
		else
			definitions.put(name, id)
	}

	def define(ETDeclaration declaration) {
		declaration.definitions
			.forEach[ name, id | define(name, id)]
	}

	def EObject find(String name) {
		find(name, this.context)
	}

	def EObject find(String name, Object context) {
		val result =
			if (definitions.containsKey(name))
				definitions.get(name)
			else if (parent != null)
				parent.find(name, context)
		val processor = this.postProcessor
		if (processor != null)
			processor.apply(name, result, context)
		else
			result
	}

	/* assign custom function to post-process lookup
	 * e.g. can be used to provide default or create
	 * object on the fly
	 */

	// name, result, context
	private (String,EObject,Object)=>EObject _postProcessor = null

	def (String,EObject,Object)=>EObject
		getPostProcessor()
	{
		val processor = this._postProcessor
		if (processor == null && parent != null)
			return parent.postProcessor
		else
			return processor
	}

	def setPostProcessor((String,EObject,Object)=>EObject processor) {
		this._postProcessor = processor
	}
}