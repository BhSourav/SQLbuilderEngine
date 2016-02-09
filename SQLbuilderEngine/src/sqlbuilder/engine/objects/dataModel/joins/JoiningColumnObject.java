/**
 * 
 */
package sqlbuilder.engine.objects.dataModel.joins;

/**
 * @author Sourav created on Feb 10, 2016
 *
 */
public class JoiningColumnObject {

	private String tableName;
	private String columnName;
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
}
