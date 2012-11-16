grammar MAlice_grammar;

options {
  language = Java;
}


fragment
Digit : '0'..'9';
NUMBER : Digit Digit*;
//NUMBER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' )+ {$channel = HIDDEN;};
LETTER : '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING : '"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ')+ '"'; //**** need to check for string for other characters. 
mono_op : '~';
bin_op : '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';

logical_ops : '&&' | '||' ;
relational_ops : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

lpar : '(';
rpar : ')';

data_types : 'number' | 'letter' | 'sentence' ; // need to check for the spider

atom : NUMBER | IDENT ;


expr : ex;
bracketexpr : lpar ex rpar  ;

<<<<<<< HEAD
ex : mono_op ex | (atom | bracketexpr) (bin_op ex)* ;    
=======
exp2 : atom 
       | mono_op exp2
       | lpar exp2 rpar;
*/







e : expr;

bracketexpr : lpar expr rpar  ;
expr : mono_op expr | (atom | bracketexpr) (bin_op expr)* ;    

//e : mono_op atom | atom | e bin_op e | lpar e  rpar | EOF;



//expr : atom bin_op atom | bracketexpr '+' NUMBER;
/* 
expr : atom
	   | mono_op expr 
	   | (atom | bracketexpr) (bin_op expr)+ //or (BIN_OP expr)* ? because otherwise we can only get a bracketed one on lhs and we sometimes want an expr 
		 | bracketexpr ;
*/

 


//JUST IN CASE:

//expr : bexpr;// | MONO_OP expr | bexpr (BIN_OP expr)*;


//exp : atom;// | term;
//bexp : lpar ex2 rpar | ex2;
//ex2: atom | MON_OP ex2 | ex2 BIN_OP ex2;

//term : MONO_OP bexp | bexp BIN_OP bexp;
>>>>>>> c1b2f620ade5c3707b3cdcaf4e0e083106d6f7ef


bool_expr : expr RELATIONAL_OPS expr ((LOGICAL_OPS bool_expr)*)? ;

control_structure
		: (		'perhaps' lpar bool_expr rpar 'so'
					statementList 
						('maybe' lpar bool_expr rpar statementList)*
					'or' statementList
					'because Alice was unsure which'
			  | 'either' lpar bool_expr rpar 'so'
			  	statementList //check here
			  	'or' statmentList
			  	'because Alice was unsure which'			  	
			  |	'eventually' lpar bool_expr rpar 'because'
			  	statementList
			  	'enough times'			
			) ('.')? ;

statement 
		: IDENT
		 		( |	('\'s' NUMBER 'piece')?
		 				(	   'became'  (e | LETTER | STRING)
		 					 | 'ate' 
		 					 | 'drank' 
		 					 | 'spoke'
		 				)
		 			| 'had' NUMBER data_types
		 			| 'was a' data_types ( 'too' | 'of' expr)?
		 		)
		| expr 'said' 'Alice'
		| 'Alice' 'found' expr
		| 'what was' IDENT '?' ;
		
statement_conjunctions : '.' | ',' | 'and' | 'then' | 'but' ;//check for all cunjunctions

statementList : statement '.' | ;

parameter : ('spider')? data_types IDENT ;
parameters : (parameter (( ',' parameter)*)?)? ;

function_type : func_return | func_no_return ;
func_return : 'room' ;
func_no_return : 'looking-glass' ;
function
				: 'The' function_type IDENT lpar parameters rpar
					'opened'
					statementList
					'closed';
				
program : IDENT EOF;
