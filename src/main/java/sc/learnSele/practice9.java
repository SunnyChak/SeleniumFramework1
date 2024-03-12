package sc.learnSele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(2000);
		
		WebElement table=driver.findElement(By.id("product"));



		System.out.println(table.findElements(By.tagName("tr")).size());



		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
