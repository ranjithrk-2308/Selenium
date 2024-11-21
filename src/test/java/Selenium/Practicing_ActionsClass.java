package Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicing_ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Storing the value in WEB Element:
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// Actions class Object;
		Actions action = new Actions(driver);
		action.contextClick(rightclick).perform();
		
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		action.click(edit).perform();
		
	}

}
