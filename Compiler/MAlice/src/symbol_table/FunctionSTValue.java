package symbol_table;

import java.util.ArrayList;


public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	ArrayList<DATA_TYPES> args;
	int newTableScopeLevel;
	
	public FunctionSTValue(SymbolTable currSymTable, ArrayList<DATA_TYPES> args) 
	{
		this.type = null;
		symbolTable = new SymbolTable();
		symbolTable.setEnclosingSymbolTable(currSymTable);
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1);//check this, if it makes sense do the same in the second constructor 
		this.args = args;
	}
	
	//Could we basically have FunctionSTValue(SymbolTable currSymTable, DATA_TYPES[] args) = FunctionSTValue(null, currSymTable, args)??
	
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, ArrayList<DATA_TYPES> args)
	{
		this.type = return_type ;
		symbolTable = new SymbolTable();
		symbolTable.setEnclosingSymbolTable(currSymTable);
		symbolTable.updateCurrentScopeLevel(symbolTable.getCurrentScopeLevel() + 1);
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


