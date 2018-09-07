package com.chs.testsCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.chs.pages.LoginPage;
import com.chs.testBase.TestBase;
import com.github.javafaker.Faker;

public class LoginTest extends TestBase {
	
	LoginPage login = new LoginPage(); 
	
	@Test(description = "LoginTest", priority = 1)
	public void LoginSetUp() {
		String title=driver.getTitle();
		String actualTitle="CodeHS - Teach Coding and Computer Science at Your School | CodeHS";
		
		assertEquals(actualTitle, title);
		login.signinUp.click();
	}
	
	@Test(description="StudentLogin", priority = 2)
	public void StudentSign() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.studentButton.click();
		
		String title=login.studentTitle.getText();
		String actualTitle="CREATE A STUDENT ACCOUNT";
		assertEquals(title, actualTitle);
		System.out.println(title);
	}
	
	@Test(description="filloutForm",priority=3)
	public void fillOutForm() {
		 Faker faker = new Faker();
		 login.firstName.sendKeys(faker.name().firstName());
		 login.lastName.sendKeys(faker.name().lastName());
		 login.email.sendKeys(faker.internet().emailAddress());
		 
		 String passw=faker.internet().password();
		 login.pasword.sendKeys(passw);
		 login.confirmPassword.sendKeys(passw);
		 
		 login.clasCode.sendKeys("17F28");
		 login.createAccountButton.click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
