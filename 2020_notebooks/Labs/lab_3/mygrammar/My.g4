grammar My;

@header {
	package mygrammar;
}

startSymbol	: phrase EOF
		;

phrase		: WORD
		| '(' phrase ')'
		;

WORD		: ('a' .. 'z' | 'A' .. 'Z')+
		;

WHITESPACE 	: (' ' | '\t' | '\r' | '\n')+ -> skip
		;

