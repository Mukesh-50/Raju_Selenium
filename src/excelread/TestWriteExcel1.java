package excelread;

import java.io.File;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class TestWriteExcel1 {

	
	@Test
	public void writeExcel() throws Exception{
		
		
		   File src=new File("C:/Users/Kamraj/Automation/TestProject/TestData/Data2.xls");
		
           WritableWorkbook wwb=Workbook.createWorkbook(src);
         
           wwb.createSheet("TC1",0).addCell(new Label(0, 0,"Apche"));
           
           wwb.createSheet("TC2",1).addCell(new Label(0, 0,"Jexcel"));
           
          
     
          wwb.write();
          wwb.close();
		
		
	}
	
}
