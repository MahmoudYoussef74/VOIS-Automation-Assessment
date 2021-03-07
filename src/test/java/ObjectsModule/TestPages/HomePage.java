package ObjectsModule.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	//variables
	WebDriver BrowserObject;
	String Url = "http://automationpractice.com/index.php";

	// element locators
	By SignInBtn = By.className("header_user_info");
	
	//functions
	public HomePage(WebDriver BrowserObject) {
		this.BrowserObject = BrowserObject;
		
	}
	
	public void AssertHomePageUrl(){
		String URL = BrowserObject.getCurrentUrl();
		Assert.assertEquals(URL, Url );
	}
	
	public void navigatetoUrl() {
		
		BrowserObject.navigate().to(Url);
	}
	
	public void SignInRedirect() {
		
		BrowserObject.findElement(SignInBtn).click();	
	}

}
