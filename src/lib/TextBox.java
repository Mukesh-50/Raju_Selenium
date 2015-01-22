package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
	
	public static void typeByName(WebDriver ldriver,String lName,String lvalue){
	ldriver.findElement(By.name(lName)).sendKeys(lvalue);
	    }
	public static void typeById(WebDriver ldriver,String lid,String lvalue){
		ldriver.findElement(By.id(lid)).sendKeys(lvalue);
		}
	public static void typeByXpath(WebDriver ldriver,String lXpath,String lvalue){
		ldriver.findElement(By.xpath(lXpath)).sendKeys(lvalue);
		}
	public static void typeByLinkText(WebDriver ldriver,String lLinkText,String lvalue){
		ldriver.findElement(By.linkText(lLinkText)).sendKeys(lvalue);
		}
	public static void typeByPartialLinkText(WebDriver ldriver,String lpartialLinkText,String lvalue){
		ldriver.findElement(By.partialLinkText(lpartialLinkText)).sendKeys(lvalue);
		}
}
