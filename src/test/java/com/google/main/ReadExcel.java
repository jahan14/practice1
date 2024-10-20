package com.google.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{

	public static void main(String[]args)
	{		
		try
		{
			File file=new File("D:\\Test.xlsx");
			
			FileInputStream fis=new FileInputStream(file);
			
			Workbook book=new XSSFWorkbook(fis);
			
			Sheet sheet = book.getSheet("saleem");
			
			int numberOfRows = sheet.getPhysicalNumberOfRows();
			
			for(int i=0;i<numberOfRows;i++)
			{
				
				Row row = sheet.getRow(i);
				
				int numberOfCells = row.getPhysicalNumberOfCells();
				
			for(int j=0;j<numberOfCells;j++)
			{
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				String cellvalue = cellType.toString();
				
				if(cellvalue.equals("STRING"))
				{
					String value = cell.getStringCellValue();
					
					System.out.println(value);
				}
				else if(cellvalue.equals("NUMERIC"))
				{
					Date date = cell.getDateCellValue();
					
					SimpleDateFormat d=new SimpleDateFormat("dd-MMM-YYYY");
					
					String format = d.format(date);
					
					System.out.println(format);
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					
					long l=(long)numericCellValue;
					
					System.out.println(l);
				}
			}
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
