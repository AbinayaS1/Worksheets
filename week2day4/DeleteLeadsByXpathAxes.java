package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadsByXpathAxes {

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
		       
		        driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
		       
		        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5622913263");
		        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		        driver.findElement(By.xpath("//a[text()='Edit']/following-sibling::a")).click();
		        driver.findElement(By.xpath("(//ul[@class='shortcuts']//li)[3]")).click();
		        driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input")).sendKeys("15331");
		        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		        driver.close();
		        
	}
	
	
}
