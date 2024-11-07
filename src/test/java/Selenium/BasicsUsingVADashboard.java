package Selenium;
import java.time.Duration;
import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsUsingVADashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		// Loading the URL in Chrome.
		driver.get("http://10.17.30.185/navigator/#/dashboard");

		// How to maximize the browser:
		driver.manage().window().maximize();
		
// adding wait buffer.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button['md-raised md-primary md-button md-ink-ripple']")).click();
// Logging to the dashboard:
		WebElement username = driver.findElement(By.id("login_username"));
		username.sendKeys("administrator");
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys("welcome");	
		driver.findElement(By.id("auth-login-page-button")).click();
		
// Iterating the loop to find all the links in the page: 
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//for (WebElement ele : links) {
		//	System.out.println(ele.getText());
			
		//}	
		driver.findElement(By.id("es-main-menu-button-2")).click();
		
		driver.findElement(By.id("global-connection-info-dialog-es-modal-button")).click();	
	}
}
