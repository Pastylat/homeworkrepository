

package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLoginTESTS {
	
	public static void main(String[] args) throws InterruptedException {
		
// Setup Systems Variable for Chrome Driver
		System.setProperty(
				"webdriver.chrome.driver", 
				"./drivers/chromedriver");
		
// Instantiate and Initialize a Variable
		WebDriver driver = new ChromeDriver();

// Navigate to LoginPage	
		driver.get("https://www.salesforce.com");
		
// Sleep for 7 sec
		Thread.sleep(3000);

// Quit the Variable
		driver.quit();
		
	}

}

// “Any fool can write code that a computer can understand.
// Good programmers write code that humans can understand.” — Martin Fowler.