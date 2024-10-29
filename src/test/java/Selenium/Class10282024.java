package Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10282024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		// Opening Amazon link
		driver.get("https://www.amazon.in/");
		// Wait for 15 seconds: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Searching iphone 16 plus: 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ipnone 16 plus");
		Thread.sleep(300);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(300);

		driver.findElement(By.id("a-autoid-1-announce")).click();
		Thread.sleep(300);

		driver.findElement(By.id("nav-cart-text-container")).click();
		

	}

}
