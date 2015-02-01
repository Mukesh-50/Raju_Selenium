package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class OpenApplication {
	
	
	public static String loadApp(WebDriver ldriver,String lurl){
		
		try {
			ldriver.manage().window().maximize();

			ldriver.get(lurl);
			
			ldriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		    return "Pass";	
		   
		} catch (Exception e) {
			
			System.out.println("Exception while loading application");
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
  
	}
	
	

}
