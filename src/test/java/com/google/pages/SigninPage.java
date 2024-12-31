package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class SigninPage extends BaseClass
{

	public SigninPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@data-testid='Button_signin'])[6]")
	
	WebElement signin;
	
	@FindBy(xpath="//input[@id='signInName']")
	
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	
	WebElement password;
	
	@FindBy(xpath="//button[@id='next']")
	
	WebElement login;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
