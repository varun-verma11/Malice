package symbol_table;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.SymbolTableValue;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	DATA_TYPES[] args;
	int newTableScopeLevel;
	
	public FunctionSTValue(SymbolTable currSymTable, DATA_TYPES[] args) 
	{
		this.type = null;
		symbolTable = new SymbolTable();
		symbolTable.setEnclosingSymbolTable(currSymTable);
		symbolTable.updateCurrentScopeLevel(currSymTable.getCurrentScopeLevel() + 1);//check this, if it makes sense do the same in the second constructor 
		this.args = args;
	}
	
	//Could we basically have FunctionSTValue(SymbolTable currSymTable, DATA_TYPES[] args) = FunctionSTValue(null, currSymTable, args)??
	
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, DATA_TYPES[] args)
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
	
	public DATA_TYPES[] getArgs() 
	{
		return args;
	}
	
}


