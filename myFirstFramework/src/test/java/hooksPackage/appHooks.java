package hooksPackage;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import myUtilities.driverFactory;
import myUtilities.propertyReaderClass;

public class appHooks {
	
	private driverFactory driverfactory;
	private WebDriver driver;
	private propertyReaderClass propReader;
	private Properties prop;
	
	
	@Before (order = 0)
	public void getProperty() {
		
		propReader = new propertyReaderClass();
		try {
			prop = propReader.initialiseProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Before (order = 1)
	public void launchBrowser() {
		
		String browserName = prop.getProperty("browser");
		driverfactory = new driverFactory();
		driver = driverfactory.initialiseDriver(browserName);
	}
	
	
	@After (order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	
	@After (order = 1)
	public void tearDown (Scenario scenario) {
		if (scenario.isFailed()) {
			System.out.println("test case is failed");
			//take screenshot	
			
		}
	}

}
