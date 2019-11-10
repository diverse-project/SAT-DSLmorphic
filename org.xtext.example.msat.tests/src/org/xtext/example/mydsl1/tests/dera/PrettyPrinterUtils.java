package org.xtext.example.mydsl1.tests.dera;

import org.xtext.example.mydsl1.mSat.And;
import org.xtext.example.mydsl1.mSat.BiImpl;
import org.xtext.example.mydsl1.mSat.Expression;
import org.xtext.example.mydsl1.mSat.Impl;
import org.xtext.example.mydsl1.mSat.Nand;
import org.xtext.example.mydsl1.mSat.Not;
import org.xtext.example.mydsl1.mSat.Or;
import org.xtext.example.mydsl1.mSat.util.MSatSwitch;

public class PrettyPrinterUtils extends MSatSwitch<String> {

	@Override
	public String caseExpression(Expression object) {
		return object.getId() + "=" + object.getVal();
	}

	@Override
	public String caseBiImpl(BiImpl object) {
		return "(BIIMPL" + " " + this.doSwitch(object.getLeft()) + " "
				+ this.doSwitch(object.getRight()) + ")";
	}

	@Override
	public String caseImpl(Impl object) {
		return "(IMPL" + " " + this.doSwitch(object.getLeft()) + " "
				+ this.doSwitch(object.getRight()) + ")";
	}

	@Override
	public String caseOr(Or object) {
		return "(OR" + " " + this.doSwitch(object.getLeft()) + " "
				+ this.doSwitch(object.getRight()) + ")";
	}

	@Override
	public String caseAnd(And object) {
		return "(AND" + " " + this.doSwitch(object.getLeft()) + " "
				+ this.doSwitch(object.getRight()) + ")";
	}

	@Override
	public String caseNand(Nand object) {
		return "(NAND" + " " + this.doSwitch(object.getLeft())  + " "
				+ this.doSwitch(object.getRight()) + ")";
	}

	@Override
	public String caseNot(Not object) {
		return "(NOT" + " " + this.doSwitch(object.getExpression()) + ")";
	}
}