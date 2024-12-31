package com.google.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.graphbuilder.struc.LinkedList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static WebDriver WebBrowser(String browser)
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
		else
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
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
	public static void iWait(int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	public static void hit(WebElement element)
	{
		element.click();
	}
	public static void ale()
	{
		Alert alert=driver.switchTo().alert();
		
		alert.dismiss();
	}
	public static void selection(WebElement element,String value)
	{
		Select s=new Select(element);
		
		s.selectByVisibleText(value);
	}
	
	public static void robo(String ENTER,String CTRL,String V)
	{
		try 
		{
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (AWTException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public void jscrpt(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",element);
	}
	public static void sendvalue(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static void tap(WebElement element)
	{
		element.click();
	}
	public static String ReadExcel(int row,int cell)
	{
		String value=null;
		
		try
		{
			File file=new File("D:\\data.xlsx");
			
			FileInputStream fis=new FileInputStream(file);
			
			Workbook book=new XSSFWorkbook(fis);
			
			Sheet sheet = book.getSheet("jahaan");
			
			Row row2 = sheet.getRow(row);
			
			Cell cell2 = row2.getCell(cell);
			
			  value = cell2.getStringCellValue();
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		return value;
	}
	public static void valid(String act,String exp)
	{
		Assert.assertEquals(act,exp);
	}
	public static String textvalue(WebElement element)
	{
		return element.getText();
	}
}
