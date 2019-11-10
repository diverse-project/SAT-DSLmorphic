package org.xtext.example.mydsl1.tests.dera;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl1.mSat.And;
import org.xtext.example.mydsl1.mSat.BiImpl;
import org.xtext.example.mydsl1.mSat.Expression;
import org.xtext.example.mydsl1.mSat.Impl;
import org.xtext.example.mydsl1.mSat.Nand;
import org.xtext.example.mydsl1.mSat.Not;
import org.xtext.example.mydsl1.mSat.Or;
import org.xtext.example.mydsl1.mSat.util.MSatSwitch;

public class DimacsPrinterUtils extends MSatSwitch<Void>{
	private Map<String, Integer> map;
	private int clauses;
	private int name;
	private String res;
	
	public DimacsPrinterUtils() {
		super();
		this.map = new HashMap<String, Integer>();
		this.name = 0;
		this.clauses = 0;
		this.res = "";
	}

	@Override
	public Void caseExpression(Expression object) {
		if (object.getId() == null)
			return null;
		if (!this.map.containsKey(object.getId())) {
			this.name += 1;
			this.map.put(object.getId(), this.name);
		}
		this.res += map.get(object.getId());
		return null;
	}

	@Override
	public Void caseOr(Or object) {
		this.doSwitch(object.getLeft());
		this.res += " ";
		this.doSwitch(object.getRight());
		return null;
	}

	@Override
	public Void caseAnd(And object) {
		this.clauses += 1;
		
		this.doSwitch(object.getLeft());
		this.res += " 0\n";
		
		this.doSwitch(object.getRight());
		return null;
	}

	@Override
	public Void caseNot(Not object) {
		this.res += "-";
		this.doSwitch(object.getExpression());
		return null;
	}
	
	public String toString() {
		String resume = "p cnf " + this.name + " " + (this.clauses + 1) + "\n";
		return resume + this.res + " 0";
	}

	
}
