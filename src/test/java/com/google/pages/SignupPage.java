package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class SignupPage extends BaseClass
{

	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[text()='Sign In / Register'])[3]")
	
	WebElement signup;
	
	@FindBy(xpath="//a[@id='createAccount']")
	
	WebElement createaccount;
	
	@FindBy(xpath="//input[@id='email']")
	
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='newPassword']")
	
	WebElement password;
	
	@FindBy(xpath="//input[@id='reenterPassword']")
	
	WebElement reenterpassword;
	
	@FindBy(xpath="//button[@id='continue']")
	
	WebElement ent;

	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public void setCreateaccount(WebElement createaccount) {
		this.createaccount = createaccount;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(WebElement emailaddress) {
		this.emailaddress = emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getReenterpassword() {
		return reenterpassword;
	}

	public void setReenterpassword(WebElement reenterpassword) {
		this.reenterpassword = reenterpassword;
	}

	public WebElement getEnt() {
		return ent;
	}

	public void setEnt(WebElement ent) {
		this.ent = ent;
	}
	
	

	
}
