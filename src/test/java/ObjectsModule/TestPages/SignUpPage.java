package ObjectsModule.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SignUpPage  {

	//variables
	WebDriver BrowserObject;
	Select select;
	String Url = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	String firstname = "mahmoud";
	String lastname = "jou";
	String password = "12345678";
	String address = "mahmoudjou25 st";
	String city = "City";
	String postal = "00000";
	String mobile = "01008249151";
	String alias = "Jou";
	String state ="Utah";
	String day = "10";
	String month ="12";
	String year = "1993";

	//elementlocators

	By MaleGenderBtn = By.id("id_gender1");
	By FirstNameField = By.id("customer_firstname");
	By LastNameField = By.id("customer_lastname");
	By PasswordField = By.id("passwd");
	By AddFirstnameField = By.id("firstname");
	By AddLastField = By.id("lastname");
	By AddressField = By.id("address1");
	By CityField = By.id("city");
	By State =By.id("id_state");
	By postcodeField = By.id("postcode");
	By phoneField = By.id("phone_mobile");
	By aliasField = By.id("alias");
	By RegisterBtn = By.id("submitAccount");
	By Day = By.id("days"); 
	By Month = By.id("months");
	By Year = By.id("years");

	//functions

	public SignUpPage(WebDriver BrowserObject) {
		this.BrowserObject = BrowserObject;

	} 


	public void AssertHomePageUrl(){
		String URL = BrowserObject.getCurrentUrl();
		Assert.assertEquals(URL, Url );
	}

	public void navigatetoUrl() {

		BrowserObject.navigate().to(Url);
	}

	public void FillDetails() {

		BrowserObject.findElement(MaleGenderBtn).click();
		BrowserObject.findElement(FirstNameField).sendKeys(firstname);
		BrowserObject.findElement(LastNameField).sendKeys(lastname);
		BrowserObject.findElement(PasswordField).sendKeys(password);
		BrowserObject.findElement(AddFirstnameField).sendKeys(firstname);
		BrowserObject.findElement(AddLastField).sendKeys(lastname);
		BrowserObject.findElement(AddressField).sendKeys(address);
		BrowserObject.findElement(CityField).sendKeys(city);
		BrowserObject.findElement(postcodeField).sendKeys(postal);
		BrowserObject.findElement(phoneField).sendKeys(mobile);
		BrowserObject.findElement(aliasField).sendKeys(alias);

	}
	public void choseState() {
	
		Select drpState = new Select(BrowserObject.findElement(State));
		drpState.selectByVisibleText(state);
	}
	public void choseDates() {
		
		Select drpDateDay = new Select(BrowserObject.findElement(Day));
		drpDateDay.selectByValue(day);
		
		Select drpDateMonth = new Select(BrowserObject.findElement(Month));
		drpDateMonth.selectByValue(month);
		
		Select drpDateYear = new Select(BrowserObject.findElement(Year));
		drpDateYear.selectByValue(year);
	}
	

		public void register() {
			BrowserObject.findElement(RegisterBtn).click();	
		} 
	}
