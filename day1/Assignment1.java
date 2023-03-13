package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/alert.xhtml");
	Thread.sleep(2000);
	
//1.
	
	driver.findElement(By.xpath("//span[text()='Show']")).click();
    Alert task1 = driver.switchTo().alert();
    Thread.sleep(2000);
     task1.accept();
     String text1 = driver.findElement(By.xpath("//div[@class='card']/span")).getText();
     System.out.println(text1);
     
     
 //2.
     
     driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
     Alert task2 = driver.switchTo().alert();
     Thread.sleep(2000);
     task2.dismiss();
     String text2 = driver.findElement(By.xpath("(//div[@class='card']/span)[2]")).getText();
     System.out.println(text2);
     
     
//3.
     
     driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']/span")).click();
   String text3 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']/p")).getText();
     System.out.println(text3);
   driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']/span")).click();
   
   
//4.
   
   driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']/span")).click();
   String text4 = driver.findElement(By.className("m-0")).getText();
   System.out.println(text4);
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
   Thread.sleep(2000);
  
   //(//div[@class='ui-dialog-titlebar ui-widget-header ui-helper-clearfix ui-corner-top ui-draggable-handle']/a)[2]
   //a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all']/span)[2]
   //span[text()='Modal Dialog (Sweet Alert)']/following::a
   
 //5.
   
   driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']")).click();
   Alert task3 = driver.switchTo().alert();
   Thread.sleep(2000);
   task3.sendKeys("victor");
   Thread.sleep(2000);
   task3.accept();
   String text5 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
   System.out.println(text5);
   
 //7.
//   
   driver.findElement(By.xpath("//span[text()='Delete']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()='Yes']")).click();
   Thread.sleep(2000);
 
 //8.
   
   
   driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt111']/span)[2]")).click();
   Thread.sleep(2000);
   String text6 = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
   System.out.println(text6);
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
   Thread.sleep(2000);
   driver.close();
	
   
   
   
	}

}
