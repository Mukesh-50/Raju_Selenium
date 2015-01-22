package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void selectByidAndIndex(WebDriver ldriver,String lid,int lIndex){
		WebElement wb = ldriver.findElement(By.id(lid));
		Select sel = new Select(wb);
		sel.selectByIndex(lIndex);
	    }
	public static void selectByidAndvisibleText(WebDriver ldriver,String lid,String ltext){
		WebElement wb = ldriver.findElement(By.id(lid));
		Select sel = new Select(wb);
		sel.selectByVisibleText(ltext);
	    }
	public static void selectByidAndValue(WebDriver ldriver,String lid,String llvalue){
		WebElement wb = ldriver.findElement(By.id(lid));
		Select sel = new Select(wb);
		sel.selectByValue(llvalue);
	    }
	public static void selectByNameAndIndex(WebDriver ldriver,String lName,int lIndex){
		WebElement wb = ldriver.findElement(By.name(lName));
		Select sel = new Select(wb);
		sel.selectByIndex(lIndex);
	    }
	public static void selectByNameAndvisibleText(WebDriver ldriver,String lName,String ltext){
		WebElement wb = ldriver.findElement(By.name(lName));
        Select sel = new Select(wb);
		sel.selectByVisibleText(ltext);
	    }
	public static void selectByNameAndValue(WebDriver ldriver,String lName,String lvalue){
		WebElement wb = ldriver.findElement(By.name(lName));
		Select sel = new Select(wb);
		sel.selectByValue(lvalue);
	    }
	public static void selectByXpathAndIndex(WebDriver ldriver,String lxpath,int lIndex){
		WebElement wb = ldriver.findElement(By.xpath(lxpath));
		Select sel = new Select(wb);
		sel.selectByIndex(lIndex);
	    }
	public static void selectByXpathAndvisibleText(WebDriver ldriver,String lxpath,String ltext){
		WebElement wb = ldriver.findElement(By.xpath(lxpath));
        Select sel = new Select(wb);
		sel.selectByVisibleText(ltext);
	    }
	public static void selectByXpathAndValue(WebDriver ldriver,String lxpath,String lvalue){
		WebElement wb = ldriver.findElement(By.xpath(lxpath));
		Select sel = new Select(wb);
		sel.selectByValue(lvalue);
	    }
}
