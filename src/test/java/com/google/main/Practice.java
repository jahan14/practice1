package com.google.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.pages.LoginPage;
import com.google.utils.BaseClass;

public class Practice extends BaseClass
{
	
	public static WebDriver driver;
	
	 LoginPage lp;
	 
	 @DataProvider(name="Logindata")
	 
	 public Object[][] data()
	 {
		 return new Object[][] {{"Admin","admin123"}};
	 }

	@BeforeClass
	@Parameters("browser")
	public  void sample(String Browser)
	{
		driver=WebBrowser(Browser);
		
		lp=new LoginPage();
	}
	@BeforeMethod
	@Parameters("url")
	public  void sample1(String URLlink)
	{
		openurl(URLlink);
		
		maxi();
		
		iWait(30);
	}
	@Test(dataProvider = "Logindata")
	public  void sample2(String username,String password)
	{
		sendvalue(lp.getUsername(), username);
		
		sendvalue(lp.getPassword(), password);
		
		tap(lp.getLogin());
	}
	@AfterMethod
	public  void sample3()
	{
		valid("Dashboard", textvalue(lp.getDashBoard()));
	}
	@AfterClass
	public  void sample4()
	{
		driver.close();
	}
}
