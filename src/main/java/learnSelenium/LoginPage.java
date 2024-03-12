package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver driver;
	 
	 public LoginPage(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	//WebElement userEmail= driver.findElement(By.id("userEmail"));
	//page factory model
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement password; 
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginWebsite()
	{
		
		
		
		
		
	}
	
	
}
