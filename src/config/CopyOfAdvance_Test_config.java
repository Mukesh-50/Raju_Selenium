package config;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import lib.Button;
import lib.Dropdown;
import lib.Link;
import lib.OpenApplication;
import lib.SwitchTo;
import lib.Sync;
import lib.Tab;
import lib.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CopyOfAdvance_Test_config {
	
     public	WebDriver driver;
	
	  WritableWorkbook wwb;
	  
	  ArrayList<String> al;
	
	
	@Test
	public void readHybrid() throws Exception{
		
		
	Workbook wb=Workbook.getWorkbook(new File("./TestData/Test_Suite1.xls"));

	// This will read master sheet and check row count
     int total_tc_count=Workbook.getWorkbook(new File("./TestData/Test_Suite1.xls")).getSheet(0).getRows();
	
	 al=new ArrayList<String>(); 
     
     for(int i=1;i<total_tc_count;i++){
    	 
      String status=wb.getSheet(0).getCell(1,i).getContents();
      
      if(status.equalsIgnoreCase("Y")){
    	  
    	  al.add(wb.getSheet(0).getCell(0,i).getContents());
    	  
      }
    	   
    	 
     }
     
     System.out.println("Total TC whose status is Y "+al.size());
     
	 int row_count=wb.getSheet(1).getRows();
	
	 driver=new FirefoxDriver();
	 
	 
	 
	 for(int j=0;j<al.size();j++) { 
	 
         
	   String tc_name=al.get(j);
	   
	    wwb=Workbook.createWorkbook(new File("./excel-report/"+tc_name+".xls"));
		 
	   WritableSheet wsh1=wwb.createSheet(tc_name,0); 
	   System.out.println("Running TC is "+tc_name); 
	   
	   System.out.println("Total number of rows is"+ row_count);
	
	  for(int i=1;i<row_count;i++){
		  
		  System.out.println(i);
		  
		 
		  
		 String object_type= wb.getSheet(tc_name).getCell(0,i).getContents();
		 String locator_type= wb.getSheet(tc_name).getCell(1,i).getContents();
		 String locator_value= wb.getSheet(tc_name).getCell(2,i).getContents();
		 String local_action= wb.getSheet(tc_name).getCell(3,i).getContents();
		 String actual_data= wb.getSheet(tc_name).getCell(4,i).getContents();
		 String expected_values= wb.getSheet(tc_name).getCell(5,i).getContents();
		 String description = wb.getSheet(tc_name).getCell(6,i).getContents();
		 
		 
		 if(object_type.equalsIgnoreCase("URL")){
			 
		  String result= OpenApplication.loadApp(driver, actual_data);
		
		 if(result.equalsIgnoreCase("Pass")){
			 
			 wsh1.addCell(new Label(0, i, description));
			 wsh1.addCell(new Label(1,i,result));
		 }else{
			 wsh1.addCell(new Label(0, i, description));
			 wsh1.addCell(new Label(1,i,"Fail"));
			 wsh1.addCell(new Label(2, i, result));
		 }
		
		
		
		 }
		 
		 if(object_type.equalsIgnoreCase("Textbox")){
			 
			 if(locator_type.equalsIgnoreCase("id")){
				 
			String result=Textbox.typeById(driver, locator_value, actual_data);
			
			 if(result.equalsIgnoreCase("Pass")){
				 
				 wsh1.addCell(new Label(0, i, description));
				 wsh1.addCell(new Label(1,i,result));
			 }else{
				 wsh1.addCell(new Label(0, i, description));
				 wsh1.addCell(new Label(1,i,"Fail"));
				 wsh1.addCell(new Label(2, i, result));
				 
			 }
			
			
			 }
			 
			 
			 if(locator_type.equalsIgnoreCase("name")){
				 
					String result=Textbox.typeByName(driver, locator_value, actual_data);
					
					 if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
					
					 }
			 
			 
			 if(locator_type.equalsIgnoreCase("xpath")){
				 
					String result=Textbox.typeByXpath(driver, locator_value, actual_data);
					
					 if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
					
					 }
			 
			 	 
		 }
   
		
		 if(object_type.equalsIgnoreCase("Button")){
			 
			 if(locator_type.equalsIgnoreCase("id")){
				 
				String result= Button.clickById(driver, locator_value);
				
				if(result.equalsIgnoreCase("Pass")){
					 
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,result));
				 }else{
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,"Fail"));
					 wsh1.addCell(new Label(2, i, result));
				 }
				
			 }
			 
			 
			 if(locator_type.equalsIgnoreCase("name")){
				 
					String result= Button.clickByName(driver, locator_value);
					
					if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
				 }
			 
			 
			 if(locator_type.equalsIgnoreCase("xpath")){
				 
					String result= Button.clickByXpath(driver, locator_value);
					
					if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
				 }
		 }
		 
		   
       if(object_type.equalsIgnoreCase("verifyError")){
    	   
    	   lib.Verification.verifyError(driver, locator_value, expected_values);
    	   
    	   
       }
		 
		 
 
      if(object_type.equalsIgnoreCase("DropDown")){
			 
			 if(locator_type.equalsIgnoreCase("id")){
				 
				 if(local_action.equalsIgnoreCase("index")){
					 
					 
					int lindex= Integer.parseInt(actual_data);
				 
			String result=Dropdown.selectByIdAndIndex(driver, locator_value,lindex);
			
			 if(result.equalsIgnoreCase("Pass")){
				 
				 wsh1.addCell(new Label(0, i, description));
				 wsh1.addCell(new Label(1,i,result));
			 }else{
				 wsh1.addCell(new Label(0, i, description));
				 wsh1.addCell(new Label(1,i,"Fail"));
				 wsh1.addCell(new Label(2, i, result));
			 }
			
			
			 }
				 
				 
				 
				 if(local_action.equalsIgnoreCase("visibletext")){
					 
						String result=Dropdown.selectByIdAndVisibleText(driver, locator_value, actual_data);
						
						 if(result.equalsIgnoreCase("Pass")){
							 
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,result));
						 }else{
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,"Fail"));
							 wsh1.addCell(new Label(2, i, result));
						 }
						
						
						 }		 
				 
				 
				 if(local_action.equalsIgnoreCase("value")){
					 
						String result=Dropdown.selectByIdAndvalue(driver, locator_value, actual_data);
						
						 if(result.equalsIgnoreCase("Pass")){
							 
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,result));
						 }else{
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,"Fail"));
							 wsh1.addCell(new Label(2, i, result));
						 }
						 }
				 
		 }}
   
		 
	

     
			  /* if(object_type.equalsIgnoreCase("DropDown")){
				 
				 if(locator_type.equalsIgnoreCase("name")){
					 if(local_action.equalsIgnoreCase("index")){
					 
				String result=Dropdown.selectByNameAndIndex(driver, locator_value, actual_data);
				
				 if(result.equalsIgnoreCase("Pass")){
					 
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,result));
				 }else{
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,"Fail"));
					 wsh1.addCell(new Label(2, i, result));
				 }
				
				
				 }
			 }}*/
	   
	   if(object_type.equalsIgnoreCase("DropDown")){
				 
				 if(locator_type.equalsIgnoreCase("name")){
					 if(local_action.equalsIgnoreCase("visibletext")){
					 
				String result=Dropdown.selectByNameAndVisibleText(driver, locator_value, actual_data);
				
				 if(result.equalsIgnoreCase("Pass")){
					 
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,result));
				 }else{
					 wsh1.addCell(new Label(0, i, description));
					 wsh1.addCell(new Label(1,i,"Fail"));
					 wsh1.addCell(new Label(2, i, result));
				 }
				
				
				 }
				 }
	  
	          }
			 
				  if(object_type.equalsIgnoreCase("DropDown")){
						 
						 if(locator_type.equalsIgnoreCase("name")){
							 if(local_action.equalsIgnoreCase("value")){
							 
						String result=Dropdown.selectByNameAndvalue(driver, locator_value, actual_data);
						
						 if(result.equalsIgnoreCase("Pass")){
							 
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,result));
						 }else{
							 wsh1.addCell(new Label(0, i, description));
							 wsh1.addCell(new Label(1,i,"Fail"));
							 wsh1.addCell(new Label(2, i, result));
						 }
						 }
						 
						
						
						 }
					 }


	     
	      
				  /* if(object_type.equalsIgnoreCase("DropDown")){
					 
					 if(locator_type.equalsIgnoreCase("xpath")){
						 if(local_action.equalsIgnoreCase("index")){
						 
					String result=Dropdown.selectByXpathAndIndex(driver, locator_value, actual_data);
					
					 if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
					
					 }
				 }}*/
		   
		   if(object_type.equalsIgnoreCase("DropDown")){
					 
					 if(locator_type.equalsIgnoreCase("xpath")){
						 if(local_action.equalsIgnoreCase("visibletext")){
						 
					String result=Dropdown.selectByXpathAndVisibleText(driver, locator_value, actual_data);
					
					 if(result.equalsIgnoreCase("Pass")){
						 
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,result));
					 }else{
						 wsh1.addCell(new Label(0, i, description));
						 wsh1.addCell(new Label(1,i,"Fail"));
						 wsh1.addCell(new Label(2, i, result));
					 }
					
					
					 }
					 }
		  
		          }
				 
					  if(object_type.equalsIgnoreCase("DropDown")){
							 
							 if(locator_type.equalsIgnoreCase("xpath")){
								 if(local_action.equalsIgnoreCase("value")){
								 
							String result=Dropdown.selectByXpathAndvalue(driver, locator_value, actual_data);
							
							 if(result.equalsIgnoreCase("Pass")){
								 
								 wsh1.addCell(new Label(0, i, description));
								 wsh1.addCell(new Label(1,i,result));
							 }else{
								 wsh1.addCell(new Label(0, i, description));
								 wsh1.addCell(new Label(1,i,"Fail"));
								 wsh1.addCell(new Label(2, i, result));
							 }
							 }
							 
							
							
							 }
						 }
					  
					  
					  
				if(object_type.equalsIgnoreCase("lookup")){
					
					
					if(locator_type.equalsIgnoreCase("xpath")){
						
						String parent_title=driver.getTitle();

						System.out.println("Main window title is "+parent_title);
						
						Button.clickByXpath(driver, locator_value);
						
						Thread.sleep(5000);
								
						Set<String>s1= driver.getWindowHandles();

						Iterator<String> i1=s1.iterator();

						 while(i1.hasNext()){
							
						String child=i1.next();
						
						String child_title=driver.switchTo().window(child).getTitle();

						System.out.println("Now tiltle is "+child_title);
						
						if(!parent_title.equalsIgnoreCase(child_title)){
							
							String title=driver.switchTo().window(child).getTitle();
							
							System.out.println("Title where to switch is"+title);
							
							SwitchTo.switchFrameByName(driver, "searchFrame");
							
							driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys(actual_data);
							
							driver.findElement(By.xpath("//input[@name='go']")).click();
							
							
							SwitchTo.switchToDefaultContent(driver);
							
							
							SwitchTo.switchFrameByName(driver, "resultsFrame");
							
							
						   String record_xpath="//div[@class='bPageBlock brandSecondaryBrd secondaryPalette']//*[contains(text(),'"+actual_data+"')]";	
						  
						   System.out.println(record_xpath);
						  
						   driver.findElement(By.xpath(record_xpath)).click();
						}
						
						driver.switchTo().window(parent_title);

						
						}

						
						
						
					}
					
					
				}
					  
					  
				if(object_type.equalsIgnoreCase("Wait")){
					
					int time=Integer.parseInt(actual_data);
					Sync.lsleep(time);
				}
				
				
					  
					  if(object_type.equalsIgnoreCase("Link")){
							 
							 if(locator_type.equalsIgnoreCase("linkText")){
								 
								String result= Link.clickByLinkText(driver, locator_value);
								
								if(result.equalsIgnoreCase("Pass")){
									 
									 wsh1.addCell(new Label(0, i, description));
									 wsh1.addCell(new Label(1,i,result));
								 }else{
									 wsh1.addCell(new Label(0, i, description));
									 wsh1.addCell(new Label(1,i,"Fail"));
									 wsh1.addCell(new Label(2, i, result));
								 }
								
							 }
							 
							 if(locator_type.equalsIgnoreCase("xpath")){
								 
									String result= Link.clickByXpath(driver, locator_value);
									
									if(result.equalsIgnoreCase("Pass")){
										 
										 wsh1.addCell(new Label(0, i, description));
										 wsh1.addCell(new Label(1,i,result));
									 }else{
										 wsh1.addCell(new Label(0, i, description));
										 wsh1.addCell(new Label(1,i,"Fail"));
										 wsh1.addCell(new Label(2, i, result));
									 }
									
								 }

		
	}
					  
				}
	  
	 }
	
	}
	
	
	@AfterTest
	public void quitApp() throws Exception{
		
		driver.quit();
		
		try {
			wwb.write();
			wwb.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
