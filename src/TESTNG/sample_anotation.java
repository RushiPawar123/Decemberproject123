package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample_anotation {

	@BeforeClass
	public void openBrowser() {
		System.out.println("open browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("loging to app");
	}
	      @Test
	     public void TC1() {
		
		System.out.println("running TC1....");
	      }
	      
	      @Test
	      public void TC2() {
	    	  
	    	  System.out.println("running TC2");
	      }
	      
	      
	      @AfterMethod
	      public void logoutToApp() {
	    	  System.out.println("logoutToApp");
	      }
	      
	      @AfterClass
	      public void closeBrowser() {
	    	  System.out.println("close Browser");
	      }
}


	
