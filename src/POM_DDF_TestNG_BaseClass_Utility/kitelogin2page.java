package POM_DDF_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page {

	
		@FindBy(xpath="//input[@id=\"pin\"]") 
		private WebElement pin;
		
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		private WebElement cnt;
		
		
		 public kitelogin2page (WebDriver driver){
			 PageFactory.initElements(driver,this);
		 }
	
		 public void setkitelogin2pagePIN(String PIN)
		 {
			 pin.sendKeys(PIN);
		 }
		 
		 public void clickkitelogin2pagecontinueButton()
		 {
			 cnt.click();
		 }
	}


