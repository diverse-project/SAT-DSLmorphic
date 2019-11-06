package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import java.util.HashMap

class DimacsPrint {

	def static String print_dimacs(Expression e) {
		var clauses_counter = new ClausesCounter
		var variables_counter = new VariablesCounter
		var nb_clauses = clauses_counter.doSwitch(e)
		variables_counter.doSwitch(e)

		var dimacs = "p cnf " + variables_counter.get_var_number + " " + nb_clauses
		dimacs += print_dimacs_expr(variables_counter.get_vars, e)

		return dimacs
	}

	def static String print_dimacs_expr(HashMap<String, Integer> vars_ref, Expression e) {
		var output = ""
		if (e instanceof And) {
			var e_and = e as And
			output += print_dimacs_expr(vars_ref, e_and.left)
			output += print_dimacs_expr(vars_ref, e_and.right)
		} else {
			var print_dimacs_clause = new PrintDimacsClause
			print_dimacs_clause.set_vars_ref(vars_ref)
			output += "\n" + print_dimacs_clause.doSwitch(e) + "0"
		}
		return output
	}
}

class ClausesCounter extends MSatSwitch<Integer> {
	override Integer caseAnd(And e) {
		return this.doSwitch(e.left) + this.doSwitch(e.right)
	}

	override Integer caseOr(Or e) {
		return 1
	}

	override Integer caseExpression(Expression e) {
		return 1
	}

	override Integer caseNot(Not e) {
		return 1
	}
}

class VariablesCounter extends MSatSwitch<Void> {
	HashMap<String, Integer> vars = new HashMap<String, Integer>;
	Integer counter = 0

	def int get_var_number() {
		return counter
	}

	def HashMap<String, Integer> get_vars() {
		return vars
	}

	override Void caseAnd(And e) {
		this.doSwitch(e.left)
		this.doSwitch(e.right)
	}

	override Void caseOr(Or e) {
		this.doSwitch(e.left)
		this.doSwitch(e.right)
	}

	override Void caseExpression(Expression e) {
		if (e.id !== null) {
			if (!vars.containsKey(e.id)) {
				counter = counter + 1
				vars.put(e.id, counter)
				null
			}
		}	
	}

	override Void caseNot(Not e) {
		this.doSwitch(e.expression)
	}
}

class PrintDimacsClause extends MSatSwitch<String> {
	HashMap<String, Integer> vars_ref = new HashMap<String, Integer>

	def set_vars_ref(HashMap<String, Integer> vars_ref) {
		this.vars_ref = vars_ref
	}

	override String caseOr(Or e) {
		return this.doSwitch(e.left) + this.doSwitch(e.right)
	}

	override String caseExpression(Expression e) {
		if (e.id !== null) {
			return vars_ref.get(e.id).toString + " "
		}
		return ""
	}
	
	override String caseNot(Not e) {
		return "-" + this.doSwitch(e.expression)
	}
}
