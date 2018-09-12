package testNGDataFreeCRM;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.TestUtil;

public class LoginTest {
	//using excel data to login 
//https://www.youtube.com/watch?v=rxlhK8AeD0Q
	
	WebDriver driver;
	
	@BeforeMethod //runs once for all tests
	public void setUp() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object data[][]= TestUtil.getTestData("login"); //name of the sheet
		return data;
	}
	
	@Test(dataProvider="getLoginData")
	public void loginTest(String username, String password) {
//		driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys(username);
	    driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
	    System.out.println("User clicks the sing in button");
	    //login button:
//	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click()", loginBtn);
	    
	}
	
	
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}

}
