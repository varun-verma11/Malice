//package codeGeneration;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//import org.antlr.runtime.tree.Tree;
//
//import symbol_table.SymbolTable;
//
//public class StatementCodeGenerator {
//	private static int regNumber = 0;
//	private static Queue<String> statements = new ArrayDeque<String>();
//	
//	public static void emptyQueue()
//	{
//		statements = new ArrayDeque<String>();
//		regNumber = 0;
//	}
//	
//	public static String getResultReg(Tree node, SymbolTable table){
//		if (node==null) return null;
//		
//		STATEMENT stat = getStatement(node.getText());
//		
//		String arg1 = getResultReg(node.getChild(0), table);
//		String arg2 = getResultReg(node.getChild(1), table);
//		String arg3 = getResultReg(node.getChild(2), table);
//		
//		String uniqueRegisterID = getUniqueRegisterID();
//		
//		switch(stat)
//		{
//			case WAS: 
//				writeWAS(uniqueRegisterID, "was", arg1, arg2);
//				break;
//			
//			case HAD: 
//				break;
//			
//			case WHAT: 
//				 break;
//		}
//		
//	}
//	
//	private static void writeWAS(uniqueRegisterID, , arg1, arg2) {
//		
//	}
//	
//	public static String getUniqueRegisterID()
//	{
//		++regNumber;
//		return "%"+regNumber;
//	}
//	
//	public static String getLocalRegisterID(int reg)
//	{
//		return "%" + reg;
//	}
//	
//	private static STATEMENT getStatement(String s){
//		if (s.contentEquals("was")) return STATEMENT.WAS;
//		if (s.contentEquals("had")) return STATEMENT.HAD;
//		if (s.contentEquals("what")) return STATEMENT.WHAT;
//		return null;		
//	}
//
//	private enum STATEMENT{
//		WAS, HAD, WHAT
//	}
//}