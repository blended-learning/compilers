grammar Expr;

@header {
package mygrammar;
}

program		: statement* EOF
		;

statement	: assignment ';'
		| expr ';'
		;

assignment	: 'let' ID '=' expr
		;

expr		: expr '+'  expr
		| expr '-' expr
		| expr '*'  expr
		| expr '/' expr
		| '(' expr ')'
		| value
		| funCall
		;

value		: NUMERIC
		| STRING
		| ID
		;

funCall		: ID '(' argList ')'
		;

argList		:
		| expr (',' expr)*
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
