package symbol_table;

import static org.junit.Assert.assertEquals;
import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;
import malice_grammar.malice_grammarParser.statement_return;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class StatementCheckerTests {

	SymbolTable symTab = new SymbolTable();
	
	@Test
	public void test() throws RecognitionException {
		new ExpressionChecker();
		symTab.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("hiiii", new VariableSTValue( DATA_TYPES.SENTENCE, false));
		
		String[] expr = new String[4];
		
		expr[0]  = " x became 3.";
		expr[1] = " y became 'h'";
		expr[2] = " m was a number too";
		expr[3] = " RSG was a sentence of \"krv\"";
		
		for(int i = 0; i < 4; i++)
		{
		assertEquals(false,checkStatement(expr[i]));
		}
	}

	public boolean checkStatement(String expr) throws RecognitionException
	{
		CharStream input = new ANTLRStringStream(expr); 
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		statement_return prog = parser.statement() ;
		return StatementChecker.checkStatement((Tree) prog.getTree(), symTab);
	}
}
