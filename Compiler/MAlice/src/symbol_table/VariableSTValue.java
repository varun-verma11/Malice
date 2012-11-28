/**
 * 
 */
package symbol_table;

/**
 * @author varun
 *
 */
public class VariableSTValue extends SymbolTableValue
{
	/**
	 *	@field initialised		True iff the variable is initialised, else False
	 */
	private boolean initialised;
	
	
	/**
	 * Constructor for VariableSTValue
	 * 
	 * @param type    			Data type of the variable key.
	 * @param initialised		Given boolean value to set the field 'initialised'.
	 * @return					VariableSTValue, usually for pairing with a variable key in a SymbolTable
	 */
	public VariableSTValue(DATA_TYPES type, boolean initialised)
	{
		this.type = type;
		this.initialised = initialised ;
	}
	
	

	/**
	 * Resets 'initialised' field of a VariableSTVale to the given boolean
	 * 
	 * @param initialised		Given boolean value to reset the field 'initialised'.
	 */
	public void setInitialised(boolean initialised)
	{
		this.initialised = initialised ;
	}

	
	/**
	 * To check whether variable is initialised
	 *
	 * @return     True if variable was initialised, else False
	 */
	public boolean isInitialised() 
	{
		return initialised ;
	}
}
