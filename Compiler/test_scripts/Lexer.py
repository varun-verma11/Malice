"""
This is the script to parse the input string into tokens#


"""

from pyparsing import *

number = Literal(nums)
letter = Literal(alphas, max=1)
ident = Literal(alphas)
function_name = Identifier
string = Word(alphas)
atom = number | ident | string | letter
lpar = Literal("(")
rpar = Literal(")")

array_elem = Group(ident + Literal("'s") + atom + Literal("piece"))
data_type = Literal("number") | Literal("letter") | Literal("sentence")

term = atom | Group(lpar + expr + rpar)
unary_op = ZeroOrMore(Group(OneOf("~ -") + term))
mult = Group(unary_op + ZeroOrMore(OneOf("* / %") + unary_op))
add = Group(mult + ZeroOrMore(OneOf("+ -") + mult))
bitw_and = Group(add + ZeroOrMore('&' + add))
bitw_xor = Group(bitw_and+ ZeroOrMore('^' + bitw_and))
bitw_or = Group(bitw_xor+ ZeroOrMore('^' + bitw_xor))

function_call = Forward()#define this here
expr = bitw_or | function_call
bool_neg = Group(ZeroOrMore(Literal("!")) + term )



"""
BITWISE_NOT = Literal("~")
MONO_OP = BITWISE_NOT #using this to be able to add more mono operations later

PLUS_OP = Literal("+")
MINUS_OP = Literal("-") #need to check if there is minus in MAlice
MODULUS_OP = Literal("%")
DIVIDE_OP = Literal("/")
BITWISE_XOR = Literal("^")
BITWISE_AND = Literal("&")
BITWISE_OR = Literal("|")
MULTIPLY_OP = Literal("*")

BINARY_OP = PLUS_OP | MINUS_OP | 
							MODULUS_OP | DIVIDE_OP | BITWISE_XOR	| 
							BITWISE_AND | BITWISE_OR | MULTIPLY_OP

Logical_Ops = Literal("&&") | Literal("||")
Relational_Ops = Literal("!=") | Literal("==") | Literal("<") | Literal("<=")
								| Literal(">") | Literal(">=")

Lpar = Literal("(")
Rpar = Literal(")")

Expr = Forward()
Expr << DATA | group(Lpar + Expr + Rpar) |
				MONO_OP + Expr | DATA + BINARY_OP + Expr

Bool_Expr = Forward()
Bool_Expr << Expr + Relational_Ops + Expr + Optional(Logical_Ops + Bool_Expr)

Data_type = Literal("number") | Literal("letter") | Literal("sentence")

#in perhaps statment, the statement could end without a full stop so 
#need to consider that case.
Statement = Forward()
StatementList = Forward()
Statement  << ( Identifier + Optional(Literal("'s")+ NUMBER + Literal("piece")) +
								(Literal("was a") + 
									( Data_type + 
										( Optional(Literal("too")) 
												| ("of") + DATA
										)
									)
							 | Literal("became") + ( Expr | LETTER)
							 | oneOf("ate drank")
							 | Literal("spoke")
							 | Literal("had") + NUMBER + Data_type
							)
						 | Expr + Literal("said") + Literal("Alice")
						 | Literal("Alice") + Literal("found") + Expr
						 | Literal("what was") + Identifier + Literal("?")
					   | ( Literal("perhaps") + Lpar + Bool_Expr + Rpar + Literal("so")
								 + StatementList
								 + OneOrMore(Literal("maybe") + Lpar + Bool_Expr + Rpar +
															StatementList
														 )  + 
								 + Literal("or") + Statement + 
								 Literal("because Alice was unsure which")
							 )
						 | Literal("either") + Lpar + Bool_Expr + Rpar + Literal("so") +
						 	 	StatementList +	Literal("or") + StatementList +
								Literal("because Alice was unsure which")
						)

COMMA = Literal(",")
AND = Literal("and")
BUT = Literal("but")
THEN = Literal("then")
FULLSTOP = Literal(".")
STATEMENT_CONJUNCTIONS = COMMA | BUT | THEN | FULLSTOP


"""
