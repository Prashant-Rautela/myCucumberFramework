package ParallelPackage;


import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import myUtilities.DriverFactory;
import myUtilities.propertyReaderClass;

public class myApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private propertyReaderClass propReader;
	private Properties property;

	@Before(order = 0)
	public void getProperty() {

		propReader = new propertyReaderClass();
		
		try {
			property = propReader.initialiseProperties();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Before(order = 1)

	public void launchBrowser() {

		String browserName = property.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);

	}

	@After(order = 1)
	public void takeScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", screenshotName);

		}

	}

	@After(order = 0)
	public void quiteBrowser() {
		driver.quit();
	}
}
