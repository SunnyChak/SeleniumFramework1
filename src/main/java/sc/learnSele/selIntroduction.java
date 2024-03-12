package sc.learnSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class selIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webriver.chrome.driver", "/Users/jeetc/OneDrive/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		
		
		
		
	}
	
	public String getData1()
	{
		System.out.println("Jena is a good girl");
		return "Cool";
	}

	
	
	
}
