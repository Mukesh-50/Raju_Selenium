package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshots {
	
	
	
	public static String takescreenshot(WebDriver driver){
		
		
		 TakesScreenshot ts1=(TakesScreenshot)driver;
			
	     File src=ts1.getScreenshotAs(OutputType.FILE);
	        
	     String location="C:\\Users\\Kamraj\\Automation\\TestProject\\Screenshots\\"+ System.currentTimeMillis()+".png";
	     
	     File destination=new File(location);
	        
	     try {
			FileUtils.copyFile(src, destination);
		
			return "Pass";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return location;
		}
	}
	


}
