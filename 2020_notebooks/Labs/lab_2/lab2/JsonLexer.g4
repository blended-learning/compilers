lexer grammar JsonLexer;

@header {
	package lab2;
}

OpenBrace: '{';
CloseBrace: '}';
OpenSquare: '[';
CloseSquare: ']';
SemiColon: ';';
Colon: ':';
Comma: ',';
String: '"' ~('"')+ '"';
Number: ( '0' .. '9' )+;
Whitespace: [ \t\r\n]+ -> skip;
