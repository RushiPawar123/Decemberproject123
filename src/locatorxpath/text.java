package locatorxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi123\\Downloads\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("http://www.gmail.com//");
		
		d.findElement(By.xpath("")).sendKeys("");

		//d.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abc");
		
		//d.findElement(By.xpath("//button[text()=\"Log In\"]")).click();
		
		d.findElement(By.xpath("")).click();
	}

}