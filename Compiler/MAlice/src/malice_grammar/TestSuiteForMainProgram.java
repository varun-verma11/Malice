package malice_grammar;

import static org.junit.Assert.*;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

import symbol_table.ExpressionChecker;
import symbol_table.SymbolTable;


public class TestSuiteForMainProgram
{
	private boolean runProgram(String filepath) throws IOException, RecognitionException
	{
		new ExpressionChecker();
		SymbolTable table = new SymbolTable();
		System.out.println(filepath + " started");
		CharStream input = new ANTLRFileStream(filepath); 
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		Tree tree =  (Tree) parser.program().getTree() ;
		System.out.println(tree.toStringTree());
		SemanticVerifier.checkProgramSemantics(tree, table);
		System.out.println(filepath + " done");
		return true;
	}
	
	@Test
	public void testForValidPrograms( ) throws IOException, RecognitionException
	{
		String filepath = "c:/Users/varun/Documents/Malice/" +
				"malice_examples/my_tests/test_scope.g";
		assertTrue( runProgram(filepath));
		String[] ps = ("test01.alice test02.alice test03.alice " +
				"test04.alice test05.alice test06.alice test07.alice test08.alice test09.alice " +
				"test10.alice test11.alice test12.alice test13.alice test14.alice test15.alice vectorFunctions.alice").split(" ") ;
		for(String p: ps) {
			assertTrue( runProgram("c:/Users/varun/Documents/Malice/malice_examples/valid/" + p));
		}
	}
	
	@Test
	public void testAllInvalidPrograms( ) 
	{
		
	}
}
