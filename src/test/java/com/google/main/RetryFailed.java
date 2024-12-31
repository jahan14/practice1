package com.google.main;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer
{

	int retrycount=0;
	
	int retrymaxcount=3;
	
	public boolean retry(ITestResult result)
	{
		if(retrycount<retrymaxcount)
		{
			retrycount++;
			
			return true;
		}
		
		return false;
	}

}
	

	
	
