package constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileManager {
	
	
	static Properties p ;
	
	public static String getProperty(String key)
	{
		p = new Properties();
		try {
			p.load(new FileInputStream(FilePath.getConfigurationfilepath()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return p.getProperty(key);
	}

}
