package learnSelenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learnSelenium.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{

	 WebDriver driver;
	 
	 public LoginPage(WebDriver driver)
	 {
		 super(driver);
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	//WebElement userEmail= driver.findElement(By.id("userEmail"));
	//page factory model
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passWord; 
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginWebsite(String email, String password)
	{
		
		userEmail.sendKeys(email);
		passWord.sendKeys(password);
		submit.click();
		
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
