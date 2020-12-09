package POM_DDF_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage {

	
		@FindBy(xpath="//span[text()=\"KV\"]")
		private WebElement PN;
		
		 kiteHomepage(WebDriver driver){
		   PageFactory.initElements(driver,this);
		 
		 }
		 
		 
		 public String  getkiteHomepageKiteHomePageProfileName() {
			 String act = PN.getText();
			 return act;
		 } 
		 
		 }	
	


