package com.chs.testBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.chs.utilities.ConfigurationReader;
import com.chs.utilities.Driver;

public abstract class TestBase {
	
	 protected WebDriver driver;
	//@parameters--> means that this method will expect an argument from the xml file
	  //name of the parameter in the xlm file is browser
	  
	  @Parameters("browser")
	  @BeforeMethod
	  public void setUp(@Optional String browser) { //optional means you may/not pass a parameter.
	    driver = Driver.getDriver(browser);
	    driver.get(ConfigurationReader.getProperty("url"));
	  }

	  @AfterMethod
	  public void tearDown() {
//	    Driver.closeDriver();

	  }

}
