package fr.m1sif.dsl.ide.contentassist.antlr.internal;

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
import fr.m1sif.dsl.services.SatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'&&'", "'||'", "'!&'", "'==>'", "'<=>'", "';'", "'('", "')'"
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
    public static final int RULE_ML_COMMENT=7;

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



    // $ANTLR start "entryRuleExpressions"
    // InternalSat.g:53:1: entryRuleExpressions : ruleExpressions EOF ;
    public final void entryRuleExpressions() throws RecognitionException {
        try {
            // InternalSat.g:54:1: ( ruleExpressions EOF )
            // InternalSat.g:55:1: ruleExpressions EOF
            {
             before(grammarAccess.getExpressionsRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressions();

            state._fsp--;

             after(grammarAccess.getExpressionsRule()); 
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
    // $ANTLR end "entryRuleExpressions"


    // $ANTLR start "ruleExpressions"
    // InternalSat.g:62:1: ruleExpressions : ( ( rule__Expressions__Group__0 )* ) ;
    public final void ruleExpressions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:66:2: ( ( ( rule__Expressions__Group__0 )* ) )
            // InternalSat.g:67:2: ( ( rule__Expressions__Group__0 )* )
            {
            // InternalSat.g:67:2: ( ( rule__Expressions__Group__0 )* )
            // InternalSat.g:68:3: ( rule__Expressions__Group__0 )*
            {
             before(grammarAccess.getExpressionsAccess().getGroup()); 
            // InternalSat.g:69:3: ( rule__Expressions__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSat.g:69:4: rule__Expressions__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Expressions__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionsAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressions"


    // $ANTLR start "entryRuleExpression"
    // InternalSat.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSat.g:79:1: ( ruleExpression EOF )
            // InternalSat.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSat.g:87:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:91:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalSat.g:92:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalSat.g:92:2: ( ( rule__Expression__Alternatives ) )
            // InternalSat.g:93:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalSat.g:94:3: ( rule__Expression__Alternatives )
            // InternalSat.g:94:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleUnop"
    // InternalSat.g:103:1: entryRuleUnop : ruleUnop EOF ;
    public final void entryRuleUnop() throws RecognitionException {
        try {
            // InternalSat.g:104:1: ( ruleUnop EOF )
            // InternalSat.g:105:1: ruleUnop EOF
            {
             before(grammarAccess.getUnopRule()); 
            pushFollow(FOLLOW_1);
            ruleUnop();

            state._fsp--;

             after(grammarAccess.getUnopRule()); 
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
    // $ANTLR end "entryRuleUnop"


    // $ANTLR start "ruleUnop"
    // InternalSat.g:112:1: ruleUnop : ( ( rule__Unop__Group__0 ) ) ;
    public final void ruleUnop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:116:2: ( ( ( rule__Unop__Group__0 ) ) )
            // InternalSat.g:117:2: ( ( rule__Unop__Group__0 ) )
            {
            // InternalSat.g:117:2: ( ( rule__Unop__Group__0 ) )
            // InternalSat.g:118:3: ( rule__Unop__Group__0 )
            {
             before(grammarAccess.getUnopAccess().getGroup()); 
            // InternalSat.g:119:3: ( rule__Unop__Group__0 )
            // InternalSat.g:119:4: rule__Unop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnopAccess().getGroup()); 

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
    // $ANTLR end "ruleUnop"


    // $ANTLR start "entryRuleBinop"
    // InternalSat.g:128:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // InternalSat.g:129:1: ( ruleBinop EOF )
            // InternalSat.g:130:1: ruleBinop EOF
            {
             before(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getBinopRule()); 
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
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalSat.g:137:1: ruleBinop : ( ( rule__Binop__Group__0 ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:141:2: ( ( ( rule__Binop__Group__0 ) ) )
            // InternalSat.g:142:2: ( ( rule__Binop__Group__0 ) )
            {
            // InternalSat.g:142:2: ( ( rule__Binop__Group__0 ) )
            // InternalSat.g:143:3: ( rule__Binop__Group__0 )
            {
             before(grammarAccess.getBinopAccess().getGroup()); 
            // InternalSat.g:144:3: ( rule__Binop__Group__0 )
            // InternalSat.g:144:4: rule__Binop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getGroup()); 

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
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleAtom"
    // InternalSat.g:153:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSat.g:154:1: ( ruleAtom EOF )
            // InternalSat.g:155:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSat.g:162:1: ruleAtom : ( ( rule__Atom__IdAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:166:2: ( ( ( rule__Atom__IdAssignment ) ) )
            // InternalSat.g:167:2: ( ( rule__Atom__IdAssignment ) )
            {
            // InternalSat.g:167:2: ( ( rule__Atom__IdAssignment ) )
            // InternalSat.g:168:3: ( rule__Atom__IdAssignment )
            {
             before(grammarAccess.getAtomAccess().getIdAssignment()); 
            // InternalSat.g:169:3: ( rule__Atom__IdAssignment )
            // InternalSat.g:169:4: rule__Atom__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atom__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleUnopType"
    // InternalSat.g:178:1: entryRuleUnopType : ruleUnopType EOF ;
    public final void entryRuleUnopType() throws RecognitionException {
        try {
            // InternalSat.g:179:1: ( ruleUnopType EOF )
            // InternalSat.g:180:1: ruleUnopType EOF
            {
             before(grammarAccess.getUnopTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnopType();

            state._fsp--;

             after(grammarAccess.getUnopTypeRule()); 
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
    // $ANTLR end "entryRuleUnopType"


    // $ANTLR start "ruleUnopType"
    // InternalSat.g:187:1: ruleUnopType : ( '!' ) ;
    public final void ruleUnopType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:191:2: ( ( '!' ) )
            // InternalSat.g:192:2: ( '!' )
            {
            // InternalSat.g:192:2: ( '!' )
            // InternalSat.g:193:3: '!'
            {
             before(grammarAccess.getUnopTypeAccess().getExclamationMarkKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUnopTypeAccess().getExclamationMarkKeyword()); 

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
    // $ANTLR end "ruleUnopType"


    // $ANTLR start "entryRuleBinopType"
    // InternalSat.g:203:1: entryRuleBinopType : ruleBinopType EOF ;
    public final void entryRuleBinopType() throws RecognitionException {
        try {
            // InternalSat.g:204:1: ( ruleBinopType EOF )
            // InternalSat.g:205:1: ruleBinopType EOF
            {
             before(grammarAccess.getBinopTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBinopType();

            state._fsp--;

             after(grammarAccess.getBinopTypeRule()); 
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
    // $ANTLR end "entryRuleBinopType"


    // $ANTLR start "ruleBinopType"
    // InternalSat.g:212:1: ruleBinopType : ( ( rule__BinopType__Alternatives ) ) ;
    public final void ruleBinopType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:216:2: ( ( ( rule__BinopType__Alternatives ) ) )
            // InternalSat.g:217:2: ( ( rule__BinopType__Alternatives ) )
            {
            // InternalSat.g:217:2: ( ( rule__BinopType__Alternatives ) )
            // InternalSat.g:218:3: ( rule__BinopType__Alternatives )
            {
             before(grammarAccess.getBinopTypeAccess().getAlternatives()); 
            // InternalSat.g:219:3: ( rule__BinopType__Alternatives )
            // InternalSat.g:219:4: rule__BinopType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinopType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinopTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinopType"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalSat.g:227:1: rule__Expression__Alternatives : ( ( ruleAtom ) | ( ruleUnop ) | ( ruleBinop ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:231:1: ( ( ruleAtom ) | ( ruleUnop ) | ( ruleBinop ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSat.g:232:2: ( ruleAtom )
                    {
                    // InternalSat.g:232:2: ( ruleAtom )
                    // InternalSat.g:233:3: ruleAtom
                    {
                     before(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:238:2: ( ruleUnop )
                    {
                    // InternalSat.g:238:2: ( ruleUnop )
                    // InternalSat.g:239:3: ruleUnop
                    {
                     before(grammarAccess.getExpressionAccess().getUnopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnop();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUnopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:244:2: ( ruleBinop )
                    {
                    // InternalSat.g:244:2: ( ruleBinop )
                    // InternalSat.g:245:3: ruleBinop
                    {
                     before(grammarAccess.getExpressionAccess().getBinopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinop();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinopParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BinopType__Alternatives"
    // InternalSat.g:254:1: rule__BinopType__Alternatives : ( ( '&&' ) | ( '||' ) | ( '!&' ) | ( '==>' ) | ( '<=>' ) );
    public final void rule__BinopType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:258:1: ( ( '&&' ) | ( '||' ) | ( '!&' ) | ( '==>' ) | ( '<=>' ) )
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
                    // InternalSat.g:259:2: ( '&&' )
                    {
                    // InternalSat.g:259:2: ( '&&' )
                    // InternalSat.g:260:3: '&&'
                    {
                     before(grammarAccess.getBinopTypeAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBinopTypeAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSat.g:265:2: ( '||' )
                    {
                    // InternalSat.g:265:2: ( '||' )
                    // InternalSat.g:266:3: '||'
                    {
                     before(grammarAccess.getBinopTypeAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBinopTypeAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSat.g:271:2: ( '!&' )
                    {
                    // InternalSat.g:271:2: ( '!&' )
                    // InternalSat.g:272:3: '!&'
                    {
                     before(grammarAccess.getBinopTypeAccess().getExclamationMarkAmpersandKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBinopTypeAccess().getExclamationMarkAmpersandKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSat.g:277:2: ( '==>' )
                    {
                    // InternalSat.g:277:2: ( '==>' )
                    // InternalSat.g:278:3: '==>'
                    {
                     before(grammarAccess.getBinopTypeAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinopTypeAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSat.g:283:2: ( '<=>' )
                    {
                    // InternalSat.g:283:2: ( '<=>' )
                    // InternalSat.g:284:3: '<=>'
                    {
                     before(grammarAccess.getBinopTypeAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinopTypeAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__BinopType__Alternatives"


    // $ANTLR start "rule__Expressions__Group__0"
    // InternalSat.g:293:1: rule__Expressions__Group__0 : rule__Expressions__Group__0__Impl rule__Expressions__Group__1 ;
    public final void rule__Expressions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:297:1: ( rule__Expressions__Group__0__Impl rule__Expressions__Group__1 )
            // InternalSat.g:298:2: rule__Expressions__Group__0__Impl rule__Expressions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Expressions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressions__Group__1();

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
    // $ANTLR end "rule__Expressions__Group__0"


    // $ANTLR start "rule__Expressions__Group__0__Impl"
    // InternalSat.g:305:1: rule__Expressions__Group__0__Impl : ( ( rule__Expressions__ExprsAssignment_0 ) ) ;
    public final void rule__Expressions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:309:1: ( ( ( rule__Expressions__ExprsAssignment_0 ) ) )
            // InternalSat.g:310:1: ( ( rule__Expressions__ExprsAssignment_0 ) )
            {
            // InternalSat.g:310:1: ( ( rule__Expressions__ExprsAssignment_0 ) )
            // InternalSat.g:311:2: ( rule__Expressions__ExprsAssignment_0 )
            {
             before(grammarAccess.getExpressionsAccess().getExprsAssignment_0()); 
            // InternalSat.g:312:2: ( rule__Expressions__ExprsAssignment_0 )
            // InternalSat.g:312:3: rule__Expressions__ExprsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressions__ExprsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionsAccess().getExprsAssignment_0()); 

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
    // $ANTLR end "rule__Expressions__Group__0__Impl"


    // $ANTLR start "rule__Expressions__Group__1"
    // InternalSat.g:320:1: rule__Expressions__Group__1 : rule__Expressions__Group__1__Impl ;
    public final void rule__Expressions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:324:1: ( rule__Expressions__Group__1__Impl )
            // InternalSat.g:325:2: rule__Expressions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressions__Group__1__Impl();

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
    // $ANTLR end "rule__Expressions__Group__1"


    // $ANTLR start "rule__Expressions__Group__1__Impl"
    // InternalSat.g:331:1: rule__Expressions__Group__1__Impl : ( ';' ) ;
    public final void rule__Expressions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:335:1: ( ( ';' ) )
            // InternalSat.g:336:1: ( ';' )
            {
            // InternalSat.g:336:1: ( ';' )
            // InternalSat.g:337:2: ';'
            {
             before(grammarAccess.getExpressionsAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionsAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Expressions__Group__1__Impl"


    // $ANTLR start "rule__Unop__Group__0"
    // InternalSat.g:347:1: rule__Unop__Group__0 : rule__Unop__Group__0__Impl rule__Unop__Group__1 ;
    public final void rule__Unop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:351:1: ( rule__Unop__Group__0__Impl rule__Unop__Group__1 )
            // InternalSat.g:352:2: rule__Unop__Group__0__Impl rule__Unop__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Unop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unop__Group__1();

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
    // $ANTLR end "rule__Unop__Group__0"


    // $ANTLR start "rule__Unop__Group__0__Impl"
    // InternalSat.g:359:1: rule__Unop__Group__0__Impl : ( ( rule__Unop__OpAssignment_0 ) ) ;
    public final void rule__Unop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:363:1: ( ( ( rule__Unop__OpAssignment_0 ) ) )
            // InternalSat.g:364:1: ( ( rule__Unop__OpAssignment_0 ) )
            {
            // InternalSat.g:364:1: ( ( rule__Unop__OpAssignment_0 ) )
            // InternalSat.g:365:2: ( rule__Unop__OpAssignment_0 )
            {
             before(grammarAccess.getUnopAccess().getOpAssignment_0()); 
            // InternalSat.g:366:2: ( rule__Unop__OpAssignment_0 )
            // InternalSat.g:366:3: rule__Unop__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Unop__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnopAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__Unop__Group__0__Impl"


    // $ANTLR start "rule__Unop__Group__1"
    // InternalSat.g:374:1: rule__Unop__Group__1 : rule__Unop__Group__1__Impl ;
    public final void rule__Unop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:378:1: ( rule__Unop__Group__1__Impl )
            // InternalSat.g:379:2: rule__Unop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unop__Group__1__Impl();

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
    // $ANTLR end "rule__Unop__Group__1"


    // $ANTLR start "rule__Unop__Group__1__Impl"
    // InternalSat.g:385:1: rule__Unop__Group__1__Impl : ( ( rule__Unop__ParamAssignment_1 ) ) ;
    public final void rule__Unop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:389:1: ( ( ( rule__Unop__ParamAssignment_1 ) ) )
            // InternalSat.g:390:1: ( ( rule__Unop__ParamAssignment_1 ) )
            {
            // InternalSat.g:390:1: ( ( rule__Unop__ParamAssignment_1 ) )
            // InternalSat.g:391:2: ( rule__Unop__ParamAssignment_1 )
            {
             before(grammarAccess.getUnopAccess().getParamAssignment_1()); 
            // InternalSat.g:392:2: ( rule__Unop__ParamAssignment_1 )
            // InternalSat.g:392:3: rule__Unop__ParamAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Unop__ParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnopAccess().getParamAssignment_1()); 

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
    // $ANTLR end "rule__Unop__Group__1__Impl"


    // $ANTLR start "rule__Binop__Group__0"
    // InternalSat.g:401:1: rule__Binop__Group__0 : rule__Binop__Group__0__Impl rule__Binop__Group__1 ;
    public final void rule__Binop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:405:1: ( rule__Binop__Group__0__Impl rule__Binop__Group__1 )
            // InternalSat.g:406:2: rule__Binop__Group__0__Impl rule__Binop__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Binop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binop__Group__1();

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
    // $ANTLR end "rule__Binop__Group__0"


    // $ANTLR start "rule__Binop__Group__0__Impl"
    // InternalSat.g:413:1: rule__Binop__Group__0__Impl : ( '(' ) ;
    public final void rule__Binop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:417:1: ( ( '(' ) )
            // InternalSat.g:418:1: ( '(' )
            {
            // InternalSat.g:418:1: ( '(' )
            // InternalSat.g:419:2: '('
            {
             before(grammarAccess.getBinopAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBinopAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Binop__Group__0__Impl"


    // $ANTLR start "rule__Binop__Group__1"
    // InternalSat.g:428:1: rule__Binop__Group__1 : rule__Binop__Group__1__Impl rule__Binop__Group__2 ;
    public final void rule__Binop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:432:1: ( rule__Binop__Group__1__Impl rule__Binop__Group__2 )
            // InternalSat.g:433:2: rule__Binop__Group__1__Impl rule__Binop__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Binop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binop__Group__2();

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
    // $ANTLR end "rule__Binop__Group__1"


    // $ANTLR start "rule__Binop__Group__1__Impl"
    // InternalSat.g:440:1: rule__Binop__Group__1__Impl : ( ( rule__Binop__LeftParamAssignment_1 ) ) ;
    public final void rule__Binop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:444:1: ( ( ( rule__Binop__LeftParamAssignment_1 ) ) )
            // InternalSat.g:445:1: ( ( rule__Binop__LeftParamAssignment_1 ) )
            {
            // InternalSat.g:445:1: ( ( rule__Binop__LeftParamAssignment_1 ) )
            // InternalSat.g:446:2: ( rule__Binop__LeftParamAssignment_1 )
            {
             before(grammarAccess.getBinopAccess().getLeftParamAssignment_1()); 
            // InternalSat.g:447:2: ( rule__Binop__LeftParamAssignment_1 )
            // InternalSat.g:447:3: rule__Binop__LeftParamAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binop__LeftParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getLeftParamAssignment_1()); 

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
    // $ANTLR end "rule__Binop__Group__1__Impl"


    // $ANTLR start "rule__Binop__Group__2"
    // InternalSat.g:455:1: rule__Binop__Group__2 : rule__Binop__Group__2__Impl rule__Binop__Group__3 ;
    public final void rule__Binop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:459:1: ( rule__Binop__Group__2__Impl rule__Binop__Group__3 )
            // InternalSat.g:460:2: rule__Binop__Group__2__Impl rule__Binop__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Binop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binop__Group__3();

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
    // $ANTLR end "rule__Binop__Group__2"


    // $ANTLR start "rule__Binop__Group__2__Impl"
    // InternalSat.g:467:1: rule__Binop__Group__2__Impl : ( ( rule__Binop__OpAssignment_2 ) ) ;
    public final void rule__Binop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:471:1: ( ( ( rule__Binop__OpAssignment_2 ) ) )
            // InternalSat.g:472:1: ( ( rule__Binop__OpAssignment_2 ) )
            {
            // InternalSat.g:472:1: ( ( rule__Binop__OpAssignment_2 ) )
            // InternalSat.g:473:2: ( rule__Binop__OpAssignment_2 )
            {
             before(grammarAccess.getBinopAccess().getOpAssignment_2()); 
            // InternalSat.g:474:2: ( rule__Binop__OpAssignment_2 )
            // InternalSat.g:474:3: rule__Binop__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binop__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getOpAssignment_2()); 

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
    // $ANTLR end "rule__Binop__Group__2__Impl"


    // $ANTLR start "rule__Binop__Group__3"
    // InternalSat.g:482:1: rule__Binop__Group__3 : rule__Binop__Group__3__Impl rule__Binop__Group__4 ;
    public final void rule__Binop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:486:1: ( rule__Binop__Group__3__Impl rule__Binop__Group__4 )
            // InternalSat.g:487:2: rule__Binop__Group__3__Impl rule__Binop__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Binop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binop__Group__4();

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
    // $ANTLR end "rule__Binop__Group__3"


    // $ANTLR start "rule__Binop__Group__3__Impl"
    // InternalSat.g:494:1: rule__Binop__Group__3__Impl : ( ( rule__Binop__RightParamAssignment_3 ) ) ;
    public final void rule__Binop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:498:1: ( ( ( rule__Binop__RightParamAssignment_3 ) ) )
            // InternalSat.g:499:1: ( ( rule__Binop__RightParamAssignment_3 ) )
            {
            // InternalSat.g:499:1: ( ( rule__Binop__RightParamAssignment_3 ) )
            // InternalSat.g:500:2: ( rule__Binop__RightParamAssignment_3 )
            {
             before(grammarAccess.getBinopAccess().getRightParamAssignment_3()); 
            // InternalSat.g:501:2: ( rule__Binop__RightParamAssignment_3 )
            // InternalSat.g:501:3: rule__Binop__RightParamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binop__RightParamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getRightParamAssignment_3()); 

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
    // $ANTLR end "rule__Binop__Group__3__Impl"


    // $ANTLR start "rule__Binop__Group__4"
    // InternalSat.g:509:1: rule__Binop__Group__4 : rule__Binop__Group__4__Impl ;
    public final void rule__Binop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:513:1: ( rule__Binop__Group__4__Impl )
            // InternalSat.g:514:2: rule__Binop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binop__Group__4__Impl();

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
    // $ANTLR end "rule__Binop__Group__4"


    // $ANTLR start "rule__Binop__Group__4__Impl"
    // InternalSat.g:520:1: rule__Binop__Group__4__Impl : ( ')' ) ;
    public final void rule__Binop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:524:1: ( ( ')' ) )
            // InternalSat.g:525:1: ( ')' )
            {
            // InternalSat.g:525:1: ( ')' )
            // InternalSat.g:526:2: ')'
            {
             before(grammarAccess.getBinopAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBinopAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Binop__Group__4__Impl"


    // $ANTLR start "rule__Expressions__ExprsAssignment_0"
    // InternalSat.g:536:1: rule__Expressions__ExprsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Expressions__ExprsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:540:1: ( ( ruleExpression ) )
            // InternalSat.g:541:2: ( ruleExpression )
            {
            // InternalSat.g:541:2: ( ruleExpression )
            // InternalSat.g:542:3: ruleExpression
            {
             before(grammarAccess.getExpressionsAccess().getExprsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionsAccess().getExprsExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expressions__ExprsAssignment_0"


    // $ANTLR start "rule__Unop__OpAssignment_0"
    // InternalSat.g:551:1: rule__Unop__OpAssignment_0 : ( ruleUnopType ) ;
    public final void rule__Unop__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:555:1: ( ( ruleUnopType ) )
            // InternalSat.g:556:2: ( ruleUnopType )
            {
            // InternalSat.g:556:2: ( ruleUnopType )
            // InternalSat.g:557:3: ruleUnopType
            {
             before(grammarAccess.getUnopAccess().getOpUnopTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnopType();

            state._fsp--;

             after(grammarAccess.getUnopAccess().getOpUnopTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Unop__OpAssignment_0"


    // $ANTLR start "rule__Unop__ParamAssignment_1"
    // InternalSat.g:566:1: rule__Unop__ParamAssignment_1 : ( ruleExpression ) ;
    public final void rule__Unop__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:570:1: ( ( ruleExpression ) )
            // InternalSat.g:571:2: ( ruleExpression )
            {
            // InternalSat.g:571:2: ( ruleExpression )
            // InternalSat.g:572:3: ruleExpression
            {
             before(grammarAccess.getUnopAccess().getParamExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUnopAccess().getParamExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Unop__ParamAssignment_1"


    // $ANTLR start "rule__Binop__LeftParamAssignment_1"
    // InternalSat.g:581:1: rule__Binop__LeftParamAssignment_1 : ( ruleExpression ) ;
    public final void rule__Binop__LeftParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:585:1: ( ( ruleExpression ) )
            // InternalSat.g:586:2: ( ruleExpression )
            {
            // InternalSat.g:586:2: ( ruleExpression )
            // InternalSat.g:587:3: ruleExpression
            {
             before(grammarAccess.getBinopAccess().getLeftParamExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinopAccess().getLeftParamExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Binop__LeftParamAssignment_1"


    // $ANTLR start "rule__Binop__OpAssignment_2"
    // InternalSat.g:596:1: rule__Binop__OpAssignment_2 : ( ruleBinopType ) ;
    public final void rule__Binop__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:600:1: ( ( ruleBinopType ) )
            // InternalSat.g:601:2: ( ruleBinopType )
            {
            // InternalSat.g:601:2: ( ruleBinopType )
            // InternalSat.g:602:3: ruleBinopType
            {
             before(grammarAccess.getBinopAccess().getOpBinopTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinopType();

            state._fsp--;

             after(grammarAccess.getBinopAccess().getOpBinopTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binop__OpAssignment_2"


    // $ANTLR start "rule__Binop__RightParamAssignment_3"
    // InternalSat.g:611:1: rule__Binop__RightParamAssignment_3 : ( ruleExpression ) ;
    public final void rule__Binop__RightParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:615:1: ( ( ruleExpression ) )
            // InternalSat.g:616:2: ( ruleExpression )
            {
            // InternalSat.g:616:2: ( ruleExpression )
            // InternalSat.g:617:3: ruleExpression
            {
             before(grammarAccess.getBinopAccess().getRightParamExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinopAccess().getRightParamExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Binop__RightParamAssignment_3"


    // $ANTLR start "rule__Atom__IdAssignment"
    // InternalSat.g:626:1: rule__Atom__IdAssignment : ( RULE_ID ) ;
    public final void rule__Atom__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSat.g:630:1: ( ( RULE_ID ) )
            // InternalSat.g:631:2: ( RULE_ID )
            {
            // InternalSat.g:631:2: ( RULE_ID )
            // InternalSat.g:632:3: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getIdIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Atom__IdAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});

}