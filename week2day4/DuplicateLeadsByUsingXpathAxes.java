package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DuplicateLeadsByUsingXpathAxes {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click() ;
	        driver.findElement(By.xpath("//div[@id='label']/a")).click();
	        driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[2]")).click();
	        driver.findElement(By.xpath("//a[text()='Find Leads']/parent::li")).click();
	        driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[3]")).click();
	        driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[5]")).sendKeys("testleaf@gmail.com");
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        String text = driver.findElement(By.xpath("//a[text()='Abinaya']")).getText();
	        System.out.println(text);
	        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	        driver.findElement(By.xpath("//a[@class='subMenuButton']/preceding-sibling::a")).click();
	        String title = driver.getTitle();
		       System.out.println(title);
		       driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		       String text1 = driver.findElement(By.xpath("//span[text()='Abinaya']")).getText();
				Assert.assertEquals(text, text1);
		 	      System.out.println("duplicated lead name is same as lead name:"+text);
		 	       driver.close(); 
	        
	        
	        
	        
		 	
	        
	        
	        
	        
	        
	        
	        
	        
}
}