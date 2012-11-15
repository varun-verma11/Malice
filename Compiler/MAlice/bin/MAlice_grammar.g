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

LPAR : '(';
RPAR : ')';

//bracket_expr : expr | LPAR expr RPARtype filter text;
DATA_TYPES: 'number' | 'letter' | 'sentence' ; // need to check for the spider

atom: NUMBER | IDENT ;
//expr : MONO_OP expr | atom BIN_OP expr | atom ; 

expr : expr1;
expr1 : term expr2 | MONO_OP expr1;
expr2 : BIN_OP term expr2 | ;
term: factor term2;
term2: BIN_OP factor term2| ;
factor: LPAR expr1 RPAR | IDENT | NUMBER ;

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
		 		('was a' DATA_TYPES 
		 			( 'too'
		 				| 'of' atom		 				
		 			)?
		 			|	('\'s' NUMBER 'piece')?
		 				(	 'became'  (expr | LETTER | STRING)
		 					 | 'ate' 
		 					 | 'drank' 
		 					 | 'spoke'
		 				)
		 			| 'had' NUMBER DATA_TYPES
		 		)
		| expr 'said' 'Alice'
		| 'Alice' 'found' expr
		| 'what was' IDENT '?' ;
		
statementList : statement | ;



function
				: 'The' 'looking' '-' 'glass' IDENT '()' 
					'opened'
					statementList
					'closed';
				
program : IDENT;