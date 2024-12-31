package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class AccountPage extends BaseClass
{

	public AccountPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='Account']")
	
	WebElement account;
	
	@FindBy(xpath="//span[text()='Account Details']")
	
	WebElement accountdetails;
	
	@FindBy(xpath="//a[text()='Edit']")
	
	WebElement edit;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getAccountdetails() {
		return accountdetails;
	}

	public WebElement getEdit() {
		return edit;
	}
	
	
}
