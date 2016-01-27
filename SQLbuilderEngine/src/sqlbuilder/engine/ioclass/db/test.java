/**
 * 
 */
package sqlbuilder.engine.ioclass.db;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.apache.commons.io.FileUtils;

import edu.gatech.gtri.orafile.Orafile;
import edu.gatech.gtri.orafile.OrafileDef;
import edu.gatech.gtri.orafile.OrafileDict;
import edu.gatech.gtri.orafile.OrafileVal;

/**
 * @author Sourav created on Jan 26, 2016
 *
 */
public class test {

	public static void main(String[] args) throws IOException, RecognitionException {
		String str = FileUtils.readFileToString(new File("C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\NETWORK\\ADMIN\\TNSNAMES.ORA"));
		OrafileDict tns=Orafile.parse(str);
		for(OrafileDef map: tns.getNamedParams())
		{
			System.out.println(map.getName());
		}
				
		OrafileVal theapplication = tns.get("xe").get(0);
		System.out.println(theapplication);
		//System.out.println(new OrafileRenderer().renderFile(tns));
		List<Map<String, String>> values = theapplication
	            .findParamAttrs("ADDRESS", Arrays.asList("host","port","PROTOCOL","SERVER","SERVICE_NAME"));

	        System.out.println(values.iterator().next().get("host").toString()); 
	}
}
