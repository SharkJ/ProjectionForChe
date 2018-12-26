/*
 * generated by Xtext 2.15.0
 */
package org.xtext.projection.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CustomTerminalsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.Rule");
		private final Assignment cRulesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRulesTerminalParserRuleCall_0 = (RuleCall)cRulesAssignment.eContents().get(0);
		
		//Rule:
		//	rules+=Terminal*;
		@Override public ParserRule getRule() { return rule; }
		
		//rules+=Terminal*
		public Assignment getRulesAssignment() { return cRulesAssignment; }
		
		//Terminal
		public RuleCall getRulesTerminalParserRuleCall_0() { return cRulesTerminalParserRuleCall_0; }
	}
	public class TerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.Terminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTIMETerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCAMELCASE_IDENTIFIERTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDECIMALTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Terminal:
		//	TIME | CAMELCASE_IDENTIFIER | DECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//TIME | CAMELCASE_IDENTIFIER | DECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TIME
		public RuleCall getTIMETerminalRuleCall_0() { return cTIMETerminalRuleCall_0; }
		
		//CAMELCASE_IDENTIFIER
		public RuleCall getCAMELCASE_IDENTIFIERTerminalRuleCall_1() { return cCAMELCASE_IDENTIFIERTerminalRuleCall_1; }
		
		//DECIMAL
		public RuleCall getDECIMALTerminalRuleCall_2() { return cDECIMALTerminalRuleCall_2; }
	}
	public class QUOTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.QUOT");
		private final Keyword cQuotationMarkKeyword = (Keyword)rule.eContents().get(1);
		
		//fragment QUOT:
		//	'"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"'
		public Keyword getQuotationMarkKeyword() { return cQuotationMarkKeyword; }
	}
	
	
	private final RuleElements pRule;
	private final TerminalElements pTerminal;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tLINE_COMMENT;
	private final TerminalRule tLINE_COMMENT2;
	private final TerminalRule tALERT_LINE_COMMENT;
	private final TerminalRule tQUESTION_LINE_COMMENT;
	private final TerminalRule tGOOD_LINE_COMMENT;
	private final TerminalRule tREGION_COMMENT;
	private final TerminalRule tTIME;
	private final TerminalRule tCAMELCASE_IDENTIFIER;
	private final TerminalRule tDECIMAL;
	private final TerminalRule tCHARACTER;
	private final QUOTElements pQUOT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CustomTerminalsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRule = new RuleElements();
		this.pTerminal = new TerminalElements();
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.WS");
		this.tLINE_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.LINE_COMMENT");
		this.tLINE_COMMENT2 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.LINE_COMMENT2");
		this.tALERT_LINE_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.ALERT_LINE_COMMENT");
		this.tQUESTION_LINE_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.QUESTION_LINE_COMMENT");
		this.tGOOD_LINE_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.GOOD_LINE_COMMENT");
		this.tREGION_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.REGION_COMMENT");
		this.tTIME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.TIME");
		this.tCAMELCASE_IDENTIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.CAMELCASE_IDENTIFIER");
		this.tDECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.DECIMAL");
		this.tCHARACTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.CustomTerminals.CHARACTER");
		this.pQUOT = new QUOTElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.projection.CustomTerminals".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Rule:
	//	rules+=Terminal*;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Terminal:
	//	TIME | CAMELCASE_IDENTIFIER | DECIMAL;
	public TerminalElements getTerminalAccess() {
		return pTerminal;
	}
	
	public ParserRule getTerminalRule() {
		return getTerminalAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//@Override
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal LINE_COMMENT:
	//	'--' !('\r' | '\n')*;
	public TerminalRule getLINE_COMMENTRule() {
		return tLINE_COMMENT;
	}
	
	//terminal LINE_COMMENT2:
	//	'//' !('!' | '?' | '=' | '\r' | '\n')? !('\r' | '\n')*;
	public TerminalRule getLINE_COMMENT2Rule() {
		return tLINE_COMMENT2;
	}
	
	//terminal ALERT_LINE_COMMENT:
	//	'//!' !('\r' | '\n')*;
	public TerminalRule getALERT_LINE_COMMENTRule() {
		return tALERT_LINE_COMMENT;
	}
	
	//terminal QUESTION_LINE_COMMENT:
	//	'//?' ('\r' | '\n')*;
	public TerminalRule getQUESTION_LINE_COMMENTRule() {
		return tQUESTION_LINE_COMMENT;
	}
	
	//terminal GOOD_LINE_COMMENT:
	//	'//=' !('\r' | '\n')*;
	public TerminalRule getGOOD_LINE_COMMENTRule() {
		return tGOOD_LINE_COMMENT;
	}
	
	//terminal REGION_COMMENT:
	//	'---' '-'+ ' ' (('A'..'Z' | '0'..'9')+ ' ')+ '-'+;
	public TerminalRule getREGION_COMMENTRule() {
		return tREGION_COMMENT;
	}
	
	//terminal TIME:
	//	'0'..'9'+ ':' '0'..'9'+;
	public TerminalRule getTIMERule() {
		return tTIME;
	}
	
	//terminal CAMELCASE_IDENTIFIER:
	//	'a'..'z' ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '$' | '#')*;
	public TerminalRule getCAMELCASE_IDENTIFIERRule() {
		return tCAMELCASE_IDENTIFIER;
	}
	
	//terminal DECIMAL:
	//	'0'..'9'+ '.' '0'..'9'+;
	public TerminalRule getDECIMALRule() {
		return tDECIMAL;
	}
	
	//terminal CHARACTER:
	//	'\'' !'\'' '\'';
	public TerminalRule getCHARACTERRule() {
		return tCHARACTER;
	}
	
	//fragment QUOT:
	//	'"';
	public QUOTElements getQUOTAccess() {
		return pQUOT;
	}
	
	public ParserRule getQUOTRule() {
		return getQUOTAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}