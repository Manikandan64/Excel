package org.maersk.Maven1;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCopy {
	
	public static String getdata(int rowNo, int cellNo) throws Throwable {
		String v=null;
		
		File loc = new File("C:\\Users\\Mani\\eclipse-workspace\\Maven1\\Testdata\\ExcelWrite.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int i = c.getCellType();
		if(i==1) {
			 v = c.getStringCellValue();	
		}
		else if (i==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				 v = sim.format(d);
			}
			else {
				double nv = c.getNumericCellValue();
				long l = (long)nv;
				 v = String.valueOf(l);
			}
			
		}
		return v;
	}

}
