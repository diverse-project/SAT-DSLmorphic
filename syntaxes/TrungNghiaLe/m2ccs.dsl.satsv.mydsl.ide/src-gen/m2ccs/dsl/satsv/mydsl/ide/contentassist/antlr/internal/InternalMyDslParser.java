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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'&&'", "'||'", "'->'", "'<->'", "'!&'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__FormulaAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__FormulaAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__FormulaAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__FormulaAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__FormulaAssignment )*
            {
             before(grammarAccess.getModelAccess().getFormulaAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__FormulaAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__FormulaAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FormulaAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFormulaAssignment()); 

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


    // $ANTLR start "entryRuleFormula"
    // InternalMyDsl.g:78:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFormula EOF )
            // InternalMyDsl.g:80:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalMyDsl.g:87:1: ruleFormula : ( ( rule__Formula__Alternatives ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Formula__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Formula__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Formula__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Formula__Alternatives )
            {
             before(grammarAccess.getFormulaAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Formula__Alternatives )
            // InternalMyDsl.g:94:4: rule__Formula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleVariable EOF )
            // InternalMyDsl.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:112:1: ruleVariable : ( ( rule__Variable__IdAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Variable__IdAssignment ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Variable__IdAssignment ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Variable__IdAssignment ) )
            // InternalMyDsl.g:118:3: ( rule__Variable__IdAssignment )
            {
             before(grammarAccess.getVariableAccess().getIdAssignment()); 
            // InternalMyDsl.g:119:3: ( rule__Variable__IdAssignment )
            // InternalMyDsl.g:119:4: rule__Variable__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUnOp"
    // InternalMyDsl.g:128:1: entryRuleUnOp : ruleUnOp EOF ;
    public final void entryRuleUnOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleUnOp EOF )
            // InternalMyDsl.g:130:1: ruleUnOp EOF
            {
             before(grammarAccess.getUnOpRule()); 
            pushFollow(FOLLOW_1);
            ruleUnOp();

            state._fsp--;

             after(grammarAccess.getUnOpRule()); 
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
    // $ANTLR end "entryRuleUnOp"


    // $ANTLR start "ruleUnOp"
    // InternalMyDsl.g:137:1: ruleUnOp : ( ( rule__UnOp__TypeAssignment ) ) ;
    public final void ruleUnOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__UnOp__TypeAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__UnOp__TypeAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__UnOp__TypeAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__UnOp__TypeAssignment )
            {
             before(grammarAccess.getUnOpAccess().getTypeAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__UnOp__TypeAssignment )
            // InternalMyDsl.g:144:4: rule__UnOp__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnOp__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnOpAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleUnOp"


    // $ANTLR start "entryRuleUnOpType"
    // InternalMyDsl.g:153:1: entryRuleUnOpType : ruleUnOpType EOF ;
    public final void entryRuleUnOpType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleUnOpType EOF )
            // InternalMyDsl.g:155:1: ruleUnOpType EOF
            {
             before(grammarAccess.getUnOpTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnOpType();

            state._fsp--;

             after(grammarAccess.getUnOpTypeRule()); 
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
    // $ANTLR end "entryRuleUnOpType"


    // $ANTLR start "ruleUnOpType"
    // InternalMyDsl.g:162:1: ruleUnOpType : ( '!' ) ;
    public final void ruleUnOpType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( '!' ) )
            // InternalMyDsl.g:167:2: ( '!' )
            {
            // InternalMyDsl.g:167:2: ( '!' )
            // InternalMyDsl.g:168:3: '!'
            {
             before(grammarAccess.getUnOpTypeAccess().getExclamationMarkKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnOpTypeAccess().getExclamationMarkKeyword()); 

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
    // $ANTLR end "ruleUnOpType"


    // $ANTLR start "entryRuleBiOp"
    // InternalMyDsl.g:178:1: entryRuleBiOp : ruleBiOp EOF ;
    public final void entryRuleBiOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleBiOp EOF )
            // InternalMyDsl.g:180:1: ruleBiOp EOF
            {
             before(grammarAccess.getBiOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBiOp();

            state._fsp--;

             after(grammarAccess.getBiOpRule()); 
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
    // $ANTLR end "entryRuleBiOp"


    // $ANTLR start "ruleBiOp"
    // InternalMyDsl.g:187:1: ruleBiOp : ( ( rule__BiOp__TypeAssignment ) ) ;
    public final void ruleBiOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__BiOp__TypeAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__BiOp__TypeAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__BiOp__TypeAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__BiOp__TypeAssignment )
            {
             before(grammarAccess.getBiOpAccess().getTypeAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__BiOp__TypeAssignment )
            // InternalMyDsl.g:194:4: rule__BiOp__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BiOp__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBiOpAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleBiOp"


    // $ANTLR start "entryRuleBiOpType"
    // InternalMyDsl.g:203:1: entryRuleBiOpType : ruleBiOpType EOF ;
    public final void entryRuleBiOpType() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleBiOpType EOF )
            // InternalMyDsl.g:205:1: ruleBiOpType EOF
            {
             before(grammarAccess.getBiOpTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBiOpType();

            state._fsp--;

             after(grammarAccess.getBiOpTypeRule()); 
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
    // $ANTLR end "entryRuleBiOpType"


    // $ANTLR start "ruleBiOpType"
    // InternalMyDsl.g:212:1: ruleBiOpType : ( ( rule__BiOpType__Alternatives ) ) ;
    public final void ruleBiOpType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__BiOpType__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__BiOpType__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__BiOpType__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__BiOpType__Alternatives )
            {
             before(grammarAccess.getBiOpTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__BiOpType__Alternatives )
            // InternalMyDsl.g:219:4: rule__BiOpType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BiOpType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBiOpTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBiOpType"


    // $ANTLR start "rule__Formula__Alternatives"
    // InternalMyDsl.g:227:1: rule__Formula__Alternatives : ( ( ( rule__Formula__VarAssignment_0 ) ) | ( ( rule__Formula__Group_1__0 ) ) | ( ( rule__Formula__Group_2__0 ) ) );
    public final void rule__Formula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ( rule__Formula__VarAssignment_0 ) ) | ( ( rule__Formula__Group_1__0 ) ) | ( ( rule__Formula__Group_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==11) ) {
                    alt2=2;
                }
                else if ( (LA2_2==RULE_ID||LA2_2==17) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ( rule__Formula__VarAssignment_0 ) )
                    {
                    // InternalMyDsl.g:232:2: ( ( rule__Formula__VarAssignment_0 ) )
                    // InternalMyDsl.g:233:3: ( rule__Formula__VarAssignment_0 )
                    {
                     before(grammarAccess.getFormulaAccess().getVarAssignment_0()); 
                    // InternalMyDsl.g:234:3: ( rule__Formula__VarAssignment_0 )
                    // InternalMyDsl.g:234:4: rule__Formula__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__VarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaAccess().getVarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ( rule__Formula__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:238:2: ( ( rule__Formula__Group_1__0 ) )
                    // InternalMyDsl.g:239:3: ( rule__Formula__Group_1__0 )
                    {
                     before(grammarAccess.getFormulaAccess().getGroup_1()); 
                    // InternalMyDsl.g:240:3: ( rule__Formula__Group_1__0 )
                    // InternalMyDsl.g:240:4: rule__Formula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:244:2: ( ( rule__Formula__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:244:2: ( ( rule__Formula__Group_2__0 ) )
                    // InternalMyDsl.g:245:3: ( rule__Formula__Group_2__0 )
                    {
                     before(grammarAccess.getFormulaAccess().getGroup_2()); 
                    // InternalMyDsl.g:246:3: ( rule__Formula__Group_2__0 )
                    // InternalMyDsl.g:246:4: rule__Formula__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Formula__Alternatives"


    // $ANTLR start "rule__BiOpType__Alternatives"
    // InternalMyDsl.g:254:1: rule__BiOpType__Alternatives : ( ( '&&' ) | ( '||' ) | ( '->' ) | ( '<->' ) | ( '!&' ) );
    public final void rule__BiOpType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( ( '&&' ) | ( '||' ) | ( '->' ) | ( '<->' ) | ( '!&' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:259:2: ( '&&' )
                    {
                    // InternalMyDsl.g:259:2: ( '&&' )
                    // InternalMyDsl.g:260:3: '&&'
                    {
                     before(grammarAccess.getBiOpTypeAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBiOpTypeAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:265:2: ( '||' )
                    {
                    // InternalMyDsl.g:265:2: ( '||' )
                    // InternalMyDsl.g:266:3: '||'
                    {
                     before(grammarAccess.getBiOpTypeAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBiOpTypeAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:271:2: ( '->' )
                    {
                    // InternalMyDsl.g:271:2: ( '->' )
                    // InternalMyDsl.g:272:3: '->'
                    {
                     before(grammarAccess.getBiOpTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBiOpTypeAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:277:2: ( '<->' )
                    {
                    // InternalMyDsl.g:277:2: ( '<->' )
                    // InternalMyDsl.g:278:3: '<->'
                    {
                     before(grammarAccess.getBiOpTypeAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBiOpTypeAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:283:2: ( '!&' )
                    {
                    // InternalMyDsl.g:283:2: ( '!&' )
                    // InternalMyDsl.g:284:3: '!&'
                    {
                     before(grammarAccess.getBiOpTypeAccess().getExclamationMarkAmpersandKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBiOpTypeAccess().getExclamationMarkAmpersandKeyword_4()); 

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
    // $ANTLR end "rule__BiOpType__Alternatives"


    // $ANTLR start "rule__Formula__Group_1__0"
    // InternalMyDsl.g:293:1: rule__Formula__Group_1__0 : rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 ;
    public final void rule__Formula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 )
            // InternalMyDsl.g:298:2: rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Formula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__1();

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
    // $ANTLR end "rule__Formula__Group_1__0"


    // $ANTLR start "rule__Formula__Group_1__0__Impl"
    // InternalMyDsl.g:305:1: rule__Formula__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Formula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:309:1: ( ( '(' ) )
            // InternalMyDsl.g:310:1: ( '(' )
            {
            // InternalMyDsl.g:310:1: ( '(' )
            // InternalMyDsl.g:311:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Formula__Group_1__0__Impl"


    // $ANTLR start "rule__Formula__Group_1__1"
    // InternalMyDsl.g:320:1: rule__Formula__Group_1__1 : rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 ;
    public final void rule__Formula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 )
            // InternalMyDsl.g:325:2: rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Formula__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__2();

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
    // $ANTLR end "rule__Formula__Group_1__1"


    // $ANTLR start "rule__Formula__Group_1__1__Impl"
    // InternalMyDsl.g:332:1: rule__Formula__Group_1__1__Impl : ( ( rule__Formula__OpAssignment_1_1 ) ) ;
    public final void rule__Formula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:336:1: ( ( ( rule__Formula__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:337:1: ( ( rule__Formula__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:337:1: ( ( rule__Formula__OpAssignment_1_1 ) )
            // InternalMyDsl.g:338:2: ( rule__Formula__OpAssignment_1_1 )
            {
             before(grammarAccess.getFormulaAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:339:2: ( rule__Formula__OpAssignment_1_1 )
            // InternalMyDsl.g:339:3: rule__Formula__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Formula__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Formula__Group_1__1__Impl"


    // $ANTLR start "rule__Formula__Group_1__2"
    // InternalMyDsl.g:347:1: rule__Formula__Group_1__2 : rule__Formula__Group_1__2__Impl rule__Formula__Group_1__3 ;
    public final void rule__Formula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( rule__Formula__Group_1__2__Impl rule__Formula__Group_1__3 )
            // InternalMyDsl.g:352:2: rule__Formula__Group_1__2__Impl rule__Formula__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Formula__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__3();

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
    // $ANTLR end "rule__Formula__Group_1__2"


    // $ANTLR start "rule__Formula__Group_1__2__Impl"
    // InternalMyDsl.g:359:1: rule__Formula__Group_1__2__Impl : ( ( rule__Formula__ArgAssignment_1_2 ) ) ;
    public final void rule__Formula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:363:1: ( ( ( rule__Formula__ArgAssignment_1_2 ) ) )
            // InternalMyDsl.g:364:1: ( ( rule__Formula__ArgAssignment_1_2 ) )
            {
            // InternalMyDsl.g:364:1: ( ( rule__Formula__ArgAssignment_1_2 ) )
            // InternalMyDsl.g:365:2: ( rule__Formula__ArgAssignment_1_2 )
            {
             before(grammarAccess.getFormulaAccess().getArgAssignment_1_2()); 
            // InternalMyDsl.g:366:2: ( rule__Formula__ArgAssignment_1_2 )
            // InternalMyDsl.g:366:3: rule__Formula__ArgAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Formula__ArgAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getArgAssignment_1_2()); 

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
    // $ANTLR end "rule__Formula__Group_1__2__Impl"


    // $ANTLR start "rule__Formula__Group_1__3"
    // InternalMyDsl.g:374:1: rule__Formula__Group_1__3 : rule__Formula__Group_1__3__Impl ;
    public final void rule__Formula__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( rule__Formula__Group_1__3__Impl )
            // InternalMyDsl.g:379:2: rule__Formula__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__3__Impl();

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
    // $ANTLR end "rule__Formula__Group_1__3"


    // $ANTLR start "rule__Formula__Group_1__3__Impl"
    // InternalMyDsl.g:385:1: rule__Formula__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Formula__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( ')' ) )
            // InternalMyDsl.g:390:1: ( ')' )
            {
            // InternalMyDsl.g:390:1: ( ')' )
            // InternalMyDsl.g:391:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Formula__Group_1__3__Impl"


    // $ANTLR start "rule__Formula__Group_2__0"
    // InternalMyDsl.g:401:1: rule__Formula__Group_2__0 : rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 ;
    public final void rule__Formula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 )
            // InternalMyDsl.g:406:2: rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Formula__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__1();

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
    // $ANTLR end "rule__Formula__Group_2__0"


    // $ANTLR start "rule__Formula__Group_2__0__Impl"
    // InternalMyDsl.g:413:1: rule__Formula__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Formula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:417:1: ( ( '(' ) )
            // InternalMyDsl.g:418:1: ( '(' )
            {
            // InternalMyDsl.g:418:1: ( '(' )
            // InternalMyDsl.g:419:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Formula__Group_2__0__Impl"


    // $ANTLR start "rule__Formula__Group_2__1"
    // InternalMyDsl.g:428:1: rule__Formula__Group_2__1 : rule__Formula__Group_2__1__Impl rule__Formula__Group_2__2 ;
    public final void rule__Formula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( rule__Formula__Group_2__1__Impl rule__Formula__Group_2__2 )
            // InternalMyDsl.g:433:2: rule__Formula__Group_2__1__Impl rule__Formula__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Formula__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__2();

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
    // $ANTLR end "rule__Formula__Group_2__1"


    // $ANTLR start "rule__Formula__Group_2__1__Impl"
    // InternalMyDsl.g:440:1: rule__Formula__Group_2__1__Impl : ( ( rule__Formula__Arg1Assignment_2_1 ) ) ;
    public final void rule__Formula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:444:1: ( ( ( rule__Formula__Arg1Assignment_2_1 ) ) )
            // InternalMyDsl.g:445:1: ( ( rule__Formula__Arg1Assignment_2_1 ) )
            {
            // InternalMyDsl.g:445:1: ( ( rule__Formula__Arg1Assignment_2_1 ) )
            // InternalMyDsl.g:446:2: ( rule__Formula__Arg1Assignment_2_1 )
            {
             before(grammarAccess.getFormulaAccess().getArg1Assignment_2_1()); 
            // InternalMyDsl.g:447:2: ( rule__Formula__Arg1Assignment_2_1 )
            // InternalMyDsl.g:447:3: rule__Formula__Arg1Assignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Arg1Assignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getArg1Assignment_2_1()); 

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
    // $ANTLR end "rule__Formula__Group_2__1__Impl"


    // $ANTLR start "rule__Formula__Group_2__2"
    // InternalMyDsl.g:455:1: rule__Formula__Group_2__2 : rule__Formula__Group_2__2__Impl rule__Formula__Group_2__3 ;
    public final void rule__Formula__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( rule__Formula__Group_2__2__Impl rule__Formula__Group_2__3 )
            // InternalMyDsl.g:460:2: rule__Formula__Group_2__2__Impl rule__Formula__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__Formula__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__3();

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
    // $ANTLR end "rule__Formula__Group_2__2"


    // $ANTLR start "rule__Formula__Group_2__2__Impl"
    // InternalMyDsl.g:467:1: rule__Formula__Group_2__2__Impl : ( ( rule__Formula__OpAssignment_2_2 ) ) ;
    public final void rule__Formula__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:471:1: ( ( ( rule__Formula__OpAssignment_2_2 ) ) )
            // InternalMyDsl.g:472:1: ( ( rule__Formula__OpAssignment_2_2 ) )
            {
            // InternalMyDsl.g:472:1: ( ( rule__Formula__OpAssignment_2_2 ) )
            // InternalMyDsl.g:473:2: ( rule__Formula__OpAssignment_2_2 )
            {
             before(grammarAccess.getFormulaAccess().getOpAssignment_2_2()); 
            // InternalMyDsl.g:474:2: ( rule__Formula__OpAssignment_2_2 )
            // InternalMyDsl.g:474:3: rule__Formula__OpAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Formula__OpAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getOpAssignment_2_2()); 

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
    // $ANTLR end "rule__Formula__Group_2__2__Impl"


    // $ANTLR start "rule__Formula__Group_2__3"
    // InternalMyDsl.g:482:1: rule__Formula__Group_2__3 : rule__Formula__Group_2__3__Impl rule__Formula__Group_2__4 ;
    public final void rule__Formula__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( rule__Formula__Group_2__3__Impl rule__Formula__Group_2__4 )
            // InternalMyDsl.g:487:2: rule__Formula__Group_2__3__Impl rule__Formula__Group_2__4
            {
            pushFollow(FOLLOW_6);
            rule__Formula__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__4();

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
    // $ANTLR end "rule__Formula__Group_2__3"


    // $ANTLR start "rule__Formula__Group_2__3__Impl"
    // InternalMyDsl.g:494:1: rule__Formula__Group_2__3__Impl : ( ( rule__Formula__Arg2Assignment_2_3 ) ) ;
    public final void rule__Formula__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ( rule__Formula__Arg2Assignment_2_3 ) ) )
            // InternalMyDsl.g:499:1: ( ( rule__Formula__Arg2Assignment_2_3 ) )
            {
            // InternalMyDsl.g:499:1: ( ( rule__Formula__Arg2Assignment_2_3 ) )
            // InternalMyDsl.g:500:2: ( rule__Formula__Arg2Assignment_2_3 )
            {
             before(grammarAccess.getFormulaAccess().getArg2Assignment_2_3()); 
            // InternalMyDsl.g:501:2: ( rule__Formula__Arg2Assignment_2_3 )
            // InternalMyDsl.g:501:3: rule__Formula__Arg2Assignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Arg2Assignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getArg2Assignment_2_3()); 

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
    // $ANTLR end "rule__Formula__Group_2__3__Impl"


    // $ANTLR start "rule__Formula__Group_2__4"
    // InternalMyDsl.g:509:1: rule__Formula__Group_2__4 : rule__Formula__Group_2__4__Impl ;
    public final void rule__Formula__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( rule__Formula__Group_2__4__Impl )
            // InternalMyDsl.g:514:2: rule__Formula__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__4__Impl();

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
    // $ANTLR end "rule__Formula__Group_2__4"


    // $ANTLR start "rule__Formula__Group_2__4__Impl"
    // InternalMyDsl.g:520:1: rule__Formula__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Formula__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( ')' ) )
            // InternalMyDsl.g:525:1: ( ')' )
            {
            // InternalMyDsl.g:525:1: ( ')' )
            // InternalMyDsl.g:526:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_2_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_2_4()); 

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
    // $ANTLR end "rule__Formula__Group_2__4__Impl"


    // $ANTLR start "rule__Model__FormulaAssignment"
    // InternalMyDsl.g:536:1: rule__Model__FormulaAssignment : ( ruleFormula ) ;
    public final void rule__Model__FormulaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ruleFormula ) )
            // InternalMyDsl.g:541:2: ( ruleFormula )
            {
            // InternalMyDsl.g:541:2: ( ruleFormula )
            // InternalMyDsl.g:542:3: ruleFormula
            {
             before(grammarAccess.getModelAccess().getFormulaFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormulaFormulaParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__FormulaAssignment"


    // $ANTLR start "rule__Formula__VarAssignment_0"
    // InternalMyDsl.g:551:1: rule__Formula__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Formula__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:556:2: ( ruleVariable )
            {
            // InternalMyDsl.g:556:2: ( ruleVariable )
            // InternalMyDsl.g:557:3: ruleVariable
            {
             before(grammarAccess.getFormulaAccess().getVarVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getVarVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Formula__VarAssignment_0"


    // $ANTLR start "rule__Formula__OpAssignment_1_1"
    // InternalMyDsl.g:566:1: rule__Formula__OpAssignment_1_1 : ( ruleUnOp ) ;
    public final void rule__Formula__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( ( ruleUnOp ) )
            // InternalMyDsl.g:571:2: ( ruleUnOp )
            {
            // InternalMyDsl.g:571:2: ( ruleUnOp )
            // InternalMyDsl.g:572:3: ruleUnOp
            {
             before(grammarAccess.getFormulaAccess().getOpUnOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnOp();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getOpUnOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Formula__OpAssignment_1_1"


    // $ANTLR start "rule__Formula__ArgAssignment_1_2"
    // InternalMyDsl.g:581:1: rule__Formula__ArgAssignment_1_2 : ( ruleFormula ) ;
    public final void rule__Formula__ArgAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( ( ruleFormula ) )
            // InternalMyDsl.g:586:2: ( ruleFormula )
            {
            // InternalMyDsl.g:586:2: ( ruleFormula )
            // InternalMyDsl.g:587:3: ruleFormula
            {
             before(grammarAccess.getFormulaAccess().getArgFormulaParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getArgFormulaParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Formula__ArgAssignment_1_2"


    // $ANTLR start "rule__Formula__Arg1Assignment_2_1"
    // InternalMyDsl.g:596:1: rule__Formula__Arg1Assignment_2_1 : ( ruleFormula ) ;
    public final void rule__Formula__Arg1Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( ruleFormula ) )
            // InternalMyDsl.g:601:2: ( ruleFormula )
            {
            // InternalMyDsl.g:601:2: ( ruleFormula )
            // InternalMyDsl.g:602:3: ruleFormula
            {
             before(grammarAccess.getFormulaAccess().getArg1FormulaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getArg1FormulaParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Formula__Arg1Assignment_2_1"


    // $ANTLR start "rule__Formula__OpAssignment_2_2"
    // InternalMyDsl.g:611:1: rule__Formula__OpAssignment_2_2 : ( ruleBiOp ) ;
    public final void rule__Formula__OpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( ruleBiOp ) )
            // InternalMyDsl.g:616:2: ( ruleBiOp )
            {
            // InternalMyDsl.g:616:2: ( ruleBiOp )
            // InternalMyDsl.g:617:3: ruleBiOp
            {
             before(grammarAccess.getFormulaAccess().getOpBiOpParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBiOp();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getOpBiOpParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Formula__OpAssignment_2_2"


    // $ANTLR start "rule__Formula__Arg2Assignment_2_3"
    // InternalMyDsl.g:626:1: rule__Formula__Arg2Assignment_2_3 : ( ruleFormula ) ;
    public final void rule__Formula__Arg2Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ruleFormula ) )
            // InternalMyDsl.g:631:2: ( ruleFormula )
            {
            // InternalMyDsl.g:631:2: ( ruleFormula )
            // InternalMyDsl.g:632:3: ruleFormula
            {
             before(grammarAccess.getFormulaAccess().getArg2FormulaParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getArg2FormulaParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__Formula__Arg2Assignment_2_3"


    // $ANTLR start "rule__Variable__IdAssignment"
    // InternalMyDsl.g:641:1: rule__Variable__IdAssignment : ( RULE_ID ) ;
    public final void rule__Variable__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:646:2: ( RULE_ID )
            {
            // InternalMyDsl.g:646:2: ( RULE_ID )
            // InternalMyDsl.g:647:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__IdAssignment"


    // $ANTLR start "rule__UnOp__TypeAssignment"
    // InternalMyDsl.g:656:1: rule__UnOp__TypeAssignment : ( ruleUnOpType ) ;
    public final void rule__UnOp__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( ( ruleUnOpType ) )
            // InternalMyDsl.g:661:2: ( ruleUnOpType )
            {
            // InternalMyDsl.g:661:2: ( ruleUnOpType )
            // InternalMyDsl.g:662:3: ruleUnOpType
            {
             before(grammarAccess.getUnOpAccess().getTypeUnOpTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnOpType();

            state._fsp--;

             after(grammarAccess.getUnOpAccess().getTypeUnOpTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__UnOp__TypeAssignment"


    // $ANTLR start "rule__BiOp__TypeAssignment"
    // InternalMyDsl.g:671:1: rule__BiOp__TypeAssignment : ( ruleBiOpType ) ;
    public final void rule__BiOp__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ruleBiOpType ) )
            // InternalMyDsl.g:676:2: ( ruleBiOpType )
            {
            // InternalMyDsl.g:676:2: ( ruleBiOpType )
            // InternalMyDsl.g:677:3: ruleBiOpType
            {
             before(grammarAccess.getBiOpAccess().getTypeBiOpTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBiOpType();

            state._fsp--;

             after(grammarAccess.getBiOpAccess().getTypeBiOpTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__BiOp__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001F000L});

}