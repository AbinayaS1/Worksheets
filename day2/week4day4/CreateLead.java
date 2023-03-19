package week4day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class CreateLead extends Baseclass {
@Test
	public void createleaddata() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf@gmail.com");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("victor");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("44");
		driver.findElement(By.name("submitButton")).click();
		
}
}






