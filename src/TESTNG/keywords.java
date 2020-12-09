package TESTNG;

import org.testng.annotations.Test;

public class keywords {

	@Test(dependsOnMethods= {"loginToApp"})
    public void verifyPN() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("verify PN TC..");
	}
	@Test(timeOut=5000)
    public void TC1() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("running lgin to App TC");
	}
	
	
	
	
	//4.timeOut
	//@Test(timeOut=8000)
    //public void TC1() throws InterruptedException {
	//	Thread.sleep(6000);
	//	System.out.println("running TC1");
	
    	//3.enabled=false
	//@Test(enabled=false)
	//public void TC1(){
	//System.out.println("...running TC1");
		//}
	
	//@Test(enabled=false)
	//public void TC2(){
	//System.out.println("...running TC2");
	//	}

	//@Test
	//public void TC3(){
	//System.out.println("...running TC1");
		//}
	//@Test
	//public void TC4(){
	//System.out.println("...running TC1");
		}
	
	
	//2.priority
	//@Test(priority=2)
	//public void TC1(){
	//	System.out.println("...running TC1");
	//}
	
	//@Test(priority=1)
	//public void TC2(){
		//System.out.println("...running TC2");
//	}
	
     //1.invocationCount
	//@Test(invocationCount=10)
	//public void TC(){
		//System.out.println("...running TC..");
	
	
	


