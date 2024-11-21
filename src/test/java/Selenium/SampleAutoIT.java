package Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAutoIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Clicking the PDF to word option in the page:
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		driver.findElement(By.xpath("//a[@title='Add more files']")).click();
			
	}
}
