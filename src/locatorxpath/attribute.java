package locatorxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi123\\Downloads\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
	
		d.get("https://www.facebook.com//");
		
		d.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("123");
		d.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("abc");
		d.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	}

}
