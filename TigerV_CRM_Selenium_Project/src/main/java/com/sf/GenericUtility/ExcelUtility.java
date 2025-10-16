package com.sf.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * @author SharmilaFahad
	 * @param SheetName
	 * @param RowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String SheetName, int RowIndex,int columnIndex) throws EncryptedDocumentException, IOException {
		/**
		 * This method is used to read String data from excel file
		 */
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Vtiger_TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(RowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	public double getNumericFromExcel(String SheetName, int RowIndex,int columnIndex) throws EncryptedDocumentException, IOException {
		/**
		 * This method is used to Numeric String data from excel file
		 */
		FileInputStream fis=new FileInputStream("./TigerV_CRM_Selenium_project/src/test/resources/TestData/Vtiger_TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(RowIndex).getCell(columnIndex).getNumericCellValue();
	}
	
	public Date getDateFromExcel(String SheetName, int RowIndex,int columnIndex) throws EncryptedDocumentException, IOException {
		/**
		 * This method is used to read Date data from excel file
		 */
		FileInputStream fis=new FileInputStream("./TigerV_CRM_Selenium_project/src/test/resources/TestData/Vtiger_TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(RowIndex).getCell(columnIndex).getDateCellValue();
	}
	
	public boolean getBooleanFromExcel(String SheetName, int RowIndex,int columnIndex) throws EncryptedDocumentException, IOException {
		/**
		 * This method is used to read Boolean data from excel file
		 */
		FileInputStream fis=new FileInputStream("./TigerV_CRM_Selenium_project/src/test/resources/TestData/Vtiger_TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(RowIndex).getCell(columnIndex).getBooleanCellValue();
	}
	
}
