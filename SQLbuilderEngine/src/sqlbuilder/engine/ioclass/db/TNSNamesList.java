/**
 * 
 */
package sqlbuilder.engine.ioclass.db;

/**
 * @author Sourav created on Jan 26, 2016
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TNSNamesList {
	
	private String TNSPath="C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\NETWORK\\ADMIN\\TNSNAMES.ORA";
	
	public void TNSList() {
		BufferedReader br = null;
		String pattern = "^([^#()\\W ][a-zA-Z0-9.]*(?:[.][a-zA-Z]*\\s?=)?)"; //Regular Expression Pattern for TNS Alias
		Pattern r = Pattern.compile(pattern);
		 
		try 
		{
 
			String sCurrentLine; 
			br = new BufferedReader(new FileReader(TNSPath)); 
			while ((sCurrentLine = br.readLine()) != null) 
			{
				//System.out.println(sCurrentLine);
				Matcher matcher = r.matcher(sCurrentLine);
				if(matcher.find())
				{					
					System.out.println(matcher.group().toUpperCase());				
				}
			}
 
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)br.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		TNSNamesList list=new TNSNamesList();
		list.TNSList();
		
	}	
}