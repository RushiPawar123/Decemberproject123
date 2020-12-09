package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi123\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		Dimension d = new Dimension(300,400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);

	
		
		
	}

}
