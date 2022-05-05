package com.f1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.Table.Cell;

public class readexcel extends reporter {
	
	@BeforeTest(alwaysRun=true)
	public static void ExcelConnect() {
		FileInputStream fis;
		XSSFWorkbook workbook = null;
		try {
			fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		XSSFSheet sheet = workbook.getSheetAt(0);
	}
	
	public static String getStringCellData(String TestCaseName,String ColumnName) {
		//ExcelConnect();
		String value="";
		XSSFSheet sheet = null ;
		Iterator<Row> rowiterator=sheet.rowIterator();//1111
		while(rowiterator.hasNext()){
			Row row=rowiterator.next();
			int column=getColumnNumber(ColumnName);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
				switch(row.getCell(column).getCellType()) {
				case STRING:
					return value=row.getCell(column).getStringCellValue();
				case BLANK:
					break;
				default:
					break;
			}
		}		
	}
		return value;
	}
	
	public void getCellData(String TestCaseName,String ColumnName) {
		XSSFSheet sheet = null;
		Iterator<Row> rowiterator=sheet.rowIterator();
		while(rowiterator.hasNext()){
			Row row=rowiterator.next();
			int column=getColumnNumber(ColumnName);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
				
				switch(row.getCell(column).getCellType()) {
				
				case STRING:
					row.getCell(column).getStringCellValue();
					break;
					
				case NUMERIC:
					row.getCell(column).getNumericCellValue();
					break;
				case BOOLEAN:
					row.getCell(column).getBooleanCellValue();
					break;
				default:
					break;
							
				}
			}
		}
		}
	
	public static int getColumnNumber(String ColumnName) {
		XSSFSheet sheet = null;
		Iterator<org.apache.poi.ss.usermodel.Cell> coliterator=sheet.getRow(0).cellIterator();
		while(coliterator.hasNext()) {
			Cell cell=(Cell) coliterator.next();
			while(((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue().equalsIgnoreCase(ColumnName)) {
				return ((org.apache.poi.ss.usermodel.Cell) cell).getColumnIndex();
			}
		}
		
		return 0;
	}
	
	public static double getNumericCellData(String TestCaseName,String ColumnName) {
		
		double value=0.0;
		XSSFSheet sheet = null;
		Iterator<Row> rowiterator=sheet.rowIterator();
		while(rowiterator.hasNext()){
			Row row=rowiterator.next();
			int column=getColumnNumber(ColumnName);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
				System.out.println("CellType" +row.getCell(column).getCellType());
				switch(row.getCell(column).getCellType()) {
				case NUMERIC:
					return value=row.getCell(column).getNumericCellValue();
				case BLANK:
					break;
				default:
					break;
			}
		}		
	}
		return value;
	}
}