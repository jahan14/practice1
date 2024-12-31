package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class Accpages extends BaseClass
{

	public Accpages()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="((//div[@class='col-sm-3'])[4]//a)[1]")
	
	WebElement account;
	
	@FindBy(xpath="//a[text()='Continue']")
	
	WebElement conti;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-newsletter']")
	
	WebElement sub;
	
	@FindBy(xpath="//input[@name='agree']")
	
	WebElement agree;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getAgree() {
		return agree;
	}
	
	
	
	
}
