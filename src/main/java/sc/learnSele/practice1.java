package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(true);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertFalse(false);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
