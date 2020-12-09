package POM_DDF_TestNG_BaseClass_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
      WebDriver driver;
	
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
}
