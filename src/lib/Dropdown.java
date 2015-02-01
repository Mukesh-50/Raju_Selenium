package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	
		public static String selectByIdAndIndex(WebDriver ldriDriver,String lid,int lindex ){
			try {
				WebElement wb = ldriDriver.findElement(By.id(lid));
				Select sel = new Select(wb);
				sel.selectByIndex(lindex);
				return "Pass";

			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
				
			}
			
		}
		public static String selectByIdAndVisibleText(WebDriver ldriDriver,String lid,String ltext ){
			try {
				WebElement wb = ldriDriver.findElement(By.id(lid));
				Select sel = new Select(wb);
				sel.selectByVisibleText(ltext);
				return "Pass";

			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
				
			}
			
		}
		public static String selectByIdAndvalue(WebDriver ldriDriver,String lid,String lvalue ){
			try {
				WebElement wb = ldriDriver.findElement(By.id(lid));
				Select sel = new Select(wb);
				sel.selectByValue(lvalue);
				return "Pass";

			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
				
			}
			
		}
		public static String selectByNameAndIndex(WebDriver ldriDriver,String lname,int lindex ){
			try {
				WebElement wb = ldriDriver.findElement(By.name(lname));
				Select sel = new Select(wb);
				sel.selectByIndex(lindex);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		public static String selectByNameAndVisibleText(WebDriver ldriDriver,String lname,String ltext ){
			try {
				WebElement wb = ldriDriver.findElement(By.name(lname));
				Select sel = new Select(wb);
				sel.selectByVisibleText(ltext);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		public static String selectByNameAndvalue(WebDriver ldriDriver,String lname,String lvalue ){
			try {
				WebElement wb = ldriDriver.findElement(By.name(lname));
				Select sel = new Select(wb);
				sel.selectByValue(lvalue);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		public static String selectByXpathAndIndex(WebDriver ldriDriver,String lxpath,int lindex ){
			try {
				WebElement wb = ldriDriver.findElement(By.xpath(lxpath));
				Select sel = new Select(wb);
				sel.selectByIndex(lindex);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		public static String selectByXpathAndVisibleText(WebDriver ldriDriver,String lxpath,String ltext ){
			try {
				WebElement wb = ldriDriver.findElement(By.xpath(lxpath));
				Select sel = new Select(wb);
				sel.selectByVisibleText(ltext);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		public static String selectByXpathAndvalue(WebDriver ldriDriver,String lxpath,String lvalue ){
			try {
				WebElement wb = ldriDriver.findElement(By.xpath(lxpath));
				Select sel = new Select(wb);
				sel.selectByValue(lvalue);
				return "Pass";
			} catch (Exception e) {
				System.out.println("Exception in dropdown");
				return e.getMessage();
			}

			
		}
		
}
