package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Data {

	public static void read_Particular_Data() throws IOException {
		File f = new File("E:\\Java Selenium Testing\\Tasks and time sheet\\Read_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		System.out.println("Particular Data: "+ stringCellValue);	
		}
		else if (cellType.equals(CellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int a = (int) value;
		System.out.println("Particular Data: "+ a);
		}
	}
	
	public static void read_All_Data() throws IOException {
		File f = new File("E:\\Java Selenium Testing\\Tasks and time sheet\\Read_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Getting All Data in The Sheet:");
		for (int i=0; i<numberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		int NumberOfCells = row.getPhysicalNumberOfCells();
		for(int j=0; j<NumberOfCells;j++) {
		String string = row.getCell(j).toString();
		System.out.println(string);
//		CellType cellType = cell.getCellType();
//		if(cellType.equals(CellType.STRING)) {
//				String stringCellValue = cell.getStringCellValue();
//				System.out.println(stringCellValue);
//				}
//				else if (cellType.equals(CellType.NUMERIC)) {
//				double value = cell.getNumericCellValue();
//				int a = (int) value;
//				System.out.println(a);
//				}
		}
		}
		}
	
	public static void read_Single_Row_Data() throws IOException {
		File f = new File("E:\\Java Selenium Testing\\Tasks and time sheet\\Read_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		System.out.println("Getting A Particular Row Data:");
		Row row = sheetAt.getRow(3);
		int NumberOfCells = row.getPhysicalNumberOfCells();
		for (int i=0; i<NumberOfCells; i++) {
		Cell cell = row.getCell(i);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
				else if (cellType.equals(CellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int a = (int) value;
				System.out.println(a);}}}
	
	public static void read_Single_Cell_Data() throws IOException {
		File f = new File("E:\\Java Selenium Testing\\Tasks and time sheet\\Read_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Getting A Particular Cell Data:");
		for (int i=0; i<numberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int a = (int) value;
				System.out.println(a);}}}

	@Test
	public static void main() throws Throwable {
		 read_Particular_Data();
//		 read_All_Data();
		 read_Single_Row_Data();
		 read_Single_Cell_Data();
	}
}