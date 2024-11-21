package Selenium;

import org.openqa.selenium.By;

public class AddBank {
	
	public void addbank () {
		driver.findElement(By.id("add-bank")).click();
		
		//driver.findElement(By.id("add-rule")).click();
		//driver.findElement(By.id("ms-rules-edit-page-es-panel-body-es-field-edit-2-select-ruleType")).click();
			driver.findElement(By.name("bankName")).sendKeys("Test Bank");
			driver.findElement(By.name("routingNumber")).sendKeys("011103093");
			driver.findElement(By.id("global-bank-edit-page-es-heading-button")).click();
	}
		
}
