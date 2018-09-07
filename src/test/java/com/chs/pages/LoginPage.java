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
	
	
}
