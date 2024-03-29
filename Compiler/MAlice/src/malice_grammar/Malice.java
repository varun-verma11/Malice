package malice_grammar;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;


import semantics_checks.ExpressionChecker;
import symbol_table.SymbolTable;
import codeGeneration.CodeGenerator;
import extension.Imports;
import extension.MathLibrary;

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
		String filepath = "";
		if(args.length==2)
		{
			filepath = args[1];
		} else 
		{
			filepath = args[0].replace(".alice", ".llvm");
		}
		try {
			new ExpressionChecker();
			SymbolTable table = new SymbolTable();
			System.out.println("====ANALYSING " + args[0] + "====");
			CharStream input = new ANTLRFileStream(args[0]); 
			malice_grammarLexer lexer = new malice_grammarLexer(input );
			TokenStream tokens = new CommonTokenStream(lexer);
			if (lexer.getNumberOfSyntaxErrors()==0)
			{
				malice_grammarParser parser = new malice_grammarParser(tokens ) ;
				Tree tree =  (Tree) parser.program().getTree() ;
				if (parser.getNumberOfSyntaxErrors()==0) {
					MathLibrary.addFunctionsToSymbolTable(table);
					Imports.checkImports(tree);
					SemanticVerifier.checkProgramSemantics(tree, table);
					if (!SemanticVerifier.failed) 
					{
						CodeGenerator.generateCode(tree, table);
						CodeGenerator.saveToFile(filepath);
						System.out.println("====RUNNING====");
					}
				}
					
			} 
		} 
		catch (IOException e) { System.err.println("The filepath is incorrect." +
				" Please use a valid filepath");} 
		catch (RecognitionException e) { e.printStackTrace(); }
	}

}
