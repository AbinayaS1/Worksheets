package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']/span[2]")).click();
    Alert prompt = driver.switchTo().alert();
    Thread.sleep(2000);
    prompt.sendKeys("victor");
    Thread.sleep(2000);
    prompt.accept();
//    String text = prompt.getText();
     String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
    System.out.println(text);
	}

}
