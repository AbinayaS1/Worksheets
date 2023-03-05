package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
//		webelement
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click() ;
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CGI");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("VICTOR");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("7849525691");
            driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("cgi@gmail.com");
            driver.findElement(By.xpath("//input[@name='submitButton']")).click();
            String title = driver.getTitle();
            System.out.println(title);
            driver.close();
	}

}
