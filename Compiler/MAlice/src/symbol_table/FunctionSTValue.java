package symbol_table;

import java.util.ArrayList;


public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	ArrayList<DATA_TYPES> args;
	
	public FunctionSTValue(SymbolTable currSymTable, ArrayList<DATA_TYPES> args) 
	{
		this.type = null;
		symbolTable = new SymbolTable();
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1); 
		symbolTable.setEnclosingSymbolTable(currSymTable);
		this.args = args;
	}
	
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, ArrayList<DATA_TYPES> args)
	{
		this.type = return_type ;
		symbolTable = new SymbolTable();
		symbolTable.setEnclosingSymbolTable(currSymTable);
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1);
		this.args = args;
	}

	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
	public ArrayList<DATA_TYPES> getArgs() 
	{
		return args;
	}
	
}


