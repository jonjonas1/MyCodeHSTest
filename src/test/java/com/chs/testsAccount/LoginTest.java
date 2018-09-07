package com.chs.testsAccount;

import org.testng.annotations.Test;

import com.chs.pages.LoginPage;
import com.chs.testBase.TestBase;

public class LoginTest extends TestBase {
	
	LoginPage login = new LoginPage(); 
	
	
	
	@Test(description = "LoginTest", priority = 1)
	public void defaultSavings() {
		login.signinUp.click();
		
	}
	
	
	
}
