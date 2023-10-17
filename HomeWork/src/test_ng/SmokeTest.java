

package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

	public static void main(String[] args) {
		
// Create positive and negative test scenarios for the Login Tests:
		System.setProperty(
				"webdriver.chrome.driver", 
				"./drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		String webUrl = "https://www.saucedemo.com/";
		driver.get(webUrl);
		driver.manage().window().maximize();	
		pauseInSeconds();
		
// Positive Log-In
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
		
	// logout
		
		WebElement optionModule = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		optionModule.click();
		pauseInSeconds();
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		pauseInSeconds();
		
		driver.quit();
	}

	private static void pauseInSeconds() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
