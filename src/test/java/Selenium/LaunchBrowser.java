package Selenium;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// Step 1: launch the Browser.
		
		ChromeDriver driver = new ChromeDriver();
		
		// Loading the URL in Chrome.
		driver.get("https://www.amazon.in/");

		// How to maximize the browser:
		driver.manage().window().maximize();
		
		// adding wait buffer.
		
		//Trying to click the button.
		WebElement siginin = 	driver.findElement(By.xpath("/html/body"));
		siginin.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		String title = driver.getTitle();
		System.out.println("Page Title is : " +title);
		
		//Closing the Browser.
		
	}

}
