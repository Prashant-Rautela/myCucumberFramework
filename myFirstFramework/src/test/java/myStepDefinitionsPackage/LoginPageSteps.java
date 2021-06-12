package myStepDefinitionsPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import myUtilities.driverFactory;
import myPages.LoginPage;

public class LoginPageSteps {
	
	
	private LoginPage loginPage = new LoginPage(driverFactory.getdriver());
	
		
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driverFactory.getdriver().get("http://automationpractice.com/index.php");
		
	}

	@Then("Title of the page is {string}")
	public void title_of_the_page_is(String pageTitle) {
		
		String actualTitle = loginPage.getPagetitle();
		String expectedTitle = pageTitle;
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	    
	}

	@Then("User verifies forgot password link")
	public void user_verifies_forgotPassword() {
		loginPage.clickSignInLink();		
		Assert.assertTrue(loginPage.isForgotLinkPasswordPresent());

	}

	
	@When("User enters {string}")
	public void user_enters_username(String username) {
		loginPage.clickSignInLink();
	    loginPage.enterUserName(username);
	}

	@When("user enters {string}")
	public void user_enters_password(String pwd) {
	    loginPage.enterPassword(pwd);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickSubmitButton();
	}

	@Then("User gets the title of the home page is {string}")
	public void user_gets_the_title_of_the_home_page_is(String expectedTitle) {
	    
		String actualTitlePage = loginPage.getPagetitle();
		
		Assert.assertTrue(actualTitlePage.equals(expectedTitle));
		
		}

	

}
