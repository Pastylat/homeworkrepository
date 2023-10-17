
package quiz;

import static org.testng.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class AppleBagItmes {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		String webUrl = "https://www.apple.com/";
		driver.get(webUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void tearDown() {
		pause(5);
		driver.quit();
	}

	public void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test
	public void byingMacBookAir() {
		
		driver.findElement(By.linkText("Mac")).click();	 // it needs tag "<a" - acronyms and match exactName in aria-label
		pause(2);										//ul#globalnav-list div:nth-of-type(2) a[href='/mac/']  linkText("Mac"))

		driver.findElement(By.cssSelector("nav#chapternav li:nth-of-type(1)")).click();
		pause(2);

		driver.findElement(By.cssSelector("nav#chapternav li:nth-of-type(2)")).click();
		pause(2);
		
		driver.findElement(By.cssSelector("nav#ac-localnav a.ac-ln-button")).click();
		pause(2);
		
		driver.findElement(By.cssSelector("div[role='radiogroup']>div:nth-of-type(3)")).click();
		pause(2);
		
// scroll down to a specific/specified element
		
//		Actions myAct = new Actions(driver);
//		
//		WebElement secondSelectBox = driver.findElement(By);
//		myAct.sendKeys(Keys.PAGE_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1350)");
		pause(2);
		WebElement chooseSecondSelectBox = driver.findElement(By.xpath("//button[@data-autom='proceed-15inch-best']"));
		chooseSecondSelectBox.click();

//scroll to and pick the Memory size
		pause(3);
		WebElement sizeMemory = driver.findElement(By.xpath("//h3[@class='rf-configuration-optiongroup-header typography-body'][.='Memory']"));
			System.out.println(sizeMemory.getText());
		js.executeScript("arguments[0].scrollIntoView();", sizeMemory);			
		WebElement chooseMemorySize = driver.findElement(By.cssSelector("div>label#memory_aos_phantom_z18u_065_cf86_3_label"));
		chooseMemorySize.click();
		
// pick the Storage size
		pause(2);
		WebElement sizeStorage = driver.findElement(By.xpath("//h3[@class='rf-configuration-optiongroup-header typography-body'][.='Storage']")); 
			System.out.println(sizeStorage.getText());
		js.executeScript("arguments[0].scrollIntoView();", sizeStorage);			
		WebElement chooseStorageSize = driver.findElement(By.cssSelector("div>label#hard_drivesolid_state_drive_aos_phantom_z18u_065_cf8c_3_label"));
		chooseStorageSize.click();
		
// pick the Adapter Size
		pause(2);
		WebElement sizeAdapter = driver.findElement(By.xpath("//span[text()='Power Adapter']")); 
			System.out.println(sizeAdapter.getText());
		js.executeScript("arguments[0].scrollIntoView();", sizeAdapter);			
		WebElement chooseAdapterSize = driver.findElement(By.cssSelector("div>label#power_adapter_aos_phantom_z18u_065_cf8g_2_label"));
		pause(1);
		chooseAdapterSize.click();
		
// just scroll down		
		pause(1);
		js.executeScript("window.scrollBy(0,250)");
		pause(2);
		js.executeScript("window.scrollBy(0,250)");
		
//
		pause(2);
		Reporter.log("Submiting choosen paramaters", true);
		driver.findElement(By.cssSelector("button[value='add-to-cart']")).click();
		
//	
		pause(2);
		Reporter.log("\nReviewing Busket", true);
		driver.findElement(By.xpath("//button[text()='Review Bag']")).click();
		
	//Checkpoint
		Reporter.log("\tCompare expectedMessage to actualMessage ", true);
		
		WebElement captureTitle = driver.findElement(By.cssSelector("h1.rs-bag-header"));
		String exepectedText = "Review your bag.";
		String actualText = captureTitle.getText();
		assertEquals(actualText, exepectedText);
			System.out.println(actualText);
		pause(2);
		js.executeScript("window.scrollBy(0,150)");
		
	}

}
