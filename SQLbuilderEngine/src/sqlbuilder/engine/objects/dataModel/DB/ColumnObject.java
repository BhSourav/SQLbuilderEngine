/**
 * 
 */
package sqlbuilder.engine.objects.dataModel.DB;

/**
 * @author Sourav created on 5 Jan 2016
 *
 */
public class ColumnObject {

	/**
	 * 
	 */
	public ColumnObject() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	ColAttribObject columnattrib;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ColAttribObject getColumnattrib() {
		return columnattrib;
	}
	public void setColumnattrib(ColAttribObject colattrib) {
		this.columnattrib = colattrib;
	}
	

}
