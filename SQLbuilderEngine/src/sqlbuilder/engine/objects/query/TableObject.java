/**
 * 
 */
package sqlbuilder.engine.objects.query;

/**
 * @author Sourav created on Jan 31, 2016
 *
 */
public class TableObject {

	private String tabAlias;
	private String tabName;
	/**
	 * @return the tabAlias
	 */
	public String getTabAlias() {
		return tabAlias;
	}
	/**
	 * @param tabAlias the tabAlias to set
	 */
	public void setTabAlias(String tabAlias) {
		this.tabAlias = tabAlias;
	}
	/**
	 * @return the tabName
	 */
	public String getTabName() {
		return tabName;
	}
	/**
	 * @param tabName the tabName to set
	 */
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	
}
