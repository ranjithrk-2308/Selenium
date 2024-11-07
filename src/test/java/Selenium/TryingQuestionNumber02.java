package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TryingQuestionNumber02 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	// Maximize the Browser window and implicit wait for 15 seconds.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	// Finding the frame:
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	//Storing the Values in 2 elements:
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
	// Using actions class doing the drag and drop:
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	// Validating the drop has performed properly:
		String targettext = target.getText();
		if ("Dropped!".equals(targettext)) {
			System.out.println("The Drop is successfull and the Target Text changed is : " + targettext);			
		}else {
			System.out.println("The Drop is not successfull");
		}
		
		String backgroundColor = targettext.getCssValue("background-color");
         System.out.println("Background color after drop: " + backgroundColor);
	}
}
