package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC extends BaseClass {

	
	@Test
	public void testOne(){
		driver.get("www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		System.out.println("DONE....");
	}
}
