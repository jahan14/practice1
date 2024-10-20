package com.google.utils;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	
	public WebDriver WebBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
		return driver;
	}
	public static void openurl(String url)
	{
		driver.get(url);
	}
	public static void maxi()
	{
		driver.manage().window().maximize();
	}
	public static void iwait(int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	public static void Sendvalue(WebElement element,String value)
	{
		element.sendKeys(value);
		
	}
	public static void tap(WebElement element)
	{
		element.click();
	}
	public String ReadExcel(int row,int Cell)
	{
		String value=null;
		
		try 
		{
			File file=new File("D:\\dataa.xlsx");
			
			FileInputStream fis=new FileInputStream(file);
			
			Workbook book=new XSSFWorkbook(fis);
			
			Sheet sheet = book.getSheet("jahan");
			
			Row row2 = sheet.getRow(row);
			
			Cell cell2 = row2.getCell(Cell);
			
			value = cell2.getStringCellValue();
			
			
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		return value;
	}
}
