package selenium1;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi123\\Downloads\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
	
		//d.navigate().to("https://www.amazon.in/");
		//read.sleep(2000);
		d.navigate().to("https://www.google.com/");
		
		
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		d.manage().window().maximize();
		

		
		
		Thread.sleep(2000);
		d.close();
		
		
		
	}

	
}
