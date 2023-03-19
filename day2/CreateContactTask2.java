package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateContactTask2 {
@Test
	public  void contact() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		//		option.addArguments("--disable-popup-blocking");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver d =new ChromeDriver(option);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://login.salesforce.com/");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		d.findElement(By.xpath("//input[@id='Login']")).click();
		d.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']/button")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement click = d.findElement(By.xpath("//span[text()='Accounts']"));
		d.executeScript("arguments[0].click();", click);
		d.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
		d.findElement(By.xpath("//input[@name='Name']")).sendKeys("sree");
		d.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		d.findElement(By.xpath("//span[text()='Public']")).click();
		d.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		String title = d.getTitle();
		System.out.println("Title of the account created"+""+title);
		String url = d.getCurrentUrl();
		System.out.println("The url of the Account created is:"+""+url);

	}

}
