

package testng_controlflow;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class DiffirentLoginTests {
	WebDriver driver;							//class-LEVEL Variable for the Entire "Script/Code"
	
	private static void pauseInSeconds() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setUp () {
		
		System.setProperty(
				"webdriver.chrome.driver", 				//Specified any "Web-Driver"
				"./drivers/chromedriver");
		driver = new ChromeDriver();					// 				according to Requirement
		String webUrl = "https://www.saucedemo.com/";	
		driver.get(webUrl);
		driver.manage().window().maximize();
		pauseInSeconds();
	}
	
	@AfterMethod
	public void tearDown () {
		pauseInSeconds();
	//Quit
		driver.quit();
	}
	
	
	@Test (priority = 1) 
	public void positiveLogInandOut() {
	Reporter.log("Starting execution of \"positiveLoginTest\"", true);
		
// Positive Log-In and Out
		String userName = "standard_user";
		String passWord = "secret_sauce";
		
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();
		pauseInSeconds();
		
	// LogOut
	
		WebElement optionModule = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		optionModule.click();
		pauseInSeconds();
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
	Reporter.log("Test completed, quit the Browser section", true);
	
	}
	
	
	@Test (priority = 5)
	public void LockedOutUserTest () {
		
// Locked Out User
				
		String userName = "locked_out_user";
		String passWord = "secret_sauce";
		
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();	
		pauseInSeconds();
		
// Expecting Error Box
		
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println("Error message: " + errorBox.getText());
		
	//CheckPoint
		String exepectedBox = "Epic sadface: Sorry, this user has been locked out.";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox, "worked not worked");
		
	}
	
	
	@Test (priority = 2) 
	public void problemUserTest() {
		
// Problem User Log-In	
		
		String userName = "problem_user";
		String passWord = "secret_sauce";
			
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);		
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();		
		pauseInSeconds();
		
// logout
		
		WebElement optionModule = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		optionModule.click();
		pauseInSeconds();
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
	}
	
	
	@Test (priority = 4)
	public void wrongPasswordTest() {
		
// Wrong Password
		
		String userName = "standard_user";
		String passWord = "132456789";
		
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);	
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);	
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();	
		pauseInSeconds();
		
// Expecting Error Box
		
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println("Error message: " + errorBox.getText());
		
	//CheckPoint
		String exepectedBox = "Epic sadface: Username and password do not match any user in this service";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox, " worked not worked");
		
	}
	
	
	@Test (priority = 3)
	public void wrongUsernameTest() {

// Wrong User Name
		
		String userName = "hello_user";
		String passWord = "secret_sauce";
		
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);		
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();
		pauseInSeconds();
		
// Expecting Error Box
		
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println("Error message: " + errorBox.getText());
		
	//CheckPoint
		
		String exepectedBox = "Epic sadface: Username and password do not match any user in this service";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox, " worked not worked");
		
	}
	
}
