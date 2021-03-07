package ObjectsModule.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LandingPage {
	//variables
	WebDriver BrowserObject;
	Actions action;

	//element locators
	By tshirtsCat = By.linkText("T-SHIRTS");
	By tshirt = By.xpath("//img[contains(@title, 'Faded Short Sleeve T-shirts')]");
    By addToCart = By.xpath("//*[contains(text(), 'Add to cart')]");
    By proceedframeBtn = By.xpath("//*[contains(text(), 'Proceed')]");
    By proceedBTN = By.xpath("//*[contains(@class, 'standard-checkout')]");
    By proceedBTN2 = By.xpath("//button[@name = 'processAddress']");
    By proceedBTN3 = By.xpath("//button[@name = 'processCarrier']");
    By agree = By.xpath("//input[@name = 'cgv']");
    By checkpayBtn = By.xpath("//*[contains(text(), 'Pay by check')]");
    By confirmOrder = By.xpath("//*[contains(text(), 'confirm')]");

	
	//functions
    public LandingPage(WebDriver BrowserObject) {
    	
	this.BrowserObject = BrowserObject;
	}
    

    public void addItem() throws InterruptedException {

		BrowserObject.findElement(tshirtsCat).click();
		BrowserObject.findElement(tshirt).click();
		Thread.sleep(7000);
		WebElement frame = BrowserObject.findElement(By.xpath("//iframe[contains(@class, 'fancybox')]"));
		BrowserObject.switchTo().frame(frame);
		BrowserObject.findElement(addToCart).click();
		Thread.sleep(5000);
		BrowserObject.findElement(proceedframeBtn).click();
		Thread.sleep(3000);
		BrowserObject.findElement(proceedBTN).click();
		BrowserObject.findElement(proceedBTN2).click();
		BrowserObject.findElement(agree).click();
		BrowserObject.findElement(proceedBTN3).click();
		BrowserObject.findElement(checkpayBtn).click();
		BrowserObject.findElement(confirmOrder).click();
	}


	


}
