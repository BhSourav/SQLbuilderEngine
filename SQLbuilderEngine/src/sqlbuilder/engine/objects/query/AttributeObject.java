/**
 * 
 */
package sqlbuilder.engine.objects.query;

/**
 * @author Sourav created on Jan 31, 2016
 *
 */
public class AttributeObject {

	private String tabAlias;
	private String attribName;
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
	 * @return the attribName
	 */
	public String getAttribName() {
		return attribName;
	}
	/**
	 * @param attribName the attribName to set
	 */
	public void setAttribName(String attribName) {
		this.attribName = attribName;
	}
	
}
