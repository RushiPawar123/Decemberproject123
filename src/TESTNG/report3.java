package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class report3 {

	@Test
    public void TC5() {
	Reporter.log("running TC5",true);
    }
      @Test
      public void TC6() {
       Reporter.log("running TC6",true);
}}