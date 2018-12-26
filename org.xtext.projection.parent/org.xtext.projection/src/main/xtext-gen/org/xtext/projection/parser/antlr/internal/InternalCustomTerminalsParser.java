package org.xtext.projection.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.projection.services.CustomTerminalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCustomTerminalsParser extends AbstractInternalAntlrParser {
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private CustomTerminalsGrammarAccess grammarAccess;

        public InternalCustomTerminalsParser(TokenStream input, CustomTerminalsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Rule";
       	}

       	@Override
       	protected CustomTerminalsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRule"
    // InternalCustomTerminals.g:70:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCustomTerminals.g:70:45: (iv_ruleRule= ruleRule EOF )
            // InternalCustomTerminals.g:71:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCustomTerminals.g:77:1: ruleRule returns [EObject current=null] : ( (lv_rules_0_0= ruleTerminal ) )* ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalCustomTerminals.g:83:2: ( ( (lv_rules_0_0= ruleTerminal ) )* )
            // InternalCustomTerminals.g:84:2: ( (lv_rules_0_0= ruleTerminal ) )*
            {
            // InternalCustomTerminals.g:84:2: ( (lv_rules_0_0= ruleTerminal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_TIME && LA1_0<=RULE_DECIMAL)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCustomTerminals.g:85:3: (lv_rules_0_0= ruleTerminal )
            	    {
            	    // InternalCustomTerminals.g:85:3: (lv_rules_0_0= ruleTerminal )
            	    // InternalCustomTerminals.g:86:4: lv_rules_0_0= ruleTerminal
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRuleAccess().getRulesTerminalParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rules_0_0=ruleTerminal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getRuleRule());
            	      				}
            	      				add(
            	      					current,
            	      					"rules",
            	      					lv_rules_0_0,
            	      					"org.xtext.projection.CustomTerminals.Terminal");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTerminal"
    // InternalCustomTerminals.g:106:1: entryRuleTerminal returns [String current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final String entryRuleTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminal = null;


        try {
            // InternalCustomTerminals.g:106:48: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalCustomTerminals.g:107:2: iv_ruleTerminal= ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalCustomTerminals.g:113:1: ruleTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TIME_0=null;
        Token this_CAMELCASE_IDENTIFIER_1=null;
        Token this_DECIMAL_2=null;


        	enterRule();

        try {
            // InternalCustomTerminals.g:119:2: ( (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL ) )
            // InternalCustomTerminals.g:120:2: (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL )
            {
            // InternalCustomTerminals.g:120:2: (this_TIME_0= RULE_TIME | this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER | this_DECIMAL_2= RULE_DECIMAL )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCustomTerminals.g:121:3: this_TIME_0= RULE_TIME
                    {
                    this_TIME_0=(Token)match(input,RULE_TIME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TIME_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TIME_0, grammarAccess.getTerminalAccess().getTIMETerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCustomTerminals.g:129:3: this_CAMELCASE_IDENTIFIER_1= RULE_CAMELCASE_IDENTIFIER
                    {
                    this_CAMELCASE_IDENTIFIER_1=(Token)match(input,RULE_CAMELCASE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CAMELCASE_IDENTIFIER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CAMELCASE_IDENTIFIER_1, grammarAccess.getTerminalAccess().getCAMELCASE_IDENTIFIERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCustomTerminals.g:137:3: this_DECIMAL_2= RULE_DECIMAL
                    {
                    this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DECIMAL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DECIMAL_2, grammarAccess.getTerminalAccess().getDECIMALTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});

}