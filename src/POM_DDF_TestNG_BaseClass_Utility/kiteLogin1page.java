package POM_DDF_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1page {

	//declaration
		@FindBy(xpath="//input[@id=\"userid\"]")
		private WebElement UN;
		
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement PWD;
		
		
		@FindBy(xpath="//button[text()='Login ']")
		private WebElement login;
		
    //initialization
		public kiteLogin1page(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		public void setkiteLogin1pageUN(String username) 
		{
		    UN.sendKeys(username);
		}
		public void setkiteLogin1pagePWD(String password)
		{
			PWD.sendKeys(password);
			
		}
		
		public void clickkiteLogin1pageloginbutton()
		{
			login.click();
		
		
			
			
			
		}
		
		}
		
