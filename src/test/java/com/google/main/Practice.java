package com.google.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.pages.LoginPage;
import com.google.utils.BaseClass;

public class Practice extends BaseClass
{

	public static WebDriver driver;
	
	LoginPage l;
	
	@BeforeClass
	@Parameters("browser")
	public void sample(String browser)
{
	driver=WebBrowser(browser);
	
	l=new LoginPage();
}

	@BeforeMethod
	@Parameters("url")
	public void sample2(String URl)
{
	openurl(URl);
	
	maxi();
	
	iwait(30);
}

	@Test
	@Parameters({"user","pass"})
	public void sample3(String username,String password)
{
	Sendvalue(l.getUsername(),username);
	
	Sendvalue(l.getPassword(), password);
	
	tap(l.getLogin());
}

	@AfterMethod
	public void sample4()
{
	System.out.println("After Method Success");
}

	@AfterClass
	public void sample5()
{
	driver.close();
}
}
