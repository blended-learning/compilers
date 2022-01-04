grammar Expr;

@header {
package mygrammar;
}

program		: statement* EOF
		;

statement	: assignment ';'	# assignmentStatement
		| expr ';'		# exprStatement
		;

assignment	: 'let' ID '=' expr
		;

expr		: x=expr '+' y=expr	# addExpr
		| x=expr '-' y=expr	# subExpr
		| x=expr '*' y=expr	# mulExpr
		| x=expr '/' y=expr	# divExpr
		| '(' expr ')'		# parenExpr
		| value			# valueExpr
		;

value		: NUMERIC		# numericValue
		| STRING		# stringValue
		| ID			# idValue
		;


NUMERIC		: ('0' .. '9')+ ('.' ('0' .. '9')*)?
		;

STRING		: '"' ( '\\"' | ~'"' )* '"'
		;

ID		: ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
		;

COMMENT		: '/*' .*? '*/' -> skip
		;

WHITESPACE	: (' ' | '\t' | '\r' | '\n')+ -> skip
		;
