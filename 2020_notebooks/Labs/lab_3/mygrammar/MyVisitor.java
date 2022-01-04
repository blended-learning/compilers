// Generated from mygrammar/My.g4 by ANTLR 4.9.1

	package mygrammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#startSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSymbol(MyParser.StartSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(MyParser.PhraseContext ctx);
}