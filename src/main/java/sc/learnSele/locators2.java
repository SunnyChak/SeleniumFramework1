package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "jena";
		System.setProperty("webriver.chrome.driver", "/Users/jeetc/OneDrive/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	     String pwd = getPassword(driver);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("jena");
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[name='chkboxOne']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();	
		
		
	}

	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		String[] passwordArray = passwordText.split("'");
		String[] passwordArray2 = passwordArray[1].split("'");
		return passwordArray2[0];
		
	}
	
	
	
	
}
