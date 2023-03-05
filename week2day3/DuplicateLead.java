package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DuplicateLead {

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
	        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	        driver.findElement(By.xpath("//span[text()='Email']")).click();
	        driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("testleaf@gmail.com");
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       String text = driver.findElement(By.xpath("//a[text()='Abinaya']")).getText();
	        System.out.println(text);
	        driver.findElement(By.xpath("//a[text()='15055']")).click();
	        driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	       String title = driver.getTitle();
	       System.out.println(title);
	       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
      String text1 = driver.findElement(By.xpath("//span[text()='Abinaya']")).getText();
	      Assert.assertEquals(text, text1);
	      System.out.println("duplicated lead name is same as lead name:"+text);
	       driver.close(); 
	}

}
