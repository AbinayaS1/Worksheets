package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftab2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click() ;
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("5622913263");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("(TESTLEAF INSTITUTE)");
        driver.findElement(By.name("submitButton")).click();
	}

}
