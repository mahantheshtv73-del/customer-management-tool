package com.customer.vtiger.genericlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileutilityclass {
	/**
	 * @author Mahanthesh T V
	 * this method is used to read data from property file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdatafrompropertyfile(String key) throws IOException
	{
		FileInputStream f = new FileInputStream("./src/test/resources/testdata/commdata.properties");
		Properties p =new Properties();
		p.load(f);
		
		String data = p.getProperty(key);
		return key;
	}

	/**
	 * this methods is  a generic method used to read data from excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readdatafromexcelforstring(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(ipathconstrains.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
  String data = wb .getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data ;
	
	}
	
	/**
	 * this method is used to read data from numeric value in  excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public double readdatafromexcelfornumeric(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(ipathconstrains.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
  double data = wb .getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	return data ;
	
	}
	
	/**
	 * this method is used to update data from excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void updatedatafromexcel(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(ipathconstrains.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream f = new FileOutputStream(ipathconstrains.path);
	wb.write(f);
	wb.close();
	
	
	}
}
