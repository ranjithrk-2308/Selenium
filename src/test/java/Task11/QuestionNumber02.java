package Task11;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class QuestionNumber02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		try {
            // Step 1: Open the specified URL
			driver.get("http://the-internet.herokuapp.com/nested_frames");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
            // Step 2: Switch to the top frame and verify there are three frames
            driver.switchTo().frame("frame-top"); // Locate top frame by name
            WebElement leftFrame = driver.findElement(By.cssSelector("frame[src='/frame_left']"));
            WebElement middleFrame = driver.findElement(By.cssSelector("frame[src='/frame_middle']"));
            WebElement rightFrame = driver.findElement(By.cssSelector("frame[src='/frame_right']"));
 
            if (leftFrame != null && middleFrame != null && rightFrame != null) {
                System.out.println("Verified: Three frames are present on the page.");
            } else {
                System.out.println("Error: Three frames not found.");
            }
 
            // Step 3: Switch to the left frame and verify it has text "LEFT"
            driver.switchTo().frame(leftFrame);
            WebElement leftText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
            if (leftText != null) {
                System.out.println("Verified: Left frame contains text 'LEFT'.");
            } else {
                System.out.println("Error: Text 'LEFT' not found in left frame.");
            }
 
            // Step 4: Switch back to the top frame
            driver.switchTo().parentFrame();
 
            // Step 5: Switch to the middle frame and verify it has text "MIDDLE"
            driver.switchTo().frame(middleFrame);
            WebElement middleText = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
            if (middleText != null) {
                System.out.println("Verified: Middle frame contains text 'MIDDLE'.");
            } else {
                System.out.println("Error: Text 'MIDDLE' not found in middle frame.");
            }
 
            // Step 6: Switch back to the top frame
            driver.switchTo().parentFrame();
 
            // Step 7: Switch to the right frame and verify it has text "RIGHT"
            driver.switchTo().frame(rightFrame);
            WebElement rightText = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
            if (rightText != null) {
                System.out.println("Verified: Right frame contains text 'RIGHT'.");
            } else {
                System.out.println("Error: Text 'RIGHT' not found in right frame.");
            }
 
            // Step 8: Switch back to the top frame
            driver.switchTo().parentFrame();
 
            // Step 9: Switch to the bottom frame and verify it has text "BOTTOM"
            driver.switchTo().defaultContent(); // Switch to main content to locate bottom frame
            driver.switchTo().frame("frame-bottom");
            WebElement bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
            if (bottomText != null) {
                System.out.println("Verified: Bottom frame contains text 'BOTTOM'.");
            } else {
                System.out.println("Error: Text 'BOTTOM' not found in bottom frame.");
            }
 
            // Step 10: Switch back to the top frame and verify the page title
            driver.switchTo().defaultContent(); // Switch back to the main page
            
            // Finding weather the Title is Frames: 
            String title = driver.getTitle();
            System.out.println("The title of the page is : "+title);
            
            //Verifying the Title match : 
            if (driver.getTitle().equals("Frames")) {
                System.out.println("Verified: Page title is 'Frames'.");
            } else {
                System.out.println("Error: Page title is not 'Frames'.");
            }
 
        } finally {
            //driver.quit();
        	System.out.println("End of the Program :");
        }	
	}
}
