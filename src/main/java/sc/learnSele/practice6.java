package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
