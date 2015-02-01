package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tab {

	
	public static String tabById(WebDriver ldriver,String lid,String ldata){
		try {
			ldriver.findElement(By.id(lid)).click();
			return "Pass";

		} catch (Exception e) {
			System.out.println("Exception in tab");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
	}
	
	public static String tabBXpath(WebDriver ldriver,String lxpath,String ldata){
		try {
			ldriver.findElement(By.xpath(lxpath)).click();
			return "Pass";
		} catch (Exception e) {
			System.out.println("Exception in tab");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}

	}

	public static String tabByName(WebDriver ldriver,String lname,String ldata){
		try {
			ldriver.findElement(By.name(lname)).click();
			return "Pass";
		} catch (Exception e) {
			System.out.println("Exception in tab");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}

	}
	
	
	public static String tabByCss(WebDriver ldriver,String lCss,String ldata){
		try {
			ldriver.findElement(By.cssSelector(lCss)).click();
			return "Pass";
		} catch (Exception e) {
			System.out.println("Exception in tab");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}

	}
	
	public static String tabByClass(WebDriver ldriver,String lClass,String ldata){
		try {
			ldriver.findElement(By.className(lClass)).click();
			return "Pass";
		} catch (Exception e) {
			System.out.println("Exception in tab");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}

	}
	
}
