package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver", "/Users/jeetc/OneDrive/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("sunny");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("sunny");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Soumojeet");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jeetchak@outlook.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sunnyc@gmail.com");
		//driver.findElement(By.xpath("//button[@id='visitUSOne']")).click();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1223334444");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("sunny");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
	}

}
