package com.chs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chs.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']/li[1]/a")
	public WebElement signinUp;
	
	@FindBy(xpath="//*[@id='student-signup']")
	public WebElement studentButton;
	
	@FindBy(xpath="//*[@id='signup-title']/p[1]")
	public WebElement studentTitle; 
	
	@FindBy(id="id_first_name")
	public WebElement firstName;
	
	@FindBy(id="id_last_name")
	public WebElement lastName;
	
	@FindBy(id="id_email")
	public WebElement email;
	
	@FindBy(id="id_password")
	public WebElement pasword;
	
	@FindBy(id="id_password_match")
	public WebElement confirmPassword;
	
	@FindBy(id="id_class_code")
	public WebElement clasCode;
	
	@FindBy(id="register-button")
	public WebElement createAccountButton;
	
}
