package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'\\u2191'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'", "'#dimacs'", "'#inline-formula'", "'<=>'", "'=>'", "'v'", "'^'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSat.g"; }


    	private SatGrammarAccess grammarAccess;

    	public void setGrammarAccess(SatGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSat"
    // InternalSat.g:53:1: entryRuleSat : ruleSat EOF ;
    public final void entryRuleSat() throws RecognitionException {
        try {
            // InternalSat.g:54:1: ( ruleSat EOF )
            // InternalSat.g:55:1: ruleSat EOF
            {
             before(grammarAccess.getSatRule()); 
            pushFollow(FOLLOW_1);
            ruleSat();

            state._fsp--;

             after(grammarAccess.getSatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSat"


    // $ANTLR start "ruleSat"
    // InternalSat.g:62:1: ruleSat : ( ( rule__Sat__Group__0 ) ) ;
    public final void ruleSat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:66:2: ( ( ( rule__Sat__Group__0 ) ) )
            // InternalSat.g:67:2: ( ( rule__Sat__Group__0 ) )
            {
            // InternalSat.g:67:2: ( ( rule__Sat__Group__0 ) )
            // InternalSat.g:68:3: ( rule__Sat__Group__0 )
            {
             before(grammarAccess.getSatAccess().getGroup()); 
            // InternalSat.g:69:3: ( rule__Sat__Group__0 )
            // InternalSat.g:69:4: rule__Sat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSat"


    // $ANTLR start "entryRuleDimacsFile"
    // InternalSat.g:78:1: entryRuleDimacsFile : ruleDimacsFile EOF ;
    public final void entryRuleDimacsFile() throws RecognitionException {
        try {
            // InternalSat.g:79:1: ( ruleDimacsFile EOF )
            // InternalSat.g:80:1: ruleDimacsFile EOF
            {
             before(grammarAccess.getDimacsFileRule()); 
            pushFollow(FOLLOW_1);
            ruleDimacsFile();

            state._fsp--;

             after(grammarAccess.getDimacsFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimacsFile"


    // $ANTLR start "ruleDimacsFile"
    // InternalSat.g:87:1: ruleDimacsFile : ( ( rule__DimacsFile__Group__0 ) ) ;
    public final void ruleDimacsFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:91:2: ( ( ( rule__DimacsFile__Group__0 ) ) )
            // InternalSat.g:92:2: ( ( rule__DimacsFile__Group__0 ) )
            {
            // InternalSat.g:92:2: ( ( rule__DimacsFile__Group__0 ) )
            // InternalSat.g:93:3: ( rule__DimacsFile__Group__0 )
            {
             before(grammarAccess.getDimacsFileAccess().getGroup()); 
            // InternalSat.g:94:3: ( rule__DimacsFile__Group__0 )
            // InternalSat.g:94:4: rule__DimacsFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimacsFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimacsFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimacsFile"


    // $ANTLR start "entryRuleInlineFormula"
    // InternalSat.g:103:1: entryRuleInlineFormula : ruleInlineFormula EOF ;
    public final void entryRuleInlineFormula() throws RecognitionException {
        try {
            // InternalSat.g:104:1: ( ruleInlineFormula EOF )
            // InternalSat.g:105:1: ruleInlineFormula EOF
            {
             before(grammarAccess.getInlineFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineFormula();

            state._fsp--;

             after(grammarAccess.getInlineFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInlineFormula"


    // $ANTLR start "ruleInlineFormula"
    // InternalSat.g:112:1: ruleInlineFormula : ( ( rule__InlineFormula__Group__0 ) ) ;
    public final void ruleInlineFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:116:2: ( ( ( rule__InlineFormula__Group__0 ) ) )
            // InternalSat.g:117:2: ( ( rule__InlineFormula__Group__0 ) )
            {
            // InternalSat.g:117:2: ( ( rule__InlineFormula__Group__0 ) )
            // InternalSat.g:118:3: ( rule__InlineFormula__Group__0 )
            {
             before(grammarAccess.getInlineFormulaAccess().getGroup()); 
            // InternalSat.g:119:3: ( rule__InlineFormula__Group__0 )
            // InternalSat.g:119:4: rule__InlineFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlineFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineFormula"


    // $ANTLR start "entryRuleModel"
    // InternalSat.g:128:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSat.g:129:1: ( ruleModel EOF )
            // InternalSat.g:130:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSat.g:137:1: ruleModel : ( ruleBiImpl ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:141:2: ( ( ruleBiImpl ) )
            // InternalSat.g:142:2: ( ruleBiImpl )
            {
            // InternalSat.g:142:2: ( ruleBiImpl )
            // InternalSat.g:143:3: ruleBiImpl
            {
             before(grammarAccess.getModelAccess().getBiImplParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBiImplParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBiImpl"
    // InternalSat.g:153:1: entryRuleBiImpl : ruleBiImpl EOF ;
    public final void entryRuleBiImpl() throws RecognitionException {
        try {
            // InternalSat.g:154:1: ( ruleBiImpl EOF )
            // InternalSat.g:155:1: ruleBiImpl EOF
            {
             before(grammarAccess.getBiImplRule()); 
            pushFollow(FOLLOW_1);
            ruleBiImpl();

            state._fsp--;

             after(grammarAccess.getBiImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBiImpl"


    // $ANTLR start "ruleBiImpl"
    // InternalSat.g:162:1: ruleBiImpl : ( ( rule__BiImpl__Group__0 ) ) ;
    public final void ruleBiImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:166:2: ( ( ( rule__BiImpl__Group__0 ) ) )
            // InternalSat.g:167:2: ( ( rule__BiImpl__Group__0 ) )
            {
            // InternalSat.g:167:2: ( ( rule__BiImpl__Group__0 ) )
            // InternalSat.g:168:3: ( rule__BiImpl__Group__0 )
            {
             before(grammarAccess.getBiImplAccess().getGroup()); 
            // InternalSat.g:169:3: ( rule__BiImpl__Group__0 )
            // InternalSat.g:169:4: rule__BiImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBiImpl"


    // $ANTLR start "entryRuleImpl"
    // InternalSat.g:178:1: entryRuleImpl : ruleImpl EOF ;
    public final void entryRuleImpl() throws RecognitionException {
        try {
            // InternalSat.g:179:1: ( ruleImpl EOF )
            // InternalSat.g:180:1: ruleImpl EOF
            {
             before(grammarAccess.getImplRule()); 
            pushFollow(FOLLOW_1);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImpl"


    // $ANTLR start "ruleImpl"
    // InternalSat.g:187:1: ruleImpl : ( ( rule__Impl__Group__0 ) ) ;
    public final void ruleImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:191:2: ( ( ( rule__Impl__Group__0 ) ) )
            // InternalSat.g:192:2: ( ( rule__Impl__Group__0 ) )
            {
            // InternalSat.g:192:2: ( ( rule__Impl__Group__0 ) )
            // InternalSat.g:193:3: ( rule__Impl__Group__0 )
            {
             before(grammarAccess.getImplAccess().getGroup()); 
            // InternalSat.g:194:3: ( rule__Impl__Group__0 )
            // InternalSat.g:194:4: rule__Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpl"


    // $ANTLR start "entryRuleOr"
    // InternalSat.g:203:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSat.g:204:1: ( ruleOr EOF )
            // InternalSat.g:205:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSat.g:212:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:216:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSat.g:217:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSat.g:217:2: ( ( rule__Or__Group__0 ) )
            // InternalSat.g:218:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalSat.g:219:3: ( rule__Or__Group__0 )
            // InternalSat.g:219:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSat.g:228:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSat.g:229:1: ( ruleAnd EOF )
            // InternalSat.g:230:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSat.g:237:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:241:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSat.g:242:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSat.g:242:2: ( ( rule__And__Group__0 ) )
            // InternalSat.g:243:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSat.g:244:3: ( rule__And__Group__0 )
            // InternalSat.g:244:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNand"
    // InternalSat.g:253:1: entryRuleNand : ruleNand EOF ;
    public final void entryRuleNand() throws RecognitionException {
        try {
            // InternalSat.g:254:1: ( ruleNand EOF )
            // InternalSat.g:255:1: ruleNand EOF
            {
             before(grammarAccess.getNandRule()); 
            pushFollow(FOLLOW_1);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getNandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNand"


    // $ANTLR start "ruleNand"
    // InternalSat.g:262:1: ruleNand : ( ( rule__Nand__Group__0 ) ) ;
    public final void ruleNand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:266:2: ( ( ( rule__Nand__Group__0 ) ) )
            // InternalSat.g:267:2: ( ( rule__Nand__Group__0 ) )
            {
            // InternalSat.g:267:2: ( ( rule__Nand__Group__0 ) )
            // InternalSat.g:268:3: ( rule__Nand__Group__0 )
            {
             before(grammarAccess.getNandAccess().getGroup()); 
            // InternalSat.g:269:3: ( rule__Nand__Group__0 )
            // InternalSat.g:269:4: rule__Nand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNand"


    // $ANTLR start "entryRulePrimary"
    // InternalSat.g:278:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSat.g:279:1: ( rulePrimary EOF )
            // InternalSat.g:280:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSat.g:287:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:291:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSat.g:292:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSat.g:292:2: ( ( rule__Primary__Alternatives ) )
            // InternalSat.g:293:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSat.g:294:3: ( rule__Primary__Alternatives )
            // InternalSat.g:294:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNot"
    // InternalSat.g:303:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSat.g:304:1: ( ruleNot EOF )
            // InternalSat.g:305:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSat.g:312:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:316:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalSat.g:317:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalSat.g:317:2: ( ( rule__Not__Group__0 ) )
            // InternalSat.g:318:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalSat.g:319:3: ( rule__Not__Group__0 )
            // InternalSat.g:319:4: rule__Not__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleVar"
    // InternalSat.g:328:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalSat.g:329:1: ( ruleVar EOF )
            // InternalSat.g:330:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalSat.g:337:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:341:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalSat.g:342:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalSat.g:342:2: ( ( rule__Var__IdAssignment ) )
            // InternalSat.g:343:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalSat.g:344:3: ( rule__Var__IdAssignment )
            // InternalSat.g:344:4: rule__Var__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalSat.g:353:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalSat.g:354:1: ( ruleConst EOF )
            // InternalSat.g:355:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalSat.g:362:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:366:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalSat.g:367:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalSat.g:367:2: ( ( rule__Const__ValAssignment ) )
            // InternalSat.g:368:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalSat.g:369:3: ( rule__Const__ValAssignment )
            // InternalSat.g:369:4: rule__Const__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "ruleSATSolverMethod"
    // InternalSat.g:378:1: ruleSATSolverMethod : ( ( rule__SATSolverMethod__Alternatives ) ) ;
    public final void ruleSATSolverMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:382:1: ( ( ( rule__SATSolverMethod__Alternatives ) ) )
            // InternalSat.g:383:2: ( ( rule__SATSolverMethod__Alternatives ) )
            {
            // InternalSat.g:383:2: ( ( rule__SATSolverMethod__Alternatives ) )
            // InternalSat.g:384:3: ( rule__SATSolverMethod__Alternatives )
            {
             before(grammarAccess.getSATSolverMethodAccess().getAlternatives()); 
            // InternalSat.g:385:3: ( rule__SATSolverMethod__Alternatives )
            // InternalSat.g:385:4: rule__SATSolverMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SATSolverMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSATSolverMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSATSolverMethod"


    // $ANTLR start "rule__Sat__TypeAlternatives_0_0"
    // InternalSat.g:393:1: rule__Sat__TypeAlternatives_0_0 : ( ( ruleDimacsFile ) | ( ruleInlineFormula ) );
    public final void rule__Sat__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:397:1: ( ( ruleDimacsFile ) | ( ruleInlineFormula ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSat.g:398:2: ( ruleDimacsFile )
                    {
                    // InternalSat.g:398:2: ( ruleDimacsFile )
                    // InternalSat.g:399:3: ruleDimacsFile
                    {
                     before(grammarAccess.getSatAccess().getTypeDimacsFileParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDimacsFile();

                    state._fsp--;

                     after(grammarAccess.getSatAccess().getTypeDimacsFileParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:404:2: ( ruleInlineFormula )
                    {
                    // InternalSat.g:404:2: ( ruleInlineFormula )
                    // InternalSat.g:405:3: ruleInlineFormula
                    {
                     before(grammarAccess.getSatAccess().getTypeInlineFormulaParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInlineFormula();

                    state._fsp--;

                     after(grammarAccess.getSatAccess().getTypeInlineFormulaParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__TypeAlternatives_0_0"


    // $ANTLR start "rule__Nand__Alternatives_1_1"
    // InternalSat.g:414:1: rule__Nand__Alternatives_1_1 : ( ( '|' ) | ( '\\u2191' ) );
    public final void rule__Nand__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:418:1: ( ( '|' ) | ( '\\u2191' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSat.g:419:2: ( '|' )
                    {
                    // InternalSat.g:419:2: ( '|' )
                    // InternalSat.g:420:3: '|'
                    {
                     before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:425:2: ( '\\u2191' )
                    {
                    // InternalSat.g:425:2: ( '\\u2191' )
                    // InternalSat.g:426:3: '\\u2191'
                    {
                     before(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getUpwardsArrowKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Alternatives_1_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalSat.g:435:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:439:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 13:
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
            case 16:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSat.g:440:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalSat.g:440:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalSat.g:441:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalSat.g:442:3: ( rule__Primary__Group_0__0 )
                    // InternalSat.g:442:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:446:2: ( ruleNot )
                    {
                    // InternalSat.g:446:2: ( ruleNot )
                    // InternalSat.g:447:3: ruleNot
                    {
                     before(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNotParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:452:2: ( ruleConst )
                    {
                    // InternalSat.g:452:2: ( ruleConst )
                    // InternalSat.g:453:3: ruleConst
                    {
                     before(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getConstParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSat.g:458:2: ( ruleVar )
                    {
                    // InternalSat.g:458:2: ( ruleVar )
                    // InternalSat.g:459:3: ruleVar
                    {
                     before(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVarParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Not__Alternatives_0"
    // InternalSat.g:468:1: rule__Not__Alternatives_0 : ( ( '!' ) | ( '~' ) );
    public final void rule__Not__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:472:1: ( ( '!' ) | ( '~' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSat.g:473:2: ( '!' )
                    {
                    // InternalSat.g:473:2: ( '!' )
                    // InternalSat.g:474:3: '!'
                    {
                     before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:479:2: ( '~' )
                    {
                    // InternalSat.g:479:2: ( '~' )
                    // InternalSat.g:480:3: '~'
                    {
                     before(grammarAccess.getNotAccess().getTildeKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getTildeKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives_0"


    // $ANTLR start "rule__Const__ValAlternatives_0"
    // InternalSat.g:489:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:493:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSat.g:494:2: ( 'true' )
                    {
                    // InternalSat.g:494:2: ( 'true' )
                    // InternalSat.g:495:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:500:2: ( 'false' )
                    {
                    // InternalSat.g:500:2: ( 'false' )
                    // InternalSat.g:501:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__ValAlternatives_0"


    // $ANTLR start "rule__SATSolverMethod__Alternatives"
    // InternalSat.g:510:1: rule__SATSolverMethod__Alternatives : ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) );
    public final void rule__SATSolverMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:514:1: ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSat.g:515:2: ( ( 'sat4j-java' ) )
                    {
                    // InternalSat.g:515:2: ( ( 'sat4j-java' ) )
                    // InternalSat.g:516:3: ( 'sat4j-java' )
                    {
                     before(grammarAccess.getSATSolverMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 
                    // InternalSat.g:517:3: ( 'sat4j-java' )
                    // InternalSat.g:517:4: 'sat4j-java'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATSolverMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:521:2: ( ( 'sat4j-jar' ) )
                    {
                    // InternalSat.g:521:2: ( ( 'sat4j-jar' ) )
                    // InternalSat.g:522:3: ( 'sat4j-jar' )
                    {
                     before(grammarAccess.getSATSolverMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 
                    // InternalSat.g:523:3: ( 'sat4j-jar' )
                    // InternalSat.g:523:4: 'sat4j-jar'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATSolverMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:527:2: ( ( 'sat4j-maven' ) )
                    {
                    // InternalSat.g:527:2: ( ( 'sat4j-maven' ) )
                    // InternalSat.g:528:3: ( 'sat4j-maven' )
                    {
                     before(grammarAccess.getSATSolverMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2()); 
                    // InternalSat.g:529:3: ( 'sat4j-maven' )
                    // InternalSat.g:529:4: 'sat4j-maven'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATSolverMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SATSolverMethod__Alternatives"


    // $ANTLR start "rule__Sat__Group__0"
    // InternalSat.g:537:1: rule__Sat__Group__0 : rule__Sat__Group__0__Impl rule__Sat__Group__1 ;
    public final void rule__Sat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:541:1: ( rule__Sat__Group__0__Impl rule__Sat__Group__1 )
            // InternalSat.g:542:2: rule__Sat__Group__0__Impl rule__Sat__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__Group__0"


    // $ANTLR start "rule__Sat__Group__0__Impl"
    // InternalSat.g:549:1: rule__Sat__Group__0__Impl : ( ( rule__Sat__TypeAssignment_0 ) ) ;
    public final void rule__Sat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:553:1: ( ( ( rule__Sat__TypeAssignment_0 ) ) )
            // InternalSat.g:554:1: ( ( rule__Sat__TypeAssignment_0 ) )
            {
            // InternalSat.g:554:1: ( ( rule__Sat__TypeAssignment_0 ) )
            // InternalSat.g:555:2: ( rule__Sat__TypeAssignment_0 )
            {
             before(grammarAccess.getSatAccess().getTypeAssignment_0()); 
            // InternalSat.g:556:2: ( rule__Sat__TypeAssignment_0 )
            // InternalSat.g:556:3: rule__Sat__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sat__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSatAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__Group__0__Impl"


    // $ANTLR start "rule__Sat__Group__1"
    // InternalSat.g:564:1: rule__Sat__Group__1 : rule__Sat__Group__1__Impl ;
    public final void rule__Sat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:568:1: ( rule__Sat__Group__1__Impl )
            // InternalSat.g:569:2: rule__Sat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__Group__1"


    // $ANTLR start "rule__Sat__Group__1__Impl"
    // InternalSat.g:575:1: rule__Sat__Group__1__Impl : ( ( rule__Sat__Solver_methodAssignment_1 ) ) ;
    public final void rule__Sat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:579:1: ( ( ( rule__Sat__Solver_methodAssignment_1 ) ) )
            // InternalSat.g:580:1: ( ( rule__Sat__Solver_methodAssignment_1 ) )
            {
            // InternalSat.g:580:1: ( ( rule__Sat__Solver_methodAssignment_1 ) )
            // InternalSat.g:581:2: ( rule__Sat__Solver_methodAssignment_1 )
            {
             before(grammarAccess.getSatAccess().getSolver_methodAssignment_1()); 
            // InternalSat.g:582:2: ( rule__Sat__Solver_methodAssignment_1 )
            // InternalSat.g:582:3: rule__Sat__Solver_methodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sat__Solver_methodAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSatAccess().getSolver_methodAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__Group__1__Impl"


    // $ANTLR start "rule__DimacsFile__Group__0"
    // InternalSat.g:591:1: rule__DimacsFile__Group__0 : rule__DimacsFile__Group__0__Impl rule__DimacsFile__Group__1 ;
    public final void rule__DimacsFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:595:1: ( rule__DimacsFile__Group__0__Impl rule__DimacsFile__Group__1 )
            // InternalSat.g:596:2: rule__DimacsFile__Group__0__Impl rule__DimacsFile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DimacsFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimacsFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimacsFile__Group__0"


    // $ANTLR start "rule__DimacsFile__Group__0__Impl"
    // InternalSat.g:603:1: rule__DimacsFile__Group__0__Impl : ( '#dimacs' ) ;
    public final void rule__DimacsFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:607:1: ( ( '#dimacs' ) )
            // InternalSat.g:608:1: ( '#dimacs' )
            {
            // InternalSat.g:608:1: ( '#dimacs' )
            // InternalSat.g:609:2: '#dimacs'
            {
             before(grammarAccess.getDimacsFileAccess().getDimacsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDimacsFileAccess().getDimacsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimacsFile__Group__0__Impl"


    // $ANTLR start "rule__DimacsFile__Group__1"
    // InternalSat.g:618:1: rule__DimacsFile__Group__1 : rule__DimacsFile__Group__1__Impl ;
    public final void rule__DimacsFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:622:1: ( rule__DimacsFile__Group__1__Impl )
            // InternalSat.g:623:2: rule__DimacsFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimacsFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimacsFile__Group__1"


    // $ANTLR start "rule__DimacsFile__Group__1__Impl"
    // InternalSat.g:629:1: rule__DimacsFile__Group__1__Impl : ( ( rule__DimacsFile__FilepathAssignment_1 ) ) ;
    public final void rule__DimacsFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:633:1: ( ( ( rule__DimacsFile__FilepathAssignment_1 ) ) )
            // InternalSat.g:634:1: ( ( rule__DimacsFile__FilepathAssignment_1 ) )
            {
            // InternalSat.g:634:1: ( ( rule__DimacsFile__FilepathAssignment_1 ) )
            // InternalSat.g:635:2: ( rule__DimacsFile__FilepathAssignment_1 )
            {
             before(grammarAccess.getDimacsFileAccess().getFilepathAssignment_1()); 
            // InternalSat.g:636:2: ( rule__DimacsFile__FilepathAssignment_1 )
            // InternalSat.g:636:3: rule__DimacsFile__FilepathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DimacsFile__FilepathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimacsFileAccess().getFilepathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimacsFile__Group__1__Impl"


    // $ANTLR start "rule__InlineFormula__Group__0"
    // InternalSat.g:645:1: rule__InlineFormula__Group__0 : rule__InlineFormula__Group__0__Impl rule__InlineFormula__Group__1 ;
    public final void rule__InlineFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:649:1: ( rule__InlineFormula__Group__0__Impl rule__InlineFormula__Group__1 )
            // InternalSat.g:650:2: rule__InlineFormula__Group__0__Impl rule__InlineFormula__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InlineFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFormula__Group__0"


    // $ANTLR start "rule__InlineFormula__Group__0__Impl"
    // InternalSat.g:657:1: rule__InlineFormula__Group__0__Impl : ( '#inline-formula' ) ;
    public final void rule__InlineFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:661:1: ( ( '#inline-formula' ) )
            // InternalSat.g:662:1: ( '#inline-formula' )
            {
            // InternalSat.g:662:1: ( '#inline-formula' )
            // InternalSat.g:663:2: '#inline-formula'
            {
             before(grammarAccess.getInlineFormulaAccess().getInlineFormulaKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInlineFormulaAccess().getInlineFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFormula__Group__0__Impl"


    // $ANTLR start "rule__InlineFormula__Group__1"
    // InternalSat.g:672:1: rule__InlineFormula__Group__1 : rule__InlineFormula__Group__1__Impl ;
    public final void rule__InlineFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:676:1: ( rule__InlineFormula__Group__1__Impl )
            // InternalSat.g:677:2: rule__InlineFormula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlineFormula__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFormula__Group__1"


    // $ANTLR start "rule__InlineFormula__Group__1__Impl"
    // InternalSat.g:683:1: rule__InlineFormula__Group__1__Impl : ( ( rule__InlineFormula__ModelAssignment_1 ) ) ;
    public final void rule__InlineFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:687:1: ( ( ( rule__InlineFormula__ModelAssignment_1 ) ) )
            // InternalSat.g:688:1: ( ( rule__InlineFormula__ModelAssignment_1 ) )
            {
            // InternalSat.g:688:1: ( ( rule__InlineFormula__ModelAssignment_1 ) )
            // InternalSat.g:689:2: ( rule__InlineFormula__ModelAssignment_1 )
            {
             before(grammarAccess.getInlineFormulaAccess().getModelAssignment_1()); 
            // InternalSat.g:690:2: ( rule__InlineFormula__ModelAssignment_1 )
            // InternalSat.g:690:3: rule__InlineFormula__ModelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InlineFormula__ModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInlineFormulaAccess().getModelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFormula__Group__1__Impl"


    // $ANTLR start "rule__BiImpl__Group__0"
    // InternalSat.g:699:1: rule__BiImpl__Group__0 : rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 ;
    public final void rule__BiImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:703:1: ( rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 )
            // InternalSat.g:704:2: rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BiImpl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__0"


    // $ANTLR start "rule__BiImpl__Group__0__Impl"
    // InternalSat.g:711:1: rule__BiImpl__Group__0__Impl : ( ruleImpl ) ;
    public final void rule__BiImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:715:1: ( ( ruleImpl ) )
            // InternalSat.g:716:1: ( ruleImpl )
            {
            // InternalSat.g:716:1: ( ruleImpl )
            // InternalSat.g:717:2: ruleImpl
            {
             before(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getBiImplAccess().getImplParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__0__Impl"


    // $ANTLR start "rule__BiImpl__Group__1"
    // InternalSat.g:726:1: rule__BiImpl__Group__1 : rule__BiImpl__Group__1__Impl ;
    public final void rule__BiImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:730:1: ( rule__BiImpl__Group__1__Impl )
            // InternalSat.g:731:2: rule__BiImpl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__1"


    // $ANTLR start "rule__BiImpl__Group__1__Impl"
    // InternalSat.g:737:1: rule__BiImpl__Group__1__Impl : ( ( rule__BiImpl__Group_1__0 )* ) ;
    public final void rule__BiImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:741:1: ( ( ( rule__BiImpl__Group_1__0 )* ) )
            // InternalSat.g:742:1: ( ( rule__BiImpl__Group_1__0 )* )
            {
            // InternalSat.g:742:1: ( ( rule__BiImpl__Group_1__0 )* )
            // InternalSat.g:743:2: ( rule__BiImpl__Group_1__0 )*
            {
             before(grammarAccess.getBiImplAccess().getGroup_1()); 
            // InternalSat.g:744:2: ( rule__BiImpl__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSat.g:744:3: rule__BiImpl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BiImpl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBiImplAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group__1__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__0"
    // InternalSat.g:753:1: rule__BiImpl__Group_1__0 : rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 ;
    public final void rule__BiImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:757:1: ( rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 )
            // InternalSat.g:758:2: rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__BiImpl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__0"


    // $ANTLR start "rule__BiImpl__Group_1__0__Impl"
    // InternalSat.g:765:1: rule__BiImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:769:1: ( ( () ) )
            // InternalSat.g:770:1: ( () )
            {
            // InternalSat.g:770:1: ( () )
            // InternalSat.g:771:2: ()
            {
             before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 
            // InternalSat.g:772:2: ()
            // InternalSat.g:772:3: 
            {
            }

             after(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__0__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__1"
    // InternalSat.g:780:1: rule__BiImpl__Group_1__1 : rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 ;
    public final void rule__BiImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:784:1: ( rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 )
            // InternalSat.g:785:2: rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__BiImpl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__1"


    // $ANTLR start "rule__BiImpl__Group_1__1__Impl"
    // InternalSat.g:792:1: rule__BiImpl__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:796:1: ( ( '<=>' ) )
            // InternalSat.g:797:1: ( '<=>' )
            {
            // InternalSat.g:797:1: ( '<=>' )
            // InternalSat.g:798:2: '<=>'
            {
             before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__1__Impl"


    // $ANTLR start "rule__BiImpl__Group_1__2"
    // InternalSat.g:807:1: rule__BiImpl__Group_1__2 : rule__BiImpl__Group_1__2__Impl ;
    public final void rule__BiImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:811:1: ( rule__BiImpl__Group_1__2__Impl )
            // InternalSat.g:812:2: rule__BiImpl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__2"


    // $ANTLR start "rule__BiImpl__Group_1__2__Impl"
    // InternalSat.g:818:1: rule__BiImpl__Group_1__2__Impl : ( ( rule__BiImpl__RightAssignment_1_2 ) ) ;
    public final void rule__BiImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:822:1: ( ( ( rule__BiImpl__RightAssignment_1_2 ) ) )
            // InternalSat.g:823:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            {
            // InternalSat.g:823:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            // InternalSat.g:824:2: ( rule__BiImpl__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 
            // InternalSat.g:825:2: ( rule__BiImpl__RightAssignment_1_2 )
            // InternalSat.g:825:3: rule__BiImpl__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BiImpl__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__Group_1__2__Impl"


    // $ANTLR start "rule__Impl__Group__0"
    // InternalSat.g:834:1: rule__Impl__Group__0 : rule__Impl__Group__0__Impl rule__Impl__Group__1 ;
    public final void rule__Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:838:1: ( rule__Impl__Group__0__Impl rule__Impl__Group__1 )
            // InternalSat.g:839:2: rule__Impl__Group__0__Impl rule__Impl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__0"


    // $ANTLR start "rule__Impl__Group__0__Impl"
    // InternalSat.g:846:1: rule__Impl__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:850:1: ( ( ruleOr ) )
            // InternalSat.g:851:1: ( ruleOr )
            {
            // InternalSat.g:851:1: ( ruleOr )
            // InternalSat.g:852:2: ruleOr
            {
             before(grammarAccess.getImplAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplAccess().getOrParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__0__Impl"


    // $ANTLR start "rule__Impl__Group__1"
    // InternalSat.g:861:1: rule__Impl__Group__1 : rule__Impl__Group__1__Impl ;
    public final void rule__Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:865:1: ( rule__Impl__Group__1__Impl )
            // InternalSat.g:866:2: rule__Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__1"


    // $ANTLR start "rule__Impl__Group__1__Impl"
    // InternalSat.g:872:1: rule__Impl__Group__1__Impl : ( ( rule__Impl__Group_1__0 )* ) ;
    public final void rule__Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:876:1: ( ( ( rule__Impl__Group_1__0 )* ) )
            // InternalSat.g:877:1: ( ( rule__Impl__Group_1__0 )* )
            {
            // InternalSat.g:877:1: ( ( rule__Impl__Group_1__0 )* )
            // InternalSat.g:878:2: ( rule__Impl__Group_1__0 )*
            {
             before(grammarAccess.getImplAccess().getGroup_1()); 
            // InternalSat.g:879:2: ( rule__Impl__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSat.g:879:3: rule__Impl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Impl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getImplAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group__1__Impl"


    // $ANTLR start "rule__Impl__Group_1__0"
    // InternalSat.g:888:1: rule__Impl__Group_1__0 : rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 ;
    public final void rule__Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:892:1: ( rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 )
            // InternalSat.g:893:2: rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__0"


    // $ANTLR start "rule__Impl__Group_1__0__Impl"
    // InternalSat.g:900:1: rule__Impl__Group_1__0__Impl : ( () ) ;
    public final void rule__Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:904:1: ( ( () ) )
            // InternalSat.g:905:1: ( () )
            {
            // InternalSat.g:905:1: ( () )
            // InternalSat.g:906:2: ()
            {
             before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 
            // InternalSat.g:907:2: ()
            // InternalSat.g:907:3: 
            {
            }

             after(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__0__Impl"


    // $ANTLR start "rule__Impl__Group_1__1"
    // InternalSat.g:915:1: rule__Impl__Group_1__1 : rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 ;
    public final void rule__Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:919:1: ( rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 )
            // InternalSat.g:920:2: rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__1"


    // $ANTLR start "rule__Impl__Group_1__1__Impl"
    // InternalSat.g:927:1: rule__Impl__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:931:1: ( ( '=>' ) )
            // InternalSat.g:932:1: ( '=>' )
            {
            // InternalSat.g:932:1: ( '=>' )
            // InternalSat.g:933:2: '=>'
            {
             before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__1__Impl"


    // $ANTLR start "rule__Impl__Group_1__2"
    // InternalSat.g:942:1: rule__Impl__Group_1__2 : rule__Impl__Group_1__2__Impl ;
    public final void rule__Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:946:1: ( rule__Impl__Group_1__2__Impl )
            // InternalSat.g:947:2: rule__Impl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Impl__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__2"


    // $ANTLR start "rule__Impl__Group_1__2__Impl"
    // InternalSat.g:953:1: rule__Impl__Group_1__2__Impl : ( ( rule__Impl__RightAssignment_1_2 ) ) ;
    public final void rule__Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:957:1: ( ( ( rule__Impl__RightAssignment_1_2 ) ) )
            // InternalSat.g:958:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            {
            // InternalSat.g:958:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            // InternalSat.g:959:2: ( rule__Impl__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplAccess().getRightAssignment_1_2()); 
            // InternalSat.g:960:2: ( rule__Impl__RightAssignment_1_2 )
            // InternalSat.g:960:3: rule__Impl__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Impl__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalSat.g:969:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:973:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSat.g:974:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalSat.g:981:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:985:1: ( ( ruleAnd ) )
            // InternalSat.g:986:1: ( ruleAnd )
            {
            // InternalSat.g:986:1: ( ruleAnd )
            // InternalSat.g:987:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalSat.g:996:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1000:1: ( rule__Or__Group__1__Impl )
            // InternalSat.g:1001:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalSat.g:1007:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1011:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSat.g:1012:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSat.g:1012:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSat.g:1013:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSat.g:1014:2: ( rule__Or__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSat.g:1014:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalSat.g:1023:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1027:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSat.g:1028:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalSat.g:1035:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1039:1: ( ( () ) )
            // InternalSat.g:1040:1: ( () )
            {
            // InternalSat.g:1040:1: ( () )
            // InternalSat.g:1041:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSat.g:1042:2: ()
            // InternalSat.g:1042:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalSat.g:1050:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1054:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSat.g:1055:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalSat.g:1062:1: rule__Or__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1066:1: ( ( 'v' ) )
            // InternalSat.g:1067:1: ( 'v' )
            {
            // InternalSat.g:1067:1: ( 'v' )
            // InternalSat.g:1068:2: 'v'
            {
             before(grammarAccess.getOrAccess().getVKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalSat.g:1077:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1081:1: ( rule__Or__Group_1__2__Impl )
            // InternalSat.g:1082:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalSat.g:1088:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1092:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSat.g:1093:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSat.g:1093:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSat.g:1094:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSat.g:1095:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSat.g:1095:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalSat.g:1104:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1108:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSat.g:1109:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalSat.g:1116:1: rule__And__Group__0__Impl : ( ruleNand ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1120:1: ( ( ruleNand ) )
            // InternalSat.g:1121:1: ( ruleNand )
            {
            // InternalSat.g:1121:1: ( ruleNand )
            // InternalSat.g:1122:2: ruleNand
            {
             before(grammarAccess.getAndAccess().getNandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalSat.g:1131:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1135:1: ( rule__And__Group__1__Impl )
            // InternalSat.g:1136:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalSat.g:1142:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1146:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSat.g:1147:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSat.g:1147:1: ( ( rule__And__Group_1__0 )* )
            // InternalSat.g:1148:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSat.g:1149:2: ( rule__And__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSat.g:1149:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalSat.g:1158:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1162:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSat.g:1163:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalSat.g:1170:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1174:1: ( ( () ) )
            // InternalSat.g:1175:1: ( () )
            {
            // InternalSat.g:1175:1: ( () )
            // InternalSat.g:1176:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSat.g:1177:2: ()
            // InternalSat.g:1177:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalSat.g:1185:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1189:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSat.g:1190:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalSat.g:1197:1: rule__And__Group_1__1__Impl : ( '^' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1201:1: ( ( '^' ) )
            // InternalSat.g:1202:1: ( '^' )
            {
            // InternalSat.g:1202:1: ( '^' )
            // InternalSat.g:1203:2: '^'
            {
             before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalSat.g:1212:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1216:1: ( rule__And__Group_1__2__Impl )
            // InternalSat.g:1217:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalSat.g:1223:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1227:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSat.g:1228:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSat.g:1228:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSat.g:1229:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSat.g:1230:2: ( rule__And__RightAssignment_1_2 )
            // InternalSat.g:1230:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Nand__Group__0"
    // InternalSat.g:1239:1: rule__Nand__Group__0 : rule__Nand__Group__0__Impl rule__Nand__Group__1 ;
    public final void rule__Nand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1243:1: ( rule__Nand__Group__0__Impl rule__Nand__Group__1 )
            // InternalSat.g:1244:2: rule__Nand__Group__0__Impl rule__Nand__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Nand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__0"


    // $ANTLR start "rule__Nand__Group__0__Impl"
    // InternalSat.g:1251:1: rule__Nand__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Nand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1255:1: ( ( rulePrimary ) )
            // InternalSat.g:1256:1: ( rulePrimary )
            {
            // InternalSat.g:1256:1: ( rulePrimary )
            // InternalSat.g:1257:2: rulePrimary
            {
             before(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNandAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__0__Impl"


    // $ANTLR start "rule__Nand__Group__1"
    // InternalSat.g:1266:1: rule__Nand__Group__1 : rule__Nand__Group__1__Impl ;
    public final void rule__Nand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1270:1: ( rule__Nand__Group__1__Impl )
            // InternalSat.g:1271:2: rule__Nand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__1"


    // $ANTLR start "rule__Nand__Group__1__Impl"
    // InternalSat.g:1277:1: rule__Nand__Group__1__Impl : ( ( rule__Nand__Group_1__0 )* ) ;
    public final void rule__Nand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1281:1: ( ( ( rule__Nand__Group_1__0 )* ) )
            // InternalSat.g:1282:1: ( ( rule__Nand__Group_1__0 )* )
            {
            // InternalSat.g:1282:1: ( ( rule__Nand__Group_1__0 )* )
            // InternalSat.g:1283:2: ( rule__Nand__Group_1__0 )*
            {
             before(grammarAccess.getNandAccess().getGroup_1()); 
            // InternalSat.g:1284:2: ( rule__Nand__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSat.g:1284:3: rule__Nand__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Nand__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNandAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group__1__Impl"


    // $ANTLR start "rule__Nand__Group_1__0"
    // InternalSat.g:1293:1: rule__Nand__Group_1__0 : rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 ;
    public final void rule__Nand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1297:1: ( rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 )
            // InternalSat.g:1298:2: rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Nand__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__0"


    // $ANTLR start "rule__Nand__Group_1__0__Impl"
    // InternalSat.g:1305:1: rule__Nand__Group_1__0__Impl : ( () ) ;
    public final void rule__Nand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1309:1: ( ( () ) )
            // InternalSat.g:1310:1: ( () )
            {
            // InternalSat.g:1310:1: ( () )
            // InternalSat.g:1311:2: ()
            {
             before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 
            // InternalSat.g:1312:2: ()
            // InternalSat.g:1312:3: 
            {
            }

             after(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__0__Impl"


    // $ANTLR start "rule__Nand__Group_1__1"
    // InternalSat.g:1320:1: rule__Nand__Group_1__1 : rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 ;
    public final void rule__Nand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1324:1: ( rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 )
            // InternalSat.g:1325:2: rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Nand__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__1"


    // $ANTLR start "rule__Nand__Group_1__1__Impl"
    // InternalSat.g:1332:1: rule__Nand__Group_1__1__Impl : ( ( rule__Nand__Alternatives_1_1 ) ) ;
    public final void rule__Nand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1336:1: ( ( ( rule__Nand__Alternatives_1_1 ) ) )
            // InternalSat.g:1337:1: ( ( rule__Nand__Alternatives_1_1 ) )
            {
            // InternalSat.g:1337:1: ( ( rule__Nand__Alternatives_1_1 ) )
            // InternalSat.g:1338:2: ( rule__Nand__Alternatives_1_1 )
            {
             before(grammarAccess.getNandAccess().getAlternatives_1_1()); 
            // InternalSat.g:1339:2: ( rule__Nand__Alternatives_1_1 )
            // InternalSat.g:1339:3: rule__Nand__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__1__Impl"


    // $ANTLR start "rule__Nand__Group_1__2"
    // InternalSat.g:1347:1: rule__Nand__Group_1__2 : rule__Nand__Group_1__2__Impl ;
    public final void rule__Nand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1351:1: ( rule__Nand__Group_1__2__Impl )
            // InternalSat.g:1352:2: rule__Nand__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nand__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__2"


    // $ANTLR start "rule__Nand__Group_1__2__Impl"
    // InternalSat.g:1358:1: rule__Nand__Group_1__2__Impl : ( ( rule__Nand__RightAssignment_1_2 ) ) ;
    public final void rule__Nand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1362:1: ( ( ( rule__Nand__RightAssignment_1_2 ) ) )
            // InternalSat.g:1363:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            {
            // InternalSat.g:1363:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            // InternalSat.g:1364:2: ( rule__Nand__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandAccess().getRightAssignment_1_2()); 
            // InternalSat.g:1365:2: ( rule__Nand__RightAssignment_1_2 )
            // InternalSat.g:1365:3: rule__Nand__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Nand__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNandAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalSat.g:1374:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1378:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalSat.g:1379:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalSat.g:1386:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1390:1: ( ( '(' ) )
            // InternalSat.g:1391:1: ( '(' )
            {
            // InternalSat.g:1391:1: ( '(' )
            // InternalSat.g:1392:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalSat.g:1401:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1405:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalSat.g:1406:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalSat.g:1413:1: rule__Primary__Group_0__1__Impl : ( ruleModel ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1417:1: ( ( ruleModel ) )
            // InternalSat.g:1418:1: ( ruleModel )
            {
            // InternalSat.g:1418:1: ( ruleModel )
            // InternalSat.g:1419:2: ruleModel
            {
             before(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getModelParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalSat.g:1428:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1432:1: ( rule__Primary__Group_0__2__Impl )
            // InternalSat.g:1433:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalSat.g:1439:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1443:1: ( ( ')' ) )
            // InternalSat.g:1444:1: ( ')' )
            {
            // InternalSat.g:1444:1: ( ')' )
            // InternalSat.g:1445:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalSat.g:1455:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1459:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalSat.g:1460:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Not__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // InternalSat.g:1467:1: rule__Not__Group__0__Impl : ( ( rule__Not__Alternatives_0 ) ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1471:1: ( ( ( rule__Not__Alternatives_0 ) ) )
            // InternalSat.g:1472:1: ( ( rule__Not__Alternatives_0 ) )
            {
            // InternalSat.g:1472:1: ( ( rule__Not__Alternatives_0 ) )
            // InternalSat.g:1473:2: ( rule__Not__Alternatives_0 )
            {
             before(grammarAccess.getNotAccess().getAlternatives_0()); 
            // InternalSat.g:1474:2: ( rule__Not__Alternatives_0 )
            // InternalSat.g:1474:3: rule__Not__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // InternalSat.g:1482:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1486:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalSat.g:1487:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FOLLOW_1);
            rule__Not__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // InternalSat.g:1494:1: rule__Not__Group__1__Impl : ( rulePrimary ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1498:1: ( ( rulePrimary ) )
            // InternalSat.g:1499:1: ( rulePrimary )
            {
            // InternalSat.g:1499:1: ( rulePrimary )
            // InternalSat.g:1500:2: rulePrimary
            {
             before(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNotAccess().getPrimaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group__2"
    // InternalSat.g:1509:1: rule__Not__Group__2 : rule__Not__Group__2__Impl ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1513:1: ( rule__Not__Group__2__Impl )
            // InternalSat.g:1514:2: rule__Not__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2"


    // $ANTLR start "rule__Not__Group__2__Impl"
    // InternalSat.g:1520:1: rule__Not__Group__2__Impl : ( () ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1524:1: ( ( () ) )
            // InternalSat.g:1525:1: ( () )
            {
            // InternalSat.g:1525:1: ( () )
            // InternalSat.g:1526:2: ()
            {
             before(grammarAccess.getNotAccess().getNotExpressionAction_2()); 
            // InternalSat.g:1527:2: ()
            // InternalSat.g:1527:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotExpressionAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2__Impl"


    // $ANTLR start "rule__Sat__TypeAssignment_0"
    // InternalSat.g:1536:1: rule__Sat__TypeAssignment_0 : ( ( rule__Sat__TypeAlternatives_0_0 ) ) ;
    public final void rule__Sat__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1540:1: ( ( ( rule__Sat__TypeAlternatives_0_0 ) ) )
            // InternalSat.g:1541:2: ( ( rule__Sat__TypeAlternatives_0_0 ) )
            {
            // InternalSat.g:1541:2: ( ( rule__Sat__TypeAlternatives_0_0 ) )
            // InternalSat.g:1542:3: ( rule__Sat__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getSatAccess().getTypeAlternatives_0_0()); 
            // InternalSat.g:1543:3: ( rule__Sat__TypeAlternatives_0_0 )
            // InternalSat.g:1543:4: rule__Sat__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Sat__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSatAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__TypeAssignment_0"


    // $ANTLR start "rule__Sat__Solver_methodAssignment_1"
    // InternalSat.g:1551:1: rule__Sat__Solver_methodAssignment_1 : ( ruleSATSolverMethod ) ;
    public final void rule__Sat__Solver_methodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1555:1: ( ( ruleSATSolverMethod ) )
            // InternalSat.g:1556:2: ( ruleSATSolverMethod )
            {
            // InternalSat.g:1556:2: ( ruleSATSolverMethod )
            // InternalSat.g:1557:3: ruleSATSolverMethod
            {
             before(grammarAccess.getSatAccess().getSolver_methodSATSolverMethodEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSATSolverMethod();

            state._fsp--;

             after(grammarAccess.getSatAccess().getSolver_methodSATSolverMethodEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sat__Solver_methodAssignment_1"


    // $ANTLR start "rule__DimacsFile__FilepathAssignment_1"
    // InternalSat.g:1566:1: rule__DimacsFile__FilepathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DimacsFile__FilepathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1570:1: ( ( RULE_STRING ) )
            // InternalSat.g:1571:2: ( RULE_STRING )
            {
            // InternalSat.g:1571:2: ( RULE_STRING )
            // InternalSat.g:1572:3: RULE_STRING
            {
             before(grammarAccess.getDimacsFileAccess().getFilepathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDimacsFileAccess().getFilepathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimacsFile__FilepathAssignment_1"


    // $ANTLR start "rule__InlineFormula__ModelAssignment_1"
    // InternalSat.g:1581:1: rule__InlineFormula__ModelAssignment_1 : ( ruleModel ) ;
    public final void rule__InlineFormula__ModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1585:1: ( ( ruleModel ) )
            // InternalSat.g:1586:2: ( ruleModel )
            {
            // InternalSat.g:1586:2: ( ruleModel )
            // InternalSat.g:1587:3: ruleModel
            {
             before(grammarAccess.getInlineFormulaAccess().getModelModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getInlineFormulaAccess().getModelModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineFormula__ModelAssignment_1"


    // $ANTLR start "rule__BiImpl__RightAssignment_1_2"
    // InternalSat.g:1596:1: rule__BiImpl__RightAssignment_1_2 : ( ruleImpl ) ;
    public final void rule__BiImpl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1600:1: ( ( ruleImpl ) )
            // InternalSat.g:1601:2: ( ruleImpl )
            {
            // InternalSat.g:1601:2: ( ruleImpl )
            // InternalSat.g:1602:3: ruleImpl
            {
             before(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImpl();

            state._fsp--;

             after(grammarAccess.getBiImplAccess().getRightImplParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImpl__RightAssignment_1_2"


    // $ANTLR start "rule__Impl__RightAssignment_1_2"
    // InternalSat.g:1611:1: rule__Impl__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Impl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1615:1: ( ( ruleOr ) )
            // InternalSat.g:1616:2: ( ruleOr )
            {
            // InternalSat.g:1616:2: ( ruleOr )
            // InternalSat.g:1617:3: ruleOr
            {
             before(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplAccess().getRightOrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Impl__RightAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalSat.g:1626:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1630:1: ( ( ruleAnd ) )
            // InternalSat.g:1631:2: ( ruleAnd )
            {
            // InternalSat.g:1631:2: ( ruleAnd )
            // InternalSat.g:1632:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalSat.g:1641:1: rule__And__RightAssignment_1_2 : ( ruleNand ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1645:1: ( ( ruleNand ) )
            // InternalSat.g:1646:2: ( ruleNand )
            {
            // InternalSat.g:1646:2: ( ruleNand )
            // InternalSat.g:1647:3: ruleNand
            {
             before(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNand();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightNandParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Nand__RightAssignment_1_2"
    // InternalSat.g:1656:1: rule__Nand__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Nand__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1660:1: ( ( rulePrimary ) )
            // InternalSat.g:1661:2: ( rulePrimary )
            {
            // InternalSat.g:1661:2: ( rulePrimary )
            // InternalSat.g:1662:3: rulePrimary
            {
             before(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNandAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nand__RightAssignment_1_2"


    // $ANTLR start "rule__Var__IdAssignment"
    // InternalSat.g:1671:1: rule__Var__IdAssignment : ( RULE_ID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1675:1: ( ( RULE_ID ) )
            // InternalSat.g:1676:2: ( RULE_ID )
            {
            // InternalSat.g:1676:2: ( RULE_ID )
            // InternalSat.g:1677:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__IdAssignment"


    // $ANTLR start "rule__Const__ValAssignment"
    // InternalSat.g:1686:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:1690:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalSat.g:1691:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalSat.g:1691:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalSat.g:1692:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalSat.g:1693:3: ( rule__Const__ValAlternatives_0 )
            // InternalSat.g:1693:4: rule__Const__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000401E020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});

}