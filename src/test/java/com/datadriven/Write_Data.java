package com.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write_Data{
	
	public static void Write_data() throws Throwable {
		File fi = new File("E:\\Java Selenium Testing\\Tasks and time sheet\\Write_data.xlsx");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new XSSFWorkbook();
		Sheet sh = wb.createSheet("Data");
		Row cretRow = sh.createRow(0);
		Cell cretCell = cretRow.createCell(0);
		cretCell.setCellValue("User Name");
		// wb.createSheet("Data").createRow(0).createCell(0).setCellValue("User Name");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		FileOutputStream fos = new FileOutputStream(fi);
		wb.write(fos);
		wb.close();
		System.out.println("Write data sucessfull");
	}
	
	@Test
	public static void main() throws Throwable {
		
		Write_data();
		
	}
}