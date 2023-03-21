package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends Baseclass {
@Test(dataProvider="create")
	public void createleaddata(String cn,String fn,String ln) {
		
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		Driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("44");
		Driver.findElement(By.name("submitButton")).click();
		
}

@DataProvider(name="create")
public String[] [] getdata(){
	
	String data[][]=new String [3][3];
	data[0][0]="leaftab";
	data[0][1]="kishore";
	data[0][2]="k";
	
	data[1][0]="leaftab";
	data[1][1]="arjun";
	data[1][2]="d";
	
	data[2][0]="leaftab";
	data[2][1]="victor";
	data[2][2]="k";
	return data;
	
}

}






