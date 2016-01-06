/**
 * 
 */
package sqlbuilder.engine.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sourav created on 5 Jan 2016
 *
 */
public class TableObject {

	/**
	 * 
	 */
	public TableObject() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	List<ColumnObject> column=new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ColumnObject> getcolumn() {
		return column;
	}
	public void setcolumn(ColumnObject colObj) {
		this.column.add(colObj);
	}
	
}
