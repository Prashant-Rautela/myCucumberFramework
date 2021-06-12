package runnersPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\java\\myFeatureFilesPackage"},
		glue = {"myStepDefinitionsPackage", "hooksPackage"},
		plugin = {"pretty"},
		publish = true
		//tags = "@Regression",
		//dryRun = true
		)

public class runnerClass {

}
