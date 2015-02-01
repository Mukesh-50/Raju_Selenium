package excelread;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class TestWriteExcel {

	
	@Test
	public void writeExcel() throws Exception{
		
		
		  File src=new File("C:/testdata1/report1.xls");
		
		
          WritableWorkbook wwb=Workbook.createWorkbook(src);
         
         
          WritableSheet wsh1=wwb.createSheet("TC1",0);
          
          
          Label l1=new Label(0, 0, "Selenium");
          Label l2=new Label(0, 1, "IDE");
          Label l3=new Label(0, 2, "QTP");
          
          
          wsh1.addCell(l1);
          wsh1.addCell(l2);
          wsh1.addCell(l3);
          
          
          wwb.write();
          wwb.close();
		
		
	}
	
}
