package sc.learnSele;

import java.time.Duration;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Initiate chrome browser
		System.setProperty("webriver.chrome.driver",
				"C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
