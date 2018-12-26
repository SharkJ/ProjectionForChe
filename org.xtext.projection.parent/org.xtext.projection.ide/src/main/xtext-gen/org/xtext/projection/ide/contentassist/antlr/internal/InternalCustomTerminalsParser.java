package org.xtext.projection.ide.contentassist.antlr.internal;

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
import org.xtext.projection.services.CustomTerminalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCustomTerminalsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TIME", "RULE_CAMELCASE_IDENTIFIER", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_LINE_COMMENT", "RULE_LINE_COMMENT2", "RULE_ALERT_LINE_COMMENT", "RULE_QUESTION_LINE_COMMENT", "RULE_GOOD_LINE_COMMENT", "RULE_REGION_COMMENT", "RULE_CHARACTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER"
    };
    public static final int RULE_CHARACTER=16;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_QUESTION_LINE_COMMENT=13;
    public static final int RULE_GOOD_LINE_COMMENT=14;
    public static final int RULE_TIME=4;
    public static final int EOF=-1;
    public static final int RULE_REGION_COMMENT=15;
    public static final int RULE_CAMELCASE_IDENTIFIER=5;
    public static final int RULE_ID=17;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_LINE_COMMENT2=11;
    public static final int RULE_ALERT_LINE_COMMENT=12;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_LINE_COMMENT=10;

    // delegates
    // delegators


        public InternalCustomTerminalsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCustomTerminalsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCustomTerminalsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCustomTerminals.g"; }


    	private CustomTerminalsGrammarAccess grammarAccess;

    	public void setGrammarAccess(CustomTerminalsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRule"
    // InternalCustomTerminals.g:54:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalCustomTerminals.g:55:1: ( ruleRule EOF )
            // InternalCustomTerminals.g:56:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCustomTerminals.g:63:1: ruleRule : ( ( rule__Rule__RulesAssignment )* ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCustomTerminals.g:67:2: ( ( ( rule__Rule__RulesAssignment )* ) )
            // InternalCustomTerminals.g:68:2: ( ( rule__Rule__RulesAssignment )* )
            {
            // InternalCustomTerminals.g:68:2: ( ( rule__Rule__RulesAssignment )* )
            // InternalCustomTerminals.g:69:3: ( rule__Rule__RulesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRulesAssignment()); 
            }
            // InternalCustomTerminals.g:70:3: ( rule__Rule__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_TIME && LA1_0<=RULE_DECIMAL)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCustomTerminals.g:70:4: rule__Rule__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Rule__RulesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRulesAssignment()); 
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTerminal"
    // InternalCustomTerminals.g:79:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalCustomTerminals.g:80:1: ( ruleTerminal EOF )
            // InternalCustomTerminals.g:81:1: ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalCustomTerminals.g:88:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCustomTerminals.g:92:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // InternalCustomTerminals.g:93:2: ( ( rule__Terminal__Alternatives ) )
            {
            // InternalCustomTerminals.g:93:2: ( ( rule__Terminal__Alternatives ) )
            // InternalCustomTerminals.g:94:3: ( rule__Terminal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getAlternatives()); 
            }
            // InternalCustomTerminals.g:95:3: ( rule__Terminal__Alternatives )
            // InternalCustomTerminals.g:95:4: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "rule__Terminal__Alternatives"
    // InternalCustomTerminals.g:103:1: rule__Terminal__Alternatives : ( ( RULE_TIME ) | ( RULE_CAMELCASE_IDENTIFIER ) | ( RULE_DECIMAL ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCustomTerminals.g:107:1: ( ( RULE_TIME ) | ( RULE_CAMELCASE_IDENTIFIER ) | ( RULE_DECIMAL ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_TIME:
                {
                alt2=1;
                }
                break;
            case RULE_CAMELCASE_IDENTIFIER:
                {
                alt2=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCustomTerminals.g:108:2: ( RULE_TIME )
                    {
                    // InternalCustomTerminals.g:108:2: ( RULE_TIME )
                    // InternalCustomTerminals.g:109:3: RULE_TIME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0()); 
                    }
                    match(input,RULE_TIME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCustomTerminals.g:114:2: ( RULE_CAMELCASE_IDENTIFIER )
                    {
                    // InternalCustomTerminals.g:114:2: ( RULE_CAMELCASE_IDENTIFIER )
                    // InternalCustomTerminals.g:115:3: RULE_CAMELCASE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CAMELCASE_IDENTIFIER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCustomTerminals.g:120:2: ( RULE_DECIMAL )
                    {
                    // InternalCustomTerminals.g:120:2: ( RULE_DECIMAL )
                    // InternalCustomTerminals.g:121:3: RULE_DECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2()); 
                    }
                    match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__Rule__RulesAssignment"
    // InternalCustomTerminals.g:130:1: rule__Rule__RulesAssignment : ( ruleTerminal ) ;
    public final void rule__Rule__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCustomTerminals.g:134:1: ( ( ruleTerminal ) )
            // InternalCustomTerminals.g:135:2: ( ruleTerminal )
            {
            // InternalCustomTerminals.g:135:2: ( ruleTerminal )
            // InternalCustomTerminals.g:136:3: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRulesTerminalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRulesTerminalParserRuleCall_0()); 
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
    // $ANTLR end "rule__Rule__RulesAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});

}