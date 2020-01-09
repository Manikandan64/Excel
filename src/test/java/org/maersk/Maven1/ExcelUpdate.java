package org.maersk.Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws Throwable {
		
		File loc = new File("C:\\\\Users\\\\Mani\\\\eclipse-workspace\\\\Maven1\\\\Testdata\\\\ExcelWrite.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.createRow(5);
		Cell c = r.createCell(6);
		c.setCellValue("SugaPriya");
		FileOutputStream f=new FileOutputStream(loc);
		w.write(f);
		System.out.println("Updated Successfully");		
		
	}
}
