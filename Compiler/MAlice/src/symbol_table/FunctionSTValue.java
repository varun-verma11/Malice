package symbol_table;

import java.util.ArrayList;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	ArrayList<DATA_TYPES> args;
	
	/**
	 * FunctionSTValue Constructor for void-returning functions
	 * 
	 * @param currSymTable		Current SymbolTable
	 * @param args				Function arguments
	 */
	public FunctionSTValue(SymbolTable currSymTable, ArrayList<DATA_TYPES> args) 
	{
		this.type = null;
		symbolTable = new SymbolTable();
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1); 
		symbolTable.setEnclosingSymbolTable(currSymTable);
		this.args = args;
	}
	
	/**
	 * FunctionSTValue Constructor for returning functions
	 * 
	 * @param return_type		Data type of return value
	 * @param currSymTable		Current SymbolTable
	 * @param args				Function arguments
	 */
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, ArrayList<DATA_TYPES> args)
	{
		this.type = return_type ;
		symbolTable = new SymbolTable();
		symbolTable.setEnclosingSymbolTable(currSymTable);
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1);
		this.args = args;
	}

	
	/**
	 * Returns the symbol table associated with FunctionSTValue
	 * 
	 * @return		FSTValue's SymbolTable
	 */
	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
	
	/**
	 * Returns the arguments list associated with FunctionSTValue
	 * 
	 * @return		FSTValue's arguments in the form of an array-list
	 */
	public ArrayList<DATA_TYPES> getArgs() 
	{
		return args;
	}
	
}