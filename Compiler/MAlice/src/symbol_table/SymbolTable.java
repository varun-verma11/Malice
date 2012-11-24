package symbol_table;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	Map<String,SymbolTableValue> symbolTable = new HashMap<String, SymbolTableValue>();
	
	public boolean checkVariableScopeInFunction(String var, String f_name)
	{
		return ((FunctionSTValue) symbolTable.get(f_name))
					.getTable().checkIfVariableExists(var);
	}
	
	public boolean checkIfVariableExists(String var) 
	{
		return symbolTable.containsKey(var);
	}
	
	@Override
	public void insert(String name, SymbolTableValue value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String lookup(String key) {
		// TODO Auto-generated method stub
		return null;
	}


}
