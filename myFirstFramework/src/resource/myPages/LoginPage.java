package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	/// By locators of the login page
	private By emailId = By.id("email");
	private By password = By.id("paswd");
	private By signInButton = By.id("SubmitLogin");
	private By lnkforgotPassword = By.xpath("*//a[contains(text(), 'Forgot your password?')]");
	private By signInLink = By.xpath("*//a[contains(text(), 'Sign in')]");

	// constructor of the class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/// page actions methods

	public String getPagetitle() {

		return driver.getTitle();

	}
	
	public void clickSignInLink() {
		driver.findElement(signInLink).click();
	}

	public boolean isForgotLinkPasswordPresent() {
		
		return driver.findElement(lnkforgotPassword).isDisplayed();
	}

	public void enterUserName(String username) {

		driver.findElement(emailId).sendKeys(username);

	}

	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void clickSubmitButton() {

		driver.findElement(signInButton).click();

	}

}
