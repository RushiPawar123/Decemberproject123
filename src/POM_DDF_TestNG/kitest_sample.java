package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kitest_sample {

	WebDriver driver;
	Sheet sh;
	kiteLogin1page login1;
	kitelogin2page login2;
	kiteHomepage home;
	@BeforeClass
	
	public void openBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("E:\\framwork\\DataDrivenF.xlsx");

		 sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login1= new kiteLogin1page(driver);
		login2= new kitelogin2page(driver);
		home= new kiteHomepage(driver);

	}	
	
	@BeforeMethod
		public void loginToApp() {
		
		login1.setkiteLogin1pageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login1.setkiteLogin1pagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickkiteLogin1pageloginbutton();
		
		login2.setkitelogin2pagePIN(sh.getRow(0).getCell(2).getStringCellValue());
        login2.clickkitelogin2pagecontinueButton();
	
	}
	
	@Test
	public void verifyPN() {
	
		home.verifykiteHomepageProfileName();
		
	}
	
	
	@AfterMethod
	public void logoutFromApp() {
	}
	
	
	@AfterClass
	public void closeBrowser() {
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}
	
	
	
	
	}
	
	


