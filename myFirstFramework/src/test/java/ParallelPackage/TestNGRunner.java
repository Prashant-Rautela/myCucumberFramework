package ParallelPackage;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features = {"src/resource/ParallelPackage/LaunchPage.feature"},
		glue = {"ParallelPackage"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed.txt"},
		monochrome = true
		
		)

public class TestNGRunner extends AbstractTestNGCucumberTests{

	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	
}

