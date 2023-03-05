package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		
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
       driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("abinaya");
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	        String title ="view lead";
	        String title1 = driver.getTitle();
	        if(title.equalsIgnoreCase(title1)) {
	        	System.out.println("matched");
	        }
	        else {
	        	 System.out.println("mismatched");
	        }
	       
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
            driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
  	        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("testleaf");
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        boolean display = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).isDisplayed();
	        System.out.println(display);
	        driver.close();
	        
	}

}
