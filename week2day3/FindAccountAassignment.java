package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccountAassignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click() ;
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	        driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("Credit Limited Account");
	        driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
//	        driver.findElement(By.xpath(" ")).getText()
//	        driver.findElement(By.xpath("")).click();
//	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
//	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        

	}

}
