package Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleAmazonTryAndError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Trying the CSS selector.
		//driver.findElement(By.cssSelector("a[href='/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3']")).click();
		
		// Trying it with Xpath:
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		String str = driver.getTitle();
		System.out.println(str);
		// Clicking the add money option using Xpath:
		driver.findElement(By.xpath("//*[@id=\"AddMoney\"]/div[2]/span/a/span")).click();
	}

}
