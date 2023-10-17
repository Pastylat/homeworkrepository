

package finding_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectObjectsDROPDOWN {
	
	public static void main(String[] args)	{
		
		System.setProperty(
				"webdriver.chrome.driver", 
				"./drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
// Go to MainPage		
		String webUrl = "https://the-internet.herokuapp.com/dropdown";
		
		driver.get(webUrl);
		driver.manage().window().maximize();
		
// Choose "Dropdown" Option
		WebElement captureOption = driver.findElement(By.cssSelector("#dropdown"));
		captureOption.click();
		
		delayScriptForSeconds(2);
		
// Instantiate and Initialize a variable objectSelected = Select(WebLement as a parameter);
		
		Select targetObject = new Select(captureOption);
		targetObject.selectByVisibleText("Option 2"); // select by VisibleText
		
		delayScriptForSeconds(2);
		
// 2method, select Option by Index		
		 targetObject.selectByIndex(1);
		 
		 delayScriptForSeconds(2);
		 
// 3method, select Option by Value
		 targetObject.selectByValue("2");
		 
		delayScriptForSeconds(2);
		
// Pause for Seconds		
		delayScriptForSeconds(2);
		
// Quit Driver
		driver.quit();
		
	}

	private static void delayScriptForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
