package Task8;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class QuestionNumber01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// Maximize the browser window:
		
		driver.manage().window().maximize();
		
		// Printing the current URL of the page.
		
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		// Reloading the page:
		driver.navigate().refresh();
		
		// Closing the tab.
		driver.quit();

	}

}
