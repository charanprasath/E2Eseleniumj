package Tc_sel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_0011 {
	@Test
	public void Tc_001(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello1");
		
	}

}
