package com.google.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.pages.Accpages;
import com.google.utils.BaseClass;

public class OpenCartprogram extends BaseClass
{

	public static WebDriver driver;
	
	Accpages a;
	
	@BeforeClass
	public void browser()
	{
		driver=WebBrowser("Chrome");
		
		a=new Accpages();
	}
	@BeforeMethod
	public void url()
	{
		
		openurl("https://demo.opencart.com/");
		
		maxi();
		
		iWait(30);
	}
	@Test
	public void datapas ()
	{
		jscrpt(a.getAccount());
		
		hit(a.getConti());
		
		sendvalue(a.getFirstname(), "SALEEM");
		
		sendvalue(a.getLastname(), "Jahan");
		
		sendvalue(a.getEmail(), "jahanbtech@gmail.com");
		
		sendvalue(a.getPassword(), "Asinajahan14");
		
		jscrpt(a.getSub());
		
		jscrpt(a.getAgree());
		
	}
	@AfterMethod
	public void valid()
	{
		System.out.println("validation completed");
	}
	@AfterClass
	public void clo()
	{
//		driver.close();
	}
	
	
}
