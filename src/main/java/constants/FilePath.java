package constants;

public class FilePath {
	
	private static final String PROJECT_PATH=System.getProperty("user.dir");
	private static final String RESOURCES_PATH= PROJECT_PATH+"\\src\\test\\resources\\";
	private static final String CONFIGURATIONFILEPATH=RESOURCES_PATH +"configuration.properties";
	
	
	
	public static String getConfigurationfilepath() {
		return CONFIGURATIONFILEPATH;
	}

	
	
	
}
