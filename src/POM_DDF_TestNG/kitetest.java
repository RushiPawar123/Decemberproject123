package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("E:\\framwork\\DataDrivenF.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		kiteLogin1page login1 = new kiteLogin1page(driver);
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		login1.setkiteLogin1pageUN(UN);
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		login1.setkiteLogin1pagePWD(pwd);
		
		login1.clickkiteLogin1pageloginbutton();
		
		kitelogin2page login2 = new kitelogin2page(driver);
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		login2.setkitelogin2pagePIN(PIN);
     
		login2.clickkitelogin2pagecontinueButton();
		
		kiteHomepage home =new kiteHomepage(driver);
		home.verifykiteHomepageProfileName();
		
		Thread.sleep(3000);
		driver.close();
		
		




	}

}
