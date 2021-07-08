package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchPage {

	private WebDriver driver;
	
	//Object repositories
	
	private By signLink = By.className("login");
	private By contactUsLink = By.linkText("Contact us");
	
	
	//Constructor
	public LaunchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	//Actions for the Launch Page
	
	public String verifyLaunchPageTitle() {
		
		String launchPageTitle = driver.getTitle();
		return launchPageTitle;
		
	}
	
	public boolean isSignInLinkPresent() {
		
		boolean signLinkVisibilityFlag = driver.findElement(signLink).isDisplayed();
		return signLinkVisibilityFlag;
		
	}
	
public boolean isContactUsLinkPresent() {
		
		boolean signLinkVisibilityFlag = driver.findElement(contactUsLink).isDisplayed();
		return signLinkVisibilityFlag;
		
	}
	
	
	
}
