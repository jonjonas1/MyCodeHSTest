package com.chs.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.chs.utilities.ConfigurationReader;
import com.chs.utilities.Driver;

public abstract class TestBase {
	
	 protected WebDriver driver;
	//@parameters--> means that this method will expect an argument from the xml file
	  //name of the parameter in the xlm file is browser
	  
	  @Parameters("browser")
	  @BeforeClass
	  public void setUp(@Optional String browser) { //optional means you may/not pass a parameter.
	    driver = Driver.getDriver(browser);
	    driver.get(ConfigurationReader.getProperty("url"));
	  }

	  @AfterClass
	  public void tearDown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Driver.closeDriver();

	  }

}
