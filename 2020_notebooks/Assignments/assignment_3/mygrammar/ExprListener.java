// Generated from mygrammar/Expr.g4 by ANTLR 4.9.1

package mygrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ExprParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ExprParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(ExprParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(ExprParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(ExprParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(ExprParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(ExprParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(ExprParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(ExprParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(ExprParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ExprParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ExprParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumericValue(ExprParser.NumericValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumericValue(ExprParser.NumericValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(ExprParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(ExprParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(ExprParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(ExprParser.IdValueContext ctx);
}