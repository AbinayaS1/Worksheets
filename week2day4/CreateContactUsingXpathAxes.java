package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class CreateContactUsingXpathAxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click() ;
	        driver.findElement(By.xpath("//div[@id='label']/a")).click();
	        driver.findElement(By.xpath("(//div[@class=\"x-panel-header\"]/a)[3]")).click();
	        driver.findElement(By.xpath("(//ul[@class=\"shortcuts\"]//a)[2]")).click();
            driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("victor");
		    driver.findElement(By.xpath("(//span[@class='requiredField']/following::input)[2]")).sendKeys("d");
            driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("sales");  
            
	        driver.findElement(By.xpath("//span[@class='tableheadtext']/following::textarea")).sendKeys("sales target achieved");
	        driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("testleaf@gmail.com");
	        Select province = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
	        province.selectByVisibleText("Florida");
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
	        driver.findElement(By.xpath("//span[@class='tableheadtext']/following::textarea")).clear();
	        driver.findElement(By.xpath("(//span[@class='tableheadtext']/following::textarea)[2]")).sendKeys("update sales target");
	        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	        String title = driver.getTitle();
	        System.out.println(title);
	        driver.close();
	}
}