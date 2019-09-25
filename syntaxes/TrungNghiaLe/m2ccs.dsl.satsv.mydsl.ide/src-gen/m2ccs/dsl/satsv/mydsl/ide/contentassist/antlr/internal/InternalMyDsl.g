/*
 * generated by Xtext 2.19.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package m2ccs.dsl.satsv.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package m2ccs.dsl.satsv.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import m2ccs.dsl.satsv.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getFormulaAssignment()); }
		(rule__Model__FormulaAssignment)*
		{ after(grammarAccess.getModelAccess().getFormulaAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFormula
entryRuleFormula
:
{ before(grammarAccess.getFormulaRule()); }
	 ruleFormula
{ after(grammarAccess.getFormulaRule()); } 
	 EOF 
;

// Rule Formula
ruleFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormulaAccess().getAlternatives()); }
		(rule__Formula__Alternatives)
		{ after(grammarAccess.getFormulaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getIdAssignment()); }
		(rule__Variable__IdAssignment)
		{ after(grammarAccess.getVariableAccess().getIdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnOp
entryRuleUnOp
:
{ before(grammarAccess.getUnOpRule()); }
	 ruleUnOp
{ after(grammarAccess.getUnOpRule()); } 
	 EOF 
;

// Rule UnOp
ruleUnOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnOpAccess().getTypeAssignment()); }
		(rule__UnOp__TypeAssignment)
		{ after(grammarAccess.getUnOpAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnOpType
entryRuleUnOpType
:
{ before(grammarAccess.getUnOpTypeRule()); }
	 ruleUnOpType
{ after(grammarAccess.getUnOpTypeRule()); } 
	 EOF 
;

// Rule UnOpType
ruleUnOpType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnOpTypeAccess().getExclamationMarkKeyword()); }
		'!'
		{ after(grammarAccess.getUnOpTypeAccess().getExclamationMarkKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBiOp
entryRuleBiOp
:
{ before(grammarAccess.getBiOpRule()); }
	 ruleBiOp
{ after(grammarAccess.getBiOpRule()); } 
	 EOF 
;

// Rule BiOp
ruleBiOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBiOpAccess().getTypeAssignment()); }
		(rule__BiOp__TypeAssignment)
		{ after(grammarAccess.getBiOpAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBiOpType
entryRuleBiOpType
:
{ before(grammarAccess.getBiOpTypeRule()); }
	 ruleBiOpType
{ after(grammarAccess.getBiOpTypeRule()); } 
	 EOF 
;

// Rule BiOpType
ruleBiOpType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBiOpTypeAccess().getAlternatives()); }
		(rule__BiOpType__Alternatives)
		{ after(grammarAccess.getBiOpTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getVarAssignment_0()); }
		(rule__Formula__VarAssignment_0)
		{ after(grammarAccess.getFormulaAccess().getVarAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getFormulaAccess().getGroup_1()); }
		(rule__Formula__Group_1__0)
		{ after(grammarAccess.getFormulaAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getFormulaAccess().getGroup_2()); }
		(rule__Formula__Group_2__0)
		{ after(grammarAccess.getFormulaAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiOpType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBiOpTypeAccess().getAmpersandAmpersandKeyword_0()); }
		'&&'
		{ after(grammarAccess.getBiOpTypeAccess().getAmpersandAmpersandKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBiOpTypeAccess().getVerticalLineVerticalLineKeyword_1()); }
		'||'
		{ after(grammarAccess.getBiOpTypeAccess().getVerticalLineVerticalLineKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getBiOpTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
		'->'
		{ after(grammarAccess.getBiOpTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getBiOpTypeAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); }
		'<->'
		{ after(grammarAccess.getBiOpTypeAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getBiOpTypeAccess().getExclamationMarkAmpersandKeyword_4()); }
		'!&'
		{ after(grammarAccess.getBiOpTypeAccess().getExclamationMarkAmpersandKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_1__0__Impl
	rule__Formula__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_1__1__Impl
	rule__Formula__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getOpAssignment_1_1()); }
	(rule__Formula__OpAssignment_1_1)
	{ after(grammarAccess.getFormulaAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_1__2__Impl
	rule__Formula__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getArgAssignment_1_2()); }
	(rule__Formula__ArgAssignment_1_2)
	{ after(grammarAccess.getFormulaAccess().getArgAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Formula__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_2__0__Impl
	rule__Formula__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_2__1__Impl
	rule__Formula__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getArg1Assignment_2_1()); }
	(rule__Formula__Arg1Assignment_2_1)
	{ after(grammarAccess.getFormulaAccess().getArg1Assignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_2__2__Impl
	rule__Formula__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getOpAssignment_2_2()); }
	(rule__Formula__OpAssignment_2_2)
	{ after(grammarAccess.getFormulaAccess().getOpAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_2__3__Impl
	rule__Formula__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getArg2Assignment_2_3()); }
	(rule__Formula__Arg2Assignment_2_3)
	{ after(grammarAccess.getFormulaAccess().getArg2Assignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Formula__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_2_4()); }
	')'
	{ after(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__FormulaAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getFormulaFormulaParserRuleCall_0()); }
		ruleFormula
		{ after(grammarAccess.getModelAccess().getFormulaFormulaParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__VarAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getVarVariableParserRuleCall_0_0()); }
		ruleVariable
		{ after(grammarAccess.getFormulaAccess().getVarVariableParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getOpUnOpParserRuleCall_1_1_0()); }
		ruleUnOp
		{ after(grammarAccess.getFormulaAccess().getOpUnOpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__ArgAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getArgFormulaParserRuleCall_1_2_0()); }
		ruleFormula
		{ after(grammarAccess.getFormulaAccess().getArgFormulaParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Arg1Assignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getArg1FormulaParserRuleCall_2_1_0()); }
		ruleFormula
		{ after(grammarAccess.getFormulaAccess().getArg1FormulaParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__OpAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getOpBiOpParserRuleCall_2_2_0()); }
		ruleBiOp
		{ after(grammarAccess.getFormulaAccess().getOpBiOpParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Formula__Arg2Assignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaAccess().getArg2FormulaParserRuleCall_2_3_0()); }
		ruleFormula
		{ after(grammarAccess.getFormulaAccess().getArg2FormulaParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__IdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnOp__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnOpAccess().getTypeUnOpTypeParserRuleCall_0()); }
		ruleUnOpType
		{ after(grammarAccess.getUnOpAccess().getTypeUnOpTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiOp__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBiOpAccess().getTypeBiOpTypeParserRuleCall_0()); }
		ruleBiOpType
		{ after(grammarAccess.getBiOpAccess().getTypeBiOpTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
