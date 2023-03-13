package week4.day1;

//import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FrameClassActivity {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame("//iframe[@class='demo-frame']");
Actions builder = new Actions (driver);
WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
builder.dragAndDrop(source, target).perform();
	}

}
