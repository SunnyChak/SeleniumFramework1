package sc.learnSele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.mk_latn.No;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initiate chrome browser
		System.setProperty("webriver.chrome.driver",
				"C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();

		// select country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;

			}
		}

		// select radio button
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();

		// select both the cities
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Kolkata (CCU)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))
				.click();

		// select checkbox
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		Assert.assertFalse(false);
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		Assert.assertTrue(true);

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// select date

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			
		{
			System.out.println("PASS for Round Trip");
			Assert.assertTrue(true);
		}

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// select the checkbox with No.class of adults

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		int i = 1;

		while (i < 2) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		// select currency dropdown static dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);

		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.close();

	}

}
