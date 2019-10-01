/*
 * generated by Xtext 2.19.0
 */
package fr.m1sif.dsl.parser.antlr;

import com.google.inject.Inject;
import fr.m1sif.dsl.parser.antlr.internal.InternalSatParser;
import fr.m1sif.dsl.services.SatGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SatParser extends AbstractAntlrParser {

	@Inject
	private SatGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSatParser createParser(XtextTokenStream stream) {
		return new InternalSatParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Expressions";
	}

	public SatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
