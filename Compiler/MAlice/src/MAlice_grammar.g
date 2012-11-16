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
//expr : MONO_OP expr | atom BIN_OP expr | atom ; 
/*
expr : expr1;
expr1 : term expr2 | MONO_OP expr1;
expr2 : BIN_OP term expr2 | ;
term: factor term2;
term2: BIN_OP factor term2| ;
factor: lpar expr1 rpar | IDENT | NUMBER ;
*/

/* expr : e1;
e1 : atom | mono_op e2 | e2 bin_op e2 ;
e2 : atom | br;
br : lpar right;
right : expr rpar;


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


bool_expr : expr RELATIONAL_OPS expr ((LOGICAL_OPS bool_expr)*)? ;

control_structure
		: (		'perhaps' LPAR bool_expr RPAR 'so'
					statementList 
						('maybe' LPAR bool_expr RPAR statementList)+
					'or' statementList
					'because Alice was unsure which'
			  | 'either' LPAR bool_expr RPAR 'so'
			  	statementList //check here
			  	'or' statmentList
			  	'because Alice was unsure which'
			  	
			  |	'eventually' LPAR bool_expr RPAR 'because'
			  	statementList
			  	'enough times'			
			) ('.')? ;

statement 
		: IDENT
		 		('was a' data_types ( 'too' | 'of' atom )? 
		 		   |	('\'s' NUMBER 'piece')?
		 				(	 'became'  (expr | LETTER | STRING)
		 					 | 'ate' 
		 					 | 'drank' 
		 					 | 'spoke'
		 				)
		 			| 'had' NUMBER data_types
		 		)
		| expr 'said' 'Alice'
		| 'Alice' 'found' expr
		| 'what was' IDENT '?' ;
		
statementList : statement | ;

parameter : ('spider')? data_types IDENT ;
parameters : parameter (( ',' parameter)*)? | ;

function
				: 'The' (   'looking' '-' 'glass' IDENT LPAR parameters RPAR
				          | 'room' IDENT LPAR parameters RPAR
				        )
					'opened'
					statementList
					'closed';
				
program : IDENT;
