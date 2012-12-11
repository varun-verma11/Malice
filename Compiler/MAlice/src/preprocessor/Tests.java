package preprocessor;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;
import malice_grammar.malice_grammarParser.function_return;
import malice_grammar.malice_grammarParser.program_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

import semantics_checks.ExpressionChecker;

public class Tests
{
	@Test
	public void testExtension() throws IOException, RecognitionException
	{
		assertTrue(runProgram("c:/Users/varun/Documents/Malice/" +
				"malice_new_clone/Tests For Extension/test01.alice"));
	}
	
	private boolean runProgram(String filepath) 
	throws IOException, RecognitionException
	{
		new ExpressionChecker();
		System.out.println(filepath + " started");
		CharStream input = new ANTLRFileStream(filepath);
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		if (lexer.getNumberOfSyntaxErrors()==0)
		{
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			program_return prog = parser.program();
			if (parser.getNumberOfSyntaxErrors()==0) {
				Tree tree =  (Tree) prog.getTree() ;
				Imports.checkImports(tree.getChild(0));
				System.out.println(tree.toStringTree());
			}
		}
		System.out.println(filepath + " done");
		return true;
	}

	private void attachFunctionToTree(Tree func, Tree tree)
	{
		tree.freshenParentAndChildIndexes();
	}

	private Tree getTreeForFunc(String function) throws RecognitionException
	{
		new ExpressionChecker();
		CharStream input = new ANTLRStringStream(function);
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		if (lexer.getNumberOfSyntaxErrors()==0)
		{
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			function_return prog = parser.function();
			if (parser.getNumberOfSyntaxErrors()==0) {
				Tree tree =  (Tree) prog.getTree() ;
				return tree;
			}
		}
		return null;
	}
}

