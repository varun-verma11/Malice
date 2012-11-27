package malice_grammar;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import symbol_table.ExpressionChecker;
import symbol_table.SymbolTable;

public class Malice
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if (args.length==0)
		{
			System.err.println("Please provide with filename.");
			return;
		}
		if (!args[0].endsWith(".alice"))
		{
			System.err.println("Invalid File (" + args[0] + 
					"): Wrong extension.");
			return ;
		}
		try {
			new ExpressionChecker();
			SymbolTable table = new SymbolTable();
			System.out.println(args[0] + " started");
			CharStream input = new ANTLRFileStream(args[0]); 
			malice_grammarLexer lexer = new malice_grammarLexer(input );
			TokenStream tokens = new CommonTokenStream(lexer);
			malice_grammarParser parser = new malice_grammarParser(tokens ) ;
			if (!parser.failed()) {
				Tree tree =  (Tree) parser.program().getTree() ;
				System.out.println(tree.toStringTree());
				SemanticVerifier.checkProgramSemantics(tree, table);
			}
			System.out.println(args[0] + " done");
		} 
		catch (IOException e) { System.out.println("The filepath is incorrect." +
				" Please use a valid filepath");} 
		catch (RecognitionException e) { e.printStackTrace(); }

	}

}
