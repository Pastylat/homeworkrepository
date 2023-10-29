

package testng_controlflow;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Part2Groups {
	WebDriver driver;							//class-LEVEL Variable for the Entire "Script/Code"
	
	private static void pauseInSeconds() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setUp () {
		
		System.setProperty(
				"webdriver.chrome.driver", 				//Specified any "Web-Driver"
				"./drivers/chromedriver");
		driver = new ChromeDriver();					//according to Requirement
		String webUrl = "https://www.saucedemo.com/";	
		driver.get(webUrl);
		driver.manage().window().maximize();
		pauseInSeconds();
	}
	
	public void tearDown () {
		
		pauseInSeconds();
	//Quit
		driver.quit();
	}
	
	
	@Test (priority = 1, groups = "positive") 
	public void positiveLogInandOut() {
	Reporter.log("\nStarting execution of \"Positive LogIn Credentials\"", true);
		
// Positive Log-In and Out
		setUp();
	Reporter.log("SetUp process has finished", true);
	
		String userName = "standard_user";
		String passWord = "secret_sauce";
		
	Reporter.log("\tLocating, Adding and Submiting \"PositiveUser data\"", true);
	
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();
		pauseInSeconds();
		
	Reporter.log("\tFinished the process", true);	
		
	// LogOut
	Reporter.log("skip this LogOut part IN CONSOLE, it's FALSE inside ()", true);
	
		WebElement optionModule = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		optionModule.click();
		pauseInSeconds();
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
	Reporter.log("Test Completed", true);
		pauseInSeconds();
	
	}
	
	
	@Test (priority = 5, groups = "negative")
	public void LockedOutUserTest () {
		
	Reporter.log("\nRefresh the Web Seccion...", true);	
		driver.navigate().refresh();
		pauseInSeconds();
		
	Reporter.log("Starting execution of \"LockedOutUserTest\"", true);
		
// Locked Out User
		
	Reporter.log("\tLocating, Adding and Submiting \"LockedOutUser data\"", true);
				
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
		
	Reporter.log("\tFinished the process", true);		
		
// Expecting Error Box
	Reporter.log("\tLocate and Get the error message", true);
	
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println(errorBox.getText());
		
	//CheckPoint
	Reporter.log("\tCompare expectedMessage to actualMessage ", true);	
		
		String exepectedBox = "Epic sadface: Sorry, this user has been locked out.";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox);
		
	Reporter.log("Test Completed, quit the Browser seccion", true);	
		tearDown();		
	}
	
	
	@Test (priority = 2, groups = "positive") 
	public void problemUserTest() {
	Reporter.log("\nStarting execution of \"problemUserTest\"", true);

// Problem User Log-In		
		String userName = "problem_user";
		String passWord = "secret_sauce";
		
	Reporter.log("\tLocating, Adding and Submiting \"ProblemUser data\"", true);	

		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);		
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();		
		pauseInSeconds();
	
	Reporter.log("\tFinished the process", true);	
	
// logout
		WebElement optionModule = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		optionModule.click();
		pauseInSeconds();
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
	Reporter.log("Test completed, quit the Browser section", true);	
		
		tearDown();
		
	}
	
	
	@Test (priority = 4, groups = "negative")
	public void wrongPasswordTest() {
		
	Reporter.log("\nRefresh the Web Seccion...", true);	
		driver.navigate().refresh();
		pauseInSeconds();
		
	Reporter.log("Starting execution of \"wrongPasswordTest\"", true);
		
// Wrong Password
		String userName = "standard_user";
		String passWord = "132456789";
		
	Reporter.log("\tLocating, Adding and Submiting \"WrongPassword data\"", true);
		
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);	
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);	
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();	
		pauseInSeconds();
		
	Reporter.log("\tFinished the process", true);	
		
// Expecting Error Box
	Reporter.log("\tLocate and Get the error message", true);
	
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println(errorBox.getText());
		
	//CheckPoint
	Reporter.log("\tCompare expectedMessage to actualMessage ", true);
		
		String exepectedBox = "Epic sadface: Username and password do not match any user in this service";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox);
		
	Reporter.log("Test Completed", true);	
		pauseInSeconds();
		
	}
	
	
	@Test (priority = 3, groups = "negative") 
	public void wrongUsernameTest() {
	Reporter.log("\nStarting execution of \"Negative LogIn Credentials\"", true);	

// Wrong User Name
		setUp();
	Reporter.log("SetUp process has finished", true);		
	
		String userName = "hello_user";
		String passWord = "secret_sauce";
		
	Reporter.log("\tLocating, Adding and Submiting \"WrongUserName data\"", true);
	
		WebElement locateUserNameBox = driver.findElement(By.cssSelector("#user-name"));
		locateUserNameBox.sendKeys(userName);		
		pauseInSeconds();
		
		WebElement locatePasswordBox = driver.findElement(By.cssSelector("#password"));
		locatePasswordBox.sendKeys(passWord);
		pauseInSeconds();
		
		WebElement submit = driver.findElement(By.cssSelector("#login-button"));
		submit.click();
		pauseInSeconds();
		
	Reporter.log("\tFinished the process", true);		
		
// Expecting Error Box
	Reporter.log("\tLocate and Get the error message", true);
	
		WebElement errorBox = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		System.out.println(errorBox.getText());
		
	//CheckPoint
		
	Reporter.log("\tCompare expectedMessage to actualMessage ", true);
		
		String exepectedBox = "Epic sadface: Username and password do not match any user in this service";
		String actualBox = errorBox.getText();
		assertEquals(actualBox, exepectedBox);
		
	Reporter.log("Test Completed", true);	
		pauseInSeconds();
		
	}
	
}
