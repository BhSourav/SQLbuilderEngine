/**
 * 
 */
package sqlbuilder.engine.ioclass.tns;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.BOMInputStream;

import edu.gatech.gtri.orafile.Orafile;
import edu.gatech.gtri.orafile.OrafileDef;
import edu.gatech.gtri.orafile.OrafileDict;
import edu.gatech.gtri.orafile.OrafileRenderer;
import edu.gatech.gtri.orafile.OrafileVal;
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
		//filePath="C:\\Program Files\\Oracle\\OraClient10g_home1\\NETWORK\\ADMIN\\tnsnames.ora";
		
		/*InputStream input=new FileInputStream(new File(filePath));
		BOMInputStream bomInput=new BOMInputStream(input);
		ByteOrderMark bom=bomInput.getBOM();
		//String charsetName = bom == null ? "UTF-8" : bom.getCharsetName();
		InputStreamReader reader = new InputStreamReader(new BufferedInputStream(bomInput)); 
		String str = IOUtils.toString(reader);*/
		String str=FileUtils.readFileToString(new File(filePath));
		str = str.replace("\uFEFF", "");
		System.out.println(str);
		tns=Orafile.parse(str);
		//System.out.println(tns);
	}
	
	public List<String> getAliasNames() {
		List<String> aliases=new ArrayList<>();
		for(OrafileDef map: tns.getNamedParams())
		{
			aliases.add(map.getName());
		}
		return aliases;
	}
	
	public Map<String, String> getConnectionDetails(String alias) {
		OrafileVal theapplication = tns.get(alias).get(0);
		System.out.println(theapplication);
		//System.out.println(new OrafileRenderer().renderFile(tns));
		List<Map<String, String>> values = theapplication
	            .findParamAttrs("ADDRESS", Arrays.asList("host","port","PROTOCOL","SERVER","SERVICE_NAME"));
		return values.iterator().next();
	}
	
	public static void main(String[] args) throws IOException, RecognitionException {
		TNSreader re=new TNSreader();
		List<String> aliases=new ArrayList<>();
		//aliases=re.getAliasNames();
		//System.out.println(aliases);
		Map<String, String> map=re.getConnectionDetails("EXTPROC_CONNECTION_DATA");
		System.out.println(map);
	}
}
