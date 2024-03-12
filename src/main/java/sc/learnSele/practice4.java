package sc.learnSele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practice4 {

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
		
		//login page login
		
		String a = "rahulshettyacademy";
		String b = "learning";
		
		driver.findElement(By.id("username")).sendKeys(a);
		driver.findElement(By.id("password")).sendKeys(b);
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select options = new Select(dropdown);
		options.selectByIndex(2);
		//driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn btn-success']")).isDisplayed())
		{
			Assert.assertTrue(true);
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		
		
		
		
		
		
	}

}
