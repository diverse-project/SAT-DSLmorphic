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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'\\u2191'", "'!'", "'~'", "'true'", "'false'", "'<=>'", "'=>'", "'v'", "'^'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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



    // $ANTLR start "entryRuleModel"
    // InternalSatt.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSatt.g:54:1: ( ruleModel EOF )
            // InternalSatt.g:55:1: ruleModel EOF
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
    // InternalSatt.g:62:1: ruleModel : ( ruleBiImpl ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:66:2: ( ( ruleBiImpl ) )
            // InternalSatt.g:67:2: ( ruleBiImpl )
            {
            // InternalSatt.g:67:2: ( ruleBiImpl )
            // InternalSatt.g:68:3: ruleBiImpl
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
    // InternalSatt.g:78:1: entryRuleBiImpl : ruleBiImpl EOF ;
    public final void entryRuleBiImpl() throws RecognitionException {
        try {
            // InternalSatt.g:79:1: ( ruleBiImpl EOF )
            // InternalSatt.g:80:1: ruleBiImpl EOF
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
    // InternalSatt.g:87:1: ruleBiImpl : ( ( rule__BiImpl__Group__0 ) ) ;
    public final void ruleBiImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:91:2: ( ( ( rule__BiImpl__Group__0 ) ) )
            // InternalSatt.g:92:2: ( ( rule__BiImpl__Group__0 ) )
            {
            // InternalSatt.g:92:2: ( ( rule__BiImpl__Group__0 ) )
            // InternalSatt.g:93:3: ( rule__BiImpl__Group__0 )
            {
             before(grammarAccess.getBiImplAccess().getGroup()); 
            // InternalSatt.g:94:3: ( rule__BiImpl__Group__0 )
            // InternalSatt.g:94:4: rule__BiImpl__Group__0
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
    // InternalSatt.g:103:1: entryRuleImpl : ruleImpl EOF ;
    public final void entryRuleImpl() throws RecognitionException {
        try {
            // InternalSatt.g:104:1: ( ruleImpl EOF )
            // InternalSatt.g:105:1: ruleImpl EOF
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
    // InternalSatt.g:112:1: ruleImpl : ( ( rule__Impl__Group__0 ) ) ;
    public final void ruleImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:116:2: ( ( ( rule__Impl__Group__0 ) ) )
            // InternalSatt.g:117:2: ( ( rule__Impl__Group__0 ) )
            {
            // InternalSatt.g:117:2: ( ( rule__Impl__Group__0 ) )
            // InternalSatt.g:118:3: ( rule__Impl__Group__0 )
            {
             before(grammarAccess.getImplAccess().getGroup()); 
            // InternalSatt.g:119:3: ( rule__Impl__Group__0 )
            // InternalSatt.g:119:4: rule__Impl__Group__0
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
    // InternalSatt.g:128:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSatt.g:129:1: ( ruleOr EOF )
            // InternalSatt.g:130:1: ruleOr EOF
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
    // InternalSatt.g:137:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:141:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSatt.g:142:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSatt.g:142:2: ( ( rule__Or__Group__0 ) )
            // InternalSatt.g:143:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalSatt.g:144:3: ( rule__Or__Group__0 )
            // InternalSatt.g:144:4: rule__Or__Group__0
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
    // InternalSatt.g:153:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSatt.g:154:1: ( ruleAnd EOF )
            // InternalSatt.g:155:1: ruleAnd EOF
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
    // InternalSatt.g:162:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:166:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSatt.g:167:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSatt.g:167:2: ( ( rule__And__Group__0 ) )
            // InternalSatt.g:168:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSatt.g:169:3: ( rule__And__Group__0 )
            // InternalSatt.g:169:4: rule__And__Group__0
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
    // InternalSatt.g:178:1: entryRuleNand : ruleNand EOF ;
    public final void entryRuleNand() throws RecognitionException {
        try {
            // InternalSatt.g:179:1: ( ruleNand EOF )
            // InternalSatt.g:180:1: ruleNand EOF
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
    // InternalSatt.g:187:1: ruleNand : ( ( rule__Nand__Group__0 ) ) ;
    public final void ruleNand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:191:2: ( ( ( rule__Nand__Group__0 ) ) )
            // InternalSatt.g:192:2: ( ( rule__Nand__Group__0 ) )
            {
            // InternalSatt.g:192:2: ( ( rule__Nand__Group__0 ) )
            // InternalSatt.g:193:3: ( rule__Nand__Group__0 )
            {
             before(grammarAccess.getNandAccess().getGroup()); 
            // InternalSatt.g:194:3: ( rule__Nand__Group__0 )
            // InternalSatt.g:194:4: rule__Nand__Group__0
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
    // InternalSatt.g:203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSatt.g:204:1: ( rulePrimary EOF )
            // InternalSatt.g:205:1: rulePrimary EOF
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
    // InternalSatt.g:212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSatt.g:217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSatt.g:217:2: ( ( rule__Primary__Alternatives ) )
            // InternalSatt.g:218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSatt.g:219:3: ( rule__Primary__Alternatives )
            // InternalSatt.g:219:4: rule__Primary__Alternatives
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
    // InternalSatt.g:228:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSatt.g:229:1: ( ruleNot EOF )
            // InternalSatt.g:230:1: ruleNot EOF
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
    // InternalSatt.g:237:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:241:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalSatt.g:242:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalSatt.g:242:2: ( ( rule__Not__Group__0 ) )
            // InternalSatt.g:243:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalSatt.g:244:3: ( rule__Not__Group__0 )
            // InternalSatt.g:244:4: rule__Not__Group__0
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
    // InternalSatt.g:253:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalSatt.g:254:1: ( ruleVar EOF )
            // InternalSatt.g:255:1: ruleVar EOF
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
    // InternalSatt.g:262:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:266:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalSatt.g:267:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalSatt.g:267:2: ( ( rule__Var__IdAssignment ) )
            // InternalSatt.g:268:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalSatt.g:269:3: ( rule__Var__IdAssignment )
            // InternalSatt.g:269:4: rule__Var__IdAssignment
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
    // InternalSatt.g:278:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalSatt.g:279:1: ( ruleConst EOF )
            // InternalSatt.g:280:1: ruleConst EOF
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
    // InternalSatt.g:287:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:291:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalSatt.g:292:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalSatt.g:292:2: ( ( rule__Const__ValAssignment ) )
            // InternalSatt.g:293:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalSatt.g:294:3: ( rule__Const__ValAssignment )
            // InternalSatt.g:294:4: rule__Const__ValAssignment
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


    // $ANTLR start "rule__Nand__Alternatives_1_1"
    // InternalSatt.g:302:1: rule__Nand__Alternatives_1_1 : ( ( '|' ) | ( '\\u2191' ) );
    public final void rule__Nand__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:306:1: ( ( '|' ) | ( '\\u2191' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSatt.g:307:2: ( '|' )
                    {
                    // InternalSatt.g:307:2: ( '|' )
                    // InternalSatt.g:308:3: '|'
                    {
                     before(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNandAccess().getVerticalLineKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:313:2: ( '\\u2191' )
                    {
                    // InternalSatt.g:313:2: ( '\\u2191' )
                    // InternalSatt.g:314:3: '\\u2191'
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
    // InternalSatt.g:323:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:327:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleNot ) | ( ruleConst ) | ( ruleVar ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 13:
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
            case 16:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSatt.g:328:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalSatt.g:328:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalSatt.g:329:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalSatt.g:330:3: ( rule__Primary__Group_0__0 )
                    // InternalSatt.g:330:4: rule__Primary__Group_0__0
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
                    // InternalSatt.g:334:2: ( ruleNot )
                    {
                    // InternalSatt.g:334:2: ( ruleNot )
                    // InternalSatt.g:335:3: ruleNot
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
                    // InternalSatt.g:340:2: ( ruleConst )
                    {
                    // InternalSatt.g:340:2: ( ruleConst )
                    // InternalSatt.g:341:3: ruleConst
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
                    // InternalSatt.g:346:2: ( ruleVar )
                    {
                    // InternalSatt.g:346:2: ( ruleVar )
                    // InternalSatt.g:347:3: ruleVar
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
    // InternalSatt.g:356:1: rule__Not__Alternatives_0 : ( ( '!' ) | ( '~' ) );
    public final void rule__Not__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:360:1: ( ( '!' ) | ( '~' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSatt.g:361:2: ( '!' )
                    {
                    // InternalSatt.g:361:2: ( '!' )
                    // InternalSatt.g:362:3: '!'
                    {
                     before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:367:2: ( '~' )
                    {
                    // InternalSatt.g:367:2: ( '~' )
                    // InternalSatt.g:368:3: '~'
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
    // InternalSatt.g:377:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:381:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSatt.g:382:2: ( 'true' )
                    {
                    // InternalSatt.g:382:2: ( 'true' )
                    // InternalSatt.g:383:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSatt.g:388:2: ( 'false' )
                    {
                    // InternalSatt.g:388:2: ( 'false' )
                    // InternalSatt.g:389:3: 'false'
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


    // $ANTLR start "rule__BiImpl__Group__0"
    // InternalSatt.g:398:1: rule__BiImpl__Group__0 : rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 ;
    public final void rule__BiImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:402:1: ( rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1 )
            // InternalSatt.g:403:2: rule__BiImpl__Group__0__Impl rule__BiImpl__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSatt.g:410:1: rule__BiImpl__Group__0__Impl : ( ruleImpl ) ;
    public final void rule__BiImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:414:1: ( ( ruleImpl ) )
            // InternalSatt.g:415:1: ( ruleImpl )
            {
            // InternalSatt.g:415:1: ( ruleImpl )
            // InternalSatt.g:416:2: ruleImpl
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
    // InternalSatt.g:425:1: rule__BiImpl__Group__1 : rule__BiImpl__Group__1__Impl ;
    public final void rule__BiImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:429:1: ( rule__BiImpl__Group__1__Impl )
            // InternalSatt.g:430:2: rule__BiImpl__Group__1__Impl
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
    // InternalSatt.g:436:1: rule__BiImpl__Group__1__Impl : ( ( rule__BiImpl__Group_1__0 )* ) ;
    public final void rule__BiImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:440:1: ( ( ( rule__BiImpl__Group_1__0 )* ) )
            // InternalSatt.g:441:1: ( ( rule__BiImpl__Group_1__0 )* )
            {
            // InternalSatt.g:441:1: ( ( rule__BiImpl__Group_1__0 )* )
            // InternalSatt.g:442:2: ( rule__BiImpl__Group_1__0 )*
            {
             before(grammarAccess.getBiImplAccess().getGroup_1()); 
            // InternalSatt.g:443:2: ( rule__BiImpl__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSatt.g:443:3: rule__BiImpl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BiImpl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSatt.g:452:1: rule__BiImpl__Group_1__0 : rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 ;
    public final void rule__BiImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:456:1: ( rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1 )
            // InternalSatt.g:457:2: rule__BiImpl__Group_1__0__Impl rule__BiImpl__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSatt.g:464:1: rule__BiImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:468:1: ( ( () ) )
            // InternalSatt.g:469:1: ( () )
            {
            // InternalSatt.g:469:1: ( () )
            // InternalSatt.g:470:2: ()
            {
             before(grammarAccess.getBiImplAccess().getBiImplLeftAction_1_0()); 
            // InternalSatt.g:471:2: ()
            // InternalSatt.g:471:3: 
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
    // InternalSatt.g:479:1: rule__BiImpl__Group_1__1 : rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 ;
    public final void rule__BiImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:483:1: ( rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2 )
            // InternalSatt.g:484:2: rule__BiImpl__Group_1__1__Impl rule__BiImpl__Group_1__2
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
    // InternalSatt.g:491:1: rule__BiImpl__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:495:1: ( ( '<=>' ) )
            // InternalSatt.g:496:1: ( '<=>' )
            {
            // InternalSatt.g:496:1: ( '<=>' )
            // InternalSatt.g:497:2: '<=>'
            {
             before(grammarAccess.getBiImplAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSatt.g:506:1: rule__BiImpl__Group_1__2 : rule__BiImpl__Group_1__2__Impl ;
    public final void rule__BiImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:510:1: ( rule__BiImpl__Group_1__2__Impl )
            // InternalSatt.g:511:2: rule__BiImpl__Group_1__2__Impl
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
    // InternalSatt.g:517:1: rule__BiImpl__Group_1__2__Impl : ( ( rule__BiImpl__RightAssignment_1_2 ) ) ;
    public final void rule__BiImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:521:1: ( ( ( rule__BiImpl__RightAssignment_1_2 ) ) )
            // InternalSatt.g:522:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:522:1: ( ( rule__BiImpl__RightAssignment_1_2 ) )
            // InternalSatt.g:523:2: ( rule__BiImpl__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:524:2: ( rule__BiImpl__RightAssignment_1_2 )
            // InternalSatt.g:524:3: rule__BiImpl__RightAssignment_1_2
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
    // InternalSatt.g:533:1: rule__Impl__Group__0 : rule__Impl__Group__0__Impl rule__Impl__Group__1 ;
    public final void rule__Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:537:1: ( rule__Impl__Group__0__Impl rule__Impl__Group__1 )
            // InternalSatt.g:538:2: rule__Impl__Group__0__Impl rule__Impl__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSatt.g:545:1: rule__Impl__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:549:1: ( ( ruleOr ) )
            // InternalSatt.g:550:1: ( ruleOr )
            {
            // InternalSatt.g:550:1: ( ruleOr )
            // InternalSatt.g:551:2: ruleOr
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
    // InternalSatt.g:560:1: rule__Impl__Group__1 : rule__Impl__Group__1__Impl ;
    public final void rule__Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:564:1: ( rule__Impl__Group__1__Impl )
            // InternalSatt.g:565:2: rule__Impl__Group__1__Impl
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
    // InternalSatt.g:571:1: rule__Impl__Group__1__Impl : ( ( rule__Impl__Group_1__0 )* ) ;
    public final void rule__Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:575:1: ( ( ( rule__Impl__Group_1__0 )* ) )
            // InternalSatt.g:576:1: ( ( rule__Impl__Group_1__0 )* )
            {
            // InternalSatt.g:576:1: ( ( rule__Impl__Group_1__0 )* )
            // InternalSatt.g:577:2: ( rule__Impl__Group_1__0 )*
            {
             before(grammarAccess.getImplAccess().getGroup_1()); 
            // InternalSatt.g:578:2: ( rule__Impl__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSatt.g:578:3: rule__Impl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Impl__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSatt.g:587:1: rule__Impl__Group_1__0 : rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 ;
    public final void rule__Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:591:1: ( rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1 )
            // InternalSatt.g:592:2: rule__Impl__Group_1__0__Impl rule__Impl__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSatt.g:599:1: rule__Impl__Group_1__0__Impl : ( () ) ;
    public final void rule__Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:603:1: ( ( () ) )
            // InternalSatt.g:604:1: ( () )
            {
            // InternalSatt.g:604:1: ( () )
            // InternalSatt.g:605:2: ()
            {
             before(grammarAccess.getImplAccess().getImplLeftAction_1_0()); 
            // InternalSatt.g:606:2: ()
            // InternalSatt.g:606:3: 
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
    // InternalSatt.g:614:1: rule__Impl__Group_1__1 : rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 ;
    public final void rule__Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:618:1: ( rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2 )
            // InternalSatt.g:619:2: rule__Impl__Group_1__1__Impl rule__Impl__Group_1__2
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
    // InternalSatt.g:626:1: rule__Impl__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:630:1: ( ( '=>' ) )
            // InternalSatt.g:631:1: ( '=>' )
            {
            // InternalSatt.g:631:1: ( '=>' )
            // InternalSatt.g:632:2: '=>'
            {
             before(grammarAccess.getImplAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSatt.g:641:1: rule__Impl__Group_1__2 : rule__Impl__Group_1__2__Impl ;
    public final void rule__Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:645:1: ( rule__Impl__Group_1__2__Impl )
            // InternalSatt.g:646:2: rule__Impl__Group_1__2__Impl
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
    // InternalSatt.g:652:1: rule__Impl__Group_1__2__Impl : ( ( rule__Impl__RightAssignment_1_2 ) ) ;
    public final void rule__Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:656:1: ( ( ( rule__Impl__RightAssignment_1_2 ) ) )
            // InternalSatt.g:657:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:657:1: ( ( rule__Impl__RightAssignment_1_2 ) )
            // InternalSatt.g:658:2: ( rule__Impl__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:659:2: ( rule__Impl__RightAssignment_1_2 )
            // InternalSatt.g:659:3: rule__Impl__RightAssignment_1_2
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
    // InternalSatt.g:668:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:672:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSatt.g:673:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSatt.g:680:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:684:1: ( ( ruleAnd ) )
            // InternalSatt.g:685:1: ( ruleAnd )
            {
            // InternalSatt.g:685:1: ( ruleAnd )
            // InternalSatt.g:686:2: ruleAnd
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
    // InternalSatt.g:695:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:699:1: ( rule__Or__Group__1__Impl )
            // InternalSatt.g:700:2: rule__Or__Group__1__Impl
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
    // InternalSatt.g:706:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:710:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSatt.g:711:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSatt.g:711:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSatt.g:712:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSatt.g:713:2: ( rule__Or__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSatt.g:713:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSatt.g:722:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:726:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSatt.g:727:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSatt.g:734:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:738:1: ( ( () ) )
            // InternalSatt.g:739:1: ( () )
            {
            // InternalSatt.g:739:1: ( () )
            // InternalSatt.g:740:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSatt.g:741:2: ()
            // InternalSatt.g:741:3: 
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
    // InternalSatt.g:749:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:753:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSatt.g:754:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalSatt.g:761:1: rule__Or__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:765:1: ( ( 'v' ) )
            // InternalSatt.g:766:1: ( 'v' )
            {
            // InternalSatt.g:766:1: ( 'v' )
            // InternalSatt.g:767:2: 'v'
            {
             before(grammarAccess.getOrAccess().getVKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSatt.g:776:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:780:1: ( rule__Or__Group_1__2__Impl )
            // InternalSatt.g:781:2: rule__Or__Group_1__2__Impl
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
    // InternalSatt.g:787:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:791:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSatt.g:792:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:792:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSatt.g:793:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:794:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSatt.g:794:3: rule__Or__RightAssignment_1_2
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
    // InternalSatt.g:803:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:807:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSatt.g:808:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSatt.g:815:1: rule__And__Group__0__Impl : ( ruleNand ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:819:1: ( ( ruleNand ) )
            // InternalSatt.g:820:1: ( ruleNand )
            {
            // InternalSatt.g:820:1: ( ruleNand )
            // InternalSatt.g:821:2: ruleNand
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
    // InternalSatt.g:830:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:834:1: ( rule__And__Group__1__Impl )
            // InternalSatt.g:835:2: rule__And__Group__1__Impl
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
    // InternalSatt.g:841:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:845:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSatt.g:846:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSatt.g:846:1: ( ( rule__And__Group_1__0 )* )
            // InternalSatt.g:847:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSatt.g:848:2: ( rule__And__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSatt.g:848:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSatt.g:857:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:861:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSatt.g:862:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSatt.g:869:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:873:1: ( ( () ) )
            // InternalSatt.g:874:1: ( () )
            {
            // InternalSatt.g:874:1: ( () )
            // InternalSatt.g:875:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSatt.g:876:2: ()
            // InternalSatt.g:876:3: 
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
    // InternalSatt.g:884:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:888:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSatt.g:889:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalSatt.g:896:1: rule__And__Group_1__1__Impl : ( '^' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:900:1: ( ( '^' ) )
            // InternalSatt.g:901:1: ( '^' )
            {
            // InternalSatt.g:901:1: ( '^' )
            // InternalSatt.g:902:2: '^'
            {
             before(grammarAccess.getAndAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSatt.g:911:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:915:1: ( rule__And__Group_1__2__Impl )
            // InternalSatt.g:916:2: rule__And__Group_1__2__Impl
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
    // InternalSatt.g:922:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:926:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSatt.g:927:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:927:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSatt.g:928:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:929:2: ( rule__And__RightAssignment_1_2 )
            // InternalSatt.g:929:3: rule__And__RightAssignment_1_2
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
    // InternalSatt.g:938:1: rule__Nand__Group__0 : rule__Nand__Group__0__Impl rule__Nand__Group__1 ;
    public final void rule__Nand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:942:1: ( rule__Nand__Group__0__Impl rule__Nand__Group__1 )
            // InternalSatt.g:943:2: rule__Nand__Group__0__Impl rule__Nand__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSatt.g:950:1: rule__Nand__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Nand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:954:1: ( ( rulePrimary ) )
            // InternalSatt.g:955:1: ( rulePrimary )
            {
            // InternalSatt.g:955:1: ( rulePrimary )
            // InternalSatt.g:956:2: rulePrimary
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
    // InternalSatt.g:965:1: rule__Nand__Group__1 : rule__Nand__Group__1__Impl ;
    public final void rule__Nand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:969:1: ( rule__Nand__Group__1__Impl )
            // InternalSatt.g:970:2: rule__Nand__Group__1__Impl
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
    // InternalSatt.g:976:1: rule__Nand__Group__1__Impl : ( ( rule__Nand__Group_1__0 )* ) ;
    public final void rule__Nand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:980:1: ( ( ( rule__Nand__Group_1__0 )* ) )
            // InternalSatt.g:981:1: ( ( rule__Nand__Group_1__0 )* )
            {
            // InternalSatt.g:981:1: ( ( rule__Nand__Group_1__0 )* )
            // InternalSatt.g:982:2: ( rule__Nand__Group_1__0 )*
            {
             before(grammarAccess.getNandAccess().getGroup_1()); 
            // InternalSatt.g:983:2: ( rule__Nand__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSatt.g:983:3: rule__Nand__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Nand__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSatt.g:992:1: rule__Nand__Group_1__0 : rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 ;
    public final void rule__Nand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:996:1: ( rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1 )
            // InternalSatt.g:997:2: rule__Nand__Group_1__0__Impl rule__Nand__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSatt.g:1004:1: rule__Nand__Group_1__0__Impl : ( () ) ;
    public final void rule__Nand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1008:1: ( ( () ) )
            // InternalSatt.g:1009:1: ( () )
            {
            // InternalSatt.g:1009:1: ( () )
            // InternalSatt.g:1010:2: ()
            {
             before(grammarAccess.getNandAccess().getNandLeftAction_1_0()); 
            // InternalSatt.g:1011:2: ()
            // InternalSatt.g:1011:3: 
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
    // InternalSatt.g:1019:1: rule__Nand__Group_1__1 : rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 ;
    public final void rule__Nand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1023:1: ( rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2 )
            // InternalSatt.g:1024:2: rule__Nand__Group_1__1__Impl rule__Nand__Group_1__2
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
    // InternalSatt.g:1031:1: rule__Nand__Group_1__1__Impl : ( ( rule__Nand__Alternatives_1_1 ) ) ;
    public final void rule__Nand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1035:1: ( ( ( rule__Nand__Alternatives_1_1 ) ) )
            // InternalSatt.g:1036:1: ( ( rule__Nand__Alternatives_1_1 ) )
            {
            // InternalSatt.g:1036:1: ( ( rule__Nand__Alternatives_1_1 ) )
            // InternalSatt.g:1037:2: ( rule__Nand__Alternatives_1_1 )
            {
             before(grammarAccess.getNandAccess().getAlternatives_1_1()); 
            // InternalSatt.g:1038:2: ( rule__Nand__Alternatives_1_1 )
            // InternalSatt.g:1038:3: rule__Nand__Alternatives_1_1
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
    // InternalSatt.g:1046:1: rule__Nand__Group_1__2 : rule__Nand__Group_1__2__Impl ;
    public final void rule__Nand__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1050:1: ( rule__Nand__Group_1__2__Impl )
            // InternalSatt.g:1051:2: rule__Nand__Group_1__2__Impl
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
    // InternalSatt.g:1057:1: rule__Nand__Group_1__2__Impl : ( ( rule__Nand__RightAssignment_1_2 ) ) ;
    public final void rule__Nand__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1061:1: ( ( ( rule__Nand__RightAssignment_1_2 ) ) )
            // InternalSatt.g:1062:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            {
            // InternalSatt.g:1062:1: ( ( rule__Nand__RightAssignment_1_2 ) )
            // InternalSatt.g:1063:2: ( rule__Nand__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandAccess().getRightAssignment_1_2()); 
            // InternalSatt.g:1064:2: ( rule__Nand__RightAssignment_1_2 )
            // InternalSatt.g:1064:3: rule__Nand__RightAssignment_1_2
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
    // InternalSatt.g:1073:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1077:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalSatt.g:1078:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalSatt.g:1085:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1089:1: ( ( '(' ) )
            // InternalSatt.g:1090:1: ( '(' )
            {
            // InternalSatt.g:1090:1: ( '(' )
            // InternalSatt.g:1091:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSatt.g:1100:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1104:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalSatt.g:1105:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSatt.g:1112:1: rule__Primary__Group_0__1__Impl : ( ruleModel ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1116:1: ( ( ruleModel ) )
            // InternalSatt.g:1117:1: ( ruleModel )
            {
            // InternalSatt.g:1117:1: ( ruleModel )
            // InternalSatt.g:1118:2: ruleModel
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
    // InternalSatt.g:1127:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1131:1: ( rule__Primary__Group_0__2__Impl )
            // InternalSatt.g:1132:2: rule__Primary__Group_0__2__Impl
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
    // InternalSatt.g:1138:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1142:1: ( ( ')' ) )
            // InternalSatt.g:1143:1: ( ')' )
            {
            // InternalSatt.g:1143:1: ( ')' )
            // InternalSatt.g:1144:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSatt.g:1154:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1158:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalSatt.g:1159:2: rule__Not__Group__0__Impl rule__Not__Group__1
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
    // InternalSatt.g:1166:1: rule__Not__Group__0__Impl : ( ( rule__Not__Alternatives_0 ) ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1170:1: ( ( ( rule__Not__Alternatives_0 ) ) )
            // InternalSatt.g:1171:1: ( ( rule__Not__Alternatives_0 ) )
            {
            // InternalSatt.g:1171:1: ( ( rule__Not__Alternatives_0 ) )
            // InternalSatt.g:1172:2: ( rule__Not__Alternatives_0 )
            {
             before(grammarAccess.getNotAccess().getAlternatives_0()); 
            // InternalSatt.g:1173:2: ( rule__Not__Alternatives_0 )
            // InternalSatt.g:1173:3: rule__Not__Alternatives_0
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
    // InternalSatt.g:1181:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1185:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalSatt.g:1186:2: rule__Not__Group__1__Impl rule__Not__Group__2
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
    // InternalSatt.g:1193:1: rule__Not__Group__1__Impl : ( rulePrimary ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1197:1: ( ( rulePrimary ) )
            // InternalSatt.g:1198:1: ( rulePrimary )
            {
            // InternalSatt.g:1198:1: ( rulePrimary )
            // InternalSatt.g:1199:2: rulePrimary
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
    // InternalSatt.g:1208:1: rule__Not__Group__2 : rule__Not__Group__2__Impl ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1212:1: ( rule__Not__Group__2__Impl )
            // InternalSatt.g:1213:2: rule__Not__Group__2__Impl
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
    // InternalSatt.g:1219:1: rule__Not__Group__2__Impl : ( () ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1223:1: ( ( () ) )
            // InternalSatt.g:1224:1: ( () )
            {
            // InternalSatt.g:1224:1: ( () )
            // InternalSatt.g:1225:2: ()
            {
             before(grammarAccess.getNotAccess().getNotExpressionAction_2()); 
            // InternalSatt.g:1226:2: ()
            // InternalSatt.g:1226:3: 
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


    // $ANTLR start "rule__BiImpl__RightAssignment_1_2"
    // InternalSatt.g:1235:1: rule__BiImpl__RightAssignment_1_2 : ( ruleImpl ) ;
    public final void rule__BiImpl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1239:1: ( ( ruleImpl ) )
            // InternalSatt.g:1240:2: ( ruleImpl )
            {
            // InternalSatt.g:1240:2: ( ruleImpl )
            // InternalSatt.g:1241:3: ruleImpl
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
    // InternalSatt.g:1250:1: rule__Impl__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Impl__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1254:1: ( ( ruleOr ) )
            // InternalSatt.g:1255:2: ( ruleOr )
            {
            // InternalSatt.g:1255:2: ( ruleOr )
            // InternalSatt.g:1256:3: ruleOr
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
    // InternalSatt.g:1265:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1269:1: ( ( ruleAnd ) )
            // InternalSatt.g:1270:2: ( ruleAnd )
            {
            // InternalSatt.g:1270:2: ( ruleAnd )
            // InternalSatt.g:1271:3: ruleAnd
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
    // InternalSatt.g:1280:1: rule__And__RightAssignment_1_2 : ( ruleNand ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1284:1: ( ( ruleNand ) )
            // InternalSatt.g:1285:2: ( ruleNand )
            {
            // InternalSatt.g:1285:2: ( ruleNand )
            // InternalSatt.g:1286:3: ruleNand
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
    // InternalSatt.g:1295:1: rule__Nand__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Nand__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1299:1: ( ( rulePrimary ) )
            // InternalSatt.g:1300:2: ( rulePrimary )
            {
            // InternalSatt.g:1300:2: ( rulePrimary )
            // InternalSatt.g:1301:3: rulePrimary
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
    // InternalSatt.g:1310:1: rule__Var__IdAssignment : ( RULE_ID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1314:1: ( ( RULE_ID ) )
            // InternalSatt.g:1315:2: ( RULE_ID )
            {
            // InternalSatt.g:1315:2: ( RULE_ID )
            // InternalSatt.g:1316:3: RULE_ID
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
    // InternalSatt.g:1325:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSatt.g:1329:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalSatt.g:1330:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalSatt.g:1330:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalSatt.g:1331:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalSatt.g:1332:3: ( rule__Const__ValAlternatives_0 )
            // InternalSatt.g:1332:4: rule__Const__ValAlternatives_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000021E010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}