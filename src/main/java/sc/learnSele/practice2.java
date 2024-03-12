package sc.learnSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//Type name
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Jena");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jeetchak@outlook.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sunny123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(staticDropdown);
		gender.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("19920523");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success.alert-dismissible")).getText());
		
		if(driver.findElement(By.cssSelector(".alert-success.alert-dismissible")).getText().contains("Success! The Form has been submitted successfully!."))
		{
			System.out.println("PASS");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("FAIL");
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
