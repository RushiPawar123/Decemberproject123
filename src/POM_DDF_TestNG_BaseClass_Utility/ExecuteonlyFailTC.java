package POM_DDF_TestNG_BaseClass_Utility;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ExecuteonlyFailTC {

	
	@Test
	public void TC1() {
		Reporter.log("Running TC1");
	}
		@Test
		public void TC2() {
			Reporter.log("Running TC2");
		}	
			@Test
			public void TC3() {
				Assert.fail();
				Reporter.log("Running TC3");
			}
		}
		
	

