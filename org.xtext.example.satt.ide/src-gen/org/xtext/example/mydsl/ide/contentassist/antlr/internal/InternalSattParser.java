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
import org.xtext.example.mydsl.services.SattGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSattParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'\\u2191'", "'!'", "'~'", "'true'", "'false'", "'sat4j-java'", "'sat4j-jar'", "'sat4j-maven'", "'file'", "'<=>'", "'=>'", "'v'", "'^'", "'('", "')'"
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


        public InternalSattParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSattParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSattParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSatt.g"; }


    	private SattGrammarAccess grammarAccess;

    	public void setGrammarAccess(SattGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSAT"
    // InternalSatt.g:53:1: entryRuleSAT : ruleSAT EOF ;
    public final void entryRuleSAT() throws RecognitionException {
        try {
            // InternalSatt.g:54:1: ( ruleSAT EOF )
            // InternalSatt.g:55:1: ruleSAT EOF
            {
             before(grammarAccess.getSATRule()); 
            pushFollow(FOLLOW_1);
            ruleSAT();

            state._fsp--;

             after(grammarAccess.getSATRule()); 
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
    // $ANTLR end "entryRuleSAT"


    // $ANTLR start "ruleSAT"
    // InternalSatt.g:62:1: ruleSAT : ( ( rule__SAT__Group__0 ) ) ;
    public final void ruleSAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:66:2: ( ( ( rule__SAT__Group__0 ) ) )
            // InternalSatt.g:67:2: ( ( rule__SAT__Group__0 ) )
            {
            // InternalSatt.g:67:2: ( ( rule__SAT__Group__0 ) )
            // InternalSatt.g:68:3: ( rule__SAT__Group__0 )
            {
             before(grammarAccess.getSATAccess().getGroup()); 
            // InternalSatt.g:69:3: ( rule__SAT__Group__0 )
            // InternalSatt.g:69:4: rule__SAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSATAccess().getGroup()); 

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
    // $ANTLR end "ruleSAT"


    // $ANTLR start "entryRuleFILE"
    // InternalSatt.g:78:1: entryRuleFILE : ruleFILE EOF ;
    public final void entryRuleFILE() throws RecognitionException {
        try {
            // InternalSatt.g:79:1: ( ruleFILE EOF )
            // InternalSatt.g:80:1: ruleFILE EOF
            {
             before(grammarAccess.getFILERule()); 
            pushFollow(FOLLOW_1);
            ruleFILE();

            state._fsp--;

             after(grammarAccess.getFILERule()); 
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
    // $ANTLR end "entryRuleFILE"


    // $ANTLR start "ruleFILE"
    // InternalSatt.g:87:1: ruleFILE : ( ( rule__FILE__Group__0 ) ) ;
    public final void ruleFILE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:91:2: ( ( ( rule__FILE__Group__0 ) ) )
            // InternalSatt.g:92:2: ( ( rule__FILE__Group__0 ) )
            {
            // InternalSatt.g:92:2: ( ( rule__FILE__Group__0 ) )
            // InternalSatt.g:93:3: ( rule__FILE__Group__0 )
            {
             before(grammarAccess.getFILEAccess().getGroup()); 
            // InternalSatt.g:94:3: ( rule__FILE__Group__0 )
            // InternalSatt.g:94:4: rule__FILE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FILE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFILEAccess().getGroup()); 

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
    // $ANTLR end "ruleFILE"


    // $ANTLR start "entryRuleModel"
    // InternalSatt.g:103:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSatt.g:104:1: ( ruleModel EOF )
            // InternalSatt.g:105:1: ruleModel EOF
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
    // InternalSatt.g:112:1: ruleModel : ( ruleBiImpl ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:116:2: ( ( ruleBiImpl ) )
            // InternalSatt.g:117:2: ( ruleBiImpl )
            {
            // InternalSatt.g:117:2: ( ruleBiImpl )
            // InternalSatt.g:118:3: ruleBiImpl
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
    // InternalSatt.g:128:1: entryRuleBiImpl : ruleBiImpl EOF ;
    public final void entryRuleBiImpl() throws RecognitionException {
        try {
            // InternalSatt.g:129:1: ( ruleBiImpl EOF )
            // InternalSatt.g:130:1: ruleBiImpl EOF
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
    // InternalSatt.g:137:1: ruleBiImpl : ( ( rule__BiImpl__Group__0 ) ) ;
    public final void ruleBiImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:141:2: ( ( ( rule__BiImpl__Group__0 ) ) )
            // InternalSatt.g:142:2: ( ( rule__BiImpl__Group__0 ) )
            {
            // InternalSatt.g:142:2: ( ( rule__BiImpl__Group__0 ) )
            // InternalSatt.g:143:3: ( rule__BiImpl__Group__0 )
            {
             before(grammarAccess.getBiImplAccess().getGroup()); 
            // InternalSatt.g:144:3: ( rule__BiImpl__Group__0 )
            // InternalSatt.g:144:4: rule__BiImpl__Group__0
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
    // InternalSatt.g:153:1: entryRuleImpl : ruleImpl EOF ;
    public final void entryRuleImpl() throws RecognitionException {
        try {
            // InternalSatt.g:154:1: ( ruleImpl EOF )
            // InternalSatt.g:155:1: ruleImpl EOF
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
    // InternalSatt.g:162:1: ruleImpl : ( ( rule__Impl__Group__0 ) ) ;
    public final void ruleImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:166:2: ( ( ( rule__Impl__Group__0 ) ) )
            // InternalSatt.g:167:2: ( ( rule__Impl__Group__0 ) )
            {
            // InternalSatt.g:167:2: ( ( rule__Impl__Group__0 ) )
            // InternalSatt.g:168:3: ( rule__Impl__Group__0 )
            {
             before(grammarAccess.getImplAccess().getGroup()); 
            // InternalSatt.g:169:3: ( rule__Impl__Group__0 )
            // InternalSatt.g:169:4: rule__Impl__Group__0
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
    // InternalSatt.g:178:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSatt.g:179:1: ( ruleOr EOF )
            // InternalSatt.g:180:1: ruleOr EOF
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
    // InternalSatt.g:187:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:191:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSatt.g:192:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSatt.g:192:2: ( ( rule__Or__Group__0 ) )
            // InternalSatt.g:193:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalSatt.g:194:3: ( rule__Or__Group__0 )
            // InternalSatt.g:194:4: rule__Or__Group__0
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
    // InternalSatt.g:203:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSatt.g:204:1: ( ruleAnd EOF )
            // InternalSatt.g:205:1: ruleAnd EOF
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
    // InternalSatt.g:212:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:216:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSatt.g:217:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSatt.g:217:2: ( ( rule__And__Group__0 ) )
            // InternalSatt.g:218:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSatt.g:219:3: ( rule__And__Group__0 )
            // InternalSatt.g:219:4: rule__And__Group__0
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
    // InternalSatt.g:228:1: entryRuleNand : ruleNand EOF ;
    public final void entryRuleNand() throws RecognitionException {
        try {
            // InternalSatt.g:229:1: ( ruleNand EOF )
            // InternalSatt.g:230:1: ruleNand EOF
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
    // InternalSatt.g:237:1: ruleNand : ( ( rule__Nand__Group__0 ) ) ;
    public final void ruleNand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:241:2: ( ( ( rule__Nand__Group__0 ) ) )
            // InternalSatt.g:242:2: ( ( rule__Nand__Group__0 ) )
            {
            // InternalSatt.g:242:2: ( ( rule__Nand__Group__0 ) )
            // InternalSatt.g:243:3: ( rule__Nand__Group__0 )
            {
             before(grammarAccess.getNandAccess().getGroup()); 
            // InternalSatt.g:244:3: ( rule__Nand__Group__0 )
            // InternalSatt.g:244:4: rule__Nand__Group__0
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
    // InternalSatt.g:253:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSatt.g:254:1: ( rulePrimary EOF )
            // InternalSatt.g:255:1: rulePrimary EOF
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
    // InternalSatt.g:262:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:266:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSatt.g:267:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSatt.g:267:2: ( ( rule__Primary__Alternatives ) )
            // InternalSatt.g:268:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSatt.g:269:3: ( rule__Primary__Alternatives )
            // InternalSatt.g:269:4: rule__Primary__Alternatives
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
    // InternalSatt.g:278:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSatt.g:279:1: ( ruleNot EOF )
            // InternalSatt.g:280:1: ruleNot EOF
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
    // InternalSatt.g:287:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:291:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalSatt.g:292:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalSatt.g:292:2: ( ( rule__Not__Group__0 ) )
            // InternalSatt.g:293:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalSatt.g:294:3: ( rule__Not__Group__0 )
            // InternalSatt.g:294:4: rule__Not__Group__0
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
    // InternalSatt.g:303:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalSatt.g:304:1: ( ruleVar EOF )
            // InternalSatt.g:305:1: ruleVar EOF
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
    // InternalSatt.g:312:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:316:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalSatt.g:317:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalSatt.g:317:2: ( ( rule__Var__IdAssignment ) )
            // InternalSatt.g:318:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalSatt.g:319:3: ( rule__Var__IdAssignment )
            // InternalSatt.g:319:4: rule__Var__IdAssignment
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
    // InternalSatt.g:328:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalSatt.g:329:1: ( ruleConst EOF )
            // InternalSatt.g:330:1: ruleConst EOF
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
    // InternalSatt.g:337:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:341:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalSatt.g:342:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalSatt.g:342:2: ( ( rule__Const__ValAssignment ) )
            // InternalSatt.g:343:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalSatt.g:344:3: ( rule__Const__ValAssignment )
            // InternalSatt.g:344:4: rule__Const__ValAssignment
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


    // $ANTLR start "ruleSATCallMethod"
    // InternalSatt.g:353:1: ruleSATCallMethod : ( ( rule__SATCallMethod__Alternatives ) ) ;
    public final void ruleSATCallMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:357:1: ( ( ( rule__SATCallMethod__Alternatives ) ) )
            // InternalSatt.g:358:2: ( ( rule__SATCallMethod__Alternatives ) )
            {
            // InternalSatt.g:358:2: ( ( rule__SATCallMethod__Alternatives ) )
            // InternalSatt.g:359:3: ( rule__SATCallMethod__Alternatives )
            {
             before(grammarAccess.getSATCallMethodAccess().getAlternatives()); 
            // InternalSatt.g:360:3: ( rule__SATCallMethod__Alternatives )
            // InternalSatt.g:360:4: rule__SATCallMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SATCallMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSATCallMethodAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSATCallMethod"


    // $ANTLR start "rule__SAT__SourceAlternatives_0_0"
    // InternalSatt.g:368:1: rule__SAT__SourceAlternatives_0_0 : ( ( ruleFILE ) | ( ruleModel ) );
    public final void rule__SAT__SourceAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:372:1: ( ( ruleFILE ) | ( ruleModel ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=16)||LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSatt.g:373:2: ( ruleFILE )
                    {
                    // InternalSatt.g:373:2: ( ruleFILE )
                    // InternalSatt.g:374:3: ruleFILE
                    {
                     before(grammarAccess.getSATAccess().getSourceFILEParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFILE();

                    state._fsp--;

                     after(grammarAccess.getSATAccess().getSourceFILEParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:379:2: ( ruleModel )
                    {
                    // InternalSatt.g:379:2: ( ruleModel )
                    // InternalSatt.g:380:3: ruleModel
                    {
                     before(grammarAccess.getSATAccess().getSourceModelParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;

                     after(grammarAccess.getSATAccess().getSourceModelParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__SAT__SourceAlternatives_0_0"


    // $ANTLR start "rule__Nand__Alternatives_1_1"
    // InternalSatt.g:389:1: rule__Nand__Alternatives_1_1 : ( ( '|' ) | ( '\\u2191' ) );
    public final void rule__Nand__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:393:1: ( ( '|' ) | ( '\\u2191' ) )
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
                    // InternalSatt.g:394:2: ( '|' )
                    {
                    // InternalSatt.g:394:2: ( '|' )
                    // InternalSatt.g:395:3: '|'
                    {
                     before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:400:2: ( '\\u2191' )
                    {
                    // InternalSatt.g:400:2: ( '\\u2191' )
                    // InternalSatt.g:401:3: '\\u2191'
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
    // InternalSatt.g:410:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:414:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
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
                    // InternalSatt.g:415:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalSatt.g:415:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalSatt.g:416:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalSatt.g:417:3: ( rule__Primary__Group_0__0 )
                    // InternalSatt.g:417:4: rule__Primary__Group_0__0
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
                    // InternalSatt.g:421:2: ( ruleNot )
                    {
                    // InternalSatt.g:421:2: ( ruleNot )
                    // InternalSatt.g:422:3: ruleNot
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
                    // InternalSatt.g:427:2: ( ruleConst )
                    {
                    // InternalSatt.g:427:2: ( ruleConst )
                    // InternalSatt.g:428:3: ruleConst
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
                    // InternalSatt.g:433:2: ( ruleVar )
                    {
                    // InternalSatt.g:433:2: ( ruleVar )
                    // InternalSatt.g:434:3: ruleVar
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
    // InternalSatt.g:443:1: rule__Not__Alternatives_0 : ( ( '!' ) | ( '~' ) );
    public final void rule__Not__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:447:1: ( ( '!' ) | ( '~' ) )
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
                    // InternalSatt.g:448:2: ( '!' )
                    {
                    // InternalSatt.g:448:2: ( '!' )
                    // InternalSatt.g:449:3: '!'
                    {
                     before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:454:2: ( '~' )
                    {
                    // InternalSatt.g:454:2: ( '~' )
                    // InternalSatt.g:455:3: '~'
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
    // InternalSatt.g:464:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:468:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalSatt.g:469:2: ( 'true' )
                    {
                    // InternalSatt.g:469:2: ( 'true' )
                    // InternalSatt.g:470:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:475:2: ( 'false' )
                    {
                    // InternalSatt.g:475:2: ( 'false' )
                    // InternalSatt.g:476:3: 'false'
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


    // $ANTLR start "rule__SATCallMethod__Alternatives"
    // InternalSatt.g:485:1: rule__SATCallMethod__Alternatives : ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) );
    public final void rule__SATCallMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:489:1: ( ( ( 'sat4j-java' ) ) | ( ( 'sat4j-jar' ) ) | ( ( 'sat4j-maven' ) ) )
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
                    // InternalSatt.g:490:2: ( ( 'sat4j-java' ) )
                    {
                    // InternalSatt.g:490:2: ( ( 'sat4j-java' ) )
                    // InternalSatt.g:491:3: ( 'sat4j-java' )
                    {
                     before(grammarAccess.getSATCallMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 
                    // InternalSatt.g:492:3: ( 'sat4j-java' )
                    // InternalSatt.g:492:4: 'sat4j-java'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATCallMethodAccess().getSAT4J_JAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:496:2: ( ( 'sat4j-jar' ) )
                    {
                    // InternalSatt.g:496:2: ( ( 'sat4j-jar' ) )
                    // InternalSatt.g:497:3: ( 'sat4j-jar' )
                    {
                     before(grammarAccess.getSATCallMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 
                    // InternalSatt.g:498:3: ( 'sat4j-jar' )
                    // InternalSatt.g:498:4: 'sat4j-jar'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATCallMethodAccess().getSAT4J_JAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSatt.g:502:2: ( ( 'sat4j-maven' ) )
                    {
                    // InternalSatt.g:502:2: ( ( 'sat4j-maven' ) )
                    // InternalSatt.g:503:3: ( 'sat4j-maven' )
                    {
                     before(grammarAccess.getSATCallMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2()); 
                    // InternalSatt.g:504:3: ( 'sat4j-maven' )
                    // InternalSatt.g:504:4: 'sat4j-maven'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSATCallMethodAccess().getSAT4J_MAVENEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SATCallMethod__Alternatives"


    // $ANTLR start "rule__SAT__Group__0"
    // InternalSatt.g:512:1: rule__SAT__Group__0 : rule__SAT__Group__0__Impl rule__SAT__Group__1 ;
    public final void rule__SAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:516:1: ( rule__SAT__Group__0__Impl rule__SAT__Group__1 )
            // InternalSatt.g:517:2: rule__SAT__Group__0__Impl rule__SAT__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAT__Group__1();

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
    // $ANTLR end "rule__SAT__Group__0"


    // $ANTLR start "rule__SAT__Group__0__Impl"
    // InternalSatt.g:524:1: rule__SAT__Group__0__Impl : ( ( rule__SAT__SourceAssignment_0 ) ) ;
    public final void rule__SAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:528:1: ( ( ( rule__SAT__SourceAssignment_0 ) ) )
            // InternalSatt.g:529:1: ( ( rule__SAT__SourceAssignment_0 ) )
            {
            // InternalSatt.g:529:1: ( ( rule__SAT__SourceAssignment_0 ) )
            // InternalSatt.g:530:2: ( rule__SAT__SourceAssignment_0 )
            {
             before(grammarAccess.getSATAccess().getSourceAssignment_0()); 
            // InternalSatt.g:531:2: ( rule__SAT__SourceAssignment_0 )
            // InternalSatt.g:531:3: rule__SAT__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SAT__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSATAccess().getSourceAssignment_0()); 

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
    // $ANTLR end "rule__SAT__Group__0__Impl"


    // $ANTLR start "rule__SAT__Group__1"
    // InternalSatt.g:539:1: rule__SAT__Group__1 : rule__SAT__Group__1__Impl ;
    public final void rule__SAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:543:1: ( rule__SAT__Group__1__Impl )
            // InternalSatt.g:544:2: rule__SAT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAT__Group__1__Impl();

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
    // $ANTLR end "rule__SAT__Group__1"


    // $ANTLR start "rule__SAT__Group__1__Impl"
    // InternalSatt.g:550:1: rule__SAT__Group__1__Impl : ( ( rule__SAT__CallMethodAssignment_1 ) ) ;
    public final void rule__SAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:554:1: ( ( ( rule__SAT__CallMethodAssignment_1 ) ) )
            // InternalSatt.g:555:1: ( ( rule__SAT__CallMethodAssignment_1 ) )
            {
            // InternalSatt.g:555:1: ( ( rule__SAT__CallMethodAssignment_1 ) )
            // InternalSatt.g:556:2: ( rule__SAT__CallMethodAssignment_1 )
            {
             before(grammarAccess.getSATAccess().getCallMethodAssignment_1()); 
            // InternalSatt.g:557:2: ( rule__SAT__CallMethodAssignment_1 )
            // InternalSatt.g:557:3: rule__SAT__CallMethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SAT__CallMethodAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSATAccess().getCallMethodAssignment_1()); 

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
    // $ANTLR end "rule__SAT__Group__1__Impl"


    // $ANTLR start "rule__FILE__Group__0"
    // InternalSatt.g:566:1: rule__FILE__Group__0 : rule__FILE__Group__0__Impl rule__FILE__Group__1 ;
    public final void rule__FILE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:570:1: ( rule__FILE__Group__0__Impl rule__FILE__Group__1 )
            // InternalSatt.g:571:2: rule__FILE__Group__0__Impl rule__FILE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FILE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FILE__Group__1();

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
    // $ANTLR end "rule__FILE__Group__0"


    // $ANTLR start "rule__FILE__Group__0__Impl"
    // InternalSatt.g:578:1: rule__FILE__Group__0__Impl : ( 'file' ) ;
    public final void rule__FILE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:582:1: ( ( 'file' ) )
            // InternalSatt.g:583:1: ( 'file' )
            {
            // InternalSatt.g:583:1: ( 'file' )
            // InternalSatt.g:584:2: 'file'
            {
             before(grammarAccess.getFILEAccess().getFileKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFILEAccess().getFileKeyword_0()); 

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
    // $ANTLR end "rule__FILE__Group__0__Impl"


    // $ANTLR start "rule__FILE__Group__1"
    // InternalSatt.g:593:1: rule__FILE__Group__1 : rule__FILE__Group__1__Impl ;
    public final void rule__FILE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:597:1: ( rule__FILE__Group__1__Impl )
            // InternalSatt.g:598:2: rule__FILE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FILE__Group__1__Impl();

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
    // $ANTLR end "rule__FILE__Group__1"


    // $ANTLR start "rule__FILE__Group__1__Impl"
    // InternalSatt.g:604:1: rule__FILE__Group__1__Impl : ( ( rule__FILE__FileAssignment_1 ) ) ;
    public final void rule__FILE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:608:1: ( ( ( rule__FILE__FileAssignment_1 ) ) )
            // InternalSatt.g:609:1: ( ( rule__FILE__FileAssignment_1 ) )
            {
            // InternalSatt.g:609:1: ( ( rule__FILE__FileAssignment_1 ) )
            // InternalSatt.g:610:2: ( rule__FILE__FileAssignment_1 )
            {
             before(grammarAccess.getFILEAccess().getFileAssignment_1()); 
            // InternalSatt.g:611:2: ( rule__FILE__FileAssignment_1 )
            // InternalSatt.g:611:3: rule__FILE__FileAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FILE__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFILEAccess().getFileAssignment_1()); 

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
    // $ANTLR end "rule__FILE__Group__1__Impl"


    // $ANTLR start "rule__BiImpl__Group__0"
    // InternalSatt.g:620:1: rule__BiImpl__Group__0 : rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 ;
    public final void rule__BiImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:624:1: ( rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 )
            // InternalSatt.g:625:2: rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSatt.g:632:1: rule__BiImpl__Group__0__Impl : ( ruleImpl ) ;
    public final void rule__BiImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:636:1: ( ( ruleImpl ) )
            // InternalSatt.g:637:1: ( ruleImpl )
            {
            // InternalSatt.g:637:1: ( ruleImpl )
            // InternalSatt.g:638:2: ruleImpl
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
    // InternalSatt.g:647:1: rule__BiImpl__Group__1 : rule__BiImpl__Group__1__Impl ;
    public final void rule__BiImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:651:1: ( rule__BiImpl__Group__1__Impl )
            // InternalSatt.g:652:2: rule__BiImpl__Group__1__Impl
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
    // InternalSatt.g:658:1: rule__BiImpl__Group__1__Impl : ( ( rule__BiImpl__Group_1__0 )* ) ;
    public final void rule__BiImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:662:1: ( ( ( rule__BiImpl__Group_1__0 )* ) )
            // InternalSatt.g:663:1: ( ( rule__BiImpl__Group_1__0 )* )
            {
            // InternalSatt.g:663:1: ( ( rule__BiImpl__Group_1__0 )* )
            // InternalSatt.g:664:2: ( rule__BiImpl__Group_1__0 )*
            {
             before(grammarAccess.getBiImplAccess().getGroup_1()); 
            // InternalSatt.g:665:2: ( rule__BiImpl__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSatt.g:665:3: rule__BiImpl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalSatt.g:674:1: rule__BiImpl__Group_1__0 : rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 ;
    public final void rule__BiImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:678:1: ( rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 )
            // InternalSatt.g:679:2: rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSatt.g:686:1: rule__BiImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:690:1: ( ( () ) )
            // InternalSatt.g:691:1: ( () )
            {
            // InternalSatt.g:691:1: ( () )
            // InternalSatt.g:692:2: ()
            {
             before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 
            // InternalSatt.g:693:2: ()
            // InternalSatt.g:693:3: 
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
    // InternalSatt.g:701:1: rule__BiImpl__Group_1__1 : rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 ;
    public final void rule__BiImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:705:1: ( rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 )
            // InternalSatt.g:706:2: rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:713:1: rule__BiImpl__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:717:1: ( ( '<=>' ) )
            // InternalSatt.g:718:1: ( '<=>' )
            {
            // InternalSatt.g:718:1: ( '<=>' )
            // InternalSatt.g:719:2: '<=>'
            {
             before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSatt.g:728:1: rule__BiImpl__Group_1__2 : rule__BiImpl__Group_1__2__Impl ;
    public final void rule__BiImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:732:1: ( rule__BiImpl__Group_1__2__Impl )
            // InternalSatt.g:733:2: rule__BiImpl__Group_1__2__Impl
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
    // InternalSatt.g:739:1: rule__BiImpl__Group_1__2__Impl : ( ( rule__BiImpl__RightAssignment_1_2 ) ) ;
    public final void rule__BiImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:743:1: ( ( ( rule__BiImpl__RightAssignment_1_2 ) ) )
            // InternalSatt.g:744:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:744:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            // InternalSatt.g:745:2: ( rule__BiImpl__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:746:2: ( rule__BiImpl__RightAssignment_1_2 )
            // InternalSatt.g:746:3: rule__BiImpl__RightAssignment_1_2
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
    // InternalSatt.g:755:1: rule__Impl__Group__0 : rule__Impl__Group__0__Impl rule__Impl__Group__1 ;
    public final void rule__Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:759:1: ( rule__Impl__Group__0__Impl rule__Impl__Group__1 )
            // InternalSatt.g:760:2: rule__Impl__Group__0__Impl rule__Impl__Group__1
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
    // InternalSatt.g:767:1: rule__Impl__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:771:1: ( ( ruleOr ) )
            // InternalSatt.g:772:1: ( ruleOr )
            {
            // InternalSatt.g:772:1: ( ruleOr )
            // InternalSatt.g:773:2: ruleOr
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
    // InternalSatt.g:782:1: rule__Impl__Group__1 : rule__Impl__Group__1__Impl ;
    public final void rule__Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:786:1: ( rule__Impl__Group__1__Impl )
            // InternalSatt.g:787:2: rule__Impl__Group__1__Impl
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
    // InternalSatt.g:793:1: rule__Impl__Group__1__Impl : ( ( rule__Impl__Group_1__0 )* ) ;
    public final void rule__Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:797:1: ( ( ( rule__Impl__Group_1__0 )* ) )
            // InternalSatt.g:798:1: ( ( rule__Impl__Group_1__0 )* )
            {
            // InternalSatt.g:798:1: ( ( rule__Impl__Group_1__0 )* )
            // InternalSatt.g:799:2: ( rule__Impl__Group_1__0 )*
            {
             before(grammarAccess.getImplAccess().getGroup_1()); 
            // InternalSatt.g:800:2: ( rule__Impl__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSatt.g:800:3: rule__Impl__Group_1__0
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
    // InternalSatt.g:809:1: rule__Impl__Group_1__0 : rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 ;
    public final void rule__Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:813:1: ( rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 )
            // InternalSatt.g:814:2: rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1
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
    // InternalSatt.g:821:1: rule__Impl__Group_1__0__Impl : ( () ) ;
    public final void rule__Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:825:1: ( ( () ) )
            // InternalSatt.g:826:1: ( () )
            {
            // InternalSatt.g:826:1: ( () )
            // InternalSatt.g:827:2: ()
            {
             before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 
            // InternalSatt.g:828:2: ()
            // InternalSatt.g:828:3: 
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
    // InternalSatt.g:836:1: rule__Impl__Group_1__1 : rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 ;
    public final void rule__Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:840:1: ( rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 )
            // InternalSatt.g:841:2: rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:848:1: rule__Impl__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:852:1: ( ( '=>' ) )
            // InternalSatt.g:853:1: ( '=>' )
            {
            // InternalSatt.g:853:1: ( '=>' )
            // InternalSatt.g:854:2: '=>'
            {
             before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSatt.g:863:1: rule__Impl__Group_1__2 : rule__Impl__Group_1__2__Impl ;
    public final void rule__Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:867:1: ( rule__Impl__Group_1__2__Impl )
            // InternalSatt.g:868:2: rule__Impl__Group_1__2__Impl
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
    // InternalSatt.g:874:1: rule__Impl__Group_1__2__Impl : ( ( rule__Impl__RightAssignment_1_2 ) ) ;
    public final void rule__Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:878:1: ( ( ( rule__Impl__RightAssignment_1_2 ) ) )
            // InternalSatt.g:879:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:879:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            // InternalSatt.g:880:2: ( rule__Impl__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:881:2: ( rule__Impl__RightAssignment_1_2 )
            // InternalSatt.g:881:3: rule__Impl__RightAssignment_1_2
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
    // InternalSatt.g:890:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:894:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSatt.g:895:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalSatt.g:902:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:906:1: ( ( ruleAnd ) )
            // InternalSatt.g:907:1: ( ruleAnd )
            {
            // InternalSatt.g:907:1: ( ruleAnd )
            // InternalSatt.g:908:2: ruleAnd
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
    // InternalSatt.g:917:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:921:1: ( rule__Or__Group__1__Impl )
            // InternalSatt.g:922:2: rule__Or__Group__1__Impl
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
    // InternalSatt.g:928:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:932:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSatt.g:933:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSatt.g:933:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSatt.g:934:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSatt.g:935:2: ( rule__Or__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSatt.g:935:3: rule__Or__Group_1__0
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
    // InternalSatt.g:944:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:948:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSatt.g:949:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalSatt.g:956:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:960:1: ( ( () ) )
            // InternalSatt.g:961:1: ( () )
            {
            // InternalSatt.g:961:1: ( () )
            // InternalSatt.g:962:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSatt.g:963:2: ()
            // InternalSatt.g:963:3: 
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
    // InternalSatt.g:971:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:975:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSatt.g:976:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:983:1: rule__Or__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:987:1: ( ( 'v' ) )
            // InternalSatt.g:988:1: ( 'v' )
            {
            // InternalSatt.g:988:1: ( 'v' )
            // InternalSatt.g:989:2: 'v'
            {
             before(grammarAccess.getOrAccess().getVKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSatt.g:998:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1002:1: ( rule__Or__Group_1__2__Impl )
            // InternalSatt.g:1003:2: rule__Or__Group_1__2__Impl
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
    // InternalSatt.g:1009:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1013:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSatt.g:1014:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:1014:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSatt.g:1015:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:1016:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSatt.g:1016:3: rule__Or__RightAssignment_1_2
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
    // InternalSatt.g:1025:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1029:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSatt.g:1030:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalSatt.g:1037:1: rule__And__Group__0__Impl : ( ruleNand ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1041:1: ( ( ruleNand ) )
            // InternalSatt.g:1042:1: ( ruleNand )
            {
            // InternalSatt.g:1042:1: ( ruleNand )
            // InternalSatt.g:1043:2: ruleNand
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
    // InternalSatt.g:1052:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1056:1: ( rule__And__Group__1__Impl )
            // InternalSatt.g:1057:2: rule__And__Group__1__Impl
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
    // InternalSatt.g:1063:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1067:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSatt.g:1068:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSatt.g:1068:1: ( ( rule__And__Group_1__0 )* )
            // InternalSatt.g:1069:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSatt.g:1070:2: ( rule__And__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSatt.g:1070:3: rule__And__Group_1__0
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
    // InternalSatt.g:1079:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1083:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSatt.g:1084:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalSatt.g:1091:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1095:1: ( ( () ) )
            // InternalSatt.g:1096:1: ( () )
            {
            // InternalSatt.g:1096:1: ( () )
            // InternalSatt.g:1097:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSatt.g:1098:2: ()
            // InternalSatt.g:1098:3: 
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
    // InternalSatt.g:1106:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1110:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSatt.g:1111:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:1118:1: rule__And__Group_1__1__Impl : ( '^' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1122:1: ( ( '^' ) )
            // InternalSatt.g:1123:1: ( '^' )
            {
            // InternalSatt.g:1123:1: ( '^' )
            // InternalSatt.g:1124:2: '^'
            {
             before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSatt.g:1133:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1137:1: ( rule__And__Group_1__2__Impl )
            // InternalSatt.g:1138:2: rule__And__Group_1__2__Impl
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
    // InternalSatt.g:1144:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1148:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSatt.g:1149:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:1149:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSatt.g:1150:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:1151:2: ( rule__And__RightAssignment_1_2 )
            // InternalSatt.g:1151:3: rule__And__RightAssignment_1_2
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
    // InternalSatt.g:1160:1: rule__Nand__Group__0 : rule__Nand__Group__0__Impl rule__Nand__Group__1 ;
    public final void rule__Nand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1164:1: ( rule__Nand__Group__0__Impl rule__Nand__Group__1 )
            // InternalSatt.g:1165:2: rule__Nand__Group__0__Impl rule__Nand__Group__1
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
    // InternalSatt.g:1172:1: rule__Nand__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Nand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1176:1: ( ( rulePrimary ) )
            // InternalSatt.g:1177:1: ( rulePrimary )
            {
            // InternalSatt.g:1177:1: ( rulePrimary )
            // InternalSatt.g:1178:2: rulePrimary
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
    // InternalSatt.g:1187:1: rule__Nand__Group__1 : rule__Nand__Group__1__Impl ;
    public final void rule__Nand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1191:1: ( rule__Nand__Group__1__Impl )
            // InternalSatt.g:1192:2: rule__Nand__Group__1__Impl
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
    // InternalSatt.g:1198:1: rule__Nand__Group__1__Impl : ( ( rule__Nand__Group_1__0 )* ) ;
    public final void rule__Nand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1202:1: ( ( ( rule__Nand__Group_1__0 )* ) )
            // InternalSatt.g:1203:1: ( ( rule__Nand__Group_1__0 )* )
            {
            // InternalSatt.g:1203:1: ( ( rule__Nand__Group_1__0 )* )
            // InternalSatt.g:1204:2: ( rule__Nand__Group_1__0 )*
            {
             before(grammarAccess.getNandAccess().getGroup_1()); 
            // InternalSatt.g:1205:2: ( rule__Nand__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSatt.g:1205:3: rule__Nand__Group_1__0
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
    // InternalSatt.g:1214:1: rule__Nand__Group_1__0 : rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 ;
    public final void rule__Nand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1218:1: ( rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 )
            // InternalSatt.g:1219:2: rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1
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
    // InternalSatt.g:1226:1: rule__Nand__Group_1__0__Impl : ( () ) ;
    public final void rule__Nand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1230:1: ( ( () ) )
            // InternalSatt.g:1231:1: ( () )
            {
            // InternalSatt.g:1231:1: ( () )
            // InternalSatt.g:1232:2: ()
            {
             before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 
            // InternalSatt.g:1233:2: ()
            // InternalSatt.g:1233:3: 
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
    // InternalSatt.g:1241:1: rule__Nand__Group_1__1 : rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 ;
    public final void rule__Nand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1245:1: ( rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 )
            // InternalSatt.g:1246:2: rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:1253:1: rule__Nand__Group_1__1__Impl : ( ( rule__Nand__Alternatives_1_1 ) ) ;
    public final void rule__Nand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1257:1: ( ( ( rule__Nand__Alternatives_1_1 ) ) )
            // InternalSatt.g:1258:1: ( ( rule__Nand__Alternatives_1_1 ) )
            {
            // InternalSatt.g:1258:1: ( ( rule__Nand__Alternatives_1_1 ) )
            // InternalSatt.g:1259:2: ( rule__Nand__Alternatives_1_1 )
            {
             before(grammarAccess.getNandAccess().getAlternatives_1_1()); 
            // InternalSatt.g:1260:2: ( rule__Nand__Alternatives_1_1 )
            // InternalSatt.g:1260:3: rule__Nand__Alternatives_1_1
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
    // InternalSatt.g:1268:1: rule__Nand__Group_1__2 : rule__Nand__Group_1__2__Impl ;
    public final void rule__Nand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1272:1: ( rule__Nand__Group_1__2__Impl )
            // InternalSatt.g:1273:2: rule__Nand__Group_1__2__Impl
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
    // InternalSatt.g:1279:1: rule__Nand__Group_1__2__Impl : ( ( rule__Nand__RightAssignment_1_2 ) ) ;
    public final void rule__Nand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1283:1: ( ( ( rule__Nand__RightAssignment_1_2 ) ) )
            // InternalSatt.g:1284:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:1284:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            // InternalSatt.g:1285:2: ( rule__Nand__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:1286:2: ( rule__Nand__RightAssignment_1_2 )
            // InternalSatt.g:1286:3: rule__Nand__RightAssignment_1_2
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
    // InternalSatt.g:1295:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1299:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalSatt.g:1300:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:1307:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1311:1: ( ( '(' ) )
            // InternalSatt.g:1312:1: ( '(' )
            {
            // InternalSatt.g:1312:1: ( '(' )
            // InternalSatt.g:1313:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSatt.g:1322:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1326:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalSatt.g:1327:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalSatt.g:1334:1: rule__Primary__Group_0__1__Impl : ( ruleModel ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1338:1: ( ( ruleModel ) )
            // InternalSatt.g:1339:1: ( ruleModel )
            {
            // InternalSatt.g:1339:1: ( ruleModel )
            // InternalSatt.g:1340:2: ruleModel
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
    // InternalSatt.g:1349:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1353:1: ( rule__Primary__Group_0__2__Impl )
            // InternalSatt.g:1354:2: rule__Primary__Group_0__2__Impl
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
    // InternalSatt.g:1360:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1364:1: ( ( ')' ) )
            // InternalSatt.g:1365:1: ( ')' )
            {
            // InternalSatt.g:1365:1: ( ')' )
            // InternalSatt.g:1366:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSatt.g:1376:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1380:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalSatt.g:1381:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSatt.g:1388:1: rule__Not__Group__0__Impl : ( ( rule__Not__Alternatives_0 ) ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1392:1: ( ( ( rule__Not__Alternatives_0 ) ) )
            // InternalSatt.g:1393:1: ( ( rule__Not__Alternatives_0 ) )
            {
            // InternalSatt.g:1393:1: ( ( rule__Not__Alternatives_0 ) )
            // InternalSatt.g:1394:2: ( rule__Not__Alternatives_0 )
            {
             before(grammarAccess.getNotAccess().getAlternatives_0()); 
            // InternalSatt.g:1395:2: ( rule__Not__Alternatives_0 )
            // InternalSatt.g:1395:3: rule__Not__Alternatives_0
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
    // InternalSatt.g:1403:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1407:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalSatt.g:1408:2: rule__Not__Group__1__Impl rule__Not__Group__2
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
    // InternalSatt.g:1415:1: rule__Not__Group__1__Impl : ( rulePrimary ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1419:1: ( ( rulePrimary ) )
            // InternalSatt.g:1420:1: ( rulePrimary )
            {
            // InternalSatt.g:1420:1: ( rulePrimary )
            // InternalSatt.g:1421:2: rulePrimary
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
    // InternalSatt.g:1430:1: rule__Not__Group__2 : rule__Not__Group__2__Impl ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1434:1: ( rule__Not__Group__2__Impl )
            // InternalSatt.g:1435:2: rule__Not__Group__2__Impl
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
    // InternalSatt.g:1441:1: rule__Not__Group__2__Impl : ( () ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1445:1: ( ( () ) )
            // InternalSatt.g:1446:1: ( () )
            {
            // InternalSatt.g:1446:1: ( () )
            // InternalSatt.g:1447:2: ()
            {
             before(grammarAccess.getNotAccess().getNotExpressionAction_2()); 
            // InternalSatt.g:1448:2: ()
            // InternalSatt.g:1448:3: 
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


    // $ANTLR start "rule__SAT__SourceAssignment_0"
    // InternalSatt.g:1457:1: rule__SAT__SourceAssignment_0 : ( ( rule__SAT__SourceAlternatives_0_0 ) ) ;
    public final void rule__SAT__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1461:1: ( ( ( rule__SAT__SourceAlternatives_0_0 ) ) )
            // InternalSatt.g:1462:2: ( ( rule__SAT__SourceAlternatives_0_0 ) )
            {
            // InternalSatt.g:1462:2: ( ( rule__SAT__SourceAlternatives_0_0 ) )
            // InternalSatt.g:1463:3: ( rule__SAT__SourceAlternatives_0_0 )
            {
             before(grammarAccess.getSATAccess().getSourceAlternatives_0_0()); 
            // InternalSatt.g:1464:3: ( rule__SAT__SourceAlternatives_0_0 )
            // InternalSatt.g:1464:4: rule__SAT__SourceAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SAT__SourceAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSATAccess().getSourceAlternatives_0_0()); 

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
    // $ANTLR end "rule__SAT__SourceAssignment_0"


    // $ANTLR start "rule__SAT__CallMethodAssignment_1"
    // InternalSatt.g:1472:1: rule__SAT__CallMethodAssignment_1 : ( ruleSATCallMethod ) ;
    public final void rule__SAT__CallMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1476:1: ( ( ruleSATCallMethod ) )
            // InternalSatt.g:1477:2: ( ruleSATCallMethod )
            {
            // InternalSatt.g:1477:2: ( ruleSATCallMethod )
            // InternalSatt.g:1478:3: ruleSATCallMethod
            {
             before(grammarAccess.getSATAccess().getCallMethodSATCallMethodEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSATCallMethod();

            state._fsp--;

             after(grammarAccess.getSATAccess().getCallMethodSATCallMethodEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__SAT__CallMethodAssignment_1"


    // $ANTLR start "rule__FILE__FileAssignment_1"
    // InternalSatt.g:1487:1: rule__FILE__FileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FILE__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1491:1: ( ( RULE_STRING ) )
            // InternalSatt.g:1492:2: ( RULE_STRING )
            {
            // InternalSatt.g:1492:2: ( RULE_STRING )
            // InternalSatt.g:1493:3: RULE_STRING
            {
             before(grammarAccess.getFILEAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFILEAccess().getFileSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FILE__FileAssignment_1"


    // $ANTLR start "rule__BiImpl__RightAssignment_1_2"
    // InternalSatt.g:1502:1: rule__BiImpl__RightAssignment_1_2 : ( ruleImpl ) ;
    public final void rule__BiImpl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1506:1: ( ( ruleImpl ) )
            // InternalSatt.g:1507:2: ( ruleImpl )
            {
            // InternalSatt.g:1507:2: ( ruleImpl )
            // InternalSatt.g:1508:3: ruleImpl
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
    // InternalSatt.g:1517:1: rule__Impl__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Impl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1521:1: ( ( ruleOr ) )
            // InternalSatt.g:1522:2: ( ruleOr )
            {
            // InternalSatt.g:1522:2: ( ruleOr )
            // InternalSatt.g:1523:3: ruleOr
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
    // InternalSatt.g:1532:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1536:1: ( ( ruleAnd ) )
            // InternalSatt.g:1537:2: ( ruleAnd )
            {
            // InternalSatt.g:1537:2: ( ruleAnd )
            // InternalSatt.g:1538:3: ruleAnd
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
    // InternalSatt.g:1547:1: rule__And__RightAssignment_1_2 : ( ruleNand ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1551:1: ( ( ruleNand ) )
            // InternalSatt.g:1552:2: ( ruleNand )
            {
            // InternalSatt.g:1552:2: ( ruleNand )
            // InternalSatt.g:1553:3: ruleNand
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
    // InternalSatt.g:1562:1: rule__Nand__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Nand__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1566:1: ( ( rulePrimary ) )
            // InternalSatt.g:1567:2: ( rulePrimary )
            {
            // InternalSatt.g:1567:2: ( rulePrimary )
            // InternalSatt.g:1568:3: rulePrimary
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
    // InternalSatt.g:1577:1: rule__Var__IdAssignment : ( RULE_ID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1581:1: ( ( RULE_ID ) )
            // InternalSatt.g:1582:2: ( RULE_ID )
            {
            // InternalSatt.g:1582:2: ( RULE_ID )
            // InternalSatt.g:1583:3: RULE_ID
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
    // InternalSatt.g:1592:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1596:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalSatt.g:1597:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalSatt.g:1597:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalSatt.g:1598:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalSatt.g:1599:3: ( rule__Const__ValAlternatives_0 )
            // InternalSatt.g:1599:4: rule__Const__ValAlternatives_0
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000201E020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}