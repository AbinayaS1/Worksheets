package week5day1;

import static org.testng.Assert.assertEquals;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Createnewoppurtunity extends Baseclass1 {
@Test(dataProvider ="oppurtunity")

	public void create(String oppname,String date) throws InterruptedException {
		
        d.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(oppname);
       String text = d.findElement(By.xpath("(//input[@class='slds-input'])[4]")).getText();
              System.out.println(text);
        d.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(date);
        d.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
        d.findElement(By.xpath("(//span[@class='slds-media__body']/span)[4]")).click();
        d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
         String text2 = d.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
       System.out.println(text2);
       SoftAssert SA = new SoftAssert();
       SA.assertNotEquals(text, text2);
    	   System.out.println("The Oppurtunity name is:"+ text2);

}
@DataProvider(name="oppurtunity")
public String[][] getdata(){
	String[][] data = new String[1][2];
	data[0][0] = "sales Automation by sree";
	data[0][1] = "3/21/2023";
	return data;
			
}
}