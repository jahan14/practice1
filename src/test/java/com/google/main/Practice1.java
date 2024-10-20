package com.google.main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1 
{

	@BeforeSuite
	public void sample1()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void sampe2() 
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void sample3()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void sample4()
	{
		System.out.println("before method");
	}
	@Test(retryAnalyzer = RetryFailed.class)
	public void  abc()
	{
		System.out.println("abc");
		
		System.out.println(10/0);
	}
	@Test(retryAnalyzer = RetryFailed.class)
	public void xyz()
	{
		System.out.println("xyz test");
		
		System.out.println(10/0);
		
		
	}
	@Test
	public void def()
	{
		System.out.println("def test");
		
		System.out.println(10/0);
	}
	@Test
	public void fgh()
	{
		System.out.println("abc test");
	}
	
	@AfterMethod
	public void sample6() 
	{
		System.out.println("after method");
	}
	@AfterClass
	public void sample7()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void sample8()
	{
		System.out.println("after test");
	}
	@AfterSuite
	public void sample9()
	{
		System.out.println("after suite");
	}

}
