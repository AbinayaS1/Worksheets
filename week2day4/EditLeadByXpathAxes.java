package week2day4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadByXpathAxes {

	public static void main(String[] args) throws InterruptedException {
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
	       driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[2]")).sendKeys("victor");
		     driver.findElement(By.xpath("//button[text()='Find Leads']/parent::em")).click();
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
		     driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		     driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).clear();
		     driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("TEST LEAF INSTITUTE123");
		     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		     boolean display = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).isDisplayed();
		        System.out.println(display);
            System.out.println(title);
            
	}

}
