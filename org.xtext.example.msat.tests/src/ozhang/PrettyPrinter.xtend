package ozhang

import org.xtext.example.mydsl1.mSat.Expression
import org.xtext.example.mydsl1.mSat.BiImpl
import org.xtext.example.mydsl1.mSat.Impl
import org.xtext.example.mydsl1.mSat.Or
import org.xtext.example.mydsl1.mSat.And
import org.xtext.example.mydsl1.mSat.Nand
import org.xtext.example.mydsl1.mSat.Not

class PrettyPrinter {
	
	def static String printer(Expression expr) {
		var str = 
		switch expr {
			case expr instanceof BiImpl : "( " + printer((expr as BiImpl).left) + " ) <=> ( " + printer((expr as BiImpl).right) + " )"
			case expr instanceof Impl : "( " + printer((expr as Impl).left) + " ) => ( " + printer((expr as Impl).right) + " )" + " )"
			case expr instanceof Or : "( " + printer((expr as Or).left) + " ) v ( " + printer((expr as Or).right) + " )"
			case expr instanceof And : "( " + printer((expr as And).left) + " ) ^ ( " + printer((expr as And).right) + " )"
			case expr instanceof Nand : "( " + printer((expr as Nand).left) + " ) ↑ ( " + printer((expr as Nand).right) + " )"
			case expr instanceof Not : "!" + printer((expr as Not).expression)
			default : expr.id
		}
		return str
	}
}