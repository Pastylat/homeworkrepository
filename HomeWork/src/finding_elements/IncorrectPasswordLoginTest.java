
package finding_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectPasswordLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

// declare and assign a URL
		String url = "https://the-internet.herokuapp.com/login";

// go to LoginPage and capture the TitlePage
		driver.get(url);
		driver.manage().window().maximize();

		WebElement capTitle = driver.findElement(By.xpath("//*[@id='content']/div/h2"));

// WebElement capTitle = driver.findElement(By.xpath("//h2[text()='Login Page']"));
		System.out.println("Display the title: " + capTitle.getText());
		Thread.sleep(1000);

// input correct UserName and wrong Password
		String uBOX = "tomsmith";
		String uPASS = "123456789";

// locate a WebElementt in DOM (By.id)
		WebElement usernameBOX = driver.findElement(By.id("username"));
		usernameBOX.sendKeys(uBOX);

		Thread.sleep(2000);

// locate a webELEMENT in DOM (By.id)
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(uPASS);

		Thread.sleep(2000);

// Submit
		WebElement loginBUTTON = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		loginBUTTON.click();

		Thread.sleep(1000);

// Capture the Message
		String expectedMessage = "Your password is invalid!";
		WebElement actualMessage = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]"));
		String realMessage = actualMessage.getText();

		boolean LoggedInFalse = realMessage.contains(expectedMessage);

		System.out.println("Did Password Invlaid message pop up?: " + LoggedInFalse);

		Thread.sleep(2000);

// Quit
		driver.quit();
		
	}

}
