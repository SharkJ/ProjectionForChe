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
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ProjectionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Element*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMyTextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMyIntParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMyDecimalParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMyIdParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMyTimeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Element:
		//	MyText | MyInt | MyDecimal | MyId | MyTime;
		@Override public ParserRule getRule() { return rule; }
		
		//MyText | MyInt | MyDecimal | MyId | MyTime
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MyText
		public RuleCall getMyTextParserRuleCall_0() { return cMyTextParserRuleCall_0; }
		
		//MyInt
		public RuleCall getMyIntParserRuleCall_1() { return cMyIntParserRuleCall_1; }
		
		//MyDecimal
		public RuleCall getMyDecimalParserRuleCall_2() { return cMyDecimalParserRuleCall_2; }
		
		//MyId
		public RuleCall getMyIdParserRuleCall_3() { return cMyIdParserRuleCall_3; }
		
		//MyTime
		public RuleCall getMyTimeParserRuleCall_4() { return cMyTimeParserRuleCall_4; }
	}
	public class MyTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.MyText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MyText:
		//	'Hi' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Hi' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'Hi'
		public Keyword getHiKeyword_0() { return cHiKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class MyIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.MyInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntegerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIntAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIntINTTerminalRuleCall_1_0 = (RuleCall)cIntAssignment_1.eContents().get(0);
		
		//MyInt:
		//	'Integer:' int=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'Integer:' int=INT
		public Group getGroup() { return cGroup; }
		
		//'Integer:'
		public Keyword getIntegerKeyword_0() { return cIntegerKeyword_0; }
		
		//int=INT
		public Assignment getIntAssignment_1() { return cIntAssignment_1; }
		
		//INT
		public RuleCall getIntINTTerminalRuleCall_1_0() { return cIntINTTerminalRuleCall_1_0; }
	}
	public class MyDecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.MyDecimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDecimalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDecAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDecDECIMALTerminalRuleCall_1_0 = (RuleCall)cDecAssignment_1.eContents().get(0);
		
		//MyDecimal:
		//	'Decimal:' dec=DECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'Decimal:' dec=DECIMAL
		public Group getGroup() { return cGroup; }
		
		//'Decimal:'
		public Keyword getDecimalKeyword_0() { return cDecimalKeyword_0; }
		
		//dec=DECIMAL
		public Assignment getDecAssignment_1() { return cDecAssignment_1; }
		
		//DECIMAL
		public RuleCall getDecDECIMALTerminalRuleCall_1_0() { return cDecDECIMALTerminalRuleCall_1_0; }
	}
	public class MyIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.MyId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//MyId:
		//	'ID:' id=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'ID:' id=ID
		public Group getGroup() { return cGroup; }
		
		//'ID:'
		public Keyword getIDKeyword_0() { return cIDKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
	}
	public class MyTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.projection.Projection.MyTime");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTimeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeTIMETerminalRuleCall_1_0 = (RuleCall)cTimeAssignment_1.eContents().get(0);
		
		//MyTime:
		//	'Time:' time=TIME;
		@Override public ParserRule getRule() { return rule; }
		
		//'Time:' time=TIME
		public Group getGroup() { return cGroup; }
		
		//'Time:'
		public Keyword getTimeKeyword_0() { return cTimeKeyword_0; }
		
		//time=TIME
		public Assignment getTimeAssignment_1() { return cTimeAssignment_1; }
		
		//TIME
		public RuleCall getTimeTIMETerminalRuleCall_1_0() { return cTimeTIMETerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final MyTextElements pMyText;
	private final MyIntElements pMyInt;
	private final MyDecimalElements pMyDecimal;
	private final MyIdElements pMyId;
	private final MyTimeElements pMyTime;
	
	private final Grammar grammar;
	
	private final CustomTerminalsGrammarAccess gaCustomTerminals;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProjectionGrammarAccess(GrammarProvider grammarProvider,
			CustomTerminalsGrammarAccess gaCustomTerminals,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCustomTerminals = gaCustomTerminals;
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pMyText = new MyTextElements();
		this.pMyInt = new MyIntElements();
		this.pMyDecimal = new MyDecimalElements();
		this.pMyId = new MyIdElements();
		this.pMyTime = new MyTimeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.projection.Projection".equals(grammar.getName())) {
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
	
	
	public CustomTerminalsGrammarAccess getCustomTerminalsGrammarAccess() {
		return gaCustomTerminals;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=Element*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element:
	//	MyText | MyInt | MyDecimal | MyId | MyTime;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//MyText:
	//	'Hi' name=STRING;
	public MyTextElements getMyTextAccess() {
		return pMyText;
	}
	
	public ParserRule getMyTextRule() {
		return getMyTextAccess().getRule();
	}
	
	//MyInt:
	//	'Integer:' int=INT;
	public MyIntElements getMyIntAccess() {
		return pMyInt;
	}
	
	public ParserRule getMyIntRule() {
		return getMyIntAccess().getRule();
	}
	
	//MyDecimal:
	//	'Decimal:' dec=DECIMAL;
	public MyDecimalElements getMyDecimalAccess() {
		return pMyDecimal;
	}
	
	public ParserRule getMyDecimalRule() {
		return getMyDecimalAccess().getRule();
	}
	
	//MyId:
	//	'ID:' id=ID;
	public MyIdElements getMyIdAccess() {
		return pMyId;
	}
	
	public ParserRule getMyIdRule() {
		return getMyIdAccess().getRule();
	}
	
	//MyTime:
	//	'Time:' time=TIME;
	public MyTimeElements getMyTimeAccess() {
		return pMyTime;
	}
	
	public ParserRule getMyTimeRule() {
		return getMyTimeAccess().getRule();
	}
	
	//Rule:
	//	rules+=Terminal*;
	public CustomTerminalsGrammarAccess.RuleElements getRuleAccess() {
		return gaCustomTerminals.getRuleAccess();
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Terminal:
	//	TIME | CAMELCASE_IDENTIFIER | DECIMAL;
	public CustomTerminalsGrammarAccess.TerminalElements getTerminalAccess() {
		return gaCustomTerminals.getTerminalAccess();
	}
	
	public ParserRule getTerminalRule() {
		return getTerminalAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaCustomTerminals.getML_COMMENTRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCustomTerminals.getSL_COMMENTRule();
	}
	
	//@Override
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaCustomTerminals.getWSRule();
	}
	
	//terminal LINE_COMMENT:
	//	'--' !('\r' | '\n')*;
	public TerminalRule getLINE_COMMENTRule() {
		return gaCustomTerminals.getLINE_COMMENTRule();
	}
	
	//terminal LINE_COMMENT2:
	//	'//' !('!' | '?' | '=' | '\r' | '\n')? !('\r' | '\n')*;
	public TerminalRule getLINE_COMMENT2Rule() {
		return gaCustomTerminals.getLINE_COMMENT2Rule();
	}
	
	//terminal ALERT_LINE_COMMENT:
	//	'//!' !('\r' | '\n')*;
	public TerminalRule getALERT_LINE_COMMENTRule() {
		return gaCustomTerminals.getALERT_LINE_COMMENTRule();
	}
	
	//terminal QUESTION_LINE_COMMENT:
	//	'//?' ('\r' | '\n')*;
	public TerminalRule getQUESTION_LINE_COMMENTRule() {
		return gaCustomTerminals.getQUESTION_LINE_COMMENTRule();
	}
	
	//terminal GOOD_LINE_COMMENT:
	//	'//=' !('\r' | '\n')*;
	public TerminalRule getGOOD_LINE_COMMENTRule() {
		return gaCustomTerminals.getGOOD_LINE_COMMENTRule();
	}
	
	//terminal REGION_COMMENT:
	//	'---' '-'+ ' ' (('A'..'Z' | '0'..'9')+ ' ')+ '-'+;
	public TerminalRule getREGION_COMMENTRule() {
		return gaCustomTerminals.getREGION_COMMENTRule();
	}
	
	//terminal TIME:
	//	'0'..'9'+ ':' '0'..'9'+;
	public TerminalRule getTIMERule() {
		return gaCustomTerminals.getTIMERule();
	}
	
	//terminal CAMELCASE_IDENTIFIER:
	//	'a'..'z' ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '$' | '#')*;
	public TerminalRule getCAMELCASE_IDENTIFIERRule() {
		return gaCustomTerminals.getCAMELCASE_IDENTIFIERRule();
	}
	
	//terminal DECIMAL:
	//	'0'..'9'+ '.' '0'..'9'+;
	public TerminalRule getDECIMALRule() {
		return gaCustomTerminals.getDECIMALRule();
	}
	
	//terminal CHARACTER:
	//	'\'' !'\'' '\'';
	public TerminalRule getCHARACTERRule() {
		return gaCustomTerminals.getCHARACTERRule();
	}
	
	//fragment QUOT:
	//	'"';
	public CustomTerminalsGrammarAccess.QUOTElements getQUOTAccess() {
		return gaCustomTerminals.getQUOTAccess();
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