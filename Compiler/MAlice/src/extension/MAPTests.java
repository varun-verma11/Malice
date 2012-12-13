package extension;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;
import malice_grammar.malice_grammarParser.function_call_return;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

import semantics_checks.ExpressionChecker;
import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;
import codeGeneration.CodeGenerator;

public class MAPTests
{

	@Test
	public void testMap() throws IOException, RecognitionException
	{
		assertTrue(runProgram("map(myfunc, in, out)"));
	}
	
	private boolean runProgram(String func) 
	throws IOException, RecognitionException
	{
		SymbolTable table = initSymbolTable();
		new ExpressionChecker();
		CharStream input = new ANTLRStringStream(func);
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		if (lexer.getNumberOfSyntaxErrors()==0)
		{
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			function_call_return prog = parser.function_call();
			if (parser.getNumberOfSyntaxErrors()==0) {
				Tree tree =  (Tree) prog.getTree() ;
				System.out.println(tree.toStringTree());
				HighOrderFunctions.checkMapFunction(tree, table);
				HighOrderFunctions.swapMapWithWhile(tree, table);
				CodeGenerator.printInstructions();
			}
		}
		return true;
	}

	private SymbolTable initSymbolTable()
	{
		SymbolTable table = new SymbolTable();
		
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		FunctionSTValue fVal = new FunctionSTValue(DATA_TYPES.NUMBER, table, args );
		table.insert("myfunc", fVal);
		
		VariableSTValue val = new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true);
		val.setArraySize(10);
		val.setLocationReg("%in");
		
		table.insert("in", val);
		
		return table;
	}
}
