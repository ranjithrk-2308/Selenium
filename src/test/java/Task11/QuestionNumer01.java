package Task11;
import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionNumer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Select Click here:
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		//Fluent Wait or Web driver Wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// Getting the page title:
		@Nullable String title = driver.getTitle();
		System.out.println(title);
		
		// Verifying the screen name:
		
		
		// Closing the new Window:
		driver.close();
		*/
		WebDriver driver = new ChromeDriver();
        
        try {
            // Step 2: Navigate to the URL
        	driver.get("https://the-internet.herokuapp.com/windows");
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
            // Step 3: Click the "Click Here" button to open a new window
            WebElement clickHereButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
            clickHereButton.click();
 
            // Step 4: Switch to the newly opened window
            String originalWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            String newWindow = null;
            
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    newWindow = windowHandle;
                    driver.switchTo().window(newWindow);
                    break;
                }
            }
 
            // Step 5: Verify that the text "New Window" is present on the page
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Text 'New Window' is present in the new window.");
            } else {
                System.out.println("Text 'New Window' is NOT present.");
            }
 
            // Step 6: Close the new window
            driver.close();
 
            // Step 7: Switch back to the original window and verify it's active
            driver.switchTo().window(originalWindow);
            if (driver.getTitle().contains("The Internet")) {
                System.out.println("Original window is active.");
            } else {
                System.out.println("Original window is NOT active.");
            }
 
        } finally {
            // Step 8: Close the browser instance
           // driver.quit();
        	System.out.println("End of the Program :");
        }
    }
		
	}

