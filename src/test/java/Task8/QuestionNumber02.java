package Task8;
import java.time.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class QuestionNumber02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Opening the DemoBlaze link:
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		// Max the Browser:
		driver.manage().window().maximize();
		
		// Getting the title of the page:
		String str = driver.getTitle();
		System.out.println("The Title of the page is : " + str);
		
		if (str.equalsIgnoreCase("STORE")) {
			System.out.println("Page Loaded on correct website  : " + str);
		}else {
			System.out.println("The page not loaded on correct site : " + str);
		}	
	}
}
