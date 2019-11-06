package org.xtext.example.msat.CoudrayThuillier.utils

import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.util.MSatSwitch
import org.xtext.example.mydsl1.mSat.Not
import org.xtext.example.mydsl1.mSat.Expression

class PrettyPrint extends MSatSwitch<String> {

	def static String prettyprint(Expression e) {
		var pretty_printer = new PrettyPrint
		return pretty_printer.doSwitch(e)
	}

	override String caseAnd(And e) {
		return this.doSwitch(e.left) + " ^ " + this.doSwitch(e.right)
	}

	override String caseOr(Or e) {
		return this.doSwitch(e.left) + " v " + this.doSwitch(e.right)
	}

	override String caseNand(Nand e) {
		return this.doSwitch(e.left) + " ↑ " + this.doSwitch(e.right)
	}

	override String caseImpl(Impl e) {
		return this.doSwitch(e.left) + " => " + this.doSwitch(e.right)
	}

	override String caseBiImpl(BiImpl e) {
		return this.doSwitch(e.left) + " <=> " + this.doSwitch(e.right)
	}

	override String caseNot(Not e) {
		return "!" + this.doSwitch(e.expression)
	}
	
	override String caseExpression (Expression e) {
		if (e.id !== null) {
			return e.id.toString
		} else {
			return e.^val.toString
		}
	}
}
