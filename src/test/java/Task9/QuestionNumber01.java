package Task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionNumber01 {

	
		// TODO Auto-generated method stub
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Switching to the i frame contains date picker.
		driver.findElement(By.xpath("a[href=\"https://jqueryui.com/datepicker/\"]")).click();
	} */
		
		
		
	public static void main(String[] args) {
        // Set up the ChromeDriver path
 
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
 
        try {
            // Maximize the browser window
            driver.manage().window().maximize();
 
            // Navigate to the URL
driver.get("https://jqueryui.com/datepicker/");
 
            // Switch to the iframe that contains the datepicker
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
 
            // Open the datepicker
            WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.click();
 
		// Click to navigate to the next month
            WebElement nextButton = driver.findElement(By.cssSelector(".ui-datepicker-next"));
         nextButton.click();
 
            // Select the date "22"
            WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
         date.click();
 
            // Capture the selected date
            String selectedDate = dateField.getAttribute("value");
            System.out.println("Selected date: " + selectedDate);
 
        } finally {
            // Close the browser and quit WebDriver instance
           // driver.quit();
        }
    }
}
