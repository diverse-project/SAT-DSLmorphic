package org.xtext.example.msat.GJ_MC_Process

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl1.mSat.BenchmarkDimacs
import org.xtext.example.mydsl1.mSat.BenchmarkFormula
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.mSat.Sat4J
import org.xtext.example.mydsl1.mSat.impl.CryptoMiniSATImpl
import org.xtext.example.mydsl1.mSat.impl.MiniSATImpl
import org.xtext.example.mydsl1.mSat.impl.Sat4JImpl

class Sat4jLauncher {
	
	static final String SAT4J_JAVA = "sat4j-java";
	static final String SAT4J_JAR = "sat4j-jar";
	static final String SAT4J_COMP = "sat4j-maven";
	
	
	/**
	 * @ return the matrix of values of satisfiability
	 * +----+----+-----+
	 * |    | f1 | f2  |
	 * | s1 |true|false|
	 * | s2 |null|false|
	 * +----+----+-----+
	 * false -> unsatisfiable
	 * true  -> satisfiable
	 * null  -> no result (error or just generation of a project)
	 */
	static def List<List<Boolean>> launch(EObject e){
		val model = (e as SATMorphic)
		val solversList = model.solvers
		
		val List<List<Boolean>> out = newArrayList
		
		for(solver : solversList){
			val List<Boolean> line = newArrayList
			switch(solver){
				
				case solver.solver instanceof Sat4JImpl && (solver.solver as Sat4J).variant.literal == SAT4J_JAVA :
					//TODO change files & formulas
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs", EcoreUtil2.copy(expression))
							try{
								val b = LibInterpreter.interpret("formula.dimacs")
								line.add(b)
							} catch (Exception ex){
								ex.printStackTrace
								line.add(null)
							}
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							try{
								val b = LibInterpreter.interpret(file)
								line.add(b)
							} catch (Exception ex){
								ex.printStackTrace
								line.add(null)
							}
						}
					}
				case solver.solver instanceof Sat4JImpl && (solver.solver as Sat4J).variant.literal == SAT4J_JAR : 
					//TODO change files
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							try {
								val b = StandaloneInterpreter.jarCallSat4j("", EcoreUtil2.copy(expression))
								line.add(b)
							} catch (Exception ex){
								line.add(null)
							}
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							try {
								val b = StandaloneInterpreter.jarCallSat4j(file, null)
								line.add(b)
							} catch (Exception ex){
								line.add(null)
							}
						}
					}
					
				case solver.solver instanceof Sat4JImpl && (solver.solver as Sat4J).variant.literal == SAT4J_COMP :
					//TODO change files & formulas
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs",EcoreUtil2.copy(expression))
							Sat4JCompiler.compile("formula.dimacs")
							line.add(null)
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							Sat4JCompiler.compile(file)
							line.add(null)
						}
					}
					
				case solver.solver instanceof CryptoMiniSATImpl : 
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs",EcoreUtil2.copy(expression))
							val b = CryptoMiniSatSolver.solve("formula.dimacs")
							line.add(b)
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							val b = CryptoMiniSatSolver.solve(file);
							line.add(b)
						}
					}
				
				case solver.solver instanceof MiniSATImpl :
					if (model.benchmark instanceof BenchmarkFormula){
						for(expression : (model.benchmark  as BenchmarkFormula).expressions){
							SATUtils.writeSat4jFile("formula.dimacs",EcoreUtil2.copy(expression))
							try {
								val param = (solver.solver as MiniSATImpl).parameter
								val b = MiniSatSolver.solve("formula.dimacs", 
									solver.version !== null?"2.2":solver.version.version,
									param===null?0.0f:param.rndfreq
								)
								line.add(b)
							} catch(Exception ex) {
								line.add(null)
							}
							
						}										  	
					} else { //model.benchmark === BenchmarkDimacs
						for(file : (model.benchmark  as BenchmarkDimacs).dimacses){
							try {
								val param = (solver.solver as MiniSATImpl).parameter
								val b = MiniSatSolver.solve(file, 
									solver.version !== null?"2.2":solver.version.version,
									param===null?0.0f:param.rndfreq
								)
								line.add(b)
							} catch(Exception ex) {
								line.add(null)
							}
						}
					}
			}
			
			out.add(line)
		}
		return out
	}
	
}