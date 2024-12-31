package com.google.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RerunAllFailed 
{

	 public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	 {
		    
		 IRetryAnalyzer analyzer = null;
		 
		 if(analyzer==null)
		 {
			 annotation.setRetryAnalyzer(RetryFailed.class);
		 }
		 
		  }
}
