package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
	
     public static String clickById(WebDriver ldriver,String lid){
		
		try {
			ldriver.findElement(By.id(lid)).click();
			
			return "Pass";
		} catch (Exception e) {
			
			System.out.println("Exception in button");
			return e.getMessage();
			
		}
		
	}
	
	
     public static String clickByName(WebDriver ldriver,String lName){
 		
 		try {
 			ldriver.findElement(By.name(lName)).click();
 			
 			return "Pass";
 		} catch (Exception e) {
 			
 			System.out.println("Exception in button");
 			return e.getMessage();
 			
 		}
 		
 	}
     public static String clickByXpath(WebDriver ldriver,String lXpath){
 		
 		try {
 			ldriver.findElement(By.xpath(lXpath)).click();
 			
 			return "Pass";
 		} catch (Exception e) {
 			
 			System.out.println("Exception in button");
 			return e.getMessage();
 			
 		}
 		
 	}

}
