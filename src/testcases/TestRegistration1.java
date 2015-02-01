package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import lib.*;

public class TestRegistration1 {
	
	@Test
	public void login(){
		
         FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Textbox.typeById(driver, "email", "raju@gmail.com");
		
		Textbox.typeById(driver, "pass", "asdasdasd");
		
		 Dropdown.selectByIdAndVisibleText(driver, "month","Dec");
		 
		 Dropdown.selectByIdAndIndex(driver, "day", 6);
		 
		 Dropdown.selectByIdAndvalue(driver, "year", "2005");
		 
		 System.out.println("TC pass");
		 
		 
		 
		
		 
//		boolean status= driver.findElement(By.xpath("")).isEnabled();
//		
//		boolean flag=true;		
//		
//		while(flag){
//			
//		int i=0;
//			
//		driver.findElement(By.xpath("")).click();
//				
//		i++;
		 
		 
	
		}
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}
