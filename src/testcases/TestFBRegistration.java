package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import lib.*;

public class TestFBRegistration {
	
	@Test
	public void login(){
		
         FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Textbox.typeById(driver, "email", "raju@gmail.com");
		
		Textbox.typeById(driver, "pass", "asdasdasd");
		
		Button.clickById(driver, "loginbutton");
		
		
		
		
		
	}

}
