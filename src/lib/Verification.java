package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Verification {
	
	
	
	public static String verifyError(WebDriver ldriver,String xpath,String lexepcted){
		
	String error=ldriver.findElement(By.xpath(xpath)).getText();
		
	Assert.assertEquals(error, lexepcted);
	
	return "Pass";
	
	
	}

}
