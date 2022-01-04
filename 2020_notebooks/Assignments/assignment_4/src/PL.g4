grammar PL;

@header {
package mygrammar;
}

/* =============================
   COMPLETE THE FOLLOWING GRAMMAR
   ============================= */

program		: 	ID
		;


ID		: ('a' .. 'z')+ ;

Whitespace	: [ \t\r\n]+ -> skip;
