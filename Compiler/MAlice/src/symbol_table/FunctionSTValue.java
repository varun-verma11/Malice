package symbol_table;

import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.SymbolTableValue;

public class FunctionSTValue extends SymbolTableValue
{
	SymbolTable symbolTable;
	SymbolTable parent ;
	DATA_TYPES[] args;
	int newTableScopeLevel;
	
	public FunctionSTValue(SymbolTable currSymTable, DATA_TYPES[] args) 
	{
		this.parent = currSymTable;
		symbolTable = new SymbolTable();
		this.newTableScopeLevel = parent.getCurrentScopeLevel() + 1;
		symbolTable.updateCurrentScopeLevel(newTableScopeLevel);
		this.args = args;
	}
	
	public FunctionSTValue(DATA_TYPES return_type, SymbolTable currSymTable, DATA_TYPES[] args)
	{
		this.type = return_type ;
		this.parent = currSymTable;
		symbolTable = new SymbolTable();
		this.newTableScopeLevel = parent.getCurrentScopeLevel() + 1;
		symbolTable.updateCurrentScopeLevel(newTableScopeLevel);
		this.args = args;
	}
	
	public SymbolTable getTable()
	{
		return symbolTable ;
	}	
	
	public SymbolTable getParent() 
	{
		return parent;
	}
	
	public DATA_TYPES[] getArgs() 
	{
		return args;
	}
	
}


