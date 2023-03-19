package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateTaskAssignment3 {
@Test
	public  void task() throws InterruptedException {
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
		d.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(2000);
        d.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("task",Keys.ENTER);
        d.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
        d.findElement(By.xpath("//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")).click();
        d.findElement(By.xpath("//li[@class='uiMenuItem']/a")).click();
        d.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
        d.findElement(By.xpath("//a[text()='Not Started']")).click();
        d.findElement(By.xpath("(//li[@class='uiMenuItem uiRadioMenuItem']/a)[5]")).click();
        d.findElement(By.xpath("//span[text()='Save']")).click();
        String text = d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.print(text);
	}
	

}
