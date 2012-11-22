grammar malice_grammar;


options {
  language = Java;
  output = AST ;
  ASTLabelType = CommonTree;
}

@header {
  package malice_grammar ;
}

@lexer::header {
  package malice_grammar ;
}

rule: STRING* ;

//Digit : '0'..'9';
//NUMBER : Digit Digit*;
NUMBER : ('0'..'9')+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' |'\r' )+ {$channel = HIDDEN;};
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING :'"' (~('"'|'\n'|'\r'))* '"';

lpar: '(' ;
rpar: ')' ;
mono_op : '~';
bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';
relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
array_elem : IDENT '\'s' expr 'piece';
atom: IDENT ('\'s' expr 'piece')? | NUMBER | function_call;

//term :
//		IDENT
//	|	NUMBER
//	|	array_elem
//	|	lpar expr rpar
//	;
//	
//negation : not* term ;
//unary : ('-' | '+')* negation ;
//mult : unary (('*' | '/' | '%') unary)* ;
//add : mult (('+' | '-') mult)* ;
//relation: add (relational_op add)* ;
//expr: relation (('&&' | '||') relation)* ;

//expr : e | lpar e rpar ;
//expr: atom | mono_op expr | atom bin_op atom   ;




//STRING : '\"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ' | '\n' )+ '\"'; //**** need to check for string for other characters. 
//mono_op : '~';
//bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';
//
logical_ops : '&&' | '||' | '!';
//relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
//
//lpar : '(';
//rpar : ')';
//
data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider
//
//atom : NUMBER | IDENT ;
////
term : atom | lpar expr rpar ;
unary_op : ('~' | '-')* term ;
mult :unary_op (('*' | '/' | '%') unary_op)* ;
add : mult (('+' | '-') mult)* ;
bitw_and : add ('&' add)* ;
bitw_xor : bitw_and ('^' bitw_and)* ;
bitw_or : bitw_xor ('|' bitw_xor)* ;

expr : bitw_or;

bool_neg : '!'* term ;
bool_comp : bool_neg (('<=' | '<' | '>' | '>=') bool_neg)* ;
bool_eq : bool_comp (('&&' | '||') bool_comp)* ;

bool_expr : bool_eq ;
//
//
//
//expr : ex;
//bracketexpr : lpar expr rpar ;
//ex : mono_op ex | (atom | array_elem | bracketexpr) (bin_op ex)* ;    

//not_expr : '!' lpar bool_expr rpar;

//bool_expr : expr relational_ops expr ;//(logical_ops (expr | not_expr) | relational_ops expr)*; 

//bool_expr : expr relational_ops expr ;//(logical_ops expr)* ;

control_structure
			: (	'perhaps' lpar bool_expr rpar 'so'
						statementList 
					('or maybe' lpar bool_expr rpar 'so' statementList)*
					'or' statementList
					'because Alice was unsure which'
			  | 'either' lpar bool_expr rpar 'so'
			  	statementList //check here
			  	'or' statementList
			  	'because Alice was unsure which'			  	
			  |	'eventually' lpar bool_expr rpar 'because'
			  	statementList
			  	'enough times'	
			) '.'?;
			

//array_elem : IDENT '\'s' atom 'piece';
//
declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' (LETTER | STRING | expr))? 
                                | 'had' atom data_types//its atom here because we can use variable too -> see test12
                               )
                        ;
 
argument: IDENT | NUMBER | LETTER | STRING | array_elem;
arguments_to_functions : (argument (',' argument)*)? | function_call;
rest_statements :   (expr print) =>  (expr print)      
    |   (LETTER | STRING) print
    |  IDENT
        ( ('\'s' atom 'piece')?
            (    'became'  (expr | LETTER | STRING )
               | 'ate' 
               | 'drank'
            )
          //| 'had' NUMBER data_types
          //| 'was a' data_types ( 'too' | 'of' expr)?
        )
    | 'Alice' 'found' (expr | LETTER | STRING )
    //| function_call ('spoke' | 'said Alice')?
    | 'what was' IDENT '?' ;

print:
    'spoke' | 'said Alice'
    ;


function_call :  function_name lpar arguments_to_functions rpar ;
statement : rest_statements	| declaration_statements ;
		
statement_conjunctions : ',' | 'and' | 'then' | 'but' ;//check for all cunjunctions
//
////**************************************************
//
//statementList : (statement)*; //(statement_conjunctions statement)* ('.')? ;
//
//
////**************************************************
//
statementList : (control_structure | nested_function | function |statement (statement_conjunctions statement)* '.')*;
//
parameter : ('spider')? data_types IDENT ;
//
////is there any reason why we have ((',' parameter)*)? instead of just (',' parameter)* ???
parameters : (parameter ( ',' parameter)*)? ;
function_name : IDENT;
//
nested_function : 'opened' statementList 'closed' ;
function: 'The' (   'looking-glass' function_name lpar parameters rpar
				          | 'room' function_name lpar parameters rpar 'contained a' data_types
				        )
					'opened'
					statementList
					'closed';
					
global_declaration : (declaration_statements (statement_conjunctions declaration_statements)* '.')*  ;
program : global_declaration function+ EOF;
