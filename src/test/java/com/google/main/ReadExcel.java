package com.google.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
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
					
					CellType type = cell.getCellType();
					
					String celltype = type.toString();
					
					//System.out.println(celltype);
					
					if(celltype.equals("STRING"))
					{
						String cellValue = cell.getStringCellValue();
						
						System.out.println(cellValue);
					}
					else if(celltype.equals("NUMERIC"))
					{
						if(DateUtil.isCellDateFormatted(cell))
						{
							Date date = cell.getDateCellValue();
							
							SimpleDateFormat s=new SimpleDateFormat("dd-MMM-YYYY");
							
							String format = s.format(date);
							
							System.out.println(format);
						}
						else
						{
							double numericCellValue = cell.getNumericCellValue();
							
							Long l=(long)numericCellValue;
							
							System.out.println(l);
						}
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
