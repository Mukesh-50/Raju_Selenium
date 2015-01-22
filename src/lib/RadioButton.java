package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
	
	public static void clickByName(WebDriver ldriver,String lName){
	ldriver.findElement(By.id(lName)).click();
	    }
	public static void clickById(WebDriver ldriver,String lid){
		ldriver.findElement(By.id(lid)).click();
		}
	public static void clickByXpath(WebDriver ldriver,String lXpath){
		ldriver.findElement(By.id(lXpath)).click();
		}
	public static void clickByLinkText(WebDriver ldriver,String lLinkText){
		ldriver.findElement(By.id(lLinkText)).click();
		}
	public static void clickByPartialLinkText(WebDriver ldriver,String lpartialLinkText){
		ldriver.findElement(By.id(lpartialLinkText)).click();
		}
}
