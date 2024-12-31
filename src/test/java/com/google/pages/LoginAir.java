package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class LoginAir extends BaseClass
{

	public LoginAir()
	{
		PageFactory.initElements(driver, this);;
	}
	
	@FindBy(xpath="//div[@class='miles_user']//i")
	
	WebElement login;
	
	@FindBy(xpath="//input[@id='reg_btn']")
	
	WebElement signup;
	
	@FindBy(xpath="//input[@id='cph_txtUserID']")
	
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='cph_txtPassword']")
	
	WebElement password;
	
	@FindBy(xpath="//input[@id='cph_txtConfirmPassword']")
	
	WebElement reenterpassword;
	
	@FindBy(xpath="//select[@id='cph_ddlTitle']")
	
	WebElement tittle;
	
	@FindBy(xpath="//input[@id='cph_txtGivenName']")
	
	WebElement givenname;
	
	@FindBy(xpath="//input[@id='cph_txtSurName']")
	
	WebElement familyname;

	@FindBy(xpath="//select[@id='cph_ddlDOBDay']")
	
	WebElement day;
	
	@FindBy(xpath="//select[@id='cph_ddlDOBMonth']")
	
	WebElement month;
	
	@FindBy(xpath="//select[@id='cph_ddlDOBYear']")
	
	WebElement year;
	
	@FindBy(xpath="//input[@id='cph_RBLGender_0']")
	
	WebElement gender;
	
	@FindBy(xpath="//input[@id='cph_txtMailingAddress1']")
	
	WebElement mailingaddress;
	
	@FindBy(xpath="//div[@id='dvCaptcha']//iframe")
	
	WebElement iframe;
	
	public WebElement getIframe() {
		return iframe;
	}

	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	
	WebElement robotick;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getReenterpassword() {
		return reenterpassword;
	}

	public WebElement getTittle() {
		return tittle;
	}

	public WebElement getGivenname() {
		return givenname;
	}

	public WebElement getFamilyname() {
		return familyname;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMailingaddress() {
		return mailingaddress;
	}

	public WebElement getRobotick() {
		return robotick;
	}
	
	
	
	

	
	

	

	
	
	

}
