grammar My;

@header {
	package mygrammar;
}

startSymbol	: /* to be completed */
		;

phrase		: /* to be completed */
		;

WORD		: ('a' .. 'z' | 'A' .. 'Z')+
		;

WHITESPACE 	: (' ' | '\t' | '\r' | '\n')+ -> skip
		;

