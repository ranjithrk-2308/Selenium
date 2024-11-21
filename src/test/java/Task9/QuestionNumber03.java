package Task9;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class QuestionNumber03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 
	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();
	 
	            // Launch the Guvi website
	            driver.get("https://www.guvi.in");
	 
	            // Wait until the page loads
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	            // Locate and click the Signup button on the top right corner
	           driver.findElement(By.id("login-btn")).click();
	 
	            // Fill in the Sign up form
				
				driver.findElement(By.id("email")).sendKeys("ranjithkumaralaguchamy23081999@gmail.com");
				driver.findElement(By.id("password")).sendKeys("Ranjith@1234");
	 
	            // Submit the Sign up form
	            WebElement signupSubmitButton = driver.findElement(By.id("login-btn"));
	            signupSubmitButton.click();
	 
	            //Finding the Page title:
	            String title = driver.getTitle();
	            System.out.println(title);
	            
	 
	            // Verify registration success by checking page title or specific element (assumed here as "Welcome" in title)
	            if (title.equals("GUVI | Login")) {
	                System.out.println("Signup successful!");
	            } else {
	                System.out.println("Signup failed.");
	            }
	 
	 
	        } finally {
	            // Close the browser
	        	driver.quit();
	            
	         }
	}
}
