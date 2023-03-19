package week4day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass1 {

 public ChromeDriver d;
@BeforeMethod()
	public void precondition() throws InterruptedException {
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	option.addArguments("--remote-allow-origins=*");
	
    d =new ChromeDriver(option);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	d.manage().window().maximize();
	d.get("https://login.salesforce.com/");
	d.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	d.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
	d.findElement(By.xpath("//input[@id='Login']")).click();
	d.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']/button")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	Thread.sleep(2000);
    d.findElement(By.xpath("//p[text()='Sales']")).click();
    WebElement js = d.findElement(By.xpath("//span[text()='Opportunities']"));
    d.executeScript("arguments[0].click();",js);
    d.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		

	}

@AfterMethod
public void postcondition() {
	d.close();
}


}
