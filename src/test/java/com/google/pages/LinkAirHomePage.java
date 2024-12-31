package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class LinkAirHomePage extends BaseClass
{

	public LinkAirHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//form[@id='flightSearchForm']//label)[2]")
	
	WebElement oneway;

	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]")
	
	WebElement from;

	@FindBy(xpath="//li[@id='select2-departCity-result-0m9d-ARM']")
	
	WebElement armidale;
	
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[2]")
	
	WebElement to;
	
	@FindBy(xpath="//li[@id='select2-arrivalCity-result-z8xo-ZBL']")
	
	WebElement BNE;

	public WebElement getOneway() {
		return oneway;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getArmidale() {
		return armidale;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getBNE() {
		return BNE;
	}
	
	
	
	
	
	
	
	
}
