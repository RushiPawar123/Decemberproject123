package POM_DDF_TestNG_BaseClass_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {

	public static String getTestData(int row,int col) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream file= new FileInputStream("E:\\framwork\\DataDrivenF.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 String value= sh.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
	public static void 
	captureScreenshot(WebDriver driver,int TCID) throws IOException{ 
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\java setup\\screenshot\\image_"+TCID+".jpg");
	FileHandler.copy(source, dest);
	

}}
