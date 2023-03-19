package week4day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Annotationexercise extends Baseclass1 {
@Test(priority=-1)
	public void Annotation() {
	d.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Sales Automation By Sree");
    String text = d.findElement(By.xpath("(//input[@class='slds-input'])[4]")).getText();
           System.out.println(text);
     d.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("3/17/2023");
     d.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
     d.findElement(By.xpath("(//span[@class='slds-media__body']/span)[4]")).click();
     d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
      String text2 = d.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
    System.out.println(text2);
    if (text2.equals("Sales Automation By Sree")) {
 	   System.out.println("The Oppurtunity name is:"+ text2);
	} else {
        System.out.println("The oppurtunity name is miss matched");
	}
		

	}
@Test(priority=-2)
public void missingelements() {

 d.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("4/17/2023");
 d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
String alert = d.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
 System.out.println(alert);
	
}
}
