grammar MAlice_grammar;

options {
  language = Java;
}


fragment
Digit : '0'..'9';
NUMBER : Digit Digit*;
//NUMBER : '0'..'9'+;
IDENT: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' )+ {$channel = HIDDEN;};
LETTER: '\'' ('a'..'z' | 'A'..'Z') '\'';
STRING : '"' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ')+ '"'; //**** need to check for string for other characters. 
MONO_OP: '~';
BIN_OP: '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|';

LOGICAL_OPS: '&&' | '||' ;
RELATIONAL_OPS: '==' | '!=' | '<' | '>' | '<=' | '>=' ;

lpar : '(';
rpar : ')';

//bracket_expr : expr | LPAR expr RPARtype filter text; 
data_types: 'number' | 'letter' | 'sentence' ; // need to check for the spider

atom: NUMBER | IDENT ;
//expr : MONO_OP expr | atom BIN_OP expr | atom ; 

//expr : expr1;
//expr1 : term expr2 | MONO_OP expr1;
//expr2 : BIN_OP term expr2 | ;
//term: factor term2;
//term2: BIN_OP factor term2| ;
//factor: LPAR expr1 RPAR | IDENT | NUMBER ;


bracketexpr : lpar expr rpar;
expr : atom
			 | MONO_OP expr 
			 | (atom | bracketexpr) BIN_OP expr //or (BIN_OP expr)* ? because otherwise we can only get a bracketed one on lhs and we sometimes want an expr 
			 | bracketexpr ;


//but then we could have:
//***************************************************************
//* expr : MONO_OP expr | (atom | bracketexpr) (BIN_OP expr)* ; *		 
//***************************************************************


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
