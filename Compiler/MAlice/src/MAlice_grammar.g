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

expr : bexpr;// | MONO_OP expr | bexpr (BIN_OP expr)*;

bexpr : LPAR rparend | NUMBER | IDENT;
rparend: expr RPAR;

//e : LPAR e RPAR | atom
//    | MON_OP e
//    | ;


//e : LPAR NUMBER BIN_OP NUMBER RPAR;

//exp : atom;// | term;
bexp : lpar ex2 rpar | ex2;
ex2: atom | MON_OP ex2 | ex2 BIN_OP ex2;

//term : MONO_OP bexp | bexp BIN_OP bexp;


//e1 : MON_OP e | NUMBER | //e BIN_OP e;

//e : '(' e1 ')' e1? ;

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
		 				(	   'became'  (expr | LETTER | STRING)
		 					 | 'ate' 
		 					 | 'drank' 
		 					 | 'spoke'
		 				)
		 			| 'had' NUMBER data_types
		 			| 'was a' data_types ( 'too' | 'of' atom )?
		 		)
		| expr 'said' 'Alice'
		| 'Alice' 'found' expr
		| 'what was' IDENT '?' ;
		
statement_conjunctions : '.' | ',' | 'and' | 'then' | 'but' ;//check for all cunjunctions

statementList : statement '.' | ;

parameter : ('spider')? data_types IDENT ;
parameters : (parameter (( ',' parameter)*)?)? ;

function
				: 'The' (   'looking' '-' 'glass' IDENT lpar parameters rpar
				          | 'room' IDENT LPAR parameters RPAR
				        )
					'opened'
					statementList
					'closed';
				
program : IDENT;