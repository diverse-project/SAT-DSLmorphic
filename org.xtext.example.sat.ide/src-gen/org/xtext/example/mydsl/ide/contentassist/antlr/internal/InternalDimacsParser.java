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
import org.xtext.example.mydsl.services.DimacsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimacsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'p'", "'cnf'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDimacsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimacsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimacsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDimacs.g"; }


    	private DimacsGrammarAccess grammarAccess;

    	public void setGrammarAccess(DimacsGrammarAccess grammarAccess) {
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
    // InternalDimacs.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDimacs.g:54:1: ( ruleModel EOF )
            // InternalDimacs.g:55:1: ruleModel EOF
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
    // InternalDimacs.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDimacs.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDimacs.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDimacs.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDimacs.g:69:3: ( rule__Model__Group__0 )
            // InternalDimacs.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleLigneProbleme"
    // InternalDimacs.g:78:1: entryRuleLigneProbleme : ruleLigneProbleme EOF ;
    public final void entryRuleLigneProbleme() throws RecognitionException {
        try {
            // InternalDimacs.g:79:1: ( ruleLigneProbleme EOF )
            // InternalDimacs.g:80:1: ruleLigneProbleme EOF
            {
             before(grammarAccess.getLigneProblemeRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneProbleme();

            state._fsp--;

             after(grammarAccess.getLigneProblemeRule()); 
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
    // $ANTLR end "entryRuleLigneProbleme"


    // $ANTLR start "ruleLigneProbleme"
    // InternalDimacs.g:87:1: ruleLigneProbleme : ( ( rule__LigneProbleme__Group__0 ) ) ;
    public final void ruleLigneProbleme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:91:2: ( ( ( rule__LigneProbleme__Group__0 ) ) )
            // InternalDimacs.g:92:2: ( ( rule__LigneProbleme__Group__0 ) )
            {
            // InternalDimacs.g:92:2: ( ( rule__LigneProbleme__Group__0 ) )
            // InternalDimacs.g:93:3: ( rule__LigneProbleme__Group__0 )
            {
             before(grammarAccess.getLigneProblemeAccess().getGroup()); 
            // InternalDimacs.g:94:3: ( rule__LigneProbleme__Group__0 )
            // InternalDimacs.g:94:4: rule__LigneProbleme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getGroup()); 

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
    // $ANTLR end "ruleLigneProbleme"


    // $ANTLR start "entryRuleLigneClause"
    // InternalDimacs.g:103:1: entryRuleLigneClause : ruleLigneClause EOF ;
    public final void entryRuleLigneClause() throws RecognitionException {
        try {
            // InternalDimacs.g:104:1: ( ruleLigneClause EOF )
            // InternalDimacs.g:105:1: ruleLigneClause EOF
            {
             before(grammarAccess.getLigneClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleLigneClause();

            state._fsp--;

             after(grammarAccess.getLigneClauseRule()); 
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
    // $ANTLR end "entryRuleLigneClause"


    // $ANTLR start "ruleLigneClause"
    // InternalDimacs.g:112:1: ruleLigneClause : ( ( ( rule__LigneClause__LitterauxAssignment ) ) ( ( rule__LigneClause__LitterauxAssignment )* ) ) ;
    public final void ruleLigneClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:116:2: ( ( ( ( rule__LigneClause__LitterauxAssignment ) ) ( ( rule__LigneClause__LitterauxAssignment )* ) ) )
            // InternalDimacs.g:117:2: ( ( ( rule__LigneClause__LitterauxAssignment ) ) ( ( rule__LigneClause__LitterauxAssignment )* ) )
            {
            // InternalDimacs.g:117:2: ( ( ( rule__LigneClause__LitterauxAssignment ) ) ( ( rule__LigneClause__LitterauxAssignment )* ) )
            // InternalDimacs.g:118:3: ( ( rule__LigneClause__LitterauxAssignment ) ) ( ( rule__LigneClause__LitterauxAssignment )* )
            {
            // InternalDimacs.g:118:3: ( ( rule__LigneClause__LitterauxAssignment ) )
            // InternalDimacs.g:119:4: ( rule__LigneClause__LitterauxAssignment )
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxAssignment()); 
            // InternalDimacs.g:120:4: ( rule__LigneClause__LitterauxAssignment )
            // InternalDimacs.g:120:5: rule__LigneClause__LitterauxAssignment
            {
            pushFollow(FOLLOW_3);
            rule__LigneClause__LitterauxAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLigneClauseAccess().getLitterauxAssignment()); 

            }

            // InternalDimacs.g:123:3: ( ( rule__LigneClause__LitterauxAssignment )* )
            // InternalDimacs.g:124:4: ( rule__LigneClause__LitterauxAssignment )*
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxAssignment()); 
            // InternalDimacs.g:125:4: ( rule__LigneClause__LitterauxAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDimacs.g:125:5: rule__LigneClause__LitterauxAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LigneClause__LitterauxAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLigneClauseAccess().getLitterauxAssignment()); 

            }


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
    // $ANTLR end "ruleLigneClause"


    // $ANTLR start "entryRulelitteral"
    // InternalDimacs.g:135:1: entryRulelitteral : rulelitteral EOF ;
    public final void entryRulelitteral() throws RecognitionException {
        try {
            // InternalDimacs.g:136:1: ( rulelitteral EOF )
            // InternalDimacs.g:137:1: rulelitteral EOF
            {
             before(grammarAccess.getLitteralRule()); 
            pushFollow(FOLLOW_1);
            rulelitteral();

            state._fsp--;

             after(grammarAccess.getLitteralRule()); 
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
    // $ANTLR end "entryRulelitteral"


    // $ANTLR start "rulelitteral"
    // InternalDimacs.g:144:1: rulelitteral : ( ( rule__Litteral__ValAssignment ) ) ;
    public final void rulelitteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:148:2: ( ( ( rule__Litteral__ValAssignment ) ) )
            // InternalDimacs.g:149:2: ( ( rule__Litteral__ValAssignment ) )
            {
            // InternalDimacs.g:149:2: ( ( rule__Litteral__ValAssignment ) )
            // InternalDimacs.g:150:3: ( rule__Litteral__ValAssignment )
            {
             before(grammarAccess.getLitteralAccess().getValAssignment()); 
            // InternalDimacs.g:151:3: ( rule__Litteral__ValAssignment )
            // InternalDimacs.g:151:4: rule__Litteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Litteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLitteralAccess().getValAssignment()); 

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
    // $ANTLR end "rulelitteral"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDimacs.g:159:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:163:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDimacs.g:164:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDimacs.g:171:1: rule__Model__Group__0__Impl : ( ( rule__Model__LigneAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:175:1: ( ( ( rule__Model__LigneAssignment_0 ) ) )
            // InternalDimacs.g:176:1: ( ( rule__Model__LigneAssignment_0 ) )
            {
            // InternalDimacs.g:176:1: ( ( rule__Model__LigneAssignment_0 ) )
            // InternalDimacs.g:177:2: ( rule__Model__LigneAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getLigneAssignment_0()); 
            // InternalDimacs.g:178:2: ( rule__Model__LigneAssignment_0 )
            // InternalDimacs.g:178:3: rule__Model__LigneAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__LigneAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getLigneAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDimacs.g:186:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:190:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDimacs.g:191:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDimacs.g:198:1: rule__Model__Group__1__Impl : ( '\\n' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:202:1: ( ( '\\n' ) )
            // InternalDimacs.g:203:1: ( '\\n' )
            {
            // InternalDimacs.g:203:1: ( '\\n' )
            // InternalDimacs.g:204:2: '\\n'
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDimacs.g:213:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:217:1: ( rule__Model__Group__2__Impl )
            // InternalDimacs.g:218:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDimacs.g:224:1: rule__Model__Group__2__Impl : ( ( rule__Model__ClausesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:228:1: ( ( ( rule__Model__ClausesAssignment_2 )* ) )
            // InternalDimacs.g:229:1: ( ( rule__Model__ClausesAssignment_2 )* )
            {
            // InternalDimacs.g:229:1: ( ( rule__Model__ClausesAssignment_2 )* )
            // InternalDimacs.g:230:2: ( rule__Model__ClausesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getClausesAssignment_2()); 
            // InternalDimacs.g:231:2: ( rule__Model__ClausesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDimacs.g:231:3: rule__Model__ClausesAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ClausesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClausesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__0"
    // InternalDimacs.g:240:1: rule__LigneProbleme__Group__0 : rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1 ;
    public final void rule__LigneProbleme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:244:1: ( rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1 )
            // InternalDimacs.g:245:2: rule__LigneProbleme__Group__0__Impl rule__LigneProbleme__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LigneProbleme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__1();

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
    // $ANTLR end "rule__LigneProbleme__Group__0"


    // $ANTLR start "rule__LigneProbleme__Group__0__Impl"
    // InternalDimacs.g:252:1: rule__LigneProbleme__Group__0__Impl : ( 'p' ) ;
    public final void rule__LigneProbleme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:256:1: ( ( 'p' ) )
            // InternalDimacs.g:257:1: ( 'p' )
            {
            // InternalDimacs.g:257:1: ( 'p' )
            // InternalDimacs.g:258:2: 'p'
            {
             before(grammarAccess.getLigneProblemeAccess().getPKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getPKeyword_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__0__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__1"
    // InternalDimacs.g:267:1: rule__LigneProbleme__Group__1 : rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2 ;
    public final void rule__LigneProbleme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:271:1: ( rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2 )
            // InternalDimacs.g:272:2: rule__LigneProbleme__Group__1__Impl rule__LigneProbleme__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LigneProbleme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__2();

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
    // $ANTLR end "rule__LigneProbleme__Group__1"


    // $ANTLR start "rule__LigneProbleme__Group__1__Impl"
    // InternalDimacs.g:279:1: rule__LigneProbleme__Group__1__Impl : ( 'cnf' ) ;
    public final void rule__LigneProbleme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:283:1: ( ( 'cnf' ) )
            // InternalDimacs.g:284:1: ( 'cnf' )
            {
            // InternalDimacs.g:284:1: ( 'cnf' )
            // InternalDimacs.g:285:2: 'cnf'
            {
             before(grammarAccess.getLigneProblemeAccess().getCnfKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getCnfKeyword_1()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__1__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__2"
    // InternalDimacs.g:294:1: rule__LigneProbleme__Group__2 : rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3 ;
    public final void rule__LigneProbleme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:298:1: ( rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3 )
            // InternalDimacs.g:299:2: rule__LigneProbleme__Group__2__Impl rule__LigneProbleme__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LigneProbleme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__3();

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
    // $ANTLR end "rule__LigneProbleme__Group__2"


    // $ANTLR start "rule__LigneProbleme__Group__2__Impl"
    // InternalDimacs.g:306:1: rule__LigneProbleme__Group__2__Impl : ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) ) ;
    public final void rule__LigneProbleme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:310:1: ( ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) ) )
            // InternalDimacs.g:311:1: ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) )
            {
            // InternalDimacs.g:311:1: ( ( rule__LigneProbleme__Nb_variablesAssignment_2 ) )
            // InternalDimacs.g:312:2: ( rule__LigneProbleme__Nb_variablesAssignment_2 )
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_variablesAssignment_2()); 
            // InternalDimacs.g:313:2: ( rule__LigneProbleme__Nb_variablesAssignment_2 )
            // InternalDimacs.g:313:3: rule__LigneProbleme__Nb_variablesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Nb_variablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getNb_variablesAssignment_2()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__2__Impl"


    // $ANTLR start "rule__LigneProbleme__Group__3"
    // InternalDimacs.g:321:1: rule__LigneProbleme__Group__3 : rule__LigneProbleme__Group__3__Impl ;
    public final void rule__LigneProbleme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:325:1: ( rule__LigneProbleme__Group__3__Impl )
            // InternalDimacs.g:326:2: rule__LigneProbleme__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Group__3__Impl();

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
    // $ANTLR end "rule__LigneProbleme__Group__3"


    // $ANTLR start "rule__LigneProbleme__Group__3__Impl"
    // InternalDimacs.g:332:1: rule__LigneProbleme__Group__3__Impl : ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) ) ;
    public final void rule__LigneProbleme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:336:1: ( ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) ) )
            // InternalDimacs.g:337:1: ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) )
            {
            // InternalDimacs.g:337:1: ( ( rule__LigneProbleme__Nb_clausesAssignment_3 ) )
            // InternalDimacs.g:338:2: ( rule__LigneProbleme__Nb_clausesAssignment_3 )
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_clausesAssignment_3()); 
            // InternalDimacs.g:339:2: ( rule__LigneProbleme__Nb_clausesAssignment_3 )
            // InternalDimacs.g:339:3: rule__LigneProbleme__Nb_clausesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LigneProbleme__Nb_clausesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLigneProblemeAccess().getNb_clausesAssignment_3()); 

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
    // $ANTLR end "rule__LigneProbleme__Group__3__Impl"


    // $ANTLR start "rule__Model__LigneAssignment_0"
    // InternalDimacs.g:348:1: rule__Model__LigneAssignment_0 : ( ruleLigneProbleme ) ;
    public final void rule__Model__LigneAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:352:1: ( ( ruleLigneProbleme ) )
            // InternalDimacs.g:353:2: ( ruleLigneProbleme )
            {
            // InternalDimacs.g:353:2: ( ruleLigneProbleme )
            // InternalDimacs.g:354:3: ruleLigneProbleme
            {
             before(grammarAccess.getModelAccess().getLigneLigneProblemeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneProbleme();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLigneLigneProblemeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__LigneAssignment_0"


    // $ANTLR start "rule__Model__ClausesAssignment_2"
    // InternalDimacs.g:363:1: rule__Model__ClausesAssignment_2 : ( ruleLigneClause ) ;
    public final void rule__Model__ClausesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:367:1: ( ( ruleLigneClause ) )
            // InternalDimacs.g:368:2: ( ruleLigneClause )
            {
            // InternalDimacs.g:368:2: ( ruleLigneClause )
            // InternalDimacs.g:369:3: ruleLigneClause
            {
             before(grammarAccess.getModelAccess().getClausesLigneClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLigneClause();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClausesLigneClauseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ClausesAssignment_2"


    // $ANTLR start "rule__LigneProbleme__Nb_variablesAssignment_2"
    // InternalDimacs.g:378:1: rule__LigneProbleme__Nb_variablesAssignment_2 : ( RULE_INT ) ;
    public final void rule__LigneProbleme__Nb_variablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:382:1: ( ( RULE_INT ) )
            // InternalDimacs.g:383:2: ( RULE_INT )
            {
            // InternalDimacs.g:383:2: ( RULE_INT )
            // InternalDimacs.g:384:3: RULE_INT
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_variablesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getNb_variablesINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Nb_variablesAssignment_2"


    // $ANTLR start "rule__LigneProbleme__Nb_clausesAssignment_3"
    // InternalDimacs.g:393:1: rule__LigneProbleme__Nb_clausesAssignment_3 : ( RULE_INT ) ;
    public final void rule__LigneProbleme__Nb_clausesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:397:1: ( ( RULE_INT ) )
            // InternalDimacs.g:398:2: ( RULE_INT )
            {
            // InternalDimacs.g:398:2: ( RULE_INT )
            // InternalDimacs.g:399:3: RULE_INT
            {
             before(grammarAccess.getLigneProblemeAccess().getNb_clausesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLigneProblemeAccess().getNb_clausesINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__LigneProbleme__Nb_clausesAssignment_3"


    // $ANTLR start "rule__LigneClause__LitterauxAssignment"
    // InternalDimacs.g:408:1: rule__LigneClause__LitterauxAssignment : ( rulelitteral ) ;
    public final void rule__LigneClause__LitterauxAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:412:1: ( ( rulelitteral ) )
            // InternalDimacs.g:413:2: ( rulelitteral )
            {
            // InternalDimacs.g:413:2: ( rulelitteral )
            // InternalDimacs.g:414:3: rulelitteral
            {
             before(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulelitteral();

            state._fsp--;

             after(grammarAccess.getLigneClauseAccess().getLitterauxLitteralParserRuleCall_0()); 

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
    // $ANTLR end "rule__LigneClause__LitterauxAssignment"


    // $ANTLR start "rule__Litteral__ValAssignment"
    // InternalDimacs.g:423:1: rule__Litteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__Litteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDimacs.g:427:1: ( ( RULE_INT ) )
            // InternalDimacs.g:428:2: ( RULE_INT )
            {
            // InternalDimacs.g:428:2: ( RULE_INT )
            // InternalDimacs.g:429:3: RULE_INT
            {
             before(grammarAccess.getLitteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLitteralAccess().getValINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Litteral__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}