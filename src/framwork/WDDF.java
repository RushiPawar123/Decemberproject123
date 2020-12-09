package framwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("");
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
	
		d.get("https://kite.zerodha.com/");
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//1page
		 d.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("DV1510");
		 d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Vijay@123");
	     d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	
	    //2page
	     d.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("959594");
	     d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	
	     boolean result=
	     d.findElement(By.xpath("//span[text()=\"KV\"]")).isDisplayed();
	
	System.out.println(result);
	
	if(result) {
		
		System.out.print("PASS");
		
	}else {
		
		System.out.println("FAIL");
		
	}
	d.close();
	}
	
	
	
		

	}


