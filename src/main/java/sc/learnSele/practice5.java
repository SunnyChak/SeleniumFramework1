package sc.learnSele;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".heading"))).isDisplayed();
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Window"))).isDisplayed();
		
		String text1 = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(text1);
		
		driver.switchTo().window(parentId);
		
		String text2 = driver.findElement(By.cssSelector("div[id='content'] div h3")).getText();
		System.out.println(text2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
