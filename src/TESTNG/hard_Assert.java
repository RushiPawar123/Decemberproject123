package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class hard_Assert {

	@Test
	public void TC1() {
		Reporter.log("running TC1");
		
		String str="abc";
		Assert.assertNotNull(str,"component is null");
		Assert.assertNull(str,"component is null");
		Assert.assertNotNull(str,"component is null");
	}
}
