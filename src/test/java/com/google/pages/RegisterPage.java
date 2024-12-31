package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.BaseClass;

public class RegisterPage extends BaseClass
{

	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='header-links']//a)[1]")
	
	WebElement register;
	
	@FindBy(xpath="//input[@id='gender-male']")
	
	WebElement gender;
	
	@FindBy(xpath="//input[@id='FirstName']")
	
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	
	WebElement lastname;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	
	WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	
	WebElement month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	
	WebElement year;
	
	@FindBy(xpath="//input[@id='Email']")
	
	WebElement email;
	
	@FindBy(xpath="//input[@id='Company']")
	
	WebElement company;
	
	@FindBy(xpath="//input[@id='Password']")
	
	WebElement password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	
	WebElement confirmpassword;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
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

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	
	
	
	
}
