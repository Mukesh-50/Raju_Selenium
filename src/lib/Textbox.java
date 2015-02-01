package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textbox {
	
	
	public static String typeById(WebDriver ldriver,String lid,String ldata){
		
		try {
			ldriver.findElement(By.id(lid)).sendKeys(ldata);
			
			return "Pass";
		} catch (Exception e) {

			System.out.println("Exception in textbox");
             
		    String screen_loc=lib.CaptureScreenshots.takescreenshot(ldriver);
		    
			return screen_loc;
		}
		
	}
	
	
	public static String typeByXpath(WebDriver ldriver,String lxpath,String ldata){
		
		try {
			ldriver.findElement(By.xpath(lxpath)).sendKeys(ldata);
			return "Pass";

		} catch (Exception e) {

			System.out.println("Exception in textbox");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
		
	}
	
	
	public static String typeByName(WebDriver ldriver,String lName,String ldata){
		
		try {
			ldriver.findElement(By.name(lName)).sendKeys(ldata);
			return "Pass";

		} catch (Exception e) {

			System.out.println("Exception in textbox");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
		
	}
	

}
