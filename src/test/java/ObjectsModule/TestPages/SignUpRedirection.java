package ObjectsModule.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpRedirection {
	//variables
	WebDriver BrowserObject;
	String Url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String email = "mahmoud.youseff74@gmail.com";
	String password = "12345678";

	//elementlocators
	
	By CreateAccountbtn = By.name("SubmitCreate");
	By EmailField = By.name("email_create");
	By SignInEmail = By.name("email");
	By Password = By.name("passwd");
	By LoginSubmitBtn = By.id("SubmitLogin");
	
	//functions
	
	public SignUpRedirection(WebDriver BrowserObject) {
		this.BrowserObject = BrowserObject;
		
	}
	
	public void AssertHomePageUrl(){
		String URL = BrowserObject.getCurrentUrl();
		Assert.assertEquals(URL, Url );
	}
	
	public void navigatetoUrl() {
		
		BrowserObject.navigate().to(Url);
	}
	
	public void CreateAcocuntRedir() {
		
		BrowserObject.findElement(EmailField).sendKeys(email);
		BrowserObject.findElement(CreateAccountbtn).click();	
	}

public void ValidSignIn() {
		
		BrowserObject.findElement(SignInEmail).sendKeys(email);
		BrowserObject.findElement(Password).sendKeys(password);
		BrowserObject.findElement(LoginSubmitBtn).click();	
	}
}
