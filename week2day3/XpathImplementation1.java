package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathImplementation1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click() ;
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abinaya");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("s");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("5622913263");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testleaf@gmail.com");
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//	        driver.getTitle();
	        driver.close();
}
}
