package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abinaya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
        driver.findElement(By.xpath("//input[@name='reg_email__'] ")).sendKeys("54662633226");
        driver.findElement(By.xpath("//input[@id='password_step_input'] ")).sendKeys("ABcd1");
        WebElement dropdown = driver.findElement(By.name("birthday_day"));
        Select option1 = new Select(dropdown);
          option1.selectByIndex(6);
          
          WebElement dm = driver.findElement(By.name("birthday_month"));
          Select option2 = new Select(dm);
          option2.selectByValue("10");
          
          WebElement dy = driver.findElement(By.name("birthday_year"));
          Select option3 = new Select(dy);
          option3.selectByVisibleText("2000");
          
          driver.findElement(By.xpath("//input[@class='_8esa']")).click();
         String title = driver.getTitle();
         System.out.println(title);
         driver.close();
	}
	

}