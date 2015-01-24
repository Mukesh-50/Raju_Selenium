package excelread;

import java.io.File;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


import org.testng.annotations.Test;

public class TestReadExcel {

	@Test
	public void readData() throws Exception{
		
		
	    File src = new File("C:/Users/Kamraj/Automation/TestProject/TestData/Data.xls");
	  
	    System.out.println("File path specified");
	 
	    Workbook wb= Workbook.getWorkbook(src);
	    
	    System.out.println("workbook loaded");
	    
	    Sheet sh1=wb.getSheet(0);
	    
	    System.out.println("Sheet loaded");
	    
	    Cell c1=sh1.getCell(1, 0);
	    
	    System.out.println("Cell loaded");
	    
	    String data1= c1.getContents();
	   
	    System.out.println("Data from Excel is >>>"+data1);
	   
		
	}
	
}
