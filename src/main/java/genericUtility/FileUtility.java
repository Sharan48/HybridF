package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{

	public String getPropertykeyvalue(String key) throws IOException
	{
		FileInputStream ns=new FileInputStream("./Property.properties");
		Properties ps=new Properties();
		ps.load(ns);
		String ky = ps.getProperty(key);
		return ky;
	}
}
