package POM_DDF_TestNG_BaseClass_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class kitest_sample extends BaseClass {

	
	
	kiteLogin1page login1;
	kitelogin2page login2;
	kiteHomepage home;
	int TCID;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		OpenBrowser();
		
		 login1= new kiteLogin1page(driver);
		 login2= new kitelogin2page(driver);
		 home= new kiteHomepage(driver);

	}	
	
	@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException {
		
		login1.setkiteLogin1pageUN(utility.getTestData(0, 0));
		login1.setkiteLogin1pagePWD(utility.getTestData(0, 1));
		login1.clickkiteLogin1pageloginbutton();
		
		login2.setkitelogin2pagePIN(utility.getTestData(0, 2));
        login2.clickkitelogin2pagecontinueButton();
	
	}
	
	
	@Test
	public void verifyPN() throws EncryptedDocumentException, IOException {
	
		TCID=552;
		String actText =home.getkiteHomepageKiteHomePageProfileName();
		String expText = utility.getTestData(0, 3);
  Assert.assertEquals(actText, expText,"act & exp results are diffrent");

		
	}
	
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			utility.captureScreenshot(driver, TCID);
		}
	}
	
	
	@AfterClass
	public void closeBrowser() {
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}
	
	
	
	
	}
	
	


