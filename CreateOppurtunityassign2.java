package week5day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateOppurtunityassign2 extends Baseclass1 {
@Test
	public void missingelements() {
	
	 d.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("4/17/2023");
	 d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	String alert = d.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
	 System.out.println(alert);
		
	}

}
