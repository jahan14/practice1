package com.google.main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeProgram 
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
	@BeforeGroups
	public void grp()
	{
		System.out.println("Before Group");
	}
	@Test(groups = "bike")
	public void  abc()
	{
		System.out.println("abc");
	}
	@Test(groups = "car")
	public void xyz()
	{
		System.out.println("xyz test");
	}
	@Test(groups = "bike")
	public void def()
	{
		System.out.println("def test");
	}
	@Test
	public void fgh()
	{
		System.out.println("abc test");
	}
	@AfterGroups
	public void grp1()
	{
		System.out.println("After Group");
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
