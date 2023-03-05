package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click() ;
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	        driver.findElement(By.xpath("//span[text()='Phone']")).click();
	       driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5622913263");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      String text = driver.findElement(By.xpath("//a[text()='14747']")).getText();
	      System.out.println(text);
	       driver.findElement(By.xpath("//a[text()='14747']")).click();
	       driver.findElement(By.xpath("//a[text()='Delete']")).click();
	       driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	       driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14747");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	       System.out.println(text2);
	       
	        
	}

}
