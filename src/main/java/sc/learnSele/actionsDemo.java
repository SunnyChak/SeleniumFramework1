package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver",
				"C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"))).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
