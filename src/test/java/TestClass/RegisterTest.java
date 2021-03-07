package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectsModule.TestPages.HomePage;
import ObjectsModule.TestPages.LandingPage;
import ObjectsModule.TestPages.SignUpPage;
import ObjectsModule.TestPages.SignUpRedirection;


public class RegisterTest {
	WebDriver BrowserObject ;
	SignUpRedirection SignUpRedir;
	HomePage Home;
	SignUpPage SignUp;
	LandingPage landing;

	@BeforeMethod
	public void Setup() {
		//Initialize browse object
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
		BrowserObject = new ChromeDriver();
		BrowserObject.manage().window().maximize();
	}

	@Test (priority = 1)
	public void  AssertRegistration() throws InterruptedException {
		
		Home = new HomePage(BrowserObject);
		Home.navigatetoUrl();
		Home.SignInRedirect();

		SignUpRedir = new SignUpRedirection(BrowserObject);
		SignUpRedir.CreateAcocuntRedir();
		SignUp = new SignUpPage(BrowserObject);
		
		Thread.sleep(7000);
		SignUp.FillDetails();
		SignUp.choseDates();
		SignUp.choseState();
		SignUp.register();

	}
	@Test (priority = 2)
		public void  AssertLoggingCheckout() throws InterruptedException {
		// navigate to google home page and assert the page title
			Home = new HomePage(BrowserObject);
			Home.navigatetoUrl();
			Home.SignInRedirect();

			SignUpRedir = new SignUpRedirection(BrowserObject);
			SignUpRedir.ValidSignIn();
			
			landing = new LandingPage(BrowserObject);
			landing.addItem();		
		}

		@AfterMethod
		public void quit() {
			BrowserObject.quit();
		}

}
