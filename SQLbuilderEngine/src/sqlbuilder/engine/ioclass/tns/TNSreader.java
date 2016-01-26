/**
 * 
 */
package sqlbuilder.engine.ioclass.tns;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.apache.commons.io.FileUtils;

import edu.gatech.gtri.orafile.Orafile;
import edu.gatech.gtri.orafile.OrafileDef;
import edu.gatech.gtri.orafile.OrafileDict;
import sqlbuilder.engine.objects.connection.ConnectionObject;

/**
 * @author Sourav created on Jan 27, 2016
 *
 */
public class TNSreader {

	/**
	 * 
	 */
	private String filePath;
	OrafileDict tns;
	
	public TNSreader() throws IOException, RecognitionException {
		ConnectionObject obj=new ConnectionObject();
		filePath="C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\NETWORK\\ADMIN\\TNSNAMES.ORA";
				//obj.getFilePath();
		String str = FileUtils.readFileToString(new File(filePath));
		tns=Orafile.parse(str);
	}
	
	public List<String> getAliasNames() {
		List<String> aliases=new ArrayList<>();
		for(OrafileDef map: tns.getNamedParams())
		{
			aliases.add(map.getName());
		}
		return aliases;
	}
	
	
	
	public static void main(String[] args) throws IOException, RecognitionException {
		TNSreader re=new TNSreader();
		List<String> aliases=new ArrayList<>();
		aliases=re.getAliasNames();
		System.out.println(aliases);
	}
}
