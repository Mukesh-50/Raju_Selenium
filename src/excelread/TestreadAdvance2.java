package excelread;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class TestreadAdvance2 {

	@Test
	public void readAllRows() throws Exception{
		
		File src=new File("C:/testdata1/data.xls");
		
	    int row_count=Workbook.getWorkbook(src).getSheet(0).getRows();
	    
         System.out.println("Number of rows is "+row_count);
	    
	    for(int i=0;i<row_count;i++){
	    	
	    String data=Workbook.getWorkbook(src).getSheet(1).getCell(0,i).getContents();
    
	    System.out.println(data);
	   
	    }
	    
	    
	   int column_count=Workbook.getWorkbook(src).getSheet(2).getColumns();
	   
	   System.out.println("Number of column is >>"+column_count);
		
	   for(int i=0;i<column_count;i++){
	    	
		    String data=Workbook.getWorkbook(src).getSheet(2).getCell(i,0).getContents();
		    
		    System.out.println(data);
		   
		    
		    }
	
		
	}
	
}
