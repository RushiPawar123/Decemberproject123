package POM_DDF_TestNG_BaseClass_Utility;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ExecuteonlyFailTC2 {

	
	@Test
	public void TC3() {
		Reporter.log("Running TC4");
	}
		@Test
		public void TC5() {
			Reporter.log("Running TC5");
		}	
			@Test
			public void TC6() {
				Assert.fail();
				Reporter.log("Running TC6");
			}
		}
		
	

