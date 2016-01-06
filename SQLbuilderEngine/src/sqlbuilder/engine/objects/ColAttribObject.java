/**
 * 
 */
package sqlbuilder.engine.objects;

/**
 * @author Sourav created on 05/01/2016
 *
 */
public class ColAttribObject {

	/**
	 * 
	 */
	public ColAttribObject() {
		// TODO Auto-generated constructor stub
	}
	
	private int size;
	enum nullable{yes,no};
	private String datatype;
	private String isNullable;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getisNullable() {
		return isNullable;
	}
	public void setNullable(nullable null1) {
		this.isNullable = null1.toString();
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	
}
