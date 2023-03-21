package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class EditLead extends Baseclass{
@Test
	public  void Editleaddata() throws InterruptedException {
		
	
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Find Leads")).click();
		Driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("44");
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Driver.findElement(By.linkText("Edit")).click();
		Driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		Driver.findElement(By.name("submitButton")).click();
	
}
}






