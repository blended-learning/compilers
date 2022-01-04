grammar Calc;

@header {
package calculator;
}

program     : (statement ';')+ EOF
            ;

statement   : assign                 # assignStatement
            | expr                   # exprStatement
            ;

assign      : ID '=' expr
            ;

expr        : e1=expr '+' e2=expr     # add
            | e1=expr '*' e2=expr     # mul
            | '(' expr ')'            # paren
            | ID                      # id
            | NUM                     # num
            ;

ID          : [a-z];
NUM         : [0-9]+;
Whitespace  : [ \t\r]+ -> skip;
Comment     : '//' (~('\n'))+ '\n' -> skip;
