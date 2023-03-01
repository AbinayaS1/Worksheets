package selinium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumSampleCode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com");
	}

}
