package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shaik\\Documents\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		Row r = ws.getRow(0);
		Cell c = r.getCell(1);
		c.setCellValue("SSSSSSSSSSSSSSS");
		
		
		r=ws.getRow(1);
		c=r.createCell(4);
		c.setCellValue("AzamSk");
		
		r=ws.createRow(3);
		c=r.createCell(0);
		c.setCellValue("abcde");
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\Shaik\\Documents\\Book1.xlsx");
		wb.write(f);
	}

}
