package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Baseclass1 {

 public RemoteWebDriver d;
@Parameters({ "browser","url","username","password"})
@BeforeMethod()

	public void precondition(String browser,String url,String username,String password) throws InterruptedException {
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		d = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge")){
		d = new EdgeDriver();	
		}

	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	d.manage().window().maximize();
	d.get(url);
	d.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
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
	d.quit();
}


}
