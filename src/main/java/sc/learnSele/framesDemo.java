package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class framesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//frames
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("draggable")).click();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
