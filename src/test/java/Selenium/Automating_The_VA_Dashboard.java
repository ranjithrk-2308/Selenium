package Selenium;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automating_The_VA_Dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// Step 1: launch the Browser.
		
		WebDriver driver = new EdgeDriver();
		
// Loading the URL in Chrome.
		driver.get("http://10.17.30.185/navigator/#/dashboard");

// How to maximize the browser:
		driver.manage().window().maximize();
		
// adding wait buffer.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//Trying to click the button.
		driver.findElement(By.xpath("//button['md-raised md-primary md-button md-ink-ripple']")).click();
		String title = driver.getTitle();
		System.out.println("Page Title is : " +title);
		
// Sending keys.
		WebElement username = driver.findElement(By.id("login_username"));
		username.sendKeys("administrator");
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys("welcome");
		
		driver.findElement(By.id("auth-login-page-button")).click();
		driver.findElement(By.id("side-menu-button-2000")).click();

		driver.findElement(By.id("side-menu-button-2060")).click();
		driver.findElement(By.id("add-bank")).click();
		
	//driver.findElement(By.id("add-rule")).click();
	//driver.findElement(By.id("ms-rules-edit-page-es-panel-body-es-field-edit-2-select-ruleType")).click();
		driver.findElement(By.name("bankName")).sendKeys("Test Bank");
		driver.findElement(By.name("routingNumber")).sendKeys("011103093");
		driver.findElement(By.id("global-bank-edit-page-es-heading-button")).click();

	}

}
