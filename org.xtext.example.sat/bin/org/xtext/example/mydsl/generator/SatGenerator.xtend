/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.sat.Expression
import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.sat.And
import org.xtext.example.mydsl.sat.BiImpl
import org.xtext.example.mydsl.sat.Impl
import org.xtext.example.mydsl.sat.Nand
import org.xtext.example.mydsl.sat.Not
import org.xtext.example.mydsl.sat.Or

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SatGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('sat.txt', 'formula: ' + 
//			resource.allContents
//				.filter(Expression)
//				.map[id]
//				.join(', '))
			
		fsa.generateFile('sat.txt', prettyPrinter(resource.getContents().get(0)));
		
	}


static def String prettyPrinter(EObject ast){
	var res = "";
	
	if (ast instanceof And){
		res += "( AND" + prettyPrinter(ast.getLeft()) + prettyPrinter(ast.getRight()) + ")";
	}
	if (ast instanceof BiImpl){
		res += "( BIIMPL" + prettyPrinter(ast.getLeft()) + prettyPrinter(ast.getRight()) + ")";
	}
	if (ast instanceof Impl){
		res += "( IMPL" + prettyPrinter(ast.getLeft()) + prettyPrinter(ast.getRight()) + ")";
	}
	if (ast instanceof Nand){
		res += "( NAND" + prettyPrinter(ast.getLeft()) + prettyPrinter(ast.getRight()) + ")";
	}
	if (ast instanceof Not){
		res += "( NOT"+ prettyPrinter(ast.getExpression()) + ")";
	}
	if (ast instanceof Expression){
		res += " " + ast.getId() + "=" + ast.getVal();
	}
	if (ast instanceof Or){
		res += "( OR" + prettyPrinter(ast.getLeft()) + prettyPrinter(ast.getRight()) + ")";
	}	
	return res;
}

	
}