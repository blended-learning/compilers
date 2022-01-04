// Generated from mygrammar/My.g4 by ANTLR 4.9.1

	package mygrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#startSymbol}.
	 * @param ctx the parse tree
	 */
	void enterStartSymbol(MyParser.StartSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#startSymbol}.
	 * @param ctx the parse tree
	 */
	void exitStartSymbol(MyParser.StartSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(MyParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(MyParser.PhraseContext ctx);
}