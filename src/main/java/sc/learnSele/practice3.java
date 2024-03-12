package sc.learnSele;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initiate chrome browser
		System.setProperty("webriver.chrome.driver",
				"C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String prod = "Carrot";
		
		// Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		giveVeg(driver, prod);
		
		
		/*if (driver.findElement(By.xpath("//strong[normalize-space()='1']")).equals(1)) {
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			String[] name = driver.findElement(By.xpath("//p[@class='product-name']")).getText().split("-");
			String formattedName = name[0].trim();
			if (formattedName.contains(prod)) {
				System.out.println(prod + " is added to Kart");
			}
		}*/

	}

	public static void giveVeg(WebDriver driver, String prod) throws InterruptedException
	{
		

		// select the search button
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(prod);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
	
	
	
}
