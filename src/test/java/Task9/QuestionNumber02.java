package Task9;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QuestionNumber02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		        // Initialize ChromeDriver
		        ChromeDriver driver = new ChromeDriver();
		 
		        try {
		            // Maximize the browser window
		            driver.manage().window().maximize();
		 
		            // Navigate to the URL
		driver.get("https://jqueryui.com/droppable");
		 
		            // Switch to the iframe that contains the droppable elements
		            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 
		            // Find the source and target elements
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		 
		            // Perform drag and drop action
		            Actions action = new Actions(driver);
		            action.dragAndDrop(sourceElement, targetElement).perform();
		 
		            // Verify the drag and drop operation was successful
		            // Check if the target element's text has changed to "Dropped!"
		            String targetText = targetElement.getText();
		            if ("Dropped!".equals(targetText)) {
		                System.out.println("Drag and drop operation successful! Text changed to 'Dropped!'");
		            } else {
		                System.out.println("Drag and drop operation failed. Text did not change.");
		            }
		 
		            // Check the color of the target element to ensure it has changed
		            String backgroundColor = targetElement.getCssValue("background-color");
		            System.out.println("Background color after drop: " + backgroundColor);
		 
		        } finally {
		            // Close the browser and quit WebDriver instance
		            //driver.quit();
		        }
	}

}
