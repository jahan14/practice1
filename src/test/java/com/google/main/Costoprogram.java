package com.google.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.pages.RegisterPage;
import com.google.utils.BaseClass;

public class Costoprogram extends BaseClass
{
	
	public static WebDriver driver; 
	
	RegisterPage r;

	@BeforeClass
	public void Browser()
	{
		driver=WebBrowser("Edge");
		
		r=new RegisterPage();
		
	}
	
	@BeforeMethod
	public void url()
	{	
		
		openurl("https://demo.nopcommerce.com/");
		
		maxi();
		
		iWait(30);
	}
	@Test
	public void Datapass()
	{

		hit(r.getRegister());
		
		tap(r.getGender());
		
		sendvalue(r.getFirstname(), "Saleem");
		
		sendvalue(r.getLastname(), "Jahan");
		
		sendvalue(r.getDay(), "20");
		
		sendvalue(r.getMonth(), "May");
		
		sendvalue(r.getYear(), "1993");
		
		sendvalue(r.getEmail(), "jahanbtech@gmail.com");
		
		sendvalue(r.getCompany(), "TechLeaf");
		
		sendvalue(r.getPassword(), "Asinajahan14");
		
		sendvalue(r.getConfirmpassword(), "Asinajahan14");
		
		
		
	}
	@AfterMethod
	public void Validation()
	{
	   System.out.println("validation completed");
	}
	@AfterClass
	public void clo()
	{
		//driver.close();
	}
}
