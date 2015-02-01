package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Link {
	
	
	public static String clickByLinkText(WebDriver ldriver,String lLinkText)
	{
		try {
			ldriver.findElement(By.linkText(lLinkText)).click();
			return "Pass";

		} catch (Exception e) {
			System.out.println("Exception in textbox");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
	}
	public static String clickByXpath(WebDriver ldriver,String lLinkText)
	{
		try {
			ldriver.findElement(By.xpath(lLinkText)).click();
			return "Pass";

		} catch (Exception e) {
			System.out.println("Exception in textbox");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
	}
}
