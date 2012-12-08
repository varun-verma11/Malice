/**
 * 
 */
package symbol_table;

/**
 * @author HMV
 *
 */
public abstract class SymbolTableValue {
	protected DATA_TYPES type ;
	protected String locationReg;
	public DATA_TYPES getType()
	{
		return type;
	}
	public String getLocationReg()
	{
		return locationReg;
	}
	public void setLocationReg(String locationReg)
	{
		this.locationReg = locationReg;
	}
}
