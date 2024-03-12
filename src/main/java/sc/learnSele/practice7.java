package sc.learnSele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Initialize driver object for Chrome
		System.setProperty("webriver.chrome.driver", "C://Users//jeetc//OneDrive//Documents//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		
		//Go to website and maximize it
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        
        WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByVisibleText(opt);
        
        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(opt);
        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        
        Thread.sleep(3000);
        String msg = driver.switchTo().alert().getText();
        System.out.println(msg);
        
        String[] a1 = msg.split(",");
        String[] b1 = a1[0].split(" ");
        String c1 = b1[1];
        
        System.out.println(c1);
        
        
		
		
		
		
		
		
		
	}

}
