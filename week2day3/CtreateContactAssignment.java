package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CtreateContactAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
//		webelement
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click() ;
	        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	        driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	        driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("abinaya");
	        driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("s");
	        driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Abi");
	        driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("sree");
	        driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("sales");
	        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("sales target achieved");
	        driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("testleaf@gmail.com");
	        Select province = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
	        province.selectByVisibleText("Florida");
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
	        driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	        driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("update sales target");
	        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	        String title = driver.getTitle();
	        System.out.println(title);
	        driver.close();
}
	}


