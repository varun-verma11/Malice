package symbol_table;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	Map<String,SymbolTableValue> symbolTable = new HashMap<String, SymbolTableValue>();
	
	public boolean checkVariableScopeInFunctionInCurrLevel(String var, String f_name)
	{
		return ((FunctionSTValue) symbolTable.get(f_name))
					.getTable().checkIfVariableExists(var);
	}
	
	public boolean checkIfVariableExists(String var) 
	{
		return symbolTable.containsKey(var);
	}
	
	public Map<String,SymbolTableValue> getSymbolTable()
	{
		return symbolTable;
	}
	public boolean isVariableInitialised(String var)
	{
		return ((VariableSTValue)symbolTable.get(var)).isInitialised();
	}
	
	@Override
	public void insert(String name, SymbolTableValue value) {
		symbolTable.put(name, value);		
	}

	@Override
	public SymbolTableValue lookup(String name) {
		return symbolTable.get(name);
	}


}
