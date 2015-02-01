package lib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchTo {
	
	
	
	
public static String switchWindow(WebDriver ldriver,String actual_data) throws Exception{
		
String parent=	ldriver.getWindowHandle();

System.out.println("PARENT"+parent);

Set<String>s1= ldriver.getWindowHandles();

Iterator<String> i1=s1.iterator();

while(i1.hasNext()){
	
String child=	i1.next();

System.out.println("cHILD"+child);
	
if(!parent.equalsIgnoreCase(child)){
	
   Thread.sleep(15000);
	
	ldriver.switchTo().window(child);
	
	String title=ldriver.switchTo().window(child).getTitle();
	
	System.out.println(title);
	
	SwitchTo.switchFrameByName(ldriver, "searchFrame");
	
	ldriver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys(actual_data);
	
	ldriver.findElement(By.xpath("//input[@name='go']")).click();
	
	
	SwitchTo.switchToDefaultContent(ldriver);
	
	
	SwitchTo.switchFrameByName(ldriver, "resultsFrame");
	
	
   String record_xpath="//div[@class='bPageBlock brandSecondaryBrd secondaryPalette']//*[contains(text(),'"+actual_data+"')]";	
  
   System.out.println(record_xpath);
  
	ldriver.findElement(By.xpath(record_xpath)).click();
	
		
}

ldriver.switchTo().window(parent);

}

	return "Pass";	
		
	}
	
public static String switchAlertAndAccept(WebDriver ldriver){
	
	ldriver.switchTo().alert().accept();
	
	return "pass";
	
	}


public static String switchParent(WebDriver ldriver){

         ldriver.switchTo().window(ldriver.getWindowHandle());

return "pass";

}


public static String switchAlertAndDismiss(WebDriver ldriver){
	
	ldriver.switchTo().alert().dismiss();
	
	return "pass";
	
	}



public static String switchFrameByName(WebDriver ldriver,String lname){
	
	ldriver.switchTo().frame(lname);
	
	return "Pass"; 
}

public static String switchFrameByIndex(WebDriver ldriver,int lIndex){
	
	ldriver.switchTo().frame(lIndex);
	
	return "Pass"; 
}

public static String switchToDefaultContent(WebDriver ldriver){
	
	ldriver.switchTo().defaultContent();
	
	return "Pass"; 
}

}
