package config;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import lib.Button;
import lib.Dropdown;
import lib.Link;
import lib.OpenApplication;
import lib.Tab;
import lib.Textbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainConfig {
	
	
	@Test
	public void readHybrid() throws Exception{
		
		
	Workbook wb=Workbook.getWorkbook(new File("./TestData/Test_Suite.xls"));
	
	WritableWorkbook wwb=Workbook.createWorkbook(new File("./excel-report/reporT21.xls")); 
	
	WritableSheet wsh1=wwb.createSheet("login",0);
		
	 int row_count=wb.getSheet(0).getRows();
	
	 WebDriver driver=new FirefoxDriver();
	 
	 System.out.println("Total number of rows is"+ row_count);
	
	  for(int i=1;i<row_count;i++){
		  
		 String object_type= wb.getSheet(0).getCell(0,i).getContents();
		 String locator_type= wb.getSheet(0).getCell(1,i).getContents();
		 String locator_value= wb.getSheet(0).getCell(2,i).getContents();
		 String local_action= wb.getSheet(0).getCell(3,i).getContents();
		 String actual_data= wb.getSheet(0).getCell(4,i).getContents();
		 String expected_values= wb.getSheet(0).getCell(5,i).getContents();
		 String description = wb.getSheet(0).getCell(6,i).getContents();
		 
		 
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
		 }
      if(object_type.equalsIgnoreCase("Textbox")){
			 
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
		 }
      if(object_type.equalsIgnoreCase("Textbox")){
			 
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
		 }
		 
		   
         if(object_type.equalsIgnoreCase("Button")){
			 
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
		 }
		 
         if(object_type.equalsIgnoreCase("Button")){
	 
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
 if(object_type.equalsIgnoreCase("Tab")){
			 
			 if(locator_type.equalsIgnoreCase("id")){
				 
			String result=Tab.tabById(driver, locator_value, actual_data);
			
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
      if(object_type.equalsIgnoreCase("Tab")){
			 
			 if(locator_type.equalsIgnoreCase("name")){
				 
			String result=Tab.tabByName(driver, locator_value, actual_data);
			
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
      if(object_type.equalsIgnoreCase("Tab")){
			 
			 if(locator_type.equalsIgnoreCase("xpath")){
				 
			String result=Tab.tabBXpath(driver, locator_value, actual_data);
			
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
     /* if(object_type.equalsIgnoreCase("DropDown")){
			 
			 if(locator_type.equalsIgnoreCase("id")){
				 if(local_action.equalsIgnoreCase("index")){
				 
			String result=Dropdown.selectByIdAndIndex(driver, locator_value, actual_data);
			
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
			 
			 if(locator_type.equalsIgnoreCase("id")){
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
			 }
  
          }
		 
			  if(object_type.equalsIgnoreCase("DropDown")){
					 
					 if(locator_type.equalsIgnoreCase("id")){
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
					 
					
					
					 }
				 }


     
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
						 }
					  if(object_type.equalsIgnoreCase("Link")){
							 
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
	  wwb.write();
	  wwb.close();
	 
		
	}

}
