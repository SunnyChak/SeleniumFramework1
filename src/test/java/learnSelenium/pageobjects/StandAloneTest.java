package learnSelenium.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//browse to website url
		
		String productName = "ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goTo();
		
		//login to website
		loginPage.loginWebsite("sunny.123@gmail.com", "Jena@1992");
		
		
		// grab products from website

		productCatalog productCatalogue = new productCatalog(driver);
		List<WebElement> products = productCatalogue.getProductList();
		
		
		productCatalogue.addProductToCart(productName);
		

		
		
		
		//wait until the toast message Added to cart is shown below
		

		
		driver.findElement(By.cssSelector("[routerlink*=cart]")).click();
		
		//got to cart page and check the text of the product added
		
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		
		Boolean match= cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		
		//after match, click on checkout
		
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		//payment method page
		
	
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build().perform();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		
		//click on checkout
		
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		//capture order message
		
		String confirmMsg = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		//Close the browser
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
