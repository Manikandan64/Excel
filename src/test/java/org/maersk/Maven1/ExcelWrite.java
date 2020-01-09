package org.maersk.Maven1;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\Mani\\eclipse-workspace\\Maven1\\Testdata\\ExcelWrite.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		Row r = s.createRow(5);
		Cell c = r.createCell(6);
		c.setCellValue("ManiKandan");
		
	FileOutputStream o = new FileOutputStream(f);
	w.write(o);
	System.out.println("Done");
	
		
		
		
		
		
	}

}
