package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert {

	
	@Test
	public void TC1() {
		Reporter.log("running TC1");
		
		SoftAssert soft = new SoftAssert();
		String act="abc";
		String exp="xyz";
		
		soft.assertEquals(act, exp,"act and exp result are mismatch");
		soft.assertEquals(act, exp,"act and exp result are mismatch");
		System.out.println("executed both verification");
		soft.assertAll();
				
	}
}
