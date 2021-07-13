package ParallelPackage;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import myPages.LaunchPage;
import myUtilities.DriverFactory;

public class LaunchPageStepsDefinition {
	
	
	
	private LaunchPage launchpage = new LaunchPage(DriverFactory.getDriver());
	

	@When("User enters website URL")
	public void user_enters_website_url() {
	    
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
		
	}

	
	@Then("Title of the page is {string}")
	public void title_of_the_page_is(String expectedTitle) {
	   
		String actualTitleOfLaunchPage = launchpage.verifyLaunchPageTitle();
		System.out.println("Title of the page is: "+ actualTitleOfLaunchPage);
		Assert.assertEquals("hero", actualTitleOfLaunchPage);
		
		
	}

	@Then("Sign in link is visible")
	public void sign_in_link_is_visible() {
	    
		boolean isSignInLinkVisible = launchpage.isSignInLinkPresent();
		Assert.assertEquals(isSignInLinkVisible, true);
		
	}

	@Then("Contact Us link is visible")
	public void contact_us_link_is_visible() {
		
		boolean isContactUsLinkVisible = launchpage.isContactUsLinkPresent();
		Assert.assertEquals(isContactUsLinkVisible, true);
	}

}
