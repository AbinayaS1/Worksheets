package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
public RemoteWebDriver Driver;
@Parameters({"browser","url","username","password"})
@BeforeMethod
	public void precondition(String browser,String url,String username,String password) {
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge")){
		Driver = new EdgeDriver();	
		}
		Driver.manage().window().maximize();
		Driver.get(url);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.id("username")).sendKeys(username);
		Driver.findElement(By.id("password")).sendKeys(password);
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();

	}

@AfterMethod
public void postcondition() {
Driver.close();
}
}