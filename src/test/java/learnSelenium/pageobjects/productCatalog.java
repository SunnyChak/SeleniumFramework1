package learnSelenium.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learnSelenium.AbstractComponents.AbstractComponent;

public class productCatalog extends AbstractComponent{

	WebDriver driver;
	
	public productCatalog(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//List<WebElement> productList = driver.findElements(By.cssSelector(".mb-3"));
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By toastMessage =  By.cssSelector("#toast-container");
	
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productsBy);
		return products;
	}
	
	
	public WebElement getproductByName(String productName)
	{
		WebElement prod1 = getProductList().stream().filter(product-> product.findElement(By.cssSelector("b"))
		.getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		return prod1;
	}
	
	public void addProductToCart(String productName)
	{
		WebElement prod1 = getproductByName(productName);
		prod1.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		waitForElementToAppear(toastMessage);
		waitForElementToDiasappear(spinner);
		
	}
	
	
	
}
