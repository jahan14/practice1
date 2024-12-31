package com.google.main;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.google.pages.LinkAirHomePage;
import com.google.pages.LoginAir;
import com.google.utils.BaseClass;

public class LinkAirProgram extends BaseClass
{

	public static WebDriver driver;
	
	LoginAir l;
	
	LinkAirHomePage h;
	
	@BeforeClass
	public void  Browser()
	{
		driver=WebBrowser("Egde");
		
		l=new LoginAir();
		
		h=new LinkAirHomePage();
	}
	@BeforeMethod
	public void  url()
	{
		openurl("https://www.linkairways.com/");
		
		maxi();
		
		iWait(30);
	}
	@Test
	public void  Test()
	{
//		hit(l.getLogin());
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		Vector<String> all=new Vector<String>();
//		
//		all.addAll(windowHandles);
//		
//		driver.switchTo().window(all.get(1));
//		
//		hit(l.getSignup());
//		
//		sendvalue(l.getFirstname(), "Saleemjahan");
//		
//		sendvalue(l.getPassword(), "Asinajahan14");
//		
//		sendvalue(l.getReenterpassword(), "Asinajahan14");
//		
//		selection(l.getTittle(), "Mr.");
//		
//		sendvalue(l.getGivenname(), "jahan");
//		
//		sendvalue(l.getFamilyname(), "sal");
//		
//		selection(l.getDay(), "20");
//		
//		selection(l.getMonth(), "May");
//		
//		selection(l.getYear(), "1993");
//		
//		hit(l.getGender());
//		
//		sendvalue(l.getMailingaddress(), "jahanbtech@gmail.com");
//		
//		driver.switchTo().frame(l.getIframe());
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		valid(title, "SignUp | Link Airways");
//		
//		
//		
//		jscrpt(l.getRobotick());
		
		
		hit(h.getOneway());
		
		hit(h.getFrom());
		
		
	
		
		
		
		
	}
	@AfterMethod
	public void  Valid()
	{
	
		System.out.println("validation completed");
	}
	@AfterClass
	public void  clo()
	{
//		driver.close();
	}
}
