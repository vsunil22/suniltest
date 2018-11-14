package com.asb.qa.util;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.asb.qa.BaseTest.BaseTest;
import com.gargoylesoftware.htmlunit.javascript.host.worker.Worker;

public class UtilTest extends BaseTest{
	public static long PAGE_LOAD_TIMEOUT =  60;
	public static long IMPLICIT_WAIT =60;
	public static String Testdatashetpath="C:\\Users\\sv78\\eclipse-workspace\\AbstarctCLassExampla\\src\\com\\Asbb\\qa\\Testdata\\Merchant_DataSheet.xls";
	
	
	public static Workbook book;

	static Sheet sheet;
	
	public void switchtoFrame()
	{
		driver.switchTo().frame("");
		
	}
	
	public static Object[][] getTestdata(String sheetname)
	{
		FileInputStream fp=null;
		try {
			fp=new FileInputStream(Testdatashetpath);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(fp);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetname);
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
				
			}
		}
		return data;
		
}
	
	public static void Takescreenshot(String testmethhodname) 
	{
		try
		{
			String curdir=prop.getProperty("currentdir");
			File screnshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screnshotfile, new File(curdir +testmethhodname+".png"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
	}

}
