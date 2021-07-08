package myUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyReaderClass {
	
	private Properties prop;
	
	public Properties initialiseProperties() throws IOException {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\raute\\eclipse-workspace\\myCucumberFramework\\myCucumberFramework\\myFirstFramework\\src\\test\\java\\configurationFile\\config.properties");
			prop.load(ip);
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}


}
