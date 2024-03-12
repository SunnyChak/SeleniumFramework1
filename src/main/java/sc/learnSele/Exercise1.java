package sc.learnSele;

import java.time.Duration;
import java.util.Set;

import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			Thread.sleep(5000);
		}
			
		Set<String> wh = driver.getWindowHandles();
			
		Iterator<String> it = wh.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		
		
		
		
		
	}

}
