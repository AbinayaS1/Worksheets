package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral navButton newWindow uiButton']")).click();
	
    //SET
	Set<String> windowname = driver.getWindowHandles();
    System.out.println(windowname);
    //LIST
    List<String>windows =new ArrayList<String> (windowname);
    driver.switchTo().window(windows.get(1));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
    Thread.sleep(2000);
    String text = driver.getTitle();
    System.out.println("second window title is"+text);
    Thread.sleep(2000);
    driver.close();
    Thread.sleep(2000);
    
    
    List<String>windows0 =new ArrayList<String> (windowname);
    driver.switchTo().window(windows0.get(0));
   String text1 = driver.getTitle();
    System.out.println("First window title is"+text1);
    
    
    
	}

}
