package sc.learnSele;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyKart {
	
	public static void addItems(WebDriver driver, String[] listOfVegetables )
	{
		
		int j=0;
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			String[] productName = products.get(i).getText().split("-");
			String formattedName = productName[0].trim();
			
			List al = Arrays.asList(listOfVegetables);
			
		
			if(al.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break; cannot be used with ArrayList
				
				if(j==listOfVegetables.length)
				{
					break;
				}
				
				
			}
			
		
		}

		System.out.println("Items added to Kart");	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		String[] listOfVegetables = {"Cucumber", "Potato", "Corn", "Pumpkin"};
		
		addItems(driver,listOfVegetables);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		if(driver.findElement(By.className("promoInfo")).getText().contains("Code applied"))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		
		
		
}
}

