/**
 * 
 */
package sqlbuilder.engine.objects.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sourav created on Jan 31, 2016
 *
 */
public class FromObject {

	private List<TableObject> fromTables=new ArrayList<>();

	/**
	 * @return the fromTables
	 */
	public List<TableObject> getFromTables() {
		return fromTables;
	}

	/**
	 * @param fromTables the fromTables to set
	 */
	public void setFromTables(List<TableObject> fromTables) {
		this.fromTables = fromTables;
	}
	
}