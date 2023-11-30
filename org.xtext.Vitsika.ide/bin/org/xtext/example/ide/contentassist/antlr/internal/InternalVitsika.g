/*
 * generated by Xtext 2.32.0
 */
grammar InternalVitsika;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.VitsikaGrammarAccess;

}
@parser::members {
	private VitsikaGrammarAccess grammarAccess;

	public void setGrammarAccess(VitsikaGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getTaskAssignment()); }
		(rule__Model__TaskAssignment)
		{ after(grammarAccess.getModelAccess().getTaskAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtaovyTask
entryRuleAtaovyTask
:
{ before(grammarAccess.getAtaovyTaskRule()); }
	 ruleAtaovyTask
{ after(grammarAccess.getAtaovyTaskRule()); } 
	 EOF 
;

// Rule AtaovyTask
ruleAtaovyTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtaovyTaskAccess().getGroup()); }
		(rule__AtaovyTask__Group__0)
		{ after(grammarAccess.getAtaovyTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClickAction
entryRuleClickAction
:
{ before(grammarAccess.getClickActionRule()); }
	 ruleClickAction
{ after(grammarAccess.getClickActionRule()); } 
	 EOF 
;

// Rule ClickAction
ruleClickAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClickActionAccess().getGroup()); }
		(rule__ClickAction__Group__0)
		{ after(grammarAccess.getClickActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveAction
entryRuleMoveAction
:
{ before(grammarAccess.getMoveActionRule()); }
	 ruleMoveAction
{ after(grammarAccess.getMoveActionRule()); } 
	 EOF 
;

// Rule MoveAction
ruleMoveAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveActionAccess().getGroup()); }
		(rule__MoveAction__Group__0)
		{ after(grammarAccess.getMoveActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWaitAction
entryRuleWaitAction
:
{ before(grammarAccess.getWaitActionRule()); }
	 ruleWaitAction
{ after(grammarAccess.getWaitActionRule()); } 
	 EOF 
;

// Rule WaitAction
ruleWaitAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWaitActionAccess().getGroup()); }
		(rule__WaitAction__Group__0)
		{ after(grammarAccess.getWaitActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpenApplicationAction
entryRuleOpenApplicationAction
:
{ before(grammarAccess.getOpenApplicationActionRule()); }
	 ruleOpenApplicationAction
{ after(grammarAccess.getOpenApplicationActionRule()); } 
	 EOF 
;

// Rule OpenApplicationAction
ruleOpenApplicationAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpenApplicationActionAccess().getGroup()); }
		(rule__OpenApplicationAction__Group__0)
		{ after(grammarAccess.getOpenApplicationActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMaty
entryRuleMaty
:
{ before(grammarAccess.getMatyRule()); }
	 ruleMaty
{ after(grammarAccess.getMatyRule()); } 
	 EOF 
;

// Rule Maty
ruleMaty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMatyAccess().getGroup()); }
		(rule__Maty__Group__0)
		{ after(grammarAccess.getMatyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSurfer
entryRuleSurfer
:
{ before(grammarAccess.getSurferRule()); }
	 ruleSurfer
{ after(grammarAccess.getSurferRule()); } 
	 EOF 
;

// Rule Surfer
ruleSurfer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSurferAccess().getGroup()); }
		(rule__Surfer__Group__0)
		{ after(grammarAccess.getSurferAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWifiCreate
entryRuleWifiCreate
:
{ before(grammarAccess.getWifiCreateRule()); }
	 ruleWifiCreate
{ after(grammarAccess.getWifiCreateRule()); } 
	 EOF 
;

// Rule WifiCreate
ruleWifiCreate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWifiCreateAccess().getGroup()); }
		(rule__WifiCreate__Group__0)
		{ after(grammarAccess.getWifiCreateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypewrite
entryRuleTypewrite
:
{ before(grammarAccess.getTypewriteRule()); }
	 ruleTypewrite
{ after(grammarAccess.getTypewriteRule()); } 
	 EOF 
;

// Rule Typewrite
ruleTypewrite 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypewriteAccess().getGroup()); }
		(rule__Typewrite__Group__0)
		{ after(grammarAccess.getTypewriteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWordTypingAuto
entryRuleWordTypingAuto
:
{ before(grammarAccess.getWordTypingAutoRule()); }
	 ruleWordTypingAuto
{ after(grammarAccess.getWordTypingAutoRule()); } 
	 EOF 
;

// Rule WordTypingAuto
ruleWordTypingAuto 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWordTypingAutoAccess().getGroup()); }
		(rule__WordTypingAuto__Group__0)
		{ after(grammarAccess.getWordTypingAutoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getClickActionParserRuleCall_0()); }
		ruleClickAction
		{ after(grammarAccess.getActionAccess().getClickActionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getMoveActionParserRuleCall_1()); }
		ruleMoveAction
		{ after(grammarAccess.getActionAccess().getMoveActionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getWaitActionParserRuleCall_2()); }
		ruleWaitAction
		{ after(grammarAccess.getActionAccess().getWaitActionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getOpenApplicationActionParserRuleCall_3()); }
		ruleOpenApplicationAction
		{ after(grammarAccess.getActionAccess().getOpenApplicationActionParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getMatyParserRuleCall_4()); }
		ruleMaty
		{ after(grammarAccess.getActionAccess().getMatyParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getSurferParserRuleCall_5()); }
		ruleSurfer
		{ after(grammarAccess.getActionAccess().getSurferParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getWifiCreateParserRuleCall_6()); }
		ruleWifiCreate
		{ after(grammarAccess.getActionAccess().getWifiCreateParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getTypewriteParserRuleCall_7()); }
		ruleTypewrite
		{ after(grammarAccess.getActionAccess().getTypewriteParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getWordTypingAutoParserRuleCall_8()); }
		ruleWordTypingAuto
		{ after(grammarAccess.getActionAccess().getWordTypingAutoParserRuleCall_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__UnitAlternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWaitActionAccess().getUnitSKeyword_3_0_0()); }
		's'
		{ after(grammarAccess.getWaitActionAccess().getUnitSKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getWaitActionAccess().getUnitMKeyword_3_0_1()); }
		'm'
		{ after(grammarAccess.getWaitActionAccess().getUnitMKeyword_3_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getWaitActionAccess().getUnitHKeyword_3_0_2()); }
		'h'
		{ after(grammarAccess.getWaitActionAccess().getUnitHKeyword_3_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group__0__Impl
	rule__AtaovyTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getAtaovyKeyword_0()); }
	'Ataovy'
	{ after(grammarAccess.getAtaovyTaskAccess().getAtaovyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group__1__Impl
	rule__AtaovyTask__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getAtaovyTaskAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group__2__Impl
	rule__AtaovyTask__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getActionsAssignment_2()); }
	(rule__AtaovyTask__ActionsAssignment_2)
	{ after(grammarAccess.getAtaovyTaskAccess().getActionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group__3__Impl
	rule__AtaovyTask__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getGroup_3()); }
	(rule__AtaovyTask__Group_3__0)*
	{ after(grammarAccess.getAtaovyTaskAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getAtaovyTaskAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtaovyTask__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group_3__0__Impl
	rule__AtaovyTask__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getAtaovyTaskAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtaovyTask__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtaovyTaskAccess().getActionsAssignment_3_1()); }
	(rule__AtaovyTask__ActionsAssignment_3_1)
	{ after(grammarAccess.getAtaovyTaskAccess().getActionsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClickAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickAction__Group__0__Impl
	rule__ClickAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickActionAccess().getTsindrioKeyword_0()); }
	'tsindrio'
	{ after(grammarAccess.getClickActionAccess().getTsindrioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickAction__Group__1__Impl
	rule__ClickAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getClickActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickAction__Group__2__Impl
	rule__ClickAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickActionAccess().getKeyAssignment_2()); }
	(rule__ClickAction__KeyAssignment_2)
	{ after(grammarAccess.getClickActionAccess().getKeyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClickAction__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClickActionAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getClickActionAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__0__Impl
	rule__MoveAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getMikisakaKeyword_0()); }
	'mikisaka'
	{ after(grammarAccess.getMoveActionAccess().getMikisakaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__1__Impl
	rule__MoveAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getMoveActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__2__Impl
	rule__MoveAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getXAssignment_2()); }
	(rule__MoveAction__XAssignment_2)
	{ after(grammarAccess.getMoveActionAccess().getXAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__3__Impl
	rule__MoveAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getMoveActionAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__4__Impl
	rule__MoveAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getYAssignment_4()); }
	(rule__MoveAction__YAssignment_4)
	{ after(grammarAccess.getMoveActionAccess().getYAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveAction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveActionAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getMoveActionAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WaitAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WaitAction__Group__0__Impl
	rule__WaitAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWaitActionAccess().getMiandryKeyword_0()); }
	'miandry'
	{ after(grammarAccess.getWaitActionAccess().getMiandryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WaitAction__Group__1__Impl
	rule__WaitAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWaitActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getWaitActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WaitAction__Group__2__Impl
	rule__WaitAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWaitActionAccess().getDurationAssignment_2()); }
	(rule__WaitAction__DurationAssignment_2)
	{ after(grammarAccess.getWaitActionAccess().getDurationAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WaitAction__Group__3__Impl
	rule__WaitAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWaitActionAccess().getUnitAssignment_3()); }
	(rule__WaitAction__UnitAssignment_3)
	{ after(grammarAccess.getWaitActionAccess().getUnitAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WaitAction__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWaitActionAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getWaitActionAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpenApplicationAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group__0__Impl
	rule__OpenApplicationAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getSokafyKeyword_0()); }
	'sokafy'
	{ after(grammarAccess.getOpenApplicationActionAccess().getSokafyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group__1__Impl
	rule__OpenApplicationAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getOpenApplicationActionAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group__2__Impl
	rule__OpenApplicationAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getApplicationsAssignment_2()); }
	(rule__OpenApplicationAction__ApplicationsAssignment_2)
	{ after(grammarAccess.getOpenApplicationActionAccess().getApplicationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getGroup_3()); }
	(rule__OpenApplicationAction__Group_3__0)*
	{ after(grammarAccess.getOpenApplicationActionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpenApplicationAction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group_3__0__Impl
	rule__OpenApplicationAction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getOpenApplicationActionAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpenApplicationAction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpenApplicationActionAccess().getApplicationsAssignment_3_1()); }
	(rule__OpenApplicationAction__ApplicationsAssignment_3_1)
	{ after(grammarAccess.getOpenApplicationActionAccess().getApplicationsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Maty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Maty__Group__0__Impl
	rule__Maty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMatyAccess().getVonoyKeyword_0()); }
	'vonoy'
	{ after(grammarAccess.getMatyAccess().getVonoyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Maty__Group__1__Impl
	rule__Maty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMatyAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getMatyAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Maty__Group__2__Impl
	rule__Maty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMatyAccess().getProcAssignment_2()); }
	(rule__Maty__ProcAssignment_2)
	{ after(grammarAccess.getMatyAccess().getProcAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Maty__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMatyAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getMatyAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Surfer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Surfer__Group__0__Impl
	rule__Surfer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSurferAccess().getTranokalaKeyword_0()); }
	'Tranokala'
	{ after(grammarAccess.getSurferAccess().getTranokalaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Surfer__Group__1__Impl
	rule__Surfer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSurferAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSurferAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Surfer__Group__2__Impl
	rule__Surfer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSurferAccess().getUrlAssignment_2()); }
	(rule__Surfer__UrlAssignment_2)
	{ after(grammarAccess.getSurferAccess().getUrlAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Surfer__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSurferAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getSurferAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WifiCreate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__0__Impl
	rule__WifiCreate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getManokatraWifiKeyword_0()); }
	'manokatraWifi'
	{ after(grammarAccess.getWifiCreateAccess().getManokatraWifiKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__1__Impl
	rule__WifiCreate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getWifiCreateAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__2__Impl
	rule__WifiCreate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getSsidAssignment_2()); }
	(rule__WifiCreate__SsidAssignment_2)
	{ after(grammarAccess.getWifiCreateAccess().getSsidAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__3__Impl
	rule__WifiCreate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getWifiCreateAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__4__Impl
	rule__WifiCreate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getPasswdAssignment_4()); }
	(rule__WifiCreate__PasswdAssignment_4)
	{ after(grammarAccess.getWifiCreateAccess().getPasswdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WifiCreate__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWifiCreateAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getWifiCreateAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Typewrite__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typewrite__Group__0__Impl
	rule__Typewrite__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypewriteAccess().getSoratyKeyword_0()); }
	'Soraty'
	{ after(grammarAccess.getTypewriteAccess().getSoratyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typewrite__Group__1__Impl
	rule__Typewrite__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypewriteAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getTypewriteAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Typewrite__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypewriteAccess().getSoratraAssignment_2()); }
	(rule__Typewrite__SoratraAssignment_2)
	{ after(grammarAccess.getTypewriteAccess().getSoratraAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WordTypingAuto__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WordTypingAuto__Group__0__Impl
	rule__WordTypingAuto__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWordTypingAutoAccess().getManoratra_wordKeyword_0()); }
	'manoratra_word'
	{ after(grammarAccess.getWordTypingAutoAccess().getManoratra_wordKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WordTypingAuto__Group__1__Impl
	rule__WordTypingAuto__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWordTypingAutoAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getWordTypingAutoAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WordTypingAuto__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWordTypingAutoAccess().getTenyAssignment_2()); }
	(rule__WordTypingAuto__TenyAssignment_2)
	{ after(grammarAccess.getWordTypingAutoAccess().getTenyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__TaskAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getTaskAtaovyTaskParserRuleCall_0()); }
		ruleAtaovyTask
		{ after(grammarAccess.getModelAccess().getTaskAtaovyTaskParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__ActionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_2_0()); }
		ruleAction
		{ after(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtaovyTask__ActionsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_3_1_0()); }
		ruleAction
		{ after(grammarAccess.getAtaovyTaskAccess().getActionsActionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClickAction__KeyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClickActionAccess().getKeySTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getClickActionAccess().getKeySTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__XAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveActionAccess().getXINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveActionAccess().getXINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveAction__YAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveActionAccess().getYINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveActionAccess().getYINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__DurationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWaitActionAccess().getDurationINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getWaitActionAccess().getDurationINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WaitAction__UnitAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWaitActionAccess().getUnitAlternatives_3_0()); }
		(rule__WaitAction__UnitAlternatives_3_0)
		{ after(grammarAccess.getWaitActionAccess().getUnitAlternatives_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__ApplicationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpenApplicationAction__ApplicationsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getOpenApplicationActionAccess().getApplicationsIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Maty__ProcAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMatyAccess().getProcSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getMatyAccess().getProcSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Surfer__UrlAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSurferAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getSurferAccess().getUrlSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__SsidAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWifiCreateAccess().getSsidSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getWifiCreateAccess().getSsidSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WifiCreate__PasswdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWifiCreateAccess().getPasswdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getWifiCreateAccess().getPasswdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Typewrite__SoratraAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypewriteAccess().getSoratraSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypewriteAccess().getSoratraSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WordTypingAuto__TenyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWordTypingAutoAccess().getTenySTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getWordTypingAutoAccess().getTenySTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
