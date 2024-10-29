package Task8;
import java.time.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class QuestionNumer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		// Max Window:
		driver.manage().window().maximize();
		
		// Searching the AI:
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("/html/body/main/div[2]/form/fieldset/button/i")).click();
		
		driver.findElement(By.id("toc-History")).click();
		String str = driver.getTitle();
		System.out.println(str);
	}
}
