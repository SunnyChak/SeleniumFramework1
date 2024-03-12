package sc.learnSele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		int sum = 0;
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		
		String[] sumval = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
		String finalval = sumval[1].trim();
		int value = Integer.parseInt(finalval);
		
		Assert.assertEquals(sum, value);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
