package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Task1 {
@Test
	public void archcertificate () throws InterruptedException, IOException {
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
       d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral navButton newWindow uiButton']")).click();
       
		Set<String> window1 = d.getWindowHandles();
		List<String>windows1 =new ArrayList<String>(window1);
		d.switchTo().window(windows1.get(1));
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Shadow function1 = new Shadow(d);
		function1 .findElementByXPath("//span[text()='Learning'] ").click();
		
		WebElement hover = function1.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(2000);
		Actions hovercursor = new Actions(d);
		hovercursor.moveToElement(hover).perform();
		Thread.sleep(2000);
		
		WebElement scrolldown = function1.findElementByXPath("//a[text()='Salesforce Certification']");
		Actions scroll = new Actions(d);
		scroll.scrollToElement(scrolldown).perform();
		scrolldown.click();
		d.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		Thread.sleep(2000);
		String url = d.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("the page url is:"+" "+url);
		String summary = d.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']")).getText();
		System.out.println("The text summary is :"+ ""+summary);
		
		List<String>archcertification = new ArrayList<String>();
		archcertification.add("Application Architect");
		archcertification.add("B2B Solution Architect"); 
		archcertification.add("B2C Solution Architect");  
		archcertification.add("B2C Commerce Architect");
		archcertification.add("System Architect");
		archcertification.add("Technical Architect");
		System.out.println("archcertification certifications are "+ " " +archcertification);
		d.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		List<String>Applicationarchcertifications = new ArrayList<String>();
		Applicationarchcertifications.add("Architect Journey: Programmatic Architecture");
		Applicationarchcertifications.add("Architect Journey: Application Design");
		Applicationarchcertifications.add("Architect Journey: Communities Architecture");
		Applicationarchcertifications.add("Architect Journey: Analytics Architecture");
		System.out.println("Applicationarchcetifications are :"+" "+Applicationarchcertifications); 
		
		File source = d.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/snap.png");
		FileUtils.copyFile(source, destination);

		d.close();
		d.quit();

	}

}
